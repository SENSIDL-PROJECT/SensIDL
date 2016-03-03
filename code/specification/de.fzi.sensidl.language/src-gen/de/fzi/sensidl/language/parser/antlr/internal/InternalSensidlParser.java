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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DESCRIPTION", "RULE_STRING", "RULE_INT", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'sensorInterface'", "'with identifier'", "':'", "'{'", "'}'", "'encoding'", "','", "'endianness'", "'alignment'", "'BIT'", "'sensorData'", "'dataSet'", "'uses'", "'as'", "'in'", "'adjusted'", "'constant'", "'value'", "'='", "'with range'", "'['", "';'", "']'", "'with scaling factor'", "'and offset'", "'by linear mapping'", "'=>'", "'.'", "'SENSIDL_BINARY'", "'SENSIDL_JSON'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'INT8'", "'UINT8'", "'INT16'", "'UINT16'", "'INT32'", "'UINT32'", "'INT64'", "'UINT64'", "'FLOAT'", "'DOUBLE'", "'BOOLEAN'", "'STRING'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int RULE_DESCRIPTION=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=8;
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
        	return "SensorInterface";	
       	}
       	
       	@Override
       	protected SensidlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSensorInterface"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:68:1: entryRuleSensorInterface returns [EObject current=null] : iv_ruleSensorInterface= ruleSensorInterface EOF ;
    public final EObject entryRuleSensorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorInterface = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:69:2: (iv_ruleSensorInterface= ruleSensorInterface EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:70:2: iv_ruleSensorInterface= ruleSensorInterface EOF
            {
             newCompositeNode(grammarAccess.getSensorInterfaceRule()); 
            pushFollow(FOLLOW_ruleSensorInterface_in_entryRuleSensorInterface75);
            iv_ruleSensorInterface=ruleSensorInterface();

            state._fsp--;

             current =iv_ruleSensorInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorInterface85); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:77:1: ruleSensorInterface returns [EObject current=null] : (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' ) ;
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
        EObject lv_encodingSettings_7_0 = null;

        EObject lv_dataDescription_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:80:28: ( (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:81:1: (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:81:1: (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:81:3: otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleSensorInterface122); 

                	newLeafNode(otherlv_0, grammarAccess.getSensorInterfaceAccess().getSensorInterfaceKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:86:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensorInterface139); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:103:2: ( (lv_description_2_0= RULE_DESCRIPTION ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DESCRIPTION) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:104:1: (lv_description_2_0= RULE_DESCRIPTION )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:104:1: (lv_description_2_0= RULE_DESCRIPTION )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:105:3: lv_description_2_0= RULE_DESCRIPTION
                    {
                    lv_description_2_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_ruleSensorInterface161); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getSensorInterfaceAccess().getDescriptionDESCRIPTIONTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
                            		"DESCRIPTION");
                    	    

                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:121:3: (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:121:5: otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSensorInterface180); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorInterfaceAccess().getWithIdentifierKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleSensorInterface192); 

                        	newLeafNode(otherlv_4, grammarAccess.getSensorInterfaceAccess().getColonKeyword_3_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:129:1: ( (lv_ID_5_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:130:1: (lv_ID_5_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:130:1: (lv_ID_5_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:131:3: lv_ID_5_0= RULE_STRING
                    {
                    lv_ID_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSensorInterface209); 

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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSensorInterface228); 

                	newLeafNode(otherlv_6, grammarAccess.getSensorInterfaceAccess().getLeftCurlyBracketKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:151:1: ( (lv_encodingSettings_7_0= ruleEncodingSettings ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:152:1: (lv_encodingSettings_7_0= ruleEncodingSettings )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:152:1: (lv_encodingSettings_7_0= ruleEncodingSettings )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:153:3: lv_encodingSettings_7_0= ruleEncodingSettings
            {
             
            	        newCompositeNode(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsEncodingSettingsParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEncodingSettings_in_ruleSensorInterface249);
            lv_encodingSettings_7_0=ruleEncodingSettings();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensorInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"encodingSettings",
                    		lv_encodingSettings_7_0, 
                    		"EncodingSettings");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:169:2: ( (lv_dataDescription_8_0= ruleSensorDataDescription ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:170:1: (lv_dataDescription_8_0= ruleSensorDataDescription )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:170:1: (lv_dataDescription_8_0= ruleSensorDataDescription )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:171:3: lv_dataDescription_8_0= ruleSensorDataDescription
            {
             
            	        newCompositeNode(grammarAccess.getSensorInterfaceAccess().getDataDescriptionSensorDataDescriptionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSensorDataDescription_in_ruleSensorInterface270);
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

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleSensorInterface282); 

                	newLeafNode(otherlv_9, grammarAccess.getSensorInterfaceAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleEncodingSettings"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:199:1: entryRuleEncodingSettings returns [EObject current=null] : iv_ruleEncodingSettings= ruleEncodingSettings EOF ;
    public final EObject entryRuleEncodingSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncodingSettings = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:200:2: (iv_ruleEncodingSettings= ruleEncodingSettings EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:201:2: iv_ruleEncodingSettings= ruleEncodingSettings EOF
            {
             newCompositeNode(grammarAccess.getEncodingSettingsRule()); 
            pushFollow(FOLLOW_ruleEncodingSettings_in_entryRuleEncodingSettings318);
            iv_ruleEncodingSettings=ruleEncodingSettings();

            state._fsp--;

             current =iv_ruleEncodingSettings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncodingSettings328); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEncodingSettings"


    // $ANTLR start "ruleEncodingSettings"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:208:1: ruleEncodingSettings returns [EObject current=null] : (otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEncodingSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_alignment_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_ID_14_0=null;
        Enumerator lv_coding_2_0 = null;

        Enumerator lv_endianness_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:211:28: ( (otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:212:1: (otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:212:1: (otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:212:3: otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEncodingSettings365); 

                	newLeafNode(otherlv_0, grammarAccess.getEncodingSettingsAccess().getEncodingKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleEncodingSettings377); 

                	newLeafNode(otherlv_1, grammarAccess.getEncodingSettingsAccess().getColonKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:220:1: ( (lv_coding_2_0= ruleCoding ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:1: (lv_coding_2_0= ruleCoding )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:1: (lv_coding_2_0= ruleCoding )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:222:3: lv_coding_2_0= ruleCoding
            {
             
            	        newCompositeNode(grammarAccess.getEncodingSettingsAccess().getCodingCodingEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCoding_in_ruleEncodingSettings398);
            lv_coding_2_0=ruleCoding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEncodingSettingsRule());
            	        }
                   		set(
                   			current, 
                   			"coding",
                    		lv_coding_2_0, 
                    		"Coding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleEncodingSettings410); 

                	newLeafNode(otherlv_3, grammarAccess.getEncodingSettingsAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleEncodingSettings422); 

                	newLeafNode(otherlv_4, grammarAccess.getEncodingSettingsAccess().getEndiannessKeyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEncodingSettings434); 

                	newLeafNode(otherlv_5, grammarAccess.getEncodingSettingsAccess().getColonKeyword_5());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:250:1: ( (lv_endianness_6_0= ruleEndianness ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:251:1: (lv_endianness_6_0= ruleEndianness )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:251:1: (lv_endianness_6_0= ruleEndianness )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:252:3: lv_endianness_6_0= ruleEndianness
            {
             
            	        newCompositeNode(grammarAccess.getEncodingSettingsAccess().getEndiannessEndiannessEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEndianness_in_ruleEncodingSettings455);
            lv_endianness_6_0=ruleEndianness();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEncodingSettingsRule());
            	        }
                   		set(
                   			current, 
                   			"endianness",
                    		lv_endianness_6_0, 
                    		"Endianness");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleEncodingSettings467); 

                	newLeafNode(otherlv_7, grammarAccess.getEncodingSettingsAccess().getCommaKeyword_7());
                
            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleEncodingSettings479); 

                	newLeafNode(otherlv_8, grammarAccess.getEncodingSettingsAccess().getAlignmentKeyword_8());
                
            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEncodingSettings491); 

                	newLeafNode(otherlv_9, grammarAccess.getEncodingSettingsAccess().getColonKeyword_9());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:280:1: ( (lv_alignment_10_0= RULE_INT ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:281:1: (lv_alignment_10_0= RULE_INT )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:281:1: (lv_alignment_10_0= RULE_INT )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:282:3: lv_alignment_10_0= RULE_INT
            {
            lv_alignment_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEncodingSettings508); 

            			newLeafNode(lv_alignment_10_0, grammarAccess.getEncodingSettingsAccess().getAlignmentINTTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEncodingSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"alignment",
                    		lv_alignment_10_0, 
                    		"INT");
            	    

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleEncodingSettings525); 

                	newLeafNode(otherlv_11, grammarAccess.getEncodingSettingsAccess().getBITKeyword_11());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:302:1: (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:302:3: otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleEncodingSettings538); 

                        	newLeafNode(otherlv_12, grammarAccess.getEncodingSettingsAccess().getWithIdentifierKeyword_12_0());
                        
                    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleEncodingSettings550); 

                        	newLeafNode(otherlv_13, grammarAccess.getEncodingSettingsAccess().getColonKeyword_12_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:310:1: ( (lv_ID_14_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:311:1: (lv_ID_14_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:311:1: (lv_ID_14_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:312:3: lv_ID_14_0= RULE_STRING
                    {
                    lv_ID_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEncodingSettings567); 

                    			newLeafNode(lv_ID_14_0, grammarAccess.getEncodingSettingsAccess().getIDSTRINGTerminalRuleCall_12_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEncodingSettingsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_14_0, 
                            		"STRING");
                    	    

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
    // $ANTLR end "ruleEncodingSettings"


    // $ANTLR start "entryRuleSensorDataDescription"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:336:1: entryRuleSensorDataDescription returns [EObject current=null] : iv_ruleSensorDataDescription= ruleSensorDataDescription EOF ;
    public final EObject entryRuleSensorDataDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorDataDescription = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:337:2: (iv_ruleSensorDataDescription= ruleSensorDataDescription EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:338:2: iv_ruleSensorDataDescription= ruleSensorDataDescription EOF
            {
             newCompositeNode(grammarAccess.getSensorDataDescriptionRule()); 
            pushFollow(FOLLOW_ruleSensorDataDescription_in_entryRuleSensorDataDescription610);
            iv_ruleSensorDataDescription=ruleSensorDataDescription();

            state._fsp--;

             current =iv_ruleSensorDataDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorDataDescription620); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:345:1: ruleSensorDataDescription returns [EObject current=null] : (otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}' ) ;
    public final EObject ruleSensorDataDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_ID_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_dataSets_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:348:28: ( (otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:349:1: (otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:349:1: (otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:349:3: otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleSensorDataDescription657); 

                	newLeafNode(otherlv_0, grammarAccess.getSensorDataDescriptionAccess().getSensorDataKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:353:1: ()
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:354:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1(),
                        current);
                

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:359:2: (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:359:4: otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSensorDataDescription679); 

                        	newLeafNode(otherlv_2, grammarAccess.getSensorDataDescriptionAccess().getWithIdentifierKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleSensorDataDescription691); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorDataDescriptionAccess().getColonKeyword_2_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:367:1: ( (lv_ID_4_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:368:1: (lv_ID_4_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:368:1: (lv_ID_4_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:369:3: lv_ID_4_0= RULE_STRING
                    {
                    lv_ID_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSensorDataDescription708); 

                    			newLeafNode(lv_ID_4_0, grammarAccess.getSensorDataDescriptionAccess().getIDSTRINGTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorDataDescriptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleSensorDataDescription727); 

                	newLeafNode(otherlv_5, grammarAccess.getSensorDataDescriptionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:389:1: ( (lv_dataSets_6_0= ruleDataSet ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:390:1: (lv_dataSets_6_0= ruleDataSet )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:390:1: (lv_dataSets_6_0= ruleDataSet )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:391:3: lv_dataSets_6_0= ruleDataSet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSensorDataDescriptionAccess().getDataSetsDataSetParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataSet_in_ruleSensorDataDescription748);
            	    lv_dataSets_6_0=ruleDataSet();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSensorDataDescriptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dataSets",
            	            		lv_dataSets_6_0, 
            	            		"DataSet");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleSensorDataDescription761); 

                	newLeafNode(otherlv_7, grammarAccess.getSensorDataDescriptionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:419:1: entryRuleDataSet returns [EObject current=null] : iv_ruleDataSet= ruleDataSet EOF ;
    public final EObject entryRuleDataSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSet = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:420:2: (iv_ruleDataSet= ruleDataSet EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:421:2: iv_ruleDataSet= ruleDataSet EOF
            {
             newCompositeNode(grammarAccess.getDataSetRule()); 
            pushFollow(FOLLOW_ruleDataSet_in_entryRuleDataSet797);
            iv_ruleDataSet=ruleDataSet();

            state._fsp--;

             current =iv_ruleDataSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSet807); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:428:1: ruleDataSet returns [EObject current=null] : (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'with identifier' otherlv_5= ':' ( (lv_ID_6_0= RULE_STRING ) ) )? ( (lv_description_7_0= RULE_DESCRIPTION ) )? otherlv_8= '{' ( (lv_data_9_0= ruleData ) )* otherlv_10= '}' ) ;
    public final EObject ruleDataSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_ID_6_0=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_data_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:431:28: ( (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'with identifier' otherlv_5= ':' ( (lv_ID_6_0= RULE_STRING ) ) )? ( (lv_description_7_0= RULE_DESCRIPTION ) )? otherlv_8= '{' ( (lv_data_9_0= ruleData ) )* otherlv_10= '}' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:432:1: (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'with identifier' otherlv_5= ':' ( (lv_ID_6_0= RULE_STRING ) ) )? ( (lv_description_7_0= RULE_DESCRIPTION ) )? otherlv_8= '{' ( (lv_data_9_0= ruleData ) )* otherlv_10= '}' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:432:1: (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'with identifier' otherlv_5= ':' ( (lv_ID_6_0= RULE_STRING ) ) )? ( (lv_description_7_0= RULE_DESCRIPTION ) )? otherlv_8= '{' ( (lv_data_9_0= ruleData ) )* otherlv_10= '}' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:432:3: otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'with identifier' otherlv_5= ':' ( (lv_ID_6_0= RULE_STRING ) ) )? ( (lv_description_7_0= RULE_DESCRIPTION ) )? otherlv_8= '{' ( (lv_data_9_0= ruleData ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleDataSet844); 

                	newLeafNode(otherlv_0, grammarAccess.getDataSetAccess().getDataSetKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:436:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:437:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:437:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:438:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSet861); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:454:2: (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:454:4: otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleDataSet879); 

                        	newLeafNode(otherlv_2, grammarAccess.getDataSetAccess().getUsesKeyword_2_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:458:1: ( (otherlv_3= RULE_ID ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:459:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:459:1: (otherlv_3= RULE_ID )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:460:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSetRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSet899); 

                    		newLeafNode(otherlv_3, grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:471:4: (otherlv_4= 'with identifier' otherlv_5= ':' ( (lv_ID_6_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:471:6: otherlv_4= 'with identifier' otherlv_5= ':' ( (lv_ID_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDataSet914); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataSetAccess().getWithIdentifierKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleDataSet926); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataSetAccess().getColonKeyword_3_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:479:1: ( (lv_ID_6_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:480:1: (lv_ID_6_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:480:1: (lv_ID_6_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:481:3: lv_ID_6_0= RULE_STRING
                    {
                    lv_ID_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataSet943); 

                    			newLeafNode(lv_ID_6_0, grammarAccess.getDataSetAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:497:4: ( (lv_description_7_0= RULE_DESCRIPTION ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DESCRIPTION) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:498:1: (lv_description_7_0= RULE_DESCRIPTION )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:498:1: (lv_description_7_0= RULE_DESCRIPTION )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:499:3: lv_description_7_0= RULE_DESCRIPTION
                    {
                    lv_description_7_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_ruleDataSet967); 

                    			newLeafNode(lv_description_7_0, grammarAccess.getDataSetAccess().getDescriptionDESCRIPTIONTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"DESCRIPTION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleDataSet985); 

                	newLeafNode(otherlv_8, grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_5());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:519:1: ( (lv_data_9_0= ruleData ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:520:1: (lv_data_9_0= ruleData )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:520:1: (lv_data_9_0= ruleData )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:521:3: lv_data_9_0= ruleData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleData_in_ruleDataSet1006);
            	    lv_data_9_0=ruleData();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"data",
            	            		lv_data_9_0, 
            	            		"Data");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleDataSet1019); 

                	newLeafNode(otherlv_10, grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:549:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:550:2: (iv_ruleData= ruleData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:551:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData1055);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData1065); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:558:1: ruleData returns [EObject current=null] : (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject this_MeasurementData_0 = null;

        EObject this_NonMeasurementData_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:561:28: ( (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:562:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:562:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:563:5: this_MeasurementData_0= ruleMeasurementData
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMeasurementData_in_ruleData1112);
                    this_MeasurementData_0=ruleMeasurementData();

                    state._fsp--;

                     
                            current = this_MeasurementData_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:573:5: this_NonMeasurementData_1= ruleNonMeasurementData
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getNonMeasurementDataParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNonMeasurementData_in_ruleData1139);
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:589:1: entryRuleMeasurementData returns [EObject current=null] : iv_ruleMeasurementData= ruleMeasurementData EOF ;
    public final EObject entryRuleMeasurementData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:590:2: (iv_ruleMeasurementData= ruleMeasurementData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:591:2: iv_ruleMeasurementData= ruleMeasurementData EOF
            {
             newCompositeNode(grammarAccess.getMeasurementDataRule()); 
            pushFollow(FOLLOW_ruleMeasurementData_in_entryRuleMeasurementData1174);
            iv_ruleMeasurementData=ruleMeasurementData();

            state._fsp--;

             current =iv_ruleMeasurementData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementData1184); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:598:1: ruleMeasurementData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataAdjustment ) ) (otherlv_10= ',' ( (lv_adjustments_11_0= ruleDataAdjustment ) ) )* )? ( (lv_description_12_0= RULE_DESCRIPTION ) )? ) ;
    public final EObject ruleMeasurementData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_ID_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_description_12_0=null;
        Enumerator lv_dataType_2_0 = null;

        AntlrDatatypeRuleToken lv_unit_4_0 = null;

        EObject lv_adjustments_9_0 = null;

        EObject lv_adjustments_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:601:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataAdjustment ) ) (otherlv_10= ',' ( (lv_adjustments_11_0= ruleDataAdjustment ) ) )* )? ( (lv_description_12_0= RULE_DESCRIPTION ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:602:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataAdjustment ) ) (otherlv_10= ',' ( (lv_adjustments_11_0= ruleDataAdjustment ) ) )* )? ( (lv_description_12_0= RULE_DESCRIPTION ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:602:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataAdjustment ) ) (otherlv_10= ',' ( (lv_adjustments_11_0= ruleDataAdjustment ) ) )* )? ( (lv_description_12_0= RULE_DESCRIPTION ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:602:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataAdjustment ) ) (otherlv_10= ',' ( (lv_adjustments_11_0= ruleDataAdjustment ) ) )* )? ( (lv_description_12_0= RULE_DESCRIPTION ) )?
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:602:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:603:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:603:1: (lv_name_0_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:604:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeasurementData1226); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleMeasurementData1243); 

                	newLeafNode(otherlv_1, grammarAccess.getMeasurementDataAccess().getAsKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:624:1: ( (lv_dataType_2_0= ruleDataType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:625:1: (lv_dataType_2_0= ruleDataType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:625:1: (lv_dataType_2_0= ruleDataType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:626:3: lv_dataType_2_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleMeasurementData1264);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleMeasurementData1276); 

                	newLeafNode(otherlv_3, grammarAccess.getMeasurementDataAccess().getInKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:646:1: ( (lv_unit_4_0= ruleUNIT ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:647:1: (lv_unit_4_0= ruleUNIT )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:647:1: (lv_unit_4_0= ruleUNIT )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:648:3: lv_unit_4_0= ruleUNIT
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getUnitUNITParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleUNIT_in_ruleMeasurementData1297);
            lv_unit_4_0=ruleUNIT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_4_0, 
                    		"UNIT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:664:2: (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:664:4: otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleMeasurementData1310); 

                        	newLeafNode(otherlv_5, grammarAccess.getMeasurementDataAccess().getWithIdentifierKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleMeasurementData1322); 

                        	newLeafNode(otherlv_6, grammarAccess.getMeasurementDataAccess().getColonKeyword_5_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:672:1: ( (lv_ID_7_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:673:1: (lv_ID_7_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:673:1: (lv_ID_7_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:674:3: lv_ID_7_0= RULE_STRING
                    {
                    lv_ID_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasurementData1339); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:690:4: (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataAdjustment ) ) (otherlv_10= ',' ( (lv_adjustments_11_0= ruleDataAdjustment ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:690:6: otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataAdjustment ) ) (otherlv_10= ',' ( (lv_adjustments_11_0= ruleDataAdjustment ) ) )*
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleMeasurementData1359); 

                        	newLeafNode(otherlv_8, grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:694:1: ( (lv_adjustments_9_0= ruleDataAdjustment ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:695:1: (lv_adjustments_9_0= ruleDataAdjustment )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:695:1: (lv_adjustments_9_0= ruleDataAdjustment )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:696:3: lv_adjustments_9_0= ruleDataAdjustment
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustmentParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataAdjustment_in_ruleMeasurementData1380);
                    lv_adjustments_9_0=ruleDataAdjustment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
                    	        }
                           		add(
                           			current, 
                           			"adjustments",
                            		lv_adjustments_9_0, 
                            		"DataAdjustment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:712:2: (otherlv_10= ',' ( (lv_adjustments_11_0= ruleDataAdjustment ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==18) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:712:4: otherlv_10= ',' ( (lv_adjustments_11_0= ruleDataAdjustment ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleMeasurementData1393); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:716:1: ( (lv_adjustments_11_0= ruleDataAdjustment ) )
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:717:1: (lv_adjustments_11_0= ruleDataAdjustment )
                    	    {
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:717:1: (lv_adjustments_11_0= ruleDataAdjustment )
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:718:3: lv_adjustments_11_0= ruleDataAdjustment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustmentParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDataAdjustment_in_ruleMeasurementData1414);
                    	    lv_adjustments_11_0=ruleDataAdjustment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"adjustments",
                    	            		lv_adjustments_11_0, 
                    	            		"DataAdjustment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:734:6: ( (lv_description_12_0= RULE_DESCRIPTION ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DESCRIPTION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:735:1: (lv_description_12_0= RULE_DESCRIPTION )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:735:1: (lv_description_12_0= RULE_DESCRIPTION )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:736:3: lv_description_12_0= RULE_DESCRIPTION
                    {
                    lv_description_12_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_ruleMeasurementData1435); 

                    			newLeafNode(lv_description_12_0, grammarAccess.getMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_12_0, 
                            		"DESCRIPTION");
                    	    

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
    // $ANTLR end "ruleMeasurementData"


    // $ANTLR start "entryRuleNonMeasurementData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:760:1: entryRuleNonMeasurementData returns [EObject current=null] : iv_ruleNonMeasurementData= ruleNonMeasurementData EOF ;
    public final EObject entryRuleNonMeasurementData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonMeasurementData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:761:2: (iv_ruleNonMeasurementData= ruleNonMeasurementData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:762:2: iv_ruleNonMeasurementData= ruleNonMeasurementData EOF
            {
             newCompositeNode(grammarAccess.getNonMeasurementDataRule()); 
            pushFollow(FOLLOW_ruleNonMeasurementData_in_entryRuleNonMeasurementData1477);
            iv_ruleNonMeasurementData=ruleNonMeasurementData();

            state._fsp--;

             current =iv_ruleNonMeasurementData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonMeasurementData1487); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:769:1: ruleNonMeasurementData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_constant_3_0= 'constant' ) )? (otherlv_4= 'value' otherlv_5= '=' ( (lv_value_6_0= RULE_STRING ) ) )? (otherlv_7= 'with identifier' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? ( (lv_description_10_0= RULE_DESCRIPTION ) )? ) ;
    public final EObject ruleNonMeasurementData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_constant_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_ID_9_0=null;
        Token lv_description_10_0=null;
        Enumerator lv_dataType_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:772:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_constant_3_0= 'constant' ) )? (otherlv_4= 'value' otherlv_5= '=' ( (lv_value_6_0= RULE_STRING ) ) )? (otherlv_7= 'with identifier' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? ( (lv_description_10_0= RULE_DESCRIPTION ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:773:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_constant_3_0= 'constant' ) )? (otherlv_4= 'value' otherlv_5= '=' ( (lv_value_6_0= RULE_STRING ) ) )? (otherlv_7= 'with identifier' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? ( (lv_description_10_0= RULE_DESCRIPTION ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:773:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_constant_3_0= 'constant' ) )? (otherlv_4= 'value' otherlv_5= '=' ( (lv_value_6_0= RULE_STRING ) ) )? (otherlv_7= 'with identifier' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? ( (lv_description_10_0= RULE_DESCRIPTION ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:773:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) ( (lv_constant_3_0= 'constant' ) )? (otherlv_4= 'value' otherlv_5= '=' ( (lv_value_6_0= RULE_STRING ) ) )? (otherlv_7= 'with identifier' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? ( (lv_description_10_0= RULE_DESCRIPTION ) )?
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:773:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:774:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:774:1: (lv_name_0_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:775:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonMeasurementData1529); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleNonMeasurementData1546); 

                	newLeafNode(otherlv_1, grammarAccess.getNonMeasurementDataAccess().getAsKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:795:1: ( (lv_dataType_2_0= ruleDataType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:796:1: (lv_dataType_2_0= ruleDataType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:796:1: (lv_dataType_2_0= ruleDataType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:797:3: lv_dataType_2_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleNonMeasurementData1567);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:813:2: ( (lv_constant_3_0= 'constant' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:814:1: (lv_constant_3_0= 'constant' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:814:1: (lv_constant_3_0= 'constant' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:815:3: lv_constant_3_0= 'constant'
                    {
                    lv_constant_3_0=(Token)match(input,28,FOLLOW_28_in_ruleNonMeasurementData1585); 

                            newLeafNode(lv_constant_3_0, grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(current, "constant", true, "constant");
                    	    

                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:828:3: (otherlv_4= 'value' otherlv_5= '=' ( (lv_value_6_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:828:5: otherlv_4= 'value' otherlv_5= '=' ( (lv_value_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleNonMeasurementData1612); 

                        	newLeafNode(otherlv_4, grammarAccess.getNonMeasurementDataAccess().getValueKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleNonMeasurementData1624); 

                        	newLeafNode(otherlv_5, grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:836:1: ( (lv_value_6_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:837:1: (lv_value_6_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:837:1: (lv_value_6_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:838:3: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasurementData1641); 

                    			newLeafNode(lv_value_6_0, grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:854:4: (otherlv_7= 'with identifier' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:854:6: otherlv_7= 'with identifier' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleNonMeasurementData1661); 

                        	newLeafNode(otherlv_7, grammarAccess.getNonMeasurementDataAccess().getWithIdentifierKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleNonMeasurementData1673); 

                        	newLeafNode(otherlv_8, grammarAccess.getNonMeasurementDataAccess().getColonKeyword_5_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:862:1: ( (lv_ID_9_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:863:1: (lv_ID_9_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:863:1: (lv_ID_9_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:864:3: lv_ID_9_0= RULE_STRING
                    {
                    lv_ID_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasurementData1690); 

                    			newLeafNode(lv_ID_9_0, grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_9_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:880:4: ( (lv_description_10_0= RULE_DESCRIPTION ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DESCRIPTION) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:881:1: (lv_description_10_0= RULE_DESCRIPTION )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:881:1: (lv_description_10_0= RULE_DESCRIPTION )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:882:3: lv_description_10_0= RULE_DESCRIPTION
                    {
                    lv_description_10_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_ruleNonMeasurementData1714); 

                    			newLeafNode(lv_description_10_0, grammarAccess.getNonMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_10_0, 
                            		"DESCRIPTION");
                    	    

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
    // $ANTLR end "ruleNonMeasurementData"


    // $ANTLR start "entryRuleDataAdjustment"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:906:1: entryRuleDataAdjustment returns [EObject current=null] : iv_ruleDataAdjustment= ruleDataAdjustment EOF ;
    public final EObject entryRuleDataAdjustment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAdjustment = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:907:2: (iv_ruleDataAdjustment= ruleDataAdjustment EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:908:2: iv_ruleDataAdjustment= ruleDataAdjustment EOF
            {
             newCompositeNode(grammarAccess.getDataAdjustmentRule()); 
            pushFollow(FOLLOW_ruleDataAdjustment_in_entryRuleDataAdjustment1756);
            iv_ruleDataAdjustment=ruleDataAdjustment();

            state._fsp--;

             current =iv_ruleDataAdjustment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAdjustment1766); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataAdjustment"


    // $ANTLR start "ruleDataAdjustment"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:915:1: ruleDataAdjustment returns [EObject current=null] : (this_DataRange_0= ruleDataRange | this_DataConversion_1= ruleDataConversion ) ;
    public final EObject ruleDataAdjustment() throws RecognitionException {
        EObject current = null;

        EObject this_DataRange_0 = null;

        EObject this_DataConversion_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:918:28: ( (this_DataRange_0= ruleDataRange | this_DataConversion_1= ruleDataConversion ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:919:1: (this_DataRange_0= ruleDataRange | this_DataConversion_1= ruleDataConversion )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:919:1: (this_DataRange_0= ruleDataRange | this_DataConversion_1= ruleDataConversion )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            else if ( (LA19_0==35||LA19_0==37) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:920:5: this_DataRange_0= ruleDataRange
                    {
                     
                            newCompositeNode(grammarAccess.getDataAdjustmentAccess().getDataRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataRange_in_ruleDataAdjustment1813);
                    this_DataRange_0=ruleDataRange();

                    state._fsp--;

                     
                            current = this_DataRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:930:5: this_DataConversion_1= ruleDataConversion
                    {
                     
                            newCompositeNode(grammarAccess.getDataAdjustmentAccess().getDataConversionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataConversion_in_ruleDataAdjustment1840);
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
    // $ANTLR end "ruleDataAdjustment"


    // $ANTLR start "entryRuleDataRange"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:946:1: entryRuleDataRange returns [EObject current=null] : iv_ruleDataRange= ruleDataRange EOF ;
    public final EObject entryRuleDataRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataRange = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:947:2: (iv_ruleDataRange= ruleDataRange EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:948:2: iv_ruleDataRange= ruleDataRange EOF
            {
             newCompositeNode(grammarAccess.getDataRangeRule()); 
            pushFollow(FOLLOW_ruleDataRange_in_entryRuleDataRange1875);
            iv_ruleDataRange=ruleDataRange();

            state._fsp--;

             current =iv_ruleDataRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataRange1885); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:955:1: ruleDataRange returns [EObject current=null] : (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) ) ;
    public final EObject ruleDataRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_range_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:958:28: ( (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:959:1: (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:959:1: (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:959:3: otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleDataRange1922); 

                	newLeafNode(otherlv_0, grammarAccess.getDataRangeAccess().getWithRangeKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:963:1: ( (lv_range_1_0= ruleInterval ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:964:1: (lv_range_1_0= ruleInterval )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:964:1: (lv_range_1_0= ruleInterval )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:965:3: lv_range_1_0= ruleInterval
            {
             
            	        newCompositeNode(grammarAccess.getDataRangeAccess().getRangeIntervalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInterval_in_ruleDataRange1943);
            lv_range_1_0=ruleInterval();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataRangeRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_1_0, 
                    		"Interval");
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
    // $ANTLR end "ruleDataRange"


    // $ANTLR start "entryRuleInterval"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:989:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:990:2: (iv_ruleInterval= ruleInterval EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:991:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_ruleInterval_in_entryRuleInterval1979);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterval1989); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:998:1: ruleInterval returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1001:28: ( (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1002:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1002:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1002:3: otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleInterval2026); 

                	newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1006:1: ( (lv_lowerBound_1_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1007:1: (lv_lowerBound_1_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1007:1: (lv_lowerBound_1_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1008:3: lv_lowerBound_1_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleInterval2047);
            lv_lowerBound_1_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntervalRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_1_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleInterval2059); 

                	newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getSemicolonKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1028:1: ( (lv_upperBound_3_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1029:1: (lv_upperBound_3_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1029:1: (lv_upperBound_3_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1030:3: lv_upperBound_3_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleInterval2080);
            lv_upperBound_3_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntervalRule());
            	        }
                   		set(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_3_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleInterval2092); 

                	newLeafNode(otherlv_4, grammarAccess.getIntervalAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1058:1: entryRuleDataConversion returns [EObject current=null] : iv_ruleDataConversion= ruleDataConversion EOF ;
    public final EObject entryRuleDataConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataConversion = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1059:2: (iv_ruleDataConversion= ruleDataConversion EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1060:2: iv_ruleDataConversion= ruleDataConversion EOF
            {
             newCompositeNode(grammarAccess.getDataConversionRule()); 
            pushFollow(FOLLOW_ruleDataConversion_in_entryRuleDataConversion2128);
            iv_ruleDataConversion=ruleDataConversion();

            state._fsp--;

             current =iv_ruleDataConversion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataConversion2138); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1067:1: ruleDataConversion returns [EObject current=null] : (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval ) ;
    public final EObject ruleDataConversion() throws RecognitionException {
        EObject current = null;

        EObject this_LinearDataConversion_0 = null;

        EObject this_LinearDataConversionWithInterval_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1070:28: ( (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1071:1: (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1071:1: (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            else if ( (LA20_0==37) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1072:5: this_LinearDataConversion_0= ruleLinearDataConversion
                    {
                     
                            newCompositeNode(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLinearDataConversion_in_ruleDataConversion2185);
                    this_LinearDataConversion_0=ruleLinearDataConversion();

                    state._fsp--;

                     
                            current = this_LinearDataConversion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1082:5: this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval
                    {
                     
                            newCompositeNode(grammarAccess.getDataConversionAccess().getLinearDataConversionWithIntervalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLinearDataConversionWithInterval_in_ruleDataConversion2212);
                    this_LinearDataConversionWithInterval_1=ruleLinearDataConversionWithInterval();

                    state._fsp--;

                     
                            current = this_LinearDataConversionWithInterval_1; 
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
    // $ANTLR end "ruleDataConversion"


    // $ANTLR start "entryRuleLinearDataConversion"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1098:1: entryRuleLinearDataConversion returns [EObject current=null] : iv_ruleLinearDataConversion= ruleLinearDataConversion EOF ;
    public final EObject entryRuleLinearDataConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearDataConversion = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1099:2: (iv_ruleLinearDataConversion= ruleLinearDataConversion EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1100:2: iv_ruleLinearDataConversion= ruleLinearDataConversion EOF
            {
             newCompositeNode(grammarAccess.getLinearDataConversionRule()); 
            pushFollow(FOLLOW_ruleLinearDataConversion_in_entryRuleLinearDataConversion2247);
            iv_ruleLinearDataConversion=ruleLinearDataConversion();

            state._fsp--;

             current =iv_ruleLinearDataConversion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinearDataConversion2257); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1107:1: ruleLinearDataConversion returns [EObject current=null] : (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleLinearDataConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_scalingFactor_2_0 = null;

        AntlrDatatypeRuleToken lv_offset_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1110:28: ( (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1111:1: (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1111:1: (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1111:3: otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleLinearDataConversion2294); 

                	newLeafNode(otherlv_0, grammarAccess.getLinearDataConversionAccess().getWithScalingFactorKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleLinearDataConversion2306); 

                	newLeafNode(otherlv_1, grammarAccess.getLinearDataConversionAccess().getColonKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1119:1: ( (lv_scalingFactor_2_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1120:1: (lv_scalingFactor_2_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1120:1: (lv_scalingFactor_2_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1121:3: lv_scalingFactor_2_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion2327);
            lv_scalingFactor_2_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinearDataConversionRule());
            	        }
                   		set(
                   			current, 
                   			"scalingFactor",
                    		lv_scalingFactor_2_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleLinearDataConversion2339); 

                	newLeafNode(otherlv_3, grammarAccess.getLinearDataConversionAccess().getAndOffsetKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleLinearDataConversion2351); 

                	newLeafNode(otherlv_4, grammarAccess.getLinearDataConversionAccess().getColonKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1145:1: ( (lv_offset_5_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1146:1: (lv_offset_5_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1146:1: (lv_offset_5_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1147:3: lv_offset_5_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLinearDataConversionAccess().getOffsetDOUBLEParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion2372);
            lv_offset_5_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinearDataConversionRule());
            	        }
                   		set(
                   			current, 
                   			"offset",
                    		lv_offset_5_0, 
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
    // $ANTLR end "ruleLinearDataConversion"


    // $ANTLR start "entryRuleLinearDataConversionWithInterval"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1171:1: entryRuleLinearDataConversionWithInterval returns [EObject current=null] : iv_ruleLinearDataConversionWithInterval= ruleLinearDataConversionWithInterval EOF ;
    public final EObject entryRuleLinearDataConversionWithInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearDataConversionWithInterval = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1172:2: (iv_ruleLinearDataConversionWithInterval= ruleLinearDataConversionWithInterval EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1173:2: iv_ruleLinearDataConversionWithInterval= ruleLinearDataConversionWithInterval EOF
            {
             newCompositeNode(grammarAccess.getLinearDataConversionWithIntervalRule()); 
            pushFollow(FOLLOW_ruleLinearDataConversionWithInterval_in_entryRuleLinearDataConversionWithInterval2408);
            iv_ruleLinearDataConversionWithInterval=ruleLinearDataConversionWithInterval();

            state._fsp--;

             current =iv_ruleLinearDataConversionWithInterval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinearDataConversionWithInterval2418); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinearDataConversionWithInterval"


    // $ANTLR start "ruleLinearDataConversionWithInterval"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1180:1: ruleLinearDataConversionWithInterval returns [EObject current=null] : (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) ) ;
    public final EObject ruleLinearDataConversionWithInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromInterval_1_0 = null;

        EObject lv_toInterval_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1183:28: ( (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1184:1: (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1184:1: (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1184:3: otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleLinearDataConversionWithInterval2455); 

                	newLeafNode(otherlv_0, grammarAccess.getLinearDataConversionWithIntervalAccess().getByLinearMappingKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1188:1: ( (lv_fromInterval_1_0= ruleInterval ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1189:1: (lv_fromInterval_1_0= ruleInterval )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1189:1: (lv_fromInterval_1_0= ruleInterval )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1190:3: lv_fromInterval_1_0= ruleInterval
            {
             
            	        newCompositeNode(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalIntervalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInterval_in_ruleLinearDataConversionWithInterval2476);
            lv_fromInterval_1_0=ruleInterval();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinearDataConversionWithIntervalRule());
            	        }
                   		set(
                   			current, 
                   			"fromInterval",
                    		lv_fromInterval_1_0, 
                    		"Interval");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleLinearDataConversionWithInterval2488); 

                	newLeafNode(otherlv_2, grammarAccess.getLinearDataConversionWithIntervalAccess().getEqualsSignGreaterThanSignKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1210:1: ( (lv_toInterval_3_0= ruleInterval ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1211:1: (lv_toInterval_3_0= ruleInterval )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1211:1: (lv_toInterval_3_0= ruleInterval )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1212:3: lv_toInterval_3_0= ruleInterval
            {
             
            	        newCompositeNode(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalIntervalParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleInterval_in_ruleLinearDataConversionWithInterval2509);
            lv_toInterval_3_0=ruleInterval();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinearDataConversionWithIntervalRule());
            	        }
                   		set(
                   			current, 
                   			"toInterval",
                    		lv_toInterval_3_0, 
                    		"Interval");
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
    // $ANTLR end "ruleLinearDataConversionWithInterval"


    // $ANTLR start "entryRuleDOUBLE"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1236:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1237:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1238:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE2546);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE2557); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1245:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1248:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1249:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1249:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1249:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE2597); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1256:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1257:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleDOUBLE2616); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE2631); 

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


    // $ANTLR start "entryRuleUNIT"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1277:1: entryRuleUNIT returns [String current=null] : iv_ruleUNIT= ruleUNIT EOF ;
    public final String entryRuleUNIT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNIT = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1278:2: (iv_ruleUNIT= ruleUNIT EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1279:2: iv_ruleUNIT= ruleUNIT EOF
            {
             newCompositeNode(grammarAccess.getUNITRule()); 
            pushFollow(FOLLOW_ruleUNIT_in_entryRuleUNIT2679);
            iv_ruleUNIT=ruleUNIT();

            state._fsp--;

             current =iv_ruleUNIT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNIT2690); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUNIT"


    // $ANTLR start "ruleUNIT"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1286:1: ruleUNIT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* ) ;
    public final AntlrDatatypeRuleToken ruleUNIT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1289:28: ( ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1290:1: ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1290:1: ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1290:2: (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )*
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1290:2: (this_ID_0= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==EOF||(LA22_2>=RULE_ID && LA22_2<=RULE_DESCRIPTION)||LA22_2==RULE_ANY_OTHER||LA22_2==13||LA22_2==16||LA22_2==27) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1290:7: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUNIT2731); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getUNITAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1297:3: (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ANY_OTHER) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1297:8: this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )*
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleUNIT2754); 

            	    		current.merge(this_ANY_OTHER_1);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_1, grammarAccess.getUNITAccess().getANY_OTHERTerminalRuleCall_1_0()); 
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1304:1: (this_ID_2= RULE_ID )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==RULE_ID) ) {
            	            int LA23_2 = input.LA(2);

            	            if ( (LA23_2==EOF||(LA23_2>=RULE_ID && LA23_2<=RULE_DESCRIPTION)||LA23_2==RULE_ANY_OTHER||LA23_2==13||LA23_2==16||LA23_2==27) ) {
            	                alt23=1;
            	            }


            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1304:6: this_ID_2= RULE_ID
            	    	    {
            	    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUNIT2775); 

            	    	    		current.merge(this_ID_2);
            	    	        
            	    	     
            	    	        newLeafNode(this_ID_2, grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop23;
            	        }
            	    } while (true);


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
    // $ANTLR end "ruleUNIT"


    // $ANTLR start "ruleCoding"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1319:1: ruleCoding returns [Enumerator current=null] : ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) ) ;
    public final Enumerator ruleCoding() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1321:28: ( ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1322:1: ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1322:1: ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            else if ( (LA25_0==41) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1322:2: (enumLiteral_0= 'SENSIDL_BINARY' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1322:2: (enumLiteral_0= 'SENSIDL_BINARY' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1322:4: enumLiteral_0= 'SENSIDL_BINARY'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleCoding2838); 

                            current = grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1328:6: (enumLiteral_1= 'SENSIDL_JSON' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1328:6: (enumLiteral_1= 'SENSIDL_JSON' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1328:8: enumLiteral_1= 'SENSIDL_JSON'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleCoding2855); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1338:1: ruleEndianness returns [Enumerator current=null] : ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) ;
    public final Enumerator ruleEndianness() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1340:28: ( ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1341:1: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1341:1: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            else if ( (LA26_0==43) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1341:2: (enumLiteral_0= 'BIG_ENDIAN' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1341:2: (enumLiteral_0= 'BIG_ENDIAN' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1341:4: enumLiteral_0= 'BIG_ENDIAN'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleEndianness2900); 

                            current = grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1347:6: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1347:6: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1347:8: enumLiteral_1= 'LITTLE_ENDIAN'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleEndianness2917); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1357:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) | (enumLiteral_10= 'BOOLEAN' ) | (enumLiteral_11= 'STRING' ) ) ;
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
        Token enumLiteral_11=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1359:28: ( ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) | (enumLiteral_10= 'BOOLEAN' ) | (enumLiteral_11= 'STRING' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1360:1: ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) | (enumLiteral_10= 'BOOLEAN' ) | (enumLiteral_11= 'STRING' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1360:1: ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) | (enumLiteral_10= 'BOOLEAN' ) | (enumLiteral_11= 'STRING' ) )
            int alt27=12;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt27=1;
                }
                break;
            case 45:
                {
                alt27=2;
                }
                break;
            case 46:
                {
                alt27=3;
                }
                break;
            case 47:
                {
                alt27=4;
                }
                break;
            case 48:
                {
                alt27=5;
                }
                break;
            case 49:
                {
                alt27=6;
                }
                break;
            case 50:
                {
                alt27=7;
                }
                break;
            case 51:
                {
                alt27=8;
                }
                break;
            case 52:
                {
                alt27=9;
                }
                break;
            case 53:
                {
                alt27=10;
                }
                break;
            case 54:
                {
                alt27=11;
                }
                break;
            case 55:
                {
                alt27=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1360:2: (enumLiteral_0= 'INT8' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1360:2: (enumLiteral_0= 'INT8' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1360:4: enumLiteral_0= 'INT8'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleDataType2962); 

                            current = grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1366:6: (enumLiteral_1= 'UINT8' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1366:6: (enumLiteral_1= 'UINT8' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1366:8: enumLiteral_1= 'UINT8'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_45_in_ruleDataType2979); 

                            current = grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1372:6: (enumLiteral_2= 'INT16' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1372:6: (enumLiteral_2= 'INT16' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1372:8: enumLiteral_2= 'INT16'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_46_in_ruleDataType2996); 

                            current = grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1378:6: (enumLiteral_3= 'UINT16' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1378:6: (enumLiteral_3= 'UINT16' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1378:8: enumLiteral_3= 'UINT16'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_47_in_ruleDataType3013); 

                            current = grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1384:6: (enumLiteral_4= 'INT32' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1384:6: (enumLiteral_4= 'INT32' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1384:8: enumLiteral_4= 'INT32'
                    {
                    enumLiteral_4=(Token)match(input,48,FOLLOW_48_in_ruleDataType3030); 

                            current = grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1390:6: (enumLiteral_5= 'UINT32' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1390:6: (enumLiteral_5= 'UINT32' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1390:8: enumLiteral_5= 'UINT32'
                    {
                    enumLiteral_5=(Token)match(input,49,FOLLOW_49_in_ruleDataType3047); 

                            current = grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1396:6: (enumLiteral_6= 'INT64' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1396:6: (enumLiteral_6= 'INT64' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1396:8: enumLiteral_6= 'INT64'
                    {
                    enumLiteral_6=(Token)match(input,50,FOLLOW_50_in_ruleDataType3064); 

                            current = grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1402:6: (enumLiteral_7= 'UINT64' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1402:6: (enumLiteral_7= 'UINT64' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1402:8: enumLiteral_7= 'UINT64'
                    {
                    enumLiteral_7=(Token)match(input,51,FOLLOW_51_in_ruleDataType3081); 

                            current = grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1408:6: (enumLiteral_8= 'FLOAT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1408:6: (enumLiteral_8= 'FLOAT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1408:8: enumLiteral_8= 'FLOAT'
                    {
                    enumLiteral_8=(Token)match(input,52,FOLLOW_52_in_ruleDataType3098); 

                            current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1414:6: (enumLiteral_9= 'DOUBLE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1414:6: (enumLiteral_9= 'DOUBLE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1414:8: enumLiteral_9= 'DOUBLE'
                    {
                    enumLiteral_9=(Token)match(input,53,FOLLOW_53_in_ruleDataType3115); 

                            current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1420:6: (enumLiteral_10= 'BOOLEAN' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1420:6: (enumLiteral_10= 'BOOLEAN' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1420:8: enumLiteral_10= 'BOOLEAN'
                    {
                    enumLiteral_10=(Token)match(input,54,FOLLOW_54_in_ruleDataType3132); 

                            current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1426:6: (enumLiteral_11= 'STRING' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1426:6: (enumLiteral_11= 'STRING' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1426:8: enumLiteral_11= 'STRING'
                    {
                    enumLiteral_11=(Token)match(input,55,FOLLOW_55_in_ruleDataType3149); 

                            current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_11()); 
                        

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


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\21\uffff";
    static final String DFA10_eofS =
        "\3\uffff\14\20\2\uffff";
    static final String DFA10_minS =
        "\1\4\1\31\1\54\14\4\2\uffff";
    static final String DFA10_maxS =
        "\1\4\1\31\1\67\14\35\2\uffff";
    static final String DFA10_acceptS =
        "\17\uffff\1\1\1\2";
    static final String DFA10_specialS =
        "\21\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\17\1\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\17\1\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\17\1\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\17\1\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\17\1\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\17\1\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\17\1\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\17\1\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\17\1\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\17\1\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\17\1\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\17\1\uffff\2\20",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "562:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSensorInterface_in_entryRuleSensorInterface75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorInterface85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSensorInterface122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensorInterface139 = new BitSet(new long[]{0x000000000000A020L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_ruleSensorInterface161 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleSensorInterface180 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSensorInterface192 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSensorInterface209 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSensorInterface228 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleEncodingSettings_in_ruleSensorInterface249 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleSensorDataDescription_in_ruleSensorInterface270 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSensorInterface282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodingSettings_in_entryRuleEncodingSettings318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncodingSettings328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEncodingSettings365 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEncodingSettings377 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ruleCoding_in_ruleEncodingSettings398 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEncodingSettings410 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEncodingSettings422 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEncodingSettings434 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleEndianness_in_ruleEncodingSettings455 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEncodingSettings467 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEncodingSettings479 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEncodingSettings491 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEncodingSettings508 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEncodingSettings525 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleEncodingSettings538 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEncodingSettings550 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEncodingSettings567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorDataDescription_in_entryRuleSensorDataDescription610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorDataDescription620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSensorDataDescription657 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleSensorDataDescription679 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSensorDataDescription691 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSensorDataDescription708 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSensorDataDescription727 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_ruleDataSet_in_ruleSensorDataDescription748 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_16_in_ruleSensorDataDescription761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSet_in_entryRuleDataSet797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSet807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDataSet844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSet861 = new BitSet(new long[]{0x000000000100A020L});
    public static final BitSet FOLLOW_24_in_ruleDataSet879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSet899 = new BitSet(new long[]{0x000000000000A020L});
    public static final BitSet FOLLOW_13_in_ruleDataSet914 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataSet926 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataSet943 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_ruleDataSet967 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataSet985 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleData_in_ruleDataSet1006 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleDataSet1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData1055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementData_in_ruleData1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasurementData_in_ruleData1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementData_in_entryRuleMeasurementData1174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementData1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeasurementData1226 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMeasurementData1243 = new BitSet(new long[]{0x00FFF00000000000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleMeasurementData1264 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMeasurementData1276 = new BitSet(new long[]{0x0000000008002130L});
    public static final BitSet FOLLOW_ruleUNIT_in_ruleMeasurementData1297 = new BitSet(new long[]{0x0000000008002022L});
    public static final BitSet FOLLOW_13_in_ruleMeasurementData1310 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMeasurementData1322 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasurementData1339 = new BitSet(new long[]{0x0000000008000022L});
    public static final BitSet FOLLOW_27_in_ruleMeasurementData1359 = new BitSet(new long[]{0x0000002880000000L});
    public static final BitSet FOLLOW_ruleDataAdjustment_in_ruleMeasurementData1380 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_18_in_ruleMeasurementData1393 = new BitSet(new long[]{0x0000002880000000L});
    public static final BitSet FOLLOW_ruleDataAdjustment_in_ruleMeasurementData1414 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_ruleMeasurementData1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasurementData_in_entryRuleNonMeasurementData1477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonMeasurementData1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonMeasurementData1529 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleNonMeasurementData1546 = new BitSet(new long[]{0x00FFF00000000000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleNonMeasurementData1567 = new BitSet(new long[]{0x0000000030002022L});
    public static final BitSet FOLLOW_28_in_ruleNonMeasurementData1585 = new BitSet(new long[]{0x0000000020002022L});
    public static final BitSet FOLLOW_29_in_ruleNonMeasurementData1612 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleNonMeasurementData1624 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasurementData1641 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_13_in_ruleNonMeasurementData1661 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNonMeasurementData1673 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasurementData1690 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_ruleNonMeasurementData1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdjustment_in_entryRuleDataAdjustment1756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAdjustment1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_ruleDataAdjustment1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConversion_in_ruleDataAdjustment1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_entryRuleDataRange1875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataRange1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDataRange1922 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleDataRange1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_entryRuleInterval1979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterval1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleInterval2026 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleInterval2047 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleInterval2059 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleInterval2080 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleInterval2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConversion_in_entryRuleDataConversion2128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataConversion2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversion_in_ruleDataConversion2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversionWithInterval_in_ruleDataConversion2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversion_in_entryRuleLinearDataConversion2247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinearDataConversion2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLinearDataConversion2294 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLinearDataConversion2306 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion2327 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleLinearDataConversion2339 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLinearDataConversion2351 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversionWithInterval_in_entryRuleLinearDataConversionWithInterval2408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinearDataConversionWithInterval2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleLinearDataConversionWithInterval2455 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleLinearDataConversionWithInterval2476 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleLinearDataConversionWithInterval2488 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleLinearDataConversionWithInterval2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE2546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE2597 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleDOUBLE2616 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNIT_in_entryRuleUNIT2679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNIT2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUNIT2731 = new BitSet(new long[]{0x0000000000000112L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleUNIT2754 = new BitSet(new long[]{0x0000000000000112L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUNIT2775 = new BitSet(new long[]{0x0000000000000112L});
    public static final BitSet FOLLOW_40_in_ruleCoding2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCoding2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEndianness2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEndianness2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDataType2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDataType2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDataType2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDataType3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDataType3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDataType3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDataType3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDataType3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDataType3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDataType3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleDataType3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDataType3149 = new BitSet(new long[]{0x0000000000000002L});

}