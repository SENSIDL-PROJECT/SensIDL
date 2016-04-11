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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DESCRIPTION", "RULE_STRING", "RULE_INT", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'sensorInterface'", "'with identifier'", "':'", "'{'", "'}'", "'encoding'", "','", "'endianness'", "'alignment'", "'BIT'", "'sensorData'", "'dataSet'", "'uses'", "'as'", "'in'", "'adjusted'", "'exclude:'", "'setter'", "'getter'", "'constant'", "'value'", "'='", "'exclude'", "'with range'", "'['", "';'", "']'", "'with scaling factor'", "'and offset'", "'by linear mapping'", "'=>'", "'.'", "'SENSIDL_BINARY'", "'SENSIDL_JSON'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'STRING'", "'BOOLEAN'", "'INT8'", "'UINT8'", "'INT16'", "'UINT16'", "'INT32'", "'UINT32'", "'INT64'", "'UINT64'", "'FLOAT'", "'DOUBLE'"
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
    public String getGrammarFileName() { return "InternalSensidl.g"; }



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
    // InternalSensidl.g:68:1: entryRuleSensorInterface returns [EObject current=null] : iv_ruleSensorInterface= ruleSensorInterface EOF ;
    public final EObject entryRuleSensorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorInterface = null;


        try {
            // InternalSensidl.g:69:2: (iv_ruleSensorInterface= ruleSensorInterface EOF )
            // InternalSensidl.g:70:2: iv_ruleSensorInterface= ruleSensorInterface EOF
            {
             newCompositeNode(grammarAccess.getSensorInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorInterface=ruleSensorInterface();

            state._fsp--;

             current =iv_ruleSensorInterface; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:77:1: ruleSensorInterface returns [EObject current=null] : (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' ) ;
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
            // InternalSensidl.g:80:28: ( (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' ) )
            // InternalSensidl.g:81:1: (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' )
            {
            // InternalSensidl.g:81:1: (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' )
            // InternalSensidl.g:81:3: otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getSensorInterfaceAccess().getSensorInterfaceKeyword_0());
                
            // InternalSensidl.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSensidl.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSensidl.g:86:1: (lv_name_1_0= RULE_ID )
            // InternalSensidl.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSensorInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSensorInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSensidl.g:103:2: ( (lv_description_2_0= RULE_DESCRIPTION ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DESCRIPTION) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSensidl.g:104:1: (lv_description_2_0= RULE_DESCRIPTION )
                    {
                    // InternalSensidl.g:104:1: (lv_description_2_0= RULE_DESCRIPTION )
                    // InternalSensidl.g:105:3: lv_description_2_0= RULE_DESCRIPTION
                    {
                    lv_description_2_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_5); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getSensorInterfaceAccess().getDescriptionDESCRIPTIONTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
                            		"de.fzi.sensidl.language.Sensidl.DESCRIPTION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSensidl.g:121:3: (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSensidl.g:121:5: otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorInterfaceAccess().getWithIdentifierKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                        	newLeafNode(otherlv_4, grammarAccess.getSensorInterfaceAccess().getColonKeyword_3_1());
                        
                    // InternalSensidl.g:129:1: ( (lv_ID_5_0= RULE_STRING ) )
                    // InternalSensidl.g:130:1: (lv_ID_5_0= RULE_STRING )
                    {
                    // InternalSensidl.g:130:1: (lv_ID_5_0= RULE_STRING )
                    // InternalSensidl.g:131:3: lv_ID_5_0= RULE_STRING
                    {
                    lv_ID_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    			newLeafNode(lv_ID_5_0, grammarAccess.getSensorInterfaceAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_5_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_9); 

                	newLeafNode(otherlv_6, grammarAccess.getSensorInterfaceAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSensidl.g:151:1: ( (lv_encodingSettings_7_0= ruleEncodingSettings ) )
            // InternalSensidl.g:152:1: (lv_encodingSettings_7_0= ruleEncodingSettings )
            {
            // InternalSensidl.g:152:1: (lv_encodingSettings_7_0= ruleEncodingSettings )
            // InternalSensidl.g:153:3: lv_encodingSettings_7_0= ruleEncodingSettings
            {
             
            	        newCompositeNode(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsEncodingSettingsParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_10);
            lv_encodingSettings_7_0=ruleEncodingSettings();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensorInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"encodingSettings",
                    		lv_encodingSettings_7_0, 
                    		"de.fzi.sensidl.language.Sensidl.EncodingSettings");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSensidl.g:169:2: ( (lv_dataDescription_8_0= ruleSensorDataDescription ) )
            // InternalSensidl.g:170:1: (lv_dataDescription_8_0= ruleSensorDataDescription )
            {
            // InternalSensidl.g:170:1: (lv_dataDescription_8_0= ruleSensorDataDescription )
            // InternalSensidl.g:171:3: lv_dataDescription_8_0= ruleSensorDataDescription
            {
             
            	        newCompositeNode(grammarAccess.getSensorInterfaceAccess().getDataDescriptionSensorDataDescriptionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_11);
            lv_dataDescription_8_0=ruleSensorDataDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensorInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"dataDescription",
                    		lv_dataDescription_8_0, 
                    		"de.fzi.sensidl.language.Sensidl.SensorDataDescription");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSensidl.g:199:1: entryRuleEncodingSettings returns [EObject current=null] : iv_ruleEncodingSettings= ruleEncodingSettings EOF ;
    public final EObject entryRuleEncodingSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncodingSettings = null;


        try {
            // InternalSensidl.g:200:2: (iv_ruleEncodingSettings= ruleEncodingSettings EOF )
            // InternalSensidl.g:201:2: iv_ruleEncodingSettings= ruleEncodingSettings EOF
            {
             newCompositeNode(grammarAccess.getEncodingSettingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEncodingSettings=ruleEncodingSettings();

            state._fsp--;

             current =iv_ruleEncodingSettings; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:208:1: ruleEncodingSettings returns [EObject current=null] : (otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? ) ;
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
            // InternalSensidl.g:211:28: ( (otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? ) )
            // InternalSensidl.g:212:1: (otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? )
            {
            // InternalSensidl.g:212:1: (otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? )
            // InternalSensidl.g:212:3: otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getEncodingSettingsAccess().getEncodingKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

                	newLeafNode(otherlv_1, grammarAccess.getEncodingSettingsAccess().getColonKeyword_1());
                
            // InternalSensidl.g:220:1: ( (lv_coding_2_0= ruleCoding ) )
            // InternalSensidl.g:221:1: (lv_coding_2_0= ruleCoding )
            {
            // InternalSensidl.g:221:1: (lv_coding_2_0= ruleCoding )
            // InternalSensidl.g:222:3: lv_coding_2_0= ruleCoding
            {
             
            	        newCompositeNode(grammarAccess.getEncodingSettingsAccess().getCodingCodingEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_13);
            lv_coding_2_0=ruleCoding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEncodingSettingsRule());
            	        }
                   		set(
                   			current, 
                   			"coding",
                    		lv_coding_2_0, 
                    		"de.fzi.sensidl.language.Sensidl.Coding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_14); 

                	newLeafNode(otherlv_3, grammarAccess.getEncodingSettingsAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,19,FOLLOW_6); 

                	newLeafNode(otherlv_4, grammarAccess.getEncodingSettingsAccess().getEndiannessKeyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_15); 

                	newLeafNode(otherlv_5, grammarAccess.getEncodingSettingsAccess().getColonKeyword_5());
                
            // InternalSensidl.g:250:1: ( (lv_endianness_6_0= ruleEndianness ) )
            // InternalSensidl.g:251:1: (lv_endianness_6_0= ruleEndianness )
            {
            // InternalSensidl.g:251:1: (lv_endianness_6_0= ruleEndianness )
            // InternalSensidl.g:252:3: lv_endianness_6_0= ruleEndianness
            {
             
            	        newCompositeNode(grammarAccess.getEncodingSettingsAccess().getEndiannessEndiannessEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_13);
            lv_endianness_6_0=ruleEndianness();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEncodingSettingsRule());
            	        }
                   		set(
                   			current, 
                   			"endianness",
                    		lv_endianness_6_0, 
                    		"de.fzi.sensidl.language.Sensidl.Endianness");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_16); 

                	newLeafNode(otherlv_7, grammarAccess.getEncodingSettingsAccess().getCommaKeyword_7());
                
            otherlv_8=(Token)match(input,20,FOLLOW_6); 

                	newLeafNode(otherlv_8, grammarAccess.getEncodingSettingsAccess().getAlignmentKeyword_8());
                
            otherlv_9=(Token)match(input,14,FOLLOW_17); 

                	newLeafNode(otherlv_9, grammarAccess.getEncodingSettingsAccess().getColonKeyword_9());
                
            // InternalSensidl.g:280:1: ( (lv_alignment_10_0= RULE_INT ) )
            // InternalSensidl.g:281:1: (lv_alignment_10_0= RULE_INT )
            {
            // InternalSensidl.g:281:1: (lv_alignment_10_0= RULE_INT )
            // InternalSensidl.g:282:3: lv_alignment_10_0= RULE_INT
            {
            lv_alignment_10_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            			newLeafNode(lv_alignment_10_0, grammarAccess.getEncodingSettingsAccess().getAlignmentINTTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEncodingSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"alignment",
                    		lv_alignment_10_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_19); 

                	newLeafNode(otherlv_11, grammarAccess.getEncodingSettingsAccess().getBITKeyword_11());
                
            // InternalSensidl.g:302:1: (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSensidl.g:302:3: otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,13,FOLLOW_6); 

                        	newLeafNode(otherlv_12, grammarAccess.getEncodingSettingsAccess().getWithIdentifierKeyword_12_0());
                        
                    otherlv_13=(Token)match(input,14,FOLLOW_7); 

                        	newLeafNode(otherlv_13, grammarAccess.getEncodingSettingsAccess().getColonKeyword_12_1());
                        
                    // InternalSensidl.g:310:1: ( (lv_ID_14_0= RULE_STRING ) )
                    // InternalSensidl.g:311:1: (lv_ID_14_0= RULE_STRING )
                    {
                    // InternalSensidl.g:311:1: (lv_ID_14_0= RULE_STRING )
                    // InternalSensidl.g:312:3: lv_ID_14_0= RULE_STRING
                    {
                    lv_ID_14_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_ID_14_0, grammarAccess.getEncodingSettingsAccess().getIDSTRINGTerminalRuleCall_12_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEncodingSettingsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_14_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

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
    // InternalSensidl.g:336:1: entryRuleSensorDataDescription returns [EObject current=null] : iv_ruleSensorDataDescription= ruleSensorDataDescription EOF ;
    public final EObject entryRuleSensorDataDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorDataDescription = null;


        try {
            // InternalSensidl.g:337:2: (iv_ruleSensorDataDescription= ruleSensorDataDescription EOF )
            // InternalSensidl.g:338:2: iv_ruleSensorDataDescription= ruleSensorDataDescription EOF
            {
             newCompositeNode(grammarAccess.getSensorDataDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorDataDescription=ruleSensorDataDescription();

            state._fsp--;

             current =iv_ruleSensorDataDescription; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:345:1: ruleSensorDataDescription returns [EObject current=null] : (otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}' ) ;
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
            // InternalSensidl.g:348:28: ( (otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}' ) )
            // InternalSensidl.g:349:1: (otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}' )
            {
            // InternalSensidl.g:349:1: (otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}' )
            // InternalSensidl.g:349:3: otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getSensorDataDescriptionAccess().getSensorDataKeyword_0());
                
            // InternalSensidl.g:353:1: ()
            // InternalSensidl.g:354:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1(),
                        current);
                

            }

            // InternalSensidl.g:359:2: (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSensidl.g:359:4: otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                        	newLeafNode(otherlv_2, grammarAccess.getSensorDataDescriptionAccess().getWithIdentifierKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,14,FOLLOW_7); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorDataDescriptionAccess().getColonKeyword_2_1());
                        
                    // InternalSensidl.g:367:1: ( (lv_ID_4_0= RULE_STRING ) )
                    // InternalSensidl.g:368:1: (lv_ID_4_0= RULE_STRING )
                    {
                    // InternalSensidl.g:368:1: (lv_ID_4_0= RULE_STRING )
                    // InternalSensidl.g:369:3: lv_ID_4_0= RULE_STRING
                    {
                    lv_ID_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    			newLeafNode(lv_ID_4_0, grammarAccess.getSensorDataDescriptionAccess().getIDSTRINGTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorDataDescriptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_20); 

                	newLeafNode(otherlv_5, grammarAccess.getSensorDataDescriptionAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalSensidl.g:389:1: ( (lv_dataSets_6_0= ruleDataSet ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSensidl.g:390:1: (lv_dataSets_6_0= ruleDataSet )
            	    {
            	    // InternalSensidl.g:390:1: (lv_dataSets_6_0= ruleDataSet )
            	    // InternalSensidl.g:391:3: lv_dataSets_6_0= ruleDataSet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSensorDataDescriptionAccess().getDataSetsDataSetParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_20);
            	    lv_dataSets_6_0=ruleDataSet();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSensorDataDescriptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dataSets",
            	            		lv_dataSets_6_0, 
            	            		"de.fzi.sensidl.language.Sensidl.DataSet");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSensidl.g:419:1: entryRuleDataSet returns [EObject current=null] : iv_ruleDataSet= ruleDataSet EOF ;
    public final EObject entryRuleDataSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSet = null;


        try {
            // InternalSensidl.g:420:2: (iv_ruleDataSet= ruleDataSet EOF )
            // InternalSensidl.g:421:2: iv_ruleDataSet= ruleDataSet EOF
            {
             newCompositeNode(grammarAccess.getDataSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataSet=ruleDataSet();

            state._fsp--;

             current =iv_ruleDataSet; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:428:1: ruleDataSet returns [EObject current=null] : (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( (lv_data_11_0= ruleData ) )* otherlv_12= '}' ) ;
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
        Token otherlv_12=null;
        EObject lv_data_11_0 = null;


         enterRule(); 
            
        try {
            // InternalSensidl.g:431:28: ( (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( (lv_data_11_0= ruleData ) )* otherlv_12= '}' ) )
            // InternalSensidl.g:432:1: (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( (lv_data_11_0= ruleData ) )* otherlv_12= '}' )
            {
            // InternalSensidl.g:432:1: (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( (lv_data_11_0= ruleData ) )* otherlv_12= '}' )
            // InternalSensidl.g:432:3: otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( (lv_data_11_0= ruleData ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDataSetAccess().getDataSetKeyword_0());
                
            // InternalSensidl.g:436:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSensidl.g:437:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSensidl.g:437:1: (lv_name_1_0= RULE_ID )
            // InternalSensidl.g:438:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataSetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalSensidl.g:454:2: (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSensidl.g:454:4: otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getDataSetAccess().getUsesKeyword_2_0());
                        
                    // InternalSensidl.g:458:1: ( (otherlv_3= RULE_ID ) )
                    // InternalSensidl.g:459:1: (otherlv_3= RULE_ID )
                    {
                    // InternalSensidl.g:459:1: (otherlv_3= RULE_ID )
                    // InternalSensidl.g:460:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSetRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

                    		newLeafNode(otherlv_3, grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalSensidl.g:471:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSensidl.g:471:6: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_3); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDataSetAccess().getCommaKeyword_3_0());
            	        
            	    // InternalSensidl.g:475:1: ( (otherlv_5= RULE_ID ) )
            	    // InternalSensidl.g:476:1: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSensidl.g:476:1: (otherlv_5= RULE_ID )
            	    // InternalSensidl.g:477:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDataSetRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    		newLeafNode(otherlv_5, grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalSensidl.g:488:4: (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSensidl.g:488:6: otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_6); 

                        	newLeafNode(otherlv_6, grammarAccess.getDataSetAccess().getWithIdentifierKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,14,FOLLOW_7); 

                        	newLeafNode(otherlv_7, grammarAccess.getDataSetAccess().getColonKeyword_4_1());
                        
                    // InternalSensidl.g:496:1: ( (lv_ID_8_0= RULE_STRING ) )
                    // InternalSensidl.g:497:1: (lv_ID_8_0= RULE_STRING )
                    {
                    // InternalSensidl.g:497:1: (lv_ID_8_0= RULE_STRING )
                    // InternalSensidl.g:498:3: lv_ID_8_0= RULE_STRING
                    {
                    lv_ID_8_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    			newLeafNode(lv_ID_8_0, grammarAccess.getDataSetAccess().getIDSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_8_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSensidl.g:514:4: ( (lv_description_9_0= RULE_DESCRIPTION ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DESCRIPTION) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSensidl.g:515:1: (lv_description_9_0= RULE_DESCRIPTION )
                    {
                    // InternalSensidl.g:515:1: (lv_description_9_0= RULE_DESCRIPTION )
                    // InternalSensidl.g:516:3: lv_description_9_0= RULE_DESCRIPTION
                    {
                    lv_description_9_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_8); 

                    			newLeafNode(lv_description_9_0, grammarAccess.getDataSetAccess().getDescriptionDESCRIPTIONTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_9_0, 
                            		"de.fzi.sensidl.language.Sensidl.DESCRIPTION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_24); 

                	newLeafNode(otherlv_10, grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_6());
                
            // InternalSensidl.g:536:1: ( (lv_data_11_0= ruleData ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSensidl.g:537:1: (lv_data_11_0= ruleData )
            	    {
            	    // InternalSensidl.g:537:1: (lv_data_11_0= ruleData )
            	    // InternalSensidl.g:538:3: lv_data_11_0= ruleData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_24);
            	    lv_data_11_0=ruleData();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"data",
            	            		lv_data_11_0, 
            	            		"de.fzi.sensidl.language.Sensidl.Data");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

                	newLeafNode(otherlv_12, grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
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
    // InternalSensidl.g:566:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalSensidl.g:567:2: (iv_ruleData= ruleData EOF )
            // InternalSensidl.g:568:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:575:1: ruleData returns [EObject current=null] : (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject this_MeasurementData_0 = null;

        EObject this_NonMeasurementData_1 = null;

        EObject this_MeasurementDataNotAdjustable_2 = null;


         enterRule(); 
            
        try {
            // InternalSensidl.g:578:28: ( (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable ) )
            // InternalSensidl.g:579:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable )
            {
            // InternalSensidl.g:579:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalSensidl.g:580:5: this_MeasurementData_0= ruleMeasurementData
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_MeasurementData_0=ruleMeasurementData();

                    state._fsp--;

                     
                            current = this_MeasurementData_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSensidl.g:590:5: this_NonMeasurementData_1= ruleNonMeasurementData
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getNonMeasurementDataParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_NonMeasurementData_1=ruleNonMeasurementData();

                    state._fsp--;

                     
                            current = this_NonMeasurementData_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSensidl.g:600:5: this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getMeasurementDataNotAdjustableParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_MeasurementDataNotAdjustable_2=ruleMeasurementDataNotAdjustable();

                    state._fsp--;

                     
                            current = this_MeasurementDataNotAdjustable_2; 
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
    // InternalSensidl.g:616:1: entryRuleMeasurementData returns [EObject current=null] : iv_ruleMeasurementData= ruleMeasurementData EOF ;
    public final EObject entryRuleMeasurementData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementData = null;


        try {
            // InternalSensidl.g:617:2: (iv_ruleMeasurementData= ruleMeasurementData EOF )
            // InternalSensidl.g:618:2: iv_ruleMeasurementData= ruleMeasurementData EOF
            {
             newCompositeNode(grammarAccess.getMeasurementDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasurementData=ruleMeasurementData();

            state._fsp--;

             current =iv_ruleMeasurementData; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:625:1: ruleMeasurementData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )? ) ;
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
            // InternalSensidl.g:628:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )? ) )
            // InternalSensidl.g:629:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )? )
            {
            // InternalSensidl.g:629:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )? )
            // InternalSensidl.g:629:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )?
            {
            // InternalSensidl.g:629:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSensidl.g:630:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSensidl.g:630:1: (lv_name_0_0= RULE_ID )
            // InternalSensidl.g:631:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasurementDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_26); 

                	newLeafNode(otherlv_1, grammarAccess.getMeasurementDataAccess().getAsKeyword_1());
                
            // InternalSensidl.g:651:1: ( (lv_dataType_2_0= ruleDataType ) )
            // InternalSensidl.g:652:1: (lv_dataType_2_0= ruleDataType )
            {
            // InternalSensidl.g:652:1: (lv_dataType_2_0= ruleDataType )
            // InternalSensidl.g:653:3: lv_dataType_2_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_27);
            lv_dataType_2_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
            	        }
                   		set(
                   			current, 
                   			"dataType",
                    		lv_dataType_2_0, 
                    		"de.fzi.sensidl.language.Sensidl.DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_28); 

                	newLeafNode(otherlv_3, grammarAccess.getMeasurementDataAccess().getInKeyword_3());
                
            // InternalSensidl.g:673:1: ( (lv_unit_4_0= ruleUNIT ) )
            // InternalSensidl.g:674:1: (lv_unit_4_0= ruleUNIT )
            {
            // InternalSensidl.g:674:1: (lv_unit_4_0= ruleUNIT )
            // InternalSensidl.g:675:3: lv_unit_4_0= ruleUNIT
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getUnitUNITParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_29);
            lv_unit_4_0=ruleUNIT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_4_0, 
                    		"de.fzi.sensidl.language.Sensidl.UNIT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSensidl.g:691:2: (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSensidl.g:691:4: otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_6); 

                        	newLeafNode(otherlv_5, grammarAccess.getMeasurementDataAccess().getWithIdentifierKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                        	newLeafNode(otherlv_6, grammarAccess.getMeasurementDataAccess().getColonKeyword_5_1());
                        
                    // InternalSensidl.g:699:1: ( (lv_ID_7_0= RULE_STRING ) )
                    // InternalSensidl.g:700:1: (lv_ID_7_0= RULE_STRING )
                    {
                    // InternalSensidl.g:700:1: (lv_ID_7_0= RULE_STRING )
                    // InternalSensidl.g:701:3: lv_ID_7_0= RULE_STRING
                    {
                    lv_ID_7_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    			newLeafNode(lv_ID_7_0, grammarAccess.getMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_7_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSensidl.g:717:4: ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )?
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalSensidl.g:717:5: (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) )
                    {
                    // InternalSensidl.g:717:5: (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) )
                    // InternalSensidl.g:717:7: otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_31); 

                        	newLeafNode(otherlv_8, grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0_0());
                        
                    // InternalSensidl.g:721:1: ( (lv_adjustments_9_0= ruleDataConversion ) )
                    // InternalSensidl.g:722:1: (lv_adjustments_9_0= ruleDataConversion )
                    {
                    // InternalSensidl.g:722:1: (lv_adjustments_9_0= ruleDataConversion )
                    // InternalSensidl.g:723:3: lv_adjustments_9_0= ruleDataConversion
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataConversionParserRuleCall_6_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_32);
                    lv_adjustments_9_0=ruleDataConversion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
                    	        }
                           		add(
                           			current, 
                           			"adjustments",
                            		lv_adjustments_9_0, 
                            		"de.fzi.sensidl.language.Sensidl.DataConversion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:740:6: (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) )
                    {
                    // InternalSensidl.g:740:6: (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) )
                    // InternalSensidl.g:740:8: otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) )
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_33); 

                        	newLeafNode(otherlv_10, grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_1_0());
                        
                    // InternalSensidl.g:744:1: ( (lv_adjustments_11_0= ruleDataRange ) )
                    // InternalSensidl.g:745:1: (lv_adjustments_11_0= ruleDataRange )
                    {
                    // InternalSensidl.g:745:1: (lv_adjustments_11_0= ruleDataRange )
                    // InternalSensidl.g:746:3: lv_adjustments_11_0= ruleDataRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataRangeParserRuleCall_6_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_32);
                    lv_adjustments_11_0=ruleDataRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
                    	        }
                           		add(
                           			current, 
                           			"adjustments",
                            		lv_adjustments_11_0, 
                            		"de.fzi.sensidl.language.Sensidl.DataRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:763:6: (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) )
                    {
                    // InternalSensidl.g:763:6: (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) )
                    // InternalSensidl.g:763:8: otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_31); 

                        	newLeafNode(otherlv_12, grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_2_0());
                        
                    // InternalSensidl.g:767:1: ( (lv_adjustments_13_0= ruleDataConversion ) )
                    // InternalSensidl.g:768:1: (lv_adjustments_13_0= ruleDataConversion )
                    {
                    // InternalSensidl.g:768:1: (lv_adjustments_13_0= ruleDataConversion )
                    // InternalSensidl.g:769:3: lv_adjustments_13_0= ruleDataConversion
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataConversionParserRuleCall_6_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_13);
                    lv_adjustments_13_0=ruleDataConversion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
                    	        }
                           		add(
                           			current, 
                           			"adjustments",
                            		lv_adjustments_13_0, 
                            		"de.fzi.sensidl.language.Sensidl.DataConversion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,18,FOLLOW_33); 

                        	newLeafNode(otherlv_14, grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_2_2());
                        
                    // InternalSensidl.g:789:1: ( (lv_adjustments_15_0= ruleDataRange ) )
                    // InternalSensidl.g:790:1: (lv_adjustments_15_0= ruleDataRange )
                    {
                    // InternalSensidl.g:790:1: (lv_adjustments_15_0= ruleDataRange )
                    // InternalSensidl.g:791:3: lv_adjustments_15_0= ruleDataRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataRangeParserRuleCall_6_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_32);
                    lv_adjustments_15_0=ruleDataRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
                    	        }
                           		add(
                           			current, 
                           			"adjustments",
                            		lv_adjustments_15_0, 
                            		"de.fzi.sensidl.language.Sensidl.DataRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSensidl.g:807:5: (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSensidl.g:807:7: otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) )
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_34); 

                        	newLeafNode(otherlv_16, grammarAccess.getMeasurementDataAccess().getExcludeKeyword_7_0());
                        
                    // InternalSensidl.g:811:1: ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==29) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==30) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSensidl.g:811:2: ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? )
                            {
                            // InternalSensidl.g:811:2: ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? )
                            // InternalSensidl.g:811:3: ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )?
                            {
                            // InternalSensidl.g:811:3: ( (lv_excludedMethods_17_0= 'setter' ) )
                            // InternalSensidl.g:812:1: (lv_excludedMethods_17_0= 'setter' )
                            {
                            // InternalSensidl.g:812:1: (lv_excludedMethods_17_0= 'setter' )
                            // InternalSensidl.g:813:3: lv_excludedMethods_17_0= 'setter'
                            {
                            lv_excludedMethods_17_0=(Token)match(input,29,FOLLOW_35); 

                                    newLeafNode(lv_excludedMethods_17_0, grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMeasurementDataRule());
                            	        }
                                   		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_17_0, "setter");
                            	    

                            }


                            }

                            // InternalSensidl.g:826:2: (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==18) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // InternalSensidl.g:826:4: otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) )
                                    {
                                    otherlv_18=(Token)match(input,18,FOLLOW_36); 

                                        	newLeafNode(otherlv_18, grammarAccess.getMeasurementDataAccess().getCommaKeyword_7_1_0_1_0());
                                        
                                    // InternalSensidl.g:830:1: ( (lv_excludedMethods_19_0= 'getter' ) )
                                    // InternalSensidl.g:831:1: (lv_excludedMethods_19_0= 'getter' )
                                    {
                                    // InternalSensidl.g:831:1: (lv_excludedMethods_19_0= 'getter' )
                                    // InternalSensidl.g:832:3: lv_excludedMethods_19_0= 'getter'
                                    {
                                    lv_excludedMethods_19_0=(Token)match(input,30,FOLLOW_37); 

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
                            // InternalSensidl.g:846:6: ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? )
                            {
                            // InternalSensidl.g:846:6: ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? )
                            // InternalSensidl.g:846:7: ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )?
                            {
                            // InternalSensidl.g:846:7: ( (lv_excludedMethods_20_0= 'getter' ) )
                            // InternalSensidl.g:847:1: (lv_excludedMethods_20_0= 'getter' )
                            {
                            // InternalSensidl.g:847:1: (lv_excludedMethods_20_0= 'getter' )
                            // InternalSensidl.g:848:3: lv_excludedMethods_20_0= 'getter'
                            {
                            lv_excludedMethods_20_0=(Token)match(input,30,FOLLOW_35); 

                                    newLeafNode(lv_excludedMethods_20_0, grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMeasurementDataRule());
                            	        }
                                   		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_20_0, "getter");
                            	    

                            }


                            }

                            // InternalSensidl.g:861:2: (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==18) ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // InternalSensidl.g:861:4: otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) )
                                    {
                                    otherlv_21=(Token)match(input,18,FOLLOW_38); 

                                        	newLeafNode(otherlv_21, grammarAccess.getMeasurementDataAccess().getCommaKeyword_7_1_1_1_0());
                                        
                                    // InternalSensidl.g:865:1: ( (lv_excludedMethods_22_0= 'setter' ) )
                                    // InternalSensidl.g:866:1: (lv_excludedMethods_22_0= 'setter' )
                                    {
                                    // InternalSensidl.g:866:1: (lv_excludedMethods_22_0= 'setter' )
                                    // InternalSensidl.g:867:3: lv_excludedMethods_22_0= 'setter'
                                    {
                                    lv_excludedMethods_22_0=(Token)match(input,29,FOLLOW_37); 

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

            // InternalSensidl.g:880:8: ( (lv_description_23_0= RULE_DESCRIPTION ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DESCRIPTION) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSensidl.g:881:1: (lv_description_23_0= RULE_DESCRIPTION )
                    {
                    // InternalSensidl.g:881:1: (lv_description_23_0= RULE_DESCRIPTION )
                    // InternalSensidl.g:882:3: lv_description_23_0= RULE_DESCRIPTION
                    {
                    lv_description_23_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_2); 

                    			newLeafNode(lv_description_23_0, grammarAccess.getMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_23_0, 
                            		"de.fzi.sensidl.language.Sensidl.DESCRIPTION");
                    	    

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
    // InternalSensidl.g:906:1: entryRuleNonMeasurementData returns [EObject current=null] : iv_ruleNonMeasurementData= ruleNonMeasurementData EOF ;
    public final EObject entryRuleNonMeasurementData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonMeasurementData = null;


        try {
            // InternalSensidl.g:907:2: (iv_ruleNonMeasurementData= ruleNonMeasurementData EOF )
            // InternalSensidl.g:908:2: iv_ruleNonMeasurementData= ruleNonMeasurementData EOF
            {
             newCompositeNode(grammarAccess.getNonMeasurementDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonMeasurementData=ruleNonMeasurementData();

            state._fsp--;

             current =iv_ruleNonMeasurementData; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:915:1: ruleNonMeasurementData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( (lv_constant_4_0= 'constant' ) )? (otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? (otherlv_8= 'with identifier' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )? (otherlv_11= 'exclude:' ( ( ( (lv_excludedMethods_12_0= 'setter' ) ) (otherlv_13= ',' ( (lv_excludedMethods_14_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_15_0= 'getter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'setter' ) ) )? ) ) )? ( (lv_description_18_0= RULE_DESCRIPTION ) )? ) ;
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
        Token lv_ID_10_0=null;
        Token otherlv_11=null;
        Token lv_excludedMethods_12_0=null;
        Token otherlv_13=null;
        Token lv_excludedMethods_14_0=null;
        Token lv_excludedMethods_15_0=null;
        Token otherlv_16=null;
        Token lv_excludedMethods_17_0=null;
        Token lv_description_18_0=null;
        Enumerator lv_dataType_2_0 = null;

        Enumerator lv_dataType_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSensidl.g:918:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( (lv_constant_4_0= 'constant' ) )? (otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? (otherlv_8= 'with identifier' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )? (otherlv_11= 'exclude:' ( ( ( (lv_excludedMethods_12_0= 'setter' ) ) (otherlv_13= ',' ( (lv_excludedMethods_14_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_15_0= 'getter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'setter' ) ) )? ) ) )? ( (lv_description_18_0= RULE_DESCRIPTION ) )? ) )
            // InternalSensidl.g:919:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( (lv_constant_4_0= 'constant' ) )? (otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? (otherlv_8= 'with identifier' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )? (otherlv_11= 'exclude:' ( ( ( (lv_excludedMethods_12_0= 'setter' ) ) (otherlv_13= ',' ( (lv_excludedMethods_14_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_15_0= 'getter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'setter' ) ) )? ) ) )? ( (lv_description_18_0= RULE_DESCRIPTION ) )? )
            {
            // InternalSensidl.g:919:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( (lv_constant_4_0= 'constant' ) )? (otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? (otherlv_8= 'with identifier' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )? (otherlv_11= 'exclude:' ( ( ( (lv_excludedMethods_12_0= 'setter' ) ) (otherlv_13= ',' ( (lv_excludedMethods_14_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_15_0= 'getter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'setter' ) ) )? ) ) )? ( (lv_description_18_0= RULE_DESCRIPTION ) )? )
            // InternalSensidl.g:919:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( (lv_constant_4_0= 'constant' ) )? (otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? (otherlv_8= 'with identifier' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )? (otherlv_11= 'exclude:' ( ( ( (lv_excludedMethods_12_0= 'setter' ) ) (otherlv_13= ',' ( (lv_excludedMethods_14_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_15_0= 'getter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'setter' ) ) )? ) ) )? ( (lv_description_18_0= RULE_DESCRIPTION ) )?
            {
            // InternalSensidl.g:919:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSensidl.g:920:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSensidl.g:920:1: (lv_name_0_0= RULE_ID )
            // InternalSensidl.g:921:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNonMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_39); 

                	newLeafNode(otherlv_1, grammarAccess.getNonMeasurementDataAccess().getAsKeyword_1());
                
            // InternalSensidl.g:941:1: ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=50 && LA19_0<=59)) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=48 && LA19_0<=49)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSensidl.g:941:2: ( (lv_dataType_2_0= ruleDataType ) )
                    {
                    // InternalSensidl.g:941:2: ( (lv_dataType_2_0= ruleDataType ) )
                    // InternalSensidl.g:942:1: (lv_dataType_2_0= ruleDataType )
                    {
                    // InternalSensidl.g:942:1: (lv_dataType_2_0= ruleDataType )
                    // InternalSensidl.g:943:3: lv_dataType_2_0= ruleDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_40);
                    lv_dataType_2_0=ruleDataType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		set(
                           			current, 
                           			"dataType",
                            		lv_dataType_2_0, 
                            		"de.fzi.sensidl.language.Sensidl.DataType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:960:6: ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) )
                    {
                    // InternalSensidl.g:960:6: ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) )
                    // InternalSensidl.g:961:1: (lv_dataType_3_0= ruleDataTypeNotAdjustable )
                    {
                    // InternalSensidl.g:961:1: (lv_dataType_3_0= ruleDataTypeNotAdjustable )
                    // InternalSensidl.g:962:3: lv_dataType_3_0= ruleDataTypeNotAdjustable
                    {
                     
                    	        newCompositeNode(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_40);
                    lv_dataType_3_0=ruleDataTypeNotAdjustable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		set(
                           			current, 
                           			"dataType",
                            		lv_dataType_3_0, 
                            		"de.fzi.sensidl.language.Sensidl.DataTypeNotAdjustable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSensidl.g:978:3: ( (lv_constant_4_0= 'constant' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSensidl.g:979:1: (lv_constant_4_0= 'constant' )
                    {
                    // InternalSensidl.g:979:1: (lv_constant_4_0= 'constant' )
                    // InternalSensidl.g:980:3: lv_constant_4_0= 'constant'
                    {
                    lv_constant_4_0=(Token)match(input,31,FOLLOW_41); 

                            newLeafNode(lv_constant_4_0, grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(current, "constant", true, "constant");
                    	    

                    }


                    }
                    break;

            }

            // InternalSensidl.g:993:3: (otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSensidl.g:993:5: otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_42); 

                        	newLeafNode(otherlv_5, grammarAccess.getNonMeasurementDataAccess().getValueKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,33,FOLLOW_7); 

                        	newLeafNode(otherlv_6, grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4_1());
                        
                    // InternalSensidl.g:1001:1: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalSensidl.g:1002:1: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalSensidl.g:1002:1: (lv_value_7_0= RULE_STRING )
                    // InternalSensidl.g:1003:3: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

                    			newLeafNode(lv_value_7_0, grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_7_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSensidl.g:1019:4: (otherlv_8= 'with identifier' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSensidl.g:1019:6: otherlv_8= 'with identifier' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_6); 

                        	newLeafNode(otherlv_8, grammarAccess.getNonMeasurementDataAccess().getWithIdentifierKeyword_5_0());
                        
                    otherlv_9=(Token)match(input,14,FOLLOW_7); 

                        	newLeafNode(otherlv_9, grammarAccess.getNonMeasurementDataAccess().getColonKeyword_5_1());
                        
                    // InternalSensidl.g:1027:1: ( (lv_ID_10_0= RULE_STRING ) )
                    // InternalSensidl.g:1028:1: (lv_ID_10_0= RULE_STRING )
                    {
                    // InternalSensidl.g:1028:1: (lv_ID_10_0= RULE_STRING )
                    // InternalSensidl.g:1029:3: lv_ID_10_0= RULE_STRING
                    {
                    lv_ID_10_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    			newLeafNode(lv_ID_10_0, grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_10_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSensidl.g:1045:4: (otherlv_11= 'exclude:' ( ( ( (lv_excludedMethods_12_0= 'setter' ) ) (otherlv_13= ',' ( (lv_excludedMethods_14_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_15_0= 'getter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'setter' ) ) )? ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSensidl.g:1045:6: otherlv_11= 'exclude:' ( ( ( (lv_excludedMethods_12_0= 'setter' ) ) (otherlv_13= ',' ( (lv_excludedMethods_14_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_15_0= 'getter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'setter' ) ) )? ) )
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_34); 

                        	newLeafNode(otherlv_11, grammarAccess.getNonMeasurementDataAccess().getExcludeKeyword_6_0());
                        
                    // InternalSensidl.g:1049:1: ( ( ( (lv_excludedMethods_12_0= 'setter' ) ) (otherlv_13= ',' ( (lv_excludedMethods_14_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_15_0= 'getter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'setter' ) ) )? ) )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==29) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==30) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalSensidl.g:1049:2: ( ( (lv_excludedMethods_12_0= 'setter' ) ) (otherlv_13= ',' ( (lv_excludedMethods_14_0= 'getter' ) ) )? )
                            {
                            // InternalSensidl.g:1049:2: ( ( (lv_excludedMethods_12_0= 'setter' ) ) (otherlv_13= ',' ( (lv_excludedMethods_14_0= 'getter' ) ) )? )
                            // InternalSensidl.g:1049:3: ( (lv_excludedMethods_12_0= 'setter' ) ) (otherlv_13= ',' ( (lv_excludedMethods_14_0= 'getter' ) ) )?
                            {
                            // InternalSensidl.g:1049:3: ( (lv_excludedMethods_12_0= 'setter' ) )
                            // InternalSensidl.g:1050:1: (lv_excludedMethods_12_0= 'setter' )
                            {
                            // InternalSensidl.g:1050:1: (lv_excludedMethods_12_0= 'setter' )
                            // InternalSensidl.g:1051:3: lv_excludedMethods_12_0= 'setter'
                            {
                            lv_excludedMethods_12_0=(Token)match(input,29,FOLLOW_35); 

                                    newLeafNode(lv_excludedMethods_12_0, grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                            	        }
                                   		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_12_0, "setter");
                            	    

                            }


                            }

                            // InternalSensidl.g:1064:2: (otherlv_13= ',' ( (lv_excludedMethods_14_0= 'getter' ) ) )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==18) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // InternalSensidl.g:1064:4: otherlv_13= ',' ( (lv_excludedMethods_14_0= 'getter' ) )
                                    {
                                    otherlv_13=(Token)match(input,18,FOLLOW_36); 

                                        	newLeafNode(otherlv_13, grammarAccess.getNonMeasurementDataAccess().getCommaKeyword_6_1_0_1_0());
                                        
                                    // InternalSensidl.g:1068:1: ( (lv_excludedMethods_14_0= 'getter' ) )
                                    // InternalSensidl.g:1069:1: (lv_excludedMethods_14_0= 'getter' )
                                    {
                                    // InternalSensidl.g:1069:1: (lv_excludedMethods_14_0= 'getter' )
                                    // InternalSensidl.g:1070:3: lv_excludedMethods_14_0= 'getter'
                                    {
                                    lv_excludedMethods_14_0=(Token)match(input,30,FOLLOW_37); 

                                            newLeafNode(lv_excludedMethods_14_0, grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_0_1_1_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                                    	        }
                                           		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_14_0, "getter");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSensidl.g:1084:6: ( ( (lv_excludedMethods_15_0= 'getter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'setter' ) ) )? )
                            {
                            // InternalSensidl.g:1084:6: ( ( (lv_excludedMethods_15_0= 'getter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'setter' ) ) )? )
                            // InternalSensidl.g:1084:7: ( (lv_excludedMethods_15_0= 'getter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'setter' ) ) )?
                            {
                            // InternalSensidl.g:1084:7: ( (lv_excludedMethods_15_0= 'getter' ) )
                            // InternalSensidl.g:1085:1: (lv_excludedMethods_15_0= 'getter' )
                            {
                            // InternalSensidl.g:1085:1: (lv_excludedMethods_15_0= 'getter' )
                            // InternalSensidl.g:1086:3: lv_excludedMethods_15_0= 'getter'
                            {
                            lv_excludedMethods_15_0=(Token)match(input,30,FOLLOW_35); 

                                    newLeafNode(lv_excludedMethods_15_0, grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                            	        }
                                   		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_15_0, "getter");
                            	    

                            }


                            }

                            // InternalSensidl.g:1099:2: (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'setter' ) ) )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==18) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // InternalSensidl.g:1099:4: otherlv_16= ',' ( (lv_excludedMethods_17_0= 'setter' ) )
                                    {
                                    otherlv_16=(Token)match(input,18,FOLLOW_38); 

                                        	newLeafNode(otherlv_16, grammarAccess.getNonMeasurementDataAccess().getCommaKeyword_6_1_1_1_0());
                                        
                                    // InternalSensidl.g:1103:1: ( (lv_excludedMethods_17_0= 'setter' ) )
                                    // InternalSensidl.g:1104:1: (lv_excludedMethods_17_0= 'setter' )
                                    {
                                    // InternalSensidl.g:1104:1: (lv_excludedMethods_17_0= 'setter' )
                                    // InternalSensidl.g:1105:3: lv_excludedMethods_17_0= 'setter'
                                    {
                                    lv_excludedMethods_17_0=(Token)match(input,29,FOLLOW_37); 

                                            newLeafNode(lv_excludedMethods_17_0, grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_1_1_1_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                                    	        }
                                           		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_17_0, "setter");
                                    	    

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

            // InternalSensidl.g:1118:8: ( (lv_description_18_0= RULE_DESCRIPTION ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_DESCRIPTION) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSensidl.g:1119:1: (lv_description_18_0= RULE_DESCRIPTION )
                    {
                    // InternalSensidl.g:1119:1: (lv_description_18_0= RULE_DESCRIPTION )
                    // InternalSensidl.g:1120:3: lv_description_18_0= RULE_DESCRIPTION
                    {
                    lv_description_18_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_2); 

                    			newLeafNode(lv_description_18_0, grammarAccess.getNonMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_18_0, 
                            		"de.fzi.sensidl.language.Sensidl.DESCRIPTION");
                    	    

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
    // InternalSensidl.g:1144:1: entryRuleMeasurementDataNotAdjustable returns [EObject current=null] : iv_ruleMeasurementDataNotAdjustable= ruleMeasurementDataNotAdjustable EOF ;
    public final EObject entryRuleMeasurementDataNotAdjustable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementDataNotAdjustable = null;


        try {
            // InternalSensidl.g:1145:2: (iv_ruleMeasurementDataNotAdjustable= ruleMeasurementDataNotAdjustable EOF )
            // InternalSensidl.g:1146:2: iv_ruleMeasurementDataNotAdjustable= ruleMeasurementDataNotAdjustable EOF
            {
             newCompositeNode(grammarAccess.getMeasurementDataNotAdjustableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasurementDataNotAdjustable=ruleMeasurementDataNotAdjustable();

            state._fsp--;

             current =iv_ruleMeasurementDataNotAdjustable; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:1153:1: ruleMeasurementDataNotAdjustable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )? ) ;
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
            // InternalSensidl.g:1156:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )? ) )
            // InternalSensidl.g:1157:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )? )
            {
            // InternalSensidl.g:1157:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )? )
            // InternalSensidl.g:1157:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )?
            {
            // InternalSensidl.g:1157:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSensidl.g:1158:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSensidl.g:1158:1: (lv_name_0_0= RULE_ID )
            // InternalSensidl.g:1159:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMeasurementDataNotAdjustableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasurementDataNotAdjustableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_39); 

                	newLeafNode(otherlv_1, grammarAccess.getMeasurementDataNotAdjustableAccess().getAsKeyword_1());
                
            // InternalSensidl.g:1179:1: ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:1180:1: (lv_dataType_2_0= ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:1180:1: (lv_dataType_2_0= ruleDataTypeNotAdjustable )
            // InternalSensidl.g:1181:3: lv_dataType_2_0= ruleDataTypeNotAdjustable
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_27);
            lv_dataType_2_0=ruleDataTypeNotAdjustable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasurementDataNotAdjustableRule());
            	        }
                   		set(
                   			current, 
                   			"dataType",
                    		lv_dataType_2_0, 
                    		"de.fzi.sensidl.language.Sensidl.DataTypeNotAdjustable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_44); 

                	newLeafNode(otherlv_3, grammarAccess.getMeasurementDataNotAdjustableAccess().getInKeyword_3());
                
            // InternalSensidl.g:1201:1: ( (lv_unit_4_0= ruleUNIT ) )
            // InternalSensidl.g:1202:1: (lv_unit_4_0= ruleUNIT )
            {
            // InternalSensidl.g:1202:1: (lv_unit_4_0= ruleUNIT )
            // InternalSensidl.g:1203:3: lv_unit_4_0= ruleUNIT
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitUNITParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_45);
            lv_unit_4_0=ruleUNIT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasurementDataNotAdjustableRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_4_0, 
                    		"de.fzi.sensidl.language.Sensidl.UNIT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSensidl.g:1219:2: (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSensidl.g:1219:4: otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_6); 

                        	newLeafNode(otherlv_5, grammarAccess.getMeasurementDataNotAdjustableAccess().getWithIdentifierKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                        	newLeafNode(otherlv_6, grammarAccess.getMeasurementDataNotAdjustableAccess().getColonKeyword_5_1());
                        
                    // InternalSensidl.g:1227:1: ( (lv_ID_7_0= RULE_STRING ) )
                    // InternalSensidl.g:1228:1: (lv_ID_7_0= RULE_STRING )
                    {
                    // InternalSensidl.g:1228:1: (lv_ID_7_0= RULE_STRING )
                    // InternalSensidl.g:1229:3: lv_ID_7_0= RULE_STRING
                    {
                    lv_ID_7_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

                    			newLeafNode(lv_ID_7_0, grammarAccess.getMeasurementDataNotAdjustableAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasurementDataNotAdjustableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_7_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSensidl.g:1245:4: (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSensidl.g:1245:6: otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) )
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_6); 

                        	newLeafNode(otherlv_8, grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludeKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,14,FOLLOW_34); 

                        	newLeafNode(otherlv_9, grammarAccess.getMeasurementDataNotAdjustableAccess().getColonKeyword_6_1());
                        
                    // InternalSensidl.g:1253:1: ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==29) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==30) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalSensidl.g:1253:2: ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? )
                            {
                            // InternalSensidl.g:1253:2: ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? )
                            // InternalSensidl.g:1253:3: ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )?
                            {
                            // InternalSensidl.g:1253:3: ( (lv_excludedMethods_10_0= 'setter' ) )
                            // InternalSensidl.g:1254:1: (lv_excludedMethods_10_0= 'setter' )
                            {
                            // InternalSensidl.g:1254:1: (lv_excludedMethods_10_0= 'setter' )
                            // InternalSensidl.g:1255:3: lv_excludedMethods_10_0= 'setter'
                            {
                            lv_excludedMethods_10_0=(Token)match(input,29,FOLLOW_35); 

                                    newLeafNode(lv_excludedMethods_10_0, grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMeasurementDataNotAdjustableRule());
                            	        }
                                   		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_10_0, "setter");
                            	    

                            }


                            }

                            // InternalSensidl.g:1268:2: (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==18) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // InternalSensidl.g:1268:4: otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) )
                                    {
                                    otherlv_11=(Token)match(input,18,FOLLOW_36); 

                                        	newLeafNode(otherlv_11, grammarAccess.getMeasurementDataNotAdjustableAccess().getCommaKeyword_6_2_0_1_0());
                                        
                                    // InternalSensidl.g:1272:1: ( (lv_excludedMethods_12_0= 'getter' ) )
                                    // InternalSensidl.g:1273:1: (lv_excludedMethods_12_0= 'getter' )
                                    {
                                    // InternalSensidl.g:1273:1: (lv_excludedMethods_12_0= 'getter' )
                                    // InternalSensidl.g:1274:3: lv_excludedMethods_12_0= 'getter'
                                    {
                                    lv_excludedMethods_12_0=(Token)match(input,30,FOLLOW_37); 

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
                            // InternalSensidl.g:1288:6: ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? )
                            {
                            // InternalSensidl.g:1288:6: ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? )
                            // InternalSensidl.g:1288:7: ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )?
                            {
                            // InternalSensidl.g:1288:7: ( (lv_excludedMethods_13_0= 'getter' ) )
                            // InternalSensidl.g:1289:1: (lv_excludedMethods_13_0= 'getter' )
                            {
                            // InternalSensidl.g:1289:1: (lv_excludedMethods_13_0= 'getter' )
                            // InternalSensidl.g:1290:3: lv_excludedMethods_13_0= 'getter'
                            {
                            lv_excludedMethods_13_0=(Token)match(input,30,FOLLOW_35); 

                                    newLeafNode(lv_excludedMethods_13_0, grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMeasurementDataNotAdjustableRule());
                            	        }
                                   		addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_13_0, "getter");
                            	    

                            }


                            }

                            // InternalSensidl.g:1303:2: (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==18) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // InternalSensidl.g:1303:4: otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) )
                                    {
                                    otherlv_14=(Token)match(input,18,FOLLOW_38); 

                                        	newLeafNode(otherlv_14, grammarAccess.getMeasurementDataNotAdjustableAccess().getCommaKeyword_6_2_1_1_0());
                                        
                                    // InternalSensidl.g:1307:1: ( (lv_excludedMethods_15_0= 'setter' ) )
                                    // InternalSensidl.g:1308:1: (lv_excludedMethods_15_0= 'setter' )
                                    {
                                    // InternalSensidl.g:1308:1: (lv_excludedMethods_15_0= 'setter' )
                                    // InternalSensidl.g:1309:3: lv_excludedMethods_15_0= 'setter'
                                    {
                                    lv_excludedMethods_15_0=(Token)match(input,29,FOLLOW_37); 

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

            // InternalSensidl.g:1322:8: ( (lv_description_16_0= RULE_DESCRIPTION ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_DESCRIPTION) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSensidl.g:1323:1: (lv_description_16_0= RULE_DESCRIPTION )
                    {
                    // InternalSensidl.g:1323:1: (lv_description_16_0= RULE_DESCRIPTION )
                    // InternalSensidl.g:1324:3: lv_description_16_0= RULE_DESCRIPTION
                    {
                    lv_description_16_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_2); 

                    			newLeafNode(lv_description_16_0, grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionDESCRIPTIONTerminalRuleCall_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasurementDataNotAdjustableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_16_0, 
                            		"de.fzi.sensidl.language.Sensidl.DESCRIPTION");
                    	    

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
    // InternalSensidl.g:1348:1: entryRuleDataRange returns [EObject current=null] : iv_ruleDataRange= ruleDataRange EOF ;
    public final EObject entryRuleDataRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataRange = null;


        try {
            // InternalSensidl.g:1349:2: (iv_ruleDataRange= ruleDataRange EOF )
            // InternalSensidl.g:1350:2: iv_ruleDataRange= ruleDataRange EOF
            {
             newCompositeNode(grammarAccess.getDataRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataRange=ruleDataRange();

            state._fsp--;

             current =iv_ruleDataRange; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:1357:1: ruleDataRange returns [EObject current=null] : (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) ) ;
    public final EObject ruleDataRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_range_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSensidl.g:1360:28: ( (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) ) )
            // InternalSensidl.g:1361:1: (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) )
            {
            // InternalSensidl.g:1361:1: (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) )
            // InternalSensidl.g:1361:3: otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_47); 

                	newLeafNode(otherlv_0, grammarAccess.getDataRangeAccess().getWithRangeKeyword_0());
                
            // InternalSensidl.g:1365:1: ( (lv_range_1_0= ruleInterval ) )
            // InternalSensidl.g:1366:1: (lv_range_1_0= ruleInterval )
            {
            // InternalSensidl.g:1366:1: (lv_range_1_0= ruleInterval )
            // InternalSensidl.g:1367:3: lv_range_1_0= ruleInterval
            {
             
            	        newCompositeNode(grammarAccess.getDataRangeAccess().getRangeIntervalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_range_1_0=ruleInterval();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataRangeRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_1_0, 
                    		"de.fzi.sensidl.language.Sensidl.Interval");
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
    // InternalSensidl.g:1391:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalSensidl.g:1392:2: (iv_ruleInterval= ruleInterval EOF )
            // InternalSensidl.g:1393:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:1400:1: ruleInterval returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSensidl.g:1403:28: ( (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' ) )
            // InternalSensidl.g:1404:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' )
            {
            // InternalSensidl.g:1404:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' )
            // InternalSensidl.g:1404:3: otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0());
                
            // InternalSensidl.g:1408:1: ( (lv_lowerBound_1_0= ruleDOUBLE ) )
            // InternalSensidl.g:1409:1: (lv_lowerBound_1_0= ruleDOUBLE )
            {
            // InternalSensidl.g:1409:1: (lv_lowerBound_1_0= ruleDOUBLE )
            // InternalSensidl.g:1410:3: lv_lowerBound_1_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_48);
            lv_lowerBound_1_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntervalRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_1_0, 
                    		"de.fzi.sensidl.language.Sensidl.DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_17); 

                	newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getSemicolonKeyword_2());
                
            // InternalSensidl.g:1430:1: ( (lv_upperBound_3_0= ruleDOUBLE ) )
            // InternalSensidl.g:1431:1: (lv_upperBound_3_0= ruleDOUBLE )
            {
            // InternalSensidl.g:1431:1: (lv_upperBound_3_0= ruleDOUBLE )
            // InternalSensidl.g:1432:3: lv_upperBound_3_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_49);
            lv_upperBound_3_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntervalRule());
            	        }
                   		set(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_3_0, 
                    		"de.fzi.sensidl.language.Sensidl.DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_2); 

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
    // InternalSensidl.g:1460:1: entryRuleDataConversion returns [EObject current=null] : iv_ruleDataConversion= ruleDataConversion EOF ;
    public final EObject entryRuleDataConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataConversion = null;


        try {
            // InternalSensidl.g:1461:2: (iv_ruleDataConversion= ruleDataConversion EOF )
            // InternalSensidl.g:1462:2: iv_ruleDataConversion= ruleDataConversion EOF
            {
             newCompositeNode(grammarAccess.getDataConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataConversion=ruleDataConversion();

            state._fsp--;

             current =iv_ruleDataConversion; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:1469:1: ruleDataConversion returns [EObject current=null] : (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval ) ;
    public final EObject ruleDataConversion() throws RecognitionException {
        EObject current = null;

        EObject this_LinearDataConversion_0 = null;

        EObject this_LinearDataConversionWithInterval_1 = null;


         enterRule(); 
            
        try {
            // InternalSensidl.g:1472:28: ( (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval ) )
            // InternalSensidl.g:1473:1: (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval )
            {
            // InternalSensidl.g:1473:1: (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            else if ( (LA34_0==41) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalSensidl.g:1474:5: this_LinearDataConversion_0= ruleLinearDataConversion
                    {
                     
                            newCompositeNode(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_LinearDataConversion_0=ruleLinearDataConversion();

                    state._fsp--;

                     
                            current = this_LinearDataConversion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1484:5: this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval
                    {
                     
                            newCompositeNode(grammarAccess.getDataConversionAccess().getLinearDataConversionWithIntervalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1500:1: entryRuleLinearDataConversion returns [EObject current=null] : iv_ruleLinearDataConversion= ruleLinearDataConversion EOF ;
    public final EObject entryRuleLinearDataConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearDataConversion = null;


        try {
            // InternalSensidl.g:1501:2: (iv_ruleLinearDataConversion= ruleLinearDataConversion EOF )
            // InternalSensidl.g:1502:2: iv_ruleLinearDataConversion= ruleLinearDataConversion EOF
            {
             newCompositeNode(grammarAccess.getLinearDataConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinearDataConversion=ruleLinearDataConversion();

            state._fsp--;

             current =iv_ruleLinearDataConversion; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:1509:1: ruleLinearDataConversion returns [EObject current=null] : (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) ) ;
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
            // InternalSensidl.g:1512:28: ( (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) ) )
            // InternalSensidl.g:1513:1: (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) )
            {
            // InternalSensidl.g:1513:1: (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) )
            // InternalSensidl.g:1513:3: otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getLinearDataConversionAccess().getWithScalingFactorKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_17); 

                	newLeafNode(otherlv_1, grammarAccess.getLinearDataConversionAccess().getColonKeyword_1());
                
            // InternalSensidl.g:1521:1: ( (lv_scalingFactor_2_0= ruleDOUBLE ) )
            // InternalSensidl.g:1522:1: (lv_scalingFactor_2_0= ruleDOUBLE )
            {
            // InternalSensidl.g:1522:1: (lv_scalingFactor_2_0= ruleDOUBLE )
            // InternalSensidl.g:1523:3: lv_scalingFactor_2_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_50);
            lv_scalingFactor_2_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinearDataConversionRule());
            	        }
                   		set(
                   			current, 
                   			"scalingFactor",
                    		lv_scalingFactor_2_0, 
                    		"de.fzi.sensidl.language.Sensidl.DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getLinearDataConversionAccess().getAndOffsetKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_17); 

                	newLeafNode(otherlv_4, grammarAccess.getLinearDataConversionAccess().getColonKeyword_4());
                
            // InternalSensidl.g:1547:1: ( (lv_offset_5_0= ruleDOUBLE ) )
            // InternalSensidl.g:1548:1: (lv_offset_5_0= ruleDOUBLE )
            {
            // InternalSensidl.g:1548:1: (lv_offset_5_0= ruleDOUBLE )
            // InternalSensidl.g:1549:3: lv_offset_5_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLinearDataConversionAccess().getOffsetDOUBLEParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_offset_5_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinearDataConversionRule());
            	        }
                   		set(
                   			current, 
                   			"offset",
                    		lv_offset_5_0, 
                    		"de.fzi.sensidl.language.Sensidl.DOUBLE");
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
    // InternalSensidl.g:1573:1: entryRuleLinearDataConversionWithInterval returns [EObject current=null] : iv_ruleLinearDataConversionWithInterval= ruleLinearDataConversionWithInterval EOF ;
    public final EObject entryRuleLinearDataConversionWithInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearDataConversionWithInterval = null;


        try {
            // InternalSensidl.g:1574:2: (iv_ruleLinearDataConversionWithInterval= ruleLinearDataConversionWithInterval EOF )
            // InternalSensidl.g:1575:2: iv_ruleLinearDataConversionWithInterval= ruleLinearDataConversionWithInterval EOF
            {
             newCompositeNode(grammarAccess.getLinearDataConversionWithIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinearDataConversionWithInterval=ruleLinearDataConversionWithInterval();

            state._fsp--;

             current =iv_ruleLinearDataConversionWithInterval; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:1582:1: ruleLinearDataConversionWithInterval returns [EObject current=null] : (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) ) ) ;
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
            // InternalSensidl.g:1585:28: ( (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) ) ) )
            // InternalSensidl.g:1586:1: (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) ) )
            {
            // InternalSensidl.g:1586:1: (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) ) )
            // InternalSensidl.g:1586:3: otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_47); 

                	newLeafNode(otherlv_0, grammarAccess.getLinearDataConversionWithIntervalAccess().getByLinearMappingKeyword_0());
                
            // InternalSensidl.g:1590:1: ( (lv_fromInterval_1_0= ruleInterval ) )
            // InternalSensidl.g:1591:1: (lv_fromInterval_1_0= ruleInterval )
            {
            // InternalSensidl.g:1591:1: (lv_fromInterval_1_0= ruleInterval )
            // InternalSensidl.g:1592:3: lv_fromInterval_1_0= ruleInterval
            {
             
            	        newCompositeNode(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalIntervalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_51);
            lv_fromInterval_1_0=ruleInterval();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinearDataConversionWithIntervalRule());
            	        }
                   		set(
                   			current, 
                   			"fromInterval",
                    		lv_fromInterval_1_0, 
                    		"de.fzi.sensidl.language.Sensidl.Interval");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_47); 

                	newLeafNode(otherlv_2, grammarAccess.getLinearDataConversionWithIntervalAccess().getEqualsSignGreaterThanSignKeyword_2());
                
            // InternalSensidl.g:1612:1: ( (lv_toInterval_3_0= ruleInterval ) )
            // InternalSensidl.g:1613:1: (lv_toInterval_3_0= ruleInterval )
            {
            // InternalSensidl.g:1613:1: (lv_toInterval_3_0= ruleInterval )
            // InternalSensidl.g:1614:3: lv_toInterval_3_0= ruleInterval
            {
             
            	        newCompositeNode(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalIntervalParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_25);
            lv_toInterval_3_0=ruleInterval();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinearDataConversionWithIntervalRule());
            	        }
                   		set(
                   			current, 
                   			"toInterval",
                    		lv_toInterval_3_0, 
                    		"de.fzi.sensidl.language.Sensidl.Interval");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_26); 

                	newLeafNode(otherlv_4, grammarAccess.getLinearDataConversionWithIntervalAccess().getAsKeyword_4());
                
            // InternalSensidl.g:1634:1: ( (lv_dataType_5_0= ruleDataType ) )
            // InternalSensidl.g:1635:1: (lv_dataType_5_0= ruleDataType )
            {
            // InternalSensidl.g:1635:1: (lv_dataType_5_0= ruleDataType )
            // InternalSensidl.g:1636:3: lv_dataType_5_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeDataTypeEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_dataType_5_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinearDataConversionWithIntervalRule());
            	        }
                   		set(
                   			current, 
                   			"dataType",
                    		lv_dataType_5_0, 
                    		"de.fzi.sensidl.language.Sensidl.DataType");
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
    // InternalSensidl.g:1660:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalSensidl.g:1661:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalSensidl.g:1662:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:1669:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // InternalSensidl.g:1672:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalSensidl.g:1673:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalSensidl.g:1673:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalSensidl.g:1673:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_52); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            // InternalSensidl.g:1680:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==43) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSensidl.g:1681:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,43,FOLLOW_17); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

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
    // InternalSensidl.g:1701:1: entryRuleUNIT returns [String current=null] : iv_ruleUNIT= ruleUNIT EOF ;
    public final String entryRuleUNIT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNIT = null;


        try {
            // InternalSensidl.g:1702:2: (iv_ruleUNIT= ruleUNIT EOF )
            // InternalSensidl.g:1703:2: iv_ruleUNIT= ruleUNIT EOF
            {
             newCompositeNode(grammarAccess.getUNITRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNIT=ruleUNIT();

            state._fsp--;

             current =iv_ruleUNIT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:1710:1: ruleUNIT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* ) ;
    public final AntlrDatatypeRuleToken ruleUNIT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalSensidl.g:1713:28: ( ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* ) )
            // InternalSensidl.g:1714:1: ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* )
            {
            // InternalSensidl.g:1714:1: ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* )
            // InternalSensidl.g:1714:2: (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )*
            {
            // InternalSensidl.g:1714:2: (this_ID_0= RULE_ID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    int LA36_2 = input.LA(2);

                    if ( (LA36_2==EOF||(LA36_2>=RULE_ID && LA36_2<=RULE_DESCRIPTION)||LA36_2==RULE_ANY_OTHER||LA36_2==13||LA36_2==16||(LA36_2>=27 && LA36_2<=28)||LA36_2==34) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalSensidl.g:1714:7: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_53); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getUNITAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalSensidl.g:1721:3: (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ANY_OTHER) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSensidl.g:1721:8: this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )*
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_53); 

            	    		current.merge(this_ANY_OTHER_1);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_1, grammarAccess.getUNITAccess().getANY_OTHERTerminalRuleCall_1_0()); 
            	        
            	    // InternalSensidl.g:1728:1: (this_ID_2= RULE_ID )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==RULE_ID) ) {
            	            int LA37_2 = input.LA(2);

            	            if ( (LA37_2==EOF||(LA37_2>=RULE_ID && LA37_2<=RULE_DESCRIPTION)||LA37_2==RULE_ANY_OTHER||LA37_2==13||LA37_2==16||(LA37_2>=27 && LA37_2<=28)||LA37_2==34) ) {
            	                alt37=1;
            	            }


            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // InternalSensidl.g:1728:6: this_ID_2= RULE_ID
            	    	    {
            	    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_53); 

            	    	    		current.merge(this_ID_2);
            	    	        
            	    	     
            	    	        newLeafNode(this_ID_2, grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);


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
    // $ANTLR end "ruleUNIT"


    // $ANTLR start "ruleCoding"
    // InternalSensidl.g:1743:1: ruleCoding returns [Enumerator current=null] : ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) ) ;
    public final Enumerator ruleCoding() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalSensidl.g:1745:28: ( ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) ) )
            // InternalSensidl.g:1746:1: ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) )
            {
            // InternalSensidl.g:1746:1: ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            else if ( (LA39_0==45) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalSensidl.g:1746:2: (enumLiteral_0= 'SENSIDL_BINARY' )
                    {
                    // InternalSensidl.g:1746:2: (enumLiteral_0= 'SENSIDL_BINARY' )
                    // InternalSensidl.g:1746:4: enumLiteral_0= 'SENSIDL_BINARY'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                            current = grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1752:6: (enumLiteral_1= 'SENSIDL_JSON' )
                    {
                    // InternalSensidl.g:1752:6: (enumLiteral_1= 'SENSIDL_JSON' )
                    // InternalSensidl.g:1752:8: enumLiteral_1= 'SENSIDL_JSON'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

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
    // InternalSensidl.g:1762:1: ruleEndianness returns [Enumerator current=null] : ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) ;
    public final Enumerator ruleEndianness() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalSensidl.g:1764:28: ( ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) )
            // InternalSensidl.g:1765:1: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            {
            // InternalSensidl.g:1765:1: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            else if ( (LA40_0==47) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalSensidl.g:1765:2: (enumLiteral_0= 'BIG_ENDIAN' )
                    {
                    // InternalSensidl.g:1765:2: (enumLiteral_0= 'BIG_ENDIAN' )
                    // InternalSensidl.g:1765:4: enumLiteral_0= 'BIG_ENDIAN'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                            current = grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1771:6: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    {
                    // InternalSensidl.g:1771:6: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    // InternalSensidl.g:1771:8: enumLiteral_1= 'LITTLE_ENDIAN'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

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
    // InternalSensidl.g:1781:1: ruleDataTypeNotAdjustable returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) ) ;
    public final Enumerator ruleDataTypeNotAdjustable() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalSensidl.g:1783:28: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) ) )
            // InternalSensidl.g:1784:1: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) )
            {
            // InternalSensidl.g:1784:1: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            else if ( (LA41_0==49) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalSensidl.g:1784:2: (enumLiteral_0= 'STRING' )
                    {
                    // InternalSensidl.g:1784:2: (enumLiteral_0= 'STRING' )
                    // InternalSensidl.g:1784:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                            current = grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1790:6: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalSensidl.g:1790:6: (enumLiteral_1= 'BOOLEAN' )
                    // InternalSensidl.g:1790:8: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

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
    // InternalSensidl.g:1800:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) ) ;
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
            // InternalSensidl.g:1802:28: ( ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) ) )
            // InternalSensidl.g:1803:1: ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) )
            {
            // InternalSensidl.g:1803:1: ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) )
            int alt42=10;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt42=1;
                }
                break;
            case 51:
                {
                alt42=2;
                }
                break;
            case 52:
                {
                alt42=3;
                }
                break;
            case 53:
                {
                alt42=4;
                }
                break;
            case 54:
                {
                alt42=5;
                }
                break;
            case 55:
                {
                alt42=6;
                }
                break;
            case 56:
                {
                alt42=7;
                }
                break;
            case 57:
                {
                alt42=8;
                }
                break;
            case 58:
                {
                alt42=9;
                }
                break;
            case 59:
                {
                alt42=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalSensidl.g:1803:2: (enumLiteral_0= 'INT8' )
                    {
                    // InternalSensidl.g:1803:2: (enumLiteral_0= 'INT8' )
                    // InternalSensidl.g:1803:4: enumLiteral_0= 'INT8'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                            current = grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1809:6: (enumLiteral_1= 'UINT8' )
                    {
                    // InternalSensidl.g:1809:6: (enumLiteral_1= 'UINT8' )
                    // InternalSensidl.g:1809:8: enumLiteral_1= 'UINT8'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                            current = grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:1815:6: (enumLiteral_2= 'INT16' )
                    {
                    // InternalSensidl.g:1815:6: (enumLiteral_2= 'INT16' )
                    // InternalSensidl.g:1815:8: enumLiteral_2= 'INT16'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                            current = grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSensidl.g:1821:6: (enumLiteral_3= 'UINT16' )
                    {
                    // InternalSensidl.g:1821:6: (enumLiteral_3= 'UINT16' )
                    // InternalSensidl.g:1821:8: enumLiteral_3= 'UINT16'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); 

                            current = grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalSensidl.g:1827:6: (enumLiteral_4= 'INT32' )
                    {
                    // InternalSensidl.g:1827:6: (enumLiteral_4= 'INT32' )
                    // InternalSensidl.g:1827:8: enumLiteral_4= 'INT32'
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_2); 

                            current = grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalSensidl.g:1833:6: (enumLiteral_5= 'UINT32' )
                    {
                    // InternalSensidl.g:1833:6: (enumLiteral_5= 'UINT32' )
                    // InternalSensidl.g:1833:8: enumLiteral_5= 'UINT32'
                    {
                    enumLiteral_5=(Token)match(input,55,FOLLOW_2); 

                            current = grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalSensidl.g:1839:6: (enumLiteral_6= 'INT64' )
                    {
                    // InternalSensidl.g:1839:6: (enumLiteral_6= 'INT64' )
                    // InternalSensidl.g:1839:8: enumLiteral_6= 'INT64'
                    {
                    enumLiteral_6=(Token)match(input,56,FOLLOW_2); 

                            current = grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalSensidl.g:1845:6: (enumLiteral_7= 'UINT64' )
                    {
                    // InternalSensidl.g:1845:6: (enumLiteral_7= 'UINT64' )
                    // InternalSensidl.g:1845:8: enumLiteral_7= 'UINT64'
                    {
                    enumLiteral_7=(Token)match(input,57,FOLLOW_2); 

                            current = grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // InternalSensidl.g:1851:6: (enumLiteral_8= 'FLOAT' )
                    {
                    // InternalSensidl.g:1851:6: (enumLiteral_8= 'FLOAT' )
                    // InternalSensidl.g:1851:8: enumLiteral_8= 'FLOAT'
                    {
                    enumLiteral_8=(Token)match(input,58,FOLLOW_2); 

                            current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // InternalSensidl.g:1857:6: (enumLiteral_9= 'DOUBLE' )
                    {
                    // InternalSensidl.g:1857:6: (enumLiteral_9= 'DOUBLE' )
                    // InternalSensidl.g:1857:8: enumLiteral_9= 'DOUBLE'
                    {
                    enumLiteral_9=(Token)match(input,59,FOLLOW_2); 

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


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\3\uffff\14\20\3\uffff";
    static final String dfa_3s = "\1\4\1\31\1\60\14\4\3\uffff";
    static final String dfa_4s = "\1\4\1\31\1\73\14\40\3\uffff";
    static final String dfa_5s = "\17\uffff\1\3\1\2\1\1";
    static final String dfa_6s = "\22\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\17\1\uffff\1\20\2\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\17\1\uffff\1\20\2\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\21\1\uffff\1\20\2\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\21\1\uffff\1\20\2\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\21\1\uffff\1\20\2\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\21\1\uffff\1\20\2\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\21\1\uffff\1\20\2\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\21\1\uffff\1\20\2\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\21\1\uffff\1\20\2\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\21\1\uffff\1\20\2\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\21\1\uffff\1\20\2\uffff\2\20",
            "\2\20\7\uffff\1\20\2\uffff\1\20\11\uffff\1\21\1\uffff\1\20\2\uffff\2\20",
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "579:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable )";
        }
    }
    static final String dfa_8s = "\57\uffff";
    static final String dfa_9s = "\1\2\21\uffff\1\27\7\uffff\1\27\12\uffff\12\27";
    static final String dfa_10s = "\1\4\1\43\1\uffff\1\16\1\44\1\uffff\2\7\1\50\1\45\1\7\1\16\2\7\1\50\1\7\1\45\1\46\1\4\1\7\1\52\1\7\2\uffff\1\46\1\44\1\4\1\7\1\45\2\7\1\45\1\46\1\7\1\31\1\46\1\62\12\4";
    static final String dfa_11s = "\1\34\1\51\1\uffff\1\16\1\44\1\uffff\2\7\2\53\1\7\1\16\2\7\1\50\1\7\1\45\2\53\1\7\1\52\1\7\2\uffff\1\46\1\44\1\34\1\7\1\53\2\7\1\45\1\53\1\7\1\31\1\46\1\73\12\34";
    static final String dfa_12s = "\2\uffff\1\4\2\uffff\1\2\20\uffff\1\3\1\1\27\uffff";
    static final String dfa_13s = "\57\uffff}>";
    static final String[] dfa_14s = {
            "\2\2\12\uffff\1\2\12\uffff\1\1\1\2",
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
            "\2\27\12\uffff\1\27\1\uffff\1\26\11\uffff\1\27\16\uffff\1\25",
            "\1\30",
            "\1\31",
            "\1\32",
            "",
            "",
            "\1\24",
            "\1\33",
            "\2\27\12\uffff\1\27\1\uffff\1\26\11\uffff\1\27",
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
            "\2\27\12\uffff\1\27\1\uffff\1\26\11\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\11\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\11\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\11\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\11\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\11\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\11\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\11\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\11\uffff\1\27",
            "\2\27\12\uffff\1\27\1\uffff\1\26\11\uffff\1\27"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "717:4: ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000104A020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000004A020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0FFC000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000018002130L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000018002022L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000018000022L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0FFF000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000190002022L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000110002022L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000010002022L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000400002130L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000400002022L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000400000022L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000112L});

}