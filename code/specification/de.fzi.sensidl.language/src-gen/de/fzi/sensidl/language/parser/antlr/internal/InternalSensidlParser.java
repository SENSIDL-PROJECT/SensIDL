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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datamodel'", "'{'", "'options'", "'}'", "'transmit'", "','", "'endianess'", "':'", "';'", "'sensor'", "'language'", "'alignment'", "'receiver'", "'repr'", "'representation'", "'is'", "'bytes'", "'byte'", "'in'", "'description'", "'id'", "'data'", "'of'", "'as'", "'basicdata'", "'const'", "'calculate'", "'calculated'", "'by'", "'with'", "'('", "')'", "'set'", "'declaration'", "'decl'", "'from'", "'to'", "'scaling factor'", "'and'", "'offset'", "'.'", "'_8BIT'", "'_16BIT'", "'_32BIT'", "'_64BIT'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'JAVA'", "'CPP'", "'C'", "'CSHARP'", "'BYTE_ARRAY'", "'BOOL'", "'CHAR'", "'SHORT'", "'INT'", "'LONG'", "'LONGLONG'", "'FLOAT'", "'DOUBLE'", "'LONGDOUBLE'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
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

                if ( ((LA1_0>=24 && LA1_0<=25)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==32||(LA1_0>=35 && LA1_0<=38)||(LA1_0>=43 && LA1_0<=45)) ) {
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:211:1: ruleOptions returns [EObject current=null] : ( () ( (otherlv_1= 'endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) otherlv_4= ';' ) (otherlv_5= 'sensor' otherlv_6= 'options' otherlv_7= ':' ) (otherlv_8= 'sensor' otherlv_9= 'language' otherlv_10= ':' ( (lv_sensorLanguage_11_0= ruleGenerationLanguage ) ) otherlv_12= ';' ) (otherlv_13= 'sensor' otherlv_14= 'alignment' otherlv_15= ':' ( (lv_sensorAlignment_16_0= ruleAlignment ) ) otherlv_17= ';' ) (otherlv_18= 'receiver' otherlv_19= 'options' otherlv_20= ':' ) (otherlv_21= 'receiver' otherlv_22= 'language' otherlv_23= ':' ( (lv_receiverLanguage_24_0= ruleGenerationLanguage ) ) otherlv_25= ';' ) (otherlv_26= 'receiver' otherlv_27= 'alignment' otherlv_28= ':' ( (lv_receiverAlignment_29_0= ruleAlignment ) ) otherlv_30= ';' ) ) ) ;
    public final EObject ruleOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Enumerator lv_endianess_3_0 = null;

        Enumerator lv_sensorLanguage_11_0 = null;

        Enumerator lv_sensorAlignment_16_0 = null;

        Enumerator lv_receiverLanguage_24_0 = null;

        Enumerator lv_receiverAlignment_29_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:214:28: ( ( () ( (otherlv_1= 'endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) otherlv_4= ';' ) (otherlv_5= 'sensor' otherlv_6= 'options' otherlv_7= ':' ) (otherlv_8= 'sensor' otherlv_9= 'language' otherlv_10= ':' ( (lv_sensorLanguage_11_0= ruleGenerationLanguage ) ) otherlv_12= ';' ) (otherlv_13= 'sensor' otherlv_14= 'alignment' otherlv_15= ':' ( (lv_sensorAlignment_16_0= ruleAlignment ) ) otherlv_17= ';' ) (otherlv_18= 'receiver' otherlv_19= 'options' otherlv_20= ':' ) (otherlv_21= 'receiver' otherlv_22= 'language' otherlv_23= ':' ( (lv_receiverLanguage_24_0= ruleGenerationLanguage ) ) otherlv_25= ';' ) (otherlv_26= 'receiver' otherlv_27= 'alignment' otherlv_28= ':' ( (lv_receiverAlignment_29_0= ruleAlignment ) ) otherlv_30= ';' ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:215:1: ( () ( (otherlv_1= 'endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) otherlv_4= ';' ) (otherlv_5= 'sensor' otherlv_6= 'options' otherlv_7= ':' ) (otherlv_8= 'sensor' otherlv_9= 'language' otherlv_10= ':' ( (lv_sensorLanguage_11_0= ruleGenerationLanguage ) ) otherlv_12= ';' ) (otherlv_13= 'sensor' otherlv_14= 'alignment' otherlv_15= ':' ( (lv_sensorAlignment_16_0= ruleAlignment ) ) otherlv_17= ';' ) (otherlv_18= 'receiver' otherlv_19= 'options' otherlv_20= ':' ) (otherlv_21= 'receiver' otherlv_22= 'language' otherlv_23= ':' ( (lv_receiverLanguage_24_0= ruleGenerationLanguage ) ) otherlv_25= ';' ) (otherlv_26= 'receiver' otherlv_27= 'alignment' otherlv_28= ':' ( (lv_receiverAlignment_29_0= ruleAlignment ) ) otherlv_30= ';' ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:215:1: ( () ( (otherlv_1= 'endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) otherlv_4= ';' ) (otherlv_5= 'sensor' otherlv_6= 'options' otherlv_7= ':' ) (otherlv_8= 'sensor' otherlv_9= 'language' otherlv_10= ':' ( (lv_sensorLanguage_11_0= ruleGenerationLanguage ) ) otherlv_12= ';' ) (otherlv_13= 'sensor' otherlv_14= 'alignment' otherlv_15= ':' ( (lv_sensorAlignment_16_0= ruleAlignment ) ) otherlv_17= ';' ) (otherlv_18= 'receiver' otherlv_19= 'options' otherlv_20= ':' ) (otherlv_21= 'receiver' otherlv_22= 'language' otherlv_23= ':' ( (lv_receiverLanguage_24_0= ruleGenerationLanguage ) ) otherlv_25= ';' ) (otherlv_26= 'receiver' otherlv_27= 'alignment' otherlv_28= ':' ( (lv_receiverAlignment_29_0= ruleAlignment ) ) otherlv_30= ';' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:215:2: () ( (otherlv_1= 'endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) otherlv_4= ';' ) (otherlv_5= 'sensor' otherlv_6= 'options' otherlv_7= ':' ) (otherlv_8= 'sensor' otherlv_9= 'language' otherlv_10= ':' ( (lv_sensorLanguage_11_0= ruleGenerationLanguage ) ) otherlv_12= ';' ) (otherlv_13= 'sensor' otherlv_14= 'alignment' otherlv_15= ':' ( (lv_sensorAlignment_16_0= ruleAlignment ) ) otherlv_17= ';' ) (otherlv_18= 'receiver' otherlv_19= 'options' otherlv_20= ':' ) (otherlv_21= 'receiver' otherlv_22= 'language' otherlv_23= ':' ( (lv_receiverLanguage_24_0= ruleGenerationLanguage ) ) otherlv_25= ';' ) (otherlv_26= 'receiver' otherlv_27= 'alignment' otherlv_28= ':' ( (lv_receiverAlignment_29_0= ruleAlignment ) ) otherlv_30= ';' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:215:2: ()
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:216:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOptionsAccess().getOptionsAction_0(),
                        current);
                

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:2: ( (otherlv_1= 'endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) otherlv_4= ';' ) (otherlv_5= 'sensor' otherlv_6= 'options' otherlv_7= ':' ) (otherlv_8= 'sensor' otherlv_9= 'language' otherlv_10= ':' ( (lv_sensorLanguage_11_0= ruleGenerationLanguage ) ) otherlv_12= ';' ) (otherlv_13= 'sensor' otherlv_14= 'alignment' otherlv_15= ':' ( (lv_sensorAlignment_16_0= ruleAlignment ) ) otherlv_17= ';' ) (otherlv_18= 'receiver' otherlv_19= 'options' otherlv_20= ':' ) (otherlv_21= 'receiver' otherlv_22= 'language' otherlv_23= ':' ( (lv_receiverLanguage_24_0= ruleGenerationLanguage ) ) otherlv_25= ';' ) (otherlv_26= 'receiver' otherlv_27= 'alignment' otherlv_28= ':' ( (lv_receiverAlignment_29_0= ruleAlignment ) ) otherlv_30= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:3: (otherlv_1= 'endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) otherlv_4= ';' ) (otherlv_5= 'sensor' otherlv_6= 'options' otherlv_7= ':' ) (otherlv_8= 'sensor' otherlv_9= 'language' otherlv_10= ':' ( (lv_sensorLanguage_11_0= ruleGenerationLanguage ) ) otherlv_12= ';' ) (otherlv_13= 'sensor' otherlv_14= 'alignment' otherlv_15= ':' ( (lv_sensorAlignment_16_0= ruleAlignment ) ) otherlv_17= ';' ) (otherlv_18= 'receiver' otherlv_19= 'options' otherlv_20= ':' ) (otherlv_21= 'receiver' otherlv_22= 'language' otherlv_23= ':' ( (lv_receiverLanguage_24_0= ruleGenerationLanguage ) ) otherlv_25= ';' ) (otherlv_26= 'receiver' otherlv_27= 'alignment' otherlv_28= ':' ( (lv_receiverAlignment_29_0= ruleAlignment ) ) otherlv_30= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:3: (otherlv_1= 'endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) otherlv_4= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:221:5: otherlv_1= 'endianess' otherlv_2= ':' ( (lv_endianess_3_0= ruleEndianess ) ) otherlv_4= ';'
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleOptions460); 

                	newLeafNode(otherlv_4, grammarAccess.getOptionsAccess().getSemicolonKeyword_1_0_3());
                

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:251:2: (otherlv_5= 'sensor' otherlv_6= 'options' otherlv_7= ':' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:251:4: otherlv_5= 'sensor' otherlv_6= 'options' otherlv_7= ':'
            {
            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleOptions474); 

                	newLeafNode(otherlv_5, grammarAccess.getOptionsAccess().getSensorKeyword_1_1_0());
                
            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleOptions486); 

                	newLeafNode(otherlv_6, grammarAccess.getOptionsAccess().getOptionsKeyword_1_1_1());
                
            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleOptions498); 

                	newLeafNode(otherlv_7, grammarAccess.getOptionsAccess().getColonKeyword_1_1_2());
                

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:263:2: (otherlv_8= 'sensor' otherlv_9= 'language' otherlv_10= ':' ( (lv_sensorLanguage_11_0= ruleGenerationLanguage ) ) otherlv_12= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:263:4: otherlv_8= 'sensor' otherlv_9= 'language' otherlv_10= ':' ( (lv_sensorLanguage_11_0= ruleGenerationLanguage ) ) otherlv_12= ';'
            {
            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleOptions512); 

                	newLeafNode(otherlv_8, grammarAccess.getOptionsAccess().getSensorKeyword_1_2_0());
                
            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleOptions524); 

                	newLeafNode(otherlv_9, grammarAccess.getOptionsAccess().getLanguageKeyword_1_2_1());
                
            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleOptions536); 

                	newLeafNode(otherlv_10, grammarAccess.getOptionsAccess().getColonKeyword_1_2_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:275:1: ( (lv_sensorLanguage_11_0= ruleGenerationLanguage ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:276:1: (lv_sensorLanguage_11_0= ruleGenerationLanguage )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:276:1: (lv_sensorLanguage_11_0= ruleGenerationLanguage )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:277:3: lv_sensorLanguage_11_0= ruleGenerationLanguage
            {
             
            	        newCompositeNode(grammarAccess.getOptionsAccess().getSensorLanguageGenerationLanguageEnumRuleCall_1_2_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGenerationLanguage_in_ruleOptions557);
            lv_sensorLanguage_11_0=ruleGenerationLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionsRule());
            	        }
                   		set(
                   			current, 
                   			"sensorLanguage",
                    		lv_sensorLanguage_11_0, 
                    		"GenerationLanguage");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleOptions569); 

                	newLeafNode(otherlv_12, grammarAccess.getOptionsAccess().getSemicolonKeyword_1_2_4());
                

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:297:2: (otherlv_13= 'sensor' otherlv_14= 'alignment' otherlv_15= ':' ( (lv_sensorAlignment_16_0= ruleAlignment ) ) otherlv_17= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:297:4: otherlv_13= 'sensor' otherlv_14= 'alignment' otherlv_15= ':' ( (lv_sensorAlignment_16_0= ruleAlignment ) ) otherlv_17= ';'
            {
            otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleOptions583); 

                	newLeafNode(otherlv_13, grammarAccess.getOptionsAccess().getSensorKeyword_1_3_0());
                
            otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleOptions595); 

                	newLeafNode(otherlv_14, grammarAccess.getOptionsAccess().getAlignmentKeyword_1_3_1());
                
            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleOptions607); 

                	newLeafNode(otherlv_15, grammarAccess.getOptionsAccess().getColonKeyword_1_3_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:309:1: ( (lv_sensorAlignment_16_0= ruleAlignment ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:310:1: (lv_sensorAlignment_16_0= ruleAlignment )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:310:1: (lv_sensorAlignment_16_0= ruleAlignment )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:311:3: lv_sensorAlignment_16_0= ruleAlignment
            {
             
            	        newCompositeNode(grammarAccess.getOptionsAccess().getSensorAlignmentAlignmentEnumRuleCall_1_3_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAlignment_in_ruleOptions628);
            lv_sensorAlignment_16_0=ruleAlignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionsRule());
            	        }
                   		set(
                   			current, 
                   			"sensorAlignment",
                    		lv_sensorAlignment_16_0, 
                    		"Alignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleOptions640); 

                	newLeafNode(otherlv_17, grammarAccess.getOptionsAccess().getSemicolonKeyword_1_3_4());
                

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:331:2: (otherlv_18= 'receiver' otherlv_19= 'options' otherlv_20= ':' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:331:4: otherlv_18= 'receiver' otherlv_19= 'options' otherlv_20= ':'
            {
            otherlv_18=(Token)match(input,23,FOLLOW_23_in_ruleOptions654); 

                	newLeafNode(otherlv_18, grammarAccess.getOptionsAccess().getReceiverKeyword_1_4_0());
                
            otherlv_19=(Token)match(input,13,FOLLOW_13_in_ruleOptions666); 

                	newLeafNode(otherlv_19, grammarAccess.getOptionsAccess().getOptionsKeyword_1_4_1());
                
            otherlv_20=(Token)match(input,18,FOLLOW_18_in_ruleOptions678); 

                	newLeafNode(otherlv_20, grammarAccess.getOptionsAccess().getColonKeyword_1_4_2());
                

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:343:2: (otherlv_21= 'receiver' otherlv_22= 'language' otherlv_23= ':' ( (lv_receiverLanguage_24_0= ruleGenerationLanguage ) ) otherlv_25= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:343:4: otherlv_21= 'receiver' otherlv_22= 'language' otherlv_23= ':' ( (lv_receiverLanguage_24_0= ruleGenerationLanguage ) ) otherlv_25= ';'
            {
            otherlv_21=(Token)match(input,23,FOLLOW_23_in_ruleOptions692); 

                	newLeafNode(otherlv_21, grammarAccess.getOptionsAccess().getReceiverKeyword_1_5_0());
                
            otherlv_22=(Token)match(input,21,FOLLOW_21_in_ruleOptions704); 

                	newLeafNode(otherlv_22, grammarAccess.getOptionsAccess().getLanguageKeyword_1_5_1());
                
            otherlv_23=(Token)match(input,18,FOLLOW_18_in_ruleOptions716); 

                	newLeafNode(otherlv_23, grammarAccess.getOptionsAccess().getColonKeyword_1_5_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:355:1: ( (lv_receiverLanguage_24_0= ruleGenerationLanguage ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:356:1: (lv_receiverLanguage_24_0= ruleGenerationLanguage )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:356:1: (lv_receiverLanguage_24_0= ruleGenerationLanguage )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:357:3: lv_receiverLanguage_24_0= ruleGenerationLanguage
            {
             
            	        newCompositeNode(grammarAccess.getOptionsAccess().getReceiverLanguageGenerationLanguageEnumRuleCall_1_5_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGenerationLanguage_in_ruleOptions737);
            lv_receiverLanguage_24_0=ruleGenerationLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionsRule());
            	        }
                   		set(
                   			current, 
                   			"receiverLanguage",
                    		lv_receiverLanguage_24_0, 
                    		"GenerationLanguage");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_25=(Token)match(input,19,FOLLOW_19_in_ruleOptions749); 

                	newLeafNode(otherlv_25, grammarAccess.getOptionsAccess().getSemicolonKeyword_1_5_4());
                

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:377:2: (otherlv_26= 'receiver' otherlv_27= 'alignment' otherlv_28= ':' ( (lv_receiverAlignment_29_0= ruleAlignment ) ) otherlv_30= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:377:4: otherlv_26= 'receiver' otherlv_27= 'alignment' otherlv_28= ':' ( (lv_receiverAlignment_29_0= ruleAlignment ) ) otherlv_30= ';'
            {
            otherlv_26=(Token)match(input,23,FOLLOW_23_in_ruleOptions763); 

                	newLeafNode(otherlv_26, grammarAccess.getOptionsAccess().getReceiverKeyword_1_6_0());
                
            otherlv_27=(Token)match(input,22,FOLLOW_22_in_ruleOptions775); 

                	newLeafNode(otherlv_27, grammarAccess.getOptionsAccess().getAlignmentKeyword_1_6_1());
                
            otherlv_28=(Token)match(input,18,FOLLOW_18_in_ruleOptions787); 

                	newLeafNode(otherlv_28, grammarAccess.getOptionsAccess().getColonKeyword_1_6_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:389:1: ( (lv_receiverAlignment_29_0= ruleAlignment ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:390:1: (lv_receiverAlignment_29_0= ruleAlignment )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:390:1: (lv_receiverAlignment_29_0= ruleAlignment )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:391:3: lv_receiverAlignment_29_0= ruleAlignment
            {
             
            	        newCompositeNode(grammarAccess.getOptionsAccess().getReceiverAlignmentAlignmentEnumRuleCall_1_6_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAlignment_in_ruleOptions808);
            lv_receiverAlignment_29_0=ruleAlignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionsRule());
            	        }
                   		set(
                   			current, 
                   			"receiverAlignment",
                    		lv_receiverAlignment_29_0, 
                    		"Alignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_30=(Token)match(input,19,FOLLOW_19_in_ruleOptions820); 

                	newLeafNode(otherlv_30, grammarAccess.getOptionsAccess().getSemicolonKeyword_1_6_4());
                

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:421:1: entryRuleRepresentation returns [EObject current=null] : iv_ruleRepresentation= ruleRepresentation EOF ;
    public final EObject entryRuleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepresentation = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:422:2: (iv_ruleRepresentation= ruleRepresentation EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:423:2: iv_ruleRepresentation= ruleRepresentation EOF
            {
             newCompositeNode(grammarAccess.getRepresentationRule()); 
            pushFollow(FOLLOW_ruleRepresentation_in_entryRuleRepresentation860);
            iv_ruleRepresentation=ruleRepresentation();

            state._fsp--;

             current =iv_ruleRepresentation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepresentation870); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:430:1: ruleRepresentation returns [EObject current=null] : ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) ) (otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'id' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? otherlv_15= ';' ) ;
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
        Token otherlv_15=null;
        Enumerator lv_type_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:433:28: ( ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) ) (otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'id' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? otherlv_15= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:434:1: ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) ) (otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'id' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? otherlv_15= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:434:1: ( (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) ) (otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'id' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? otherlv_15= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:434:2: (otherlv_0= 'repr' | otherlv_1= 'representation' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( (lv_byteCount_4_0= RULE_INT ) ) (otherlv_5= 'bytes' | otherlv_6= 'byte' ) otherlv_7= 'in' ( (lv_type_8_0= ruleType ) ) (otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'id' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )? otherlv_15= ';'
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:434:2: (otherlv_0= 'repr' | otherlv_1= 'representation' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:434:4: otherlv_0= 'repr'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleRepresentation908); 

                        	newLeafNode(otherlv_0, grammarAccess.getRepresentationAccess().getReprKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:439:7: otherlv_1= 'representation'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleRepresentation926); 

                        	newLeafNode(otherlv_1, grammarAccess.getRepresentationAccess().getRepresentationKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:443:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:444:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:444:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:445:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepresentation944); 

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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleRepresentation961); 

                	newLeafNode(otherlv_3, grammarAccess.getRepresentationAccess().getIsKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:465:1: ( (lv_byteCount_4_0= RULE_INT ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:466:1: (lv_byteCount_4_0= RULE_INT )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:466:1: (lv_byteCount_4_0= RULE_INT )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:467:3: lv_byteCount_4_0= RULE_INT
            {
            lv_byteCount_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepresentation978); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:483:2: (otherlv_5= 'bytes' | otherlv_6= 'byte' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:483:4: otherlv_5= 'bytes'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleRepresentation996); 

                        	newLeafNode(otherlv_5, grammarAccess.getRepresentationAccess().getBytesKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:488:7: otherlv_6= 'byte'
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleRepresentation1014); 

                        	newLeafNode(otherlv_6, grammarAccess.getRepresentationAccess().getByteKeyword_4_1());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleRepresentation1027); 

                	newLeafNode(otherlv_7, grammarAccess.getRepresentationAccess().getInKeyword_5());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:496:1: ( (lv_type_8_0= ruleType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:497:1: (lv_type_8_0= ruleType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:497:1: (lv_type_8_0= ruleType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:498:3: lv_type_8_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getRepresentationAccess().getTypeTypeEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleRepresentation1048);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:514:2: (otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:514:4: otherlv_9= 'description' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleRepresentation1061); 

                        	newLeafNode(otherlv_9, grammarAccess.getRepresentationAccess().getDescriptionKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleRepresentation1073); 

                        	newLeafNode(otherlv_10, grammarAccess.getRepresentationAccess().getColonKeyword_7_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:522:1: ( (lv_description_11_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:523:1: (lv_description_11_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:523:1: (lv_description_11_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:524:3: lv_description_11_0= RULE_STRING
                    {
                    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRepresentation1090); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:540:4: (otherlv_12= 'id' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:540:6: otherlv_12= 'id' otherlv_13= ':' ( (lv_ID_14_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,31,FOLLOW_31_in_ruleRepresentation1110); 

                        	newLeafNode(otherlv_12, grammarAccess.getRepresentationAccess().getIdKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleRepresentation1122); 

                        	newLeafNode(otherlv_13, grammarAccess.getRepresentationAccess().getColonKeyword_8_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:548:1: ( (lv_ID_14_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:549:1: (lv_ID_14_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:549:1: (lv_ID_14_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:550:3: lv_ID_14_0= RULE_STRING
                    {
                    lv_ID_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRepresentation1139); 

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

            otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleRepresentation1158); 

                	newLeafNode(otherlv_15, grammarAccess.getRepresentationAccess().getSemicolonKeyword_9());
                

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:578:1: entryRuleDatafield returns [EObject current=null] : iv_ruleDatafield= ruleDatafield EOF ;
    public final EObject entryRuleDatafield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatafield = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:579:2: (iv_ruleDatafield= ruleDatafield EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:580:2: iv_ruleDatafield= ruleDatafield EOF
            {
             newCompositeNode(grammarAccess.getDatafieldRule()); 
            pushFollow(FOLLOW_ruleDatafield_in_entryRuleDatafield1194);
            iv_ruleDatafield=ruleDatafield();

            state._fsp--;

             current =iv_ruleDatafield; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatafield1204); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:587:1: ruleDatafield returns [EObject current=null] : (this_VariableData_0= ruleVariableData | this_ConstantData_1= ruleConstantData | this_Datastructure_2= ruleDatastructure | this_Declaration_3= ruleDeclaration | this_Calculated_4= ruleCalculated ) ;
    public final EObject ruleDatafield() throws RecognitionException {
        EObject current = null;

        EObject this_VariableData_0 = null;

        EObject this_ConstantData_1 = null;

        EObject this_Datastructure_2 = null;

        EObject this_Declaration_3 = null;

        EObject this_Calculated_4 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:590:28: ( (this_VariableData_0= ruleVariableData | this_ConstantData_1= ruleConstantData | this_Datastructure_2= ruleDatastructure | this_Declaration_3= ruleDeclaration | this_Calculated_4= ruleCalculated ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:591:1: (this_VariableData_0= ruleVariableData | this_ConstantData_1= ruleConstantData | this_Datastructure_2= ruleDatastructure | this_Declaration_3= ruleDeclaration | this_Calculated_4= ruleCalculated )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:591:1: (this_VariableData_0= ruleVariableData | this_ConstantData_1= ruleConstantData | this_Datastructure_2= ruleDatastructure | this_Declaration_3= ruleDeclaration | this_Calculated_4= ruleCalculated )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 32:
            case 35:
                {
                alt7=1;
                }
                break;
            case 36:
                {
                alt7=2;
                }
                break;
            case 43:
                {
                alt7=3;
                }
                break;
            case 44:
            case 45:
                {
                alt7=4;
                }
                break;
            case 37:
            case 38:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:592:5: this_VariableData_0= ruleVariableData
                    {
                     
                            newCompositeNode(grammarAccess.getDatafieldAccess().getVariableDataParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariableData_in_ruleDatafield1251);
                    this_VariableData_0=ruleVariableData();

                    state._fsp--;

                     
                            current = this_VariableData_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:602:5: this_ConstantData_1= ruleConstantData
                    {
                     
                            newCompositeNode(grammarAccess.getDatafieldAccess().getConstantDataParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConstantData_in_ruleDatafield1278);
                    this_ConstantData_1=ruleConstantData();

                    state._fsp--;

                     
                            current = this_ConstantData_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:612:5: this_Datastructure_2= ruleDatastructure
                    {
                     
                            newCompositeNode(grammarAccess.getDatafieldAccess().getDatastructureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDatastructure_in_ruleDatafield1305);
                    this_Datastructure_2=ruleDatastructure();

                    state._fsp--;

                     
                            current = this_Datastructure_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:622:5: this_Declaration_3= ruleDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDatafieldAccess().getDeclarationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleDatafield1332);
                    this_Declaration_3=ruleDeclaration();

                    state._fsp--;

                     
                            current = this_Declaration_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:632:5: this_Calculated_4= ruleCalculated
                    {
                     
                            newCompositeNode(grammarAccess.getDatafieldAccess().getCalculatedParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCalculated_in_ruleDatafield1359);
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
    // $ANTLR end "ruleDatafield"


    // $ANTLR start "entryRuleVariableData"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:648:1: entryRuleVariableData returns [EObject current=null] : iv_ruleVariableData= ruleVariableData EOF ;
    public final EObject entryRuleVariableData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:649:2: (iv_ruleVariableData= ruleVariableData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:650:2: iv_ruleVariableData= ruleVariableData EOF
            {
             newCompositeNode(grammarAccess.getVariableDataRule()); 
            pushFollow(FOLLOW_ruleVariableData_in_entryRuleVariableData1394);
            iv_ruleVariableData=ruleVariableData();

            state._fsp--;

             current =iv_ruleVariableData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableData1404); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:657:1: ruleVariableData returns [EObject current=null] : (this_MeasuredData_0= ruleMeasuredData | this_NonMeasuredData_1= ruleNonMeasuredData ) ;
    public final EObject ruleVariableData() throws RecognitionException {
        EObject current = null;

        EObject this_MeasuredData_0 = null;

        EObject this_NonMeasuredData_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:660:28: ( (this_MeasuredData_0= ruleMeasuredData | this_NonMeasuredData_1= ruleNonMeasuredData ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:661:1: (this_MeasuredData_0= ruleMeasuredData | this_NonMeasuredData_1= ruleNonMeasuredData )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:661:1: (this_MeasuredData_0= ruleMeasuredData | this_NonMeasuredData_1= ruleNonMeasuredData )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            else if ( (LA8_0==35) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:662:5: this_MeasuredData_0= ruleMeasuredData
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDataAccess().getMeasuredDataParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMeasuredData_in_ruleVariableData1451);
                    this_MeasuredData_0=ruleMeasuredData();

                    state._fsp--;

                     
                            current = this_MeasuredData_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:672:5: this_NonMeasuredData_1= ruleNonMeasuredData
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDataAccess().getNonMeasuredDataParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNonMeasuredData_in_ruleVariableData1478);
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:688:1: entryRuleMeasuredData returns [EObject current=null] : iv_ruleMeasuredData= ruleMeasuredData EOF ;
    public final EObject entryRuleMeasuredData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasuredData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:689:2: (iv_ruleMeasuredData= ruleMeasuredData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:690:2: iv_ruleMeasuredData= ruleMeasuredData EOF
            {
             newCompositeNode(grammarAccess.getMeasuredDataRule()); 
            pushFollow(FOLLOW_ruleMeasuredData_in_entryRuleMeasuredData1513);
            iv_ruleMeasuredData=ruleMeasuredData();

            state._fsp--;

             current =iv_ruleMeasuredData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasuredData1523); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:697:1: ruleMeasuredData returns [EObject current=null] : (otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? ( (lv_constraints_14_0= ruleDataConstraint ) )* otherlv_15= ';' ) ;
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
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_scale_4_0 = null;

        EObject lv_constraints_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:700:28: ( (otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? ( (lv_constraints_14_0= ruleDataConstraint ) )* otherlv_15= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:701:1: (otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? ( (lv_constraints_14_0= ruleDataConstraint ) )* otherlv_15= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:701:1: (otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? ( (lv_constraints_14_0= ruleDataConstraint ) )* otherlv_15= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:701:3: otherlv_0= 'data' otherlv_1= 'of' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )? otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? ( (lv_constraints_14_0= ruleDataConstraint ) )* otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleMeasuredData1560); 

                	newLeafNode(otherlv_0, grammarAccess.getMeasuredDataAccess().getDataKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleMeasuredData1572); 

                	newLeafNode(otherlv_1, grammarAccess.getMeasuredDataAccess().getOfKeyword_1());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:709:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:710:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:710:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:711:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeasuredData1589); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:727:2: (otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:727:4: otherlv_3= 'in' ( (lv_scale_4_0= ruleDOUBLE ) )? ( (lv_unit_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleMeasuredData1607); 

                        	newLeafNode(otherlv_3, grammarAccess.getMeasuredDataAccess().getInKeyword_3_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:731:1: ( (lv_scale_4_0= ruleDOUBLE ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_INT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:732:1: (lv_scale_4_0= ruleDOUBLE )
                            {
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:732:1: (lv_scale_4_0= ruleDOUBLE )
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:733:3: lv_scale_4_0= ruleDOUBLE
                            {
                             
                            	        newCompositeNode(grammarAccess.getMeasuredDataAccess().getScaleDOUBLEParserRuleCall_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDOUBLE_in_ruleMeasuredData1628);
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

                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:749:3: ( (lv_unit_5_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:750:1: (lv_unit_5_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:750:1: (lv_unit_5_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:751:3: lv_unit_5_0= RULE_STRING
                    {
                    lv_unit_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasuredData1646); 

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

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleMeasuredData1665); 

                	newLeafNode(otherlv_6, grammarAccess.getMeasuredDataAccess().getAsKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:771:1: ( (otherlv_7= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:772:1: (otherlv_7= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:772:1: (otherlv_7= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:773:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMeasuredDataRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeasuredData1685); 

            		newLeafNode(otherlv_7, grammarAccess.getMeasuredDataAccess().getRepresentationRepresentationCrossReference_5_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:784:2: (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:784:4: otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleMeasuredData1698); 

                        	newLeafNode(otherlv_8, grammarAccess.getMeasuredDataAccess().getDescriptionKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleMeasuredData1710); 

                        	newLeafNode(otherlv_9, grammarAccess.getMeasuredDataAccess().getColonKeyword_6_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:792:1: ( (lv_description_10_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:793:1: (lv_description_10_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:793:1: (lv_description_10_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:794:3: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasuredData1727); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:810:4: (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:810:6: otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,31,FOLLOW_31_in_ruleMeasuredData1747); 

                        	newLeafNode(otherlv_11, grammarAccess.getMeasuredDataAccess().getIdKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleMeasuredData1759); 

                        	newLeafNode(otherlv_12, grammarAccess.getMeasuredDataAccess().getColonKeyword_7_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:818:1: ( (lv_ID_13_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:819:1: (lv_ID_13_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:819:1: (lv_ID_13_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:820:3: lv_ID_13_0= RULE_STRING
                    {
                    lv_ID_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMeasuredData1776); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:836:4: ( (lv_constraints_14_0= ruleDataConstraint ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40||LA13_0==46) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:837:1: (lv_constraints_14_0= ruleDataConstraint )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:837:1: (lv_constraints_14_0= ruleDataConstraint )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:838:3: lv_constraints_14_0= ruleDataConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMeasuredDataAccess().getConstraintsDataConstraintParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataConstraint_in_ruleMeasuredData1804);
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

            otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleMeasuredData1817); 

                	newLeafNode(otherlv_15, grammarAccess.getMeasuredDataAccess().getSemicolonKeyword_9());
                

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:866:1: entryRuleNonMeasuredData returns [EObject current=null] : iv_ruleNonMeasuredData= ruleNonMeasuredData EOF ;
    public final EObject entryRuleNonMeasuredData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonMeasuredData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:867:2: (iv_ruleNonMeasuredData= ruleNonMeasuredData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:868:2: iv_ruleNonMeasuredData= ruleNonMeasuredData EOF
            {
             newCompositeNode(grammarAccess.getNonMeasuredDataRule()); 
            pushFollow(FOLLOW_ruleNonMeasuredData_in_entryRuleNonMeasuredData1853);
            iv_ruleNonMeasuredData=ruleNonMeasuredData();

            state._fsp--;

             current =iv_ruleNonMeasuredData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonMeasuredData1863); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:875:1: ruleNonMeasuredData returns [EObject current=null] : (otherlv_0= 'basicdata' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )? otherlv_11= ';' ) ;
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
        Token otherlv_11=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:878:28: ( (otherlv_0= 'basicdata' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )? otherlv_11= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:879:1: (otherlv_0= 'basicdata' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )? otherlv_11= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:879:1: (otherlv_0= 'basicdata' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )? otherlv_11= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:879:3: otherlv_0= 'basicdata' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'id' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )? otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleNonMeasuredData1900); 

                	newLeafNode(otherlv_0, grammarAccess.getNonMeasuredDataAccess().getBasicdataKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:883:1: ( (lv_type_1_0= ruleType ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:884:1: (lv_type_1_0= ruleType )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:884:1: (lv_type_1_0= ruleType )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:885:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getNonMeasuredDataAccess().getTypeTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleNonMeasuredData1921);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:901:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:902:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:902:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:903:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonMeasuredData1938); 

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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleNonMeasuredData1955); 

                	newLeafNode(otherlv_3, grammarAccess.getNonMeasuredDataAccess().getAsKeyword_3());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:923:1: ( (otherlv_4= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:924:1: (otherlv_4= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:924:1: (otherlv_4= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:925:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNonMeasuredDataRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonMeasuredData1975); 

            		newLeafNode(otherlv_4, grammarAccess.getNonMeasuredDataAccess().getRepresentationRepresentationCrossReference_4_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:936:2: (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:936:4: otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleNonMeasuredData1988); 

                        	newLeafNode(otherlv_5, grammarAccess.getNonMeasuredDataAccess().getDescriptionKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleNonMeasuredData2000); 

                        	newLeafNode(otherlv_6, grammarAccess.getNonMeasuredDataAccess().getColonKeyword_5_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:944:1: ( (lv_description_7_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:945:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:945:1: (lv_description_7_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:946:3: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasuredData2017); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:962:4: (otherlv_8= 'id' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:962:6: otherlv_8= 'id' otherlv_9= ':' ( (lv_ID_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleNonMeasuredData2037); 

                        	newLeafNode(otherlv_8, grammarAccess.getNonMeasuredDataAccess().getIdKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleNonMeasuredData2049); 

                        	newLeafNode(otherlv_9, grammarAccess.getNonMeasuredDataAccess().getColonKeyword_6_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:970:1: ( (lv_ID_10_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:971:1: (lv_ID_10_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:971:1: (lv_ID_10_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:972:3: lv_ID_10_0= RULE_STRING
                    {
                    lv_ID_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNonMeasuredData2066); 

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

            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleNonMeasuredData2085); 

                	newLeafNode(otherlv_11, grammarAccess.getNonMeasuredDataAccess().getSemicolonKeyword_7());
                

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1000:1: entryRuleConstantData returns [EObject current=null] : iv_ruleConstantData= ruleConstantData EOF ;
    public final EObject entryRuleConstantData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantData = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1001:2: (iv_ruleConstantData= ruleConstantData EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1002:2: iv_ruleConstantData= ruleConstantData EOF
            {
             newCompositeNode(grammarAccess.getConstantDataRule()); 
            pushFollow(FOLLOW_ruleConstantData_in_entryRuleConstantData2121);
            iv_ruleConstantData=ruleConstantData();

            state._fsp--;

             current =iv_ruleConstantData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantData2131); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1009:1: ruleConstantData returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( (lv_constValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' otherlv_10= ':' ( (lv_ID_11_0= RULE_STRING ) ) )? otherlv_12= ';' ) ;
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
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1012:28: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( (lv_constValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' otherlv_10= ':' ( (lv_ID_11_0= RULE_STRING ) ) )? otherlv_12= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1013:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( (lv_constValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' otherlv_10= ':' ( (lv_ID_11_0= RULE_STRING ) ) )? otherlv_12= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1013:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( (lv_constValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' otherlv_10= ':' ( (lv_ID_11_0= RULE_STRING ) ) )? otherlv_12= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1013:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( (lv_constValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'id' otherlv_10= ':' ( (lv_ID_11_0= RULE_STRING ) ) )? otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleConstantData2168); 

                	newLeafNode(otherlv_0, grammarAccess.getConstantDataAccess().getConstKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1017:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1018:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1018:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1019:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantData2185); 

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

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleConstantData2202); 

                	newLeafNode(otherlv_2, grammarAccess.getConstantDataAccess().getAsKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1039:1: ( (otherlv_3= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1040:1: (otherlv_3= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1040:1: (otherlv_3= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1041:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantDataRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantData2222); 

            		newLeafNode(otherlv_3, grammarAccess.getConstantDataAccess().getRepresentationRepresentationCrossReference_3_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1052:2: (otherlv_4= 'is' ( (lv_constValue_5_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1052:4: otherlv_4= 'is' ( (lv_constValue_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleConstantData2235); 

                        	newLeafNode(otherlv_4, grammarAccess.getConstantDataAccess().getIsKeyword_4_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1056:1: ( (lv_constValue_5_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1057:1: (lv_constValue_5_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1057:1: (lv_constValue_5_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1058:3: lv_constValue_5_0= RULE_STRING
                    {
                    lv_constValue_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantData2252); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1074:4: (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1074:6: otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleConstantData2272); 

                        	newLeafNode(otherlv_6, grammarAccess.getConstantDataAccess().getDescriptionKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleConstantData2284); 

                        	newLeafNode(otherlv_7, grammarAccess.getConstantDataAccess().getColonKeyword_5_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1082:1: ( (lv_description_8_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1083:1: (lv_description_8_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1083:1: (lv_description_8_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1084:3: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantData2301); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1100:4: (otherlv_9= 'id' otherlv_10= ':' ( (lv_ID_11_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1100:6: otherlv_9= 'id' otherlv_10= ':' ( (lv_ID_11_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleConstantData2321); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstantDataAccess().getIdKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleConstantData2333); 

                        	newLeafNode(otherlv_10, grammarAccess.getConstantDataAccess().getColonKeyword_6_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1108:1: ( (lv_ID_11_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1109:1: (lv_ID_11_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1109:1: (lv_ID_11_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1110:3: lv_ID_11_0= RULE_STRING
                    {
                    lv_ID_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantData2350); 

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

            otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleConstantData2369); 

                	newLeafNode(otherlv_12, grammarAccess.getConstantDataAccess().getSemicolonKeyword_7());
                

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1138:1: entryRuleCalculated returns [EObject current=null] : iv_ruleCalculated= ruleCalculated EOF ;
    public final EObject entryRuleCalculated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculated = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1139:2: (iv_ruleCalculated= ruleCalculated EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1140:2: iv_ruleCalculated= ruleCalculated EOF
            {
             newCompositeNode(grammarAccess.getCalculatedRule()); 
            pushFollow(FOLLOW_ruleCalculated_in_entryRuleCalculated2405);
            iv_ruleCalculated=ruleCalculated();

            state._fsp--;

             current =iv_ruleCalculated; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalculated2415); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1147:1: ruleCalculated returns [EObject current=null] : ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* (otherlv_13= 'description' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) )? (otherlv_16= 'id' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? otherlv_19= ';' ) ;
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
        Token otherlv_19=null;
        EObject lv_parameter_10_0 = null;

        EObject lv_parameter_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1150:28: ( ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* (otherlv_13= 'description' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) )? (otherlv_16= 'id' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? otherlv_19= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1151:1: ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* (otherlv_13= 'description' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) )? (otherlv_16= 'id' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? otherlv_19= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1151:1: ( (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* (otherlv_13= 'description' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) )? (otherlv_16= 'id' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? otherlv_19= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1151:2: (otherlv_0= 'calculate' | otherlv_1= 'calculated' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_methodName_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )? otherlv_9= 'with' ( (lv_parameter_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )* (otherlv_13= 'description' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) )? (otherlv_16= 'id' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )? otherlv_19= ';'
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1151:2: (otherlv_0= 'calculate' | otherlv_1= 'calculated' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            else if ( (LA19_0==38) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1151:4: otherlv_0= 'calculate'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleCalculated2453); 

                        	newLeafNode(otherlv_0, grammarAccess.getCalculatedAccess().getCalculateKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1156:7: otherlv_1= 'calculated'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleCalculated2471); 

                        	newLeafNode(otherlv_1, grammarAccess.getCalculatedAccess().getCalculatedKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1160:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1161:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1161:1: (lv_name_2_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1162:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated2489); 

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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleCalculated2506); 

                	newLeafNode(otherlv_3, grammarAccess.getCalculatedAccess().getAsKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1182:1: ( (otherlv_4= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1183:1: (otherlv_4= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1183:1: (otherlv_4= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1184:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCalculatedRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated2526); 

            		newLeafNode(otherlv_4, grammarAccess.getCalculatedAccess().getRepresentationRepresentationCrossReference_3_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleCalculated2538); 

                	newLeafNode(otherlv_5, grammarAccess.getCalculatedAccess().getByKeyword_4());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1199:1: ( (lv_methodName_6_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1200:1: (lv_methodName_6_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1200:1: (lv_methodName_6_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1201:3: lv_methodName_6_0= RULE_ID
            {
            lv_methodName_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated2555); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1217:2: (otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1217:4: otherlv_7= ',' ( (lv_methodNameOut_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleCalculated2573); 

                        	newLeafNode(otherlv_7, grammarAccess.getCalculatedAccess().getCommaKeyword_6_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1221:1: ( (lv_methodNameOut_8_0= RULE_ID ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1222:1: (lv_methodNameOut_8_0= RULE_ID )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1222:1: (lv_methodNameOut_8_0= RULE_ID )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1223:3: lv_methodNameOut_8_0= RULE_ID
                    {
                    lv_methodNameOut_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalculated2590); 

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

            otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleCalculated2609); 

                	newLeafNode(otherlv_9, grammarAccess.getCalculatedAccess().getWithKeyword_7());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1243:1: ( (lv_parameter_10_0= ruleParameter ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1244:1: (lv_parameter_10_0= ruleParameter )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1244:1: (lv_parameter_10_0= ruleParameter )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1245:3: lv_parameter_10_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleCalculated2630);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1261:2: (otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1261:4: otherlv_11= ',' ( (lv_parameter_12_0= ruleParameter ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleCalculated2643); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCalculatedAccess().getCommaKeyword_9_0());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1265:1: ( (lv_parameter_12_0= ruleParameter ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1266:1: (lv_parameter_12_0= ruleParameter )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1266:1: (lv_parameter_12_0= ruleParameter )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1267:3: lv_parameter_12_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleCalculated2664);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1283:4: (otherlv_13= 'description' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1283:6: otherlv_13= 'description' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleCalculated2679); 

                        	newLeafNode(otherlv_13, grammarAccess.getCalculatedAccess().getDescriptionKeyword_10_0());
                        
                    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleCalculated2691); 

                        	newLeafNode(otherlv_14, grammarAccess.getCalculatedAccess().getColonKeyword_10_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1291:1: ( (lv_description_15_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1292:1: (lv_description_15_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1292:1: (lv_description_15_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1293:3: lv_description_15_0= RULE_STRING
                    {
                    lv_description_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCalculated2708); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1309:4: (otherlv_16= 'id' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1309:6: otherlv_16= 'id' otherlv_17= ':' ( (lv_ID_18_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_31_in_ruleCalculated2728); 

                        	newLeafNode(otherlv_16, grammarAccess.getCalculatedAccess().getIdKeyword_11_0());
                        
                    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleCalculated2740); 

                        	newLeafNode(otherlv_17, grammarAccess.getCalculatedAccess().getColonKeyword_11_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1317:1: ( (lv_ID_18_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1318:1: (lv_ID_18_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1318:1: (lv_ID_18_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1319:3: lv_ID_18_0= RULE_STRING
                    {
                    lv_ID_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCalculated2757); 

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

            otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleCalculated2776); 

                	newLeafNode(otherlv_19, grammarAccess.getCalculatedAccess().getSemicolonKeyword_12());
                

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1347:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1348:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1349:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2812);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2822); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1356:1: ruleParameter returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_argumentType_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1359:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1360:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1360:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1360:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleParameter2859); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1364:1: ( (otherlv_1= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1365:1: (otherlv_1= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1365:1: (otherlv_1= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1366:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2879); 

            		newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getDatafieldDatafieldCrossReference_1_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1377:2: (otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1377:4: otherlv_2= 'as' ( (lv_argumentType_3_0= ruleArgumentType ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleParameter2892); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getAsKeyword_2_0());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1381:1: ( (lv_argumentType_3_0= ruleArgumentType ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1382:1: (lv_argumentType_3_0= ruleArgumentType )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1382:1: (lv_argumentType_3_0= ruleArgumentType )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1383:3: lv_argumentType_3_0= ruleArgumentType
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getArgumentTypeArgumentTypeEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgumentType_in_ruleParameter2913);
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

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleParameter2927); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1411:1: entryRuleDatastructure returns [EObject current=null] : iv_ruleDatastructure= ruleDatastructure EOF ;
    public final EObject entryRuleDatastructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatastructure = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1412:2: (iv_ruleDatastructure= ruleDatastructure EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1413:2: iv_ruleDatastructure= ruleDatastructure EOF
            {
             newCompositeNode(grammarAccess.getDatastructureRule()); 
            pushFollow(FOLLOW_ruleDatastructure_in_entryRuleDatastructure2963);
            iv_ruleDatastructure=ruleDatastructure();

            state._fsp--;

             current =iv_ruleDatastructure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatastructure2973); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1420:1: ruleDatastructure returns [EObject current=null] : (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= '}' otherlv_11= ';' ) ;
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
        Token otherlv_11=null;
        EObject lv_datafields_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1423:28: ( (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= '}' otherlv_11= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1424:1: (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= '}' otherlv_11= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1424:1: (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= '}' otherlv_11= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1424:3: otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_datafields_3_0= ruleDatafield ) )* (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleDatastructure3010); 

                	newLeafNode(otherlv_0, grammarAccess.getDatastructureAccess().getSetKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1428:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1429:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1429:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1430:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatastructure3027); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDatastructure3044); 

                	newLeafNode(otherlv_2, grammarAccess.getDatastructureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1450:1: ( (lv_datafields_3_0= ruleDatafield ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==32||(LA25_0>=35 && LA25_0<=38)||(LA25_0>=43 && LA25_0<=45)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1451:1: (lv_datafields_3_0= ruleDatafield )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1451:1: (lv_datafields_3_0= ruleDatafield )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1452:3: lv_datafields_3_0= ruleDatafield
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDatastructureAccess().getDatafieldsDatafieldParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDatafield_in_ruleDatastructure3065);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1468:3: (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1468:5: otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleDatastructure3079); 

                        	newLeafNode(otherlv_4, grammarAccess.getDatastructureAccess().getDescriptionKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDatastructure3091); 

                        	newLeafNode(otherlv_5, grammarAccess.getDatastructureAccess().getColonKeyword_4_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1476:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1477:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1477:1: (lv_description_6_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1478:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDatastructure3108); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1494:4: (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1494:6: otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleDatastructure3128); 

                        	newLeafNode(otherlv_7, grammarAccess.getDatastructureAccess().getIdKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleDatastructure3140); 

                        	newLeafNode(otherlv_8, grammarAccess.getDatastructureAccess().getColonKeyword_5_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1502:1: ( (lv_ID_9_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1503:1: (lv_ID_9_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1503:1: (lv_ID_9_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1504:3: lv_ID_9_0= RULE_STRING
                    {
                    lv_ID_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDatastructure3157); 

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

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleDatastructure3176); 

                	newLeafNode(otherlv_10, grammarAccess.getDatastructureAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleDatastructure3188); 

                	newLeafNode(otherlv_11, grammarAccess.getDatastructureAccess().getSemicolonKeyword_7());
                

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


    // $ANTLR start "entryRuleDeclaration"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1536:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1537:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1538:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration3224);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration3234); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1545:1: ruleDeclaration returns [EObject current=null] : ( (otherlv_0= 'declaration' | otherlv_1= 'decl' ) ( (lv_declarations_2_0= ruleDatastructureDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleDatastructureDeclaration ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_declarations_2_0 = null;

        EObject lv_declarations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1548:28: ( ( (otherlv_0= 'declaration' | otherlv_1= 'decl' ) ( (lv_declarations_2_0= ruleDatastructureDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleDatastructureDeclaration ) ) )* otherlv_5= ';' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1549:1: ( (otherlv_0= 'declaration' | otherlv_1= 'decl' ) ( (lv_declarations_2_0= ruleDatastructureDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleDatastructureDeclaration ) ) )* otherlv_5= ';' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1549:1: ( (otherlv_0= 'declaration' | otherlv_1= 'decl' ) ( (lv_declarations_2_0= ruleDatastructureDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleDatastructureDeclaration ) ) )* otherlv_5= ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1549:2: (otherlv_0= 'declaration' | otherlv_1= 'decl' ) ( (lv_declarations_2_0= ruleDatastructureDeclaration ) ) (otherlv_3= ',' ( (lv_declarations_4_0= ruleDatastructureDeclaration ) ) )* otherlv_5= ';'
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1549:2: (otherlv_0= 'declaration' | otherlv_1= 'decl' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            else if ( (LA28_0==45) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1549:4: otherlv_0= 'declaration'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleDeclaration3272); 

                        	newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getDeclarationKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1554:7: otherlv_1= 'decl'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleDeclaration3290); 

                        	newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getDeclKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1558:2: ( (lv_declarations_2_0= ruleDatastructureDeclaration ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1559:1: (lv_declarations_2_0= ruleDatastructureDeclaration )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1559:1: (lv_declarations_2_0= ruleDatastructureDeclaration )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1560:3: lv_declarations_2_0= ruleDatastructureDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getDeclarationsDatastructureDeclarationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDatastructureDeclaration_in_ruleDeclaration3312);
            lv_declarations_2_0=ruleDatastructureDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"declarations",
                    		lv_declarations_2_0, 
                    		"DatastructureDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1576:2: (otherlv_3= ',' ( (lv_declarations_4_0= ruleDatastructureDeclaration ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1576:4: otherlv_3= ',' ( (lv_declarations_4_0= ruleDatastructureDeclaration ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleDeclaration3325); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclarationAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1580:1: ( (lv_declarations_4_0= ruleDatastructureDeclaration ) )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1581:1: (lv_declarations_4_0= ruleDatastructureDeclaration )
            	    {
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1581:1: (lv_declarations_4_0= ruleDatastructureDeclaration )
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1582:3: lv_declarations_4_0= ruleDatastructureDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getDeclarationsDatastructureDeclarationParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDatastructureDeclaration_in_ruleDeclaration3346);
            	    lv_declarations_4_0=ruleDatastructureDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_4_0, 
            	            		"DatastructureDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDeclaration3360); 

                	newLeafNode(otherlv_5, grammarAccess.getDeclarationAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleDatastructureDeclaration"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1610:1: entryRuleDatastructureDeclaration returns [EObject current=null] : iv_ruleDatastructureDeclaration= ruleDatastructureDeclaration EOF ;
    public final EObject entryRuleDatastructureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatastructureDeclaration = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1611:2: (iv_ruleDatastructureDeclaration= ruleDatastructureDeclaration EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1612:2: iv_ruleDatastructureDeclaration= ruleDatastructureDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDatastructureDeclarationRule()); 
            pushFollow(FOLLOW_ruleDatastructureDeclaration_in_entryRuleDatastructureDeclaration3396);
            iv_ruleDatastructureDeclaration=ruleDatastructureDeclaration();

            state._fsp--;

             current =iv_ruleDatastructureDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatastructureDeclaration3406); 

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
    // $ANTLR end "entryRuleDatastructureDeclaration"


    // $ANTLR start "ruleDatastructureDeclaration"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1619:1: ruleDatastructureDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDatastructureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1622:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1623:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1623:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1623:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1623:2: ( (otherlv_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1624:1: (otherlv_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1624:1: (otherlv_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1625:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDatastructureDeclarationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatastructureDeclaration3451); 

            		newLeafNode(otherlv_0, grammarAccess.getDatastructureDeclarationAccess().getReusedDatastructureDatastructureCrossReference_0_0()); 
            	

            }


            }

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1636:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1637:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1637:1: (lv_name_1_0= RULE_ID )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1638:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatastructureDeclaration3468); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDatastructureDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatastructureDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
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
    // $ANTLR end "ruleDatastructureDeclaration"


    // $ANTLR start "entryRuleConstraint"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1662:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1663:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1664:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint3509);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint3519); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1671:1: ruleConstraint returns [EObject current=null] : this_DataConstraint_0= ruleDataConstraint ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_DataConstraint_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1674:28: (this_DataConstraint_0= ruleDataConstraint )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1676:5: this_DataConstraint_0= ruleDataConstraint
            {
             
                    newCompositeNode(grammarAccess.getConstraintAccess().getDataConstraintParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleDataConstraint_in_ruleConstraint3565);
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1692:1: entryRuleDataConstraint returns [EObject current=null] : iv_ruleDataConstraint= ruleDataConstraint EOF ;
    public final EObject entryRuleDataConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataConstraint = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1693:2: (iv_ruleDataConstraint= ruleDataConstraint EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1694:2: iv_ruleDataConstraint= ruleDataConstraint EOF
            {
             newCompositeNode(grammarAccess.getDataConstraintRule()); 
            pushFollow(FOLLOW_ruleDataConstraint_in_entryRuleDataConstraint3599);
            iv_ruleDataConstraint=ruleDataConstraint();

            state._fsp--;

             current =iv_ruleDataConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataConstraint3609); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1701:1: ruleDataConstraint returns [EObject current=null] : (this_DataRange_0= ruleDataRange | this_DataAdaption_1= ruleDataAdaption ) ;
    public final EObject ruleDataConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_DataRange_0 = null;

        EObject this_DataAdaption_1 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1704:28: ( (this_DataRange_0= ruleDataRange | this_DataAdaption_1= ruleDataAdaption ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1705:1: (this_DataRange_0= ruleDataRange | this_DataAdaption_1= ruleDataAdaption )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1705:1: (this_DataRange_0= ruleDataRange | this_DataAdaption_1= ruleDataAdaption )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            else if ( (LA30_0==40) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1706:5: this_DataRange_0= ruleDataRange
                    {
                     
                            newCompositeNode(grammarAccess.getDataConstraintAccess().getDataRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataRange_in_ruleDataConstraint3656);
                    this_DataRange_0=ruleDataRange();

                    state._fsp--;

                     
                            current = this_DataRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1716:5: this_DataAdaption_1= ruleDataAdaption
                    {
                     
                            newCompositeNode(grammarAccess.getDataConstraintAccess().getDataAdaptionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataAdaption_in_ruleDataConstraint3683);
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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1732:1: entryRuleDataRange returns [EObject current=null] : iv_ruleDataRange= ruleDataRange EOF ;
    public final EObject entryRuleDataRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataRange = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1733:2: (iv_ruleDataRange= ruleDataRange EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1734:2: iv_ruleDataRange= ruleDataRange EOF
            {
             newCompositeNode(grammarAccess.getDataRangeRule()); 
            pushFollow(FOLLOW_ruleDataRange_in_entryRuleDataRange3718);
            iv_ruleDataRange=ruleDataRange();

            state._fsp--;

             current =iv_ruleDataRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataRange3728); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1741:1: ruleDataRange returns [EObject current=null] : (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) ) (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? ) ;
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
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1744:28: ( (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) ) (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1745:1: (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) ) (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1745:1: (otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) ) (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1745:3: otherlv_0= 'from' ( (lv_lowerBound_1_0= ruleBound ) ) otherlv_2= 'to' ( (lv_upperBound_3_0= ruleBound ) ) (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleDataRange3765); 

                	newLeafNode(otherlv_0, grammarAccess.getDataRangeAccess().getFromKeyword_0());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1749:1: ( (lv_lowerBound_1_0= ruleBound ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1750:1: (lv_lowerBound_1_0= ruleBound )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1750:1: (lv_lowerBound_1_0= ruleBound )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1751:3: lv_lowerBound_1_0= ruleBound
            {
             
            	        newCompositeNode(grammarAccess.getDataRangeAccess().getLowerBoundBoundParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBound_in_ruleDataRange3786);
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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleDataRange3798); 

                	newLeafNode(otherlv_2, grammarAccess.getDataRangeAccess().getToKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1771:1: ( (lv_upperBound_3_0= ruleBound ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1772:1: (lv_upperBound_3_0= ruleBound )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1772:1: (lv_upperBound_3_0= ruleBound )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1773:3: lv_upperBound_3_0= ruleBound
            {
             
            	        newCompositeNode(grammarAccess.getDataRangeAccess().getUpperBoundBoundParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBound_in_ruleDataRange3819);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1789:2: (otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==30) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1789:4: otherlv_4= 'description' otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleDataRange3832); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataRangeAccess().getDescriptionKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDataRange3844); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataRangeAccess().getColonKeyword_4_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1797:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1798:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1798:1: (lv_description_6_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1799:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataRange3861); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1815:4: (otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1815:6: otherlv_7= 'id' otherlv_8= ':' ( (lv_ID_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleDataRange3881); 

                        	newLeafNode(otherlv_7, grammarAccess.getDataRangeAccess().getIdKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleDataRange3893); 

                        	newLeafNode(otherlv_8, grammarAccess.getDataRangeAccess().getColonKeyword_5_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1823:1: ( (lv_ID_9_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1824:1: (lv_ID_9_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1824:1: (lv_ID_9_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1825:3: lv_ID_9_0= RULE_STRING
                    {
                    lv_ID_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataRange3910); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1849:1: entryRuleDataAdaption returns [EObject current=null] : iv_ruleDataAdaption= ruleDataAdaption EOF ;
    public final EObject entryRuleDataAdaption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAdaption = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1850:2: (iv_ruleDataAdaption= ruleDataAdaption EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1851:2: iv_ruleDataAdaption= ruleDataAdaption EOF
            {
             newCompositeNode(grammarAccess.getDataAdaptionRule()); 
            pushFollow(FOLLOW_ruleDataAdaption_in_entryRuleDataAdaption3953);
            iv_ruleDataAdaption=ruleDataAdaption();

            state._fsp--;

             current =iv_ruleDataAdaption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAdaption3963); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1858:1: ruleDataAdaption returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? ) ;
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
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1861:28: ( (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1862:1: (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1862:1: (otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1862:3: otherlv_0= 'with' otherlv_1= 'scaling factor' otherlv_2= ':' ( (lv_scalingFactor_3_0= ruleDOUBLE ) ) otherlv_4= 'and' otherlv_5= 'offset' otherlv_6= ':' ( (lv_offset_7_0= ruleDOUBLE ) ) (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleDataAdaption4000); 

                	newLeafNode(otherlv_0, grammarAccess.getDataAdaptionAccess().getWithKeyword_0());
                
            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleDataAdaption4012); 

                	newLeafNode(otherlv_1, grammarAccess.getDataAdaptionAccess().getScalingFactorKeyword_1());
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleDataAdaption4024); 

                	newLeafNode(otherlv_2, grammarAccess.getDataAdaptionAccess().getColonKeyword_2());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1874:1: ( (lv_scalingFactor_3_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1875:1: (lv_scalingFactor_3_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1875:1: (lv_scalingFactor_3_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1876:3: lv_scalingFactor_3_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getDataAdaptionAccess().getScalingFactorDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleDataAdaption4045);
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

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleDataAdaption4057); 

                	newLeafNode(otherlv_4, grammarAccess.getDataAdaptionAccess().getAndKeyword_4());
                
            otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleDataAdaption4069); 

                	newLeafNode(otherlv_5, grammarAccess.getDataAdaptionAccess().getOffsetKeyword_5());
                
            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleDataAdaption4081); 

                	newLeafNode(otherlv_6, grammarAccess.getDataAdaptionAccess().getColonKeyword_6());
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1904:1: ( (lv_offset_7_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1905:1: (lv_offset_7_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1905:1: (lv_offset_7_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1906:3: lv_offset_7_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getDataAdaptionAccess().getOffsetDOUBLEParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleDataAdaption4102);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1922:2: (otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1922:4: otherlv_8= 'description' otherlv_9= ':' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleDataAdaption4115); 

                        	newLeafNode(otherlv_8, grammarAccess.getDataAdaptionAccess().getDescriptionKeyword_8_0());
                        
                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleDataAdaption4127); 

                        	newLeafNode(otherlv_9, grammarAccess.getDataAdaptionAccess().getColonKeyword_8_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1930:1: ( (lv_description_10_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1931:1: (lv_description_10_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1931:1: (lv_description_10_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1932:3: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataAdaption4144); 

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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1948:4: (otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1948:6: otherlv_11= 'id' otherlv_12= ':' ( (lv_ID_13_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,31,FOLLOW_31_in_ruleDataAdaption4164); 

                        	newLeafNode(otherlv_11, grammarAccess.getDataAdaptionAccess().getIdKeyword_9_0());
                        
                    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleDataAdaption4176); 

                        	newLeafNode(otherlv_12, grammarAccess.getDataAdaptionAccess().getColonKeyword_9_1());
                        
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1956:1: ( (lv_ID_13_0= RULE_STRING ) )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1957:1: (lv_ID_13_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1957:1: (lv_ID_13_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1958:3: lv_ID_13_0= RULE_STRING
                    {
                    lv_ID_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataAdaption4193); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1982:1: entryRuleBound returns [EObject current=null] : iv_ruleBound= ruleBound EOF ;
    public final EObject entryRuleBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1983:2: (iv_ruleBound= ruleBound EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1984:2: iv_ruleBound= ruleBound EOF
            {
             newCompositeNode(grammarAccess.getBoundRule()); 
            pushFollow(FOLLOW_ruleBound_in_entryRuleBound4236);
            iv_ruleBound=ruleBound();

            state._fsp--;

             current =iv_ruleBound; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBound4246); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1991:1: ruleBound returns [EObject current=null] : ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleBound() throws RecognitionException {
        EObject current = null;

        Token lv_unit_1_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1994:28: ( ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1995:1: ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1995:1: ( ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1995:2: ( (lv_value_0_0= ruleDOUBLE ) ) ( (lv_unit_1_0= RULE_STRING ) )?
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1995:2: ( (lv_value_0_0= ruleDOUBLE ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1996:1: (lv_value_0_0= ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1996:1: (lv_value_0_0= ruleDOUBLE )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1997:3: lv_value_0_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getBoundAccess().getValueDOUBLEParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleBound4292);
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

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2013:2: ( (lv_unit_1_0= RULE_STRING ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2014:1: (lv_unit_1_0= RULE_STRING )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2014:1: (lv_unit_1_0= RULE_STRING )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2015:3: lv_unit_1_0= RULE_STRING
                    {
                    lv_unit_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBound4309); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2039:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2040:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2041:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE4352);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE4363); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2048:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2051:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2052:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2052:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2052:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE4403); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2059:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2060:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleDOUBLE4422); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE4437); 

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


    // $ANTLR start "ruleAlignment"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2080:1: ruleAlignment returns [Enumerator current=null] : ( (enumLiteral_0= '_8BIT' ) | (enumLiteral_1= '_16BIT' ) | (enumLiteral_2= '_32BIT' ) | (enumLiteral_3= '_64BIT' ) ) ;
    public final Enumerator ruleAlignment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2082:28: ( ( (enumLiteral_0= '_8BIT' ) | (enumLiteral_1= '_16BIT' ) | (enumLiteral_2= '_32BIT' ) | (enumLiteral_3= '_64BIT' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2083:1: ( (enumLiteral_0= '_8BIT' ) | (enumLiteral_1= '_16BIT' ) | (enumLiteral_2= '_32BIT' ) | (enumLiteral_3= '_64BIT' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2083:1: ( (enumLiteral_0= '_8BIT' ) | (enumLiteral_1= '_16BIT' ) | (enumLiteral_2= '_32BIT' ) | (enumLiteral_3= '_64BIT' ) )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt37=1;
                }
                break;
            case 53:
                {
                alt37=2;
                }
                break;
            case 54:
                {
                alt37=3;
                }
                break;
            case 55:
                {
                alt37=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2083:2: (enumLiteral_0= '_8BIT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2083:2: (enumLiteral_0= '_8BIT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2083:4: enumLiteral_0= '_8BIT'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleAlignment4498); 

                            current = grammarAccess.getAlignmentAccess().get_8BITEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAlignmentAccess().get_8BITEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2089:6: (enumLiteral_1= '_16BIT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2089:6: (enumLiteral_1= '_16BIT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2089:8: enumLiteral_1= '_16BIT'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_ruleAlignment4515); 

                            current = grammarAccess.getAlignmentAccess().get_16BITEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAlignmentAccess().get_16BITEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2095:6: (enumLiteral_2= '_32BIT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2095:6: (enumLiteral_2= '_32BIT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2095:8: enumLiteral_2= '_32BIT'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_54_in_ruleAlignment4532); 

                            current = grammarAccess.getAlignmentAccess().get_32BITEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAlignmentAccess().get_32BITEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2101:6: (enumLiteral_3= '_64BIT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2101:6: (enumLiteral_3= '_64BIT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2101:8: enumLiteral_3= '_64BIT'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_55_in_ruleAlignment4549); 

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


    // $ANTLR start "ruleEndianess"
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2111:1: ruleEndianess returns [Enumerator current=null] : ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) ;
    public final Enumerator ruleEndianess() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2113:28: ( ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2114:1: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2114:1: ( (enumLiteral_0= 'BIG_ENDIAN' ) | (enumLiteral_1= 'LITTLE_ENDIAN' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            else if ( (LA38_0==57) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2114:2: (enumLiteral_0= 'BIG_ENDIAN' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2114:2: (enumLiteral_0= 'BIG_ENDIAN' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2114:4: enumLiteral_0= 'BIG_ENDIAN'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleEndianess4594); 

                            current = grammarAccess.getEndianessAccess().getBIG_ENDIANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEndianessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2120:6: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2120:6: (enumLiteral_1= 'LITTLE_ENDIAN' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2120:8: enumLiteral_1= 'LITTLE_ENDIAN'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleEndianess4611); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2130:1: ruleGenerationLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'CSHARP' ) ) ;
    public final Enumerator ruleGenerationLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2132:28: ( ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'CSHARP' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2133:1: ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'CSHARP' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2133:1: ( (enumLiteral_0= 'JAVA' ) | (enumLiteral_1= 'CPP' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'CSHARP' ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt39=1;
                }
                break;
            case 59:
                {
                alt39=2;
                }
                break;
            case 60:
                {
                alt39=3;
                }
                break;
            case 61:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2133:2: (enumLiteral_0= 'JAVA' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2133:2: (enumLiteral_0= 'JAVA' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2133:4: enumLiteral_0= 'JAVA'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleGenerationLanguage4656); 

                            current = grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2139:6: (enumLiteral_1= 'CPP' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2139:6: (enumLiteral_1= 'CPP' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2139:8: enumLiteral_1= 'CPP'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleGenerationLanguage4673); 

                            current = grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2145:6: (enumLiteral_2= 'C' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2145:6: (enumLiteral_2= 'C' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2145:8: enumLiteral_2= 'C'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_60_in_ruleGenerationLanguage4690); 

                            current = grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2151:6: (enumLiteral_3= 'CSHARP' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2151:6: (enumLiteral_3= 'CSHARP' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2151:8: enumLiteral_3= 'CSHARP'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_61_in_ruleGenerationLanguage4707); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2161:1: ruleArgumentType returns [Enumerator current=null] : (enumLiteral_0= 'BYTE_ARRAY' ) ;
    public final Enumerator ruleArgumentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2163:28: ( (enumLiteral_0= 'BYTE_ARRAY' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2164:1: (enumLiteral_0= 'BYTE_ARRAY' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2164:1: (enumLiteral_0= 'BYTE_ARRAY' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2164:3: enumLiteral_0= 'BYTE_ARRAY'
            {
            enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleArgumentType4751); 

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
    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2174:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'BOOL' ) | (enumLiteral_1= 'CHAR' ) | (enumLiteral_2= 'SHORT' ) | (enumLiteral_3= 'INT' ) | (enumLiteral_4= 'LONG' ) | (enumLiteral_5= 'LONGLONG' ) | (enumLiteral_6= 'FLOAT' ) | (enumLiteral_7= 'DOUBLE' ) | (enumLiteral_8= 'LONGDOUBLE' ) ) ;
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
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2176:28: ( ( (enumLiteral_0= 'BOOL' ) | (enumLiteral_1= 'CHAR' ) | (enumLiteral_2= 'SHORT' ) | (enumLiteral_3= 'INT' ) | (enumLiteral_4= 'LONG' ) | (enumLiteral_5= 'LONGLONG' ) | (enumLiteral_6= 'FLOAT' ) | (enumLiteral_7= 'DOUBLE' ) | (enumLiteral_8= 'LONGDOUBLE' ) ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2177:1: ( (enumLiteral_0= 'BOOL' ) | (enumLiteral_1= 'CHAR' ) | (enumLiteral_2= 'SHORT' ) | (enumLiteral_3= 'INT' ) | (enumLiteral_4= 'LONG' ) | (enumLiteral_5= 'LONGLONG' ) | (enumLiteral_6= 'FLOAT' ) | (enumLiteral_7= 'DOUBLE' ) | (enumLiteral_8= 'LONGDOUBLE' ) )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2177:1: ( (enumLiteral_0= 'BOOL' ) | (enumLiteral_1= 'CHAR' ) | (enumLiteral_2= 'SHORT' ) | (enumLiteral_3= 'INT' ) | (enumLiteral_4= 'LONG' ) | (enumLiteral_5= 'LONGLONG' ) | (enumLiteral_6= 'FLOAT' ) | (enumLiteral_7= 'DOUBLE' ) | (enumLiteral_8= 'LONGDOUBLE' ) )
            int alt40=9;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt40=1;
                }
                break;
            case 64:
                {
                alt40=2;
                }
                break;
            case 65:
                {
                alt40=3;
                }
                break;
            case 66:
                {
                alt40=4;
                }
                break;
            case 67:
                {
                alt40=5;
                }
                break;
            case 68:
                {
                alt40=6;
                }
                break;
            case 69:
                {
                alt40=7;
                }
                break;
            case 70:
                {
                alt40=8;
                }
                break;
            case 71:
                {
                alt40=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2177:2: (enumLiteral_0= 'BOOL' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2177:2: (enumLiteral_0= 'BOOL' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2177:4: enumLiteral_0= 'BOOL'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_63_in_ruleType4795); 

                            current = grammarAccess.getTypeAccess().getBOOLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getBOOLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2183:6: (enumLiteral_1= 'CHAR' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2183:6: (enumLiteral_1= 'CHAR' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2183:8: enumLiteral_1= 'CHAR'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_ruleType4812); 

                            current = grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2189:6: (enumLiteral_2= 'SHORT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2189:6: (enumLiteral_2= 'SHORT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2189:8: enumLiteral_2= 'SHORT'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_65_in_ruleType4829); 

                            current = grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2195:6: (enumLiteral_3= 'INT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2195:6: (enumLiteral_3= 'INT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2195:8: enumLiteral_3= 'INT'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_66_in_ruleType4846); 

                            current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2201:6: (enumLiteral_4= 'LONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2201:6: (enumLiteral_4= 'LONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2201:8: enumLiteral_4= 'LONG'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_67_in_ruleType4863); 

                            current = grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2207:6: (enumLiteral_5= 'LONGLONG' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2207:6: (enumLiteral_5= 'LONGLONG' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2207:8: enumLiteral_5= 'LONGLONG'
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_68_in_ruleType4880); 

                            current = grammarAccess.getTypeAccess().getLONGLONGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getLONGLONGEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2213:6: (enumLiteral_6= 'FLOAT' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2213:6: (enumLiteral_6= 'FLOAT' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2213:8: enumLiteral_6= 'FLOAT'
                    {
                    enumLiteral_6=(Token)match(input,69,FOLLOW_69_in_ruleType4897); 

                            current = grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2219:6: (enumLiteral_7= 'DOUBLE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2219:6: (enumLiteral_7= 'DOUBLE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2219:8: enumLiteral_7= 'DOUBLE'
                    {
                    enumLiteral_7=(Token)match(input,70,FOLLOW_70_in_ruleType4914); 

                            current = grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2225:6: (enumLiteral_8= 'LONGDOUBLE' )
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2225:6: (enumLiteral_8= 'LONGDOUBLE' )
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:2225:8: enumLiteral_8= 'LONGDOUBLE'
                    {
                    enumLiteral_8=(Token)match(input,71,FOLLOW_71_in_ruleType4931); 

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
    public static final BitSet FOLLOW_14_in_ruleDataModel191 = new BitSet(new long[]{0x0000387903008000L});
    public static final BitSet FOLLOW_ruleRepresentation_in_ruleDataModel213 = new BitSet(new long[]{0x0000387903008000L});
    public static final BitSet FOLLOW_ruleDatafield_in_ruleDataModel240 = new BitSet(new long[]{0x0000387903008000L});
    public static final BitSet FOLLOW_15_in_ruleDataModel254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel274 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_ruleDataModel287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel307 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleDataModel321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptions_in_entryRuleOptions357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptions367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOptions415 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions427 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_ruleEndianess_in_ruleOptions448 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOptions460 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOptions474 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOptions486 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions498 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOptions512 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOptions524 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions536 = new BitSet(new long[]{0x3C00000000000000L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_ruleOptions557 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOptions569 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOptions583 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOptions595 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions607 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleAlignment_in_ruleOptions628 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOptions640 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOptions654 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOptions666 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions678 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOptions692 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOptions704 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions716 = new BitSet(new long[]{0x3C00000000000000L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_ruleOptions737 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOptions749 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOptions763 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOptions775 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptions787 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleAlignment_in_ruleOptions808 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOptions820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepresentation_in_entryRuleRepresentation860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepresentation870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRepresentation908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_25_in_ruleRepresentation926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepresentation944 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRepresentation961 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepresentation978 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleRepresentation996 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28_in_ruleRepresentation1014 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRepresentation1027 = new BitSet(new long[]{0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleType_in_ruleRepresentation1048 = new BitSet(new long[]{0x00000000C0080000L});
    public static final BitSet FOLLOW_30_in_ruleRepresentation1061 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRepresentation1073 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRepresentation1090 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleRepresentation1110 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRepresentation1122 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRepresentation1139 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRepresentation1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatafield_in_entryRuleDatafield1194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatafield1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableData_in_ruleDatafield1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantData_in_ruleDatafield1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatastructure_in_ruleDatafield1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleDatafield1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_ruleDatafield1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableData_in_entryRuleVariableData1394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableData1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasuredData_in_ruleVariableData1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasuredData_in_ruleVariableData1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasuredData_in_entryRuleMeasuredData1513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasuredData1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMeasuredData1560 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMeasuredData1572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeasuredData1589 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_29_in_ruleMeasuredData1607 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleMeasuredData1628 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasuredData1646 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMeasuredData1665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeasuredData1685 = new BitSet(new long[]{0x00004100C0080000L});
    public static final BitSet FOLLOW_30_in_ruleMeasuredData1698 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMeasuredData1710 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasuredData1727 = new BitSet(new long[]{0x0000410080080000L});
    public static final BitSet FOLLOW_31_in_ruleMeasuredData1747 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMeasuredData1759 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMeasuredData1776 = new BitSet(new long[]{0x0000410000080000L});
    public static final BitSet FOLLOW_ruleDataConstraint_in_ruleMeasuredData1804 = new BitSet(new long[]{0x0000410000080000L});
    public static final BitSet FOLLOW_19_in_ruleMeasuredData1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasuredData_in_entryRuleNonMeasuredData1853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonMeasuredData1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNonMeasuredData1900 = new BitSet(new long[]{0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleType_in_ruleNonMeasuredData1921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonMeasuredData1938 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleNonMeasuredData1955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonMeasuredData1975 = new BitSet(new long[]{0x00000000C0080000L});
    public static final BitSet FOLLOW_30_in_ruleNonMeasuredData1988 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNonMeasuredData2000 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasuredData2017 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleNonMeasuredData2037 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNonMeasuredData2049 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNonMeasuredData2066 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNonMeasuredData2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantData_in_entryRuleConstantData2121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantData2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleConstantData2168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantData2185 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleConstantData2202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantData2222 = new BitSet(new long[]{0x00000000C4080000L});
    public static final BitSet FOLLOW_26_in_ruleConstantData2235 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantData2252 = new BitSet(new long[]{0x00000000C0080000L});
    public static final BitSet FOLLOW_30_in_ruleConstantData2272 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConstantData2284 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantData2301 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleConstantData2321 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConstantData2333 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantData2350 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstantData2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_entryRuleCalculated2405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalculated2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCalculated2453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_38_in_ruleCalculated2471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated2489 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCalculated2506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated2526 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCalculated2538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated2555 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_16_in_ruleCalculated2573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalculated2590 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleCalculated2609 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCalculated2630 = new BitSet(new long[]{0x00000000C0090000L});
    public static final BitSet FOLLOW_16_in_ruleCalculated2643 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCalculated2664 = new BitSet(new long[]{0x00000000C0090000L});
    public static final BitSet FOLLOW_30_in_ruleCalculated2679 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCalculated2691 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCalculated2708 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleCalculated2728 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCalculated2740 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCalculated2757 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCalculated2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleParameter2859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2879 = new BitSet(new long[]{0x0000040400000000L});
    public static final BitSet FOLLOW_34_in_ruleParameter2892 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleArgumentType_in_ruleParameter2913 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleParameter2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatastructure_in_entryRuleDatastructure2963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatastructure2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDatastructure3010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatastructure3027 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDatastructure3044 = new BitSet(new long[]{0x00003879C3004000L});
    public static final BitSet FOLLOW_ruleDatafield_in_ruleDatastructure3065 = new BitSet(new long[]{0x00003879C3004000L});
    public static final BitSet FOLLOW_30_in_ruleDatastructure3079 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDatastructure3091 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDatastructure3108 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_31_in_ruleDatastructure3128 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDatastructure3140 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDatastructure3157 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDatastructure3176 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDatastructure3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration3224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDeclaration3272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_45_in_ruleDeclaration3290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDatastructureDeclaration_in_ruleDeclaration3312 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleDeclaration3325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDatastructureDeclaration_in_ruleDeclaration3346 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleDeclaration3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatastructureDeclaration_in_entryRuleDatastructureDeclaration3396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatastructureDeclaration3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatastructureDeclaration3451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatastructureDeclaration3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint3509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConstraint_in_ruleConstraint3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConstraint_in_entryRuleDataConstraint3599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataConstraint3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_ruleDataConstraint3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdaption_in_ruleDataConstraint3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_entryRuleDataRange3718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataRange3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDataRange3765 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBound_in_ruleDataRange3786 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleDataRange3798 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBound_in_ruleDataRange3819 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_30_in_ruleDataRange3832 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataRange3844 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataRange3861 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleDataRange3881 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataRange3893 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataRange3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdaption_in_entryRuleDataAdaption3953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAdaption3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDataAdaption4000 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleDataAdaption4012 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataAdaption4024 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleDataAdaption4045 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleDataAdaption4057 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleDataAdaption4069 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataAdaption4081 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleDataAdaption4102 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_30_in_ruleDataAdaption4115 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataAdaption4127 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataAdaption4144 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleDataAdaption4164 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataAdaption4176 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataAdaption4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_entryRuleBound4236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBound4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleBound4292 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBound4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE4352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE4403 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDOUBLE4422 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAlignment4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAlignment4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAlignment4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAlignment4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEndianess4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEndianess4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleGenerationLanguage4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleGenerationLanguage4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleGenerationLanguage4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleGenerationLanguage4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleArgumentType4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleType4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleType4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleType4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleType4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleType4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleType4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleType4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleType4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleType4931 = new BitSet(new long[]{0x0000000000000002L});

}