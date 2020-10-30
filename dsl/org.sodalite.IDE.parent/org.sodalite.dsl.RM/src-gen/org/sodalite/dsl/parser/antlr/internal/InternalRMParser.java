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
        AntlrDatatypeRuleToken lv_superType_3_0 = null;

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
    // InternalRMParser.g:753:1: entryRuleEDataTypeName returns [String current=null] : iv_ruleEDataTypeName= ruleEDataTypeName EOF ;
    public final String entryRuleEDataTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDataTypeName = null;


        try {
            // InternalRMParser.g:753:53: (iv_ruleEDataTypeName= ruleEDataTypeName EOF )
            // InternalRMParser.g:754:2: iv_ruleEDataTypeName= ruleEDataTypeName EOF
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
    // InternalRMParser.g:760:1: ruleEDataTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE ) ;
    public final AntlrDatatypeRuleToken ruleEDataTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUALIFIED_NAME_0=null;
        Token this_PRIMITIVE_DATA_TYPE_1=null;


        	enterRule();

        try {
            // InternalRMParser.g:766:2: ( (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE ) )
            // InternalRMParser.g:767:2: (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE )
            {
            // InternalRMParser.g:767:2: (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE )
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
                    // InternalRMParser.g:768:3: this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME
                    {
                    this_QUALIFIED_NAME_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_2); 

                    			current.merge(this_QUALIFIED_NAME_0);
                    		

                    			newLeafNode(this_QUALIFIED_NAME_0, grammarAccess.getEDataTypeNameAccess().getQUALIFIED_NAMETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRMParser.g:776:3: this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE
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
    // InternalRMParser.g:787:1: entryRuleEArtifactTypes returns [EObject current=null] : iv_ruleEArtifactTypes= ruleEArtifactTypes EOF ;
    public final EObject entryRuleEArtifactTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactTypes = null;


        try {
            // InternalRMParser.g:787:55: (iv_ruleEArtifactTypes= ruleEArtifactTypes EOF )
            // InternalRMParser.g:788:2: iv_ruleEArtifactTypes= ruleEArtifactTypes EOF
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
    // InternalRMParser.g:794:1: ruleEArtifactTypes returns [EObject current=null] : ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ ) ;
    public final EObject ruleEArtifactTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_artifactTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:800:2: ( ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ ) )
            // InternalRMParser.g:801:2: ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ )
            {
            // InternalRMParser.g:801:2: ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ )
            // InternalRMParser.g:802:3: () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+
            {
            // InternalRMParser.g:802:3: ()
            // InternalRMParser.g:803:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEArtifactTypesAccess().getEArtifactTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:809:3: ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+
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
            	    // InternalRMParser.g:810:4: (lv_artifactTypes_1_0= ruleEArtifactType )
            	    {
            	    // InternalRMParser.g:810:4: (lv_artifactTypes_1_0= ruleEArtifactType )
            	    // InternalRMParser.g:811:5: lv_artifactTypes_1_0= ruleEArtifactType
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
    // InternalRMParser.g:832:1: entryRuleEArtifactType returns [EObject current=null] : iv_ruleEArtifactType= ruleEArtifactType EOF ;
    public final EObject entryRuleEArtifactType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactType = null;


        try {
            // InternalRMParser.g:832:54: (iv_ruleEArtifactType= ruleEArtifactType EOF )
            // InternalRMParser.g:833:2: iv_ruleEArtifactType= ruleEArtifactType EOF
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
    // InternalRMParser.g:839:1: ruleEArtifactType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEArtifactType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_artifact_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:845:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:846:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:846:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:847:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:847:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:848:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:848:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:849:5: lv_name_0_0= RULE_QUALIFIED_NAME
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
            		
            // InternalRMParser.g:873:3: ( (lv_artifact_3_0= ruleEArtifactTypeBody ) )
            // InternalRMParser.g:874:4: (lv_artifact_3_0= ruleEArtifactTypeBody )
            {
            // InternalRMParser.g:874:4: (lv_artifact_3_0= ruleEArtifactTypeBody )
            // InternalRMParser.g:875:5: lv_artifact_3_0= ruleEArtifactTypeBody
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
    // InternalRMParser.g:900:1: entryRuleEArtifactTypeBody returns [EObject current=null] : iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF ;
    public final EObject entryRuleEArtifactTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactTypeBody = null;


        try {
            // InternalRMParser.g:900:58: (iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF )
            // InternalRMParser.g:901:2: iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF
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
    // InternalRMParser.g:907:1: ruleEArtifactTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEArtifactTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_superType_3_0=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_mime_type_7_0=null;
        Token otherlv_8=null;
        Token lv_file_ext_9_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:913:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:914:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:914:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:915:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:915:3: ()
            // InternalRMParser.g:916:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEArtifactTypeBodyAccess().getEArtifactTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:922:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRMParser.g:923:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRMParser.g:923:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRMParser.g:924:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:927:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRMParser.g:928:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRMParser.g:928:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )*
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
            	    // InternalRMParser.g:929:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:929:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:930:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:930:114: ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:931:6: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:934:9: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:934:10: {...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:934:19: (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:934:20: otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_8); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEArtifactTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:938:9: ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:939:10: (lv_superType_3_0= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:939:10: (lv_superType_3_0= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:940:11: lv_superType_3_0= RULE_QUALIFIED_NAME
            	    {
            	    lv_superType_3_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_18); 

            	    											newLeafNode(lv_superType_3_0, grammarAccess.getEArtifactTypeBodyAccess().getSuperTypeQUALIFIED_NAMETerminalRuleCall_1_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEArtifactTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"superType",
            	    												lv_superType_3_0,
            	    												"org.sodalite.dsl.RM.QUALIFIED_NAME");
            	    										

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
            	    // InternalRMParser.g:962:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:962:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:963:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:963:114: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:964:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:967:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:967:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:967:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:967:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEArtifactTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:971:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:972:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:972:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:973:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRMParser.g:995:4: ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:995:4: ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:996:5: {...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:996:114: ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:997:6: ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:1000:9: ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1000:10: {...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1000:19: (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1000:20: otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,Mime_type,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEArtifactTypeBodyAccess().getMime_typeKeyword_1_2_0());
            	    								
            	    // InternalRMParser.g:1004:9: ( (lv_mime_type_7_0= RULE_STRING ) )
            	    // InternalRMParser.g:1005:10: (lv_mime_type_7_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1005:10: (lv_mime_type_7_0= RULE_STRING )
            	    // InternalRMParser.g:1006:11: lv_mime_type_7_0= RULE_STRING
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
            	    // InternalRMParser.g:1028:4: ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1028:4: ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1029:5: {...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:1029:114: ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1030:6: ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:1033:9: ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1033:10: {...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1033:19: ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1033:20: (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) )
            	    {
            	    // InternalRMParser.g:1033:20: (otherlv_8= File_ext )+
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
            	    	    // InternalRMParser.g:1034:10: otherlv_8= File_ext
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

            	    // InternalRMParser.g:1039:9: ( (lv_file_ext_9_0= RULE_STRING ) )
            	    // InternalRMParser.g:1040:10: (lv_file_ext_9_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1040:10: (lv_file_ext_9_0= RULE_STRING )
            	    // InternalRMParser.g:1041:11: lv_file_ext_9_0= RULE_STRING
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
    // InternalRMParser.g:1074:1: entryRuleECapabilityTypes returns [EObject current=null] : iv_ruleECapabilityTypes= ruleECapabilityTypes EOF ;
    public final EObject entryRuleECapabilityTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypes = null;


        try {
            // InternalRMParser.g:1074:57: (iv_ruleECapabilityTypes= ruleECapabilityTypes EOF )
            // InternalRMParser.g:1075:2: iv_ruleECapabilityTypes= ruleECapabilityTypes EOF
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
    // InternalRMParser.g:1081:1: ruleECapabilityTypes returns [EObject current=null] : ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ ) ;
    public final EObject ruleECapabilityTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilityTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1087:2: ( ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ ) )
            // InternalRMParser.g:1088:2: ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ )
            {
            // InternalRMParser.g:1088:2: ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ )
            // InternalRMParser.g:1089:3: () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+
            {
            // InternalRMParser.g:1089:3: ()
            // InternalRMParser.g:1090:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilityTypesAccess().getECapabilityTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1096:3: ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+
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
            	    // InternalRMParser.g:1097:4: (lv_capabilityTypes_1_0= ruleECapabilityType )
            	    {
            	    // InternalRMParser.g:1097:4: (lv_capabilityTypes_1_0= ruleECapabilityType )
            	    // InternalRMParser.g:1098:5: lv_capabilityTypes_1_0= ruleECapabilityType
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
    // InternalRMParser.g:1119:1: entryRuleECapabilityType returns [EObject current=null] : iv_ruleECapabilityType= ruleECapabilityType EOF ;
    public final EObject entryRuleECapabilityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityType = null;


        try {
            // InternalRMParser.g:1119:56: (iv_ruleECapabilityType= ruleECapabilityType EOF )
            // InternalRMParser.g:1120:2: iv_ruleECapabilityType= ruleECapabilityType EOF
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
    // InternalRMParser.g:1126:1: ruleECapabilityType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleECapabilityType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_capability_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1132:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1133:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1133:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1134:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1134:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1135:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1135:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1136:5: lv_name_0_0= RULE_QUALIFIED_NAME
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
            		
            // InternalRMParser.g:1160:3: ( (lv_capability_3_0= ruleECapabilityTypeBody ) )
            // InternalRMParser.g:1161:4: (lv_capability_3_0= ruleECapabilityTypeBody )
            {
            // InternalRMParser.g:1161:4: (lv_capability_3_0= ruleECapabilityTypeBody )
            // InternalRMParser.g:1162:5: lv_capability_3_0= ruleECapabilityTypeBody
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
    // InternalRMParser.g:1187:1: entryRuleECapabilityTypeBody returns [EObject current=null] : iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF ;
    public final EObject entryRuleECapabilityTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypeBody = null;


        try {
            // InternalRMParser.g:1187:60: (iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF )
            // InternalRMParser.g:1188:2: iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF
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
    // InternalRMParser.g:1194:1: ruleECapabilityTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleECapabilityTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_superType_3_0=null;
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
            // InternalRMParser.g:1200:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:1201:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:1201:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:1202:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:1202:3: ()
            // InternalRMParser.g:1203:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilityTypeBodyAccess().getECapabilityTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1209:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:1210:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:1210:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:1211:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:1214:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:1215:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:1215:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )*
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
            	    // InternalRMParser.g:1216:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1216:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:1217:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:1217:116: ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:1218:6: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:1221:9: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:1221:10: {...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1221:19: (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:1221:20: otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_8); 

            	    									newLeafNode(otherlv_2, grammarAccess.getECapabilityTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:1225:9: ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:1226:10: (lv_superType_3_0= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:1226:10: (lv_superType_3_0= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:1227:11: lv_superType_3_0= RULE_QUALIFIED_NAME
            	    {
            	    lv_superType_3_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_21); 

            	    											newLeafNode(lv_superType_3_0, grammarAccess.getECapabilityTypeBodyAccess().getSuperTypeQUALIFIED_NAMETerminalRuleCall_1_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getECapabilityTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"superType",
            	    												lv_superType_3_0,
            	    												"org.sodalite.dsl.RM.QUALIFIED_NAME");
            	    										

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
            	    // InternalRMParser.g:1249:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1249:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1250:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:1250:116: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1251:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:1254:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1254:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1254:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1254:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getECapabilityTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:1258:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:1259:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1259:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:1260:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRMParser.g:1282:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1282:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:1283:5: {...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:1283:116: ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:1284:6: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:1287:9: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:1287:10: {...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1287:19: (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:1287:20: otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Properties,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getECapabilityTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getECapabilityTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:1295:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:1296:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:1296:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRMParser.g:1297:11: lv_properties_8_0= ruleEProperties
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
            	    // InternalRMParser.g:1324:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1324:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:1325:5: {...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:1325:116: ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:1326:6: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:1329:9: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:1329:10: {...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1329:19: (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:1329:20: otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Attributes,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getECapabilityTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getECapabilityTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:1337:9: ( (lv_atributes_12_0= ruleEAttributes ) )
            	    // InternalRMParser.g:1338:10: (lv_atributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:1338:10: (lv_atributes_12_0= ruleEAttributes )
            	    // InternalRMParser.g:1339:11: lv_atributes_12_0= ruleEAttributes
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
    // InternalRMParser.g:1377:1: entryRuleEInterfaceTypes returns [EObject current=null] : iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF ;
    public final EObject entryRuleEInterfaceTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceTypes = null;


        try {
            // InternalRMParser.g:1377:56: (iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF )
            // InternalRMParser.g:1378:2: iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF
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
    // InternalRMParser.g:1384:1: ruleEInterfaceTypes returns [EObject current=null] : ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ ) ;
    public final EObject ruleEInterfaceTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaceTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1390:2: ( ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ ) )
            // InternalRMParser.g:1391:2: ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ )
            {
            // InternalRMParser.g:1391:2: ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ )
            // InternalRMParser.g:1392:3: () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+
            {
            // InternalRMParser.g:1392:3: ()
            // InternalRMParser.g:1393:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceTypesAccess().getEInterfaceTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1399:3: ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+
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
            	    // InternalRMParser.g:1400:4: (lv_interfaceTypes_1_0= ruleEInterfaceType )
            	    {
            	    // InternalRMParser.g:1400:4: (lv_interfaceTypes_1_0= ruleEInterfaceType )
            	    // InternalRMParser.g:1401:5: lv_interfaceTypes_1_0= ruleEInterfaceType
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
    // InternalRMParser.g:1422:1: entryRuleEInterfaceType returns [EObject current=null] : iv_ruleEInterfaceType= ruleEInterfaceType EOF ;
    public final EObject entryRuleEInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceType = null;


        try {
            // InternalRMParser.g:1422:55: (iv_ruleEInterfaceType= ruleEInterfaceType EOF )
            // InternalRMParser.g:1423:2: iv_ruleEInterfaceType= ruleEInterfaceType EOF
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
    // InternalRMParser.g:1429:1: ruleEInterfaceType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEInterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_interface_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1435:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1436:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1436:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1437:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1437:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1438:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1438:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1439:5: lv_name_0_0= RULE_QUALIFIED_NAME
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
            		
            // InternalRMParser.g:1463:3: ( (lv_interface_3_0= ruleEInterfaceTypeBody ) )
            // InternalRMParser.g:1464:4: (lv_interface_3_0= ruleEInterfaceTypeBody )
            {
            // InternalRMParser.g:1464:4: (lv_interface_3_0= ruleEInterfaceTypeBody )
            // InternalRMParser.g:1465:5: lv_interface_3_0= ruleEInterfaceTypeBody
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
    // InternalRMParser.g:1490:1: entryRuleEInterfaceTypeBody returns [EObject current=null] : iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF ;
    public final EObject entryRuleEInterfaceTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceTypeBody = null;


        try {
            // InternalRMParser.g:1490:59: (iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF )
            // InternalRMParser.g:1491:2: iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF
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
    // InternalRMParser.g:1497:1: ruleEInterfaceTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEInterfaceTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_superType_3_0=null;
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
            // InternalRMParser.g:1503:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:1504:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:1504:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:1505:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:1505:3: ()
            // InternalRMParser.g:1506:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceTypeBodyAccess().getEInterfaceTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1512:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:1513:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:1513:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:1514:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:1517:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:1518:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:1518:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )*
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
            	    // InternalRMParser.g:1519:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1519:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:1520:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:1520:115: ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:1521:6: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:1524:9: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:1524:10: {...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1524:19: (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:1524:20: otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_8); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEInterfaceTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:1528:9: ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:1529:10: (lv_superType_3_0= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:1529:10: (lv_superType_3_0= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:1530:11: lv_superType_3_0= RULE_QUALIFIED_NAME
            	    {
            	    lv_superType_3_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_23); 

            	    											newLeafNode(lv_superType_3_0, grammarAccess.getEInterfaceTypeBodyAccess().getSuperTypeQUALIFIED_NAMETerminalRuleCall_1_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEInterfaceTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"superType",
            	    												lv_superType_3_0,
            	    												"org.sodalite.dsl.RM.QUALIFIED_NAME");
            	    										

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
            	    // InternalRMParser.g:1552:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1552:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1553:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:1553:115: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1554:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:1557:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1557:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1557:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1557:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEInterfaceTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:1561:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:1562:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1562:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:1563:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRMParser.g:1585:4: ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1585:4: ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:1586:5: {...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:1586:115: ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:1587:6: ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:1590:9: ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:1590:10: {...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1590:19: (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:1590:20: otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Inputs,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEInterfaceTypeBodyAccess().getInputsKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getEInterfaceTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:1598:9: ( (lv_inputs_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:1599:10: (lv_inputs_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:1599:10: (lv_inputs_8_0= ruleEProperties )
            	    // InternalRMParser.g:1600:11: lv_inputs_8_0= ruleEProperties
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
            	    // InternalRMParser.g:1627:4: ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1627:4: ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:1628:5: {...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:1628:115: ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:1629:6: ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:1632:9: ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:1632:10: {...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1632:19: (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:1632:20: otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Operations,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEInterfaceTypeBodyAccess().getOperationsKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getEInterfaceTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:1640:9: ( (lv_operations_12_0= ruleEOperations ) )
            	    // InternalRMParser.g:1641:10: (lv_operations_12_0= ruleEOperations )
            	    {
            	    // InternalRMParser.g:1641:10: (lv_operations_12_0= ruleEOperations )
            	    // InternalRMParser.g:1642:11: lv_operations_12_0= ruleEOperations
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
    // InternalRMParser.g:1680:1: entryRuleEPolicyTypes returns [EObject current=null] : iv_ruleEPolicyTypes= ruleEPolicyTypes EOF ;
    public final EObject entryRuleEPolicyTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyTypes = null;


        try {
            // InternalRMParser.g:1680:53: (iv_ruleEPolicyTypes= ruleEPolicyTypes EOF )
            // InternalRMParser.g:1681:2: iv_ruleEPolicyTypes= ruleEPolicyTypes EOF
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
    // InternalRMParser.g:1687:1: ruleEPolicyTypes returns [EObject current=null] : ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ ) ;
    public final EObject ruleEPolicyTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_policyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1693:2: ( ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ ) )
            // InternalRMParser.g:1694:2: ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ )
            {
            // InternalRMParser.g:1694:2: ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ )
            // InternalRMParser.g:1695:3: () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+
            {
            // InternalRMParser.g:1695:3: ()
            // InternalRMParser.g:1696:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPolicyTypesAccess().getEPolicyTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1702:3: ( (lv_policyTypes_1_0= ruleEPolicyType ) )+
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
            	    // InternalRMParser.g:1703:4: (lv_policyTypes_1_0= ruleEPolicyType )
            	    {
            	    // InternalRMParser.g:1703:4: (lv_policyTypes_1_0= ruleEPolicyType )
            	    // InternalRMParser.g:1704:5: lv_policyTypes_1_0= ruleEPolicyType
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
    // InternalRMParser.g:1725:1: entryRuleEPolicyType returns [EObject current=null] : iv_ruleEPolicyType= ruleEPolicyType EOF ;
    public final EObject entryRuleEPolicyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyType = null;


        try {
            // InternalRMParser.g:1725:52: (iv_ruleEPolicyType= ruleEPolicyType EOF )
            // InternalRMParser.g:1726:2: iv_ruleEPolicyType= ruleEPolicyType EOF
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
    // InternalRMParser.g:1732:1: ruleEPolicyType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEPolicyType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_policy_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1738:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1739:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1739:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1740:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1740:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1741:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1741:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1742:5: lv_name_0_0= RULE_QUALIFIED_NAME
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
            		
            // InternalRMParser.g:1766:3: ( (lv_policy_3_0= ruleEPolicyTypeBody ) )
            // InternalRMParser.g:1767:4: (lv_policy_3_0= ruleEPolicyTypeBody )
            {
            // InternalRMParser.g:1767:4: (lv_policy_3_0= ruleEPolicyTypeBody )
            // InternalRMParser.g:1768:5: lv_policy_3_0= ruleEPolicyTypeBody
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
    // InternalRMParser.g:1793:1: entryRuleEPolicyTypeBody returns [EObject current=null] : iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF ;
    public final EObject entryRuleEPolicyTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyTypeBody = null;


        try {
            // InternalRMParser.g:1793:56: (iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF )
            // InternalRMParser.g:1794:2: iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF
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
    // InternalRMParser.g:1800:1: ruleEPolicyTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEPolicyTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_superType_3_0=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:1806:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:1807:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:1807:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:1808:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:1808:3: ()
            // InternalRMParser.g:1809:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPolicyTypeBodyAccess().getEPolicyTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1815:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRMParser.g:1816:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRMParser.g:1816:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRMParser.g:1817:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:1820:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRMParser.g:1821:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRMParser.g:1821:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )*
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
            	    // InternalRMParser.g:1822:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1822:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:1823:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:1823:112: ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:1824:6: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:1827:9: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:1827:10: {...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1827:19: (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:1827:20: otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_8); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEPolicyTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:1831:9: ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:1832:10: (lv_superType_3_0= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:1832:10: (lv_superType_3_0= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:1833:11: lv_superType_3_0= RULE_QUALIFIED_NAME
            	    {
            	    lv_superType_3_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_25); 

            	    											newLeafNode(lv_superType_3_0, grammarAccess.getEPolicyTypeBodyAccess().getSuperTypeQUALIFIED_NAMETerminalRuleCall_1_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEPolicyTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"superType",
            	    												lv_superType_3_0,
            	    												"org.sodalite.dsl.RM.QUALIFIED_NAME");
            	    										

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
            	    // InternalRMParser.g:1855:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1855:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1856:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:1856:112: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1857:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:1860:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1860:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1860:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1860:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEPolicyTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:1864:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:1865:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1865:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:1866:11: lv_description_5_0= RULE_STRING
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
    // InternalRMParser.g:1899:1: entryRuleENodeTypes returns [EObject current=null] : iv_ruleENodeTypes= ruleENodeTypes EOF ;
    public final EObject entryRuleENodeTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypes = null;


        try {
            // InternalRMParser.g:1899:51: (iv_ruleENodeTypes= ruleENodeTypes EOF )
            // InternalRMParser.g:1900:2: iv_ruleENodeTypes= ruleENodeTypes EOF
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
    // InternalRMParser.g:1906:1: ruleENodeTypes returns [EObject current=null] : ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ ) ;
    public final EObject ruleENodeTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_nodeTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1912:2: ( ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ ) )
            // InternalRMParser.g:1913:2: ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ )
            {
            // InternalRMParser.g:1913:2: ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ )
            // InternalRMParser.g:1914:3: () ( (lv_nodeTypes_1_0= ruleENodeType ) )+
            {
            // InternalRMParser.g:1914:3: ()
            // InternalRMParser.g:1915:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getENodeTypesAccess().getENodeTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1921:3: ( (lv_nodeTypes_1_0= ruleENodeType ) )+
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
            	    // InternalRMParser.g:1922:4: (lv_nodeTypes_1_0= ruleENodeType )
            	    {
            	    // InternalRMParser.g:1922:4: (lv_nodeTypes_1_0= ruleENodeType )
            	    // InternalRMParser.g:1923:5: lv_nodeTypes_1_0= ruleENodeType
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
    // InternalRMParser.g:1944:1: entryRuleENodeType returns [EObject current=null] : iv_ruleENodeType= ruleENodeType EOF ;
    public final EObject entryRuleENodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeType = null;


        try {
            // InternalRMParser.g:1944:50: (iv_ruleENodeType= ruleENodeType EOF )
            // InternalRMParser.g:1945:2: iv_ruleENodeType= ruleENodeType EOF
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
    // InternalRMParser.g:1951:1: ruleENodeType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleENodeType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_node_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1957:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1958:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1958:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1959:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1959:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1960:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1960:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1961:5: lv_name_0_0= RULE_QUALIFIED_NAME
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
            		
            // InternalRMParser.g:1985:3: ( (lv_node_3_0= ruleENodeTypeBody ) )
            // InternalRMParser.g:1986:4: (lv_node_3_0= ruleENodeTypeBody )
            {
            // InternalRMParser.g:1986:4: (lv_node_3_0= ruleENodeTypeBody )
            // InternalRMParser.g:1987:5: lv_node_3_0= ruleENodeTypeBody
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
    // InternalRMParser.g:2012:1: entryRuleENodeTypeBody returns [EObject current=null] : iv_ruleENodeTypeBody= ruleENodeTypeBody EOF ;
    public final EObject entryRuleENodeTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypeBody = null;


        try {
            // InternalRMParser.g:2012:54: (iv_ruleENodeTypeBody= ruleENodeTypeBody EOF )
            // InternalRMParser.g:2013:2: iv_ruleENodeTypeBody= ruleENodeTypeBody EOF
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
    // InternalRMParser.g:2019:1: ruleENodeTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleENodeTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_superType_3_0=null;
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
            // InternalRMParser.g:2025:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:2026:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:2026:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:2027:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:2027:3: ()
            // InternalRMParser.g:2028:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getENodeTypeBodyAccess().getENodeTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2034:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:2035:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:2035:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:2036:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:2039:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:2040:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:2040:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )*
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
            	    // InternalRMParser.g:2041:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2041:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:2042:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:2042:110: ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:2043:6: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:2046:9: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:2046:10: {...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2046:19: (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:2046:20: otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_8); 

            	    									newLeafNode(otherlv_2, grammarAccess.getENodeTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:2050:9: ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:2051:10: (lv_superType_3_0= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:2051:10: (lv_superType_3_0= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:2052:11: lv_superType_3_0= RULE_QUALIFIED_NAME
            	    {
            	    lv_superType_3_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_27); 

            	    											newLeafNode(lv_superType_3_0, grammarAccess.getENodeTypeBodyAccess().getSuperTypeQUALIFIED_NAMETerminalRuleCall_1_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"superType",
            	    												lv_superType_3_0,
            	    												"org.sodalite.dsl.RM.QUALIFIED_NAME");
            	    										

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
            	    // InternalRMParser.g:2074:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2074:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:2075:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:2075:110: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:2076:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:2079:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:2079:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2079:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:2079:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getENodeTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:2083:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:2084:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:2084:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:2085:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRMParser.g:2107:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2107:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:2108:5: {...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:2108:110: ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:2109:6: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:2112:9: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:2112:10: {...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2112:19: (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:2112:20: otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Properties,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getENodeTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:2120:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:2121:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:2121:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRMParser.g:2122:11: lv_properties_8_0= ruleEProperties
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
            	    // InternalRMParser.g:2149:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2149:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:2150:5: {...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:2150:110: ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:2151:6: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:2154:9: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:2154:10: {...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2154:19: (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:2154:20: otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Attributes,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getENodeTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:2162:9: ( (lv_attributes_12_0= ruleEAttributes ) )
            	    // InternalRMParser.g:2163:10: (lv_attributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:2163:10: (lv_attributes_12_0= ruleEAttributes )
            	    // InternalRMParser.g:2164:11: lv_attributes_12_0= ruleEAttributes
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
            	    // InternalRMParser.g:2191:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2191:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    // InternalRMParser.g:2192:5: {...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalRMParser.g:2192:110: ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    // InternalRMParser.g:2193:6: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalRMParser.g:2196:9: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    // InternalRMParser.g:2196:10: {...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2196:19: (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    // InternalRMParser.g:2196:20: otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END
            	    {
            	    otherlv_14=(Token)match(input,Interfaces,FOLLOW_5); 

            	    									newLeafNode(otherlv_14, grammarAccess.getENodeTypeBodyAccess().getInterfacesKeyword_1_4_0());
            	    								
            	    this_BEGIN_15=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_15, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_4_1());
            	    								
            	    // InternalRMParser.g:2204:9: ( (lv_interfaces_16_0= ruleEInterfaces ) )
            	    // InternalRMParser.g:2205:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    {
            	    // InternalRMParser.g:2205:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    // InternalRMParser.g:2206:11: lv_interfaces_16_0= ruleEInterfaces
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
            	    // InternalRMParser.g:2233:4: ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2233:4: ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) )
            	    // InternalRMParser.g:2234:5: {...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalRMParser.g:2234:110: ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) )
            	    // InternalRMParser.g:2235:6: ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalRMParser.g:2238:9: ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) )
            	    // InternalRMParser.g:2238:10: {...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2238:19: (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END )
            	    // InternalRMParser.g:2238:20: otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END
            	    {
            	    otherlv_18=(Token)match(input,Capabilities,FOLLOW_5); 

            	    									newLeafNode(otherlv_18, grammarAccess.getENodeTypeBodyAccess().getCapabilitiesKeyword_1_5_0());
            	    								
            	    this_BEGIN_19=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_19, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_5_1());
            	    								
            	    // InternalRMParser.g:2246:9: ( (lv_capabilities_20_0= ruleECapabilities ) )
            	    // InternalRMParser.g:2247:10: (lv_capabilities_20_0= ruleECapabilities )
            	    {
            	    // InternalRMParser.g:2247:10: (lv_capabilities_20_0= ruleECapabilities )
            	    // InternalRMParser.g:2248:11: lv_capabilities_20_0= ruleECapabilities
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
            	    // InternalRMParser.g:2275:4: ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2275:4: ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) )
            	    // InternalRMParser.g:2276:5: {...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalRMParser.g:2276:110: ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) )
            	    // InternalRMParser.g:2277:6: ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalRMParser.g:2280:9: ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) )
            	    // InternalRMParser.g:2280:10: {...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2280:19: (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END )
            	    // InternalRMParser.g:2280:20: otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END
            	    {
            	    otherlv_22=(Token)match(input,Requirements,FOLLOW_5); 

            	    									newLeafNode(otherlv_22, grammarAccess.getENodeTypeBodyAccess().getRequirementsKeyword_1_6_0());
            	    								
            	    this_BEGIN_23=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_23, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_6_1());
            	    								
            	    // InternalRMParser.g:2288:9: ( (lv_requirements_24_0= ruleERequirements ) )
            	    // InternalRMParser.g:2289:10: (lv_requirements_24_0= ruleERequirements )
            	    {
            	    // InternalRMParser.g:2289:10: (lv_requirements_24_0= ruleERequirements )
            	    // InternalRMParser.g:2290:11: lv_requirements_24_0= ruleERequirements
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
    // InternalRMParser.g:2328:1: entryRuleERelationshipTypes returns [EObject current=null] : iv_ruleERelationshipTypes= ruleERelationshipTypes EOF ;
    public final EObject entryRuleERelationshipTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipTypes = null;


        try {
            // InternalRMParser.g:2328:59: (iv_ruleERelationshipTypes= ruleERelationshipTypes EOF )
            // InternalRMParser.g:2329:2: iv_ruleERelationshipTypes= ruleERelationshipTypes EOF
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
    // InternalRMParser.g:2335:1: ruleERelationshipTypes returns [EObject current=null] : ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ ) ;
    public final EObject ruleERelationshipTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_relationshipTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2341:2: ( ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ ) )
            // InternalRMParser.g:2342:2: ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ )
            {
            // InternalRMParser.g:2342:2: ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ )
            // InternalRMParser.g:2343:3: () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+
            {
            // InternalRMParser.g:2343:3: ()
            // InternalRMParser.g:2344:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERelationshipTypesAccess().getERelationshipTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2350:3: ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+
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
            	    // InternalRMParser.g:2351:4: (lv_relationshipTypes_1_0= ruleERelationshipType )
            	    {
            	    // InternalRMParser.g:2351:4: (lv_relationshipTypes_1_0= ruleERelationshipType )
            	    // InternalRMParser.g:2352:5: lv_relationshipTypes_1_0= ruleERelationshipType
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
    // InternalRMParser.g:2373:1: entryRuleERelationshipType returns [EObject current=null] : iv_ruleERelationshipType= ruleERelationshipType EOF ;
    public final EObject entryRuleERelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipType = null;


        try {
            // InternalRMParser.g:2373:58: (iv_ruleERelationshipType= ruleERelationshipType EOF )
            // InternalRMParser.g:2374:2: iv_ruleERelationshipType= ruleERelationshipType EOF
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
    // InternalRMParser.g:2380:1: ruleERelationshipType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleERelationshipType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_relationship_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2386:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:2387:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:2387:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:2388:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:2388:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:2389:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:2389:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:2390:5: lv_name_0_0= RULE_QUALIFIED_NAME
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
            		
            // InternalRMParser.g:2414:3: ( (lv_relationship_3_0= ruleERelationshipTypeBody ) )
            // InternalRMParser.g:2415:4: (lv_relationship_3_0= ruleERelationshipTypeBody )
            {
            // InternalRMParser.g:2415:4: (lv_relationship_3_0= ruleERelationshipTypeBody )
            // InternalRMParser.g:2416:5: lv_relationship_3_0= ruleERelationshipTypeBody
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
    // InternalRMParser.g:2441:1: entryRuleERelationshipTypeBody returns [EObject current=null] : iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF ;
    public final EObject entryRuleERelationshipTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipTypeBody = null;


        try {
            // InternalRMParser.g:2441:62: (iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF )
            // InternalRMParser.g:2442:2: iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF
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
    // InternalRMParser.g:2448:1: ruleERelationshipTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleERelationshipTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_superType_3_0=null;
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
            // InternalRMParser.g:2454:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:2455:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:2455:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:2456:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:2456:3: ()
            // InternalRMParser.g:2457:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERelationshipTypeBodyAccess().getERelationshipTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2463:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) )
            // InternalRMParser.g:2464:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) )
            {
            // InternalRMParser.g:2464:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) )
            // InternalRMParser.g:2465:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:2468:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* )
            // InternalRMParser.g:2469:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )*
            {
            // InternalRMParser.g:2469:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )*
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
            	    // InternalRMParser.g:2470:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2470:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:2471:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:2471:118: ( ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:2472:6: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:2475:9: ({...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:2475:10: {...}? => (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2475:19: (otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:2475:20: otherlv_2= Derived_from ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_8); 

            	    									newLeafNode(otherlv_2, grammarAccess.getERelationshipTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:2479:9: ( (lv_superType_3_0= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:2480:10: (lv_superType_3_0= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:2480:10: (lv_superType_3_0= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:2481:11: lv_superType_3_0= RULE_QUALIFIED_NAME
            	    {
            	    lv_superType_3_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_29); 

            	    											newLeafNode(lv_superType_3_0, grammarAccess.getERelationshipTypeBodyAccess().getSuperTypeQUALIFIED_NAMETerminalRuleCall_1_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"superType",
            	    												lv_superType_3_0,
            	    												"org.sodalite.dsl.RM.QUALIFIED_NAME");
            	    										

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
            	    // InternalRMParser.g:2503:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2503:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:2504:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:2504:118: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:2505:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:2508:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:2508:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2508:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:2508:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getERelationshipTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:2512:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:2513:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:2513:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:2514:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRMParser.g:2536:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2536:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:2537:5: {...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:2537:118: ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:2538:6: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:2541:9: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:2541:10: {...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2541:19: (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:2541:20: otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Properties,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getERelationshipTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getERelationshipTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:2549:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:2550:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:2550:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRMParser.g:2551:11: lv_properties_8_0= ruleEProperties
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
            	    // InternalRMParser.g:2578:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2578:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:2579:5: {...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:2579:118: ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:2580:6: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:2583:9: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:2583:10: {...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2583:19: (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:2583:20: otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Attributes,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getERelationshipTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getERelationshipTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:2591:9: ( (lv_atributes_12_0= ruleEAttributes ) )
            	    // InternalRMParser.g:2592:10: (lv_atributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:2592:10: (lv_atributes_12_0= ruleEAttributes )
            	    // InternalRMParser.g:2593:11: lv_atributes_12_0= ruleEAttributes
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
            	    // InternalRMParser.g:2620:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2620:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    // InternalRMParser.g:2621:5: {...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalRMParser.g:2621:118: ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    // InternalRMParser.g:2622:6: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalRMParser.g:2625:9: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    // InternalRMParser.g:2625:10: {...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2625:19: (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    // InternalRMParser.g:2625:20: otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END
            	    {
            	    otherlv_14=(Token)match(input,Interfaces,FOLLOW_5); 

            	    									newLeafNode(otherlv_14, grammarAccess.getERelationshipTypeBodyAccess().getInterfacesKeyword_1_4_0());
            	    								
            	    this_BEGIN_15=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_15, grammarAccess.getERelationshipTypeBodyAccess().getBEGINTerminalRuleCall_1_4_1());
            	    								
            	    // InternalRMParser.g:2633:9: ( (lv_interfaces_16_0= ruleEInterfaces ) )
            	    // InternalRMParser.g:2634:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    {
            	    // InternalRMParser.g:2634:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    // InternalRMParser.g:2635:11: lv_interfaces_16_0= ruleEInterfaces
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
            	    // InternalRMParser.g:2662:4: ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:2662:4: ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:2663:5: {...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalRMParser.g:2663:118: ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) )
            	    // InternalRMParser.g:2664:6: ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalRMParser.g:2667:9: ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) )
            	    // InternalRMParser.g:2667:10: {...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2667:19: (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket )
            	    // InternalRMParser.g:2667:20: otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket
            	    {
            	    otherlv_18=(Token)match(input,Valid_target_types,FOLLOW_30); 

            	    									newLeafNode(otherlv_18, grammarAccess.getERelationshipTypeBodyAccess().getValid_target_typesKeyword_1_5_0());
            	    								
            	    otherlv_19=(Token)match(input,LeftSquareBracket,FOLLOW_8); 

            	    									newLeafNode(otherlv_19, grammarAccess.getERelationshipTypeBodyAccess().getLeftSquareBracketKeyword_1_5_1());
            	    								
            	    // InternalRMParser.g:2675:9: ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) )
            	    // InternalRMParser.g:2676:10: (lv_valid_target_types_20_0= ruleEValidTargetTypes )
            	    {
            	    // InternalRMParser.g:2676:10: (lv_valid_target_types_20_0= ruleEValidTargetTypes )
            	    // InternalRMParser.g:2677:11: lv_valid_target_types_20_0= ruleEValidTargetTypes
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
    // InternalRMParser.g:2715:1: entryRuleEValidTargetTypes returns [EObject current=null] : iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF ;
    public final EObject entryRuleEValidTargetTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidTargetTypes = null;


        try {
            // InternalRMParser.g:2715:58: (iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF )
            // InternalRMParser.g:2716:2: iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF
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
    // InternalRMParser.g:2722:1: ruleEValidTargetTypes returns [EObject current=null] : ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* ) ;
    public final EObject ruleEValidTargetTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_targetTypes_0_0 = null;

        EObject lv_sourceType_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2728:2: ( ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* ) )
            // InternalRMParser.g:2729:2: ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* )
            {
            // InternalRMParser.g:2729:2: ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* )
            // InternalRMParser.g:2730:3: ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )*
            {
            // InternalRMParser.g:2730:3: ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) )
            // InternalRMParser.g:2731:4: (lv_targetTypes_0_0= ruleECapabilityTypeRef )
            {
            // InternalRMParser.g:2731:4: (lv_targetTypes_0_0= ruleECapabilityTypeRef )
            // InternalRMParser.g:2732:5: lv_targetTypes_0_0= ruleECapabilityTypeRef
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

            // InternalRMParser.g:2749:3: (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Comma) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRMParser.g:2750:4: otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEValidTargetTypesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRMParser.g:2754:4: ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) )
            	    // InternalRMParser.g:2755:5: (lv_sourceType_2_0= ruleECapabilityTypeRef )
            	    {
            	    // InternalRMParser.g:2755:5: (lv_sourceType_2_0= ruleECapabilityTypeRef )
            	    // InternalRMParser.g:2756:6: lv_sourceType_2_0= ruleECapabilityTypeRef
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
    // InternalRMParser.g:2778:1: entryRuleECapabilityTypeRef returns [EObject current=null] : iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF ;
    public final EObject entryRuleECapabilityTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypeRef = null;


        try {
            // InternalRMParser.g:2778:59: (iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF )
            // InternalRMParser.g:2779:2: iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF
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
    // InternalRMParser.g:2785:1: ruleECapabilityTypeRef returns [EObject current=null] : ( (otherlv_0= RULE_QUALIFIED_NAME ) ) ;
    public final EObject ruleECapabilityTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:2791:2: ( ( (otherlv_0= RULE_QUALIFIED_NAME ) ) )
            // InternalRMParser.g:2792:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            {
            // InternalRMParser.g:2792:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:2793:3: (otherlv_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:2793:3: (otherlv_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:2794:4: otherlv_0= RULE_QUALIFIED_NAME
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
    // InternalRMParser.g:2808:1: entryRuleEProperties returns [EObject current=null] : iv_ruleEProperties= ruleEProperties EOF ;
    public final EObject entryRuleEProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEProperties = null;


        try {
            // InternalRMParser.g:2808:52: (iv_ruleEProperties= ruleEProperties EOF )
            // InternalRMParser.g:2809:2: iv_ruleEProperties= ruleEProperties EOF
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
    // InternalRMParser.g:2815:1: ruleEProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* ) ;
    public final EObject ruleEProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2821:2: ( ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* ) )
            // InternalRMParser.g:2822:2: ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* )
            {
            // InternalRMParser.g:2822:2: ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* )
            // InternalRMParser.g:2823:3: () ( (lv_properties_1_0= ruleEPropertyDefinition ) )*
            {
            // InternalRMParser.g:2823:3: ()
            // InternalRMParser.g:2824:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPropertiesAccess().getEPropertiesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2830:3: ( (lv_properties_1_0= ruleEPropertyDefinition ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRMParser.g:2831:4: (lv_properties_1_0= ruleEPropertyDefinition )
            	    {
            	    // InternalRMParser.g:2831:4: (lv_properties_1_0= ruleEPropertyDefinition )
            	    // InternalRMParser.g:2832:5: lv_properties_1_0= ruleEPropertyDefinition
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
    // InternalRMParser.g:2853:1: entryRuleEPropertyDefinition returns [EObject current=null] : iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF ;
    public final EObject entryRuleEPropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyDefinition = null;


        try {
            // InternalRMParser.g:2853:60: (iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF )
            // InternalRMParser.g:2854:2: iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF
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
    // InternalRMParser.g:2860:1: ruleEPropertyDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEPropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_property_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2866:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:2867:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:2867:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:2868:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:2868:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:2869:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:2869:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:2870:5: lv_name_0_0= RULE_ID
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
            		
            // InternalRMParser.g:2894:3: ( (lv_property_3_0= ruleEPropertyDefinitionBody ) )
            // InternalRMParser.g:2895:4: (lv_property_3_0= ruleEPropertyDefinitionBody )
            {
            // InternalRMParser.g:2895:4: (lv_property_3_0= ruleEPropertyDefinitionBody )
            // InternalRMParser.g:2896:5: lv_property_3_0= ruleEPropertyDefinitionBody
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
    // InternalRMParser.g:2921:1: entryRuleEPropertyDefinitionBody returns [EObject current=null] : iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF ;
    public final EObject entryRuleEPropertyDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyDefinitionBody = null;


        try {
            // InternalRMParser.g:2921:64: (iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF )
            // InternalRMParser.g:2922:2: iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF
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
    // InternalRMParser.g:2928:1: ruleEPropertyDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) ;
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
        AntlrDatatypeRuleToken lv_type_2_0 = null;

        EObject lv_default_8_0 = null;

        EObject lv_constraints_13_0 = null;

        AntlrDatatypeRuleToken lv_entry_schema_16_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2934:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:2935:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:2935:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:2936:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:2936:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:2937:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:2940:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:2941:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:2941:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) ) )+
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
            	    // InternalRMParser.g:2942:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2942:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:2943:4: {...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:2943:117: ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:2944:5: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:2947:8: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:2947:9: {...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:2947:18: (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:2947:19: otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPropertyDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:2951:8: ( (lv_type_2_0= ruleEDataTypeName ) )
            	    // InternalRMParser.g:2952:9: (lv_type_2_0= ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:2952:9: (lv_type_2_0= ruleEDataTypeName )
            	    // InternalRMParser.g:2953:10: lv_type_2_0= ruleEDataTypeName
            	    {

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getTypeEDataTypeNameParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_35);
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
            	    // InternalRMParser.g:2976:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2976:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:2977:4: {...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:2977:117: ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:2978:5: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:2981:8: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:2981:9: {...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:2981:18: (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:2981:19: otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Description,FOLLOW_13); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPropertyDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRMParser.g:2985:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRMParser.g:2986:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:2986:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRMParser.g:2987:10: lv_description_4_0= RULE_STRING
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
            	    // InternalRMParser.g:3009:3: ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3009:3: ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalRMParser.g:3010:4: {...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:3010:117: ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalRMParser.g:3011:5: ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:3014:8: ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) )
            	    // InternalRMParser.g:3014:9: {...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3014:18: (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) )
            	    // InternalRMParser.g:3014:19: otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_5=(Token)match(input,Required,FOLLOW_36); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEPropertyDefinitionBodyAccess().getRequiredKeyword_2_0());
            	    							
            	    // InternalRMParser.g:3018:8: ( (lv_required_6_0= RULE_BOOLEAN ) )
            	    // InternalRMParser.g:3019:9: (lv_required_6_0= RULE_BOOLEAN )
            	    {
            	    // InternalRMParser.g:3019:9: (lv_required_6_0= RULE_BOOLEAN )
            	    // InternalRMParser.g:3020:10: lv_required_6_0= RULE_BOOLEAN
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
            	    // InternalRMParser.g:3042:3: ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3042:3: ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:3043:4: {...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:3043:117: ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:3044:5: ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:3047:8: ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:3047:9: {...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3047:18: (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:3047:19: otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,Default,FOLLOW_37); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEPropertyDefinitionBodyAccess().getDefaultKeyword_3_0());
            	    							
            	    // InternalRMParser.g:3051:8: ( (lv_default_8_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:3052:9: (lv_default_8_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:3052:9: (lv_default_8_0= ruleEValueExpression )
            	    // InternalRMParser.g:3053:10: lv_default_8_0= ruleEValueExpression
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
            	    // InternalRMParser.g:3076:3: ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3076:3: ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3077:4: {...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRMParser.g:3077:117: ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3078:5: ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRMParser.g:3081:8: ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3081:9: {...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3081:18: (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3081:19: otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,Status,FOLLOW_13); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPropertyDefinitionBodyAccess().getStatusKeyword_4_0());
            	    							
            	    // InternalRMParser.g:3085:8: ( (lv_status_10_0= RULE_STRING ) )
            	    // InternalRMParser.g:3086:9: (lv_status_10_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:3086:9: (lv_status_10_0= RULE_STRING )
            	    // InternalRMParser.g:3087:10: lv_status_10_0= RULE_STRING
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
            	    // InternalRMParser.g:3109:3: ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3109:3: ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) )
            	    // InternalRMParser.g:3110:4: {...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRMParser.g:3110:117: ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) )
            	    // InternalRMParser.g:3111:5: ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRMParser.g:3114:8: ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) )
            	    // InternalRMParser.g:3114:9: {...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3114:18: (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END )
            	    // InternalRMParser.g:3114:19: otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END
            	    {
            	    otherlv_11=(Token)match(input,Constraints,FOLLOW_5); 

            	    								newLeafNode(otherlv_11, grammarAccess.getEPropertyDefinitionBodyAccess().getConstraintsKeyword_5_0());
            	    							
            	    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    								newLeafNode(this_BEGIN_12, grammarAccess.getEPropertyDefinitionBodyAccess().getBEGINTerminalRuleCall_5_1());
            	    							
            	    // InternalRMParser.g:3122:8: ( (lv_constraints_13_0= ruleEConstraints ) )
            	    // InternalRMParser.g:3123:9: (lv_constraints_13_0= ruleEConstraints )
            	    {
            	    // InternalRMParser.g:3123:9: (lv_constraints_13_0= ruleEConstraints )
            	    // InternalRMParser.g:3124:10: lv_constraints_13_0= ruleEConstraints
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
            	    // InternalRMParser.g:3151:3: ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3151:3: ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:3152:4: {...}? => ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalRMParser.g:3152:117: ( ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:3153:5: ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalRMParser.g:3156:8: ({...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:3156:9: {...}? => (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3156:18: (otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:3156:19: otherlv_15= Entry_schema ( (lv_entry_schema_16_0= ruleEDataTypeName ) )
            	    {
            	    otherlv_15=(Token)match(input,Entry_schema,FOLLOW_6); 

            	    								newLeafNode(otherlv_15, grammarAccess.getEPropertyDefinitionBodyAccess().getEntry_schemaKeyword_6_0());
            	    							
            	    // InternalRMParser.g:3160:8: ( (lv_entry_schema_16_0= ruleEDataTypeName ) )
            	    // InternalRMParser.g:3161:9: (lv_entry_schema_16_0= ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:3161:9: (lv_entry_schema_16_0= ruleEDataTypeName )
            	    // InternalRMParser.g:3162:10: lv_entry_schema_16_0= ruleEDataTypeName
            	    {

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getEntry_schemaEDataTypeNameParserRuleCall_6_1_0());
            	    									
            	    pushFollow(FOLLOW_35);
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
    // InternalRMParser.g:3196:1: entryRuleEAttributes returns [EObject current=null] : iv_ruleEAttributes= ruleEAttributes EOF ;
    public final EObject entryRuleEAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributes = null;


        try {
            // InternalRMParser.g:3196:52: (iv_ruleEAttributes= ruleEAttributes EOF )
            // InternalRMParser.g:3197:2: iv_ruleEAttributes= ruleEAttributes EOF
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
    // InternalRMParser.g:3203:1: ruleEAttributes returns [EObject current=null] : ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* ) ;
    public final EObject ruleEAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3209:2: ( ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* ) )
            // InternalRMParser.g:3210:2: ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* )
            {
            // InternalRMParser.g:3210:2: ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* )
            // InternalRMParser.g:3211:3: () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )*
            {
            // InternalRMParser.g:3211:3: ()
            // InternalRMParser.g:3212:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributesAccess().getEAttributesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3218:3: ( (lv_attributes_1_0= ruleEAttributeDefinition ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRMParser.g:3219:4: (lv_attributes_1_0= ruleEAttributeDefinition )
            	    {
            	    // InternalRMParser.g:3219:4: (lv_attributes_1_0= ruleEAttributeDefinition )
            	    // InternalRMParser.g:3220:5: lv_attributes_1_0= ruleEAttributeDefinition
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
    // InternalRMParser.g:3241:1: entryRuleEAttributeDefinition returns [EObject current=null] : iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF ;
    public final EObject entryRuleEAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeDefinition = null;


        try {
            // InternalRMParser.g:3241:61: (iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF )
            // InternalRMParser.g:3242:2: iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF
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
    // InternalRMParser.g:3248:1: ruleEAttributeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_attribute_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3254:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:3255:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:3255:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:3256:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:3256:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:3257:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:3257:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:3258:5: lv_name_0_0= RULE_ID
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
            		
            // InternalRMParser.g:3282:3: ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) )
            // InternalRMParser.g:3283:4: (lv_attribute_3_0= ruleEAttributeDefinitionBody )
            {
            // InternalRMParser.g:3283:4: (lv_attribute_3_0= ruleEAttributeDefinitionBody )
            // InternalRMParser.g:3284:5: lv_attribute_3_0= ruleEAttributeDefinitionBody
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
    // InternalRMParser.g:3309:1: entryRuleEAttributeDefinitionBody returns [EObject current=null] : iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF ;
    public final EObject entryRuleEAttributeDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeDefinitionBody = null;


        try {
            // InternalRMParser.g:3309:65: (iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF )
            // InternalRMParser.g:3310:2: iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF
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
    // InternalRMParser.g:3316:1: ruleEAttributeDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAttributeDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_status_8_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;

        EObject lv_default_6_0 = null;

        AntlrDatatypeRuleToken lv_entry_schema_10_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3322:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:3323:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:3323:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:3324:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:3324:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:3325:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:3328:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:3329:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:3329:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) ) )+
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
            	    // InternalRMParser.g:3330:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3330:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:3331:4: {...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:3331:118: ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:3332:5: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:3335:8: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:3335:9: {...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3335:18: (otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:3335:19: otherlv_1= Type ( (lv_type_2_0= ruleEDataTypeName ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAttributeDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:3339:8: ( (lv_type_2_0= ruleEDataTypeName ) )
            	    // InternalRMParser.g:3340:9: (lv_type_2_0= ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:3340:9: (lv_type_2_0= ruleEDataTypeName )
            	    // InternalRMParser.g:3341:10: lv_type_2_0= ruleEDataTypeName
            	    {

            	    										newCompositeNode(grammarAccess.getEAttributeDefinitionBodyAccess().getTypeEDataTypeNameParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_39);
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
            	    // InternalRMParser.g:3364:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3364:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3365:4: {...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:3365:118: ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3366:5: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:3369:8: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3369:9: {...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3369:18: (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3369:19: otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Description,FOLLOW_13); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAttributeDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRMParser.g:3373:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRMParser.g:3374:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:3374:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRMParser.g:3375:10: lv_description_4_0= RULE_STRING
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
            	    // InternalRMParser.g:3397:3: ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3397:3: ({...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:3398:4: {...}? => ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:3398:118: ( ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:3399:5: ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:3402:8: ({...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:3402:9: {...}? => (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3402:18: (otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:3402:19: otherlv_5= Default ( (lv_default_6_0= ruleEValueExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,Default,FOLLOW_37); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEAttributeDefinitionBodyAccess().getDefaultKeyword_2_0());
            	    							
            	    // InternalRMParser.g:3406:8: ( (lv_default_6_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:3407:9: (lv_default_6_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:3407:9: (lv_default_6_0= ruleEValueExpression )
            	    // InternalRMParser.g:3408:10: lv_default_6_0= ruleEValueExpression
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
            	    // InternalRMParser.g:3431:3: ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3431:3: ({...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3432:4: {...}? => ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:3432:118: ( ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3433:5: ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:3436:8: ({...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3436:9: {...}? => (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3436:18: (otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3436:19: otherlv_7= Status ( (lv_status_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,Status,FOLLOW_13); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEAttributeDefinitionBodyAccess().getStatusKeyword_3_0());
            	    							
            	    // InternalRMParser.g:3440:8: ( (lv_status_8_0= RULE_STRING ) )
            	    // InternalRMParser.g:3441:9: (lv_status_8_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:3441:9: (lv_status_8_0= RULE_STRING )
            	    // InternalRMParser.g:3442:10: lv_status_8_0= RULE_STRING
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
            	    // InternalRMParser.g:3464:3: ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3464:3: ({...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:3465:4: {...}? => ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRMParser.g:3465:118: ( ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:3466:5: ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRMParser.g:3469:8: ({...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:3469:9: {...}? => (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3469:18: (otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:3469:19: otherlv_9= Entry_schema ( (lv_entry_schema_10_0= ruleEDataTypeName ) )
            	    {
            	    otherlv_9=(Token)match(input,Entry_schema,FOLLOW_6); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEAttributeDefinitionBodyAccess().getEntry_schemaKeyword_4_0());
            	    							
            	    // InternalRMParser.g:3473:8: ( (lv_entry_schema_10_0= ruleEDataTypeName ) )
            	    // InternalRMParser.g:3474:9: (lv_entry_schema_10_0= ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:3474:9: (lv_entry_schema_10_0= ruleEDataTypeName )
            	    // InternalRMParser.g:3475:10: lv_entry_schema_10_0= ruleEDataTypeName
            	    {

            	    										newCompositeNode(grammarAccess.getEAttributeDefinitionBodyAccess().getEntry_schemaEDataTypeNameParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_39);
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
    // InternalRMParser.g:3509:1: entryRuleEInterfaces returns [EObject current=null] : iv_ruleEInterfaces= ruleEInterfaces EOF ;
    public final EObject entryRuleEInterfaces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaces = null;


        try {
            // InternalRMParser.g:3509:52: (iv_ruleEInterfaces= ruleEInterfaces EOF )
            // InternalRMParser.g:3510:2: iv_ruleEInterfaces= ruleEInterfaces EOF
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
    // InternalRMParser.g:3516:1: ruleEInterfaces returns [EObject current=null] : ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* ) ;
    public final EObject ruleEInterfaces() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaces_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3522:2: ( ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* ) )
            // InternalRMParser.g:3523:2: ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* )
            {
            // InternalRMParser.g:3523:2: ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* )
            // InternalRMParser.g:3524:3: () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )*
            {
            // InternalRMParser.g:3524:3: ()
            // InternalRMParser.g:3525:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfacesAccess().getEInterfacesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3531:3: ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRMParser.g:3532:4: (lv_interfaces_1_0= ruleEInterfaceDefinition )
            	    {
            	    // InternalRMParser.g:3532:4: (lv_interfaces_1_0= ruleEInterfaceDefinition )
            	    // InternalRMParser.g:3533:5: lv_interfaces_1_0= ruleEInterfaceDefinition
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
    // InternalRMParser.g:3554:1: entryRuleEInterfaceDefinition returns [EObject current=null] : iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF ;
    public final EObject entryRuleEInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceDefinition = null;


        try {
            // InternalRMParser.g:3554:61: (iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF )
            // InternalRMParser.g:3555:2: iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF
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
    // InternalRMParser.g:3561:1: ruleEInterfaceDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_interface_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3567:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:3568:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:3568:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:3569:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:3569:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:3570:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:3570:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:3571:5: lv_name_0_0= RULE_ID
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
            		
            // InternalRMParser.g:3595:3: ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) )
            // InternalRMParser.g:3596:4: (lv_interface_3_0= ruleEInterfaceDefinitionBody )
            {
            // InternalRMParser.g:3596:4: (lv_interface_3_0= ruleEInterfaceDefinitionBody )
            // InternalRMParser.g:3597:5: lv_interface_3_0= ruleEInterfaceDefinitionBody
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
    // InternalRMParser.g:3622:1: entryRuleEInterfaceDefinitionBody returns [EObject current=null] : iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF ;
    public final EObject entryRuleEInterfaceDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceDefinitionBody = null;


        try {
            // InternalRMParser.g:3622:65: (iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF )
            // InternalRMParser.g:3623:2: iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF
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
    // InternalRMParser.g:3629:1: ruleEInterfaceDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEInterfaceDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_0=null;
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
            // InternalRMParser.g:3635:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:3636:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:3636:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:3637:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:3637:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:3638:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:3641:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?)
            // InternalRMParser.g:3642:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:3642:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+
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
            	    // InternalRMParser.g:3643:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3643:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:3644:4: {...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:3644:118: ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:3645:5: ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:3648:8: ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:3648:9: {...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3648:18: (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:3648:19: otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEInterfaceDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:3652:8: ( (lv_type_2_0= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:3653:9: (lv_type_2_0= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:3653:9: (lv_type_2_0= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:3654:10: lv_type_2_0= RULE_QUALIFIED_NAME
            	    {
            	    lv_type_2_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_41); 

            	    										newLeafNode(lv_type_2_0, grammarAccess.getEInterfaceDefinitionBodyAccess().getTypeQUALIFIED_NAMETerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEInterfaceDefinitionBodyRule());
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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:3676:3: ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3676:3: ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) )
            	    // InternalRMParser.g:3677:4: {...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:3677:118: ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) )
            	    // InternalRMParser.g:3678:5: ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:3681:8: ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) )
            	    // InternalRMParser.g:3681:9: {...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3681:18: (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END )
            	    // InternalRMParser.g:3681:19: otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END
            	    {
            	    otherlv_3=(Token)match(input,Inputs,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEInterfaceDefinitionBodyAccess().getInputsKeyword_1_0());
            	    							
            	    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    								newLeafNode(this_BEGIN_4, grammarAccess.getEInterfaceDefinitionBodyAccess().getBEGINTerminalRuleCall_1_1());
            	    							
            	    // InternalRMParser.g:3689:8: ( (lv_inputs_5_0= ruleEProperties ) )
            	    // InternalRMParser.g:3690:9: (lv_inputs_5_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:3690:9: (lv_inputs_5_0= ruleEProperties )
            	    // InternalRMParser.g:3691:10: lv_inputs_5_0= ruleEProperties
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
            	    // InternalRMParser.g:3718:3: ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3718:3: ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) )
            	    // InternalRMParser.g:3719:4: {...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:3719:118: ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) )
            	    // InternalRMParser.g:3720:5: ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:3723:8: ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) )
            	    // InternalRMParser.g:3723:9: {...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3723:18: (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END )
            	    // InternalRMParser.g:3723:19: otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END
            	    {
            	    otherlv_7=(Token)match(input,Operations,FOLLOW_5); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEInterfaceDefinitionBodyAccess().getOperationsKeyword_2_0());
            	    							
            	    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    								newLeafNode(this_BEGIN_8, grammarAccess.getEInterfaceDefinitionBodyAccess().getBEGINTerminalRuleCall_2_1());
            	    							
            	    // InternalRMParser.g:3731:8: ( (lv_operations_9_0= ruleEOperations ) )
            	    // InternalRMParser.g:3732:9: (lv_operations_9_0= ruleEOperations )
            	    {
            	    // InternalRMParser.g:3732:9: (lv_operations_9_0= ruleEOperations )
            	    // InternalRMParser.g:3733:10: lv_operations_9_0= ruleEOperations
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
    // InternalRMParser.g:3771:1: entryRuleEOperations returns [EObject current=null] : iv_ruleEOperations= ruleEOperations EOF ;
    public final EObject entryRuleEOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperations = null;


        try {
            // InternalRMParser.g:3771:52: (iv_ruleEOperations= ruleEOperations EOF )
            // InternalRMParser.g:3772:2: iv_ruleEOperations= ruleEOperations EOF
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
    // InternalRMParser.g:3778:1: ruleEOperations returns [EObject current=null] : ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* ) ;
    public final EObject ruleEOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3784:2: ( ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* ) )
            // InternalRMParser.g:3785:2: ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* )
            {
            // InternalRMParser.g:3785:2: ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* )
            // InternalRMParser.g:3786:3: () ( (lv_operations_1_0= ruleEOperationDefinition ) )*
            {
            // InternalRMParser.g:3786:3: ()
            // InternalRMParser.g:3787:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationsAccess().getEOperationsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3793:3: ( (lv_operations_1_0= ruleEOperationDefinition ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRMParser.g:3794:4: (lv_operations_1_0= ruleEOperationDefinition )
            	    {
            	    // InternalRMParser.g:3794:4: (lv_operations_1_0= ruleEOperationDefinition )
            	    // InternalRMParser.g:3795:5: lv_operations_1_0= ruleEOperationDefinition
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
    // InternalRMParser.g:3816:1: entryRuleEOperationDefinition returns [EObject current=null] : iv_ruleEOperationDefinition= ruleEOperationDefinition EOF ;
    public final EObject entryRuleEOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperationDefinition = null;


        try {
            // InternalRMParser.g:3816:61: (iv_ruleEOperationDefinition= ruleEOperationDefinition EOF )
            // InternalRMParser.g:3817:2: iv_ruleEOperationDefinition= ruleEOperationDefinition EOF
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
    // InternalRMParser.g:3823:1: ruleEOperationDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3829:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:3830:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:3830:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:3831:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:3831:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:3832:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:3832:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:3833:5: lv_name_0_0= RULE_ID
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
            		
            // InternalRMParser.g:3857:3: ( (lv_operation_3_0= ruleEOperationDefinitionBody ) )
            // InternalRMParser.g:3858:4: (lv_operation_3_0= ruleEOperationDefinitionBody )
            {
            // InternalRMParser.g:3858:4: (lv_operation_3_0= ruleEOperationDefinitionBody )
            // InternalRMParser.g:3859:5: lv_operation_3_0= ruleEOperationDefinitionBody
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
    // InternalRMParser.g:3884:1: entryRuleEOperationDefinitionBody returns [EObject current=null] : iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF ;
    public final EObject entryRuleEOperationDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperationDefinitionBody = null;


        try {
            // InternalRMParser.g:3884:65: (iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF )
            // InternalRMParser.g:3885:2: iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF
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
    // InternalRMParser.g:3891:1: ruleEOperationDefinitionBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) ) ;
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
            // InternalRMParser.g:3897:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:3898:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:3898:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:3899:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:3899:3: ()
            // InternalRMParser.g:3900:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationDefinitionBodyAccess().getEOperationDefinitionBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3906:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:3907:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:3907:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:3908:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:3911:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:3912:6: ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:3912:6: ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )*
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
            	    // InternalRMParser.g:3913:4: ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3913:4: ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3914:5: {...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:3914:121: ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3915:6: ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:3918:9: ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3918:10: {...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3918:19: (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3918:20: otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,Description,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEOperationDefinitionBodyAccess().getDescriptionKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:3922:9: ( (lv_description_3_0= RULE_STRING ) )
            	    // InternalRMParser.g:3923:10: (lv_description_3_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:3923:10: (lv_description_3_0= RULE_STRING )
            	    // InternalRMParser.g:3924:11: lv_description_3_0= RULE_STRING
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
            	    // InternalRMParser.g:3946:4: ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3946:4: ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) )
            	    // InternalRMParser.g:3947:5: {...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:3947:121: ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) )
            	    // InternalRMParser.g:3948:6: ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:3951:9: ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) )
            	    // InternalRMParser.g:3951:10: {...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3951:19: (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END )
            	    // InternalRMParser.g:3951:20: otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END
            	    {
            	    otherlv_4=(Token)match(input,Inputs,FOLLOW_5); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEOperationDefinitionBodyAccess().getInputsKeyword_1_1_0());
            	    								
            	    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    									newLeafNode(this_BEGIN_5, grammarAccess.getEOperationDefinitionBodyAccess().getBEGINTerminalRuleCall_1_1_1());
            	    								
            	    // InternalRMParser.g:3959:9: ( (lv_inputs_6_0= ruleEInputs ) )
            	    // InternalRMParser.g:3960:10: (lv_inputs_6_0= ruleEInputs )
            	    {
            	    // InternalRMParser.g:3960:10: (lv_inputs_6_0= ruleEInputs )
            	    // InternalRMParser.g:3961:11: lv_inputs_6_0= ruleEInputs
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
            	    // InternalRMParser.g:3988:4: ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3988:4: ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) )
            	    // InternalRMParser.g:3989:5: {...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:3989:121: ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) )
            	    // InternalRMParser.g:3990:6: ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:3993:9: ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) )
            	    // InternalRMParser.g:3993:10: {...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3993:19: (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END )
            	    // InternalRMParser.g:3993:20: otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END
            	    {
            	    otherlv_8=(Token)match(input,Implementation,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getEOperationDefinitionBodyAccess().getImplementationKeyword_1_2_0());
            	    								
            	    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_44); 

            	    									newLeafNode(this_BEGIN_9, grammarAccess.getEOperationDefinitionBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:4001:9: ( (lv_implementation_10_0= ruleEImplementation ) )
            	    // InternalRMParser.g:4002:10: (lv_implementation_10_0= ruleEImplementation )
            	    {
            	    // InternalRMParser.g:4002:10: (lv_implementation_10_0= ruleEImplementation )
            	    // InternalRMParser.g:4003:11: lv_implementation_10_0= ruleEImplementation
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
    // InternalRMParser.g:4041:1: entryRuleEImplementation returns [EObject current=null] : iv_ruleEImplementation= ruleEImplementation EOF ;
    public final EObject entryRuleEImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEImplementation = null;


        try {
            // InternalRMParser.g:4041:56: (iv_ruleEImplementation= ruleEImplementation EOF )
            // InternalRMParser.g:4042:2: iv_ruleEImplementation= ruleEImplementation EOF
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
    // InternalRMParser.g:4048:1: ruleEImplementation returns [EObject current=null] : ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? ) ;
    public final EObject ruleEImplementation() throws RecognitionException {
        EObject current = null;

        EObject lv_primary_0_0 = null;

        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4054:2: ( ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? ) )
            // InternalRMParser.g:4055:2: ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? )
            {
            // InternalRMParser.g:4055:2: ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? )
            // InternalRMParser.g:4056:3: ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )?
            {
            // InternalRMParser.g:4056:3: ( (lv_primary_0_0= ruleEPrimary ) )
            // InternalRMParser.g:4057:4: (lv_primary_0_0= ruleEPrimary )
            {
            // InternalRMParser.g:4057:4: (lv_primary_0_0= ruleEPrimary )
            // InternalRMParser.g:4058:5: lv_primary_0_0= ruleEPrimary
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

            // InternalRMParser.g:4075:3: ( (lv_dependencies_1_0= ruleEDependencies ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Dependencies) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRMParser.g:4076:4: (lv_dependencies_1_0= ruleEDependencies )
                    {
                    // InternalRMParser.g:4076:4: (lv_dependencies_1_0= ruleEDependencies )
                    // InternalRMParser.g:4077:5: lv_dependencies_1_0= ruleEDependencies
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
    // InternalRMParser.g:4098:1: entryRuleEPrimary returns [EObject current=null] : iv_ruleEPrimary= ruleEPrimary EOF ;
    public final EObject entryRuleEPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPrimary = null;


        try {
            // InternalRMParser.g:4098:49: (iv_ruleEPrimary= ruleEPrimary EOF )
            // InternalRMParser.g:4099:2: iv_ruleEPrimary= ruleEPrimary EOF
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
    // InternalRMParser.g:4105:1: ruleEPrimary returns [EObject current=null] : ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? ) ;
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
            // InternalRMParser.g:4111:2: ( ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? ) )
            // InternalRMParser.g:4112:2: ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? )
            {
            // InternalRMParser.g:4112:2: ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? )
            // InternalRMParser.g:4113:3: (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )?
            {
            // InternalRMParser.g:4113:3: (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) )
            // InternalRMParser.g:4114:4: otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Primary,FOLLOW_13); 

            				newLeafNode(otherlv_0, grammarAccess.getEPrimaryAccess().getPrimaryKeyword_0_0());
            			
            // InternalRMParser.g:4118:4: ( (lv_file_1_0= RULE_STRING ) )
            // InternalRMParser.g:4119:5: (lv_file_1_0= RULE_STRING )
            {
            // InternalRMParser.g:4119:5: (lv_file_1_0= RULE_STRING )
            // InternalRMParser.g:4120:6: lv_file_1_0= RULE_STRING
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

            // InternalRMParser.g:4137:3: (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_BEGIN) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRMParser.g:4138:4: this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_47); 

                    				newLeafNode(this_BEGIN_2, grammarAccess.getEPrimaryAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    otherlv_3=(Token)match(input,Relative_path,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPrimaryAccess().getRelative_pathKeyword_1_1());
                    			
                    // InternalRMParser.g:4146:4: ( (lv_relative_path_4_0= RULE_STRING ) )
                    // InternalRMParser.g:4147:5: (lv_relative_path_4_0= RULE_STRING )
                    {
                    // InternalRMParser.g:4147:5: (lv_relative_path_4_0= RULE_STRING )
                    // InternalRMParser.g:4148:6: lv_relative_path_4_0= RULE_STRING
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
    // InternalRMParser.g:4173:1: entryRuleEDependencies returns [EObject current=null] : iv_ruleEDependencies= ruleEDependencies EOF ;
    public final EObject entryRuleEDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDependencies = null;


        try {
            // InternalRMParser.g:4173:54: (iv_ruleEDependencies= ruleEDependencies EOF )
            // InternalRMParser.g:4174:2: iv_ruleEDependencies= ruleEDependencies EOF
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
    // InternalRMParser.g:4180:1: ruleEDependencies returns [EObject current=null] : (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? ) ;
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
            // InternalRMParser.g:4186:2: ( (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? ) )
            // InternalRMParser.g:4187:2: (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? )
            {
            // InternalRMParser.g:4187:2: (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? )
            // InternalRMParser.g:4188:3: otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )?
            {
            otherlv_0=(Token)match(input,Dependencies,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getEDependenciesAccess().getDependenciesKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getEDependenciesAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRMParser.g:4196:3: ( (lv_files_2_0= ruleEDependencyFiles ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRMParser.g:4197:4: (lv_files_2_0= ruleEDependencyFiles )
                    {
                    // InternalRMParser.g:4197:4: (lv_files_2_0= ruleEDependencyFiles )
                    // InternalRMParser.g:4198:5: lv_files_2_0= ruleEDependencyFiles
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
            		
            // InternalRMParser.g:4219:3: (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_BEGIN) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRMParser.g:4220:4: this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END
                    {
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_47); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getEDependenciesAccess().getBEGINTerminalRuleCall_4_0());
                    			
                    otherlv_5=(Token)match(input,Relative_path,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getEDependenciesAccess().getRelative_pathKeyword_4_1());
                    			
                    // InternalRMParser.g:4228:4: ( (lv_relative_path_6_0= RULE_STRING ) )
                    // InternalRMParser.g:4229:5: (lv_relative_path_6_0= RULE_STRING )
                    {
                    // InternalRMParser.g:4229:5: (lv_relative_path_6_0= RULE_STRING )
                    // InternalRMParser.g:4230:6: lv_relative_path_6_0= RULE_STRING
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
    // InternalRMParser.g:4255:1: entryRuleEDependencyFiles returns [EObject current=null] : iv_ruleEDependencyFiles= ruleEDependencyFiles EOF ;
    public final EObject entryRuleEDependencyFiles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDependencyFiles = null;


        try {
            // InternalRMParser.g:4255:57: (iv_ruleEDependencyFiles= ruleEDependencyFiles EOF )
            // InternalRMParser.g:4256:2: iv_ruleEDependencyFiles= ruleEDependencyFiles EOF
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
    // InternalRMParser.g:4262:1: ruleEDependencyFiles returns [EObject current=null] : ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleEDependencyFiles() throws RecognitionException {
        EObject current = null;

        Token lv_files_0_0=null;
        Token otherlv_1=null;
        Token lv_files_2_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:4268:2: ( ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* ) )
            // InternalRMParser.g:4269:2: ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* )
            {
            // InternalRMParser.g:4269:2: ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* )
            // InternalRMParser.g:4270:3: ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )*
            {
            // InternalRMParser.g:4270:3: ( (lv_files_0_0= RULE_STRING ) )
            // InternalRMParser.g:4271:4: (lv_files_0_0= RULE_STRING )
            {
            // InternalRMParser.g:4271:4: (lv_files_0_0= RULE_STRING )
            // InternalRMParser.g:4272:5: lv_files_0_0= RULE_STRING
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

            // InternalRMParser.g:4288:3: (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Comma) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRMParser.g:4289:4: otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEDependencyFilesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRMParser.g:4293:4: ( (lv_files_2_0= RULE_STRING ) )
            	    // InternalRMParser.g:4294:5: (lv_files_2_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:4294:5: (lv_files_2_0= RULE_STRING )
            	    // InternalRMParser.g:4295:6: lv_files_2_0= RULE_STRING
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
    // InternalRMParser.g:4316:1: entryRuleEInputs returns [EObject current=null] : iv_ruleEInputs= ruleEInputs EOF ;
    public final EObject entryRuleEInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInputs = null;


        try {
            // InternalRMParser.g:4316:48: (iv_ruleEInputs= ruleEInputs EOF )
            // InternalRMParser.g:4317:2: iv_ruleEInputs= ruleEInputs EOF
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
    // InternalRMParser.g:4323:1: ruleEInputs returns [EObject current=null] : ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* ) ;
    public final EObject ruleEInputs() throws RecognitionException {
        EObject current = null;

        EObject lv_inputs_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4329:2: ( ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* ) )
            // InternalRMParser.g:4330:2: ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* )
            {
            // InternalRMParser.g:4330:2: ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* )
            // InternalRMParser.g:4331:3: () ( (lv_inputs_1_0= ruleEParameterDefinition ) )*
            {
            // InternalRMParser.g:4331:3: ()
            // InternalRMParser.g:4332:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInputsAccess().getEInputsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:4338:3: ( (lv_inputs_1_0= ruleEParameterDefinition ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRMParser.g:4339:4: (lv_inputs_1_0= ruleEParameterDefinition )
            	    {
            	    // InternalRMParser.g:4339:4: (lv_inputs_1_0= ruleEParameterDefinition )
            	    // InternalRMParser.g:4340:5: lv_inputs_1_0= ruleEParameterDefinition
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
    // InternalRMParser.g:4361:1: entryRuleEParameterDefinition returns [EObject current=null] : iv_ruleEParameterDefinition= ruleEParameterDefinition EOF ;
    public final EObject entryRuleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinition = null;


        try {
            // InternalRMParser.g:4361:61: (iv_ruleEParameterDefinition= ruleEParameterDefinition EOF )
            // InternalRMParser.g:4362:2: iv_ruleEParameterDefinition= ruleEParameterDefinition EOF
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
    // InternalRMParser.g:4368:1: ruleEParameterDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4374:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:4375:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:4375:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:4376:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:4376:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:4377:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:4377:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:4378:5: lv_name_0_0= RULE_ID
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
            		
            // InternalRMParser.g:4402:3: ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) )
            // InternalRMParser.g:4403:4: (lv_parameter_3_0= ruleEParameterDefinitionBody )
            {
            // InternalRMParser.g:4403:4: (lv_parameter_3_0= ruleEParameterDefinitionBody )
            // InternalRMParser.g:4404:5: lv_parameter_3_0= ruleEParameterDefinitionBody
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
    // InternalRMParser.g:4429:1: entryRuleEParameterDefinitionBody returns [EObject current=null] : iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF ;
    public final EObject entryRuleEParameterDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinitionBody = null;


        try {
            // InternalRMParser.g:4429:65: (iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF )
            // InternalRMParser.g:4430:2: iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF
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
    // InternalRMParser.g:4436:1: ruleEParameterDefinitionBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEParameterDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_default_7_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4442:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:4443:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:4443:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:4444:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:4444:3: ()
            // InternalRMParser.g:4445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterDefinitionBodyAccess().getEParameterDefinitionBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:4451:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) )
            // InternalRMParser.g:4452:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) )
            {
            // InternalRMParser.g:4452:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) )
            // InternalRMParser.g:4453:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:4456:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* )
            // InternalRMParser.g:4457:6: ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )*
            {
            // InternalRMParser.g:4457:6: ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )*
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
            	    // InternalRMParser.g:4458:4: ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4458:4: ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:4459:5: {...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:4459:121: ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:4460:6: ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:4463:9: ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:4463:10: {...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4463:19: (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:4463:20: otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) )
            	    {
            	    otherlv_2=(Token)match(input,Type,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEParameterDefinitionBodyAccess().getTypeKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:4467:9: ( (lv_type_3_0= ruleEDataTypeName ) )
            	    // InternalRMParser.g:4468:10: (lv_type_3_0= ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:4468:10: (lv_type_3_0= ruleEDataTypeName )
            	    // InternalRMParser.g:4469:11: lv_type_3_0= ruleEDataTypeName
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getTypeEDataTypeNameParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalRMParser.g:4492:4: ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4492:4: ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:4493:5: {...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:4493:121: ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:4494:6: ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:4497:9: ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:4497:10: {...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4497:19: (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:4497:20: otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,Value,FOLLOW_37); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEParameterDefinitionBodyAccess().getValueKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:4501:9: ( (lv_value_5_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:4502:10: (lv_value_5_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:4502:10: (lv_value_5_0= ruleEValueExpression )
            	    // InternalRMParser.g:4503:11: lv_value_5_0= ruleEValueExpression
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
            	    // InternalRMParser.g:4526:4: ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4526:4: ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:4527:5: {...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:4527:121: ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:4528:6: ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:4531:9: ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:4531:10: {...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4531:19: (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:4531:20: otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,Default,FOLLOW_37); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEParameterDefinitionBodyAccess().getDefaultKeyword_1_2_0());
            	    								
            	    // InternalRMParser.g:4535:9: ( (lv_default_7_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:4536:10: (lv_default_7_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:4536:10: (lv_default_7_0= ruleEValueExpression )
            	    // InternalRMParser.g:4537:11: lv_default_7_0= ruleEValueExpression
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
    // InternalRMParser.g:4571:1: entryRuleEValueExpression returns [EObject current=null] : iv_ruleEValueExpression= ruleEValueExpression EOF ;
    public final EObject entryRuleEValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueExpression = null;


        try {
            // InternalRMParser.g:4571:57: (iv_ruleEValueExpression= ruleEValueExpression EOF )
            // InternalRMParser.g:4572:2: iv_ruleEValueExpression= ruleEValueExpression EOF
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
    // InternalRMParser.g:4578:1: ruleEValueExpression returns [EObject current=null] : (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction ) ;
    public final EObject ruleEValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ESingleValue_0 = null;

        EObject this_EFunction_1 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4584:2: ( (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction ) )
            // InternalRMParser.g:4585:2: (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction )
            {
            // InternalRMParser.g:4585:2: (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction )
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
                    // InternalRMParser.g:4586:3: this_ESingleValue_0= ruleESingleValue
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
                    // InternalRMParser.g:4595:3: this_EFunction_1= ruleEFunction
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
    // InternalRMParser.g:4607:1: entryRuleEFunction returns [EObject current=null] : iv_ruleEFunction= ruleEFunction EOF ;
    public final EObject entryRuleEFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFunction = null;


        try {
            // InternalRMParser.g:4607:50: (iv_ruleEFunction= ruleEFunction EOF )
            // InternalRMParser.g:4608:2: iv_ruleEFunction= ruleEFunction EOF
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
    // InternalRMParser.g:4614:1: ruleEFunction returns [EObject current=null] : (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput ) ;
    public final EObject ruleEFunction() throws RecognitionException {
        EObject current = null;

        EObject this_GetProperty_0 = null;

        EObject this_GetAttribute_1 = null;

        EObject this_GetInput_2 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4620:2: ( (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput ) )
            // InternalRMParser.g:4621:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput )
            {
            // InternalRMParser.g:4621:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput )
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
                    // InternalRMParser.g:4622:3: this_GetProperty_0= ruleGetProperty
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
                    // InternalRMParser.g:4631:3: this_GetAttribute_1= ruleGetAttribute
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
                    // InternalRMParser.g:4640:3: this_GetInput_2= ruleGetInput
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
    // InternalRMParser.g:4652:1: entryRuleGetInput returns [EObject current=null] : iv_ruleGetInput= ruleGetInput EOF ;
    public final EObject entryRuleGetInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetInput = null;


        try {
            // InternalRMParser.g:4652:49: (iv_ruleGetInput= ruleGetInput EOF )
            // InternalRMParser.g:4653:2: iv_ruleGetInput= ruleGetInput EOF
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
    // InternalRMParser.g:4659:1: ruleGetInput returns [EObject current=null] : (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleGetInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRMParser.g:4665:2: ( (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRMParser.g:4666:2: (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRMParser.g:4666:2: (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) )
            // InternalRMParser.g:4667:3: otherlv_0= Get_input ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Get_input,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGetInputAccess().getGet_inputKeyword_0());
            		
            // InternalRMParser.g:4671:3: ( (otherlv_1= RULE_ID ) )
            // InternalRMParser.g:4672:4: (otherlv_1= RULE_ID )
            {
            // InternalRMParser.g:4672:4: (otherlv_1= RULE_ID )
            // InternalRMParser.g:4673:5: otherlv_1= RULE_ID
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
    // InternalRMParser.g:4688:1: entryRuleGetAttribute returns [EObject current=null] : iv_ruleGetAttribute= ruleGetAttribute EOF ;
    public final EObject entryRuleGetAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttribute = null;


        try {
            // InternalRMParser.g:4688:53: (iv_ruleGetAttribute= ruleGetAttribute EOF )
            // InternalRMParser.g:4689:2: iv_ruleGetAttribute= ruleGetAttribute EOF
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
    // InternalRMParser.g:4695:1: ruleGetAttribute returns [EObject current=null] : (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END ) ;
    public final EObject ruleGetAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4701:2: ( (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END ) )
            // InternalRMParser.g:4702:2: (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END )
            {
            // InternalRMParser.g:4702:2: (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END )
            // InternalRMParser.g:4703:3: otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Get_attribute,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGetAttributeAccess().getGet_attributeKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_51); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getGetAttributeAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalRMParser.g:4711:3: ( (lv_attribute_2_0= ruleGetAttributeBody ) )
            // InternalRMParser.g:4712:4: (lv_attribute_2_0= ruleGetAttributeBody )
            {
            // InternalRMParser.g:4712:4: (lv_attribute_2_0= ruleGetAttributeBody )
            // InternalRMParser.g:4713:5: lv_attribute_2_0= ruleGetAttributeBody
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
    // InternalRMParser.g:4738:1: entryRuleGetAttributeBody returns [EObject current=null] : iv_ruleGetAttributeBody= ruleGetAttributeBody EOF ;
    public final EObject entryRuleGetAttributeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttributeBody = null;


        try {
            // InternalRMParser.g:4738:57: (iv_ruleGetAttributeBody= ruleGetAttributeBody EOF )
            // InternalRMParser.g:4739:2: iv_ruleGetAttributeBody= ruleGetAttributeBody EOF
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
    // InternalRMParser.g:4745:1: ruleGetAttributeBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalRMParser.g:4751:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:4752:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:4752:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:4753:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:4753:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:4754:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:4757:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:4758:5: ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:4758:5: ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+
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
            	    // InternalRMParser.g:4759:3: ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4759:3: ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:4760:4: {...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:4760:110: ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:4761:5: ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:4764:8: ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:4764:9: {...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRMParser.g:4764:18: (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:4764:19: otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Attribute,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGetAttributeBodyAccess().getAttributeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:4768:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:4769:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:4769:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:4770:10: otherlv_2= RULE_QUALIFIED_NAME
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
            	    // InternalRMParser.g:4787:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4787:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    // InternalRMParser.g:4788:4: {...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:4788:110: ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    // InternalRMParser.g:4789:5: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:4792:8: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    // InternalRMParser.g:4792:9: {...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRMParser.g:4792:18: (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    // InternalRMParser.g:4792:19: otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) )
            	    {
            	    otherlv_3=(Token)match(input,Entity,FOLLOW_53); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGetAttributeBodyAccess().getEntityKeyword_1_0());
            	    							
            	    // InternalRMParser.g:4796:8: ( (lv_entity_4_0= RULE_ENTITY ) )
            	    // InternalRMParser.g:4797:9: (lv_entity_4_0= RULE_ENTITY )
            	    {
            	    // InternalRMParser.g:4797:9: (lv_entity_4_0= RULE_ENTITY )
            	    // InternalRMParser.g:4798:10: lv_entity_4_0= RULE_ENTITY
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
            	    // InternalRMParser.g:4820:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4820:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:4821:4: {...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:4821:110: ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:4822:5: ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:4825:8: ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:4825:9: {...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRMParser.g:4825:18: (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:4825:19: otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,Req_cap,FOLLOW_8); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGetAttributeBodyAccess().getReq_capKeyword_2_0());
            	    							
            	    // InternalRMParser.g:4829:8: ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:4830:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:4830:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:4831:10: otherlv_6= RULE_QUALIFIED_NAME
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
    // InternalRMParser.g:4859:1: entryRuleGetProperty returns [EObject current=null] : iv_ruleGetProperty= ruleGetProperty EOF ;
    public final EObject entryRuleGetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetProperty = null;


        try {
            // InternalRMParser.g:4859:52: (iv_ruleGetProperty= ruleGetProperty EOF )
            // InternalRMParser.g:4860:2: iv_ruleGetProperty= ruleGetProperty EOF
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
    // InternalRMParser.g:4866:1: ruleGetProperty returns [EObject current=null] : (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END ) ;
    public final EObject ruleGetProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_property_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4872:2: ( (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END ) )
            // InternalRMParser.g:4873:2: (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END )
            {
            // InternalRMParser.g:4873:2: (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END )
            // InternalRMParser.g:4874:3: otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Get_property,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGetPropertyAccess().getGet_propertyKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_54); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getGetPropertyAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalRMParser.g:4882:3: ( (lv_property_2_0= ruleGetPropertyBody ) )
            // InternalRMParser.g:4883:4: (lv_property_2_0= ruleGetPropertyBody )
            {
            // InternalRMParser.g:4883:4: (lv_property_2_0= ruleGetPropertyBody )
            // InternalRMParser.g:4884:5: lv_property_2_0= ruleGetPropertyBody
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
    // InternalRMParser.g:4909:1: entryRuleGetPropertyBody returns [EObject current=null] : iv_ruleGetPropertyBody= ruleGetPropertyBody EOF ;
    public final EObject entryRuleGetPropertyBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetPropertyBody = null;


        try {
            // InternalRMParser.g:4909:56: (iv_ruleGetPropertyBody= ruleGetPropertyBody EOF )
            // InternalRMParser.g:4910:2: iv_ruleGetPropertyBody= ruleGetPropertyBody EOF
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
    // InternalRMParser.g:4916:1: ruleGetPropertyBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalRMParser.g:4922:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:4923:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:4923:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:4924:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:4924:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:4925:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:4928:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:4929:5: ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:4929:5: ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+
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
            	    // InternalRMParser.g:4930:3: ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4930:3: ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:4931:4: {...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:4931:109: ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:4932:5: ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:4935:8: ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:4935:9: {...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRMParser.g:4935:18: (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:4935:19: otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Property,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGetPropertyBodyAccess().getPropertyKeyword_0_0());
            	    							
            	    // InternalRMParser.g:4939:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:4940:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:4940:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:4941:10: otherlv_2= RULE_QUALIFIED_NAME
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
            	    // InternalRMParser.g:4958:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4958:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    // InternalRMParser.g:4959:4: {...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:4959:109: ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    // InternalRMParser.g:4960:5: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:4963:8: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    // InternalRMParser.g:4963:9: {...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRMParser.g:4963:18: (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    // InternalRMParser.g:4963:19: otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) )
            	    {
            	    otherlv_3=(Token)match(input,Entity,FOLLOW_53); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGetPropertyBodyAccess().getEntityKeyword_1_0());
            	    							
            	    // InternalRMParser.g:4967:8: ( (lv_entity_4_0= RULE_ENTITY ) )
            	    // InternalRMParser.g:4968:9: (lv_entity_4_0= RULE_ENTITY )
            	    {
            	    // InternalRMParser.g:4968:9: (lv_entity_4_0= RULE_ENTITY )
            	    // InternalRMParser.g:4969:10: lv_entity_4_0= RULE_ENTITY
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
            	    // InternalRMParser.g:4991:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4991:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:4992:4: {...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:4992:109: ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:4993:5: ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:4996:8: ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:4996:9: {...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRMParser.g:4996:18: (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:4996:19: otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,Req_cap,FOLLOW_8); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGetPropertyBodyAccess().getReq_capKeyword_2_0());
            	    							
            	    // InternalRMParser.g:5000:8: ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:5001:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:5001:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:5002:10: otherlv_6= RULE_QUALIFIED_NAME
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
    // InternalRMParser.g:5030:1: entryRuleECapabilities returns [EObject current=null] : iv_ruleECapabilities= ruleECapabilities EOF ;
    public final EObject entryRuleECapabilities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilities = null;


        try {
            // InternalRMParser.g:5030:54: (iv_ruleECapabilities= ruleECapabilities EOF )
            // InternalRMParser.g:5031:2: iv_ruleECapabilities= ruleECapabilities EOF
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
    // InternalRMParser.g:5037:1: ruleECapabilities returns [EObject current=null] : ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* ) ;
    public final EObject ruleECapabilities() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilities_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5043:2: ( ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* ) )
            // InternalRMParser.g:5044:2: ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* )
            {
            // InternalRMParser.g:5044:2: ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* )
            // InternalRMParser.g:5045:3: () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )*
            {
            // InternalRMParser.g:5045:3: ()
            // InternalRMParser.g:5046:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilitiesAccess().getECapabilitiesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:5052:3: ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRMParser.g:5053:4: (lv_capabilities_1_0= ruleECapabilityDefinition )
            	    {
            	    // InternalRMParser.g:5053:4: (lv_capabilities_1_0= ruleECapabilityDefinition )
            	    // InternalRMParser.g:5054:5: lv_capabilities_1_0= ruleECapabilityDefinition
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
    // InternalRMParser.g:5075:1: entryRuleECapabilityDefinition returns [EObject current=null] : iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF ;
    public final EObject entryRuleECapabilityDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityDefinition = null;


        try {
            // InternalRMParser.g:5075:62: (iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF )
            // InternalRMParser.g:5076:2: iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF
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
    // InternalRMParser.g:5082:1: ruleECapabilityDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleECapabilityDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_capability_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5088:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:5089:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:5089:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:5090:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:5090:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:5091:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:5091:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:5092:5: lv_name_0_0= RULE_ID
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
            		
            // InternalRMParser.g:5116:3: ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) )
            // InternalRMParser.g:5117:4: (lv_capability_3_0= ruleECapabilityDefinitionBody )
            {
            // InternalRMParser.g:5117:4: (lv_capability_3_0= ruleECapabilityDefinitionBody )
            // InternalRMParser.g:5118:5: lv_capability_3_0= ruleECapabilityDefinitionBody
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
    // InternalRMParser.g:5143:1: entryRuleECapabilityDefinitionBody returns [EObject current=null] : iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF ;
    public final EObject entryRuleECapabilityDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityDefinitionBody = null;


        try {
            // InternalRMParser.g:5143:66: (iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF )
            // InternalRMParser.g:5144:2: iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF
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
    // InternalRMParser.g:5150:1: ruleECapabilityDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleECapabilityDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_0=null;
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
            // InternalRMParser.g:5156:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:5157:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:5157:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:5158:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:5158:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:5159:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:5162:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?)
            // InternalRMParser.g:5163:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:5163:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) ) )+
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
            	    // InternalRMParser.g:5164:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5164:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:5165:4: {...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:5165:119: ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:5166:5: ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:5169:8: ({...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:5169:9: {...}? => (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5169:18: (otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:5169:19: otherlv_1= Type ( (lv_type_2_0= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getECapabilityDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:5173:8: ( (lv_type_2_0= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:5174:9: (lv_type_2_0= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:5174:9: (lv_type_2_0= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:5175:10: lv_type_2_0= RULE_QUALIFIED_NAME
            	    {
            	    lv_type_2_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_57); 

            	    										newLeafNode(lv_type_2_0, grammarAccess.getECapabilityDefinitionBodyAccess().getTypeQUALIFIED_NAMETerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getECapabilityDefinitionBodyRule());
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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:5197:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5197:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:5198:4: {...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:5198:119: ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:5199:5: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:5202:8: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:5202:9: {...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5202:18: (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:5202:19: otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Description,FOLLOW_13); 

            	    								newLeafNode(otherlv_3, grammarAccess.getECapabilityDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRMParser.g:5206:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRMParser.g:5207:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:5207:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRMParser.g:5208:10: lv_description_4_0= RULE_STRING
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
            	    // InternalRMParser.g:5230:3: ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:5230:3: ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) )
            	    // InternalRMParser.g:5231:4: {...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:5231:119: ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) )
            	    // InternalRMParser.g:5232:5: ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:5235:8: ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) )
            	    // InternalRMParser.g:5235:9: {...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5235:18: (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END )
            	    // InternalRMParser.g:5235:19: otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END
            	    {
            	    otherlv_5=(Token)match(input,Properties,FOLLOW_5); 

            	    								newLeafNode(otherlv_5, grammarAccess.getECapabilityDefinitionBodyAccess().getPropertiesKeyword_2_0());
            	    							
            	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    								newLeafNode(this_BEGIN_6, grammarAccess.getECapabilityDefinitionBodyAccess().getBEGINTerminalRuleCall_2_1());
            	    							
            	    // InternalRMParser.g:5243:8: ( (lv_properties_7_0= ruleEProperties ) )
            	    // InternalRMParser.g:5244:9: (lv_properties_7_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:5244:9: (lv_properties_7_0= ruleEProperties )
            	    // InternalRMParser.g:5245:10: lv_properties_7_0= ruleEProperties
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
            	    // InternalRMParser.g:5272:3: ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:5272:3: ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) )
            	    // InternalRMParser.g:5273:4: {...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:5273:119: ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) )
            	    // InternalRMParser.g:5274:5: ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:5277:8: ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) )
            	    // InternalRMParser.g:5277:9: {...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5277:18: (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END )
            	    // InternalRMParser.g:5277:19: otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Attributes,FOLLOW_5); 

            	    								newLeafNode(otherlv_9, grammarAccess.getECapabilityDefinitionBodyAccess().getAttributesKeyword_3_0());
            	    							
            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            	    								newLeafNode(this_BEGIN_10, grammarAccess.getECapabilityDefinitionBodyAccess().getBEGINTerminalRuleCall_3_1());
            	    							
            	    // InternalRMParser.g:5285:8: ( (lv_attributes_11_0= ruleEAttributes ) )
            	    // InternalRMParser.g:5286:9: (lv_attributes_11_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:5286:9: (lv_attributes_11_0= ruleEAttributes )
            	    // InternalRMParser.g:5287:10: lv_attributes_11_0= ruleEAttributes
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
            	    // InternalRMParser.g:5314:3: ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:5314:3: ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:5315:4: {...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRMParser.g:5315:119: ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) )
            	    // InternalRMParser.g:5316:5: ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRMParser.g:5319:8: ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) )
            	    // InternalRMParser.g:5319:9: {...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5319:18: (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket )
            	    // InternalRMParser.g:5319:19: otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket
            	    {
            	    otherlv_13=(Token)match(input,Valid_source_types,FOLLOW_30); 

            	    								newLeafNode(otherlv_13, grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesKeyword_4_0());
            	    							
            	    otherlv_14=(Token)match(input,LeftSquareBracket,FOLLOW_58); 

            	    								newLeafNode(otherlv_14, grammarAccess.getECapabilityDefinitionBodyAccess().getLeftSquareBracketKeyword_4_1());
            	    							
            	    // InternalRMParser.g:5327:8: ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==RULE_QUALIFIED_NAME) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalRMParser.g:5328:9: (lv_valid_source_types_15_0= ruleEValidSourceType )
            	            {
            	            // InternalRMParser.g:5328:9: (lv_valid_source_types_15_0= ruleEValidSourceType )
            	            // InternalRMParser.g:5329:10: lv_valid_source_types_15_0= ruleEValidSourceType
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
            	    // InternalRMParser.g:5356:3: ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:5356:3: ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:5357:4: {...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRMParser.g:5357:119: ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) ) )
            	    // InternalRMParser.g:5358:5: ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRMParser.g:5361:8: ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket ) )
            	    // InternalRMParser.g:5361:9: {...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5361:18: (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket )
            	    // InternalRMParser.g:5361:19: otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) ) otherlv_22= RightSquareBracket
            	    {
            	    otherlv_17=(Token)match(input,Occurrences,FOLLOW_30); 

            	    								newLeafNode(otherlv_17, grammarAccess.getECapabilityDefinitionBodyAccess().getOccurrencesKeyword_5_0());
            	    							
            	    otherlv_18=(Token)match(input,LeftSquareBracket,FOLLOW_59); 

            	    								newLeafNode(otherlv_18, grammarAccess.getECapabilityDefinitionBodyAccess().getLeftSquareBracketKeyword_5_1());
            	    							
            	    // InternalRMParser.g:5369:8: ( (lv_occurrences_start_19_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:5370:9: (lv_occurrences_start_19_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:5370:9: (lv_occurrences_start_19_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:5371:10: lv_occurrences_start_19_0= ruleEAlphaNumericValue
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
            	    							
            	    // InternalRMParser.g:5392:8: ( (lv_occurrences_end_21_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:5393:9: (lv_occurrences_end_21_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:5393:9: (lv_occurrences_end_21_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:5394:10: lv_occurrences_end_21_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:5432:1: entryRuleEValidSourceType returns [EObject current=null] : iv_ruleEValidSourceType= ruleEValidSourceType EOF ;
    public final EObject entryRuleEValidSourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidSourceType = null;


        try {
            // InternalRMParser.g:5432:57: (iv_ruleEValidSourceType= ruleEValidSourceType EOF )
            // InternalRMParser.g:5433:2: iv_ruleEValidSourceType= ruleEValidSourceType EOF
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
    // InternalRMParser.g:5439:1: ruleEValidSourceType returns [EObject current=null] : ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* ) ;
    public final EObject ruleEValidSourceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sourceTypes_0_0 = null;

        EObject lv_sourceType_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5445:2: ( ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* ) )
            // InternalRMParser.g:5446:2: ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* )
            {
            // InternalRMParser.g:5446:2: ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* )
            // InternalRMParser.g:5447:3: ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )*
            {
            // InternalRMParser.g:5447:3: ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) )
            // InternalRMParser.g:5448:4: (lv_sourceTypes_0_0= ruleENodeTypeRef )
            {
            // InternalRMParser.g:5448:4: (lv_sourceTypes_0_0= ruleENodeTypeRef )
            // InternalRMParser.g:5449:5: lv_sourceTypes_0_0= ruleENodeTypeRef
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

            // InternalRMParser.g:5466:3: (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Comma) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalRMParser.g:5467:4: otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEValidSourceTypeAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRMParser.g:5471:4: ( (lv_sourceType_2_0= ruleENodeTypeRef ) )
            	    // InternalRMParser.g:5472:5: (lv_sourceType_2_0= ruleENodeTypeRef )
            	    {
            	    // InternalRMParser.g:5472:5: (lv_sourceType_2_0= ruleENodeTypeRef )
            	    // InternalRMParser.g:5473:6: lv_sourceType_2_0= ruleENodeTypeRef
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
    // InternalRMParser.g:5495:1: entryRuleENodeTypeRef returns [EObject current=null] : iv_ruleENodeTypeRef= ruleENodeTypeRef EOF ;
    public final EObject entryRuleENodeTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypeRef = null;


        try {
            // InternalRMParser.g:5495:53: (iv_ruleENodeTypeRef= ruleENodeTypeRef EOF )
            // InternalRMParser.g:5496:2: iv_ruleENodeTypeRef= ruleENodeTypeRef EOF
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
    // InternalRMParser.g:5502:1: ruleENodeTypeRef returns [EObject current=null] : ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) ;
    public final EObject ruleENodeTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:5508:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) )
            // InternalRMParser.g:5509:2: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            {
            // InternalRMParser.g:5509:2: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:5510:3: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:5510:3: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:5511:4: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getENodeTypeRefAccess().getNameQUALIFIED_NAMETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getENodeTypeRefRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.sodalite.dsl.RM.QUALIFIED_NAME");
            			

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
    // InternalRMParser.g:5530:1: entryRuleERequirements returns [EObject current=null] : iv_ruleERequirements= ruleERequirements EOF ;
    public final EObject entryRuleERequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirements = null;


        try {
            // InternalRMParser.g:5530:54: (iv_ruleERequirements= ruleERequirements EOF )
            // InternalRMParser.g:5531:2: iv_ruleERequirements= ruleERequirements EOF
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
    // InternalRMParser.g:5537:1: ruleERequirements returns [EObject current=null] : ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* ) ;
    public final EObject ruleERequirements() throws RecognitionException {
        EObject current = null;

        EObject lv_requirements_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5543:2: ( ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* ) )
            // InternalRMParser.g:5544:2: ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* )
            {
            // InternalRMParser.g:5544:2: ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* )
            // InternalRMParser.g:5545:3: () ( (lv_requirements_1_0= ruleERequirementDefinition ) )*
            {
            // InternalRMParser.g:5545:3: ()
            // InternalRMParser.g:5546:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERequirementsAccess().getERequirementsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:5552:3: ( (lv_requirements_1_0= ruleERequirementDefinition ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalRMParser.g:5553:4: (lv_requirements_1_0= ruleERequirementDefinition )
            	    {
            	    // InternalRMParser.g:5553:4: (lv_requirements_1_0= ruleERequirementDefinition )
            	    // InternalRMParser.g:5554:5: lv_requirements_1_0= ruleERequirementDefinition
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
    // InternalRMParser.g:5575:1: entryRuleERequirementDefinition returns [EObject current=null] : iv_ruleERequirementDefinition= ruleERequirementDefinition EOF ;
    public final EObject entryRuleERequirementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementDefinition = null;


        try {
            // InternalRMParser.g:5575:63: (iv_ruleERequirementDefinition= ruleERequirementDefinition EOF )
            // InternalRMParser.g:5576:2: iv_ruleERequirementDefinition= ruleERequirementDefinition EOF
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
    // InternalRMParser.g:5582:1: ruleERequirementDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleERequirementDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_requirement_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5588:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:5589:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:5589:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:5590:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:5590:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:5591:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:5591:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:5592:5: lv_name_0_0= RULE_ID
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
            		
            // InternalRMParser.g:5616:3: ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) )
            // InternalRMParser.g:5617:4: (lv_requirement_3_0= ruleERequirementDefinitionBody )
            {
            // InternalRMParser.g:5617:4: (lv_requirement_3_0= ruleERequirementDefinitionBody )
            // InternalRMParser.g:5618:5: lv_requirement_3_0= ruleERequirementDefinitionBody
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
    // InternalRMParser.g:5643:1: entryRuleERequirementDefinitionBody returns [EObject current=null] : iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF ;
    public final EObject entryRuleERequirementDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementDefinitionBody = null;


        try {
            // InternalRMParser.g:5643:67: (iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF )
            // InternalRMParser.g:5644:2: iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF
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
    // InternalRMParser.g:5650:1: ruleERequirementDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleERequirementDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_capability_2_0=null;
        Token otherlv_3=null;
        Token lv_node_4_0=null;
        Token otherlv_5=null;
        Token lv_relationship_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_start_9_0 = null;

        EObject lv_end_11_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5656:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:5657:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:5657:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:5658:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:5658:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:5659:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:5662:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?)
            // InternalRMParser.g:5663:5: ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:5663:5: ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) ) )+
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
            	    // InternalRMParser.g:5664:3: ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5664:3: ({...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:5665:4: {...}? => ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:5665:120: ( ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:5666:5: ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:5669:8: ({...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:5669:9: {...}? => (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5669:18: (otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:5669:19: otherlv_1= Capability ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Capability,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getERequirementDefinitionBodyAccess().getCapabilityKeyword_0_0());
            	    							
            	    // InternalRMParser.g:5673:8: ( (lv_capability_2_0= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:5674:9: (lv_capability_2_0= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:5674:9: (lv_capability_2_0= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:5675:10: lv_capability_2_0= RULE_QUALIFIED_NAME
            	    {
            	    lv_capability_2_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_62); 

            	    										newLeafNode(lv_capability_2_0, grammarAccess.getERequirementDefinitionBodyAccess().getCapabilityQUALIFIED_NAMETerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"capability",
            	    											lv_capability_2_0,
            	    											"org.sodalite.dsl.RM.QUALIFIED_NAME");
            	    									

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
            	    // InternalRMParser.g:5697:3: ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5697:3: ({...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:5698:4: {...}? => ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:5698:120: ( ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:5699:5: ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:5702:8: ({...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:5702:9: {...}? => (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5702:18: (otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:5702:19: otherlv_3= Node ( (lv_node_4_0= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_3=(Token)match(input,Node,FOLLOW_8); 

            	    								newLeafNode(otherlv_3, grammarAccess.getERequirementDefinitionBodyAccess().getNodeKeyword_1_0());
            	    							
            	    // InternalRMParser.g:5706:8: ( (lv_node_4_0= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:5707:9: (lv_node_4_0= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:5707:9: (lv_node_4_0= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:5708:10: lv_node_4_0= RULE_QUALIFIED_NAME
            	    {
            	    lv_node_4_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_62); 

            	    										newLeafNode(lv_node_4_0, grammarAccess.getERequirementDefinitionBodyAccess().getNodeQUALIFIED_NAMETerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"node",
            	    											lv_node_4_0,
            	    											"org.sodalite.dsl.RM.QUALIFIED_NAME");
            	    									

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
            	    // InternalRMParser.g:5730:3: ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5730:3: ({...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:5731:4: {...}? => ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:5731:120: ( ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:5732:5: ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:5735:8: ({...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:5735:9: {...}? => (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5735:18: (otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:5735:19: otherlv_5= Relationship ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,Relationship,FOLLOW_8); 

            	    								newLeafNode(otherlv_5, grammarAccess.getERequirementDefinitionBodyAccess().getRelationshipKeyword_2_0());
            	    							
            	    // InternalRMParser.g:5739:8: ( (lv_relationship_6_0= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:5740:9: (lv_relationship_6_0= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:5740:9: (lv_relationship_6_0= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:5741:10: lv_relationship_6_0= RULE_QUALIFIED_NAME
            	    {
            	    lv_relationship_6_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_62); 

            	    										newLeafNode(lv_relationship_6_0, grammarAccess.getERequirementDefinitionBodyAccess().getRelationshipQUALIFIED_NAMETerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"relationship",
            	    											lv_relationship_6_0,
            	    											"org.sodalite.dsl.RM.QUALIFIED_NAME");
            	    									

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
            	    // InternalRMParser.g:5763:3: ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:5763:3: ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:5764:4: {...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:5764:120: ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) ) )
            	    // InternalRMParser.g:5765:5: ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:5768:8: ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket ) )
            	    // InternalRMParser.g:5768:9: {...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5768:18: (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket )
            	    // InternalRMParser.g:5768:19: otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= ruleEAlphaNumericValue ) ) otherlv_10= Comma ( (lv_end_11_0= ruleEAlphaNumericValue ) ) otherlv_12= RightSquareBracket
            	    {
            	    otherlv_7=(Token)match(input,Occurrences,FOLLOW_30); 

            	    								newLeafNode(otherlv_7, grammarAccess.getERequirementDefinitionBodyAccess().getOccurrencesKeyword_3_0());
            	    							
            	    otherlv_8=(Token)match(input,LeftSquareBracket,FOLLOW_59); 

            	    								newLeafNode(otherlv_8, grammarAccess.getERequirementDefinitionBodyAccess().getLeftSquareBracketKeyword_3_1());
            	    							
            	    // InternalRMParser.g:5776:8: ( (lv_start_9_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:5777:9: (lv_start_9_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:5777:9: (lv_start_9_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:5778:10: lv_start_9_0= ruleEAlphaNumericValue
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
            	    							
            	    // InternalRMParser.g:5799:8: ( (lv_end_11_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:5800:9: (lv_end_11_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:5800:9: (lv_end_11_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:5801:10: lv_end_11_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:5839:1: entryRuleEConstraints returns [EObject current=null] : iv_ruleEConstraints= ruleEConstraints EOF ;
    public final EObject entryRuleEConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraints = null;


        try {
            // InternalRMParser.g:5839:53: (iv_ruleEConstraints= ruleEConstraints EOF )
            // InternalRMParser.g:5840:2: iv_ruleEConstraints= ruleEConstraints EOF
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
    // InternalRMParser.g:5846:1: ruleEConstraints returns [EObject current=null] : ( () ( (lv_constraints_1_0= ruleEConstraint ) )* ) ;
    public final EObject ruleEConstraints() throws RecognitionException {
        EObject current = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5852:2: ( ( () ( (lv_constraints_1_0= ruleEConstraint ) )* ) )
            // InternalRMParser.g:5853:2: ( () ( (lv_constraints_1_0= ruleEConstraint ) )* )
            {
            // InternalRMParser.g:5853:2: ( () ( (lv_constraints_1_0= ruleEConstraint ) )* )
            // InternalRMParser.g:5854:3: () ( (lv_constraints_1_0= ruleEConstraint ) )*
            {
            // InternalRMParser.g:5854:3: ()
            // InternalRMParser.g:5855:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConstraintsAccess().getEConstraintsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:5861:3: ( (lv_constraints_1_0= ruleEConstraint ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==Greater_or_equal||LA45_0==Less_or_equal||LA45_0==Greater_than||LA45_0==Valid_values||(LA45_0>=Max_length && LA45_0<=Min_length)||LA45_0==Less_than||LA45_0==In_range||LA45_0==Length||LA45_0==Equal) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalRMParser.g:5862:4: (lv_constraints_1_0= ruleEConstraint )
            	    {
            	    // InternalRMParser.g:5862:4: (lv_constraints_1_0= ruleEConstraint )
            	    // InternalRMParser.g:5863:5: lv_constraints_1_0= ruleEConstraint
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
    // InternalRMParser.g:5884:1: entryRuleEConstraint returns [EObject current=null] : iv_ruleEConstraint= ruleEConstraint EOF ;
    public final EObject entryRuleEConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraint = null;


        try {
            // InternalRMParser.g:5884:52: (iv_ruleEConstraint= ruleEConstraint EOF )
            // InternalRMParser.g:5885:2: iv_ruleEConstraint= ruleEConstraint EOF
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
    // InternalRMParser.g:5891:1: ruleEConstraint returns [EObject current=null] : (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) ;
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
            // InternalRMParser.g:5897:2: ( (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) )
            // InternalRMParser.g:5898:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            {
            // InternalRMParser.g:5898:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
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
                    // InternalRMParser.g:5899:3: this_EEqual_0= ruleEEqual
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
                    // InternalRMParser.g:5908:3: this_EGreaterThan_1= ruleEGreaterThan
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
                    // InternalRMParser.g:5917:3: this_EGreaterOrEqual_2= ruleEGreaterOrEqual
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
                    // InternalRMParser.g:5926:3: this_ELessThan_3= ruleELessThan
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
                    // InternalRMParser.g:5935:3: this_ELessOrEqual_4= ruleELessOrEqual
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
                    // InternalRMParser.g:5944:3: this_EInRange_5= ruleEInRange
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
                    // InternalRMParser.g:5953:3: this_EValid_Values_6= ruleEValid_Values
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
                    // InternalRMParser.g:5962:3: this_ELength_7= ruleELength
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
                    // InternalRMParser.g:5971:3: this_EMinLength_8= ruleEMinLength
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
                    // InternalRMParser.g:5980:3: this_EMaxLength_9= ruleEMaxLength
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
    // InternalRMParser.g:5992:1: entryRuleEMaxLength returns [EObject current=null] : iv_ruleEMaxLength= ruleEMaxLength EOF ;
    public final EObject entryRuleEMaxLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMaxLength = null;


        try {
            // InternalRMParser.g:5992:51: (iv_ruleEMaxLength= ruleEMaxLength EOF )
            // InternalRMParser.g:5993:2: iv_ruleEMaxLength= ruleEMaxLength EOF
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
    // InternalRMParser.g:5999:1: ruleEMaxLength returns [EObject current=null] : (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEMaxLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6005:2: ( (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6006:2: (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6006:2: (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6007:3: otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Max_length,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getEMaxLengthAccess().getMax_lengthKeyword_0());
            		
            // InternalRMParser.g:6011:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6012:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6012:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6013:5: lv_val_1_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:6034:1: entryRuleEMinLength returns [EObject current=null] : iv_ruleEMinLength= ruleEMinLength EOF ;
    public final EObject entryRuleEMinLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMinLength = null;


        try {
            // InternalRMParser.g:6034:51: (iv_ruleEMinLength= ruleEMinLength EOF )
            // InternalRMParser.g:6035:2: iv_ruleEMinLength= ruleEMinLength EOF
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
    // InternalRMParser.g:6041:1: ruleEMinLength returns [EObject current=null] : (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEMinLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6047:2: ( (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6048:2: (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6048:2: (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6049:3: otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Min_length,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getEMinLengthAccess().getMin_lengthKeyword_0());
            		
            // InternalRMParser.g:6053:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6054:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6054:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6055:5: lv_val_1_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:6076:1: entryRuleELength returns [EObject current=null] : iv_ruleELength= ruleELength EOF ;
    public final EObject entryRuleELength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELength = null;


        try {
            // InternalRMParser.g:6076:48: (iv_ruleELength= ruleELength EOF )
            // InternalRMParser.g:6077:2: iv_ruleELength= ruleELength EOF
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
    // InternalRMParser.g:6083:1: ruleELength returns [EObject current=null] : (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleELength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6089:2: ( (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6090:2: (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6090:2: (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6091:3: otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Length,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getELengthAccess().getLengthKeyword_0());
            		
            // InternalRMParser.g:6095:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6096:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6096:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6097:5: lv_val_1_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:6118:1: entryRuleEValid_Values returns [EObject current=null] : iv_ruleEValid_Values= ruleEValid_Values EOF ;
    public final EObject entryRuleEValid_Values() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValid_Values = null;


        try {
            // InternalRMParser.g:6118:54: (iv_ruleEValid_Values= ruleEValid_Values EOF )
            // InternalRMParser.g:6119:2: iv_ruleEValid_Values= ruleEValid_Values EOF
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
    // InternalRMParser.g:6125:1: ruleEValid_Values returns [EObject current=null] : (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) ) ;
    public final EObject ruleEValid_Values() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6131:2: ( (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) ) )
            // InternalRMParser.g:6132:2: (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) )
            {
            // InternalRMParser.g:6132:2: (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) )
            // InternalRMParser.g:6133:3: otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) )
            {
            otherlv_0=(Token)match(input,Valid_values,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getEValid_ValuesAccess().getValid_valuesKeyword_0());
            		
            // InternalRMParser.g:6137:3: ( (lv_val_1_0= ruleELIST ) )
            // InternalRMParser.g:6138:4: (lv_val_1_0= ruleELIST )
            {
            // InternalRMParser.g:6138:4: (lv_val_1_0= ruleELIST )
            // InternalRMParser.g:6139:5: lv_val_1_0= ruleELIST
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
    // InternalRMParser.g:6160:1: entryRuleELIST returns [EObject current=null] : iv_ruleELIST= ruleELIST EOF ;
    public final EObject entryRuleELIST() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELIST = null;


        try {
            // InternalRMParser.g:6160:46: (iv_ruleELIST= ruleELIST EOF )
            // InternalRMParser.g:6161:2: iv_ruleELIST= ruleELIST EOF
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
    // InternalRMParser.g:6167:1: ruleELIST returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket ) ;
    public final EObject ruleELIST() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_list_1_0 = null;

        EObject lv_list_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6173:2: ( (otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket ) )
            // InternalRMParser.g:6174:2: (otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket )
            {
            // InternalRMParser.g:6174:2: (otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket )
            // InternalRMParser.g:6175:3: otherlv_0= LeftSquareBracket ( (lv_list_1_0= ruleEAlphaNumericValue ) ) (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )* otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getELISTAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalRMParser.g:6179:3: ( (lv_list_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6180:4: (lv_list_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6180:4: (lv_list_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6181:5: lv_list_1_0= ruleEAlphaNumericValue
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

            // InternalRMParser.g:6198:3: (otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==Comma) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalRMParser.g:6199:4: otherlv_2= Comma ( (lv_list_3_0= ruleEAlphaNumericValue ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_59); 

            	    				newLeafNode(otherlv_2, grammarAccess.getELISTAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRMParser.g:6203:4: ( (lv_list_3_0= ruleEAlphaNumericValue ) )
            	    // InternalRMParser.g:6204:5: (lv_list_3_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalRMParser.g:6204:5: (lv_list_3_0= ruleEAlphaNumericValue )
            	    // InternalRMParser.g:6205:6: lv_list_3_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:6231:1: entryRuleEInRange returns [EObject current=null] : iv_ruleEInRange= ruleEInRange EOF ;
    public final EObject entryRuleEInRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInRange = null;


        try {
            // InternalRMParser.g:6231:49: (iv_ruleEInRange= ruleEInRange EOF )
            // InternalRMParser.g:6232:2: iv_ruleEInRange= ruleEInRange EOF
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
    // InternalRMParser.g:6238:1: ruleEInRange returns [EObject current=null] : (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket ) ;
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
            // InternalRMParser.g:6244:2: ( (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket ) )
            // InternalRMParser.g:6245:2: (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket )
            {
            // InternalRMParser.g:6245:2: (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket )
            // InternalRMParser.g:6246:3: otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket
            {
            otherlv_0=(Token)match(input,In_range,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getEInRangeAccess().getIn_rangeKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getEInRangeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRMParser.g:6254:3: ( (lv_start_2_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6255:4: (lv_start_2_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6255:4: (lv_start_2_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6256:5: lv_start_2_0= ruleEAlphaNumericValue
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
            		
            // InternalRMParser.g:6277:3: ( (lv_end_4_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6278:4: (lv_end_4_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6278:4: (lv_end_4_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6279:5: lv_end_4_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:6304:1: entryRuleELessOrEqual returns [EObject current=null] : iv_ruleELessOrEqual= ruleELessOrEqual EOF ;
    public final EObject entryRuleELessOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessOrEqual = null;


        try {
            // InternalRMParser.g:6304:53: (iv_ruleELessOrEqual= ruleELessOrEqual EOF )
            // InternalRMParser.g:6305:2: iv_ruleELessOrEqual= ruleELessOrEqual EOF
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
    // InternalRMParser.g:6311:1: ruleELessOrEqual returns [EObject current=null] : (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleELessOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6317:2: ( (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6318:2: (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6318:2: (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6319:3: otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Less_or_equal,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getELessOrEqualAccess().getLess_or_equalKeyword_0());
            		
            // InternalRMParser.g:6323:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6324:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6324:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6325:5: lv_val_1_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:6346:1: entryRuleELessThan returns [EObject current=null] : iv_ruleELessThan= ruleELessThan EOF ;
    public final EObject entryRuleELessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessThan = null;


        try {
            // InternalRMParser.g:6346:50: (iv_ruleELessThan= ruleELessThan EOF )
            // InternalRMParser.g:6347:2: iv_ruleELessThan= ruleELessThan EOF
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
    // InternalRMParser.g:6353:1: ruleELessThan returns [EObject current=null] : (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleELessThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6359:2: ( (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6360:2: (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6360:2: (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6361:3: otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Less_than,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getELessThanAccess().getLess_thanKeyword_0());
            		
            // InternalRMParser.g:6365:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6366:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6366:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6367:5: lv_val_1_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:6388:1: entryRuleEGreaterOrEqual returns [EObject current=null] : iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF ;
    public final EObject entryRuleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterOrEqual = null;


        try {
            // InternalRMParser.g:6388:56: (iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF )
            // InternalRMParser.g:6389:2: iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF
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
    // InternalRMParser.g:6395:1: ruleEGreaterOrEqual returns [EObject current=null] : (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6401:2: ( (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6402:2: (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6402:2: (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6403:3: otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Greater_or_equal,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterOrEqualAccess().getGreater_or_equalKeyword_0());
            		
            // InternalRMParser.g:6407:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6408:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6408:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6409:5: lv_val_1_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:6430:1: entryRuleEGreaterThan returns [EObject current=null] : iv_ruleEGreaterThan= ruleEGreaterThan EOF ;
    public final EObject entryRuleEGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterThan = null;


        try {
            // InternalRMParser.g:6430:53: (iv_ruleEGreaterThan= ruleEGreaterThan EOF )
            // InternalRMParser.g:6431:2: iv_ruleEGreaterThan= ruleEGreaterThan EOF
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
    // InternalRMParser.g:6437:1: ruleEGreaterThan returns [EObject current=null] : (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6443:2: ( (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalRMParser.g:6444:2: (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalRMParser.g:6444:2: (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalRMParser.g:6445:3: otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Greater_than,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterThanAccess().getGreater_thanKeyword_0());
            		
            // InternalRMParser.g:6449:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalRMParser.g:6450:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalRMParser.g:6450:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalRMParser.g:6451:5: lv_val_1_0= ruleEAlphaNumericValue
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
    // InternalRMParser.g:6472:1: entryRuleEEqual returns [EObject current=null] : iv_ruleEEqual= ruleEEqual EOF ;
    public final EObject entryRuleEEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEqual = null;


        try {
            // InternalRMParser.g:6472:47: (iv_ruleEEqual= ruleEEqual EOF )
            // InternalRMParser.g:6473:2: iv_ruleEEqual= ruleEEqual EOF
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
    // InternalRMParser.g:6479:1: ruleEEqual returns [EObject current=null] : (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) ) ;
    public final EObject ruleEEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6485:2: ( (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) ) )
            // InternalRMParser.g:6486:2: (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) )
            {
            // InternalRMParser.g:6486:2: (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) )
            // InternalRMParser.g:6487:3: otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) )
            {
            otherlv_0=(Token)match(input,Equal,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getEEqualAccess().getEqualKeyword_0());
            		
            // InternalRMParser.g:6491:3: ( (lv_val_1_0= ruleESingleValue ) )
            // InternalRMParser.g:6492:4: (lv_val_1_0= ruleESingleValue )
            {
            // InternalRMParser.g:6492:4: (lv_val_1_0= ruleESingleValue )
            // InternalRMParser.g:6493:5: lv_val_1_0= ruleESingleValue
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
    // InternalRMParser.g:6514:1: entryRuleEAssignmentValue returns [EObject current=null] : iv_ruleEAssignmentValue= ruleEAssignmentValue EOF ;
    public final EObject entryRuleEAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssignmentValue = null;


        try {
            // InternalRMParser.g:6514:57: (iv_ruleEAssignmentValue= ruleEAssignmentValue EOF )
            // InternalRMParser.g:6515:2: iv_ruleEAssignmentValue= ruleEAssignmentValue EOF
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
    // InternalRMParser.g:6521:1: ruleEAssignmentValue returns [EObject current=null] : (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction ) ;
    public final EObject ruleEAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject this_ESingleValue_0 = null;

        EObject this_ELIST_1 = null;

        EObject this_EMAP_2 = null;

        EObject this_EFunction_3 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6527:2: ( (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction ) )
            // InternalRMParser.g:6528:2: (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction )
            {
            // InternalRMParser.g:6528:2: (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction )
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
                    // InternalRMParser.g:6529:3: this_ESingleValue_0= ruleESingleValue
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
                    // InternalRMParser.g:6538:3: this_ELIST_1= ruleELIST
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
                    // InternalRMParser.g:6547:3: this_EMAP_2= ruleEMAP
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
                    // InternalRMParser.g:6556:3: this_EFunction_3= ruleEFunction
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
    // InternalRMParser.g:6568:1: entryRuleESingleValue returns [EObject current=null] : iv_ruleESingleValue= ruleESingleValue EOF ;
    public final EObject entryRuleESingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESingleValue = null;


        try {
            // InternalRMParser.g:6568:53: (iv_ruleESingleValue= ruleESingleValue EOF )
            // InternalRMParser.g:6569:2: iv_ruleESingleValue= ruleESingleValue EOF
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
    // InternalRMParser.g:6575:1: ruleESingleValue returns [EObject current=null] : (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT ) ;
    public final EObject ruleESingleValue() throws RecognitionException {
        EObject current = null;

        EObject this_ESTRING_0 = null;

        EObject this_EBOOLEAN_1 = null;

        EObject this_EFLOAT_2 = null;

        EObject this_ESIGNEDINT_3 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6581:2: ( (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT ) )
            // InternalRMParser.g:6582:2: (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT )
            {
            // InternalRMParser.g:6582:2: (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT )
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

                if ( (LA49_3==FullStop) ) {
                    alt49=3;
                }
                else if ( (LA49_3==EOF||LA49_3==Greater_or_equal||LA49_3==Less_or_equal||LA49_3==Entry_schema||LA49_3==Greater_than||(LA49_3>=Valid_values && LA49_3<=Description)||(LA49_3>=Max_length && LA49_3<=Min_length)||LA49_3==Less_than||LA49_3==In_range||(LA49_3>=Required && LA49_3<=Default)||LA49_3==Length||(LA49_3>=Status && LA49_3<=Value)||LA49_3==Type||LA49_3==RULE_ID||LA49_3==RULE_END) ) {
                    alt49=4;
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
                    // InternalRMParser.g:6583:3: this_ESTRING_0= ruleESTRING
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
                    // InternalRMParser.g:6592:3: this_EBOOLEAN_1= ruleEBOOLEAN
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
                    // InternalRMParser.g:6601:3: this_EFLOAT_2= ruleEFLOAT
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
                    // InternalRMParser.g:6610:3: this_ESIGNEDINT_3= ruleESIGNEDINT
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
    // InternalRMParser.g:6622:1: entryRuleEAlphaNumericValue returns [EObject current=null] : iv_ruleEAlphaNumericValue= ruleEAlphaNumericValue EOF ;
    public final EObject entryRuleEAlphaNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAlphaNumericValue = null;


        try {
            // InternalRMParser.g:6622:59: (iv_ruleEAlphaNumericValue= ruleEAlphaNumericValue EOF )
            // InternalRMParser.g:6623:2: iv_ruleEAlphaNumericValue= ruleEAlphaNumericValue EOF
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
    // InternalRMParser.g:6629:1: ruleEAlphaNumericValue returns [EObject current=null] : (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT ) ;
    public final EObject ruleEAlphaNumericValue() throws RecognitionException {
        EObject current = null;

        EObject this_ESTRING_0 = null;

        EObject this_EFLOAT_1 = null;

        EObject this_ESIGNEDINT_2 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6635:2: ( (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT ) )
            // InternalRMParser.g:6636:2: (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT )
            {
            // InternalRMParser.g:6636:2: (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT )
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
                    // InternalRMParser.g:6637:3: this_ESTRING_0= ruleESTRING
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
                    // InternalRMParser.g:6646:3: this_EFLOAT_1= ruleEFLOAT
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
                    // InternalRMParser.g:6655:3: this_ESIGNEDINT_2= ruleESIGNEDINT
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
    // InternalRMParser.g:6667:1: entryRuleESTRING returns [EObject current=null] : iv_ruleESTRING= ruleESTRING EOF ;
    public final EObject entryRuleESTRING() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESTRING = null;


        try {
            // InternalRMParser.g:6667:48: (iv_ruleESTRING= ruleESTRING EOF )
            // InternalRMParser.g:6668:2: iv_ruleESTRING= ruleESTRING EOF
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
    // InternalRMParser.g:6674:1: ruleESTRING returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleESTRING() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:6680:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalRMParser.g:6681:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalRMParser.g:6681:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalRMParser.g:6682:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalRMParser.g:6682:3: (lv_value_0_0= RULE_STRING )
            // InternalRMParser.g:6683:4: lv_value_0_0= RULE_STRING
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
    // InternalRMParser.g:6702:1: entryRuleEBOOLEAN returns [EObject current=null] : iv_ruleEBOOLEAN= ruleEBOOLEAN EOF ;
    public final EObject entryRuleEBOOLEAN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBOOLEAN = null;


        try {
            // InternalRMParser.g:6702:49: (iv_ruleEBOOLEAN= ruleEBOOLEAN EOF )
            // InternalRMParser.g:6703:2: iv_ruleEBOOLEAN= ruleEBOOLEAN EOF
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
    // InternalRMParser.g:6709:1: ruleEBOOLEAN returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleEBOOLEAN() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:6715:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalRMParser.g:6716:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalRMParser.g:6716:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalRMParser.g:6717:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalRMParser.g:6717:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalRMParser.g:6718:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalRMParser.g:6737:1: entryRuleEFLOAT returns [EObject current=null] : iv_ruleEFLOAT= ruleEFLOAT EOF ;
    public final EObject entryRuleEFLOAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFLOAT = null;


        try {
            // InternalRMParser.g:6737:47: (iv_ruleEFLOAT= ruleEFLOAT EOF )
            // InternalRMParser.g:6738:2: iv_ruleEFLOAT= ruleEFLOAT EOF
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
    // InternalRMParser.g:6744:1: ruleEFLOAT returns [EObject current=null] : ( (lv_value_0_0= ruleFLOAT ) ) ;
    public final EObject ruleEFLOAT() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6750:2: ( ( (lv_value_0_0= ruleFLOAT ) ) )
            // InternalRMParser.g:6751:2: ( (lv_value_0_0= ruleFLOAT ) )
            {
            // InternalRMParser.g:6751:2: ( (lv_value_0_0= ruleFLOAT ) )
            // InternalRMParser.g:6752:3: (lv_value_0_0= ruleFLOAT )
            {
            // InternalRMParser.g:6752:3: (lv_value_0_0= ruleFLOAT )
            // InternalRMParser.g:6753:4: lv_value_0_0= ruleFLOAT
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
    // InternalRMParser.g:6773:1: entryRuleESIGNEDINT returns [EObject current=null] : iv_ruleESIGNEDINT= ruleESIGNEDINT EOF ;
    public final EObject entryRuleESIGNEDINT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESIGNEDINT = null;


        try {
            // InternalRMParser.g:6773:51: (iv_ruleESIGNEDINT= ruleESIGNEDINT EOF )
            // InternalRMParser.g:6774:2: iv_ruleESIGNEDINT= ruleESIGNEDINT EOF
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
    // InternalRMParser.g:6780:1: ruleESIGNEDINT returns [EObject current=null] : ( (lv_value_0_0= ruleSIGNEDINT ) ) ;
    public final EObject ruleESIGNEDINT() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6786:2: ( ( (lv_value_0_0= ruleSIGNEDINT ) ) )
            // InternalRMParser.g:6787:2: ( (lv_value_0_0= ruleSIGNEDINT ) )
            {
            // InternalRMParser.g:6787:2: ( (lv_value_0_0= ruleSIGNEDINT ) )
            // InternalRMParser.g:6788:3: (lv_value_0_0= ruleSIGNEDINT )
            {
            // InternalRMParser.g:6788:3: (lv_value_0_0= ruleSIGNEDINT )
            // InternalRMParser.g:6789:4: lv_value_0_0= ruleSIGNEDINT
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
    // InternalRMParser.g:6809:1: entryRuleEMAP returns [EObject current=null] : iv_ruleEMAP= ruleEMAP EOF ;
    public final EObject entryRuleEMAP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMAP = null;


        try {
            // InternalRMParser.g:6809:45: (iv_ruleEMAP= ruleEMAP EOF )
            // InternalRMParser.g:6810:2: iv_ruleEMAP= ruleEMAP EOF
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
    // InternalRMParser.g:6816:1: ruleEMAP returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END ) ;
    public final EObject ruleEMAP() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token this_END_2=null;
        EObject lv_map_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6822:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END ) )
            // InternalRMParser.g:6823:2: (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END )
            {
            // InternalRMParser.g:6823:2: (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END )
            // InternalRMParser.g:6824:3: this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getEMAPAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalRMParser.g:6828:3: ( (lv_map_1_0= ruleEMapEntry ) )+
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
            	    // InternalRMParser.g:6829:4: (lv_map_1_0= ruleEMapEntry )
            	    {
            	    // InternalRMParser.g:6829:4: (lv_map_1_0= ruleEMapEntry )
            	    // InternalRMParser.g:6830:5: lv_map_1_0= ruleEMapEntry
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
    // InternalRMParser.g:6855:1: entryRuleEMapEntry returns [EObject current=null] : iv_ruleEMapEntry= ruleEMapEntry EOF ;
    public final EObject entryRuleEMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMapEntry = null;


        try {
            // InternalRMParser.g:6855:50: (iv_ruleEMapEntry= ruleEMapEntry EOF )
            // InternalRMParser.g:6856:2: iv_ruleEMapEntry= ruleEMapEntry EOF
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
    // InternalRMParser.g:6862:1: ruleEMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) ) ;
    public final EObject ruleEMapEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6868:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) ) )
            // InternalRMParser.g:6869:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) )
            {
            // InternalRMParser.g:6869:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) )
            // InternalRMParser.g:6870:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) )
            {
            // InternalRMParser.g:6870:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalRMParser.g:6871:4: (lv_key_0_0= RULE_ID )
            {
            // InternalRMParser.g:6871:4: (lv_key_0_0= RULE_ID )
            // InternalRMParser.g:6872:5: lv_key_0_0= RULE_ID
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
            		
            // InternalRMParser.g:6892:3: ( (lv_value_2_0= ruleEAssignmentValue ) )
            // InternalRMParser.g:6893:4: (lv_value_2_0= ruleEAssignmentValue )
            {
            // InternalRMParser.g:6893:4: (lv_value_2_0= ruleEAssignmentValue )
            // InternalRMParser.g:6894:5: lv_value_2_0= ruleEAssignmentValue
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
    // InternalRMParser.g:6915:1: entryRuleSIGNEDINT returns [String current=null] : iv_ruleSIGNEDINT= ruleSIGNEDINT EOF ;
    public final String entryRuleSIGNEDINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNEDINT = null;


        try {
            // InternalRMParser.g:6915:49: (iv_ruleSIGNEDINT= ruleSIGNEDINT EOF )
            // InternalRMParser.g:6916:2: iv_ruleSIGNEDINT= ruleSIGNEDINT EOF
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
    // InternalRMParser.g:6922:1: ruleSIGNEDINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSIGNEDINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRMParser.g:6928:2: ( ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) )
            // InternalRMParser.g:6929:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            {
            // InternalRMParser.g:6929:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            // InternalRMParser.g:6930:3: (kw= HyphenMinus )? this_INT_1= RULE_INT
            {
            // InternalRMParser.g:6930:3: (kw= HyphenMinus )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==HyphenMinus) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRMParser.g:6931:4: kw= HyphenMinus
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
    // InternalRMParser.g:6948:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalRMParser.g:6948:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalRMParser.g:6949:2: iv_ruleFLOAT= ruleFLOAT EOF
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
    // InternalRMParser.g:6955:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalRMParser.g:6961:2: ( ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT ) )
            // InternalRMParser.g:6962:2: ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT )
            {
            // InternalRMParser.g:6962:2: ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT )
            // InternalRMParser.g:6963:3: (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT
            {
            // InternalRMParser.g:6963:3: (this_INT_0= RULE_INT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRMParser.g:6964:4: this_INT_0= RULE_INT
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
