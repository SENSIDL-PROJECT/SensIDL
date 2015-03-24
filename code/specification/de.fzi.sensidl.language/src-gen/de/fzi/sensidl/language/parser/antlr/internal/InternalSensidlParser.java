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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'options'", "'{'", "'}'", "'transmit'", "','", "'transmission'", "'type'", "':'", "'sensor'", "'language'", "'receiver'", "'repr'", "'representation'", "'is'", "'by'", "'bytes'", "'byte'", "'calculate'", "'calculated'", "'as'", "'with'", "'('", "')'", "'group'", "'measurement'", "'of'", "'in'", "'from'", "'to'", "'primitive'", "'constant'", "'.'", "'JAVA'", "'CPP'", "'C'", "'PUSH'", "'PULL'", "'BYTE_ARRAY'", "'FLOW'", "'TEMPERATURE'", "'VOLUME'", "'DURATION'", "'PRESSURE'", "'BYTE'", "'SHORT'", "'INT'", "'LONG'", "'FLOAT'", "'DOUBLE'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
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

                if ( ((LA1_0>=22 && LA1_0<=23)) ) {
                    alt1=1;
                }
                else if ( ((LA1_0>=28 && LA1_0<=29)||(LA1_0>=34 && LA1_0<=35)||(LA1_0>=40 && LA1_0<=41)) ) {
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:199:1: ruleOptions returns [EObject current=null] : ( () ( (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmissionType ) ) ) | (otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) ) ) | (otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) ) ) )* ) ;
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
        Enumerator lv_transmissionType_4_0 = null;

        Enumerator lv_sensorLanguage_8_0 = null;

        Enumerator lv_receiverLanguage_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:202:28: ( ( () ( (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmissionType ) ) ) | (otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) ) ) | (otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) ) ) )* ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:203:1: ( () ( (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmissionType ) ) ) | (otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) ) ) | (otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) ) ) )* )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:203:1: ( () ( (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmissionType ) ) ) | (otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) ) ) | (otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) ) ) )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:203:2: () ( (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmissionType ) ) ) | (otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) ) ) | (otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) ) ) )*
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:203:2: ()
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:204:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOptionsAccess().getOptionsAction_0(),
                        current);
                

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:209:2: ( (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmissionType ) ) ) | (otherlv_5= 'sensor' otherlv_6= 'language' otherlv_7= ':' ( (lv_sensorLanguage_8_0= ruleGenerationLanguage ) ) ) | (otherlv_9= 'receiver' otherlv_10= 'language' otherlv_11= ':' ( (lv_receiverLanguage_12_0= ruleGenerationLanguage ) ) ) )*
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
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:209:3: (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmissionType ) ) )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:209:3: (otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmissionType ) ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:209:5: otherlv_1= 'transmission' otherlv_2= 'type' otherlv_3= ':' ( (lv_transmissionType_4_0= ruleTransmissionType ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleOptions379); 

            	        	newLeafNode(otherlv_1, grammarAccess.getOptionsAccess().getTransmissionKeyword_1_0_0());
            	        
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleOptions391); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOptionsAccess().getTypeKeyword_1_0_1());
            	        
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleOptions403); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOptionsAccess().getColonKeyword_1_0_2());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:1: ( (lv_transmissionType_4_0= ruleTransmissionType ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:222:1: (lv_transmissionType_4_0= ruleTransmissionType )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:222:1: (lv_transmissionType_4_0= ruleTransmissionType )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:223:3: lv_transmissionType_4_0= ruleTransmissionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOptionsAccess().getTransmissionTypeTransmissionTypeEnumRuleCall_1_0_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransmissionType_in_ruleOptions424);
            	    lv_transmissionType_4_0=ruleTransmissionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOptionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"transmissionType",
            	            		lv_transmissionType_4_0, 
            	            		"TransmissionType");
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


    // $ANTLR start "entryRuleRepresentation"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:309:1: entryRuleRepresentation returns [EObject current=null] : iv_ruleRepresentation= ruleRepresentation EOF ;
    public final EObject entryRuleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepresentation = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:310:2: (iv_ruleRepresentation= ruleRepresentation EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:311:2: iv_ruleRepresentation= ruleRepresentation EOF
            {
             newCompositeNode(grammarAccess.getRepresentationRule()); 
            pushFollow(FOLLOW_ruleRepresentation_in_entryRuleRepresentation593);
            iv_ruleRepresentation=ruleRepresentation();

            state._fsp--;

             current =iv_ruleRepresentation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepresentation603); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:318:1: ruleRepresentation returns [EObject current=null] : ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'by' ( (lv_byteCount_6_0= RULE_INT ) ) (otherlv_7= 'bytes' | otherlv_8= 'byte' ) ) ;
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
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:321:28: ( ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'by' ( (lv_byteCount_6_0= RULE_INT ) ) (otherlv_7= 'bytes' | otherlv_8= 'byte' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:322:1: ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'by' ( (lv_byteCount_6_0= RULE_INT ) ) (otherlv_7= 'bytes' | otherlv_8= 'byte' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:322:1: ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'by' ( (lv_byteCount_6_0= RULE_INT ) ) (otherlv_7= 'bytes' | otherlv_8= 'byte' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:322:2: (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'by' ( (lv_byteCount_6_0= RULE_INT ) ) (otherlv_7= 'bytes' | otherlv_8= 'byte' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:322:2: (otherlv_0= 'repr' | otherlv_1= 'representation' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:322:4: otherlv_0= 'repr'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleRepresentation641); 

                        	newLeafNode(otherlv_0, grammarAccess.getRepresentationAccess().getReprKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:327:7: otherlv_1= 'representation'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleRepresentation659); 

                        	newLeafNode(otherlv_1, grammarAccess.getRepresentationAccess().getRepresentationKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:331:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:332:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:332:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:333:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepresentation677); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleRepresentation694); 

                	newLeafNode(otherlv_3, grammarAccess.getRepresentationAccess().getIsKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:353:1: ( (lv_type_4_0= ruleType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:354:1: (lv_type_4_0= ruleType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:354:1: (lv_type_4_0= ruleType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:355:3: lv_type_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getRepresentationAccess().getTypeTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleRepresentation715);
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

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleRepresentation727); 

                	newLeafNode(otherlv_5, grammarAccess.getRepresentationAccess().getByKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:375:1: ( (lv_byteCount_6_0= RULE_INT ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:376:1: (lv_byteCount_6_0= RULE_INT )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:376:1: (lv_byteCount_6_0= RULE_INT )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:377:3: lv_byteCount_6_0= RULE_INT
            {
            lv_byteCount_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepresentation744); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:393:2: (otherlv_7= 'bytes' | otherlv_8= 'byte' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:393:4: otherlv_7= 'bytes'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleRepresentation762); 

                        	newLeafNode(otherlv_7, grammarAccess.getRepresentationAccess().getBytesKeyword_6_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:398:7: otherlv_8= 'byte'
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleRepresentation780); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:410:1: entryRuleInterpretation returns [EObject current=null] : iv_ruleInterpretation= ruleInterpretation EOF ;
    public final EObject entryRuleInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterpretation = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:411:2: (iv_ruleInterpretation= ruleInterpretation EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:412:2: iv_ruleInterpretation= ruleInterpretation EOF
            {
             newCompositeNode(grammarAccess.getInterpretationRule()); 
            pushFollow(FOLLOW_ruleInterpretation_in_entryRuleInterpretation817);
            iv_ruleInterpretation=ruleInterpretation();

            state._fsp--;

             current =iv_ruleInterpretation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterpretation827); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:419:1: ruleInterpretation returns [EObject current=null] : (this_Constant_0= ruleConstant | this_PrimitiveInterpretation_1= rulePrimitiveInterpretation | this_Measurement_2= ruleMeasurement | this_InterpretationGroup_3= ruleInterpretationGroup | this_Calculated_4= ruleCalculated ) ;
    public final EObject ruleInterpretation() throws RecognitionException {
        EObject current = null;

        EObject this_Constant_0 = null;

        EObject this_PrimitiveInterpretation_1 = null;

        EObject this_Measurement_2 = null;

        EObject this_InterpretationGroup_3 = null;

        EObject this_Calculated_4 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:422:28: ( (this_Constant_0= ruleConstant | this_PrimitiveInterpretation_1= rulePrimitiveInterpretation | this_Measurement_2= ruleMeasurement | this_InterpretationGroup_3= ruleInterpretationGroup | this_Calculated_4= ruleCalculated ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:423:1: (this_Constant_0= ruleConstant | this_PrimitiveInterpretation_1= rulePrimitiveInterpretation | this_Measurement_2= ruleMeasurement | this_InterpretationGroup_3= ruleInterpretationGroup | this_Calculated_4= ruleCalculated )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:423:1: (this_Constant_0= ruleConstant | this_PrimitiveInterpretation_1= rulePrimitiveInterpretation | this_Measurement_2= ruleMeasurement | this_InterpretationGroup_3= ruleInterpretationGroup | this_Calculated_4= ruleCalculated )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt6=1;
                }
                break;
            case 40:
                {
                alt6=2;
                }
                break;
            case 35:
                {
                alt6=3;
                }
                break;
            case 34:
                {
                alt6=4;
                }
                break;
            case 28:
            case 29:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:424:5: this_Constant_0= ruleConstant
                    {
                     
                            newCompositeNode(grammarAccess.getInterpretationAccess().getConstantParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConstant_in_ruleInterpretation874);
                    this_Constant_0=ruleConstant();

                    state._fsp--;

                     
                            current = this_Constant_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:434:5: this_PrimitiveInterpretation_1= rulePrimitiveInterpretation
                    {
                     
                            newCompositeNode(grammarAccess.getInterpretationAccess().getPrimitiveInterpretationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveInterpretation_in_ruleInterpretation901);
                    this_PrimitiveInterpretation_1=rulePrimitiveInterpretation();

                    state._fsp--;

                     
                            current = this_PrimitiveInterpretation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:444:5: this_Measurement_2= ruleMeasurement
                    {
                     
                            newCompositeNode(grammarAccess.getInterpretationAccess().getMeasurementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMeasurement_in_ruleInterpretation928);
                    this_Measurement_2=ruleMeasurement();

                    state._fsp--;

                     
                            current = this_Measurement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:454:5: this_InterpretationGroup_3= ruleInterpretationGroup
                    {
                     
                            newCompositeNode(grammarAccess.getInterpretationAccess().getInterpretationGroupParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInterpretationGroup_in_ruleInterpretation955);
                    this_InterpretationGroup_3=ruleInterpretationGroup();

                    state._fsp--;

                     
                            current = this_InterpretationGroup_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:464:5: this_Calculated_4= ruleCalculated
                    {
                     
                            newCompositeNode(grammarAccess.getInterpretationAccess().getCalculatedParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCalculated_in_ruleInterpretation982);
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:480:1: entryRuleCalculated returns [EObject current=null] : iv_ruleCalculated= ruleCalculated EOF ;
    public final EObject entryRuleCalculated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculated = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:481:2: (iv_ruleCalculated= ruleCalculated EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:482:2: iv_ruleCalculated= ruleCalculated EOF
            {
             newCompositeNode(grammarAccess.getCalculatedRule()); 
            pushFollow(FOLLOW_ruleCalculated_in_entryRuleCalculated1017);
            iv_ruleCalculated=ruleCalculated();

            state._fsp--;

             current =iv_ruleCalculated; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalculated1027); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:489:1: ruleCalculated returns [EObject current=null] : ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* ) ;
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
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:492:28: ( ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:493:1: ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:493:1: ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:493:2: (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )*
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:493:2: (otherlv_0= 'calculate' | otherlv_1= 'calculated' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:493:4: otherlv_0= 'calculate'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleCalculated1065); 

                        	newLeafNode(otherlv_0, grammarAccess.getCalculatedAccess().getCalculateKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:498:7: otherlv_1= 'calculated'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleCalculated1083); 

                        	newLeafNode(otherlv_1, grammarAccess.getCalculatedAccess().getCalculatedKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:502:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:503:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:503:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:504:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated1101); 

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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleCalculated1118); 

                	newLeafNode(otherlv_3, grammarAccess.getCalculatedAccess().getAsKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:524:1: ( (otherlv_4= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:525:1: (otherlv_4= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:525:1: (otherlv_4= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:526:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCalculatedRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated1138); 

            		newLeafNode(otherlv_4, grammarAccess.getCalculatedAccess().getRepresentationRepresentationCrossReference_3_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleCalculated1150); 

                	newLeafNode(otherlv_5, grammarAccess.getCalculatedAccess().getByKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:541:1: ( (lv_methodName_6_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:542:1: (lv_methodName_6_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:542:1: (lv_methodName_6_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:543:3: lv_methodName_6_0= RULE_ID
            {
            lv_methodName_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated1167); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:559:2: (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:559:4: otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCalculated1185); 

                        	newLeafNode(otherlv_7, grammarAccess.getCalculatedAccess().getCommaKeyword_6_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:563:1: ( (lv_methodNameOut_8_0= RULE_ID ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:564:1: (lv_methodNameOut_8_0= RULE_ID )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:564:1: (lv_methodNameOut_8_0= RULE_ID )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:565:3: lv_methodNameOut_8_0= RULE_ID
                    {
                    lv_methodNameOut_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated1202); 

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

            otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleCalculated1221); 

                	newLeafNode(otherlv_9, grammarAccess.getCalculatedAccess().getWithKeyword_7());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:585:1: ( (lv_parameter_10_0= ruleParameter ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:586:1: (lv_parameter_10_0= ruleParameter )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:586:1: (lv_parameter_10_0= ruleParameter )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:587:3: lv_parameter_10_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleCalculated1242);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:603:2: (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:603:4: otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) )
            	    {
            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleCalculated1255); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCalculatedAccess().getCommaKeyword_9_0());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:607:1: ( (lv_parameter_12_0= ruleParameter ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:608:1: (lv_parameter_12_0= ruleParameter )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:608:1: (lv_parameter_12_0= ruleParameter )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:609:3: lv_parameter_12_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleCalculated1276);
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
            	    break loop9;
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:633:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:634:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:635:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1314);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1324); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:642:1: ruleParameter returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_argumentType_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:645:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:646:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:646:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:646:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleParameter1361); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:650:1: ( (otherlv_1= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:651:1: (otherlv_1= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:651:1: (otherlv_1= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:652:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1381); 

            		newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getInterpretationInterpretationCrossReference_1_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:663:2: (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:663:4: otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleParameter1394); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getAsKeyword_2_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:667:1: ( (lv_argumentType_3_0= ruleArgumentType ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:668:1: (lv_argumentType_3_0= ruleArgumentType )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:668:1: (lv_argumentType_3_0= ruleArgumentType )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:669:3: lv_argumentType_3_0= ruleArgumentType
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getArgumentTypeArgumentTypeEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgumentType_in_ruleParameter1415);
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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleParameter1429); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:697:1: entryRuleInterpretationGroup returns [EObject current=null] : iv_ruleInterpretationGroup= ruleInterpretationGroup EOF ;
    public final EObject entryRuleInterpretationGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterpretationGroup = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:698:2: (iv_ruleInterpretationGroup= ruleInterpretationGroup EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:699:2: iv_ruleInterpretationGroup= ruleInterpretationGroup EOF
            {
             newCompositeNode(grammarAccess.getInterpretationGroupRule()); 
            pushFollow(FOLLOW_ruleInterpretationGroup_in_entryRuleInterpretationGroup1465);
            iv_ruleInterpretationGroup=ruleInterpretationGroup();

            state._fsp--;

             current =iv_ruleInterpretationGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterpretationGroup1475); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:706:1: ruleInterpretationGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interpretations_3_0= ruleInterpretation ) )* otherlv_4= '}' ) ;
    public final EObject ruleInterpretationGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_interpretations_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:709:28: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interpretations_3_0= ruleInterpretation ) )* otherlv_4= '}' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:710:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interpretations_3_0= ruleInterpretation ) )* otherlv_4= '}' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:710:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interpretations_3_0= ruleInterpretation ) )* otherlv_4= '}' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:710:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interpretations_3_0= ruleInterpretation ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleInterpretationGroup1512); 

                	newLeafNode(otherlv_0, grammarAccess.getInterpretationGroupAccess().getGroupKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:714:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:715:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:715:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:716:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterpretationGroup1529); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInterpretationGroup1546); 

                	newLeafNode(otherlv_2, grammarAccess.getInterpretationGroupAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:736:1: ( (lv_interpretations_3_0= ruleInterpretation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=28 && LA11_0<=29)||(LA11_0>=34 && LA11_0<=35)||(LA11_0>=40 && LA11_0<=41)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:737:1: (lv_interpretations_3_0= ruleInterpretation )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:737:1: (lv_interpretations_3_0= ruleInterpretation )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:738:3: lv_interpretations_3_0= ruleInterpretation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterpretationGroupAccess().getInterpretationsInterpretationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterpretation_in_ruleInterpretationGroup1567);
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
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleInterpretationGroup1580); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:766:1: entryRuleMeasurement returns [EObject current=null] : iv_ruleMeasurement= ruleMeasurement EOF ;
    public final EObject entryRuleMeasurement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurement = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:767:2: (iv_ruleMeasurement= ruleMeasurement EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:768:2: iv_ruleMeasurement= ruleMeasurement EOF
            {
             newCompositeNode(grammarAccess.getMeasurementRule()); 
            pushFollow(FOLLOW_ruleMeasurement_in_entryRuleMeasurement1616);
            iv_ruleMeasurement=ruleMeasurement();

            state._fsp--;

             current =iv_ruleMeasurement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurement1626); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:775:1: ruleMeasurement returns [EObject current=null] : (otherlv_0= 'measurement' otherlv_1= 'of' ( (lv_quantity_2_0= ruleQuantity ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_scale_5_0= ruleDOUBLE ) )? ( (lv_unit_6_0= RULE_STRING ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ( (lv_constraints_9_0= ruleMeasurementConstraint ) )* ) ;
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
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:778:28: ( (otherlv_0= 'measurement' otherlv_1= 'of' ( (lv_quantity_2_0= ruleQuantity ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_scale_5_0= ruleDOUBLE ) )? ( (lv_unit_6_0= RULE_STRING ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ( (lv_constraints_9_0= ruleMeasurementConstraint ) )* ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:779:1: (otherlv_0= 'measurement' otherlv_1= 'of' ( (lv_quantity_2_0= ruleQuantity ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_scale_5_0= ruleDOUBLE ) )? ( (lv_unit_6_0= RULE_STRING ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ( (lv_constraints_9_0= ruleMeasurementConstraint ) )* )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:779:1: (otherlv_0= 'measurement' otherlv_1= 'of' ( (lv_quantity_2_0= ruleQuantity ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_scale_5_0= ruleDOUBLE ) )? ( (lv_unit_6_0= RULE_STRING ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ( (lv_constraints_9_0= ruleMeasurementConstraint ) )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:779:3: otherlv_0= 'measurement' otherlv_1= 'of' ( (lv_quantity_2_0= ruleQuantity ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_scale_5_0= ruleDOUBLE ) )? ( (lv_unit_6_0= RULE_STRING ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ( (lv_constraints_9_0= ruleMeasurementConstraint ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleMeasurement1663); 

                	newLeafNode(otherlv_0, grammarAccess.getMeasurementAccess().getMeasurementKeyword_0());
                
            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleMeasurement1675); 

                	newLeafNode(otherlv_1, grammarAccess.getMeasurementAccess().getOfKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:787:1: ( (lv_quantity_2_0= ruleQuantity ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:788:1: (lv_quantity_2_0= ruleQuantity )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:788:1: (lv_quantity_2_0= ruleQuantity )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:789:3: lv_quantity_2_0= ruleQuantity
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementAccess().getQuantityQuantityEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQuantity_in_ruleMeasurement1696);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:805:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:806:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:806:1: (lv_name_3_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:807:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeasurement1713); 

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

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleMeasurement1730); 

                	newLeafNode(otherlv_4, grammarAccess.getMeasurementAccess().getInKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:827:1: ( (lv_scale_5_0= ruleDOUBLE ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:828:1: (lv_scale_5_0= ruleDOUBLE )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:828:1: (lv_scale_5_0= ruleDOUBLE )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:829:3: lv_scale_5_0= ruleDOUBLE
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementAccess().getScaleDOUBLEParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOUBLE_in_ruleMeasurement1751);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:845:3: ( (lv_unit_6_0= RULE_STRING ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:846:1: (lv_unit_6_0= RULE_STRING )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:846:1: (lv_unit_6_0= RULE_STRING )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:847:3: lv_unit_6_0= RULE_STRING
            {
            lv_unit_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasurement1769); 

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

            otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleMeasurement1786); 

                	newLeafNode(otherlv_7, grammarAccess.getMeasurementAccess().getAsKeyword_7());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:867:1: ( (otherlv_8= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:868:1: (otherlv_8= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:868:1: (otherlv_8= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:869:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasurementRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeasurement1806); 

            		newLeafNode(otherlv_8, grammarAccess.getMeasurementAccess().getRepresentationRepresentationCrossReference_8_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:880:2: ( (lv_constraints_9_0= ruleMeasurementConstraint ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==38) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:881:1: (lv_constraints_9_0= ruleMeasurementConstraint )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:881:1: (lv_constraints_9_0= ruleMeasurementConstraint )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:882:3: lv_constraints_9_0= ruleMeasurementConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMeasurementAccess().getConstraintsMeasurementConstraintParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMeasurementConstraint_in_ruleMeasurement1827);
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
            	    break loop13;
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:906:1: entryRuleMeasurementConstraint returns [EObject current=null] : iv_ruleMeasurementConstraint= ruleMeasurementConstraint EOF ;
    public final EObject entryRuleMeasurementConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementConstraint = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:907:2: (iv_ruleMeasurementConstraint= ruleMeasurementConstraint EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:908:2: iv_ruleMeasurementConstraint= ruleMeasurementConstraint EOF
            {
             newCompositeNode(grammarAccess.getMeasurementConstraintRule()); 
            pushFollow(FOLLOW_ruleMeasurementConstraint_in_entryRuleMeasurementConstraint1864);
            iv_ruleMeasurementConstraint=ruleMeasurementConstraint();

            state._fsp--;

             current =iv_ruleMeasurementConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementConstraint1874); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:915:1: ruleMeasurementConstraint returns [EObject current=null] : this_MeasurementInRange_0= ruleMeasurementInRange ;
    public final EObject ruleMeasurementConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_MeasurementInRange_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:918:28: (this_MeasurementInRange_0= ruleMeasurementInRange )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:920:5: this_MeasurementInRange_0= ruleMeasurementInRange
            {
             
                    newCompositeNode(grammarAccess.getMeasurementConstraintAccess().getMeasurementInRangeParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleMeasurementInRange_in_ruleMeasurementConstraint1920);
            this_MeasurementInRange_0=ruleMeasurementInRange();

            state._fsp--;

             
                    current = this_MeasurementInRange_0; 
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
    // $ANTLR end "ruleMeasurementConstraint"


    // $ANTLR start "entryRuleMeasurementInRange"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:936:1: entryRuleMeasurementInRange returns [EObject current=null] : iv_ruleMeasurementInRange= ruleMeasurementInRange EOF ;
    public final EObject entryRuleMeasurementInRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementInRange = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:937:2: (iv_ruleMeasurementInRange= ruleMeasurementInRange EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:938:2: iv_ruleMeasurementInRange= ruleMeasurementInRange EOF
            {
             newCompositeNode(grammarAccess.getMeasurementInRangeRule()); 
            pushFollow(FOLLOW_ruleMeasurementInRange_in_entryRuleMeasurementInRange1954);
            iv_ruleMeasurementInRange=ruleMeasurementInRange();

            state._fsp--;

             current =iv_ruleMeasurementInRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementInRange1964); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:945:1: ruleMeasurementInRange returns [EObject current=null] : (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleMeasure ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleMeasure ) ) ) ;
    public final EObject ruleMeasurementInRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lowerBound_1_0 = null;

        EObject lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:948:28: ( (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleMeasure ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleMeasure ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:949:1: (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleMeasure ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleMeasure ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:949:1: (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleMeasure ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleMeasure ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:949:3: otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleMeasure ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleMeasure ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleMeasurementInRange2001); 

                	newLeafNode(otherlv_0, grammarAccess.getMeasurementInRangeAccess().getFromKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:953:1: ( (lv_lowerBound_1_0= ruleMeasure ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:954:1: (lv_lowerBound_1_0= ruleMeasure )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:954:1: (lv_lowerBound_1_0= ruleMeasure )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:955:3: lv_lowerBound_1_0= ruleMeasure
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementInRangeAccess().getLowerBoundMeasureParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMeasure_in_ruleMeasurementInRange2022);
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

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleMeasurementInRange2034); 

                	newLeafNode(otherlv_2, grammarAccess.getMeasurementInRangeAccess().getToKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:975:1: ( (lv_upperBound_3_0= ruleMeasure ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:976:1: (lv_upperBound_3_0= ruleMeasure )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:976:1: (lv_upperBound_3_0= ruleMeasure )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:977:3: lv_upperBound_3_0= ruleMeasure
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementInRangeAccess().getUpperBoundMeasureParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMeasure_in_ruleMeasurementInRange2055);
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


    // $ANTLR start "entryRuleMeasure"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1001:1: entryRuleMeasure returns [EObject current=null] : iv_ruleMeasure= ruleMeasure EOF ;
    public final EObject entryRuleMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasure = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1002:2: (iv_ruleMeasure= ruleMeasure EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1003:2: iv_ruleMeasure= ruleMeasure EOF
            {
             newCompositeNode(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_ruleMeasure_in_entryRuleMeasure2091);
            iv_ruleMeasure=ruleMeasure();

            state._fsp--;

             current =iv_ruleMeasure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasure2101); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1010:1: ruleMeasure returns [EObject current=null] : ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        Token lv_unit_1_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1013:28: ( ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1014:1: ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1014:1: ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1014:2: ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1014:2: ( (lv_value_0_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1015:1: (lv_value_0_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1015:1: (lv_value_0_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1016:3: lv_value_0_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getMeasureAccess().getValueDOUBLEParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleMeasure2147);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1032:2: ( (lv_unit_1_0= RULE_STRING ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1033:1: (lv_unit_1_0= RULE_STRING )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1033:1: (lv_unit_1_0= RULE_STRING )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1034:3: lv_unit_1_0= RULE_STRING
            {
            lv_unit_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasure2164); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1058:1: entryRulePrimitiveInterpretation returns [EObject current=null] : iv_rulePrimitiveInterpretation= rulePrimitiveInterpretation EOF ;
    public final EObject entryRulePrimitiveInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveInterpretation = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1059:2: (iv_rulePrimitiveInterpretation= rulePrimitiveInterpretation EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1060:2: iv_rulePrimitiveInterpretation= rulePrimitiveInterpretation EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveInterpretationRule()); 
            pushFollow(FOLLOW_rulePrimitiveInterpretation_in_entryRulePrimitiveInterpretation2205);
            iv_rulePrimitiveInterpretation=rulePrimitiveInterpretation();

            state._fsp--;

             current =iv_rulePrimitiveInterpretation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveInterpretation2215); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1067:1: rulePrimitiveInterpretation returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject rulePrimitiveInterpretation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1070:28: ( (otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1071:1: (otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1071:1: (otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1071:3: otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_rulePrimitiveInterpretation2252); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveInterpretationAccess().getPrimitiveKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1075:1: ( (lv_type_1_0= ruleType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1076:1: (lv_type_1_0= ruleType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1076:1: (lv_type_1_0= ruleType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1077:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveInterpretationAccess().getTypeTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_rulePrimitiveInterpretation2273);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1093:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1094:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1094:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1095:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveInterpretation2290); 

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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_rulePrimitiveInterpretation2307); 

                	newLeafNode(otherlv_3, grammarAccess.getPrimitiveInterpretationAccess().getAsKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1115:1: ( (otherlv_4= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1116:1: (otherlv_4= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1116:1: (otherlv_4= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1117:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitiveInterpretationRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveInterpretation2327); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1136:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1137:2: (iv_ruleConstant= ruleConstant EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1138:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant2363);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant2373); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1145:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_constantValue_5_0= RULE_STRING ) ) ) ;
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
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1148:28: ( (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_constantValue_5_0= RULE_STRING ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1149:1: (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_constantValue_5_0= RULE_STRING ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1149:1: (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_constantValue_5_0= RULE_STRING ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1149:3: otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'is' ( (lv_constantValue_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleConstant2410); 

                	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstantKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1153:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1154:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1154:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1155:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant2427); 

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

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleConstant2444); 

                	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getAsKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1175:1: ( (otherlv_3= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1176:1: (otherlv_3= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1176:1: (otherlv_3= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1177:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant2464); 

            		newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getRepresentationRepresentationCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleConstant2476); 

                	newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getIsKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1192:1: ( (lv_constantValue_5_0= RULE_STRING ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1193:1: (lv_constantValue_5_0= RULE_STRING )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1193:1: (lv_constantValue_5_0= RULE_STRING )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1194:3: lv_constantValue_5_0= RULE_STRING
            {
            lv_constantValue_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstant2493); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1218:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1219:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1220:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE2535);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE2546); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1227:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1230:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1231:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1231:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1231:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE2586); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1238:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1239:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleDOUBLE2605); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE2620); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1259:1: ruleGenerationLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) ) ;
    public final Enumerator ruleGenerationLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1261:28: ( ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1262:1: ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1262:1: ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt15=1;
                }
                break;
            case 44:
                {
                alt15=2;
                }
                break;
            case 45:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1262:2: (enumLiteral_0= 'JAVA' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1262:2: (enumLiteral_0= 'JAVA' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1262:4: enumLiteral_0= 'JAVA'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleGenerationLanguage2681); 

                            current = grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1268:6: (enumLiteral_1= 'CPP' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1268:6: (enumLiteral_1= 'CPP' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1268:8: enumLiteral_1= 'CPP'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleGenerationLanguage2698); 

                            current = grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1274:6: (enumLiteral_2= 'C' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1274:6: (enumLiteral_2= 'C' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1274:8: enumLiteral_2= 'C'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleGenerationLanguage2715); 

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


    // $ANTLR start "ruleTransmissionType"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1284:1: ruleTransmissionType returns [Enumerator current=null] : ( (enumLiteral_0= 'PUSH' ) | (enumLiteral_1= 'PULL' ) ) ;
    public final Enumerator ruleTransmissionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1286:28: ( ( (enumLiteral_0= 'PUSH' ) | (enumLiteral_1= 'PULL' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1287:1: ( (enumLiteral_0= 'PUSH' ) | (enumLiteral_1= 'PULL' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1287:1: ( (enumLiteral_0= 'PUSH' ) | (enumLiteral_1= 'PULL' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            else if ( (LA16_0==47) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1287:2: (enumLiteral_0= 'PUSH' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1287:2: (enumLiteral_0= 'PUSH' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1287:4: enumLiteral_0= 'PUSH'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleTransmissionType2760); 

                            current = grammarAccess.getTransmissionTypeAccess().getPUSHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTransmissionTypeAccess().getPUSHEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1293:6: (enumLiteral_1= 'PULL' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1293:6: (enumLiteral_1= 'PULL' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1293:8: enumLiteral_1= 'PULL'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleTransmissionType2777); 

                            current = grammarAccess.getTransmissionTypeAccess().getPULLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTransmissionTypeAccess().getPULLEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleTransmissionType"


    // $ANTLR start "ruleArgumentType"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1303:1: ruleArgumentType returns [Enumerator current=null] : (enumLiteral_0= 'BYTE_ARRAY' ) ;
    public final Enumerator ruleArgumentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1305:28: ( (enumLiteral_0= 'BYTE_ARRAY' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1306:1: (enumLiteral_0= 'BYTE_ARRAY' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1306:1: (enumLiteral_0= 'BYTE_ARRAY' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1306:3: enumLiteral_0= 'BYTE_ARRAY'
            {
            enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleArgumentType2821); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1316:1: ruleQuantity returns [Enumerator current=null] : ( (enumLiteral_0= 'FLOW' ) | (enumLiteral_1= 'TEMPERATURE' ) | (enumLiteral_2= 'VOLUME' ) | (enumLiteral_3= 'DURATION' ) | (enumLiteral_4= 'PRESSURE' ) ) ;
    public final Enumerator ruleQuantity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1318:28: ( ( (enumLiteral_0= 'FLOW' ) | (enumLiteral_1= 'TEMPERATURE' ) | (enumLiteral_2= 'VOLUME' ) | (enumLiteral_3= 'DURATION' ) | (enumLiteral_4= 'PRESSURE' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1319:1: ( (enumLiteral_0= 'FLOW' ) | (enumLiteral_1= 'TEMPERATURE' ) | (enumLiteral_2= 'VOLUME' ) | (enumLiteral_3= 'DURATION' ) | (enumLiteral_4= 'PRESSURE' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1319:1: ( (enumLiteral_0= 'FLOW' ) | (enumLiteral_1= 'TEMPERATURE' ) | (enumLiteral_2= 'VOLUME' ) | (enumLiteral_3= 'DURATION' ) | (enumLiteral_4= 'PRESSURE' ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt17=1;
                }
                break;
            case 50:
                {
                alt17=2;
                }
                break;
            case 51:
                {
                alt17=3;
                }
                break;
            case 52:
                {
                alt17=4;
                }
                break;
            case 53:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1319:2: (enumLiteral_0= 'FLOW' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1319:2: (enumLiteral_0= 'FLOW' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1319:4: enumLiteral_0= 'FLOW'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleQuantity2865); 

                            current = grammarAccess.getQuantityAccess().getFLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQuantityAccess().getFLOWEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1325:6: (enumLiteral_1= 'TEMPERATURE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1325:6: (enumLiteral_1= 'TEMPERATURE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1325:8: enumLiteral_1= 'TEMPERATURE'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_50_in_ruleQuantity2882); 

                            current = grammarAccess.getQuantityAccess().getTEMPERATUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQuantityAccess().getTEMPERATUREEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1331:6: (enumLiteral_2= 'VOLUME' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1331:6: (enumLiteral_2= 'VOLUME' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1331:8: enumLiteral_2= 'VOLUME'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_51_in_ruleQuantity2899); 

                            current = grammarAccess.getQuantityAccess().getVOLUMEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getQuantityAccess().getVOLUMEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1337:6: (enumLiteral_3= 'DURATION' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1337:6: (enumLiteral_3= 'DURATION' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1337:8: enumLiteral_3= 'DURATION'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_52_in_ruleQuantity2916); 

                            current = grammarAccess.getQuantityAccess().getDURATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getQuantityAccess().getDURATIONEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1343:6: (enumLiteral_4= 'PRESSURE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1343:6: (enumLiteral_4= 'PRESSURE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1343:8: enumLiteral_4= 'PRESSURE'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_53_in_ruleQuantity2933); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1353:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'BYTE' ) | (enumLiteral_1= 'SHORT' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'FLOAT' ) | (enumLiteral_5= 'DOUBLE' ) ) ;
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
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1355:28: ( ( (enumLiteral_0= 'BYTE' ) | (enumLiteral_1= 'SHORT' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'FLOAT' ) | (enumLiteral_5= 'DOUBLE' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1356:1: ( (enumLiteral_0= 'BYTE' ) | (enumLiteral_1= 'SHORT' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'FLOAT' ) | (enumLiteral_5= 'DOUBLE' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1356:1: ( (enumLiteral_0= 'BYTE' ) | (enumLiteral_1= 'SHORT' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'LONG' ) | (enumLiteral_4= 'FLOAT' ) | (enumLiteral_5= 'DOUBLE' ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt18=1;
                }
                break;
            case 55:
                {
                alt18=2;
                }
                break;
            case 56:
                {
                alt18=3;
                }
                break;
            case 57:
                {
                alt18=4;
                }
                break;
            case 58:
                {
                alt18=5;
                }
                break;
            case 59:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1356:2: (enumLiteral_0= 'BYTE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1356:2: (enumLiteral_0= 'BYTE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1356:4: enumLiteral_0= 'BYTE'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleType2978); 

                            current = grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1362:6: (enumLiteral_1= 'SHORT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1362:6: (enumLiteral_1= 'SHORT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1362:8: enumLiteral_1= 'SHORT'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleType2995); 

                            current = grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1368:6: (enumLiteral_2= 'INT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1368:6: (enumLiteral_2= 'INT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1368:8: enumLiteral_2= 'INT'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_ruleType3012); 

                            current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1374:6: (enumLiteral_3= 'LONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1374:6: (enumLiteral_3= 'LONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1374:8: enumLiteral_3= 'LONG'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_57_in_ruleType3029); 

                            current = grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1380:6: (enumLiteral_4= 'FLOAT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1380:6: (enumLiteral_4= 'FLOAT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1380:8: enumLiteral_4= 'FLOAT'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_58_in_ruleType3046); 

                            current = grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1386:6: (enumLiteral_5= 'DOUBLE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1386:6: (enumLiteral_5= 'DOUBLE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1386:8: enumLiteral_5= 'DOUBLE'
                    {
                    enumLiteral_5=(Token)match(input,59,FOLLOW_59_in_ruleType3063); 

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
    public static final BitSet FOLLOW_13_in_ruleDataModel167 = new BitSet(new long[]{0x0000030C30C04000L});
    public static final BitSet FOLLOW_ruleRepresentation_in_ruleDataModel189 = new BitSet(new long[]{0x0000030C30C04000L});
    public static final BitSet FOLLOW_ruleInterpretation_in_ruleDataModel216 = new BitSet(new long[]{0x0000030C30C04000L});
    public static final BitSet FOLLOW_14_in_ruleDataModel230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel250 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleDataModel263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel283 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleOptions_in_entryRuleOptions321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptions331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOptions379 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOptions391 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions403 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_ruleTransmissionType_in_ruleOptions424 = new BitSet(new long[]{0x0000000000290002L});
    public static final BitSet FOLLOW_19_in_ruleOptions444 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOptions456 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions468 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_ruleOptions489 = new BitSet(new long[]{0x0000000000290002L});
    public static final BitSet FOLLOW_21_in_ruleOptions509 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOptions521 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions533 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_ruleOptions554 = new BitSet(new long[]{0x0000000000290002L});
    public static final BitSet FOLLOW_ruleRepresentation_in_entryRuleRepresentation593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepresentation603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRepresentation641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23_in_ruleRepresentation659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepresentation677 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRepresentation694 = new BitSet(new long[]{0x0FC0000000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleRepresentation715 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRepresentation727 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepresentation744 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleRepresentation762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRepresentation780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretation_in_entryRuleInterpretation817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterpretation827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleInterpretation874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveInterpretation_in_ruleInterpretation901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurement_in_ruleInterpretation928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretationGroup_in_ruleInterpretation955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_ruleInterpretation982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_entryRuleCalculated1017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalculated1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCalculated1065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_29_in_ruleCalculated1083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated1101 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCalculated1118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated1138 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCalculated1150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated1167 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_15_in_ruleCalculated1185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated1202 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCalculated1221 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCalculated1242 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleCalculated1255 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCalculated1276 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleParameter1361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1381 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_30_in_ruleParameter1394 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleArgumentType_in_ruleParameter1415 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleParameter1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretationGroup_in_entryRuleInterpretationGroup1465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterpretationGroup1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleInterpretationGroup1512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterpretationGroup1529 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterpretationGroup1546 = new BitSet(new long[]{0x0000030C30C02000L});
    public static final BitSet FOLLOW_ruleInterpretation_in_ruleInterpretationGroup1567 = new BitSet(new long[]{0x0000030C30C02000L});
    public static final BitSet FOLLOW_13_in_ruleInterpretationGroup1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurement_in_entryRuleMeasurement1616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurement1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMeasurement1663 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleMeasurement1675 = new BitSet(new long[]{0x003E000000000000L});
    public static final BitSet FOLLOW_ruleQuantity_in_ruleMeasurement1696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeasurement1713 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleMeasurement1730 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleMeasurement1751 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasurement1769 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMeasurement1786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeasurement1806 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleMeasurementConstraint_in_ruleMeasurement1827 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleMeasurementConstraint_in_entryRuleMeasurementConstraint1864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementConstraint1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementInRange_in_ruleMeasurementConstraint1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementInRange_in_entryRuleMeasurementInRange1954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementInRange1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleMeasurementInRange2001 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMeasure_in_ruleMeasurementInRange2022 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleMeasurementInRange2034 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMeasure_in_ruleMeasurementInRange2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_entryRuleMeasure2091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasure2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleMeasure2147 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasure2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveInterpretation_in_entryRulePrimitiveInterpretation2205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveInterpretation2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePrimitiveInterpretation2252 = new BitSet(new long[]{0x0FC0000000000000L});
    public static final BitSet FOLLOW_ruleType_in_rulePrimitiveInterpretation2273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveInterpretation2290 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePrimitiveInterpretation2307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveInterpretation2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleConstant2410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant2427 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleConstant2444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant2464 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleConstant2476 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstant2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE2535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE2586 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleDOUBLE2605 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleGenerationLanguage2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleGenerationLanguage2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleGenerationLanguage2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTransmissionType2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTransmissionType2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleArgumentType2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleQuantity2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleQuantity2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleQuantity2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleQuantity2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleQuantity2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleType2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleType2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleType3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleType3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleType3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleType3063 = new BitSet(new long[]{0x0000000000000002L});

}