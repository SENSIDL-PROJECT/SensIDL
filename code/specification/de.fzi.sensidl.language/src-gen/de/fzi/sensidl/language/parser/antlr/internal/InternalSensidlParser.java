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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DESCRIPTION", "RULE_STRING", "RULE_INT", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'sensorInterface'", "'with identifier'", "':'", "'{'", "'}'", "'encoding'", "','", "'endianness'", "'alignment'", "'BIT'", "'sensorData'", "'dataSet'", "'uses'", "'+'", "'-'", "'#'", "'~'", "'('", "')'", "'as'", "'Method'", "'list'", "'of'", "'in'", "'adjusted'", "'exclude:'", "'setter'", "'getter'", "'constant'", "'value'", "'='", "'exclude'", "'with range'", "'['", "';'", "']'", "'with scaling factor'", "'and offset'", "'by linear mapping'", "'=>'", "'.'", "'SENSIDL_BINARY'", "'SENSIDL_JSON'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'STRING'", "'BOOLEAN'", "'INT8'", "'UINT8'", "'INT16'", "'UINT16'", "'INT32'", "'UINT32'", "'INT64'", "'UINT64'", "'FLOAT'", "'DOUBLE'"
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
    public static final int RULE_DESCRIPTION=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:428:1: ruleDataSet returns [EObject current=null] : (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( ( (lv_data_11_0= ruleData ) ) | ( (lv_method_12_0= ruleMethod ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleDataSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_ID_8_0=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_data_11_0 = null;

        EObject lv_method_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:431:28: ( (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( ( (lv_data_11_0= ruleData ) ) | ( (lv_method_12_0= ruleMethod ) ) )* otherlv_13= '}' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:432:1: (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( ( (lv_data_11_0= ruleData ) ) | ( (lv_method_12_0= ruleMethod ) ) )* otherlv_13= '}' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:432:1: (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( ( (lv_data_11_0= ruleData ) ) | ( (lv_method_12_0= ruleMethod ) ) )* otherlv_13= '}' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:432:3: otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( ( (lv_data_11_0= ruleData ) ) | ( (lv_method_12_0= ruleMethod ) ) )* otherlv_13= '}'
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

                    		newLeafNode(otherlv_3, grammarAccess.getDataSetAccess().getUsedDataSetsDataSetCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:471:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:471:6: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleDataSet914); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDataSetAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:475:1: ( (otherlv_5= RULE_ID ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:476:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:476:1: (otherlv_5= RULE_ID )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:477:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDataSetRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSet934); 

            	    		newLeafNode(otherlv_5, grammarAccess.getDataSetAccess().getUsedDataSetsDataSetCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:488:4: (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:488:6: otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleDataSet949); 

                        	newLeafNode(otherlv_6, grammarAccess.getDataSetAccess().getWithIdentifierKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleDataSet961); 

                        	newLeafNode(otherlv_7, grammarAccess.getDataSetAccess().getColonKeyword_4_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:496:1: ( (lv_ID_8_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:497:1: (lv_ID_8_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:497:1: (lv_ID_8_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:498:3: lv_ID_8_0= RULE_STRING
                    {
                    lv_ID_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataSet978); 

                    			newLeafNode(lv_ID_8_0, grammarAccess.getDataSetAccess().getIDSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:514:4: ( (lv_description_9_0= RULE_DESCRIPTION ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DESCRIPTION) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:515:1: (lv_description_9_0= RULE_DESCRIPTION )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:515:1: (lv_description_9_0= RULE_DESCRIPTION )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:516:3: lv_description_9_0= RULE_DESCRIPTION
                    {
                    lv_description_9_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_ruleDataSet1002); 

                    			newLeafNode(lv_description_9_0, grammarAccess.getDataSetAccess().getDescriptionDESCRIPTIONTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_9_0, 
                            		"DESCRIPTION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleDataSet1020); 

                	newLeafNode(otherlv_10, grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_6());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:536:1: ( ( (lv_data_11_0= ruleData ) ) | ( (lv_method_12_0= ruleMethod ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==31) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==29) ) {
                        alt10=2;
                    }


                }
                else if ( ((LA10_0>=25 && LA10_0<=28)) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:536:2: ( (lv_data_11_0= ruleData ) )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:536:2: ( (lv_data_11_0= ruleData ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:537:1: (lv_data_11_0= ruleData )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:537:1: (lv_data_11_0= ruleData )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:538:3: lv_data_11_0= ruleData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_7_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleData_in_ruleDataSet1042);
            	    lv_data_11_0=ruleData();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"data",
            	            		lv_data_11_0, 
            	            		"Data");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:555:6: ( (lv_method_12_0= ruleMethod ) )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:555:6: ( (lv_method_12_0= ruleMethod ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:556:1: (lv_method_12_0= ruleMethod )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:556:1: (lv_method_12_0= ruleMethod )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:557:3: lv_method_12_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSetAccess().getMethodMethodParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleDataSet1069);
            	    lv_method_12_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"method",
            	            		lv_method_12_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleDataSet1083); 

                	newLeafNode(otherlv_13, grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleMethod"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:585:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:586:2: (iv_ruleMethod= ruleMethod EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:587:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod1119);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod1129); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:594:1: ruleMethod returns [EObject current=null] : ( ( ( (lv_visibility_0_0= '+' ) ) | ( (lv_visibility_1_0= '-' ) ) | ( (lv_visibility_2_0= '#' ) ) | ( (lv_visibility_3_0= '~' ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameter_6_0= ruleMethodParameter ) )? (otherlv_7= ',' ( (lv_parameter_8_0= ruleMethodParameter ) ) )* otherlv_9= ')' (otherlv_10= ':' ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= 'as' otherlv_15= 'Method' (otherlv_16= 'with identifier' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? ( (lv_description_19_0= RULE_DESCRIPTION ) )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_visibility_0_0=null;
        Token lv_visibility_1_0=null;
        Token lv_visibility_2_0=null;
        Token lv_visibility_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_ID_18_0=null;
        Token lv_description_19_0=null;
        EObject lv_parameter_6_0 = null;

        EObject lv_parameter_8_0 = null;

        Enumerator lv_returnType_11_0 = null;

        Enumerator lv_returnType_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:597:28: ( ( ( ( (lv_visibility_0_0= '+' ) ) | ( (lv_visibility_1_0= '-' ) ) | ( (lv_visibility_2_0= '#' ) ) | ( (lv_visibility_3_0= '~' ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameter_6_0= ruleMethodParameter ) )? (otherlv_7= ',' ( (lv_parameter_8_0= ruleMethodParameter ) ) )* otherlv_9= ')' (otherlv_10= ':' ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= 'as' otherlv_15= 'Method' (otherlv_16= 'with identifier' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? ( (lv_description_19_0= RULE_DESCRIPTION ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:598:1: ( ( ( (lv_visibility_0_0= '+' ) ) | ( (lv_visibility_1_0= '-' ) ) | ( (lv_visibility_2_0= '#' ) ) | ( (lv_visibility_3_0= '~' ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameter_6_0= ruleMethodParameter ) )? (otherlv_7= ',' ( (lv_parameter_8_0= ruleMethodParameter ) ) )* otherlv_9= ')' (otherlv_10= ':' ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= 'as' otherlv_15= 'Method' (otherlv_16= 'with identifier' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? ( (lv_description_19_0= RULE_DESCRIPTION ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:598:1: ( ( ( (lv_visibility_0_0= '+' ) ) | ( (lv_visibility_1_0= '-' ) ) | ( (lv_visibility_2_0= '#' ) ) | ( (lv_visibility_3_0= '~' ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameter_6_0= ruleMethodParameter ) )? (otherlv_7= ',' ( (lv_parameter_8_0= ruleMethodParameter ) ) )* otherlv_9= ')' (otherlv_10= ':' ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= 'as' otherlv_15= 'Method' (otherlv_16= 'with identifier' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? ( (lv_description_19_0= RULE_DESCRIPTION ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:598:2: ( ( (lv_visibility_0_0= '+' ) ) | ( (lv_visibility_1_0= '-' ) ) | ( (lv_visibility_2_0= '#' ) ) | ( (lv_visibility_3_0= '~' ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameter_6_0= ruleMethodParameter ) )? (otherlv_7= ',' ( (lv_parameter_8_0= ruleMethodParameter ) ) )* otherlv_9= ')' (otherlv_10= ':' ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= 'as' otherlv_15= 'Method' (otherlv_16= 'with identifier' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? ( (lv_description_19_0= RULE_DESCRIPTION ) )?
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:598:2: ( ( (lv_visibility_0_0= '+' ) ) | ( (lv_visibility_1_0= '-' ) ) | ( (lv_visibility_2_0= '#' ) ) | ( (lv_visibility_3_0= '~' ) ) )?
            int alt11=5;
            switch ( input.LA(1) ) {
                case 25:
                    {
                    alt11=1;
                    }
                    break;
                case 26:
                    {
                    alt11=2;
                    }
                    break;
                case 27:
                    {
                    alt11=3;
                    }
                    break;
                case 28:
                    {
                    alt11=4;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:598:3: ( (lv_visibility_0_0= '+' ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:598:3: ( (lv_visibility_0_0= '+' ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:599:1: (lv_visibility_0_0= '+' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:599:1: (lv_visibility_0_0= '+' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:600:3: lv_visibility_0_0= '+'
                    {
                    lv_visibility_0_0=(Token)match(input,25,FOLLOW_25_in_ruleMethod1173); 

                            newLeafNode(lv_visibility_0_0, grammarAccess.getMethodAccess().getVisibilityPlusSignKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(current, "visibility", lv_visibility_0_0, "+");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:614:6: ( (lv_visibility_1_0= '-' ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:614:6: ( (lv_visibility_1_0= '-' ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:615:1: (lv_visibility_1_0= '-' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:615:1: (lv_visibility_1_0= '-' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:616:3: lv_visibility_1_0= '-'
                    {
                    lv_visibility_1_0=(Token)match(input,26,FOLLOW_26_in_ruleMethod1210); 

                            newLeafNode(lv_visibility_1_0, grammarAccess.getMethodAccess().getVisibilityHyphenMinusKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(current, "visibility", lv_visibility_1_0, "-");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:630:6: ( (lv_visibility_2_0= '#' ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:630:6: ( (lv_visibility_2_0= '#' ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:631:1: (lv_visibility_2_0= '#' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:631:1: (lv_visibility_2_0= '#' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:632:3: lv_visibility_2_0= '#'
                    {
                    lv_visibility_2_0=(Token)match(input,27,FOLLOW_27_in_ruleMethod1247); 

                            newLeafNode(lv_visibility_2_0, grammarAccess.getMethodAccess().getVisibilityNumberSignKeyword_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(current, "visibility", lv_visibility_2_0, "#");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:646:6: ( (lv_visibility_3_0= '~' ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:646:6: ( (lv_visibility_3_0= '~' ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:647:1: (lv_visibility_3_0= '~' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:647:1: (lv_visibility_3_0= '~' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:648:3: lv_visibility_3_0= '~'
                    {
                    lv_visibility_3_0=(Token)match(input,28,FOLLOW_28_in_ruleMethod1284); 

                            newLeafNode(lv_visibility_3_0, grammarAccess.getMethodAccess().getVisibilityTildeKeyword_0_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(current, "visibility", lv_visibility_3_0, "~");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:661:4: ( (lv_name_4_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:662:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:662:1: (lv_name_4_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:663:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod1316); 

            			newLeafNode(lv_name_4_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleMethod1333); 

                	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:683:1: ( (lv_parameter_6_0= ruleMethodParameter ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=57 && LA12_0<=68)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:684:1: (lv_parameter_6_0= ruleMethodParameter )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:684:1: (lv_parameter_6_0= ruleMethodParameter )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:685:3: lv_parameter_6_0= ruleMethodParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getParameterMethodParameterParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMethodParameter_in_ruleMethod1354);
                    lv_parameter_6_0=ruleMethodParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"parameter",
                            		lv_parameter_6_0, 
                            		"MethodParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:701:3: (otherlv_7= ',' ( (lv_parameter_8_0= ruleMethodParameter ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:701:5: otherlv_7= ',' ( (lv_parameter_8_0= ruleMethodParameter ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleMethod1368); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:705:1: ( (lv_parameter_8_0= ruleMethodParameter ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:706:1: (lv_parameter_8_0= ruleMethodParameter )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:706:1: (lv_parameter_8_0= ruleMethodParameter )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:707:3: lv_parameter_8_0= ruleMethodParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getParameterMethodParameterParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethodParameter_in_ruleMethod1389);
            	    lv_parameter_8_0=ruleMethodParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameter",
            	            		lv_parameter_8_0, 
            	            		"MethodParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleMethod1403); 

                	newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightParenthesisKeyword_5());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:727:1: (otherlv_10= ':' ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:727:3: otherlv_10= ':' ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    {
                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleMethod1416); 

                        	newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getColonKeyword_6_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:731:1: ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=57 && LA15_0<=68)) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_ID) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:731:2: ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:731:2: ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) )
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( ((LA14_0>=59 && LA14_0<=68)) ) {
                                alt14=1;
                            }
                            else if ( ((LA14_0>=57 && LA14_0<=58)) ) {
                                alt14=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 14, 0, input);

                                throw nvae;
                            }
                            switch (alt14) {
                                case 1 :
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:731:3: ( (lv_returnType_11_0= ruleDataType ) )
                                    {
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:731:3: ( (lv_returnType_11_0= ruleDataType ) )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:732:1: (lv_returnType_11_0= ruleDataType )
                                    {
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:732:1: (lv_returnType_11_0= ruleDataType )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:733:3: lv_returnType_11_0= ruleDataType
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeDataTypeEnumRuleCall_6_1_0_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleDataType_in_ruleMethod1439);
                                    lv_returnType_11_0=ruleDataType();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"returnType",
                                            		lv_returnType_11_0, 
                                            		"DataType");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:750:6: ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) )
                                    {
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:750:6: ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:751:1: (lv_returnType_12_0= ruleDataTypeNotAdjustable )
                                    {
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:751:1: (lv_returnType_12_0= ruleDataTypeNotAdjustable )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:752:3: lv_returnType_12_0= ruleDataTypeNotAdjustable
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeDataTypeNotAdjustableEnumRuleCall_6_1_0_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleDataTypeNotAdjustable_in_ruleMethod1466);
                                    lv_returnType_12_0=ruleDataTypeNotAdjustable();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"returnType",
                                            		lv_returnType_12_0, 
                                            		"DataTypeNotAdjustable");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:769:6: ( (otherlv_13= RULE_ID ) )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:769:6: ( (otherlv_13= RULE_ID ) )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:770:1: (otherlv_13= RULE_ID )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:770:1: (otherlv_13= RULE_ID )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:771:3: otherlv_13= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getMethodRule());
                            	        }
                                    
                            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod1493); 

                            		newLeafNode(otherlv_13, grammarAccess.getMethodAccess().getReturnTypeDataSetDataSetCrossReference_6_1_1_0()); 
                            	

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleMethod1508); 

                	newLeafNode(otherlv_14, grammarAccess.getMethodAccess().getAsKeyword_7());
                
            otherlv_15=(Token)match(input,32,FOLLOW_32_in_ruleMethod1520); 

                	newLeafNode(otherlv_15, grammarAccess.getMethodAccess().getMethodKeyword_8());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:790:1: (otherlv_16= 'with identifier' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:790:3: otherlv_16= 'with identifier' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,13,FOLLOW_13_in_ruleMethod1533); 

                        	newLeafNode(otherlv_16, grammarAccess.getMethodAccess().getWithIdentifierKeyword_9_0());
                        
                    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleMethod1545); 

                        	newLeafNode(otherlv_17, grammarAccess.getMethodAccess().getColonKeyword_9_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:798:1: ( (lv_ID_18_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:799:1: (lv_ID_18_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:799:1: (lv_ID_18_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:800:3: lv_ID_18_0= RULE_STRING
                    {
                    lv_ID_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMethod1562); 

                    			newLeafNode(lv_ID_18_0, grammarAccess.getMethodAccess().getIDSTRINGTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_18_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:816:4: ( (lv_description_19_0= RULE_DESCRIPTION ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DESCRIPTION) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:817:1: (lv_description_19_0= RULE_DESCRIPTION )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:817:1: (lv_description_19_0= RULE_DESCRIPTION )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:818:3: lv_description_19_0= RULE_DESCRIPTION
                    {
                    lv_description_19_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_ruleMethod1586); 

                    			newLeafNode(lv_description_19_0, grammarAccess.getMethodAccess().getDescriptionDESCRIPTIONTerminalRuleCall_10_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_19_0, 
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodParameter"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:842:1: entryRuleMethodParameter returns [EObject current=null] : iv_ruleMethodParameter= ruleMethodParameter EOF ;
    public final EObject entryRuleMethodParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodParameter = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:843:2: (iv_ruleMethodParameter= ruleMethodParameter EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:844:2: iv_ruleMethodParameter= ruleMethodParameter EOF
            {
             newCompositeNode(grammarAccess.getMethodParameterRule()); 
            pushFollow(FOLLOW_ruleMethodParameter_in_entryRuleMethodParameter1628);
            iv_ruleMethodParameter=ruleMethodParameter();

            state._fsp--;

             current =iv_ruleMethodParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodParameter1638); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodParameter"


    // $ANTLR start "ruleMethodParameter"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:851:1: ruleMethodParameter returns [EObject current=null] : ( ( ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleMethodParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Enumerator lv_dataType_0_0 = null;

        Enumerator lv_dataType_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:854:28: ( ( ( ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:855:1: ( ( ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:855:1: ( ( ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_name_3_0= RULE_ID ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:855:2: ( ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_name_3_0= RULE_ID ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:855:2: ( ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=57 && LA20_0<=68)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:855:3: ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:855:3: ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=59 && LA19_0<=68)) ) {
                        alt19=1;
                    }
                    else if ( ((LA19_0>=57 && LA19_0<=58)) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:855:4: ( (lv_dataType_0_0= ruleDataType ) )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:855:4: ( (lv_dataType_0_0= ruleDataType ) )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:856:1: (lv_dataType_0_0= ruleDataType )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:856:1: (lv_dataType_0_0= ruleDataType )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:857:3: lv_dataType_0_0= ruleDataType
                            {
                             
                            	        newCompositeNode(grammarAccess.getMethodParameterAccess().getDataTypeDataTypeEnumRuleCall_0_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDataType_in_ruleMethodParameter1686);
                            lv_dataType_0_0=ruleDataType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getMethodParameterRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"dataType",
                                    		lv_dataType_0_0, 
                                    		"DataType");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:874:6: ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:874:6: ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:875:1: (lv_dataType_1_0= ruleDataTypeNotAdjustable )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:875:1: (lv_dataType_1_0= ruleDataTypeNotAdjustable )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:876:3: lv_dataType_1_0= ruleDataTypeNotAdjustable
                            {
                             
                            	        newCompositeNode(grammarAccess.getMethodParameterAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_0_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDataTypeNotAdjustable_in_ruleMethodParameter1713);
                            lv_dataType_1_0=ruleDataTypeNotAdjustable();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getMethodParameterRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"dataType",
                                    		lv_dataType_1_0, 
                                    		"DataTypeNotAdjustable");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:893:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:893:6: ( (otherlv_2= RULE_ID ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:894:1: (otherlv_2= RULE_ID )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:894:1: (otherlv_2= RULE_ID )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:895:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodParameterRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodParameter1740); 

                    		newLeafNode(otherlv_2, grammarAccess.getMethodParameterAccess().getDataTypeDataSetDataSetCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:906:3: ( (lv_name_3_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:907:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:907:1: (lv_name_3_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:908:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodParameter1758); 

            			newLeafNode(lv_name_3_0, grammarAccess.getMethodParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleMethodParameter"


    // $ANTLR start "entryRuleData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:932:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:933:2: (iv_ruleData= ruleData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:934:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData1799);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData1809); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:941:1: ruleData returns [EObject current=null] : (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable | this_ListData_3= ruleListData ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject this_MeasurementData_0 = null;

        EObject this_NonMeasurementData_1 = null;

        EObject this_MeasurementDataNotAdjustable_2 = null;

        EObject this_ListData_3 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:944:28: ( (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable | this_ListData_3= ruleListData ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:945:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable | this_ListData_3= ruleListData )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:945:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable | this_ListData_3= ruleListData )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:946:5: this_MeasurementData_0= ruleMeasurementData
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMeasurementData_in_ruleData1856);
                    this_MeasurementData_0=ruleMeasurementData();

                    state._fsp--;

                     
                            current = this_MeasurementData_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:956:5: this_NonMeasurementData_1= ruleNonMeasurementData
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getNonMeasurementDataParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNonMeasurementData_in_ruleData1883);
                    this_NonMeasurementData_1=ruleNonMeasurementData();

                    state._fsp--;

                     
                            current = this_NonMeasurementData_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:966:5: this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getMeasurementDataNotAdjustableParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMeasurementDataNotAdjustable_in_ruleData1910);
                    this_MeasurementDataNotAdjustable_2=ruleMeasurementDataNotAdjustable();

                    state._fsp--;

                     
                            current = this_MeasurementDataNotAdjustable_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:976:5: this_ListData_3= ruleListData
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getListDataParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleListData_in_ruleData1937);
                    this_ListData_3=ruleListData();

                    state._fsp--;

                     
                            current = this_ListData_3; 
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


    // $ANTLR start "entryRuleListData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:992:1: entryRuleListData returns [EObject current=null] : iv_ruleListData= ruleListData EOF ;
    public final EObject entryRuleListData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:993:2: (iv_ruleListData= ruleListData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:994:2: iv_ruleListData= ruleListData EOF
            {
             newCompositeNode(grammarAccess.getListDataRule()); 
            pushFollow(FOLLOW_ruleListData_in_entryRuleListData1972);
            iv_ruleListData=ruleListData();

            state._fsp--;

             current =iv_ruleListData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListData1982); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListData"


    // $ANTLR start "ruleListData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1001:1: ruleListData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' otherlv_2= 'list' otherlv_3= 'of' ( ( (lv_dataType_4_0= ruleDataType ) ) | ( (otherlv_5= RULE_ID ) ) ) ) ;
    public final EObject ruleListData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_dataType_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1004:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' otherlv_2= 'list' otherlv_3= 'of' ( ( (lv_dataType_4_0= ruleDataType ) ) | ( (otherlv_5= RULE_ID ) ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1005:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' otherlv_2= 'list' otherlv_3= 'of' ( ( (lv_dataType_4_0= ruleDataType ) ) | ( (otherlv_5= RULE_ID ) ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1005:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' otherlv_2= 'list' otherlv_3= 'of' ( ( (lv_dataType_4_0= ruleDataType ) ) | ( (otherlv_5= RULE_ID ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1005:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' otherlv_2= 'list' otherlv_3= 'of' ( ( (lv_dataType_4_0= ruleDataType ) ) | ( (otherlv_5= RULE_ID ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1005:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1006:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1006:1: (lv_name_0_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1007:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListData2024); 

            			newLeafNode(lv_name_0_0, grammarAccess.getListDataAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getListDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleListData2041); 

                	newLeafNode(otherlv_1, grammarAccess.getListDataAccess().getAsKeyword_1());
                
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleListData2053); 

                	newLeafNode(otherlv_2, grammarAccess.getListDataAccess().getListKeyword_2());
                
            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleListData2065); 

                	newLeafNode(otherlv_3, grammarAccess.getListDataAccess().getOfKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1035:1: ( ( (lv_dataType_4_0= ruleDataType ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=59 && LA22_0<=68)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1035:2: ( (lv_dataType_4_0= ruleDataType ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1035:2: ( (lv_dataType_4_0= ruleDataType ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1036:1: (lv_dataType_4_0= ruleDataType )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1036:1: (lv_dataType_4_0= ruleDataType )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1037:3: lv_dataType_4_0= ruleDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getListDataAccess().getDataTypeDataTypeEnumRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataType_in_ruleListData2087);
                    lv_dataType_4_0=ruleDataType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListDataRule());
                    	        }
                           		set(
                           			current, 
                           			"dataType",
                            		lv_dataType_4_0, 
                            		"DataType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1054:6: ( (otherlv_5= RULE_ID ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1054:6: ( (otherlv_5= RULE_ID ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1055:1: (otherlv_5= RULE_ID )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1055:1: (otherlv_5= RULE_ID )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1056:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getListDataRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListData2113); 

                    		newLeafNode(otherlv_5, grammarAccess.getListDataAccess().getDataTypeDataSetDataSetCrossReference_4_1_0()); 
                    	

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
    // $ANTLR end "ruleListData"


    // $ANTLR start "entryRuleMeasurementData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1075:1: entryRuleMeasurementData returns [EObject current=null] : iv_ruleMeasurementData= ruleMeasurementData EOF ;
    public final EObject entryRuleMeasurementData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1076:2: (iv_ruleMeasurementData= ruleMeasurementData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1077:2: iv_ruleMeasurementData= ruleMeasurementData EOF
            {
             newCompositeNode(grammarAccess.getMeasurementDataRule()); 
            pushFollow(FOLLOW_ruleMeasurementData_in_entryRuleMeasurementData2150);
            iv_ruleMeasurementData=ruleMeasurementData();

            state._fsp--;

             current =iv_ruleMeasurementData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementData2160); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1084:1: ruleMeasurementData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )? ) ;
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
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_excludedMethods_17_0=null;
        Token otherlv_18=null;
        Token lv_excludedMethods_19_0=null;
        Token lv_excludedMethods_20_0=null;
        Token otherlv_21=null;
        Token lv_excludedMethods_22_0=null;
        Token lv_description_23_0=null;
        Enumerator lv_dataType_2_0 = null;

        AntlrDatatypeRuleToken lv_unit_4_0 = null;

        EObject lv_adjustments_9_0 = null;

        EObject lv_adjustments_11_0 = null;

        EObject lv_adjustments_13_0 = null;

        EObject lv_adjustments_15_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1087:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1088:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1088:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1088:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )?
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1088:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1089:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1089:1: (lv_name_0_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1090:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeasurementData2202); 

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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleMeasurementData2219); 

                	newLeafNode(otherlv_1, grammarAccess.getMeasurementDataAccess().getAsKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1110:1: ( (lv_dataType_2_0= ruleDataType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1111:1: (lv_dataType_2_0= ruleDataType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1111:1: (lv_dataType_2_0= ruleDataType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1112:3: lv_dataType_2_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleMeasurementData2240);
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

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleMeasurementData2252); 

                	newLeafNode(otherlv_3, grammarAccess.getMeasurementDataAccess().getInKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1132:1: ( (lv_unit_4_0= ruleUNIT ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1133:1: (lv_unit_4_0= ruleUNIT )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1133:1: (lv_unit_4_0= ruleUNIT )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1134:3: lv_unit_4_0= ruleUNIT
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getUnitUNITParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleUNIT_in_ruleMeasurementData2273);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1150:2: (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1150:4: otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleMeasurementData2286); 

                        	newLeafNode(otherlv_5, grammarAccess.getMeasurementDataAccess().getWithIdentifierKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleMeasurementData2298); 

                        	newLeafNode(otherlv_6, grammarAccess.getMeasurementDataAccess().getColonKeyword_5_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1158:1: ( (lv_ID_7_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1159:1: (lv_ID_7_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1159:1: (lv_ID_7_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1160:3: lv_ID_7_0= RULE_STRING
                    {
                    lv_ID_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasurementData2315); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1176:4: ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )?
            int alt24=4;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1176:5: (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1176:5: (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1176:7: otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) )
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleMeasurementData2336); 

                        	newLeafNode(otherlv_8, grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1180:1: ( (lv_adjustments_9_0= ruleDataConversion ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1181:1: (lv_adjustments_9_0= ruleDataConversion )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1181:1: (lv_adjustments_9_0= ruleDataConversion )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1182:3: lv_adjustments_9_0= ruleDataConversion
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataConversionParserRuleCall_6_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataConversion_in_ruleMeasurementData2357);
                    lv_adjustments_9_0=ruleDataConversion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
                    	        }
                           		add(
                           			current, 
                           			"adjustments",
                            		lv_adjustments_9_0, 
                            		"DataConversion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1199:6: (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1199:6: (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1199:8: otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) )
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleMeasurementData2377); 

                        	newLeafNode(otherlv_10, grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_1_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1203:1: ( (lv_adjustments_11_0= ruleDataRange ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1204:1: (lv_adjustments_11_0= ruleDataRange )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1204:1: (lv_adjustments_11_0= ruleDataRange )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1205:3: lv_adjustments_11_0= ruleDataRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataRangeParserRuleCall_6_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataRange_in_ruleMeasurementData2398);
                    lv_adjustments_11_0=ruleDataRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
                    	        }
                           		add(
                           			current, 
                           			"adjustments",
                            		lv_adjustments_11_0, 
                            		"DataRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1222:6: (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1222:6: (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1222:8: otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) )
                    {
                    otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleMeasurementData2418); 

                        	newLeafNode(otherlv_12, grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_2_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1226:1: ( (lv_adjustments_13_0= ruleDataConversion ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1227:1: (lv_adjustments_13_0= ruleDataConversion )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1227:1: (lv_adjustments_13_0= ruleDataConversion )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1228:3: lv_adjustments_13_0= ruleDataConversion
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataConversionParserRuleCall_6_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataConversion_in_ruleMeasurementData2439);
                    lv_adjustments_13_0=ruleDataConversion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
                    	        }
                           		add(
                           			current, 
                           			"adjustments",
                            		lv_adjustments_13_0, 
                            		"DataConversion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleMeasurementData2451); 

                        	newLeafNode(otherlv_14, grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_2_2());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1248:1: ( (lv_adjustments_15_0= ruleDataRange ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1249:1: (lv_adjustments_15_0= ruleDataRange )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1249:1: (lv_adjustments_15_0= ruleDataRange )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1250:3: lv_adjustments_15_0= ruleDataRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataRangeParserRuleCall_6_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataRange_in_ruleMeasurementData2472);
                    lv_adjustments_15_0=ruleDataRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
                    	        }
                           		add(
                           			current, 
                           			"adjustments",
                            		lv_adjustments_15_0, 
                            		"DataRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1266:5: (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1266:7: otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) )
                    {
                    otherlv_16=(Token)match(input,37,FOLLOW_37_in_ruleMeasurementData2488); 

                        	newLeafNode(otherlv_16, grammarAccess.getMeasurementDataAccess().getExcludeKeyword_7_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1270:1: ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==38) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==39) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1270:2: ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1270:2: ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1270:3: ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )?
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1270:3: ( (lv_excludedMethods_17_0= 'setter' ) )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1271:1: (lv_excludedMethods_17_0= 'setter' )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1271:1: (lv_excludedMethods_17_0= 'setter' )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1272:3: lv_excludedMethods_17_0= 'setter'
                            {
                            lv_excludedMethods_17_0=(Token)match(input,38,FOLLOW_38_in_ruleMeasurementData2508); 

                                    newLeafNode(lv_excludedMethods_17_0, grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMeasurementDataRule());
                            	        }
                                   		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_17_0, "setter");
                            	    

                            }


                            }

                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1285:2: (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==18) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1285:4: otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) )
                                    {
                                    otherlv_18=(Token)match(input,18,FOLLOW_18_in_ruleMeasurementData2534); 

                                        	newLeafNode(otherlv_18, grammarAccess.getMeasurementDataAccess().getCommaKeyword_7_1_0_1_0());
                                        
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1289:1: ( (lv_excludedMethods_19_0= 'getter' ) )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1290:1: (lv_excludedMethods_19_0= 'getter' )
                                    {
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1290:1: (lv_excludedMethods_19_0= 'getter' )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1291:3: lv_excludedMethods_19_0= 'getter'
                                    {
                                    lv_excludedMethods_19_0=(Token)match(input,39,FOLLOW_39_in_ruleMeasurementData2552); 

                                            newLeafNode(lv_excludedMethods_19_0, grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_0_1_1_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getMeasurementDataRule());
                                    	        }
                                           		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_19_0, "getter");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1305:6: ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1305:6: ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1305:7: ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )?
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1305:7: ( (lv_excludedMethods_20_0= 'getter' ) )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1306:1: (lv_excludedMethods_20_0= 'getter' )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1306:1: (lv_excludedMethods_20_0= 'getter' )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1307:3: lv_excludedMethods_20_0= 'getter'
                            {
                            lv_excludedMethods_20_0=(Token)match(input,39,FOLLOW_39_in_ruleMeasurementData2593); 

                                    newLeafNode(lv_excludedMethods_20_0, grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMeasurementDataRule());
                            	        }
                                   		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_20_0, "getter");
                            	    

                            }


                            }

                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1320:2: (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==18) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1320:4: otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) )
                                    {
                                    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleMeasurementData2619); 

                                        	newLeafNode(otherlv_21, grammarAccess.getMeasurementDataAccess().getCommaKeyword_7_1_1_1_0());
                                        
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1324:1: ( (lv_excludedMethods_22_0= 'setter' ) )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1325:1: (lv_excludedMethods_22_0= 'setter' )
                                    {
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1325:1: (lv_excludedMethods_22_0= 'setter' )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1326:3: lv_excludedMethods_22_0= 'setter'
                                    {
                                    lv_excludedMethods_22_0=(Token)match(input,38,FOLLOW_38_in_ruleMeasurementData2637); 

                                            newLeafNode(lv_excludedMethods_22_0, grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_1_1_1_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getMeasurementDataRule());
                                    	        }
                                           		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_22_0, "setter");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1339:8: ( (lv_description_23_0= RULE_DESCRIPTION ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_DESCRIPTION) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1340:1: (lv_description_23_0= RULE_DESCRIPTION )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1340:1: (lv_description_23_0= RULE_DESCRIPTION )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1341:3: lv_description_23_0= RULE_DESCRIPTION
                    {
                    lv_description_23_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_ruleMeasurementData2673); 

                    			newLeafNode(lv_description_23_0, grammarAccess.getMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_23_0, 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1365:1: entryRuleNonMeasurementData returns [EObject current=null] : iv_ruleNonMeasurementData= ruleNonMeasurementData EOF ;
    public final EObject entryRuleNonMeasurementData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonMeasurementData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1366:2: (iv_ruleNonMeasurementData= ruleNonMeasurementData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1367:2: iv_ruleNonMeasurementData= ruleNonMeasurementData EOF
            {
             newCompositeNode(grammarAccess.getNonMeasurementDataRule()); 
            pushFollow(FOLLOW_ruleNonMeasurementData_in_entryRuleNonMeasurementData2715);
            iv_ruleNonMeasurementData=ruleNonMeasurementData();

            state._fsp--;

             current =iv_ruleNonMeasurementData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonMeasurementData2725); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1374:1: ruleNonMeasurementData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )? (otherlv_11= 'with identifier' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? (otherlv_14= 'exclude:' ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) ) )? ( (lv_description_21_0= RULE_DESCRIPTION ) )? ) ;
    public final EObject ruleNonMeasurementData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_constant_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_value_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_ID_13_0=null;
        Token otherlv_14=null;
        Token lv_excludedMethods_15_0=null;
        Token otherlv_16=null;
        Token lv_excludedMethods_17_0=null;
        Token lv_excludedMethods_18_0=null;
        Token otherlv_19=null;
        Token lv_excludedMethods_20_0=null;
        Token lv_description_21_0=null;
        Enumerator lv_dataType_2_0 = null;

        Enumerator lv_dataType_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1377:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )? (otherlv_11= 'with identifier' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? (otherlv_14= 'exclude:' ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) ) )? ( (lv_description_21_0= RULE_DESCRIPTION ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1378:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )? (otherlv_11= 'with identifier' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? (otherlv_14= 'exclude:' ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) ) )? ( (lv_description_21_0= RULE_DESCRIPTION ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1378:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )? (otherlv_11= 'with identifier' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? (otherlv_14= 'exclude:' ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) ) )? ( (lv_description_21_0= RULE_DESCRIPTION ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1378:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )? (otherlv_11= 'with identifier' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? (otherlv_14= 'exclude:' ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) ) )? ( (lv_description_21_0= RULE_DESCRIPTION ) )?
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1378:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1379:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1379:1: (lv_name_0_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1380:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonMeasurementData2767); 

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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleNonMeasurementData2784); 

                	newLeafNode(otherlv_1, grammarAccess.getNonMeasurementDataAccess().getAsKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1400:1: ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=59 && LA30_0<=68)) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=57 && LA30_0<=58)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1400:2: ( (lv_dataType_2_0= ruleDataType ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1400:2: ( (lv_dataType_2_0= ruleDataType ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1401:1: (lv_dataType_2_0= ruleDataType )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1401:1: (lv_dataType_2_0= ruleDataType )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1402:3: lv_dataType_2_0= ruleDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataType_in_ruleNonMeasurementData2806);
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


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1419:6: ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1419:6: ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1420:1: (lv_dataType_3_0= ruleDataTypeNotAdjustable )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1420:1: (lv_dataType_3_0= ruleDataTypeNotAdjustable )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1421:3: lv_dataType_3_0= ruleDataTypeNotAdjustable
                    {
                     
                    	        newCompositeNode(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataTypeNotAdjustable_in_ruleNonMeasurementData2833);
                    lv_dataType_3_0=ruleDataTypeNotAdjustable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		set(
                           			current, 
                           			"dataType",
                            		lv_dataType_3_0, 
                            		"DataTypeNotAdjustable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1437:3: ( ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            else if ( (LA31_0==41) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1437:4: ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1437:4: ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1437:5: ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1437:5: ( (lv_constant_4_0= 'constant' ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1438:1: (lv_constant_4_0= 'constant' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1438:1: (lv_constant_4_0= 'constant' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1439:3: lv_constant_4_0= 'constant'
                    {
                    lv_constant_4_0=(Token)match(input,40,FOLLOW_40_in_ruleNonMeasurementData2854); 

                            newLeafNode(lv_constant_4_0, grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(current, "constant", true, "constant");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleNonMeasurementData2879); 

                        	newLeafNode(otherlv_5, grammarAccess.getNonMeasurementDataAccess().getValueKeyword_3_0_1());
                        
                    otherlv_6=(Token)match(input,42,FOLLOW_42_in_ruleNonMeasurementData2891); 

                        	newLeafNode(otherlv_6, grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_3_0_2());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1460:1: ( (lv_value_7_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1461:1: (lv_value_7_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1461:1: (lv_value_7_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1462:3: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasurementData2908); 

                    			newLeafNode(lv_value_7_0, grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_3_0_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1479:6: (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1479:6: (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1479:8: otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleNonMeasurementData2933); 

                        	newLeafNode(otherlv_8, grammarAccess.getNonMeasurementDataAccess().getValueKeyword_3_1_0());
                        
                    otherlv_9=(Token)match(input,42,FOLLOW_42_in_ruleNonMeasurementData2945); 

                        	newLeafNode(otherlv_9, grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_3_1_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1487:1: ( (lv_value_10_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1488:1: (lv_value_10_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1488:1: (lv_value_10_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1489:3: lv_value_10_0= RULE_STRING
                    {
                    lv_value_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasurementData2962); 

                    			newLeafNode(lv_value_10_0, grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_3_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1505:5: (otherlv_11= 'with identifier' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==13) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1505:7: otherlv_11= 'with identifier' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleNonMeasurementData2983); 

                        	newLeafNode(otherlv_11, grammarAccess.getNonMeasurementDataAccess().getWithIdentifierKeyword_4_0());
                        
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleNonMeasurementData2995); 

                        	newLeafNode(otherlv_12, grammarAccess.getNonMeasurementDataAccess().getColonKeyword_4_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1513:1: ( (lv_ID_13_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1514:1: (lv_ID_13_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1514:1: (lv_ID_13_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1515:3: lv_ID_13_0= RULE_STRING
                    {
                    lv_ID_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasurementData3012); 

                    			newLeafNode(lv_ID_13_0, grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_13_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1531:4: (otherlv_14= 'exclude:' ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1531:6: otherlv_14= 'exclude:' ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) )
                    {
                    otherlv_14=(Token)match(input,37,FOLLOW_37_in_ruleNonMeasurementData3032); 

                        	newLeafNode(otherlv_14, grammarAccess.getNonMeasurementDataAccess().getExcludeKeyword_5_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1535:1: ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==38) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==39) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1535:2: ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1535:2: ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1535:3: ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )?
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1535:3: ( (lv_excludedMethods_15_0= 'setter' ) )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1536:1: (lv_excludedMethods_15_0= 'setter' )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1536:1: (lv_excludedMethods_15_0= 'setter' )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1537:3: lv_excludedMethods_15_0= 'setter'
                            {
                            lv_excludedMethods_15_0=(Token)match(input,38,FOLLOW_38_in_ruleNonMeasurementData3052); 

                                    newLeafNode(lv_excludedMethods_15_0, grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_5_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                            	        }
                                   		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_15_0, "setter");
                            	    

                            }


                            }

                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1550:2: (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==18) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1550:4: otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) )
                                    {
                                    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleNonMeasurementData3078); 

                                        	newLeafNode(otherlv_16, grammarAccess.getNonMeasurementDataAccess().getCommaKeyword_5_1_0_1_0());
                                        
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1554:1: ( (lv_excludedMethods_17_0= 'getter' ) )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1555:1: (lv_excludedMethods_17_0= 'getter' )
                                    {
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1555:1: (lv_excludedMethods_17_0= 'getter' )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1556:3: lv_excludedMethods_17_0= 'getter'
                                    {
                                    lv_excludedMethods_17_0=(Token)match(input,39,FOLLOW_39_in_ruleNonMeasurementData3096); 

                                            newLeafNode(lv_excludedMethods_17_0, grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_5_1_0_1_1_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                                    	        }
                                           		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_17_0, "getter");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1570:6: ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1570:6: ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1570:7: ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )?
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1570:7: ( (lv_excludedMethods_18_0= 'getter' ) )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1571:1: (lv_excludedMethods_18_0= 'getter' )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1571:1: (lv_excludedMethods_18_0= 'getter' )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1572:3: lv_excludedMethods_18_0= 'getter'
                            {
                            lv_excludedMethods_18_0=(Token)match(input,39,FOLLOW_39_in_ruleNonMeasurementData3137); 

                                    newLeafNode(lv_excludedMethods_18_0, grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_5_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                            	        }
                                   		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_18_0, "getter");
                            	    

                            }


                            }

                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1585:2: (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==18) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1585:4: otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) )
                                    {
                                    otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleNonMeasurementData3163); 

                                        	newLeafNode(otherlv_19, grammarAccess.getNonMeasurementDataAccess().getCommaKeyword_5_1_1_1_0());
                                        
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1589:1: ( (lv_excludedMethods_20_0= 'setter' ) )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1590:1: (lv_excludedMethods_20_0= 'setter' )
                                    {
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1590:1: (lv_excludedMethods_20_0= 'setter' )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1591:3: lv_excludedMethods_20_0= 'setter'
                                    {
                                    lv_excludedMethods_20_0=(Token)match(input,38,FOLLOW_38_in_ruleNonMeasurementData3181); 

                                            newLeafNode(lv_excludedMethods_20_0, grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_5_1_1_1_1_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                                    	        }
                                           		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_20_0, "setter");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1604:8: ( (lv_description_21_0= RULE_DESCRIPTION ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_DESCRIPTION) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1605:1: (lv_description_21_0= RULE_DESCRIPTION )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1605:1: (lv_description_21_0= RULE_DESCRIPTION )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1606:3: lv_description_21_0= RULE_DESCRIPTION
                    {
                    lv_description_21_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_ruleNonMeasurementData3217); 

                    			newLeafNode(lv_description_21_0, grammarAccess.getNonMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_21_0, 
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


    // $ANTLR start "entryRuleMeasurementDataNotAdjustable"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1630:1: entryRuleMeasurementDataNotAdjustable returns [EObject current=null] : iv_ruleMeasurementDataNotAdjustable= ruleMeasurementDataNotAdjustable EOF ;
    public final EObject entryRuleMeasurementDataNotAdjustable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementDataNotAdjustable = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1631:2: (iv_ruleMeasurementDataNotAdjustable= ruleMeasurementDataNotAdjustable EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1632:2: iv_ruleMeasurementDataNotAdjustable= ruleMeasurementDataNotAdjustable EOF
            {
             newCompositeNode(grammarAccess.getMeasurementDataNotAdjustableRule()); 
            pushFollow(FOLLOW_ruleMeasurementDataNotAdjustable_in_entryRuleMeasurementDataNotAdjustable3259);
            iv_ruleMeasurementDataNotAdjustable=ruleMeasurementDataNotAdjustable();

            state._fsp--;

             current =iv_ruleMeasurementDataNotAdjustable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementDataNotAdjustable3269); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasurementDataNotAdjustable"


    // $ANTLR start "ruleMeasurementDataNotAdjustable"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1639:1: ruleMeasurementDataNotAdjustable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )? ) ;
    public final EObject ruleMeasurementDataNotAdjustable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_ID_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_excludedMethods_10_0=null;
        Token otherlv_11=null;
        Token lv_excludedMethods_12_0=null;
        Token lv_excludedMethods_13_0=null;
        Token otherlv_14=null;
        Token lv_excludedMethods_15_0=null;
        Token lv_description_16_0=null;
        Enumerator lv_dataType_2_0 = null;

        AntlrDatatypeRuleToken lv_unit_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1642:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1643:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1643:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1643:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )?
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1643:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1644:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1644:1: (lv_name_0_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1645:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeasurementDataNotAdjustable3311); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMeasurementDataNotAdjustableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasurementDataNotAdjustableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleMeasurementDataNotAdjustable3328); 

                	newLeafNode(otherlv_1, grammarAccess.getMeasurementDataNotAdjustableAccess().getAsKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1665:1: ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1666:1: (lv_dataType_2_0= ruleDataTypeNotAdjustable )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1666:1: (lv_dataType_2_0= ruleDataTypeNotAdjustable )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1667:3: lv_dataType_2_0= ruleDataTypeNotAdjustable
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDataTypeNotAdjustable_in_ruleMeasurementDataNotAdjustable3349);
            lv_dataType_2_0=ruleDataTypeNotAdjustable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasurementDataNotAdjustableRule());
            	        }
                   		set(
                   			current, 
                   			"dataType",
                    		lv_dataType_2_0, 
                    		"DataTypeNotAdjustable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleMeasurementDataNotAdjustable3361); 

                	newLeafNode(otherlv_3, grammarAccess.getMeasurementDataNotAdjustableAccess().getInKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1687:1: ( (lv_unit_4_0= ruleUNIT ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1688:1: (lv_unit_4_0= ruleUNIT )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1688:1: (lv_unit_4_0= ruleUNIT )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1689:3: lv_unit_4_0= ruleUNIT
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitUNITParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleUNIT_in_ruleMeasurementDataNotAdjustable3382);
            lv_unit_4_0=ruleUNIT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasurementDataNotAdjustableRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_4_0, 
                    		"UNIT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1705:2: (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==13) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1705:4: otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleMeasurementDataNotAdjustable3395); 

                        	newLeafNode(otherlv_5, grammarAccess.getMeasurementDataNotAdjustableAccess().getWithIdentifierKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleMeasurementDataNotAdjustable3407); 

                        	newLeafNode(otherlv_6, grammarAccess.getMeasurementDataNotAdjustableAccess().getColonKeyword_5_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1713:1: ( (lv_ID_7_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1714:1: (lv_ID_7_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1714:1: (lv_ID_7_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1715:3: lv_ID_7_0= RULE_STRING
                    {
                    lv_ID_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasurementDataNotAdjustable3424); 

                    			newLeafNode(lv_ID_7_0, grammarAccess.getMeasurementDataNotAdjustableAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasurementDataNotAdjustableRule());
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1731:4: (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1731:6: otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) )
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_43_in_ruleMeasurementDataNotAdjustable3444); 

                        	newLeafNode(otherlv_8, grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludeKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleMeasurementDataNotAdjustable3456); 

                        	newLeafNode(otherlv_9, grammarAccess.getMeasurementDataNotAdjustableAccess().getColonKeyword_6_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1739:1: ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==38) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==39) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1739:2: ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1739:2: ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1739:3: ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )?
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1739:3: ( (lv_excludedMethods_10_0= 'setter' ) )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1740:1: (lv_excludedMethods_10_0= 'setter' )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1740:1: (lv_excludedMethods_10_0= 'setter' )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1741:3: lv_excludedMethods_10_0= 'setter'
                            {
                            lv_excludedMethods_10_0=(Token)match(input,38,FOLLOW_38_in_ruleMeasurementDataNotAdjustable3476); 

                                    newLeafNode(lv_excludedMethods_10_0, grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMeasurementDataNotAdjustableRule());
                            	        }
                                   		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_10_0, "setter");
                            	    

                            }


                            }

                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1754:2: (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )?
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==18) ) {
                                alt39=1;
                            }
                            switch (alt39) {
                                case 1 :
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1754:4: otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) )
                                    {
                                    otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleMeasurementDataNotAdjustable3502); 

                                        	newLeafNode(otherlv_11, grammarAccess.getMeasurementDataNotAdjustableAccess().getCommaKeyword_6_2_0_1_0());
                                        
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1758:1: ( (lv_excludedMethods_12_0= 'getter' ) )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1759:1: (lv_excludedMethods_12_0= 'getter' )
                                    {
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1759:1: (lv_excludedMethods_12_0= 'getter' )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1760:3: lv_excludedMethods_12_0= 'getter'
                                    {
                                    lv_excludedMethods_12_0=(Token)match(input,39,FOLLOW_39_in_ruleMeasurementDataNotAdjustable3520); 

                                            newLeafNode(lv_excludedMethods_12_0, grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_0_1_1_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getMeasurementDataNotAdjustableRule());
                                    	        }
                                           		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_12_0, "getter");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1774:6: ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1774:6: ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1774:7: ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )?
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1774:7: ( (lv_excludedMethods_13_0= 'getter' ) )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1775:1: (lv_excludedMethods_13_0= 'getter' )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1775:1: (lv_excludedMethods_13_0= 'getter' )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1776:3: lv_excludedMethods_13_0= 'getter'
                            {
                            lv_excludedMethods_13_0=(Token)match(input,39,FOLLOW_39_in_ruleMeasurementDataNotAdjustable3561); 

                                    newLeafNode(lv_excludedMethods_13_0, grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMeasurementDataNotAdjustableRule());
                            	        }
                                   		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_13_0, "getter");
                            	    

                            }


                            }

                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1789:2: (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )?
                            int alt40=2;
                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==18) ) {
                                alt40=1;
                            }
                            switch (alt40) {
                                case 1 :
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1789:4: otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) )
                                    {
                                    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleMeasurementDataNotAdjustable3587); 

                                        	newLeafNode(otherlv_14, grammarAccess.getMeasurementDataNotAdjustableAccess().getCommaKeyword_6_2_1_1_0());
                                        
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1793:1: ( (lv_excludedMethods_15_0= 'setter' ) )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1794:1: (lv_excludedMethods_15_0= 'setter' )
                                    {
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1794:1: (lv_excludedMethods_15_0= 'setter' )
                                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1795:3: lv_excludedMethods_15_0= 'setter'
                                    {
                                    lv_excludedMethods_15_0=(Token)match(input,38,FOLLOW_38_in_ruleMeasurementDataNotAdjustable3605); 

                                            newLeafNode(lv_excludedMethods_15_0, grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_1_1_1_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getMeasurementDataNotAdjustableRule());
                                    	        }
                                           		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_15_0, "setter");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1808:8: ( (lv_description_16_0= RULE_DESCRIPTION ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_DESCRIPTION) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1809:1: (lv_description_16_0= RULE_DESCRIPTION )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1809:1: (lv_description_16_0= RULE_DESCRIPTION )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1810:3: lv_description_16_0= RULE_DESCRIPTION
                    {
                    lv_description_16_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_ruleMeasurementDataNotAdjustable3641); 

                    			newLeafNode(lv_description_16_0, grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionDESCRIPTIONTerminalRuleCall_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasurementDataNotAdjustableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_16_0, 
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
    // $ANTLR end "ruleMeasurementDataNotAdjustable"


    // $ANTLR start "entryRuleDataRange"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1834:1: entryRuleDataRange returns [EObject current=null] : iv_ruleDataRange= ruleDataRange EOF ;
    public final EObject entryRuleDataRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataRange = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1835:2: (iv_ruleDataRange= ruleDataRange EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1836:2: iv_ruleDataRange= ruleDataRange EOF
            {
             newCompositeNode(grammarAccess.getDataRangeRule()); 
            pushFollow(FOLLOW_ruleDataRange_in_entryRuleDataRange3683);
            iv_ruleDataRange=ruleDataRange();

            state._fsp--;

             current =iv_ruleDataRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataRange3693); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1843:1: ruleDataRange returns [EObject current=null] : (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) ) ;
    public final EObject ruleDataRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_range_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1846:28: ( (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1847:1: (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1847:1: (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1847:3: otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleDataRange3730); 

                	newLeafNode(otherlv_0, grammarAccess.getDataRangeAccess().getWithRangeKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1851:1: ( (lv_range_1_0= ruleInterval ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1852:1: (lv_range_1_0= ruleInterval )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1852:1: (lv_range_1_0= ruleInterval )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1853:3: lv_range_1_0= ruleInterval
            {
             
            	        newCompositeNode(grammarAccess.getDataRangeAccess().getRangeIntervalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInterval_in_ruleDataRange3751);
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1877:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1878:2: (iv_ruleInterval= ruleInterval EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1879:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_ruleInterval_in_entryRuleInterval3787);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterval3797); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1886:1: ruleInterval returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1889:28: ( (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1890:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1890:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1890:3: otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleInterval3834); 

                	newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1894:1: ( (lv_lowerBound_1_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1895:1: (lv_lowerBound_1_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1895:1: (lv_lowerBound_1_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1896:3: lv_lowerBound_1_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleInterval3855);
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

            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleInterval3867); 

                	newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getSemicolonKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1916:1: ( (lv_upperBound_3_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1917:1: (lv_upperBound_3_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1917:1: (lv_upperBound_3_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1918:3: lv_upperBound_3_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleInterval3888);
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

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleInterval3900); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1946:1: entryRuleDataConversion returns [EObject current=null] : iv_ruleDataConversion= ruleDataConversion EOF ;
    public final EObject entryRuleDataConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataConversion = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1947:2: (iv_ruleDataConversion= ruleDataConversion EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1948:2: iv_ruleDataConversion= ruleDataConversion EOF
            {
             newCompositeNode(grammarAccess.getDataConversionRule()); 
            pushFollow(FOLLOW_ruleDataConversion_in_entryRuleDataConversion3936);
            iv_ruleDataConversion=ruleDataConversion();

            state._fsp--;

             current =iv_ruleDataConversion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataConversion3946); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1955:1: ruleDataConversion returns [EObject current=null] : (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval ) ;
    public final EObject ruleDataConversion() throws RecognitionException {
        EObject current = null;

        EObject this_LinearDataConversion_0 = null;

        EObject this_LinearDataConversionWithInterval_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1958:28: ( (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1959:1: (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1959:1: (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            else if ( (LA44_0==50) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1960:5: this_LinearDataConversion_0= ruleLinearDataConversion
                    {
                     
                            newCompositeNode(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLinearDataConversion_in_ruleDataConversion3993);
                    this_LinearDataConversion_0=ruleLinearDataConversion();

                    state._fsp--;

                     
                            current = this_LinearDataConversion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1970:5: this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval
                    {
                     
                            newCompositeNode(grammarAccess.getDataConversionAccess().getLinearDataConversionWithIntervalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLinearDataConversionWithInterval_in_ruleDataConversion4020);
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1986:1: entryRuleLinearDataConversion returns [EObject current=null] : iv_ruleLinearDataConversion= ruleLinearDataConversion EOF ;
    public final EObject entryRuleLinearDataConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearDataConversion = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1987:2: (iv_ruleLinearDataConversion= ruleLinearDataConversion EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1988:2: iv_ruleLinearDataConversion= ruleLinearDataConversion EOF
            {
             newCompositeNode(grammarAccess.getLinearDataConversionRule()); 
            pushFollow(FOLLOW_ruleLinearDataConversion_in_entryRuleLinearDataConversion4055);
            iv_ruleLinearDataConversion=ruleLinearDataConversion();

            state._fsp--;

             current =iv_ruleLinearDataConversion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinearDataConversion4065); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1995:1: ruleLinearDataConversion returns [EObject current=null] : (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) ) ;
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
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1998:28: ( (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1999:1: (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1999:1: (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1999:3: otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleLinearDataConversion4102); 

                	newLeafNode(otherlv_0, grammarAccess.getLinearDataConversionAccess().getWithScalingFactorKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleLinearDataConversion4114); 

                	newLeafNode(otherlv_1, grammarAccess.getLinearDataConversionAccess().getColonKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2007:1: ( (lv_scalingFactor_2_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2008:1: (lv_scalingFactor_2_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2008:1: (lv_scalingFactor_2_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2009:3: lv_scalingFactor_2_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion4135);
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

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleLinearDataConversion4147); 

                	newLeafNode(otherlv_3, grammarAccess.getLinearDataConversionAccess().getAndOffsetKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleLinearDataConversion4159); 

                	newLeafNode(otherlv_4, grammarAccess.getLinearDataConversionAccess().getColonKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2033:1: ( (lv_offset_5_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2034:1: (lv_offset_5_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2034:1: (lv_offset_5_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2035:3: lv_offset_5_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLinearDataConversionAccess().getOffsetDOUBLEParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion4180);
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2059:1: entryRuleLinearDataConversionWithInterval returns [EObject current=null] : iv_ruleLinearDataConversionWithInterval= ruleLinearDataConversionWithInterval EOF ;
    public final EObject entryRuleLinearDataConversionWithInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearDataConversionWithInterval = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2060:2: (iv_ruleLinearDataConversionWithInterval= ruleLinearDataConversionWithInterval EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2061:2: iv_ruleLinearDataConversionWithInterval= ruleLinearDataConversionWithInterval EOF
            {
             newCompositeNode(grammarAccess.getLinearDataConversionWithIntervalRule()); 
            pushFollow(FOLLOW_ruleLinearDataConversionWithInterval_in_entryRuleLinearDataConversionWithInterval4216);
            iv_ruleLinearDataConversionWithInterval=ruleLinearDataConversionWithInterval();

            state._fsp--;

             current =iv_ruleLinearDataConversionWithInterval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinearDataConversionWithInterval4226); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2068:1: ruleLinearDataConversionWithInterval returns [EObject current=null] : (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) ) ) ;
    public final EObject ruleLinearDataConversionWithInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fromInterval_1_0 = null;

        EObject lv_toInterval_3_0 = null;

        Enumerator lv_dataType_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2071:28: ( (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2072:1: (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2072:1: (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2072:3: otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleLinearDataConversionWithInterval4263); 

                	newLeafNode(otherlv_0, grammarAccess.getLinearDataConversionWithIntervalAccess().getByLinearMappingKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2076:1: ( (lv_fromInterval_1_0= ruleInterval ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2077:1: (lv_fromInterval_1_0= ruleInterval )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2077:1: (lv_fromInterval_1_0= ruleInterval )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2078:3: lv_fromInterval_1_0= ruleInterval
            {
             
            	        newCompositeNode(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalIntervalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInterval_in_ruleLinearDataConversionWithInterval4284);
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

            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleLinearDataConversionWithInterval4296); 

                	newLeafNode(otherlv_2, grammarAccess.getLinearDataConversionWithIntervalAccess().getEqualsSignGreaterThanSignKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2098:1: ( (lv_toInterval_3_0= ruleInterval ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2099:1: (lv_toInterval_3_0= ruleInterval )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2099:1: (lv_toInterval_3_0= ruleInterval )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2100:3: lv_toInterval_3_0= ruleInterval
            {
             
            	        newCompositeNode(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalIntervalParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleInterval_in_ruleLinearDataConversionWithInterval4317);
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

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleLinearDataConversionWithInterval4329); 

                	newLeafNode(otherlv_4, grammarAccess.getLinearDataConversionWithIntervalAccess().getAsKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2120:1: ( (lv_dataType_5_0= ruleDataType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2121:1: (lv_dataType_5_0= ruleDataType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2121:1: (lv_dataType_5_0= ruleDataType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2122:3: lv_dataType_5_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeDataTypeEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleLinearDataConversionWithInterval4350);
            lv_dataType_5_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinearDataConversionWithIntervalRule());
            	        }
                   		set(
                   			current, 
                   			"dataType",
                    		lv_dataType_5_0, 
                    		"DataType");
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2146:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2147:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2148:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE4387);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE4398); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2155:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2158:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2159:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2159:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2159:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE4438); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2166:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==52) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2167:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleDOUBLE4457); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE4472); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2187:1: entryRuleUNIT returns [String current=null] : iv_ruleUNIT= ruleUNIT EOF ;
    public final String entryRuleUNIT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNIT = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2188:2: (iv_ruleUNIT= ruleUNIT EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2189:2: iv_ruleUNIT= ruleUNIT EOF
            {
             newCompositeNode(grammarAccess.getUNITRule()); 
            pushFollow(FOLLOW_ruleUNIT_in_entryRuleUNIT4520);
            iv_ruleUNIT=ruleUNIT();

            state._fsp--;

             current =iv_ruleUNIT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNIT4531); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2196:1: ruleUNIT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* ) ;
    public final AntlrDatatypeRuleToken ruleUNIT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2199:28: ( ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2200:1: ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2200:1: ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2200:2: (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )*
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2200:2: (this_ID_0= RULE_ID )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    int LA46_2 = input.LA(2);

                    if ( (LA46_2==EOF||(LA46_2>=RULE_ID && LA46_2<=RULE_DESCRIPTION)||LA46_2==RULE_ANY_OTHER||LA46_2==13||LA46_2==16||(LA46_2>=25 && LA46_2<=28)||(LA46_2>=36 && LA46_2<=37)||LA46_2==43) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2200:7: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUNIT4572); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getUNITAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2207:3: (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ANY_OTHER) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2207:8: this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )*
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleUNIT4595); 

            	    		current.merge(this_ANY_OTHER_1);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_1, grammarAccess.getUNITAccess().getANY_OTHERTerminalRuleCall_1_0()); 
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2214:1: (this_ID_2= RULE_ID )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==RULE_ID) ) {
            	            int LA47_2 = input.LA(2);

            	            if ( (LA47_2==EOF||(LA47_2>=RULE_ID && LA47_2<=RULE_DESCRIPTION)||LA47_2==RULE_ANY_OTHER||LA47_2==13||LA47_2==16||(LA47_2>=25 && LA47_2<=28)||(LA47_2>=36 && LA47_2<=37)||LA47_2==43) ) {
            	                alt47=1;
            	            }


            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2214:6: this_ID_2= RULE_ID
            	    	    {
            	    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUNIT4616); 

            	    	    		current.merge(this_ID_2);
            	    	        
            	    	     
            	    	        newLeafNode(this_ID_2, grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);


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
    // $ANTLR end "ruleUNIT"


    // $ANTLR start "ruleCoding"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2229:1: ruleCoding returns [Enumerator current=null] : ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) ) ;
    public final Enumerator ruleCoding() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2231:28: ( ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2232:1: ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2232:1: ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==53) ) {
                alt49=1;
            }
            else if ( (LA49_0==54) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2232:2: (enumLiteral_0= 'SENSIDL_BINARY' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2232:2: (enumLiteral_0= 'SENSIDL_BINARY' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2232:4: enumLiteral_0= 'SENSIDL_BINARY'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleCoding4679); 

                            current = grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2238:6: (enumLiteral_1= 'SENSIDL_JSON' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2238:6: (enumLiteral_1= 'SENSIDL_JSON' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2238:8: enumLiteral_1= 'SENSIDL_JSON'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_ruleCoding4696); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2248:1: ruleEndianness returns [Enumerator current=null] : ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) ;
    public final Enumerator ruleEndianness() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2250:28: ( ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2251:1: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2251:1: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==55) ) {
                alt50=1;
            }
            else if ( (LA50_0==56) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2251:2: (enumLiteral_0= 'BIG_ENDIAN' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2251:2: (enumLiteral_0= 'BIG_ENDIAN' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2251:4: enumLiteral_0= 'BIG_ENDIAN'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleEndianness4741); 

                            current = grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2257:6: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2257:6: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2257:8: enumLiteral_1= 'LITTLE_ENDIAN'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleEndianness4758); 

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


    // $ANTLR start "ruleDataTypeNotAdjustable"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2267:1: ruleDataTypeNotAdjustable returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) ) ;
    public final Enumerator ruleDataTypeNotAdjustable() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2269:28: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2270:1: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2270:1: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==57) ) {
                alt51=1;
            }
            else if ( (LA51_0==58) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2270:2: (enumLiteral_0= 'STRING' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2270:2: (enumLiteral_0= 'STRING' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2270:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleDataTypeNotAdjustable4803); 

                            current = grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2276:6: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2276:6: (enumLiteral_1= 'BOOLEAN' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2276:8: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleDataTypeNotAdjustable4820); 

                            current = grammarAccess.getDataTypeNotAdjustableAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypeNotAdjustableAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleDataTypeNotAdjustable"


    // $ANTLR start "ruleDataType"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2286:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) ) ;
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

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2288:28: ( ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2289:1: ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2289:1: ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) )
            int alt52=10;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt52=1;
                }
                break;
            case 60:
                {
                alt52=2;
                }
                break;
            case 61:
                {
                alt52=3;
                }
                break;
            case 62:
                {
                alt52=4;
                }
                break;
            case 63:
                {
                alt52=5;
                }
                break;
            case 64:
                {
                alt52=6;
                }
                break;
            case 65:
                {
                alt52=7;
                }
                break;
            case 66:
                {
                alt52=8;
                }
                break;
            case 67:
                {
                alt52=9;
                }
                break;
            case 68:
                {
                alt52=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2289:2: (enumLiteral_0= 'INT8' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2289:2: (enumLiteral_0= 'INT8' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2289:4: enumLiteral_0= 'INT8'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleDataType4865); 

                            current = grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2295:6: (enumLiteral_1= 'UINT8' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2295:6: (enumLiteral_1= 'UINT8' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2295:8: enumLiteral_1= 'UINT8'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleDataType4882); 

                            current = grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2301:6: (enumLiteral_2= 'INT16' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2301:6: (enumLiteral_2= 'INT16' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2301:8: enumLiteral_2= 'INT16'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_61_in_ruleDataType4899); 

                            current = grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2307:6: (enumLiteral_3= 'UINT16' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2307:6: (enumLiteral_3= 'UINT16' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2307:8: enumLiteral_3= 'UINT16'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_62_in_ruleDataType4916); 

                            current = grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2313:6: (enumLiteral_4= 'INT32' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2313:6: (enumLiteral_4= 'INT32' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2313:8: enumLiteral_4= 'INT32'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_63_in_ruleDataType4933); 

                            current = grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2319:6: (enumLiteral_5= 'UINT32' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2319:6: (enumLiteral_5= 'UINT32' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2319:8: enumLiteral_5= 'UINT32'
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_64_in_ruleDataType4950); 

                            current = grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2325:6: (enumLiteral_6= 'INT64' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2325:6: (enumLiteral_6= 'INT64' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2325:8: enumLiteral_6= 'INT64'
                    {
                    enumLiteral_6=(Token)match(input,65,FOLLOW_65_in_ruleDataType4967); 

                            current = grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2331:6: (enumLiteral_7= 'UINT64' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2331:6: (enumLiteral_7= 'UINT64' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2331:8: enumLiteral_7= 'UINT64'
                    {
                    enumLiteral_7=(Token)match(input,66,FOLLOW_66_in_ruleDataType4984); 

                            current = grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2337:6: (enumLiteral_8= 'FLOAT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2337:6: (enumLiteral_8= 'FLOAT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2337:8: enumLiteral_8= 'FLOAT'
                    {
                    enumLiteral_8=(Token)match(input,67,FOLLOW_67_in_ruleDataType5001); 

                            current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2343:6: (enumLiteral_9= 'DOUBLE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2343:6: (enumLiteral_9= 'DOUBLE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2343:8: enumLiteral_9= 'DOUBLE'
                    {
                    enumLiteral_9=(Token)match(input,68,FOLLOW_68_in_ruleDataType5018); 

                            current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 
                        

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


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA21_eotS =
        "\23\uffff";
    static final String DFA21_eofS =
        "\3\uffff\14\21\4\uffff";
    static final String DFA21_minS =
        "\1\4\1\37\1\41\14\4\4\uffff";
    static final String DFA21_maxS =
        "\1\4\1\37\1\104\14\51\4\uffff";
    static final String DFA21_acceptS =
        "\17\uffff\1\4\1\3\1\2\1\1";
    static final String DFA21_specialS =
        "\23\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1",
            "\1\2",
            "\1\17\27\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
            "\1\15\1\16",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\20"+
            "\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\20"+
            "\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22"+
            "\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22"+
            "\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22"+
            "\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22"+
            "\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22"+
            "\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22"+
            "\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22"+
            "\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22"+
            "\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22"+
            "\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22"+
            "\1\uffff\1\21\2\uffff\2\21",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "945:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable | this_ListData_3= ruleListData )";
        }
    }
    static final String DFA24_eotS =
        "\57\uffff";
    static final String DFA24_eofS =
        "\1\2\21\uffff\1\27\7\uffff\1\27\12\uffff\12\27";
    static final String DFA24_minS =
        "\1\4\1\54\1\uffff\1\16\1\55\1\uffff\2\7\1\61\1\56\1\7\1\16\2\7"+
        "\1\61\1\7\1\56\1\57\1\4\1\7\1\63\1\7\2\uffff\1\57\1\55\1\4\1\7\1"+
        "\56\2\7\1\56\1\57\1\7\1\37\1\57\1\73\12\4";
    static final String DFA24_maxS =
        "\1\45\1\62\1\uffff\1\16\1\55\1\uffff\2\7\2\64\1\7\1\16\2\7\1\61"+
        "\1\7\1\56\2\64\1\7\1\63\1\7\2\uffff\1\57\1\55\1\45\1\7\1\64\2\7"+
        "\1\56\1\64\1\7\1\37\1\57\1\104\12\45";
    static final String DFA24_acceptS =
        "\2\uffff\1\4\2\uffff\1\2\20\uffff\1\3\1\1\27\uffff";
    static final String DFA24_specialS =
        "\57\uffff}>";
    static final String[] DFA24_transitionS = {
            "\2\2\12\uffff\1\2\10\uffff\4\2\7\uffff\1\1\1\2",
            "\1\5\3\uffff\1\3\1\uffff\1\4",
            "",
            "\1\6",
            "\1\7",
            "",
            "\1\10",
            "\1\11",
            "\1\13\2\uffff\1\12",
            "\1\15\5\uffff\1\14",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\13",
            "\1\22",
            "\1\15",
            "\1\24\4\uffff\1\23",
            "\2\27\12\uffff\1\27\1\uffff\1\26\6\uffff\4\27\10\uffff\1\27"+
            "\16\uffff\1\25",
            "\1\30",
            "\1\31",
            "\1\32",
            "",
            "",
            "\1\24",
            "\1\33",
            "\2\27\12\uffff\1\27\1\uffff\1\26\6\uffff\4\27\10\uffff\1\27",
            "\1\34",
            "\1\36\5\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\36",
            "\1\42\4\uffff\1\41",
            "\1\43",
            "\1\44",
            "\1\42",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56",
            "\2\27\12\uffff\1\27\1\uffff\1\26\6\uffff\4\27\10\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\6\uffff\4\27\10\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\6\uffff\4\27\10\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\6\uffff\4\27\10\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\6\uffff\4\27\10\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\6\uffff\4\27\10\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\6\uffff\4\27\10\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\6\uffff\4\27\10\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\6\uffff\4\27\10\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\6\uffff\4\27\10\uffff\1\27"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1176:4: ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )?";
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
    public static final BitSet FOLLOW_14_in_ruleEncodingSettings377 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_ruleCoding_in_ruleEncodingSettings398 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEncodingSettings410 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEncodingSettings422 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEncodingSettings434 = new BitSet(new long[]{0x0180000000000000L});
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
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSet861 = new BitSet(new long[]{0x000000000104A020L});
    public static final BitSet FOLLOW_24_in_ruleDataSet879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSet899 = new BitSet(new long[]{0x000000000004A020L});
    public static final BitSet FOLLOW_18_in_ruleDataSet914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSet934 = new BitSet(new long[]{0x000000000004A020L});
    public static final BitSet FOLLOW_13_in_ruleDataSet949 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataSet961 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataSet978 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_ruleDataSet1002 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataSet1020 = new BitSet(new long[]{0x000000001E010010L});
    public static final BitSet FOLLOW_ruleData_in_ruleDataSet1042 = new BitSet(new long[]{0x000000001E010010L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleDataSet1069 = new BitSet(new long[]{0x000000001E010010L});
    public static final BitSet FOLLOW_16_in_ruleDataSet1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMethod1173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26_in_ruleMethod1210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_27_in_ruleMethod1247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28_in_ruleMethod1284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod1316 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMethod1333 = new BitSet(new long[]{0xFE00000040040010L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleMethodParameter_in_ruleMethod1354 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_18_in_ruleMethod1368 = new BitSet(new long[]{0xFE00000000000010L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleMethodParameter_in_ruleMethod1389 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_30_in_ruleMethod1403 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_14_in_ruleMethod1416 = new BitSet(new long[]{0xFE00000000000010L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleDataType_in_ruleMethod1439 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleDataTypeNotAdjustable_in_ruleMethod1466 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod1493 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMethod1508 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleMethod1520 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_13_in_ruleMethod1533 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMethod1545 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMethod1562 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_ruleMethod1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodParameter_in_entryRuleMethodParameter1628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodParameter1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleMethodParameter1686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataTypeNotAdjustable_in_ruleMethodParameter1713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodParameter1740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodParameter1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData1799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementData_in_ruleData1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasurementData_in_ruleData1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementDataNotAdjustable_in_ruleData1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListData_in_ruleData1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListData_in_entryRuleListData1972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListData1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListData2024 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleListData2041 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleListData2053 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleListData2065 = new BitSet(new long[]{0xF800000000000010L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleDataType_in_ruleListData2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListData2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementData_in_entryRuleMeasurementData2150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementData2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeasurementData2202 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMeasurementData2219 = new BitSet(new long[]{0xF800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleDataType_in_ruleMeasurementData2240 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleMeasurementData2252 = new BitSet(new long[]{0x0000003000002130L});
    public static final BitSet FOLLOW_ruleUNIT_in_ruleMeasurementData2273 = new BitSet(new long[]{0x0000003000002022L});
    public static final BitSet FOLLOW_13_in_ruleMeasurementData2286 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMeasurementData2298 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasurementData2315 = new BitSet(new long[]{0x0000003000000022L});
    public static final BitSet FOLLOW_36_in_ruleMeasurementData2336 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_ruleDataConversion_in_ruleMeasurementData2357 = new BitSet(new long[]{0x0000002000000022L});
    public static final BitSet FOLLOW_36_in_ruleMeasurementData2377 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleDataRange_in_ruleMeasurementData2398 = new BitSet(new long[]{0x0000002000000022L});
    public static final BitSet FOLLOW_36_in_ruleMeasurementData2418 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_ruleDataConversion_in_ruleMeasurementData2439 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMeasurementData2451 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleDataRange_in_ruleMeasurementData2472 = new BitSet(new long[]{0x0000002000000022L});
    public static final BitSet FOLLOW_37_in_ruleMeasurementData2488 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_ruleMeasurementData2508 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_18_in_ruleMeasurementData2534 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleMeasurementData2552 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_39_in_ruleMeasurementData2593 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_18_in_ruleMeasurementData2619 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMeasurementData2637 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_ruleMeasurementData2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasurementData_in_entryRuleNonMeasurementData2715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonMeasurementData2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonMeasurementData2767 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleNonMeasurementData2784 = new BitSet(new long[]{0xFE00000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleDataType_in_ruleNonMeasurementData2806 = new BitSet(new long[]{0x0000032000002022L});
    public static final BitSet FOLLOW_ruleDataTypeNotAdjustable_in_ruleNonMeasurementData2833 = new BitSet(new long[]{0x0000032000002022L});
    public static final BitSet FOLLOW_40_in_ruleNonMeasurementData2854 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleNonMeasurementData2879 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleNonMeasurementData2891 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasurementData2908 = new BitSet(new long[]{0x0000002000002022L});
    public static final BitSet FOLLOW_41_in_ruleNonMeasurementData2933 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleNonMeasurementData2945 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasurementData2962 = new BitSet(new long[]{0x0000002000002022L});
    public static final BitSet FOLLOW_13_in_ruleNonMeasurementData2983 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNonMeasurementData2995 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasurementData3012 = new BitSet(new long[]{0x0000002000000022L});
    public static final BitSet FOLLOW_37_in_ruleNonMeasurementData3032 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_ruleNonMeasurementData3052 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_18_in_ruleNonMeasurementData3078 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleNonMeasurementData3096 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_39_in_ruleNonMeasurementData3137 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_18_in_ruleNonMeasurementData3163 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleNonMeasurementData3181 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_ruleNonMeasurementData3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementDataNotAdjustable_in_entryRuleMeasurementDataNotAdjustable3259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementDataNotAdjustable3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeasurementDataNotAdjustable3311 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMeasurementDataNotAdjustable3328 = new BitSet(new long[]{0xFE00000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleDataTypeNotAdjustable_in_ruleMeasurementDataNotAdjustable3349 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleMeasurementDataNotAdjustable3361 = new BitSet(new long[]{0x0000080000002130L});
    public static final BitSet FOLLOW_ruleUNIT_in_ruleMeasurementDataNotAdjustable3382 = new BitSet(new long[]{0x0000080000002022L});
    public static final BitSet FOLLOW_13_in_ruleMeasurementDataNotAdjustable3395 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMeasurementDataNotAdjustable3407 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasurementDataNotAdjustable3424 = new BitSet(new long[]{0x0000080000000022L});
    public static final BitSet FOLLOW_43_in_ruleMeasurementDataNotAdjustable3444 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMeasurementDataNotAdjustable3456 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_ruleMeasurementDataNotAdjustable3476 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_18_in_ruleMeasurementDataNotAdjustable3502 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleMeasurementDataNotAdjustable3520 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_39_in_ruleMeasurementDataNotAdjustable3561 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_18_in_ruleMeasurementDataNotAdjustable3587 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMeasurementDataNotAdjustable3605 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_ruleMeasurementDataNotAdjustable3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_entryRuleDataRange3683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataRange3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDataRange3730 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleDataRange3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_entryRuleInterval3787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterval3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleInterval3834 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleInterval3855 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleInterval3867 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleInterval3888 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleInterval3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConversion_in_entryRuleDataConversion3936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataConversion3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversion_in_ruleDataConversion3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversionWithInterval_in_ruleDataConversion4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversion_in_entryRuleLinearDataConversion4055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinearDataConversion4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLinearDataConversion4102 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLinearDataConversion4114 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion4135 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleLinearDataConversion4147 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLinearDataConversion4159 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversionWithInterval_in_entryRuleLinearDataConversionWithInterval4216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinearDataConversionWithInterval4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLinearDataConversionWithInterval4263 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleLinearDataConversionWithInterval4284 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleLinearDataConversionWithInterval4296 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleLinearDataConversionWithInterval4317 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLinearDataConversionWithInterval4329 = new BitSet(new long[]{0xF800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleDataType_in_ruleLinearDataConversionWithInterval4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE4387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE4438 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDOUBLE4457 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNIT_in_entryRuleUNIT4520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNIT4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUNIT4572 = new BitSet(new long[]{0x0000000000000112L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleUNIT4595 = new BitSet(new long[]{0x0000000000000112L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUNIT4616 = new BitSet(new long[]{0x0000000000000112L});
    public static final BitSet FOLLOW_53_in_ruleCoding4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleCoding4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleEndianness4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEndianness4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleDataTypeNotAdjustable4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleDataTypeNotAdjustable4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleDataType4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDataType4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDataType4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDataType4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDataType4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDataType4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDataType4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDataType4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDataType5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleDataType5018 = new BitSet(new long[]{0x0000000000000002L});

}