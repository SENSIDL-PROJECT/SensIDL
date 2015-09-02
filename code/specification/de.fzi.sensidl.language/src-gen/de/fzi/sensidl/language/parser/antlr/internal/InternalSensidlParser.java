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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_UNIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sensorInterface'", "'with'", "'identifier'", "':'", "'{'", "'}'", "';'", "'encoding'", "'alignment'", "'sensorData'", "'dataSet'", "'as'", "'in'", "'adjusted'", "'by'", "','", "'constant'", "'='", "'value'", "'range'", "'...'", "'scaling factor'", "'and'", "'offset'", "'linear mapping'", "'['", "']'", "'=>'", "'.'", "'true'", "'false'", "'SENSIDL_BINARY'", "'SENSIDL_JSON'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'SIGNED_CHAR'", "'UNSIGNED_CHAR'", "'SIGNED_SHORT'", "'UNSIGNED_SHORT'", "'SIGNED_LONG'", "'UNSIGNED_LONG'", "'SIGNED_LONG_LONG'", "'UNSIGNED_LONG_LONG'", "'FLOAT'", "'DOUBLE'", "'LONG_DOUBLE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_UNIT=7;
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
        	return "IdentifiableElement";	
       	}
       	
       	@Override
       	protected SensidlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleIdentifiableElement"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:68:1: entryRuleIdentifiableElement returns [EObject current=null] : iv_ruleIdentifiableElement= ruleIdentifiableElement EOF ;
    public final EObject entryRuleIdentifiableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifiableElement = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:69:2: (iv_ruleIdentifiableElement= ruleIdentifiableElement EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:70:2: iv_ruleIdentifiableElement= ruleIdentifiableElement EOF
            {
             newCompositeNode(grammarAccess.getIdentifiableElementRule()); 
            pushFollow(FOLLOW_ruleIdentifiableElement_in_entryRuleIdentifiableElement75);
            iv_ruleIdentifiableElement=ruleIdentifiableElement();

            state._fsp--;

             current =iv_ruleIdentifiableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifiableElement85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifiableElement"


    // $ANTLR start "ruleIdentifiableElement"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:77:1: ruleIdentifiableElement returns [EObject current=null] : (this_NamedElement_0= ruleNamedElement | this_EncodingSettings_1= ruleEncodingSettings | this_SensorDataDescription_2= ruleSensorDataDescription | this_DataAdjustment_3= ruleDataAdjustment | this_Interval_4= ruleInterval ) ;
    public final EObject ruleIdentifiableElement() throws RecognitionException {
        EObject current = null;

        EObject this_NamedElement_0 = null;

        EObject this_EncodingSettings_1 = null;

        EObject this_SensorDataDescription_2 = null;

        EObject this_DataAdjustment_3 = null;

        EObject this_Interval_4 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:80:28: ( (this_NamedElement_0= ruleNamedElement | this_EncodingSettings_1= ruleEncodingSettings | this_SensorDataDescription_2= ruleSensorDataDescription | this_DataAdjustment_3= ruleDataAdjustment | this_Interval_4= ruleInterval ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:81:1: (this_NamedElement_0= ruleNamedElement | this_EncodingSettings_1= ruleEncodingSettings | this_SensorDataDescription_2= ruleSensorDataDescription | this_DataAdjustment_3= ruleDataAdjustment | this_Interval_4= ruleInterval )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:81:1: (this_NamedElement_0= ruleNamedElement | this_EncodingSettings_1= ruleEncodingSettings | this_SensorDataDescription_2= ruleSensorDataDescription | this_DataAdjustment_3= ruleDataAdjustment | this_Interval_4= ruleInterval )
            int alt1=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 12:
            case 22:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 13:
            case 36:
                {
                alt1=4;
                }
                break;
            case RULE_INT:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:82:5: this_NamedElement_0= ruleNamedElement
                    {
                     
                            newCompositeNode(grammarAccess.getIdentifiableElementAccess().getNamedElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNamedElement_in_ruleIdentifiableElement132);
                    this_NamedElement_0=ruleNamedElement();

                    state._fsp--;

                     
                            current = this_NamedElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:92:5: this_EncodingSettings_1= ruleEncodingSettings
                    {
                     
                            newCompositeNode(grammarAccess.getIdentifiableElementAccess().getEncodingSettingsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEncodingSettings_in_ruleIdentifiableElement159);
                    this_EncodingSettings_1=ruleEncodingSettings();

                    state._fsp--;

                     
                            current = this_EncodingSettings_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:102:5: this_SensorDataDescription_2= ruleSensorDataDescription
                    {
                     
                            newCompositeNode(grammarAccess.getIdentifiableElementAccess().getSensorDataDescriptionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSensorDataDescription_in_ruleIdentifiableElement186);
                    this_SensorDataDescription_2=ruleSensorDataDescription();

                    state._fsp--;

                     
                            current = this_SensorDataDescription_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:112:5: this_DataAdjustment_3= ruleDataAdjustment
                    {
                     
                            newCompositeNode(grammarAccess.getIdentifiableElementAccess().getDataAdjustmentParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDataAdjustment_in_ruleIdentifiableElement213);
                    this_DataAdjustment_3=ruleDataAdjustment();

                    state._fsp--;

                     
                            current = this_DataAdjustment_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:122:5: this_Interval_4= ruleInterval
                    {
                     
                            newCompositeNode(grammarAccess.getIdentifiableElementAccess().getIntervalParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInterval_in_ruleIdentifiableElement240);
                    this_Interval_4=ruleInterval();

                    state._fsp--;

                     
                            current = this_Interval_4; 
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
    // $ANTLR end "ruleIdentifiableElement"


    // $ANTLR start "entryRuleNamedElement"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:138:1: entryRuleNamedElement returns [EObject current=null] : iv_ruleNamedElement= ruleNamedElement EOF ;
    public final EObject entryRuleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElement = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:139:2: (iv_ruleNamedElement= ruleNamedElement EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:140:2: iv_ruleNamedElement= ruleNamedElement EOF
            {
             newCompositeNode(grammarAccess.getNamedElementRule()); 
            pushFollow(FOLLOW_ruleNamedElement_in_entryRuleNamedElement275);
            iv_ruleNamedElement=ruleNamedElement();

            state._fsp--;

             current =iv_ruleNamedElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedElement285); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:147:1: ruleNamedElement returns [EObject current=null] : (this_SensorInterface_0= ruleSensorInterface | this_DataSet_1= ruleDataSet | this_Data_2= ruleData ) ;
    public final EObject ruleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject this_SensorInterface_0 = null;

        EObject this_DataSet_1 = null;

        EObject this_Data_2 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:150:28: ( (this_SensorInterface_0= ruleSensorInterface | this_DataSet_1= ruleDataSet | this_Data_2= ruleData ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:151:1: (this_SensorInterface_0= ruleSensorInterface | this_DataSet_1= ruleDataSet | this_Data_2= ruleData )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:151:1: (this_SensorInterface_0= ruleSensorInterface | this_DataSet_1= ruleDataSet | this_Data_2= ruleData )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:152:5: this_SensorInterface_0= ruleSensorInterface
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getSensorInterfaceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSensorInterface_in_ruleNamedElement332);
                    this_SensorInterface_0=ruleSensorInterface();

                    state._fsp--;

                     
                            current = this_SensorInterface_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:162:5: this_DataSet_1= ruleDataSet
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getDataSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataSet_in_ruleNamedElement359);
                    this_DataSet_1=ruleDataSet();

                    state._fsp--;

                     
                            current = this_DataSet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:172:5: this_Data_2= ruleData
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getDataParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleData_in_ruleNamedElement386);
                    this_Data_2=ruleData();

                    state._fsp--;

                     
                            current = this_Data_2; 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:188:1: entryRuleSensorInterface returns [EObject current=null] : iv_ruleSensorInterface= ruleSensorInterface EOF ;
    public final EObject entryRuleSensorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorInterface = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:189:2: (iv_ruleSensorInterface= ruleSensorInterface EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:190:2: iv_ruleSensorInterface= ruleSensorInterface EOF
            {
             newCompositeNode(grammarAccess.getSensorInterfaceRule()); 
            pushFollow(FOLLOW_ruleSensorInterface_in_entryRuleSensorInterface421);
            iv_ruleSensorInterface=ruleSensorInterface();

            state._fsp--;

             current =iv_ruleSensorInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorInterface431); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:197:1: ruleSensorInterface returns [EObject current=null] : (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' otherlv_5= ':' ( (lv_ID_6_0= RULE_STRING ) ) )? otherlv_7= '{' ( (lv_encodingSettings_8_0= ruleEncodingSettings ) ) ( (lv_dataDescription_9_0= ruleSensorDataDescription ) ) otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleSensorInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_ID_6_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_encodingSettings_8_0 = null;

        EObject lv_dataDescription_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:200:28: ( (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' otherlv_5= ':' ( (lv_ID_6_0= RULE_STRING ) ) )? otherlv_7= '{' ( (lv_encodingSettings_8_0= ruleEncodingSettings ) ) ( (lv_dataDescription_9_0= ruleSensorDataDescription ) ) otherlv_10= '}' otherlv_11= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:201:1: (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' otherlv_5= ':' ( (lv_ID_6_0= RULE_STRING ) ) )? otherlv_7= '{' ( (lv_encodingSettings_8_0= ruleEncodingSettings ) ) ( (lv_dataDescription_9_0= ruleSensorDataDescription ) ) otherlv_10= '}' otherlv_11= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:201:1: (otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' otherlv_5= ':' ( (lv_ID_6_0= RULE_STRING ) ) )? otherlv_7= '{' ( (lv_encodingSettings_8_0= ruleEncodingSettings ) ) ( (lv_dataDescription_9_0= ruleSensorDataDescription ) ) otherlv_10= '}' otherlv_11= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:201:3: otherlv_0= 'sensorInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'with' otherlv_4= 'identifier' otherlv_5= ':' ( (lv_ID_6_0= RULE_STRING ) ) )? otherlv_7= '{' ( (lv_encodingSettings_8_0= ruleEncodingSettings ) ) ( (lv_dataDescription_9_0= ruleSensorDataDescription ) ) otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleSensorInterface468); 

                	newLeafNode(otherlv_0, grammarAccess.getSensorInterfaceAccess().getSensorInterfaceKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:205:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:206:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:206:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:207:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensorInterface485); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:223:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:224:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:224:1: (lv_description_2_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:225:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSensorInterface507); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:241:3: (otherlv_3= 'with' otherlv_4= 'identifier' otherlv_5= ':' ( (lv_ID_6_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:241:5: otherlv_3= 'with' otherlv_4= 'identifier' otherlv_5= ':' ( (lv_ID_6_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSensorInterface526); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorInterfaceAccess().getWithKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleSensorInterface538); 

                        	newLeafNode(otherlv_4, grammarAccess.getSensorInterfaceAccess().getIdentifierKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleSensorInterface550); 

                        	newLeafNode(otherlv_5, grammarAccess.getSensorInterfaceAccess().getColonKeyword_3_2());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:253:1: ( (lv_ID_6_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:254:1: (lv_ID_6_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:254:1: (lv_ID_6_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:255:3: lv_ID_6_0= RULE_STRING
                    {
                    lv_ID_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSensorInterface567); 

                    			newLeafNode(lv_ID_6_0, grammarAccess.getSensorInterfaceAccess().getIDSTRINGTerminalRuleCall_3_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorInterfaceRule());
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

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleSensorInterface586); 

                	newLeafNode(otherlv_7, grammarAccess.getSensorInterfaceAccess().getLeftCurlyBracketKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:275:1: ( (lv_encodingSettings_8_0= ruleEncodingSettings ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:276:1: (lv_encodingSettings_8_0= ruleEncodingSettings )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:276:1: (lv_encodingSettings_8_0= ruleEncodingSettings )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:277:3: lv_encodingSettings_8_0= ruleEncodingSettings
            {
             
            	        newCompositeNode(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsEncodingSettingsParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEncodingSettings_in_ruleSensorInterface607);
            lv_encodingSettings_8_0=ruleEncodingSettings();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensorInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"encodingSettings",
                    		lv_encodingSettings_8_0, 
                    		"EncodingSettings");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:293:2: ( (lv_dataDescription_9_0= ruleSensorDataDescription ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:294:1: (lv_dataDescription_9_0= ruleSensorDataDescription )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:294:1: (lv_dataDescription_9_0= ruleSensorDataDescription )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:295:3: lv_dataDescription_9_0= ruleSensorDataDescription
            {
             
            	        newCompositeNode(grammarAccess.getSensorInterfaceAccess().getDataDescriptionSensorDataDescriptionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSensorDataDescription_in_ruleSensorInterface628);
            lv_dataDescription_9_0=ruleSensorDataDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensorInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"dataDescription",
                    		lv_dataDescription_9_0, 
                    		"SensorDataDescription");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleSensorInterface640); 

                	newLeafNode(otherlv_10, grammarAccess.getSensorInterfaceAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleSensorInterface652); 

                	newLeafNode(otherlv_11, grammarAccess.getSensorInterfaceAccess().getSemicolonKeyword_8());
                

            }


            }

             leaveRule(); 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:327:1: entryRuleEncodingSettings returns [EObject current=null] : iv_ruleEncodingSettings= ruleEncodingSettings EOF ;
    public final EObject entryRuleEncodingSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncodingSettings = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:328:2: (iv_ruleEncodingSettings= ruleEncodingSettings EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:329:2: iv_ruleEncodingSettings= ruleEncodingSettings EOF
            {
             newCompositeNode(grammarAccess.getEncodingSettingsRule()); 
            pushFollow(FOLLOW_ruleEncodingSettings_in_entryRuleEncodingSettings688);
            iv_ruleEncodingSettings=ruleEncodingSettings();

            state._fsp--;

             current =iv_ruleEncodingSettings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncodingSettings698); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:336:1: ruleEncodingSettings returns [EObject current=null] : (otherlv_0= 'encoding' ( (lv_coding_1_0= ruleCoding ) ) otherlv_2= 'with' ( (lv_endianness_3_0= ruleEndianness ) ) otherlv_4= 'alignment' ( (lv_alignment_5_0= RULE_INT ) ) (otherlv_6= 'with' otherlv_7= 'identifier' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= ';' ) ;
    public final EObject ruleEncodingSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_alignment_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_ID_9_0=null;
        Token otherlv_10=null;
        Enumerator lv_coding_1_0 = null;

        Enumerator lv_endianness_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:339:28: ( (otherlv_0= 'encoding' ( (lv_coding_1_0= ruleCoding ) ) otherlv_2= 'with' ( (lv_endianness_3_0= ruleEndianness ) ) otherlv_4= 'alignment' ( (lv_alignment_5_0= RULE_INT ) ) (otherlv_6= 'with' otherlv_7= 'identifier' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:340:1: (otherlv_0= 'encoding' ( (lv_coding_1_0= ruleCoding ) ) otherlv_2= 'with' ( (lv_endianness_3_0= ruleEndianness ) ) otherlv_4= 'alignment' ( (lv_alignment_5_0= RULE_INT ) ) (otherlv_6= 'with' otherlv_7= 'identifier' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:340:1: (otherlv_0= 'encoding' ( (lv_coding_1_0= ruleCoding ) ) otherlv_2= 'with' ( (lv_endianness_3_0= ruleEndianness ) ) otherlv_4= 'alignment' ( (lv_alignment_5_0= RULE_INT ) ) (otherlv_6= 'with' otherlv_7= 'identifier' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:340:3: otherlv_0= 'encoding' ( (lv_coding_1_0= ruleCoding ) ) otherlv_2= 'with' ( (lv_endianness_3_0= ruleEndianness ) ) otherlv_4= 'alignment' ( (lv_alignment_5_0= RULE_INT ) ) (otherlv_6= 'with' otherlv_7= 'identifier' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleEncodingSettings735); 

                	newLeafNode(otherlv_0, grammarAccess.getEncodingSettingsAccess().getEncodingKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:344:1: ( (lv_coding_1_0= ruleCoding ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:345:1: (lv_coding_1_0= ruleCoding )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:345:1: (lv_coding_1_0= ruleCoding )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:346:3: lv_coding_1_0= ruleCoding
            {
             
            	        newCompositeNode(grammarAccess.getEncodingSettingsAccess().getCodingCodingEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCoding_in_ruleEncodingSettings756);
            lv_coding_1_0=ruleCoding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEncodingSettingsRule());
            	        }
                   		set(
                   			current, 
                   			"coding",
                    		lv_coding_1_0, 
                    		"Coding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEncodingSettings768); 

                	newLeafNode(otherlv_2, grammarAccess.getEncodingSettingsAccess().getWithKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:366:1: ( (lv_endianness_3_0= ruleEndianness ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:367:1: (lv_endianness_3_0= ruleEndianness )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:367:1: (lv_endianness_3_0= ruleEndianness )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:368:3: lv_endianness_3_0= ruleEndianness
            {
             
            	        newCompositeNode(grammarAccess.getEncodingSettingsAccess().getEndiannessEndiannessEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEndianness_in_ruleEncodingSettings789);
            lv_endianness_3_0=ruleEndianness();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEncodingSettingsRule());
            	        }
                   		set(
                   			current, 
                   			"endianness",
                    		lv_endianness_3_0, 
                    		"Endianness");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleEncodingSettings801); 

                	newLeafNode(otherlv_4, grammarAccess.getEncodingSettingsAccess().getAlignmentKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:388:1: ( (lv_alignment_5_0= RULE_INT ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:389:1: (lv_alignment_5_0= RULE_INT )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:389:1: (lv_alignment_5_0= RULE_INT )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:390:3: lv_alignment_5_0= RULE_INT
            {
            lv_alignment_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEncodingSettings818); 

            			newLeafNode(lv_alignment_5_0, grammarAccess.getEncodingSettingsAccess().getAlignmentINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEncodingSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"alignment",
                    		lv_alignment_5_0, 
                    		"INT");
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:406:2: (otherlv_6= 'with' otherlv_7= 'identifier' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:406:4: otherlv_6= 'with' otherlv_7= 'identifier' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleEncodingSettings836); 

                        	newLeafNode(otherlv_6, grammarAccess.getEncodingSettingsAccess().getWithKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleEncodingSettings848); 

                        	newLeafNode(otherlv_7, grammarAccess.getEncodingSettingsAccess().getIdentifierKeyword_6_1());
                        
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleEncodingSettings860); 

                        	newLeafNode(otherlv_8, grammarAccess.getEncodingSettingsAccess().getColonKeyword_6_2());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:418:1: ( (lv_ID_9_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:419:1: (lv_ID_9_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:419:1: (lv_ID_9_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:420:3: lv_ID_9_0= RULE_STRING
                    {
                    lv_ID_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEncodingSettings877); 

                    			newLeafNode(lv_ID_9_0, grammarAccess.getEncodingSettingsAccess().getIDSTRINGTerminalRuleCall_6_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEncodingSettingsRule());
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

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleEncodingSettings896); 

                	newLeafNode(otherlv_10, grammarAccess.getEncodingSettingsAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:448:1: entryRuleSensorDataDescription returns [EObject current=null] : iv_ruleSensorDataDescription= ruleSensorDataDescription EOF ;
    public final EObject entryRuleSensorDataDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorDataDescription = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:449:2: (iv_ruleSensorDataDescription= ruleSensorDataDescription EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:450:2: iv_ruleSensorDataDescription= ruleSensorDataDescription EOF
            {
             newCompositeNode(grammarAccess.getSensorDataDescriptionRule()); 
            pushFollow(FOLLOW_ruleSensorDataDescription_in_entryRuleSensorDataDescription932);
            iv_ruleSensorDataDescription=ruleSensorDataDescription();

            state._fsp--;

             current =iv_ruleSensorDataDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorDataDescription942); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:457:1: ruleSensorDataDescription returns [EObject current=null] : (otherlv_0= 'sensorData' () (otherlv_2= 'with' otherlv_3= 'identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_dataSets_7_0= ruleDataSet ) )* otherlv_8= '}' otherlv_9= ';' ) ;
    public final EObject ruleSensorDataDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_ID_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_dataSets_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:460:28: ( (otherlv_0= 'sensorData' () (otherlv_2= 'with' otherlv_3= 'identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_dataSets_7_0= ruleDataSet ) )* otherlv_8= '}' otherlv_9= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:461:1: (otherlv_0= 'sensorData' () (otherlv_2= 'with' otherlv_3= 'identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_dataSets_7_0= ruleDataSet ) )* otherlv_8= '}' otherlv_9= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:461:1: (otherlv_0= 'sensorData' () (otherlv_2= 'with' otherlv_3= 'identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_dataSets_7_0= ruleDataSet ) )* otherlv_8= '}' otherlv_9= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:461:3: otherlv_0= 'sensorData' () (otherlv_2= 'with' otherlv_3= 'identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )? otherlv_6= '{' ( (lv_dataSets_7_0= ruleDataSet ) )* otherlv_8= '}' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleSensorDataDescription979); 

                	newLeafNode(otherlv_0, grammarAccess.getSensorDataDescriptionAccess().getSensorDataKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:465:1: ()
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:466:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1(),
                        current);
                

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:471:2: (otherlv_2= 'with' otherlv_3= 'identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:471:4: otherlv_2= 'with' otherlv_3= 'identifier' otherlv_4= ':' ( (lv_ID_5_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSensorDataDescription1001); 

                        	newLeafNode(otherlv_2, grammarAccess.getSensorDataDescriptionAccess().getWithKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleSensorDataDescription1013); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorDataDescriptionAccess().getIdentifierKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleSensorDataDescription1025); 

                        	newLeafNode(otherlv_4, grammarAccess.getSensorDataDescriptionAccess().getColonKeyword_2_2());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:483:1: ( (lv_ID_5_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:484:1: (lv_ID_5_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:484:1: (lv_ID_5_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:485:3: lv_ID_5_0= RULE_STRING
                    {
                    lv_ID_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSensorDataDescription1042); 

                    			newLeafNode(lv_ID_5_0, grammarAccess.getSensorDataDescriptionAccess().getIDSTRINGTerminalRuleCall_2_3_0()); 
                    		

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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleSensorDataDescription1061); 

                	newLeafNode(otherlv_6, grammarAccess.getSensorDataDescriptionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:505:1: ( (lv_dataSets_7_0= ruleDataSet ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:506:1: (lv_dataSets_7_0= ruleDataSet )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:506:1: (lv_dataSets_7_0= ruleDataSet )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:507:3: lv_dataSets_7_0= ruleDataSet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSensorDataDescriptionAccess().getDataSetsDataSetParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataSet_in_ruleSensorDataDescription1082);
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
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleSensorDataDescription1095); 

                	newLeafNode(otherlv_8, grammarAccess.getSensorDataDescriptionAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleSensorDataDescription1107); 

                	newLeafNode(otherlv_9, grammarAccess.getSensorDataDescriptionAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:539:1: entryRuleDataSet returns [EObject current=null] : iv_ruleDataSet= ruleDataSet EOF ;
    public final EObject entryRuleDataSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSet = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:540:2: (iv_ruleDataSet= ruleDataSet EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:541:2: iv_ruleDataSet= ruleDataSet EOF
            {
             newCompositeNode(grammarAccess.getDataSetRule()); 
            pushFollow(FOLLOW_ruleDataSet_in_entryRuleDataSet1143);
            iv_ruleDataSet=ruleDataSet();

            state._fsp--;

             current =iv_ruleDataSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSet1153); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:548:1: ruleDataSet returns [EObject current=null] : (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' otherlv_3= 'identifier' ( (lv_ID_4_0= RULE_STRING ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '{' ( (lv_subDataSets_7_0= ruleDataSet ) )? ( (lv_data_8_0= ruleData ) )* otherlv_9= '}' otherlv_10= ';' ) ;
    public final EObject ruleDataSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_ID_4_0=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_subDataSets_7_0 = null;

        EObject lv_data_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:551:28: ( (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' otherlv_3= 'identifier' ( (lv_ID_4_0= RULE_STRING ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '{' ( (lv_subDataSets_7_0= ruleDataSet ) )? ( (lv_data_8_0= ruleData ) )* otherlv_9= '}' otherlv_10= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:552:1: (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' otherlv_3= 'identifier' ( (lv_ID_4_0= RULE_STRING ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '{' ( (lv_subDataSets_7_0= ruleDataSet ) )? ( (lv_data_8_0= ruleData ) )* otherlv_9= '}' otherlv_10= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:552:1: (otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' otherlv_3= 'identifier' ( (lv_ID_4_0= RULE_STRING ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '{' ( (lv_subDataSets_7_0= ruleDataSet ) )? ( (lv_data_8_0= ruleData ) )* otherlv_9= '}' otherlv_10= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:552:3: otherlv_0= 'dataSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' otherlv_3= 'identifier' ( (lv_ID_4_0= RULE_STRING ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '{' ( (lv_subDataSets_7_0= ruleDataSet ) )? ( (lv_data_8_0= ruleData ) )* otherlv_9= '}' otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleDataSet1190); 

                	newLeafNode(otherlv_0, grammarAccess.getDataSetAccess().getDataSetKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:556:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:557:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:557:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:558:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSet1207); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:574:2: (otherlv_2= 'with' otherlv_3= 'identifier' ( (lv_ID_4_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:574:4: otherlv_2= 'with' otherlv_3= 'identifier' ( (lv_ID_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDataSet1225); 

                        	newLeafNode(otherlv_2, grammarAccess.getDataSetAccess().getWithKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDataSet1237); 

                        	newLeafNode(otherlv_3, grammarAccess.getDataSetAccess().getIdentifierKeyword_2_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:582:1: ( (lv_ID_4_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:583:1: (lv_ID_4_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:583:1: (lv_ID_4_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:584:3: lv_ID_4_0= RULE_STRING
                    {
                    lv_ID_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataSet1254); 

                    			newLeafNode(lv_ID_4_0, grammarAccess.getDataSetAccess().getIDSTRINGTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSetRule());
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:600:4: ( (lv_description_5_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:601:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:601:1: (lv_description_5_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:602:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataSet1278); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getDataSetAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataSetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleDataSet1296); 

                	newLeafNode(otherlv_6, grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:622:1: ( (lv_subDataSets_7_0= ruleDataSet ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:623:1: (lv_subDataSets_7_0= ruleDataSet )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:623:1: (lv_subDataSets_7_0= ruleDataSet )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:624:3: lv_subDataSets_7_0= ruleDataSet
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataSetAccess().getSubDataSetsDataSetParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataSet_in_ruleDataSet1317);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:640:3: ( (lv_data_8_0= ruleData ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:641:1: (lv_data_8_0= ruleData )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:641:1: (lv_data_8_0= ruleData )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:642:3: lv_data_8_0= ruleData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleData_in_ruleDataSet1339);
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
            	    break loop11;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleDataSet1352); 

                	newLeafNode(otherlv_9, grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleDataSet1364); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:674:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:675:2: (iv_ruleData= ruleData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:676:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData1400);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData1410); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:683:1: ruleData returns [EObject current=null] : (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject this_MeasurementData_0 = null;

        EObject this_NonMeasurementData_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:686:28: ( (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:687:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:687:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:688:5: this_MeasurementData_0= ruleMeasurementData
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMeasurementData_in_ruleData1457);
                    this_MeasurementData_0=ruleMeasurementData();

                    state._fsp--;

                     
                            current = this_MeasurementData_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:698:5: this_NonMeasurementData_1= ruleNonMeasurementData
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getNonMeasurementDataParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNonMeasurementData_in_ruleData1484);
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:714:1: entryRuleMeasurementData returns [EObject current=null] : iv_ruleMeasurementData= ruleMeasurementData EOF ;
    public final EObject entryRuleMeasurementData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:715:2: (iv_ruleMeasurementData= ruleMeasurementData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:716:2: iv_ruleMeasurementData= ruleMeasurementData EOF
            {
             newCompositeNode(grammarAccess.getMeasurementDataRule()); 
            pushFollow(FOLLOW_ruleMeasurementData_in_entryRuleMeasurementData1519);
            iv_ruleMeasurementData=ruleMeasurementData();

            state._fsp--;

             current =iv_ruleMeasurementData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementData1529); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:723:1: ruleMeasurementData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= RULE_UNIT ) ) (otherlv_5= 'with' otherlv_6= 'identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? (otherlv_9= 'adjusted' otherlv_10= 'by' otherlv_11= ':' ( (lv_adjustments_12_0= ruleDataAdjustment ) ) (otherlv_13= ',' ( (lv_adjustments_14_0= ruleDataAdjustment ) ) )* )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' ) ;
    public final EObject ruleMeasurementData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_unit_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_ID_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_description_15_0=null;
        Token otherlv_16=null;
        Enumerator lv_dataType_2_0 = null;

        EObject lv_adjustments_12_0 = null;

        EObject lv_adjustments_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:726:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= RULE_UNIT ) ) (otherlv_5= 'with' otherlv_6= 'identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? (otherlv_9= 'adjusted' otherlv_10= 'by' otherlv_11= ':' ( (lv_adjustments_12_0= ruleDataAdjustment ) ) (otherlv_13= ',' ( (lv_adjustments_14_0= ruleDataAdjustment ) ) )* )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:727:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= RULE_UNIT ) ) (otherlv_5= 'with' otherlv_6= 'identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? (otherlv_9= 'adjusted' otherlv_10= 'by' otherlv_11= ':' ( (lv_adjustments_12_0= ruleDataAdjustment ) ) (otherlv_13= ',' ( (lv_adjustments_14_0= ruleDataAdjustment ) ) )* )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:727:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= RULE_UNIT ) ) (otherlv_5= 'with' otherlv_6= 'identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? (otherlv_9= 'adjusted' otherlv_10= 'by' otherlv_11= ':' ( (lv_adjustments_12_0= ruleDataAdjustment ) ) (otherlv_13= ',' ( (lv_adjustments_14_0= ruleDataAdjustment ) ) )* )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:727:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'in' ( (lv_unit_4_0= RULE_UNIT ) ) (otherlv_5= 'with' otherlv_6= 'identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )? (otherlv_9= 'adjusted' otherlv_10= 'by' otherlv_11= ':' ( (lv_adjustments_12_0= ruleDataAdjustment ) ) (otherlv_13= ',' ( (lv_adjustments_14_0= ruleDataAdjustment ) ) )* )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';'
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:727:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:728:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:728:1: (lv_name_0_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:729:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeasurementData1571); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleMeasurementData1588); 

                	newLeafNode(otherlv_1, grammarAccess.getMeasurementDataAccess().getAsKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:749:1: ( (lv_dataType_2_0= ruleDataType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:750:1: (lv_dataType_2_0= ruleDataType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:750:1: (lv_dataType_2_0= ruleDataType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:751:3: lv_dataType_2_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleMeasurementData1609);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleMeasurementData1621); 

                	newLeafNode(otherlv_3, grammarAccess.getMeasurementDataAccess().getInKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:771:1: ( (lv_unit_4_0= RULE_UNIT ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:772:1: (lv_unit_4_0= RULE_UNIT )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:772:1: (lv_unit_4_0= RULE_UNIT )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:773:3: lv_unit_4_0= RULE_UNIT
            {
            lv_unit_4_0=(Token)match(input,RULE_UNIT,FOLLOW_RULE_UNIT_in_ruleMeasurementData1638); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:789:2: (otherlv_5= 'with' otherlv_6= 'identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:789:4: otherlv_5= 'with' otherlv_6= 'identifier' otherlv_7= ':' ( (lv_ID_8_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleMeasurementData1656); 

                        	newLeafNode(otherlv_5, grammarAccess.getMeasurementDataAccess().getWithKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleMeasurementData1668); 

                        	newLeafNode(otherlv_6, grammarAccess.getMeasurementDataAccess().getIdentifierKeyword_5_1());
                        
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleMeasurementData1680); 

                        	newLeafNode(otherlv_7, grammarAccess.getMeasurementDataAccess().getColonKeyword_5_2());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:801:1: ( (lv_ID_8_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:802:1: (lv_ID_8_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:802:1: (lv_ID_8_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:803:3: lv_ID_8_0= RULE_STRING
                    {
                    lv_ID_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasurementData1697); 

                    			newLeafNode(lv_ID_8_0, grammarAccess.getMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasurementDataRule());
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:819:4: (otherlv_9= 'adjusted' otherlv_10= 'by' otherlv_11= ':' ( (lv_adjustments_12_0= ruleDataAdjustment ) ) (otherlv_13= ',' ( (lv_adjustments_14_0= ruleDataAdjustment ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:819:6: otherlv_9= 'adjusted' otherlv_10= 'by' otherlv_11= ':' ( (lv_adjustments_12_0= ruleDataAdjustment ) ) (otherlv_13= ',' ( (lv_adjustments_14_0= ruleDataAdjustment ) ) )*
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleMeasurementData1717); 

                        	newLeafNode(otherlv_9, grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleMeasurementData1729); 

                        	newLeafNode(otherlv_10, grammarAccess.getMeasurementDataAccess().getByKeyword_6_1());
                        
                    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleMeasurementData1741); 

                        	newLeafNode(otherlv_11, grammarAccess.getMeasurementDataAccess().getColonKeyword_6_2());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:831:1: ( (lv_adjustments_12_0= ruleDataAdjustment ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:832:1: (lv_adjustments_12_0= ruleDataAdjustment )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:832:1: (lv_adjustments_12_0= ruleDataAdjustment )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:833:3: lv_adjustments_12_0= ruleDataAdjustment
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustmentParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataAdjustment_in_ruleMeasurementData1762);
                    lv_adjustments_12_0=ruleDataAdjustment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
                    	        }
                           		add(
                           			current, 
                           			"adjustments",
                            		lv_adjustments_12_0, 
                            		"DataAdjustment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:849:2: (otherlv_13= ',' ( (lv_adjustments_14_0= ruleDataAdjustment ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==27) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:849:4: otherlv_13= ',' ( (lv_adjustments_14_0= ruleDataAdjustment ) )
                    	    {
                    	    otherlv_13=(Token)match(input,27,FOLLOW_27_in_ruleMeasurementData1775); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_4_0());
                    	        
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:853:1: ( (lv_adjustments_14_0= ruleDataAdjustment ) )
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:854:1: (lv_adjustments_14_0= ruleDataAdjustment )
                    	    {
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:854:1: (lv_adjustments_14_0= ruleDataAdjustment )
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:855:3: lv_adjustments_14_0= ruleDataAdjustment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustmentParserRuleCall_6_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDataAdjustment_in_ruleMeasurementData1796);
                    	    lv_adjustments_14_0=ruleDataAdjustment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMeasurementDataRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"adjustments",
                    	            		lv_adjustments_14_0, 
                    	            		"DataAdjustment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:871:6: ( (lv_description_15_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:872:1: (lv_description_15_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:872:1: (lv_description_15_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:873:3: lv_description_15_0= RULE_STRING
                    {
                    lv_description_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasurementData1817); 

                    			newLeafNode(lv_description_15_0, grammarAccess.getMeasurementDataAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_15_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleMeasurementData1835); 

                	newLeafNode(otherlv_16, grammarAccess.getMeasurementDataAccess().getSemicolonKeyword_8());
                

            }


            }

             leaveRule(); 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:901:1: entryRuleNonMeasurementData returns [EObject current=null] : iv_ruleNonMeasurementData= ruleNonMeasurementData EOF ;
    public final EObject entryRuleNonMeasurementData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonMeasurementData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:902:2: (iv_ruleNonMeasurementData= ruleNonMeasurementData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:903:2: iv_ruleNonMeasurementData= ruleNonMeasurementData EOF
            {
             newCompositeNode(grammarAccess.getNonMeasurementDataRule()); 
            pushFollow(FOLLOW_ruleNonMeasurementData_in_entryRuleNonMeasurementData1871);
            iv_ruleNonMeasurementData=ruleNonMeasurementData();

            state._fsp--;

             current =iv_ruleNonMeasurementData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonMeasurementData1881); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:910:1: ruleNonMeasurementData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'constant' otherlv_4= '=' ( (lv_constant_5_0= ruleBOOLEAN ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'identifier' otherlv_11= ':' ( (lv_ID_12_0= RULE_STRING ) ) )? ( (lv_description_13_0= RULE_STRING ) )? otherlv_14= ';' ) ;
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
        Token otherlv_11=null;
        Token lv_ID_12_0=null;
        Token lv_description_13_0=null;
        Token otherlv_14=null;
        Enumerator lv_dataType_2_0 = null;

        AntlrDatatypeRuleToken lv_constant_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:913:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'constant' otherlv_4= '=' ( (lv_constant_5_0= ruleBOOLEAN ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'identifier' otherlv_11= ':' ( (lv_ID_12_0= RULE_STRING ) ) )? ( (lv_description_13_0= RULE_STRING ) )? otherlv_14= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:914:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'constant' otherlv_4= '=' ( (lv_constant_5_0= ruleBOOLEAN ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'identifier' otherlv_11= ':' ( (lv_ID_12_0= RULE_STRING ) ) )? ( (lv_description_13_0= RULE_STRING ) )? otherlv_14= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:914:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'constant' otherlv_4= '=' ( (lv_constant_5_0= ruleBOOLEAN ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'identifier' otherlv_11= ':' ( (lv_ID_12_0= RULE_STRING ) ) )? ( (lv_description_13_0= RULE_STRING ) )? otherlv_14= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:914:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= 'constant' otherlv_4= '=' ( (lv_constant_5_0= ruleBOOLEAN ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'identifier' otherlv_11= ':' ( (lv_ID_12_0= RULE_STRING ) ) )? ( (lv_description_13_0= RULE_STRING ) )? otherlv_14= ';'
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:914:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:915:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:915:1: (lv_name_0_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:916:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonMeasurementData1923); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleNonMeasurementData1940); 

                	newLeafNode(otherlv_1, grammarAccess.getNonMeasurementDataAccess().getAsKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:936:1: ( (lv_dataType_2_0= ruleDataType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:937:1: (lv_dataType_2_0= ruleDataType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:937:1: (lv_dataType_2_0= ruleDataType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:938:3: lv_dataType_2_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleNonMeasurementData1961);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleNonMeasurementData1973); 

                	newLeafNode(otherlv_3, grammarAccess.getNonMeasurementDataAccess().getConstantKeyword_3());
                
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleNonMeasurementData1985); 

                	newLeafNode(otherlv_4, grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:962:1: ( (lv_constant_5_0= ruleBOOLEAN ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:963:1: (lv_constant_5_0= ruleBOOLEAN )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:963:1: (lv_constant_5_0= ruleBOOLEAN )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:964:3: lv_constant_5_0= ruleBOOLEAN
            {
             
            	        newCompositeNode(grammarAccess.getNonMeasurementDataAccess().getConstantBOOLEANParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleNonMeasurementData2006);
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

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleNonMeasurementData2018); 

                	newLeafNode(otherlv_6, grammarAccess.getNonMeasurementDataAccess().getValueKeyword_6());
                
            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleNonMeasurementData2030); 

                	newLeafNode(otherlv_7, grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_7());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:988:1: ( (lv_value_8_0= RULE_STRING ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:989:1: (lv_value_8_0= RULE_STRING )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:989:1: (lv_value_8_0= RULE_STRING )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:990:3: lv_value_8_0= RULE_STRING
            {
            lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasurementData2047); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1006:2: (otherlv_9= 'with' otherlv_10= 'identifier' otherlv_11= ':' ( (lv_ID_12_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1006:4: otherlv_9= 'with' otherlv_10= 'identifier' otherlv_11= ':' ( (lv_ID_12_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleNonMeasurementData2065); 

                        	newLeafNode(otherlv_9, grammarAccess.getNonMeasurementDataAccess().getWithKeyword_9_0());
                        
                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleNonMeasurementData2077); 

                        	newLeafNode(otherlv_10, grammarAccess.getNonMeasurementDataAccess().getIdentifierKeyword_9_1());
                        
                    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleNonMeasurementData2089); 

                        	newLeafNode(otherlv_11, grammarAccess.getNonMeasurementDataAccess().getColonKeyword_9_2());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1018:1: ( (lv_ID_12_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1019:1: (lv_ID_12_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1019:1: (lv_ID_12_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1020:3: lv_ID_12_0= RULE_STRING
                    {
                    lv_ID_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasurementData2106); 

                    			newLeafNode(lv_ID_12_0, grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_9_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_12_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1036:4: ( (lv_description_13_0= RULE_STRING ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1037:1: (lv_description_13_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1037:1: (lv_description_13_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1038:3: lv_description_13_0= RULE_STRING
                    {
                    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasurementData2130); 

                    			newLeafNode(lv_description_13_0, grammarAccess.getNonMeasurementDataAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasurementDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_13_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleNonMeasurementData2148); 

                	newLeafNode(otherlv_14, grammarAccess.getNonMeasurementDataAccess().getSemicolonKeyword_11());
                

            }


            }

             leaveRule(); 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1066:1: entryRuleDataAdjustment returns [EObject current=null] : iv_ruleDataAdjustment= ruleDataAdjustment EOF ;
    public final EObject entryRuleDataAdjustment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAdjustment = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1067:2: (iv_ruleDataAdjustment= ruleDataAdjustment EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1068:2: iv_ruleDataAdjustment= ruleDataAdjustment EOF
            {
             newCompositeNode(grammarAccess.getDataAdjustmentRule()); 
            pushFollow(FOLLOW_ruleDataAdjustment_in_entryRuleDataAdjustment2184);
            iv_ruleDataAdjustment=ruleDataAdjustment();

            state._fsp--;

             current =iv_ruleDataAdjustment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAdjustment2194); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1075:1: ruleDataAdjustment returns [EObject current=null] : (this_DataRange_0= ruleDataRange | this_DataConversion_1= ruleDataConversion ) ;
    public final EObject ruleDataAdjustment() throws RecognitionException {
        EObject current = null;

        EObject this_DataRange_0 = null;

        EObject this_DataConversion_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1078:28: ( (this_DataRange_0= ruleDataRange | this_DataConversion_1= ruleDataConversion ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1079:1: (this_DataRange_0= ruleDataRange | this_DataConversion_1= ruleDataConversion )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1079:1: (this_DataRange_0= ruleDataRange | this_DataConversion_1= ruleDataConversion )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==33) ) {
                    alt19=2;
                }
                else if ( (LA19_1==31) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
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
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1080:5: this_DataRange_0= ruleDataRange
                    {
                     
                            newCompositeNode(grammarAccess.getDataAdjustmentAccess().getDataRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataRange_in_ruleDataAdjustment2241);
                    this_DataRange_0=ruleDataRange();

                    state._fsp--;

                     
                            current = this_DataRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1090:5: this_DataConversion_1= ruleDataConversion
                    {
                     
                            newCompositeNode(grammarAccess.getDataAdjustmentAccess().getDataConversionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataConversion_in_ruleDataAdjustment2268);
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1106:1: entryRuleDataRange returns [EObject current=null] : iv_ruleDataRange= ruleDataRange EOF ;
    public final EObject entryRuleDataRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataRange = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1107:2: (iv_ruleDataRange= ruleDataRange EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1108:2: iv_ruleDataRange= ruleDataRange EOF
            {
             newCompositeNode(grammarAccess.getDataRangeRule()); 
            pushFollow(FOLLOW_ruleDataRange_in_entryRuleDataRange2303);
            iv_ruleDataRange=ruleDataRange();

            state._fsp--;

             current =iv_ruleDataRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataRange2313); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1115:1: ruleDataRange returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= 'range' ( (lv_range_2_0= ruleInterval ) ) otherlv_3= ';' ) ;
    public final EObject ruleDataRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_range_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1118:28: ( (otherlv_0= 'with' otherlv_1= 'range' ( (lv_range_2_0= ruleInterval ) ) otherlv_3= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1119:1: (otherlv_0= 'with' otherlv_1= 'range' ( (lv_range_2_0= ruleInterval ) ) otherlv_3= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1119:1: (otherlv_0= 'with' otherlv_1= 'range' ( (lv_range_2_0= ruleInterval ) ) otherlv_3= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1119:3: otherlv_0= 'with' otherlv_1= 'range' ( (lv_range_2_0= ruleInterval ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleDataRange2350); 

                	newLeafNode(otherlv_0, grammarAccess.getDataRangeAccess().getWithKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleDataRange2362); 

                	newLeafNode(otherlv_1, grammarAccess.getDataRangeAccess().getRangeKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1127:1: ( (lv_range_2_0= ruleInterval ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1128:1: (lv_range_2_0= ruleInterval )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1128:1: (lv_range_2_0= ruleInterval )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1129:3: lv_range_2_0= ruleInterval
            {
             
            	        newCompositeNode(grammarAccess.getDataRangeAccess().getRangeIntervalParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInterval_in_ruleDataRange2383);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleDataRange2395); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1157:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1158:2: (iv_ruleInterval= ruleInterval EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1159:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_ruleInterval_in_entryRuleInterval2431);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterval2441); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1166:1: ruleInterval returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleDOUBLE ) ) otherlv_1= '...' ( (lv_upperBound_2_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1169:28: ( ( ( (lv_lowerBound_0_0= ruleDOUBLE ) ) otherlv_1= '...' ( (lv_upperBound_2_0= ruleDOUBLE ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1170:1: ( ( (lv_lowerBound_0_0= ruleDOUBLE ) ) otherlv_1= '...' ( (lv_upperBound_2_0= ruleDOUBLE ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1170:1: ( ( (lv_lowerBound_0_0= ruleDOUBLE ) ) otherlv_1= '...' ( (lv_upperBound_2_0= ruleDOUBLE ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1170:2: ( (lv_lowerBound_0_0= ruleDOUBLE ) ) otherlv_1= '...' ( (lv_upperBound_2_0= ruleDOUBLE ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1170:2: ( (lv_lowerBound_0_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1171:1: (lv_lowerBound_0_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1171:1: (lv_lowerBound_0_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1172:3: lv_lowerBound_0_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleInterval2487);
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

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleInterval2499); 

                	newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getFullStopFullStopFullStopKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1192:1: ( (lv_upperBound_2_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1193:1: (lv_upperBound_2_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1193:1: (lv_upperBound_2_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1194:3: lv_upperBound_2_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleInterval2520);
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1218:1: entryRuleDataConversion returns [EObject current=null] : iv_ruleDataConversion= ruleDataConversion EOF ;
    public final EObject entryRuleDataConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataConversion = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1219:2: (iv_ruleDataConversion= ruleDataConversion EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1220:2: iv_ruleDataConversion= ruleDataConversion EOF
            {
             newCompositeNode(grammarAccess.getDataConversionRule()); 
            pushFollow(FOLLOW_ruleDataConversion_in_entryRuleDataConversion2556);
            iv_ruleDataConversion=ruleDataConversion();

            state._fsp--;

             current =iv_ruleDataConversion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataConversion2566); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1227:1: ruleDataConversion returns [EObject current=null] : this_LinearDataConversion_0= ruleLinearDataConversion ;
    public final EObject ruleDataConversion() throws RecognitionException {
        EObject current = null;

        EObject this_LinearDataConversion_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1230:28: (this_LinearDataConversion_0= ruleLinearDataConversion )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1232:5: this_LinearDataConversion_0= ruleLinearDataConversion
            {
             
                    newCompositeNode(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleLinearDataConversion_in_ruleDataConversion2612);
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1248:1: entryRuleLinearDataConversion returns [EObject current=null] : iv_ruleLinearDataConversion= ruleLinearDataConversion EOF ;
    public final EObject entryRuleLinearDataConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearDataConversion = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1249:2: (iv_ruleLinearDataConversion= ruleLinearDataConversion EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1250:2: iv_ruleLinearDataConversion= ruleLinearDataConversion EOF
            {
             newCompositeNode(grammarAccess.getLinearDataConversionRule()); 
            pushFollow(FOLLOW_ruleLinearDataConversion_in_entryRuleLinearDataConversion2646);
            iv_ruleLinearDataConversion=ruleLinearDataConversion();

            state._fsp--;

             current =iv_ruleLinearDataConversion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinearDataConversion2656); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1257:1: ruleLinearDataConversion returns [EObject current=null] : ( (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) ) | (otherlv_8= 'linear mapping' otherlv_9= '[' ( (lv_fromInterval_10_0= ruleInterval ) ) otherlv_11= ']' otherlv_12= '=>' otherlv_13= '[' ( (lv_toInterval_14_0= ruleInterval ) ) otherlv_15= ']' ) ) ;
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
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1260:28: ( ( (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) ) | (otherlv_8= 'linear mapping' otherlv_9= '[' ( (lv_fromInterval_10_0= ruleInterval ) ) otherlv_11= ']' otherlv_12= '=>' otherlv_13= '[' ( (lv_toInterval_14_0= ruleInterval ) ) otherlv_15= ']' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1261:1: ( (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) ) | (otherlv_8= 'linear mapping' otherlv_9= '[' ( (lv_fromInterval_10_0= ruleInterval ) ) otherlv_11= ']' otherlv_12= '=>' otherlv_13= '[' ( (lv_toInterval_14_0= ruleInterval ) ) otherlv_15= ']' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1261:1: ( (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) ) | (otherlv_8= 'linear mapping' otherlv_9= '[' ( (lv_fromInterval_10_0= ruleInterval ) ) otherlv_11= ']' otherlv_12= '=>' otherlv_13= '[' ( (lv_toInterval_14_0= ruleInterval ) ) otherlv_15= ']' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                alt20=1;
            }
            else if ( (LA20_0==36) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1261:2: (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1261:2: (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1261:4: otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleLinearDataConversion2694); 

                        	newLeafNode(otherlv_0, grammarAccess.getLinearDataConversionAccess().getWithKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleLinearDataConversion2706); 

                        	newLeafNode(otherlv_1, grammarAccess.getLinearDataConversionAccess().getScalingFactorKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleLinearDataConversion2718); 

                        	newLeafNode(otherlv_2, grammarAccess.getLinearDataConversionAccess().getColonKeyword_0_2());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1273:1: ( (lv_scalingFactor_3_0= ruleDOUBLE ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1274:1: (lv_scalingFactor_3_0= ruleDOUBLE )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1274:1: (lv_scalingFactor_3_0= ruleDOUBLE )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1275:3: lv_scalingFactor_3_0= ruleDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion2739);
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

                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleLinearDataConversion2751); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinearDataConversionAccess().getAndKeyword_0_4());
                        
                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleLinearDataConversion2763); 

                        	newLeafNode(otherlv_5, grammarAccess.getLinearDataConversionAccess().getOffsetKeyword_0_5());
                        
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleLinearDataConversion2775); 

                        	newLeafNode(otherlv_6, grammarAccess.getLinearDataConversionAccess().getColonKeyword_0_6());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1303:1: ( (lv_offset_7_0= ruleDOUBLE ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1304:1: (lv_offset_7_0= ruleDOUBLE )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1304:1: (lv_offset_7_0= ruleDOUBLE )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1305:3: lv_offset_7_0= ruleDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinearDataConversionAccess().getOffsetDOUBLEParserRuleCall_0_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion2796);
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
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1322:6: (otherlv_8= 'linear mapping' otherlv_9= '[' ( (lv_fromInterval_10_0= ruleInterval ) ) otherlv_11= ']' otherlv_12= '=>' otherlv_13= '[' ( (lv_toInterval_14_0= ruleInterval ) ) otherlv_15= ']' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1322:6: (otherlv_8= 'linear mapping' otherlv_9= '[' ( (lv_fromInterval_10_0= ruleInterval ) ) otherlv_11= ']' otherlv_12= '=>' otherlv_13= '[' ( (lv_toInterval_14_0= ruleInterval ) ) otherlv_15= ']' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1322:8: otherlv_8= 'linear mapping' otherlv_9= '[' ( (lv_fromInterval_10_0= ruleInterval ) ) otherlv_11= ']' otherlv_12= '=>' otherlv_13= '[' ( (lv_toInterval_14_0= ruleInterval ) ) otherlv_15= ']'
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleLinearDataConversion2816); 

                        	newLeafNode(otherlv_8, grammarAccess.getLinearDataConversionAccess().getLinearMappingKeyword_1_0());
                        
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleLinearDataConversion2828); 

                        	newLeafNode(otherlv_9, grammarAccess.getLinearDataConversionAccess().getLeftSquareBracketKeyword_1_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1330:1: ( (lv_fromInterval_10_0= ruleInterval ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1331:1: (lv_fromInterval_10_0= ruleInterval )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1331:1: (lv_fromInterval_10_0= ruleInterval )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1332:3: lv_fromInterval_10_0= ruleInterval
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinearDataConversionAccess().getFromIntervalIntervalParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterval_in_ruleLinearDataConversion2849);
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

                    otherlv_11=(Token)match(input,38,FOLLOW_38_in_ruleLinearDataConversion2861); 

                        	newLeafNode(otherlv_11, grammarAccess.getLinearDataConversionAccess().getRightSquareBracketKeyword_1_3());
                        
                    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleLinearDataConversion2873); 

                        	newLeafNode(otherlv_12, grammarAccess.getLinearDataConversionAccess().getEqualsSignGreaterThanSignKeyword_1_4());
                        
                    otherlv_13=(Token)match(input,37,FOLLOW_37_in_ruleLinearDataConversion2885); 

                        	newLeafNode(otherlv_13, grammarAccess.getLinearDataConversionAccess().getLeftSquareBracketKeyword_1_5());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1360:1: ( (lv_toInterval_14_0= ruleInterval ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1361:1: (lv_toInterval_14_0= ruleInterval )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1361:1: (lv_toInterval_14_0= ruleInterval )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1362:3: lv_toInterval_14_0= ruleInterval
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinearDataConversionAccess().getToIntervalIntervalParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterval_in_ruleLinearDataConversion2906);
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

                    otherlv_15=(Token)match(input,38,FOLLOW_38_in_ruleLinearDataConversion2918); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1390:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1391:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1392:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE2956);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE2967); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1399:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1402:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1403:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1403:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1403:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE3007); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1410:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1411:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleDOUBLE3026); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE3041); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1431:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1432:2: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1433:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN3089);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN3100); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1440:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1443:28: ( (kw= 'true' | kw= 'false' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1444:1: (kw= 'true' | kw= 'false' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1444:1: (kw= 'true' | kw= 'false' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            else if ( (LA22_0==42) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1445:2: kw= 'true'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleBOOLEAN3138); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1452:2: kw= 'false'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleBOOLEAN3157); 

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


    // $ANTLR start "ruleCoding"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1465:1: ruleCoding returns [Enumerator current=null] : ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) ) ;
    public final Enumerator ruleCoding() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1467:28: ( ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1468:1: ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1468:1: ( (enumLiteral_0= 'SENSIDL_BINARY' ) | (enumLiteral_1= 'SENSIDL_JSON' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            else if ( (LA23_0==44) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1468:2: (enumLiteral_0= 'SENSIDL_BINARY' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1468:2: (enumLiteral_0= 'SENSIDL_BINARY' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1468:4: enumLiteral_0= 'SENSIDL_BINARY'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleCoding3211); 

                            current = grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1474:6: (enumLiteral_1= 'SENSIDL_JSON' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1474:6: (enumLiteral_1= 'SENSIDL_JSON' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1474:8: enumLiteral_1= 'SENSIDL_JSON'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleCoding3228); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1484:1: ruleEndianness returns [Enumerator current=null] : ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) ;
    public final Enumerator ruleEndianness() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1486:28: ( ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1487:1: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1487:1: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            else if ( (LA24_0==46) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1487:2: (enumLiteral_0= 'BIG_ENDIAN' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1487:2: (enumLiteral_0= 'BIG_ENDIAN' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1487:4: enumLiteral_0= 'BIG_ENDIAN'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_ruleEndianness3273); 

                            current = grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1493:6: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1493:6: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1493:8: enumLiteral_1= 'LITTLE_ENDIAN'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_46_in_ruleEndianness3290); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1503:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'SIGNED_CHAR' ) | (enumLiteral_1= 'UNSIGNED_CHAR' ) | (enumLiteral_2= 'SIGNED_SHORT' ) | (enumLiteral_3= 'UNSIGNED_SHORT' ) | (enumLiteral_4= 'SIGNED_LONG' ) | (enumLiteral_5= 'UNSIGNED_LONG' ) | (enumLiteral_6= 'SIGNED_LONG_LONG' ) | (enumLiteral_7= 'UNSIGNED_LONG_LONG' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) | (enumLiteral_10= 'LONG_DOUBLE' ) ) ;
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
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1505:28: ( ( (enumLiteral_0= 'SIGNED_CHAR' ) | (enumLiteral_1= 'UNSIGNED_CHAR' ) | (enumLiteral_2= 'SIGNED_SHORT' ) | (enumLiteral_3= 'UNSIGNED_SHORT' ) | (enumLiteral_4= 'SIGNED_LONG' ) | (enumLiteral_5= 'UNSIGNED_LONG' ) | (enumLiteral_6= 'SIGNED_LONG_LONG' ) | (enumLiteral_7= 'UNSIGNED_LONG_LONG' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) | (enumLiteral_10= 'LONG_DOUBLE' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1506:1: ( (enumLiteral_0= 'SIGNED_CHAR' ) | (enumLiteral_1= 'UNSIGNED_CHAR' ) | (enumLiteral_2= 'SIGNED_SHORT' ) | (enumLiteral_3= 'UNSIGNED_SHORT' ) | (enumLiteral_4= 'SIGNED_LONG' ) | (enumLiteral_5= 'UNSIGNED_LONG' ) | (enumLiteral_6= 'SIGNED_LONG_LONG' ) | (enumLiteral_7= 'UNSIGNED_LONG_LONG' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) | (enumLiteral_10= 'LONG_DOUBLE' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1506:1: ( (enumLiteral_0= 'SIGNED_CHAR' ) | (enumLiteral_1= 'UNSIGNED_CHAR' ) | (enumLiteral_2= 'SIGNED_SHORT' ) | (enumLiteral_3= 'UNSIGNED_SHORT' ) | (enumLiteral_4= 'SIGNED_LONG' ) | (enumLiteral_5= 'UNSIGNED_LONG' ) | (enumLiteral_6= 'SIGNED_LONG_LONG' ) | (enumLiteral_7= 'UNSIGNED_LONG_LONG' ) | (enumLiteral_8= 'FLOAT' ) | (enumLiteral_9= 'DOUBLE' ) | (enumLiteral_10= 'LONG_DOUBLE' ) )
            int alt25=11;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt25=1;
                }
                break;
            case 48:
                {
                alt25=2;
                }
                break;
            case 49:
                {
                alt25=3;
                }
                break;
            case 50:
                {
                alt25=4;
                }
                break;
            case 51:
                {
                alt25=5;
                }
                break;
            case 52:
                {
                alt25=6;
                }
                break;
            case 53:
                {
                alt25=7;
                }
                break;
            case 54:
                {
                alt25=8;
                }
                break;
            case 55:
                {
                alt25=9;
                }
                break;
            case 56:
                {
                alt25=10;
                }
                break;
            case 57:
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
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1506:2: (enumLiteral_0= 'SIGNED_CHAR' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1506:2: (enumLiteral_0= 'SIGNED_CHAR' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1506:4: enumLiteral_0= 'SIGNED_CHAR'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleDataType3335); 

                            current = grammarAccess.getDataTypeAccess().getSIGNED_CHAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getSIGNED_CHAREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1512:6: (enumLiteral_1= 'UNSIGNED_CHAR' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1512:6: (enumLiteral_1= 'UNSIGNED_CHAR' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1512:8: enumLiteral_1= 'UNSIGNED_CHAR'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleDataType3352); 

                            current = grammarAccess.getDataTypeAccess().getUNSIGNED_CHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getUNSIGNED_CHAREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1518:6: (enumLiteral_2= 'SIGNED_SHORT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1518:6: (enumLiteral_2= 'SIGNED_SHORT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1518:8: enumLiteral_2= 'SIGNED_SHORT'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_49_in_ruleDataType3369); 

                            current = grammarAccess.getDataTypeAccess().getSIGNED_SHORTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getSIGNED_SHORTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1524:6: (enumLiteral_3= 'UNSIGNED_SHORT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1524:6: (enumLiteral_3= 'UNSIGNED_SHORT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1524:8: enumLiteral_3= 'UNSIGNED_SHORT'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_50_in_ruleDataType3386); 

                            current = grammarAccess.getDataTypeAccess().getUNSIGNED_SHORTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getUNSIGNED_SHORTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1530:6: (enumLiteral_4= 'SIGNED_LONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1530:6: (enumLiteral_4= 'SIGNED_LONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1530:8: enumLiteral_4= 'SIGNED_LONG'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_51_in_ruleDataType3403); 

                            current = grammarAccess.getDataTypeAccess().getSIGNED_LONGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getSIGNED_LONGEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1536:6: (enumLiteral_5= 'UNSIGNED_LONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1536:6: (enumLiteral_5= 'UNSIGNED_LONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1536:8: enumLiteral_5= 'UNSIGNED_LONG'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_52_in_ruleDataType3420); 

                            current = grammarAccess.getDataTypeAccess().getUNSIGNED_LONGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getUNSIGNED_LONGEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1542:6: (enumLiteral_6= 'SIGNED_LONG_LONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1542:6: (enumLiteral_6= 'SIGNED_LONG_LONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1542:8: enumLiteral_6= 'SIGNED_LONG_LONG'
                    {
                    enumLiteral_6=(Token)match(input,53,FOLLOW_53_in_ruleDataType3437); 

                            current = grammarAccess.getDataTypeAccess().getSIGNED_LONG_LONGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getSIGNED_LONG_LONGEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1548:6: (enumLiteral_7= 'UNSIGNED_LONG_LONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1548:6: (enumLiteral_7= 'UNSIGNED_LONG_LONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1548:8: enumLiteral_7= 'UNSIGNED_LONG_LONG'
                    {
                    enumLiteral_7=(Token)match(input,54,FOLLOW_54_in_ruleDataType3454); 

                            current = grammarAccess.getDataTypeAccess().getUNSIGNED_LONG_LONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getUNSIGNED_LONG_LONGEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1554:6: (enumLiteral_8= 'FLOAT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1554:6: (enumLiteral_8= 'FLOAT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1554:8: enumLiteral_8= 'FLOAT'
                    {
                    enumLiteral_8=(Token)match(input,55,FOLLOW_55_in_ruleDataType3471); 

                            current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1560:6: (enumLiteral_9= 'DOUBLE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1560:6: (enumLiteral_9= 'DOUBLE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1560:8: enumLiteral_9= 'DOUBLE'
                    {
                    enumLiteral_9=(Token)match(input,56,FOLLOW_56_in_ruleDataType3488); 

                            current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1566:6: (enumLiteral_10= 'LONG_DOUBLE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1566:6: (enumLiteral_10= 'LONG_DOUBLE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1566:8: enumLiteral_10= 'LONG_DOUBLE'
                    {
                    enumLiteral_10=(Token)match(input,57,FOLLOW_57_in_ruleDataType3505); 

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


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\20\uffff";
    static final String DFA12_eofS =
        "\20\uffff";
    static final String DFA12_minS =
        "\1\4\1\27\1\57\13\30\2\uffff";
    static final String DFA12_maxS =
        "\1\4\1\27\1\71\13\34\2\uffff";
    static final String DFA12_acceptS =
        "\16\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\20\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\16\3\uffff\1\17",
            "\1\16\3\uffff\1\17",
            "\1\16\3\uffff\1\17",
            "\1\16\3\uffff\1\17",
            "\1\16\3\uffff\1\17",
            "\1\16\3\uffff\1\17",
            "\1\16\3\uffff\1\17",
            "\1\16\3\uffff\1\17",
            "\1\16\3\uffff\1\17",
            "\1\16\3\uffff\1\17",
            "\1\16\3\uffff\1\17",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "687:1: (this_MeasurementData_0= ruleMeasurementData | this_NonMeasurementData_1= ruleNonMeasurementData )";
        }
    }
 

    public static final BitSet FOLLOW_ruleIdentifiableElement_in_entryRuleIdentifiableElement75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifiableElement85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElement_in_ruleIdentifiableElement132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodingSettings_in_ruleIdentifiableElement159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorDataDescription_in_ruleIdentifiableElement186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdjustment_in_ruleIdentifiableElement213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleIdentifiableElement240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElement_in_entryRuleNamedElement275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedElement285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorInterface_in_ruleNamedElement332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSet_in_ruleNamedElement359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_ruleNamedElement386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorInterface_in_entryRuleSensorInterface421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorInterface431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSensorInterface468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensorInterface485 = new BitSet(new long[]{0x0000000000012020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSensorInterface507 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleSensorInterface526 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSensorInterface538 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSensorInterface550 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSensorInterface567 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSensorInterface586 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleEncodingSettings_in_ruleSensorInterface607 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleSensorDataDescription_in_ruleSensorInterface628 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSensorInterface640 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSensorInterface652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodingSettings_in_entryRuleEncodingSettings688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncodingSettings698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEncodingSettings735 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleCoding_in_ruleEncodingSettings756 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEncodingSettings768 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleEndianness_in_ruleEncodingSettings789 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEncodingSettings801 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEncodingSettings818 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleEncodingSettings836 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEncodingSettings848 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEncodingSettings860 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEncodingSettings877 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEncodingSettings896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorDataDescription_in_entryRuleSensorDataDescription932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorDataDescription942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSensorDataDescription979 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleSensorDataDescription1001 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSensorDataDescription1013 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSensorDataDescription1025 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSensorDataDescription1042 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSensorDataDescription1061 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_ruleDataSet_in_ruleSensorDataDescription1082 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_17_in_ruleSensorDataDescription1095 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSensorDataDescription1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSet_in_entryRuleDataSet1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSet1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDataSet1190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSet1207 = new BitSet(new long[]{0x0000000000012020L});
    public static final BitSet FOLLOW_13_in_ruleDataSet1225 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataSet1237 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataSet1254 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataSet1278 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDataSet1296 = new BitSet(new long[]{0x0000000000420010L});
    public static final BitSet FOLLOW_ruleDataSet_in_ruleDataSet1317 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleData_in_ruleDataSet1339 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleDataSet1352 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataSet1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData1400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementData_in_ruleData1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasurementData_in_ruleData1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementData_in_entryRuleMeasurementData1519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementData1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeasurementData1571 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMeasurementData1588 = new BitSet(new long[]{0x03FF800000000000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleMeasurementData1609 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMeasurementData1621 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_UNIT_in_ruleMeasurementData1638 = new BitSet(new long[]{0x0000000002042020L});
    public static final BitSet FOLLOW_13_in_ruleMeasurementData1656 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMeasurementData1668 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMeasurementData1680 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasurementData1697 = new BitSet(new long[]{0x0000000002040020L});
    public static final BitSet FOLLOW_25_in_ruleMeasurementData1717 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMeasurementData1729 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMeasurementData1741 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_ruleDataAdjustment_in_ruleMeasurementData1762 = new BitSet(new long[]{0x0000000008040020L});
    public static final BitSet FOLLOW_27_in_ruleMeasurementData1775 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_ruleDataAdjustment_in_ruleMeasurementData1796 = new BitSet(new long[]{0x0000000008040020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasurementData1817 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMeasurementData1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasurementData_in_entryRuleNonMeasurementData1871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonMeasurementData1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonMeasurementData1923 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleNonMeasurementData1940 = new BitSet(new long[]{0x03FF800000000000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleNonMeasurementData1961 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNonMeasurementData1973 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleNonMeasurementData1985 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleNonMeasurementData2006 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleNonMeasurementData2018 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleNonMeasurementData2030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasurementData2047 = new BitSet(new long[]{0x0000000000042020L});
    public static final BitSet FOLLOW_13_in_ruleNonMeasurementData2065 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNonMeasurementData2077 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNonMeasurementData2089 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasurementData2106 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasurementData2130 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNonMeasurementData2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdjustment_in_entryRuleDataAdjustment2184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAdjustment2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_ruleDataAdjustment2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConversion_in_ruleDataAdjustment2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_entryRuleDataRange2303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataRange2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDataRange2350 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDataRange2362 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleDataRange2383 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataRange2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_entryRuleInterval2431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterval2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleInterval2487 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInterval2499 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleInterval2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConversion_in_entryRuleDataConversion2556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataConversion2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversion_in_ruleDataConversion2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversion_in_entryRuleLinearDataConversion2646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinearDataConversion2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleLinearDataConversion2694 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleLinearDataConversion2706 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLinearDataConversion2718 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion2739 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleLinearDataConversion2751 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleLinearDataConversion2763 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLinearDataConversion2775 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLinearDataConversion2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleLinearDataConversion2816 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLinearDataConversion2828 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleLinearDataConversion2849 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleLinearDataConversion2861 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleLinearDataConversion2873 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLinearDataConversion2885 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleLinearDataConversion2906 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleLinearDataConversion2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE2956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE3007 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleDOUBLE3026 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN3089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBOOLEAN3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBOOLEAN3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCoding3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCoding3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleEndianness3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEndianness3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDataType3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDataType3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDataType3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDataType3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDataType3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDataType3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDataType3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleDataType3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDataType3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDataType3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleDataType3505 = new BitSet(new long[]{0x0000000000000002L});

}