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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Relationship_types", "Valid_source_types", "Valid_target_types", "Capability_types", "Greater_or_equal", "Interface_types", "Artifact_types", "Implementation", "Get_attribute", "Less_or_equal", "Relative_path", "Capabilities", "Dependencies", "Derived_from", "Entry_schema", "Get_property", "Greater_than", "Policy_types", "Relationship", "Requirements", "Valid_values", "Constraints", "Description", "Occurrences", "Attributes", "Capability", "Data_types", "Interfaces", "Max_length", "Min_length", "Node_types", "Operations", "Properties", "Attribute", "Get_input", "Less_than", "Mime_type", "File_ext", "In_range", "Property", "Required", "Default", "Primary", "Req_cap", "Targets", "Entity", "Import", "Inputs", "Length", "Module", "Status", "Equal", "Value", "Node", "Type", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_ID", "RULE_QUALIFIED_NAME", "RULE_BOOLEAN", "RULE_ENTITY", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Entity=49;
    public static final int Import=50;
    public static final int RULE_BEGIN=70;
    public static final int Mime_type=40;
    public static final int Node=57;
    public static final int Entry_schema=18;
    public static final int Attributes=28;
    public static final int Occurrences=27;
    public static final int RULE_BOOLEAN=68;
    public static final int Requirements=23;
    public static final int Valid_source_types=5;
    public static final int Node_types=34;
    public static final int Policy_types=21;
    public static final int Equal=55;
    public static final int Primary=46;
    public static final int Dependencies=16;
    public static final int Operations=35;
    public static final int RightSquareBracket=65;
    public static final int Valid_target_types=6;
    public static final int Status=54;
    public static final int RULE_QUALIFIED_NAME=67;
    public static final int Capability=29;
    public static final int RULE_ID=66;
    public static final int Less_than=39;
    public static final int Data_types=30;
    public static final int Artifact_types=10;
    public static final int Interface_types=9;
    public static final int Greater_or_equal=8;
    public static final int Constraints=25;
    public static final int RULE_INT=72;
    public static final int Value=56;
    public static final int RULE_ML_COMMENT=74;
    public static final int LeftSquareBracket=64;
    public static final int Less_or_equal=13;
    public static final int Relative_path=14;
    public static final int Module=53;
    public static final int Greater_than=20;
    public static final int Get_input=38;
    public static final int RULE_ENTITY=69;
    public static final int RULE_END=71;
    public static final int Description=26;
    public static final int Get_attribute=12;
    public static final int Attribute=37;
    public static final int Get_property=19;
    public static final int Valid_values=24;
    public static final int RULE_STRING=73;
    public static final int Properties=36;
    public static final int Implementation=11;
    public static final int RULE_SL_COMMENT=75;
    public static final int Max_length=32;
    public static final int Comma=59;
    public static final int HyphenMinus=60;
    public static final int Required=44;
    public static final int Capability_types=7;
    public static final int Solidus=62;
    public static final int Colon=63;
    public static final int EOF=-1;
    public static final int Property=43;
    public static final int Inputs=51;
    public static final int Relationship_types=4;
    public static final int FullStop=61;
    public static final int RULE_WS=76;
    public static final int Targets=48;
    public static final int RULE_ANY_OTHER=77;
    public static final int Req_cap=47;
    public static final int Default=45;
    public static final int Interfaces=31;
    public static final int In_range=42;
    public static final int Type=58;
    public static final int Derived_from=17;
    public static final int Length=52;
    public static final int Capabilities=15;
    public static final int Relationship=22;
    public static final int File_ext=41;
    public static final int Min_length=33;

    // delegates
    // delegators


        public InternalRMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRMParser.g"; }



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
    // InternalRMParser.g:57:1: entryRuleRM_Model returns [EObject current=null] : iv_ruleRM_Model= ruleRM_Model EOF ;
    public final EObject entryRuleRM_Model() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRM_Model = null;


        try {
            // InternalRMParser.g:57:49: (iv_ruleRM_Model= ruleRM_Model EOF )
            // InternalRMParser.g:58:2: iv_ruleRM_Model= ruleRM_Model EOF
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
    // InternalRMParser.g:64:1: ruleRM_Model returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) ) ) )* ) ) ) ;
    public final EObject ruleRM_Model() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_module_2_0=null;
        Token otherlv_3=null;
        Token lv_imports_4_0=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        Token otherlv_9=null;
        Token this_BEGIN_10=null;
        Token this_END_12=null;
        Token otherlv_13=null;
        Token this_BEGIN_14=null;
        Token this_END_16=null;
        Token otherlv_17=null;
        Token this_BEGIN_18=null;
        Token this_END_20=null;
        Token otherlv_21=null;
        Token this_BEGIN_22=null;
        Token this_END_24=null;
        Token otherlv_25=null;
        Token this_BEGIN_26=null;
        Token this_END_28=null;
        Token otherlv_29=null;
        Token this_BEGIN_30=null;
        Token this_END_32=null;
        EObject lv_dataTypes_7_0 = null;

        EObject lv_artifactTypes_11_0 = null;

        EObject lv_capabilityTypes_15_0 = null;

        EObject lv_interfaceTypes_19_0 = null;

        EObject lv_relationshipTypes_23_0 = null;

        EObject lv_nodeTypes_27_0 = null;

        EObject lv_policyTypes_31_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:70:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:71:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:71:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:72:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:72:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:73:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:76:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:77:5: ( ({...}? => ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:77:5: ( ({...}? => ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) ) ) )*
            loop2:
            do {
                int alt2=10;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalRMParser.g:78:3: ({...}? => ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:78:3: ({...}? => ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) ) )
            	    // InternalRMParser.g:79:4: {...}? => ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:79:102: ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) )
            	    // InternalRMParser.g:80:5: ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:83:8: ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) )
            	    // InternalRMParser.g:83:9: {...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:83:18: (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) )
            	    // InternalRMParser.g:83:19: otherlv_1= Module ( (lv_module_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,Module,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getRM_ModelAccess().getModuleKeyword_0_0());
            	    							
            	    // InternalRMParser.g:87:8: ( (lv_module_2_0= RULE_ID ) )
            	    // InternalRMParser.g:88:9: (lv_module_2_0= RULE_ID )
            	    {
            	    // InternalRMParser.g:88:9: (lv_module_2_0= RULE_ID )
            	    // InternalRMParser.g:89:10: lv_module_2_0= RULE_ID
            	    {
            	    lv_module_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    										newLeafNode(lv_module_2_0, grammarAccess.getRM_ModelAccess().getModuleIDTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getRM_ModelRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"module",
            	    											lv_module_2_0,
            	    											"org.sodalite.dsl.RM.ID");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:111:3: ({...}? => ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ ) )
            	    {
            	    // InternalRMParser.g:111:3: ({...}? => ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ ) )
            	    // InternalRMParser.g:112:4: {...}? => ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:112:102: ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ )
            	    // InternalRMParser.g:113:5: ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:116:8: ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==Import) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalRMParser.g:116:9: {...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    	    }
            	    	    // InternalRMParser.g:116:18: (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) )
            	    	    // InternalRMParser.g:116:19: otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,Import,FOLLOW_3); 

            	    	    								newLeafNode(otherlv_3, grammarAccess.getRM_ModelAccess().getImportKeyword_1_0());
            	    	    							
            	    	    // InternalRMParser.g:120:8: ( (lv_imports_4_0= RULE_ID ) )
            	    	    // InternalRMParser.g:121:9: (lv_imports_4_0= RULE_ID )
            	    	    {
            	    	    // InternalRMParser.g:121:9: (lv_imports_4_0= RULE_ID )
            	    	    // InternalRMParser.g:122:10: lv_imports_4_0= RULE_ID
            	    	    {
            	    	    lv_imports_4_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    	    										newLeafNode(lv_imports_4_0, grammarAccess.getRM_ModelAccess().getImportsIDTerminalRuleCall_1_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getRM_ModelRule());
            	    	    										}
            	    	    										addWithLastConsumed(
            	    	    											current,
            	    	    											"imports",
            	    	    											lv_imports_4_0,
            	    	    											"org.sodalite.dsl.RM.ID");
            	    	    									

            	    	    }


            	    	    }


            	    	    }


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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:144:3: ({...}? => ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:144:3: ({...}? => ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) ) )
            	    // InternalRMParser.g:145:4: {...}? => ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:145:102: ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) )
            	    // InternalRMParser.g:146:5: ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:149:8: ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) )
            	    // InternalRMParser.g:149:9: {...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:149:18: (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END )
            	    // InternalRMParser.g:149:19: otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END
            	    {
            	    otherlv_5=(Token)match(input,Data_types,FOLLOW_5); 

            	    								newLeafNode(otherlv_5, grammarAccess.getRM_ModelAccess().getData_typesKeyword_2_0());
            	    							
            	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            	    								newLeafNode(this_BEGIN_6, grammarAccess.getRM_ModelAccess().getBEGINTerminalRuleCall_2_1());
            	    							
            	    // InternalRMParser.g:157:8: ( (lv_dataTypes_7_0= ruleEDataTypes ) )
            	    // InternalRMParser.g:158:9: (lv_dataTypes_7_0= ruleEDataTypes )
            	    {
            	    // InternalRMParser.g:158:9: (lv_dataTypes_7_0= ruleEDataTypes )
            	    // InternalRMParser.g:159:10: lv_dataTypes_7_0= ruleEDataTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getDataTypesEDataTypesParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_dataTypes_7_0=ruleEDataTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dataTypes",
            	    											lv_dataTypes_7_0,
            	    											"org.sodalite.dsl.RM.EDataTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_8=(Token)match(input,RULE_END,FOLLOW_4); 

            	    								newLeafNode(this_END_8, grammarAccess.getRM_ModelAccess().getENDTerminalRuleCall_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:186:3: ({...}? => ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:186:3: ({...}? => ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) ) )
            	    // InternalRMParser.g:187:4: {...}? => ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:187:102: ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) )
            	    // InternalRMParser.g:188:5: ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:191:8: ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) )
            	    // InternalRMParser.g:191:9: {...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:191:18: (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END )
            	    // InternalRMParser.g:191:19: otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Artifact_types,FOLLOW_5); 

            	    								newLeafNode(otherlv_9, grammarAccess.getRM_ModelAccess().getArtifact_typesKeyword_3_0());
            	    							
            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            	    								newLeafNode(this_BEGIN_10, grammarAccess.getRM_ModelAccess().getBEGINTerminalRuleCall_3_1());
            	    							
            	    // InternalRMParser.g:199:8: ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) )
            	    // InternalRMParser.g:200:9: (lv_artifactTypes_11_0= ruleEArtifactTypes )
            	    {
            	    // InternalRMParser.g:200:9: (lv_artifactTypes_11_0= ruleEArtifactTypes )
            	    // InternalRMParser.g:201:10: lv_artifactTypes_11_0= ruleEArtifactTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getArtifactTypesEArtifactTypesParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_artifactTypes_11_0=ruleEArtifactTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"artifactTypes",
            	    											lv_artifactTypes_11_0,
            	    											"org.sodalite.dsl.RM.EArtifactTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_12=(Token)match(input,RULE_END,FOLLOW_4); 

            	    								newLeafNode(this_END_12, grammarAccess.getRM_ModelAccess().getENDTerminalRuleCall_3_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRMParser.g:228:3: ({...}? => ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:228:3: ({...}? => ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) ) )
            	    // InternalRMParser.g:229:4: {...}? => ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRMParser.g:229:102: ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) )
            	    // InternalRMParser.g:230:5: ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRMParser.g:233:8: ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) )
            	    // InternalRMParser.g:233:9: {...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:233:18: (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END )
            	    // InternalRMParser.g:233:19: otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END
            	    {
            	    otherlv_13=(Token)match(input,Capability_types,FOLLOW_5); 

            	    								newLeafNode(otherlv_13, grammarAccess.getRM_ModelAccess().getCapability_typesKeyword_4_0());
            	    							
            	    this_BEGIN_14=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            	    								newLeafNode(this_BEGIN_14, grammarAccess.getRM_ModelAccess().getBEGINTerminalRuleCall_4_1());
            	    							
            	    // InternalRMParser.g:241:8: ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) )
            	    // InternalRMParser.g:242:9: (lv_capabilityTypes_15_0= ruleECapabilityTypes )
            	    {
            	    // InternalRMParser.g:242:9: (lv_capabilityTypes_15_0= ruleECapabilityTypes )
            	    // InternalRMParser.g:243:10: lv_capabilityTypes_15_0= ruleECapabilityTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getCapabilityTypesECapabilityTypesParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_capabilityTypes_15_0=ruleECapabilityTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"capabilityTypes",
            	    											lv_capabilityTypes_15_0,
            	    											"org.sodalite.dsl.RM.ECapabilityTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_16=(Token)match(input,RULE_END,FOLLOW_4); 

            	    								newLeafNode(this_END_16, grammarAccess.getRM_ModelAccess().getENDTerminalRuleCall_4_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRMParser.g:270:3: ({...}? => ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:270:3: ({...}? => ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) ) )
            	    // InternalRMParser.g:271:4: {...}? => ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRMParser.g:271:102: ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) )
            	    // InternalRMParser.g:272:5: ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRMParser.g:275:8: ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) )
            	    // InternalRMParser.g:275:9: {...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:275:18: (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END )
            	    // InternalRMParser.g:275:19: otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END
            	    {
            	    otherlv_17=(Token)match(input,Interface_types,FOLLOW_5); 

            	    								newLeafNode(otherlv_17, grammarAccess.getRM_ModelAccess().getInterface_typesKeyword_5_0());
            	    							
            	    this_BEGIN_18=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            	    								newLeafNode(this_BEGIN_18, grammarAccess.getRM_ModelAccess().getBEGINTerminalRuleCall_5_1());
            	    							
            	    // InternalRMParser.g:283:8: ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) )
            	    // InternalRMParser.g:284:9: (lv_interfaceTypes_19_0= ruleEInterfaceTypes )
            	    {
            	    // InternalRMParser.g:284:9: (lv_interfaceTypes_19_0= ruleEInterfaceTypes )
            	    // InternalRMParser.g:285:10: lv_interfaceTypes_19_0= ruleEInterfaceTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getInterfaceTypesEInterfaceTypesParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_interfaceTypes_19_0=ruleEInterfaceTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"interfaceTypes",
            	    											lv_interfaceTypes_19_0,
            	    											"org.sodalite.dsl.RM.EInterfaceTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_20=(Token)match(input,RULE_END,FOLLOW_4); 

            	    								newLeafNode(this_END_20, grammarAccess.getRM_ModelAccess().getENDTerminalRuleCall_5_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRMParser.g:312:3: ({...}? => ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:312:3: ({...}? => ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) ) )
            	    // InternalRMParser.g:313:4: {...}? => ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalRMParser.g:313:102: ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) )
            	    // InternalRMParser.g:314:5: ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalRMParser.g:317:8: ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) )
            	    // InternalRMParser.g:317:9: {...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:317:18: (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END )
            	    // InternalRMParser.g:317:19: otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END
            	    {
            	    otherlv_21=(Token)match(input,Relationship_types,FOLLOW_5); 

            	    								newLeafNode(otherlv_21, grammarAccess.getRM_ModelAccess().getRelationship_typesKeyword_6_0());
            	    							
            	    this_BEGIN_22=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            	    								newLeafNode(this_BEGIN_22, grammarAccess.getRM_ModelAccess().getBEGINTerminalRuleCall_6_1());
            	    							
            	    // InternalRMParser.g:325:8: ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) )
            	    // InternalRMParser.g:326:9: (lv_relationshipTypes_23_0= ruleERelationshipTypes )
            	    {
            	    // InternalRMParser.g:326:9: (lv_relationshipTypes_23_0= ruleERelationshipTypes )
            	    // InternalRMParser.g:327:10: lv_relationshipTypes_23_0= ruleERelationshipTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getRelationshipTypesERelationshipTypesParserRuleCall_6_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_relationshipTypes_23_0=ruleERelationshipTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"relationshipTypes",
            	    											lv_relationshipTypes_23_0,
            	    											"org.sodalite.dsl.RM.ERelationshipTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_24=(Token)match(input,RULE_END,FOLLOW_4); 

            	    								newLeafNode(this_END_24, grammarAccess.getRM_ModelAccess().getENDTerminalRuleCall_6_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalRMParser.g:354:3: ({...}? => ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:354:3: ({...}? => ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) ) )
            	    // InternalRMParser.g:355:4: {...}? => ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalRMParser.g:355:102: ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) )
            	    // InternalRMParser.g:356:5: ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalRMParser.g:359:8: ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) )
            	    // InternalRMParser.g:359:9: {...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:359:18: (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END )
            	    // InternalRMParser.g:359:19: otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END
            	    {
            	    otherlv_25=(Token)match(input,Node_types,FOLLOW_5); 

            	    								newLeafNode(otherlv_25, grammarAccess.getRM_ModelAccess().getNode_typesKeyword_7_0());
            	    							
            	    this_BEGIN_26=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            	    								newLeafNode(this_BEGIN_26, grammarAccess.getRM_ModelAccess().getBEGINTerminalRuleCall_7_1());
            	    							
            	    // InternalRMParser.g:367:8: ( (lv_nodeTypes_27_0= ruleENodeTypes ) )
            	    // InternalRMParser.g:368:9: (lv_nodeTypes_27_0= ruleENodeTypes )
            	    {
            	    // InternalRMParser.g:368:9: (lv_nodeTypes_27_0= ruleENodeTypes )
            	    // InternalRMParser.g:369:10: lv_nodeTypes_27_0= ruleENodeTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getNodeTypesENodeTypesParserRuleCall_7_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_nodeTypes_27_0=ruleENodeTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nodeTypes",
            	    											lv_nodeTypes_27_0,
            	    											"org.sodalite.dsl.RM.ENodeTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_28=(Token)match(input,RULE_END,FOLLOW_4); 

            	    								newLeafNode(this_END_28, grammarAccess.getRM_ModelAccess().getENDTerminalRuleCall_7_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalRMParser.g:396:3: ({...}? => ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:396:3: ({...}? => ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) ) )
            	    // InternalRMParser.g:397:4: {...}? => ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalRMParser.g:397:102: ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) )
            	    // InternalRMParser.g:398:5: ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalRMParser.g:401:8: ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) )
            	    // InternalRMParser.g:401:9: {...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:401:18: (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END )
            	    // InternalRMParser.g:401:19: otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END
            	    {
            	    otherlv_29=(Token)match(input,Policy_types,FOLLOW_5); 

            	    								newLeafNode(otherlv_29, grammarAccess.getRM_ModelAccess().getPolicy_typesKeyword_8_0());
            	    							
            	    this_BEGIN_30=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            	    								newLeafNode(this_BEGIN_30, grammarAccess.getRM_ModelAccess().getBEGINTerminalRuleCall_8_1());
            	    							
            	    // InternalRMParser.g:409:8: ( (lv_policyTypes_31_0= ruleEPolicyTypes ) )
            	    // InternalRMParser.g:410:9: (lv_policyTypes_31_0= ruleEPolicyTypes )
            	    {
            	    // InternalRMParser.g:410:9: (lv_policyTypes_31_0= ruleEPolicyTypes )
            	    // InternalRMParser.g:411:10: lv_policyTypes_31_0= ruleEPolicyTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getPolicyTypesEPolicyTypesParserRuleCall_8_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_policyTypes_31_0=ruleEPolicyTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"policyTypes",
            	    											lv_policyTypes_31_0,
            	    											"org.sodalite.dsl.RM.EPolicyTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_32=(Token)match(input,RULE_END,FOLLOW_4); 

            	    								newLeafNode(this_END_32, grammarAccess.getRM_ModelAccess().getENDTerminalRuleCall_8_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalRMParser.g:448:1: entryRuleEDataTypes returns [EObject current=null] : iv_ruleEDataTypes= ruleEDataTypes EOF ;
    public final EObject entryRuleEDataTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataTypes = null;


        try {
            // InternalRMParser.g:448:51: (iv_ruleEDataTypes= ruleEDataTypes EOF )
            // InternalRMParser.g:449:2: iv_ruleEDataTypes= ruleEDataTypes EOF
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
    // InternalRMParser.g:455:1: ruleEDataTypes returns [EObject current=null] : ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ ) ;
    public final EObject ruleEDataTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_dataTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:461:2: ( ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ ) )
            // InternalRMParser.g:462:2: ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ )
            {
            // InternalRMParser.g:462:2: ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ )
            // InternalRMParser.g:463:3: () ( (lv_dataTypes_1_0= ruleEDataType ) )+
            {
            // InternalRMParser.g:463:3: ()
            // InternalRMParser.g:464:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataTypesAccess().getEDataTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:470:3: ( (lv_dataTypes_1_0= ruleEDataType ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_QUALIFIED_NAME)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRMParser.g:471:4: (lv_dataTypes_1_0= ruleEDataType )
            	    {
            	    // InternalRMParser.g:471:4: (lv_dataTypes_1_0= ruleEDataType )
            	    // InternalRMParser.g:472:5: lv_dataTypes_1_0= ruleEDataType
            	    {

            	    					newCompositeNode(grammarAccess.getEDataTypesAccess().getDataTypesEDataTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // InternalRMParser.g:493:1: entryRuleEDataType returns [EObject current=null] : iv_ruleEDataType= ruleEDataType EOF ;
    public final EObject entryRuleEDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType = null;


        try {
            // InternalRMParser.g:493:50: (iv_ruleEDataType= ruleEDataType EOF )
            // InternalRMParser.g:494:2: iv_ruleEDataType= ruleEDataType EOF
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
    // InternalRMParser.g:500:1: ruleEDataType returns [EObject current=null] : ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_data_3_0= ruleEDataTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_name_0_0 = null;

        EObject lv_data_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:506:2: ( ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_data_3_0= ruleEDataTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:507:2: ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_data_3_0= ruleEDataTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:507:2: ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_data_3_0= ruleEDataTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:508:3: ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_data_3_0= ruleEDataTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:508:3: ( (lv_name_0_0= ruleEDataTypeName ) )
            // InternalRMParser.g:509:4: (lv_name_0_0= ruleEDataTypeName )
            {
            // InternalRMParser.g:509:4: (lv_name_0_0= ruleEDataTypeName )
            // InternalRMParser.g:510:5: lv_name_0_0= ruleEDataTypeName
            {

            					newCompositeNode(grammarAccess.getEDataTypeAccess().getNameEDataTypeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEDataTypeAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEDataTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:535:3: ( (lv_data_3_0= ruleEDataTypeBody ) )
            // InternalRMParser.g:536:4: (lv_data_3_0= ruleEDataTypeBody )
            {
            // InternalRMParser.g:536:4: (lv_data_3_0= ruleEDataTypeBody )
            // InternalRMParser.g:537:5: lv_data_3_0= ruleEDataTypeBody
            {

            					newCompositeNode(grammarAccess.getEDataTypeAccess().getDataEDataTypeBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_data_3_0=ruleEDataTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDataTypeRule());
            					}
            					set(
            						current,
            						"data",
            						lv_data_3_0,
            						"org.sodalite.dsl.RM.EDataTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEDataTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:562:1: entryRuleEDataTypeBody returns [EObject current=null] : iv_ruleEDataTypeBody= ruleEDataTypeBody EOF ;
    public final EObject entryRuleEDataTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataTypeBody = null;


        try {
            // InternalRMParser.g:562:54: (iv_ruleEDataTypeBody= ruleEDataTypeBody EOF )
            // InternalRMParser.g:563:2: iv_ruleEDataTypeBody= ruleEDataTypeBody EOF
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
    // InternalRMParser.g:569:1: ruleEDataTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEDataTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        EObject lv_superType_3_0 = null;

        EObject lv_constraints_8_0 = null;

        EObject lv_properties_12_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:575:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:576:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:576:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:577:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:577:3: ()
            // InternalRMParser.g:578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataTypeBodyAccess().getEDataTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:584:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:585:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:585:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:586:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:589:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:590:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:590:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )*
            loop4:
            do {
                int alt4=5;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt4=2;
                }
                else if ( LA4_0 == Constraints && getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt4=3;
                }
                else if ( LA4_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt4=4;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRMParser.g:591:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:591:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:592:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:592:110: ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:593:6: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:596:9: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:596:10: {...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRMParser.g:596:19: (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:596:20: otherlv_2= Derived_from ( (lv_superType_3_0= ruleEDataTypeName ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEDataTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:600:9: ( (lv_superType_3_0= ruleEDataTypeName ) )
            	    // InternalRMParser.g:601:10: (lv_superType_3_0= ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:601:10: (lv_superType_3_0= ruleEDataTypeName )
            	    // InternalRMParser.g:602:11: lv_superType_3_0= ruleEDataTypeName
            	    {

            	    											newCompositeNode(grammarAccess.getEDataTypeBodyAccess().getSuperTypeEDataTypeNameParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_superType_3_0=ruleEDataTypeName();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEDataTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"superType",
            	    												lv_superType_3_0,
            	    												"org.sodalite.dsl.RM.EDataTypeName");
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
            	    // InternalRMParser.g:625:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:625:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:626:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:626:110: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:627:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:630:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:630:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRMParser.g:630:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:630:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEDataTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:634:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:635:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:635:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:636:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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
            	    // InternalRMParser.g:658:4: ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:658:4: ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:659:5: {...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:659:110: ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:660:6: ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:663:9: ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:663:10: {...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRMParser.g:663:19: (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:663:20: otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Constraints,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEDataTypeBodyAccess().getConstraintsKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getEDataTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:671:9: ( (lv_constraints_8_0= ruleEConstraints ) )
            	    // InternalRMParser.g:672:10: (lv_constraints_8_0= ruleEConstraints )
            	    {
            	    // InternalRMParser.g:672:10: (lv_constraints_8_0= ruleEConstraints )
            	    // InternalRMParser.g:673:11: lv_constraints_8_0= ruleEConstraints
            	    {

            	    											newCompositeNode(grammarAccess.getEDataTypeBodyAccess().getConstraintsEConstraintsParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_12); 

            	    									newLeafNode(this_END_9, grammarAccess.getEDataTypeBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:700:4: ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:700:4: ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:701:5: {...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:701:110: ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:702:6: ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:705:9: ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:705:10: {...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRMParser.g:705:19: (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:705:20: otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Properties,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEDataTypeBodyAccess().getPropertiesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getEDataTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:713:9: ( (lv_properties_12_0= ruleEProperties ) )
            	    // InternalRMParser.g:714:10: (lv_properties_12_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:714:10: (lv_properties_12_0= ruleEProperties )
            	    // InternalRMParser.g:715:11: lv_properties_12_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getEDataTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_12); 

            	    									newLeafNode(this_END_13, grammarAccess.getEDataTypeBodyAccess().getENDTerminalRuleCall_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalRMParser.g:753:1: entryRuleEDataTypeName returns [EObject current=null] : iv_ruleEDataTypeName= ruleEDataTypeName EOF ;
    public final EObject entryRuleEDataTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataTypeName = null;


        try {
            // InternalRMParser.g:753:54: (iv_ruleEDataTypeName= ruleEDataTypeName EOF )
            // InternalRMParser.g:754:2: iv_ruleEDataTypeName= ruleEDataTypeName EOF
            {
             newCompositeNode(grammarAccess.getEDataTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDataTypeName=ruleEDataTypeName();

            state._fsp--;

             current =iv_ruleEDataTypeName; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalRMParser.g:760:1: ruleEDataTypeName returns [EObject current=null] : (this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE | this_EPRIMITIVE_TYPE_1= ruleEPRIMITIVE_TYPE ) ;
    public final EObject ruleEDataTypeName() throws RecognitionException {
        EObject current = null;

        EObject this_EPREFIX_TYPE_0 = null;

        EObject this_EPRIMITIVE_TYPE_1 = null;



        	enterRule();

        try {
            // InternalRMParser.g:766:2: ( (this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE | this_EPRIMITIVE_TYPE_1= ruleEPRIMITIVE_TYPE ) )
            // InternalRMParser.g:767:2: (this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE | this_EPRIMITIVE_TYPE_1= ruleEPRIMITIVE_TYPE )
            {
            // InternalRMParser.g:767:2: (this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE | this_EPRIMITIVE_TYPE_1= ruleEPRIMITIVE_TYPE )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=Derived_from && LA5_1<=Entry_schema)||(LA5_1>=Constraints && LA5_1<=Description)||LA5_1==Properties||(LA5_1>=Required && LA5_1<=Default)||LA5_1==Status||LA5_1==Value||LA5_1==Type||LA5_1==Colon||LA5_1==RULE_END) ) {
                    alt5=2;
                }
                else if ( (LA5_1==Solidus) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_QUALIFIED_NAME) ) {
                alt5=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRMParser.g:768:3: this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE
                    {

                    			newCompositeNode(grammarAccess.getEDataTypeNameAccess().getEPREFIX_TYPEParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EPREFIX_TYPE_0=ruleEPREFIX_TYPE();

                    state._fsp--;


                    			current = this_EPREFIX_TYPE_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRMParser.g:777:3: this_EPRIMITIVE_TYPE_1= ruleEPRIMITIVE_TYPE
                    {

                    			newCompositeNode(grammarAccess.getEDataTypeNameAccess().getEPRIMITIVE_TYPEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EPRIMITIVE_TYPE_1=ruleEPRIMITIVE_TYPE();

                    state._fsp--;


                    			current = this_EPRIMITIVE_TYPE_1;
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
    // $ANTLR end "ruleEDataTypeName"


    // $ANTLR start "entryRuleEArtifactTypes"
    // InternalRMParser.g:789:1: entryRuleEArtifactTypes returns [EObject current=null] : iv_ruleEArtifactTypes= ruleEArtifactTypes EOF ;
    public final EObject entryRuleEArtifactTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactTypes = null;


        try {
            // InternalRMParser.g:789:55: (iv_ruleEArtifactTypes= ruleEArtifactTypes EOF )
            // InternalRMParser.g:790:2: iv_ruleEArtifactTypes= ruleEArtifactTypes EOF
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
    // InternalRMParser.g:796:1: ruleEArtifactTypes returns [EObject current=null] : ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ ) ;
    public final EObject ruleEArtifactTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_artifactTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:802:2: ( ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ ) )
            // InternalRMParser.g:803:2: ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ )
            {
            // InternalRMParser.g:803:2: ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ )
            // InternalRMParser.g:804:3: () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+
            {
            // InternalRMParser.g:804:3: ()
            // InternalRMParser.g:805:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEArtifactTypesAccess().getEArtifactTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:811:3: ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_QUALIFIED_NAME) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRMParser.g:812:4: (lv_artifactTypes_1_0= ruleEArtifactType )
            	    {
            	    // InternalRMParser.g:812:4: (lv_artifactTypes_1_0= ruleEArtifactType )
            	    // InternalRMParser.g:813:5: lv_artifactTypes_1_0= ruleEArtifactType
            	    {

            	    					newCompositeNode(grammarAccess.getEArtifactTypesAccess().getArtifactTypesEArtifactTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // InternalRMParser.g:834:1: entryRuleEArtifactType returns [EObject current=null] : iv_ruleEArtifactType= ruleEArtifactType EOF ;
    public final EObject entryRuleEArtifactType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactType = null;


        try {
            // InternalRMParser.g:834:54: (iv_ruleEArtifactType= ruleEArtifactType EOF )
            // InternalRMParser.g:835:2: iv_ruleEArtifactType= ruleEArtifactType EOF
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
    // InternalRMParser.g:841:1: ruleEArtifactType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEArtifactType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_artifact_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:847:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:848:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:848:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:849:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:849:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:850:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:850:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:851:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEArtifactTypeAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEArtifactTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:875:3: ( (lv_artifact_3_0= ruleEArtifactTypeBody ) )
            // InternalRMParser.g:876:4: (lv_artifact_3_0= ruleEArtifactTypeBody )
            {
            // InternalRMParser.g:876:4: (lv_artifact_3_0= ruleEArtifactTypeBody )
            // InternalRMParser.g:877:5: lv_artifact_3_0= ruleEArtifactTypeBody
            {

            					newCompositeNode(grammarAccess.getEArtifactTypeAccess().getArtifactEArtifactTypeBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_artifact_3_0=ruleEArtifactTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEArtifactTypeRule());
            					}
            					set(
            						current,
            						"artifact",
            						lv_artifact_3_0,
            						"org.sodalite.dsl.RM.EArtifactTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEArtifactTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:902:1: entryRuleEArtifactTypeBody returns [EObject current=null] : iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF ;
    public final EObject entryRuleEArtifactTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactTypeBody = null;


        try {
            // InternalRMParser.g:902:58: (iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF )
            // InternalRMParser.g:903:2: iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF
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
    // InternalRMParser.g:909:1: ruleEArtifactTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEArtifactTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_mime_type_7_0=null;
        Token otherlv_8=null;
        Token lv_file_ext_9_0=null;
        EObject lv_superType_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:915:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:916:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:916:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:917:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:917:3: ()
            // InternalRMParser.g:918:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEArtifactTypeBodyAccess().getEArtifactTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:924:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRMParser.g:925:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRMParser.g:925:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRMParser.g:926:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:929:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRMParser.g:930:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRMParser.g:930:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )*
            loop8:
            do {
                int alt8=5;
                int LA8_0 = input.LA(1);

                if ( LA8_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt8=2;
                }
                else if ( LA8_0 == Mime_type && getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt8=3;
                }
                else if ( LA8_0 == File_ext && getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt8=4;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRMParser.g:931:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:931:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:932:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:932:114: ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:933:6: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:936:9: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:936:10: {...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:936:19: (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:936:20: otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEArtifactTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:940:9: ( (lv_superType_3_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:941:10: (lv_superType_3_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:941:10: (lv_superType_3_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:942:11: lv_superType_3_0= ruleEPREFIX_TYPE
            	    {

            	    											newCompositeNode(grammarAccess.getEArtifactTypeBodyAccess().getSuperTypeEPREFIX_TYPEParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_18);
            	    lv_superType_3_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEArtifactTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"superType",
            	    												lv_superType_3_0,
            	    												"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    											afterParserOrEnumRuleCall();
            	    										

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
            	    // InternalRMParser.g:965:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:965:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:966:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:966:114: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:967:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:970:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:970:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:970:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:970:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEArtifactTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:974:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:975:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:975:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:976:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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
            	    // InternalRMParser.g:998:4: ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:998:4: ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:999:5: {...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:999:114: ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1000:6: ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:1003:9: ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1003:10: {...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1003:19: (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1003:20: otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,Mime_type,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEArtifactTypeBodyAccess().getMime_typeKeyword_1_2_0());
            	    								
            	    // InternalRMParser.g:1007:9: ( (lv_mime_type_7_0= RULE_STRING ) )
            	    // InternalRMParser.g:1008:10: (lv_mime_type_7_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1008:10: (lv_mime_type_7_0= RULE_STRING )
            	    // InternalRMParser.g:1009:11: lv_mime_type_7_0= RULE_STRING
            	    {
            	    lv_mime_type_7_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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
            	    // InternalRMParser.g:1031:4: ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1031:4: ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1032:5: {...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:1032:114: ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1033:6: ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:1036:9: ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1036:10: {...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1036:19: ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1036:20: (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) )
            	    {
            	    // InternalRMParser.g:1036:20: (otherlv_8= File_ext )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==File_ext) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalRMParser.g:1037:10: otherlv_8= File_ext
            	    	    {
            	    	    otherlv_8=(Token)match(input,File_ext,FOLLOW_19); 

            	    	    										newLeafNode(otherlv_8, grammarAccess.getEArtifactTypeBodyAccess().getFile_extKeyword_1_3_0());
            	    	    									

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

            	    // InternalRMParser.g:1042:9: ( (lv_file_ext_9_0= RULE_STRING ) )
            	    // InternalRMParser.g:1043:10: (lv_file_ext_9_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1043:10: (lv_file_ext_9_0= RULE_STRING )
            	    // InternalRMParser.g:1044:11: lv_file_ext_9_0= RULE_STRING
            	    {
            	    lv_file_ext_9_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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
            	    break loop8;
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
    // InternalRMParser.g:1077:1: entryRuleECapabilityTypes returns [EObject current=null] : iv_ruleECapabilityTypes= ruleECapabilityTypes EOF ;
    public final EObject entryRuleECapabilityTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypes = null;


        try {
            // InternalRMParser.g:1077:57: (iv_ruleECapabilityTypes= ruleECapabilityTypes EOF )
            // InternalRMParser.g:1078:2: iv_ruleECapabilityTypes= ruleECapabilityTypes EOF
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
    // InternalRMParser.g:1084:1: ruleECapabilityTypes returns [EObject current=null] : ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ ) ;
    public final EObject ruleECapabilityTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilityTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1090:2: ( ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ ) )
            // InternalRMParser.g:1091:2: ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ )
            {
            // InternalRMParser.g:1091:2: ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ )
            // InternalRMParser.g:1092:3: () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+
            {
            // InternalRMParser.g:1092:3: ()
            // InternalRMParser.g:1093:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilityTypesAccess().getECapabilityTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1099:3: ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_QUALIFIED_NAME) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRMParser.g:1100:4: (lv_capabilityTypes_1_0= ruleECapabilityType )
            	    {
            	    // InternalRMParser.g:1100:4: (lv_capabilityTypes_1_0= ruleECapabilityType )
            	    // InternalRMParser.g:1101:5: lv_capabilityTypes_1_0= ruleECapabilityType
            	    {

            	    					newCompositeNode(grammarAccess.getECapabilityTypesAccess().getCapabilityTypesECapabilityTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // InternalRMParser.g:1122:1: entryRuleECapabilityType returns [EObject current=null] : iv_ruleECapabilityType= ruleECapabilityType EOF ;
    public final EObject entryRuleECapabilityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityType = null;


        try {
            // InternalRMParser.g:1122:56: (iv_ruleECapabilityType= ruleECapabilityType EOF )
            // InternalRMParser.g:1123:2: iv_ruleECapabilityType= ruleECapabilityType EOF
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
    // InternalRMParser.g:1129:1: ruleECapabilityType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleECapabilityType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_capability_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1135:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1136:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1136:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1137:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1137:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1138:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1138:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1139:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getECapabilityTypeAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getECapabilityTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:1163:3: ( (lv_capability_3_0= ruleECapabilityTypeBody ) )
            // InternalRMParser.g:1164:4: (lv_capability_3_0= ruleECapabilityTypeBody )
            {
            // InternalRMParser.g:1164:4: (lv_capability_3_0= ruleECapabilityTypeBody )
            // InternalRMParser.g:1165:5: lv_capability_3_0= ruleECapabilityTypeBody
            {

            					newCompositeNode(grammarAccess.getECapabilityTypeAccess().getCapabilityECapabilityTypeBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_capability_3_0=ruleECapabilityTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getECapabilityTypeRule());
            					}
            					set(
            						current,
            						"capability",
            						lv_capability_3_0,
            						"org.sodalite.dsl.RM.ECapabilityTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getECapabilityTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:1190:1: entryRuleECapabilityTypeBody returns [EObject current=null] : iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF ;
    public final EObject entryRuleECapabilityTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypeBody = null;


        try {
            // InternalRMParser.g:1190:60: (iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF )
            // InternalRMParser.g:1191:2: iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF
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
    // InternalRMParser.g:1197:1: ruleECapabilityTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleECapabilityTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        EObject lv_superType_3_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_atributes_12_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1203:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:1204:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:1204:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:1205:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:1205:3: ()
            // InternalRMParser.g:1206:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilityTypeBodyAccess().getECapabilityTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1212:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:1213:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:1213:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:1214:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:1217:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:1218:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:1218:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )*
            loop10:
            do {
                int alt10=5;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 == Attributes && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt10=4;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRMParser.g:1219:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1219:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:1220:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:1220:116: ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:1221:6: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:1224:9: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:1224:10: {...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1224:19: (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:1224:20: otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getECapabilityTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:1228:9: ( (lv_superType_3_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:1229:10: (lv_superType_3_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:1229:10: (lv_superType_3_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:1230:11: lv_superType_3_0= ruleEPREFIX_TYPE
            	    {

            	    											newCompositeNode(grammarAccess.getECapabilityTypeBodyAccess().getSuperTypeEPREFIX_TYPEParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_21);
            	    lv_superType_3_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getECapabilityTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"superType",
            	    												lv_superType_3_0,
            	    												"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    											afterParserOrEnumRuleCall();
            	    										

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
            	    // InternalRMParser.g:1253:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1253:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1254:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:1254:116: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1255:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:1258:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1258:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1258:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1258:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getECapabilityTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:1262:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:1263:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1263:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:1264:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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
            	    // InternalRMParser.g:1286:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1286:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:1287:5: {...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:1287:116: ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:1288:6: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:1291:9: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:1291:10: {...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1291:19: (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:1291:20: otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Properties,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getECapabilityTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getECapabilityTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:1299:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:1300:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:1300:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRMParser.g:1301:11: lv_properties_8_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getECapabilityTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_21); 

            	    									newLeafNode(this_END_9, grammarAccess.getECapabilityTypeBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:1328:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1328:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:1329:5: {...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:1329:116: ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:1330:6: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:1333:9: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:1333:10: {...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1333:19: (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:1333:20: otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Attributes,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getECapabilityTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getECapabilityTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:1341:9: ( (lv_atributes_12_0= ruleEAttributes ) )
            	    // InternalRMParser.g:1342:10: (lv_atributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:1342:10: (lv_atributes_12_0= ruleEAttributes )
            	    // InternalRMParser.g:1343:11: lv_atributes_12_0= ruleEAttributes
            	    {

            	    											newCompositeNode(grammarAccess.getECapabilityTypeBodyAccess().getAtributesEAttributesParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_21); 

            	    									newLeafNode(this_END_13, grammarAccess.getECapabilityTypeBodyAccess().getENDTerminalRuleCall_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalRMParser.g:1381:1: entryRuleEInterfaceTypes returns [EObject current=null] : iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF ;
    public final EObject entryRuleEInterfaceTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceTypes = null;


        try {
            // InternalRMParser.g:1381:56: (iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF )
            // InternalRMParser.g:1382:2: iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF
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
    // InternalRMParser.g:1388:1: ruleEInterfaceTypes returns [EObject current=null] : ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ ) ;
    public final EObject ruleEInterfaceTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaceTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1394:2: ( ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ ) )
            // InternalRMParser.g:1395:2: ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ )
            {
            // InternalRMParser.g:1395:2: ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ )
            // InternalRMParser.g:1396:3: () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+
            {
            // InternalRMParser.g:1396:3: ()
            // InternalRMParser.g:1397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceTypesAccess().getEInterfaceTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1403:3: ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_QUALIFIED_NAME) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRMParser.g:1404:4: (lv_interfaceTypes_1_0= ruleEInterfaceType )
            	    {
            	    // InternalRMParser.g:1404:4: (lv_interfaceTypes_1_0= ruleEInterfaceType )
            	    // InternalRMParser.g:1405:5: lv_interfaceTypes_1_0= ruleEInterfaceType
            	    {

            	    					newCompositeNode(grammarAccess.getEInterfaceTypesAccess().getInterfaceTypesEInterfaceTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // InternalRMParser.g:1426:1: entryRuleEInterfaceType returns [EObject current=null] : iv_ruleEInterfaceType= ruleEInterfaceType EOF ;
    public final EObject entryRuleEInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceType = null;


        try {
            // InternalRMParser.g:1426:55: (iv_ruleEInterfaceType= ruleEInterfaceType EOF )
            // InternalRMParser.g:1427:2: iv_ruleEInterfaceType= ruleEInterfaceType EOF
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
    // InternalRMParser.g:1433:1: ruleEInterfaceType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEInterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_interface_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1439:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1440:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1440:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1441:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1441:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1442:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1442:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1443:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEInterfaceTypeAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_22); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEInterfaceTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:1467:3: ( (lv_interface_3_0= ruleEInterfaceTypeBody ) )
            // InternalRMParser.g:1468:4: (lv_interface_3_0= ruleEInterfaceTypeBody )
            {
            // InternalRMParser.g:1468:4: (lv_interface_3_0= ruleEInterfaceTypeBody )
            // InternalRMParser.g:1469:5: lv_interface_3_0= ruleEInterfaceTypeBody
            {

            					newCompositeNode(grammarAccess.getEInterfaceTypeAccess().getInterfaceEInterfaceTypeBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_interface_3_0=ruleEInterfaceTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEInterfaceTypeRule());
            					}
            					set(
            						current,
            						"interface",
            						lv_interface_3_0,
            						"org.sodalite.dsl.RM.EInterfaceTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEInterfaceTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:1494:1: entryRuleEInterfaceTypeBody returns [EObject current=null] : iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF ;
    public final EObject entryRuleEInterfaceTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceTypeBody = null;


        try {
            // InternalRMParser.g:1494:59: (iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF )
            // InternalRMParser.g:1495:2: iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF
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
    // InternalRMParser.g:1501:1: ruleEInterfaceTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEInterfaceTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        EObject lv_superType_3_0 = null;

        EObject lv_inputs_8_0 = null;

        EObject lv_operations_12_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1507:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:1508:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:1508:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:1509:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:1509:3: ()
            // InternalRMParser.g:1510:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceTypeBodyAccess().getEInterfaceTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1516:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:1517:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:1517:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:1518:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:1521:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:1522:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:1522:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )*
            loop12:
            do {
                int alt12=5;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 == Inputs && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 == Operations && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt12=4;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRMParser.g:1523:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1523:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:1524:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:1524:115: ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:1525:6: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:1528:9: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:1528:10: {...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1528:19: (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:1528:20: otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEInterfaceTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:1532:9: ( (lv_superType_3_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:1533:10: (lv_superType_3_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:1533:10: (lv_superType_3_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:1534:11: lv_superType_3_0= ruleEPREFIX_TYPE
            	    {

            	    											newCompositeNode(grammarAccess.getEInterfaceTypeBodyAccess().getSuperTypeEPREFIX_TYPEParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_23);
            	    lv_superType_3_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEInterfaceTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"superType",
            	    												lv_superType_3_0,
            	    												"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    											afterParserOrEnumRuleCall();
            	    										

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
            	    // InternalRMParser.g:1557:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1557:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1558:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:1558:115: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1559:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:1562:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1562:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1562:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1562:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEInterfaceTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:1566:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:1567:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1567:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:1568:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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
            	    // InternalRMParser.g:1590:4: ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1590:4: ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:1591:5: {...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:1591:115: ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:1592:6: ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:1595:9: ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:1595:10: {...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1595:19: (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:1595:20: otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Inputs,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEInterfaceTypeBodyAccess().getInputsKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getEInterfaceTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:1603:9: ( (lv_inputs_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:1604:10: (lv_inputs_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:1604:10: (lv_inputs_8_0= ruleEProperties )
            	    // InternalRMParser.g:1605:11: lv_inputs_8_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getEInterfaceTypeBodyAccess().getInputsEPropertiesParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_23); 

            	    									newLeafNode(this_END_9, grammarAccess.getEInterfaceTypeBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:1632:4: ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1632:4: ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:1633:5: {...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:1633:115: ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:1634:6: ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:1637:9: ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:1637:10: {...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1637:19: (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:1637:20: otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Operations,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEInterfaceTypeBodyAccess().getOperationsKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getEInterfaceTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:1645:9: ( (lv_operations_12_0= ruleEOperations ) )
            	    // InternalRMParser.g:1646:10: (lv_operations_12_0= ruleEOperations )
            	    {
            	    // InternalRMParser.g:1646:10: (lv_operations_12_0= ruleEOperations )
            	    // InternalRMParser.g:1647:11: lv_operations_12_0= ruleEOperations
            	    {

            	    											newCompositeNode(grammarAccess.getEInterfaceTypeBodyAccess().getOperationsEOperationsParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_23); 

            	    									newLeafNode(this_END_13, grammarAccess.getEInterfaceTypeBodyAccess().getENDTerminalRuleCall_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalRMParser.g:1685:1: entryRuleEPolicyTypes returns [EObject current=null] : iv_ruleEPolicyTypes= ruleEPolicyTypes EOF ;
    public final EObject entryRuleEPolicyTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyTypes = null;


        try {
            // InternalRMParser.g:1685:53: (iv_ruleEPolicyTypes= ruleEPolicyTypes EOF )
            // InternalRMParser.g:1686:2: iv_ruleEPolicyTypes= ruleEPolicyTypes EOF
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
    // InternalRMParser.g:1692:1: ruleEPolicyTypes returns [EObject current=null] : ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ ) ;
    public final EObject ruleEPolicyTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_policyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1698:2: ( ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ ) )
            // InternalRMParser.g:1699:2: ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ )
            {
            // InternalRMParser.g:1699:2: ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ )
            // InternalRMParser.g:1700:3: () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+
            {
            // InternalRMParser.g:1700:3: ()
            // InternalRMParser.g:1701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPolicyTypesAccess().getEPolicyTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1707:3: ( (lv_policyTypes_1_0= ruleEPolicyType ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_QUALIFIED_NAME) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRMParser.g:1708:4: (lv_policyTypes_1_0= ruleEPolicyType )
            	    {
            	    // InternalRMParser.g:1708:4: (lv_policyTypes_1_0= ruleEPolicyType )
            	    // InternalRMParser.g:1709:5: lv_policyTypes_1_0= ruleEPolicyType
            	    {

            	    					newCompositeNode(grammarAccess.getEPolicyTypesAccess().getPolicyTypesEPolicyTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // InternalRMParser.g:1730:1: entryRuleEPolicyType returns [EObject current=null] : iv_ruleEPolicyType= ruleEPolicyType EOF ;
    public final EObject entryRuleEPolicyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyType = null;


        try {
            // InternalRMParser.g:1730:52: (iv_ruleEPolicyType= ruleEPolicyType EOF )
            // InternalRMParser.g:1731:2: iv_ruleEPolicyType= ruleEPolicyType EOF
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
    // InternalRMParser.g:1737:1: ruleEPolicyType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEPolicyType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_policy_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1743:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1744:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1744:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1745:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1745:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1746:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1746:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1747:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEPolicyTypeAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_24); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEPolicyTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:1771:3: ( (lv_policy_3_0= ruleEPolicyTypeBody ) )
            // InternalRMParser.g:1772:4: (lv_policy_3_0= ruleEPolicyTypeBody )
            {
            // InternalRMParser.g:1772:4: (lv_policy_3_0= ruleEPolicyTypeBody )
            // InternalRMParser.g:1773:5: lv_policy_3_0= ruleEPolicyTypeBody
            {

            					newCompositeNode(grammarAccess.getEPolicyTypeAccess().getPolicyEPolicyTypeBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_policy_3_0=ruleEPolicyTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEPolicyTypeRule());
            					}
            					set(
            						current,
            						"policy",
            						lv_policy_3_0,
            						"org.sodalite.dsl.RM.EPolicyTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEPolicyTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:1798:1: entryRuleEPolicyTypeBody returns [EObject current=null] : iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF ;
    public final EObject entryRuleEPolicyTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyTypeBody = null;


        try {
            // InternalRMParser.g:1798:56: (iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF )
            // InternalRMParser.g:1799:2: iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF
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
    // InternalRMParser.g:1805:1: ruleEPolicyTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )? (otherlv_10= Targets otherlv_11= LeftSquareBracket ( (lv_targets_12_0= ruleEValidTargetTypes ) )? otherlv_13= RightSquareBracket )? ) ;
    public final EObject ruleEPolicyTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_superType_3_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_targets_12_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1811:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )? (otherlv_10= Targets otherlv_11= LeftSquareBracket ( (lv_targets_12_0= ruleEValidTargetTypes ) )? otherlv_13= RightSquareBracket )? ) )
            // InternalRMParser.g:1812:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )? (otherlv_10= Targets otherlv_11= LeftSquareBracket ( (lv_targets_12_0= ruleEValidTargetTypes ) )? otherlv_13= RightSquareBracket )? )
            {
            // InternalRMParser.g:1812:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )? (otherlv_10= Targets otherlv_11= LeftSquareBracket ( (lv_targets_12_0= ruleEValidTargetTypes ) )? otherlv_13= RightSquareBracket )? )
            // InternalRMParser.g:1813:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )? (otherlv_10= Targets otherlv_11= LeftSquareBracket ( (lv_targets_12_0= ruleEValidTargetTypes ) )? otherlv_13= RightSquareBracket )?
            {
            // InternalRMParser.g:1813:3: ()
            // InternalRMParser.g:1814:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPolicyTypeBodyAccess().getEPolicyTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1820:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRMParser.g:1821:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRMParser.g:1821:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRMParser.g:1822:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:1825:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRMParser.g:1826:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRMParser.g:1826:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( LA14_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRMParser.g:1827:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1827:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:1828:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:1828:112: ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:1829:6: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:1832:9: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:1832:10: {...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1832:19: (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:1832:20: otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEPolicyTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:1836:9: ( (lv_superType_3_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:1837:10: (lv_superType_3_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:1837:10: (lv_superType_3_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:1838:11: lv_superType_3_0= ruleEPREFIX_TYPE
            	    {

            	    											newCompositeNode(grammarAccess.getEPolicyTypeBodyAccess().getSuperTypeEPREFIX_TYPEParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_superType_3_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEPolicyTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"superType",
            	    												lv_superType_3_0,
            	    												"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    											afterParserOrEnumRuleCall();
            	    										

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
            	    // InternalRMParser.g:1861:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1861:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1862:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:1862:112: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1863:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:1866:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1866:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1866:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1866:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEPolicyTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:1870:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:1871:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1871:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:1872:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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
            	    break loop14;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1());
            				

            }

            // InternalRMParser.g:1901:3: (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Properties) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRMParser.g:1902:4: otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Properties,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getEPolicyTypeBodyAccess().getPropertiesKeyword_2_0());
                    			
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getEPolicyTypeBodyAccess().getBEGINTerminalRuleCall_2_1());
                    			
                    // InternalRMParser.g:1910:4: ( (lv_properties_8_0= ruleEProperties ) )
                    // InternalRMParser.g:1911:5: (lv_properties_8_0= ruleEProperties )
                    {
                    // InternalRMParser.g:1911:5: (lv_properties_8_0= ruleEProperties )
                    // InternalRMParser.g:1912:6: lv_properties_8_0= ruleEProperties
                    {

                    						newCompositeNode(grammarAccess.getEPolicyTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_properties_8_0=ruleEProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEPolicyTypeBodyRule());
                    						}
                    						set(
                    							current,
                    							"properties",
                    							lv_properties_8_0,
                    							"org.sodalite.dsl.RM.EProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_9=(Token)match(input,RULE_END,FOLLOW_26); 

                    				newLeafNode(this_END_9, grammarAccess.getEPolicyTypeBodyAccess().getENDTerminalRuleCall_2_3());
                    			

                    }
                    break;

            }

            // InternalRMParser.g:1934:3: (otherlv_10= Targets otherlv_11= LeftSquareBracket ( (lv_targets_12_0= ruleEValidTargetTypes ) )? otherlv_13= RightSquareBracket )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Targets) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRMParser.g:1935:4: otherlv_10= Targets otherlv_11= LeftSquareBracket ( (lv_targets_12_0= ruleEValidTargetTypes ) )? otherlv_13= RightSquareBracket
                    {
                    otherlv_10=(Token)match(input,Targets,FOLLOW_27); 

                    				newLeafNode(otherlv_10, grammarAccess.getEPolicyTypeBodyAccess().getTargetsKeyword_3_0());
                    			
                    otherlv_11=(Token)match(input,LeftSquareBracket,FOLLOW_28); 

                    				newLeafNode(otherlv_11, grammarAccess.getEPolicyTypeBodyAccess().getLeftSquareBracketKeyword_3_1());
                    			
                    // InternalRMParser.g:1943:4: ( (lv_targets_12_0= ruleEValidTargetTypes ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_QUALIFIED_NAME)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalRMParser.g:1944:5: (lv_targets_12_0= ruleEValidTargetTypes )
                            {
                            // InternalRMParser.g:1944:5: (lv_targets_12_0= ruleEValidTargetTypes )
                            // InternalRMParser.g:1945:6: lv_targets_12_0= ruleEValidTargetTypes
                            {

                            						newCompositeNode(grammarAccess.getEPolicyTypeBodyAccess().getTargetsEValidTargetTypesParserRuleCall_3_2_0());
                            					
                            pushFollow(FOLLOW_29);
                            lv_targets_12_0=ruleEValidTargetTypes();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getEPolicyTypeBodyRule());
                            						}
                            						add(
                            							current,
                            							"targets",
                            							lv_targets_12_0,
                            							"org.sodalite.dsl.RM.EValidTargetTypes");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getEPolicyTypeBodyAccess().getRightSquareBracketKeyword_3_3());
                    			

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
    // $ANTLR end "ruleEPolicyTypeBody"


    // $ANTLR start "entryRuleENodeTypes"
    // InternalRMParser.g:1971:1: entryRuleENodeTypes returns [EObject current=null] : iv_ruleENodeTypes= ruleENodeTypes EOF ;
    public final EObject entryRuleENodeTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypes = null;


        try {
            // InternalRMParser.g:1971:51: (iv_ruleENodeTypes= ruleENodeTypes EOF )
            // InternalRMParser.g:1972:2: iv_ruleENodeTypes= ruleENodeTypes EOF
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
    // InternalRMParser.g:1978:1: ruleENodeTypes returns [EObject current=null] : ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ ) ;
    public final EObject ruleENodeTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_nodeTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1984:2: ( ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ ) )
            // InternalRMParser.g:1985:2: ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ )
            {
            // InternalRMParser.g:1985:2: ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ )
            // InternalRMParser.g:1986:3: () ( (lv_nodeTypes_1_0= ruleENodeType ) )+
            {
            // InternalRMParser.g:1986:3: ()
            // InternalRMParser.g:1987:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getENodeTypesAccess().getENodeTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1993:3: ( (lv_nodeTypes_1_0= ruleENodeType ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_QUALIFIED_NAME) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRMParser.g:1994:4: (lv_nodeTypes_1_0= ruleENodeType )
            	    {
            	    // InternalRMParser.g:1994:4: (lv_nodeTypes_1_0= ruleENodeType )
            	    // InternalRMParser.g:1995:5: lv_nodeTypes_1_0= ruleENodeType
            	    {

            	    					newCompositeNode(grammarAccess.getENodeTypesAccess().getNodeTypesENodeTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // InternalRMParser.g:2016:1: entryRuleENodeType returns [EObject current=null] : iv_ruleENodeType= ruleENodeType EOF ;
    public final EObject entryRuleENodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeType = null;


        try {
            // InternalRMParser.g:2016:50: (iv_ruleENodeType= ruleENodeType EOF )
            // InternalRMParser.g:2017:2: iv_ruleENodeType= ruleENodeType EOF
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
    // InternalRMParser.g:2023:1: ruleENodeType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleENodeType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_node_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2029:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:2030:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:2030:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:2031:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:2031:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:2032:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:2032:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:2033:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getENodeTypeAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getENodeTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:2057:3: ( (lv_node_3_0= ruleENodeTypeBody ) )
            // InternalRMParser.g:2058:4: (lv_node_3_0= ruleENodeTypeBody )
            {
            // InternalRMParser.g:2058:4: (lv_node_3_0= ruleENodeTypeBody )
            // InternalRMParser.g:2059:5: lv_node_3_0= ruleENodeTypeBody
            {

            					newCompositeNode(grammarAccess.getENodeTypeAccess().getNodeENodeTypeBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_node_3_0=ruleENodeTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getENodeTypeRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_3_0,
            						"org.sodalite.dsl.RM.ENodeTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getENodeTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:2084:1: entryRuleENodeTypeBody returns [EObject current=null] : iv_ruleENodeTypeBody= ruleENodeTypeBody EOF ;
    public final EObject entryRuleENodeTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypeBody = null;


        try {
            // InternalRMParser.g:2084:54: (iv_ruleENodeTypeBody= ruleENodeTypeBody EOF )
            // InternalRMParser.g:2085:2: iv_ruleENodeTypeBody= ruleENodeTypeBody EOF
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
    // InternalRMParser.g:2091:1: ruleENodeTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleENodeTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        Token otherlv_14=null;
        Token this_BEGIN_15=null;
        Token this_END_17=null;
        Token otherlv_18=null;
        Token this_BEGIN_19=null;
        Token this_END_21=null;
        Token otherlv_22=null;
        Token this_BEGIN_23=null;
        Token this_END_25=null;
        EObject lv_superType_3_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_attributes_12_0 = null;

        EObject lv_interfaces_16_0 = null;

        EObject lv_capabilities_20_0 = null;

        EObject lv_requirements_24_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2097:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:2098:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:2098:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:2099:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:2099:3: ()
            // InternalRMParser.g:2100:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getENodeTypeBodyAccess().getENodeTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2106:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:2107:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:2107:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:2108:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:2111:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:2112:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:2112:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )*
            loop19:
            do {
                int alt19=8;
                int LA19_0 = input.LA(1);

                if ( LA19_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt19=2;
                }
                else if ( LA19_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt19=3;
                }
                else if ( LA19_0 == Attributes && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt19=4;
                }
                else if ( LA19_0 == Interfaces && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
                    alt19=5;
                }
                else if ( LA19_0 == Capabilities && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
                    alt19=6;
                }
                else if ( LA19_0 == Requirements && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6) ) {
                    alt19=7;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRMParser.g:2113:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2113:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:2114:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:2114:110: ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:2115:6: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:2118:9: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:2118:10: {...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2118:19: (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:2118:20: otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getENodeTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:2122:9: ( (lv_superType_3_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:2123:10: (lv_superType_3_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:2123:10: (lv_superType_3_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:2124:11: lv_superType_3_0= ruleEPREFIX_TYPE
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getSuperTypeEPREFIX_TYPEParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_superType_3_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"superType",
            	    												lv_superType_3_0,
            	    												"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    											afterParserOrEnumRuleCall();
            	    										

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
            	    // InternalRMParser.g:2147:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2147:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:2148:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:2148:110: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:2149:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:2152:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:2152:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2152:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:2152:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getENodeTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:2156:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:2157:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:2157:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:2158:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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
            	    // InternalRMParser.g:2180:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2180:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:2181:5: {...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:2181:110: ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:2182:6: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:2185:9: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:2185:10: {...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2185:19: (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:2185:20: otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Properties,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getENodeTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:2193:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:2194:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:2194:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRMParser.g:2195:11: lv_properties_8_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_31); 

            	    									newLeafNode(this_END_9, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:2222:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2222:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:2223:5: {...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:2223:110: ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:2224:6: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:2227:9: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:2227:10: {...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2227:19: (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:2227:20: otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Attributes,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getENodeTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:2235:9: ( (lv_attributes_12_0= ruleEAttributes ) )
            	    // InternalRMParser.g:2236:10: (lv_attributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:2236:10: (lv_attributes_12_0= ruleEAttributes )
            	    // InternalRMParser.g:2237:11: lv_attributes_12_0= ruleEAttributes
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getAttributesEAttributesParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_31); 

            	    									newLeafNode(this_END_13, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRMParser.g:2264:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2264:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    // InternalRMParser.g:2265:5: {...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalRMParser.g:2265:110: ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    // InternalRMParser.g:2266:6: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalRMParser.g:2269:9: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    // InternalRMParser.g:2269:10: {...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2269:19: (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    // InternalRMParser.g:2269:20: otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END
            	    {
            	    otherlv_14=(Token)match(input,Interfaces,FOLLOW_5); 

            	    									newLeafNode(otherlv_14, grammarAccess.getENodeTypeBodyAccess().getInterfacesKeyword_1_4_0());
            	    								
            	    this_BEGIN_15=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_15, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_4_1());
            	    								
            	    // InternalRMParser.g:2277:9: ( (lv_interfaces_16_0= ruleEInterfaces ) )
            	    // InternalRMParser.g:2278:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    {
            	    // InternalRMParser.g:2278:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    // InternalRMParser.g:2279:11: lv_interfaces_16_0= ruleEInterfaces
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getInterfacesEInterfacesParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_17=(Token)match(input,RULE_END,FOLLOW_31); 

            	    									newLeafNode(this_END_17, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_4_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRMParser.g:2306:4: ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2306:4: ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) )
            	    // InternalRMParser.g:2307:5: {...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalRMParser.g:2307:110: ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) )
            	    // InternalRMParser.g:2308:6: ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalRMParser.g:2311:9: ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) )
            	    // InternalRMParser.g:2311:10: {...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2311:19: (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END )
            	    // InternalRMParser.g:2311:20: otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END
            	    {
            	    otherlv_18=(Token)match(input,Capabilities,FOLLOW_5); 

            	    									newLeafNode(otherlv_18, grammarAccess.getENodeTypeBodyAccess().getCapabilitiesKeyword_1_5_0());
            	    								
            	    this_BEGIN_19=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_19, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_5_1());
            	    								
            	    // InternalRMParser.g:2319:9: ( (lv_capabilities_20_0= ruleECapabilities ) )
            	    // InternalRMParser.g:2320:10: (lv_capabilities_20_0= ruleECapabilities )
            	    {
            	    // InternalRMParser.g:2320:10: (lv_capabilities_20_0= ruleECapabilities )
            	    // InternalRMParser.g:2321:11: lv_capabilities_20_0= ruleECapabilities
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getCapabilitiesECapabilitiesParserRuleCall_1_5_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_21=(Token)match(input,RULE_END,FOLLOW_31); 

            	    									newLeafNode(this_END_21, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_5_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRMParser.g:2348:4: ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2348:4: ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) )
            	    // InternalRMParser.g:2349:5: {...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalRMParser.g:2349:110: ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) )
            	    // InternalRMParser.g:2350:6: ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalRMParser.g:2353:9: ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) )
            	    // InternalRMParser.g:2353:10: {...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2353:19: (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END )
            	    // InternalRMParser.g:2353:20: otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END
            	    {
            	    otherlv_22=(Token)match(input,Requirements,FOLLOW_5); 

            	    									newLeafNode(otherlv_22, grammarAccess.getENodeTypeBodyAccess().getRequirementsKeyword_1_6_0());
            	    								
            	    this_BEGIN_23=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_23, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_6_1());
            	    								
            	    // InternalRMParser.g:2361:9: ( (lv_requirements_24_0= ruleERequirements ) )
            	    // InternalRMParser.g:2362:10: (lv_requirements_24_0= ruleERequirements )
            	    {
            	    // InternalRMParser.g:2362:10: (lv_requirements_24_0= ruleERequirements )
            	    // InternalRMParser.g:2363:11: lv_requirements_24_0= ruleERequirements
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getRequirementsERequirementsParserRuleCall_1_6_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_25=(Token)match(input,RULE_END,FOLLOW_31); 

            	    									newLeafNode(this_END_25, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_6_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalRMParser.g:2401:1: entryRuleERelationshipTypes returns [EObject current=null] : iv_ruleERelationshipTypes= ruleERelationshipTypes EOF ;
    public final EObject entryRuleERelationshipTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipTypes = null;


        try {
            // InternalRMParser.g:2401:59: (iv_ruleERelationshipTypes= ruleERelationshipTypes EOF )
            // InternalRMParser.g:2402:2: iv_ruleERelationshipTypes= ruleERelationshipTypes EOF
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
    // InternalRMParser.g:2408:1: ruleERelationshipTypes returns [EObject current=null] : ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ ) ;
    public final EObject ruleERelationshipTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_relationshipTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2414:2: ( ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ ) )
            // InternalRMParser.g:2415:2: ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ )
            {
            // InternalRMParser.g:2415:2: ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ )
            // InternalRMParser.g:2416:3: () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+
            {
            // InternalRMParser.g:2416:3: ()
            // InternalRMParser.g:2417:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERelationshipTypesAccess().getERelationshipTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2423:3: ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+
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
            	    // InternalRMParser.g:2424:4: (lv_relationshipTypes_1_0= ruleERelationshipType )
            	    {
            	    // InternalRMParser.g:2424:4: (lv_relationshipTypes_1_0= ruleERelationshipType )
            	    // InternalRMParser.g:2425:5: lv_relationshipTypes_1_0= ruleERelationshipType
            	    {

            	    					newCompositeNode(grammarAccess.getERelationshipTypesAccess().getRelationshipTypesERelationshipTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
    // $ANTLR end "ruleERelationshipTypes"


    // $ANTLR start "entryRuleERelationshipType"
    // InternalRMParser.g:2446:1: entryRuleERelationshipType returns [EObject current=null] : iv_ruleERelationshipType= ruleERelationshipType EOF ;
    public final EObject entryRuleERelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipType = null;


        try {
            // InternalRMParser.g:2446:58: (iv_ruleERelationshipType= ruleERelationshipType EOF )
            // InternalRMParser.g:2447:2: iv_ruleERelationshipType= ruleERelationshipType EOF
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
    // InternalRMParser.g:2453:1: ruleERelationshipType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleERelationshipType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_relationship_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2459:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:2460:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:2460:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:2461:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:2461:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:2462:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:2462:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:2463:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getERelationshipTypeAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_32); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getERelationshipTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:2487:3: ( (lv_relationship_3_0= ruleERelationshipTypeBody ) )
            // InternalRMParser.g:2488:4: (lv_relationship_3_0= ruleERelationshipTypeBody )
            {
            // InternalRMParser.g:2488:4: (lv_relationship_3_0= ruleERelationshipTypeBody )
            // InternalRMParser.g:2489:5: lv_relationship_3_0= ruleERelationshipTypeBody
            {

            					newCompositeNode(grammarAccess.getERelationshipTypeAccess().getRelationshipERelationshipTypeBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_relationship_3_0=ruleERelationshipTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getERelationshipTypeRule());
            					}
            					set(
            						current,
            						"relationship",
            						lv_relationship_3_0,
            						"org.sodalite.dsl.RM.ERelationshipTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getERelationshipTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:2514:1: entryRuleERelationshipTypeBody returns [EObject current=null] : iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF ;
    public final EObject entryRuleERelationshipTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipTypeBody = null;


        try {
            // InternalRMParser.g:2514:62: (iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF )
            // InternalRMParser.g:2515:2: iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF
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
    // InternalRMParser.g:2521:1: ruleERelationshipTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleERelationshipTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        Token otherlv_14=null;
        Token this_BEGIN_15=null;
        Token this_END_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_superType_3_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_atributes_12_0 = null;

        EObject lv_interfaces_16_0 = null;

        EObject lv_valid_target_types_20_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2527:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:2528:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:2528:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:2529:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:2529:3: ()
            // InternalRMParser.g:2530:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERelationshipTypeBodyAccess().getERelationshipTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2536:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) )
            // InternalRMParser.g:2537:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) )
            {
            // InternalRMParser.g:2537:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) )
            // InternalRMParser.g:2538:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:2541:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* )
            // InternalRMParser.g:2542:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )*
            {
            // InternalRMParser.g:2542:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )*
            loop21:
            do {
                int alt21=7;
                int LA21_0 = input.LA(1);

                if ( LA21_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt21=2;
                }
                else if ( LA21_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt21=3;
                }
                else if ( LA21_0 == Attributes && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt21=4;
                }
                else if ( LA21_0 == Interfaces && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
                    alt21=5;
                }
                else if ( LA21_0 == Valid_target_types && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
                    alt21=6;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRMParser.g:2543:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2543:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:2544:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:2544:118: ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:2545:6: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:2548:9: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:2548:10: {...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2548:19: (otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:2548:20: otherlv_2= Derived_from ( (lv_superType_3_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getERelationshipTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:2552:9: ( (lv_superType_3_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:2553:10: (lv_superType_3_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:2553:10: (lv_superType_3_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:2554:11: lv_superType_3_0= ruleEPREFIX_TYPE
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getSuperTypeEPREFIX_TYPEParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_33);
            	    lv_superType_3_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"superType",
            	    												lv_superType_3_0,
            	    												"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    											afterParserOrEnumRuleCall();
            	    										

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
            	    // InternalRMParser.g:2577:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2577:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:2578:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:2578:118: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:2579:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:2582:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:2582:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2582:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:2582:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getERelationshipTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:2586:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:2587:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:2587:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:2588:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

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
            	    // InternalRMParser.g:2610:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2610:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:2611:5: {...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:2611:118: ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:2612:6: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:2615:9: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:2615:10: {...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2615:19: (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:2615:20: otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Properties,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getERelationshipTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getERelationshipTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:2623:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:2624:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:2624:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRMParser.g:2625:11: lv_properties_8_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_33); 

            	    									newLeafNode(this_END_9, grammarAccess.getERelationshipTypeBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:2652:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2652:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:2653:5: {...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:2653:118: ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:2654:6: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:2657:9: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:2657:10: {...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2657:19: (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:2657:20: otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Attributes,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getERelationshipTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getERelationshipTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:2665:9: ( (lv_atributes_12_0= ruleEAttributes ) )
            	    // InternalRMParser.g:2666:10: (lv_atributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:2666:10: (lv_atributes_12_0= ruleEAttributes )
            	    // InternalRMParser.g:2667:11: lv_atributes_12_0= ruleEAttributes
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getAtributesEAttributesParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_33); 

            	    									newLeafNode(this_END_13, grammarAccess.getERelationshipTypeBodyAccess().getENDTerminalRuleCall_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRMParser.g:2694:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2694:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    // InternalRMParser.g:2695:5: {...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalRMParser.g:2695:118: ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    // InternalRMParser.g:2696:6: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalRMParser.g:2699:9: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    // InternalRMParser.g:2699:10: {...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2699:19: (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    // InternalRMParser.g:2699:20: otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END
            	    {
            	    otherlv_14=(Token)match(input,Interfaces,FOLLOW_5); 

            	    									newLeafNode(otherlv_14, grammarAccess.getERelationshipTypeBodyAccess().getInterfacesKeyword_1_4_0());
            	    								
            	    this_BEGIN_15=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_15, grammarAccess.getERelationshipTypeBodyAccess().getBEGINTerminalRuleCall_1_4_1());
            	    								
            	    // InternalRMParser.g:2707:9: ( (lv_interfaces_16_0= ruleEInterfaces ) )
            	    // InternalRMParser.g:2708:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    {
            	    // InternalRMParser.g:2708:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    // InternalRMParser.g:2709:11: lv_interfaces_16_0= ruleEInterfaces
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getInterfacesEInterfacesParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_17=(Token)match(input,RULE_END,FOLLOW_33); 

            	    									newLeafNode(this_END_17, grammarAccess.getERelationshipTypeBodyAccess().getENDTerminalRuleCall_1_4_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRMParser.g:2736:4: ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:2736:4: ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:2737:5: {...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalRMParser.g:2737:118: ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) )
            	    // InternalRMParser.g:2738:6: ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalRMParser.g:2741:9: ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) )
            	    // InternalRMParser.g:2741:10: {...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2741:19: (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket )
            	    // InternalRMParser.g:2741:20: otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket
            	    {
            	    otherlv_18=(Token)match(input,Valid_target_types,FOLLOW_27); 

            	    									newLeafNode(otherlv_18, grammarAccess.getERelationshipTypeBodyAccess().getValid_target_typesKeyword_1_5_0());
            	    								
            	    otherlv_19=(Token)match(input,LeftSquareBracket,FOLLOW_6); 

            	    									newLeafNode(otherlv_19, grammarAccess.getERelationshipTypeBodyAccess().getLeftSquareBracketKeyword_1_5_1());
            	    								
            	    // InternalRMParser.g:2749:9: ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) )
            	    // InternalRMParser.g:2750:10: (lv_valid_target_types_20_0= ruleEValidTargetTypes )
            	    {
            	    // InternalRMParser.g:2750:10: (lv_valid_target_types_20_0= ruleEValidTargetTypes )
            	    // InternalRMParser.g:2751:11: lv_valid_target_types_20_0= ruleEValidTargetTypes
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getValid_target_typesEValidTargetTypesParserRuleCall_1_5_2_0());
            	    										
            	    pushFollow(FOLLOW_29);
            	    lv_valid_target_types_20_0=ruleEValidTargetTypes();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"valid_target_types",
            	    												lv_valid_target_types_20_0,
            	    												"org.sodalite.dsl.RM.EValidTargetTypes");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_21=(Token)match(input,RightSquareBracket,FOLLOW_33); 

            	    									newLeafNode(otherlv_21, grammarAccess.getERelationshipTypeBodyAccess().getRightSquareBracketKeyword_1_5_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalRMParser.g:2789:1: entryRuleEValidTargetTypes returns [EObject current=null] : iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF ;
    public final EObject entryRuleEValidTargetTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidTargetTypes = null;


        try {
            // InternalRMParser.g:2789:58: (iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF )
            // InternalRMParser.g:2790:2: iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF
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
    // InternalRMParser.g:2796:1: ruleEValidTargetTypes returns [EObject current=null] : ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* ) ;
    public final EObject ruleEValidTargetTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_targetTypes_0_0 = null;

        EObject lv_sourceType_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2802:2: ( ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* ) )
            // InternalRMParser.g:2803:2: ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* )
            {
            // InternalRMParser.g:2803:2: ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* )
            // InternalRMParser.g:2804:3: ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )*
            {
            // InternalRMParser.g:2804:3: ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) )
            // InternalRMParser.g:2805:4: (lv_targetTypes_0_0= ruleECapabilityTypeRef )
            {
            // InternalRMParser.g:2805:4: (lv_targetTypes_0_0= ruleECapabilityTypeRef )
            // InternalRMParser.g:2806:5: lv_targetTypes_0_0= ruleECapabilityTypeRef
            {

            					newCompositeNode(grammarAccess.getEValidTargetTypesAccess().getTargetTypesECapabilityTypeRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalRMParser.g:2823:3: (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Comma) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRMParser.g:2824:4: otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEValidTargetTypesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRMParser.g:2828:4: ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) )
            	    // InternalRMParser.g:2829:5: (lv_sourceType_2_0= ruleECapabilityTypeRef )
            	    {
            	    // InternalRMParser.g:2829:5: (lv_sourceType_2_0= ruleECapabilityTypeRef )
            	    // InternalRMParser.g:2830:6: lv_sourceType_2_0= ruleECapabilityTypeRef
            	    {

            	    						newCompositeNode(grammarAccess.getEValidTargetTypesAccess().getSourceTypeECapabilityTypeRefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
    // $ANTLR end "ruleEValidTargetTypes"


    // $ANTLR start "entryRuleECapabilityTypeRef"
    // InternalRMParser.g:2852:1: entryRuleECapabilityTypeRef returns [EObject current=null] : iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF ;
    public final EObject entryRuleECapabilityTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypeRef = null;


        try {
            // InternalRMParser.g:2852:59: (iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF )
            // InternalRMParser.g:2853:2: iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF
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
    // InternalRMParser.g:2859:1: ruleECapabilityTypeRef returns [EObject current=null] : ( (lv_name_0_0= ruleEPREFIX_TYPE ) ) ;
    public final EObject ruleECapabilityTypeRef() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2865:2: ( ( (lv_name_0_0= ruleEPREFIX_TYPE ) ) )
            // InternalRMParser.g:2866:2: ( (lv_name_0_0= ruleEPREFIX_TYPE ) )
            {
            // InternalRMParser.g:2866:2: ( (lv_name_0_0= ruleEPREFIX_TYPE ) )
            // InternalRMParser.g:2867:3: (lv_name_0_0= ruleEPREFIX_TYPE )
            {
            // InternalRMParser.g:2867:3: (lv_name_0_0= ruleEPREFIX_TYPE )
            // InternalRMParser.g:2868:4: lv_name_0_0= ruleEPREFIX_TYPE
            {

            				newCompositeNode(grammarAccess.getECapabilityTypeRefAccess().getNameEPREFIX_TYPEParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEPREFIX_TYPE();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getECapabilityTypeRefRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.sodalite.dsl.RM.EPREFIX_TYPE");
            				afterParserOrEnumRuleCall();
            			

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
    // InternalRMParser.g:2888:1: entryRuleEProperties returns [EObject current=null] : iv_ruleEProperties= ruleEProperties EOF ;
    public final EObject entryRuleEProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEProperties = null;


        try {
            // InternalRMParser.g:2888:52: (iv_ruleEProperties= ruleEProperties EOF )
            // InternalRMParser.g:2889:2: iv_ruleEProperties= ruleEProperties EOF
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
    // InternalRMParser.g:2895:1: ruleEProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* ) ;
    public final EObject ruleEProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2901:2: ( ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* ) )
            // InternalRMParser.g:2902:2: ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* )
            {
            // InternalRMParser.g:2902:2: ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* )
            // InternalRMParser.g:2903:3: () ( (lv_properties_1_0= ruleEPropertyDefinition ) )*
            {
            // InternalRMParser.g:2903:3: ()
            // InternalRMParser.g:2904:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPropertiesAccess().getEPropertiesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2910:3: ( (lv_properties_1_0= ruleEPropertyDefinition ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRMParser.g:2911:4: (lv_properties_1_0= ruleEPropertyDefinition )
            	    {
            	    // InternalRMParser.g:2911:4: (lv_properties_1_0= ruleEPropertyDefinition )
            	    // InternalRMParser.g:2912:5: lv_properties_1_0= ruleEPropertyDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEPropertiesAccess().getPropertiesEPropertyDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
    // $ANTLR end "ruleEProperties"


    // $ANTLR start "entryRuleEPropertyDefinition"
    // InternalRMParser.g:2933:1: entryRuleEPropertyDefinition returns [EObject current=null] : iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF ;
    public final EObject entryRuleEPropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyDefinition = null;


        try {
            // InternalRMParser.g:2933:60: (iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF )
            // InternalRMParser.g:2934:2: iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF
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
    // InternalRMParser.g:2940:1: ruleEPropertyDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEPropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_property_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2946:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:2947:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:2947:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:2948:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:2948:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:2949:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:2949:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:2950:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEPropertyDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_36); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEPropertyDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:2974:3: ( (lv_property_3_0= ruleEPropertyDefinitionBody ) )
            // InternalRMParser.g:2975:4: (lv_property_3_0= ruleEPropertyDefinitionBody )
            {
            // InternalRMParser.g:2975:4: (lv_property_3_0= ruleEPropertyDefinitionBody )
            // InternalRMParser.g:2976:5: lv_property_3_0= ruleEPropertyDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEPropertyDefinitionAccess().getPropertyEPropertyDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_property_3_0=ruleEPropertyDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEPropertyDefinitionRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_3_0,
            						"org.sodalite.dsl.RM.EPropertyDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEPropertyDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:3001:1: entryRuleEPropertyDefinitionBody returns [EObject current=null] : iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF ;
    public final EObject entryRuleEPropertyDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyDefinitionBody = null;


        try {
            // InternalRMParser.g:3001:64: (iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF )
            // InternalRMParser.g:3002:2: iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF
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
    // InternalRMParser.g:3008:1: ruleEPropertyDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) ;
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
        Token this_BEGIN_12=null;
        Token this_END_14=null;
        Token otherlv_15=null;
        EObject lv_type_2_0 = null;

        EObject lv_default_8_0 = null;

        EObject lv_constraints_13_0 = null;

        EObject lv_entry_schema_16_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3014:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:3015:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:3015:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:3016:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:3016:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:3017:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:3020:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:3021:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:3021:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=8;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt24=2;
                }
                else if ( LA24_0 == Required && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt24=3;
                }
                else if ( LA24_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt24=4;
                }
                else if ( LA24_0 == Status && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
                    alt24=5;
                }
                else if ( LA24_0 == Constraints && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
                    alt24=6;
                }
                else if ( LA24_0 == Entry_schema && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6) ) {
                    alt24=7;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRMParser.g:3022:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3022:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:3023:4: {...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:3023:117: ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:3024:5: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:3027:8: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:3027:9: {...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3027:18: (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:3027:19: otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPropertyDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:3031:8: ( (lv_type_2_0= ruleEDataTypeName ) )
            	    // InternalRMParser.g:3032:9: (lv_type_2_0= ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:3032:9: (lv_type_2_0= ruleEDataTypeName )
            	    // InternalRMParser.g:3033:10: lv_type_2_0= ruleEDataTypeName
            	    {

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getTypeEDataTypeNameParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_37);
            	    lv_type_2_0=ruleEDataTypeName();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"type",
            	    											lv_type_2_0,
            	    											"org.sodalite.dsl.RM.EDataTypeName");
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
            	    // InternalRMParser.g:3056:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3056:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3057:4: {...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:3057:117: ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3058:5: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:3061:8: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3061:9: {...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3061:18: (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3061:19: otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Description,FOLLOW_13); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPropertyDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRMParser.g:3065:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRMParser.g:3066:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:3066:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRMParser.g:3067:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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
            	    // InternalRMParser.g:3089:3: ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3089:3: ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalRMParser.g:3090:4: {...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:3090:117: ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalRMParser.g:3091:5: ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:3094:8: ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) )
            	    // InternalRMParser.g:3094:9: {...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3094:18: (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) )
            	    // InternalRMParser.g:3094:19: otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_5=(Token)match(input,Required,FOLLOW_38); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEPropertyDefinitionBodyAccess().getRequiredKeyword_2_0());
            	    							
            	    // InternalRMParser.g:3098:8: ( (lv_required_6_0= RULE_BOOLEAN ) )
            	    // InternalRMParser.g:3099:9: (lv_required_6_0= RULE_BOOLEAN )
            	    {
            	    // InternalRMParser.g:3099:9: (lv_required_6_0= RULE_BOOLEAN )
            	    // InternalRMParser.g:3100:10: lv_required_6_0= RULE_BOOLEAN
            	    {
            	    lv_required_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_37); 

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
            	    // InternalRMParser.g:3122:3: ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3122:3: ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:3123:4: {...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:3123:117: ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:3124:5: ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:3127:8: ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:3127:9: {...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3127:18: (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:3127:19: otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,Default,FOLLOW_39); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEPropertyDefinitionBodyAccess().getDefaultKeyword_3_0());
            	    							
            	    // InternalRMParser.g:3131:8: ( (lv_default_8_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:3132:9: (lv_default_8_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:3132:9: (lv_default_8_0= ruleEValueExpression )
            	    // InternalRMParser.g:3133:10: lv_default_8_0= ruleEValueExpression
            	    {

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getDefaultEValueExpressionParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_37);
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
            	    // InternalRMParser.g:3156:3: ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3156:3: ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3157:4: {...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRMParser.g:3157:117: ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3158:5: ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRMParser.g:3161:8: ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3161:9: {...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3161:18: (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3161:19: otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,Status,FOLLOW_13); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPropertyDefinitionBodyAccess().getStatusKeyword_4_0());
            	    							
            	    // InternalRMParser.g:3165:8: ( (lv_status_10_0= RULE_STRING ) )
            	    // InternalRMParser.g:3166:9: (lv_status_10_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:3166:9: (lv_status_10_0= RULE_STRING )
            	    // InternalRMParser.g:3167:10: lv_status_10_0= RULE_STRING
            	    {
            	    lv_status_10_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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
            	    // InternalRMParser.g:3189:3: ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3189:3: ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) )
            	    // InternalRMParser.g:3190:4: {...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRMParser.g:3190:117: ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) )
            	    // InternalRMParser.g:3191:5: ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRMParser.g:3194:8: ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) )
            	    // InternalRMParser.g:3194:9: {...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3194:18: (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END )
            	    // InternalRMParser.g:3194:19: otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END
            	    {
            	    otherlv_11=(Token)match(input,Constraints,FOLLOW_5); 

            	    								newLeafNode(otherlv_11, grammarAccess.getEPropertyDefinitionBodyAccess().getConstraintsKeyword_5_0());
            	    							
            	    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    								newLeafNode(this_BEGIN_12, grammarAccess.getEPropertyDefinitionBodyAccess().getBEGINTerminalRuleCall_5_1());
            	    							
            	    // InternalRMParser.g:3202:8: ( (lv_constraints_13_0= ruleEConstraints ) )
            	    // InternalRMParser.g:3203:9: (lv_constraints_13_0= ruleEConstraints )
            	    {
            	    // InternalRMParser.g:3203:9: (lv_constraints_13_0= ruleEConstraints )
            	    // InternalRMParser.g:3204:10: lv_constraints_13_0= ruleEConstraints
            	    {

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getConstraintsEConstraintsParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
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

            	    this_END_14=(Token)match(input,RULE_END,FOLLOW_37); 

            	    								newLeafNode(this_END_14, grammarAccess.getEPropertyDefinitionBodyAccess().getENDTerminalRuleCall_5_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRMParser.g:3231:3: ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3231:3: ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:3232:4: {...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalRMParser.g:3232:117: ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:3233:5: ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalRMParser.g:3236:8: ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:3236:9: {...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3236:18: (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:3236:19: otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) )
            	    {
            	    otherlv_15=(Token)match(input,Entry_schema,FOLLOW_6); 

            	    								newLeafNode(otherlv_15, grammarAccess.getEPropertyDefinitionBodyAccess().getEntry_schemaKeyword_6_0());
            	    							
            	    // InternalRMParser.g:3240:8: ( (lv_entry_schema_16_0= ruleEDataTypeName ) )
            	    // InternalRMParser.g:3241:9: (lv_entry_schema_16_0= ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:3241:9: (lv_entry_schema_16_0= ruleEDataTypeName )
            	    // InternalRMParser.g:3242:10: lv_entry_schema_16_0= ruleEDataTypeName
            	    {

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getEntry_schemaEDataTypeNameParserRuleCall_6_1_0());
            	    									
            	    pushFollow(FOLLOW_37);
            	    lv_entry_schema_16_0=ruleEDataTypeName();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"entry_schema",
            	    											lv_entry_schema_16_0,
            	    											"org.sodalite.dsl.RM.EDataTypeName");
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // InternalRMParser.g:3276:1: entryRuleEAttributes returns [EObject current=null] : iv_ruleEAttributes= ruleEAttributes EOF ;
    public final EObject entryRuleEAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributes = null;


        try {
            // InternalRMParser.g:3276:52: (iv_ruleEAttributes= ruleEAttributes EOF )
            // InternalRMParser.g:3277:2: iv_ruleEAttributes= ruleEAttributes EOF
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
    // InternalRMParser.g:3283:1: ruleEAttributes returns [EObject current=null] : ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* ) ;
    public final EObject ruleEAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3289:2: ( ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* ) )
            // InternalRMParser.g:3290:2: ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* )
            {
            // InternalRMParser.g:3290:2: ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* )
            // InternalRMParser.g:3291:3: () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )*
            {
            // InternalRMParser.g:3291:3: ()
            // InternalRMParser.g:3292:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributesAccess().getEAttributesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3298:3: ( (lv_attributes_1_0= ruleEAttributeDefinition ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRMParser.g:3299:4: (lv_attributes_1_0= ruleEAttributeDefinition )
            	    {
            	    // InternalRMParser.g:3299:4: (lv_attributes_1_0= ruleEAttributeDefinition )
            	    // InternalRMParser.g:3300:5: lv_attributes_1_0= ruleEAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEAttributesAccess().getAttributesEAttributeDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
    // $ANTLR end "ruleEAttributes"


    // $ANTLR start "entryRuleEAttributeDefinition"
    // InternalRMParser.g:3321:1: entryRuleEAttributeDefinition returns [EObject current=null] : iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF ;
    public final EObject entryRuleEAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeDefinition = null;


        try {
            // InternalRMParser.g:3321:61: (iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF )
            // InternalRMParser.g:3322:2: iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF
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
    // InternalRMParser.g:3328:1: ruleEAttributeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_attribute_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3334:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:3335:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:3335:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:3336:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:3336:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:3337:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:3337:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:3338:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEAttributeDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_40); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEAttributeDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:3362:3: ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) )
            // InternalRMParser.g:3363:4: (lv_attribute_3_0= ruleEAttributeDefinitionBody )
            {
            // InternalRMParser.g:3363:4: (lv_attribute_3_0= ruleEAttributeDefinitionBody )
            // InternalRMParser.g:3364:5: lv_attribute_3_0= ruleEAttributeDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEAttributeDefinitionAccess().getAttributeEAttributeDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_attribute_3_0=ruleEAttributeDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAttributeDefinitionRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_3_0,
            						"org.sodalite.dsl.RM.EAttributeDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEAttributeDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:3389:1: entryRuleEAttributeDefinitionBody returns [EObject current=null] : iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF ;
    public final EObject entryRuleEAttributeDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeDefinitionBody = null;


        try {
            // InternalRMParser.g:3389:65: (iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF )
            // InternalRMParser.g:3390:2: iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF
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
    // InternalRMParser.g:3396:1: ruleEAttributeDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAttributeDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_status_8_0=null;
        Token otherlv_9=null;
        EObject lv_type_2_0 = null;

        EObject lv_default_6_0 = null;

        EObject lv_entry_schema_10_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3402:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:3403:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:3403:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:3404:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:3404:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:3405:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:3408:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:3409:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:3409:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=6;
                int LA26_0 = input.LA(1);

                if ( LA26_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt26=1;
                }
                else if ( LA26_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt26=2;
                }
                else if ( LA26_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt26=3;
                }
                else if ( LA26_0 == Status && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt26=4;
                }
                else if ( LA26_0 == Entry_schema && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
                    alt26=5;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRMParser.g:3410:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3410:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:3411:4: {...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:3411:118: ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:3412:5: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:3415:8: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:3415:9: {...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3415:18: (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:3415:19: otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAttributeDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:3419:8: ( (lv_type_2_0= ruleEDataTypeName ) )
            	    // InternalRMParser.g:3420:9: (lv_type_2_0= ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:3420:9: (lv_type_2_0= ruleEDataTypeName )
            	    // InternalRMParser.g:3421:10: lv_type_2_0= ruleEDataTypeName
            	    {

            	    										newCompositeNode(grammarAccess.getEAttributeDefinitionBodyAccess().getTypeEDataTypeNameParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_41);
            	    lv_type_2_0=ruleEDataTypeName();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEAttributeDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"type",
            	    											lv_type_2_0,
            	    											"org.sodalite.dsl.RM.EDataTypeName");
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
            	    // InternalRMParser.g:3444:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3444:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3445:4: {...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:3445:118: ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3446:5: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:3449:8: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3449:9: {...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3449:18: (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3449:19: otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Description,FOLLOW_13); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAttributeDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRMParser.g:3453:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRMParser.g:3454:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:3454:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRMParser.g:3455:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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
            	    // InternalRMParser.g:3477:3: ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3477:3: ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:3478:4: {...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:3478:118: ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:3479:5: ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:3482:8: ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:3482:9: {...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3482:18: (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:3482:19: otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,Default,FOLLOW_39); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEAttributeDefinitionBodyAccess().getDefaultKeyword_2_0());
            	    							
            	    // InternalRMParser.g:3486:8: ( (lv_default_6_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:3487:9: (lv_default_6_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:3487:9: (lv_default_6_0= ruleEValueExpression )
            	    // InternalRMParser.g:3488:10: lv_default_6_0= ruleEValueExpression
            	    {

            	    										newCompositeNode(grammarAccess.getEAttributeDefinitionBodyAccess().getDefaultEValueExpressionParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_41);
            	    lv_default_6_0=ruleEValueExpression();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEAttributeDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"default",
            	    											lv_default_6_0,
            	    											"org.sodalite.dsl.RM.EValueExpression");
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
            	case 4 :
            	    // InternalRMParser.g:3511:3: ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3511:3: ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3512:4: {...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:3512:118: ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3513:5: ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:3516:8: ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3516:9: {...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3516:18: (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3516:19: otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,Status,FOLLOW_13); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEAttributeDefinitionBodyAccess().getStatusKeyword_3_0());
            	    							
            	    // InternalRMParser.g:3520:8: ( (lv_status_8_0= RULE_STRING ) )
            	    // InternalRMParser.g:3521:9: (lv_status_8_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:3521:9: (lv_status_8_0= RULE_STRING )
            	    // InternalRMParser.g:3522:10: lv_status_8_0= RULE_STRING
            	    {
            	    lv_status_8_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            	    										newLeafNode(lv_status_8_0, grammarAccess.getEAttributeDefinitionBodyAccess().getStatusSTRINGTerminalRuleCall_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAttributeDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"status",
            	    											lv_status_8_0,
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
            	case 5 :
            	    // InternalRMParser.g:3544:3: ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3544:3: ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:3545:4: {...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRMParser.g:3545:118: ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:3546:5: ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRMParser.g:3549:8: ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:3549:9: {...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3549:18: (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:3549:19: otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) )
            	    {
            	    otherlv_9=(Token)match(input,Entry_schema,FOLLOW_6); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEAttributeDefinitionBodyAccess().getEntry_schemaKeyword_4_0());
            	    							
            	    // InternalRMParser.g:3553:8: ( (lv_entry_schema_10_0= ruleEDataTypeName ) )
            	    // InternalRMParser.g:3554:9: (lv_entry_schema_10_0= ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:3554:9: (lv_entry_schema_10_0= ruleEDataTypeName )
            	    // InternalRMParser.g:3555:10: lv_entry_schema_10_0= ruleEDataTypeName
            	    {

            	    										newCompositeNode(grammarAccess.getEAttributeDefinitionBodyAccess().getEntry_schemaEDataTypeNameParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_41);
            	    lv_entry_schema_10_0=ruleEDataTypeName();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEAttributeDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"entry_schema",
            	    											lv_entry_schema_10_0,
            	    											"org.sodalite.dsl.RM.EDataTypeName");
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
    // InternalRMParser.g:3589:1: entryRuleEInterfaces returns [EObject current=null] : iv_ruleEInterfaces= ruleEInterfaces EOF ;
    public final EObject entryRuleEInterfaces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaces = null;


        try {
            // InternalRMParser.g:3589:52: (iv_ruleEInterfaces= ruleEInterfaces EOF )
            // InternalRMParser.g:3590:2: iv_ruleEInterfaces= ruleEInterfaces EOF
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
    // InternalRMParser.g:3596:1: ruleEInterfaces returns [EObject current=null] : ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* ) ;
    public final EObject ruleEInterfaces() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaces_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3602:2: ( ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* ) )
            // InternalRMParser.g:3603:2: ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* )
            {
            // InternalRMParser.g:3603:2: ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* )
            // InternalRMParser.g:3604:3: () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )*
            {
            // InternalRMParser.g:3604:3: ()
            // InternalRMParser.g:3605:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfacesAccess().getEInterfacesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3611:3: ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRMParser.g:3612:4: (lv_interfaces_1_0= ruleEInterfaceDefinition )
            	    {
            	    // InternalRMParser.g:3612:4: (lv_interfaces_1_0= ruleEInterfaceDefinition )
            	    // InternalRMParser.g:3613:5: lv_interfaces_1_0= ruleEInterfaceDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEInterfacesAccess().getInterfacesEInterfaceDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
    // $ANTLR end "ruleEInterfaces"


    // $ANTLR start "entryRuleEInterfaceDefinition"
    // InternalRMParser.g:3634:1: entryRuleEInterfaceDefinition returns [EObject current=null] : iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF ;
    public final EObject entryRuleEInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceDefinition = null;


        try {
            // InternalRMParser.g:3634:61: (iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF )
            // InternalRMParser.g:3635:2: iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF
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
    // InternalRMParser.g:3641:1: ruleEInterfaceDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_interface_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3647:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:3648:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:3648:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:3649:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:3649:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:3650:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:3650:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:3651:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEInterfaceDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_42); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEInterfaceDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:3675:3: ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) )
            // InternalRMParser.g:3676:4: (lv_interface_3_0= ruleEInterfaceDefinitionBody )
            {
            // InternalRMParser.g:3676:4: (lv_interface_3_0= ruleEInterfaceDefinitionBody )
            // InternalRMParser.g:3677:5: lv_interface_3_0= ruleEInterfaceDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEInterfaceDefinitionAccess().getInterfaceEInterfaceDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_interface_3_0=ruleEInterfaceDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEInterfaceDefinitionRule());
            					}
            					set(
            						current,
            						"interface",
            						lv_interface_3_0,
            						"org.sodalite.dsl.RM.EInterfaceDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEInterfaceDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:3702:1: entryRuleEInterfaceDefinitionBody returns [EObject current=null] : iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF ;
    public final EObject entryRuleEInterfaceDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceDefinitionBody = null;


        try {
            // InternalRMParser.g:3702:65: (iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF )
            // InternalRMParser.g:3703:2: iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF
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
    // InternalRMParser.g:3709:1: ruleEInterfaceDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEInterfaceDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_10=null;
        EObject lv_type_2_0 = null;

        EObject lv_inputs_5_0 = null;

        EObject lv_operations_9_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3715:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:3716:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:3716:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:3717:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:3717:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:3718:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:3721:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?)
            // InternalRMParser.g:3722:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:3722:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=4;
                int LA28_0 = input.LA(1);

                if ( LA28_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt28=1;
                }
                else if ( LA28_0 == Inputs && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt28=2;
                }
                else if ( LA28_0 == Operations && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt28=3;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRMParser.g:3723:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3723:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:3724:4: {...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:3724:118: ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:3725:5: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:3728:8: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:3728:9: {...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3728:18: (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:3728:19: otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEInterfaceDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:3732:8: ( (lv_type_2_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:3733:9: (lv_type_2_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:3733:9: (lv_type_2_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:3734:10: lv_type_2_0= ruleEPREFIX_TYPE
            	    {

            	    										newCompositeNode(grammarAccess.getEInterfaceDefinitionBodyAccess().getTypeEPREFIX_TYPEParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_43);
            	    lv_type_2_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEInterfaceDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"type",
            	    											lv_type_2_0,
            	    											"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalRMParser.g:3757:3: ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3757:3: ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) )
            	    // InternalRMParser.g:3758:4: {...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:3758:118: ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) )
            	    // InternalRMParser.g:3759:5: ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:3762:8: ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) )
            	    // InternalRMParser.g:3762:9: {...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3762:18: (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END )
            	    // InternalRMParser.g:3762:19: otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END
            	    {
            	    otherlv_3=(Token)match(input,Inputs,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEInterfaceDefinitionBodyAccess().getInputsKeyword_1_0());
            	    							
            	    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    								newLeafNode(this_BEGIN_4, grammarAccess.getEInterfaceDefinitionBodyAccess().getBEGINTerminalRuleCall_1_1());
            	    							
            	    // InternalRMParser.g:3770:8: ( (lv_inputs_5_0= ruleEProperties ) )
            	    // InternalRMParser.g:3771:9: (lv_inputs_5_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:3771:9: (lv_inputs_5_0= ruleEProperties )
            	    // InternalRMParser.g:3772:10: lv_inputs_5_0= ruleEProperties
            	    {

            	    										newCompositeNode(grammarAccess.getEInterfaceDefinitionBodyAccess().getInputsEPropertiesParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
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

            	    this_END_6=(Token)match(input,RULE_END,FOLLOW_43); 

            	    								newLeafNode(this_END_6, grammarAccess.getEInterfaceDefinitionBodyAccess().getENDTerminalRuleCall_1_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:3799:3: ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3799:3: ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) )
            	    // InternalRMParser.g:3800:4: {...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:3800:118: ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) )
            	    // InternalRMParser.g:3801:5: ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:3804:8: ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) )
            	    // InternalRMParser.g:3804:9: {...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3804:18: (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END )
            	    // InternalRMParser.g:3804:19: otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END
            	    {
            	    otherlv_7=(Token)match(input,Operations,FOLLOW_5); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEInterfaceDefinitionBodyAccess().getOperationsKeyword_2_0());
            	    							
            	    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    								newLeafNode(this_BEGIN_8, grammarAccess.getEInterfaceDefinitionBodyAccess().getBEGINTerminalRuleCall_2_1());
            	    							
            	    // InternalRMParser.g:3812:8: ( (lv_operations_9_0= ruleEOperations ) )
            	    // InternalRMParser.g:3813:9: (lv_operations_9_0= ruleEOperations )
            	    {
            	    // InternalRMParser.g:3813:9: (lv_operations_9_0= ruleEOperations )
            	    // InternalRMParser.g:3814:10: lv_operations_9_0= ruleEOperations
            	    {

            	    										newCompositeNode(grammarAccess.getEInterfaceDefinitionBodyAccess().getOperationsEOperationsParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
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

            	    this_END_10=(Token)match(input,RULE_END,FOLLOW_43); 

            	    								newLeafNode(this_END_10, grammarAccess.getEInterfaceDefinitionBodyAccess().getENDTerminalRuleCall_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // InternalRMParser.g:3852:1: entryRuleEOperations returns [EObject current=null] : iv_ruleEOperations= ruleEOperations EOF ;
    public final EObject entryRuleEOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperations = null;


        try {
            // InternalRMParser.g:3852:52: (iv_ruleEOperations= ruleEOperations EOF )
            // InternalRMParser.g:3853:2: iv_ruleEOperations= ruleEOperations EOF
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
    // InternalRMParser.g:3859:1: ruleEOperations returns [EObject current=null] : ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* ) ;
    public final EObject ruleEOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3865:2: ( ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* ) )
            // InternalRMParser.g:3866:2: ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* )
            {
            // InternalRMParser.g:3866:2: ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* )
            // InternalRMParser.g:3867:3: () ( (lv_operations_1_0= ruleEOperationDefinition ) )*
            {
            // InternalRMParser.g:3867:3: ()
            // InternalRMParser.g:3868:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationsAccess().getEOperationsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3874:3: ( (lv_operations_1_0= ruleEOperationDefinition ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRMParser.g:3875:4: (lv_operations_1_0= ruleEOperationDefinition )
            	    {
            	    // InternalRMParser.g:3875:4: (lv_operations_1_0= ruleEOperationDefinition )
            	    // InternalRMParser.g:3876:5: lv_operations_1_0= ruleEOperationDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEOperationsAccess().getOperationsEOperationDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    break loop29;
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
    // InternalRMParser.g:3897:1: entryRuleEOperationDefinition returns [EObject current=null] : iv_ruleEOperationDefinition= ruleEOperationDefinition EOF ;
    public final EObject entryRuleEOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperationDefinition = null;


        try {
            // InternalRMParser.g:3897:61: (iv_ruleEOperationDefinition= ruleEOperationDefinition EOF )
            // InternalRMParser.g:3898:2: iv_ruleEOperationDefinition= ruleEOperationDefinition EOF
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
    // InternalRMParser.g:3904:1: ruleEOperationDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3910:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:3911:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:3911:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:3912:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:3912:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:3913:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:3913:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:3914:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEOperationDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_44); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEOperationDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:3938:3: ( (lv_operation_3_0= ruleEOperationDefinitionBody ) )
            // InternalRMParser.g:3939:4: (lv_operation_3_0= ruleEOperationDefinitionBody )
            {
            // InternalRMParser.g:3939:4: (lv_operation_3_0= ruleEOperationDefinitionBody )
            // InternalRMParser.g:3940:5: lv_operation_3_0= ruleEOperationDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEOperationDefinitionAccess().getOperationEOperationDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_operation_3_0=ruleEOperationDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOperationDefinitionRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_3_0,
            						"org.sodalite.dsl.RM.EOperationDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEOperationDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:3965:1: entryRuleEOperationDefinitionBody returns [EObject current=null] : iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF ;
    public final EObject entryRuleEOperationDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperationDefinitionBody = null;


        try {
            // InternalRMParser.g:3965:65: (iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF )
            // InternalRMParser.g:3966:2: iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF
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
    // InternalRMParser.g:3972:1: ruleEOperationDefinitionBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEOperationDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        Token otherlv_8=null;
        Token this_BEGIN_9=null;
        Token this_END_11=null;
        EObject lv_inputs_6_0 = null;

        EObject lv_implementation_10_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3978:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:3979:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:3979:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:3980:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:3980:3: ()
            // InternalRMParser.g:3981:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationDefinitionBodyAccess().getEOperationDefinitionBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3987:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:3988:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:3988:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:3989:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:3992:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:3993:6: ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:3993:6: ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )*
            loop30:
            do {
                int alt30=4;
                int LA30_0 = input.LA(1);

                if ( LA30_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 == Inputs && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt30=2;
                }
                else if ( LA30_0 == Implementation && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt30=3;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRMParser.g:3994:4: ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3994:4: ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3995:5: {...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:3995:121: ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3996:6: ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:3999:9: ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3999:10: {...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3999:19: (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3999:20: otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEOperationDefinitionBodyAccess().getDescriptionKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:4003:9: ( (lv_description_3_0= RULE_STRING ) )
            	    // InternalRMParser.g:4004:10: (lv_description_3_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:4004:10: (lv_description_3_0= RULE_STRING )
            	    // InternalRMParser.g:4005:11: lv_description_3_0= RULE_STRING
            	    {
            	    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

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
            	    // InternalRMParser.g:4027:4: ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:4027:4: ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) )
            	    // InternalRMParser.g:4028:5: {...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:4028:121: ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) )
            	    // InternalRMParser.g:4029:6: ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:4032:9: ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) )
            	    // InternalRMParser.g:4032:10: {...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4032:19: (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END )
            	    // InternalRMParser.g:4032:20: otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END
            	    {
            	    otherlv_4=(Token)match(input,Inputs,FOLLOW_5); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEOperationDefinitionBodyAccess().getInputsKeyword_1_1_0());
            	    								
            	    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_5, grammarAccess.getEOperationDefinitionBodyAccess().getBEGINTerminalRuleCall_1_1_1());
            	    								
            	    // InternalRMParser.g:4040:9: ( (lv_inputs_6_0= ruleEInputs ) )
            	    // InternalRMParser.g:4041:10: (lv_inputs_6_0= ruleEInputs )
            	    {
            	    // InternalRMParser.g:4041:10: (lv_inputs_6_0= ruleEInputs )
            	    // InternalRMParser.g:4042:11: lv_inputs_6_0= ruleEInputs
            	    {

            	    											newCompositeNode(grammarAccess.getEOperationDefinitionBodyAccess().getInputsEInputsParserRuleCall_1_1_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
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

            	    this_END_7=(Token)match(input,RULE_END,FOLLOW_45); 

            	    									newLeafNode(this_END_7, grammarAccess.getEOperationDefinitionBodyAccess().getENDTerminalRuleCall_1_1_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:4069:4: ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:4069:4: ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) )
            	    // InternalRMParser.g:4070:5: {...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:4070:121: ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) )
            	    // InternalRMParser.g:4071:6: ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:4074:9: ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) )
            	    // InternalRMParser.g:4074:10: {...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4074:19: (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END )
            	    // InternalRMParser.g:4074:20: otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END
            	    {
            	    otherlv_8=(Token)match(input,Implementation,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getEOperationDefinitionBodyAccess().getImplementationKeyword_1_2_0());
            	    								
            	    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_46); 

            	    									newLeafNode(this_BEGIN_9, grammarAccess.getEOperationDefinitionBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:4082:9: ( (lv_implementation_10_0= ruleEImplementation ) )
            	    // InternalRMParser.g:4083:10: (lv_implementation_10_0= ruleEImplementation )
            	    {
            	    // InternalRMParser.g:4083:10: (lv_implementation_10_0= ruleEImplementation )
            	    // InternalRMParser.g:4084:11: lv_implementation_10_0= ruleEImplementation
            	    {

            	    											newCompositeNode(grammarAccess.getEOperationDefinitionBodyAccess().getImplementationEImplementationParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_implementation_10_0=ruleEImplementation();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEOperationDefinitionBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"implementation",
            	    												lv_implementation_10_0,
            	    												"org.sodalite.dsl.RM.EImplementation");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_11=(Token)match(input,RULE_END,FOLLOW_45); 

            	    									newLeafNode(this_END_11, grammarAccess.getEOperationDefinitionBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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


    // $ANTLR start "entryRuleEImplementation"
    // InternalRMParser.g:4122:1: entryRuleEImplementation returns [EObject current=null] : iv_ruleEImplementation= ruleEImplementation EOF ;
    public final EObject entryRuleEImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEImplementation = null;


        try {
            // InternalRMParser.g:4122:56: (iv_ruleEImplementation= ruleEImplementation EOF )
            // InternalRMParser.g:4123:2: iv_ruleEImplementation= ruleEImplementation EOF
            {
             newCompositeNode(grammarAccess.getEImplementationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEImplementation=ruleEImplementation();

            state._fsp--;

             current =iv_ruleEImplementation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEImplementation"


    // $ANTLR start "ruleEImplementation"
    // InternalRMParser.g:4129:1: ruleEImplementation returns [EObject current=null] : ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? ) ;
    public final EObject ruleEImplementation() throws RecognitionException {
        EObject current = null;

        EObject lv_primary_0_0 = null;

        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4135:2: ( ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? ) )
            // InternalRMParser.g:4136:2: ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? )
            {
            // InternalRMParser.g:4136:2: ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? )
            // InternalRMParser.g:4137:3: ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )?
            {
            // InternalRMParser.g:4137:3: ( (lv_primary_0_0= ruleEPrimary ) )
            // InternalRMParser.g:4138:4: (lv_primary_0_0= ruleEPrimary )
            {
            // InternalRMParser.g:4138:4: (lv_primary_0_0= ruleEPrimary )
            // InternalRMParser.g:4139:5: lv_primary_0_0= ruleEPrimary
            {

            					newCompositeNode(grammarAccess.getEImplementationAccess().getPrimaryEPrimaryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_47);
            lv_primary_0_0=ruleEPrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEImplementationRule());
            					}
            					set(
            						current,
            						"primary",
            						lv_primary_0_0,
            						"org.sodalite.dsl.RM.EPrimary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRMParser.g:4156:3: ( (lv_dependencies_1_0= ruleEDependencies ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Dependencies) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRMParser.g:4157:4: (lv_dependencies_1_0= ruleEDependencies )
                    {
                    // InternalRMParser.g:4157:4: (lv_dependencies_1_0= ruleEDependencies )
                    // InternalRMParser.g:4158:5: lv_dependencies_1_0= ruleEDependencies
                    {

                    					newCompositeNode(grammarAccess.getEImplementationAccess().getDependenciesEDependenciesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dependencies_1_0=ruleEDependencies();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEImplementationRule());
                    					}
                    					set(
                    						current,
                    						"dependencies",
                    						lv_dependencies_1_0,
                    						"org.sodalite.dsl.RM.EDependencies");
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
    // $ANTLR end "ruleEImplementation"


    // $ANTLR start "entryRuleEPrimary"
    // InternalRMParser.g:4179:1: entryRuleEPrimary returns [EObject current=null] : iv_ruleEPrimary= ruleEPrimary EOF ;
    public final EObject entryRuleEPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPrimary = null;


        try {
            // InternalRMParser.g:4179:49: (iv_ruleEPrimary= ruleEPrimary EOF )
            // InternalRMParser.g:4180:2: iv_ruleEPrimary= ruleEPrimary EOF
            {
             newCompositeNode(grammarAccess.getEPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPrimary=ruleEPrimary();

            state._fsp--;

             current =iv_ruleEPrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPrimary"


    // $ANTLR start "ruleEPrimary"
    // InternalRMParser.g:4186:1: ruleEPrimary returns [EObject current=null] : ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? ) ;
    public final EObject ruleEPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_file_1_0=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token lv_relative_path_4_0=null;
        Token this_END_5=null;


        	enterRule();

        try {
            // InternalRMParser.g:4192:2: ( ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? ) )
            // InternalRMParser.g:4193:2: ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? )
            {
            // InternalRMParser.g:4193:2: ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? )
            // InternalRMParser.g:4194:3: (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )?
            {
            // InternalRMParser.g:4194:3: (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) )
            // InternalRMParser.g:4195:4: otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Primary,FOLLOW_13); 

            				newLeafNode(otherlv_0, grammarAccess.getEPrimaryAccess().getPrimaryKeyword_0_0());
            			
            // InternalRMParser.g:4199:4: ( (lv_file_1_0= RULE_STRING ) )
            // InternalRMParser.g:4200:5: (lv_file_1_0= RULE_STRING )
            {
            // InternalRMParser.g:4200:5: (lv_file_1_0= RULE_STRING )
            // InternalRMParser.g:4201:6: lv_file_1_0= RULE_STRING
            {
            lv_file_1_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            						newLeafNode(lv_file_1_0, grammarAccess.getEPrimaryAccess().getFileSTRINGTerminalRuleCall_0_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEPrimaryRule());
            						}
            						setWithLastConsumed(
            							current,
            							"file",
            							lv_file_1_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalRMParser.g:4218:3: (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_BEGIN) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRMParser.g:4219:4: this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_49); 

                    				newLeafNode(this_BEGIN_2, grammarAccess.getEPrimaryAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    otherlv_3=(Token)match(input,Relative_path,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPrimaryAccess().getRelative_pathKeyword_1_1());
                    			
                    // InternalRMParser.g:4227:4: ( (lv_relative_path_4_0= RULE_STRING ) )
                    // InternalRMParser.g:4228:5: (lv_relative_path_4_0= RULE_STRING )
                    {
                    // InternalRMParser.g:4228:5: (lv_relative_path_4_0= RULE_STRING )
                    // InternalRMParser.g:4229:6: lv_relative_path_4_0= RULE_STRING
                    {
                    lv_relative_path_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_relative_path_4_0, grammarAccess.getEPrimaryAccess().getRelative_pathSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"relative_path",
                    							lv_relative_path_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_5, grammarAccess.getEPrimaryAccess().getENDTerminalRuleCall_1_3());
                    			

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
    // $ANTLR end "ruleEPrimary"


    // $ANTLR start "entryRuleEDependencies"
    // InternalRMParser.g:4254:1: entryRuleEDependencies returns [EObject current=null] : iv_ruleEDependencies= ruleEDependencies EOF ;
    public final EObject entryRuleEDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDependencies = null;


        try {
            // InternalRMParser.g:4254:54: (iv_ruleEDependencies= ruleEDependencies EOF )
            // InternalRMParser.g:4255:2: iv_ruleEDependencies= ruleEDependencies EOF
            {
             newCompositeNode(grammarAccess.getEDependenciesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDependencies=ruleEDependencies();

            state._fsp--;

             current =iv_ruleEDependencies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDependencies"


    // $ANTLR start "ruleEDependencies"
    // InternalRMParser.g:4261:1: ruleEDependencies returns [EObject current=null] : (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? ) ;
    public final EObject ruleEDependencies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token otherlv_5=null;
        Token lv_relative_path_6_0=null;
        Token this_END_7=null;
        EObject lv_files_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4267:2: ( (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? ) )
            // InternalRMParser.g:4268:2: (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? )
            {
            // InternalRMParser.g:4268:2: (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? )
            // InternalRMParser.g:4269:3: otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )?
            {
            otherlv_0=(Token)match(input,Dependencies,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getEDependenciesAccess().getDependenciesKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getEDependenciesAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRMParser.g:4277:3: ( (lv_files_2_0= ruleEDependencyFiles ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRMParser.g:4278:4: (lv_files_2_0= ruleEDependencyFiles )
                    {
                    // InternalRMParser.g:4278:4: (lv_files_2_0= ruleEDependencyFiles )
                    // InternalRMParser.g:4279:5: lv_files_2_0= ruleEDependencyFiles
                    {

                    					newCompositeNode(grammarAccess.getEDependenciesAccess().getFilesEDependencyFilesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_files_2_0=ruleEDependencyFiles();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEDependenciesRule());
                    					}
                    					set(
                    						current,
                    						"files",
                    						lv_files_2_0,
                    						"org.sodalite.dsl.RM.EDependencyFiles");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,RightSquareBracket,FOLLOW_48); 

            			newLeafNode(otherlv_3, grammarAccess.getEDependenciesAccess().getRightSquareBracketKeyword_3());
            		
            // InternalRMParser.g:4300:3: (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_BEGIN) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRMParser.g:4301:4: this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END
                    {
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_49); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getEDependenciesAccess().getBEGINTerminalRuleCall_4_0());
                    			
                    otherlv_5=(Token)match(input,Relative_path,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getEDependenciesAccess().getRelative_pathKeyword_4_1());
                    			
                    // InternalRMParser.g:4309:4: ( (lv_relative_path_6_0= RULE_STRING ) )
                    // InternalRMParser.g:4310:5: (lv_relative_path_6_0= RULE_STRING )
                    {
                    // InternalRMParser.g:4310:5: (lv_relative_path_6_0= RULE_STRING )
                    // InternalRMParser.g:4311:6: lv_relative_path_6_0= RULE_STRING
                    {
                    lv_relative_path_6_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_relative_path_6_0, grammarAccess.getEDependenciesAccess().getRelative_pathSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEDependenciesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"relative_path",
                    							lv_relative_path_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_7, grammarAccess.getEDependenciesAccess().getENDTerminalRuleCall_4_3());
                    			

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
    // $ANTLR end "ruleEDependencies"


    // $ANTLR start "entryRuleEDependencyFiles"
    // InternalRMParser.g:4336:1: entryRuleEDependencyFiles returns [EObject current=null] : iv_ruleEDependencyFiles= ruleEDependencyFiles EOF ;
    public final EObject entryRuleEDependencyFiles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDependencyFiles = null;


        try {
            // InternalRMParser.g:4336:57: (iv_ruleEDependencyFiles= ruleEDependencyFiles EOF )
            // InternalRMParser.g:4337:2: iv_ruleEDependencyFiles= ruleEDependencyFiles EOF
            {
             newCompositeNode(grammarAccess.getEDependencyFilesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDependencyFiles=ruleEDependencyFiles();

            state._fsp--;

             current =iv_ruleEDependencyFiles; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDependencyFiles"


    // $ANTLR start "ruleEDependencyFiles"
    // InternalRMParser.g:4343:1: ruleEDependencyFiles returns [EObject current=null] : ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleEDependencyFiles() throws RecognitionException {
        EObject current = null;

        Token lv_files_0_0=null;
        Token otherlv_1=null;
        Token lv_files_2_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:4349:2: ( ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* ) )
            // InternalRMParser.g:4350:2: ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* )
            {
            // InternalRMParser.g:4350:2: ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* )
            // InternalRMParser.g:4351:3: ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )*
            {
            // InternalRMParser.g:4351:3: ( (lv_files_0_0= RULE_STRING ) )
            // InternalRMParser.g:4352:4: (lv_files_0_0= RULE_STRING )
            {
            // InternalRMParser.g:4352:4: (lv_files_0_0= RULE_STRING )
            // InternalRMParser.g:4353:5: lv_files_0_0= RULE_STRING
            {
            lv_files_0_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_files_0_0, grammarAccess.getEDependencyFilesAccess().getFilesSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDependencyFilesRule());
            					}
            					addWithLastConsumed(
            						current,
            						"files",
            						lv_files_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRMParser.g:4369:3: (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Comma) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRMParser.g:4370:4: otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEDependencyFilesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRMParser.g:4374:4: ( (lv_files_2_0= RULE_STRING ) )
            	    // InternalRMParser.g:4375:5: (lv_files_2_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:4375:5: (lv_files_2_0= RULE_STRING )
            	    // InternalRMParser.g:4376:6: lv_files_2_0= RULE_STRING
            	    {
            	    lv_files_2_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    						newLeafNode(lv_files_2_0, grammarAccess.getEDependencyFilesAccess().getFilesSTRINGTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEDependencyFilesRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"files",
            	    							lv_files_2_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

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
    // $ANTLR end "ruleEDependencyFiles"


    // $ANTLR start "entryRuleEInputs"
    // InternalRMParser.g:4397:1: entryRuleEInputs returns [EObject current=null] : iv_ruleEInputs= ruleEInputs EOF ;
    public final EObject entryRuleEInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInputs = null;


        try {
            // InternalRMParser.g:4397:48: (iv_ruleEInputs= ruleEInputs EOF )
            // InternalRMParser.g:4398:2: iv_ruleEInputs= ruleEInputs EOF
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
    // InternalRMParser.g:4404:1: ruleEInputs returns [EObject current=null] : ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* ) ;
    public final EObject ruleEInputs() throws RecognitionException {
        EObject current = null;

        EObject lv_inputs_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4410:2: ( ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* ) )
            // InternalRMParser.g:4411:2: ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* )
            {
            // InternalRMParser.g:4411:2: ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* )
            // InternalRMParser.g:4412:3: () ( (lv_inputs_1_0= ruleEParameterDefinition ) )*
            {
            // InternalRMParser.g:4412:3: ()
            // InternalRMParser.g:4413:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInputsAccess().getEInputsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:4419:3: ( (lv_inputs_1_0= ruleEParameterDefinition ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRMParser.g:4420:4: (lv_inputs_1_0= ruleEParameterDefinition )
            	    {
            	    // InternalRMParser.g:4420:4: (lv_inputs_1_0= ruleEParameterDefinition )
            	    // InternalRMParser.g:4421:5: lv_inputs_1_0= ruleEParameterDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEInputsAccess().getInputsEParameterDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
    // $ANTLR end "ruleEInputs"


    // $ANTLR start "entryRuleEParameterDefinition"
    // InternalRMParser.g:4442:1: entryRuleEParameterDefinition returns [EObject current=null] : iv_ruleEParameterDefinition= ruleEParameterDefinition EOF ;
    public final EObject entryRuleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinition = null;


        try {
            // InternalRMParser.g:4442:61: (iv_ruleEParameterDefinition= ruleEParameterDefinition EOF )
            // InternalRMParser.g:4443:2: iv_ruleEParameterDefinition= ruleEParameterDefinition EOF
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
    // InternalRMParser.g:4449:1: ruleEParameterDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4455:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:4456:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:4456:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:4457:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:4457:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:4458:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:4458:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:4459:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_51); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEParameterDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:4483:3: ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) )
            // InternalRMParser.g:4484:4: (lv_parameter_3_0= ruleEParameterDefinitionBody )
            {
            // InternalRMParser.g:4484:4: (lv_parameter_3_0= ruleEParameterDefinitionBody )
            // InternalRMParser.g:4485:5: lv_parameter_3_0= ruleEParameterDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEParameterDefinitionAccess().getParameterEParameterDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_parameter_3_0=ruleEParameterDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEParameterDefinitionRule());
            					}
            					set(
            						current,
            						"parameter",
            						lv_parameter_3_0,
            						"org.sodalite.dsl.RM.EParameterDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEParameterDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:4510:1: entryRuleEParameterDefinitionBody returns [EObject current=null] : iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF ;
    public final EObject entryRuleEParameterDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinitionBody = null;


        try {
            // InternalRMParser.g:4510:65: (iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF )
            // InternalRMParser.g:4511:2: iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF
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
    // InternalRMParser.g:4517:1: ruleEParameterDefinitionBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEParameterDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_default_7_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4523:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:4524:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:4524:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:4525:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:4525:3: ()
            // InternalRMParser.g:4526:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterDefinitionBodyAccess().getEParameterDefinitionBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:4532:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) )
            // InternalRMParser.g:4533:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) )
            {
            // InternalRMParser.g:4533:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) )
            // InternalRMParser.g:4534:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:4537:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* )
            // InternalRMParser.g:4538:6: ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )*
            {
            // InternalRMParser.g:4538:6: ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )*
            loop37:
            do {
                int alt37=4;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == Value && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt37=3;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRMParser.g:4539:4: ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4539:4: ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:4540:5: {...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:4540:121: ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:4541:6: ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:4544:9: ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:4544:10: {...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4544:19: (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:4544:20: otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) )
            	    {
            	    otherlv_2=(Token)match(input,Type,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEParameterDefinitionBodyAccess().getTypeKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:4548:9: ( (lv_type_3_0= ruleEDataTypeName ) )
            	    // InternalRMParser.g:4549:10: (lv_type_3_0= ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:4549:10: (lv_type_3_0= ruleEDataTypeName )
            	    // InternalRMParser.g:4550:11: lv_type_3_0= ruleEDataTypeName
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getTypeEDataTypeNameParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_52);
            	    lv_type_3_0=ruleEDataTypeName();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEParameterDefinitionBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_3_0,
            	    												"org.sodalite.dsl.RM.EDataTypeName");
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
            	    // InternalRMParser.g:4573:4: ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4573:4: ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:4574:5: {...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:4574:121: ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:4575:6: ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:4578:9: ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:4578:10: {...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4578:19: (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:4578:20: otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,Value,FOLLOW_39); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEParameterDefinitionBodyAccess().getValueKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:4582:9: ( (lv_value_5_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:4583:10: (lv_value_5_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:4583:10: (lv_value_5_0= ruleEValueExpression )
            	    // InternalRMParser.g:4584:11: lv_value_5_0= ruleEValueExpression
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getValueEValueExpressionParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_52);
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
            	    // InternalRMParser.g:4607:4: ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4607:4: ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:4608:5: {...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:4608:121: ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:4609:6: ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:4612:9: ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:4612:10: {...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4612:19: (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:4612:20: otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,Default,FOLLOW_39); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEParameterDefinitionBodyAccess().getDefaultKeyword_1_2_0());
            	    								
            	    // InternalRMParser.g:4616:9: ( (lv_default_7_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:4617:10: (lv_default_7_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:4617:10: (lv_default_7_0= ruleEValueExpression )
            	    // InternalRMParser.g:4618:11: lv_default_7_0= ruleEValueExpression
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getDefaultEValueExpressionParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_52);
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
            	    break loop37;
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
    // InternalRMParser.g:4652:1: entryRuleEValueExpression returns [EObject current=null] : iv_ruleEValueExpression= ruleEValueExpression EOF ;
    public final EObject entryRuleEValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueExpression = null;


        try {
            // InternalRMParser.g:4652:57: (iv_ruleEValueExpression= ruleEValueExpression EOF )
            // InternalRMParser.g:4653:2: iv_ruleEValueExpression= ruleEValueExpression EOF
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
    // InternalRMParser.g:4659:1: ruleEValueExpression returns [EObject current=null] : (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction ) ;
    public final EObject ruleEValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ESingleValue_0 = null;

        EObject this_EFunction_1 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4665:2: ( (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction ) )
            // InternalRMParser.g:4666:2: (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction )
            {
            // InternalRMParser.g:4666:2: (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=HyphenMinus && LA38_0<=FullStop)||LA38_0==RULE_BOOLEAN||(LA38_0>=RULE_INT && LA38_0<=RULE_STRING)) ) {
                alt38=1;
            }
            else if ( (LA38_0==Get_attribute||LA38_0==Get_property||LA38_0==Get_input) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalRMParser.g:4667:3: this_ESingleValue_0= ruleESingleValue
                    {

                    			newCompositeNode(grammarAccess.getEValueExpressionAccess().getESingleValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESingleValue_0=ruleESingleValue();

                    state._fsp--;


                    			current = this_ESingleValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRMParser.g:4676:3: this_EFunction_1= ruleEFunction
                    {

                    			newCompositeNode(grammarAccess.getEValueExpressionAccess().getEFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFunction_1=ruleEFunction();

                    state._fsp--;


                    			current = this_EFunction_1;
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
    // InternalRMParser.g:4688:1: entryRuleEFunction returns [EObject current=null] : iv_ruleEFunction= ruleEFunction EOF ;
    public final EObject entryRuleEFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFunction = null;


        try {
            // InternalRMParser.g:4688:50: (iv_ruleEFunction= ruleEFunction EOF )
            // InternalRMParser.g:4689:2: iv_ruleEFunction= ruleEFunction EOF
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
    // InternalRMParser.g:4695:1: ruleEFunction returns [EObject current=null] : (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput ) ;
    public final EObject ruleEFunction() throws RecognitionException {
        EObject current = null;

        EObject this_GetProperty_0 = null;

        EObject this_GetAttribute_1 = null;

        EObject this_GetInput_2 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4701:2: ( (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput ) )
            // InternalRMParser.g:4702:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput )
            {
            // InternalRMParser.g:4702:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput )
            int alt39=3;
            switch ( input.LA(1) ) {
            case Get_property:
                {
                alt39=1;
                }
                break;
            case Get_attribute:
                {
                alt39=2;
                }
                break;
            case Get_input:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalRMParser.g:4703:3: this_GetProperty_0= ruleGetProperty
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
                    // InternalRMParser.g:4712:3: this_GetAttribute_1= ruleGetAttribute
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
                    // InternalRMParser.g:4721:3: this_GetInput_2= ruleGetInput
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
    // InternalRMParser.g:4733:1: entryRuleGetInput returns [EObject current=null] : iv_ruleGetInput= ruleGetInput EOF ;
    public final EObject entryRuleGetInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetInput = null;


        try {
            // InternalRMParser.g:4733:49: (iv_ruleGetInput= ruleGetInput EOF )
            // InternalRMParser.g:4734:2: iv_ruleGetInput= ruleGetInput EOF
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
    // InternalRMParser.g:4740:1: ruleGetInput returns [EObject current=null] : (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleGetInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRMParser.g:4746:2: ( (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRMParser.g:4747:2: (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRMParser.g:4747:2: (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) )
            // InternalRMParser.g:4748:3: otherlv_0= Get_input ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Get_input,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGetInputAccess().getGet_inputKeyword_0());
            		
            // InternalRMParser.g:4752:3: ( (otherlv_1= RULE_ID ) )
            // InternalRMParser.g:4753:4: (otherlv_1= RULE_ID )
            {
            // InternalRMParser.g:4753:4: (otherlv_1= RULE_ID )
            // InternalRMParser.g:4754:5: otherlv_1= RULE_ID
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
    // InternalRMParser.g:4769:1: entryRuleGetAttribute returns [EObject current=null] : iv_ruleGetAttribute= ruleGetAttribute EOF ;
    public final EObject entryRuleGetAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttribute = null;


        try {
            // InternalRMParser.g:4769:53: (iv_ruleGetAttribute= ruleGetAttribute EOF )
            // InternalRMParser.g:4770:2: iv_ruleGetAttribute= ruleGetAttribute EOF
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
    // InternalRMParser.g:4776:1: ruleGetAttribute returns [EObject current=null] : (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END ) ;
    public final EObject ruleGetAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4782:2: ( (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END ) )
            // InternalRMParser.g:4783:2: (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END )
            {
            // InternalRMParser.g:4783:2: (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END )
            // InternalRMParser.g:4784:3: otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Get_attribute,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGetAttributeAccess().getGet_attributeKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_53); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getGetAttributeAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalRMParser.g:4792:3: ( (lv_attribute_2_0= ruleGetAttributeBody ) )
            // InternalRMParser.g:4793:4: (lv_attribute_2_0= ruleGetAttributeBody )
            {
            // InternalRMParser.g:4793:4: (lv_attribute_2_0= ruleGetAttributeBody )
            // InternalRMParser.g:4794:5: lv_attribute_2_0= ruleGetAttributeBody
            {

            					newCompositeNode(grammarAccess.getGetAttributeAccess().getAttributeGetAttributeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getGetAttributeAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:4819:1: entryRuleGetAttributeBody returns [EObject current=null] : iv_ruleGetAttributeBody= ruleGetAttributeBody EOF ;
    public final EObject entryRuleGetAttributeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttributeBody = null;


        try {
            // InternalRMParser.g:4819:57: (iv_ruleGetAttributeBody= ruleGetAttributeBody EOF )
            // InternalRMParser.g:4820:2: iv_ruleGetAttributeBody= ruleGetAttributeBody EOF
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
    // InternalRMParser.g:4826:1: ruleGetAttributeBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleGetAttributeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attribute_2_0 = null;

        EObject lv_entity_4_0 = null;

        EObject lv_req_cap_6_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4832:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:4833:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:4833:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:4834:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:4834:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:4835:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:4838:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:4839:5: ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:4839:5: ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=4;
                int LA40_0 = input.LA(1);

                if ( LA40_0 == Attribute && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0) ) {
                    alt40=1;
                }
                else if ( LA40_0 == Entity && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1) ) {
                    alt40=2;
                }
                else if ( LA40_0 == Req_cap && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2) ) {
                    alt40=3;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalRMParser.g:4840:3: ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4840:3: ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:4841:4: {...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:4841:110: ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:4842:5: ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:4845:8: ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:4845:9: {...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRMParser.g:4845:18: (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:4845:19: otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_1=(Token)match(input,Attribute,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGetAttributeBodyAccess().getAttributeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:4849:8: ( (lv_attribute_2_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:4850:9: (lv_attribute_2_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:4850:9: (lv_attribute_2_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:4851:10: lv_attribute_2_0= ruleEPREFIX_TYPE
            	    {

            	    										newCompositeNode(grammarAccess.getGetAttributeBodyAccess().getAttributeEPREFIX_TYPEParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_54);
            	    lv_attribute_2_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"attribute",
            	    											lv_attribute_2_0,
            	    											"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalRMParser.g:4874:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4874:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) )
            	    // InternalRMParser.g:4875:4: {...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:4875:110: ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) )
            	    // InternalRMParser.g:4876:5: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:4879:8: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) )
            	    // InternalRMParser.g:4879:9: {...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRMParser.g:4879:18: (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) )
            	    // InternalRMParser.g:4879:19: otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) )
            	    {
            	    otherlv_3=(Token)match(input,Entity,FOLLOW_55); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGetAttributeBodyAccess().getEntityKeyword_1_0());
            	    							
            	    // InternalRMParser.g:4883:8: ( (lv_entity_4_0= ruleEEntityReference ) )
            	    // InternalRMParser.g:4884:9: (lv_entity_4_0= ruleEEntityReference )
            	    {
            	    // InternalRMParser.g:4884:9: (lv_entity_4_0= ruleEEntityReference )
            	    // InternalRMParser.g:4885:10: lv_entity_4_0= ruleEEntityReference
            	    {

            	    										newCompositeNode(grammarAccess.getGetAttributeBodyAccess().getEntityEEntityReferenceParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_54);
            	    lv_entity_4_0=ruleEEntityReference();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"entity",
            	    											lv_entity_4_0,
            	    											"org.sodalite.dsl.RM.EEntityReference");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalRMParser.g:4908:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4908:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:4909:4: {...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:4909:110: ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:4910:5: ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:4913:8: ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:4913:9: {...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRMParser.g:4913:18: (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:4913:19: otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_5=(Token)match(input,Req_cap,FOLLOW_6); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGetAttributeBodyAccess().getReq_capKeyword_2_0());
            	    							
            	    // InternalRMParser.g:4917:8: ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:4918:9: (lv_req_cap_6_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:4918:9: (lv_req_cap_6_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:4919:10: lv_req_cap_6_0= ruleEPREFIX_TYPE
            	    {

            	    										newCompositeNode(grammarAccess.getGetAttributeBodyAccess().getReq_capEPREFIX_TYPEParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_54);
            	    lv_req_cap_6_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"req_cap",
            	    											lv_req_cap_6_0,
            	    											"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
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
    // InternalRMParser.g:4953:1: entryRuleGetProperty returns [EObject current=null] : iv_ruleGetProperty= ruleGetProperty EOF ;
    public final EObject entryRuleGetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetProperty = null;


        try {
            // InternalRMParser.g:4953:52: (iv_ruleGetProperty= ruleGetProperty EOF )
            // InternalRMParser.g:4954:2: iv_ruleGetProperty= ruleGetProperty EOF
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
    // InternalRMParser.g:4960:1: ruleGetProperty returns [EObject current=null] : (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END ) ;
    public final EObject ruleGetProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_property_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4966:2: ( (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END ) )
            // InternalRMParser.g:4967:2: (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END )
            {
            // InternalRMParser.g:4967:2: (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END )
            // InternalRMParser.g:4968:3: otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Get_property,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGetPropertyAccess().getGet_propertyKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_56); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getGetPropertyAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalRMParser.g:4976:3: ( (lv_property_2_0= ruleGetPropertyBody ) )
            // InternalRMParser.g:4977:4: (lv_property_2_0= ruleGetPropertyBody )
            {
            // InternalRMParser.g:4977:4: (lv_property_2_0= ruleGetPropertyBody )
            // InternalRMParser.g:4978:5: lv_property_2_0= ruleGetPropertyBody
            {

            					newCompositeNode(grammarAccess.getGetPropertyAccess().getPropertyGetPropertyBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getGetPropertyAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:5003:1: entryRuleGetPropertyBody returns [EObject current=null] : iv_ruleGetPropertyBody= ruleGetPropertyBody EOF ;
    public final EObject entryRuleGetPropertyBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetPropertyBody = null;


        try {
            // InternalRMParser.g:5003:56: (iv_ruleGetPropertyBody= ruleGetPropertyBody EOF )
            // InternalRMParser.g:5004:2: iv_ruleGetPropertyBody= ruleGetPropertyBody EOF
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
    // InternalRMParser.g:5010:1: ruleGetPropertyBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleGetPropertyBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_property_2_0 = null;

        EObject lv_entity_4_0 = null;

        EObject lv_req_cap_6_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5016:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:5017:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:5017:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:5018:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:5018:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:5019:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:5022:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:5023:5: ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:5023:5: ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=4;
                int LA41_0 = input.LA(1);

                if ( LA41_0 == Property && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0) ) {
                    alt41=1;
                }
                else if ( LA41_0 == Entity && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1) ) {
                    alt41=2;
                }
                else if ( LA41_0 == Req_cap && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2) ) {
                    alt41=3;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalRMParser.g:5024:3: ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5024:3: ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:5025:4: {...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:5025:109: ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:5026:5: ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:5029:8: ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:5029:9: {...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRMParser.g:5029:18: (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:5029:19: otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_1=(Token)match(input,Property,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGetPropertyBodyAccess().getPropertyKeyword_0_0());
            	    							
            	    // InternalRMParser.g:5033:8: ( (lv_property_2_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:5034:9: (lv_property_2_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:5034:9: (lv_property_2_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:5035:10: lv_property_2_0= ruleEPREFIX_TYPE
            	    {

            	    										newCompositeNode(grammarAccess.getGetPropertyBodyAccess().getPropertyEPREFIX_TYPEParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_57);
            	    lv_property_2_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"property",
            	    											lv_property_2_0,
            	    											"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalRMParser.g:5058:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5058:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) )
            	    // InternalRMParser.g:5059:4: {...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:5059:109: ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) )
            	    // InternalRMParser.g:5060:5: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:5063:8: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) )
            	    // InternalRMParser.g:5063:9: {...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRMParser.g:5063:18: (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) )
            	    // InternalRMParser.g:5063:19: otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) )
            	    {
            	    otherlv_3=(Token)match(input,Entity,FOLLOW_55); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGetPropertyBodyAccess().getEntityKeyword_1_0());
            	    							
            	    // InternalRMParser.g:5067:8: ( (lv_entity_4_0= ruleEEntityReference ) )
            	    // InternalRMParser.g:5068:9: (lv_entity_4_0= ruleEEntityReference )
            	    {
            	    // InternalRMParser.g:5068:9: (lv_entity_4_0= ruleEEntityReference )
            	    // InternalRMParser.g:5069:10: lv_entity_4_0= ruleEEntityReference
            	    {

            	    										newCompositeNode(grammarAccess.getGetPropertyBodyAccess().getEntityEEntityReferenceParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_57);
            	    lv_entity_4_0=ruleEEntityReference();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"entity",
            	    											lv_entity_4_0,
            	    											"org.sodalite.dsl.RM.EEntityReference");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalRMParser.g:5092:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5092:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:5093:4: {...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:5093:109: ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:5094:5: ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:5097:8: ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:5097:9: {...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRMParser.g:5097:18: (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:5097:19: otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_5=(Token)match(input,Req_cap,FOLLOW_6); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGetPropertyBodyAccess().getReq_capKeyword_2_0());
            	    							
            	    // InternalRMParser.g:5101:8: ( (lv_req_cap_6_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:5102:9: (lv_req_cap_6_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:5102:9: (lv_req_cap_6_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:5103:10: lv_req_cap_6_0= ruleEPREFIX_TYPE
            	    {

            	    										newCompositeNode(grammarAccess.getGetPropertyBodyAccess().getReq_capEPREFIX_TYPEParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_57);
            	    lv_req_cap_6_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"req_cap",
            	    											lv_req_cap_6_0,
            	    											"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
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
    // InternalRMParser.g:5137:1: entryRuleECapabilities returns [EObject current=null] : iv_ruleECapabilities= ruleECapabilities EOF ;
    public final EObject entryRuleECapabilities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilities = null;


        try {
            // InternalRMParser.g:5137:54: (iv_ruleECapabilities= ruleECapabilities EOF )
            // InternalRMParser.g:5138:2: iv_ruleECapabilities= ruleECapabilities EOF
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
    // InternalRMParser.g:5144:1: ruleECapabilities returns [EObject current=null] : ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* ) ;
    public final EObject ruleECapabilities() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilities_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5150:2: ( ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* ) )
            // InternalRMParser.g:5151:2: ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* )
            {
            // InternalRMParser.g:5151:2: ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* )
            // InternalRMParser.g:5152:3: () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )*
            {
            // InternalRMParser.g:5152:3: ()
            // InternalRMParser.g:5153:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilitiesAccess().getECapabilitiesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:5159:3: ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalRMParser.g:5160:4: (lv_capabilities_1_0= ruleECapabilityDefinition )
            	    {
            	    // InternalRMParser.g:5160:4: (lv_capabilities_1_0= ruleECapabilityDefinition )
            	    // InternalRMParser.g:5161:5: lv_capabilities_1_0= ruleECapabilityDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getECapabilitiesAccess().getCapabilitiesECapabilityDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    break loop42;
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
    // InternalRMParser.g:5182:1: entryRuleECapabilityDefinition returns [EObject current=null] : iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF ;
    public final EObject entryRuleECapabilityDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityDefinition = null;


        try {
            // InternalRMParser.g:5182:62: (iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF )
            // InternalRMParser.g:5183:2: iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF
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
    // InternalRMParser.g:5189:1: ruleECapabilityDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleECapabilityDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_capability_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5195:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:5196:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:5196:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:5197:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:5197:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:5198:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:5198:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:5199:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getECapabilityDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_58); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getECapabilityDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:5223:3: ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) )
            // InternalRMParser.g:5224:4: (lv_capability_3_0= ruleECapabilityDefinitionBody )
            {
            // InternalRMParser.g:5224:4: (lv_capability_3_0= ruleECapabilityDefinitionBody )
            // InternalRMParser.g:5225:5: lv_capability_3_0= ruleECapabilityDefinitionBody
            {

            					newCompositeNode(grammarAccess.getECapabilityDefinitionAccess().getCapabilityECapabilityDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_capability_3_0=ruleECapabilityDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getECapabilityDefinitionRule());
            					}
            					set(
            						current,
            						"capability",
            						lv_capability_3_0,
            						"org.sodalite.dsl.RM.ECapabilityDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getECapabilityDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:5250:1: entryRuleECapabilityDefinitionBody returns [EObject current=null] : iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF ;
    public final EObject entryRuleECapabilityDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityDefinitionBody = null;


        try {
            // InternalRMParser.g:5250:66: (iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF )
            // InternalRMParser.g:5251:2: iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF
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
    // InternalRMParser.g:5257:1: ruleECapabilityDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleECapabilityDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        Token otherlv_9=null;
        Token this_BEGIN_10=null;
        Token this_END_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_type_2_0 = null;

        EObject lv_properties_7_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_valid_source_types_15_0 = null;

        EObject lv_occurrences_start_19_0 = null;

        EObject lv_occurrences_end_21_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5263:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:5264:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:5264:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:5265:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:5265:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:5266:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:5269:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?)
            // InternalRMParser.g:5270:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:5270:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=7;
                int LA44_0 = input.LA(1);

                if ( LA44_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt44=1;
                }
                else if ( LA44_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt44=2;
                }
                else if ( LA44_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt44=3;
                }
                else if ( LA44_0 == Attributes && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt44=4;
                }
                else if ( LA44_0 == Valid_source_types && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
                    alt44=5;
                }
                else if ( LA44_0 == Occurrences && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
                    alt44=6;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalRMParser.g:5271:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5271:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:5272:4: {...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:5272:119: ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:5273:5: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:5276:8: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:5276:9: {...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5276:18: (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:5276:19: otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getECapabilityDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:5280:8: ( (lv_type_2_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:5281:9: (lv_type_2_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:5281:9: (lv_type_2_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:5282:10: lv_type_2_0= ruleEPREFIX_TYPE
            	    {

            	    										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getTypeEPREFIX_TYPEParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_59);
            	    lv_type_2_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"type",
            	    											lv_type_2_0,
            	    											"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalRMParser.g:5305:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5305:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:5306:4: {...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:5306:119: ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:5307:5: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:5310:8: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:5310:9: {...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5310:18: (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:5310:19: otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Description,FOLLOW_13); 

            	    								newLeafNode(otherlv_3, grammarAccess.getECapabilityDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRMParser.g:5314:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRMParser.g:5315:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:5315:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRMParser.g:5316:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

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
            	    // InternalRMParser.g:5338:3: ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:5338:3: ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) )
            	    // InternalRMParser.g:5339:4: {...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:5339:119: ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) )
            	    // InternalRMParser.g:5340:5: ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:5343:8: ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) )
            	    // InternalRMParser.g:5343:9: {...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5343:18: (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END )
            	    // InternalRMParser.g:5343:19: otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END
            	    {
            	    otherlv_5=(Token)match(input,Properties,FOLLOW_5); 

            	    								newLeafNode(otherlv_5, grammarAccess.getECapabilityDefinitionBodyAccess().getPropertiesKeyword_2_0());
            	    							
            	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    								newLeafNode(this_BEGIN_6, grammarAccess.getECapabilityDefinitionBodyAccess().getBEGINTerminalRuleCall_2_1());
            	    							
            	    // InternalRMParser.g:5351:8: ( (lv_properties_7_0= ruleEProperties ) )
            	    // InternalRMParser.g:5352:9: (lv_properties_7_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:5352:9: (lv_properties_7_0= ruleEProperties )
            	    // InternalRMParser.g:5353:10: lv_properties_7_0= ruleEProperties
            	    {

            	    										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getPropertiesEPropertiesParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
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

            	    this_END_8=(Token)match(input,RULE_END,FOLLOW_59); 

            	    								newLeafNode(this_END_8, grammarAccess.getECapabilityDefinitionBodyAccess().getENDTerminalRuleCall_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:5380:3: ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:5380:3: ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) )
            	    // InternalRMParser.g:5381:4: {...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:5381:119: ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) )
            	    // InternalRMParser.g:5382:5: ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:5385:8: ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) )
            	    // InternalRMParser.g:5385:9: {...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5385:18: (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END )
            	    // InternalRMParser.g:5385:19: otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Attributes,FOLLOW_5); 

            	    								newLeafNode(otherlv_9, grammarAccess.getECapabilityDefinitionBodyAccess().getAttributesKeyword_3_0());
            	    							
            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    								newLeafNode(this_BEGIN_10, grammarAccess.getECapabilityDefinitionBodyAccess().getBEGINTerminalRuleCall_3_1());
            	    							
            	    // InternalRMParser.g:5393:8: ( (lv_attributes_11_0= ruleEAttributes ) )
            	    // InternalRMParser.g:5394:9: (lv_attributes_11_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:5394:9: (lv_attributes_11_0= ruleEAttributes )
            	    // InternalRMParser.g:5395:10: lv_attributes_11_0= ruleEAttributes
            	    {

            	    										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getAttributesEAttributesParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
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

            	    this_END_12=(Token)match(input,RULE_END,FOLLOW_59); 

            	    								newLeafNode(this_END_12, grammarAccess.getECapabilityDefinitionBodyAccess().getENDTerminalRuleCall_3_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRMParser.g:5422:3: ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:5422:3: ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:5423:4: {...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRMParser.g:5423:119: ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) )
            	    // InternalRMParser.g:5424:5: ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRMParser.g:5427:8: ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) )
            	    // InternalRMParser.g:5427:9: {...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5427:18: (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket )
            	    // InternalRMParser.g:5427:19: otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket
            	    {
            	    otherlv_13=(Token)match(input,Valid_source_types,FOLLOW_27); 

            	    								newLeafNode(otherlv_13, grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesKeyword_4_0());
            	    							
            	    otherlv_14=(Token)match(input,LeftSquareBracket,FOLLOW_28); 

            	    								newLeafNode(otherlv_14, grammarAccess.getECapabilityDefinitionBodyAccess().getLeftSquareBracketKeyword_4_1());
            	    							
            	    // InternalRMParser.g:5435:8: ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_QUALIFIED_NAME)) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalRMParser.g:5436:9: (lv_valid_source_types_15_0= ruleEValidSourceType )
            	            {
            	            // InternalRMParser.g:5436:9: (lv_valid_source_types_15_0= ruleEValidSourceType )
            	            // InternalRMParser.g:5437:10: lv_valid_source_types_15_0= ruleEValidSourceType
            	            {

            	            										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesEValidSourceTypeParserRuleCall_4_2_0());
            	            									
            	            pushFollow(FOLLOW_29);
            	            lv_valid_source_types_15_0=ruleEValidSourceType();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getECapabilityDefinitionBodyRule());
            	            										}
            	            										add(
            	            											current,
            	            											"valid_source_types",
            	            											lv_valid_source_types_15_0,
            	            											"org.sodalite.dsl.RM.EValidSourceType");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_16=(Token)match(input,RightSquareBracket,FOLLOW_59); 

            	    								newLeafNode(otherlv_16, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_4_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRMParser.g:5464:3: ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:5464:3: ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:5465:4: {...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRMParser.g:5465:119: ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) )
            	    // InternalRMParser.g:5466:5: ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRMParser.g:5469:8: ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) )
            	    // InternalRMParser.g:5469:9: {...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5469:18: (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket )
            	    // InternalRMParser.g:5469:19: otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket
            	    {
            	    otherlv_17=(Token)match(input,Occurrences,FOLLOW_27); 

            	    								newLeafNode(otherlv_17, grammarAccess.getECapabilityDefinitionBodyAccess().getOccurrencesKeyword_5_0());
            	    							
            	    otherlv_18=(Token)match(input,LeftSquareBracket,FOLLOW_60); 

            	    								newLeafNode(otherlv_18, grammarAccess.getECapabilityDefinitionBodyAccess().getLeftSquareBracketKeyword_5_1());
            	    							
            	    // InternalRMParser.g:5477:8: ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:5478:9: (lv_occurrences_start_19_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:5478:9: (lv_occurrences_start_19_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:5479:10: lv_occurrences_start_19_0= ruleEAlphaNumericValue
            	    {

            	    										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getOccurrences_startEAlphaNumericValueParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_61);
            	    lv_occurrences_start_19_0=ruleEAlphaNumericValue();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"occurrences_start",
            	    											lv_occurrences_start_19_0,
            	    											"org.sodalite.dsl.RM.EAlphaNumericValue");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_20=(Token)match(input,Comma,FOLLOW_60); 

            	    								newLeafNode(otherlv_20, grammarAccess.getECapabilityDefinitionBodyAccess().getCommaKeyword_5_3());
            	    							
            	    // InternalRMParser.g:5500:8: ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:5501:9: (lv_occurrences_end_21_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:5501:9: (lv_occurrences_end_21_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:5502:10: lv_occurrences_end_21_0= ruleEAlphaNumericValue
            	    {

            	    										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getOccurrences_endEAlphaNumericValueParserRuleCall_5_4_0());
            	    									
            	    pushFollow(FOLLOW_29);
            	    lv_occurrences_end_21_0=ruleEAlphaNumericValue();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"occurrences_end",
            	    											lv_occurrences_end_21_0,
            	    											"org.sodalite.dsl.RM.EAlphaNumericValue");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_22=(Token)match(input,RightSquareBracket,FOLLOW_59); 

            	    								newLeafNode(otherlv_22, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_5_5());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


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
    // InternalRMParser.g:5540:1: entryRuleEValidSourceType returns [EObject current=null] : iv_ruleEValidSourceType= ruleEValidSourceType EOF ;
    public final EObject entryRuleEValidSourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidSourceType = null;


        try {
            // InternalRMParser.g:5540:57: (iv_ruleEValidSourceType= ruleEValidSourceType EOF )
            // InternalRMParser.g:5541:2: iv_ruleEValidSourceType= ruleEValidSourceType EOF
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
    // InternalRMParser.g:5547:1: ruleEValidSourceType returns [EObject current=null] : ( ( (lv_sourceTypes_0_0= ruleEPREFIX_TYPE ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleEPREFIX_TYPE ) ) )* ) ;
    public final EObject ruleEValidSourceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sourceTypes_0_0 = null;

        EObject lv_sourceType_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5553:2: ( ( ( (lv_sourceTypes_0_0= ruleEPREFIX_TYPE ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleEPREFIX_TYPE ) ) )* ) )
            // InternalRMParser.g:5554:2: ( ( (lv_sourceTypes_0_0= ruleEPREFIX_TYPE ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleEPREFIX_TYPE ) ) )* )
            {
            // InternalRMParser.g:5554:2: ( ( (lv_sourceTypes_0_0= ruleEPREFIX_TYPE ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleEPREFIX_TYPE ) ) )* )
            // InternalRMParser.g:5555:3: ( (lv_sourceTypes_0_0= ruleEPREFIX_TYPE ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleEPREFIX_TYPE ) ) )*
            {
            // InternalRMParser.g:5555:3: ( (lv_sourceTypes_0_0= ruleEPREFIX_TYPE ) )
            // InternalRMParser.g:5556:4: (lv_sourceTypes_0_0= ruleEPREFIX_TYPE )
            {
            // InternalRMParser.g:5556:4: (lv_sourceTypes_0_0= ruleEPREFIX_TYPE )
            // InternalRMParser.g:5557:5: lv_sourceTypes_0_0= ruleEPREFIX_TYPE
            {

            					newCompositeNode(grammarAccess.getEValidSourceTypeAccess().getSourceTypesEPREFIX_TYPEParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_sourceTypes_0_0=ruleEPREFIX_TYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEValidSourceTypeRule());
            					}
            					add(
            						current,
            						"sourceTypes",
            						lv_sourceTypes_0_0,
            						"org.sodalite.dsl.RM.EPREFIX_TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRMParser.g:5574:3: (otherlv_1= Comma ( (lv_sourceType_2_0= ruleEPREFIX_TYPE ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==Comma) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalRMParser.g:5575:4: otherlv_1= Comma ( (lv_sourceType_2_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEValidSourceTypeAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRMParser.g:5579:4: ( (lv_sourceType_2_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:5580:5: (lv_sourceType_2_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:5580:5: (lv_sourceType_2_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:5581:6: lv_sourceType_2_0= ruleEPREFIX_TYPE
            	    {

            	    						newCompositeNode(grammarAccess.getEValidSourceTypeAccess().getSourceTypeEPREFIX_TYPEParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_sourceType_2_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEValidSourceTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sourceType",
            	    							lv_sourceType_2_0,
            	    							"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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


    // $ANTLR start "entryRuleERequirements"
    // InternalRMParser.g:5603:1: entryRuleERequirements returns [EObject current=null] : iv_ruleERequirements= ruleERequirements EOF ;
    public final EObject entryRuleERequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirements = null;


        try {
            // InternalRMParser.g:5603:54: (iv_ruleERequirements= ruleERequirements EOF )
            // InternalRMParser.g:5604:2: iv_ruleERequirements= ruleERequirements EOF
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
    // InternalRMParser.g:5610:1: ruleERequirements returns [EObject current=null] : ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* ) ;
    public final EObject ruleERequirements() throws RecognitionException {
        EObject current = null;

        EObject lv_requirements_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5616:2: ( ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* ) )
            // InternalRMParser.g:5617:2: ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* )
            {
            // InternalRMParser.g:5617:2: ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* )
            // InternalRMParser.g:5618:3: () ( (lv_requirements_1_0= ruleERequirementDefinition ) )*
            {
            // InternalRMParser.g:5618:3: ()
            // InternalRMParser.g:5619:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERequirementsAccess().getERequirementsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:5625:3: ( (lv_requirements_1_0= ruleERequirementDefinition ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalRMParser.g:5626:4: (lv_requirements_1_0= ruleERequirementDefinition )
            	    {
            	    // InternalRMParser.g:5626:4: (lv_requirements_1_0= ruleERequirementDefinition )
            	    // InternalRMParser.g:5627:5: lv_requirements_1_0= ruleERequirementDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getERequirementsAccess().getRequirementsERequirementDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    break loop46;
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
    // InternalRMParser.g:5648:1: entryRuleERequirementDefinition returns [EObject current=null] : iv_ruleERequirementDefinition= ruleERequirementDefinition EOF ;
    public final EObject entryRuleERequirementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementDefinition = null;


        try {
            // InternalRMParser.g:5648:63: (iv_ruleERequirementDefinition= ruleERequirementDefinition EOF )
            // InternalRMParser.g:5649:2: iv_ruleERequirementDefinition= ruleERequirementDefinition EOF
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
    // InternalRMParser.g:5655:1: ruleERequirementDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleERequirementDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_requirement_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5661:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:5662:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:5662:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:5663:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:5663:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:5664:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:5664:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:5665:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getERequirementDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_62); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getERequirementDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:5689:3: ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) )
            // InternalRMParser.g:5690:4: (lv_requirement_3_0= ruleERequirementDefinitionBody )
            {
            // InternalRMParser.g:5690:4: (lv_requirement_3_0= ruleERequirementDefinitionBody )
            // InternalRMParser.g:5691:5: lv_requirement_3_0= ruleERequirementDefinitionBody
            {

            					newCompositeNode(grammarAccess.getERequirementDefinitionAccess().getRequirementERequirementDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_requirement_3_0=ruleERequirementDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getERequirementDefinitionRule());
            					}
            					set(
            						current,
            						"requirement",
            						lv_requirement_3_0,
            						"org.sodalite.dsl.RM.ERequirementDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getERequirementDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:5716:1: entryRuleERequirementDefinitionBody returns [EObject current=null] : iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF ;
    public final EObject entryRuleERequirementDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementDefinitionBody = null;


        try {
            // InternalRMParser.g:5716:67: (iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF )
            // InternalRMParser.g:5717:2: iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF
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
    // InternalRMParser.g:5723:1: ruleERequirementDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleERequirementDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_capability_2_0 = null;

        EObject lv_node_4_0 = null;

        EObject lv_relationship_6_0 = null;

        EObject lv_start_9_0 = null;

        EObject lv_end_11_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5729:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:5730:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:5730:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:5731:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:5731:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:5732:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:5735:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?)
            // InternalRMParser.g:5736:5: ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:5736:5: ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=5;
                int LA47_0 = input.LA(1);

                if ( LA47_0 == Capability && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt47=1;
                }
                else if ( LA47_0 == Node && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt47=2;
                }
                else if ( LA47_0 == Relationship && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt47=3;
                }
                else if ( LA47_0 == Occurrences && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt47=4;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalRMParser.g:5737:3: ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5737:3: ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:5738:4: {...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:5738:120: ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:5739:5: ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:5742:8: ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:5742:9: {...}? => (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5742:18: (otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:5742:19: otherlv_1= Capability ( (lv_capability_2_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_1=(Token)match(input,Capability,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getERequirementDefinitionBodyAccess().getCapabilityKeyword_0_0());
            	    							
            	    // InternalRMParser.g:5746:8: ( (lv_capability_2_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:5747:9: (lv_capability_2_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:5747:9: (lv_capability_2_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:5748:10: lv_capability_2_0= ruleEPREFIX_TYPE
            	    {

            	    										newCompositeNode(grammarAccess.getERequirementDefinitionBodyAccess().getCapabilityEPREFIX_TYPEParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_63);
            	    lv_capability_2_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"capability",
            	    											lv_capability_2_0,
            	    											"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalRMParser.g:5771:3: ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5771:3: ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:5772:4: {...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:5772:120: ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:5773:5: ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:5776:8: ({...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:5776:9: {...}? => (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5776:18: (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:5776:19: otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_3=(Token)match(input,Node,FOLLOW_6); 

            	    								newLeafNode(otherlv_3, grammarAccess.getERequirementDefinitionBodyAccess().getNodeKeyword_1_0());
            	    							
            	    // InternalRMParser.g:5780:8: ( (lv_node_4_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:5781:9: (lv_node_4_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:5781:9: (lv_node_4_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:5782:10: lv_node_4_0= ruleEPREFIX_TYPE
            	    {

            	    										newCompositeNode(grammarAccess.getERequirementDefinitionBodyAccess().getNodeEPREFIX_TYPEParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_63);
            	    lv_node_4_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"node",
            	    											lv_node_4_0,
            	    											"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalRMParser.g:5805:3: ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5805:3: ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalRMParser.g:5806:4: {...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:5806:120: ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalRMParser.g:5807:5: ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:5810:8: ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalRMParser.g:5810:9: {...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5810:18: (otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalRMParser.g:5810:19: otherlv_5= Relationship ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_5=(Token)match(input,Relationship,FOLLOW_6); 

            	    								newLeafNode(otherlv_5, grammarAccess.getERequirementDefinitionBodyAccess().getRelationshipKeyword_2_0());
            	    							
            	    // InternalRMParser.g:5814:8: ( (lv_relationship_6_0= ruleEPREFIX_TYPE ) )
            	    // InternalRMParser.g:5815:9: (lv_relationship_6_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalRMParser.g:5815:9: (lv_relationship_6_0= ruleEPREFIX_TYPE )
            	    // InternalRMParser.g:5816:10: lv_relationship_6_0= ruleEPREFIX_TYPE
            	    {

            	    										newCompositeNode(grammarAccess.getERequirementDefinitionBodyAccess().getRelationshipEPREFIX_TYPEParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_63);
            	    lv_relationship_6_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"relationship",
            	    											lv_relationship_6_0,
            	    											"org.sodalite.dsl.RM.EPREFIX_TYPE");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalRMParser.g:5839:3: ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:5839:3: ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:5840:4: {...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:5840:120: ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) )
            	    // InternalRMParser.g:5841:5: ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:5844:8: ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) )
            	    // InternalRMParser.g:5844:9: {...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5844:18: (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket )
            	    // InternalRMParser.g:5844:19: otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket
            	    {
            	    otherlv_7=(Token)match(input,Occurrences,FOLLOW_27); 

            	    								newLeafNode(otherlv_7, grammarAccess.getERequirementDefinitionBodyAccess().getOccurrencesKeyword_3_0());
            	    							
            	    otherlv_8=(Token)match(input,LeftSquareBracket,FOLLOW_60); 

            	    								newLeafNode(otherlv_8, grammarAccess.getERequirementDefinitionBodyAccess().getLeftSquareBracketKeyword_3_1());
            	    							
            	    // InternalRMParser.g:5852:8: ( (lv_start_9_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:5853:9: (lv_start_9_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:5853:9: (lv_start_9_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:5854:10: lv_start_9_0= ruleEAlphaNumericValue
            	    {

            	    										newCompositeNode(grammarAccess.getERequirementDefinitionBodyAccess().getStartEAlphaNumericValueParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_61);
            	    lv_start_9_0=ruleEAlphaNumericValue();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"start",
            	    											lv_start_9_0,
            	    											"org.sodalite.dsl.RM.EAlphaNumericValue");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_10=(Token)match(input,Comma,FOLLOW_60); 

            	    								newLeafNode(otherlv_10, grammarAccess.getERequirementDefinitionBodyAccess().getCommaKeyword_3_3());
            	    							
            	    // InternalRMParser.g:5875:8: ( (lv_end_11_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:5876:9: (lv_end_11_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:5876:9: (lv_end_11_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:5877:10: lv_end_11_0= ruleEAlphaNumericValue
            	    {

            	    										newCompositeNode(grammarAccess.getERequirementDefinitionBodyAccess().getEndEAlphaNumericValueParserRuleCall_3_4_0());
            	    									
            	    pushFollow(FOLLOW_29);
            	    lv_end_11_0=ruleEAlphaNumericValue();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"end",
            	    											lv_end_11_0,
            	    											"org.sodalite.dsl.RM.EAlphaNumericValue");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_12=(Token)match(input,RightSquareBracket,FOLLOW_63); 

            	    								newLeafNode(otherlv_12, grammarAccess.getERequirementDefinitionBodyAccess().getRightSquareBracketKeyword_3_5());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            	    				

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
    // InternalRMParser.g:5915:1: entryRuleEConstraints returns [EObject current=null] : iv_ruleEConstraints= ruleEConstraints EOF ;
    public final EObject entryRuleEConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraints = null;


        try {
            // InternalRMParser.g:5915:53: (iv_ruleEConstraints= ruleEConstraints EOF )
            // InternalRMParser.g:5916:2: iv_ruleEConstraints= ruleEConstraints EOF
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
    // InternalRMParser.g:5922:1: ruleEConstraints returns [EObject current=null] : ( () ( (lv_constraints_1_0= ruleEConstraint ) )* ) ;
    public final EObject ruleEConstraints() throws RecognitionException {
        EObject current = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5928:2: ( ( () ( (lv_constraints_1_0= ruleEConstraint ) )* ) )
            // InternalRMParser.g:5929:2: ( () ( (lv_constraints_1_0= ruleEConstraint ) )* )
            {
            // InternalRMParser.g:5929:2: ( () ( (lv_constraints_1_0= ruleEConstraint ) )* )
            // InternalRMParser.g:5930:3: () ( (lv_constraints_1_0= ruleEConstraint ) )*
            {
            // InternalRMParser.g:5930:3: ()
            // InternalRMParser.g:5931:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConstraintsAccess().getEConstraintsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:5937:3: ( (lv_constraints_1_0= ruleEConstraint ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==Greater_or_equal||LA48_0==Less_or_equal||LA48_0==Greater_than||LA48_0==Valid_values||(LA48_0>=Max_length && LA48_0<=Min_length)||LA48_0==Less_than||LA48_0==In_range||LA48_0==Length||LA48_0==Equal) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalRMParser.g:5938:4: (lv_constraints_1_0= ruleEConstraint )
            	    {
            	    // InternalRMParser.g:5938:4: (lv_constraints_1_0= ruleEConstraint )
            	    // InternalRMParser.g:5939:5: lv_constraints_1_0= ruleEConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getEConstraintsAccess().getConstraintsEConstraintParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_64);
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
    // $ANTLR end "ruleEConstraints"


    // $ANTLR start "entryRuleEConstraint"
    // InternalRMParser.g:5960:1: entryRuleEConstraint returns [EObject current=null] : iv_ruleEConstraint= ruleEConstraint EOF ;
    public final EObject entryRuleEConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraint = null;


        try {
            // InternalRMParser.g:5960:52: (iv_ruleEConstraint= ruleEConstraint EOF )
            // InternalRMParser.g:5961:2: iv_ruleEConstraint= ruleEConstraint EOF
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
    // InternalRMParser.g:5967:1: ruleEConstraint returns [EObject current=null] : (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) ;
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
            // InternalRMParser.g:5973:2: ( (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) )
            // InternalRMParser.g:5974:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            {
            // InternalRMParser.g:5974:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            int alt49=10;
            switch ( input.LA(1) ) {
            case Equal:
                {
                alt49=1;
                }
                break;
            case Greater_than:
                {
                alt49=2;
                }
                break;
            case Greater_or_equal:
                {
                alt49=3;
                }
                break;
            case Less_than:
                {
                alt49=4;
                }
                break;
            case Less_or_equal:
                {
                alt49=5;
                }
                break;
            case In_range:
                {
                alt49=6;
                }
                break;
            case Valid_values:
                {
                alt49=7;
                }
                break;
            case Length:
                {
                alt49=8;
                }
                break;
            case Min_length:
                {
                alt49=9;
                }
                break;
            case Max_length:
                {
                alt49=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalRMParser.g:5975:3: this_EEqual_0= ruleEEqual
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
                    // InternalRMParser.g:5984:3: this_EGreaterThan_1= ruleEGreaterThan
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
                    // InternalRMParser.g:5993:3: this_EGreaterOrEqual_2= ruleEGreaterOrEqual
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
                    // InternalRMParser.g:6002:3: this_ELessThan_3= ruleELessThan
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
                    // InternalRMParser.g:6011:3: this_ELessOrEqual_4= ruleELessOrEqual
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
                    // InternalRMParser.g:6020:3: this_EInRange_5= ruleEInRange
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
                    // InternalRMParser.g:6029:3: this_EValid_Values_6= ruleEValid_Values
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
                    // InternalRMParser.g:6038:3: this_ELength_7= ruleELength
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
                    // InternalRMParser.g:6047:3: this_EMinLength_8= ruleEMinLength
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
                    // InternalRMParser.g:6056:3: this_EMaxLength_9= ruleEMaxLength
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
    // InternalRMParser.g:6068:1: entryRuleEMaxLength returns [EObject current=null] : iv_ruleEMaxLength= ruleEMaxLength EOF ;
    public final EObject entryRuleEMaxLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMaxLength = null;


        try {
            // InternalRMParser.g:6068:51: (iv_ruleEMaxLength= ruleEMaxLength EOF )
            // InternalRMParser.g:6069:2: iv_ruleEMaxLength= ruleEMaxLength EOF
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
    // InternalRMParser.g:6075:1: ruleEMaxLength returns [EObject current=null] : (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEMaxLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6081:2: ( (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6082:2: (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6082:2: (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6083:3: otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Max_length,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getEMaxLengthAccess().getMax_lengthKeyword_0());
            		
            // InternalRMParser.g:6087:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6088:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6088:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6089:5: lv_val_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getEMaxLengthAccess().getValEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEMaxLengthRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.RM.EAlphaNumericValue");
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
    // $ANTLR end "ruleEMaxLength"


    // $ANTLR start "entryRuleEMinLength"
    // InternalRMParser.g:6110:1: entryRuleEMinLength returns [EObject current=null] : iv_ruleEMinLength= ruleEMinLength EOF ;
    public final EObject entryRuleEMinLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMinLength = null;


        try {
            // InternalRMParser.g:6110:51: (iv_ruleEMinLength= ruleEMinLength EOF )
            // InternalRMParser.g:6111:2: iv_ruleEMinLength= ruleEMinLength EOF
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
    // InternalRMParser.g:6117:1: ruleEMinLength returns [EObject current=null] : (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEMinLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6123:2: ( (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6124:2: (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6124:2: (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6125:3: otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Min_length,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getEMinLengthAccess().getMin_lengthKeyword_0());
            		
            // InternalRMParser.g:6129:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6130:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6130:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6131:5: lv_val_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getEMinLengthAccess().getValEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEMinLengthRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.RM.EAlphaNumericValue");
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
    // $ANTLR end "ruleEMinLength"


    // $ANTLR start "entryRuleELength"
    // InternalRMParser.g:6152:1: entryRuleELength returns [EObject current=null] : iv_ruleELength= ruleELength EOF ;
    public final EObject entryRuleELength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELength = null;


        try {
            // InternalRMParser.g:6152:48: (iv_ruleELength= ruleELength EOF )
            // InternalRMParser.g:6153:2: iv_ruleELength= ruleELength EOF
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
    // InternalRMParser.g:6159:1: ruleELength returns [EObject current=null] : (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleELength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6165:2: ( (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6166:2: (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6166:2: (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6167:3: otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Length,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getELengthAccess().getLengthKeyword_0());
            		
            // InternalRMParser.g:6171:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6172:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6172:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6173:5: lv_val_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getELengthAccess().getValEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getELengthRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.RM.EAlphaNumericValue");
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
    // $ANTLR end "ruleELength"


    // $ANTLR start "entryRuleEValid_Values"
    // InternalRMParser.g:6194:1: entryRuleEValid_Values returns [EObject current=null] : iv_ruleEValid_Values= ruleEValid_Values EOF ;
    public final EObject entryRuleEValid_Values() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValid_Values = null;


        try {
            // InternalRMParser.g:6194:54: (iv_ruleEValid_Values= ruleEValid_Values EOF )
            // InternalRMParser.g:6195:2: iv_ruleEValid_Values= ruleEValid_Values EOF
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
    // InternalRMParser.g:6201:1: ruleEValid_Values returns [EObject current=null] : (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) ) ;
    public final EObject ruleEValid_Values() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6207:2: ( (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) ) )
            // InternalRMParser.g:6208:2: (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) )
            {
            // InternalRMParser.g:6208:2: (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) )
            // InternalRMParser.g:6209:3: otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) )
            {
            otherlv_0=(Token)match(input,Valid_values,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getEValid_ValuesAccess().getValid_valuesKeyword_0());
            		
            // InternalRMParser.g:6213:3: ( (lv_val_1_0= ruleELIST ) )
            // InternalRMParser.g:6214:4: (lv_val_1_0= ruleELIST )
            {
            // InternalRMParser.g:6214:4: (lv_val_1_0= ruleELIST )
            // InternalRMParser.g:6215:5: lv_val_1_0= ruleELIST
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
    // InternalRMParser.g:6236:1: entryRuleELIST returns [EObject current=null] : iv_ruleELIST= ruleELIST EOF ;
    public final EObject entryRuleELIST() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELIST = null;


        try {
            // InternalRMParser.g:6236:46: (iv_ruleELIST= ruleELIST EOF )
            // InternalRMParser.g:6237:2: iv_ruleELIST= ruleELIST EOF
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
    // InternalRMParser.g:6243:1: ruleELIST returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket ) ;
    public final EObject ruleELIST() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_list_1_0 = null;

        EObject lv_list_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6249:2: ( (otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket ) )
            // InternalRMParser.g:6250:2: (otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket )
            {
            // InternalRMParser.g:6250:2: (otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket )
            // InternalRMParser.g:6251:3: otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getELISTAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalRMParser.g:6255:3: ( (lv_list_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6256:4: (lv_list_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6256:4: (lv_list_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6257:5: lv_list_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getELISTAccess().getListEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_65);
            lv_list_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getELISTRule());
            					}
            					add(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.sodalite.dsl.RM.EAlphaNumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRMParser.g:6274:3: (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==Comma) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalRMParser.g:6275:4: otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_60); 

            	    				newLeafNode(otherlv_2, grammarAccess.getELISTAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRMParser.g:6279:4: ( (lv_list_3_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:6280:5: (lv_list_3_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:6280:5: (lv_list_3_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:6281:6: lv_list_3_0= ruleEAlphaNumericValue
            	    {

            	    						newCompositeNode(grammarAccess.getELISTAccess().getListEAlphaNumericValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_65);
            	    lv_list_3_0=ruleEAlphaNumericValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getELISTRule());
            	    						}
            	    						add(
            	    							current,
            	    							"list",
            	    							lv_list_3_0,
            	    							"org.sodalite.dsl.RM.EAlphaNumericValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); 

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
    // InternalRMParser.g:6307:1: entryRuleEInRange returns [EObject current=null] : iv_ruleEInRange= ruleEInRange EOF ;
    public final EObject entryRuleEInRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInRange = null;


        try {
            // InternalRMParser.g:6307:49: (iv_ruleEInRange= ruleEInRange EOF )
            // InternalRMParser.g:6308:2: iv_ruleEInRange= ruleEInRange EOF
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
    // InternalRMParser.g:6314:1: ruleEInRange returns [EObject current=null] : (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket ) ;
    public final EObject ruleEInRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_start_2_0 = null;

        EObject lv_end_4_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6320:2: ( (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket ) )
            // InternalRMParser.g:6321:2: (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket )
            {
            // InternalRMParser.g:6321:2: (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket )
            // InternalRMParser.g:6322:3: otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket
            {
            otherlv_0=(Token)match(input,In_range,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getEInRangeAccess().getIn_rangeKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getEInRangeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRMParser.g:6330:3: ( (lv_start_2_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6331:4: (lv_start_2_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6331:4: (lv_start_2_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6332:5: lv_start_2_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getEInRangeAccess().getStartEAlphaNumericValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_61);
            lv_start_2_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEInRangeRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_2_0,
            						"org.sodalite.dsl.RM.EAlphaNumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,Comma,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getEInRangeAccess().getCommaKeyword_3());
            		
            // InternalRMParser.g:6353:3: ( (lv_end_4_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6354:4: (lv_end_4_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6354:4: (lv_end_4_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6355:5: lv_end_4_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getEInRangeAccess().getEndEAlphaNumericValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
            lv_end_4_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEInRangeRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.sodalite.dsl.RM.EAlphaNumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); 

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
    // InternalRMParser.g:6380:1: entryRuleELessOrEqual returns [EObject current=null] : iv_ruleELessOrEqual= ruleELessOrEqual EOF ;
    public final EObject entryRuleELessOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessOrEqual = null;


        try {
            // InternalRMParser.g:6380:53: (iv_ruleELessOrEqual= ruleELessOrEqual EOF )
            // InternalRMParser.g:6381:2: iv_ruleELessOrEqual= ruleELessOrEqual EOF
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
    // InternalRMParser.g:6387:1: ruleELessOrEqual returns [EObject current=null] : (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleELessOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6393:2: ( (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6394:2: (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6394:2: (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6395:3: otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Less_or_equal,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getELessOrEqualAccess().getLess_or_equalKeyword_0());
            		
            // InternalRMParser.g:6399:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6400:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6400:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6401:5: lv_val_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getELessOrEqualAccess().getValEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getELessOrEqualRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.RM.EAlphaNumericValue");
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
    // $ANTLR end "ruleELessOrEqual"


    // $ANTLR start "entryRuleELessThan"
    // InternalRMParser.g:6422:1: entryRuleELessThan returns [EObject current=null] : iv_ruleELessThan= ruleELessThan EOF ;
    public final EObject entryRuleELessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessThan = null;


        try {
            // InternalRMParser.g:6422:50: (iv_ruleELessThan= ruleELessThan EOF )
            // InternalRMParser.g:6423:2: iv_ruleELessThan= ruleELessThan EOF
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
    // InternalRMParser.g:6429:1: ruleELessThan returns [EObject current=null] : (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleELessThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6435:2: ( (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6436:2: (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6436:2: (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6437:3: otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Less_than,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getELessThanAccess().getLess_thanKeyword_0());
            		
            // InternalRMParser.g:6441:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6442:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6442:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6443:5: lv_val_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getELessThanAccess().getValEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getELessThanRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.RM.EAlphaNumericValue");
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
    // $ANTLR end "ruleELessThan"


    // $ANTLR start "entryRuleEGreaterOrEqual"
    // InternalRMParser.g:6464:1: entryRuleEGreaterOrEqual returns [EObject current=null] : iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF ;
    public final EObject entryRuleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterOrEqual = null;


        try {
            // InternalRMParser.g:6464:56: (iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF )
            // InternalRMParser.g:6465:2: iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF
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
    // InternalRMParser.g:6471:1: ruleEGreaterOrEqual returns [EObject current=null] : (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6477:2: ( (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6478:2: (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6478:2: (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6479:3: otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Greater_or_equal,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterOrEqualAccess().getGreater_or_equalKeyword_0());
            		
            // InternalRMParser.g:6483:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6484:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6484:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6485:5: lv_val_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getEGreaterOrEqualAccess().getValEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEGreaterOrEqualRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.RM.EAlphaNumericValue");
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
    // $ANTLR end "ruleEGreaterOrEqual"


    // $ANTLR start "entryRuleEGreaterThan"
    // InternalRMParser.g:6506:1: entryRuleEGreaterThan returns [EObject current=null] : iv_ruleEGreaterThan= ruleEGreaterThan EOF ;
    public final EObject entryRuleEGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterThan = null;


        try {
            // InternalRMParser.g:6506:53: (iv_ruleEGreaterThan= ruleEGreaterThan EOF )
            // InternalRMParser.g:6507:2: iv_ruleEGreaterThan= ruleEGreaterThan EOF
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
    // InternalRMParser.g:6513:1: ruleEGreaterThan returns [EObject current=null] : (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6519:2: ( (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6520:2: (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6520:2: (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6521:3: otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Greater_than,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterThanAccess().getGreater_thanKeyword_0());
            		
            // InternalRMParser.g:6525:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6526:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6526:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6527:5: lv_val_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getEGreaterThanAccess().getValEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEGreaterThanRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.RM.EAlphaNumericValue");
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
    // $ANTLR end "ruleEGreaterThan"


    // $ANTLR start "entryRuleEEqual"
    // InternalRMParser.g:6548:1: entryRuleEEqual returns [EObject current=null] : iv_ruleEEqual= ruleEEqual EOF ;
    public final EObject entryRuleEEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEqual = null;


        try {
            // InternalRMParser.g:6548:47: (iv_ruleEEqual= ruleEEqual EOF )
            // InternalRMParser.g:6549:2: iv_ruleEEqual= ruleEEqual EOF
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
    // InternalRMParser.g:6555:1: ruleEEqual returns [EObject current=null] : (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) ) ;
    public final EObject ruleEEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6561:2: ( (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) ) )
            // InternalRMParser.g:6562:2: (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) )
            {
            // InternalRMParser.g:6562:2: (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) )
            // InternalRMParser.g:6563:3: otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) )
            {
            otherlv_0=(Token)match(input,Equal,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getEEqualAccess().getEqualKeyword_0());
            		
            // InternalRMParser.g:6567:3: ( (lv_val_1_0= ruleESingleValue ) )
            // InternalRMParser.g:6568:4: (lv_val_1_0= ruleESingleValue )
            {
            // InternalRMParser.g:6568:4: (lv_val_1_0= ruleESingleValue )
            // InternalRMParser.g:6569:5: lv_val_1_0= ruleESingleValue
            {

            					newCompositeNode(grammarAccess.getEEqualAccess().getValESingleValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleESingleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEEqualRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.RM.ESingleValue");
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
    // $ANTLR end "ruleEEqual"


    // $ANTLR start "entryRuleEAssignmentValue"
    // InternalRMParser.g:6590:1: entryRuleEAssignmentValue returns [EObject current=null] : iv_ruleEAssignmentValue= ruleEAssignmentValue EOF ;
    public final EObject entryRuleEAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssignmentValue = null;


        try {
            // InternalRMParser.g:6590:57: (iv_ruleEAssignmentValue= ruleEAssignmentValue EOF )
            // InternalRMParser.g:6591:2: iv_ruleEAssignmentValue= ruleEAssignmentValue EOF
            {
             newCompositeNode(grammarAccess.getEAssignmentValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAssignmentValue=ruleEAssignmentValue();

            state._fsp--;

             current =iv_ruleEAssignmentValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAssignmentValue"


    // $ANTLR start "ruleEAssignmentValue"
    // InternalRMParser.g:6597:1: ruleEAssignmentValue returns [EObject current=null] : (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction ) ;
    public final EObject ruleEAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject this_ESingleValue_0 = null;

        EObject this_ELIST_1 = null;

        EObject this_EMAP_2 = null;

        EObject this_EFunction_3 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6603:2: ( (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction ) )
            // InternalRMParser.g:6604:2: (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction )
            {
            // InternalRMParser.g:6604:2: (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction )
            int alt51=4;
            switch ( input.LA(1) ) {
            case HyphenMinus:
            case FullStop:
            case RULE_BOOLEAN:
            case RULE_INT:
            case RULE_STRING:
                {
                alt51=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt51=2;
                }
                break;
            case RULE_BEGIN:
                {
                alt51=3;
                }
                break;
            case Get_attribute:
            case Get_property:
            case Get_input:
                {
                alt51=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalRMParser.g:6605:3: this_ESingleValue_0= ruleESingleValue
                    {

                    			newCompositeNode(grammarAccess.getEAssignmentValueAccess().getESingleValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESingleValue_0=ruleESingleValue();

                    state._fsp--;


                    			current = this_ESingleValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRMParser.g:6614:3: this_ELIST_1= ruleELIST
                    {

                    			newCompositeNode(grammarAccess.getEAssignmentValueAccess().getELISTParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ELIST_1=ruleELIST();

                    state._fsp--;


                    			current = this_ELIST_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRMParser.g:6623:3: this_EMAP_2= ruleEMAP
                    {

                    			newCompositeNode(grammarAccess.getEAssignmentValueAccess().getEMAPParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EMAP_2=ruleEMAP();

                    state._fsp--;


                    			current = this_EMAP_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRMParser.g:6632:3: this_EFunction_3= ruleEFunction
                    {

                    			newCompositeNode(grammarAccess.getEAssignmentValueAccess().getEFunctionParserRuleCall_3());
                    		
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
    // $ANTLR end "ruleEAssignmentValue"


    // $ANTLR start "entryRuleESingleValue"
    // InternalRMParser.g:6644:1: entryRuleESingleValue returns [EObject current=null] : iv_ruleESingleValue= ruleESingleValue EOF ;
    public final EObject entryRuleESingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESingleValue = null;


        try {
            // InternalRMParser.g:6644:53: (iv_ruleESingleValue= ruleESingleValue EOF )
            // InternalRMParser.g:6645:2: iv_ruleESingleValue= ruleESingleValue EOF
            {
             newCompositeNode(grammarAccess.getESingleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESingleValue=ruleESingleValue();

            state._fsp--;

             current =iv_ruleESingleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleESingleValue"


    // $ANTLR start "ruleESingleValue"
    // InternalRMParser.g:6651:1: ruleESingleValue returns [EObject current=null] : (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT ) ;
    public final EObject ruleESingleValue() throws RecognitionException {
        EObject current = null;

        EObject this_ESTRING_0 = null;

        EObject this_EBOOLEAN_1 = null;

        EObject this_EFLOAT_2 = null;

        EObject this_ESIGNEDINT_3 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6657:2: ( (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT ) )
            // InternalRMParser.g:6658:2: (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT )
            {
            // InternalRMParser.g:6658:2: (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT )
            int alt52=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt52=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt52=2;
                }
                break;
            case RULE_INT:
                {
                int LA52_3 = input.LA(2);

                if ( (LA52_3==EOF||LA52_3==Greater_or_equal||LA52_3==Less_or_equal||LA52_3==Entry_schema||LA52_3==Greater_than||(LA52_3>=Valid_values && LA52_3<=Description)||(LA52_3>=Max_length && LA52_3<=Min_length)||LA52_3==Less_than||LA52_3==In_range||(LA52_3>=Required && LA52_3<=Default)||LA52_3==Length||(LA52_3>=Status && LA52_3<=Value)||LA52_3==Type||LA52_3==RULE_ID||LA52_3==RULE_END) ) {
                    alt52=4;
                }
                else if ( (LA52_3==FullStop) ) {
                    alt52=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 3, input);

                    throw nvae;
                }
                }
                break;
            case FullStop:
                {
                alt52=3;
                }
                break;
            case HyphenMinus:
                {
                alt52=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalRMParser.g:6659:3: this_ESTRING_0= ruleESTRING
                    {

                    			newCompositeNode(grammarAccess.getESingleValueAccess().getESTRINGParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESTRING_0=ruleESTRING();

                    state._fsp--;


                    			current = this_ESTRING_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRMParser.g:6668:3: this_EBOOLEAN_1= ruleEBOOLEAN
                    {

                    			newCompositeNode(grammarAccess.getESingleValueAccess().getEBOOLEANParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EBOOLEAN_1=ruleEBOOLEAN();

                    state._fsp--;


                    			current = this_EBOOLEAN_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRMParser.g:6677:3: this_EFLOAT_2= ruleEFLOAT
                    {

                    			newCompositeNode(grammarAccess.getESingleValueAccess().getEFLOATParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFLOAT_2=ruleEFLOAT();

                    state._fsp--;


                    			current = this_EFLOAT_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRMParser.g:6686:3: this_ESIGNEDINT_3= ruleESIGNEDINT
                    {

                    			newCompositeNode(grammarAccess.getESingleValueAccess().getESIGNEDINTParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESIGNEDINT_3=ruleESIGNEDINT();

                    state._fsp--;


                    			current = this_ESIGNEDINT_3;
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
    // $ANTLR end "ruleESingleValue"


    // $ANTLR start "entryRuleEAlphaNumericValue"
    // InternalRMParser.g:6698:1: entryRuleEAlphaNumericValue returns [EObject current=null] : iv_ruleEAlphaNumericValue= ruleEAlphaNumericValue EOF ;
    public final EObject entryRuleEAlphaNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAlphaNumericValue = null;


        try {
            // InternalRMParser.g:6698:59: (iv_ruleEAlphaNumericValue= ruleEAlphaNumericValue EOF )
            // InternalRMParser.g:6699:2: iv_ruleEAlphaNumericValue= ruleEAlphaNumericValue EOF
            {
             newCompositeNode(grammarAccess.getEAlphaNumericValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAlphaNumericValue=ruleEAlphaNumericValue();

            state._fsp--;

             current =iv_ruleEAlphaNumericValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAlphaNumericValue"


    // $ANTLR start "ruleEAlphaNumericValue"
    // InternalRMParser.g:6705:1: ruleEAlphaNumericValue returns [EObject current=null] : (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT ) ;
    public final EObject ruleEAlphaNumericValue() throws RecognitionException {
        EObject current = null;

        EObject this_ESTRING_0 = null;

        EObject this_EFLOAT_1 = null;

        EObject this_ESIGNEDINT_2 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6711:2: ( (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT ) )
            // InternalRMParser.g:6712:2: (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT )
            {
            // InternalRMParser.g:6712:2: (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT )
            int alt53=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt53=1;
                }
                break;
            case RULE_INT:
                {
                int LA53_2 = input.LA(2);

                if ( (LA53_2==EOF||LA53_2==Greater_or_equal||LA53_2==Less_or_equal||LA53_2==Greater_than||LA53_2==Valid_values||(LA53_2>=Max_length && LA53_2<=Min_length)||LA53_2==Less_than||LA53_2==In_range||LA53_2==Length||LA53_2==Equal||LA53_2==Comma||LA53_2==RightSquareBracket||LA53_2==RULE_END) ) {
                    alt53=3;
                }
                else if ( (LA53_2==FullStop) ) {
                    alt53=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;
                }
                }
                break;
            case FullStop:
                {
                alt53=2;
                }
                break;
            case HyphenMinus:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalRMParser.g:6713:3: this_ESTRING_0= ruleESTRING
                    {

                    			newCompositeNode(grammarAccess.getEAlphaNumericValueAccess().getESTRINGParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESTRING_0=ruleESTRING();

                    state._fsp--;


                    			current = this_ESTRING_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRMParser.g:6722:3: this_EFLOAT_1= ruleEFLOAT
                    {

                    			newCompositeNode(grammarAccess.getEAlphaNumericValueAccess().getEFLOATParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFLOAT_1=ruleEFLOAT();

                    state._fsp--;


                    			current = this_EFLOAT_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRMParser.g:6731:3: this_ESIGNEDINT_2= ruleESIGNEDINT
                    {

                    			newCompositeNode(grammarAccess.getEAlphaNumericValueAccess().getESIGNEDINTParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESIGNEDINT_2=ruleESIGNEDINT();

                    state._fsp--;


                    			current = this_ESIGNEDINT_2;
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
    // $ANTLR end "ruleEAlphaNumericValue"


    // $ANTLR start "entryRuleESTRING"
    // InternalRMParser.g:6743:1: entryRuleESTRING returns [EObject current=null] : iv_ruleESTRING= ruleESTRING EOF ;
    public final EObject entryRuleESTRING() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESTRING = null;


        try {
            // InternalRMParser.g:6743:48: (iv_ruleESTRING= ruleESTRING EOF )
            // InternalRMParser.g:6744:2: iv_ruleESTRING= ruleESTRING EOF
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
    // InternalRMParser.g:6750:1: ruleESTRING returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleESTRING() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:6756:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalRMParser.g:6757:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalRMParser.g:6757:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalRMParser.g:6758:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalRMParser.g:6758:3: (lv_value_0_0= RULE_STRING )
            // InternalRMParser.g:6759:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getESTRINGAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getESTRINGRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
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


    // $ANTLR start "entryRuleEBOOLEAN"
    // InternalRMParser.g:6778:1: entryRuleEBOOLEAN returns [EObject current=null] : iv_ruleEBOOLEAN= ruleEBOOLEAN EOF ;
    public final EObject entryRuleEBOOLEAN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBOOLEAN = null;


        try {
            // InternalRMParser.g:6778:49: (iv_ruleEBOOLEAN= ruleEBOOLEAN EOF )
            // InternalRMParser.g:6779:2: iv_ruleEBOOLEAN= ruleEBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getEBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBOOLEAN=ruleEBOOLEAN();

            state._fsp--;

             current =iv_ruleEBOOLEAN; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBOOLEAN"


    // $ANTLR start "ruleEBOOLEAN"
    // InternalRMParser.g:6785:1: ruleEBOOLEAN returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleEBOOLEAN() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:6791:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalRMParser.g:6792:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalRMParser.g:6792:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalRMParser.g:6793:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalRMParser.g:6793:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalRMParser.g:6794:4: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getEBOOLEANAccess().getValueBOOLEANTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEBOOLEANRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.sodalite.dsl.RM.BOOLEAN");
            			

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
    // $ANTLR end "ruleEBOOLEAN"


    // $ANTLR start "entryRuleEFLOAT"
    // InternalRMParser.g:6813:1: entryRuleEFLOAT returns [EObject current=null] : iv_ruleEFLOAT= ruleEFLOAT EOF ;
    public final EObject entryRuleEFLOAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFLOAT = null;


        try {
            // InternalRMParser.g:6813:47: (iv_ruleEFLOAT= ruleEFLOAT EOF )
            // InternalRMParser.g:6814:2: iv_ruleEFLOAT= ruleEFLOAT EOF
            {
             newCompositeNode(grammarAccess.getEFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFLOAT=ruleEFLOAT();

            state._fsp--;

             current =iv_ruleEFLOAT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFLOAT"


    // $ANTLR start "ruleEFLOAT"
    // InternalRMParser.g:6820:1: ruleEFLOAT returns [EObject current=null] : ( (lv_value_0_0= ruleFLOAT ) ) ;
    public final EObject ruleEFLOAT() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6826:2: ( ( (lv_value_0_0= ruleFLOAT ) ) )
            // InternalRMParser.g:6827:2: ( (lv_value_0_0= ruleFLOAT ) )
            {
            // InternalRMParser.g:6827:2: ( (lv_value_0_0= ruleFLOAT ) )
            // InternalRMParser.g:6828:3: (lv_value_0_0= ruleFLOAT )
            {
            // InternalRMParser.g:6828:3: (lv_value_0_0= ruleFLOAT )
            // InternalRMParser.g:6829:4: lv_value_0_0= ruleFLOAT
            {

            				newCompositeNode(grammarAccess.getEFLOATAccess().getValueFLOATParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleFLOAT();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEFLOATRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.sodalite.dsl.RM.FLOAT");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleEFLOAT"


    // $ANTLR start "entryRuleESIGNEDINT"
    // InternalRMParser.g:6849:1: entryRuleESIGNEDINT returns [EObject current=null] : iv_ruleESIGNEDINT= ruleESIGNEDINT EOF ;
    public final EObject entryRuleESIGNEDINT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESIGNEDINT = null;


        try {
            // InternalRMParser.g:6849:51: (iv_ruleESIGNEDINT= ruleESIGNEDINT EOF )
            // InternalRMParser.g:6850:2: iv_ruleESIGNEDINT= ruleESIGNEDINT EOF
            {
             newCompositeNode(grammarAccess.getESIGNEDINTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESIGNEDINT=ruleESIGNEDINT();

            state._fsp--;

             current =iv_ruleESIGNEDINT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleESIGNEDINT"


    // $ANTLR start "ruleESIGNEDINT"
    // InternalRMParser.g:6856:1: ruleESIGNEDINT returns [EObject current=null] : ( (lv_value_0_0= ruleSIGNEDINT ) ) ;
    public final EObject ruleESIGNEDINT() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6862:2: ( ( (lv_value_0_0= ruleSIGNEDINT ) ) )
            // InternalRMParser.g:6863:2: ( (lv_value_0_0= ruleSIGNEDINT ) )
            {
            // InternalRMParser.g:6863:2: ( (lv_value_0_0= ruleSIGNEDINT ) )
            // InternalRMParser.g:6864:3: (lv_value_0_0= ruleSIGNEDINT )
            {
            // InternalRMParser.g:6864:3: (lv_value_0_0= ruleSIGNEDINT )
            // InternalRMParser.g:6865:4: lv_value_0_0= ruleSIGNEDINT
            {

            				newCompositeNode(grammarAccess.getESIGNEDINTAccess().getValueSIGNEDINTParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleSIGNEDINT();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getESIGNEDINTRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.sodalite.dsl.RM.SIGNEDINT");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleESIGNEDINT"


    // $ANTLR start "entryRuleEMAP"
    // InternalRMParser.g:6885:1: entryRuleEMAP returns [EObject current=null] : iv_ruleEMAP= ruleEMAP EOF ;
    public final EObject entryRuleEMAP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMAP = null;


        try {
            // InternalRMParser.g:6885:45: (iv_ruleEMAP= ruleEMAP EOF )
            // InternalRMParser.g:6886:2: iv_ruleEMAP= ruleEMAP EOF
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
    // InternalRMParser.g:6892:1: ruleEMAP returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END ) ;
    public final EObject ruleEMAP() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token this_END_2=null;
        EObject lv_map_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6898:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END ) )
            // InternalRMParser.g:6899:2: (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END )
            {
            // InternalRMParser.g:6899:2: (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END )
            // InternalRMParser.g:6900:3: this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getEMAPAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalRMParser.g:6904:3: ( (lv_map_1_0= ruleEMapEntry ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalRMParser.g:6905:4: (lv_map_1_0= ruleEMapEntry )
            	    {
            	    // InternalRMParser.g:6905:4: (lv_map_1_0= ruleEMapEntry )
            	    // InternalRMParser.g:6906:5: lv_map_1_0= ruleEMapEntry
            	    {

            	    					newCompositeNode(grammarAccess.getEMAPAccess().getMapEMapEntryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            this_END_2=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_2, grammarAccess.getEMAPAccess().getENDTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

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
    // InternalRMParser.g:6931:1: entryRuleEMapEntry returns [EObject current=null] : iv_ruleEMapEntry= ruleEMapEntry EOF ;
    public final EObject entryRuleEMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMapEntry = null;


        try {
            // InternalRMParser.g:6931:50: (iv_ruleEMapEntry= ruleEMapEntry EOF )
            // InternalRMParser.g:6932:2: iv_ruleEMapEntry= ruleEMapEntry EOF
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
    // InternalRMParser.g:6938:1: ruleEMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) ) ;
    public final EObject ruleEMapEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6944:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) ) )
            // InternalRMParser.g:6945:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) )
            {
            // InternalRMParser.g:6945:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) )
            // InternalRMParser.g:6946:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) )
            {
            // InternalRMParser.g:6946:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalRMParser.g:6947:4: (lv_key_0_0= RULE_ID )
            {
            // InternalRMParser.g:6947:4: (lv_key_0_0= RULE_ID )
            // InternalRMParser.g:6948:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getEMapEntryAccess().getColonKeyword_1());
            		
            // InternalRMParser.g:6968:3: ( (lv_value_2_0= ruleEAssignmentValue ) )
            // InternalRMParser.g:6969:4: (lv_value_2_0= ruleEAssignmentValue )
            {
            // InternalRMParser.g:6969:4: (lv_value_2_0= ruleEAssignmentValue )
            // InternalRMParser.g:6970:5: lv_value_2_0= ruleEAssignmentValue
            {

            					newCompositeNode(grammarAccess.getEMapEntryAccess().getValueEAssignmentValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEAssignmentValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEMapEntryRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.sodalite.dsl.RM.EAssignmentValue");
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


    // $ANTLR start "entryRuleEEntityReference"
    // InternalRMParser.g:6991:1: entryRuleEEntityReference returns [EObject current=null] : iv_ruleEEntityReference= ruleEEntityReference EOF ;
    public final EObject entryRuleEEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEntityReference = null;


        try {
            // InternalRMParser.g:6991:57: (iv_ruleEEntityReference= ruleEEntityReference EOF )
            // InternalRMParser.g:6992:2: iv_ruleEEntityReference= ruleEEntityReference EOF
            {
             newCompositeNode(grammarAccess.getEEntityReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEntityReference=ruleEEntityReference();

            state._fsp--;

             current =iv_ruleEEntityReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEEntityReference"


    // $ANTLR start "ruleEEntityReference"
    // InternalRMParser.g:6998:1: ruleEEntityReference returns [EObject current=null] : (this_EEntity_0= ruleEEntity | this_EPREFIX_TYPE_1= ruleEPREFIX_TYPE | this_EPREFIX_ID_2= ruleEPREFIX_ID ) ;
    public final EObject ruleEEntityReference() throws RecognitionException {
        EObject current = null;

        EObject this_EEntity_0 = null;

        EObject this_EPREFIX_TYPE_1 = null;

        EObject this_EPREFIX_ID_2 = null;



        	enterRule();

        try {
            // InternalRMParser.g:7004:2: ( (this_EEntity_0= ruleEEntity | this_EPREFIX_TYPE_1= ruleEPREFIX_TYPE | this_EPREFIX_ID_2= ruleEPREFIX_ID ) )
            // InternalRMParser.g:7005:2: (this_EEntity_0= ruleEEntity | this_EPREFIX_TYPE_1= ruleEPREFIX_TYPE | this_EPREFIX_ID_2= ruleEPREFIX_ID )
            {
            // InternalRMParser.g:7005:2: (this_EEntity_0= ruleEEntity | this_EPREFIX_TYPE_1= ruleEPREFIX_TYPE | this_EPREFIX_ID_2= ruleEPREFIX_ID )
            int alt55=3;
            switch ( input.LA(1) ) {
            case RULE_ENTITY:
                {
                alt55=1;
                }
                break;
            case RULE_ID:
                {
                int LA55_2 = input.LA(2);

                if ( (LA55_2==EOF||LA55_2==Attribute||LA55_2==Property||LA55_2==Req_cap||LA55_2==Entity||LA55_2==RULE_END) ) {
                    alt55=3;
                }
                else if ( (LA55_2==Solidus) ) {
                    int LA55_5 = input.LA(3);

                    if ( (LA55_5==RULE_ID) ) {
                        alt55=3;
                    }
                    else if ( (LA55_5==RULE_QUALIFIED_NAME) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_QUALIFIED_NAME:
                {
                alt55=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalRMParser.g:7006:3: this_EEntity_0= ruleEEntity
                    {

                    			newCompositeNode(grammarAccess.getEEntityReferenceAccess().getEEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EEntity_0=ruleEEntity();

                    state._fsp--;


                    			current = this_EEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRMParser.g:7015:3: this_EPREFIX_TYPE_1= ruleEPREFIX_TYPE
                    {

                    			newCompositeNode(grammarAccess.getEEntityReferenceAccess().getEPREFIX_TYPEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EPREFIX_TYPE_1=ruleEPREFIX_TYPE();

                    state._fsp--;


                    			current = this_EPREFIX_TYPE_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRMParser.g:7024:3: this_EPREFIX_ID_2= ruleEPREFIX_ID
                    {

                    			newCompositeNode(grammarAccess.getEEntityReferenceAccess().getEPREFIX_IDParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EPREFIX_ID_2=ruleEPREFIX_ID();

                    state._fsp--;


                    			current = this_EPREFIX_ID_2;
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
    // $ANTLR end "ruleEEntityReference"


    // $ANTLR start "entryRuleEPREFIX_TYPE"
    // InternalRMParser.g:7036:1: entryRuleEPREFIX_TYPE returns [EObject current=null] : iv_ruleEPREFIX_TYPE= ruleEPREFIX_TYPE EOF ;
    public final EObject entryRuleEPREFIX_TYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPREFIX_TYPE = null;


        try {
            // InternalRMParser.g:7036:53: (iv_ruleEPREFIX_TYPE= ruleEPREFIX_TYPE EOF )
            // InternalRMParser.g:7037:2: iv_ruleEPREFIX_TYPE= ruleEPREFIX_TYPE EOF
            {
             newCompositeNode(grammarAccess.getEPREFIX_TYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPREFIX_TYPE=ruleEPREFIX_TYPE();

            state._fsp--;

             current =iv_ruleEPREFIX_TYPE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPREFIX_TYPE"


    // $ANTLR start "ruleEPREFIX_TYPE"
    // InternalRMParser.g:7043:1: ruleEPREFIX_TYPE returns [EObject current=null] : ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ;
    public final EObject ruleEPREFIX_TYPE() throws RecognitionException {
        EObject current = null;

        Token lv_module_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:7049:2: ( ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) )
            // InternalRMParser.g:7050:2: ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) )
            {
            // InternalRMParser.g:7050:2: ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) )
            // InternalRMParser.g:7051:3: ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_type_2_0= RULE_QUALIFIED_NAME ) )
            {
            // InternalRMParser.g:7051:3: ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRMParser.g:7052:4: ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus
                    {
                    // InternalRMParser.g:7052:4: ( (lv_module_0_0= RULE_ID ) )
                    // InternalRMParser.g:7053:5: (lv_module_0_0= RULE_ID )
                    {
                    // InternalRMParser.g:7053:5: (lv_module_0_0= RULE_ID )
                    // InternalRMParser.g:7054:6: lv_module_0_0= RULE_ID
                    {
                    lv_module_0_0=(Token)match(input,RULE_ID,FOLLOW_67); 

                    						newLeafNode(lv_module_0_0, grammarAccess.getEPREFIX_TYPEAccess().getModuleIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPREFIX_TYPERule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"module",
                    							lv_module_0_0,
                    							"org.sodalite.dsl.RM.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,Solidus,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPREFIX_TYPEAccess().getSolidusKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalRMParser.g:7075:3: ( (lv_type_2_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:7076:4: (lv_type_2_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:7076:4: (lv_type_2_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:7077:5: lv_type_2_0= RULE_QUALIFIED_NAME
            {
            lv_type_2_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getEPREFIX_TYPEAccess().getTypeQUALIFIED_NAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPREFIX_TYPERule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.sodalite.dsl.RM.QUALIFIED_NAME");
            				

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
    // $ANTLR end "ruleEPREFIX_TYPE"


    // $ANTLR start "entryRuleEPREFIX_ID"
    // InternalRMParser.g:7097:1: entryRuleEPREFIX_ID returns [EObject current=null] : iv_ruleEPREFIX_ID= ruleEPREFIX_ID EOF ;
    public final EObject entryRuleEPREFIX_ID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPREFIX_ID = null;


        try {
            // InternalRMParser.g:7097:51: (iv_ruleEPREFIX_ID= ruleEPREFIX_ID EOF )
            // InternalRMParser.g:7098:2: iv_ruleEPREFIX_ID= ruleEPREFIX_ID EOF
            {
             newCompositeNode(grammarAccess.getEPREFIX_IDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPREFIX_ID=ruleEPREFIX_ID();

            state._fsp--;

             current =iv_ruleEPREFIX_ID; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPREFIX_ID"


    // $ANTLR start "ruleEPREFIX_ID"
    // InternalRMParser.g:7104:1: ruleEPREFIX_ID returns [EObject current=null] : ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_id_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEPREFIX_ID() throws RecognitionException {
        EObject current = null;

        Token lv_module_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:7110:2: ( ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_id_2_0= RULE_ID ) ) ) )
            // InternalRMParser.g:7111:2: ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_id_2_0= RULE_ID ) ) )
            {
            // InternalRMParser.g:7111:2: ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_id_2_0= RULE_ID ) ) )
            // InternalRMParser.g:7112:3: ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_id_2_0= RULE_ID ) )
            {
            // InternalRMParser.g:7112:3: ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==Solidus) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // InternalRMParser.g:7113:4: ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus
                    {
                    // InternalRMParser.g:7113:4: ( (lv_module_0_0= RULE_ID ) )
                    // InternalRMParser.g:7114:5: (lv_module_0_0= RULE_ID )
                    {
                    // InternalRMParser.g:7114:5: (lv_module_0_0= RULE_ID )
                    // InternalRMParser.g:7115:6: lv_module_0_0= RULE_ID
                    {
                    lv_module_0_0=(Token)match(input,RULE_ID,FOLLOW_67); 

                    						newLeafNode(lv_module_0_0, grammarAccess.getEPREFIX_IDAccess().getModuleIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPREFIX_IDRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"module",
                    							lv_module_0_0,
                    							"org.sodalite.dsl.RM.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,Solidus,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPREFIX_IDAccess().getSolidusKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalRMParser.g:7136:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalRMParser.g:7137:4: (lv_id_2_0= RULE_ID )
            {
            // InternalRMParser.g:7137:4: (lv_id_2_0= RULE_ID )
            // InternalRMParser.g:7138:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_2_0, grammarAccess.getEPREFIX_IDAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPREFIX_IDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.sodalite.dsl.RM.ID");
            				

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
    // $ANTLR end "ruleEPREFIX_ID"


    // $ANTLR start "entryRuleEPRIMITIVE_TYPE"
    // InternalRMParser.g:7158:1: entryRuleEPRIMITIVE_TYPE returns [EObject current=null] : iv_ruleEPRIMITIVE_TYPE= ruleEPRIMITIVE_TYPE EOF ;
    public final EObject entryRuleEPRIMITIVE_TYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPRIMITIVE_TYPE = null;


        try {
            // InternalRMParser.g:7158:56: (iv_ruleEPRIMITIVE_TYPE= ruleEPRIMITIVE_TYPE EOF )
            // InternalRMParser.g:7159:2: iv_ruleEPRIMITIVE_TYPE= ruleEPRIMITIVE_TYPE EOF
            {
             newCompositeNode(grammarAccess.getEPRIMITIVE_TYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPRIMITIVE_TYPE=ruleEPRIMITIVE_TYPE();

            state._fsp--;

             current =iv_ruleEPRIMITIVE_TYPE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPRIMITIVE_TYPE"


    // $ANTLR start "ruleEPRIMITIVE_TYPE"
    // InternalRMParser.g:7165:1: ruleEPRIMITIVE_TYPE returns [EObject current=null] : ( (lv_type_0_0= RULE_ID ) ) ;
    public final EObject ruleEPRIMITIVE_TYPE() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:7171:2: ( ( (lv_type_0_0= RULE_ID ) ) )
            // InternalRMParser.g:7172:2: ( (lv_type_0_0= RULE_ID ) )
            {
            // InternalRMParser.g:7172:2: ( (lv_type_0_0= RULE_ID ) )
            // InternalRMParser.g:7173:3: (lv_type_0_0= RULE_ID )
            {
            // InternalRMParser.g:7173:3: (lv_type_0_0= RULE_ID )
            // InternalRMParser.g:7174:4: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_type_0_0, grammarAccess.getEPRIMITIVE_TYPEAccess().getTypeIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEPRIMITIVE_TYPERule());
            				}
            				setWithLastConsumed(
            					current,
            					"type",
            					lv_type_0_0,
            					"org.sodalite.dsl.RM.ID");
            			

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
    // $ANTLR end "ruleEPRIMITIVE_TYPE"


    // $ANTLR start "entryRuleEEntity"
    // InternalRMParser.g:7193:1: entryRuleEEntity returns [EObject current=null] : iv_ruleEEntity= ruleEEntity EOF ;
    public final EObject entryRuleEEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEntity = null;


        try {
            // InternalRMParser.g:7193:48: (iv_ruleEEntity= ruleEEntity EOF )
            // InternalRMParser.g:7194:2: iv_ruleEEntity= ruleEEntity EOF
            {
             newCompositeNode(grammarAccess.getEEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEntity=ruleEEntity();

            state._fsp--;

             current =iv_ruleEEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEEntity"


    // $ANTLR start "ruleEEntity"
    // InternalRMParser.g:7200:1: ruleEEntity returns [EObject current=null] : ( (lv_entity_0_0= RULE_ENTITY ) ) ;
    public final EObject ruleEEntity() throws RecognitionException {
        EObject current = null;

        Token lv_entity_0_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:7206:2: ( ( (lv_entity_0_0= RULE_ENTITY ) ) )
            // InternalRMParser.g:7207:2: ( (lv_entity_0_0= RULE_ENTITY ) )
            {
            // InternalRMParser.g:7207:2: ( (lv_entity_0_0= RULE_ENTITY ) )
            // InternalRMParser.g:7208:3: (lv_entity_0_0= RULE_ENTITY )
            {
            // InternalRMParser.g:7208:3: (lv_entity_0_0= RULE_ENTITY )
            // InternalRMParser.g:7209:4: lv_entity_0_0= RULE_ENTITY
            {
            lv_entity_0_0=(Token)match(input,RULE_ENTITY,FOLLOW_2); 

            				newLeafNode(lv_entity_0_0, grammarAccess.getEEntityAccess().getEntityENTITYTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEEntityRule());
            				}
            				setWithLastConsumed(
            					current,
            					"entity",
            					lv_entity_0_0,
            					"org.sodalite.dsl.RM.ENTITY");
            			

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
    // $ANTLR end "ruleEEntity"


    // $ANTLR start "entryRuleSIGNEDINT"
    // InternalRMParser.g:7228:1: entryRuleSIGNEDINT returns [String current=null] : iv_ruleSIGNEDINT= ruleSIGNEDINT EOF ;
    public final String entryRuleSIGNEDINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNEDINT = null;


        try {
            // InternalRMParser.g:7228:49: (iv_ruleSIGNEDINT= ruleSIGNEDINT EOF )
            // InternalRMParser.g:7229:2: iv_ruleSIGNEDINT= ruleSIGNEDINT EOF
            {
             newCompositeNode(grammarAccess.getSIGNEDINTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSIGNEDINT=ruleSIGNEDINT();

            state._fsp--;

             current =iv_ruleSIGNEDINT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSIGNEDINT"


    // $ANTLR start "ruleSIGNEDINT"
    // InternalRMParser.g:7235:1: ruleSIGNEDINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSIGNEDINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRMParser.g:7241:2: ( ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) )
            // InternalRMParser.g:7242:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            {
            // InternalRMParser.g:7242:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            // InternalRMParser.g:7243:3: (kw= HyphenMinus )? this_INT_1= RULE_INT
            {
            // InternalRMParser.g:7243:3: (kw= HyphenMinus )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==HyphenMinus) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRMParser.g:7244:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_68); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSIGNEDINTAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getSIGNEDINTAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSIGNEDINT"


    // $ANTLR start "entryRuleFLOAT"
    // InternalRMParser.g:7261:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalRMParser.g:7261:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalRMParser.g:7262:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalRMParser.g:7268:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalRMParser.g:7274:2: ( ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT ) )
            // InternalRMParser.g:7275:2: ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT )
            {
            // InternalRMParser.g:7275:2: ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT )
            // InternalRMParser.g:7276:3: (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT
            {
            // InternalRMParser.g:7276:3: (this_INT_0= RULE_INT )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_INT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRMParser.g:7277:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_69); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,FullStop,FOLLOW_68); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\1\12\uffff";
    static final String dfa_3s = "\1\4\12\uffff";
    static final String dfa_4s = "\1\65\12\uffff";
    static final String dfa_5s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_6s = "\1\0\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\10\2\uffff\1\6\1\uffff\1\7\1\5\12\uffff\1\12\10\uffff\1\4\3\uffff\1\11\17\uffff\1\3\2\uffff\1\2",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 77:5: ( ({...}? => ( ({...}? => (otherlv_1= Module ( (lv_module_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Import ( (lv_imports_4_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_5= Data_types this_BEGIN_6= RULE_BEGIN ( (lv_dataTypes_7_0= ruleEDataTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Artifact_types this_BEGIN_10= RULE_BEGIN ( (lv_artifactTypes_11_0= ruleEArtifactTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Capability_types this_BEGIN_14= RULE_BEGIN ( (lv_capabilityTypes_15_0= ruleECapabilityTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Interface_types this_BEGIN_18= RULE_BEGIN ( (lv_interfaceTypes_19_0= ruleEInterfaceTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Relationship_types this_BEGIN_22= RULE_BEGIN ( (lv_relationshipTypes_23_0= ruleERelationshipTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Node_types this_BEGIN_26= RULE_BEGIN ( (lv_nodeTypes_27_0= ruleENodeTypes ) ) this_END_28= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Policy_types this_BEGIN_30= RULE_BEGIN ( (lv_policyTypes_31_0= ruleEPolicyTypes ) ) this_END_32= RULE_END ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_0 = input.LA(1);

                         
                        int index2_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_0==EOF) ) {s = 1;}

                        else if ( LA2_0 == Module && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA2_0 == Import && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA2_0 == Data_types && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA2_0 == Artifact_types && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA2_0 == Capability_types && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA2_0 == Interface_types && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA2_0 == Relationship_types && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA2_0 == Node_types && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA2_0 == Policy_types && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 8) ) {s = 10;}

                         
                        input.seek(index2_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0024000440200692L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001006020000L,0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001006020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0090048301102100L,0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000030004020000L,0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000030004020002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001014020000L,0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001014020002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0008000804020000L,0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008000804020002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001001004020000L,0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001001004020002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001094828000L,0x0000000000000080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001094828002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001094020040L,0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001094020042L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0440300006040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0440300006040002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x3000004000081000L,0x0000000000000310L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0440200004040000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0440200004040002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0408000800000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0408000800000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000004000800L,0x0000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000004000802L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0500200000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0500200000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0002802000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0002802000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x000000000000002CL});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0002880000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0002880000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x040000101C000020L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x040000101C000022L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x3000000000000000L,0x0000000000000310L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0200000028400000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0200000028400002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0090048301102102L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x3000004000081000L,0x0000000000000351L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x2000000000000000L});

}
