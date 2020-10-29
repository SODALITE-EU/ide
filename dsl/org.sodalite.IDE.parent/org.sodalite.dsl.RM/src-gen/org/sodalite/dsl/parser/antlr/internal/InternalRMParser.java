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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Relationship_types", "Valid_source_types", "Valid_target_types", "Capability_types", "Greater_or_equal", "Interface_types", "Artifact_types", "Implementation", "Get_attribute", "Less_or_equal", "Relative_path", "Capabilities", "Dependencies", "Derived_from", "Entry_schema", "Get_property", "Greater_than", "Policy_types", "Relationship", "Requirements", "Valid_values", "Constraints", "Description", "Occurrences", "Attributes", "Capability", "Data_types", "Interfaces", "Max_length", "Min_length", "Node_types", "Operations", "Properties", "Attribute", "Get_input", "Less_than", "Mime_type", "File_ext", "In_range", "Property", "Required", "Default", "Primary", "Req_cap", "Entity", "Import", "Inputs", "Length", "Module", "Status", "Equal", "Value", "Node", "Type", "Comma", "HyphenMinus", "FullStop", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_ID", "RULE_QUALIFIED_NAME", "RULE_BOOLEAN", "RULE_ENTITY", "RULE_PRIMITIVE_DATA_TYPE", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Entity=48;
    public static final int Import=49;
    public static final int RULE_BEGIN=69;
    public static final int Mime_type=40;
    public static final int Node=56;
    public static final int Entry_schema=18;
    public static final int Attributes=28;
    public static final int Occurrences=27;
    public static final int RULE_BOOLEAN=66;
    public static final int Requirements=23;
    public static final int Valid_source_types=5;
    public static final int Node_types=34;
    public static final int Policy_types=21;
    public static final int Equal=54;
    public static final int Primary=46;
    public static final int Dependencies=16;
    public static final int Operations=35;
    public static final int RightSquareBracket=63;
    public static final int Valid_target_types=6;
    public static final int Status=53;
    public static final int RULE_QUALIFIED_NAME=65;
    public static final int Capability=29;
    public static final int RULE_ID=64;
    public static final int Less_than=39;
    public static final int Data_types=30;
    public static final int Artifact_types=10;
    public static final int Interface_types=9;
    public static final int Greater_or_equal=8;
    public static final int Constraints=25;
    public static final int RULE_INT=71;
    public static final int Value=55;
    public static final int RULE_ML_COMMENT=73;
    public static final int LeftSquareBracket=62;
    public static final int Less_or_equal=13;
    public static final int Relative_path=14;
    public static final int Module=52;
    public static final int Greater_than=20;
    public static final int Get_input=38;
    public static final int RULE_ENTITY=67;
    public static final int RULE_PRIMITIVE_DATA_TYPE=68;
    public static final int RULE_END=70;
    public static final int Description=26;
    public static final int Get_attribute=12;
    public static final int Attribute=37;
    public static final int Get_property=19;
    public static final int Valid_values=24;
    public static final int RULE_STRING=72;
    public static final int Properties=36;
    public static final int Implementation=11;
    public static final int RULE_SL_COMMENT=74;
    public static final int Max_length=32;
    public static final int Comma=58;
    public static final int HyphenMinus=59;
    public static final int Required=44;
    public static final int Capability_types=7;
    public static final int Colon=61;
    public static final int EOF=-1;
    public static final int Property=43;
    public static final int Inputs=50;
    public static final int Relationship_types=4;
    public static final int FullStop=60;
    public static final int RULE_WS=75;
    public static final int RULE_ANY_OTHER=76;
    public static final int Req_cap=47;
    public static final int Default=45;
    public static final int Interfaces=31;
    public static final int In_range=42;
    public static final int Type=57;
    public static final int Derived_from=17;
    public static final int Length=51;
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

                if ( (LA3_0==RULE_QUALIFIED_NAME||LA3_0==RULE_PRIMITIVE_DATA_TYPE) ) {
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
        AntlrDatatypeRuleToken lv_name_0_0 = null;

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
    // InternalRMParser.g:569:1: ruleEDataTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) ;
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
        EObject lv_constraints_8_0 = null;

        EObject lv_properties_12_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:575:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:576:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:576:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:577:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:577:3: ()
            // InternalRMParser.g:578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataTypeBodyAccess().getEDataTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:584:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:585:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:585:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:586:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:589:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:590:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:590:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )*
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
            	    // InternalRMParser.g:591:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:591:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:592:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:592:110: ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:593:6: ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:596:9: ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:596:10: {...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRMParser.g:596:19: (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:596:20: otherlv_2= Derived_from ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEDataTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:600:9: ( ( ruleEDataTypeName ) )
            	    // InternalRMParser.g:601:10: ( ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:601:10: ( ruleEDataTypeName )
            	    // InternalRMParser.g:602:11: ruleEDataTypeName
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEDataTypeBodyRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEDataTypeBodyAccess().getSuperTypeEDataTypeCrossReference_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_12);
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
            	    // InternalRMParser.g:622:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:622:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:623:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:623:110: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:624:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:627:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:627:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRMParser.g:627:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:627:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEDataTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:631:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:632:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:632:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:633:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRMParser.g:655:4: ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:655:4: ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:656:5: {...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:656:110: ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:657:6: ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:660:9: ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:660:10: {...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRMParser.g:660:19: (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:660:20: otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Constraints,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEDataTypeBodyAccess().getConstraintsKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getEDataTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:668:9: ( (lv_constraints_8_0= ruleEConstraints ) )
            	    // InternalRMParser.g:669:10: (lv_constraints_8_0= ruleEConstraints )
            	    {
            	    // InternalRMParser.g:669:10: (lv_constraints_8_0= ruleEConstraints )
            	    // InternalRMParser.g:670:11: lv_constraints_8_0= ruleEConstraints
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
            	    // InternalRMParser.g:697:4: ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:697:4: ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:698:5: {...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:698:110: ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:699:6: ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:702:9: ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:702:10: {...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRMParser.g:702:19: (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:702:20: otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Properties,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEDataTypeBodyAccess().getPropertiesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getEDataTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:710:9: ( (lv_properties_12_0= ruleEProperties ) )
            	    // InternalRMParser.g:711:10: (lv_properties_12_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:711:10: (lv_properties_12_0= ruleEProperties )
            	    // InternalRMParser.g:712:11: lv_properties_12_0= ruleEProperties
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
    // InternalRMParser.g:750:1: entryRuleEDataTypeName returns [String current=null] : iv_ruleEDataTypeName= ruleEDataTypeName EOF ;
    public final String entryRuleEDataTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDataTypeName = null;


        try {
            // InternalRMParser.g:750:53: (iv_ruleEDataTypeName= ruleEDataTypeName EOF )
            // InternalRMParser.g:751:2: iv_ruleEDataTypeName= ruleEDataTypeName EOF
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
    // InternalRMParser.g:757:1: ruleEDataTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE ) ;
    public final AntlrDatatypeRuleToken ruleEDataTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUALIFIED_NAME_0=null;
        Token this_PRIMITIVE_DATA_TYPE_1=null;


        	enterRule();

        try {
            // InternalRMParser.g:763:2: ( (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE ) )
            // InternalRMParser.g:764:2: (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE )
            {
            // InternalRMParser.g:764:2: (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_QUALIFIED_NAME) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_PRIMITIVE_DATA_TYPE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRMParser.g:765:3: this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME
                    {
                    this_QUALIFIED_NAME_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_2); 

                    			current.merge(this_QUALIFIED_NAME_0);
                    		

                    			newLeafNode(this_QUALIFIED_NAME_0, grammarAccess.getEDataTypeNameAccess().getQUALIFIED_NAMETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRMParser.g:773:3: this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE
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
    // InternalRMParser.g:784:1: entryRuleEArtifactTypes returns [EObject current=null] : iv_ruleEArtifactTypes= ruleEArtifactTypes EOF ;
    public final EObject entryRuleEArtifactTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactTypes = null;


        try {
            // InternalRMParser.g:784:55: (iv_ruleEArtifactTypes= ruleEArtifactTypes EOF )
            // InternalRMParser.g:785:2: iv_ruleEArtifactTypes= ruleEArtifactTypes EOF
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
    // InternalRMParser.g:791:1: ruleEArtifactTypes returns [EObject current=null] : ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ ) ;
    public final EObject ruleEArtifactTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_artifactTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:797:2: ( ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ ) )
            // InternalRMParser.g:798:2: ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ )
            {
            // InternalRMParser.g:798:2: ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ )
            // InternalRMParser.g:799:3: () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+
            {
            // InternalRMParser.g:799:3: ()
            // InternalRMParser.g:800:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEArtifactTypesAccess().getEArtifactTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:806:3: ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+
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
            	    // InternalRMParser.g:807:4: (lv_artifactTypes_1_0= ruleEArtifactType )
            	    {
            	    // InternalRMParser.g:807:4: (lv_artifactTypes_1_0= ruleEArtifactType )
            	    // InternalRMParser.g:808:5: lv_artifactTypes_1_0= ruleEArtifactType
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
    // InternalRMParser.g:829:1: entryRuleEArtifactType returns [EObject current=null] : iv_ruleEArtifactType= ruleEArtifactType EOF ;
    public final EObject entryRuleEArtifactType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactType = null;


        try {
            // InternalRMParser.g:829:54: (iv_ruleEArtifactType= ruleEArtifactType EOF )
            // InternalRMParser.g:830:2: iv_ruleEArtifactType= ruleEArtifactType EOF
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
    // InternalRMParser.g:836:1: ruleEArtifactType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEArtifactType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_artifact_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:842:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:843:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:843:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:844:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:844:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:845:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:845:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:846:5: lv_name_0_0= RULE_QUALIFIED_NAME
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
            		
            // InternalRMParser.g:870:3: ( (lv_artifact_3_0= ruleEArtifactTypeBody ) )
            // InternalRMParser.g:871:4: (lv_artifact_3_0= ruleEArtifactTypeBody )
            {
            // InternalRMParser.g:871:4: (lv_artifact_3_0= ruleEArtifactTypeBody )
            // InternalRMParser.g:872:5: lv_artifact_3_0= ruleEArtifactTypeBody
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
    // InternalRMParser.g:897:1: entryRuleEArtifactTypeBody returns [EObject current=null] : iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF ;
    public final EObject entryRuleEArtifactTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactTypeBody = null;


        try {
            // InternalRMParser.g:897:58: (iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF )
            // InternalRMParser.g:898:2: iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF
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
    // InternalRMParser.g:904:1: ruleEArtifactTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
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
            // InternalRMParser.g:910:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:911:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:911:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:912:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:912:3: ()
            // InternalRMParser.g:913:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEArtifactTypeBodyAccess().getEArtifactTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:919:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRMParser.g:920:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRMParser.g:920:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRMParser.g:921:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:924:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRMParser.g:925:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRMParser.g:925:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )*
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
            	    // InternalRMParser.g:926:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:926:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:927:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:927:114: ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:928:6: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:931:9: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:931:10: {...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:931:19: (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:931:20: otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_8); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEArtifactTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:935:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:936:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:936:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:937:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEArtifactTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_18); 

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
            	    // InternalRMParser.g:954:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:954:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:955:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:955:114: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:956:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:959:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:959:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:959:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:959:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEArtifactTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:963:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:964:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:964:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:965:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRMParser.g:987:4: ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:987:4: ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:988:5: {...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:988:114: ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:989:6: ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:992:9: ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:992:10: {...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:992:19: (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:992:20: otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,Mime_type,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEArtifactTypeBodyAccess().getMime_typeKeyword_1_2_0());
            	    								
            	    // InternalRMParser.g:996:9: ( (lv_mime_type_7_0= RULE_STRING ) )
            	    // InternalRMParser.g:997:10: (lv_mime_type_7_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:997:10: (lv_mime_type_7_0= RULE_STRING )
            	    // InternalRMParser.g:998:11: lv_mime_type_7_0= RULE_STRING
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
            	    // InternalRMParser.g:1020:4: ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1020:4: ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1021:5: {...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:1021:114: ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1022:6: ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:1025:9: ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1025:10: {...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1025:19: ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1025:20: (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) )
            	    {
            	    // InternalRMParser.g:1025:20: (otherlv_8= File_ext )+
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
            	    	    // InternalRMParser.g:1026:10: otherlv_8= File_ext
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

            	    // InternalRMParser.g:1031:9: ( (lv_file_ext_9_0= RULE_STRING ) )
            	    // InternalRMParser.g:1032:10: (lv_file_ext_9_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1032:10: (lv_file_ext_9_0= RULE_STRING )
            	    // InternalRMParser.g:1033:11: lv_file_ext_9_0= RULE_STRING
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
    // InternalRMParser.g:1066:1: entryRuleECapabilityTypes returns [EObject current=null] : iv_ruleECapabilityTypes= ruleECapabilityTypes EOF ;
    public final EObject entryRuleECapabilityTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypes = null;


        try {
            // InternalRMParser.g:1066:57: (iv_ruleECapabilityTypes= ruleECapabilityTypes EOF )
            // InternalRMParser.g:1067:2: iv_ruleECapabilityTypes= ruleECapabilityTypes EOF
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
    // InternalRMParser.g:1073:1: ruleECapabilityTypes returns [EObject current=null] : ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ ) ;
    public final EObject ruleECapabilityTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilityTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1079:2: ( ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ ) )
            // InternalRMParser.g:1080:2: ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ )
            {
            // InternalRMParser.g:1080:2: ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ )
            // InternalRMParser.g:1081:3: () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+
            {
            // InternalRMParser.g:1081:3: ()
            // InternalRMParser.g:1082:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilityTypesAccess().getECapabilityTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1088:3: ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+
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
            	    // InternalRMParser.g:1089:4: (lv_capabilityTypes_1_0= ruleECapabilityType )
            	    {
            	    // InternalRMParser.g:1089:4: (lv_capabilityTypes_1_0= ruleECapabilityType )
            	    // InternalRMParser.g:1090:5: lv_capabilityTypes_1_0= ruleECapabilityType
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
    // InternalRMParser.g:1111:1: entryRuleECapabilityType returns [EObject current=null] : iv_ruleECapabilityType= ruleECapabilityType EOF ;
    public final EObject entryRuleECapabilityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityType = null;


        try {
            // InternalRMParser.g:1111:56: (iv_ruleECapabilityType= ruleECapabilityType EOF )
            // InternalRMParser.g:1112:2: iv_ruleECapabilityType= ruleECapabilityType EOF
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
    // InternalRMParser.g:1118:1: ruleECapabilityType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleECapabilityType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_capability_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1124:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1125:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1125:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1126:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1126:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1127:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1127:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1128:5: lv_name_0_0= RULE_QUALIFIED_NAME
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
            		
            // InternalRMParser.g:1152:3: ( (lv_capability_3_0= ruleECapabilityTypeBody ) )
            // InternalRMParser.g:1153:4: (lv_capability_3_0= ruleECapabilityTypeBody )
            {
            // InternalRMParser.g:1153:4: (lv_capability_3_0= ruleECapabilityTypeBody )
            // InternalRMParser.g:1154:5: lv_capability_3_0= ruleECapabilityTypeBody
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
    // InternalRMParser.g:1179:1: entryRuleECapabilityTypeBody returns [EObject current=null] : iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF ;
    public final EObject entryRuleECapabilityTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypeBody = null;


        try {
            // InternalRMParser.g:1179:60: (iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF )
            // InternalRMParser.g:1180:2: iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF
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
    // InternalRMParser.g:1186:1: ruleECapabilityTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleECapabilityTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        EObject lv_properties_8_0 = null;

        EObject lv_atributes_12_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1192:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:1193:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:1193:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:1194:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:1194:3: ()
            // InternalRMParser.g:1195:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilityTypeBodyAccess().getECapabilityTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1201:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:1202:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:1202:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:1203:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:1206:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:1207:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:1207:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )*
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
            	    // InternalRMParser.g:1208:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1208:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:1209:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:1209:116: ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:1210:6: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:1213:9: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:1213:10: {...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1213:19: (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:1213:20: otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_8); 

            	    									newLeafNode(otherlv_2, grammarAccess.getECapabilityTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:1217:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:1218:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:1218:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:1219:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getECapabilityTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_21); 

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
            	    // InternalRMParser.g:1236:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1236:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1237:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:1237:116: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1238:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:1241:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1241:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1241:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1241:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getECapabilityTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:1245:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:1246:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1246:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:1247:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRMParser.g:1269:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1269:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:1270:5: {...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:1270:116: ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:1271:6: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:1274:9: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:1274:10: {...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1274:19: (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:1274:20: otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Properties,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getECapabilityTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getECapabilityTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:1282:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:1283:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:1283:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRMParser.g:1284:11: lv_properties_8_0= ruleEProperties
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
            	    // InternalRMParser.g:1311:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1311:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:1312:5: {...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:1312:116: ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:1313:6: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:1316:9: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:1316:10: {...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1316:19: (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:1316:20: otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Attributes,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getECapabilityTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getECapabilityTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:1324:9: ( (lv_atributes_12_0= ruleEAttributes ) )
            	    // InternalRMParser.g:1325:10: (lv_atributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:1325:10: (lv_atributes_12_0= ruleEAttributes )
            	    // InternalRMParser.g:1326:11: lv_atributes_12_0= ruleEAttributes
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
    // InternalRMParser.g:1364:1: entryRuleEInterfaceTypes returns [EObject current=null] : iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF ;
    public final EObject entryRuleEInterfaceTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceTypes = null;


        try {
            // InternalRMParser.g:1364:56: (iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF )
            // InternalRMParser.g:1365:2: iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF
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
    // InternalRMParser.g:1371:1: ruleEInterfaceTypes returns [EObject current=null] : ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ ) ;
    public final EObject ruleEInterfaceTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaceTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1377:2: ( ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ ) )
            // InternalRMParser.g:1378:2: ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ )
            {
            // InternalRMParser.g:1378:2: ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ )
            // InternalRMParser.g:1379:3: () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+
            {
            // InternalRMParser.g:1379:3: ()
            // InternalRMParser.g:1380:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceTypesAccess().getEInterfaceTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1386:3: ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+
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
            	    // InternalRMParser.g:1387:4: (lv_interfaceTypes_1_0= ruleEInterfaceType )
            	    {
            	    // InternalRMParser.g:1387:4: (lv_interfaceTypes_1_0= ruleEInterfaceType )
            	    // InternalRMParser.g:1388:5: lv_interfaceTypes_1_0= ruleEInterfaceType
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
    // InternalRMParser.g:1409:1: entryRuleEInterfaceType returns [EObject current=null] : iv_ruleEInterfaceType= ruleEInterfaceType EOF ;
    public final EObject entryRuleEInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceType = null;


        try {
            // InternalRMParser.g:1409:55: (iv_ruleEInterfaceType= ruleEInterfaceType EOF )
            // InternalRMParser.g:1410:2: iv_ruleEInterfaceType= ruleEInterfaceType EOF
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
    // InternalRMParser.g:1416:1: ruleEInterfaceType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEInterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_interface_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1422:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1423:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1423:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1424:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1424:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1425:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1425:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1426:5: lv_name_0_0= RULE_QUALIFIED_NAME
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
            		
            // InternalRMParser.g:1450:3: ( (lv_interface_3_0= ruleEInterfaceTypeBody ) )
            // InternalRMParser.g:1451:4: (lv_interface_3_0= ruleEInterfaceTypeBody )
            {
            // InternalRMParser.g:1451:4: (lv_interface_3_0= ruleEInterfaceTypeBody )
            // InternalRMParser.g:1452:5: lv_interface_3_0= ruleEInterfaceTypeBody
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
    // InternalRMParser.g:1477:1: entryRuleEInterfaceTypeBody returns [EObject current=null] : iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF ;
    public final EObject entryRuleEInterfaceTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceTypeBody = null;


        try {
            // InternalRMParser.g:1477:59: (iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF )
            // InternalRMParser.g:1478:2: iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF
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
    // InternalRMParser.g:1484:1: ruleEInterfaceTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEInterfaceTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        EObject lv_inputs_8_0 = null;

        EObject lv_operations_12_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1490:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:1491:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:1491:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:1492:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:1492:3: ()
            // InternalRMParser.g:1493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceTypeBodyAccess().getEInterfaceTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1499:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:1500:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:1500:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:1501:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:1504:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:1505:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:1505:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )*
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
            	    // InternalRMParser.g:1506:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1506:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:1507:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:1507:115: ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:1508:6: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:1511:9: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:1511:10: {...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1511:19: (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:1511:20: otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_8); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEInterfaceTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:1515:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:1516:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:1516:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:1517:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEInterfaceTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_23); 

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
            	    // InternalRMParser.g:1534:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1534:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1535:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:1535:115: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1536:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:1539:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1539:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1539:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1539:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEInterfaceTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:1543:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:1544:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1544:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:1545:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRMParser.g:1567:4: ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1567:4: ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:1568:5: {...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:1568:115: ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:1569:6: ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:1572:9: ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:1572:10: {...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1572:19: (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:1572:20: otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Inputs,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEInterfaceTypeBodyAccess().getInputsKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getEInterfaceTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:1580:9: ( (lv_inputs_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:1581:10: (lv_inputs_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:1581:10: (lv_inputs_8_0= ruleEProperties )
            	    // InternalRMParser.g:1582:11: lv_inputs_8_0= ruleEProperties
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
            	    // InternalRMParser.g:1609:4: ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1609:4: ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:1610:5: {...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:1610:115: ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:1611:6: ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:1614:9: ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:1614:10: {...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1614:19: (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:1614:20: otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Operations,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEInterfaceTypeBodyAccess().getOperationsKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getEInterfaceTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:1622:9: ( (lv_operations_12_0= ruleEOperations ) )
            	    // InternalRMParser.g:1623:10: (lv_operations_12_0= ruleEOperations )
            	    {
            	    // InternalRMParser.g:1623:10: (lv_operations_12_0= ruleEOperations )
            	    // InternalRMParser.g:1624:11: lv_operations_12_0= ruleEOperations
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
    // InternalRMParser.g:1662:1: entryRuleEPolicyTypes returns [EObject current=null] : iv_ruleEPolicyTypes= ruleEPolicyTypes EOF ;
    public final EObject entryRuleEPolicyTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyTypes = null;


        try {
            // InternalRMParser.g:1662:53: (iv_ruleEPolicyTypes= ruleEPolicyTypes EOF )
            // InternalRMParser.g:1663:2: iv_ruleEPolicyTypes= ruleEPolicyTypes EOF
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
    // InternalRMParser.g:1669:1: ruleEPolicyTypes returns [EObject current=null] : ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ ) ;
    public final EObject ruleEPolicyTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_policyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1675:2: ( ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ ) )
            // InternalRMParser.g:1676:2: ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ )
            {
            // InternalRMParser.g:1676:2: ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ )
            // InternalRMParser.g:1677:3: () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+
            {
            // InternalRMParser.g:1677:3: ()
            // InternalRMParser.g:1678:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPolicyTypesAccess().getEPolicyTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1684:3: ( (lv_policyTypes_1_0= ruleEPolicyType ) )+
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
            	    // InternalRMParser.g:1685:4: (lv_policyTypes_1_0= ruleEPolicyType )
            	    {
            	    // InternalRMParser.g:1685:4: (lv_policyTypes_1_0= ruleEPolicyType )
            	    // InternalRMParser.g:1686:5: lv_policyTypes_1_0= ruleEPolicyType
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
    // InternalRMParser.g:1707:1: entryRuleEPolicyType returns [EObject current=null] : iv_ruleEPolicyType= ruleEPolicyType EOF ;
    public final EObject entryRuleEPolicyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyType = null;


        try {
            // InternalRMParser.g:1707:52: (iv_ruleEPolicyType= ruleEPolicyType EOF )
            // InternalRMParser.g:1708:2: iv_ruleEPolicyType= ruleEPolicyType EOF
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
    // InternalRMParser.g:1714:1: ruleEPolicyType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEPolicyType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_policy_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1720:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1721:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1721:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1722:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1722:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1723:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1723:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1724:5: lv_name_0_0= RULE_QUALIFIED_NAME
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
            		
            // InternalRMParser.g:1748:3: ( (lv_policy_3_0= ruleEPolicyTypeBody ) )
            // InternalRMParser.g:1749:4: (lv_policy_3_0= ruleEPolicyTypeBody )
            {
            // InternalRMParser.g:1749:4: (lv_policy_3_0= ruleEPolicyTypeBody )
            // InternalRMParser.g:1750:5: lv_policy_3_0= ruleEPolicyTypeBody
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
    // InternalRMParser.g:1775:1: entryRuleEPolicyTypeBody returns [EObject current=null] : iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF ;
    public final EObject entryRuleEPolicyTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyTypeBody = null;


        try {
            // InternalRMParser.g:1775:56: (iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF )
            // InternalRMParser.g:1776:2: iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF
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
    // InternalRMParser.g:1782:1: ruleEPolicyTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEPolicyTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:1788:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:1789:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:1789:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:1790:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:1790:3: ()
            // InternalRMParser.g:1791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPolicyTypeBodyAccess().getEPolicyTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1797:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRMParser.g:1798:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRMParser.g:1798:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRMParser.g:1799:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:1802:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRMParser.g:1803:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRMParser.g:1803:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )*
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
            	    // InternalRMParser.g:1804:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1804:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:1805:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:1805:112: ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:1806:6: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:1809:9: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:1809:10: {...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1809:19: (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:1809:20: otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_8); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEPolicyTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:1813:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:1814:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:1814:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:1815:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEPolicyTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_25); 

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
            	    // InternalRMParser.g:1832:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1832:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1833:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:1833:112: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1834:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:1837:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1837:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1837:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1837:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEPolicyTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:1841:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:1842:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1842:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:1843:11: lv_description_5_0= RULE_STRING
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


            }


            }


            	leaveRule();

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
    // InternalRMParser.g:1876:1: entryRuleENodeTypes returns [EObject current=null] : iv_ruleENodeTypes= ruleENodeTypes EOF ;
    public final EObject entryRuleENodeTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypes = null;


        try {
            // InternalRMParser.g:1876:51: (iv_ruleENodeTypes= ruleENodeTypes EOF )
            // InternalRMParser.g:1877:2: iv_ruleENodeTypes= ruleENodeTypes EOF
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
    // InternalRMParser.g:1883:1: ruleENodeTypes returns [EObject current=null] : ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ ) ;
    public final EObject ruleENodeTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_nodeTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1889:2: ( ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ ) )
            // InternalRMParser.g:1890:2: ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ )
            {
            // InternalRMParser.g:1890:2: ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ )
            // InternalRMParser.g:1891:3: () ( (lv_nodeTypes_1_0= ruleENodeType ) )+
            {
            // InternalRMParser.g:1891:3: ()
            // InternalRMParser.g:1892:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getENodeTypesAccess().getENodeTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1898:3: ( (lv_nodeTypes_1_0= ruleENodeType ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_QUALIFIED_NAME) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRMParser.g:1899:4: (lv_nodeTypes_1_0= ruleENodeType )
            	    {
            	    // InternalRMParser.g:1899:4: (lv_nodeTypes_1_0= ruleENodeType )
            	    // InternalRMParser.g:1900:5: lv_nodeTypes_1_0= ruleENodeType
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // InternalRMParser.g:1921:1: entryRuleENodeType returns [EObject current=null] : iv_ruleENodeType= ruleENodeType EOF ;
    public final EObject entryRuleENodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeType = null;


        try {
            // InternalRMParser.g:1921:50: (iv_ruleENodeType= ruleENodeType EOF )
            // InternalRMParser.g:1922:2: iv_ruleENodeType= ruleENodeType EOF
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
    // InternalRMParser.g:1928:1: ruleENodeType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleENodeType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_node_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1934:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1935:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1935:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1936:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1936:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1937:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1937:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1938:5: lv_name_0_0= RULE_QUALIFIED_NAME
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
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_26); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getENodeTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:1962:3: ( (lv_node_3_0= ruleENodeTypeBody ) )
            // InternalRMParser.g:1963:4: (lv_node_3_0= ruleENodeTypeBody )
            {
            // InternalRMParser.g:1963:4: (lv_node_3_0= ruleENodeTypeBody )
            // InternalRMParser.g:1964:5: lv_node_3_0= ruleENodeTypeBody
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
    // InternalRMParser.g:1989:1: entryRuleENodeTypeBody returns [EObject current=null] : iv_ruleENodeTypeBody= ruleENodeTypeBody EOF ;
    public final EObject entryRuleENodeTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypeBody = null;


        try {
            // InternalRMParser.g:1989:54: (iv_ruleENodeTypeBody= ruleENodeTypeBody EOF )
            // InternalRMParser.g:1990:2: iv_ruleENodeTypeBody= ruleENodeTypeBody EOF
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
    // InternalRMParser.g:1996:1: ruleENodeTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleENodeTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
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
        EObject lv_properties_8_0 = null;

        EObject lv_attributes_12_0 = null;

        EObject lv_interfaces_16_0 = null;

        EObject lv_capabilities_20_0 = null;

        EObject lv_requirements_24_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2002:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:2003:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:2003:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:2004:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:2004:3: ()
            // InternalRMParser.g:2005:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getENodeTypeBodyAccess().getENodeTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2011:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:2012:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:2012:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:2013:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:2016:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:2017:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:2017:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )*
            loop16:
            do {
                int alt16=8;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt16=2;
                }
                else if ( LA16_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt16=3;
                }
                else if ( LA16_0 == Attributes && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt16=4;
                }
                else if ( LA16_0 == Interfaces && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
                    alt16=5;
                }
                else if ( LA16_0 == Capabilities && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
                    alt16=6;
                }
                else if ( LA16_0 == Requirements && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6) ) {
                    alt16=7;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRMParser.g:2018:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2018:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:2019:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:2019:110: ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:2020:6: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:2023:9: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:2023:10: {...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2023:19: (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:2023:20: otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_8); 

            	    									newLeafNode(otherlv_2, grammarAccess.getENodeTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:2027:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:2028:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:2028:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:2029:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_27); 

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
            	    // InternalRMParser.g:2046:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2046:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:2047:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:2047:110: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:2048:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:2051:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:2051:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2051:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:2051:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getENodeTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:2055:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:2056:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:2056:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:2057:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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
            	    // InternalRMParser.g:2079:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2079:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:2080:5: {...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:2080:110: ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:2081:6: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:2084:9: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:2084:10: {...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2084:19: (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:2084:20: otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Properties,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getENodeTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:2092:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:2093:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:2093:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRMParser.g:2094:11: lv_properties_8_0= ruleEProperties
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

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_27); 

            	    									newLeafNode(this_END_9, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:2121:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2121:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:2122:5: {...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:2122:110: ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:2123:6: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:2126:9: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:2126:10: {...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2126:19: (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:2126:20: otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Attributes,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getENodeTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:2134:9: ( (lv_attributes_12_0= ruleEAttributes ) )
            	    // InternalRMParser.g:2135:10: (lv_attributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:2135:10: (lv_attributes_12_0= ruleEAttributes )
            	    // InternalRMParser.g:2136:11: lv_attributes_12_0= ruleEAttributes
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

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_27); 

            	    									newLeafNode(this_END_13, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRMParser.g:2163:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2163:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    // InternalRMParser.g:2164:5: {...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalRMParser.g:2164:110: ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    // InternalRMParser.g:2165:6: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalRMParser.g:2168:9: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    // InternalRMParser.g:2168:10: {...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2168:19: (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    // InternalRMParser.g:2168:20: otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END
            	    {
            	    otherlv_14=(Token)match(input,Interfaces,FOLLOW_5); 

            	    									newLeafNode(otherlv_14, grammarAccess.getENodeTypeBodyAccess().getInterfacesKeyword_1_4_0());
            	    								
            	    this_BEGIN_15=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_15, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_4_1());
            	    								
            	    // InternalRMParser.g:2176:9: ( (lv_interfaces_16_0= ruleEInterfaces ) )
            	    // InternalRMParser.g:2177:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    {
            	    // InternalRMParser.g:2177:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    // InternalRMParser.g:2178:11: lv_interfaces_16_0= ruleEInterfaces
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

            	    this_END_17=(Token)match(input,RULE_END,FOLLOW_27); 

            	    									newLeafNode(this_END_17, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_4_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRMParser.g:2205:4: ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2205:4: ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) )
            	    // InternalRMParser.g:2206:5: {...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalRMParser.g:2206:110: ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) )
            	    // InternalRMParser.g:2207:6: ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalRMParser.g:2210:9: ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) )
            	    // InternalRMParser.g:2210:10: {...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2210:19: (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END )
            	    // InternalRMParser.g:2210:20: otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END
            	    {
            	    otherlv_18=(Token)match(input,Capabilities,FOLLOW_5); 

            	    									newLeafNode(otherlv_18, grammarAccess.getENodeTypeBodyAccess().getCapabilitiesKeyword_1_5_0());
            	    								
            	    this_BEGIN_19=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_19, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_5_1());
            	    								
            	    // InternalRMParser.g:2218:9: ( (lv_capabilities_20_0= ruleECapabilities ) )
            	    // InternalRMParser.g:2219:10: (lv_capabilities_20_0= ruleECapabilities )
            	    {
            	    // InternalRMParser.g:2219:10: (lv_capabilities_20_0= ruleECapabilities )
            	    // InternalRMParser.g:2220:11: lv_capabilities_20_0= ruleECapabilities
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

            	    this_END_21=(Token)match(input,RULE_END,FOLLOW_27); 

            	    									newLeafNode(this_END_21, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_5_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRMParser.g:2247:4: ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2247:4: ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) )
            	    // InternalRMParser.g:2248:5: {...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalRMParser.g:2248:110: ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) )
            	    // InternalRMParser.g:2249:6: ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalRMParser.g:2252:9: ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) )
            	    // InternalRMParser.g:2252:10: {...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2252:19: (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END )
            	    // InternalRMParser.g:2252:20: otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END
            	    {
            	    otherlv_22=(Token)match(input,Requirements,FOLLOW_5); 

            	    									newLeafNode(otherlv_22, grammarAccess.getENodeTypeBodyAccess().getRequirementsKeyword_1_6_0());
            	    								
            	    this_BEGIN_23=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_23, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_6_1());
            	    								
            	    // InternalRMParser.g:2260:9: ( (lv_requirements_24_0= ruleERequirements ) )
            	    // InternalRMParser.g:2261:10: (lv_requirements_24_0= ruleERequirements )
            	    {
            	    // InternalRMParser.g:2261:10: (lv_requirements_24_0= ruleERequirements )
            	    // InternalRMParser.g:2262:11: lv_requirements_24_0= ruleERequirements
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

            	    this_END_25=(Token)match(input,RULE_END,FOLLOW_27); 

            	    									newLeafNode(this_END_25, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_6_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalRMParser.g:2300:1: entryRuleERelationshipTypes returns [EObject current=null] : iv_ruleERelationshipTypes= ruleERelationshipTypes EOF ;
    public final EObject entryRuleERelationshipTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipTypes = null;


        try {
            // InternalRMParser.g:2300:59: (iv_ruleERelationshipTypes= ruleERelationshipTypes EOF )
            // InternalRMParser.g:2301:2: iv_ruleERelationshipTypes= ruleERelationshipTypes EOF
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
    // InternalRMParser.g:2307:1: ruleERelationshipTypes returns [EObject current=null] : ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ ) ;
    public final EObject ruleERelationshipTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_relationshipTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2313:2: ( ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ ) )
            // InternalRMParser.g:2314:2: ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ )
            {
            // InternalRMParser.g:2314:2: ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ )
            // InternalRMParser.g:2315:3: () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+
            {
            // InternalRMParser.g:2315:3: ()
            // InternalRMParser.g:2316:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERelationshipTypesAccess().getERelationshipTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2322:3: ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_QUALIFIED_NAME) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRMParser.g:2323:4: (lv_relationshipTypes_1_0= ruleERelationshipType )
            	    {
            	    // InternalRMParser.g:2323:4: (lv_relationshipTypes_1_0= ruleERelationshipType )
            	    // InternalRMParser.g:2324:5: lv_relationshipTypes_1_0= ruleERelationshipType
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // InternalRMParser.g:2345:1: entryRuleERelationshipType returns [EObject current=null] : iv_ruleERelationshipType= ruleERelationshipType EOF ;
    public final EObject entryRuleERelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipType = null;


        try {
            // InternalRMParser.g:2345:58: (iv_ruleERelationshipType= ruleERelationshipType EOF )
            // InternalRMParser.g:2346:2: iv_ruleERelationshipType= ruleERelationshipType EOF
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
    // InternalRMParser.g:2352:1: ruleERelationshipType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleERelationshipType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_relationship_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2358:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:2359:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:2359:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:2360:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:2360:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:2361:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:2361:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:2362:5: lv_name_0_0= RULE_QUALIFIED_NAME
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
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getERelationshipTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:2386:3: ( (lv_relationship_3_0= ruleERelationshipTypeBody ) )
            // InternalRMParser.g:2387:4: (lv_relationship_3_0= ruleERelationshipTypeBody )
            {
            // InternalRMParser.g:2387:4: (lv_relationship_3_0= ruleERelationshipTypeBody )
            // InternalRMParser.g:2388:5: lv_relationship_3_0= ruleERelationshipTypeBody
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
    // InternalRMParser.g:2413:1: entryRuleERelationshipTypeBody returns [EObject current=null] : iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF ;
    public final EObject entryRuleERelationshipTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipTypeBody = null;


        try {
            // InternalRMParser.g:2413:62: (iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF )
            // InternalRMParser.g:2414:2: iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF
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
    // InternalRMParser.g:2420:1: ruleERelationshipTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleERelationshipTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
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
        EObject lv_properties_8_0 = null;

        EObject lv_atributes_12_0 = null;

        EObject lv_interfaces_16_0 = null;

        EObject lv_valid_target_types_20_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2426:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:2427:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:2427:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:2428:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:2428:3: ()
            // InternalRMParser.g:2429:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERelationshipTypeBodyAccess().getERelationshipTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2435:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) )
            // InternalRMParser.g:2436:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) )
            {
            // InternalRMParser.g:2436:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) )
            // InternalRMParser.g:2437:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:2440:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* )
            // InternalRMParser.g:2441:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )*
            {
            // InternalRMParser.g:2441:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )*
            loop18:
            do {
                int alt18=7;
                int LA18_0 = input.LA(1);

                if ( LA18_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt18=2;
                }
                else if ( LA18_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt18=3;
                }
                else if ( LA18_0 == Attributes && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt18=4;
                }
                else if ( LA18_0 == Interfaces && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
                    alt18=5;
                }
                else if ( LA18_0 == Valid_target_types && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
                    alt18=6;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRMParser.g:2442:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2442:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:2443:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:2443:118: ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:2444:6: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:2447:9: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:2447:10: {...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2447:19: (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:2447:20: otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_8); 

            	    									newLeafNode(otherlv_2, grammarAccess.getERelationshipTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:2451:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:2452:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:2452:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:2453:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_29); 

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
            	    // InternalRMParser.g:2470:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2470:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:2471:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:2471:118: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:2472:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:2475:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:2475:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2475:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:2475:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getERelationshipTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:2479:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:2480:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:2480:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:2481:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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
            	    // InternalRMParser.g:2503:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2503:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:2504:5: {...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:2504:118: ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:2505:6: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:2508:9: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:2508:10: {...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2508:19: (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:2508:20: otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Properties,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getERelationshipTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getERelationshipTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:2516:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:2517:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:2517:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRMParser.g:2518:11: lv_properties_8_0= ruleEProperties
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

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_29); 

            	    									newLeafNode(this_END_9, grammarAccess.getERelationshipTypeBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:2545:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2545:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:2546:5: {...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:2546:118: ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:2547:6: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:2550:9: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:2550:10: {...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2550:19: (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:2550:20: otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Attributes,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getERelationshipTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getERelationshipTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:2558:9: ( (lv_atributes_12_0= ruleEAttributes ) )
            	    // InternalRMParser.g:2559:10: (lv_atributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:2559:10: (lv_atributes_12_0= ruleEAttributes )
            	    // InternalRMParser.g:2560:11: lv_atributes_12_0= ruleEAttributes
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

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_29); 

            	    									newLeafNode(this_END_13, grammarAccess.getERelationshipTypeBodyAccess().getENDTerminalRuleCall_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRMParser.g:2587:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2587:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    // InternalRMParser.g:2588:5: {...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalRMParser.g:2588:118: ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    // InternalRMParser.g:2589:6: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalRMParser.g:2592:9: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    // InternalRMParser.g:2592:10: {...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2592:19: (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    // InternalRMParser.g:2592:20: otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END
            	    {
            	    otherlv_14=(Token)match(input,Interfaces,FOLLOW_5); 

            	    									newLeafNode(otherlv_14, grammarAccess.getERelationshipTypeBodyAccess().getInterfacesKeyword_1_4_0());
            	    								
            	    this_BEGIN_15=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_15, grammarAccess.getERelationshipTypeBodyAccess().getBEGINTerminalRuleCall_1_4_1());
            	    								
            	    // InternalRMParser.g:2600:9: ( (lv_interfaces_16_0= ruleEInterfaces ) )
            	    // InternalRMParser.g:2601:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    {
            	    // InternalRMParser.g:2601:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    // InternalRMParser.g:2602:11: lv_interfaces_16_0= ruleEInterfaces
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

            	    this_END_17=(Token)match(input,RULE_END,FOLLOW_29); 

            	    									newLeafNode(this_END_17, grammarAccess.getERelationshipTypeBodyAccess().getENDTerminalRuleCall_1_4_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRMParser.g:2629:4: ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:2629:4: ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:2630:5: {...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalRMParser.g:2630:118: ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) )
            	    // InternalRMParser.g:2631:6: ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalRMParser.g:2634:9: ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) )
            	    // InternalRMParser.g:2634:10: {...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2634:19: (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket )
            	    // InternalRMParser.g:2634:20: otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket
            	    {
            	    otherlv_18=(Token)match(input,Valid_target_types,FOLLOW_30); 

            	    									newLeafNode(otherlv_18, grammarAccess.getERelationshipTypeBodyAccess().getValid_target_typesKeyword_1_5_0());
            	    								
            	    otherlv_19=(Token)match(input,LeftSquareBracket,FOLLOW_8); 

            	    									newLeafNode(otherlv_19, grammarAccess.getERelationshipTypeBodyAccess().getLeftSquareBracketKeyword_1_5_1());
            	    								
            	    // InternalRMParser.g:2642:9: ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) )
            	    // InternalRMParser.g:2643:10: (lv_valid_target_types_20_0= ruleEValidTargetTypes )
            	    {
            	    // InternalRMParser.g:2643:10: (lv_valid_target_types_20_0= ruleEValidTargetTypes )
            	    // InternalRMParser.g:2644:11: lv_valid_target_types_20_0= ruleEValidTargetTypes
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getValid_target_typesEValidTargetTypesParserRuleCall_1_5_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
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

            	    otherlv_21=(Token)match(input,RightSquareBracket,FOLLOW_29); 

            	    									newLeafNode(otherlv_21, grammarAccess.getERelationshipTypeBodyAccess().getRightSquareBracketKeyword_1_5_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

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
    // InternalRMParser.g:2682:1: entryRuleEValidTargetTypes returns [EObject current=null] : iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF ;
    public final EObject entryRuleEValidTargetTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidTargetTypes = null;


        try {
            // InternalRMParser.g:2682:58: (iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF )
            // InternalRMParser.g:2683:2: iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF
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
    // InternalRMParser.g:2689:1: ruleEValidTargetTypes returns [EObject current=null] : ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* ) ;
    public final EObject ruleEValidTargetTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_targetTypes_0_0 = null;

        EObject lv_sourceType_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2695:2: ( ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* ) )
            // InternalRMParser.g:2696:2: ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* )
            {
            // InternalRMParser.g:2696:2: ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* )
            // InternalRMParser.g:2697:3: ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )*
            {
            // InternalRMParser.g:2697:3: ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) )
            // InternalRMParser.g:2698:4: (lv_targetTypes_0_0= ruleECapabilityTypeRef )
            {
            // InternalRMParser.g:2698:4: (lv_targetTypes_0_0= ruleECapabilityTypeRef )
            // InternalRMParser.g:2699:5: lv_targetTypes_0_0= ruleECapabilityTypeRef
            {

            					newCompositeNode(grammarAccess.getEValidTargetTypesAccess().getTargetTypesECapabilityTypeRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalRMParser.g:2716:3: (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Comma) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRMParser.g:2717:4: otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEValidTargetTypesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRMParser.g:2721:4: ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) )
            	    // InternalRMParser.g:2722:5: (lv_sourceType_2_0= ruleECapabilityTypeRef )
            	    {
            	    // InternalRMParser.g:2722:5: (lv_sourceType_2_0= ruleECapabilityTypeRef )
            	    // InternalRMParser.g:2723:6: lv_sourceType_2_0= ruleECapabilityTypeRef
            	    {

            	    						newCompositeNode(grammarAccess.getEValidTargetTypesAccess().getSourceTypeECapabilityTypeRefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
    // $ANTLR end "ruleEValidTargetTypes"


    // $ANTLR start "entryRuleECapabilityTypeRef"
    // InternalRMParser.g:2745:1: entryRuleECapabilityTypeRef returns [EObject current=null] : iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF ;
    public final EObject entryRuleECapabilityTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypeRef = null;


        try {
            // InternalRMParser.g:2745:59: (iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF )
            // InternalRMParser.g:2746:2: iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF
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
    // InternalRMParser.g:2752:1: ruleECapabilityTypeRef returns [EObject current=null] : ( (otherlv_0= RULE_QUALIFIED_NAME ) ) ;
    public final EObject ruleECapabilityTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:2758:2: ( ( (otherlv_0= RULE_QUALIFIED_NAME ) ) )
            // InternalRMParser.g:2759:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            {
            // InternalRMParser.g:2759:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:2760:3: (otherlv_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:2760:3: (otherlv_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:2761:4: otherlv_0= RULE_QUALIFIED_NAME
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
    // InternalRMParser.g:2775:1: entryRuleEProperties returns [EObject current=null] : iv_ruleEProperties= ruleEProperties EOF ;
    public final EObject entryRuleEProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEProperties = null;


        try {
            // InternalRMParser.g:2775:52: (iv_ruleEProperties= ruleEProperties EOF )
            // InternalRMParser.g:2776:2: iv_ruleEProperties= ruleEProperties EOF
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
    // InternalRMParser.g:2782:1: ruleEProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* ) ;
    public final EObject ruleEProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2788:2: ( ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* ) )
            // InternalRMParser.g:2789:2: ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* )
            {
            // InternalRMParser.g:2789:2: ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* )
            // InternalRMParser.g:2790:3: () ( (lv_properties_1_0= ruleEPropertyDefinition ) )*
            {
            // InternalRMParser.g:2790:3: ()
            // InternalRMParser.g:2791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPropertiesAccess().getEPropertiesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2797:3: ( (lv_properties_1_0= ruleEPropertyDefinition ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRMParser.g:2798:4: (lv_properties_1_0= ruleEPropertyDefinition )
            	    {
            	    // InternalRMParser.g:2798:4: (lv_properties_1_0= ruleEPropertyDefinition )
            	    // InternalRMParser.g:2799:5: lv_properties_1_0= ruleEPropertyDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEPropertiesAccess().getPropertiesEPropertyDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
    // $ANTLR end "ruleEProperties"


    // $ANTLR start "entryRuleEPropertyDefinition"
    // InternalRMParser.g:2820:1: entryRuleEPropertyDefinition returns [EObject current=null] : iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF ;
    public final EObject entryRuleEPropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyDefinition = null;


        try {
            // InternalRMParser.g:2820:60: (iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF )
            // InternalRMParser.g:2821:2: iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF
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
    // InternalRMParser.g:2827:1: ruleEPropertyDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEPropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_property_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2833:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:2834:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:2834:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:2835:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:2835:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:2836:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:2836:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:2837:5: lv_name_0_0= RULE_ID
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
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_34); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEPropertyDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:2861:3: ( (lv_property_3_0= ruleEPropertyDefinitionBody ) )
            // InternalRMParser.g:2862:4: (lv_property_3_0= ruleEPropertyDefinitionBody )
            {
            // InternalRMParser.g:2862:4: (lv_property_3_0= ruleEPropertyDefinitionBody )
            // InternalRMParser.g:2863:5: lv_property_3_0= ruleEPropertyDefinitionBody
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
    // InternalRMParser.g:2888:1: entryRuleEPropertyDefinitionBody returns [EObject current=null] : iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF ;
    public final EObject entryRuleEPropertyDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyDefinitionBody = null;


        try {
            // InternalRMParser.g:2888:64: (iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF )
            // InternalRMParser.g:2889:2: iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF
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
    // InternalRMParser.g:2895:1: ruleEPropertyDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) ;
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
        EObject lv_default_8_0 = null;

        EObject lv_constraints_13_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2901:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:2902:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:2902:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:2903:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:2903:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:2904:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:2907:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:2908:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:2908:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=8;
                int LA21_0 = input.LA(1);

                if ( LA21_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt21=2;
                }
                else if ( LA21_0 == Required && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt21=3;
                }
                else if ( LA21_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt21=4;
                }
                else if ( LA21_0 == Status && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
                    alt21=5;
                }
                else if ( LA21_0 == Constraints && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
                    alt21=6;
                }
                else if ( LA21_0 == Entry_schema && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6) ) {
                    alt21=7;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRMParser.g:2909:3: ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2909:3: ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:2910:4: {...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:2910:117: ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:2911:5: ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:2914:8: ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:2914:9: {...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:2914:18: (otherlv_1= Type ( ( ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:2914:19: otherlv_1= Type ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPropertyDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:2918:8: ( ( ruleEDataTypeName ) )
            	    // InternalRMParser.g:2919:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:2919:9: ( ruleEDataTypeName )
            	    // InternalRMParser.g:2920:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getTypeEDataTypeCrossReference_0_1_0());
            	    									
            	    pushFollow(FOLLOW_35);
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
            	    // InternalRMParser.g:2940:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2940:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:2941:4: {...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:2941:117: ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:2942:5: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:2945:8: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:2945:9: {...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:2945:18: (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:2945:19: otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Description,FOLLOW_13); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPropertyDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRMParser.g:2949:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRMParser.g:2950:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:2950:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRMParser.g:2951:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

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
            	    // InternalRMParser.g:2973:3: ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2973:3: ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalRMParser.g:2974:4: {...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:2974:117: ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalRMParser.g:2975:5: ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:2978:8: ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) )
            	    // InternalRMParser.g:2978:9: {...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:2978:18: (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) )
            	    // InternalRMParser.g:2978:19: otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_5=(Token)match(input,Required,FOLLOW_36); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEPropertyDefinitionBodyAccess().getRequiredKeyword_2_0());
            	    							
            	    // InternalRMParser.g:2982:8: ( (lv_required_6_0= RULE_BOOLEAN ) )
            	    // InternalRMParser.g:2983:9: (lv_required_6_0= RULE_BOOLEAN )
            	    {
            	    // InternalRMParser.g:2983:9: (lv_required_6_0= RULE_BOOLEAN )
            	    // InternalRMParser.g:2984:10: lv_required_6_0= RULE_BOOLEAN
            	    {
            	    lv_required_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_35); 

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
            	    // InternalRMParser.g:3006:3: ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3006:3: ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:3007:4: {...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:3007:117: ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:3008:5: ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:3011:8: ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:3011:9: {...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3011:18: (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:3011:19: otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,Default,FOLLOW_37); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEPropertyDefinitionBodyAccess().getDefaultKeyword_3_0());
            	    							
            	    // InternalRMParser.g:3015:8: ( (lv_default_8_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:3016:9: (lv_default_8_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:3016:9: (lv_default_8_0= ruleEValueExpression )
            	    // InternalRMParser.g:3017:10: lv_default_8_0= ruleEValueExpression
            	    {

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getDefaultEValueExpressionParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_35);
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
            	    // InternalRMParser.g:3040:3: ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3040:3: ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3041:4: {...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRMParser.g:3041:117: ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3042:5: ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRMParser.g:3045:8: ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3045:9: {...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3045:18: (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3045:19: otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,Status,FOLLOW_13); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPropertyDefinitionBodyAccess().getStatusKeyword_4_0());
            	    							
            	    // InternalRMParser.g:3049:8: ( (lv_status_10_0= RULE_STRING ) )
            	    // InternalRMParser.g:3050:9: (lv_status_10_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:3050:9: (lv_status_10_0= RULE_STRING )
            	    // InternalRMParser.g:3051:10: lv_status_10_0= RULE_STRING
            	    {
            	    lv_status_10_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

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
            	    // InternalRMParser.g:3073:3: ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3073:3: ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) )
            	    // InternalRMParser.g:3074:4: {...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRMParser.g:3074:117: ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) )
            	    // InternalRMParser.g:3075:5: ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRMParser.g:3078:8: ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) )
            	    // InternalRMParser.g:3078:9: {...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3078:18: (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END )
            	    // InternalRMParser.g:3078:19: otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END
            	    {
            	    otherlv_11=(Token)match(input,Constraints,FOLLOW_5); 

            	    								newLeafNode(otherlv_11, grammarAccess.getEPropertyDefinitionBodyAccess().getConstraintsKeyword_5_0());
            	    							
            	    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    								newLeafNode(this_BEGIN_12, grammarAccess.getEPropertyDefinitionBodyAccess().getBEGINTerminalRuleCall_5_1());
            	    							
            	    // InternalRMParser.g:3086:8: ( (lv_constraints_13_0= ruleEConstraints ) )
            	    // InternalRMParser.g:3087:9: (lv_constraints_13_0= ruleEConstraints )
            	    {
            	    // InternalRMParser.g:3087:9: (lv_constraints_13_0= ruleEConstraints )
            	    // InternalRMParser.g:3088:10: lv_constraints_13_0= ruleEConstraints
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

            	    this_END_14=(Token)match(input,RULE_END,FOLLOW_35); 

            	    								newLeafNode(this_END_14, grammarAccess.getEPropertyDefinitionBodyAccess().getENDTerminalRuleCall_5_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRMParser.g:3115:3: ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3115:3: ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:3116:4: {...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalRMParser.g:3116:117: ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:3117:5: ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalRMParser.g:3120:8: ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:3120:9: {...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3120:18: (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:3120:19: otherlv_15= Entry_schema ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_15=(Token)match(input,Entry_schema,FOLLOW_6); 

            	    								newLeafNode(otherlv_15, grammarAccess.getEPropertyDefinitionBodyAccess().getEntry_schemaKeyword_6_0());
            	    							
            	    // InternalRMParser.g:3124:8: ( ( ruleEDataTypeName ) )
            	    // InternalRMParser.g:3125:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:3125:9: ( ruleEDataTypeName )
            	    // InternalRMParser.g:3126:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getEntry_schemaEDataTypeCrossReference_6_1_0());
            	    									
            	    pushFollow(FOLLOW_35);
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
    // InternalRMParser.g:3157:1: entryRuleEAttributes returns [EObject current=null] : iv_ruleEAttributes= ruleEAttributes EOF ;
    public final EObject entryRuleEAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributes = null;


        try {
            // InternalRMParser.g:3157:52: (iv_ruleEAttributes= ruleEAttributes EOF )
            // InternalRMParser.g:3158:2: iv_ruleEAttributes= ruleEAttributes EOF
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
    // InternalRMParser.g:3164:1: ruleEAttributes returns [EObject current=null] : ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* ) ;
    public final EObject ruleEAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3170:2: ( ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* ) )
            // InternalRMParser.g:3171:2: ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* )
            {
            // InternalRMParser.g:3171:2: ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* )
            // InternalRMParser.g:3172:3: () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )*
            {
            // InternalRMParser.g:3172:3: ()
            // InternalRMParser.g:3173:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributesAccess().getEAttributesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3179:3: ( (lv_attributes_1_0= ruleEAttributeDefinition ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRMParser.g:3180:4: (lv_attributes_1_0= ruleEAttributeDefinition )
            	    {
            	    // InternalRMParser.g:3180:4: (lv_attributes_1_0= ruleEAttributeDefinition )
            	    // InternalRMParser.g:3181:5: lv_attributes_1_0= ruleEAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEAttributesAccess().getAttributesEAttributeDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
    // $ANTLR end "ruleEAttributes"


    // $ANTLR start "entryRuleEAttributeDefinition"
    // InternalRMParser.g:3202:1: entryRuleEAttributeDefinition returns [EObject current=null] : iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF ;
    public final EObject entryRuleEAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeDefinition = null;


        try {
            // InternalRMParser.g:3202:61: (iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF )
            // InternalRMParser.g:3203:2: iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF
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
    // InternalRMParser.g:3209:1: ruleEAttributeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_attribute_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3215:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:3216:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:3216:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:3217:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:3217:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:3218:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:3218:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:3219:5: lv_name_0_0= RULE_ID
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
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_38); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEAttributeDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:3243:3: ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) )
            // InternalRMParser.g:3244:4: (lv_attribute_3_0= ruleEAttributeDefinitionBody )
            {
            // InternalRMParser.g:3244:4: (lv_attribute_3_0= ruleEAttributeDefinitionBody )
            // InternalRMParser.g:3245:5: lv_attribute_3_0= ruleEAttributeDefinitionBody
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
    // InternalRMParser.g:3270:1: entryRuleEAttributeDefinitionBody returns [EObject current=null] : iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF ;
    public final EObject entryRuleEAttributeDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeDefinitionBody = null;


        try {
            // InternalRMParser.g:3270:65: (iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF )
            // InternalRMParser.g:3271:2: iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF
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
    // InternalRMParser.g:3277:1: ruleEAttributeDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAttributeDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_status_8_0=null;
        Token otherlv_9=null;
        EObject lv_default_6_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3283:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:3284:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:3284:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:3285:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:3285:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:3286:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:3289:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:3290:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:3290:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=6;
                int LA23_0 = input.LA(1);

                if ( LA23_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt23=2;
                }
                else if ( LA23_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt23=3;
                }
                else if ( LA23_0 == Status && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt23=4;
                }
                else if ( LA23_0 == Entry_schema && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
                    alt23=5;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRMParser.g:3291:3: ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3291:3: ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:3292:4: {...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:3292:118: ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:3293:5: ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:3296:8: ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:3296:9: {...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3296:18: (otherlv_1= Type ( ( ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:3296:19: otherlv_1= Type ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAttributeDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:3300:8: ( ( ruleEDataTypeName ) )
            	    // InternalRMParser.g:3301:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:3301:9: ( ruleEDataTypeName )
            	    // InternalRMParser.g:3302:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAttributeDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEAttributeDefinitionBodyAccess().getTypeEDataTypeCrossReference_0_1_0());
            	    									
            	    pushFollow(FOLLOW_39);
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
            	    // InternalRMParser.g:3322:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3322:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3323:4: {...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:3323:118: ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3324:5: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:3327:8: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3327:9: {...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3327:18: (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3327:19: otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Description,FOLLOW_13); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAttributeDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRMParser.g:3331:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRMParser.g:3332:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:3332:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRMParser.g:3333:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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
            	    // InternalRMParser.g:3355:3: ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3355:3: ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:3356:4: {...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:3356:118: ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:3357:5: ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:3360:8: ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:3360:9: {...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3360:18: (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:3360:19: otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,Default,FOLLOW_37); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEAttributeDefinitionBodyAccess().getDefaultKeyword_2_0());
            	    							
            	    // InternalRMParser.g:3364:8: ( (lv_default_6_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:3365:9: (lv_default_6_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:3365:9: (lv_default_6_0= ruleEValueExpression )
            	    // InternalRMParser.g:3366:10: lv_default_6_0= ruleEValueExpression
            	    {

            	    										newCompositeNode(grammarAccess.getEAttributeDefinitionBodyAccess().getDefaultEValueExpressionParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_39);
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
            	    // InternalRMParser.g:3389:3: ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3389:3: ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3390:4: {...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:3390:118: ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3391:5: ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:3394:8: ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3394:9: {...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3394:18: (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3394:19: otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,Status,FOLLOW_13); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEAttributeDefinitionBodyAccess().getStatusKeyword_3_0());
            	    							
            	    // InternalRMParser.g:3398:8: ( (lv_status_8_0= RULE_STRING ) )
            	    // InternalRMParser.g:3399:9: (lv_status_8_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:3399:9: (lv_status_8_0= RULE_STRING )
            	    // InternalRMParser.g:3400:10: lv_status_8_0= RULE_STRING
            	    {
            	    lv_status_8_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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
            	    // InternalRMParser.g:3422:3: ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3422:3: ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:3423:4: {...}? => ( ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRMParser.g:3423:118: ( ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:3424:5: ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRMParser.g:3427:8: ({...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:3427:9: {...}? => (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3427:18: (otherlv_9= Entry_schema ( ( ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:3427:19: otherlv_9= Entry_schema ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_9=(Token)match(input,Entry_schema,FOLLOW_6); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEAttributeDefinitionBodyAccess().getEntry_schemaKeyword_4_0());
            	    							
            	    // InternalRMParser.g:3431:8: ( ( ruleEDataTypeName ) )
            	    // InternalRMParser.g:3432:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:3432:9: ( ruleEDataTypeName )
            	    // InternalRMParser.g:3433:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAttributeDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEAttributeDefinitionBodyAccess().getEntry_schemaEDataTypeCrossReference_4_1_0());
            	    									
            	    pushFollow(FOLLOW_39);
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // InternalRMParser.g:3464:1: entryRuleEInterfaces returns [EObject current=null] : iv_ruleEInterfaces= ruleEInterfaces EOF ;
    public final EObject entryRuleEInterfaces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaces = null;


        try {
            // InternalRMParser.g:3464:52: (iv_ruleEInterfaces= ruleEInterfaces EOF )
            // InternalRMParser.g:3465:2: iv_ruleEInterfaces= ruleEInterfaces EOF
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
    // InternalRMParser.g:3471:1: ruleEInterfaces returns [EObject current=null] : ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* ) ;
    public final EObject ruleEInterfaces() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaces_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3477:2: ( ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* ) )
            // InternalRMParser.g:3478:2: ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* )
            {
            // InternalRMParser.g:3478:2: ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* )
            // InternalRMParser.g:3479:3: () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )*
            {
            // InternalRMParser.g:3479:3: ()
            // InternalRMParser.g:3480:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfacesAccess().getEInterfacesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3486:3: ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRMParser.g:3487:4: (lv_interfaces_1_0= ruleEInterfaceDefinition )
            	    {
            	    // InternalRMParser.g:3487:4: (lv_interfaces_1_0= ruleEInterfaceDefinition )
            	    // InternalRMParser.g:3488:5: lv_interfaces_1_0= ruleEInterfaceDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEInterfacesAccess().getInterfacesEInterfaceDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
    // $ANTLR end "ruleEInterfaces"


    // $ANTLR start "entryRuleEInterfaceDefinition"
    // InternalRMParser.g:3509:1: entryRuleEInterfaceDefinition returns [EObject current=null] : iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF ;
    public final EObject entryRuleEInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceDefinition = null;


        try {
            // InternalRMParser.g:3509:61: (iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF )
            // InternalRMParser.g:3510:2: iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF
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
    // InternalRMParser.g:3516:1: ruleEInterfaceDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_interface_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3522:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:3523:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:3523:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:3524:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:3524:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:3525:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:3525:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:3526:5: lv_name_0_0= RULE_ID
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
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_40); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEInterfaceDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:3550:3: ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) )
            // InternalRMParser.g:3551:4: (lv_interface_3_0= ruleEInterfaceDefinitionBody )
            {
            // InternalRMParser.g:3551:4: (lv_interface_3_0= ruleEInterfaceDefinitionBody )
            // InternalRMParser.g:3552:5: lv_interface_3_0= ruleEInterfaceDefinitionBody
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
    // InternalRMParser.g:3577:1: entryRuleEInterfaceDefinitionBody returns [EObject current=null] : iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF ;
    public final EObject entryRuleEInterfaceDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceDefinitionBody = null;


        try {
            // InternalRMParser.g:3577:65: (iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF )
            // InternalRMParser.g:3578:2: iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF
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
    // InternalRMParser.g:3584:1: ruleEInterfaceDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEInterfaceDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_10=null;
        EObject lv_inputs_5_0 = null;

        EObject lv_operations_9_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3590:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:3591:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:3591:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:3592:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:3592:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:3593:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:3596:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?)
            // InternalRMParser.g:3597:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:3597:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=4;
                int LA25_0 = input.LA(1);

                if ( LA25_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 == Inputs && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt25=2;
                }
                else if ( LA25_0 == Operations && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt25=3;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRMParser.g:3598:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3598:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:3599:4: {...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:3599:118: ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:3600:5: ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:3603:8: ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:3603:9: {...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3603:18: (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:3603:19: otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEInterfaceDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:3607:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:3608:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:3608:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:3609:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEInterfaceDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_41); 

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
            	    // InternalRMParser.g:3626:3: ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3626:3: ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) )
            	    // InternalRMParser.g:3627:4: {...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:3627:118: ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) )
            	    // InternalRMParser.g:3628:5: ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:3631:8: ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) )
            	    // InternalRMParser.g:3631:9: {...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3631:18: (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END )
            	    // InternalRMParser.g:3631:19: otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END
            	    {
            	    otherlv_3=(Token)match(input,Inputs,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEInterfaceDefinitionBodyAccess().getInputsKeyword_1_0());
            	    							
            	    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    								newLeafNode(this_BEGIN_4, grammarAccess.getEInterfaceDefinitionBodyAccess().getBEGINTerminalRuleCall_1_1());
            	    							
            	    // InternalRMParser.g:3639:8: ( (lv_inputs_5_0= ruleEProperties ) )
            	    // InternalRMParser.g:3640:9: (lv_inputs_5_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:3640:9: (lv_inputs_5_0= ruleEProperties )
            	    // InternalRMParser.g:3641:10: lv_inputs_5_0= ruleEProperties
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

            	    this_END_6=(Token)match(input,RULE_END,FOLLOW_41); 

            	    								newLeafNode(this_END_6, grammarAccess.getEInterfaceDefinitionBodyAccess().getENDTerminalRuleCall_1_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:3668:3: ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3668:3: ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) )
            	    // InternalRMParser.g:3669:4: {...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:3669:118: ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) )
            	    // InternalRMParser.g:3670:5: ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:3673:8: ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) )
            	    // InternalRMParser.g:3673:9: {...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3673:18: (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END )
            	    // InternalRMParser.g:3673:19: otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END
            	    {
            	    otherlv_7=(Token)match(input,Operations,FOLLOW_5); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEInterfaceDefinitionBodyAccess().getOperationsKeyword_2_0());
            	    							
            	    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    								newLeafNode(this_BEGIN_8, grammarAccess.getEInterfaceDefinitionBodyAccess().getBEGINTerminalRuleCall_2_1());
            	    							
            	    // InternalRMParser.g:3681:8: ( (lv_operations_9_0= ruleEOperations ) )
            	    // InternalRMParser.g:3682:9: (lv_operations_9_0= ruleEOperations )
            	    {
            	    // InternalRMParser.g:3682:9: (lv_operations_9_0= ruleEOperations )
            	    // InternalRMParser.g:3683:10: lv_operations_9_0= ruleEOperations
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

            	    this_END_10=(Token)match(input,RULE_END,FOLLOW_41); 

            	    								newLeafNode(this_END_10, grammarAccess.getEInterfaceDefinitionBodyAccess().getENDTerminalRuleCall_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            	    				

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
    // InternalRMParser.g:3721:1: entryRuleEOperations returns [EObject current=null] : iv_ruleEOperations= ruleEOperations EOF ;
    public final EObject entryRuleEOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperations = null;


        try {
            // InternalRMParser.g:3721:52: (iv_ruleEOperations= ruleEOperations EOF )
            // InternalRMParser.g:3722:2: iv_ruleEOperations= ruleEOperations EOF
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
    // InternalRMParser.g:3728:1: ruleEOperations returns [EObject current=null] : ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* ) ;
    public final EObject ruleEOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3734:2: ( ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* ) )
            // InternalRMParser.g:3735:2: ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* )
            {
            // InternalRMParser.g:3735:2: ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* )
            // InternalRMParser.g:3736:3: () ( (lv_operations_1_0= ruleEOperationDefinition ) )*
            {
            // InternalRMParser.g:3736:3: ()
            // InternalRMParser.g:3737:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationsAccess().getEOperationsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3743:3: ( (lv_operations_1_0= ruleEOperationDefinition ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRMParser.g:3744:4: (lv_operations_1_0= ruleEOperationDefinition )
            	    {
            	    // InternalRMParser.g:3744:4: (lv_operations_1_0= ruleEOperationDefinition )
            	    // InternalRMParser.g:3745:5: lv_operations_1_0= ruleEOperationDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEOperationsAccess().getOperationsEOperationDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
    // $ANTLR end "ruleEOperations"


    // $ANTLR start "entryRuleEOperationDefinition"
    // InternalRMParser.g:3766:1: entryRuleEOperationDefinition returns [EObject current=null] : iv_ruleEOperationDefinition= ruleEOperationDefinition EOF ;
    public final EObject entryRuleEOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperationDefinition = null;


        try {
            // InternalRMParser.g:3766:61: (iv_ruleEOperationDefinition= ruleEOperationDefinition EOF )
            // InternalRMParser.g:3767:2: iv_ruleEOperationDefinition= ruleEOperationDefinition EOF
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
    // InternalRMParser.g:3773:1: ruleEOperationDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3779:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:3780:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:3780:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:3781:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:3781:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:3782:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:3782:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:3783:5: lv_name_0_0= RULE_ID
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
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_42); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEOperationDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:3807:3: ( (lv_operation_3_0= ruleEOperationDefinitionBody ) )
            // InternalRMParser.g:3808:4: (lv_operation_3_0= ruleEOperationDefinitionBody )
            {
            // InternalRMParser.g:3808:4: (lv_operation_3_0= ruleEOperationDefinitionBody )
            // InternalRMParser.g:3809:5: lv_operation_3_0= ruleEOperationDefinitionBody
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
    // InternalRMParser.g:3834:1: entryRuleEOperationDefinitionBody returns [EObject current=null] : iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF ;
    public final EObject entryRuleEOperationDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperationDefinitionBody = null;


        try {
            // InternalRMParser.g:3834:65: (iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF )
            // InternalRMParser.g:3835:2: iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF
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
    // InternalRMParser.g:3841:1: ruleEOperationDefinitionBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) ) ;
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
            // InternalRMParser.g:3847:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:3848:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:3848:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:3849:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:3849:3: ()
            // InternalRMParser.g:3850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationDefinitionBodyAccess().getEOperationDefinitionBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3856:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:3857:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:3857:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:3858:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:3861:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:3862:6: ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:3862:6: ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )*
            loop27:
            do {
                int alt27=4;
                int LA27_0 = input.LA(1);

                if ( LA27_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt27=1;
                }
                else if ( LA27_0 == Inputs && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt27=2;
                }
                else if ( LA27_0 == Implementation && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt27=3;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRMParser.g:3863:4: ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3863:4: ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3864:5: {...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:3864:121: ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3865:6: ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:3868:9: ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3868:10: {...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3868:19: (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3868:20: otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEOperationDefinitionBodyAccess().getDescriptionKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:3872:9: ( (lv_description_3_0= RULE_STRING ) )
            	    // InternalRMParser.g:3873:10: (lv_description_3_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:3873:10: (lv_description_3_0= RULE_STRING )
            	    // InternalRMParser.g:3874:11: lv_description_3_0= RULE_STRING
            	    {
            	    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

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
            	    // InternalRMParser.g:3896:4: ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3896:4: ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) )
            	    // InternalRMParser.g:3897:5: {...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:3897:121: ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) )
            	    // InternalRMParser.g:3898:6: ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:3901:9: ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) )
            	    // InternalRMParser.g:3901:10: {...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3901:19: (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END )
            	    // InternalRMParser.g:3901:20: otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END
            	    {
            	    otherlv_4=(Token)match(input,Inputs,FOLLOW_5); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEOperationDefinitionBodyAccess().getInputsKeyword_1_1_0());
            	    								
            	    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_5, grammarAccess.getEOperationDefinitionBodyAccess().getBEGINTerminalRuleCall_1_1_1());
            	    								
            	    // InternalRMParser.g:3909:9: ( (lv_inputs_6_0= ruleEInputs ) )
            	    // InternalRMParser.g:3910:10: (lv_inputs_6_0= ruleEInputs )
            	    {
            	    // InternalRMParser.g:3910:10: (lv_inputs_6_0= ruleEInputs )
            	    // InternalRMParser.g:3911:11: lv_inputs_6_0= ruleEInputs
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

            	    this_END_7=(Token)match(input,RULE_END,FOLLOW_43); 

            	    									newLeafNode(this_END_7, grammarAccess.getEOperationDefinitionBodyAccess().getENDTerminalRuleCall_1_1_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:3938:4: ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3938:4: ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) )
            	    // InternalRMParser.g:3939:5: {...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:3939:121: ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) )
            	    // InternalRMParser.g:3940:6: ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:3943:9: ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) )
            	    // InternalRMParser.g:3943:10: {...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3943:19: (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END )
            	    // InternalRMParser.g:3943:20: otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END
            	    {
            	    otherlv_8=(Token)match(input,Implementation,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getEOperationDefinitionBodyAccess().getImplementationKeyword_1_2_0());
            	    								
            	    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_44); 

            	    									newLeafNode(this_BEGIN_9, grammarAccess.getEOperationDefinitionBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:3951:9: ( (lv_implementation_10_0= ruleEImplementation ) )
            	    // InternalRMParser.g:3952:10: (lv_implementation_10_0= ruleEImplementation )
            	    {
            	    // InternalRMParser.g:3952:10: (lv_implementation_10_0= ruleEImplementation )
            	    // InternalRMParser.g:3953:11: lv_implementation_10_0= ruleEImplementation
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

            	    this_END_11=(Token)match(input,RULE_END,FOLLOW_43); 

            	    									newLeafNode(this_END_11, grammarAccess.getEOperationDefinitionBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

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
    // InternalRMParser.g:3991:1: entryRuleEImplementation returns [EObject current=null] : iv_ruleEImplementation= ruleEImplementation EOF ;
    public final EObject entryRuleEImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEImplementation = null;


        try {
            // InternalRMParser.g:3991:56: (iv_ruleEImplementation= ruleEImplementation EOF )
            // InternalRMParser.g:3992:2: iv_ruleEImplementation= ruleEImplementation EOF
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
    // InternalRMParser.g:3998:1: ruleEImplementation returns [EObject current=null] : ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? ) ;
    public final EObject ruleEImplementation() throws RecognitionException {
        EObject current = null;

        EObject lv_primary_0_0 = null;

        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4004:2: ( ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? ) )
            // InternalRMParser.g:4005:2: ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? )
            {
            // InternalRMParser.g:4005:2: ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? )
            // InternalRMParser.g:4006:3: ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )?
            {
            // InternalRMParser.g:4006:3: ( (lv_primary_0_0= ruleEPrimary ) )
            // InternalRMParser.g:4007:4: (lv_primary_0_0= ruleEPrimary )
            {
            // InternalRMParser.g:4007:4: (lv_primary_0_0= ruleEPrimary )
            // InternalRMParser.g:4008:5: lv_primary_0_0= ruleEPrimary
            {

            					newCompositeNode(grammarAccess.getEImplementationAccess().getPrimaryEPrimaryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_45);
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

            // InternalRMParser.g:4025:3: ( (lv_dependencies_1_0= ruleEDependencies ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Dependencies) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRMParser.g:4026:4: (lv_dependencies_1_0= ruleEDependencies )
                    {
                    // InternalRMParser.g:4026:4: (lv_dependencies_1_0= ruleEDependencies )
                    // InternalRMParser.g:4027:5: lv_dependencies_1_0= ruleEDependencies
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
    // InternalRMParser.g:4048:1: entryRuleEPrimary returns [EObject current=null] : iv_ruleEPrimary= ruleEPrimary EOF ;
    public final EObject entryRuleEPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPrimary = null;


        try {
            // InternalRMParser.g:4048:49: (iv_ruleEPrimary= ruleEPrimary EOF )
            // InternalRMParser.g:4049:2: iv_ruleEPrimary= ruleEPrimary EOF
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
    // InternalRMParser.g:4055:1: ruleEPrimary returns [EObject current=null] : ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? ) ;
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
            // InternalRMParser.g:4061:2: ( ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? ) )
            // InternalRMParser.g:4062:2: ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? )
            {
            // InternalRMParser.g:4062:2: ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? )
            // InternalRMParser.g:4063:3: (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )?
            {
            // InternalRMParser.g:4063:3: (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) )
            // InternalRMParser.g:4064:4: otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Primary,FOLLOW_13); 

            				newLeafNode(otherlv_0, grammarAccess.getEPrimaryAccess().getPrimaryKeyword_0_0());
            			
            // InternalRMParser.g:4068:4: ( (lv_file_1_0= RULE_STRING ) )
            // InternalRMParser.g:4069:5: (lv_file_1_0= RULE_STRING )
            {
            // InternalRMParser.g:4069:5: (lv_file_1_0= RULE_STRING )
            // InternalRMParser.g:4070:6: lv_file_1_0= RULE_STRING
            {
            lv_file_1_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

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

            // InternalRMParser.g:4087:3: (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_BEGIN) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRMParser.g:4088:4: this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_47); 

                    				newLeafNode(this_BEGIN_2, grammarAccess.getEPrimaryAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    otherlv_3=(Token)match(input,Relative_path,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPrimaryAccess().getRelative_pathKeyword_1_1());
                    			
                    // InternalRMParser.g:4096:4: ( (lv_relative_path_4_0= RULE_STRING ) )
                    // InternalRMParser.g:4097:5: (lv_relative_path_4_0= RULE_STRING )
                    {
                    // InternalRMParser.g:4097:5: (lv_relative_path_4_0= RULE_STRING )
                    // InternalRMParser.g:4098:6: lv_relative_path_4_0= RULE_STRING
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
    // InternalRMParser.g:4123:1: entryRuleEDependencies returns [EObject current=null] : iv_ruleEDependencies= ruleEDependencies EOF ;
    public final EObject entryRuleEDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDependencies = null;


        try {
            // InternalRMParser.g:4123:54: (iv_ruleEDependencies= ruleEDependencies EOF )
            // InternalRMParser.g:4124:2: iv_ruleEDependencies= ruleEDependencies EOF
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
    // InternalRMParser.g:4130:1: ruleEDependencies returns [EObject current=null] : (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? ) ;
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
            // InternalRMParser.g:4136:2: ( (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? ) )
            // InternalRMParser.g:4137:2: (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? )
            {
            // InternalRMParser.g:4137:2: (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? )
            // InternalRMParser.g:4138:3: otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )?
            {
            otherlv_0=(Token)match(input,Dependencies,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getEDependenciesAccess().getDependenciesKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getEDependenciesAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRMParser.g:4146:3: ( (lv_files_2_0= ruleEDependencyFiles ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRMParser.g:4147:4: (lv_files_2_0= ruleEDependencyFiles )
                    {
                    // InternalRMParser.g:4147:4: (lv_files_2_0= ruleEDependencyFiles )
                    // InternalRMParser.g:4148:5: lv_files_2_0= ruleEDependencyFiles
                    {

                    					newCompositeNode(grammarAccess.getEDependenciesAccess().getFilesEDependencyFilesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_31);
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

            otherlv_3=(Token)match(input,RightSquareBracket,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getEDependenciesAccess().getRightSquareBracketKeyword_3());
            		
            // InternalRMParser.g:4169:3: (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_BEGIN) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRMParser.g:4170:4: this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END
                    {
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_47); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getEDependenciesAccess().getBEGINTerminalRuleCall_4_0());
                    			
                    otherlv_5=(Token)match(input,Relative_path,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getEDependenciesAccess().getRelative_pathKeyword_4_1());
                    			
                    // InternalRMParser.g:4178:4: ( (lv_relative_path_6_0= RULE_STRING ) )
                    // InternalRMParser.g:4179:5: (lv_relative_path_6_0= RULE_STRING )
                    {
                    // InternalRMParser.g:4179:5: (lv_relative_path_6_0= RULE_STRING )
                    // InternalRMParser.g:4180:6: lv_relative_path_6_0= RULE_STRING
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
    // InternalRMParser.g:4205:1: entryRuleEDependencyFiles returns [EObject current=null] : iv_ruleEDependencyFiles= ruleEDependencyFiles EOF ;
    public final EObject entryRuleEDependencyFiles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDependencyFiles = null;


        try {
            // InternalRMParser.g:4205:57: (iv_ruleEDependencyFiles= ruleEDependencyFiles EOF )
            // InternalRMParser.g:4206:2: iv_ruleEDependencyFiles= ruleEDependencyFiles EOF
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
    // InternalRMParser.g:4212:1: ruleEDependencyFiles returns [EObject current=null] : ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleEDependencyFiles() throws RecognitionException {
        EObject current = null;

        Token lv_files_0_0=null;
        Token otherlv_1=null;
        Token lv_files_2_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:4218:2: ( ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* ) )
            // InternalRMParser.g:4219:2: ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* )
            {
            // InternalRMParser.g:4219:2: ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* )
            // InternalRMParser.g:4220:3: ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )*
            {
            // InternalRMParser.g:4220:3: ( (lv_files_0_0= RULE_STRING ) )
            // InternalRMParser.g:4221:4: (lv_files_0_0= RULE_STRING )
            {
            // InternalRMParser.g:4221:4: (lv_files_0_0= RULE_STRING )
            // InternalRMParser.g:4222:5: lv_files_0_0= RULE_STRING
            {
            lv_files_0_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            // InternalRMParser.g:4238:3: (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Comma) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRMParser.g:4239:4: otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEDependencyFilesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRMParser.g:4243:4: ( (lv_files_2_0= RULE_STRING ) )
            	    // InternalRMParser.g:4244:5: (lv_files_2_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:4244:5: (lv_files_2_0= RULE_STRING )
            	    // InternalRMParser.g:4245:6: lv_files_2_0= RULE_STRING
            	    {
            	    lv_files_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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
    // $ANTLR end "ruleEDependencyFiles"


    // $ANTLR start "entryRuleEInputs"
    // InternalRMParser.g:4266:1: entryRuleEInputs returns [EObject current=null] : iv_ruleEInputs= ruleEInputs EOF ;
    public final EObject entryRuleEInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInputs = null;


        try {
            // InternalRMParser.g:4266:48: (iv_ruleEInputs= ruleEInputs EOF )
            // InternalRMParser.g:4267:2: iv_ruleEInputs= ruleEInputs EOF
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
    // InternalRMParser.g:4273:1: ruleEInputs returns [EObject current=null] : ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* ) ;
    public final EObject ruleEInputs() throws RecognitionException {
        EObject current = null;

        EObject lv_inputs_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4279:2: ( ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* ) )
            // InternalRMParser.g:4280:2: ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* )
            {
            // InternalRMParser.g:4280:2: ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* )
            // InternalRMParser.g:4281:3: () ( (lv_inputs_1_0= ruleEParameterDefinition ) )*
            {
            // InternalRMParser.g:4281:3: ()
            // InternalRMParser.g:4282:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInputsAccess().getEInputsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:4288:3: ( (lv_inputs_1_0= ruleEParameterDefinition ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRMParser.g:4289:4: (lv_inputs_1_0= ruleEParameterDefinition )
            	    {
            	    // InternalRMParser.g:4289:4: (lv_inputs_1_0= ruleEParameterDefinition )
            	    // InternalRMParser.g:4290:5: lv_inputs_1_0= ruleEParameterDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEInputsAccess().getInputsEParameterDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
    // $ANTLR end "ruleEInputs"


    // $ANTLR start "entryRuleEParameterDefinition"
    // InternalRMParser.g:4311:1: entryRuleEParameterDefinition returns [EObject current=null] : iv_ruleEParameterDefinition= ruleEParameterDefinition EOF ;
    public final EObject entryRuleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinition = null;


        try {
            // InternalRMParser.g:4311:61: (iv_ruleEParameterDefinition= ruleEParameterDefinition EOF )
            // InternalRMParser.g:4312:2: iv_ruleEParameterDefinition= ruleEParameterDefinition EOF
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
    // InternalRMParser.g:4318:1: ruleEParameterDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4324:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:4325:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:4325:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:4326:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:4326:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:4327:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:4327:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:4328:5: lv_name_0_0= RULE_ID
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
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_49); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEParameterDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:4352:3: ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) )
            // InternalRMParser.g:4353:4: (lv_parameter_3_0= ruleEParameterDefinitionBody )
            {
            // InternalRMParser.g:4353:4: (lv_parameter_3_0= ruleEParameterDefinitionBody )
            // InternalRMParser.g:4354:5: lv_parameter_3_0= ruleEParameterDefinitionBody
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
    // InternalRMParser.g:4379:1: entryRuleEParameterDefinitionBody returns [EObject current=null] : iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF ;
    public final EObject entryRuleEParameterDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinitionBody = null;


        try {
            // InternalRMParser.g:4379:65: (iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF )
            // InternalRMParser.g:4380:2: iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF
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
    // InternalRMParser.g:4386:1: ruleEParameterDefinitionBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEParameterDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_5_0 = null;

        EObject lv_default_7_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4392:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:4393:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:4393:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:4394:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:4394:3: ()
            // InternalRMParser.g:4395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterDefinitionBodyAccess().getEParameterDefinitionBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:4401:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) )
            // InternalRMParser.g:4402:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) )
            {
            // InternalRMParser.g:4402:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) )
            // InternalRMParser.g:4403:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:4406:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* )
            // InternalRMParser.g:4407:6: ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )*
            {
            // InternalRMParser.g:4407:6: ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )*
            loop34:
            do {
                int alt34=4;
                int LA34_0 = input.LA(1);

                if ( LA34_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt34=1;
                }
                else if ( LA34_0 == Value && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt34=2;
                }
                else if ( LA34_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt34=3;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalRMParser.g:4408:4: ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4408:4: ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:4409:5: {...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:4409:121: ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:4410:6: ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:4413:9: ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:4413:10: {...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4413:19: (otherlv_2= Type ( ( ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:4413:20: otherlv_2= Type ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_2=(Token)match(input,Type,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEParameterDefinitionBodyAccess().getTypeKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:4417:9: ( ( ruleEDataTypeName ) )
            	    // InternalRMParser.g:4418:10: ( ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:4418:10: ( ruleEDataTypeName )
            	    // InternalRMParser.g:4419:11: ruleEDataTypeName
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEParameterDefinitionBodyRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getTypeEDataTypeCrossReference_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalRMParser.g:4439:4: ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4439:4: ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:4440:5: {...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:4440:121: ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:4441:6: ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:4444:9: ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:4444:10: {...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4444:19: (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:4444:20: otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,Value,FOLLOW_37); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEParameterDefinitionBodyAccess().getValueKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:4448:9: ( (lv_value_5_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:4449:10: (lv_value_5_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:4449:10: (lv_value_5_0= ruleEValueExpression )
            	    // InternalRMParser.g:4450:11: lv_value_5_0= ruleEValueExpression
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getValueEValueExpressionParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalRMParser.g:4473:4: ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4473:4: ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:4474:5: {...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:4474:121: ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:4475:6: ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:4478:9: ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:4478:10: {...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4478:19: (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:4478:20: otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,Default,FOLLOW_37); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEParameterDefinitionBodyAccess().getDefaultKeyword_1_2_0());
            	    								
            	    // InternalRMParser.g:4482:9: ( (lv_default_7_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:4483:10: (lv_default_7_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:4483:10: (lv_default_7_0= ruleEValueExpression )
            	    // InternalRMParser.g:4484:11: lv_default_7_0= ruleEValueExpression
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getDefaultEValueExpressionParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    break loop34;
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
    // InternalRMParser.g:4518:1: entryRuleEValueExpression returns [EObject current=null] : iv_ruleEValueExpression= ruleEValueExpression EOF ;
    public final EObject entryRuleEValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueExpression = null;


        try {
            // InternalRMParser.g:4518:57: (iv_ruleEValueExpression= ruleEValueExpression EOF )
            // InternalRMParser.g:4519:2: iv_ruleEValueExpression= ruleEValueExpression EOF
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
    // InternalRMParser.g:4525:1: ruleEValueExpression returns [EObject current=null] : (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction ) ;
    public final EObject ruleEValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ESingleValue_0 = null;

        EObject this_EFunction_1 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4531:2: ( (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction ) )
            // InternalRMParser.g:4532:2: (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction )
            {
            // InternalRMParser.g:4532:2: (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=HyphenMinus && LA35_0<=FullStop)||LA35_0==RULE_BOOLEAN||(LA35_0>=RULE_INT && LA35_0<=RULE_STRING)) ) {
                alt35=1;
            }
            else if ( (LA35_0==Get_attribute||LA35_0==Get_property||LA35_0==Get_input) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalRMParser.g:4533:3: this_ESingleValue_0= ruleESingleValue
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
                    // InternalRMParser.g:4542:3: this_EFunction_1= ruleEFunction
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
    // InternalRMParser.g:4554:1: entryRuleEFunction returns [EObject current=null] : iv_ruleEFunction= ruleEFunction EOF ;
    public final EObject entryRuleEFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFunction = null;


        try {
            // InternalRMParser.g:4554:50: (iv_ruleEFunction= ruleEFunction EOF )
            // InternalRMParser.g:4555:2: iv_ruleEFunction= ruleEFunction EOF
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
    // InternalRMParser.g:4561:1: ruleEFunction returns [EObject current=null] : (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput ) ;
    public final EObject ruleEFunction() throws RecognitionException {
        EObject current = null;

        EObject this_GetProperty_0 = null;

        EObject this_GetAttribute_1 = null;

        EObject this_GetInput_2 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4567:2: ( (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput ) )
            // InternalRMParser.g:4568:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput )
            {
            // InternalRMParser.g:4568:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput )
            int alt36=3;
            switch ( input.LA(1) ) {
            case Get_property:
                {
                alt36=1;
                }
                break;
            case Get_attribute:
                {
                alt36=2;
                }
                break;
            case Get_input:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalRMParser.g:4569:3: this_GetProperty_0= ruleGetProperty
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
                    // InternalRMParser.g:4578:3: this_GetAttribute_1= ruleGetAttribute
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
                    // InternalRMParser.g:4587:3: this_GetInput_2= ruleGetInput
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
    // InternalRMParser.g:4599:1: entryRuleGetInput returns [EObject current=null] : iv_ruleGetInput= ruleGetInput EOF ;
    public final EObject entryRuleGetInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetInput = null;


        try {
            // InternalRMParser.g:4599:49: (iv_ruleGetInput= ruleGetInput EOF )
            // InternalRMParser.g:4600:2: iv_ruleGetInput= ruleGetInput EOF
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
    // InternalRMParser.g:4606:1: ruleGetInput returns [EObject current=null] : (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleGetInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRMParser.g:4612:2: ( (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRMParser.g:4613:2: (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRMParser.g:4613:2: (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) )
            // InternalRMParser.g:4614:3: otherlv_0= Get_input ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Get_input,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGetInputAccess().getGet_inputKeyword_0());
            		
            // InternalRMParser.g:4618:3: ( (otherlv_1= RULE_ID ) )
            // InternalRMParser.g:4619:4: (otherlv_1= RULE_ID )
            {
            // InternalRMParser.g:4619:4: (otherlv_1= RULE_ID )
            // InternalRMParser.g:4620:5: otherlv_1= RULE_ID
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
    // InternalRMParser.g:4635:1: entryRuleGetAttribute returns [EObject current=null] : iv_ruleGetAttribute= ruleGetAttribute EOF ;
    public final EObject entryRuleGetAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttribute = null;


        try {
            // InternalRMParser.g:4635:53: (iv_ruleGetAttribute= ruleGetAttribute EOF )
            // InternalRMParser.g:4636:2: iv_ruleGetAttribute= ruleGetAttribute EOF
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
    // InternalRMParser.g:4642:1: ruleGetAttribute returns [EObject current=null] : (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END ) ;
    public final EObject ruleGetAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4648:2: ( (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END ) )
            // InternalRMParser.g:4649:2: (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END )
            {
            // InternalRMParser.g:4649:2: (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END )
            // InternalRMParser.g:4650:3: otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Get_attribute,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGetAttributeAccess().getGet_attributeKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_51); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getGetAttributeAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalRMParser.g:4658:3: ( (lv_attribute_2_0= ruleGetAttributeBody ) )
            // InternalRMParser.g:4659:4: (lv_attribute_2_0= ruleGetAttributeBody )
            {
            // InternalRMParser.g:4659:4: (lv_attribute_2_0= ruleGetAttributeBody )
            // InternalRMParser.g:4660:5: lv_attribute_2_0= ruleGetAttributeBody
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
    // InternalRMParser.g:4685:1: entryRuleGetAttributeBody returns [EObject current=null] : iv_ruleGetAttributeBody= ruleGetAttributeBody EOF ;
    public final EObject entryRuleGetAttributeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttributeBody = null;


        try {
            // InternalRMParser.g:4685:57: (iv_ruleGetAttributeBody= ruleGetAttributeBody EOF )
            // InternalRMParser.g:4686:2: iv_ruleGetAttributeBody= ruleGetAttributeBody EOF
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
    // InternalRMParser.g:4692:1: ruleGetAttributeBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalRMParser.g:4698:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:4699:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:4699:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:4700:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:4700:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:4701:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:4704:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:4705:5: ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:4705:5: ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=4;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == Attribute && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == Entity && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 == Req_cap && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2) ) {
                    alt37=3;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRMParser.g:4706:3: ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4706:3: ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:4707:4: {...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:4707:110: ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:4708:5: ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:4711:8: ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:4711:9: {...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRMParser.g:4711:18: (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:4711:19: otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Attribute,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGetAttributeBodyAccess().getAttributeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:4715:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:4716:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:4716:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:4717:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_52); 

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
            	    // InternalRMParser.g:4734:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4734:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    // InternalRMParser.g:4735:4: {...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:4735:110: ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    // InternalRMParser.g:4736:5: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:4739:8: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    // InternalRMParser.g:4739:9: {...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRMParser.g:4739:18: (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    // InternalRMParser.g:4739:19: otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) )
            	    {
            	    otherlv_3=(Token)match(input,Entity,FOLLOW_53); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGetAttributeBodyAccess().getEntityKeyword_1_0());
            	    							
            	    // InternalRMParser.g:4743:8: ( (lv_entity_4_0= RULE_ENTITY ) )
            	    // InternalRMParser.g:4744:9: (lv_entity_4_0= RULE_ENTITY )
            	    {
            	    // InternalRMParser.g:4744:9: (lv_entity_4_0= RULE_ENTITY )
            	    // InternalRMParser.g:4745:10: lv_entity_4_0= RULE_ENTITY
            	    {
            	    lv_entity_4_0=(Token)match(input,RULE_ENTITY,FOLLOW_52); 

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
            	    // InternalRMParser.g:4767:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4767:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:4768:4: {...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:4768:110: ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:4769:5: ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:4772:8: ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:4772:9: {...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRMParser.g:4772:18: (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:4772:19: otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,Req_cap,FOLLOW_8); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGetAttributeBodyAccess().getReq_capKeyword_2_0());
            	    							
            	    // InternalRMParser.g:4776:8: ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:4777:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:4777:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:4778:10: otherlv_6= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    									
            	    otherlv_6=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_52); 

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
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // InternalRMParser.g:4806:1: entryRuleGetProperty returns [EObject current=null] : iv_ruleGetProperty= ruleGetProperty EOF ;
    public final EObject entryRuleGetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetProperty = null;


        try {
            // InternalRMParser.g:4806:52: (iv_ruleGetProperty= ruleGetProperty EOF )
            // InternalRMParser.g:4807:2: iv_ruleGetProperty= ruleGetProperty EOF
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
    // InternalRMParser.g:4813:1: ruleGetProperty returns [EObject current=null] : (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END ) ;
    public final EObject ruleGetProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_property_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4819:2: ( (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END ) )
            // InternalRMParser.g:4820:2: (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END )
            {
            // InternalRMParser.g:4820:2: (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END )
            // InternalRMParser.g:4821:3: otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Get_property,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGetPropertyAccess().getGet_propertyKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_54); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getGetPropertyAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalRMParser.g:4829:3: ( (lv_property_2_0= ruleGetPropertyBody ) )
            // InternalRMParser.g:4830:4: (lv_property_2_0= ruleGetPropertyBody )
            {
            // InternalRMParser.g:4830:4: (lv_property_2_0= ruleGetPropertyBody )
            // InternalRMParser.g:4831:5: lv_property_2_0= ruleGetPropertyBody
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
    // InternalRMParser.g:4856:1: entryRuleGetPropertyBody returns [EObject current=null] : iv_ruleGetPropertyBody= ruleGetPropertyBody EOF ;
    public final EObject entryRuleGetPropertyBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetPropertyBody = null;


        try {
            // InternalRMParser.g:4856:56: (iv_ruleGetPropertyBody= ruleGetPropertyBody EOF )
            // InternalRMParser.g:4857:2: iv_ruleGetPropertyBody= ruleGetPropertyBody EOF
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
    // InternalRMParser.g:4863:1: ruleGetPropertyBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalRMParser.g:4869:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:4870:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:4870:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:4871:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:4871:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:4872:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:4875:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:4876:5: ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:4876:5: ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=4;
                int LA38_0 = input.LA(1);

                if ( LA38_0 == Property && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 == Entity && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1) ) {
                    alt38=2;
                }
                else if ( LA38_0 == Req_cap && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2) ) {
                    alt38=3;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRMParser.g:4877:3: ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4877:3: ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:4878:4: {...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:4878:109: ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:4879:5: ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:4882:8: ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:4882:9: {...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRMParser.g:4882:18: (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:4882:19: otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Property,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGetPropertyBodyAccess().getPropertyKeyword_0_0());
            	    							
            	    // InternalRMParser.g:4886:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:4887:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:4887:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:4888:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_55); 

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
            	    // InternalRMParser.g:4905:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4905:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    // InternalRMParser.g:4906:4: {...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:4906:109: ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    // InternalRMParser.g:4907:5: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:4910:8: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    // InternalRMParser.g:4910:9: {...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRMParser.g:4910:18: (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    // InternalRMParser.g:4910:19: otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) )
            	    {
            	    otherlv_3=(Token)match(input,Entity,FOLLOW_53); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGetPropertyBodyAccess().getEntityKeyword_1_0());
            	    							
            	    // InternalRMParser.g:4914:8: ( (lv_entity_4_0= RULE_ENTITY ) )
            	    // InternalRMParser.g:4915:9: (lv_entity_4_0= RULE_ENTITY )
            	    {
            	    // InternalRMParser.g:4915:9: (lv_entity_4_0= RULE_ENTITY )
            	    // InternalRMParser.g:4916:10: lv_entity_4_0= RULE_ENTITY
            	    {
            	    lv_entity_4_0=(Token)match(input,RULE_ENTITY,FOLLOW_55); 

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
            	    // InternalRMParser.g:4938:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4938:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:4939:4: {...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:4939:109: ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:4940:5: ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:4943:8: ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:4943:9: {...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRMParser.g:4943:18: (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:4943:19: otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,Req_cap,FOLLOW_8); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGetPropertyBodyAccess().getReq_capKeyword_2_0());
            	    							
            	    // InternalRMParser.g:4947:8: ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:4948:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:4948:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:4949:10: otherlv_6= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    									
            	    otherlv_6=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_55); 

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
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
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
    // InternalRMParser.g:4977:1: entryRuleECapabilities returns [EObject current=null] : iv_ruleECapabilities= ruleECapabilities EOF ;
    public final EObject entryRuleECapabilities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilities = null;


        try {
            // InternalRMParser.g:4977:54: (iv_ruleECapabilities= ruleECapabilities EOF )
            // InternalRMParser.g:4978:2: iv_ruleECapabilities= ruleECapabilities EOF
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
    // InternalRMParser.g:4984:1: ruleECapabilities returns [EObject current=null] : ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* ) ;
    public final EObject ruleECapabilities() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilities_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4990:2: ( ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* ) )
            // InternalRMParser.g:4991:2: ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* )
            {
            // InternalRMParser.g:4991:2: ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* )
            // InternalRMParser.g:4992:3: () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )*
            {
            // InternalRMParser.g:4992:3: ()
            // InternalRMParser.g:4993:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilitiesAccess().getECapabilitiesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:4999:3: ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRMParser.g:5000:4: (lv_capabilities_1_0= ruleECapabilityDefinition )
            	    {
            	    // InternalRMParser.g:5000:4: (lv_capabilities_1_0= ruleECapabilityDefinition )
            	    // InternalRMParser.g:5001:5: lv_capabilities_1_0= ruleECapabilityDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getECapabilitiesAccess().getCapabilitiesECapabilityDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
    // $ANTLR end "ruleECapabilities"


    // $ANTLR start "entryRuleECapabilityDefinition"
    // InternalRMParser.g:5022:1: entryRuleECapabilityDefinition returns [EObject current=null] : iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF ;
    public final EObject entryRuleECapabilityDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityDefinition = null;


        try {
            // InternalRMParser.g:5022:62: (iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF )
            // InternalRMParser.g:5023:2: iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF
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
    // InternalRMParser.g:5029:1: ruleECapabilityDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleECapabilityDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_capability_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5035:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:5036:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:5036:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:5037:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:5037:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:5038:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:5038:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:5039:5: lv_name_0_0= RULE_ID
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
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_56); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getECapabilityDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:5063:3: ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) )
            // InternalRMParser.g:5064:4: (lv_capability_3_0= ruleECapabilityDefinitionBody )
            {
            // InternalRMParser.g:5064:4: (lv_capability_3_0= ruleECapabilityDefinitionBody )
            // InternalRMParser.g:5065:5: lv_capability_3_0= ruleECapabilityDefinitionBody
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
    // InternalRMParser.g:5090:1: entryRuleECapabilityDefinitionBody returns [EObject current=null] : iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF ;
    public final EObject entryRuleECapabilityDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityDefinitionBody = null;


        try {
            // InternalRMParser.g:5090:66: (iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF )
            // InternalRMParser.g:5091:2: iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF
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
    // InternalRMParser.g:5097:1: ruleECapabilityDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleECapabilityDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
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
        EObject lv_properties_7_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_valid_source_types_15_0 = null;

        EObject lv_occurrences_start_19_0 = null;

        EObject lv_occurrences_end_21_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5103:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:5104:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:5104:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:5105:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:5105:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:5106:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:5109:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?)
            // InternalRMParser.g:5110:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:5110:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=7;
                int LA41_0 = input.LA(1);

                if ( LA41_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt41=1;
                }
                else if ( LA41_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt41=2;
                }
                else if ( LA41_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt41=3;
                }
                else if ( LA41_0 == Attributes && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt41=4;
                }
                else if ( LA41_0 == Valid_source_types && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
                    alt41=5;
                }
                else if ( LA41_0 == Occurrences && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
                    alt41=6;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalRMParser.g:5111:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5111:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:5112:4: {...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:5112:119: ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:5113:5: ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:5116:8: ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:5116:9: {...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5116:18: (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:5116:19: otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getECapabilityDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:5120:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:5121:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:5121:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:5122:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_57); 

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
            	    // InternalRMParser.g:5139:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5139:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:5140:4: {...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:5140:119: ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:5141:5: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:5144:8: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:5144:9: {...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5144:18: (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:5144:19: otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Description,FOLLOW_13); 

            	    								newLeafNode(otherlv_3, grammarAccess.getECapabilityDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRMParser.g:5148:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRMParser.g:5149:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:5149:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRMParser.g:5150:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

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
            	    // InternalRMParser.g:5172:3: ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:5172:3: ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) )
            	    // InternalRMParser.g:5173:4: {...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:5173:119: ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) )
            	    // InternalRMParser.g:5174:5: ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:5177:8: ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) )
            	    // InternalRMParser.g:5177:9: {...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5177:18: (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END )
            	    // InternalRMParser.g:5177:19: otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END
            	    {
            	    otherlv_5=(Token)match(input,Properties,FOLLOW_5); 

            	    								newLeafNode(otherlv_5, grammarAccess.getECapabilityDefinitionBodyAccess().getPropertiesKeyword_2_0());
            	    							
            	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    								newLeafNode(this_BEGIN_6, grammarAccess.getECapabilityDefinitionBodyAccess().getBEGINTerminalRuleCall_2_1());
            	    							
            	    // InternalRMParser.g:5185:8: ( (lv_properties_7_0= ruleEProperties ) )
            	    // InternalRMParser.g:5186:9: (lv_properties_7_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:5186:9: (lv_properties_7_0= ruleEProperties )
            	    // InternalRMParser.g:5187:10: lv_properties_7_0= ruleEProperties
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

            	    this_END_8=(Token)match(input,RULE_END,FOLLOW_57); 

            	    								newLeafNode(this_END_8, grammarAccess.getECapabilityDefinitionBodyAccess().getENDTerminalRuleCall_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:5214:3: ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:5214:3: ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) )
            	    // InternalRMParser.g:5215:4: {...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:5215:119: ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) )
            	    // InternalRMParser.g:5216:5: ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:5219:8: ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) )
            	    // InternalRMParser.g:5219:9: {...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5219:18: (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END )
            	    // InternalRMParser.g:5219:19: otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Attributes,FOLLOW_5); 

            	    								newLeafNode(otherlv_9, grammarAccess.getECapabilityDefinitionBodyAccess().getAttributesKeyword_3_0());
            	    							
            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    								newLeafNode(this_BEGIN_10, grammarAccess.getECapabilityDefinitionBodyAccess().getBEGINTerminalRuleCall_3_1());
            	    							
            	    // InternalRMParser.g:5227:8: ( (lv_attributes_11_0= ruleEAttributes ) )
            	    // InternalRMParser.g:5228:9: (lv_attributes_11_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:5228:9: (lv_attributes_11_0= ruleEAttributes )
            	    // InternalRMParser.g:5229:10: lv_attributes_11_0= ruleEAttributes
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

            	    this_END_12=(Token)match(input,RULE_END,FOLLOW_57); 

            	    								newLeafNode(this_END_12, grammarAccess.getECapabilityDefinitionBodyAccess().getENDTerminalRuleCall_3_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRMParser.g:5256:3: ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:5256:3: ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:5257:4: {...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRMParser.g:5257:119: ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) )
            	    // InternalRMParser.g:5258:5: ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRMParser.g:5261:8: ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) )
            	    // InternalRMParser.g:5261:9: {...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5261:18: (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket )
            	    // InternalRMParser.g:5261:19: otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket
            	    {
            	    otherlv_13=(Token)match(input,Valid_source_types,FOLLOW_30); 

            	    								newLeafNode(otherlv_13, grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesKeyword_4_0());
            	    							
            	    otherlv_14=(Token)match(input,LeftSquareBracket,FOLLOW_58); 

            	    								newLeafNode(otherlv_14, grammarAccess.getECapabilityDefinitionBodyAccess().getLeftSquareBracketKeyword_4_1());
            	    							
            	    // InternalRMParser.g:5269:8: ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==RULE_QUALIFIED_NAME) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalRMParser.g:5270:9: (lv_valid_source_types_15_0= ruleEValidSourceType )
            	            {
            	            // InternalRMParser.g:5270:9: (lv_valid_source_types_15_0= ruleEValidSourceType )
            	            // InternalRMParser.g:5271:10: lv_valid_source_types_15_0= ruleEValidSourceType
            	            {

            	            										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesEValidSourceTypeParserRuleCall_4_2_0());
            	            									
            	            pushFollow(FOLLOW_31);
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

            	    otherlv_16=(Token)match(input,RightSquareBracket,FOLLOW_57); 

            	    								newLeafNode(otherlv_16, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_4_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRMParser.g:5298:3: ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:5298:3: ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:5299:4: {...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRMParser.g:5299:119: ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) )
            	    // InternalRMParser.g:5300:5: ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRMParser.g:5303:8: ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) )
            	    // InternalRMParser.g:5303:9: {...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5303:18: (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket )
            	    // InternalRMParser.g:5303:19: otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket
            	    {
            	    otherlv_17=(Token)match(input,Occurrences,FOLLOW_30); 

            	    								newLeafNode(otherlv_17, grammarAccess.getECapabilityDefinitionBodyAccess().getOccurrencesKeyword_5_0());
            	    							
            	    otherlv_18=(Token)match(input,LeftSquareBracket,FOLLOW_59); 

            	    								newLeafNode(otherlv_18, grammarAccess.getECapabilityDefinitionBodyAccess().getLeftSquareBracketKeyword_5_1());
            	    							
            	    // InternalRMParser.g:5311:8: ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:5312:9: (lv_occurrences_start_19_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:5312:9: (lv_occurrences_start_19_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:5313:10: lv_occurrences_start_19_0= ruleEAlphaNumericValue
            	    {

            	    										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getOccurrences_startEAlphaNumericValueParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_60);
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

            	    otherlv_20=(Token)match(input,Comma,FOLLOW_59); 

            	    								newLeafNode(otherlv_20, grammarAccess.getECapabilityDefinitionBodyAccess().getCommaKeyword_5_3());
            	    							
            	    // InternalRMParser.g:5334:8: ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:5335:9: (lv_occurrences_end_21_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:5335:9: (lv_occurrences_end_21_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:5336:10: lv_occurrences_end_21_0= ruleEAlphaNumericValue
            	    {

            	    										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getOccurrences_endEAlphaNumericValueParserRuleCall_5_4_0());
            	    									
            	    pushFollow(FOLLOW_31);
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

            	    otherlv_22=(Token)match(input,RightSquareBracket,FOLLOW_57); 

            	    								newLeafNode(otherlv_22, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_5_5());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

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
    // InternalRMParser.g:5374:1: entryRuleEValidSourceType returns [EObject current=null] : iv_ruleEValidSourceType= ruleEValidSourceType EOF ;
    public final EObject entryRuleEValidSourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidSourceType = null;


        try {
            // InternalRMParser.g:5374:57: (iv_ruleEValidSourceType= ruleEValidSourceType EOF )
            // InternalRMParser.g:5375:2: iv_ruleEValidSourceType= ruleEValidSourceType EOF
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
    // InternalRMParser.g:5381:1: ruleEValidSourceType returns [EObject current=null] : ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* ) ;
    public final EObject ruleEValidSourceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sourceTypes_0_0 = null;

        EObject lv_sourceType_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5387:2: ( ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* ) )
            // InternalRMParser.g:5388:2: ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* )
            {
            // InternalRMParser.g:5388:2: ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* )
            // InternalRMParser.g:5389:3: ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )*
            {
            // InternalRMParser.g:5389:3: ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) )
            // InternalRMParser.g:5390:4: (lv_sourceTypes_0_0= ruleENodeTypeRef )
            {
            // InternalRMParser.g:5390:4: (lv_sourceTypes_0_0= ruleENodeTypeRef )
            // InternalRMParser.g:5391:5: lv_sourceTypes_0_0= ruleENodeTypeRef
            {

            					newCompositeNode(grammarAccess.getEValidSourceTypeAccess().getSourceTypesENodeTypeRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalRMParser.g:5408:3: (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Comma) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalRMParser.g:5409:4: otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEValidSourceTypeAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRMParser.g:5413:4: ( (lv_sourceType_2_0= ruleENodeTypeRef ) )
            	    // InternalRMParser.g:5414:5: (lv_sourceType_2_0= ruleENodeTypeRef )
            	    {
            	    // InternalRMParser.g:5414:5: (lv_sourceType_2_0= ruleENodeTypeRef )
            	    // InternalRMParser.g:5415:6: lv_sourceType_2_0= ruleENodeTypeRef
            	    {

            	    						newCompositeNode(grammarAccess.getEValidSourceTypeAccess().getSourceTypeENodeTypeRefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
    // $ANTLR end "ruleEValidSourceType"


    // $ANTLR start "entryRuleENodeTypeRef"
    // InternalRMParser.g:5437:1: entryRuleENodeTypeRef returns [EObject current=null] : iv_ruleENodeTypeRef= ruleENodeTypeRef EOF ;
    public final EObject entryRuleENodeTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypeRef = null;


        try {
            // InternalRMParser.g:5437:53: (iv_ruleENodeTypeRef= ruleENodeTypeRef EOF )
            // InternalRMParser.g:5438:2: iv_ruleENodeTypeRef= ruleENodeTypeRef EOF
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
    // InternalRMParser.g:5444:1: ruleENodeTypeRef returns [EObject current=null] : ( (otherlv_0= RULE_QUALIFIED_NAME ) ) ;
    public final EObject ruleENodeTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:5450:2: ( ( (otherlv_0= RULE_QUALIFIED_NAME ) ) )
            // InternalRMParser.g:5451:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            {
            // InternalRMParser.g:5451:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:5452:3: (otherlv_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:5452:3: (otherlv_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:5453:4: otherlv_0= RULE_QUALIFIED_NAME
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
    // InternalRMParser.g:5467:1: entryRuleERequirements returns [EObject current=null] : iv_ruleERequirements= ruleERequirements EOF ;
    public final EObject entryRuleERequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirements = null;


        try {
            // InternalRMParser.g:5467:54: (iv_ruleERequirements= ruleERequirements EOF )
            // InternalRMParser.g:5468:2: iv_ruleERequirements= ruleERequirements EOF
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
    // InternalRMParser.g:5474:1: ruleERequirements returns [EObject current=null] : ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* ) ;
    public final EObject ruleERequirements() throws RecognitionException {
        EObject current = null;

        EObject lv_requirements_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5480:2: ( ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* ) )
            // InternalRMParser.g:5481:2: ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* )
            {
            // InternalRMParser.g:5481:2: ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* )
            // InternalRMParser.g:5482:3: () ( (lv_requirements_1_0= ruleERequirementDefinition ) )*
            {
            // InternalRMParser.g:5482:3: ()
            // InternalRMParser.g:5483:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERequirementsAccess().getERequirementsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:5489:3: ( (lv_requirements_1_0= ruleERequirementDefinition ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalRMParser.g:5490:4: (lv_requirements_1_0= ruleERequirementDefinition )
            	    {
            	    // InternalRMParser.g:5490:4: (lv_requirements_1_0= ruleERequirementDefinition )
            	    // InternalRMParser.g:5491:5: lv_requirements_1_0= ruleERequirementDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getERequirementsAccess().getRequirementsERequirementDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop43;
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
    // InternalRMParser.g:5512:1: entryRuleERequirementDefinition returns [EObject current=null] : iv_ruleERequirementDefinition= ruleERequirementDefinition EOF ;
    public final EObject entryRuleERequirementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementDefinition = null;


        try {
            // InternalRMParser.g:5512:63: (iv_ruleERequirementDefinition= ruleERequirementDefinition EOF )
            // InternalRMParser.g:5513:2: iv_ruleERequirementDefinition= ruleERequirementDefinition EOF
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
    // InternalRMParser.g:5519:1: ruleERequirementDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleERequirementDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_requirement_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5525:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:5526:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:5526:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:5527:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:5527:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:5528:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:5528:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:5529:5: lv_name_0_0= RULE_ID
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
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_61); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getERequirementDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:5553:3: ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) )
            // InternalRMParser.g:5554:4: (lv_requirement_3_0= ruleERequirementDefinitionBody )
            {
            // InternalRMParser.g:5554:4: (lv_requirement_3_0= ruleERequirementDefinitionBody )
            // InternalRMParser.g:5555:5: lv_requirement_3_0= ruleERequirementDefinitionBody
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
    // InternalRMParser.g:5580:1: entryRuleERequirementDefinitionBody returns [EObject current=null] : iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF ;
    public final EObject entryRuleERequirementDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementDefinitionBody = null;


        try {
            // InternalRMParser.g:5580:67: (iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF )
            // InternalRMParser.g:5581:2: iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF
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
    // InternalRMParser.g:5587:1: ruleERequirementDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) ) ;
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
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_start_9_0 = null;

        EObject lv_end_11_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5593:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:5594:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:5594:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:5595:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:5595:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:5596:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:5599:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?)
            // InternalRMParser.g:5600:5: ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:5600:5: ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=5;
                int LA44_0 = input.LA(1);

                if ( LA44_0 == Capability && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt44=1;
                }
                else if ( LA44_0 == Node && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt44=2;
                }
                else if ( LA44_0 == Relationship && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt44=3;
                }
                else if ( LA44_0 == Occurrences && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt44=4;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalRMParser.g:5601:3: ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5601:3: ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:5602:4: {...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:5602:120: ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:5603:5: ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:5606:8: ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:5606:9: {...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5606:18: (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:5606:19: otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Capability,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getERequirementDefinitionBodyAccess().getCapabilityKeyword_0_0());
            	    							
            	    // InternalRMParser.g:5610:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:5611:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:5611:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:5612:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_62); 

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
            	    // InternalRMParser.g:5629:3: ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5629:3: ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:5630:4: {...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:5630:120: ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:5631:5: ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:5634:8: ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:5634:9: {...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5634:18: (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:5634:19: otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_3=(Token)match(input,Node,FOLLOW_8); 

            	    								newLeafNode(otherlv_3, grammarAccess.getERequirementDefinitionBodyAccess().getNodeKeyword_1_0());
            	    							
            	    // InternalRMParser.g:5638:8: ( (otherlv_4= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:5639:9: (otherlv_4= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:5639:9: (otherlv_4= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:5640:10: otherlv_4= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_4=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_62); 

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
            	    // InternalRMParser.g:5657:3: ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5657:3: ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:5658:4: {...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:5658:120: ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:5659:5: ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:5662:8: ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:5662:9: {...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5662:18: (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:5662:19: otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,Relationship,FOLLOW_8); 

            	    								newLeafNode(otherlv_5, grammarAccess.getERequirementDefinitionBodyAccess().getRelationshipKeyword_2_0());
            	    							
            	    // InternalRMParser.g:5666:8: ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:5667:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:5667:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:5668:10: otherlv_6= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_6=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_62); 

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
            	    // InternalRMParser.g:5685:3: ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:5685:3: ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:5686:4: {...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:5686:120: ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) )
            	    // InternalRMParser.g:5687:5: ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:5690:8: ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) )
            	    // InternalRMParser.g:5690:9: {...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5690:18: (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket )
            	    // InternalRMParser.g:5690:19: otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket
            	    {
            	    otherlv_7=(Token)match(input,Occurrences,FOLLOW_30); 

            	    								newLeafNode(otherlv_7, grammarAccess.getERequirementDefinitionBodyAccess().getOccurrencesKeyword_3_0());
            	    							
            	    otherlv_8=(Token)match(input,LeftSquareBracket,FOLLOW_59); 

            	    								newLeafNode(otherlv_8, grammarAccess.getERequirementDefinitionBodyAccess().getLeftSquareBracketKeyword_3_1());
            	    							
            	    // InternalRMParser.g:5698:8: ( (lv_start_9_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:5699:9: (lv_start_9_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:5699:9: (lv_start_9_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:5700:10: lv_start_9_0= ruleEAlphaNumericValue
            	    {

            	    										newCompositeNode(grammarAccess.getERequirementDefinitionBodyAccess().getStartEAlphaNumericValueParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_60);
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

            	    otherlv_10=(Token)match(input,Comma,FOLLOW_59); 

            	    								newLeafNode(otherlv_10, grammarAccess.getERequirementDefinitionBodyAccess().getCommaKeyword_3_3());
            	    							
            	    // InternalRMParser.g:5721:8: ( (lv_end_11_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:5722:9: (lv_end_11_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:5722:9: (lv_end_11_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:5723:10: lv_end_11_0= ruleEAlphaNumericValue
            	    {

            	    										newCompositeNode(grammarAccess.getERequirementDefinitionBodyAccess().getEndEAlphaNumericValueParserRuleCall_3_4_0());
            	    									
            	    pushFollow(FOLLOW_31);
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

            	    otherlv_12=(Token)match(input,RightSquareBracket,FOLLOW_62); 

            	    								newLeafNode(otherlv_12, grammarAccess.getERequirementDefinitionBodyAccess().getRightSquareBracketKeyword_3_5());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            	    				

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
    // InternalRMParser.g:5761:1: entryRuleEConstraints returns [EObject current=null] : iv_ruleEConstraints= ruleEConstraints EOF ;
    public final EObject entryRuleEConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraints = null;


        try {
            // InternalRMParser.g:5761:53: (iv_ruleEConstraints= ruleEConstraints EOF )
            // InternalRMParser.g:5762:2: iv_ruleEConstraints= ruleEConstraints EOF
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
    // InternalRMParser.g:5768:1: ruleEConstraints returns [EObject current=null] : ( () ( (lv_constraints_1_0= ruleEConstraint ) )* ) ;
    public final EObject ruleEConstraints() throws RecognitionException {
        EObject current = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5774:2: ( ( () ( (lv_constraints_1_0= ruleEConstraint ) )* ) )
            // InternalRMParser.g:5775:2: ( () ( (lv_constraints_1_0= ruleEConstraint ) )* )
            {
            // InternalRMParser.g:5775:2: ( () ( (lv_constraints_1_0= ruleEConstraint ) )* )
            // InternalRMParser.g:5776:3: () ( (lv_constraints_1_0= ruleEConstraint ) )*
            {
            // InternalRMParser.g:5776:3: ()
            // InternalRMParser.g:5777:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConstraintsAccess().getEConstraintsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:5783:3: ( (lv_constraints_1_0= ruleEConstraint ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==Greater_or_equal||LA45_0==Less_or_equal||LA45_0==Greater_than||LA45_0==Valid_values||(LA45_0>=Max_length && LA45_0<=Min_length)||LA45_0==Less_than||LA45_0==In_range||LA45_0==Length||LA45_0==Equal) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalRMParser.g:5784:4: (lv_constraints_1_0= ruleEConstraint )
            	    {
            	    // InternalRMParser.g:5784:4: (lv_constraints_1_0= ruleEConstraint )
            	    // InternalRMParser.g:5785:5: lv_constraints_1_0= ruleEConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getEConstraintsAccess().getConstraintsEConstraintParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_63);
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
    // $ANTLR end "ruleEConstraints"


    // $ANTLR start "entryRuleEConstraint"
    // InternalRMParser.g:5806:1: entryRuleEConstraint returns [EObject current=null] : iv_ruleEConstraint= ruleEConstraint EOF ;
    public final EObject entryRuleEConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraint = null;


        try {
            // InternalRMParser.g:5806:52: (iv_ruleEConstraint= ruleEConstraint EOF )
            // InternalRMParser.g:5807:2: iv_ruleEConstraint= ruleEConstraint EOF
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
    // InternalRMParser.g:5813:1: ruleEConstraint returns [EObject current=null] : (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) ;
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
            // InternalRMParser.g:5819:2: ( (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) )
            // InternalRMParser.g:5820:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            {
            // InternalRMParser.g:5820:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            int alt46=10;
            switch ( input.LA(1) ) {
            case Equal:
                {
                alt46=1;
                }
                break;
            case Greater_than:
                {
                alt46=2;
                }
                break;
            case Greater_or_equal:
                {
                alt46=3;
                }
                break;
            case Less_than:
                {
                alt46=4;
                }
                break;
            case Less_or_equal:
                {
                alt46=5;
                }
                break;
            case In_range:
                {
                alt46=6;
                }
                break;
            case Valid_values:
                {
                alt46=7;
                }
                break;
            case Length:
                {
                alt46=8;
                }
                break;
            case Min_length:
                {
                alt46=9;
                }
                break;
            case Max_length:
                {
                alt46=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalRMParser.g:5821:3: this_EEqual_0= ruleEEqual
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
                    // InternalRMParser.g:5830:3: this_EGreaterThan_1= ruleEGreaterThan
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
                    // InternalRMParser.g:5839:3: this_EGreaterOrEqual_2= ruleEGreaterOrEqual
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
                    // InternalRMParser.g:5848:3: this_ELessThan_3= ruleELessThan
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
                    // InternalRMParser.g:5857:3: this_ELessOrEqual_4= ruleELessOrEqual
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
                    // InternalRMParser.g:5866:3: this_EInRange_5= ruleEInRange
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
                    // InternalRMParser.g:5875:3: this_EValid_Values_6= ruleEValid_Values
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
                    // InternalRMParser.g:5884:3: this_ELength_7= ruleELength
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
                    // InternalRMParser.g:5893:3: this_EMinLength_8= ruleEMinLength
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
                    // InternalRMParser.g:5902:3: this_EMaxLength_9= ruleEMaxLength
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
    // InternalRMParser.g:5914:1: entryRuleEMaxLength returns [EObject current=null] : iv_ruleEMaxLength= ruleEMaxLength EOF ;
    public final EObject entryRuleEMaxLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMaxLength = null;


        try {
            // InternalRMParser.g:5914:51: (iv_ruleEMaxLength= ruleEMaxLength EOF )
            // InternalRMParser.g:5915:2: iv_ruleEMaxLength= ruleEMaxLength EOF
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
    // InternalRMParser.g:5921:1: ruleEMaxLength returns [EObject current=null] : (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEMaxLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5927:2: ( (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:5928:2: (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:5928:2: (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:5929:3: otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Max_length,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getEMaxLengthAccess().getMax_lengthKeyword_0());
            		
            // InternalRMParser.g:5933:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:5934:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:5934:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:5935:5: lv_val_1_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:5956:1: entryRuleEMinLength returns [EObject current=null] : iv_ruleEMinLength= ruleEMinLength EOF ;
    public final EObject entryRuleEMinLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMinLength = null;


        try {
            // InternalRMParser.g:5956:51: (iv_ruleEMinLength= ruleEMinLength EOF )
            // InternalRMParser.g:5957:2: iv_ruleEMinLength= ruleEMinLength EOF
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
    // InternalRMParser.g:5963:1: ruleEMinLength returns [EObject current=null] : (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEMinLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5969:2: ( (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:5970:2: (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:5970:2: (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:5971:3: otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Min_length,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getEMinLengthAccess().getMin_lengthKeyword_0());
            		
            // InternalRMParser.g:5975:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:5976:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:5976:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:5977:5: lv_val_1_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:5998:1: entryRuleELength returns [EObject current=null] : iv_ruleELength= ruleELength EOF ;
    public final EObject entryRuleELength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELength = null;


        try {
            // InternalRMParser.g:5998:48: (iv_ruleELength= ruleELength EOF )
            // InternalRMParser.g:5999:2: iv_ruleELength= ruleELength EOF
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
    // InternalRMParser.g:6005:1: ruleELength returns [EObject current=null] : (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleELength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6011:2: ( (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6012:2: (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6012:2: (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6013:3: otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Length,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getELengthAccess().getLengthKeyword_0());
            		
            // InternalRMParser.g:6017:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6018:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6018:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6019:5: lv_val_1_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:6040:1: entryRuleEValid_Values returns [EObject current=null] : iv_ruleEValid_Values= ruleEValid_Values EOF ;
    public final EObject entryRuleEValid_Values() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValid_Values = null;


        try {
            // InternalRMParser.g:6040:54: (iv_ruleEValid_Values= ruleEValid_Values EOF )
            // InternalRMParser.g:6041:2: iv_ruleEValid_Values= ruleEValid_Values EOF
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
    // InternalRMParser.g:6047:1: ruleEValid_Values returns [EObject current=null] : (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) ) ;
    public final EObject ruleEValid_Values() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6053:2: ( (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) ) )
            // InternalRMParser.g:6054:2: (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) )
            {
            // InternalRMParser.g:6054:2: (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) )
            // InternalRMParser.g:6055:3: otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) )
            {
            otherlv_0=(Token)match(input,Valid_values,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getEValid_ValuesAccess().getValid_valuesKeyword_0());
            		
            // InternalRMParser.g:6059:3: ( (lv_val_1_0= ruleELIST ) )
            // InternalRMParser.g:6060:4: (lv_val_1_0= ruleELIST )
            {
            // InternalRMParser.g:6060:4: (lv_val_1_0= ruleELIST )
            // InternalRMParser.g:6061:5: lv_val_1_0= ruleELIST
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
    // InternalRMParser.g:6082:1: entryRuleELIST returns [EObject current=null] : iv_ruleELIST= ruleELIST EOF ;
    public final EObject entryRuleELIST() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELIST = null;


        try {
            // InternalRMParser.g:6082:46: (iv_ruleELIST= ruleELIST EOF )
            // InternalRMParser.g:6083:2: iv_ruleELIST= ruleELIST EOF
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
    // InternalRMParser.g:6089:1: ruleELIST returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket ) ;
    public final EObject ruleELIST() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_list_1_0 = null;

        EObject lv_list_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6095:2: ( (otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket ) )
            // InternalRMParser.g:6096:2: (otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket )
            {
            // InternalRMParser.g:6096:2: (otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket )
            // InternalRMParser.g:6097:3: otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getELISTAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalRMParser.g:6101:3: ( (lv_list_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6102:4: (lv_list_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6102:4: (lv_list_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6103:5: lv_list_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getELISTAccess().getListEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_64);
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

            // InternalRMParser.g:6120:3: (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==Comma) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalRMParser.g:6121:4: otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_59); 

            	    				newLeafNode(otherlv_2, grammarAccess.getELISTAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRMParser.g:6125:4: ( (lv_list_3_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:6126:5: (lv_list_3_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:6126:5: (lv_list_3_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:6127:6: lv_list_3_0= ruleEAlphaNumericValue
            	    {

            	    						newCompositeNode(grammarAccess.getELISTAccess().getListEAlphaNumericValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_64);
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
            	    break loop47;
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
    // InternalRMParser.g:6153:1: entryRuleEInRange returns [EObject current=null] : iv_ruleEInRange= ruleEInRange EOF ;
    public final EObject entryRuleEInRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInRange = null;


        try {
            // InternalRMParser.g:6153:49: (iv_ruleEInRange= ruleEInRange EOF )
            // InternalRMParser.g:6154:2: iv_ruleEInRange= ruleEInRange EOF
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
    // InternalRMParser.g:6160:1: ruleEInRange returns [EObject current=null] : (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket ) ;
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
            // InternalRMParser.g:6166:2: ( (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket ) )
            // InternalRMParser.g:6167:2: (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket )
            {
            // InternalRMParser.g:6167:2: (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket )
            // InternalRMParser.g:6168:3: otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket
            {
            otherlv_0=(Token)match(input,In_range,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getEInRangeAccess().getIn_rangeKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getEInRangeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRMParser.g:6176:3: ( (lv_start_2_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6177:4: (lv_start_2_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6177:4: (lv_start_2_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6178:5: lv_start_2_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getEInRangeAccess().getStartEAlphaNumericValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_60);
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

            otherlv_3=(Token)match(input,Comma,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getEInRangeAccess().getCommaKeyword_3());
            		
            // InternalRMParser.g:6199:3: ( (lv_end_4_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6200:4: (lv_end_4_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6200:4: (lv_end_4_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6201:5: lv_end_4_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getEInRangeAccess().getEndEAlphaNumericValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
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
    // InternalRMParser.g:6226:1: entryRuleELessOrEqual returns [EObject current=null] : iv_ruleELessOrEqual= ruleELessOrEqual EOF ;
    public final EObject entryRuleELessOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessOrEqual = null;


        try {
            // InternalRMParser.g:6226:53: (iv_ruleELessOrEqual= ruleELessOrEqual EOF )
            // InternalRMParser.g:6227:2: iv_ruleELessOrEqual= ruleELessOrEqual EOF
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
    // InternalRMParser.g:6233:1: ruleELessOrEqual returns [EObject current=null] : (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleELessOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6239:2: ( (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6240:2: (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6240:2: (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6241:3: otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Less_or_equal,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getELessOrEqualAccess().getLess_or_equalKeyword_0());
            		
            // InternalRMParser.g:6245:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6246:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6246:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6247:5: lv_val_1_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:6268:1: entryRuleELessThan returns [EObject current=null] : iv_ruleELessThan= ruleELessThan EOF ;
    public final EObject entryRuleELessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessThan = null;


        try {
            // InternalRMParser.g:6268:50: (iv_ruleELessThan= ruleELessThan EOF )
            // InternalRMParser.g:6269:2: iv_ruleELessThan= ruleELessThan EOF
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
    // InternalRMParser.g:6275:1: ruleELessThan returns [EObject current=null] : (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleELessThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6281:2: ( (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6282:2: (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6282:2: (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6283:3: otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Less_than,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getELessThanAccess().getLess_thanKeyword_0());
            		
            // InternalRMParser.g:6287:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6288:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6288:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6289:5: lv_val_1_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:6310:1: entryRuleEGreaterOrEqual returns [EObject current=null] : iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF ;
    public final EObject entryRuleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterOrEqual = null;


        try {
            // InternalRMParser.g:6310:56: (iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF )
            // InternalRMParser.g:6311:2: iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF
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
    // InternalRMParser.g:6317:1: ruleEGreaterOrEqual returns [EObject current=null] : (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6323:2: ( (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6324:2: (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6324:2: (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6325:3: otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Greater_or_equal,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterOrEqualAccess().getGreater_or_equalKeyword_0());
            		
            // InternalRMParser.g:6329:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6330:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6330:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6331:5: lv_val_1_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:6352:1: entryRuleEGreaterThan returns [EObject current=null] : iv_ruleEGreaterThan= ruleEGreaterThan EOF ;
    public final EObject entryRuleEGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterThan = null;


        try {
            // InternalRMParser.g:6352:53: (iv_ruleEGreaterThan= ruleEGreaterThan EOF )
            // InternalRMParser.g:6353:2: iv_ruleEGreaterThan= ruleEGreaterThan EOF
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
    // InternalRMParser.g:6359:1: ruleEGreaterThan returns [EObject current=null] : (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6365:2: ( (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6366:2: (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6366:2: (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6367:3: otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Greater_than,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterThanAccess().getGreater_thanKeyword_0());
            		
            // InternalRMParser.g:6371:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6372:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6372:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6373:5: lv_val_1_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:6394:1: entryRuleEEqual returns [EObject current=null] : iv_ruleEEqual= ruleEEqual EOF ;
    public final EObject entryRuleEEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEqual = null;


        try {
            // InternalRMParser.g:6394:47: (iv_ruleEEqual= ruleEEqual EOF )
            // InternalRMParser.g:6395:2: iv_ruleEEqual= ruleEEqual EOF
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
    // InternalRMParser.g:6401:1: ruleEEqual returns [EObject current=null] : (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) ) ;
    public final EObject ruleEEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6407:2: ( (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) ) )
            // InternalRMParser.g:6408:2: (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) )
            {
            // InternalRMParser.g:6408:2: (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) )
            // InternalRMParser.g:6409:3: otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) )
            {
            otherlv_0=(Token)match(input,Equal,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getEEqualAccess().getEqualKeyword_0());
            		
            // InternalRMParser.g:6413:3: ( (lv_val_1_0= ruleESingleValue ) )
            // InternalRMParser.g:6414:4: (lv_val_1_0= ruleESingleValue )
            {
            // InternalRMParser.g:6414:4: (lv_val_1_0= ruleESingleValue )
            // InternalRMParser.g:6415:5: lv_val_1_0= ruleESingleValue
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
    // InternalRMParser.g:6436:1: entryRuleEAssignmentValue returns [EObject current=null] : iv_ruleEAssignmentValue= ruleEAssignmentValue EOF ;
    public final EObject entryRuleEAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssignmentValue = null;


        try {
            // InternalRMParser.g:6436:57: (iv_ruleEAssignmentValue= ruleEAssignmentValue EOF )
            // InternalRMParser.g:6437:2: iv_ruleEAssignmentValue= ruleEAssignmentValue EOF
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
    // InternalRMParser.g:6443:1: ruleEAssignmentValue returns [EObject current=null] : (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction ) ;
    public final EObject ruleEAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject this_ESingleValue_0 = null;

        EObject this_ELIST_1 = null;

        EObject this_EMAP_2 = null;

        EObject this_EFunction_3 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6449:2: ( (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction ) )
            // InternalRMParser.g:6450:2: (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction )
            {
            // InternalRMParser.g:6450:2: (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction )
            int alt48=4;
            switch ( input.LA(1) ) {
            case HyphenMinus:
            case FullStop:
            case RULE_BOOLEAN:
            case RULE_INT:
            case RULE_STRING:
                {
                alt48=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt48=2;
                }
                break;
            case RULE_BEGIN:
                {
                alt48=3;
                }
                break;
            case Get_attribute:
            case Get_property:
            case Get_input:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalRMParser.g:6451:3: this_ESingleValue_0= ruleESingleValue
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
                    // InternalRMParser.g:6460:3: this_ELIST_1= ruleELIST
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
                    // InternalRMParser.g:6469:3: this_EMAP_2= ruleEMAP
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
                    // InternalRMParser.g:6478:3: this_EFunction_3= ruleEFunction
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
    // InternalRMParser.g:6490:1: entryRuleESingleValue returns [EObject current=null] : iv_ruleESingleValue= ruleESingleValue EOF ;
    public final EObject entryRuleESingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESingleValue = null;


        try {
            // InternalRMParser.g:6490:53: (iv_ruleESingleValue= ruleESingleValue EOF )
            // InternalRMParser.g:6491:2: iv_ruleESingleValue= ruleESingleValue EOF
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
    // InternalRMParser.g:6497:1: ruleESingleValue returns [EObject current=null] : (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT ) ;
    public final EObject ruleESingleValue() throws RecognitionException {
        EObject current = null;

        EObject this_ESTRING_0 = null;

        EObject this_EBOOLEAN_1 = null;

        EObject this_EFLOAT_2 = null;

        EObject this_ESIGNEDINT_3 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6503:2: ( (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT ) )
            // InternalRMParser.g:6504:2: (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT )
            {
            // InternalRMParser.g:6504:2: (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT )
            int alt49=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt49=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt49=2;
                }
                break;
            case RULE_INT:
                {
                int LA49_3 = input.LA(2);

                if ( (LA49_3==EOF||LA49_3==Greater_or_equal||LA49_3==Less_or_equal||LA49_3==Entry_schema||LA49_3==Greater_than||(LA49_3>=Valid_values && LA49_3<=Description)||(LA49_3>=Max_length && LA49_3<=Min_length)||LA49_3==Less_than||LA49_3==In_range||(LA49_3>=Required && LA49_3<=Default)||LA49_3==Length||(LA49_3>=Status && LA49_3<=Value)||LA49_3==Type||LA49_3==RULE_ID||LA49_3==RULE_END) ) {
                    alt49=4;
                }
                else if ( (LA49_3==FullStop) ) {
                    alt49=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 3, input);

                    throw nvae;
                }
                }
                break;
            case FullStop:
                {
                alt49=3;
                }
                break;
            case HyphenMinus:
                {
                alt49=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalRMParser.g:6505:3: this_ESTRING_0= ruleESTRING
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
                    // InternalRMParser.g:6514:3: this_EBOOLEAN_1= ruleEBOOLEAN
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
                    // InternalRMParser.g:6523:3: this_EFLOAT_2= ruleEFLOAT
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
                    // InternalRMParser.g:6532:3: this_ESIGNEDINT_3= ruleESIGNEDINT
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
    // InternalRMParser.g:6544:1: entryRuleEAlphaNumericValue returns [EObject current=null] : iv_ruleEAlphaNumericValue= ruleEAlphaNumericValue EOF ;
    public final EObject entryRuleEAlphaNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAlphaNumericValue = null;


        try {
            // InternalRMParser.g:6544:59: (iv_ruleEAlphaNumericValue= ruleEAlphaNumericValue EOF )
            // InternalRMParser.g:6545:2: iv_ruleEAlphaNumericValue= ruleEAlphaNumericValue EOF
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
    // InternalRMParser.g:6551:1: ruleEAlphaNumericValue returns [EObject current=null] : (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT ) ;
    public final EObject ruleEAlphaNumericValue() throws RecognitionException {
        EObject current = null;

        EObject this_ESTRING_0 = null;

        EObject this_EFLOAT_1 = null;

        EObject this_ESIGNEDINT_2 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6557:2: ( (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT ) )
            // InternalRMParser.g:6558:2: (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT )
            {
            // InternalRMParser.g:6558:2: (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT )
            int alt50=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt50=1;
                }
                break;
            case RULE_INT:
                {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==EOF||LA50_2==Greater_or_equal||LA50_2==Less_or_equal||LA50_2==Greater_than||LA50_2==Valid_values||(LA50_2>=Max_length && LA50_2<=Min_length)||LA50_2==Less_than||LA50_2==In_range||LA50_2==Length||LA50_2==Equal||LA50_2==Comma||LA50_2==RightSquareBracket||LA50_2==RULE_END) ) {
                    alt50=3;
                }
                else if ( (LA50_2==FullStop) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 2, input);

                    throw nvae;
                }
                }
                break;
            case FullStop:
                {
                alt50=2;
                }
                break;
            case HyphenMinus:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalRMParser.g:6559:3: this_ESTRING_0= ruleESTRING
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
                    // InternalRMParser.g:6568:3: this_EFLOAT_1= ruleEFLOAT
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
                    // InternalRMParser.g:6577:3: this_ESIGNEDINT_2= ruleESIGNEDINT
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
    // InternalRMParser.g:6589:1: entryRuleESTRING returns [EObject current=null] : iv_ruleESTRING= ruleESTRING EOF ;
    public final EObject entryRuleESTRING() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESTRING = null;


        try {
            // InternalRMParser.g:6589:48: (iv_ruleESTRING= ruleESTRING EOF )
            // InternalRMParser.g:6590:2: iv_ruleESTRING= ruleESTRING EOF
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
    // InternalRMParser.g:6596:1: ruleESTRING returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleESTRING() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:6602:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalRMParser.g:6603:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalRMParser.g:6603:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalRMParser.g:6604:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalRMParser.g:6604:3: (lv_value_0_0= RULE_STRING )
            // InternalRMParser.g:6605:4: lv_value_0_0= RULE_STRING
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
    // InternalRMParser.g:6624:1: entryRuleEBOOLEAN returns [EObject current=null] : iv_ruleEBOOLEAN= ruleEBOOLEAN EOF ;
    public final EObject entryRuleEBOOLEAN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBOOLEAN = null;


        try {
            // InternalRMParser.g:6624:49: (iv_ruleEBOOLEAN= ruleEBOOLEAN EOF )
            // InternalRMParser.g:6625:2: iv_ruleEBOOLEAN= ruleEBOOLEAN EOF
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
    // InternalRMParser.g:6631:1: ruleEBOOLEAN returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleEBOOLEAN() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:6637:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalRMParser.g:6638:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalRMParser.g:6638:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalRMParser.g:6639:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalRMParser.g:6639:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalRMParser.g:6640:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalRMParser.g:6659:1: entryRuleEFLOAT returns [EObject current=null] : iv_ruleEFLOAT= ruleEFLOAT EOF ;
    public final EObject entryRuleEFLOAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFLOAT = null;


        try {
            // InternalRMParser.g:6659:47: (iv_ruleEFLOAT= ruleEFLOAT EOF )
            // InternalRMParser.g:6660:2: iv_ruleEFLOAT= ruleEFLOAT EOF
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
    // InternalRMParser.g:6666:1: ruleEFLOAT returns [EObject current=null] : ( (lv_value_0_0= ruleFLOAT ) ) ;
    public final EObject ruleEFLOAT() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6672:2: ( ( (lv_value_0_0= ruleFLOAT ) ) )
            // InternalRMParser.g:6673:2: ( (lv_value_0_0= ruleFLOAT ) )
            {
            // InternalRMParser.g:6673:2: ( (lv_value_0_0= ruleFLOAT ) )
            // InternalRMParser.g:6674:3: (lv_value_0_0= ruleFLOAT )
            {
            // InternalRMParser.g:6674:3: (lv_value_0_0= ruleFLOAT )
            // InternalRMParser.g:6675:4: lv_value_0_0= ruleFLOAT
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
    // InternalRMParser.g:6695:1: entryRuleESIGNEDINT returns [EObject current=null] : iv_ruleESIGNEDINT= ruleESIGNEDINT EOF ;
    public final EObject entryRuleESIGNEDINT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESIGNEDINT = null;


        try {
            // InternalRMParser.g:6695:51: (iv_ruleESIGNEDINT= ruleESIGNEDINT EOF )
            // InternalRMParser.g:6696:2: iv_ruleESIGNEDINT= ruleESIGNEDINT EOF
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
    // InternalRMParser.g:6702:1: ruleESIGNEDINT returns [EObject current=null] : ( (lv_value_0_0= ruleSIGNEDINT ) ) ;
    public final EObject ruleESIGNEDINT() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6708:2: ( ( (lv_value_0_0= ruleSIGNEDINT ) ) )
            // InternalRMParser.g:6709:2: ( (lv_value_0_0= ruleSIGNEDINT ) )
            {
            // InternalRMParser.g:6709:2: ( (lv_value_0_0= ruleSIGNEDINT ) )
            // InternalRMParser.g:6710:3: (lv_value_0_0= ruleSIGNEDINT )
            {
            // InternalRMParser.g:6710:3: (lv_value_0_0= ruleSIGNEDINT )
            // InternalRMParser.g:6711:4: lv_value_0_0= ruleSIGNEDINT
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
    // InternalRMParser.g:6731:1: entryRuleEMAP returns [EObject current=null] : iv_ruleEMAP= ruleEMAP EOF ;
    public final EObject entryRuleEMAP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMAP = null;


        try {
            // InternalRMParser.g:6731:45: (iv_ruleEMAP= ruleEMAP EOF )
            // InternalRMParser.g:6732:2: iv_ruleEMAP= ruleEMAP EOF
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
    // InternalRMParser.g:6738:1: ruleEMAP returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END ) ;
    public final EObject ruleEMAP() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token this_END_2=null;
        EObject lv_map_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6744:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END ) )
            // InternalRMParser.g:6745:2: (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END )
            {
            // InternalRMParser.g:6745:2: (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END )
            // InternalRMParser.g:6746:3: this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getEMAPAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalRMParser.g:6750:3: ( (lv_map_1_0= ruleEMapEntry ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalRMParser.g:6751:4: (lv_map_1_0= ruleEMapEntry )
            	    {
            	    // InternalRMParser.g:6751:4: (lv_map_1_0= ruleEMapEntry )
            	    // InternalRMParser.g:6752:5: lv_map_1_0= ruleEMapEntry
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
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
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
    // InternalRMParser.g:6777:1: entryRuleEMapEntry returns [EObject current=null] : iv_ruleEMapEntry= ruleEMapEntry EOF ;
    public final EObject entryRuleEMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMapEntry = null;


        try {
            // InternalRMParser.g:6777:50: (iv_ruleEMapEntry= ruleEMapEntry EOF )
            // InternalRMParser.g:6778:2: iv_ruleEMapEntry= ruleEMapEntry EOF
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
    // InternalRMParser.g:6784:1: ruleEMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) ) ;
    public final EObject ruleEMapEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6790:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) ) )
            // InternalRMParser.g:6791:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) )
            {
            // InternalRMParser.g:6791:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) )
            // InternalRMParser.g:6792:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) )
            {
            // InternalRMParser.g:6792:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalRMParser.g:6793:4: (lv_key_0_0= RULE_ID )
            {
            // InternalRMParser.g:6793:4: (lv_key_0_0= RULE_ID )
            // InternalRMParser.g:6794:5: lv_key_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getEMapEntryAccess().getColonKeyword_1());
            		
            // InternalRMParser.g:6814:3: ( (lv_value_2_0= ruleEAssignmentValue ) )
            // InternalRMParser.g:6815:4: (lv_value_2_0= ruleEAssignmentValue )
            {
            // InternalRMParser.g:6815:4: (lv_value_2_0= ruleEAssignmentValue )
            // InternalRMParser.g:6816:5: lv_value_2_0= ruleEAssignmentValue
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


    // $ANTLR start "entryRuleSIGNEDINT"
    // InternalRMParser.g:6837:1: entryRuleSIGNEDINT returns [String current=null] : iv_ruleSIGNEDINT= ruleSIGNEDINT EOF ;
    public final String entryRuleSIGNEDINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNEDINT = null;


        try {
            // InternalRMParser.g:6837:49: (iv_ruleSIGNEDINT= ruleSIGNEDINT EOF )
            // InternalRMParser.g:6838:2: iv_ruleSIGNEDINT= ruleSIGNEDINT EOF
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
    // InternalRMParser.g:6844:1: ruleSIGNEDINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSIGNEDINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRMParser.g:6850:2: ( ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) )
            // InternalRMParser.g:6851:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            {
            // InternalRMParser.g:6851:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            // InternalRMParser.g:6852:3: (kw= HyphenMinus )? this_INT_1= RULE_INT
            {
            // InternalRMParser.g:6852:3: (kw= HyphenMinus )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==HyphenMinus) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRMParser.g:6853:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_66); 

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
    // InternalRMParser.g:6870:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalRMParser.g:6870:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalRMParser.g:6871:2: iv_ruleFLOAT= ruleFLOAT EOF
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
    // InternalRMParser.g:6877:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalRMParser.g:6883:2: ( ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT ) )
            // InternalRMParser.g:6884:2: ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT )
            {
            // InternalRMParser.g:6884:2: ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT )
            // InternalRMParser.g:6885:3: (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT
            {
            // InternalRMParser.g:6885:3: (this_INT_0= RULE_INT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRMParser.g:6886:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_67); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,FullStop,FOLLOW_66); 

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
    static final String dfa_4s = "\1\64\12\uffff";
    static final String dfa_5s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_6s = "\1\0\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\10\2\uffff\1\6\1\uffff\1\7\1\5\12\uffff\1\12\10\uffff\1\4\3\uffff\1\11\16\uffff\1\3\2\uffff\1\2",
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0012000440200692L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001006020000L,0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001006020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0048048301102100L,0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000030004020000L,0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000030004020002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001014020000L,0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001014020002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0004000804020000L,0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0004000804020002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004020000L,0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004020002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001094828000L,0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001094828002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001094020040L,0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001094020042L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0220300006040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0220300006040002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1800004000081000L,0x0000000000000184L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0220200004040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0220200004040002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0204000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0204000800000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004000004000800L,0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000004000802L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0280200000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0280200000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001802000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001802000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001880000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001880000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x020000101C000020L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x020000101C000022L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x1800000000000000L,0x0000000000000184L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0100000028400000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0100000028400002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0048048301102102L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8400000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x5800004000081000L,0x00000000000001A4L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x1000000000000000L});

}
