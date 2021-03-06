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
    // InternalSensidl.g:65:1: entryRuleSensorInterface returns [EObject current=null] : iv_ruleSensorInterface= ruleSensorInterface EOF ;
    public final EObject entryRuleSensorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorInterface = null;


        try {
            // InternalSensidl.g:65:56: (iv_ruleSensorInterface= ruleSensorInterface EOF )
            // InternalSensidl.g:66:2: iv_ruleSensorInterface= ruleSensorInterface EOF
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
    // InternalSensidl.g:72:1: ruleSensorInterface returns [EObject current=null] : (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' ) ;
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
            // InternalSensidl.g:78:2: ( (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' ) )
            // InternalSensidl.g:79:2: (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' )
            {
            // InternalSensidl.g:79:2: (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}' )
            // InternalSensidl.g:80:3: otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_DESCRIPTION ) )? (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_encodingSettings_7_0= ruleEncodingSettings ) ) ( (lv_dataDescription_8_0= ruleSensorDataDescription ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorInterfaceAccess().getSensorInterfaceKeyword_0());
            		
            // InternalSensidl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSensidl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSensidl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalSensidl.g:86:5: lv_name_1_0= RULE_ID
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

            // InternalSensidl.g:102:3: ( (lv_description_2_0= RULE_DESCRIPTION ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DESCRIPTION) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSensidl.g:103:4: (lv_description_2_0= RULE_DESCRIPTION )
                    {
                    // InternalSensidl.g:103:4: (lv_description_2_0= RULE_DESCRIPTION )
                    // InternalSensidl.g:104:5: lv_description_2_0= RULE_DESCRIPTION
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

            // InternalSensidl.g:120:3: (otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSensidl.g:121:4: otherlv_3= 'with identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorInterfaceAccess().getWithIdentifierKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorInterfaceAccess().getColonKeyword_3_1());
                    			
                    // InternalSensidl.g:129:4: ( (lv_ID_5_0= RULE_STRING ) )
                    // InternalSensidl.g:130:5: (lv_ID_5_0= RULE_STRING )
                    {
                    // InternalSensidl.g:130:5: (lv_ID_5_0= RULE_STRING )
                    // InternalSensidl.g:131:6: lv_ID_5_0= RULE_STRING
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
            		
            // InternalSensidl.g:152:3: ( (lv_encodingSettings_7_0= ruleEncodingSettings ) )
            // InternalSensidl.g:153:4: (lv_encodingSettings_7_0= ruleEncodingSettings )
            {
            // InternalSensidl.g:153:4: (lv_encodingSettings_7_0= ruleEncodingSettings )
            // InternalSensidl.g:154:5: lv_encodingSettings_7_0= ruleEncodingSettings
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

            // InternalSensidl.g:171:3: ( (lv_dataDescription_8_0= ruleSensorDataDescription ) )
            // InternalSensidl.g:172:4: (lv_dataDescription_8_0= ruleSensorDataDescription )
            {
            // InternalSensidl.g:172:4: (lv_dataDescription_8_0= ruleSensorDataDescription )
            // InternalSensidl.g:173:5: lv_dataDescription_8_0= ruleSensorDataDescription
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
    // InternalSensidl.g:198:1: entryRuleEncodingSettings returns [EObject current=null] : iv_ruleEncodingSettings= ruleEncodingSettings EOF ;
    public final EObject entryRuleEncodingSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncodingSettings = null;


        try {
            // InternalSensidl.g:198:57: (iv_ruleEncodingSettings= ruleEncodingSettings EOF )
            // InternalSensidl.g:199:2: iv_ruleEncodingSettings= ruleEncodingSettings EOF
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
    // InternalSensidl.g:205:1: ruleEncodingSettings returns [EObject current=null] : (otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? ) ;
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
            // InternalSensidl.g:211:2: ( (otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? ) )
            // InternalSensidl.g:212:2: (otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? )
            {
            // InternalSensidl.g:212:2: (otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? )
            // InternalSensidl.g:213:3: otherlv_0= 'encoding' otherlv_1= ':' ( (lv_coding_2_0= ruleCoding ) ) otherlv_3= ',' otherlv_4= 'endianness' otherlv_5= ':' ( (lv_endianness_6_0= ruleEndianness ) ) otherlv_7= ',' otherlv_8= 'alignment' otherlv_9= ':' ( (lv_alignment_10_0= RULE_INT ) ) otherlv_11= 'BIT' (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEncodingSettingsAccess().getEncodingKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEncodingSettingsAccess().getColonKeyword_1());
            		
            // InternalSensidl.g:221:3: ( (lv_coding_2_0= ruleCoding ) )
            // InternalSensidl.g:222:4: (lv_coding_2_0= ruleCoding )
            {
            // InternalSensidl.g:222:4: (lv_coding_2_0= ruleCoding )
            // InternalSensidl.g:223:5: lv_coding_2_0= ruleCoding
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
            		
            // InternalSensidl.g:252:3: ( (lv_endianness_6_0= ruleEndianness ) )
            // InternalSensidl.g:253:4: (lv_endianness_6_0= ruleEndianness )
            {
            // InternalSensidl.g:253:4: (lv_endianness_6_0= ruleEndianness )
            // InternalSensidl.g:254:5: lv_endianness_6_0= ruleEndianness
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
            		
            // InternalSensidl.g:283:3: ( (lv_alignment_10_0= RULE_INT ) )
            // InternalSensidl.g:284:4: (lv_alignment_10_0= RULE_INT )
            {
            // InternalSensidl.g:284:4: (lv_alignment_10_0= RULE_INT )
            // InternalSensidl.g:285:5: lv_alignment_10_0= RULE_INT
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
            		
            // InternalSensidl.g:305:3: (otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSensidl.g:306:4: otherlv_12= 'with identifier' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getEncodingSettingsAccess().getWithIdentifierKeyword_12_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getEncodingSettingsAccess().getColonKeyword_12_1());
                    			
                    // InternalSensidl.g:314:4: ( (lv_ID_14_0= RULE_STRING ) )
                    // InternalSensidl.g:315:5: (lv_ID_14_0= RULE_STRING )
                    {
                    // InternalSensidl.g:315:5: (lv_ID_14_0= RULE_STRING )
                    // InternalSensidl.g:316:6: lv_ID_14_0= RULE_STRING
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
    // InternalSensidl.g:337:1: entryRuleSensorDataDescription returns [EObject current=null] : iv_ruleSensorDataDescription= ruleSensorDataDescription EOF ;
    public final EObject entryRuleSensorDataDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorDataDescription = null;


        try {
            // InternalSensidl.g:337:62: (iv_ruleSensorDataDescription= ruleSensorDataDescription EOF )
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
    // InternalSensidl.g:344:1: ruleSensorDataDescription returns [EObject current=null] : (otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}' ) ;
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
            // InternalSensidl.g:350:2: ( (otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}' ) )
            // InternalSensidl.g:351:2: (otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}' )
            {
            // InternalSensidl.g:351:2: (otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}' )
            // InternalSensidl.g:352:3: otherlv_0= 'sensorData' () (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_dataSets_6_0= ruleDataSet ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorDataDescriptionAccess().getSensorDataKeyword_0());
            		
            // InternalSensidl.g:356:3: ()
            // InternalSensidl.g:357:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1(),
            					current);
            			

            }

            // InternalSensidl.g:363:3: (otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSensidl.g:364:4: otherlv_2= 'with identifier' otherlv_3= ':' ( (lv_ID_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getSensorDataDescriptionAccess().getWithIdentifierKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorDataDescriptionAccess().getColonKeyword_2_1());
                    			
                    // InternalSensidl.g:372:4: ( (lv_ID_4_0= RULE_STRING ) )
                    // InternalSensidl.g:373:5: (lv_ID_4_0= RULE_STRING )
                    {
                    // InternalSensidl.g:373:5: (lv_ID_4_0= RULE_STRING )
                    // InternalSensidl.g:374:6: lv_ID_4_0= RULE_STRING
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
            		
            // InternalSensidl.g:395:3: ( (lv_dataSets_6_0= ruleDataSet ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSensidl.g:396:4: (lv_dataSets_6_0= ruleDataSet )
            	    {
            	    // InternalSensidl.g:396:4: (lv_dataSets_6_0= ruleDataSet )
            	    // InternalSensidl.g:397:5: lv_dataSets_6_0= ruleDataSet
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
    // InternalSensidl.g:422:1: entryRuleDataSet returns [EObject current=null] : iv_ruleDataSet= ruleDataSet EOF ;
    public final EObject entryRuleDataSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSet = null;


        try {
            // InternalSensidl.g:422:48: (iv_ruleDataSet= ruleDataSet EOF )
            // InternalSensidl.g:423:2: iv_ruleDataSet= ruleDataSet EOF
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
    // InternalSensidl.g:429:1: ruleDataSet returns [EObject current=null] : (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( ( (lv_data_11_0= ruleData ) ) | ( (lv_method_12_0= ruleMethod ) ) )* otherlv_13= '}' ) ;
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
            // InternalSensidl.g:435:2: ( (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( ( (lv_data_11_0= ruleData ) ) | ( (lv_method_12_0= ruleMethod ) ) )* otherlv_13= '}' ) )
            // InternalSensidl.g:436:2: (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( ( (lv_data_11_0= ruleData ) ) | ( (lv_method_12_0= ruleMethod ) ) )* otherlv_13= '}' )
            {
            // InternalSensidl.g:436:2: (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( ( (lv_data_11_0= ruleData ) ) | ( (lv_method_12_0= ruleMethod ) ) )* otherlv_13= '}' )
            // InternalSensidl.g:437:3: otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? ( (lv_description_9_0= RULE_DESCRIPTION ) )? otherlv_10= '{' ( ( (lv_data_11_0= ruleData ) ) | ( (lv_method_12_0= ruleMethod ) ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataSetAccess().getDataSetKeyword_0());
            		
            // InternalSensidl.g:441:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSensidl.g:442:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSensidl.g:442:4: (lv_name_1_0= RULE_ID )
            // InternalSensidl.g:443:5: lv_name_1_0= RULE_ID
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

            // InternalSensidl.g:459:3: (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSensidl.g:460:4: otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataSetAccess().getUsesKeyword_2_0());
                    			
                    // InternalSensidl.g:464:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSensidl.g:465:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSensidl.g:465:5: (otherlv_3= RULE_ID )
                    // InternalSensidl.g:466:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataSetRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_3, grammarAccess.getDataSetAccess().getUsedDataSetsDataSetCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSensidl.g:478:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSensidl.g:479:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDataSetAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSensidl.g:483:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSensidl.g:484:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSensidl.g:484:5: (otherlv_5= RULE_ID )
            	    // InternalSensidl.g:485:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDataSetRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    						newLeafNode(otherlv_5, grammarAccess.getDataSetAccess().getUsedDataSetsDataSetCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalSensidl.g:497:3: (otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSensidl.g:498:4: otherlv_6= 'with identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataSetAccess().getWithIdentifierKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getDataSetAccess().getColonKeyword_4_1());
                    			
                    // InternalSensidl.g:506:4: ( (lv_ID_8_0= RULE_STRING ) )
                    // InternalSensidl.g:507:5: (lv_ID_8_0= RULE_STRING )
                    {
                    // InternalSensidl.g:507:5: (lv_ID_8_0= RULE_STRING )
                    // InternalSensidl.g:508:6: lv_ID_8_0= RULE_STRING
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

            // InternalSensidl.g:525:3: ( (lv_description_9_0= RULE_DESCRIPTION ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DESCRIPTION) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSensidl.g:526:4: (lv_description_9_0= RULE_DESCRIPTION )
                    {
                    // InternalSensidl.g:526:4: (lv_description_9_0= RULE_DESCRIPTION )
                    // InternalSensidl.g:527:5: lv_description_9_0= RULE_DESCRIPTION
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
            		
            // InternalSensidl.g:547:3: ( ( (lv_data_11_0= ruleData ) ) | ( (lv_method_12_0= ruleMethod ) ) )*
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
            	    // InternalSensidl.g:548:4: ( (lv_data_11_0= ruleData ) )
            	    {
            	    // InternalSensidl.g:548:4: ( (lv_data_11_0= ruleData ) )
            	    // InternalSensidl.g:549:5: (lv_data_11_0= ruleData )
            	    {
            	    // InternalSensidl.g:549:5: (lv_data_11_0= ruleData )
            	    // InternalSensidl.g:550:6: lv_data_11_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_7_0_0());
            	    					
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


            	    }
            	    break;
            	case 2 :
            	    // InternalSensidl.g:568:4: ( (lv_method_12_0= ruleMethod ) )
            	    {
            	    // InternalSensidl.g:568:4: ( (lv_method_12_0= ruleMethod ) )
            	    // InternalSensidl.g:569:5: (lv_method_12_0= ruleMethod )
            	    {
            	    // InternalSensidl.g:569:5: (lv_method_12_0= ruleMethod )
            	    // InternalSensidl.g:570:6: lv_method_12_0= ruleMethod
            	    {

            	    						newCompositeNode(grammarAccess.getDataSetAccess().getMethodMethodParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_method_12_0=ruleMethod();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataSetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"method",
            	    							lv_method_12_0,
            	    							"de.fzi.sensidl.language.Sensidl.Method");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSensidl.g:596:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalSensidl.g:596:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalSensidl.g:597:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:603:1: ruleMethod returns [EObject current=null] : ( ( ( (lv_visibility_0_0= '+' ) ) | ( (lv_visibility_1_0= '-' ) ) | ( (lv_visibility_2_0= '#' ) ) | ( (lv_visibility_3_0= '~' ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameter_6_0= ruleMethodParameter ) )? (otherlv_7= ',' ( (lv_parameter_8_0= ruleMethodParameter ) ) )* otherlv_9= ')' (otherlv_10= ':' ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= 'as' otherlv_15= 'Method' (otherlv_16= 'with identifier' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? ( (lv_description_19_0= RULE_DESCRIPTION ) )? ) ;
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
            // InternalSensidl.g:609:2: ( ( ( ( (lv_visibility_0_0= '+' ) ) | ( (lv_visibility_1_0= '-' ) ) | ( (lv_visibility_2_0= '#' ) ) | ( (lv_visibility_3_0= '~' ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameter_6_0= ruleMethodParameter ) )? (otherlv_7= ',' ( (lv_parameter_8_0= ruleMethodParameter ) ) )* otherlv_9= ')' (otherlv_10= ':' ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= 'as' otherlv_15= 'Method' (otherlv_16= 'with identifier' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? ( (lv_description_19_0= RULE_DESCRIPTION ) )? ) )
            // InternalSensidl.g:610:2: ( ( ( (lv_visibility_0_0= '+' ) ) | ( (lv_visibility_1_0= '-' ) ) | ( (lv_visibility_2_0= '#' ) ) | ( (lv_visibility_3_0= '~' ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameter_6_0= ruleMethodParameter ) )? (otherlv_7= ',' ( (lv_parameter_8_0= ruleMethodParameter ) ) )* otherlv_9= ')' (otherlv_10= ':' ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= 'as' otherlv_15= 'Method' (otherlv_16= 'with identifier' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? ( (lv_description_19_0= RULE_DESCRIPTION ) )? )
            {
            // InternalSensidl.g:610:2: ( ( ( (lv_visibility_0_0= '+' ) ) | ( (lv_visibility_1_0= '-' ) ) | ( (lv_visibility_2_0= '#' ) ) | ( (lv_visibility_3_0= '~' ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameter_6_0= ruleMethodParameter ) )? (otherlv_7= ',' ( (lv_parameter_8_0= ruleMethodParameter ) ) )* otherlv_9= ')' (otherlv_10= ':' ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= 'as' otherlv_15= 'Method' (otherlv_16= 'with identifier' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? ( (lv_description_19_0= RULE_DESCRIPTION ) )? )
            // InternalSensidl.g:611:3: ( ( (lv_visibility_0_0= '+' ) ) | ( (lv_visibility_1_0= '-' ) ) | ( (lv_visibility_2_0= '#' ) ) | ( (lv_visibility_3_0= '~' ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameter_6_0= ruleMethodParameter ) )? (otherlv_7= ',' ( (lv_parameter_8_0= ruleMethodParameter ) ) )* otherlv_9= ')' (otherlv_10= ':' ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= 'as' otherlv_15= 'Method' (otherlv_16= 'with identifier' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? ( (lv_description_19_0= RULE_DESCRIPTION ) )?
            {
            // InternalSensidl.g:611:3: ( ( (lv_visibility_0_0= '+' ) ) | ( (lv_visibility_1_0= '-' ) ) | ( (lv_visibility_2_0= '#' ) ) | ( (lv_visibility_3_0= '~' ) ) )?
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
                    // InternalSensidl.g:612:4: ( (lv_visibility_0_0= '+' ) )
                    {
                    // InternalSensidl.g:612:4: ( (lv_visibility_0_0= '+' ) )
                    // InternalSensidl.g:613:5: (lv_visibility_0_0= '+' )
                    {
                    // InternalSensidl.g:613:5: (lv_visibility_0_0= '+' )
                    // InternalSensidl.g:614:6: lv_visibility_0_0= '+'
                    {
                    lv_visibility_0_0=(Token)match(input,25,FOLLOW_3); 

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
                    // InternalSensidl.g:627:4: ( (lv_visibility_1_0= '-' ) )
                    {
                    // InternalSensidl.g:627:4: ( (lv_visibility_1_0= '-' ) )
                    // InternalSensidl.g:628:5: (lv_visibility_1_0= '-' )
                    {
                    // InternalSensidl.g:628:5: (lv_visibility_1_0= '-' )
                    // InternalSensidl.g:629:6: lv_visibility_1_0= '-'
                    {
                    lv_visibility_1_0=(Token)match(input,26,FOLLOW_3); 

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
                    // InternalSensidl.g:642:4: ( (lv_visibility_2_0= '#' ) )
                    {
                    // InternalSensidl.g:642:4: ( (lv_visibility_2_0= '#' ) )
                    // InternalSensidl.g:643:5: (lv_visibility_2_0= '#' )
                    {
                    // InternalSensidl.g:643:5: (lv_visibility_2_0= '#' )
                    // InternalSensidl.g:644:6: lv_visibility_2_0= '#'
                    {
                    lv_visibility_2_0=(Token)match(input,27,FOLLOW_3); 

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
                    // InternalSensidl.g:657:4: ( (lv_visibility_3_0= '~' ) )
                    {
                    // InternalSensidl.g:657:4: ( (lv_visibility_3_0= '~' ) )
                    // InternalSensidl.g:658:5: (lv_visibility_3_0= '~' )
                    {
                    // InternalSensidl.g:658:5: (lv_visibility_3_0= '~' )
                    // InternalSensidl.g:659:6: lv_visibility_3_0= '~'
                    {
                    lv_visibility_3_0=(Token)match(input,28,FOLLOW_3); 

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

            // InternalSensidl.g:672:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSensidl.g:673:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSensidl.g:673:4: (lv_name_4_0= RULE_ID )
            // InternalSensidl.g:674:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_4_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSensidl.g:694:3: ( (lv_parameter_6_0= ruleMethodParameter ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=57 && LA12_0<=68)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSensidl.g:695:4: (lv_parameter_6_0= ruleMethodParameter )
                    {
                    // InternalSensidl.g:695:4: (lv_parameter_6_0= ruleMethodParameter )
                    // InternalSensidl.g:696:5: lv_parameter_6_0= ruleMethodParameter
                    {

                    					newCompositeNode(grammarAccess.getMethodAccess().getParameterMethodParameterParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_parameter_6_0=ruleMethodParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodRule());
                    					}
                    					add(
                    						current,
                    						"parameter",
                    						lv_parameter_6_0,
                    						"de.fzi.sensidl.language.Sensidl.MethodParameter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSensidl.g:713:3: (otherlv_7= ',' ( (lv_parameter_8_0= ruleMethodParameter ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSensidl.g:714:4: otherlv_7= ',' ( (lv_parameter_8_0= ruleMethodParameter ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_28); 

            	    				newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSensidl.g:718:4: ( (lv_parameter_8_0= ruleMethodParameter ) )
            	    // InternalSensidl.g:719:5: (lv_parameter_8_0= ruleMethodParameter )
            	    {
            	    // InternalSensidl.g:719:5: (lv_parameter_8_0= ruleMethodParameter )
            	    // InternalSensidl.g:720:6: lv_parameter_8_0= ruleMethodParameter
            	    {

            	    						newCompositeNode(grammarAccess.getMethodAccess().getParameterMethodParameterParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_parameter_8_0=ruleMethodParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMethodRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameter",
            	    							lv_parameter_8_0,
            	    							"de.fzi.sensidl.language.Sensidl.MethodParameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_9=(Token)match(input,30,FOLLOW_29); 

            			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightParenthesisKeyword_5());
            		
            // InternalSensidl.g:742:3: (otherlv_10= ':' ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSensidl.g:743:4: otherlv_10= ':' ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    {
                    otherlv_10=(Token)match(input,14,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getColonKeyword_6_0());
                    			
                    // InternalSensidl.g:747:4: ( ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_13= RULE_ID ) ) )
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
                            // InternalSensidl.g:748:5: ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) )
                            {
                            // InternalSensidl.g:748:5: ( ( (lv_returnType_11_0= ruleDataType ) ) | ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) ) )
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
                                    // InternalSensidl.g:749:6: ( (lv_returnType_11_0= ruleDataType ) )
                                    {
                                    // InternalSensidl.g:749:6: ( (lv_returnType_11_0= ruleDataType ) )
                                    // InternalSensidl.g:750:7: (lv_returnType_11_0= ruleDataType )
                                    {
                                    // InternalSensidl.g:750:7: (lv_returnType_11_0= ruleDataType )
                                    // InternalSensidl.g:751:8: lv_returnType_11_0= ruleDataType
                                    {

                                    								newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeDataTypeEnumRuleCall_6_1_0_0_0());
                                    							
                                    pushFollow(FOLLOW_30);
                                    lv_returnType_11_0=ruleDataType();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getMethodRule());
                                    								}
                                    								set(
                                    									current,
                                    									"returnType",
                                    									lv_returnType_11_0,
                                    									"de.fzi.sensidl.language.Sensidl.DataType");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalSensidl.g:769:6: ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) )
                                    {
                                    // InternalSensidl.g:769:6: ( (lv_returnType_12_0= ruleDataTypeNotAdjustable ) )
                                    // InternalSensidl.g:770:7: (lv_returnType_12_0= ruleDataTypeNotAdjustable )
                                    {
                                    // InternalSensidl.g:770:7: (lv_returnType_12_0= ruleDataTypeNotAdjustable )
                                    // InternalSensidl.g:771:8: lv_returnType_12_0= ruleDataTypeNotAdjustable
                                    {

                                    								newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeDataTypeNotAdjustableEnumRuleCall_6_1_0_1_0());
                                    							
                                    pushFollow(FOLLOW_30);
                                    lv_returnType_12_0=ruleDataTypeNotAdjustable();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getMethodRule());
                                    								}
                                    								set(
                                    									current,
                                    									"returnType",
                                    									lv_returnType_12_0,
                                    									"de.fzi.sensidl.language.Sensidl.DataTypeNotAdjustable");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalSensidl.g:790:5: ( (otherlv_13= RULE_ID ) )
                            {
                            // InternalSensidl.g:790:5: ( (otherlv_13= RULE_ID ) )
                            // InternalSensidl.g:791:6: (otherlv_13= RULE_ID )
                            {
                            // InternalSensidl.g:791:6: (otherlv_13= RULE_ID )
                            // InternalSensidl.g:792:7: otherlv_13= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMethodRule());
                            							}
                            						
                            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_30); 

                            							newLeafNode(otherlv_13, grammarAccess.getMethodAccess().getReturnTypeDataSetDataSetCrossReference_6_1_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,31,FOLLOW_31); 

            			newLeafNode(otherlv_14, grammarAccess.getMethodAccess().getAsKeyword_7());
            		
            otherlv_15=(Token)match(input,32,FOLLOW_32); 

            			newLeafNode(otherlv_15, grammarAccess.getMethodAccess().getMethodKeyword_8());
            		
            // InternalSensidl.g:813:3: (otherlv_16= 'with identifier' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSensidl.g:814:4: otherlv_16= 'with identifier' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getMethodAccess().getWithIdentifierKeyword_9_0());
                    			
                    otherlv_17=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getMethodAccess().getColonKeyword_9_1());
                    			
                    // InternalSensidl.g:822:4: ( (lv_ID_18_0= RULE_STRING ) )
                    // InternalSensidl.g:823:5: (lv_ID_18_0= RULE_STRING )
                    {
                    // InternalSensidl.g:823:5: (lv_ID_18_0= RULE_STRING )
                    // InternalSensidl.g:824:6: lv_ID_18_0= RULE_STRING
                    {
                    lv_ID_18_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

                    						newLeafNode(lv_ID_18_0, grammarAccess.getMethodAccess().getIDSTRINGTerminalRuleCall_9_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ID",
                    							lv_ID_18_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSensidl.g:841:3: ( (lv_description_19_0= RULE_DESCRIPTION ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DESCRIPTION) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSensidl.g:842:4: (lv_description_19_0= RULE_DESCRIPTION )
                    {
                    // InternalSensidl.g:842:4: (lv_description_19_0= RULE_DESCRIPTION )
                    // InternalSensidl.g:843:5: lv_description_19_0= RULE_DESCRIPTION
                    {
                    lv_description_19_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_2); 

                    					newLeafNode(lv_description_19_0, grammarAccess.getMethodAccess().getDescriptionDESCRIPTIONTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_19_0,
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodParameter"
    // InternalSensidl.g:863:1: entryRuleMethodParameter returns [EObject current=null] : iv_ruleMethodParameter= ruleMethodParameter EOF ;
    public final EObject entryRuleMethodParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodParameter = null;


        try {
            // InternalSensidl.g:863:56: (iv_ruleMethodParameter= ruleMethodParameter EOF )
            // InternalSensidl.g:864:2: iv_ruleMethodParameter= ruleMethodParameter EOF
            {
             newCompositeNode(grammarAccess.getMethodParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodParameter=ruleMethodParameter();

            state._fsp--;

             current =iv_ruleMethodParameter; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:870:1: ruleMethodParameter returns [EObject current=null] : ( ( ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleMethodParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Enumerator lv_dataType_0_0 = null;

        Enumerator lv_dataType_1_0 = null;



        	enterRule();

        try {
            // InternalSensidl.g:876:2: ( ( ( ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalSensidl.g:877:2: ( ( ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalSensidl.g:877:2: ( ( ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_name_3_0= RULE_ID ) ) )
            // InternalSensidl.g:878:3: ( ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalSensidl.g:878:3: ( ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) ) | ( (otherlv_2= RULE_ID ) ) )
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
                    // InternalSensidl.g:879:4: ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) )
                    {
                    // InternalSensidl.g:879:4: ( ( (lv_dataType_0_0= ruleDataType ) ) | ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) ) )
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
                            // InternalSensidl.g:880:5: ( (lv_dataType_0_0= ruleDataType ) )
                            {
                            // InternalSensidl.g:880:5: ( (lv_dataType_0_0= ruleDataType ) )
                            // InternalSensidl.g:881:6: (lv_dataType_0_0= ruleDataType )
                            {
                            // InternalSensidl.g:881:6: (lv_dataType_0_0= ruleDataType )
                            // InternalSensidl.g:882:7: lv_dataType_0_0= ruleDataType
                            {

                            							newCompositeNode(grammarAccess.getMethodParameterAccess().getDataTypeDataTypeEnumRuleCall_0_0_0_0());
                            						
                            pushFollow(FOLLOW_3);
                            lv_dataType_0_0=ruleDataType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMethodParameterRule());
                            							}
                            							set(
                            								current,
                            								"dataType",
                            								lv_dataType_0_0,
                            								"de.fzi.sensidl.language.Sensidl.DataType");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSensidl.g:900:5: ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) )
                            {
                            // InternalSensidl.g:900:5: ( (lv_dataType_1_0= ruleDataTypeNotAdjustable ) )
                            // InternalSensidl.g:901:6: (lv_dataType_1_0= ruleDataTypeNotAdjustable )
                            {
                            // InternalSensidl.g:901:6: (lv_dataType_1_0= ruleDataTypeNotAdjustable )
                            // InternalSensidl.g:902:7: lv_dataType_1_0= ruleDataTypeNotAdjustable
                            {

                            							newCompositeNode(grammarAccess.getMethodParameterAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_0_0_1_0());
                            						
                            pushFollow(FOLLOW_3);
                            lv_dataType_1_0=ruleDataTypeNotAdjustable();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMethodParameterRule());
                            							}
                            							set(
                            								current,
                            								"dataType",
                            								lv_dataType_1_0,
                            								"de.fzi.sensidl.language.Sensidl.DataTypeNotAdjustable");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:921:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalSensidl.g:921:4: ( (otherlv_2= RULE_ID ) )
                    // InternalSensidl.g:922:5: (otherlv_2= RULE_ID )
                    {
                    // InternalSensidl.g:922:5: (otherlv_2= RULE_ID )
                    // InternalSensidl.g:923:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodParameterRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_3); 

                    						newLeafNode(otherlv_2, grammarAccess.getMethodParameterAccess().getDataTypeDataSetDataSetCrossReference_0_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSensidl.g:935:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSensidl.g:936:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSensidl.g:936:4: (lv_name_3_0= RULE_ID )
            // InternalSensidl.g:937:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getMethodParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalSensidl.g:957:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalSensidl.g:957:45: (iv_ruleData= ruleData EOF )
            // InternalSensidl.g:958:2: iv_ruleData= ruleData EOF
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
    // InternalSensidl.g:964:1: ruleData returns [EObject current=null] : (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable | this_ListData_3= ruleListData ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject this_MeasurementData_0 = null;

        EObject this_NonMeasurementData_1 = null;

        EObject this_MeasurementDataNotAdjustable_2 = null;

        EObject this_ListData_3 = null;



        	enterRule();

        try {
            // InternalSensidl.g:970:2: ( (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable | this_ListData_3= ruleListData ) )
            // InternalSensidl.g:971:2: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable | this_ListData_3= ruleListData )
            {
            // InternalSensidl.g:971:2: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable | this_ListData_3= ruleListData )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalSensidl.g:972:3: this_MeasurementData_0= ruleMeasurementData
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
                    // InternalSensidl.g:981:3: this_NonMeasurementData_1= ruleNonMeasurementData
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
                    // InternalSensidl.g:990:3: this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getMeasurementDataNotAdjustableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasurementDataNotAdjustable_2=ruleMeasurementDataNotAdjustable();

                    state._fsp--;


                    			current = this_MeasurementDataNotAdjustable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSensidl.g:999:3: this_ListData_3= ruleListData
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getListDataParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1011:1: entryRuleListData returns [EObject current=null] : iv_ruleListData= ruleListData EOF ;
    public final EObject entryRuleListData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListData = null;


        try {
            // InternalSensidl.g:1011:49: (iv_ruleListData= ruleListData EOF )
            // InternalSensidl.g:1012:2: iv_ruleListData= ruleListData EOF
            {
             newCompositeNode(grammarAccess.getListDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListData=ruleListData();

            state._fsp--;

             current =iv_ruleListData; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalSensidl.g:1018:1: ruleListData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' otherlv_2= 'list' otherlv_3= 'of' ( ( (lv_dataType_4_0= ruleDataType ) ) | ( (otherlv_5= RULE_ID ) ) ) ) ;
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
            // InternalSensidl.g:1024:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' otherlv_2= 'list' otherlv_3= 'of' ( ( (lv_dataType_4_0= ruleDataType ) ) | ( (otherlv_5= RULE_ID ) ) ) ) )
            // InternalSensidl.g:1025:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' otherlv_2= 'list' otherlv_3= 'of' ( ( (lv_dataType_4_0= ruleDataType ) ) | ( (otherlv_5= RULE_ID ) ) ) )
            {
            // InternalSensidl.g:1025:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' otherlv_2= 'list' otherlv_3= 'of' ( ( (lv_dataType_4_0= ruleDataType ) ) | ( (otherlv_5= RULE_ID ) ) ) )
            // InternalSensidl.g:1026:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' otherlv_2= 'list' otherlv_3= 'of' ( ( (lv_dataType_4_0= ruleDataType ) ) | ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalSensidl.g:1026:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSensidl.g:1027:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSensidl.g:1027:4: (lv_name_0_0= RULE_ID )
            // InternalSensidl.g:1028:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_0_0, grammarAccess.getListDataAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getListDataAccess().getAsKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getListDataAccess().getListKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getListDataAccess().getOfKeyword_3());
            		
            // InternalSensidl.g:1056:3: ( ( (lv_dataType_4_0= ruleDataType ) ) | ( (otherlv_5= RULE_ID ) ) )
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
                    // InternalSensidl.g:1057:4: ( (lv_dataType_4_0= ruleDataType ) )
                    {
                    // InternalSensidl.g:1057:4: ( (lv_dataType_4_0= ruleDataType ) )
                    // InternalSensidl.g:1058:5: (lv_dataType_4_0= ruleDataType )
                    {
                    // InternalSensidl.g:1058:5: (lv_dataType_4_0= ruleDataType )
                    // InternalSensidl.g:1059:6: lv_dataType_4_0= ruleDataType
                    {

                    						newCompositeNode(grammarAccess.getListDataAccess().getDataTypeDataTypeEnumRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_dataType_4_0=ruleDataType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListDataRule());
                    						}
                    						set(
                    							current,
                    							"dataType",
                    							lv_dataType_4_0,
                    							"de.fzi.sensidl.language.Sensidl.DataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1077:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalSensidl.g:1077:4: ( (otherlv_5= RULE_ID ) )
                    // InternalSensidl.g:1078:5: (otherlv_5= RULE_ID )
                    {
                    // InternalSensidl.g:1078:5: (otherlv_5= RULE_ID )
                    // InternalSensidl.g:1079:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getListDataRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalSensidl.g:1095:1: entryRuleMeasurementData returns [EObject current=null] : iv_ruleMeasurementData= ruleMeasurementData EOF ;
    public final EObject entryRuleMeasurementData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementData = null;


        try {
            // InternalSensidl.g:1095:56: (iv_ruleMeasurementData= ruleMeasurementData EOF )
            // InternalSensidl.g:1096:2: iv_ruleMeasurementData= ruleMeasurementData EOF
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
    // InternalSensidl.g:1102:1: ruleMeasurementData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )? ) ;
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
            // InternalSensidl.g:1108:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )? ) )
            // InternalSensidl.g:1109:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )? )
            {
            // InternalSensidl.g:1109:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )? )
            // InternalSensidl.g:1110:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )? (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )? ( (lv_description_23_0= RULE_DESCRIPTION ) )?
            {
            // InternalSensidl.g:1110:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSensidl.g:1111:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSensidl.g:1111:4: (lv_name_0_0= RULE_ID )
            // InternalSensidl.g:1112:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_1=(Token)match(input,31,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasurementDataAccess().getAsKeyword_1());
            		
            // InternalSensidl.g:1132:3: ( (lv_dataType_2_0= ruleDataType ) )
            // InternalSensidl.g:1133:4: (lv_dataType_2_0= ruleDataType )
            {
            // InternalSensidl.g:1133:4: (lv_dataType_2_0= ruleDataType )
            // InternalSensidl.g:1134:5: lv_dataType_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
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

            otherlv_3=(Token)match(input,35,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getMeasurementDataAccess().getInKeyword_3());
            		
            // InternalSensidl.g:1155:3: ( (lv_unit_4_0= ruleUNIT ) )
            // InternalSensidl.g:1156:4: (lv_unit_4_0= ruleUNIT )
            {
            // InternalSensidl.g:1156:4: (lv_unit_4_0= ruleUNIT )
            // InternalSensidl.g:1157:5: lv_unit_4_0= ruleUNIT
            {

            					newCompositeNode(grammarAccess.getMeasurementDataAccess().getUnitUNITParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalSensidl.g:1174:3: (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSensidl.g:1175:4: otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getMeasurementDataAccess().getWithIdentifierKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getMeasurementDataAccess().getColonKeyword_5_1());
                    			
                    // InternalSensidl.g:1183:4: ( (lv_ID_7_0= RULE_STRING ) )
                    // InternalSensidl.g:1184:5: (lv_ID_7_0= RULE_STRING )
                    {
                    // InternalSensidl.g:1184:5: (lv_ID_7_0= RULE_STRING )
                    // InternalSensidl.g:1185:6: lv_ID_7_0= RULE_STRING
                    {
                    lv_ID_7_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalSensidl.g:1202:3: ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )?
            int alt24=4;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalSensidl.g:1203:4: (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) )
                    {
                    // InternalSensidl.g:1203:4: (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) )
                    // InternalSensidl.g:1204:5: otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) )
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_42); 

                    					newLeafNode(otherlv_8, grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0_0());
                    				
                    // InternalSensidl.g:1208:5: ( (lv_adjustments_9_0= ruleDataConversion ) )
                    // InternalSensidl.g:1209:6: (lv_adjustments_9_0= ruleDataConversion )
                    {
                    // InternalSensidl.g:1209:6: (lv_adjustments_9_0= ruleDataConversion )
                    // InternalSensidl.g:1210:7: lv_adjustments_9_0= ruleDataConversion
                    {

                    							newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataConversionParserRuleCall_6_0_1_0());
                    						
                    pushFollow(FOLLOW_43);
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
                    // InternalSensidl.g:1229:4: (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) )
                    {
                    // InternalSensidl.g:1229:4: (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) )
                    // InternalSensidl.g:1230:5: otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) )
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_44); 

                    					newLeafNode(otherlv_10, grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_1_0());
                    				
                    // InternalSensidl.g:1234:5: ( (lv_adjustments_11_0= ruleDataRange ) )
                    // InternalSensidl.g:1235:6: (lv_adjustments_11_0= ruleDataRange )
                    {
                    // InternalSensidl.g:1235:6: (lv_adjustments_11_0= ruleDataRange )
                    // InternalSensidl.g:1236:7: lv_adjustments_11_0= ruleDataRange
                    {

                    							newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataRangeParserRuleCall_6_1_1_0());
                    						
                    pushFollow(FOLLOW_43);
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
                    // InternalSensidl.g:1255:4: (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) )
                    {
                    // InternalSensidl.g:1255:4: (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) )
                    // InternalSensidl.g:1256:5: otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) )
                    {
                    otherlv_12=(Token)match(input,36,FOLLOW_42); 

                    					newLeafNode(otherlv_12, grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_2_0());
                    				
                    // InternalSensidl.g:1260:5: ( (lv_adjustments_13_0= ruleDataConversion ) )
                    // InternalSensidl.g:1261:6: (lv_adjustments_13_0= ruleDataConversion )
                    {
                    // InternalSensidl.g:1261:6: (lv_adjustments_13_0= ruleDataConversion )
                    // InternalSensidl.g:1262:7: lv_adjustments_13_0= ruleDataConversion
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

                    otherlv_14=(Token)match(input,18,FOLLOW_44); 

                    					newLeafNode(otherlv_14, grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_2_2());
                    				
                    // InternalSensidl.g:1283:5: ( (lv_adjustments_15_0= ruleDataRange ) )
                    // InternalSensidl.g:1284:6: (lv_adjustments_15_0= ruleDataRange )
                    {
                    // InternalSensidl.g:1284:6: (lv_adjustments_15_0= ruleDataRange )
                    // InternalSensidl.g:1285:7: lv_adjustments_15_0= ruleDataRange
                    {

                    							newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataRangeParserRuleCall_6_2_3_0());
                    						
                    pushFollow(FOLLOW_43);
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

            // InternalSensidl.g:1304:3: (otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSensidl.g:1305:4: otherlv_16= 'exclude:' ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) )
                    {
                    otherlv_16=(Token)match(input,37,FOLLOW_45); 

                    				newLeafNode(otherlv_16, grammarAccess.getMeasurementDataAccess().getExcludeKeyword_7_0());
                    			
                    // InternalSensidl.g:1309:4: ( ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? ) )
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
                            // InternalSensidl.g:1310:5: ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? )
                            {
                            // InternalSensidl.g:1310:5: ( ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )? )
                            // InternalSensidl.g:1311:6: ( (lv_excludedMethods_17_0= 'setter' ) ) (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )?
                            {
                            // InternalSensidl.g:1311:6: ( (lv_excludedMethods_17_0= 'setter' ) )
                            // InternalSensidl.g:1312:7: (lv_excludedMethods_17_0= 'setter' )
                            {
                            // InternalSensidl.g:1312:7: (lv_excludedMethods_17_0= 'setter' )
                            // InternalSensidl.g:1313:8: lv_excludedMethods_17_0= 'setter'
                            {
                            lv_excludedMethods_17_0=(Token)match(input,38,FOLLOW_46); 

                            								newLeafNode(lv_excludedMethods_17_0, grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getMeasurementDataRule());
                            								}
                            								addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_17_0, "setter");
                            							

                            }


                            }

                            // InternalSensidl.g:1325:6: (otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) ) )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==18) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // InternalSensidl.g:1326:7: otherlv_18= ',' ( (lv_excludedMethods_19_0= 'getter' ) )
                                    {
                                    otherlv_18=(Token)match(input,18,FOLLOW_47); 

                                    							newLeafNode(otherlv_18, grammarAccess.getMeasurementDataAccess().getCommaKeyword_7_1_0_1_0());
                                    						
                                    // InternalSensidl.g:1330:7: ( (lv_excludedMethods_19_0= 'getter' ) )
                                    // InternalSensidl.g:1331:8: (lv_excludedMethods_19_0= 'getter' )
                                    {
                                    // InternalSensidl.g:1331:8: (lv_excludedMethods_19_0= 'getter' )
                                    // InternalSensidl.g:1332:9: lv_excludedMethods_19_0= 'getter'
                                    {
                                    lv_excludedMethods_19_0=(Token)match(input,39,FOLLOW_33); 

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
                            // InternalSensidl.g:1347:5: ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? )
                            {
                            // InternalSensidl.g:1347:5: ( ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )? )
                            // InternalSensidl.g:1348:6: ( (lv_excludedMethods_20_0= 'getter' ) ) (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )?
                            {
                            // InternalSensidl.g:1348:6: ( (lv_excludedMethods_20_0= 'getter' ) )
                            // InternalSensidl.g:1349:7: (lv_excludedMethods_20_0= 'getter' )
                            {
                            // InternalSensidl.g:1349:7: (lv_excludedMethods_20_0= 'getter' )
                            // InternalSensidl.g:1350:8: lv_excludedMethods_20_0= 'getter'
                            {
                            lv_excludedMethods_20_0=(Token)match(input,39,FOLLOW_46); 

                            								newLeafNode(lv_excludedMethods_20_0, grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getMeasurementDataRule());
                            								}
                            								addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_20_0, "getter");
                            							

                            }


                            }

                            // InternalSensidl.g:1362:6: (otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) ) )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==18) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // InternalSensidl.g:1363:7: otherlv_21= ',' ( (lv_excludedMethods_22_0= 'setter' ) )
                                    {
                                    otherlv_21=(Token)match(input,18,FOLLOW_48); 

                                    							newLeafNode(otherlv_21, grammarAccess.getMeasurementDataAccess().getCommaKeyword_7_1_1_1_0());
                                    						
                                    // InternalSensidl.g:1367:7: ( (lv_excludedMethods_22_0= 'setter' ) )
                                    // InternalSensidl.g:1368:8: (lv_excludedMethods_22_0= 'setter' )
                                    {
                                    // InternalSensidl.g:1368:8: (lv_excludedMethods_22_0= 'setter' )
                                    // InternalSensidl.g:1369:9: lv_excludedMethods_22_0= 'setter'
                                    {
                                    lv_excludedMethods_22_0=(Token)match(input,38,FOLLOW_33); 

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

            // InternalSensidl.g:1385:3: ( (lv_description_23_0= RULE_DESCRIPTION ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_DESCRIPTION) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSensidl.g:1386:4: (lv_description_23_0= RULE_DESCRIPTION )
                    {
                    // InternalSensidl.g:1386:4: (lv_description_23_0= RULE_DESCRIPTION )
                    // InternalSensidl.g:1387:5: lv_description_23_0= RULE_DESCRIPTION
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
    // InternalSensidl.g:1407:1: entryRuleNonMeasurementData returns [EObject current=null] : iv_ruleNonMeasurementData= ruleNonMeasurementData EOF ;
    public final EObject entryRuleNonMeasurementData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonMeasurementData = null;


        try {
            // InternalSensidl.g:1407:59: (iv_ruleNonMeasurementData= ruleNonMeasurementData EOF )
            // InternalSensidl.g:1408:2: iv_ruleNonMeasurementData= ruleNonMeasurementData EOF
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
    // InternalSensidl.g:1414:1: ruleNonMeasurementData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )? (otherlv_11= 'with identifier' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? (otherlv_14= 'exclude:' ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) ) )? ( (lv_description_21_0= RULE_DESCRIPTION ) )? ) ;
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
            // InternalSensidl.g:1420:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )? (otherlv_11= 'with identifier' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? (otherlv_14= 'exclude:' ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) ) )? ( (lv_description_21_0= RULE_DESCRIPTION ) )? ) )
            // InternalSensidl.g:1421:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )? (otherlv_11= 'with identifier' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? (otherlv_14= 'exclude:' ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) ) )? ( (lv_description_21_0= RULE_DESCRIPTION ) )? )
            {
            // InternalSensidl.g:1421:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )? (otherlv_11= 'with identifier' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? (otherlv_14= 'exclude:' ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) ) )? ( (lv_description_21_0= RULE_DESCRIPTION ) )? )
            // InternalSensidl.g:1422:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) ) ( ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )? (otherlv_11= 'with identifier' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? (otherlv_14= 'exclude:' ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) ) )? ( (lv_description_21_0= RULE_DESCRIPTION ) )?
            {
            // InternalSensidl.g:1422:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSensidl.g:1423:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSensidl.g:1423:4: (lv_name_0_0= RULE_ID )
            // InternalSensidl.g:1424:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_1=(Token)match(input,31,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getNonMeasurementDataAccess().getAsKeyword_1());
            		
            // InternalSensidl.g:1444:3: ( ( (lv_dataType_2_0= ruleDataType ) ) | ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) ) )
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
                    // InternalSensidl.g:1445:4: ( (lv_dataType_2_0= ruleDataType ) )
                    {
                    // InternalSensidl.g:1445:4: ( (lv_dataType_2_0= ruleDataType ) )
                    // InternalSensidl.g:1446:5: (lv_dataType_2_0= ruleDataType )
                    {
                    // InternalSensidl.g:1446:5: (lv_dataType_2_0= ruleDataType )
                    // InternalSensidl.g:1447:6: lv_dataType_2_0= ruleDataType
                    {

                    						newCompositeNode(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_50);
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
                    // InternalSensidl.g:1465:4: ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) )
                    {
                    // InternalSensidl.g:1465:4: ( (lv_dataType_3_0= ruleDataTypeNotAdjustable ) )
                    // InternalSensidl.g:1466:5: (lv_dataType_3_0= ruleDataTypeNotAdjustable )
                    {
                    // InternalSensidl.g:1466:5: (lv_dataType_3_0= ruleDataTypeNotAdjustable )
                    // InternalSensidl.g:1467:6: lv_dataType_3_0= ruleDataTypeNotAdjustable
                    {

                    						newCompositeNode(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_50);
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

            // InternalSensidl.g:1485:3: ( ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )?
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
                    // InternalSensidl.g:1486:4: ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalSensidl.g:1486:4: ( ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalSensidl.g:1487:5: ( (lv_constant_4_0= 'constant' ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalSensidl.g:1487:5: ( (lv_constant_4_0= 'constant' ) )
                    // InternalSensidl.g:1488:6: (lv_constant_4_0= 'constant' )
                    {
                    // InternalSensidl.g:1488:6: (lv_constant_4_0= 'constant' )
                    // InternalSensidl.g:1489:7: lv_constant_4_0= 'constant'
                    {
                    lv_constant_4_0=(Token)match(input,40,FOLLOW_51); 

                    							newLeafNode(lv_constant_4_0, grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    							}
                    							setWithLastConsumed(current, "constant", true, "constant");
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,41,FOLLOW_52); 

                    					newLeafNode(otherlv_5, grammarAccess.getNonMeasurementDataAccess().getValueKeyword_3_0_1());
                    				
                    otherlv_6=(Token)match(input,42,FOLLOW_7); 

                    					newLeafNode(otherlv_6, grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_3_0_2());
                    				
                    // InternalSensidl.g:1509:5: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalSensidl.g:1510:6: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalSensidl.g:1510:6: (lv_value_7_0= RULE_STRING )
                    // InternalSensidl.g:1511:7: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

                    							newLeafNode(lv_value_7_0, grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_3_0_3_0());
                    						

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


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1529:4: (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) )
                    {
                    // InternalSensidl.g:1529:4: (otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) )
                    // InternalSensidl.g:1530:5: otherlv_8= 'value' otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,41,FOLLOW_52); 

                    					newLeafNode(otherlv_8, grammarAccess.getNonMeasurementDataAccess().getValueKeyword_3_1_0());
                    				
                    otherlv_9=(Token)match(input,42,FOLLOW_7); 

                    					newLeafNode(otherlv_9, grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_3_1_1());
                    				
                    // InternalSensidl.g:1538:5: ( (lv_value_10_0= RULE_STRING ) )
                    // InternalSensidl.g:1539:6: (lv_value_10_0= RULE_STRING )
                    {
                    // InternalSensidl.g:1539:6: (lv_value_10_0= RULE_STRING )
                    // InternalSensidl.g:1540:7: lv_value_10_0= RULE_STRING
                    {
                    lv_value_10_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

                    							newLeafNode(lv_value_10_0, grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_3_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"value",
                    								lv_value_10_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSensidl.g:1558:3: (otherlv_11= 'with identifier' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==13) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSensidl.g:1559:4: otherlv_11= 'with identifier' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getNonMeasurementDataAccess().getWithIdentifierKeyword_4_0());
                    			
                    otherlv_12=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getNonMeasurementDataAccess().getColonKeyword_4_1());
                    			
                    // InternalSensidl.g:1567:4: ( (lv_ID_13_0= RULE_STRING ) )
                    // InternalSensidl.g:1568:5: (lv_ID_13_0= RULE_STRING )
                    {
                    // InternalSensidl.g:1568:5: (lv_ID_13_0= RULE_STRING )
                    // InternalSensidl.g:1569:6: lv_ID_13_0= RULE_STRING
                    {
                    lv_ID_13_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

                    						newLeafNode(lv_ID_13_0, grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ID",
                    							lv_ID_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSensidl.g:1586:3: (otherlv_14= 'exclude:' ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSensidl.g:1587:4: otherlv_14= 'exclude:' ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) )
                    {
                    otherlv_14=(Token)match(input,37,FOLLOW_45); 

                    				newLeafNode(otherlv_14, grammarAccess.getNonMeasurementDataAccess().getExcludeKeyword_5_0());
                    			
                    // InternalSensidl.g:1591:4: ( ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? ) )
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
                            // InternalSensidl.g:1592:5: ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? )
                            {
                            // InternalSensidl.g:1592:5: ( ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )? )
                            // InternalSensidl.g:1593:6: ( (lv_excludedMethods_15_0= 'setter' ) ) (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )?
                            {
                            // InternalSensidl.g:1593:6: ( (lv_excludedMethods_15_0= 'setter' ) )
                            // InternalSensidl.g:1594:7: (lv_excludedMethods_15_0= 'setter' )
                            {
                            // InternalSensidl.g:1594:7: (lv_excludedMethods_15_0= 'setter' )
                            // InternalSensidl.g:1595:8: lv_excludedMethods_15_0= 'setter'
                            {
                            lv_excludedMethods_15_0=(Token)match(input,38,FOLLOW_46); 

                            								newLeafNode(lv_excludedMethods_15_0, grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_5_1_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                            								}
                            								addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_15_0, "setter");
                            							

                            }


                            }

                            // InternalSensidl.g:1607:6: (otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) ) )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==18) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // InternalSensidl.g:1608:7: otherlv_16= ',' ( (lv_excludedMethods_17_0= 'getter' ) )
                                    {
                                    otherlv_16=(Token)match(input,18,FOLLOW_47); 

                                    							newLeafNode(otherlv_16, grammarAccess.getNonMeasurementDataAccess().getCommaKeyword_5_1_0_1_0());
                                    						
                                    // InternalSensidl.g:1612:7: ( (lv_excludedMethods_17_0= 'getter' ) )
                                    // InternalSensidl.g:1613:8: (lv_excludedMethods_17_0= 'getter' )
                                    {
                                    // InternalSensidl.g:1613:8: (lv_excludedMethods_17_0= 'getter' )
                                    // InternalSensidl.g:1614:9: lv_excludedMethods_17_0= 'getter'
                                    {
                                    lv_excludedMethods_17_0=(Token)match(input,39,FOLLOW_33); 

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
                            // InternalSensidl.g:1629:5: ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? )
                            {
                            // InternalSensidl.g:1629:5: ( ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )? )
                            // InternalSensidl.g:1630:6: ( (lv_excludedMethods_18_0= 'getter' ) ) (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )?
                            {
                            // InternalSensidl.g:1630:6: ( (lv_excludedMethods_18_0= 'getter' ) )
                            // InternalSensidl.g:1631:7: (lv_excludedMethods_18_0= 'getter' )
                            {
                            // InternalSensidl.g:1631:7: (lv_excludedMethods_18_0= 'getter' )
                            // InternalSensidl.g:1632:8: lv_excludedMethods_18_0= 'getter'
                            {
                            lv_excludedMethods_18_0=(Token)match(input,39,FOLLOW_46); 

                            								newLeafNode(lv_excludedMethods_18_0, grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_5_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                            								}
                            								addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_18_0, "getter");
                            							

                            }


                            }

                            // InternalSensidl.g:1644:6: (otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) ) )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==18) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // InternalSensidl.g:1645:7: otherlv_19= ',' ( (lv_excludedMethods_20_0= 'setter' ) )
                                    {
                                    otherlv_19=(Token)match(input,18,FOLLOW_48); 

                                    							newLeafNode(otherlv_19, grammarAccess.getNonMeasurementDataAccess().getCommaKeyword_5_1_1_1_0());
                                    						
                                    // InternalSensidl.g:1649:7: ( (lv_excludedMethods_20_0= 'setter' ) )
                                    // InternalSensidl.g:1650:8: (lv_excludedMethods_20_0= 'setter' )
                                    {
                                    // InternalSensidl.g:1650:8: (lv_excludedMethods_20_0= 'setter' )
                                    // InternalSensidl.g:1651:9: lv_excludedMethods_20_0= 'setter'
                                    {
                                    lv_excludedMethods_20_0=(Token)match(input,38,FOLLOW_33); 

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

            // InternalSensidl.g:1667:3: ( (lv_description_21_0= RULE_DESCRIPTION ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_DESCRIPTION) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSensidl.g:1668:4: (lv_description_21_0= RULE_DESCRIPTION )
                    {
                    // InternalSensidl.g:1668:4: (lv_description_21_0= RULE_DESCRIPTION )
                    // InternalSensidl.g:1669:5: lv_description_21_0= RULE_DESCRIPTION
                    {
                    lv_description_21_0=(Token)match(input,RULE_DESCRIPTION,FOLLOW_2); 

                    					newLeafNode(lv_description_21_0, grammarAccess.getNonMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_21_0,
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
    // InternalSensidl.g:1689:1: entryRuleMeasurementDataNotAdjustable returns [EObject current=null] : iv_ruleMeasurementDataNotAdjustable= ruleMeasurementDataNotAdjustable EOF ;
    public final EObject entryRuleMeasurementDataNotAdjustable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementDataNotAdjustable = null;


        try {
            // InternalSensidl.g:1689:69: (iv_ruleMeasurementDataNotAdjustable= ruleMeasurementDataNotAdjustable EOF )
            // InternalSensidl.g:1690:2: iv_ruleMeasurementDataNotAdjustable= ruleMeasurementDataNotAdjustable EOF
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
    // InternalSensidl.g:1696:1: ruleMeasurementDataNotAdjustable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )? ) ;
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
            // InternalSensidl.g:1702:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )? ) )
            // InternalSensidl.g:1703:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )? )
            {
            // InternalSensidl.g:1703:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )? )
            // InternalSensidl.g:1704:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) ) otherlv_3= 'in' ( (lv_unit_4_0= ruleUNIT ) ) (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )? (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )? ( (lv_description_16_0= RULE_DESCRIPTION ) )?
            {
            // InternalSensidl.g:1704:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSensidl.g:1705:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSensidl.g:1705:4: (lv_name_0_0= RULE_ID )
            // InternalSensidl.g:1706:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_1=(Token)match(input,31,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasurementDataNotAdjustableAccess().getAsKeyword_1());
            		
            // InternalSensidl.g:1726:3: ( (lv_dataType_2_0= ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:1727:4: (lv_dataType_2_0= ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:1727:4: (lv_dataType_2_0= ruleDataTypeNotAdjustable )
            // InternalSensidl.g:1728:5: lv_dataType_2_0= ruleDataTypeNotAdjustable
            {

            					newCompositeNode(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
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

            otherlv_3=(Token)match(input,35,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getMeasurementDataNotAdjustableAccess().getInKeyword_3());
            		
            // InternalSensidl.g:1749:3: ( (lv_unit_4_0= ruleUNIT ) )
            // InternalSensidl.g:1750:4: (lv_unit_4_0= ruleUNIT )
            {
            // InternalSensidl.g:1750:4: (lv_unit_4_0= ruleUNIT )
            // InternalSensidl.g:1751:5: lv_unit_4_0= ruleUNIT
            {

            					newCompositeNode(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitUNITParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_55);
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

            // InternalSensidl.g:1768:3: (otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==13) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSensidl.g:1769:4: otherlv_5= 'with identifier' otherlv_6= ':' ( (lv_ID_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getMeasurementDataNotAdjustableAccess().getWithIdentifierKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getMeasurementDataNotAdjustableAccess().getColonKeyword_5_1());
                    			
                    // InternalSensidl.g:1777:4: ( (lv_ID_7_0= RULE_STRING ) )
                    // InternalSensidl.g:1778:5: (lv_ID_7_0= RULE_STRING )
                    {
                    // InternalSensidl.g:1778:5: (lv_ID_7_0= RULE_STRING )
                    // InternalSensidl.g:1779:6: lv_ID_7_0= RULE_STRING
                    {
                    lv_ID_7_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

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

            // InternalSensidl.g:1796:3: (otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSensidl.g:1797:4: otherlv_8= 'exclude' otherlv_9= ':' ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) )
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludeKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_45); 

                    				newLeafNode(otherlv_9, grammarAccess.getMeasurementDataNotAdjustableAccess().getColonKeyword_6_1());
                    			
                    // InternalSensidl.g:1805:4: ( ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? ) | ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? ) )
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
                            // InternalSensidl.g:1806:5: ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? )
                            {
                            // InternalSensidl.g:1806:5: ( ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )? )
                            // InternalSensidl.g:1807:6: ( (lv_excludedMethods_10_0= 'setter' ) ) (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )?
                            {
                            // InternalSensidl.g:1807:6: ( (lv_excludedMethods_10_0= 'setter' ) )
                            // InternalSensidl.g:1808:7: (lv_excludedMethods_10_0= 'setter' )
                            {
                            // InternalSensidl.g:1808:7: (lv_excludedMethods_10_0= 'setter' )
                            // InternalSensidl.g:1809:8: lv_excludedMethods_10_0= 'setter'
                            {
                            lv_excludedMethods_10_0=(Token)match(input,38,FOLLOW_46); 

                            								newLeafNode(lv_excludedMethods_10_0, grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getMeasurementDataNotAdjustableRule());
                            								}
                            								addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_10_0, "setter");
                            							

                            }


                            }

                            // InternalSensidl.g:1821:6: (otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) ) )?
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==18) ) {
                                alt39=1;
                            }
                            switch (alt39) {
                                case 1 :
                                    // InternalSensidl.g:1822:7: otherlv_11= ',' ( (lv_excludedMethods_12_0= 'getter' ) )
                                    {
                                    otherlv_11=(Token)match(input,18,FOLLOW_47); 

                                    							newLeafNode(otherlv_11, grammarAccess.getMeasurementDataNotAdjustableAccess().getCommaKeyword_6_2_0_1_0());
                                    						
                                    // InternalSensidl.g:1826:7: ( (lv_excludedMethods_12_0= 'getter' ) )
                                    // InternalSensidl.g:1827:8: (lv_excludedMethods_12_0= 'getter' )
                                    {
                                    // InternalSensidl.g:1827:8: (lv_excludedMethods_12_0= 'getter' )
                                    // InternalSensidl.g:1828:9: lv_excludedMethods_12_0= 'getter'
                                    {
                                    lv_excludedMethods_12_0=(Token)match(input,39,FOLLOW_33); 

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
                            // InternalSensidl.g:1843:5: ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? )
                            {
                            // InternalSensidl.g:1843:5: ( ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )? )
                            // InternalSensidl.g:1844:6: ( (lv_excludedMethods_13_0= 'getter' ) ) (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )?
                            {
                            // InternalSensidl.g:1844:6: ( (lv_excludedMethods_13_0= 'getter' ) )
                            // InternalSensidl.g:1845:7: (lv_excludedMethods_13_0= 'getter' )
                            {
                            // InternalSensidl.g:1845:7: (lv_excludedMethods_13_0= 'getter' )
                            // InternalSensidl.g:1846:8: lv_excludedMethods_13_0= 'getter'
                            {
                            lv_excludedMethods_13_0=(Token)match(input,39,FOLLOW_46); 

                            								newLeafNode(lv_excludedMethods_13_0, grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getMeasurementDataNotAdjustableRule());
                            								}
                            								addWithLastConsumed(current, "excludedMethods", lv_excludedMethods_13_0, "getter");
                            							

                            }


                            }

                            // InternalSensidl.g:1858:6: (otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) ) )?
                            int alt40=2;
                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==18) ) {
                                alt40=1;
                            }
                            switch (alt40) {
                                case 1 :
                                    // InternalSensidl.g:1859:7: otherlv_14= ',' ( (lv_excludedMethods_15_0= 'setter' ) )
                                    {
                                    otherlv_14=(Token)match(input,18,FOLLOW_48); 

                                    							newLeafNode(otherlv_14, grammarAccess.getMeasurementDataNotAdjustableAccess().getCommaKeyword_6_2_1_1_0());
                                    						
                                    // InternalSensidl.g:1863:7: ( (lv_excludedMethods_15_0= 'setter' ) )
                                    // InternalSensidl.g:1864:8: (lv_excludedMethods_15_0= 'setter' )
                                    {
                                    // InternalSensidl.g:1864:8: (lv_excludedMethods_15_0= 'setter' )
                                    // InternalSensidl.g:1865:9: lv_excludedMethods_15_0= 'setter'
                                    {
                                    lv_excludedMethods_15_0=(Token)match(input,38,FOLLOW_33); 

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

            // InternalSensidl.g:1881:3: ( (lv_description_16_0= RULE_DESCRIPTION ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_DESCRIPTION) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSensidl.g:1882:4: (lv_description_16_0= RULE_DESCRIPTION )
                    {
                    // InternalSensidl.g:1882:4: (lv_description_16_0= RULE_DESCRIPTION )
                    // InternalSensidl.g:1883:5: lv_description_16_0= RULE_DESCRIPTION
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
    // InternalSensidl.g:1903:1: entryRuleDataRange returns [EObject current=null] : iv_ruleDataRange= ruleDataRange EOF ;
    public final EObject entryRuleDataRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataRange = null;


        try {
            // InternalSensidl.g:1903:50: (iv_ruleDataRange= ruleDataRange EOF )
            // InternalSensidl.g:1904:2: iv_ruleDataRange= ruleDataRange EOF
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
    // InternalSensidl.g:1910:1: ruleDataRange returns [EObject current=null] : (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) ) ;
    public final EObject ruleDataRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_range_1_0 = null;



        	enterRule();

        try {
            // InternalSensidl.g:1916:2: ( (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) ) )
            // InternalSensidl.g:1917:2: (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) )
            {
            // InternalSensidl.g:1917:2: (otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) ) )
            // InternalSensidl.g:1918:3: otherlv_0= 'with range' ( (lv_range_1_0= ruleInterval ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getDataRangeAccess().getWithRangeKeyword_0());
            		
            // InternalSensidl.g:1922:3: ( (lv_range_1_0= ruleInterval ) )
            // InternalSensidl.g:1923:4: (lv_range_1_0= ruleInterval )
            {
            // InternalSensidl.g:1923:4: (lv_range_1_0= ruleInterval )
            // InternalSensidl.g:1924:5: lv_range_1_0= ruleInterval
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
    // InternalSensidl.g:1945:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalSensidl.g:1945:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalSensidl.g:1946:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalSensidl.g:1952:1: ruleInterval returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;



        	enterRule();

        try {
            // InternalSensidl.g:1958:2: ( (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' ) )
            // InternalSensidl.g:1959:2: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' )
            {
            // InternalSensidl.g:1959:2: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']' )
            // InternalSensidl.g:1960:3: otherlv_0= '[' ( (lv_lowerBound_1_0= ruleDOUBLE ) ) otherlv_2= ';' ( (lv_upperBound_3_0= ruleDOUBLE ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSensidl.g:1964:3: ( (lv_lowerBound_1_0= ruleDOUBLE ) )
            // InternalSensidl.g:1965:4: (lv_lowerBound_1_0= ruleDOUBLE )
            {
            // InternalSensidl.g:1965:4: (lv_lowerBound_1_0= ruleDOUBLE )
            // InternalSensidl.g:1966:5: lv_lowerBound_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_59);
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

            otherlv_2=(Token)match(input,46,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getSemicolonKeyword_2());
            		
            // InternalSensidl.g:1987:3: ( (lv_upperBound_3_0= ruleDOUBLE ) )
            // InternalSensidl.g:1988:4: (lv_upperBound_3_0= ruleDOUBLE )
            {
            // InternalSensidl.g:1988:4: (lv_upperBound_3_0= ruleDOUBLE )
            // InternalSensidl.g:1989:5: lv_upperBound_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_60);
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

            otherlv_4=(Token)match(input,47,FOLLOW_2); 

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
    // InternalSensidl.g:2014:1: entryRuleDataConversion returns [EObject current=null] : iv_ruleDataConversion= ruleDataConversion EOF ;
    public final EObject entryRuleDataConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataConversion = null;


        try {
            // InternalSensidl.g:2014:55: (iv_ruleDataConversion= ruleDataConversion EOF )
            // InternalSensidl.g:2015:2: iv_ruleDataConversion= ruleDataConversion EOF
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
    // InternalSensidl.g:2021:1: ruleDataConversion returns [EObject current=null] : (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval ) ;
    public final EObject ruleDataConversion() throws RecognitionException {
        EObject current = null;

        EObject this_LinearDataConversion_0 = null;

        EObject this_LinearDataConversionWithInterval_1 = null;



        	enterRule();

        try {
            // InternalSensidl.g:2027:2: ( (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval ) )
            // InternalSensidl.g:2028:2: (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval )
            {
            // InternalSensidl.g:2028:2: (this_LinearDataConversion_0= ruleLinearDataConversion | this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval )
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
                    // InternalSensidl.g:2029:3: this_LinearDataConversion_0= ruleLinearDataConversion
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
                    // InternalSensidl.g:2038:3: this_LinearDataConversionWithInterval_1= ruleLinearDataConversionWithInterval
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
    // InternalSensidl.g:2050:1: entryRuleLinearDataConversion returns [EObject current=null] : iv_ruleLinearDataConversion= ruleLinearDataConversion EOF ;
    public final EObject entryRuleLinearDataConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearDataConversion = null;


        try {
            // InternalSensidl.g:2050:61: (iv_ruleLinearDataConversion= ruleLinearDataConversion EOF )
            // InternalSensidl.g:2051:2: iv_ruleLinearDataConversion= ruleLinearDataConversion EOF
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
    // InternalSensidl.g:2057:1: ruleLinearDataConversion returns [EObject current=null] : (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) ) ;
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
            // InternalSensidl.g:2063:2: ( (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) ) )
            // InternalSensidl.g:2064:2: (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) )
            {
            // InternalSensidl.g:2064:2: (otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) ) )
            // InternalSensidl.g:2065:3: otherlv_0= 'with scaling factor' otherlv_1= ':' ( (lv_scalingFactor_2_0= ruleDOUBLE ) ) otherlv_3= 'and offset' otherlv_4= ':' ( (lv_offset_5_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLinearDataConversionAccess().getWithScalingFactorKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getLinearDataConversionAccess().getColonKeyword_1());
            		
            // InternalSensidl.g:2073:3: ( (lv_scalingFactor_2_0= ruleDOUBLE ) )
            // InternalSensidl.g:2074:4: (lv_scalingFactor_2_0= ruleDOUBLE )
            {
            // InternalSensidl.g:2074:4: (lv_scalingFactor_2_0= ruleDOUBLE )
            // InternalSensidl.g:2075:5: lv_scalingFactor_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_61);
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

            otherlv_3=(Token)match(input,49,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getLinearDataConversionAccess().getAndOffsetKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_58); 

            			newLeafNode(otherlv_4, grammarAccess.getLinearDataConversionAccess().getColonKeyword_4());
            		
            // InternalSensidl.g:2100:3: ( (lv_offset_5_0= ruleDOUBLE ) )
            // InternalSensidl.g:2101:4: (lv_offset_5_0= ruleDOUBLE )
            {
            // InternalSensidl.g:2101:4: (lv_offset_5_0= ruleDOUBLE )
            // InternalSensidl.g:2102:5: lv_offset_5_0= ruleDOUBLE
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
    // InternalSensidl.g:2123:1: entryRuleLinearDataConversionWithInterval returns [EObject current=null] : iv_ruleLinearDataConversionWithInterval= ruleLinearDataConversionWithInterval EOF ;
    public final EObject entryRuleLinearDataConversionWithInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearDataConversionWithInterval = null;


        try {
            // InternalSensidl.g:2123:73: (iv_ruleLinearDataConversionWithInterval= ruleLinearDataConversionWithInterval EOF )
            // InternalSensidl.g:2124:2: iv_ruleLinearDataConversionWithInterval= ruleLinearDataConversionWithInterval EOF
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
    // InternalSensidl.g:2130:1: ruleLinearDataConversionWithInterval returns [EObject current=null] : (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) ) ) ;
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
            // InternalSensidl.g:2136:2: ( (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) ) ) )
            // InternalSensidl.g:2137:2: (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) ) )
            {
            // InternalSensidl.g:2137:2: (otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) ) )
            // InternalSensidl.g:2138:3: otherlv_0= 'by linear mapping' ( (lv_fromInterval_1_0= ruleInterval ) ) otherlv_2= '=>' ( (lv_toInterval_3_0= ruleInterval ) ) otherlv_4= 'as' ( (lv_dataType_5_0= ruleDataType ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getLinearDataConversionWithIntervalAccess().getByLinearMappingKeyword_0());
            		
            // InternalSensidl.g:2142:3: ( (lv_fromInterval_1_0= ruleInterval ) )
            // InternalSensidl.g:2143:4: (lv_fromInterval_1_0= ruleInterval )
            {
            // InternalSensidl.g:2143:4: (lv_fromInterval_1_0= ruleInterval )
            // InternalSensidl.g:2144:5: lv_fromInterval_1_0= ruleInterval
            {

            					newCompositeNode(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalIntervalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_62);
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

            otherlv_2=(Token)match(input,51,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getLinearDataConversionWithIntervalAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalSensidl.g:2165:3: ( (lv_toInterval_3_0= ruleInterval ) )
            // InternalSensidl.g:2166:4: (lv_toInterval_3_0= ruleInterval )
            {
            // InternalSensidl.g:2166:4: (lv_toInterval_3_0= ruleInterval )
            // InternalSensidl.g:2167:5: lv_toInterval_3_0= ruleInterval
            {

            					newCompositeNode(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalIntervalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_4=(Token)match(input,31,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getLinearDataConversionWithIntervalAccess().getAsKeyword_4());
            		
            // InternalSensidl.g:2188:3: ( (lv_dataType_5_0= ruleDataType ) )
            // InternalSensidl.g:2189:4: (lv_dataType_5_0= ruleDataType )
            {
            // InternalSensidl.g:2189:4: (lv_dataType_5_0= ruleDataType )
            // InternalSensidl.g:2190:5: lv_dataType_5_0= ruleDataType
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
    // InternalSensidl.g:2211:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalSensidl.g:2211:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalSensidl.g:2212:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalSensidl.g:2218:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalSensidl.g:2224:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalSensidl.g:2225:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalSensidl.g:2225:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalSensidl.g:2226:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalSensidl.g:2226:3: (kw= '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==26) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSensidl.g:2227:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_63); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1());
            		
            // InternalSensidl.g:2240:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==52) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSensidl.g:2241:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,52,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1());
                    			

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
    // InternalSensidl.g:2258:1: entryRuleUNIT returns [String current=null] : iv_ruleUNIT= ruleUNIT EOF ;
    public final String entryRuleUNIT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNIT = null;


        try {
            // InternalSensidl.g:2258:44: (iv_ruleUNIT= ruleUNIT EOF )
            // InternalSensidl.g:2259:2: iv_ruleUNIT= ruleUNIT EOF
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
    // InternalSensidl.g:2265:1: ruleUNIT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* ) ;
    public final AntlrDatatypeRuleToken ruleUNIT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSensidl.g:2271:2: ( ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* ) )
            // InternalSensidl.g:2272:2: ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* )
            {
            // InternalSensidl.g:2272:2: ( (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )* )
            // InternalSensidl.g:2273:3: (this_ID_0= RULE_ID )* (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )*
            {
            // InternalSensidl.g:2273:3: (this_ID_0= RULE_ID )*
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
            	    // InternalSensidl.g:2274:4: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_64); 

            	    				current.merge(this_ID_0);
            	    			

            	    				newLeafNode(this_ID_0, grammarAccess.getUNITAccess().getIDTerminalRuleCall_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // InternalSensidl.g:2282:3: (this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )* )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ANY_OTHER) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSensidl.g:2283:4: this_ANY_OTHER_1= RULE_ANY_OTHER (this_ID_2= RULE_ID )*
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_64); 

            	    				current.merge(this_ANY_OTHER_1);
            	    			

            	    				newLeafNode(this_ANY_OTHER_1, grammarAccess.getUNITAccess().getANY_OTHERTerminalRuleCall_1_0());
            	    			
            	    // InternalSensidl.g:2290:4: (this_ID_2= RULE_ID )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==RULE_ID) ) {
            	            int LA48_2 = input.LA(2);

            	            if ( (LA48_2==EOF||(LA48_2>=RULE_ID && LA48_2<=RULE_DESCRIPTION)||LA48_2==RULE_ANY_OTHER||LA48_2==13||LA48_2==16||(LA48_2>=25 && LA48_2<=28)||(LA48_2>=36 && LA48_2<=37)||LA48_2==43) ) {
            	                alt48=1;
            	            }


            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // InternalSensidl.g:2291:5: this_ID_2= RULE_ID
            	    	    {
            	    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_64); 

            	    	    					current.merge(this_ID_2);
            	    	    				

            	    	    					newLeafNode(this_ID_2, grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop48;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalSensidl.g:2304:1: ruleCoding returns [Enumerator current=null] : ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) ) ;
    public final Enumerator ruleCoding() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSensidl.g:2310:2: ( ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) ) )
            // InternalSensidl.g:2311:2: ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) )
            {
            // InternalSensidl.g:2311:2: ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==53) ) {
                alt50=1;
            }
            else if ( (LA50_0==54) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalSensidl.g:2312:3: (enumLiteral_0= 'SENSIDL_BINARY' )
                    {
                    // InternalSensidl.g:2312:3: (enumLiteral_0= 'SENSIDL_BINARY' )
                    // InternalSensidl.g:2313:4: enumLiteral_0= 'SENSIDL_BINARY'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:2320:3: (enumLiteral_1= 'SENSIDL_JSON' )
                    {
                    // InternalSensidl.g:2320:3: (enumLiteral_1= 'SENSIDL_JSON' )
                    // InternalSensidl.g:2321:4: enumLiteral_1= 'SENSIDL_JSON'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

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
    // InternalSensidl.g:2331:1: ruleEndianness returns [Enumerator current=null] : ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) ;
    public final Enumerator ruleEndianness() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSensidl.g:2337:2: ( ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) )
            // InternalSensidl.g:2338:2: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            {
            // InternalSensidl.g:2338:2: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==55) ) {
                alt51=1;
            }
            else if ( (LA51_0==56) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalSensidl.g:2339:3: (enumLiteral_0= 'BIG_ENDIAN' )
                    {
                    // InternalSensidl.g:2339:3: (enumLiteral_0= 'BIG_ENDIAN' )
                    // InternalSensidl.g:2340:4: enumLiteral_0= 'BIG_ENDIAN'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:2347:3: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    {
                    // InternalSensidl.g:2347:3: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    // InternalSensidl.g:2348:4: enumLiteral_1= 'LITTLE_ENDIAN'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

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
    // InternalSensidl.g:2358:1: ruleDataTypeNotAdjustable returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) ) ;
    public final Enumerator ruleDataTypeNotAdjustable() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSensidl.g:2364:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) ) )
            // InternalSensidl.g:2365:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) )
            {
            // InternalSensidl.g:2365:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==57) ) {
                alt52=1;
            }
            else if ( (LA52_0==58) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalSensidl.g:2366:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalSensidl.g:2366:3: (enumLiteral_0= 'STRING' )
                    // InternalSensidl.g:2367:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:2374:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalSensidl.g:2374:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalSensidl.g:2375:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

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
    // InternalSensidl.g:2385:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) ) ;
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
            // InternalSensidl.g:2391:2: ( ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) ) )
            // InternalSensidl.g:2392:2: ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) )
            {
            // InternalSensidl.g:2392:2: ( (enumLiteral_0= 'INT8' ) | (enumLiteral_1= 'UINT8' ) | (enumLiteral_2= 'INT16' ) | (enumLiteral_3= 'UINT16' ) | (enumLiteral_4= 'INT32' ) | (enumLiteral_5= 'UINT32' ) | (enumLiteral_6= 'INT64' ) | (enumLiteral_7= 'UINT64' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) )
            int alt53=10;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt53=1;
                }
                break;
            case 60:
                {
                alt53=2;
                }
                break;
            case 61:
                {
                alt53=3;
                }
                break;
            case 62:
                {
                alt53=4;
                }
                break;
            case 63:
                {
                alt53=5;
                }
                break;
            case 64:
                {
                alt53=6;
                }
                break;
            case 65:
                {
                alt53=7;
                }
                break;
            case 66:
                {
                alt53=8;
                }
                break;
            case 67:
                {
                alt53=9;
                }
                break;
            case 68:
                {
                alt53=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalSensidl.g:2393:3: (enumLiteral_0= 'INT8' )
                    {
                    // InternalSensidl.g:2393:3: (enumLiteral_0= 'INT8' )
                    // InternalSensidl.g:2394:4: enumLiteral_0= 'INT8'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:2401:3: (enumLiteral_1= 'UINT8' )
                    {
                    // InternalSensidl.g:2401:3: (enumLiteral_1= 'UINT8' )
                    // InternalSensidl.g:2402:4: enumLiteral_1= 'UINT8'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:2409:3: (enumLiteral_2= 'INT16' )
                    {
                    // InternalSensidl.g:2409:3: (enumLiteral_2= 'INT16' )
                    // InternalSensidl.g:2410:4: enumLiteral_2= 'INT16'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSensidl.g:2417:3: (enumLiteral_3= 'UINT16' )
                    {
                    // InternalSensidl.g:2417:3: (enumLiteral_3= 'UINT16' )
                    // InternalSensidl.g:2418:4: enumLiteral_3= 'UINT16'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSensidl.g:2425:3: (enumLiteral_4= 'INT32' )
                    {
                    // InternalSensidl.g:2425:3: (enumLiteral_4= 'INT32' )
                    // InternalSensidl.g:2426:4: enumLiteral_4= 'INT32'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSensidl.g:2433:3: (enumLiteral_5= 'UINT32' )
                    {
                    // InternalSensidl.g:2433:3: (enumLiteral_5= 'UINT32' )
                    // InternalSensidl.g:2434:4: enumLiteral_5= 'UINT32'
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSensidl.g:2441:3: (enumLiteral_6= 'INT64' )
                    {
                    // InternalSensidl.g:2441:3: (enumLiteral_6= 'INT64' )
                    // InternalSensidl.g:2442:4: enumLiteral_6= 'INT64'
                    {
                    enumLiteral_6=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSensidl.g:2449:3: (enumLiteral_7= 'UINT64' )
                    {
                    // InternalSensidl.g:2449:3: (enumLiteral_7= 'UINT64' )
                    // InternalSensidl.g:2450:4: enumLiteral_7= 'UINT64'
                    {
                    enumLiteral_7=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSensidl.g:2457:3: (enumLiteral_8= 'FLOAT' )
                    {
                    // InternalSensidl.g:2457:3: (enumLiteral_8= 'FLOAT' )
                    // InternalSensidl.g:2458:4: enumLiteral_8= 'FLOAT'
                    {
                    enumLiteral_8=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSensidl.g:2465:3: (enumLiteral_9= 'DOUBLE' )
                    {
                    // InternalSensidl.g:2465:3: (enumLiteral_9= 'DOUBLE' )
                    // InternalSensidl.g:2466:4: enumLiteral_9= 'DOUBLE'
                    {
                    enumLiteral_9=(Token)match(input,68,FOLLOW_2); 

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
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\3\uffff\14\21\4\uffff";
    static final String dfa_3s = "\1\4\1\37\1\41\14\4\4\uffff";
    static final String dfa_4s = "\1\4\1\37\1\104\14\51\4\uffff";
    static final String dfa_5s = "\17\uffff\1\4\1\3\1\2\1\1";
    static final String dfa_6s = "\23\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\17\27\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\20\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\20\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22\1\uffff\1\21\2\uffff\2\21",
            "\2\21\7\uffff\1\21\2\uffff\1\21\10\uffff\4\21\6\uffff\1\22\1\uffff\1\21\2\uffff\2\21",
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

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "971:2: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData | this_MeasurementDataNotAdjustable_2= ruleMeasurementDataNotAdjustable | this_ListData_3= ruleListData )";
        }
    }
    static final String dfa_8s = "\65\uffff";
    static final String dfa_9s = "\1\2\25\uffff\1\33\7\uffff\1\33\14\uffff\12\33";
    static final String dfa_10s = "\1\4\1\54\1\uffff\1\16\1\55\1\uffff\3\7\1\61\1\7\1\56\1\7\1\16\2\7\1\61\1\7\1\56\1\7\1\57\1\7\1\4\1\7\1\63\1\7\2\uffff\1\57\1\55\1\4\2\7\1\56\2\7\1\56\1\7\1\57\1\7\1\37\1\57\1\73\12\4";
    static final String dfa_11s = "\1\45\1\62\1\uffff\1\16\1\55\1\uffff\2\32\1\7\1\64\1\7\1\64\1\7\1\16\1\7\1\32\1\61\1\32\1\56\1\7\1\64\1\7\1\64\1\7\1\63\1\7\2\uffff\1\57\1\55\1\45\1\32\1\7\1\64\1\7\1\32\1\56\1\7\1\64\1\7\1\37\1\57\1\104\12\45";
    static final String dfa_12s = "\2\uffff\1\4\2\uffff\1\2\24\uffff\1\3\1\1\31\uffff";
    static final String dfa_13s = "\65\uffff}>";
    static final String[] dfa_14s = {
            "\2\2\12\uffff\1\2\10\uffff\4\2\7\uffff\1\1\1\2",
            "\1\5\3\uffff\1\3\1\uffff\1\4",
            "",
            "\1\6",
            "\1\7",
            "",
            "\1\11\22\uffff\1\10",
            "\1\13\22\uffff\1\12",
            "\1\11",
            "\1\15\2\uffff\1\14",
            "\1\13",
            "\1\17\5\uffff\1\16",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\24\22\uffff\1\23",
            "\1\15",
            "\1\26\22\uffff\1\25",
            "\1\17",
            "\1\24",
            "\1\30\4\uffff\1\27",
            "\1\26",
            "\2\33\12\uffff\1\33\1\uffff\1\32\6\uffff\4\33\10\uffff\1\33\16\uffff\1\31",
            "\1\34",
            "\1\35",
            "\1\36",
            "",
            "",
            "\1\30",
            "\1\37",
            "\2\33\12\uffff\1\33\1\uffff\1\32\6\uffff\4\33\10\uffff\1\33",
            "\1\41\22\uffff\1\40",
            "\1\41",
            "\1\43\5\uffff\1\42",
            "\1\44",
            "\1\46\22\uffff\1\45",
            "\1\43",
            "\1\46",
            "\1\50\4\uffff\1\47",
            "\1\51",
            "\1\52",
            "\1\50",
            "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\2\33\12\uffff\1\33\1\uffff\1\32\6\uffff\4\33\10\uffff\1\33",
            "\2\33\12\uffff\1\33\1\uffff\1\32\6\uffff\4\33\10\uffff\1\33",
            "\2\33\12\uffff\1\33\1\uffff\1\32\6\uffff\4\33\10\uffff\1\33",
            "\2\33\12\uffff\1\33\1\uffff\1\32\6\uffff\4\33\10\uffff\1\33",
            "\2\33\12\uffff\1\33\1\uffff\1\32\6\uffff\4\33\10\uffff\1\33",
            "\2\33\12\uffff\1\33\1\uffff\1\32\6\uffff\4\33\10\uffff\1\33",
            "\2\33\12\uffff\1\33\1\uffff\1\32\6\uffff\4\33\10\uffff\1\33",
            "\2\33\12\uffff\1\33\1\uffff\1\32\6\uffff\4\33\10\uffff\1\33",
            "\2\33\12\uffff\1\33\1\uffff\1\32\6\uffff\4\33\10\uffff\1\33",
            "\2\33\12\uffff\1\33\1\uffff\1\32\6\uffff\4\33\10\uffff\1\33"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1202:3: ( (otherlv_8= 'adjusted' ( (lv_adjustments_9_0= ruleDataConversion ) ) ) | (otherlv_10= 'adjusted' ( (lv_adjustments_11_0= ruleDataRange ) ) ) | (otherlv_12= 'adjusted' ( (lv_adjustments_13_0= ruleDataConversion ) ) otherlv_14= ',' ( (lv_adjustments_15_0= ruleDataRange ) ) ) )?";
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000104A020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000004A020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000001E010010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xFE00000040040010L,0x000000000000001FL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xFE00000000000010L,0x000000000000001FL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xF800000000000010L,0x000000000000001FL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xF800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000003000002130L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000003000002022L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000003000000022L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000002000000022L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xFE00000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000032000002022L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000002000002022L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000080000002130L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000080000002022L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000080000000022L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000112L});

}