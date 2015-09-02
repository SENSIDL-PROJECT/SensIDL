package de.fzi.sensidl.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fzi.sensidl.language.services.SensidlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSensidlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_UNIT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sensorInterface'", "'with'", "'identifier'", "'{'", "'}'", "';'", "'encoding'", "'alignment'", "'sensorData'", "'dataSet'", "'as'", "'in'", "'adjusted'", "'by'", "':'", "','", "'constant'", "'='", "'value'", "'range'", "'...'", "'scaling factor'", "'and'", "'offset'", "'linear mapping'", "'['", "']'", "'=>'", "'.'", "'true'", "'false'", "'_8BIT'", "'_16BIT'", "'_32BIT'", "'_64BIT'", "'SENSIDL_BINARY'", "'SENSIDL_JSON'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'SIGNED_CHAR'", "'UNSIGNED_CHAR'", "'SIGNED_SHORT'", "'UNSIGNED_SHORT'", "'SIGNED_LONG'", "'UNSIGNED_LONG'", "'SIGNED_LONG_LONG'", "'UNSIGNED_LONG_LONG'", "'FLOAT'", "'DOUBLE'", "'LONG_DOUBLE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_UNIT=6;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


        public InternalSensidlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSensidlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSensidlParser.tokenNames; }
    public String getGrammarFileName() { return "../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g"; }



     	private SensidlGrammarAccess grammarAccess;
     	
        public InternalSensidlParser(TokenStream input, SensidlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "NamedElement";	
       	}
       	
       	@Override
       	protected SensidlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNamedElement"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:68:1: entryRuleNamedElement returns [EObject current=null] : iv_ruleNamedElement= ruleNamedElement EOF ;
    public final EObject entryRuleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElement = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:69:2: (iv_ruleNamedElement= ruleNamedElement EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:70:2: iv_ruleNamedElement= ruleNamedElement EOF
            {
             newCompositeNode(grammarAccess.getNamedElementRule()); 
            pushFollow(FOLLOW_ruleNamedElement_in_entryRuleNamedElement75);
            iv_ruleNamedElement=ruleNamedElement();

            state._fsp--;

             current =iv_ruleNamedElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedElement85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:77:1: ruleNamedElement returns [EObject current=null] : (this_SensorInterface_0= ruleSensorInterface | this_SensorDataDescription_1= ruleSensorDataDescription | this_DataSet_2= ruleDataSet | this_Data_3= ruleData ) ;
    public final EObject ruleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject this_SensorInterface_0 = null;

        EObject this_SensorDataDescription_1 = null;

        EObject this_DataSet_2 = null;

        EObject this_Data_3 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:80:28: ( (this_SensorInterface_0= ruleSensorInterface | this_SensorDataDescription_1= ruleSensorDataDescription | this_DataSet_2= ruleDataSet | this_Data_3= ruleData ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:81:1: (this_SensorInterface_0= ruleSensorInterface | this_SensorDataDescription_1= ruleSensorDataDescription | this_DataSet_2= ruleDataSet | this_Data_3= ruleData )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:81:1: (this_SensorInterface_0= ruleSensorInterface | this_SensorDataDescription_1= ruleSensorDataDescription | this_DataSet_2= ruleDataSet | this_Data_3= ruleData )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case RULE_ID:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:82:5: this_SensorInterface_0= ruleSensorInterface
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getSensorInterfaceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSensorInterface_in_ruleNamedElement132);
                    this_SensorInterface_0=ruleSensorInterface();

                    state._fsp--;

                     
                            current = this_SensorInterface_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:92:5: this_SensorDataDescription_1= ruleSensorDataDescription
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getSensorDataDescriptionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSensorDataDescription_in_ruleNamedElement159);
                    this_SensorDataDescription_1=ruleSensorDataDescription();

                    state._fsp--;

                     
                            current = this_SensorDataDescription_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:102:5: this_DataSet_2= ruleDataSet
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getDataSetParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDataSet_in_ruleNamedElement186);
                    this_DataSet_2=ruleDataSet();

                    state._fsp--;

                     
                            current = this_DataSet_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:112:5: this_Data_3= ruleData
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getDataParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleData_in_ruleNamedElement213);
                    this_Data_3=ruleData();

                    state._fsp--;

                     
                            current = this_Data_3; 
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
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleSensorInterface"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:128:1: entryRuleSensorInterface returns [EObject current=null] : iv_ruleSensorInterface= ruleSensorInterface EOF ;
    public final EObject entryRuleSensorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorInterface = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:129:2: (iv_ruleSensorInterface= ruleSensorInterface EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:130:2: iv_ruleSensorInterface= ruleSensorInterface EOF
            {
             newCompositeNode(grammarAccess.getSensorInterfaceRule()); 
            pushFollow(FOLLOW_ruleSensorInterface_in_entryRuleSensorInterface248);
            iv_ruleSensorInterface=ruleSensorInterface();

            state._fsp--;

             current =iv_ruleSensorInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorInterface258); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorInterface"


    // $ANTLR start "ruleSensorInterface"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:137:1: ruleSensorInterface returns [EObject current=null] : (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_metaInformation_7_0= ruleSensorMetaInformation ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' otherlv_10= ';' ) ;
    public final EObject ruleSensorInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_ID_5_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_metaInformation_7_0 = null;

        EObject lv_dataDescription_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:140:28: ( (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_metaInformation_7_0= ruleSensorMetaInformation ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' otherlv_10= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:141:1: (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_metaInformation_7_0= ruleSensorMetaInformation ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' otherlv_10= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:141:1: (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_metaInformation_7_0= ruleSensorMetaInformation ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' otherlv_10= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:141:3: otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_metaInformation_7_0= ruleSensorMetaInformation ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleSensorInterface295); 

                	newLeafNode(otherlv_0, grammarAccess.getSensorInterfaceAccess().getSensorInterfaceKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:145:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:146:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:146:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:147:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensorInterface312); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSensorInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSensorInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:163:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:164:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:164:1: (lv_description_2_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:165:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSensorInterface334); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getSensorInterfaceAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:181:3: (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:181:5: otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSensorInterface353); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorInterfaceAccess().getWithKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleSensorInterface365); 

                        	newLeafNode(otherlv_4, grammarAccess.getSensorInterfaceAccess().getIdentifierKeyword_3_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:189:1: ( (lv_ID_5_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:190:1: (lv_ID_5_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:190:1: (lv_ID_5_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:191:3: lv_ID_5_0= RULE_STRING
                    {
                    lv_ID_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSensorInterface382); 

                    			newLeafNode(lv_ID_5_0, grammarAccess.getSensorInterfaceAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSensorInterface401); 

                	newLeafNode(otherlv_6, grammarAccess.getSensorInterfaceAccess().getLeftCurlyBracketKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:211:1: ( (lv_metaInformation_7_0= ruleSensorMetaInformation ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:212:1: (lv_metaInformation_7_0= ruleSensorMetaInformation )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:212:1: (lv_metaInformation_7_0= ruleSensorMetaInformation )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:213:3: lv_metaInformation_7_0= ruleSensorMetaInformation
            {
             
            	        newCompositeNode(grammarAccess.getSensorInterfaceAccess().getMetaInformationSensorMetaInformationParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleSensorMetaInformation_in_ruleSensorInterface422);
            lv_metaInformation_7_0=ruleSensorMetaInformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensorInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"metaInformation",
                    		lv_metaInformation_7_0, 
                    		"SensorMetaInformation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:229:2: ( (lv_dataDescription_8_0= ruleSensorDataDescription ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:230:1: (lv_dataDescription_8_0= ruleSensorDataDescription )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:230:1: (lv_dataDescription_8_0= ruleSensorDataDescription )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:231:3: lv_dataDescription_8_0= ruleSensorDataDescription
            {
             
            	        newCompositeNode(grammarAccess.getSensorInterfaceAccess().getDataDescriptionSensorDataDescriptionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSensorDataDescription_in_ruleSensorInterface443);
            lv_dataDescription_8_0=ruleSensorDataDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensorInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"dataDescription",
                    		lv_dataDescription_8_0, 
                    		"SensorDataDescription");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleSensorInterface455); 

                	newLeafNode(otherlv_9, grammarAccess.getSensorInterfaceAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleSensorInterface467); 

                	newLeafNode(otherlv_10, grammarAccess.getSensorInterfaceAccess().getSemicolonKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorInterface"


    // $ANTLR start "entryRuleSensorMetaInformation"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:263:1: entryRuleSensorMetaInformation returns [EObject current=null] : iv_ruleSensorMetaInformation= ruleSensorMetaInformation EOF ;
    public final EObject entryRuleSensorMetaInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorMetaInformation = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:264:2: (iv_ruleSensorMetaInformation= ruleSensorMetaInformation EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:265:2: iv_ruleSensorMetaInformation= ruleSensorMetaInformation EOF
            {
             newCompositeNode(grammarAccess.getSensorMetaInformationRule()); 
            pushFollow(FOLLOW_ruleSensorMetaInformation_in_entryRuleSensorMetaInformation503);
            iv_ruleSensorMetaInformation=ruleSensorMetaInformation();

            state._fsp--;

             current =iv_ruleSensorMetaInformation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorMetaInformation513); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorMetaInformation"


    // $ANTLR start "ruleSensorMetaInformation"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:272:1: ruleSensorMetaInformation returns [EObject current=null] : (otherlv_0= 'encoding' ( (lv_coding_1_0= ruleCoding ) ) otherlv_2= 'with' ( (lv_endianness_3_0= ruleEndianness ) ) otherlv_4= 'alignment' ( (lv_alignment_5_0= ruleAlignment ) ) otherlv_6= ';' ) ;
    public final EObject ruleSensorMetaInformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_coding_1_0 = null;

        Enumerator lv_endianness_3_0 = null;

        Enumerator lv_alignment_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:275:28: ( (otherlv_0= 'encoding' ( (lv_coding_1_0= ruleCoding ) ) otherlv_2= 'with' ( (lv_endianness_3_0= ruleEndianness ) ) otherlv_4= 'alignment' ( (lv_alignment_5_0= ruleAlignment ) ) otherlv_6= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:276:1: (otherlv_0= 'encoding' ( (lv_coding_1_0= ruleCoding ) ) otherlv_2= 'with' ( (lv_endianness_3_0= ruleEndianness ) ) otherlv_4= 'alignment' ( (lv_alignment_5_0= ruleAlignment ) ) otherlv_6= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:276:1: (otherlv_0= 'encoding' ( (lv_coding_1_0= ruleCoding ) ) otherlv_2= 'with' ( (lv_endianness_3_0= ruleEndianness ) ) otherlv_4= 'alignment' ( (lv_alignment_5_0= ruleAlignment ) ) otherlv_6= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:276:3: otherlv_0= 'encoding' ( (lv_coding_1_0= ruleCoding ) ) otherlv_2= 'with' ( (lv_endianness_3_0= ruleEndianness ) ) otherlv_4= 'alignment' ( (lv_alignment_5_0= ruleAlignment ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleSensorMetaInformation550); 

                	newLeafNode(otherlv_0, grammarAccess.getSensorMetaInformationAccess().getEncodingKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:280:1: ( (lv_coding_1_0= ruleCoding ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:281:1: (lv_coding_1_0= ruleCoding )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:281:1: (lv_coding_1_0= ruleCoding )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:282:3: lv_coding_1_0= ruleCoding
            {
             
            	        newCompositeNode(grammarAccess.getSensorMetaInformationAccess().getCodingCodingEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCoding_in_ruleSensorMetaInformation571);
            lv_coding_1_0=ruleCoding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensorMetaInformationRule());
            	        }
                   		set(
                   			current, 
                   			"coding",
                    		lv_coding_1_0, 
                    		"Coding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSensorMetaInformation583); 

                	newLeafNode(otherlv_2, grammarAccess.getSensorMetaInformationAccess().getWithKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:302:1: ( (lv_endianness_3_0= ruleEndianness ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:303:1: (lv_endianness_3_0= ruleEndianness )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:303:1: (lv_endianness_3_0= ruleEndianness )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:304:3: lv_endianness_3_0= ruleEndianness
            {
             
            	        newCompositeNode(grammarAccess.getSensorMetaInformationAccess().getEndiannessEndiannessEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEndianness_in_ruleSensorMetaInformation604);
            lv_endianness_3_0=ruleEndianness();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensorMetaInformationRule());
            	        }
                   		set(
                   			current, 
                   			"endianness",
                    		lv_endianness_3_0, 
                    		"Endianness");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleSensorMetaInformation616); 

                	newLeafNode(otherlv_4, grammarAccess.getSensorMetaInformationAccess().getAlignmentKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:324:1: ( (lv_alignment_5_0= ruleAlignment ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:325:1: (lv_alignment_5_0= ruleAlignment )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:325:1: (lv_alignment_5_0= ruleAlignment )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:326:3: lv_alignment_5_0= ruleAlignment
            {
             
            	        newCompositeNode(grammarAccess.getSensorMetaInformationAccess().getAlignmentAlignmentEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAlignment_in_ruleSensorMetaInformation637);
            lv_alignment_5_0=ruleAlignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensorMetaInformationRule());
            	        }
                   		set(
                   			current, 
                   			"alignment",
                    		lv_alignment_5_0, 
                    		"Alignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleSensorMetaInformation649); 

                	newLeafNode(otherlv_6, grammarAccess.getSensorMetaInformationAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorMetaInformation"


    // $ANTLR start "entryRuleSensorDataDescription"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:354:1: entryRuleSensorDataDescription returns [EObject current=null] : iv_ruleSensorDataDescription= ruleSensorDataDescription EOF ;
    public final EObject entryRuleSensorDataDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorDataDescription = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:355:2: (iv_ruleSensorDataDescription= ruleSensorDataDescription EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:356:2: iv_ruleSensorDataDescription= ruleSensorDataDescription EOF
            {
             newCompositeNode(grammarAccess.getSensorDataDescriptionRule()); 
            pushFollow(FOLLOW_ruleSensorDataDescription_in_entryRuleSensorDataDescription685);
            iv_ruleSensorDataDescription=ruleSensorDataDescription();

            state._fsp--;

             current =iv_ruleSensorDataDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorDataDescription695); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorDataDescription"


    // $ANTLR start "ruleSensorDataDescription"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:363:1: ruleSensorDataDescription returns [EObject current=null] : (otherlv_0= 'sensorData' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_dataSets_7_0= ruleDataSet ) )* otherlv_8= '}' otherlv_9= ';' ) ;
    public final EObject ruleSensorDataDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_ID_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_dataSets_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:366:28: ( (otherlv_0= 'sensorData' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_dataSets_7_0= ruleDataSet ) )* otherlv_8= '}' otherlv_9= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:367:1: (otherlv_0= 'sensorData' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_dataSets_7_0= ruleDataSet ) )* otherlv_8= '}' otherlv_9= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:367:1: (otherlv_0= 'sensorData' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_dataSets_7_0= ruleDataSet ) )* otherlv_8= '}' otherlv_9= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:367:3: otherlv_0= 'sensorData' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_dataSets_7_0= ruleDataSet ) )* otherlv_8= '}' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSensorDataDescription732); 

                	newLeafNode(otherlv_0, grammarAccess.getSensorDataDescriptionAccess().getSensorDataKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:371:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:372:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:372:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:373:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensorDataDescription749); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSensorDataDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSensorDataDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:389:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:390:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:390:1: (lv_description_2_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:391:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSensorDataDescription771); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getSensorDataDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorDataDescriptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:407:3: (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:407:5: otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSensorDataDescription790); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorDataDescriptionAccess().getWithKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleSensorDataDescription802); 

                        	newLeafNode(otherlv_4, grammarAccess.getSensorDataDescriptionAccess().getIdentifierKeyword_3_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:415:1: ( (lv_ID_5_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:416:1: (lv_ID_5_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:416:1: (lv_ID_5_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:417:3: lv_ID_5_0= RULE_STRING
                    {
                    lv_ID_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSensorDataDescription819); 

                    			newLeafNode(lv_ID_5_0, grammarAccess.getSensorDataDescriptionAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorDataDescriptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSensorDataDescription838); 

                	newLeafNode(otherlv_6, grammarAccess.getSensorDataDescriptionAccess().getLeftCurlyBracketKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:437:1: ( (lv_dataSets_7_0= ruleDataSet ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:438:1: (lv_dataSets_7_0= ruleDataSet )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:438:1: (lv_dataSets_7_0= ruleDataSet )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:439:3: lv_dataSets_7_0= ruleDataSet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSensorDataDescriptionAccess().getDataSetsDataSetParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataSet_in_ruleSensorDataDescription859);
            	    lv_dataSets_7_0=ruleDataSet();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSensorDataDescriptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dataSets",
            	            		lv_dataSets_7_0, 
            	            		"DataSet");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleSensorDataDescription872); 

                	newLeafNode(otherlv_8, grammarAccess.getSensorDataDescriptionAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleSensorDataDescription884); 

                	newLeafNode(otherlv_9, grammarAccess.getSensorDataDescriptionAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorDataDescription"


    // $ANTLR start "entryRuleDataSet"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:471:1: entryRuleDataSet returns [EObject current=null] : iv_ruleDataSet= ruleDataSet EOF ;
    public final EObject entryRuleDataSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSet = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:472:2: (iv_ruleDataSet= ruleDataSet EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:473:2: iv_ruleDataSet= ruleDataSet EOF
            {
             newCompositeNode(grammarAccess.getDataSetRule()); 
            pushFollow(FOLLOW_ruleDataSet_in_entryRuleDataSet920);
            iv_ruleDataSet=ruleDataSet();

            state._fsp--;

             current =iv_ruleDataSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSet930); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataSet"


    // $ANTLR start "ruleDataSet"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:480:1: ruleDataSet returns [EObject current=null] : (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_subDataSets_7_0= ruleDataSet ) )? ( (lv_data_8_0= ruleData ) )* otherlv_9= '}' otherlv_10= ';' ) ;
    public final EObject ruleDataSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_ID_5_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_subDataSets_7_0 = null;

        EObject lv_data_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:483:28: ( (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_subDataSets_7_0= ruleDataSet ) )? ( (lv_data_8_0= ruleData ) )* otherlv_9= '}' otherlv_10= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:484:1: (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_subDataSets_7_0= ruleDataSet ) )? ( (lv_data_8_0= ruleData ) )* otherlv_9= '}' otherlv_10= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:484:1: (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_subDataSets_7_0= ruleDataSet ) )? ( (lv_data_8_0= ruleData ) )* otherlv_9= '}' otherlv_10= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:484:3: otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_subDataSets_7_0= ruleDataSet ) )? ( (lv_data_8_0= ruleData ) )* otherlv_9= '}' otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleDataSet967); 

                	newLeafNode(otherlv_0, grammarAccess.getDataSetAccess().getDataSetKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:488:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:489:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:489:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:490:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSet984); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataSetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:506:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:507:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:507:1: (lv_description_2_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:508:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataSet1006); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getDataSetAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:524:3: (otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:524:5: otherlv_3= 'with' otherlv_4= 'identifier' ( (lv_ID_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDataSet1025); 

                        	newLeafNode(otherlv_3, grammarAccess.getDataSetAccess().getWithKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleDataSet1037); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataSetAccess().getIdentifierKeyword_3_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:532:1: ( (lv_ID_5_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:533:1: (lv_ID_5_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:533:1: (lv_ID_5_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:534:3: lv_ID_5_0= RULE_STRING
                    {
                    lv_ID_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataSet1054); 

                    			newLeafNode(lv_ID_5_0, grammarAccess.getDataSetAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleDataSet1073); 

                	newLeafNode(otherlv_6, grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:554:1: ( (lv_subDataSets_7_0= ruleDataSet ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:555:1: (lv_subDataSets_7_0= ruleDataSet )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:555:1: (lv_subDataSets_7_0= ruleDataSet )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:556:3: lv_subDataSets_7_0= ruleDataSet
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSetAccess().getSubDataSetsDataSetParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataSet_in_ruleDataSet1094);
                    lv_subDataSets_7_0=ruleDataSet();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataSetRule());
                    	        }
                           		add(
                           			current, 
                           			"subDataSets",
                            		lv_subDataSets_7_0, 
                            		"DataSet");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:572:3: ( (lv_data_8_0= ruleData ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:573:1: (lv_data_8_0= ruleData )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:573:1: (lv_data_8_0= ruleData )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:574:3: lv_data_8_0= ruleData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleData_in_ruleDataSet1116);
            	    lv_data_8_0=ruleData();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"data",
            	            		lv_data_8_0, 
            	            		"Data");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleDataSet1129); 

                	newLeafNode(otherlv_9, grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleDataSet1141); 

                	newLeafNode(otherlv_10, grammarAccess.getDataSetAccess().getSemicolonKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataSet"


    // $ANTLR start "entryRuleData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:606:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:607:2: (iv_ruleData= ruleData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:608:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData1177);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData1187); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:615:1: ruleData returns [EObject current=null] : (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject this_MeasurementData_0 = null;

        EObject this_NonMeasurementData_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:618:28: ( (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:619:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:619:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:620:5: this_MeasurementData_0= ruleMeasurementData
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMeasurementData_in_ruleData1234);
                    this_MeasurementData_0=ruleMeasurementData();

                    state._fsp--;

                     
                            current = this_MeasurementData_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:630:5: this_NonMeasurementData_1= ruleNonMeasurementData
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getNonMeasurementDataParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNonMeasurementData_in_ruleData1261);
                    this_NonMeasurementData_1=ruleNonMeasurementData();

                    state._fsp--;

                     
                            current = this_NonMeasurementData_1; 
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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleMeasurementData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:646:1: entryRuleMeasurementData returns [EObject current=null] : iv_ruleMeasurementData= ruleMeasurementData EOF ;
    public final EObject entryRuleMeasurementData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:647:2: (iv_ruleMeasurementData= ruleMeasurementData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:648:2: iv_ruleMeasurementData= ruleMeasurementData EOF
            {
             newCompositeNode(grammarAccess.getMeasurementDataRule()); 
            pushFollow(FOLLOW_ruleMeasurementData_in_entryRuleMeasurementData1296);
            iv_ruleMeasurementData=ruleMeasurementData();

            state._fsp--;

             current =iv_ruleMeasurementData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementData1306); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasurementData"


    // $ANTLR start "ruleMeasurementData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:655:1: ruleMeasurementData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= RULE_UNIT ) ) (otherlv_5= 'with' otherlv_6= 'identifier' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'adjusted' otherlv_9= 'by' otherlv_10= ':' ( (lv_adjustments_11_0= ruleDataAdjustement ) ) (otherlv_12= ',' ( (lv_adjustments_13_0= ruleDataAdjustement ) ) )* )? ( (lv_description_14_0= RULE_STRING ) )? otherlv_15= ';' ) ;
    public final EObject ruleMeasurementData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_unit_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_ID_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_description_14_0=null;
        Token otherlv_15=null;
        Enumerator lv_dataType_2_0 = null;

        EObject lv_adjustments_11_0 = null;

        EObject lv_adjustments_13_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:658:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= RULE_UNIT ) ) (otherlv_5= 'with' otherlv_6= 'identifier' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'adjusted' otherlv_9= 'by' otherlv_10= ':' ( (lv_adjustments_11_0= ruleDataAdjustement ) ) (otherlv_12= ',' ( (lv_adjustments_13_0= ruleDataAdjustement ) ) )* )? ( (lv_description_14_0= RULE_STRING ) )? otherlv_15= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:659:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= RULE_UNIT ) ) (otherlv_5= 'with' otherlv_6= 'identifier' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'adjusted' otherlv_9= 'by' otherlv_10= ':' ( (lv_adjustments_11_0= ruleDataAdjustement ) ) (otherlv_12= ',' ( (lv_adjustments_13_0= ruleDataAdjustement ) ) )* )? ( (lv_description_14_0= RULE_STRING ) )? otherlv_15= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:659:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= RULE_UNIT ) ) (otherlv_5= 'with' otherlv_6= 'identifier' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'adjusted' otherlv_9= 'by' otherlv_10= ':' ( (lv_adjustments_11_0= ruleDataAdjustement ) ) (otherlv_12= ',' ( (lv_adjustments_13_0= ruleDataAdjustement ) ) )* )? ( (lv_description_14_0= RULE_STRING ) )? otherlv_15= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:659:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= RULE_UNIT ) ) (otherlv_5= 'with' otherlv_6= 'identifier' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'adjusted' otherlv_9= 'by' otherlv_10= ':' ( (lv_adjustments_11_0= ruleDataAdjustement ) ) (otherlv_12= ',' ( (lv_adjustments_13_0= ruleDataAdjustement ) ) )* )? ( (lv_description_14_0= RULE_STRING ) )? otherlv_15= ';'
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:659:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:660:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:660:1: (lv_name_0_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:661:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeasurementData1348); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasurementDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleMeasurementData1365); 

                	newLeafNode(otherlv_1, grammarAccess.getMeasurementDataAccess().getAsKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:681:1: ( (lv_dataType_2_0= ruleDataType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:682:1: (lv_dataType_2_0= ruleDataType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:682:1: (lv_dataType_2_0= ruleDataType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:683:3: lv_dataType_2_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleMeasurementData1386);
            lv_dataType_2_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
            	        }
                   		set(
                   			current, 
                   			"dataType",
                    		lv_dataType_2_0, 
                    		"DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleMeasurementData1398); 

                	newLeafNode(otherlv_3, grammarAccess.getMeasurementDataAccess().getInKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:703:1: ( (lv_unit_4_0= RULE_UNIT ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:704:1: (lv_unit_4_0= RULE_UNIT )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:704:1: (lv_unit_4_0= RULE_UNIT )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:705:3: lv_unit_4_0= RULE_UNIT
            {
            lv_unit_4_0=(Token)match(input,RULE_UNIT,FOLLOW_RULE_UNIT_in_ruleMeasurementData1415); 

            			newLeafNode(lv_unit_4_0, grammarAccess.getMeasurementDataAccess().getUnitUNITTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasurementDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"unit",
                    		lv_unit_4_0, 
                    		"UNIT");
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:721:2: (otherlv_5= 'with' otherlv_6= 'identifier' ( (lv_ID_7_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:721:4: otherlv_5= 'with' otherlv_6= 'identifier' ( (lv_ID_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleMeasurementData1433); 

                        	newLeafNode(otherlv_5, grammarAccess.getMeasurementDataAccess().getWithKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleMeasurementData1445); 

                        	newLeafNode(otherlv_6, grammarAccess.getMeasurementDataAccess().getIdentifierKeyword_5_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:729:1: ( (lv_ID_7_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:730:1: (lv_ID_7_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:730:1: (lv_ID_7_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:731:3: lv_ID_7_0= RULE_STRING
                    {
                    lv_ID_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasurementData1462); 

                    			newLeafNode(lv_ID_7_0, grammarAccess.getMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:747:4: (otherlv_8= 'adjusted' otherlv_9= 'by' otherlv_10= ':' ( (lv_adjustments_11_0= ruleDataAdjustement ) ) (otherlv_12= ',' ( (lv_adjustments_13_0= ruleDataAdjustement ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:747:6: otherlv_8= 'adjusted' otherlv_9= 'by' otherlv_10= ':' ( (lv_adjustments_11_0= ruleDataAdjustement ) ) (otherlv_12= ',' ( (lv_adjustments_13_0= ruleDataAdjustement ) ) )*
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleMeasurementData1482); 

                        	newLeafNode(otherlv_8, grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleMeasurementData1494); 

                        	newLeafNode(otherlv_9, grammarAccess.getMeasurementDataAccess().getByKeyword_6_1());
                        
                    otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleMeasurementData1506); 

                        	newLeafNode(otherlv_10, grammarAccess.getMeasurementDataAccess().getColonKeyword_6_2());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:759:1: ( (lv_adjustments_11_0= ruleDataAdjustement ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:760:1: (lv_adjustments_11_0= ruleDataAdjustement )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:760:1: (lv_adjustments_11_0= ruleDataAdjustement )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:761:3: lv_adjustments_11_0= ruleDataAdjustement
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustementParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataAdjustement_in_ruleMeasurementData1527);
                    lv_adjustments_11_0=ruleDataAdjustement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
                    	        }
                           		add(
                           			current, 
                           			"adjustments",
                            		lv_adjustments_11_0, 
                            		"DataAdjustement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:777:2: (otherlv_12= ',' ( (lv_adjustments_13_0= ruleDataAdjustement ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==27) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:777:4: otherlv_12= ',' ( (lv_adjustments_13_0= ruleDataAdjustement ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_27_in_ruleMeasurementData1540); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_4_0());
                    	        
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:781:1: ( (lv_adjustments_13_0= ruleDataAdjustement ) )
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:782:1: (lv_adjustments_13_0= ruleDataAdjustement )
                    	    {
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:782:1: (lv_adjustments_13_0= ruleDataAdjustement )
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:783:3: lv_adjustments_13_0= ruleDataAdjustement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustementParserRuleCall_6_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDataAdjustement_in_ruleMeasurementData1561);
                    	    lv_adjustments_13_0=ruleDataAdjustement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"adjustments",
                    	            		lv_adjustments_13_0, 
                    	            		"DataAdjustement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:799:6: ( (lv_description_14_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:800:1: (lv_description_14_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:800:1: (lv_description_14_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:801:3: lv_description_14_0= RULE_STRING
                    {
                    lv_description_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasurementData1582); 

                    			newLeafNode(lv_description_14_0, grammarAccess.getMeasurementDataAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_14_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleMeasurementData1600); 

                	newLeafNode(otherlv_15, grammarAccess.getMeasurementDataAccess().getSemicolonKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasurementData"


    // $ANTLR start "entryRuleNonMeasurementData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:829:1: entryRuleNonMeasurementData returns [EObject current=null] : iv_ruleNonMeasurementData= ruleNonMeasurementData EOF ;
    public final EObject entryRuleNonMeasurementData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonMeasurementData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:830:2: (iv_ruleNonMeasurementData= ruleNonMeasurementData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:831:2: iv_ruleNonMeasurementData= ruleNonMeasurementData EOF
            {
             newCompositeNode(grammarAccess.getNonMeasurementDataRule()); 
            pushFollow(FOLLOW_ruleNonMeasurementData_in_entryRuleNonMeasurementData1636);
            iv_ruleNonMeasurementData=ruleNonMeasurementData();

            state._fsp--;

             current =iv_ruleNonMeasurementData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonMeasurementData1646); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonMeasurementData"


    // $ANTLR start "ruleNonMeasurementData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:838:1: ruleNonMeasurementData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'constant' otherlv_4= '=' ( (lv_constant_5_0= ruleBOOLEAN ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'identifier' ( (lv_ID_11_0= RULE_STRING ) ) )? ( (lv_description_12_0= RULE_STRING ) )? otherlv_13= ';' ) ;
    public final EObject ruleNonMeasurementData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_value_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_ID_11_0=null;
        Token lv_description_12_0=null;
        Token otherlv_13=null;
        Enumerator lv_dataType_2_0 = null;

        AntlrDatatypeRuleToken lv_constant_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:841:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'constant' otherlv_4= '=' ( (lv_constant_5_0= ruleBOOLEAN ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'identifier' ( (lv_ID_11_0= RULE_STRING ) ) )? ( (lv_description_12_0= RULE_STRING ) )? otherlv_13= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:842:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'constant' otherlv_4= '=' ( (lv_constant_5_0= ruleBOOLEAN ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'identifier' ( (lv_ID_11_0= RULE_STRING ) ) )? ( (lv_description_12_0= RULE_STRING ) )? otherlv_13= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:842:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'constant' otherlv_4= '=' ( (lv_constant_5_0= ruleBOOLEAN ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'identifier' ( (lv_ID_11_0= RULE_STRING ) ) )? ( (lv_description_12_0= RULE_STRING ) )? otherlv_13= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:842:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'constant' otherlv_4= '=' ( (lv_constant_5_0= ruleBOOLEAN ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'identifier' ( (lv_ID_11_0= RULE_STRING ) ) )? ( (lv_description_12_0= RULE_STRING ) )? otherlv_13= ';'
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:842:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:843:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:843:1: (lv_name_0_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:844:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonMeasurementData1688); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNonMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleNonMeasurementData1705); 

                	newLeafNode(otherlv_1, grammarAccess.getNonMeasurementDataAccess().getAsKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:864:1: ( (lv_dataType_2_0= ruleDataType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:865:1: (lv_dataType_2_0= ruleDataType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:865:1: (lv_dataType_2_0= ruleDataType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:866:3: lv_dataType_2_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleNonMeasurementData1726);
            lv_dataType_2_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNonMeasurementDataRule());
            	        }
                   		set(
                   			current, 
                   			"dataType",
                    		lv_dataType_2_0, 
                    		"DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleNonMeasurementData1738); 

                	newLeafNode(otherlv_3, grammarAccess.getNonMeasurementDataAccess().getConstantKeyword_3());
                
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleNonMeasurementData1750); 

                	newLeafNode(otherlv_4, grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:890:1: ( (lv_constant_5_0= ruleBOOLEAN ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:891:1: (lv_constant_5_0= ruleBOOLEAN )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:891:1: (lv_constant_5_0= ruleBOOLEAN )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:892:3: lv_constant_5_0= ruleBOOLEAN
            {
             
            	        newCompositeNode(grammarAccess.getNonMeasurementDataAccess().getConstantBOOLEANParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleNonMeasurementData1771);
            lv_constant_5_0=ruleBOOLEAN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNonMeasurementDataRule());
            	        }
                   		set(
                   			current, 
                   			"constant",
                    		lv_constant_5_0, 
                    		"BOOLEAN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleNonMeasurementData1783); 

                	newLeafNode(otherlv_6, grammarAccess.getNonMeasurementDataAccess().getValueKeyword_6());
                
            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleNonMeasurementData1795); 

                	newLeafNode(otherlv_7, grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_7());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:916:1: ( (lv_value_8_0= RULE_STRING ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:917:1: (lv_value_8_0= RULE_STRING )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:917:1: (lv_value_8_0= RULE_STRING )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:918:3: lv_value_8_0= RULE_STRING
            {
            lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasurementData1812); 

            			newLeafNode(lv_value_8_0, grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_8_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:934:2: (otherlv_9= 'with' otherlv_10= 'identifier' ( (lv_ID_11_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:934:4: otherlv_9= 'with' otherlv_10= 'identifier' ( (lv_ID_11_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleNonMeasurementData1830); 

                        	newLeafNode(otherlv_9, grammarAccess.getNonMeasurementDataAccess().getWithKeyword_9_0());
                        
                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleNonMeasurementData1842); 

                        	newLeafNode(otherlv_10, grammarAccess.getNonMeasurementDataAccess().getIdentifierKeyword_9_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:942:1: ( (lv_ID_11_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:943:1: (lv_ID_11_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:943:1: (lv_ID_11_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:944:3: lv_ID_11_0= RULE_STRING
                    {
                    lv_ID_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasurementData1859); 

                    			newLeafNode(lv_ID_11_0, grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_11_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:960:4: ( (lv_description_12_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:961:1: (lv_description_12_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:961:1: (lv_description_12_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:962:3: lv_description_12_0= RULE_STRING
                    {
                    lv_description_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasurementData1883); 

                    			newLeafNode(lv_description_12_0, grammarAccess.getNonMeasurementDataAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_12_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleNonMeasurementData1901); 

                	newLeafNode(otherlv_13, grammarAccess.getNonMeasurementDataAccess().getSemicolonKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonMeasurementData"


    // $ANTLR start "entryRuleDataAdjustement"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:990:1: entryRuleDataAdjustement returns [EObject current=null] : iv_ruleDataAdjustement= ruleDataAdjustement EOF ;
    public final EObject entryRuleDataAdjustement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAdjustement = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:991:2: (iv_ruleDataAdjustement= ruleDataAdjustement EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:992:2: iv_ruleDataAdjustement= ruleDataAdjustement EOF
            {
             newCompositeNode(grammarAccess.getDataAdjustementRule()); 
            pushFollow(FOLLOW_ruleDataAdjustement_in_entryRuleDataAdjustement1937);
            iv_ruleDataAdjustement=ruleDataAdjustement();

            state._fsp--;

             current =iv_ruleDataAdjustement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAdjustement1947); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataAdjustement"


    // $ANTLR start "ruleDataAdjustement"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:999:1: ruleDataAdjustement returns [EObject current=null] : (this_DataRange_0= ruleDataRange | this_DataConversion_1= ruleDataConversion ) ;
    public final EObject ruleDataAdjustement() throws RecognitionException {
        EObject current = null;

        EObject this_DataRange_0 = null;

        EObject this_DataConversion_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1002:28: ( (this_DataRange_0= ruleDataRange | this_DataConversion_1= ruleDataConversion ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1003:1: (this_DataRange_0= ruleDataRange | this_DataConversion_1= ruleDataConversion )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1003:1: (this_DataRange_0= ruleDataRange | this_DataConversion_1= ruleDataConversion )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==33) ) {
                    alt18=2;
                }
                else if ( (LA18_1==31) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==36) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1004:5: this_DataRange_0= ruleDataRange
                    {
                     
                            newCompositeNode(grammarAccess.getDataAdjustementAccess().getDataRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataRange_in_ruleDataAdjustement1994);
                    this_DataRange_0=ruleDataRange();

                    state._fsp--;

                     
                            current = this_DataRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1014:5: this_DataConversion_1= ruleDataConversion
                    {
                     
                            newCompositeNode(grammarAccess.getDataAdjustementAccess().getDataConversionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataConversion_in_ruleDataAdjustement2021);
                    this_DataConversion_1=ruleDataConversion();

                    state._fsp--;

                     
                            current = this_DataConversion_1; 
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
    // $ANTLR end "ruleDataAdjustement"


    // $ANTLR start "entryRuleDataRange"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1030:1: entryRuleDataRange returns [EObject current=null] : iv_ruleDataRange= ruleDataRange EOF ;
    public final EObject entryRuleDataRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataRange = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1031:2: (iv_ruleDataRange= ruleDataRange EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1032:2: iv_ruleDataRange= ruleDataRange EOF
            {
             newCompositeNode(grammarAccess.getDataRangeRule()); 
            pushFollow(FOLLOW_ruleDataRange_in_entryRuleDataRange2056);
            iv_ruleDataRange=ruleDataRange();

            state._fsp--;

             current =iv_ruleDataRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataRange2066); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataRange"


    // $ANTLR start "ruleDataRange"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1039:1: ruleDataRange returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= 'range' ( (lv_range_2_0= ruleInterval ) ) otherlv_3= ';' ) ;
    public final EObject ruleDataRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_range_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1042:28: ( (otherlv_0= 'with' otherlv_1= 'range' ( (lv_range_2_0= ruleInterval ) ) otherlv_3= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1043:1: (otherlv_0= 'with' otherlv_1= 'range' ( (lv_range_2_0= ruleInterval ) ) otherlv_3= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1043:1: (otherlv_0= 'with' otherlv_1= 'range' ( (lv_range_2_0= ruleInterval ) ) otherlv_3= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1043:3: otherlv_0= 'with' otherlv_1= 'range' ( (lv_range_2_0= ruleInterval ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleDataRange2103); 

                	newLeafNode(otherlv_0, grammarAccess.getDataRangeAccess().getWithKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleDataRange2115); 

                	newLeafNode(otherlv_1, grammarAccess.getDataRangeAccess().getRangeKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1051:1: ( (lv_range_2_0= ruleInterval ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1052:1: (lv_range_2_0= ruleInterval )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1052:1: (lv_range_2_0= ruleInterval )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1053:3: lv_range_2_0= ruleInterval
            {
             
            	        newCompositeNode(grammarAccess.getDataRangeAccess().getRangeIntervalParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInterval_in_ruleDataRange2136);
            lv_range_2_0=ruleInterval();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataRangeRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_2_0, 
                    		"Interval");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleDataRange2148); 

                	newLeafNode(otherlv_3, grammarAccess.getDataRangeAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataRange"


    // $ANTLR start "entryRuleInterval"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1081:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1082:2: (iv_ruleInterval= ruleInterval EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1083:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_ruleInterval_in_entryRuleInterval2184);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterval2194); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1090:1: ruleInterval returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleDOUBLE ) ) otherlv_1= '...' ( (lv_upperBound_2_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1093:28: ( ( ( (lv_lowerBound_0_0= ruleDOUBLE ) ) otherlv_1= '...' ( (lv_upperBound_2_0= ruleDOUBLE ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1094:1: ( ( (lv_lowerBound_0_0= ruleDOUBLE ) ) otherlv_1= '...' ( (lv_upperBound_2_0= ruleDOUBLE ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1094:1: ( ( (lv_lowerBound_0_0= ruleDOUBLE ) ) otherlv_1= '...' ( (lv_upperBound_2_0= ruleDOUBLE ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1094:2: ( (lv_lowerBound_0_0= ruleDOUBLE ) ) otherlv_1= '...' ( (lv_upperBound_2_0= ruleDOUBLE ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1094:2: ( (lv_lowerBound_0_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1095:1: (lv_lowerBound_0_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1095:1: (lv_lowerBound_0_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1096:3: lv_lowerBound_0_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleInterval2240);
            lv_lowerBound_0_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntervalRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_0_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleInterval2252); 

                	newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getFullStopFullStopFullStopKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1116:1: ( (lv_upperBound_2_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1117:1: (lv_upperBound_2_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1117:1: (lv_upperBound_2_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1118:3: lv_upperBound_2_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleInterval2273);
            lv_upperBound_2_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntervalRule());
            	        }
                   		set(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_2_0, 
                    		"DOUBLE");
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
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleDataConversion"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1142:1: entryRuleDataConversion returns [EObject current=null] : iv_ruleDataConversion= ruleDataConversion EOF ;
    public final EObject entryRuleDataConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataConversion = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1143:2: (iv_ruleDataConversion= ruleDataConversion EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1144:2: iv_ruleDataConversion= ruleDataConversion EOF
            {
             newCompositeNode(grammarAccess.getDataConversionRule()); 
            pushFollow(FOLLOW_ruleDataConversion_in_entryRuleDataConversion2309);
            iv_ruleDataConversion=ruleDataConversion();

            state._fsp--;

             current =iv_ruleDataConversion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataConversion2319); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataConversion"


    // $ANTLR start "ruleDataConversion"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1151:1: ruleDataConversion returns [EObject current=null] : this_LinearDataConversion_0= ruleLinearDataConversion ;
    public final EObject ruleDataConversion() throws RecognitionException {
        EObject current = null;

        EObject this_LinearDataConversion_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1154:28: (this_LinearDataConversion_0= ruleLinearDataConversion )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1156:5: this_LinearDataConversion_0= ruleLinearDataConversion
            {
             
                    newCompositeNode(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleLinearDataConversion_in_ruleDataConversion2365);
            this_LinearDataConversion_0=ruleLinearDataConversion();

            state._fsp--;

             
                    current = this_LinearDataConversion_0; 
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
    // $ANTLR end "ruleDataConversion"


    // $ANTLR start "entryRuleLinearDataConversion"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1172:1: entryRuleLinearDataConversion returns [EObject current=null] : iv_ruleLinearDataConversion= ruleLinearDataConversion EOF ;
    public final EObject entryRuleLinearDataConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearDataConversion = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1173:2: (iv_ruleLinearDataConversion= ruleLinearDataConversion EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1174:2: iv_ruleLinearDataConversion= ruleLinearDataConversion EOF
            {
             newCompositeNode(grammarAccess.getLinearDataConversionRule()); 
            pushFollow(FOLLOW_ruleLinearDataConversion_in_entryRuleLinearDataConversion2399);
            iv_ruleLinearDataConversion=ruleLinearDataConversion();

            state._fsp--;

             current =iv_ruleLinearDataConversion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinearDataConversion2409); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinearDataConversion"


    // $ANTLR start "ruleLinearDataConversion"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1181:1: ruleLinearDataConversion returns [EObject current=null] : ( (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) ) | (otherlv_8= 'linear mapping' otherlv_9= '[' ( (lv_fromInterval_10_0= ruleInterval ) ) otherlv_11= ']' otherlv_12= '=>' otherlv_13= '[' ( (lv_toInterval_14_0= ruleInterval ) ) otherlv_15= ']' ) ) ;
    public final EObject ruleLinearDataConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_scalingFactor_3_0 = null;

        AntlrDatatypeRuleToken lv_offset_7_0 = null;

        EObject lv_fromInterval_10_0 = null;

        EObject lv_toInterval_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1184:28: ( ( (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) ) | (otherlv_8= 'linear mapping' otherlv_9= '[' ( (lv_fromInterval_10_0= ruleInterval ) ) otherlv_11= ']' otherlv_12= '=>' otherlv_13= '[' ( (lv_toInterval_14_0= ruleInterval ) ) otherlv_15= ']' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1185:1: ( (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) ) | (otherlv_8= 'linear mapping' otherlv_9= '[' ( (lv_fromInterval_10_0= ruleInterval ) ) otherlv_11= ']' otherlv_12= '=>' otherlv_13= '[' ( (lv_toInterval_14_0= ruleInterval ) ) otherlv_15= ']' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1185:1: ( (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) ) | (otherlv_8= 'linear mapping' otherlv_9= '[' ( (lv_fromInterval_10_0= ruleInterval ) ) otherlv_11= ']' otherlv_12= '=>' otherlv_13= '[' ( (lv_toInterval_14_0= ruleInterval ) ) otherlv_15= ']' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            else if ( (LA19_0==36) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1185:2: (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1185:2: (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1185:4: otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleLinearDataConversion2447); 

                        	newLeafNode(otherlv_0, grammarAccess.getLinearDataConversionAccess().getWithKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleLinearDataConversion2459); 

                        	newLeafNode(otherlv_1, grammarAccess.getLinearDataConversionAccess().getScalingFactorKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleLinearDataConversion2471); 

                        	newLeafNode(otherlv_2, grammarAccess.getLinearDataConversionAccess().getColonKeyword_0_2());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1197:1: ( (lv_scalingFactor_3_0= ruleDOUBLE ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1198:1: (lv_scalingFactor_3_0= ruleDOUBLE )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1198:1: (lv_scalingFactor_3_0= ruleDOUBLE )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1199:3: lv_scalingFactor_3_0= ruleDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion2492);
                    lv_scalingFactor_3_0=ruleDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinearDataConversionRule());
                    	        }
                           		set(
                           			current, 
                           			"scalingFactor",
                            		lv_scalingFactor_3_0, 
                            		"DOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleLinearDataConversion2504); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinearDataConversionAccess().getAndKeyword_0_4());
                        
                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleLinearDataConversion2516); 

                        	newLeafNode(otherlv_5, grammarAccess.getLinearDataConversionAccess().getOffsetKeyword_0_5());
                        
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleLinearDataConversion2528); 

                        	newLeafNode(otherlv_6, grammarAccess.getLinearDataConversionAccess().getColonKeyword_0_6());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1227:1: ( (lv_offset_7_0= ruleDOUBLE ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1228:1: (lv_offset_7_0= ruleDOUBLE )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1228:1: (lv_offset_7_0= ruleDOUBLE )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1229:3: lv_offset_7_0= ruleDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinearDataConversionAccess().getOffsetDOUBLEParserRuleCall_0_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion2549);
                    lv_offset_7_0=ruleDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinearDataConversionRule());
                    	        }
                           		set(
                           			current, 
                           			"offset",
                            		lv_offset_7_0, 
                            		"DOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1246:6: (otherlv_8= 'linear mapping' otherlv_9= '[' ( (lv_fromInterval_10_0= ruleInterval ) ) otherlv_11= ']' otherlv_12= '=>' otherlv_13= '[' ( (lv_toInterval_14_0= ruleInterval ) ) otherlv_15= ']' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1246:6: (otherlv_8= 'linear mapping' otherlv_9= '[' ( (lv_fromInterval_10_0= ruleInterval ) ) otherlv_11= ']' otherlv_12= '=>' otherlv_13= '[' ( (lv_toInterval_14_0= ruleInterval ) ) otherlv_15= ']' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1246:8: otherlv_8= 'linear mapping' otherlv_9= '[' ( (lv_fromInterval_10_0= ruleInterval ) ) otherlv_11= ']' otherlv_12= '=>' otherlv_13= '[' ( (lv_toInterval_14_0= ruleInterval ) ) otherlv_15= ']'
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleLinearDataConversion2569); 

                        	newLeafNode(otherlv_8, grammarAccess.getLinearDataConversionAccess().getLinearMappingKeyword_1_0());
                        
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleLinearDataConversion2581); 

                        	newLeafNode(otherlv_9, grammarAccess.getLinearDataConversionAccess().getLeftSquareBracketKeyword_1_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1254:1: ( (lv_fromInterval_10_0= ruleInterval ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1255:1: (lv_fromInterval_10_0= ruleInterval )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1255:1: (lv_fromInterval_10_0= ruleInterval )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1256:3: lv_fromInterval_10_0= ruleInterval
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinearDataConversionAccess().getFromIntervalIntervalParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterval_in_ruleLinearDataConversion2602);
                    lv_fromInterval_10_0=ruleInterval();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinearDataConversionRule());
                    	        }
                           		set(
                           			current, 
                           			"fromInterval",
                            		lv_fromInterval_10_0, 
                            		"Interval");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,38,FOLLOW_38_in_ruleLinearDataConversion2614); 

                        	newLeafNode(otherlv_11, grammarAccess.getLinearDataConversionAccess().getRightSquareBracketKeyword_1_3());
                        
                    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleLinearDataConversion2626); 

                        	newLeafNode(otherlv_12, grammarAccess.getLinearDataConversionAccess().getEqualsSignGreaterThanSignKeyword_1_4());
                        
                    otherlv_13=(Token)match(input,37,FOLLOW_37_in_ruleLinearDataConversion2638); 

                        	newLeafNode(otherlv_13, grammarAccess.getLinearDataConversionAccess().getLeftSquareBracketKeyword_1_5());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1284:1: ( (lv_toInterval_14_0= ruleInterval ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1285:1: (lv_toInterval_14_0= ruleInterval )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1285:1: (lv_toInterval_14_0= ruleInterval )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1286:3: lv_toInterval_14_0= ruleInterval
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinearDataConversionAccess().getToIntervalIntervalParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterval_in_ruleLinearDataConversion2659);
                    lv_toInterval_14_0=ruleInterval();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinearDataConversionRule());
                    	        }
                           		set(
                           			current, 
                           			"toInterval",
                            		lv_toInterval_14_0, 
                            		"Interval");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,38,FOLLOW_38_in_ruleLinearDataConversion2671); 

                        	newLeafNode(otherlv_15, grammarAccess.getLinearDataConversionAccess().getRightSquareBracketKeyword_1_7());
                        

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
    // $ANTLR end "ruleLinearDataConversion"


    // $ANTLR start "entryRuleDOUBLE"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1314:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1315:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1316:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE2709);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE2720); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1323:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1326:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1327:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1327:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1327:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE2760); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1334:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1335:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleDOUBLE2779); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE2794); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 
                        

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleBOOLEAN"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1355:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1356:2: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1357:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN2842);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN2853); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1364:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1367:28: ( (kw= 'true' | kw= 'false' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1368:1: (kw= 'true' | kw= 'false' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1368:1: (kw= 'true' | kw= 'false' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            else if ( (LA21_0==42) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1369:2: kw= 'true'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleBOOLEAN2891); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1376:2: kw= 'false'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleBOOLEAN2910); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "ruleAlignment"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1389:1: ruleAlignment returns [Enumerator current=null] : ( (enumLiteral_0= '_8BIT' ) | (enumLiteral_1= '_16BIT' ) | (enumLiteral_2= '_32BIT' ) | (enumLiteral_3= '_64BIT' ) ) ;
    public final Enumerator ruleAlignment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1391:28: ( ( (enumLiteral_0= '_8BIT' ) | (enumLiteral_1= '_16BIT' ) | (enumLiteral_2= '_32BIT' ) | (enumLiteral_3= '_64BIT' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1392:1: ( (enumLiteral_0= '_8BIT' ) | (enumLiteral_1= '_16BIT' ) | (enumLiteral_2= '_32BIT' ) | (enumLiteral_3= '_64BIT' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1392:1: ( (enumLiteral_0= '_8BIT' ) | (enumLiteral_1= '_16BIT' ) | (enumLiteral_2= '_32BIT' ) | (enumLiteral_3= '_64BIT' ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt22=1;
                }
                break;
            case 44:
                {
                alt22=2;
                }
                break;
            case 45:
                {
                alt22=3;
                }
                break;
            case 46:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1392:2: (enumLiteral_0= '_8BIT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1392:2: (enumLiteral_0= '_8BIT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1392:4: enumLiteral_0= '_8BIT'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleAlignment2964); 

                            current = grammarAccess.getAlignmentAccess().get_8BITEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAlignmentAccess().get_8BITEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1398:6: (enumLiteral_1= '_16BIT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1398:6: (enumLiteral_1= '_16BIT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1398:8: enumLiteral_1= '_16BIT'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleAlignment2981); 

                            current = grammarAccess.getAlignmentAccess().get_16BITEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAlignmentAccess().get_16BITEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1404:6: (enumLiteral_2= '_32BIT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1404:6: (enumLiteral_2= '_32BIT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1404:8: enumLiteral_2= '_32BIT'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleAlignment2998); 

                            current = grammarAccess.getAlignmentAccess().get_32BITEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAlignmentAccess().get_32BITEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1410:6: (enumLiteral_3= '_64BIT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1410:6: (enumLiteral_3= '_64BIT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1410:8: enumLiteral_3= '_64BIT'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_46_in_ruleAlignment3015); 

                            current = grammarAccess.getAlignmentAccess().get_64BITEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAlignmentAccess().get_64BITEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleAlignment"


    // $ANTLR start "ruleCoding"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1420:1: ruleCoding returns [Enumerator current=null] : ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) ) ;
    public final Enumerator ruleCoding() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1422:28: ( ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1423:1: ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1423:1: ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            else if ( (LA23_0==48) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1423:2: (enumLiteral_0= 'SENSIDL_BINARY' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1423:2: (enumLiteral_0= 'SENSIDL_BINARY' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1423:4: enumLiteral_0= 'SENSIDL_BINARY'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleCoding3060); 

                            current = grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1429:6: (enumLiteral_1= 'SENSIDL_JSON' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1429:6: (enumLiteral_1= 'SENSIDL_JSON' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1429:8: enumLiteral_1= 'SENSIDL_JSON'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleCoding3077); 

                            current = grammarAccess.getCodingAccess().getSENSIDL_JSONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCodingAccess().getSENSIDL_JSONEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleCoding"


    // $ANTLR start "ruleEndianness"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1439:1: ruleEndianness returns [Enumerator current=null] : ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) ;
    public final Enumerator ruleEndianness() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1441:28: ( ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1442:1: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1442:1: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            else if ( (LA24_0==50) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1442:2: (enumLiteral_0= 'BIG_ENDIAN' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1442:2: (enumLiteral_0= 'BIG_ENDIAN' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1442:4: enumLiteral_0= 'BIG_ENDIAN'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleEndianness3122); 

                            current = grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1448:6: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1448:6: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1448:8: enumLiteral_1= 'LITTLE_ENDIAN'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_50_in_ruleEndianness3139); 

                            current = grammarAccess.getEndiannessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEndiannessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleEndianness"


    // $ANTLR start "ruleDataType"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1458:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'SIGNED_CHAR' ) | (enumLiteral_1= 'UNSIGNED_CHAR' ) | (enumLiteral_2= 'SIGNED_SHORT' ) | (enumLiteral_3= 'UNSIGNED_SHORT' ) | (enumLiteral_4= 'SIGNED_LONG' ) | (enumLiteral_5= 'UNSIGNED_LONG' ) | (enumLiteral_6= 'SIGNED_LONG_LONG' ) | (enumLiteral_7= 'UNSIGNED_LONG_LONG' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) | (enumLiteral_10= 'LONG_DOUBLE' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1460:28: ( ( (enumLiteral_0= 'SIGNED_CHAR' ) | (enumLiteral_1= 'UNSIGNED_CHAR' ) | (enumLiteral_2= 'SIGNED_SHORT' ) | (enumLiteral_3= 'UNSIGNED_SHORT' ) | (enumLiteral_4= 'SIGNED_LONG' ) | (enumLiteral_5= 'UNSIGNED_LONG' ) | (enumLiteral_6= 'SIGNED_LONG_LONG' ) | (enumLiteral_7= 'UNSIGNED_LONG_LONG' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) | (enumLiteral_10= 'LONG_DOUBLE' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1461:1: ( (enumLiteral_0= 'SIGNED_CHAR' ) | (enumLiteral_1= 'UNSIGNED_CHAR' ) | (enumLiteral_2= 'SIGNED_SHORT' ) | (enumLiteral_3= 'UNSIGNED_SHORT' ) | (enumLiteral_4= 'SIGNED_LONG' ) | (enumLiteral_5= 'UNSIGNED_LONG' ) | (enumLiteral_6= 'SIGNED_LONG_LONG' ) | (enumLiteral_7= 'UNSIGNED_LONG_LONG' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) | (enumLiteral_10= 'LONG_DOUBLE' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1461:1: ( (enumLiteral_0= 'SIGNED_CHAR' ) | (enumLiteral_1= 'UNSIGNED_CHAR' ) | (enumLiteral_2= 'SIGNED_SHORT' ) | (enumLiteral_3= 'UNSIGNED_SHORT' ) | (enumLiteral_4= 'SIGNED_LONG' ) | (enumLiteral_5= 'UNSIGNED_LONG' ) | (enumLiteral_6= 'SIGNED_LONG_LONG' ) | (enumLiteral_7= 'UNSIGNED_LONG_LONG' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) | (enumLiteral_10= 'LONG_DOUBLE' ) )
            int alt25=11;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt25=1;
                }
                break;
            case 52:
                {
                alt25=2;
                }
                break;
            case 53:
                {
                alt25=3;
                }
                break;
            case 54:
                {
                alt25=4;
                }
                break;
            case 55:
                {
                alt25=5;
                }
                break;
            case 56:
                {
                alt25=6;
                }
                break;
            case 57:
                {
                alt25=7;
                }
                break;
            case 58:
                {
                alt25=8;
                }
                break;
            case 59:
                {
                alt25=9;
                }
                break;
            case 60:
                {
                alt25=10;
                }
                break;
            case 61:
                {
                alt25=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1461:2: (enumLiteral_0= 'SIGNED_CHAR' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1461:2: (enumLiteral_0= 'SIGNED_CHAR' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1461:4: enumLiteral_0= 'SIGNED_CHAR'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleDataType3184); 

                            current = grammarAccess.getDataTypeAccess().getSIGNED_CHAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getSIGNED_CHAREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1467:6: (enumLiteral_1= 'UNSIGNED_CHAR' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1467:6: (enumLiteral_1= 'UNSIGNED_CHAR' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1467:8: enumLiteral_1= 'UNSIGNED_CHAR'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleDataType3201); 

                            current = grammarAccess.getDataTypeAccess().getUNSIGNED_CHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getUNSIGNED_CHAREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1473:6: (enumLiteral_2= 'SIGNED_SHORT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1473:6: (enumLiteral_2= 'SIGNED_SHORT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1473:8: enumLiteral_2= 'SIGNED_SHORT'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_53_in_ruleDataType3218); 

                            current = grammarAccess.getDataTypeAccess().getSIGNED_SHORTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getSIGNED_SHORTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1479:6: (enumLiteral_3= 'UNSIGNED_SHORT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1479:6: (enumLiteral_3= 'UNSIGNED_SHORT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1479:8: enumLiteral_3= 'UNSIGNED_SHORT'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_54_in_ruleDataType3235); 

                            current = grammarAccess.getDataTypeAccess().getUNSIGNED_SHORTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getUNSIGNED_SHORTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1485:6: (enumLiteral_4= 'SIGNED_LONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1485:6: (enumLiteral_4= 'SIGNED_LONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1485:8: enumLiteral_4= 'SIGNED_LONG'
                    {
                    enumLiteral_4=(Token)match(input,55,FOLLOW_55_in_ruleDataType3252); 

                            current = grammarAccess.getDataTypeAccess().getSIGNED_LONGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getSIGNED_LONGEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1491:6: (enumLiteral_5= 'UNSIGNED_LONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1491:6: (enumLiteral_5= 'UNSIGNED_LONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1491:8: enumLiteral_5= 'UNSIGNED_LONG'
                    {
                    enumLiteral_5=(Token)match(input,56,FOLLOW_56_in_ruleDataType3269); 

                            current = grammarAccess.getDataTypeAccess().getUNSIGNED_LONGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getUNSIGNED_LONGEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1497:6: (enumLiteral_6= 'SIGNED_LONG_LONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1497:6: (enumLiteral_6= 'SIGNED_LONG_LONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1497:8: enumLiteral_6= 'SIGNED_LONG_LONG'
                    {
                    enumLiteral_6=(Token)match(input,57,FOLLOW_57_in_ruleDataType3286); 

                            current = grammarAccess.getDataTypeAccess().getSIGNED_LONG_LONGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getSIGNED_LONG_LONGEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1503:6: (enumLiteral_7= 'UNSIGNED_LONG_LONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1503:6: (enumLiteral_7= 'UNSIGNED_LONG_LONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1503:8: enumLiteral_7= 'UNSIGNED_LONG_LONG'
                    {
                    enumLiteral_7=(Token)match(input,58,FOLLOW_58_in_ruleDataType3303); 

                            current = grammarAccess.getDataTypeAccess().getUNSIGNED_LONG_LONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getUNSIGNED_LONG_LONGEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1509:6: (enumLiteral_8= 'FLOAT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1509:6: (enumLiteral_8= 'FLOAT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1509:8: enumLiteral_8= 'FLOAT'
                    {
                    enumLiteral_8=(Token)match(input,59,FOLLOW_59_in_ruleDataType3320); 

                            current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1515:6: (enumLiteral_9= 'DOUBLE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1515:6: (enumLiteral_9= 'DOUBLE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1515:8: enumLiteral_9= 'DOUBLE'
                    {
                    enumLiteral_9=(Token)match(input,60,FOLLOW_60_in_ruleDataType3337); 

                            current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1521:6: (enumLiteral_10= 'LONG_DOUBLE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1521:6: (enumLiteral_10= 'LONG_DOUBLE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1521:8: enumLiteral_10= 'LONG_DOUBLE'
                    {
                    enumLiteral_10=(Token)match(input,61,FOLLOW_61_in_ruleDataType3354); 

                            current = grammarAccess.getDataTypeAccess().getLONG_DOUBLEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getDataTypeAccess().getLONG_DOUBLEEnumLiteralDeclaration_10()); 
                        

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
    // $ANTLR end "ruleDataType"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\20\uffff";
    static final String DFA11_eofS =
        "\20\uffff";
    static final String DFA11_minS =
        "\1\4\1\26\1\63\13\27\2\uffff";
    static final String DFA11_maxS =
        "\1\4\1\26\1\75\13\34\2\uffff";
    static final String DFA11_acceptS =
        "\16\uffff\1\2\1\1";
    static final String DFA11_specialS =
        "\20\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "619:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData )";
        }
    }
 

    public static final BitSet FOLLOW_ruleNamedElement_in_entryRuleNamedElement75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedElement85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorInterface_in_ruleNamedElement132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorDataDescription_in_ruleNamedElement159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSet_in_ruleNamedElement186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_ruleNamedElement213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorInterface_in_entryRuleSensorInterface248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorInterface258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSensorInterface295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensorInterface312 = new BitSet(new long[]{0x000000000000A020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSensorInterface334 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleSensorInterface353 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSensorInterface365 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSensorInterface382 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSensorInterface401 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleSensorMetaInformation_in_ruleSensorInterface422 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleSensorDataDescription_in_ruleSensorInterface443 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSensorInterface455 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSensorInterface467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorMetaInformation_in_entryRuleSensorMetaInformation503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorMetaInformation513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSensorMetaInformation550 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleCoding_in_ruleSensorMetaInformation571 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSensorMetaInformation583 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_ruleEndianness_in_ruleSensorMetaInformation604 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSensorMetaInformation616 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_ruleAlignment_in_ruleSensorMetaInformation637 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSensorMetaInformation649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorDataDescription_in_entryRuleSensorDataDescription685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorDataDescription695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSensorDataDescription732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensorDataDescription749 = new BitSet(new long[]{0x000000000000A020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSensorDataDescription771 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleSensorDataDescription790 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSensorDataDescription802 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSensorDataDescription819 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSensorDataDescription838 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_ruleDataSet_in_ruleSensorDataDescription859 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16_in_ruleSensorDataDescription872 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSensorDataDescription884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSet_in_entryRuleDataSet920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSet930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDataSet967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSet984 = new BitSet(new long[]{0x000000000000A020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataSet1006 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleDataSet1025 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataSet1037 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataSet1054 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataSet1073 = new BitSet(new long[]{0x0000000000210010L});
    public static final BitSet FOLLOW_ruleDataSet_in_ruleDataSet1094 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleData_in_ruleDataSet1116 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleDataSet1129 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDataSet1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData1177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementData_in_ruleData1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasurementData_in_ruleData1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementData_in_entryRuleMeasurementData1296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementData1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeasurementData1348 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMeasurementData1365 = new BitSet(new long[]{0x3FF8000000000000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleMeasurementData1386 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMeasurementData1398 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_UNIT_in_ruleMeasurementData1415 = new BitSet(new long[]{0x0000000001022020L});
    public static final BitSet FOLLOW_13_in_ruleMeasurementData1433 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMeasurementData1445 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasurementData1462 = new BitSet(new long[]{0x0000000001020020L});
    public static final BitSet FOLLOW_24_in_ruleMeasurementData1482 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMeasurementData1494 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMeasurementData1506 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_ruleDataAdjustement_in_ruleMeasurementData1527 = new BitSet(new long[]{0x0000000008020020L});
    public static final BitSet FOLLOW_27_in_ruleMeasurementData1540 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_ruleDataAdjustement_in_ruleMeasurementData1561 = new BitSet(new long[]{0x0000000008020020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasurementData1582 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMeasurementData1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasurementData_in_entryRuleNonMeasurementData1636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonMeasurementData1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonMeasurementData1688 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleNonMeasurementData1705 = new BitSet(new long[]{0x3FF8000000000000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleNonMeasurementData1726 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNonMeasurementData1738 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleNonMeasurementData1750 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleNonMeasurementData1771 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleNonMeasurementData1783 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleNonMeasurementData1795 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasurementData1812 = new BitSet(new long[]{0x0000000000022020L});
    public static final BitSet FOLLOW_13_in_ruleNonMeasurementData1830 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNonMeasurementData1842 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasurementData1859 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasurementData1883 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNonMeasurementData1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdjustement_in_entryRuleDataAdjustement1937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAdjustement1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_ruleDataAdjustement1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConversion_in_ruleDataAdjustement2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_entryRuleDataRange2056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataRange2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDataRange2103 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDataRange2115 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleDataRange2136 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDataRange2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_entryRuleInterval2184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterval2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleInterval2240 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInterval2252 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleInterval2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConversion_in_entryRuleDataConversion2309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataConversion2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversion_in_ruleDataConversion2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversion_in_entryRuleLinearDataConversion2399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinearDataConversion2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleLinearDataConversion2447 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleLinearDataConversion2459 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLinearDataConversion2471 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion2492 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleLinearDataConversion2504 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleLinearDataConversion2516 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLinearDataConversion2528 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleLinearDataConversion2569 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLinearDataConversion2581 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleLinearDataConversion2602 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleLinearDataConversion2614 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleLinearDataConversion2626 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLinearDataConversion2638 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleLinearDataConversion2659 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleLinearDataConversion2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE2709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE2760 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleDOUBLE2779 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN2842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBOOLEAN2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBOOLEAN2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAlignment2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAlignment2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAlignment2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAlignment3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleCoding3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCoding3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEndianness3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleEndianness3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDataType3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDataType3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDataType3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleDataType3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDataType3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDataType3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleDataType3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleDataType3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleDataType3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDataType3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDataType3354 = new BitSet(new long[]{0x0000000000000002L});

}