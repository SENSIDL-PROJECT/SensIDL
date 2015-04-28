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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'options'", "'{'", "'}'", "'transmit'", "','", "'transmission'", "'type'", "':'", "'sensor'", "'language'", "'receiver'", "'push'", "'with'", "'pull'", "'Frequency'", "'timeDivisionMultiplexing'", "'and'", "'Duration'", "'timeSlot'", "'repr'", "'representation'", "'is'", "'by'", "'bytes'", "'byte'", "'calculate'", "'calculated'", "'as'", "'('", "')'", "'group'", "'measurement'", "'of'", "'in'", "'from'", "'to'", "'scaling factor'", "'offset'", "'primitive'", "'constant'", "'.'", "'JAVA'", "'CPP'", "'C'", "'BYTE_ARRAY'", "'FLOW'", "'TEMPERATURE'", "'VOLUME'", "'DURATION'", "'PRESSURE'", "'BYTE'", "'SHORT'", "'INT'", "'LONG'", "'FLOAT'", "'DOUBLE'"
    };
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

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
        	return "DataModel";	
       	}
       	
       	@Override
       	protected SensidlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDataModel"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:68:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:69:2: (iv_ruleDataModel= ruleDataModel EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:70:2: iv_ruleDataModel= ruleDataModel EOF
            {
             newCompositeNode(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel75);
            iv_ruleDataModel=ruleDataModel();

            state._fsp--;

             current =iv_ruleDataModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:77:1: ruleDataModel returns [EObject current=null] : (otherlv_0= 'options' otherlv_1= '{' ( (lv_options_2_0= ruleOptions ) ) otherlv_3= '}' ( ( (lv_representations_4_0= ruleRepresentation ) ) | ( (lv_interpretations_5_0= ruleInterpretation ) ) )* otherlv_6= 'transmit' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_options_2_0 = null;

        EObject lv_representations_4_0 = null;

        EObject lv_interpretations_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:80:28: ( (otherlv_0= 'options' otherlv_1= '{' ( (lv_options_2_0= ruleOptions ) ) otherlv_3= '}' ( ( (lv_representations_4_0= ruleRepresentation ) ) | ( (lv_interpretations_5_0= ruleInterpretation ) ) )* otherlv_6= 'transmit' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:81:1: (otherlv_0= 'options' otherlv_1= '{' ( (lv_options_2_0= ruleOptions ) ) otherlv_3= '}' ( ( (lv_representations_4_0= ruleRepresentation ) ) | ( (lv_interpretations_5_0= ruleInterpretation ) ) )* otherlv_6= 'transmit' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:81:1: (otherlv_0= 'options' otherlv_1= '{' ( (lv_options_2_0= ruleOptions ) ) otherlv_3= '}' ( ( (lv_representations_4_0= ruleRepresentation ) ) | ( (lv_interpretations_5_0= ruleInterpretation ) ) )* otherlv_6= 'transmit' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:81:3: otherlv_0= 'options' otherlv_1= '{' ( (lv_options_2_0= ruleOptions ) ) otherlv_3= '}' ( ( (lv_representations_4_0= ruleRepresentation ) ) | ( (lv_interpretations_5_0= ruleInterpretation ) ) )* otherlv_6= 'transmit' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDataModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getDataModelAccess().getOptionsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleDataModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:89:1: ( (lv_options_2_0= ruleOptions ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:90:1: (lv_options_2_0= ruleOptions )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:90:1: (lv_options_2_0= ruleOptions )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:91:3: lv_options_2_0= ruleOptions
            {
             
            	        newCompositeNode(grammarAccess.getDataModelAccess().getOptionsOptionsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOptions_in_ruleDataModel155);
            lv_options_2_0=ruleOptions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataModelRule());
            	        }
                   		set(
                   			current, 
                   			"options",
                    		lv_options_2_0, 
                    		"Options");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDataModel167); 

                	newLeafNode(otherlv_3, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:111:1: ( ( (lv_representations_4_0= ruleRepresentation ) ) | ( (lv_interpretations_5_0= ruleInterpretation ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=30 && LA1_0<=31)) ) {
                    alt1=1;
                }
                else if ( ((LA1_0>=36 && LA1_0<=37)||(LA1_0>=41 && LA1_0<=42)||(LA1_0>=49 && LA1_0<=50)) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:111:2: ( (lv_representations_4_0= ruleRepresentation ) )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:111:2: ( (lv_representations_4_0= ruleRepresentation ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:112:1: (lv_representations_4_0= ruleRepresentation )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:112:1: (lv_representations_4_0= ruleRepresentation )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:113:3: lv_representations_4_0= ruleRepresentation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataModelAccess().getRepresentationsRepresentationParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRepresentation_in_ruleDataModel189);
            	    lv_representations_4_0=ruleRepresentation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"representations",
            	            		lv_representations_4_0, 
            	            		"Representation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:130:6: ( (lv_interpretations_5_0= ruleInterpretation ) )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:130:6: ( (lv_interpretations_5_0= ruleInterpretation ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:131:1: (lv_interpretations_5_0= ruleInterpretation )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:131:1: (lv_interpretations_5_0= ruleInterpretation )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:132:3: lv_interpretations_5_0= ruleInterpretation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataModelAccess().getInterpretationsInterpretationParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterpretation_in_ruleDataModel216);
            	    lv_interpretations_5_0=ruleInterpretation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"interpretations",
            	            		lv_interpretations_5_0, 
            	            		"Interpretation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleDataModel230); 

                	newLeafNode(otherlv_6, grammarAccess.getDataModelAccess().getTransmitKeyword_5());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:152:1: ( (otherlv_7= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:153:1: (otherlv_7= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:153:1: (otherlv_7= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:154:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataModelRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataModel250); 

            		newLeafNode(otherlv_7, grammarAccess.getDataModelAccess().getTransmitInterpretationCrossReference_6_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:165:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:165:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleDataModel263); 

            	        	newLeafNode(otherlv_8, grammarAccess.getDataModelAccess().getCommaKeyword_7_0());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:169:1: ( (otherlv_9= RULE_ID ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:170:1: (otherlv_9= RULE_ID )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:170:1: (otherlv_9= RULE_ID )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:171:3: otherlv_9= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDataModelRule());
            	    	        }
            	            
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataModel283); 

            	    		newLeafNode(otherlv_9, grammarAccess.getDataModelAccess().getTransmitInterpretationCrossReference_7_1_0()); 
            	    	

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleOptions"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:190:1: entryRuleOptions returns [EObject current=null] : iv_ruleOptions= ruleOptions EOF ;
    public final EObject entryRuleOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptions = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:191:2: (iv_ruleOptions= ruleOptions EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:192:2: iv_ruleOptions= ruleOptions EOF
            {
             newCompositeNode(grammarAccess.getOptionsRule()); 
            pushFollow(FOLLOW_ruleOptions_in_entryRuleOptions321);
            iv_ruleOptions=ruleOptions();

            state._fsp--;

             current =iv_ruleOptions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptions331); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptions"


    // $ANTLR start "ruleOptions"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:199:1: ruleOptions returns [EObject current=null] : ( () ( (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmission ) ) ) | (otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) ) ) | (otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) ) ) )* ) ;
    public final EObject ruleOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_transmissionType_4_0 = null;

        Enumerator lv_sensorLanguage_8_0 = null;

        Enumerator lv_receiverLanguage_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:202:28: ( ( () ( (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmission ) ) ) | (otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) ) ) | (otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) ) ) )* ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:203:1: ( () ( (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmission ) ) ) | (otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) ) ) | (otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) ) ) )* )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:203:1: ( () ( (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmission ) ) ) | (otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) ) ) | (otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) ) ) )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:203:2: () ( (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmission ) ) ) | (otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) ) ) | (otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) ) ) )*
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:203:2: ()
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:204:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOptionsAccess().getOptionsAction_0(),
                        current);
                

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:209:2: ( (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmission ) ) ) | (otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) ) ) | (otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt3=1;
                    }
                    break;
                case 19:
                    {
                    alt3=2;
                    }
                    break;
                case 21:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:209:3: (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmission ) ) )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:209:3: (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmission ) ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:209:5: otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmission ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleOptions379); 

            	        	newLeafNode(otherlv_1, grammarAccess.getOptionsAccess().getTransmissionKeyword_1_0_0());
            	        
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleOptions391); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOptionsAccess().getTypeKeyword_1_0_1());
            	        
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleOptions403); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOptionsAccess().getColonKeyword_1_0_2());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:1: ( (lv_transmissionType_4_0= ruleTransmission ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:222:1: (lv_transmissionType_4_0= ruleTransmission )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:222:1: (lv_transmissionType_4_0= ruleTransmission )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:223:3: lv_transmissionType_4_0= ruleTransmission
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOptionsAccess().getTransmissionTypeTransmissionParserRuleCall_1_0_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransmission_in_ruleOptions424);
            	    lv_transmissionType_4_0=ruleTransmission();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOptionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"transmissionType",
            	            		lv_transmissionType_4_0, 
            	            		"Transmission");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:240:6: (otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) ) )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:240:6: (otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:240:8: otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleOptions444); 

            	        	newLeafNode(otherlv_5, grammarAccess.getOptionsAccess().getSensorKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleOptions456); 

            	        	newLeafNode(otherlv_6, grammarAccess.getOptionsAccess().getLanguageKeyword_1_1_1());
            	        
            	    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleOptions468); 

            	        	newLeafNode(otherlv_7, grammarAccess.getOptionsAccess().getColonKeyword_1_1_2());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:252:1: ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:253:1: (lv_sensorLanguage_8_0= ruleGenerationLanguage )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:253:1: (lv_sensorLanguage_8_0= ruleGenerationLanguage )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:254:3: lv_sensorLanguage_8_0= ruleGenerationLanguage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOptionsAccess().getSensorLanguageGenerationLanguageEnumRuleCall_1_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGenerationLanguage_in_ruleOptions489);
            	    lv_sensorLanguage_8_0=ruleGenerationLanguage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOptionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"sensorLanguage",
            	            		lv_sensorLanguage_8_0, 
            	            		"GenerationLanguage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:271:6: (otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) ) )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:271:6: (otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:271:8: otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) )
            	    {
            	    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleOptions509); 

            	        	newLeafNode(otherlv_9, grammarAccess.getOptionsAccess().getReceiverKeyword_1_2_0());
            	        
            	    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleOptions521); 

            	        	newLeafNode(otherlv_10, grammarAccess.getOptionsAccess().getLanguageKeyword_1_2_1());
            	        
            	    otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleOptions533); 

            	        	newLeafNode(otherlv_11, grammarAccess.getOptionsAccess().getColonKeyword_1_2_2());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:283:1: ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:284:1: (lv_receiverLanguage_12_0= ruleGenerationLanguage )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:284:1: (lv_receiverLanguage_12_0= ruleGenerationLanguage )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:285:3: lv_receiverLanguage_12_0= ruleGenerationLanguage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOptionsAccess().getReceiverLanguageGenerationLanguageEnumRuleCall_1_2_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGenerationLanguage_in_ruleOptions554);
            	    lv_receiverLanguage_12_0=ruleGenerationLanguage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOptionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"receiverLanguage",
            	            		lv_receiverLanguage_12_0, 
            	            		"GenerationLanguage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptions"


    // $ANTLR start "entryRuleTransmission"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:309:1: entryRuleTransmission returns [EObject current=null] : iv_ruleTransmission= ruleTransmission EOF ;
    public final EObject entryRuleTransmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransmission = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:310:2: (iv_ruleTransmission= ruleTransmission EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:311:2: iv_ruleTransmission= ruleTransmission EOF
            {
             newCompositeNode(grammarAccess.getTransmissionRule()); 
            pushFollow(FOLLOW_ruleTransmission_in_entryRuleTransmission593);
            iv_ruleTransmission=ruleTransmission();

            state._fsp--;

             current =iv_ruleTransmission; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransmission603); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransmission"


    // $ANTLR start "ruleTransmission"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:318:1: ruleTransmission returns [EObject current=null] : (this_Pull_0= rulePull | this_Push_1= rulePush ) ;
    public final EObject ruleTransmission() throws RecognitionException {
        EObject current = null;

        EObject this_Pull_0 = null;

        EObject this_Push_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:321:28: ( (this_Pull_0= rulePull | this_Push_1= rulePush ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:322:1: (this_Pull_0= rulePull | this_Push_1= rulePush )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:322:1: (this_Pull_0= rulePull | this_Push_1= rulePush )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24||LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:323:5: this_Pull_0= rulePull
                    {
                     
                            newCompositeNode(grammarAccess.getTransmissionAccess().getPullParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePull_in_ruleTransmission650);
                    this_Pull_0=rulePull();

                    state._fsp--;

                     
                            current = this_Pull_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:333:5: this_Push_1= rulePush
                    {
                     
                            newCompositeNode(grammarAccess.getTransmissionAccess().getPushParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePush_in_ruleTransmission677);
                    this_Push_1=rulePush();

                    state._fsp--;

                     
                            current = this_Push_1; 
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
    // $ANTLR end "ruleTransmission"


    // $ANTLR start "entryRulePush"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:349:1: entryRulePush returns [EObject current=null] : iv_rulePush= rulePush EOF ;
    public final EObject entryRulePush() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePush = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:350:2: (iv_rulePush= rulePush EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:351:2: iv_rulePush= rulePush EOF
            {
             newCompositeNode(grammarAccess.getPushRule()); 
            pushFollow(FOLLOW_rulePush_in_entryRulePush712);
            iv_rulePush=rulePush();

            state._fsp--;

             current =iv_rulePush; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePush722); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePush"


    // $ANTLR start "rulePush"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:358:1: rulePush returns [EObject current=null] : (otherlv_0= 'push' otherlv_1= 'with' ( (lv_methodName_2_0= RULE_ID ) ) ) ;
    public final EObject rulePush() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_methodName_2_0=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:361:28: ( (otherlv_0= 'push' otherlv_1= 'with' ( (lv_methodName_2_0= RULE_ID ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:362:1: (otherlv_0= 'push' otherlv_1= 'with' ( (lv_methodName_2_0= RULE_ID ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:362:1: (otherlv_0= 'push' otherlv_1= 'with' ( (lv_methodName_2_0= RULE_ID ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:362:3: otherlv_0= 'push' otherlv_1= 'with' ( (lv_methodName_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_rulePush759); 

                	newLeafNode(otherlv_0, grammarAccess.getPushAccess().getPushKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_rulePush771); 

                	newLeafNode(otherlv_1, grammarAccess.getPushAccess().getWithKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:370:1: ( (lv_methodName_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:371:1: (lv_methodName_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:371:1: (lv_methodName_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:372:3: lv_methodName_2_0= RULE_ID
            {
            lv_methodName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePush788); 

            			newLeafNode(lv_methodName_2_0, grammarAccess.getPushAccess().getMethodNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPushRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"methodName",
                    		lv_methodName_2_0, 
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
    // $ANTLR end "rulePush"


    // $ANTLR start "entryRulePull"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:396:1: entryRulePull returns [EObject current=null] : iv_rulePull= rulePull EOF ;
    public final EObject entryRulePull() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePull = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:397:2: (iv_rulePull= rulePull EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:398:2: iv_rulePull= rulePull EOF
            {
             newCompositeNode(grammarAccess.getPullRule()); 
            pushFollow(FOLLOW_rulePull_in_entryRulePull829);
            iv_rulePull=rulePull();

            state._fsp--;

             current =iv_rulePull; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePull839); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePull"


    // $ANTLR start "rulePull"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:405:1: rulePull returns [EObject current=null] : (this_TimeDivisionMultiplexing_0= ruleTimeDivisionMultiplexing | (otherlv_1= 'pull' otherlv_2= 'with' otherlv_3= 'Frequency' otherlv_4= ':' ( (lv_frequency_5_0= RULE_INT ) ) ) ) ;
    public final EObject rulePull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_frequency_5_0=null;
        EObject this_TimeDivisionMultiplexing_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:408:28: ( (this_TimeDivisionMultiplexing_0= ruleTimeDivisionMultiplexing | (otherlv_1= 'pull' otherlv_2= 'with' otherlv_3= 'Frequency' otherlv_4= ':' ( (lv_frequency_5_0= RULE_INT ) ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:409:1: (this_TimeDivisionMultiplexing_0= ruleTimeDivisionMultiplexing | (otherlv_1= 'pull' otherlv_2= 'with' otherlv_3= 'Frequency' otherlv_4= ':' ( (lv_frequency_5_0= RULE_INT ) ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:409:1: (this_TimeDivisionMultiplexing_0= ruleTimeDivisionMultiplexing | (otherlv_1= 'pull' otherlv_2= 'with' otherlv_3= 'Frequency' otherlv_4= ':' ( (lv_frequency_5_0= RULE_INT ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:410:5: this_TimeDivisionMultiplexing_0= ruleTimeDivisionMultiplexing
                    {
                     
                            newCompositeNode(grammarAccess.getPullAccess().getTimeDivisionMultiplexingParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTimeDivisionMultiplexing_in_rulePull886);
                    this_TimeDivisionMultiplexing_0=ruleTimeDivisionMultiplexing();

                    state._fsp--;

                     
                            current = this_TimeDivisionMultiplexing_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:419:6: (otherlv_1= 'pull' otherlv_2= 'with' otherlv_3= 'Frequency' otherlv_4= ':' ( (lv_frequency_5_0= RULE_INT ) ) )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:419:6: (otherlv_1= 'pull' otherlv_2= 'with' otherlv_3= 'Frequency' otherlv_4= ':' ( (lv_frequency_5_0= RULE_INT ) ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:419:8: otherlv_1= 'pull' otherlv_2= 'with' otherlv_3= 'Frequency' otherlv_4= ':' ( (lv_frequency_5_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_rulePull904); 

                        	newLeafNode(otherlv_1, grammarAccess.getPullAccess().getPullKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePull916); 

                        	newLeafNode(otherlv_2, grammarAccess.getPullAccess().getWithKeyword_1_1());
                        
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_rulePull928); 

                        	newLeafNode(otherlv_3, grammarAccess.getPullAccess().getFrequencyKeyword_1_2());
                        
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulePull940); 

                        	newLeafNode(otherlv_4, grammarAccess.getPullAccess().getColonKeyword_1_3());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:435:1: ( (lv_frequency_5_0= RULE_INT ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:436:1: (lv_frequency_5_0= RULE_INT )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:436:1: (lv_frequency_5_0= RULE_INT )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:437:3: lv_frequency_5_0= RULE_INT
                    {
                    lv_frequency_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePull957); 

                    			newLeafNode(lv_frequency_5_0, grammarAccess.getPullAccess().getFrequencyINTTerminalRuleCall_1_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPullRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"frequency",
                            		lv_frequency_5_0, 
                            		"INT");
                    	    

                    }


                    }


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
    // $ANTLR end "rulePull"


    // $ANTLR start "entryRuleTimeDivisionMultiplexing"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:461:1: entryRuleTimeDivisionMultiplexing returns [EObject current=null] : iv_ruleTimeDivisionMultiplexing= ruleTimeDivisionMultiplexing EOF ;
    public final EObject entryRuleTimeDivisionMultiplexing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeDivisionMultiplexing = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:462:2: (iv_ruleTimeDivisionMultiplexing= ruleTimeDivisionMultiplexing EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:463:2: iv_ruleTimeDivisionMultiplexing= ruleTimeDivisionMultiplexing EOF
            {
             newCompositeNode(grammarAccess.getTimeDivisionMultiplexingRule()); 
            pushFollow(FOLLOW_ruleTimeDivisionMultiplexing_in_entryRuleTimeDivisionMultiplexing999);
            iv_ruleTimeDivisionMultiplexing=ruleTimeDivisionMultiplexing();

            state._fsp--;

             current =iv_ruleTimeDivisionMultiplexing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeDivisionMultiplexing1009); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeDivisionMultiplexing"


    // $ANTLR start "ruleTimeDivisionMultiplexing"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:470:1: ruleTimeDivisionMultiplexing returns [EObject current=null] : (otherlv_0= 'timeDivisionMultiplexing' otherlv_1= 'with' otherlv_2= 'Frequency' otherlv_3= ':' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'and' otherlv_6= 'Duration' otherlv_7= ':' ( (lv_duration_8_0= ruleDOUBLE ) ) otherlv_9= 'and' otherlv_10= 'timeSlot' otherlv_11= ':' ( (lv_timeSlot_12_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleTimeDivisionMultiplexing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_frequency_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_duration_8_0 = null;

        AntlrDatatypeRuleToken lv_timeSlot_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:473:28: ( (otherlv_0= 'timeDivisionMultiplexing' otherlv_1= 'with' otherlv_2= 'Frequency' otherlv_3= ':' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'and' otherlv_6= 'Duration' otherlv_7= ':' ( (lv_duration_8_0= ruleDOUBLE ) ) otherlv_9= 'and' otherlv_10= 'timeSlot' otherlv_11= ':' ( (lv_timeSlot_12_0= ruleDOUBLE ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:474:1: (otherlv_0= 'timeDivisionMultiplexing' otherlv_1= 'with' otherlv_2= 'Frequency' otherlv_3= ':' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'and' otherlv_6= 'Duration' otherlv_7= ':' ( (lv_duration_8_0= ruleDOUBLE ) ) otherlv_9= 'and' otherlv_10= 'timeSlot' otherlv_11= ':' ( (lv_timeSlot_12_0= ruleDOUBLE ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:474:1: (otherlv_0= 'timeDivisionMultiplexing' otherlv_1= 'with' otherlv_2= 'Frequency' otherlv_3= ':' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'and' otherlv_6= 'Duration' otherlv_7= ':' ( (lv_duration_8_0= ruleDOUBLE ) ) otherlv_9= 'and' otherlv_10= 'timeSlot' otherlv_11= ':' ( (lv_timeSlot_12_0= ruleDOUBLE ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:474:3: otherlv_0= 'timeDivisionMultiplexing' otherlv_1= 'with' otherlv_2= 'Frequency' otherlv_3= ':' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'and' otherlv_6= 'Duration' otherlv_7= ':' ( (lv_duration_8_0= ruleDOUBLE ) ) otherlv_9= 'and' otherlv_10= 'timeSlot' otherlv_11= ':' ( (lv_timeSlot_12_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleTimeDivisionMultiplexing1046); 

                	newLeafNode(otherlv_0, grammarAccess.getTimeDivisionMultiplexingAccess().getTimeDivisionMultiplexingKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleTimeDivisionMultiplexing1058); 

                	newLeafNode(otherlv_1, grammarAccess.getTimeDivisionMultiplexingAccess().getWithKeyword_1());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleTimeDivisionMultiplexing1070); 

                	newLeafNode(otherlv_2, grammarAccess.getTimeDivisionMultiplexingAccess().getFrequencyKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleTimeDivisionMultiplexing1082); 

                	newLeafNode(otherlv_3, grammarAccess.getTimeDivisionMultiplexingAccess().getColonKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:490:1: ( (lv_frequency_4_0= RULE_INT ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:491:1: (lv_frequency_4_0= RULE_INT )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:491:1: (lv_frequency_4_0= RULE_INT )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:492:3: lv_frequency_4_0= RULE_INT
            {
            lv_frequency_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeDivisionMultiplexing1099); 

            			newLeafNode(lv_frequency_4_0, grammarAccess.getTimeDivisionMultiplexingAccess().getFrequencyINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeDivisionMultiplexingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"frequency",
                    		lv_frequency_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleTimeDivisionMultiplexing1116); 

                	newLeafNode(otherlv_5, grammarAccess.getTimeDivisionMultiplexingAccess().getAndKeyword_5());
                
            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleTimeDivisionMultiplexing1128); 

                	newLeafNode(otherlv_6, grammarAccess.getTimeDivisionMultiplexingAccess().getDurationKeyword_6());
                
            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleTimeDivisionMultiplexing1140); 

                	newLeafNode(otherlv_7, grammarAccess.getTimeDivisionMultiplexingAccess().getColonKeyword_7());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:520:1: ( (lv_duration_8_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:521:1: (lv_duration_8_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:521:1: (lv_duration_8_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:522:3: lv_duration_8_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getTimeDivisionMultiplexingAccess().getDurationDOUBLEParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleTimeDivisionMultiplexing1161);
            lv_duration_8_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeDivisionMultiplexingRule());
            	        }
                   		set(
                   			current, 
                   			"duration",
                    		lv_duration_8_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleTimeDivisionMultiplexing1173); 

                	newLeafNode(otherlv_9, grammarAccess.getTimeDivisionMultiplexingAccess().getAndKeyword_9());
                
            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleTimeDivisionMultiplexing1185); 

                	newLeafNode(otherlv_10, grammarAccess.getTimeDivisionMultiplexingAccess().getTimeSlotKeyword_10());
                
            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleTimeDivisionMultiplexing1197); 

                	newLeafNode(otherlv_11, grammarAccess.getTimeDivisionMultiplexingAccess().getColonKeyword_11());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:550:1: ( (lv_timeSlot_12_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:551:1: (lv_timeSlot_12_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:551:1: (lv_timeSlot_12_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:552:3: lv_timeSlot_12_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getTimeDivisionMultiplexingAccess().getTimeSlotDOUBLEParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleTimeDivisionMultiplexing1218);
            lv_timeSlot_12_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeDivisionMultiplexingRule());
            	        }
                   		set(
                   			current, 
                   			"timeSlot",
                    		lv_timeSlot_12_0, 
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
    // $ANTLR end "ruleTimeDivisionMultiplexing"


    // $ANTLR start "entryRuleRepresentation"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:576:1: entryRuleRepresentation returns [EObject current=null] : iv_ruleRepresentation= ruleRepresentation EOF ;
    public final EObject entryRuleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepresentation = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:577:2: (iv_ruleRepresentation= ruleRepresentation EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:578:2: iv_ruleRepresentation= ruleRepresentation EOF
            {
             newCompositeNode(grammarAccess.getRepresentationRule()); 
            pushFollow(FOLLOW_ruleRepresentation_in_entryRuleRepresentation1254);
            iv_ruleRepresentation=ruleRepresentation();

            state._fsp--;

             current =iv_ruleRepresentation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepresentation1264); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepresentation"


    // $ANTLR start "ruleRepresentation"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:585:1: ruleRepresentation returns [EObject current=null] : ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'by' ( (lv_byteCount_6_0= RULE_INT ) ) (otherlv_7= 'bytes' | otherlv_8= 'byte' ) ) ;
    public final EObject ruleRepresentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_byteCount_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:588:28: ( ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'by' ( (lv_byteCount_6_0= RULE_INT ) ) (otherlv_7= 'bytes' | otherlv_8= 'byte' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:589:1: ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'by' ( (lv_byteCount_6_0= RULE_INT ) ) (otherlv_7= 'bytes' | otherlv_8= 'byte' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:589:1: ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'by' ( (lv_byteCount_6_0= RULE_INT ) ) (otherlv_7= 'bytes' | otherlv_8= 'byte' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:589:2: (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'by' ( (lv_byteCount_6_0= RULE_INT ) ) (otherlv_7= 'bytes' | otherlv_8= 'byte' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:589:2: (otherlv_0= 'repr' | otherlv_1= 'representation' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:589:4: otherlv_0= 'repr'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleRepresentation1302); 

                        	newLeafNode(otherlv_0, grammarAccess.getRepresentationAccess().getReprKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:594:7: otherlv_1= 'representation'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleRepresentation1320); 

                        	newLeafNode(otherlv_1, grammarAccess.getRepresentationAccess().getRepresentationKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:598:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:599:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:599:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:600:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepresentation1338); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRepresentationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRepresentationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleRepresentation1355); 

                	newLeafNode(otherlv_3, grammarAccess.getRepresentationAccess().getIsKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:620:1: ( (lv_type_4_0= ruleType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:621:1: (lv_type_4_0= ruleType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:621:1: (lv_type_4_0= ruleType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:622:3: lv_type_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getRepresentationAccess().getTypeTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleRepresentation1376);
            lv_type_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepresentationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleRepresentation1388); 

                	newLeafNode(otherlv_5, grammarAccess.getRepresentationAccess().getByKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:642:1: ( (lv_byteCount_6_0= RULE_INT ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:643:1: (lv_byteCount_6_0= RULE_INT )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:643:1: (lv_byteCount_6_0= RULE_INT )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:644:3: lv_byteCount_6_0= RULE_INT
            {
            lv_byteCount_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepresentation1405); 

            			newLeafNode(lv_byteCount_6_0, grammarAccess.getRepresentationAccess().getByteCountINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRepresentationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"byteCount",
                    		lv_byteCount_6_0, 
                    		"INT");
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:660:2: (otherlv_7= 'bytes' | otherlv_8= 'byte' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            else if ( (LA7_0==35) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:660:4: otherlv_7= 'bytes'
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleRepresentation1423); 

                        	newLeafNode(otherlv_7, grammarAccess.getRepresentationAccess().getBytesKeyword_6_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:665:7: otherlv_8= 'byte'
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_35_in_ruleRepresentation1441); 

                        	newLeafNode(otherlv_8, grammarAccess.getRepresentationAccess().getByteKeyword_6_1());
                        

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
    // $ANTLR end "ruleRepresentation"


    // $ANTLR start "entryRuleInterpretation"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:677:1: entryRuleInterpretation returns [EObject current=null] : iv_ruleInterpretation= ruleInterpretation EOF ;
    public final EObject entryRuleInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterpretation = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:678:2: (iv_ruleInterpretation= ruleInterpretation EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:679:2: iv_ruleInterpretation= ruleInterpretation EOF
            {
             newCompositeNode(grammarAccess.getInterpretationRule()); 
            pushFollow(FOLLOW_ruleInterpretation_in_entryRuleInterpretation1478);
            iv_ruleInterpretation=ruleInterpretation();

            state._fsp--;

             current =iv_ruleInterpretation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterpretation1488); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterpretation"


    // $ANTLR start "ruleInterpretation"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:686:1: ruleInterpretation returns [EObject current=null] : (this_Constant_0= ruleConstant | this_PrimitiveInterpretation_1= rulePrimitiveInterpretation | this_Measurement_2= ruleMeasurement | this_InterpretationGroup_3= ruleInterpretationGroup | this_Calculated_4= ruleCalculated ) ;
    public final EObject ruleInterpretation() throws RecognitionException {
        EObject current = null;

        EObject this_Constant_0 = null;

        EObject this_PrimitiveInterpretation_1 = null;

        EObject this_Measurement_2 = null;

        EObject this_InterpretationGroup_3 = null;

        EObject this_Calculated_4 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:689:28: ( (this_Constant_0= ruleConstant | this_PrimitiveInterpretation_1= rulePrimitiveInterpretation | this_Measurement_2= ruleMeasurement | this_InterpretationGroup_3= ruleInterpretationGroup | this_Calculated_4= ruleCalculated ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:690:1: (this_Constant_0= ruleConstant | this_PrimitiveInterpretation_1= rulePrimitiveInterpretation | this_Measurement_2= ruleMeasurement | this_InterpretationGroup_3= ruleInterpretationGroup | this_Calculated_4= ruleCalculated )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:690:1: (this_Constant_0= ruleConstant | this_PrimitiveInterpretation_1= rulePrimitiveInterpretation | this_Measurement_2= ruleMeasurement | this_InterpretationGroup_3= ruleInterpretationGroup | this_Calculated_4= ruleCalculated )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt8=1;
                }
                break;
            case 49:
                {
                alt8=2;
                }
                break;
            case 42:
                {
                alt8=3;
                }
                break;
            case 41:
                {
                alt8=4;
                }
                break;
            case 36:
            case 37:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:691:5: this_Constant_0= ruleConstant
                    {
                     
                            newCompositeNode(grammarAccess.getInterpretationAccess().getConstantParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConstant_in_ruleInterpretation1535);
                    this_Constant_0=ruleConstant();

                    state._fsp--;

                     
                            current = this_Constant_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:701:5: this_PrimitiveInterpretation_1= rulePrimitiveInterpretation
                    {
                     
                            newCompositeNode(grammarAccess.getInterpretationAccess().getPrimitiveInterpretationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveInterpretation_in_ruleInterpretation1562);
                    this_PrimitiveInterpretation_1=rulePrimitiveInterpretation();

                    state._fsp--;

                     
                            current = this_PrimitiveInterpretation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:711:5: this_Measurement_2= ruleMeasurement
                    {
                     
                            newCompositeNode(grammarAccess.getInterpretationAccess().getMeasurementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMeasurement_in_ruleInterpretation1589);
                    this_Measurement_2=ruleMeasurement();

                    state._fsp--;

                     
                            current = this_Measurement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:721:5: this_InterpretationGroup_3= ruleInterpretationGroup
                    {
                     
                            newCompositeNode(grammarAccess.getInterpretationAccess().getInterpretationGroupParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInterpretationGroup_in_ruleInterpretation1616);
                    this_InterpretationGroup_3=ruleInterpretationGroup();

                    state._fsp--;

                     
                            current = this_InterpretationGroup_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:731:5: this_Calculated_4= ruleCalculated
                    {
                     
                            newCompositeNode(grammarAccess.getInterpretationAccess().getCalculatedParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCalculated_in_ruleInterpretation1643);
                    this_Calculated_4=ruleCalculated();

                    state._fsp--;

                     
                            current = this_Calculated_4; 
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
    // $ANTLR end "ruleInterpretation"


    // $ANTLR start "entryRuleCalculated"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:747:1: entryRuleCalculated returns [EObject current=null] : iv_ruleCalculated= ruleCalculated EOF ;
    public final EObject entryRuleCalculated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculated = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:748:2: (iv_ruleCalculated= ruleCalculated EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:749:2: iv_ruleCalculated= ruleCalculated EOF
            {
             newCompositeNode(grammarAccess.getCalculatedRule()); 
            pushFollow(FOLLOW_ruleCalculated_in_entryRuleCalculated1678);
            iv_ruleCalculated=ruleCalculated();

            state._fsp--;

             current =iv_ruleCalculated; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalculated1688); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalculated"


    // $ANTLR start "ruleCalculated"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:756:1: ruleCalculated returns [EObject current=null] : ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* ) ;
    public final EObject ruleCalculated() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_methodName_6_0=null;
        Token otherlv_7=null;
        Token lv_methodNameOut_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_parameter_10_0 = null;

        EObject lv_parameter_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:759:28: ( ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:760:1: ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:760:1: ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:760:2: (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )*
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:760:2: (otherlv_0= 'calculate' | otherlv_1= 'calculated' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            else if ( (LA9_0==37) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:760:4: otherlv_0= 'calculate'
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleCalculated1726); 

                        	newLeafNode(otherlv_0, grammarAccess.getCalculatedAccess().getCalculateKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:765:7: otherlv_1= 'calculated'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleCalculated1744); 

                        	newLeafNode(otherlv_1, grammarAccess.getCalculatedAccess().getCalculatedKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:769:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:770:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:770:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:771:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated1762); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCalculatedAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalculatedRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleCalculated1779); 

                	newLeafNode(otherlv_3, grammarAccess.getCalculatedAccess().getAsKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:791:1: ( (otherlv_4= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:792:1: (otherlv_4= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:792:1: (otherlv_4= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:793:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCalculatedRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated1799); 

            		newLeafNode(otherlv_4, grammarAccess.getCalculatedAccess().getRepresentationRepresentationCrossReference_3_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleCalculated1811); 

                	newLeafNode(otherlv_5, grammarAccess.getCalculatedAccess().getByKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:808:1: ( (lv_methodName_6_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:809:1: (lv_methodName_6_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:809:1: (lv_methodName_6_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:810:3: lv_methodName_6_0= RULE_ID
            {
            lv_methodName_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated1828); 

            			newLeafNode(lv_methodName_6_0, grammarAccess.getCalculatedAccess().getMethodNameIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalculatedRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"methodName",
                    		lv_methodName_6_0, 
                    		"ID");
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:826:2: (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:826:4: otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCalculated1846); 

                        	newLeafNode(otherlv_7, grammarAccess.getCalculatedAccess().getCommaKeyword_6_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:830:1: ( (lv_methodNameOut_8_0= RULE_ID ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:831:1: (lv_methodNameOut_8_0= RULE_ID )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:831:1: (lv_methodNameOut_8_0= RULE_ID )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:832:3: lv_methodNameOut_8_0= RULE_ID
                    {
                    lv_methodNameOut_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated1863); 

                    			newLeafNode(lv_methodNameOut_8_0, grammarAccess.getCalculatedAccess().getMethodNameOutIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCalculatedRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"methodNameOut",
                            		lv_methodNameOut_8_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleCalculated1882); 

                	newLeafNode(otherlv_9, grammarAccess.getCalculatedAccess().getWithKeyword_7());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:852:1: ( (lv_parameter_10_0= ruleParameter ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:853:1: (lv_parameter_10_0= ruleParameter )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:853:1: (lv_parameter_10_0= ruleParameter )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:854:3: lv_parameter_10_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleCalculated1903);
            lv_parameter_10_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCalculatedRule());
            	        }
                   		add(
                   			current, 
                   			"parameter",
                    		lv_parameter_10_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:870:2: (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:870:4: otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) )
            	    {
            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleCalculated1916); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCalculatedAccess().getCommaKeyword_9_0());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:874:1: ( (lv_parameter_12_0= ruleParameter ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:875:1: (lv_parameter_12_0= ruleParameter )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:875:1: (lv_parameter_12_0= ruleParameter )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:876:3: lv_parameter_12_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleCalculated1937);
            	    lv_parameter_12_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCalculatedRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameter",
            	            		lv_parameter_12_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalculated"


    // $ANTLR start "entryRuleParameter"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:900:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:901:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:902:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1975);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1985); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:909:1: ruleParameter returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_argumentType_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:912:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:913:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:913:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:913:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleParameter2022); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:917:1: ( (otherlv_1= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:918:1: (otherlv_1= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:918:1: (otherlv_1= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:919:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2042); 

            		newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getInterpretationInterpretationCrossReference_1_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:930:2: (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:930:4: otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleParameter2055); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getAsKeyword_2_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:934:1: ( (lv_argumentType_3_0= ruleArgumentType ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:935:1: (lv_argumentType_3_0= ruleArgumentType )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:935:1: (lv_argumentType_3_0= ruleArgumentType )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:936:3: lv_argumentType_3_0= ruleArgumentType
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getArgumentTypeArgumentTypeEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgumentType_in_ruleParameter2076);
                    lv_argumentType_3_0=ruleArgumentType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"argumentType",
                            		lv_argumentType_3_0, 
                            		"ArgumentType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleParameter2090); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleInterpretationGroup"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:964:1: entryRuleInterpretationGroup returns [EObject current=null] : iv_ruleInterpretationGroup= ruleInterpretationGroup EOF ;
    public final EObject entryRuleInterpretationGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterpretationGroup = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:965:2: (iv_ruleInterpretationGroup= ruleInterpretationGroup EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:966:2: iv_ruleInterpretationGroup= ruleInterpretationGroup EOF
            {
             newCompositeNode(grammarAccess.getInterpretationGroupRule()); 
            pushFollow(FOLLOW_ruleInterpretationGroup_in_entryRuleInterpretationGroup2126);
            iv_ruleInterpretationGroup=ruleInterpretationGroup();

            state._fsp--;

             current =iv_ruleInterpretationGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterpretationGroup2136); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterpretationGroup"


    // $ANTLR start "ruleInterpretationGroup"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:973:1: ruleInterpretationGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interpretations_3_0= ruleInterpretation ) )* otherlv_4= '}' ) ;
    public final EObject ruleInterpretationGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_interpretations_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:976:28: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interpretations_3_0= ruleInterpretation ) )* otherlv_4= '}' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:977:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interpretations_3_0= ruleInterpretation ) )* otherlv_4= '}' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:977:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interpretations_3_0= ruleInterpretation ) )* otherlv_4= '}' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:977:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interpretations_3_0= ruleInterpretation ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleInterpretationGroup2173); 

                	newLeafNode(otherlv_0, grammarAccess.getInterpretationGroupAccess().getGroupKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:981:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:982:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:982:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:983:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterpretationGroup2190); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInterpretationGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterpretationGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInterpretationGroup2207); 

                	newLeafNode(otherlv_2, grammarAccess.getInterpretationGroupAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1003:1: ( (lv_interpretations_3_0= ruleInterpretation ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=36 && LA13_0<=37)||(LA13_0>=41 && LA13_0<=42)||(LA13_0>=49 && LA13_0<=50)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1004:1: (lv_interpretations_3_0= ruleInterpretation )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1004:1: (lv_interpretations_3_0= ruleInterpretation )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1005:3: lv_interpretations_3_0= ruleInterpretation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterpretationGroupAccess().getInterpretationsInterpretationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterpretation_in_ruleInterpretationGroup2228);
            	    lv_interpretations_3_0=ruleInterpretation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterpretationGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"interpretations",
            	            		lv_interpretations_3_0, 
            	            		"Interpretation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleInterpretationGroup2241); 

                	newLeafNode(otherlv_4, grammarAccess.getInterpretationGroupAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterpretationGroup"


    // $ANTLR start "entryRuleMeasurement"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1033:1: entryRuleMeasurement returns [EObject current=null] : iv_ruleMeasurement= ruleMeasurement EOF ;
    public final EObject entryRuleMeasurement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurement = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1034:2: (iv_ruleMeasurement= ruleMeasurement EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1035:2: iv_ruleMeasurement= ruleMeasurement EOF
            {
             newCompositeNode(grammarAccess.getMeasurementRule()); 
            pushFollow(FOLLOW_ruleMeasurement_in_entryRuleMeasurement2277);
            iv_ruleMeasurement=ruleMeasurement();

            state._fsp--;

             current =iv_ruleMeasurement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurement2287); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasurement"


    // $ANTLR start "ruleMeasurement"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1042:1: ruleMeasurement returns [EObject current=null] : (otherlv_0= 'measurement' otherlv_1= 'of' ( (lv_quantity_2_0= ruleQuantity ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_scale_5_0= ruleDOUBLE ) )? ( (lv_unit_6_0= RULE_STRING ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ( (lv_constraints_9_0= ruleMeasurementConstraint ) )* ) ;
    public final EObject ruleMeasurement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_unit_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_quantity_2_0 = null;

        AntlrDatatypeRuleToken lv_scale_5_0 = null;

        EObject lv_constraints_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1045:28: ( (otherlv_0= 'measurement' otherlv_1= 'of' ( (lv_quantity_2_0= ruleQuantity ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_scale_5_0= ruleDOUBLE ) )? ( (lv_unit_6_0= RULE_STRING ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ( (lv_constraints_9_0= ruleMeasurementConstraint ) )* ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1046:1: (otherlv_0= 'measurement' otherlv_1= 'of' ( (lv_quantity_2_0= ruleQuantity ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_scale_5_0= ruleDOUBLE ) )? ( (lv_unit_6_0= RULE_STRING ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ( (lv_constraints_9_0= ruleMeasurementConstraint ) )* )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1046:1: (otherlv_0= 'measurement' otherlv_1= 'of' ( (lv_quantity_2_0= ruleQuantity ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_scale_5_0= ruleDOUBLE ) )? ( (lv_unit_6_0= RULE_STRING ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ( (lv_constraints_9_0= ruleMeasurementConstraint ) )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1046:3: otherlv_0= 'measurement' otherlv_1= 'of' ( (lv_quantity_2_0= ruleQuantity ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_scale_5_0= ruleDOUBLE ) )? ( (lv_unit_6_0= RULE_STRING ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ( (lv_constraints_9_0= ruleMeasurementConstraint ) )*
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleMeasurement2324); 

                	newLeafNode(otherlv_0, grammarAccess.getMeasurementAccess().getMeasurementKeyword_0());
                
            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleMeasurement2336); 

                	newLeafNode(otherlv_1, grammarAccess.getMeasurementAccess().getOfKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1054:1: ( (lv_quantity_2_0= ruleQuantity ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1055:1: (lv_quantity_2_0= ruleQuantity )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1055:1: (lv_quantity_2_0= ruleQuantity )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1056:3: lv_quantity_2_0= ruleQuantity
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementAccess().getQuantityQuantityEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQuantity_in_ruleMeasurement2357);
            lv_quantity_2_0=ruleQuantity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasurementRule());
            	        }
                   		set(
                   			current, 
                   			"quantity",
                    		lv_quantity_2_0, 
                    		"Quantity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1072:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1073:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1073:1: (lv_name_3_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1074:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeasurement2374); 

            			newLeafNode(lv_name_3_0, grammarAccess.getMeasurementAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasurementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleMeasurement2391); 

                	newLeafNode(otherlv_4, grammarAccess.getMeasurementAccess().getInKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1094:1: ( (lv_scale_5_0= ruleDOUBLE ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1095:1: (lv_scale_5_0= ruleDOUBLE )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1095:1: (lv_scale_5_0= ruleDOUBLE )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1096:3: lv_scale_5_0= ruleDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementAccess().getScaleDOUBLEParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOUBLE_in_ruleMeasurement2412);
                    lv_scale_5_0=ruleDOUBLE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementRule());
                    	        }
                           		set(
                           			current, 
                           			"scale",
                            		lv_scale_5_0, 
                            		"DOUBLE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1112:3: ( (lv_unit_6_0= RULE_STRING ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1113:1: (lv_unit_6_0= RULE_STRING )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1113:1: (lv_unit_6_0= RULE_STRING )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1114:3: lv_unit_6_0= RULE_STRING
            {
            lv_unit_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasurement2430); 

            			newLeafNode(lv_unit_6_0, grammarAccess.getMeasurementAccess().getUnitSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasurementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"unit",
                    		lv_unit_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleMeasurement2447); 

                	newLeafNode(otherlv_7, grammarAccess.getMeasurementAccess().getAsKeyword_7());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1134:1: ( (otherlv_8= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1135:1: (otherlv_8= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1135:1: (otherlv_8= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1136:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasurementRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeasurement2467); 

            		newLeafNode(otherlv_8, grammarAccess.getMeasurementAccess().getRepresentationRepresentationCrossReference_8_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1147:2: ( (lv_constraints_9_0= ruleMeasurementConstraint ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23||LA15_0==45) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1148:1: (lv_constraints_9_0= ruleMeasurementConstraint )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1148:1: (lv_constraints_9_0= ruleMeasurementConstraint )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1149:3: lv_constraints_9_0= ruleMeasurementConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMeasurementAccess().getConstraintsMeasurementConstraintParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMeasurementConstraint_in_ruleMeasurement2488);
            	    lv_constraints_9_0=ruleMeasurementConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMeasurementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_9_0, 
            	            		"MeasurementConstraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleMeasurement"


    // $ANTLR start "entryRuleMeasurementConstraint"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1173:1: entryRuleMeasurementConstraint returns [EObject current=null] : iv_ruleMeasurementConstraint= ruleMeasurementConstraint EOF ;
    public final EObject entryRuleMeasurementConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementConstraint = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1174:2: (iv_ruleMeasurementConstraint= ruleMeasurementConstraint EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1175:2: iv_ruleMeasurementConstraint= ruleMeasurementConstraint EOF
            {
             newCompositeNode(grammarAccess.getMeasurementConstraintRule()); 
            pushFollow(FOLLOW_ruleMeasurementConstraint_in_entryRuleMeasurementConstraint2525);
            iv_ruleMeasurementConstraint=ruleMeasurementConstraint();

            state._fsp--;

             current =iv_ruleMeasurementConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementConstraint2535); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasurementConstraint"


    // $ANTLR start "ruleMeasurementConstraint"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1182:1: ruleMeasurementConstraint returns [EObject current=null] : (this_MeasurementInRange_0= ruleMeasurementInRange | this_MeasurementAdaption_1= ruleMeasurementAdaption ) ;
    public final EObject ruleMeasurementConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_MeasurementInRange_0 = null;

        EObject this_MeasurementAdaption_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1185:28: ( (this_MeasurementInRange_0= ruleMeasurementInRange | this_MeasurementAdaption_1= ruleMeasurementAdaption ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1186:1: (this_MeasurementInRange_0= ruleMeasurementInRange | this_MeasurementAdaption_1= ruleMeasurementAdaption )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1186:1: (this_MeasurementInRange_0= ruleMeasurementInRange | this_MeasurementAdaption_1= ruleMeasurementAdaption )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            else if ( (LA16_0==23) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1187:5: this_MeasurementInRange_0= ruleMeasurementInRange
                    {
                     
                            newCompositeNode(grammarAccess.getMeasurementConstraintAccess().getMeasurementInRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMeasurementInRange_in_ruleMeasurementConstraint2582);
                    this_MeasurementInRange_0=ruleMeasurementInRange();

                    state._fsp--;

                     
                            current = this_MeasurementInRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1197:5: this_MeasurementAdaption_1= ruleMeasurementAdaption
                    {
                     
                            newCompositeNode(grammarAccess.getMeasurementConstraintAccess().getMeasurementAdaptionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMeasurementAdaption_in_ruleMeasurementConstraint2609);
                    this_MeasurementAdaption_1=ruleMeasurementAdaption();

                    state._fsp--;

                     
                            current = this_MeasurementAdaption_1; 
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
    // $ANTLR end "ruleMeasurementConstraint"


    // $ANTLR start "entryRuleMeasurementInRange"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1213:1: entryRuleMeasurementInRange returns [EObject current=null] : iv_ruleMeasurementInRange= ruleMeasurementInRange EOF ;
    public final EObject entryRuleMeasurementInRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementInRange = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1214:2: (iv_ruleMeasurementInRange= ruleMeasurementInRange EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1215:2: iv_ruleMeasurementInRange= ruleMeasurementInRange EOF
            {
             newCompositeNode(grammarAccess.getMeasurementInRangeRule()); 
            pushFollow(FOLLOW_ruleMeasurementInRange_in_entryRuleMeasurementInRange2644);
            iv_ruleMeasurementInRange=ruleMeasurementInRange();

            state._fsp--;

             current =iv_ruleMeasurementInRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementInRange2654); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasurementInRange"


    // $ANTLR start "ruleMeasurementInRange"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1222:1: ruleMeasurementInRange returns [EObject current=null] : (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleMeasure ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleMeasure ) ) ) ;
    public final EObject ruleMeasurementInRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lowerBound_1_0 = null;

        EObject lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1225:28: ( (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleMeasure ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleMeasure ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1226:1: (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleMeasure ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleMeasure ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1226:1: (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleMeasure ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleMeasure ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1226:3: otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleMeasure ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleMeasure ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleMeasurementInRange2691); 

                	newLeafNode(otherlv_0, grammarAccess.getMeasurementInRangeAccess().getFromKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1230:1: ( (lv_lowerBound_1_0= ruleMeasure ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1231:1: (lv_lowerBound_1_0= ruleMeasure )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1231:1: (lv_lowerBound_1_0= ruleMeasure )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1232:3: lv_lowerBound_1_0= ruleMeasure
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementInRangeAccess().getLowerBoundMeasureParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMeasure_in_ruleMeasurementInRange2712);
            lv_lowerBound_1_0=ruleMeasure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasurementInRangeRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_1_0, 
                    		"Measure");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleMeasurementInRange2724); 

                	newLeafNode(otherlv_2, grammarAccess.getMeasurementInRangeAccess().getToKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1252:1: ( (lv_upperBound_3_0= ruleMeasure ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1253:1: (lv_upperBound_3_0= ruleMeasure )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1253:1: (lv_upperBound_3_0= ruleMeasure )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1254:3: lv_upperBound_3_0= ruleMeasure
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementInRangeAccess().getUpperBoundMeasureParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMeasure_in_ruleMeasurementInRange2745);
            lv_upperBound_3_0=ruleMeasure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasurementInRangeRule());
            	        }
                   		set(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_3_0, 
                    		"Measure");
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
    // $ANTLR end "ruleMeasurementInRange"


    // $ANTLR start "entryRuleMeasurementAdaption"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1278:1: entryRuleMeasurementAdaption returns [EObject current=null] : iv_ruleMeasurementAdaption= ruleMeasurementAdaption EOF ;
    public final EObject entryRuleMeasurementAdaption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementAdaption = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1279:2: (iv_ruleMeasurementAdaption= ruleMeasurementAdaption EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1280:2: iv_ruleMeasurementAdaption= ruleMeasurementAdaption EOF
            {
             newCompositeNode(grammarAccess.getMeasurementAdaptionRule()); 
            pushFollow(FOLLOW_ruleMeasurementAdaption_in_entryRuleMeasurementAdaption2781);
            iv_ruleMeasurementAdaption=ruleMeasurementAdaption();

            state._fsp--;

             current =iv_ruleMeasurementAdaption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementAdaption2791); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasurementAdaption"


    // $ANTLR start "ruleMeasurementAdaption"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1287:1: ruleMeasurementAdaption returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleMeasurementAdaption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_scalingFactor_3_0 = null;

        AntlrDatatypeRuleToken lv_offset_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1290:28: ( (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1291:1: (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1291:1: (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1291:3: otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleMeasurementAdaption2828); 

                	newLeafNode(otherlv_0, grammarAccess.getMeasurementAdaptionAccess().getWithKeyword_0());
                
            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleMeasurementAdaption2840); 

                	newLeafNode(otherlv_1, grammarAccess.getMeasurementAdaptionAccess().getScalingFactorKeyword_1());
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMeasurementAdaption2852); 

                	newLeafNode(otherlv_2, grammarAccess.getMeasurementAdaptionAccess().getColonKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1303:1: ( (lv_scalingFactor_3_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1304:1: (lv_scalingFactor_3_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1304:1: (lv_scalingFactor_3_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1305:3: lv_scalingFactor_3_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementAdaptionAccess().getScalingFactorDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleMeasurementAdaption2873);
            lv_scalingFactor_3_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasurementAdaptionRule());
            	        }
                   		set(
                   			current, 
                   			"scalingFactor",
                    		lv_scalingFactor_3_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleMeasurementAdaption2885); 

                	newLeafNode(otherlv_4, grammarAccess.getMeasurementAdaptionAccess().getAndKeyword_4());
                
            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleMeasurementAdaption2897); 

                	newLeafNode(otherlv_5, grammarAccess.getMeasurementAdaptionAccess().getOffsetKeyword_5());
                
            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleMeasurementAdaption2909); 

                	newLeafNode(otherlv_6, grammarAccess.getMeasurementAdaptionAccess().getColonKeyword_6());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1333:1: ( (lv_offset_7_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1334:1: (lv_offset_7_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1334:1: (lv_offset_7_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1335:3: lv_offset_7_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementAdaptionAccess().getOffsetDOUBLEParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleMeasurementAdaption2930);
            lv_offset_7_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasurementAdaptionRule());
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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasurementAdaption"


    // $ANTLR start "entryRuleMeasure"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1359:1: entryRuleMeasure returns [EObject current=null] : iv_ruleMeasure= ruleMeasure EOF ;
    public final EObject entryRuleMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasure = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1360:2: (iv_ruleMeasure= ruleMeasure EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1361:2: iv_ruleMeasure= ruleMeasure EOF
            {
             newCompositeNode(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_ruleMeasure_in_entryRuleMeasure2966);
            iv_ruleMeasure=ruleMeasure();

            state._fsp--;

             current =iv_ruleMeasure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasure2976); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasure"


    // $ANTLR start "ruleMeasure"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1368:1: ruleMeasure returns [EObject current=null] : ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        Token lv_unit_1_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1371:28: ( ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1372:1: ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1372:1: ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1372:2: ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1372:2: ( (lv_value_0_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1373:1: (lv_value_0_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1373:1: (lv_value_0_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1374:3: lv_value_0_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getMeasureAccess().getValueDOUBLEParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleMeasure3022);
            lv_value_0_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasureRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1390:2: ( (lv_unit_1_0= RULE_STRING ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1391:1: (lv_unit_1_0= RULE_STRING )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1391:1: (lv_unit_1_0= RULE_STRING )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1392:3: lv_unit_1_0= RULE_STRING
            {
            lv_unit_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasure3039); 

            			newLeafNode(lv_unit_1_0, grammarAccess.getMeasureAccess().getUnitSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"unit",
                    		lv_unit_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleMeasure"


    // $ANTLR start "entryRulePrimitiveInterpretation"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1416:1: entryRulePrimitiveInterpretation returns [EObject current=null] : iv_rulePrimitiveInterpretation= rulePrimitiveInterpretation EOF ;
    public final EObject entryRulePrimitiveInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveInterpretation = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1417:2: (iv_rulePrimitiveInterpretation= rulePrimitiveInterpretation EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1418:2: iv_rulePrimitiveInterpretation= rulePrimitiveInterpretation EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveInterpretationRule()); 
            pushFollow(FOLLOW_rulePrimitiveInterpretation_in_entryRulePrimitiveInterpretation3080);
            iv_rulePrimitiveInterpretation=rulePrimitiveInterpretation();

            state._fsp--;

             current =iv_rulePrimitiveInterpretation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveInterpretation3090); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveInterpretation"


    // $ANTLR start "rulePrimitiveInterpretation"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1425:1: rulePrimitiveInterpretation returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject rulePrimitiveInterpretation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1428:28: ( (otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1429:1: (otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1429:1: (otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1429:3: otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_rulePrimitiveInterpretation3127); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveInterpretationAccess().getPrimitiveKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1433:1: ( (lv_type_1_0= ruleType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1434:1: (lv_type_1_0= ruleType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1434:1: (lv_type_1_0= ruleType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1435:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveInterpretationAccess().getTypeTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_rulePrimitiveInterpretation3148);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrimitiveInterpretationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1451:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1452:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1452:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1453:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveInterpretation3165); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPrimitiveInterpretationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitiveInterpretationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_rulePrimitiveInterpretation3182); 

                	newLeafNode(otherlv_3, grammarAccess.getPrimitiveInterpretationAccess().getAsKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1473:1: ( (otherlv_4= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1474:1: (otherlv_4= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1474:1: (otherlv_4= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1475:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitiveInterpretationRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveInterpretation3202); 

            		newLeafNode(otherlv_4, grammarAccess.getPrimitiveInterpretationAccess().getRepresentationRepresentationCrossReference_4_0()); 
            	

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
    // $ANTLR end "rulePrimitiveInterpretation"


    // $ANTLR start "entryRuleConstant"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1494:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1495:2: (iv_ruleConstant= ruleConstant EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1496:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant3238);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant3248); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1503:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_constantValue_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_constantValue_5_0=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1506:28: ( (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_constantValue_5_0= RULE_STRING ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1507:1: (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_constantValue_5_0= RULE_STRING ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1507:1: (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_constantValue_5_0= RULE_STRING ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1507:3: otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_constantValue_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleConstant3285); 

                	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstantKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1511:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1512:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1512:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1513:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant3302); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleConstant3319); 

                	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getAsKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1533:1: ( (otherlv_3= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1534:1: (otherlv_3= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1534:1: (otherlv_3= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1535:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant3339); 

            		newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getRepresentationRepresentationCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleConstant3351); 

                	newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getIsKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1550:1: ( (lv_constantValue_5_0= RULE_STRING ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1551:1: (lv_constantValue_5_0= RULE_STRING )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1551:1: (lv_constantValue_5_0= RULE_STRING )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1552:3: lv_constantValue_5_0= RULE_STRING
            {
            lv_constantValue_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstant3368); 

            			newLeafNode(lv_constantValue_5_0, grammarAccess.getConstantAccess().getConstantValueSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"constantValue",
                    		lv_constantValue_5_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleDOUBLE"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1576:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1577:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1578:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE3410);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE3421); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1585:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1588:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1589:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1589:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1589:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE3461); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1596:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==51) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1597:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleDOUBLE3480); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE3495); 

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


    // $ANTLR start "ruleGenerationLanguage"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1617:1: ruleGenerationLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) ) ;
    public final Enumerator ruleGenerationLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1619:28: ( ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1620:1: ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1620:1: ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt18=1;
                }
                break;
            case 53:
                {
                alt18=2;
                }
                break;
            case 54:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1620:2: (enumLiteral_0= 'JAVA' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1620:2: (enumLiteral_0= 'JAVA' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1620:4: enumLiteral_0= 'JAVA'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleGenerationLanguage3556); 

                            current = grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1626:6: (enumLiteral_1= 'CPP' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1626:6: (enumLiteral_1= 'CPP' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1626:8: enumLiteral_1= 'CPP'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_ruleGenerationLanguage3573); 

                            current = grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1632:6: (enumLiteral_2= 'C' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1632:6: (enumLiteral_2= 'C' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1632:8: enumLiteral_2= 'C'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_54_in_ruleGenerationLanguage3590); 

                            current = grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleGenerationLanguage"


    // $ANTLR start "ruleArgumentType"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1642:1: ruleArgumentType returns [Enumerator current=null] : (enumLiteral_0= 'BYTE_ARRAY' ) ;
    public final Enumerator ruleArgumentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1644:28: ( (enumLiteral_0= 'BYTE_ARRAY' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1645:1: (enumLiteral_0= 'BYTE_ARRAY' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1645:1: (enumLiteral_0= 'BYTE_ARRAY' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1645:3: enumLiteral_0= 'BYTE_ARRAY'
            {
            enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleArgumentType3634); 

                    current = grammarAccess.getArgumentTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getArgumentTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentType"


    // $ANTLR start "ruleQuantity"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1655:1: ruleQuantity returns [Enumerator current=null] : ( (enumLiteral_0= 'FLOW' ) | (enumLiteral_1= 'TEMPERATURE' ) | (enumLiteral_2= 'VOLUME' ) | (enumLiteral_3= 'DURATION' ) | (enumLiteral_4= 'PRESSURE' ) ) ;
    public final Enumerator ruleQuantity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1657:28: ( ( (enumLiteral_0= 'FLOW' ) | (enumLiteral_1= 'TEMPERATURE' ) | (enumLiteral_2= 'VOLUME' ) | (enumLiteral_3= 'DURATION' ) | (enumLiteral_4= 'PRESSURE' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1658:1: ( (enumLiteral_0= 'FLOW' ) | (enumLiteral_1= 'TEMPERATURE' ) | (enumLiteral_2= 'VOLUME' ) | (enumLiteral_3= 'DURATION' ) | (enumLiteral_4= 'PRESSURE' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1658:1: ( (enumLiteral_0= 'FLOW' ) | (enumLiteral_1= 'TEMPERATURE' ) | (enumLiteral_2= 'VOLUME' ) | (enumLiteral_3= 'DURATION' ) | (enumLiteral_4= 'PRESSURE' ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt19=1;
                }
                break;
            case 57:
                {
                alt19=2;
                }
                break;
            case 58:
                {
                alt19=3;
                }
                break;
            case 59:
                {
                alt19=4;
                }
                break;
            case 60:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1658:2: (enumLiteral_0= 'FLOW' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1658:2: (enumLiteral_0= 'FLOW' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1658:4: enumLiteral_0= 'FLOW'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleQuantity3678); 

                            current = grammarAccess.getQuantityAccess().getFLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQuantityAccess().getFLOWEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1664:6: (enumLiteral_1= 'TEMPERATURE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1664:6: (enumLiteral_1= 'TEMPERATURE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1664:8: enumLiteral_1= 'TEMPERATURE'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleQuantity3695); 

                            current = grammarAccess.getQuantityAccess().getTEMPERATUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQuantityAccess().getTEMPERATUREEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1670:6: (enumLiteral_2= 'VOLUME' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1670:6: (enumLiteral_2= 'VOLUME' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1670:8: enumLiteral_2= 'VOLUME'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_ruleQuantity3712); 

                            current = grammarAccess.getQuantityAccess().getVOLUMEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getQuantityAccess().getVOLUMEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1676:6: (enumLiteral_3= 'DURATION' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1676:6: (enumLiteral_3= 'DURATION' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1676:8: enumLiteral_3= 'DURATION'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_59_in_ruleQuantity3729); 

                            current = grammarAccess.getQuantityAccess().getDURATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getQuantityAccess().getDURATIONEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1682:6: (enumLiteral_4= 'PRESSURE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1682:6: (enumLiteral_4= 'PRESSURE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1682:8: enumLiteral_4= 'PRESSURE'
                    {
                    enumLiteral_4=(Token)match(input,60,FOLLOW_60_in_ruleQuantity3746); 

                            current = grammarAccess.getQuantityAccess().getPRESSUREEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getQuantityAccess().getPRESSUREEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleQuantity"


    // $ANTLR start "ruleType"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1692:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'BYTE' ) | (enumLiteral_1= 'SHORT' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'FLOAT' ) | (enumLiteral_5= 'DOUBLE' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1694:28: ( ( (enumLiteral_0= 'BYTE' ) | (enumLiteral_1= 'SHORT' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'FLOAT' ) | (enumLiteral_5= 'DOUBLE' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1695:1: ( (enumLiteral_0= 'BYTE' ) | (enumLiteral_1= 'SHORT' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'FLOAT' ) | (enumLiteral_5= 'DOUBLE' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1695:1: ( (enumLiteral_0= 'BYTE' ) | (enumLiteral_1= 'SHORT' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'FLOAT' ) | (enumLiteral_5= 'DOUBLE' ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt20=1;
                }
                break;
            case 62:
                {
                alt20=2;
                }
                break;
            case 63:
                {
                alt20=3;
                }
                break;
            case 64:
                {
                alt20=4;
                }
                break;
            case 65:
                {
                alt20=5;
                }
                break;
            case 66:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1695:2: (enumLiteral_0= 'BYTE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1695:2: (enumLiteral_0= 'BYTE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1695:4: enumLiteral_0= 'BYTE'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_61_in_ruleType3791); 

                            current = grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1701:6: (enumLiteral_1= 'SHORT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1701:6: (enumLiteral_1= 'SHORT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1701:8: enumLiteral_1= 'SHORT'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_62_in_ruleType3808); 

                            current = grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1707:6: (enumLiteral_2= 'INT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1707:6: (enumLiteral_2= 'INT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1707:8: enumLiteral_2= 'INT'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_63_in_ruleType3825); 

                            current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1713:6: (enumLiteral_3= 'LONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1713:6: (enumLiteral_3= 'LONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1713:8: enumLiteral_3= 'LONG'
                    {
                    enumLiteral_3=(Token)match(input,64,FOLLOW_64_in_ruleType3842); 

                            current = grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1719:6: (enumLiteral_4= 'FLOAT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1719:6: (enumLiteral_4= 'FLOAT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1719:8: enumLiteral_4= 'FLOAT'
                    {
                    enumLiteral_4=(Token)match(input,65,FOLLOW_65_in_ruleType3859); 

                            current = grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1725:6: (enumLiteral_5= 'DOUBLE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1725:6: (enumLiteral_5= 'DOUBLE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1725:8: enumLiteral_5= 'DOUBLE'
                    {
                    enumLiteral_5=(Token)match(input,66,FOLLOW_66_in_ruleType3876); 

                            current = grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDataModel122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataModel134 = new BitSet(new long[]{0x0000000000292000L});
    public static final BitSet FOLLOW_ruleOptions_in_ruleDataModel155 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDataModel167 = new BitSet(new long[]{0x00060630C0004000L});
    public static final BitSet FOLLOW_ruleRepresentation_in_ruleDataModel189 = new BitSet(new long[]{0x00060630C0004000L});
    public static final BitSet FOLLOW_ruleInterpretation_in_ruleDataModel216 = new BitSet(new long[]{0x00060630C0004000L});
    public static final BitSet FOLLOW_14_in_ruleDataModel230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel250 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleDataModel263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel283 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleOptions_in_entryRuleOptions321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptions331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOptions379 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOptions391 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions403 = new BitSet(new long[]{0x0000000005400000L});
    public static final BitSet FOLLOW_ruleTransmission_in_ruleOptions424 = new BitSet(new long[]{0x0000000000290002L});
    public static final BitSet FOLLOW_19_in_ruleOptions444 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOptions456 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions468 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_ruleOptions489 = new BitSet(new long[]{0x0000000000290002L});
    public static final BitSet FOLLOW_21_in_ruleOptions509 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOptions521 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions533 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_ruleOptions554 = new BitSet(new long[]{0x0000000000290002L});
    public static final BitSet FOLLOW_ruleTransmission_in_entryRuleTransmission593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransmission603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePull_in_ruleTransmission650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePush_in_ruleTransmission677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePush_in_entryRulePush712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePush722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePush759 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePush771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePush788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePull_in_entryRulePull829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePull839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeDivisionMultiplexing_in_rulePull886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePull904 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePull916 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePull928 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePull940 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePull957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeDivisionMultiplexing_in_entryRuleTimeDivisionMultiplexing999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeDivisionMultiplexing1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTimeDivisionMultiplexing1046 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTimeDivisionMultiplexing1058 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTimeDivisionMultiplexing1070 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTimeDivisionMultiplexing1082 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeDivisionMultiplexing1099 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTimeDivisionMultiplexing1116 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTimeDivisionMultiplexing1128 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTimeDivisionMultiplexing1140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleTimeDivisionMultiplexing1161 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTimeDivisionMultiplexing1173 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTimeDivisionMultiplexing1185 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTimeDivisionMultiplexing1197 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleTimeDivisionMultiplexing1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepresentation_in_entryRuleRepresentation1254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepresentation1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRepresentation1302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_31_in_ruleRepresentation1320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepresentation1338 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRepresentation1355 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleType_in_ruleRepresentation1376 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleRepresentation1388 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepresentation1405 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleRepresentation1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRepresentation1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretation_in_entryRuleInterpretation1478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterpretation1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleInterpretation1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveInterpretation_in_ruleInterpretation1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurement_in_ruleInterpretation1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretationGroup_in_ruleInterpretation1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_ruleInterpretation1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_entryRuleCalculated1678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalculated1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCalculated1726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_37_in_ruleCalculated1744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated1762 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCalculated1779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated1799 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCalculated1811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated1828 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_15_in_ruleCalculated1846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated1863 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCalculated1882 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCalculated1903 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleCalculated1916 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCalculated1937 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleParameter2022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2042 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_38_in_ruleParameter2055 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleArgumentType_in_ruleParameter2076 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleParameter2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretationGroup_in_entryRuleInterpretationGroup2126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterpretationGroup2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleInterpretationGroup2173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterpretationGroup2190 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterpretationGroup2207 = new BitSet(new long[]{0x00060630C0002000L});
    public static final BitSet FOLLOW_ruleInterpretation_in_ruleInterpretationGroup2228 = new BitSet(new long[]{0x00060630C0002000L});
    public static final BitSet FOLLOW_13_in_ruleInterpretationGroup2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurement_in_entryRuleMeasurement2277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurement2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleMeasurement2324 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleMeasurement2336 = new BitSet(new long[]{0x1F00000000000000L});
    public static final BitSet FOLLOW_ruleQuantity_in_ruleMeasurement2357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeasurement2374 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleMeasurement2391 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleMeasurement2412 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasurement2430 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMeasurement2447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeasurement2467 = new BitSet(new long[]{0x0000200000800002L});
    public static final BitSet FOLLOW_ruleMeasurementConstraint_in_ruleMeasurement2488 = new BitSet(new long[]{0x0000200000800002L});
    public static final BitSet FOLLOW_ruleMeasurementConstraint_in_entryRuleMeasurementConstraint2525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementConstraint2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementInRange_in_ruleMeasurementConstraint2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementAdaption_in_ruleMeasurementConstraint2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementInRange_in_entryRuleMeasurementInRange2644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementInRange2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMeasurementInRange2691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMeasure_in_ruleMeasurementInRange2712 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleMeasurementInRange2724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMeasure_in_ruleMeasurementInRange2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementAdaption_in_entryRuleMeasurementAdaption2781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementAdaption2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMeasurementAdaption2828 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleMeasurementAdaption2840 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMeasurementAdaption2852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleMeasurementAdaption2873 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMeasurementAdaption2885 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleMeasurementAdaption2897 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMeasurementAdaption2909 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleMeasurementAdaption2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_entryRuleMeasure2966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasure2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleMeasure3022 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasure3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveInterpretation_in_entryRulePrimitiveInterpretation3080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveInterpretation3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePrimitiveInterpretation3127 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleType_in_rulePrimitiveInterpretation3148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveInterpretation3165 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulePrimitiveInterpretation3182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveInterpretation3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant3238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleConstant3285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant3302 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleConstant3319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant3339 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleConstant3351 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstant3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE3410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE3461 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDOUBLE3480 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleGenerationLanguage3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleGenerationLanguage3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleGenerationLanguage3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleArgumentType3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleQuantity3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleQuantity3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleQuantity3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleQuantity3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleQuantity3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleType3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleType3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleType3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleType3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleType3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleType3876 = new BitSet(new long[]{0x0000000000000002L});

}