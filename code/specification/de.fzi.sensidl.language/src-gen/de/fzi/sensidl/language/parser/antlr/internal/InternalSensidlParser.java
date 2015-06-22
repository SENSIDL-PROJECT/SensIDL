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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datamodel'", "'{'", "'options'", "'}'", "'transmit'", "','", "'Endianess'", "':'", "'sensor'", "'language'", "'receiver'", "'repr'", "'representation'", "'is'", "'bytes'", "'byte'", "'in'", "'description'", "'id'", "'data'", "'of'", "'as'", "'basicdata'", "'const'", "'calculate'", "'calculated'", "'by'", "'with'", "'('", "')'", "'set'", "'from'", "'to'", "'scaling factor'", "'and'", "'offset'", "'.'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'JAVA'", "'CPP'", "'C'", "'CSHARP'", "'BYTE_ARRAY'", "'BOOL'", "'CHAR'", "'SHORT'", "'INT'", "'LONG'", "'LONGLONG'", "'FLOAT'", "'DOUBLE'", "'LONGDOUBLE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

                if ( ((LA1_0>=22 && LA1_0<=23)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==30||(LA1_0>=33 && LA1_0<=36)||LA1_0==41) ) {
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:211:1: ruleOptions returns [EObject current=null] : ( () ( (otherlv_1= 'Endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) ) (otherlv_4= 'sensor' otherlv_5= 'language' otherlv_6= ':' ( (lv_sensorLanguage_7_0= ruleGenerationLanguage ) ) ) (otherlv_8= 'receiver' otherlv_9= 'language' otherlv_10= ':' ( (lv_receiverLanguage_11_0= ruleGenerationLanguage ) ) ) ) ) ;
    public final EObject ruleOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_endianess_3_0 = null;

        Enumerator lv_sensorLanguage_7_0 = null;

        Enumerator lv_receiverLanguage_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:214:28: ( ( () ( (otherlv_1= 'Endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) ) (otherlv_4= 'sensor' otherlv_5= 'language' otherlv_6= ':' ( (lv_sensorLanguage_7_0= ruleGenerationLanguage ) ) ) (otherlv_8= 'receiver' otherlv_9= 'language' otherlv_10= ':' ( (lv_receiverLanguage_11_0= ruleGenerationLanguage ) ) ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:215:1: ( () ( (otherlv_1= 'Endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) ) (otherlv_4= 'sensor' otherlv_5= 'language' otherlv_6= ':' ( (lv_sensorLanguage_7_0= ruleGenerationLanguage ) ) ) (otherlv_8= 'receiver' otherlv_9= 'language' otherlv_10= ':' ( (lv_receiverLanguage_11_0= ruleGenerationLanguage ) ) ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:215:1: ( () ( (otherlv_1= 'Endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) ) (otherlv_4= 'sensor' otherlv_5= 'language' otherlv_6= ':' ( (lv_sensorLanguage_7_0= ruleGenerationLanguage ) ) ) (otherlv_8= 'receiver' otherlv_9= 'language' otherlv_10= ':' ( (lv_receiverLanguage_11_0= ruleGenerationLanguage ) ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:215:2: () ( (otherlv_1= 'Endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) ) (otherlv_4= 'sensor' otherlv_5= 'language' otherlv_6= ':' ( (lv_sensorLanguage_7_0= ruleGenerationLanguage ) ) ) (otherlv_8= 'receiver' otherlv_9= 'language' otherlv_10= ':' ( (lv_receiverLanguage_11_0= ruleGenerationLanguage ) ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:215:2: ()
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:216:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOptionsAccess().getOptionsAction_0(),
                        current);
                

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:2: ( (otherlv_1= 'Endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) ) (otherlv_4= 'sensor' otherlv_5= 'language' otherlv_6= ':' ( (lv_sensorLanguage_7_0= ruleGenerationLanguage ) ) ) (otherlv_8= 'receiver' otherlv_9= 'language' otherlv_10= ':' ( (lv_receiverLanguage_11_0= ruleGenerationLanguage ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:3: (otherlv_1= 'Endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) ) (otherlv_4= 'sensor' otherlv_5= 'language' otherlv_6= ':' ( (lv_sensorLanguage_7_0= ruleGenerationLanguage ) ) ) (otherlv_8= 'receiver' otherlv_9= 'language' otherlv_10= ':' ( (lv_receiverLanguage_11_0= ruleGenerationLanguage ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:3: (otherlv_1= 'Endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:5: otherlv_1= 'Endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) )
            {
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleOptions415); 

                	newLeafNode(otherlv_1, grammarAccess.getOptionsAccess().getEndianessKeyword_1_0_0());
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleOptions427); 

                	newLeafNode(otherlv_2, grammarAccess.getOptionsAccess().getColonKeyword_1_0_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:229:1: ( (lv_endianess_3_0= ruleEndianess ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:230:1: (lv_endianess_3_0= ruleEndianess )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:230:1: (lv_endianess_3_0= ruleEndianess )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:231:3: lv_endianess_3_0= ruleEndianess
            {
             
            	        newCompositeNode(grammarAccess.getOptionsAccess().getEndianessEndianessEnumRuleCall_1_0_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEndianess_in_ruleOptions448);
            lv_endianess_3_0=ruleEndianess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionsRule());
            	        }
                   		set(
                   			current, 
                   			"endianess",
                    		lv_endianess_3_0, 
                    		"Endianess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:247:3: (otherlv_4= 'sensor' otherlv_5= 'language' otherlv_6= ':' ( (lv_sensorLanguage_7_0= ruleGenerationLanguage ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:247:5: otherlv_4= 'sensor' otherlv_5= 'language' otherlv_6= ':' ( (lv_sensorLanguage_7_0= ruleGenerationLanguage ) )
            {
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleOptions462); 

                	newLeafNode(otherlv_4, grammarAccess.getOptionsAccess().getSensorKeyword_1_1_0());
                
            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleOptions474); 

                	newLeafNode(otherlv_5, grammarAccess.getOptionsAccess().getLanguageKeyword_1_1_1());
                
            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleOptions486); 

                	newLeafNode(otherlv_6, grammarAccess.getOptionsAccess().getColonKeyword_1_1_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:259:1: ( (lv_sensorLanguage_7_0= ruleGenerationLanguage ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:260:1: (lv_sensorLanguage_7_0= ruleGenerationLanguage )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:260:1: (lv_sensorLanguage_7_0= ruleGenerationLanguage )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:261:3: lv_sensorLanguage_7_0= ruleGenerationLanguage
            {
             
            	        newCompositeNode(grammarAccess.getOptionsAccess().getSensorLanguageGenerationLanguageEnumRuleCall_1_1_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGenerationLanguage_in_ruleOptions507);
            lv_sensorLanguage_7_0=ruleGenerationLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionsRule());
            	        }
                   		set(
                   			current, 
                   			"sensorLanguage",
                    		lv_sensorLanguage_7_0, 
                    		"GenerationLanguage");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:277:3: (otherlv_8= 'receiver' otherlv_9= 'language' otherlv_10= ':' ( (lv_receiverLanguage_11_0= ruleGenerationLanguage ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:277:5: otherlv_8= 'receiver' otherlv_9= 'language' otherlv_10= ':' ( (lv_receiverLanguage_11_0= ruleGenerationLanguage ) )
            {
            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleOptions521); 

                	newLeafNode(otherlv_8, grammarAccess.getOptionsAccess().getReceiverKeyword_1_2_0());
                
            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleOptions533); 

                	newLeafNode(otherlv_9, grammarAccess.getOptionsAccess().getLanguageKeyword_1_2_1());
                
            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleOptions545); 

                	newLeafNode(otherlv_10, grammarAccess.getOptionsAccess().getColonKeyword_1_2_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:289:1: ( (lv_receiverLanguage_11_0= ruleGenerationLanguage ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:290:1: (lv_receiverLanguage_11_0= ruleGenerationLanguage )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:290:1: (lv_receiverLanguage_11_0= ruleGenerationLanguage )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:291:3: lv_receiverLanguage_11_0= ruleGenerationLanguage
            {
             
            	        newCompositeNode(grammarAccess.getOptionsAccess().getReceiverLanguageGenerationLanguageEnumRuleCall_1_2_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGenerationLanguage_in_ruleOptions566);
            lv_receiverLanguage_11_0=ruleGenerationLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionsRule());
            	        }
                   		set(
                   			current, 
                   			"receiverLanguage",
                    		lv_receiverLanguage_11_0, 
                    		"GenerationLanguage");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleOptions"


    // $ANTLR start "entryRuleRepresentation"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:317:1: entryRuleRepresentation returns [EObject current=null] : iv_ruleRepresentation= ruleRepresentation EOF ;
    public final EObject entryRuleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepresentation = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:318:2: (iv_ruleRepresentation= ruleRepresentation EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:319:2: iv_ruleRepresentation= ruleRepresentation EOF
            {
             newCompositeNode(grammarAccess.getRepresentationRule()); 
            pushFollow(FOLLOW_ruleRepresentation_in_entryRuleRepresentation606);
            iv_ruleRepresentation=ruleRepresentation();

            state._fsp--;

             current =iv_ruleRepresentation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepresentation616); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:326:1: ruleRepresentation returns [EObject current=null] : ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) ) (otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'id' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? ) ;
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
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_ID_14_0=null;
        Enumerator lv_type_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:329:28: ( ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) ) (otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'id' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:330:1: ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) ) (otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'id' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:330:1: ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) ) (otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'id' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:330:2: (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) ) (otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'id' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )?
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:330:2: (otherlv_0= 'repr' | otherlv_1= 'representation' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:330:4: otherlv_0= 'repr'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleRepresentation654); 

                        	newLeafNode(otherlv_0, grammarAccess.getRepresentationAccess().getReprKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:335:7: otherlv_1= 'representation'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleRepresentation672); 

                        	newLeafNode(otherlv_1, grammarAccess.getRepresentationAccess().getRepresentationKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:339:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:340:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:340:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:341:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepresentation690); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleRepresentation707); 

                	newLeafNode(otherlv_3, grammarAccess.getRepresentationAccess().getIsKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:361:1: ( (lv_byteCount_4_0= RULE_INT ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:362:1: (lv_byteCount_4_0= RULE_INT )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:362:1: (lv_byteCount_4_0= RULE_INT )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:363:3: lv_byteCount_4_0= RULE_INT
            {
            lv_byteCount_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepresentation724); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:379:2: (otherlv_5= 'bytes' | otherlv_6= 'byte' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:379:4: otherlv_5= 'bytes'
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleRepresentation742); 

                        	newLeafNode(otherlv_5, grammarAccess.getRepresentationAccess().getBytesKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:384:7: otherlv_6= 'byte'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleRepresentation760); 

                        	newLeafNode(otherlv_6, grammarAccess.getRepresentationAccess().getByteKeyword_4_1());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleRepresentation773); 

                	newLeafNode(otherlv_7, grammarAccess.getRepresentationAccess().getInKeyword_5());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:392:1: ( (lv_type_8_0= ruleType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:393:1: (lv_type_8_0= ruleType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:393:1: (lv_type_8_0= ruleType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:394:3: lv_type_8_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getRepresentationAccess().getTypeTypeEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleRepresentation794);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:410:2: (otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:410:4: otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleRepresentation807); 

                        	newLeafNode(otherlv_9, grammarAccess.getRepresentationAccess().getDescriptionKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleRepresentation819); 

                        	newLeafNode(otherlv_10, grammarAccess.getRepresentationAccess().getColonKeyword_7_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:418:1: ( (lv_description_11_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:419:1: (lv_description_11_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:419:1: (lv_description_11_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:420:3: lv_description_11_0= RULE_STRING
                    {
                    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRepresentation836); 

                    			newLeafNode(lv_description_11_0, grammarAccess.getRepresentationAccess().getDescriptionSTRINGTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRepresentationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_11_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:436:4: (otherlv_12= 'id' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:436:6: otherlv_12= 'id' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleRepresentation856); 

                        	newLeafNode(otherlv_12, grammarAccess.getRepresentationAccess().getIdKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleRepresentation868); 

                        	newLeafNode(otherlv_13, grammarAccess.getRepresentationAccess().getColonKeyword_8_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:444:1: ( (lv_ID_14_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:445:1: (lv_ID_14_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:445:1: (lv_ID_14_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:446:3: lv_ID_14_0= RULE_STRING
                    {
                    lv_ID_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRepresentation885); 

                    			newLeafNode(lv_ID_14_0, grammarAccess.getRepresentationAccess().getIDSTRINGTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRepresentationRule());
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
    // $ANTLR end "ruleRepresentation"


    // $ANTLR start "entryRuleDatafield"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:470:1: entryRuleDatafield returns [EObject current=null] : iv_ruleDatafield= ruleDatafield EOF ;
    public final EObject entryRuleDatafield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatafield = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:471:2: (iv_ruleDatafield= ruleDatafield EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:472:2: iv_ruleDatafield= ruleDatafield EOF
            {
             newCompositeNode(grammarAccess.getDatafieldRule()); 
            pushFollow(FOLLOW_ruleDatafield_in_entryRuleDatafield928);
            iv_ruleDatafield=ruleDatafield();

            state._fsp--;

             current =iv_ruleDatafield; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatafield938); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:479:1: ruleDatafield returns [EObject current=null] : (this_VariableData_0= ruleVariableData | this_ConstantData_1= ruleConstantData | this_Datastructure_2= ruleDatastructure | this_Calculated_3= ruleCalculated ) ;
    public final EObject ruleDatafield() throws RecognitionException {
        EObject current = null;

        EObject this_VariableData_0 = null;

        EObject this_ConstantData_1 = null;

        EObject this_Datastructure_2 = null;

        EObject this_Calculated_3 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:482:28: ( (this_VariableData_0= ruleVariableData | this_ConstantData_1= ruleConstantData | this_Datastructure_2= ruleDatastructure | this_Calculated_3= ruleCalculated ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:483:1: (this_VariableData_0= ruleVariableData | this_ConstantData_1= ruleConstantData | this_Datastructure_2= ruleDatastructure | this_Calculated_3= ruleCalculated )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:483:1: (this_VariableData_0= ruleVariableData | this_ConstantData_1= ruleConstantData | this_Datastructure_2= ruleDatastructure | this_Calculated_3= ruleCalculated )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 30:
            case 33:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 41:
                {
                alt7=3;
                }
                break;
            case 35:
            case 36:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:484:5: this_VariableData_0= ruleVariableData
                    {
                     
                            newCompositeNode(grammarAccess.getDatafieldAccess().getVariableDataParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariableData_in_ruleDatafield985);
                    this_VariableData_0=ruleVariableData();

                    state._fsp--;

                     
                            current = this_VariableData_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:494:5: this_ConstantData_1= ruleConstantData
                    {
                     
                            newCompositeNode(grammarAccess.getDatafieldAccess().getConstantDataParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConstantData_in_ruleDatafield1012);
                    this_ConstantData_1=ruleConstantData();

                    state._fsp--;

                     
                            current = this_ConstantData_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:504:5: this_Datastructure_2= ruleDatastructure
                    {
                     
                            newCompositeNode(grammarAccess.getDatafieldAccess().getDatastructureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDatastructure_in_ruleDatafield1039);
                    this_Datastructure_2=ruleDatastructure();

                    state._fsp--;

                     
                            current = this_Datastructure_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:514:5: this_Calculated_3= ruleCalculated
                    {
                     
                            newCompositeNode(grammarAccess.getDatafieldAccess().getCalculatedParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCalculated_in_ruleDatafield1066);
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


    // $ANTLR start "entryRuleVariableData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:530:1: entryRuleVariableData returns [EObject current=null] : iv_ruleVariableData= ruleVariableData EOF ;
    public final EObject entryRuleVariableData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:531:2: (iv_ruleVariableData= ruleVariableData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:532:2: iv_ruleVariableData= ruleVariableData EOF
            {
             newCompositeNode(grammarAccess.getVariableDataRule()); 
            pushFollow(FOLLOW_ruleVariableData_in_entryRuleVariableData1101);
            iv_ruleVariableData=ruleVariableData();

            state._fsp--;

             current =iv_ruleVariableData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableData1111); 

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
    // $ANTLR end "entryRuleVariableData"


    // $ANTLR start "ruleVariableData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:539:1: ruleVariableData returns [EObject current=null] : (this_MeasuredData_0= ruleMeasuredData | this_NonMeasuredData_1= ruleNonMeasuredData ) ;
    public final EObject ruleVariableData() throws RecognitionException {
        EObject current = null;

        EObject this_MeasuredData_0 = null;

        EObject this_NonMeasuredData_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:542:28: ( (this_MeasuredData_0= ruleMeasuredData | this_NonMeasuredData_1= ruleNonMeasuredData ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:543:1: (this_MeasuredData_0= ruleMeasuredData | this_NonMeasuredData_1= ruleNonMeasuredData )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:543:1: (this_MeasuredData_0= ruleMeasuredData | this_NonMeasuredData_1= ruleNonMeasuredData )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            else if ( (LA8_0==33) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:544:5: this_MeasuredData_0= ruleMeasuredData
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDataAccess().getMeasuredDataParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMeasuredData_in_ruleVariableData1158);
                    this_MeasuredData_0=ruleMeasuredData();

                    state._fsp--;

                     
                            current = this_MeasuredData_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:554:5: this_NonMeasuredData_1= ruleNonMeasuredData
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDataAccess().getNonMeasuredDataParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNonMeasuredData_in_ruleVariableData1185);
                    this_NonMeasuredData_1=ruleNonMeasuredData();

                    state._fsp--;

                     
                            current = this_NonMeasuredData_1; 
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
    // $ANTLR end "ruleVariableData"


    // $ANTLR start "entryRuleMeasuredData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:570:1: entryRuleMeasuredData returns [EObject current=null] : iv_ruleMeasuredData= ruleMeasuredData EOF ;
    public final EObject entryRuleMeasuredData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasuredData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:571:2: (iv_ruleMeasuredData= ruleMeasuredData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:572:2: iv_ruleMeasuredData= ruleMeasuredData EOF
            {
             newCompositeNode(grammarAccess.getMeasuredDataRule()); 
            pushFollow(FOLLOW_ruleMeasuredData_in_entryRuleMeasuredData1220);
            iv_ruleMeasuredData=ruleMeasuredData();

            state._fsp--;

             current =iv_ruleMeasuredData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasuredData1230); 

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
    // $ANTLR end "entryRuleMeasuredData"


    // $ANTLR start "ruleMeasuredData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:579:1: ruleMeasuredData returns [EObject current=null] : (otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? ( (lv_constraints_14_0= ruleDataConstraint ) )* ) ;
    public final EObject ruleMeasuredData() throws RecognitionException {
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
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_ID_13_0=null;
        AntlrDatatypeRuleToken lv_scale_4_0 = null;

        EObject lv_constraints_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:582:28: ( (otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? ( (lv_constraints_14_0= ruleDataConstraint ) )* ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:583:1: (otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? ( (lv_constraints_14_0= ruleDataConstraint ) )* )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:583:1: (otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? ( (lv_constraints_14_0= ruleDataConstraint ) )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:583:3: otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? ( (lv_constraints_14_0= ruleDataConstraint ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleMeasuredData1267); 

                	newLeafNode(otherlv_0, grammarAccess.getMeasuredDataAccess().getDataKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleMeasuredData1279); 

                	newLeafNode(otherlv_1, grammarAccess.getMeasuredDataAccess().getOfKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:591:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:592:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:592:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:593:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeasuredData1296); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMeasuredDataAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasuredDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:609:2: (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:609:4: otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleMeasuredData1314); 

                        	newLeafNode(otherlv_3, grammarAccess.getMeasuredDataAccess().getInKeyword_3_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:613:1: ( (lv_scale_4_0= ruleDOUBLE ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_INT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:614:1: (lv_scale_4_0= ruleDOUBLE )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:614:1: (lv_scale_4_0= ruleDOUBLE )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:615:3: lv_scale_4_0= ruleDOUBLE
                            {
                             
                            	        newCompositeNode(grammarAccess.getMeasuredDataAccess().getScaleDOUBLEParserRuleCall_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDOUBLE_in_ruleMeasuredData1335);
                            lv_scale_4_0=ruleDOUBLE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getMeasuredDataRule());
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

                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:631:3: ( (lv_unit_5_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:632:1: (lv_unit_5_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:632:1: (lv_unit_5_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:633:3: lv_unit_5_0= RULE_STRING
                    {
                    lv_unit_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasuredData1353); 

                    			newLeafNode(lv_unit_5_0, grammarAccess.getMeasuredDataAccess().getUnitSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasuredDataRule());
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

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleMeasuredData1372); 

                	newLeafNode(otherlv_6, grammarAccess.getMeasuredDataAccess().getAsKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:653:1: ( (otherlv_7= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:654:1: (otherlv_7= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:654:1: (otherlv_7= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:655:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasuredDataRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeasuredData1392); 

            		newLeafNode(otherlv_7, grammarAccess.getMeasuredDataAccess().getRepresentationRepresentationCrossReference_5_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:666:2: (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==18) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==RULE_STRING) ) {
                        alt11=1;
                    }
                }
            }
            switch (alt11) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:666:4: otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleMeasuredData1405); 

                        	newLeafNode(otherlv_8, grammarAccess.getMeasuredDataAccess().getDescriptionKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleMeasuredData1417); 

                        	newLeafNode(otherlv_9, grammarAccess.getMeasuredDataAccess().getColonKeyword_6_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:674:1: ( (lv_description_10_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:675:1: (lv_description_10_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:675:1: (lv_description_10_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:676:3: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasuredData1434); 

                    			newLeafNode(lv_description_10_0, grammarAccess.getMeasuredDataAccess().getDescriptionSTRINGTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasuredDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:692:4: (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==18) ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==RULE_STRING) ) {
                        alt12=1;
                    }
                }
            }
            switch (alt12) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:692:6: otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleMeasuredData1454); 

                        	newLeafNode(otherlv_11, grammarAccess.getMeasuredDataAccess().getIdKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleMeasuredData1466); 

                        	newLeafNode(otherlv_12, grammarAccess.getMeasuredDataAccess().getColonKeyword_7_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:700:1: ( (lv_ID_13_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:701:1: (lv_ID_13_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:701:1: (lv_ID_13_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:702:3: lv_ID_13_0= RULE_STRING
                    {
                    lv_ID_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasuredData1483); 

                    			newLeafNode(lv_ID_13_0, grammarAccess.getMeasuredDataAccess().getIDSTRINGTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMeasuredDataRule());
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:718:4: ( (lv_constraints_14_0= ruleDataConstraint ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==38||LA13_0==42) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:719:1: (lv_constraints_14_0= ruleDataConstraint )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:719:1: (lv_constraints_14_0= ruleDataConstraint )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:720:3: lv_constraints_14_0= ruleDataConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMeasuredDataAccess().getConstraintsDataConstraintParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataConstraint_in_ruleMeasuredData1511);
            	    lv_constraints_14_0=ruleDataConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMeasuredDataRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_14_0, 
            	            		"DataConstraint");
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
    // $ANTLR end "ruleMeasuredData"


    // $ANTLR start "entryRuleNonMeasuredData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:744:1: entryRuleNonMeasuredData returns [EObject current=null] : iv_ruleNonMeasuredData= ruleNonMeasuredData EOF ;
    public final EObject entryRuleNonMeasuredData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonMeasuredData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:745:2: (iv_ruleNonMeasuredData= ruleNonMeasuredData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:746:2: iv_ruleNonMeasuredData= ruleNonMeasuredData EOF
            {
             newCompositeNode(grammarAccess.getNonMeasuredDataRule()); 
            pushFollow(FOLLOW_ruleNonMeasuredData_in_entryRuleNonMeasuredData1548);
            iv_ruleNonMeasuredData=ruleNonMeasuredData();

            state._fsp--;

             current =iv_ruleNonMeasuredData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonMeasuredData1558); 

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
    // $ANTLR end "entryRuleNonMeasuredData"


    // $ANTLR start "ruleNonMeasuredData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:753:1: ruleNonMeasuredData returns [EObject current=null] : (otherlv_0= 'basicdata' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleNonMeasuredData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_ID_10_0=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:756:28: ( (otherlv_0= 'basicdata' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:757:1: (otherlv_0= 'basicdata' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:757:1: (otherlv_0= 'basicdata' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:757:3: otherlv_0= 'basicdata' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleNonMeasuredData1595); 

                	newLeafNode(otherlv_0, grammarAccess.getNonMeasuredDataAccess().getBasicdataKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:761:1: ( (lv_type_1_0= ruleType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:762:1: (lv_type_1_0= ruleType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:762:1: (lv_type_1_0= ruleType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:763:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getNonMeasuredDataAccess().getTypeTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleNonMeasuredData1616);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNonMeasuredDataRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:779:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:780:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:780:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:781:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonMeasuredData1633); 

            			newLeafNode(lv_name_2_0, grammarAccess.getNonMeasuredDataAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNonMeasuredDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleNonMeasuredData1650); 

                	newLeafNode(otherlv_3, grammarAccess.getNonMeasuredDataAccess().getAsKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:801:1: ( (otherlv_4= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:802:1: (otherlv_4= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:802:1: (otherlv_4= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:803:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNonMeasuredDataRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonMeasuredData1670); 

            		newLeafNode(otherlv_4, grammarAccess.getNonMeasuredDataAccess().getRepresentationRepresentationCrossReference_4_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:814:2: (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==18) ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==RULE_STRING) ) {
                        alt14=1;
                    }
                }
            }
            switch (alt14) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:814:4: otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleNonMeasuredData1683); 

                        	newLeafNode(otherlv_5, grammarAccess.getNonMeasuredDataAccess().getDescriptionKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleNonMeasuredData1695); 

                        	newLeafNode(otherlv_6, grammarAccess.getNonMeasuredDataAccess().getColonKeyword_5_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:822:1: ( (lv_description_7_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:823:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:823:1: (lv_description_7_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:824:3: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasuredData1712); 

                    			newLeafNode(lv_description_7_0, grammarAccess.getNonMeasuredDataAccess().getDescriptionSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasuredDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:840:4: (otherlv_8= 'id' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==18) ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3==RULE_STRING) ) {
                        alt15=1;
                    }
                }
            }
            switch (alt15) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:840:6: otherlv_8= 'id' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleNonMeasuredData1732); 

                        	newLeafNode(otherlv_8, grammarAccess.getNonMeasuredDataAccess().getIdKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleNonMeasuredData1744); 

                        	newLeafNode(otherlv_9, grammarAccess.getNonMeasuredDataAccess().getColonKeyword_6_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:848:1: ( (lv_ID_10_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:849:1: (lv_ID_10_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:849:1: (lv_ID_10_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:850:3: lv_ID_10_0= RULE_STRING
                    {
                    lv_ID_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasuredData1761); 

                    			newLeafNode(lv_ID_10_0, grammarAccess.getNonMeasuredDataAccess().getIDSTRINGTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonMeasuredDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ID",
                            		lv_ID_10_0, 
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
    // $ANTLR end "ruleNonMeasuredData"


    // $ANTLR start "entryRuleConstantData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:874:1: entryRuleConstantData returns [EObject current=null] : iv_ruleConstantData= ruleConstantData EOF ;
    public final EObject entryRuleConstantData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:875:2: (iv_ruleConstantData= ruleConstantData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:876:2: iv_ruleConstantData= ruleConstantData EOF
            {
             newCompositeNode(grammarAccess.getConstantDataRule()); 
            pushFollow(FOLLOW_ruleConstantData_in_entryRuleConstantData1804);
            iv_ruleConstantData=ruleConstantData();

            state._fsp--;

             current =iv_ruleConstantData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantData1814); 

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
    // $ANTLR end "entryRuleConstantData"


    // $ANTLR start "ruleConstantData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:883:1: ruleConstantData returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( (lv_constValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' otherlv_10= ':' ( (lv_ID_11_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleConstantData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_constValue_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_ID_11_0=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:886:28: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( (lv_constValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' otherlv_10= ':' ( (lv_ID_11_0= RULE_STRING ) ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:887:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( (lv_constValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' otherlv_10= ':' ( (lv_ID_11_0= RULE_STRING ) ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:887:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( (lv_constValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' otherlv_10= ':' ( (lv_ID_11_0= RULE_STRING ) ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:887:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( (lv_constValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' otherlv_10= ':' ( (lv_ID_11_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleConstantData1851); 

                	newLeafNode(otherlv_0, grammarAccess.getConstantDataAccess().getConstKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:891:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:892:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:892:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:893:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantData1868); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConstantDataAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleConstantData1885); 

                	newLeafNode(otherlv_2, grammarAccess.getConstantDataAccess().getAsKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:913:1: ( (otherlv_3= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:914:1: (otherlv_3= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:914:1: (otherlv_3= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:915:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantDataRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantData1905); 

            		newLeafNode(otherlv_3, grammarAccess.getConstantDataAccess().getRepresentationRepresentationCrossReference_3_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:926:2: (otherlv_4= 'is' ( (lv_constValue_5_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:926:4: otherlv_4= 'is' ( (lv_constValue_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleConstantData1918); 

                        	newLeafNode(otherlv_4, grammarAccess.getConstantDataAccess().getIsKeyword_4_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:930:1: ( (lv_constValue_5_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:931:1: (lv_constValue_5_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:931:1: (lv_constValue_5_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:932:3: lv_constValue_5_0= RULE_STRING
                    {
                    lv_constValue_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantData1935); 

                    			newLeafNode(lv_constValue_5_0, grammarAccess.getConstantDataAccess().getConstValueSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"constValue",
                            		lv_constValue_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:948:4: (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==18) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==RULE_STRING) ) {
                        alt17=1;
                    }
                }
            }
            switch (alt17) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:948:6: otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleConstantData1955); 

                        	newLeafNode(otherlv_6, grammarAccess.getConstantDataAccess().getDescriptionKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleConstantData1967); 

                        	newLeafNode(otherlv_7, grammarAccess.getConstantDataAccess().getColonKeyword_5_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:956:1: ( (lv_description_8_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:957:1: (lv_description_8_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:957:1: (lv_description_8_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:958:3: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantData1984); 

                    			newLeafNode(lv_description_8_0, grammarAccess.getConstantDataAccess().getDescriptionSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:974:4: (otherlv_9= 'id' otherlv_10= ':' ( (lv_ID_11_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==18) ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3==RULE_STRING) ) {
                        alt18=1;
                    }
                }
            }
            switch (alt18) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:974:6: otherlv_9= 'id' otherlv_10= ':' ( (lv_ID_11_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleConstantData2004); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstantDataAccess().getIdKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleConstantData2016); 

                        	newLeafNode(otherlv_10, grammarAccess.getConstantDataAccess().getColonKeyword_6_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:982:1: ( (lv_ID_11_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:983:1: (lv_ID_11_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:983:1: (lv_ID_11_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:984:3: lv_ID_11_0= RULE_STRING
                    {
                    lv_ID_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantData2033); 

                    			newLeafNode(lv_ID_11_0, grammarAccess.getConstantDataAccess().getIDSTRINGTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantDataRule());
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


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantData"


    // $ANTLR start "entryRuleCalculated"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1008:1: entryRuleCalculated returns [EObject current=null] : iv_ruleCalculated= ruleCalculated EOF ;
    public final EObject entryRuleCalculated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculated = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1009:2: (iv_ruleCalculated= ruleCalculated EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1010:2: iv_ruleCalculated= ruleCalculated EOF
            {
             newCompositeNode(grammarAccess.getCalculatedRule()); 
            pushFollow(FOLLOW_ruleCalculated_in_entryRuleCalculated2076);
            iv_ruleCalculated=ruleCalculated();

            state._fsp--;

             current =iv_ruleCalculated; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalculated2086); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1017:1: ruleCalculated returns [EObject current=null] : ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* (otherlv_13= 'description' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) )? (otherlv_16= 'id' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? ) ;
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
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_description_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_ID_18_0=null;
        EObject lv_parameter_10_0 = null;

        EObject lv_parameter_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1020:28: ( ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* (otherlv_13= 'description' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) )? (otherlv_16= 'id' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1021:1: ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* (otherlv_13= 'description' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) )? (otherlv_16= 'id' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1021:1: ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* (otherlv_13= 'description' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) )? (otherlv_16= 'id' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1021:2: (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* (otherlv_13= 'description' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) )? (otherlv_16= 'id' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )?
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1021:2: (otherlv_0= 'calculate' | otherlv_1= 'calculated' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
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
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1021:4: otherlv_0= 'calculate'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleCalculated2124); 

                        	newLeafNode(otherlv_0, grammarAccess.getCalculatedAccess().getCalculateKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1026:7: otherlv_1= 'calculated'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleCalculated2142); 

                        	newLeafNode(otherlv_1, grammarAccess.getCalculatedAccess().getCalculatedKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1030:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1031:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1031:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1032:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated2160); 

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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleCalculated2177); 

                	newLeafNode(otherlv_3, grammarAccess.getCalculatedAccess().getAsKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1052:1: ( (otherlv_4= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1053:1: (otherlv_4= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1053:1: (otherlv_4= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1054:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCalculatedRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated2197); 

            		newLeafNode(otherlv_4, grammarAccess.getCalculatedAccess().getRepresentationRepresentationCrossReference_3_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleCalculated2209); 

                	newLeafNode(otherlv_5, grammarAccess.getCalculatedAccess().getByKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1069:1: ( (lv_methodName_6_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1070:1: (lv_methodName_6_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1070:1: (lv_methodName_6_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1071:3: lv_methodName_6_0= RULE_ID
            {
            lv_methodName_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated2226); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1087:2: (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1087:4: otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleCalculated2244); 

                        	newLeafNode(otherlv_7, grammarAccess.getCalculatedAccess().getCommaKeyword_6_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1091:1: ( (lv_methodNameOut_8_0= RULE_ID ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1092:1: (lv_methodNameOut_8_0= RULE_ID )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1092:1: (lv_methodNameOut_8_0= RULE_ID )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1093:3: lv_methodNameOut_8_0= RULE_ID
                    {
                    lv_methodNameOut_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated2261); 

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

            otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleCalculated2280); 

                	newLeafNode(otherlv_9, grammarAccess.getCalculatedAccess().getWithKeyword_7());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1113:1: ( (lv_parameter_10_0= ruleParameter ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1114:1: (lv_parameter_10_0= ruleParameter )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1114:1: (lv_parameter_10_0= ruleParameter )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1115:3: lv_parameter_10_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleCalculated2301);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1131:2: (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1131:4: otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleCalculated2314); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCalculatedAccess().getCommaKeyword_9_0());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1135:1: ( (lv_parameter_12_0= ruleParameter ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1136:1: (lv_parameter_12_0= ruleParameter )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1136:1: (lv_parameter_12_0= ruleParameter )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1137:3: lv_parameter_12_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleCalculated2335);
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
            	    break loop21;
                }
            } while (true);

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1153:4: (otherlv_13= 'description' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==18) ) {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3==RULE_STRING) ) {
                        alt22=1;
                    }
                }
            }
            switch (alt22) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1153:6: otherlv_13= 'description' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleCalculated2350); 

                        	newLeafNode(otherlv_13, grammarAccess.getCalculatedAccess().getDescriptionKeyword_10_0());
                        
                    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleCalculated2362); 

                        	newLeafNode(otherlv_14, grammarAccess.getCalculatedAccess().getColonKeyword_10_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1161:1: ( (lv_description_15_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1162:1: (lv_description_15_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1162:1: (lv_description_15_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1163:3: lv_description_15_0= RULE_STRING
                    {
                    lv_description_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCalculated2379); 

                    			newLeafNode(lv_description_15_0, grammarAccess.getCalculatedAccess().getDescriptionSTRINGTerminalRuleCall_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCalculatedRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_15_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1179:4: (otherlv_16= 'id' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==18) ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3==RULE_STRING) ) {
                        alt23=1;
                    }
                }
            }
            switch (alt23) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1179:6: otherlv_16= 'id' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,29,FOLLOW_29_in_ruleCalculated2399); 

                        	newLeafNode(otherlv_16, grammarAccess.getCalculatedAccess().getIdKeyword_11_0());
                        
                    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleCalculated2411); 

                        	newLeafNode(otherlv_17, grammarAccess.getCalculatedAccess().getColonKeyword_11_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1187:1: ( (lv_ID_18_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1188:1: (lv_ID_18_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1188:1: (lv_ID_18_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1189:3: lv_ID_18_0= RULE_STRING
                    {
                    lv_ID_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCalculated2428); 

                    			newLeafNode(lv_ID_18_0, grammarAccess.getCalculatedAccess().getIDSTRINGTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCalculatedRule());
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


            }


            }

             leaveRule(); 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1213:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1214:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1215:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2471);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2481); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1222:1: ruleParameter returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_argumentType_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1225:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1226:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1226:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1226:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleParameter2518); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1230:1: ( (otherlv_1= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1231:1: (otherlv_1= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1231:1: (otherlv_1= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1232:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2538); 

            		newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getDatafieldDatafieldCrossReference_1_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1243:2: (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1243:4: otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleParameter2551); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getAsKeyword_2_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1247:1: ( (lv_argumentType_3_0= ruleArgumentType ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1248:1: (lv_argumentType_3_0= ruleArgumentType )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1248:1: (lv_argumentType_3_0= ruleArgumentType )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1249:3: lv_argumentType_3_0= ruleArgumentType
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getArgumentTypeArgumentTypeEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgumentType_in_ruleParameter2572);
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

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleParameter2586); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1277:1: entryRuleDatastructure returns [EObject current=null] : iv_ruleDatastructure= ruleDatastructure EOF ;
    public final EObject entryRuleDatastructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatastructure = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1278:2: (iv_ruleDatastructure= ruleDatastructure EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1279:2: iv_ruleDatastructure= ruleDatastructure EOF
            {
             newCompositeNode(grammarAccess.getDatastructureRule()); 
            pushFollow(FOLLOW_ruleDatastructure_in_entryRuleDatastructure2622);
            iv_ruleDatastructure=ruleDatastructure();

            state._fsp--;

             current =iv_ruleDatastructure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatastructure2632); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1286:1: ruleDatastructure returns [EObject current=null] : (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleDatastructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_ID_9_0=null;
        Token otherlv_10=null;
        EObject lv_datafields_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1289:28: ( (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1290:1: (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1290:1: (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1290:3: otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleDatastructure2669); 

                	newLeafNode(otherlv_0, grammarAccess.getDatastructureAccess().getSetKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1294:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1295:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1295:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1296:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatastructure2686); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDatastructure2703); 

                	newLeafNode(otherlv_2, grammarAccess.getDatastructureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1316:1: ( (lv_datafields_3_0= ruleDatafield ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30||(LA25_0>=33 && LA25_0<=36)||LA25_0==41) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1317:1: (lv_datafields_3_0= ruleDatafield )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1317:1: (lv_datafields_3_0= ruleDatafield )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1318:3: lv_datafields_3_0= ruleDatafield
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDatastructureAccess().getDatafieldsDatafieldParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDatafield_in_ruleDatastructure2724);
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
            	    break loop25;
                }
            } while (true);

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1334:3: (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1334:5: otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleDatastructure2738); 

                        	newLeafNode(otherlv_4, grammarAccess.getDatastructureAccess().getDescriptionKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDatastructure2750); 

                        	newLeafNode(otherlv_5, grammarAccess.getDatastructureAccess().getColonKeyword_4_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1342:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1343:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1343:1: (lv_description_6_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1344:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDatastructure2767); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getDatastructureAccess().getDescriptionSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDatastructureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1360:4: (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1360:6: otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleDatastructure2787); 

                        	newLeafNode(otherlv_7, grammarAccess.getDatastructureAccess().getIdKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleDatastructure2799); 

                        	newLeafNode(otherlv_8, grammarAccess.getDatastructureAccess().getColonKeyword_5_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1368:1: ( (lv_ID_9_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1369:1: (lv_ID_9_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1369:1: (lv_ID_9_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1370:3: lv_ID_9_0= RULE_STRING
                    {
                    lv_ID_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDatastructure2816); 

                    			newLeafNode(lv_ID_9_0, grammarAccess.getDatastructureAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDatastructureRule());
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

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleDatastructure2835); 

                	newLeafNode(otherlv_10, grammarAccess.getDatastructureAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleConstraint"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1398:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1399:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1400:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint2871);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint2881); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1407:1: ruleConstraint returns [EObject current=null] : this_DataConstraint_0= ruleDataConstraint ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_DataConstraint_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1410:28: (this_DataConstraint_0= ruleDataConstraint )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1412:5: this_DataConstraint_0= ruleDataConstraint
            {
             
                    newCompositeNode(grammarAccess.getConstraintAccess().getDataConstraintParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleDataConstraint_in_ruleConstraint2927);
            this_DataConstraint_0=ruleDataConstraint();

            state._fsp--;

             
                    current = this_DataConstraint_0; 
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleDataConstraint"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1428:1: entryRuleDataConstraint returns [EObject current=null] : iv_ruleDataConstraint= ruleDataConstraint EOF ;
    public final EObject entryRuleDataConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataConstraint = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1429:2: (iv_ruleDataConstraint= ruleDataConstraint EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1430:2: iv_ruleDataConstraint= ruleDataConstraint EOF
            {
             newCompositeNode(grammarAccess.getDataConstraintRule()); 
            pushFollow(FOLLOW_ruleDataConstraint_in_entryRuleDataConstraint2961);
            iv_ruleDataConstraint=ruleDataConstraint();

            state._fsp--;

             current =iv_ruleDataConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataConstraint2971); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1437:1: ruleDataConstraint returns [EObject current=null] : (this_DataRange_0= ruleDataRange | this_DataAdaption_1= ruleDataAdaption ) ;
    public final EObject ruleDataConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_DataRange_0 = null;

        EObject this_DataAdaption_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1440:28: ( (this_DataRange_0= ruleDataRange | this_DataAdaption_1= ruleDataAdaption ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1441:1: (this_DataRange_0= ruleDataRange | this_DataAdaption_1= ruleDataAdaption )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1441:1: (this_DataRange_0= ruleDataRange | this_DataAdaption_1= ruleDataAdaption )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            else if ( (LA28_0==38) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1442:5: this_DataRange_0= ruleDataRange
                    {
                     
                            newCompositeNode(grammarAccess.getDataConstraintAccess().getDataRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataRange_in_ruleDataConstraint3018);
                    this_DataRange_0=ruleDataRange();

                    state._fsp--;

                     
                            current = this_DataRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1452:5: this_DataAdaption_1= ruleDataAdaption
                    {
                     
                            newCompositeNode(grammarAccess.getDataConstraintAccess().getDataAdaptionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataAdaption_in_ruleDataConstraint3045);
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1468:1: entryRuleDataRange returns [EObject current=null] : iv_ruleDataRange= ruleDataRange EOF ;
    public final EObject entryRuleDataRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataRange = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1469:2: (iv_ruleDataRange= ruleDataRange EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1470:2: iv_ruleDataRange= ruleDataRange EOF
            {
             newCompositeNode(grammarAccess.getDataRangeRule()); 
            pushFollow(FOLLOW_ruleDataRange_in_entryRuleDataRange3080);
            iv_ruleDataRange=ruleDataRange();

            state._fsp--;

             current =iv_ruleDataRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataRange3090); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1477:1: ruleDataRange returns [EObject current=null] : (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) ) (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDataRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_ID_9_0=null;
        EObject lv_lowerBound_1_0 = null;

        EObject lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1480:28: ( (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) ) (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1481:1: (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) ) (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1481:1: (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) ) (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1481:3: otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) ) (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleDataRange3127); 

                	newLeafNode(otherlv_0, grammarAccess.getDataRangeAccess().getFromKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1485:1: ( (lv_lowerBound_1_0= ruleBound ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1486:1: (lv_lowerBound_1_0= ruleBound )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1486:1: (lv_lowerBound_1_0= ruleBound )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1487:3: lv_lowerBound_1_0= ruleBound
            {
             
            	        newCompositeNode(grammarAccess.getDataRangeAccess().getLowerBoundBoundParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBound_in_ruleDataRange3148);
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

            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleDataRange3160); 

                	newLeafNode(otherlv_2, grammarAccess.getDataRangeAccess().getToKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1507:1: ( (lv_upperBound_3_0= ruleBound ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1508:1: (lv_upperBound_3_0= ruleBound )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1508:1: (lv_upperBound_3_0= ruleBound )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1509:3: lv_upperBound_3_0= ruleBound
            {
             
            	        newCompositeNode(grammarAccess.getDataRangeAccess().getUpperBoundBoundParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBound_in_ruleDataRange3181);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1525:2: (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==18) ) {
                    int LA29_3 = input.LA(3);

                    if ( (LA29_3==RULE_STRING) ) {
                        alt29=1;
                    }
                }
            }
            switch (alt29) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1525:4: otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleDataRange3194); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataRangeAccess().getDescriptionKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDataRange3206); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataRangeAccess().getColonKeyword_4_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1533:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1534:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1534:1: (lv_description_6_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1535:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataRange3223); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getDataRangeAccess().getDescriptionSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataRangeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1551:4: (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==18) ) {
                    int LA30_3 = input.LA(3);

                    if ( (LA30_3==RULE_STRING) ) {
                        alt30=1;
                    }
                }
            }
            switch (alt30) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1551:6: otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleDataRange3243); 

                        	newLeafNode(otherlv_7, grammarAccess.getDataRangeAccess().getIdKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleDataRange3255); 

                        	newLeafNode(otherlv_8, grammarAccess.getDataRangeAccess().getColonKeyword_5_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1559:1: ( (lv_ID_9_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1560:1: (lv_ID_9_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1560:1: (lv_ID_9_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1561:3: lv_ID_9_0= RULE_STRING
                    {
                    lv_ID_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataRange3272); 

                    			newLeafNode(lv_ID_9_0, grammarAccess.getDataRangeAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataRangeRule());
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


            }


            }

             leaveRule(); 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1585:1: entryRuleDataAdaption returns [EObject current=null] : iv_ruleDataAdaption= ruleDataAdaption EOF ;
    public final EObject entryRuleDataAdaption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAdaption = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1586:2: (iv_ruleDataAdaption= ruleDataAdaption EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1587:2: iv_ruleDataAdaption= ruleDataAdaption EOF
            {
             newCompositeNode(grammarAccess.getDataAdaptionRule()); 
            pushFollow(FOLLOW_ruleDataAdaption_in_entryRuleDataAdaption3315);
            iv_ruleDataAdaption=ruleDataAdaption();

            state._fsp--;

             current =iv_ruleDataAdaption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAdaption3325); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1594:1: ruleDataAdaption returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDataAdaption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_ID_13_0=null;
        AntlrDatatypeRuleToken lv_scalingFactor_3_0 = null;

        AntlrDatatypeRuleToken lv_offset_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1597:28: ( (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1598:1: (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1598:1: (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1598:3: otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleDataAdaption3362); 

                	newLeafNode(otherlv_0, grammarAccess.getDataAdaptionAccess().getWithKeyword_0());
                
            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleDataAdaption3374); 

                	newLeafNode(otherlv_1, grammarAccess.getDataAdaptionAccess().getScalingFactorKeyword_1());
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleDataAdaption3386); 

                	newLeafNode(otherlv_2, grammarAccess.getDataAdaptionAccess().getColonKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1610:1: ( (lv_scalingFactor_3_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1611:1: (lv_scalingFactor_3_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1611:1: (lv_scalingFactor_3_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1612:3: lv_scalingFactor_3_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getDataAdaptionAccess().getScalingFactorDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleDataAdaption3407);
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

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleDataAdaption3419); 

                	newLeafNode(otherlv_4, grammarAccess.getDataAdaptionAccess().getAndKeyword_4());
                
            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleDataAdaption3431); 

                	newLeafNode(otherlv_5, grammarAccess.getDataAdaptionAccess().getOffsetKeyword_5());
                
            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleDataAdaption3443); 

                	newLeafNode(otherlv_6, grammarAccess.getDataAdaptionAccess().getColonKeyword_6());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1640:1: ( (lv_offset_7_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1641:1: (lv_offset_7_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1641:1: (lv_offset_7_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1642:3: lv_offset_7_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getDataAdaptionAccess().getOffsetDOUBLEParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleDataAdaption3464);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1658:2: (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==18) ) {
                    int LA31_3 = input.LA(3);

                    if ( (LA31_3==RULE_STRING) ) {
                        alt31=1;
                    }
                }
            }
            switch (alt31) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1658:4: otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleDataAdaption3477); 

                        	newLeafNode(otherlv_8, grammarAccess.getDataAdaptionAccess().getDescriptionKeyword_8_0());
                        
                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleDataAdaption3489); 

                        	newLeafNode(otherlv_9, grammarAccess.getDataAdaptionAccess().getColonKeyword_8_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1666:1: ( (lv_description_10_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1667:1: (lv_description_10_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1667:1: (lv_description_10_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1668:3: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataAdaption3506); 

                    			newLeafNode(lv_description_10_0, grammarAccess.getDataAdaptionAccess().getDescriptionSTRINGTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataAdaptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1684:4: (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==18) ) {
                    int LA32_3 = input.LA(3);

                    if ( (LA32_3==RULE_STRING) ) {
                        alt32=1;
                    }
                }
            }
            switch (alt32) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1684:6: otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleDataAdaption3526); 

                        	newLeafNode(otherlv_11, grammarAccess.getDataAdaptionAccess().getIdKeyword_9_0());
                        
                    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleDataAdaption3538); 

                        	newLeafNode(otherlv_12, grammarAccess.getDataAdaptionAccess().getColonKeyword_9_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1692:1: ( (lv_ID_13_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1693:1: (lv_ID_13_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1693:1: (lv_ID_13_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1694:3: lv_ID_13_0= RULE_STRING
                    {
                    lv_ID_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataAdaption3555); 

                    			newLeafNode(lv_ID_13_0, grammarAccess.getDataAdaptionAccess().getIDSTRINGTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataAdaptionRule());
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


            }


            }

             leaveRule(); 
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1718:1: entryRuleBound returns [EObject current=null] : iv_ruleBound= ruleBound EOF ;
    public final EObject entryRuleBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1719:2: (iv_ruleBound= ruleBound EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1720:2: iv_ruleBound= ruleBound EOF
            {
             newCompositeNode(grammarAccess.getBoundRule()); 
            pushFollow(FOLLOW_ruleBound_in_entryRuleBound3598);
            iv_ruleBound=ruleBound();

            state._fsp--;

             current =iv_ruleBound; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBound3608); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1727:1: ruleBound returns [EObject current=null] : ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleBound() throws RecognitionException {
        EObject current = null;

        Token lv_unit_1_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1730:28: ( ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1731:1: ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1731:1: ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1731:2: ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) )?
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1731:2: ( (lv_value_0_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1732:1: (lv_value_0_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1732:1: (lv_value_0_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1733:3: lv_value_0_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getBoundAccess().getValueDOUBLEParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleBound3654);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1749:2: ( (lv_unit_1_0= RULE_STRING ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1750:1: (lv_unit_1_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1750:1: (lv_unit_1_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1751:3: lv_unit_1_0= RULE_STRING
                    {
                    lv_unit_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBound3671); 

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
    // $ANTLR end "ruleBound"


    // $ANTLR start "entryRuleDOUBLE"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1775:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1776:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1777:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE3714);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE3725); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1784:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1787:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1788:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1788:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1788:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE3765); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1795:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1796:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleDOUBLE3784); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE3799); 

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


    // $ANTLR start "ruleEndianess"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1816:1: ruleEndianess returns [Enumerator current=null] : ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) ;
    public final Enumerator ruleEndianess() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1818:28: ( ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1819:1: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1819:1: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==48) ) {
                alt35=1;
            }
            else if ( (LA35_0==49) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1819:2: (enumLiteral_0= 'BIG_ENDIAN' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1819:2: (enumLiteral_0= 'BIG_ENDIAN' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1819:4: enumLiteral_0= 'BIG_ENDIAN'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleEndianess3860); 

                            current = grammarAccess.getEndianessAccess().getBIG_ENDIANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEndianessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1825:6: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1825:6: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1825:8: enumLiteral_1= 'LITTLE_ENDIAN'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleEndianess3877); 

                            current = grammarAccess.getEndianessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEndianessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleEndianess"


    // $ANTLR start "ruleGenerationLanguage"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1835:1: ruleGenerationLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'CSHARP' ) ) ;
    public final Enumerator ruleGenerationLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1837:28: ( ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'CSHARP' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1838:1: ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'CSHARP' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1838:1: ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'CSHARP' ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt36=1;
                }
                break;
            case 51:
                {
                alt36=2;
                }
                break;
            case 52:
                {
                alt36=3;
                }
                break;
            case 53:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1838:2: (enumLiteral_0= 'JAVA' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1838:2: (enumLiteral_0= 'JAVA' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1838:4: enumLiteral_0= 'JAVA'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleGenerationLanguage3922); 

                            current = grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1844:6: (enumLiteral_1= 'CPP' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1844:6: (enumLiteral_1= 'CPP' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1844:8: enumLiteral_1= 'CPP'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_ruleGenerationLanguage3939); 

                            current = grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1850:6: (enumLiteral_2= 'C' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1850:6: (enumLiteral_2= 'C' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1850:8: enumLiteral_2= 'C'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_52_in_ruleGenerationLanguage3956); 

                            current = grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1856:6: (enumLiteral_3= 'CSHARP' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1856:6: (enumLiteral_3= 'CSHARP' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1856:8: enumLiteral_3= 'CSHARP'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_53_in_ruleGenerationLanguage3973); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1866:1: ruleArgumentType returns [Enumerator current=null] : (enumLiteral_0= 'BYTE_ARRAY' ) ;
    public final Enumerator ruleArgumentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1868:28: ( (enumLiteral_0= 'BYTE_ARRAY' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1869:1: (enumLiteral_0= 'BYTE_ARRAY' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1869:1: (enumLiteral_0= 'BYTE_ARRAY' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1869:3: enumLiteral_0= 'BYTE_ARRAY'
            {
            enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleArgumentType4017); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1879:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'BOOL' ) | (enumLiteral_1= 'CHAR' ) | (enumLiteral_2= 'SHORT' ) | (enumLiteral_3= 'INT' ) | (enumLiteral_4= 'LONG' ) | (enumLiteral_5= 'LONGLONG' ) | (enumLiteral_6= 'FLOAT' ) | (enumLiteral_7= 'DOUBLE' ) | (enumLiteral_8= 'LONGDOUBLE' ) ) ;
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
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1881:28: ( ( (enumLiteral_0= 'BOOL' ) | (enumLiteral_1= 'CHAR' ) | (enumLiteral_2= 'SHORT' ) | (enumLiteral_3= 'INT' ) | (enumLiteral_4= 'LONG' ) | (enumLiteral_5= 'LONGLONG' ) | (enumLiteral_6= 'FLOAT' ) | (enumLiteral_7= 'DOUBLE' ) | (enumLiteral_8= 'LONGDOUBLE' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1882:1: ( (enumLiteral_0= 'BOOL' ) | (enumLiteral_1= 'CHAR' ) | (enumLiteral_2= 'SHORT' ) | (enumLiteral_3= 'INT' ) | (enumLiteral_4= 'LONG' ) | (enumLiteral_5= 'LONGLONG' ) | (enumLiteral_6= 'FLOAT' ) | (enumLiteral_7= 'DOUBLE' ) | (enumLiteral_8= 'LONGDOUBLE' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1882:1: ( (enumLiteral_0= 'BOOL' ) | (enumLiteral_1= 'CHAR' ) | (enumLiteral_2= 'SHORT' ) | (enumLiteral_3= 'INT' ) | (enumLiteral_4= 'LONG' ) | (enumLiteral_5= 'LONGLONG' ) | (enumLiteral_6= 'FLOAT' ) | (enumLiteral_7= 'DOUBLE' ) | (enumLiteral_8= 'LONGDOUBLE' ) )
            int alt37=9;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt37=1;
                }
                break;
            case 56:
                {
                alt37=2;
                }
                break;
            case 57:
                {
                alt37=3;
                }
                break;
            case 58:
                {
                alt37=4;
                }
                break;
            case 59:
                {
                alt37=5;
                }
                break;
            case 60:
                {
                alt37=6;
                }
                break;
            case 61:
                {
                alt37=7;
                }
                break;
            case 62:
                {
                alt37=8;
                }
                break;
            case 63:
                {
                alt37=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1882:2: (enumLiteral_0= 'BOOL' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1882:2: (enumLiteral_0= 'BOOL' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1882:4: enumLiteral_0= 'BOOL'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleType4061); 

                            current = grammarAccess.getTypeAccess().getBOOLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getBOOLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1888:6: (enumLiteral_1= 'CHAR' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1888:6: (enumLiteral_1= 'CHAR' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1888:8: enumLiteral_1= 'CHAR'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleType4078); 

                            current = grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1894:6: (enumLiteral_2= 'SHORT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1894:6: (enumLiteral_2= 'SHORT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1894:8: enumLiteral_2= 'SHORT'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_57_in_ruleType4095); 

                            current = grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1900:6: (enumLiteral_3= 'INT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1900:6: (enumLiteral_3= 'INT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1900:8: enumLiteral_3= 'INT'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_58_in_ruleType4112); 

                            current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1906:6: (enumLiteral_4= 'LONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1906:6: (enumLiteral_4= 'LONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1906:8: enumLiteral_4= 'LONG'
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_59_in_ruleType4129); 

                            current = grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1912:6: (enumLiteral_5= 'LONGLONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1912:6: (enumLiteral_5= 'LONGLONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1912:8: enumLiteral_5= 'LONGLONG'
                    {
                    enumLiteral_5=(Token)match(input,60,FOLLOW_60_in_ruleType4146); 

                            current = grammarAccess.getTypeAccess().getLONGLONGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getLONGLONGEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1918:6: (enumLiteral_6= 'FLOAT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1918:6: (enumLiteral_6= 'FLOAT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1918:8: enumLiteral_6= 'FLOAT'
                    {
                    enumLiteral_6=(Token)match(input,61,FOLLOW_61_in_ruleType4163); 

                            current = grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1924:6: (enumLiteral_7= 'DOUBLE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1924:6: (enumLiteral_7= 'DOUBLE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1924:8: enumLiteral_7= 'DOUBLE'
                    {
                    enumLiteral_7=(Token)match(input,62,FOLLOW_62_in_ruleType4180); 

                            current = grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1930:6: (enumLiteral_8= 'LONGDOUBLE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1930:6: (enumLiteral_8= 'LONGDOUBLE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1930:8: enumLiteral_8= 'LONGDOUBLE'
                    {
                    enumLiteral_8=(Token)match(input,63,FOLLOW_63_in_ruleType4197); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDataModel122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataModel134 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDataModel146 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataModel158 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOptions_in_ruleDataModel179 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataModel191 = new BitSet(new long[]{0x0000021E40C08000L});
    public static final BitSet FOLLOW_ruleRepresentation_in_ruleDataModel213 = new BitSet(new long[]{0x0000021E40C08000L});
    public static final BitSet FOLLOW_ruleDatafield_in_ruleDataModel240 = new BitSet(new long[]{0x0000021E40C08000L});
    public static final BitSet FOLLOW_15_in_ruleDataModel254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel274 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_ruleDataModel287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel307 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleDataModel321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptions_in_entryRuleOptions357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptions367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOptions415 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions427 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_ruleEndianess_in_ruleOptions448 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOptions462 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOptions474 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions486 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_ruleOptions507 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOptions521 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOptions533 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions545 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_ruleOptions566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepresentation_in_entryRuleRepresentation606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepresentation616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRepresentation654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23_in_ruleRepresentation672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepresentation690 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRepresentation707 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepresentation724 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleRepresentation742 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26_in_ruleRepresentation760 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRepresentation773 = new BitSet(new long[]{0xFF80000000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleRepresentation794 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_ruleRepresentation807 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRepresentation819 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRepresentation836 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleRepresentation856 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRepresentation868 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRepresentation885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatafield_in_entryRuleDatafield928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatafield938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableData_in_ruleDatafield985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantData_in_ruleDatafield1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatastructure_in_ruleDatafield1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_ruleDatafield1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableData_in_entryRuleVariableData1101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableData1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasuredData_in_ruleVariableData1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasuredData_in_ruleVariableData1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasuredData_in_entryRuleMeasuredData1220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasuredData1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMeasuredData1267 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMeasuredData1279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeasuredData1296 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_27_in_ruleMeasuredData1314 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleMeasuredData1335 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasuredData1353 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleMeasuredData1372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeasuredData1392 = new BitSet(new long[]{0x0000044030000002L});
    public static final BitSet FOLLOW_28_in_ruleMeasuredData1405 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMeasuredData1417 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasuredData1434 = new BitSet(new long[]{0x0000044020000002L});
    public static final BitSet FOLLOW_29_in_ruleMeasuredData1454 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMeasuredData1466 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasuredData1483 = new BitSet(new long[]{0x0000044000000002L});
    public static final BitSet FOLLOW_ruleDataConstraint_in_ruleMeasuredData1511 = new BitSet(new long[]{0x0000044000000002L});
    public static final BitSet FOLLOW_ruleNonMeasuredData_in_entryRuleNonMeasuredData1548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonMeasuredData1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleNonMeasuredData1595 = new BitSet(new long[]{0xFF80000000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleNonMeasuredData1616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonMeasuredData1633 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleNonMeasuredData1650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonMeasuredData1670 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_ruleNonMeasuredData1683 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNonMeasuredData1695 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasuredData1712 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleNonMeasuredData1732 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNonMeasuredData1744 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasuredData1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantData_in_entryRuleConstantData1804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantData1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleConstantData1851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantData1868 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleConstantData1885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantData1905 = new BitSet(new long[]{0x0000000031000002L});
    public static final BitSet FOLLOW_24_in_ruleConstantData1918 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantData1935 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_ruleConstantData1955 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConstantData1967 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantData1984 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleConstantData2004 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConstantData2016 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantData2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_entryRuleCalculated2076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalculated2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCalculated2124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_36_in_ruleCalculated2142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated2160 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCalculated2177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated2197 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCalculated2209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated2226 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_16_in_ruleCalculated2244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated2261 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCalculated2280 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCalculated2301 = new BitSet(new long[]{0x0000000030010002L});
    public static final BitSet FOLLOW_16_in_ruleCalculated2314 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCalculated2335 = new BitSet(new long[]{0x0000000030010002L});
    public static final BitSet FOLLOW_28_in_ruleCalculated2350 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCalculated2362 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCalculated2379 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleCalculated2399 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCalculated2411 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCalculated2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleParameter2518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2538 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_32_in_ruleParameter2551 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleArgumentType_in_ruleParameter2572 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleParameter2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatastructure_in_entryRuleDatastructure2622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatastructure2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDatastructure2669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatastructure2686 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDatastructure2703 = new BitSet(new long[]{0x0000021E70C04000L});
    public static final BitSet FOLLOW_ruleDatafield_in_ruleDatastructure2724 = new BitSet(new long[]{0x0000021E70C04000L});
    public static final BitSet FOLLOW_28_in_ruleDatastructure2738 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDatastructure2750 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDatastructure2767 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_29_in_ruleDatastructure2787 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDatastructure2799 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDatastructure2816 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDatastructure2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint2871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConstraint_in_ruleConstraint2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConstraint_in_entryRuleDataConstraint2961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataConstraint2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_ruleDataConstraint3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdaption_in_ruleDataConstraint3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_entryRuleDataRange3080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataRange3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDataRange3127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBound_in_ruleDataRange3148 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleDataRange3160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBound_in_ruleDataRange3181 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_ruleDataRange3194 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataRange3206 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataRange3223 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleDataRange3243 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataRange3255 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataRange3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdaption_in_entryRuleDataAdaption3315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAdaption3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDataAdaption3362 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDataAdaption3374 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataAdaption3386 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleDataAdaption3407 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleDataAdaption3419 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleDataAdaption3431 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataAdaption3443 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleDataAdaption3464 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_ruleDataAdaption3477 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataAdaption3489 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataAdaption3506 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleDataAdaption3526 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataAdaption3538 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataAdaption3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_entryRuleBound3598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBound3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleBound3654 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBound3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE3714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE3765 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleDOUBLE3784 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEndianess3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEndianess3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleGenerationLanguage3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleGenerationLanguage3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleGenerationLanguage3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleGenerationLanguage3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleArgumentType4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleType4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleType4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleType4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleType4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleType4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleType4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleType4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleType4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleType4197 = new BitSet(new long[]{0x0000000000000002L});

}