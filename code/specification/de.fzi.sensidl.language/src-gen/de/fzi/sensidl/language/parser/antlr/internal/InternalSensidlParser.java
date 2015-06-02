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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datamodel'", "'{'", "'options'", "'}'", "'transmit'", "','", "'sensor'", "'language'", "':'", "'receiver'", "'repr'", "'representation'", "'is'", "'bytes'", "'byte'", "'in'", "'calculate'", "'calculated'", "'as'", "'by'", "'with'", "'('", "')'", "'structure'", "'data'", "'of'", "'bit'", "'numbering'", "'from'", "'to'", "'scaling factor'", "'and'", "'offset'", "'primitive'", "'.'", "'JAVA'", "'CPP'", "'C'", "'CSHARP'", "'BYTE_ARRAY'", "'BOOL'", "'CHAR'", "'SHORT'", "'INT'", "'LONG'", "'LONGLONG'", "'FLOAT'", "'DOUBLE'", "'LONGDOUBLE'", "'LSB'", "'MSB'"
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:77:1: ruleDataModel returns [EObject current=null] : (otherlv_0= 'datamodel' otherlv_1= '{' otherlv_2= 'options' otherlv_3= '{' ( (lv_options_4_0= ruleOptions ) ) otherlv_5= '}' ( ( (lv_representations_6_0= ruleRepresentation ) ) | ( (lv_datafields_7_0= ruleDatafield ) ) )* otherlv_8= 'transmit' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_options_4_0 = null;

        EObject lv_representations_6_0 = null;

        EObject lv_datafields_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:80:28: ( (otherlv_0= 'datamodel' otherlv_1= '{' otherlv_2= 'options' otherlv_3= '{' ( (lv_options_4_0= ruleOptions ) ) otherlv_5= '}' ( ( (lv_representations_6_0= ruleRepresentation ) ) | ( (lv_datafields_7_0= ruleDatafield ) ) )* otherlv_8= 'transmit' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:81:1: (otherlv_0= 'datamodel' otherlv_1= '{' otherlv_2= 'options' otherlv_3= '{' ( (lv_options_4_0= ruleOptions ) ) otherlv_5= '}' ( ( (lv_representations_6_0= ruleRepresentation ) ) | ( (lv_datafields_7_0= ruleDatafield ) ) )* otherlv_8= 'transmit' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:81:1: (otherlv_0= 'datamodel' otherlv_1= '{' otherlv_2= 'options' otherlv_3= '{' ( (lv_options_4_0= ruleOptions ) ) otherlv_5= '}' ( ( (lv_representations_6_0= ruleRepresentation ) ) | ( (lv_datafields_7_0= ruleDatafield ) ) )* otherlv_8= 'transmit' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:81:3: otherlv_0= 'datamodel' otherlv_1= '{' otherlv_2= 'options' otherlv_3= '{' ( (lv_options_4_0= ruleOptions ) ) otherlv_5= '}' ( ( (lv_representations_6_0= ruleRepresentation ) ) | ( (lv_datafields_7_0= ruleDatafield ) ) )* otherlv_8= 'transmit' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDataModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getDataModelAccess().getDatamodelKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleDataModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDataModel146); 

                	newLeafNode(otherlv_2, grammarAccess.getDataModelAccess().getOptionsKeyword_2());
                
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDataModel158); 

                	newLeafNode(otherlv_3, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:97:1: ( (lv_options_4_0= ruleOptions ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:98:1: (lv_options_4_0= ruleOptions )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:98:1: (lv_options_4_0= ruleOptions )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:99:3: lv_options_4_0= ruleOptions
            {
             
            	        newCompositeNode(grammarAccess.getDataModelAccess().getOptionsOptionsParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleOptions_in_ruleDataModel179);
            lv_options_4_0=ruleOptions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataModelRule());
            	        }
                   		set(
                   			current, 
                   			"options",
                    		lv_options_4_0, 
                    		"Options");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleDataModel191); 

                	newLeafNode(otherlv_5, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_5());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:119:1: ( ( (lv_representations_6_0= ruleRepresentation ) ) | ( (lv_datafields_7_0= ruleDatafield ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=21 && LA1_0<=22)) ) {
                    alt1=1;
                }
                else if ( ((LA1_0>=27 && LA1_0<=28)||(LA1_0>=34 && LA1_0<=35)||LA1_0==44) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:119:2: ( (lv_representations_6_0= ruleRepresentation ) )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:119:2: ( (lv_representations_6_0= ruleRepresentation ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:120:1: (lv_representations_6_0= ruleRepresentation )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:120:1: (lv_representations_6_0= ruleRepresentation )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:121:3: lv_representations_6_0= ruleRepresentation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataModelAccess().getRepresentationsRepresentationParserRuleCall_6_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRepresentation_in_ruleDataModel213);
            	    lv_representations_6_0=ruleRepresentation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"representations",
            	            		lv_representations_6_0, 
            	            		"Representation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:138:6: ( (lv_datafields_7_0= ruleDatafield ) )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:138:6: ( (lv_datafields_7_0= ruleDatafield ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:139:1: (lv_datafields_7_0= ruleDatafield )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:139:1: (lv_datafields_7_0= ruleDatafield )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:140:3: lv_datafields_7_0= ruleDatafield
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataModelAccess().getDatafieldsDatafieldParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDatafield_in_ruleDataModel240);
            	    lv_datafields_7_0=ruleDatafield();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"datafields",
            	            		lv_datafields_7_0, 
            	            		"Datafield");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleDataModel254); 

                	newLeafNode(otherlv_8, grammarAccess.getDataModelAccess().getTransmitKeyword_7());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:160:1: ( (otherlv_9= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:161:1: (otherlv_9= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:161:1: (otherlv_9= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:162:3: otherlv_9= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataModelRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataModel274); 

            		newLeafNode(otherlv_9, grammarAccess.getDataModelAccess().getTransmitDatafieldCrossReference_8_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:173:2: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:173:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleDataModel287); 

            	        	newLeafNode(otherlv_10, grammarAccess.getDataModelAccess().getCommaKeyword_9_0());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:177:1: ( (otherlv_11= RULE_ID ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:178:1: (otherlv_11= RULE_ID )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:178:1: (otherlv_11= RULE_ID )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:179:3: otherlv_11= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDataModelRule());
            	    	        }
            	            
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataModel307); 

            	    		newLeafNode(otherlv_11, grammarAccess.getDataModelAccess().getTransmitDatafieldCrossReference_9_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleDataModel321); 

                	newLeafNode(otherlv_12, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:202:1: entryRuleOptions returns [EObject current=null] : iv_ruleOptions= ruleOptions EOF ;
    public final EObject entryRuleOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptions = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:203:2: (iv_ruleOptions= ruleOptions EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:204:2: iv_ruleOptions= ruleOptions EOF
            {
             newCompositeNode(grammarAccess.getOptionsRule()); 
            pushFollow(FOLLOW_ruleOptions_in_entryRuleOptions357);
            iv_ruleOptions=ruleOptions();

            state._fsp--;

             current =iv_ruleOptions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptions367); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:211:1: ruleOptions returns [EObject current=null] : ( () ( (otherlv_1= 'sensor' otherlv_2= 'language' otherlv_3= ':' ( (lv_sensorLanguage_4_0= ruleGenerationLanguage ) ) ) | (otherlv_5= 'receiver' otherlv_6= 'language' otherlv_7= ':' ( (lv_receiverLanguage_8_0= ruleGenerationLanguage ) ) ) )* ) ;
    public final EObject ruleOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_sensorLanguage_4_0 = null;

        Enumerator lv_receiverLanguage_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:214:28: ( ( () ( (otherlv_1= 'sensor' otherlv_2= 'language' otherlv_3= ':' ( (lv_sensorLanguage_4_0= ruleGenerationLanguage ) ) ) | (otherlv_5= 'receiver' otherlv_6= 'language' otherlv_7= ':' ( (lv_receiverLanguage_8_0= ruleGenerationLanguage ) ) ) )* ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:215:1: ( () ( (otherlv_1= 'sensor' otherlv_2= 'language' otherlv_3= ':' ( (lv_sensorLanguage_4_0= ruleGenerationLanguage ) ) ) | (otherlv_5= 'receiver' otherlv_6= 'language' otherlv_7= ':' ( (lv_receiverLanguage_8_0= ruleGenerationLanguage ) ) ) )* )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:215:1: ( () ( (otherlv_1= 'sensor' otherlv_2= 'language' otherlv_3= ':' ( (lv_sensorLanguage_4_0= ruleGenerationLanguage ) ) ) | (otherlv_5= 'receiver' otherlv_6= 'language' otherlv_7= ':' ( (lv_receiverLanguage_8_0= ruleGenerationLanguage ) ) ) )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:215:2: () ( (otherlv_1= 'sensor' otherlv_2= 'language' otherlv_3= ':' ( (lv_sensorLanguage_4_0= ruleGenerationLanguage ) ) ) | (otherlv_5= 'receiver' otherlv_6= 'language' otherlv_7= ':' ( (lv_receiverLanguage_8_0= ruleGenerationLanguage ) ) ) )*
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:215:2: ()
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:216:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOptionsAccess().getOptionsAction_0(),
                        current);
                

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:2: ( (otherlv_1= 'sensor' otherlv_2= 'language' otherlv_3= ':' ( (lv_sensorLanguage_4_0= ruleGenerationLanguage ) ) ) | (otherlv_5= 'receiver' otherlv_6= 'language' otherlv_7= ':' ( (lv_receiverLanguage_8_0= ruleGenerationLanguage ) ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }
                else if ( (LA3_0==20) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:3: (otherlv_1= 'sensor' otherlv_2= 'language' otherlv_3= ':' ( (lv_sensorLanguage_4_0= ruleGenerationLanguage ) ) )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:3: (otherlv_1= 'sensor' otherlv_2= 'language' otherlv_3= ':' ( (lv_sensorLanguage_4_0= ruleGenerationLanguage ) ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:5: otherlv_1= 'sensor' otherlv_2= 'language' otherlv_3= ':' ( (lv_sensorLanguage_4_0= ruleGenerationLanguage ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleOptions415); 

            	        	newLeafNode(otherlv_1, grammarAccess.getOptionsAccess().getSensorKeyword_1_0_0());
            	        
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleOptions427); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOptionsAccess().getLanguageKeyword_1_0_1());
            	        
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleOptions439); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOptionsAccess().getColonKeyword_1_0_2());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:233:1: ( (lv_sensorLanguage_4_0= ruleGenerationLanguage ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:234:1: (lv_sensorLanguage_4_0= ruleGenerationLanguage )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:234:1: (lv_sensorLanguage_4_0= ruleGenerationLanguage )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:235:3: lv_sensorLanguage_4_0= ruleGenerationLanguage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOptionsAccess().getSensorLanguageGenerationLanguageEnumRuleCall_1_0_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGenerationLanguage_in_ruleOptions460);
            	    lv_sensorLanguage_4_0=ruleGenerationLanguage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOptionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"sensorLanguage",
            	            		lv_sensorLanguage_4_0, 
            	            		"GenerationLanguage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:252:6: (otherlv_5= 'receiver' otherlv_6= 'language' otherlv_7= ':' ( (lv_receiverLanguage_8_0= ruleGenerationLanguage ) ) )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:252:6: (otherlv_5= 'receiver' otherlv_6= 'language' otherlv_7= ':' ( (lv_receiverLanguage_8_0= ruleGenerationLanguage ) ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:252:8: otherlv_5= 'receiver' otherlv_6= 'language' otherlv_7= ':' ( (lv_receiverLanguage_8_0= ruleGenerationLanguage ) )
            	    {
            	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleOptions480); 

            	        	newLeafNode(otherlv_5, grammarAccess.getOptionsAccess().getReceiverKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleOptions492); 

            	        	newLeafNode(otherlv_6, grammarAccess.getOptionsAccess().getLanguageKeyword_1_1_1());
            	        
            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleOptions504); 

            	        	newLeafNode(otherlv_7, grammarAccess.getOptionsAccess().getColonKeyword_1_1_2());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:264:1: ( (lv_receiverLanguage_8_0= ruleGenerationLanguage ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:265:1: (lv_receiverLanguage_8_0= ruleGenerationLanguage )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:265:1: (lv_receiverLanguage_8_0= ruleGenerationLanguage )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:266:3: lv_receiverLanguage_8_0= ruleGenerationLanguage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOptionsAccess().getReceiverLanguageGenerationLanguageEnumRuleCall_1_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGenerationLanguage_in_ruleOptions525);
            	    lv_receiverLanguage_8_0=ruleGenerationLanguage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOptionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"receiverLanguage",
            	            		lv_receiverLanguage_8_0, 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:290:1: entryRuleRepresentation returns [EObject current=null] : iv_ruleRepresentation= ruleRepresentation EOF ;
    public final EObject entryRuleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepresentation = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:291:2: (iv_ruleRepresentation= ruleRepresentation EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:292:2: iv_ruleRepresentation= ruleRepresentation EOF
            {
             newCompositeNode(grammarAccess.getRepresentationRule()); 
            pushFollow(FOLLOW_ruleRepresentation_in_entryRuleRepresentation564);
            iv_ruleRepresentation=ruleRepresentation();

            state._fsp--;

             current =iv_ruleRepresentation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepresentation574); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:299:1: ruleRepresentation returns [EObject current=null] : ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) ) ) ;
    public final EObject ruleRepresentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_byteCount_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_type_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:302:28: ( ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:303:1: ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:303:1: ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:303:2: (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:303:2: (otherlv_0= 'repr' | otherlv_1= 'representation' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
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
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:303:4: otherlv_0= 'repr'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleRepresentation612); 

                        	newLeafNode(otherlv_0, grammarAccess.getRepresentationAccess().getReprKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:308:7: otherlv_1= 'representation'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleRepresentation630); 

                        	newLeafNode(otherlv_1, grammarAccess.getRepresentationAccess().getRepresentationKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:312:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:313:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:313:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:314:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepresentation648); 

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

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleRepresentation665); 

                	newLeafNode(otherlv_3, grammarAccess.getRepresentationAccess().getIsKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:334:1: ( (lv_byteCount_4_0= RULE_INT ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:335:1: (lv_byteCount_4_0= RULE_INT )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:335:1: (lv_byteCount_4_0= RULE_INT )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:336:3: lv_byteCount_4_0= RULE_INT
            {
            lv_byteCount_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepresentation682); 

            			newLeafNode(lv_byteCount_4_0, grammarAccess.getRepresentationAccess().getByteCountINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRepresentationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"byteCount",
                    		lv_byteCount_4_0, 
                    		"INT");
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:352:2: (otherlv_5= 'bytes' | otherlv_6= 'byte' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:352:4: otherlv_5= 'bytes'
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleRepresentation700); 

                        	newLeafNode(otherlv_5, grammarAccess.getRepresentationAccess().getBytesKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:357:7: otherlv_6= 'byte'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleRepresentation718); 

                        	newLeafNode(otherlv_6, grammarAccess.getRepresentationAccess().getByteKeyword_4_1());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleRepresentation731); 

                	newLeafNode(otherlv_7, grammarAccess.getRepresentationAccess().getInKeyword_5());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:365:1: ( (lv_type_8_0= ruleType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:366:1: (lv_type_8_0= ruleType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:366:1: (lv_type_8_0= ruleType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:367:3: lv_type_8_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getRepresentationAccess().getTypeTypeEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleRepresentation752);
            lv_type_8_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepresentationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_8_0, 
                    		"Type");
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
    // $ANTLR end "ruleRepresentation"


    // $ANTLR start "entryRuleDatafield"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:391:1: entryRuleDatafield returns [EObject current=null] : iv_ruleDatafield= ruleDatafield EOF ;
    public final EObject entryRuleDatafield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatafield = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:392:2: (iv_ruleDatafield= ruleDatafield EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:393:2: iv_ruleDatafield= ruleDatafield EOF
            {
             newCompositeNode(grammarAccess.getDatafieldRule()); 
            pushFollow(FOLLOW_ruleDatafield_in_entryRuleDatafield788);
            iv_ruleDatafield=ruleDatafield();

            state._fsp--;

             current =iv_ruleDatafield; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatafield798); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatafield"


    // $ANTLR start "ruleDatafield"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:400:1: ruleDatafield returns [EObject current=null] : (this_Metadata_0= ruleMetadata | this_Data_1= ruleData | this_Datastructure_2= ruleDatastructure | this_Calculated_3= ruleCalculated ) ;
    public final EObject ruleDatafield() throws RecognitionException {
        EObject current = null;

        EObject this_Metadata_0 = null;

        EObject this_Data_1 = null;

        EObject this_Datastructure_2 = null;

        EObject this_Calculated_3 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:403:28: ( (this_Metadata_0= ruleMetadata | this_Data_1= ruleData | this_Datastructure_2= ruleDatastructure | this_Calculated_3= ruleCalculated ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:404:1: (this_Metadata_0= ruleMetadata | this_Data_1= ruleData | this_Datastructure_2= ruleDatastructure | this_Calculated_3= ruleCalculated )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:404:1: (this_Metadata_0= ruleMetadata | this_Data_1= ruleData | this_Datastructure_2= ruleDatastructure | this_Calculated_3= ruleCalculated )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 34:
                {
                alt6=3;
                }
                break;
            case 27:
            case 28:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:405:5: this_Metadata_0= ruleMetadata
                    {
                     
                            newCompositeNode(grammarAccess.getDatafieldAccess().getMetadataParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMetadata_in_ruleDatafield845);
                    this_Metadata_0=ruleMetadata();

                    state._fsp--;

                     
                            current = this_Metadata_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:415:5: this_Data_1= ruleData
                    {
                     
                            newCompositeNode(grammarAccess.getDatafieldAccess().getDataParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleData_in_ruleDatafield872);
                    this_Data_1=ruleData();

                    state._fsp--;

                     
                            current = this_Data_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:425:5: this_Datastructure_2= ruleDatastructure
                    {
                     
                            newCompositeNode(grammarAccess.getDatafieldAccess().getDatastructureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDatastructure_in_ruleDatafield899);
                    this_Datastructure_2=ruleDatastructure();

                    state._fsp--;

                     
                            current = this_Datastructure_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:435:5: this_Calculated_3= ruleCalculated
                    {
                     
                            newCompositeNode(grammarAccess.getDatafieldAccess().getCalculatedParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCalculated_in_ruleDatafield926);
                    this_Calculated_3=ruleCalculated();

                    state._fsp--;

                     
                            current = this_Calculated_3; 
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
    // $ANTLR end "ruleDatafield"


    // $ANTLR start "entryRuleCalculated"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:451:1: entryRuleCalculated returns [EObject current=null] : iv_ruleCalculated= ruleCalculated EOF ;
    public final EObject entryRuleCalculated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculated = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:452:2: (iv_ruleCalculated= ruleCalculated EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:453:2: iv_ruleCalculated= ruleCalculated EOF
            {
             newCompositeNode(grammarAccess.getCalculatedRule()); 
            pushFollow(FOLLOW_ruleCalculated_in_entryRuleCalculated961);
            iv_ruleCalculated=ruleCalculated();

            state._fsp--;

             current =iv_ruleCalculated; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalculated971); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:460:1: ruleCalculated returns [EObject current=null] : ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* ) ;
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
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:463:28: ( ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:464:1: ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:464:1: ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:464:2: (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )*
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:464:2: (otherlv_0= 'calculate' | otherlv_1= 'calculated' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:464:4: otherlv_0= 'calculate'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleCalculated1009); 

                        	newLeafNode(otherlv_0, grammarAccess.getCalculatedAccess().getCalculateKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:469:7: otherlv_1= 'calculated'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleCalculated1027); 

                        	newLeafNode(otherlv_1, grammarAccess.getCalculatedAccess().getCalculatedKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:473:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:474:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:474:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:475:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated1045); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleCalculated1062); 

                	newLeafNode(otherlv_3, grammarAccess.getCalculatedAccess().getAsKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:495:1: ( (otherlv_4= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:496:1: (otherlv_4= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:496:1: (otherlv_4= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:497:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCalculatedRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated1082); 

            		newLeafNode(otherlv_4, grammarAccess.getCalculatedAccess().getRepresentationRepresentationCrossReference_3_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleCalculated1094); 

                	newLeafNode(otherlv_5, grammarAccess.getCalculatedAccess().getByKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:512:1: ( (lv_methodName_6_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:513:1: (lv_methodName_6_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:513:1: (lv_methodName_6_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:514:3: lv_methodName_6_0= RULE_ID
            {
            lv_methodName_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated1111); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:530:2: (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:530:4: otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleCalculated1129); 

                        	newLeafNode(otherlv_7, grammarAccess.getCalculatedAccess().getCommaKeyword_6_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:534:1: ( (lv_methodNameOut_8_0= RULE_ID ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:535:1: (lv_methodNameOut_8_0= RULE_ID )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:535:1: (lv_methodNameOut_8_0= RULE_ID )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:536:3: lv_methodNameOut_8_0= RULE_ID
                    {
                    lv_methodNameOut_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated1146); 

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

            otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleCalculated1165); 

                	newLeafNode(otherlv_9, grammarAccess.getCalculatedAccess().getWithKeyword_7());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:556:1: ( (lv_parameter_10_0= ruleParameter ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:557:1: (lv_parameter_10_0= ruleParameter )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:557:1: (lv_parameter_10_0= ruleParameter )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:558:3: lv_parameter_10_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleCalculated1186);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:574:2: (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:574:4: otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleCalculated1199); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCalculatedAccess().getCommaKeyword_9_0());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:578:1: ( (lv_parameter_12_0= ruleParameter ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:579:1: (lv_parameter_12_0= ruleParameter )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:579:1: (lv_parameter_12_0= ruleParameter )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:580:3: lv_parameter_12_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleCalculated1220);
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:604:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:605:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:606:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1258);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1268); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:613:1: ruleParameter returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_argumentType_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:616:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:617:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:617:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:617:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleParameter1305); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:621:1: ( (otherlv_1= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:622:1: (otherlv_1= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:622:1: (otherlv_1= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:623:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1325); 

            		newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getDatafieldDatafieldCrossReference_1_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:634:2: (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:634:4: otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleParameter1338); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getAsKeyword_2_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:638:1: ( (lv_argumentType_3_0= ruleArgumentType ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:639:1: (lv_argumentType_3_0= ruleArgumentType )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:639:1: (lv_argumentType_3_0= ruleArgumentType )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:640:3: lv_argumentType_3_0= ruleArgumentType
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getArgumentTypeArgumentTypeEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgumentType_in_ruleParameter1359);
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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleParameter1373); 

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


    // $ANTLR start "entryRuleDatastructure"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:668:1: entryRuleDatastructure returns [EObject current=null] : iv_ruleDatastructure= ruleDatastructure EOF ;
    public final EObject entryRuleDatastructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatastructure = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:669:2: (iv_ruleDatastructure= ruleDatastructure EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:670:2: iv_ruleDatastructure= ruleDatastructure EOF
            {
             newCompositeNode(grammarAccess.getDatastructureRule()); 
            pushFollow(FOLLOW_ruleDatastructure_in_entryRuleDatastructure1409);
            iv_ruleDatastructure=ruleDatastructure();

            state._fsp--;

             current =iv_ruleDatastructure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatastructure1419); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatastructure"


    // $ANTLR start "ruleDatastructure"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:677:1: ruleDatastructure returns [EObject current=null] : (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* otherlv_4= '}' ) ;
    public final EObject ruleDatastructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_datafields_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:680:28: ( (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* otherlv_4= '}' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:681:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* otherlv_4= '}' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:681:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* otherlv_4= '}' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:681:3: otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleDatastructure1456); 

                	newLeafNode(otherlv_0, grammarAccess.getDatastructureAccess().getStructureKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:685:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:686:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:686:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:687:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatastructure1473); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDatastructureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatastructureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDatastructure1490); 

                	newLeafNode(otherlv_2, grammarAccess.getDatastructureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:707:1: ( (lv_datafields_3_0= ruleDatafield ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=27 && LA11_0<=28)||(LA11_0>=34 && LA11_0<=35)||LA11_0==44) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:708:1: (lv_datafields_3_0= ruleDatafield )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:708:1: (lv_datafields_3_0= ruleDatafield )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:709:3: lv_datafields_3_0= ruleDatafield
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDatastructureAccess().getDatafieldsDatafieldParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDatafield_in_ruleDatastructure1511);
            	    lv_datafields_3_0=ruleDatafield();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDatastructureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"datafields",
            	            		lv_datafields_3_0, 
            	            		"Datafield");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleDatastructure1524); 

                	newLeafNode(otherlv_4, grammarAccess.getDatastructureAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatastructure"


    // $ANTLR start "entryRuleData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:737:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:738:2: (iv_ruleData= ruleData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:739:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData1560);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData1570); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:746:1: ruleData returns [EObject current=null] : (otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'with' otherlv_9= 'bit' otherlv_10= 'numbering' ( (lv_bitNumbering_11_0= ruleBitNumbering ) ) )? ( (lv_constraints_12_0= ruleDataConstraint ) )* ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_unit_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_scale_4_0 = null;

        Enumerator lv_bitNumbering_11_0 = null;

        EObject lv_constraints_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:749:28: ( (otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'with' otherlv_9= 'bit' otherlv_10= 'numbering' ( (lv_bitNumbering_11_0= ruleBitNumbering ) ) )? ( (lv_constraints_12_0= ruleDataConstraint ) )* ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:750:1: (otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'with' otherlv_9= 'bit' otherlv_10= 'numbering' ( (lv_bitNumbering_11_0= ruleBitNumbering ) ) )? ( (lv_constraints_12_0= ruleDataConstraint ) )* )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:750:1: (otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'with' otherlv_9= 'bit' otherlv_10= 'numbering' ( (lv_bitNumbering_11_0= ruleBitNumbering ) ) )? ( (lv_constraints_12_0= ruleDataConstraint ) )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:750:3: otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'with' otherlv_9= 'bit' otherlv_10= 'numbering' ( (lv_bitNumbering_11_0= ruleBitNumbering ) ) )? ( (lv_constraints_12_0= ruleDataConstraint ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleData1607); 

                	newLeafNode(otherlv_0, grammarAccess.getDataAccess().getDataKeyword_0());
                
            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleData1619); 

                	newLeafNode(otherlv_1, grammarAccess.getDataAccess().getOfKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:758:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:759:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:759:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:760:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleData1636); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDataAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:776:2: (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:776:4: otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleData1654); 

                        	newLeafNode(otherlv_3, grammarAccess.getDataAccess().getInKeyword_3_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:780:1: ( (lv_scale_4_0= ruleDOUBLE ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_INT) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:781:1: (lv_scale_4_0= ruleDOUBLE )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:781:1: (lv_scale_4_0= ruleDOUBLE )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:782:3: lv_scale_4_0= ruleDOUBLE
                            {
                             
                            	        newCompositeNode(grammarAccess.getDataAccess().getScaleDOUBLEParserRuleCall_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDOUBLE_in_ruleData1675);
                            lv_scale_4_0=ruleDOUBLE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDataRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"scale",
                                    		lv_scale_4_0, 
                                    		"DOUBLE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:798:3: ( (lv_unit_5_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:799:1: (lv_unit_5_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:799:1: (lv_unit_5_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:800:3: lv_unit_5_0= RULE_STRING
                    {
                    lv_unit_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleData1693); 

                    			newLeafNode(lv_unit_5_0, grammarAccess.getDataAccess().getUnitSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"unit",
                            		lv_unit_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleData1712); 

                	newLeafNode(otherlv_6, grammarAccess.getDataAccess().getAsKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:820:1: ( (otherlv_7= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:821:1: (otherlv_7= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:821:1: (otherlv_7= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:822:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleData1732); 

            		newLeafNode(otherlv_7, grammarAccess.getDataAccess().getRepresentationRepresentationCrossReference_5_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:833:2: (otherlv_8= 'with' otherlv_9= 'bit' otherlv_10= 'numbering' ( (lv_bitNumbering_11_0= ruleBitNumbering ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==37) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:833:4: otherlv_8= 'with' otherlv_9= 'bit' otherlv_10= 'numbering' ( (lv_bitNumbering_11_0= ruleBitNumbering ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleData1745); 

                        	newLeafNode(otherlv_8, grammarAccess.getDataAccess().getWithKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleData1757); 

                        	newLeafNode(otherlv_9, grammarAccess.getDataAccess().getBitKeyword_6_1());
                        
                    otherlv_10=(Token)match(input,38,FOLLOW_38_in_ruleData1769); 

                        	newLeafNode(otherlv_10, grammarAccess.getDataAccess().getNumberingKeyword_6_2());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:845:1: ( (lv_bitNumbering_11_0= ruleBitNumbering ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:846:1: (lv_bitNumbering_11_0= ruleBitNumbering )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:846:1: (lv_bitNumbering_11_0= ruleBitNumbering )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:847:3: lv_bitNumbering_11_0= ruleBitNumbering
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataAccess().getBitNumberingBitNumberingEnumRuleCall_6_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitNumbering_in_ruleData1790);
                    lv_bitNumbering_11_0=ruleBitNumbering();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataRule());
                    	        }
                           		set(
                           			current, 
                           			"bitNumbering",
                            		lv_bitNumbering_11_0, 
                            		"BitNumbering");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:863:4: ( (lv_constraints_12_0= ruleDataConstraint ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31||LA15_0==39) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:864:1: (lv_constraints_12_0= ruleDataConstraint )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:864:1: (lv_constraints_12_0= ruleDataConstraint )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:865:3: lv_constraints_12_0= ruleDataConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataAccess().getConstraintsDataConstraintParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataConstraint_in_ruleData1813);
            	    lv_constraints_12_0=ruleDataConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_12_0, 
            	            		"DataConstraint");
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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleDataConstraint"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:889:1: entryRuleDataConstraint returns [EObject current=null] : iv_ruleDataConstraint= ruleDataConstraint EOF ;
    public final EObject entryRuleDataConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataConstraint = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:890:2: (iv_ruleDataConstraint= ruleDataConstraint EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:891:2: iv_ruleDataConstraint= ruleDataConstraint EOF
            {
             newCompositeNode(grammarAccess.getDataConstraintRule()); 
            pushFollow(FOLLOW_ruleDataConstraint_in_entryRuleDataConstraint1850);
            iv_ruleDataConstraint=ruleDataConstraint();

            state._fsp--;

             current =iv_ruleDataConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataConstraint1860); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataConstraint"


    // $ANTLR start "ruleDataConstraint"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:898:1: ruleDataConstraint returns [EObject current=null] : (this_DataRange_0= ruleDataRange | this_DataAdaption_1= ruleDataAdaption ) ;
    public final EObject ruleDataConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_DataRange_0 = null;

        EObject this_DataAdaption_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:901:28: ( (this_DataRange_0= ruleDataRange | this_DataAdaption_1= ruleDataAdaption ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:902:1: (this_DataRange_0= ruleDataRange | this_DataAdaption_1= ruleDataAdaption )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:902:1: (this_DataRange_0= ruleDataRange | this_DataAdaption_1= ruleDataAdaption )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            else if ( (LA16_0==31) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:903:5: this_DataRange_0= ruleDataRange
                    {
                     
                            newCompositeNode(grammarAccess.getDataConstraintAccess().getDataRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataRange_in_ruleDataConstraint1907);
                    this_DataRange_0=ruleDataRange();

                    state._fsp--;

                     
                            current = this_DataRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:913:5: this_DataAdaption_1= ruleDataAdaption
                    {
                     
                            newCompositeNode(grammarAccess.getDataConstraintAccess().getDataAdaptionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataAdaption_in_ruleDataConstraint1934);
                    this_DataAdaption_1=ruleDataAdaption();

                    state._fsp--;

                     
                            current = this_DataAdaption_1; 
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
    // $ANTLR end "ruleDataConstraint"


    // $ANTLR start "entryRuleDataRange"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:929:1: entryRuleDataRange returns [EObject current=null] : iv_ruleDataRange= ruleDataRange EOF ;
    public final EObject entryRuleDataRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataRange = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:930:2: (iv_ruleDataRange= ruleDataRange EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:931:2: iv_ruleDataRange= ruleDataRange EOF
            {
             newCompositeNode(grammarAccess.getDataRangeRule()); 
            pushFollow(FOLLOW_ruleDataRange_in_entryRuleDataRange1969);
            iv_ruleDataRange=ruleDataRange();

            state._fsp--;

             current =iv_ruleDataRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataRange1979); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:938:1: ruleDataRange returns [EObject current=null] : (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) ) ) ;
    public final EObject ruleDataRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lowerBound_1_0 = null;

        EObject lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:941:28: ( (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:942:1: (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:942:1: (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:942:3: otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleDataRange2016); 

                	newLeafNode(otherlv_0, grammarAccess.getDataRangeAccess().getFromKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:946:1: ( (lv_lowerBound_1_0= ruleBound ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:947:1: (lv_lowerBound_1_0= ruleBound )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:947:1: (lv_lowerBound_1_0= ruleBound )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:948:3: lv_lowerBound_1_0= ruleBound
            {
             
            	        newCompositeNode(grammarAccess.getDataRangeAccess().getLowerBoundBoundParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBound_in_ruleDataRange2037);
            lv_lowerBound_1_0=ruleBound();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataRangeRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_1_0, 
                    		"Bound");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleDataRange2049); 

                	newLeafNode(otherlv_2, grammarAccess.getDataRangeAccess().getToKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:968:1: ( (lv_upperBound_3_0= ruleBound ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:969:1: (lv_upperBound_3_0= ruleBound )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:969:1: (lv_upperBound_3_0= ruleBound )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:970:3: lv_upperBound_3_0= ruleBound
            {
             
            	        newCompositeNode(grammarAccess.getDataRangeAccess().getUpperBoundBoundParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBound_in_ruleDataRange2070);
            lv_upperBound_3_0=ruleBound();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataRangeRule());
            	        }
                   		set(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_3_0, 
                    		"Bound");
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


    // $ANTLR start "entryRuleDataAdaption"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:994:1: entryRuleDataAdaption returns [EObject current=null] : iv_ruleDataAdaption= ruleDataAdaption EOF ;
    public final EObject entryRuleDataAdaption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAdaption = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:995:2: (iv_ruleDataAdaption= ruleDataAdaption EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:996:2: iv_ruleDataAdaption= ruleDataAdaption EOF
            {
             newCompositeNode(grammarAccess.getDataAdaptionRule()); 
            pushFollow(FOLLOW_ruleDataAdaption_in_entryRuleDataAdaption2106);
            iv_ruleDataAdaption=ruleDataAdaption();

            state._fsp--;

             current =iv_ruleDataAdaption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAdaption2116); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataAdaption"


    // $ANTLR start "ruleDataAdaption"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1003:1: ruleDataAdaption returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleDataAdaption() throws RecognitionException {
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
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1006:28: ( (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1007:1: (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1007:1: (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1007:3: otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleDataAdaption2153); 

                	newLeafNode(otherlv_0, grammarAccess.getDataAdaptionAccess().getWithKeyword_0());
                
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleDataAdaption2165); 

                	newLeafNode(otherlv_1, grammarAccess.getDataAdaptionAccess().getScalingFactorKeyword_1());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleDataAdaption2177); 

                	newLeafNode(otherlv_2, grammarAccess.getDataAdaptionAccess().getColonKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1019:1: ( (lv_scalingFactor_3_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1020:1: (lv_scalingFactor_3_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1020:1: (lv_scalingFactor_3_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1021:3: lv_scalingFactor_3_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getDataAdaptionAccess().getScalingFactorDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleDataAdaption2198);
            lv_scalingFactor_3_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAdaptionRule());
            	        }
                   		set(
                   			current, 
                   			"scalingFactor",
                    		lv_scalingFactor_3_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleDataAdaption2210); 

                	newLeafNode(otherlv_4, grammarAccess.getDataAdaptionAccess().getAndKeyword_4());
                
            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleDataAdaption2222); 

                	newLeafNode(otherlv_5, grammarAccess.getDataAdaptionAccess().getOffsetKeyword_5());
                
            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleDataAdaption2234); 

                	newLeafNode(otherlv_6, grammarAccess.getDataAdaptionAccess().getColonKeyword_6());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1049:1: ( (lv_offset_7_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1050:1: (lv_offset_7_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1050:1: (lv_offset_7_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1051:3: lv_offset_7_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getDataAdaptionAccess().getOffsetDOUBLEParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleDataAdaption2255);
            lv_offset_7_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAdaptionRule());
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
    // $ANTLR end "ruleDataAdaption"


    // $ANTLR start "entryRuleBound"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1075:1: entryRuleBound returns [EObject current=null] : iv_ruleBound= ruleBound EOF ;
    public final EObject entryRuleBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1076:2: (iv_ruleBound= ruleBound EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1077:2: iv_ruleBound= ruleBound EOF
            {
             newCompositeNode(grammarAccess.getBoundRule()); 
            pushFollow(FOLLOW_ruleBound_in_entryRuleBound2291);
            iv_ruleBound=ruleBound();

            state._fsp--;

             current =iv_ruleBound; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBound2301); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBound"


    // $ANTLR start "ruleBound"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1084:1: ruleBound returns [EObject current=null] : ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBound() throws RecognitionException {
        EObject current = null;

        Token lv_unit_1_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1087:28: ( ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1088:1: ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1088:1: ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1088:2: ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1088:2: ( (lv_value_0_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1089:1: (lv_value_0_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1089:1: (lv_value_0_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1090:3: lv_value_0_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getBoundAccess().getValueDOUBLEParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleBound2347);
            lv_value_0_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBoundRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1106:2: ( (lv_unit_1_0= RULE_STRING ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1107:1: (lv_unit_1_0= RULE_STRING )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1107:1: (lv_unit_1_0= RULE_STRING )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1108:3: lv_unit_1_0= RULE_STRING
            {
            lv_unit_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBound2364); 

            			newLeafNode(lv_unit_1_0, grammarAccess.getBoundAccess().getUnitSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBoundRule());
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
    // $ANTLR end "ruleBound"


    // $ANTLR start "entryRuleMetadata"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1132:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1133:2: (iv_ruleMetadata= ruleMetadata EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1134:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_ruleMetadata_in_entryRuleMetadata2405);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadata2415); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1141:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1144:28: ( (otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1145:1: (otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1145:1: (otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1145:3: otherlv_0= 'primitive' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleMetadata2452); 

                	newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getPrimitiveKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1149:1: ( (lv_type_1_0= ruleType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1150:1: (lv_type_1_0= ruleType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1150:1: (lv_type_1_0= ruleType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1151:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getMetadataAccess().getTypeTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleMetadata2473);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetadataRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1167:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1168:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1168:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1169:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetadata2490); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMetadataAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleMetadata2507); 

                	newLeafNode(otherlv_3, grammarAccess.getMetadataAccess().getAsKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1189:1: ( (otherlv_4= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1190:1: (otherlv_4= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1190:1: (otherlv_4= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1191:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetadata2527); 

            		newLeafNode(otherlv_4, grammarAccess.getMetadataAccess().getRepresentationRepresentationCrossReference_4_0()); 
            	

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
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleDOUBLE"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1210:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1211:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1212:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE2564);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE2575); 

            }

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1219:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1222:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1223:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1223:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1223:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE2615); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1230:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1231:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleDOUBLE2634); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE2649); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1251:1: ruleGenerationLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'CSHARP' ) ) ;
    public final Enumerator ruleGenerationLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1253:28: ( ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'CSHARP' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1254:1: ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'CSHARP' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1254:1: ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'CSHARP' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt18=1;
                }
                break;
            case 47:
                {
                alt18=2;
                }
                break;
            case 48:
                {
                alt18=3;
                }
                break;
            case 49:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1254:2: (enumLiteral_0= 'JAVA' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1254:2: (enumLiteral_0= 'JAVA' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1254:4: enumLiteral_0= 'JAVA'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleGenerationLanguage2710); 

                            current = grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1260:6: (enumLiteral_1= 'CPP' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1260:6: (enumLiteral_1= 'CPP' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1260:8: enumLiteral_1= 'CPP'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleGenerationLanguage2727); 

                            current = grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1266:6: (enumLiteral_2= 'C' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1266:6: (enumLiteral_2= 'C' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1266:8: enumLiteral_2= 'C'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_48_in_ruleGenerationLanguage2744); 

                            current = grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1272:6: (enumLiteral_3= 'CSHARP' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1272:6: (enumLiteral_3= 'CSHARP' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1272:8: enumLiteral_3= 'CSHARP'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_49_in_ruleGenerationLanguage2761); 

                            current = grammarAccess.getGenerationLanguageAccess().getCSHARPEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getGenerationLanguageAccess().getCSHARPEnumLiteralDeclaration_3()); 
                        

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1282:1: ruleArgumentType returns [Enumerator current=null] : (enumLiteral_0= 'BYTE_ARRAY' ) ;
    public final Enumerator ruleArgumentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1284:28: ( (enumLiteral_0= 'BYTE_ARRAY' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1285:1: (enumLiteral_0= 'BYTE_ARRAY' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1285:1: (enumLiteral_0= 'BYTE_ARRAY' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1285:3: enumLiteral_0= 'BYTE_ARRAY'
            {
            enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleArgumentType2805); 

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


    // $ANTLR start "ruleType"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1295:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'BOOL' ) | (enumLiteral_1= 'CHAR' ) | (enumLiteral_2= 'SHORT' ) | (enumLiteral_3= 'INT' ) | (enumLiteral_4= 'LONG' ) | (enumLiteral_5= 'LONGLONG' ) | (enumLiteral_6= 'FLOAT' ) | (enumLiteral_7= 'DOUBLE' ) | (enumLiteral_8= 'LONGDOUBLE' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
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

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1297:28: ( ( (enumLiteral_0= 'BOOL' ) | (enumLiteral_1= 'CHAR' ) | (enumLiteral_2= 'SHORT' ) | (enumLiteral_3= 'INT' ) | (enumLiteral_4= 'LONG' ) | (enumLiteral_5= 'LONGLONG' ) | (enumLiteral_6= 'FLOAT' ) | (enumLiteral_7= 'DOUBLE' ) | (enumLiteral_8= 'LONGDOUBLE' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1298:1: ( (enumLiteral_0= 'BOOL' ) | (enumLiteral_1= 'CHAR' ) | (enumLiteral_2= 'SHORT' ) | (enumLiteral_3= 'INT' ) | (enumLiteral_4= 'LONG' ) | (enumLiteral_5= 'LONGLONG' ) | (enumLiteral_6= 'FLOAT' ) | (enumLiteral_7= 'DOUBLE' ) | (enumLiteral_8= 'LONGDOUBLE' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1298:1: ( (enumLiteral_0= 'BOOL' ) | (enumLiteral_1= 'CHAR' ) | (enumLiteral_2= 'SHORT' ) | (enumLiteral_3= 'INT' ) | (enumLiteral_4= 'LONG' ) | (enumLiteral_5= 'LONGLONG' ) | (enumLiteral_6= 'FLOAT' ) | (enumLiteral_7= 'DOUBLE' ) | (enumLiteral_8= 'LONGDOUBLE' ) )
            int alt19=9;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt19=1;
                }
                break;
            case 52:
                {
                alt19=2;
                }
                break;
            case 53:
                {
                alt19=3;
                }
                break;
            case 54:
                {
                alt19=4;
                }
                break;
            case 55:
                {
                alt19=5;
                }
                break;
            case 56:
                {
                alt19=6;
                }
                break;
            case 57:
                {
                alt19=7;
                }
                break;
            case 58:
                {
                alt19=8;
                }
                break;
            case 59:
                {
                alt19=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1298:2: (enumLiteral_0= 'BOOL' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1298:2: (enumLiteral_0= 'BOOL' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1298:4: enumLiteral_0= 'BOOL'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleType2849); 

                            current = grammarAccess.getTypeAccess().getBOOLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getBOOLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1304:6: (enumLiteral_1= 'CHAR' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1304:6: (enumLiteral_1= 'CHAR' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1304:8: enumLiteral_1= 'CHAR'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleType2866); 

                            current = grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1310:6: (enumLiteral_2= 'SHORT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1310:6: (enumLiteral_2= 'SHORT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1310:8: enumLiteral_2= 'SHORT'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_53_in_ruleType2883); 

                            current = grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1316:6: (enumLiteral_3= 'INT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1316:6: (enumLiteral_3= 'INT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1316:8: enumLiteral_3= 'INT'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_54_in_ruleType2900); 

                            current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1322:6: (enumLiteral_4= 'LONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1322:6: (enumLiteral_4= 'LONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1322:8: enumLiteral_4= 'LONG'
                    {
                    enumLiteral_4=(Token)match(input,55,FOLLOW_55_in_ruleType2917); 

                            current = grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1328:6: (enumLiteral_5= 'LONGLONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1328:6: (enumLiteral_5= 'LONGLONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1328:8: enumLiteral_5= 'LONGLONG'
                    {
                    enumLiteral_5=(Token)match(input,56,FOLLOW_56_in_ruleType2934); 

                            current = grammarAccess.getTypeAccess().getLONGLONGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getLONGLONGEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1334:6: (enumLiteral_6= 'FLOAT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1334:6: (enumLiteral_6= 'FLOAT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1334:8: enumLiteral_6= 'FLOAT'
                    {
                    enumLiteral_6=(Token)match(input,57,FOLLOW_57_in_ruleType2951); 

                            current = grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1340:6: (enumLiteral_7= 'DOUBLE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1340:6: (enumLiteral_7= 'DOUBLE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1340:8: enumLiteral_7= 'DOUBLE'
                    {
                    enumLiteral_7=(Token)match(input,58,FOLLOW_58_in_ruleType2968); 

                            current = grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1346:6: (enumLiteral_8= 'LONGDOUBLE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1346:6: (enumLiteral_8= 'LONGDOUBLE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1346:8: enumLiteral_8= 'LONGDOUBLE'
                    {
                    enumLiteral_8=(Token)match(input,59,FOLLOW_59_in_ruleType2985); 

                            current = grammarAccess.getTypeAccess().getLONGDOUBLEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getTypeAccess().getLONGDOUBLEEnumLiteralDeclaration_8()); 
                        

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


    // $ANTLR start "ruleBitNumbering"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1356:1: ruleBitNumbering returns [Enumerator current=null] : ( (enumLiteral_0= 'LSB' ) | (enumLiteral_1= 'MSB' ) ) ;
    public final Enumerator ruleBitNumbering() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1358:28: ( ( (enumLiteral_0= 'LSB' ) | (enumLiteral_1= 'MSB' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1359:1: ( (enumLiteral_0= 'LSB' ) | (enumLiteral_1= 'MSB' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1359:1: ( (enumLiteral_0= 'LSB' ) | (enumLiteral_1= 'MSB' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==60) ) {
                alt20=1;
            }
            else if ( (LA20_0==61) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1359:2: (enumLiteral_0= 'LSB' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1359:2: (enumLiteral_0= 'LSB' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1359:4: enumLiteral_0= 'LSB'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleBitNumbering3030); 

                            current = grammarAccess.getBitNumberingAccess().getLSBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBitNumberingAccess().getLSBEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1365:6: (enumLiteral_1= 'MSB' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1365:6: (enumLiteral_1= 'MSB' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1365:8: enumLiteral_1= 'MSB'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleBitNumbering3047); 

                            current = grammarAccess.getBitNumberingAccess().getMSBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBitNumberingAccess().getMSBEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleBitNumbering"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDataModel122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataModel134 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDataModel146 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataModel158 = new BitSet(new long[]{0x0000000000124000L});
    public static final BitSet FOLLOW_ruleOptions_in_ruleDataModel179 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataModel191 = new BitSet(new long[]{0x0000100C18608000L});
    public static final BitSet FOLLOW_ruleRepresentation_in_ruleDataModel213 = new BitSet(new long[]{0x0000100C18608000L});
    public static final BitSet FOLLOW_ruleDatafield_in_ruleDataModel240 = new BitSet(new long[]{0x0000100C18608000L});
    public static final BitSet FOLLOW_15_in_ruleDataModel254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel274 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_ruleDataModel287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel307 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleDataModel321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptions_in_entryRuleOptions357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptions367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOptions415 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions427 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOptions439 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_ruleOptions460 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_20_in_ruleOptions480 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions492 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOptions504 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_ruleOptions525 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_ruleRepresentation_in_entryRuleRepresentation564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepresentation574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRepresentation612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22_in_ruleRepresentation630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepresentation648 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRepresentation665 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepresentation682 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleRepresentation700 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25_in_ruleRepresentation718 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRepresentation731 = new BitSet(new long[]{0x0FF8000000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleRepresentation752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatafield_in_entryRuleDatafield788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatafield798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleDatafield845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_ruleDatafield872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatastructure_in_ruleDatafield899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_ruleDatafield926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_entryRuleCalculated961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalculated971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCalculated1009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28_in_ruleCalculated1027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated1045 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCalculated1062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated1082 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCalculated1094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated1111 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_16_in_ruleCalculated1129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated1146 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCalculated1165 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCalculated1186 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleCalculated1199 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCalculated1220 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleParameter1305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1325 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_29_in_ruleParameter1338 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleArgumentType_in_ruleParameter1359 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleParameter1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatastructure_in_entryRuleDatastructure1409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatastructure1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDatastructure1456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatastructure1473 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDatastructure1490 = new BitSet(new long[]{0x0000100C18604000L});
    public static final BitSet FOLLOW_ruleDatafield_in_ruleDatastructure1511 = new BitSet(new long[]{0x0000100C18604000L});
    public static final BitSet FOLLOW_14_in_ruleDatastructure1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleData1607 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleData1619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleData1636 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_26_in_ruleData1654 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleData1675 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleData1693 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleData1712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleData1732 = new BitSet(new long[]{0x0000008080000002L});
    public static final BitSet FOLLOW_31_in_ruleData1745 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleData1757 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleData1769 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_ruleBitNumbering_in_ruleData1790 = new BitSet(new long[]{0x0000008080000002L});
    public static final BitSet FOLLOW_ruleDataConstraint_in_ruleData1813 = new BitSet(new long[]{0x0000008080000002L});
    public static final BitSet FOLLOW_ruleDataConstraint_in_entryRuleDataConstraint1850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataConstraint1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_ruleDataConstraint1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdaption_in_ruleDataConstraint1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_entryRuleDataRange1969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataRange1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDataRange2016 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBound_in_ruleDataRange2037 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleDataRange2049 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBound_in_ruleDataRange2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdaption_in_entryRuleDataAdaption2106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAdaption2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDataAdaption2153 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleDataAdaption2165 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDataAdaption2177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleDataAdaption2198 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleDataAdaption2210 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleDataAdaption2222 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDataAdaption2234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleDataAdaption2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_entryRuleBound2291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBound2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleBound2347 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBound2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_entryRuleMetadata2405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadata2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMetadata2452 = new BitSet(new long[]{0x0FF8000000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleMetadata2473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetadata2490 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMetadata2507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetadata2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE2564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE2615 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleDOUBLE2634 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleGenerationLanguage2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleGenerationLanguage2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleGenerationLanguage2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleGenerationLanguage2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleArgumentType2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleType2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleType2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleType2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleType2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleType2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleType2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleType2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleType2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleType2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBitNumbering3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBitNumbering3047 = new BitSet(new long[]{0x0000000000000002L});

}