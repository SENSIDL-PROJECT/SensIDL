package de.fzi.sensidl.language.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.fzi.sensidl.language.services.SensidlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSensidlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BYTE_ARRAY'", "'repr'", "'representation'", "'bytes'", "'byte'", "'calculate'", "'calculated'", "'JAVA'", "'CPP'", "'C'", "'PUSH'", "'PULL'", "'FLOW'", "'TEMPERATURE'", "'VOLUME'", "'DURATION'", "'PRESSURE'", "'BYTE'", "'SHORT'", "'INT'", "'LONG'", "'FLOAT'", "'DOUBLE'", "'options'", "'{'", "'}'", "'transmit'", "','", "'transmission'", "'type'", "':'", "'sensor'", "'language'", "'receiver'", "'is'", "'by'", "'as'", "'with'", "'('", "')'", "'group'", "'measurement'", "'of'", "'in'", "'from'", "'to'", "'primitive'", "'constant'", "'.'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g"; }


     
     	private SensidlGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SensidlGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDataModel"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:60:1: entryRuleDataModel : ruleDataModel EOF ;
    public final void entryRuleDataModel() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:61:1: ( ruleDataModel EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:62:1: ruleDataModel EOF
            {
             before(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel61);
            ruleDataModel();

            state._fsp--;

             after(grammarAccess.getDataModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:69:1: ruleDataModel : ( ( rule__DataModel__Group__0 ) ) ;
    public final void ruleDataModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:73:2: ( ( ( rule__DataModel__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:74:1: ( ( rule__DataModel__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:74:1: ( ( rule__DataModel__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:75:1: ( rule__DataModel__Group__0 )
            {
             before(grammarAccess.getDataModelAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:76:1: ( rule__DataModel__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:76:2: rule__DataModel__Group__0
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0_in_ruleDataModel94);
            rule__DataModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleOptions"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:88:1: entryRuleOptions : ruleOptions EOF ;
    public final void entryRuleOptions() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:89:1: ( ruleOptions EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:90:1: ruleOptions EOF
            {
             before(grammarAccess.getOptionsRule()); 
            pushFollow(FOLLOW_ruleOptions_in_entryRuleOptions121);
            ruleOptions();

            state._fsp--;

             after(grammarAccess.getOptionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptions128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptions"


    // $ANTLR start "ruleOptions"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:97:1: ruleOptions : ( ( rule__Options__Group__0 ) ) ;
    public final void ruleOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:101:2: ( ( ( rule__Options__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:102:1: ( ( rule__Options__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:102:1: ( ( rule__Options__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:103:1: ( rule__Options__Group__0 )
            {
             before(grammarAccess.getOptionsAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:104:1: ( rule__Options__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:104:2: rule__Options__Group__0
            {
            pushFollow(FOLLOW_rule__Options__Group__0_in_ruleOptions154);
            rule__Options__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptions"


    // $ANTLR start "entryRuleRepresentation"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:116:1: entryRuleRepresentation : ruleRepresentation EOF ;
    public final void entryRuleRepresentation() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:117:1: ( ruleRepresentation EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:118:1: ruleRepresentation EOF
            {
             before(grammarAccess.getRepresentationRule()); 
            pushFollow(FOLLOW_ruleRepresentation_in_entryRuleRepresentation181);
            ruleRepresentation();

            state._fsp--;

             after(grammarAccess.getRepresentationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepresentation188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRepresentation"


    // $ANTLR start "ruleRepresentation"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:125:1: ruleRepresentation : ( ( rule__Representation__Group__0 ) ) ;
    public final void ruleRepresentation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:129:2: ( ( ( rule__Representation__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:130:1: ( ( rule__Representation__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:130:1: ( ( rule__Representation__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:131:1: ( rule__Representation__Group__0 )
            {
             before(grammarAccess.getRepresentationAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:132:1: ( rule__Representation__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:132:2: rule__Representation__Group__0
            {
            pushFollow(FOLLOW_rule__Representation__Group__0_in_ruleRepresentation214);
            rule__Representation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepresentationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepresentation"


    // $ANTLR start "entryRuleInterpretation"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:144:1: entryRuleInterpretation : ruleInterpretation EOF ;
    public final void entryRuleInterpretation() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:145:1: ( ruleInterpretation EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:146:1: ruleInterpretation EOF
            {
             before(grammarAccess.getInterpretationRule()); 
            pushFollow(FOLLOW_ruleInterpretation_in_entryRuleInterpretation241);
            ruleInterpretation();

            state._fsp--;

             after(grammarAccess.getInterpretationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterpretation248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterpretation"


    // $ANTLR start "ruleInterpretation"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:153:1: ruleInterpretation : ( ( rule__Interpretation__Alternatives ) ) ;
    public final void ruleInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:157:2: ( ( ( rule__Interpretation__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:158:1: ( ( rule__Interpretation__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:158:1: ( ( rule__Interpretation__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:159:1: ( rule__Interpretation__Alternatives )
            {
             before(grammarAccess.getInterpretationAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:160:1: ( rule__Interpretation__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:160:2: rule__Interpretation__Alternatives
            {
            pushFollow(FOLLOW_rule__Interpretation__Alternatives_in_ruleInterpretation274);
            rule__Interpretation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInterpretationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterpretation"


    // $ANTLR start "entryRuleCalculated"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:172:1: entryRuleCalculated : ruleCalculated EOF ;
    public final void entryRuleCalculated() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:173:1: ( ruleCalculated EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:174:1: ruleCalculated EOF
            {
             before(grammarAccess.getCalculatedRule()); 
            pushFollow(FOLLOW_ruleCalculated_in_entryRuleCalculated301);
            ruleCalculated();

            state._fsp--;

             after(grammarAccess.getCalculatedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalculated308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalculated"


    // $ANTLR start "ruleCalculated"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:181:1: ruleCalculated : ( ( rule__Calculated__Group__0 ) ) ;
    public final void ruleCalculated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:185:2: ( ( ( rule__Calculated__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:186:1: ( ( rule__Calculated__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:186:1: ( ( rule__Calculated__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:187:1: ( rule__Calculated__Group__0 )
            {
             before(grammarAccess.getCalculatedAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:188:1: ( rule__Calculated__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:188:2: rule__Calculated__Group__0
            {
            pushFollow(FOLLOW_rule__Calculated__Group__0_in_ruleCalculated334);
            rule__Calculated__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalculated"


    // $ANTLR start "entryRuleParameter"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:200:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:201:1: ( ruleParameter EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:202:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter361);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:209:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:213:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:214:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:214:1: ( ( rule__Parameter__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:215:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:216:1: ( rule__Parameter__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:216:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter394);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleInterpretationGroup"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:228:1: entryRuleInterpretationGroup : ruleInterpretationGroup EOF ;
    public final void entryRuleInterpretationGroup() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:229:1: ( ruleInterpretationGroup EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:230:1: ruleInterpretationGroup EOF
            {
             before(grammarAccess.getInterpretationGroupRule()); 
            pushFollow(FOLLOW_ruleInterpretationGroup_in_entryRuleInterpretationGroup421);
            ruleInterpretationGroup();

            state._fsp--;

             after(grammarAccess.getInterpretationGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterpretationGroup428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterpretationGroup"


    // $ANTLR start "ruleInterpretationGroup"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:237:1: ruleInterpretationGroup : ( ( rule__InterpretationGroup__Group__0 ) ) ;
    public final void ruleInterpretationGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:241:2: ( ( ( rule__InterpretationGroup__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:242:1: ( ( rule__InterpretationGroup__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:242:1: ( ( rule__InterpretationGroup__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:243:1: ( rule__InterpretationGroup__Group__0 )
            {
             before(grammarAccess.getInterpretationGroupAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:244:1: ( rule__InterpretationGroup__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:244:2: rule__InterpretationGroup__Group__0
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__0_in_ruleInterpretationGroup454);
            rule__InterpretationGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterpretationGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterpretationGroup"


    // $ANTLR start "entryRuleMeasurement"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:256:1: entryRuleMeasurement : ruleMeasurement EOF ;
    public final void entryRuleMeasurement() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:257:1: ( ruleMeasurement EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:258:1: ruleMeasurement EOF
            {
             before(grammarAccess.getMeasurementRule()); 
            pushFollow(FOLLOW_ruleMeasurement_in_entryRuleMeasurement481);
            ruleMeasurement();

            state._fsp--;

             after(grammarAccess.getMeasurementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurement488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeasurement"


    // $ANTLR start "ruleMeasurement"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:265:1: ruleMeasurement : ( ( rule__Measurement__Group__0 ) ) ;
    public final void ruleMeasurement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:269:2: ( ( ( rule__Measurement__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:270:1: ( ( rule__Measurement__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:270:1: ( ( rule__Measurement__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:271:1: ( rule__Measurement__Group__0 )
            {
             before(grammarAccess.getMeasurementAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:272:1: ( rule__Measurement__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:272:2: rule__Measurement__Group__0
            {
            pushFollow(FOLLOW_rule__Measurement__Group__0_in_ruleMeasurement514);
            rule__Measurement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasurement"


    // $ANTLR start "entryRuleMeasurementConstraint"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:284:1: entryRuleMeasurementConstraint : ruleMeasurementConstraint EOF ;
    public final void entryRuleMeasurementConstraint() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:285:1: ( ruleMeasurementConstraint EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:286:1: ruleMeasurementConstraint EOF
            {
             before(grammarAccess.getMeasurementConstraintRule()); 
            pushFollow(FOLLOW_ruleMeasurementConstraint_in_entryRuleMeasurementConstraint541);
            ruleMeasurementConstraint();

            state._fsp--;

             after(grammarAccess.getMeasurementConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementConstraint548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeasurementConstraint"


    // $ANTLR start "ruleMeasurementConstraint"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:293:1: ruleMeasurementConstraint : ( ruleMeasurementInRange ) ;
    public final void ruleMeasurementConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:297:2: ( ( ruleMeasurementInRange ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:298:1: ( ruleMeasurementInRange )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:298:1: ( ruleMeasurementInRange )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:299:1: ruleMeasurementInRange
            {
             before(grammarAccess.getMeasurementConstraintAccess().getMeasurementInRangeParserRuleCall()); 
            pushFollow(FOLLOW_ruleMeasurementInRange_in_ruleMeasurementConstraint574);
            ruleMeasurementInRange();

            state._fsp--;

             after(grammarAccess.getMeasurementConstraintAccess().getMeasurementInRangeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasurementConstraint"


    // $ANTLR start "entryRuleMeasurementInRange"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:312:1: entryRuleMeasurementInRange : ruleMeasurementInRange EOF ;
    public final void entryRuleMeasurementInRange() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:313:1: ( ruleMeasurementInRange EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:314:1: ruleMeasurementInRange EOF
            {
             before(grammarAccess.getMeasurementInRangeRule()); 
            pushFollow(FOLLOW_ruleMeasurementInRange_in_entryRuleMeasurementInRange600);
            ruleMeasurementInRange();

            state._fsp--;

             after(grammarAccess.getMeasurementInRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementInRange607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeasurementInRange"


    // $ANTLR start "ruleMeasurementInRange"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:321:1: ruleMeasurementInRange : ( ( rule__MeasurementInRange__Group__0 ) ) ;
    public final void ruleMeasurementInRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:325:2: ( ( ( rule__MeasurementInRange__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:326:1: ( ( rule__MeasurementInRange__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:326:1: ( ( rule__MeasurementInRange__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:327:1: ( rule__MeasurementInRange__Group__0 )
            {
             before(grammarAccess.getMeasurementInRangeAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:328:1: ( rule__MeasurementInRange__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:328:2: rule__MeasurementInRange__Group__0
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__Group__0_in_ruleMeasurementInRange633);
            rule__MeasurementInRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementInRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasurementInRange"


    // $ANTLR start "entryRuleMeasure"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:340:1: entryRuleMeasure : ruleMeasure EOF ;
    public final void entryRuleMeasure() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:341:1: ( ruleMeasure EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:342:1: ruleMeasure EOF
            {
             before(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_ruleMeasure_in_entryRuleMeasure660);
            ruleMeasure();

            state._fsp--;

             after(grammarAccess.getMeasureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasure667); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeasure"


    // $ANTLR start "ruleMeasure"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:349:1: ruleMeasure : ( ( rule__Measure__Group__0 ) ) ;
    public final void ruleMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:353:2: ( ( ( rule__Measure__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:354:1: ( ( rule__Measure__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:354:1: ( ( rule__Measure__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:355:1: ( rule__Measure__Group__0 )
            {
             before(grammarAccess.getMeasureAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:356:1: ( rule__Measure__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:356:2: rule__Measure__Group__0
            {
            pushFollow(FOLLOW_rule__Measure__Group__0_in_ruleMeasure693);
            rule__Measure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasure"


    // $ANTLR start "entryRulePrimitiveInterpretation"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:368:1: entryRulePrimitiveInterpretation : rulePrimitiveInterpretation EOF ;
    public final void entryRulePrimitiveInterpretation() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:369:1: ( rulePrimitiveInterpretation EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:370:1: rulePrimitiveInterpretation EOF
            {
             before(grammarAccess.getPrimitiveInterpretationRule()); 
            pushFollow(FOLLOW_rulePrimitiveInterpretation_in_entryRulePrimitiveInterpretation720);
            rulePrimitiveInterpretation();

            state._fsp--;

             after(grammarAccess.getPrimitiveInterpretationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveInterpretation727); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveInterpretation"


    // $ANTLR start "rulePrimitiveInterpretation"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:377:1: rulePrimitiveInterpretation : ( ( rule__PrimitiveInterpretation__Group__0 ) ) ;
    public final void rulePrimitiveInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:381:2: ( ( ( rule__PrimitiveInterpretation__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:382:1: ( ( rule__PrimitiveInterpretation__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:382:1: ( ( rule__PrimitiveInterpretation__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:383:1: ( rule__PrimitiveInterpretation__Group__0 )
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:384:1: ( rule__PrimitiveInterpretation__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:384:2: rule__PrimitiveInterpretation__Group__0
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__0_in_rulePrimitiveInterpretation753);
            rule__PrimitiveInterpretation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveInterpretationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveInterpretation"


    // $ANTLR start "entryRuleConstant"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:396:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:397:1: ( ruleConstant EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:398:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant780);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant787); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:405:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:409:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:410:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:410:1: ( ( rule__Constant__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:411:1: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:412:1: ( rule__Constant__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:412:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant813);
            rule__Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleDOUBLE"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:424:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:425:1: ( ruleDOUBLE EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:426:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE840);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:433:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:437:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:438:1: ( ( rule__DOUBLE__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:438:1: ( ( rule__DOUBLE__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:439:1: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:440:1: ( rule__DOUBLE__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:440:2: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE873);
            rule__DOUBLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "ruleGenerationLanguage"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:453:1: ruleGenerationLanguage : ( ( rule__GenerationLanguage__Alternatives ) ) ;
    public final void ruleGenerationLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:457:1: ( ( ( rule__GenerationLanguage__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:458:1: ( ( rule__GenerationLanguage__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:458:1: ( ( rule__GenerationLanguage__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:459:1: ( rule__GenerationLanguage__Alternatives )
            {
             before(grammarAccess.getGenerationLanguageAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:460:1: ( rule__GenerationLanguage__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:460:2: rule__GenerationLanguage__Alternatives
            {
            pushFollow(FOLLOW_rule__GenerationLanguage__Alternatives_in_ruleGenerationLanguage910);
            rule__GenerationLanguage__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGenerationLanguageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenerationLanguage"


    // $ANTLR start "ruleTransmissionType"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:472:1: ruleTransmissionType : ( ( rule__TransmissionType__Alternatives ) ) ;
    public final void ruleTransmissionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:476:1: ( ( ( rule__TransmissionType__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:477:1: ( ( rule__TransmissionType__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:477:1: ( ( rule__TransmissionType__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:478:1: ( rule__TransmissionType__Alternatives )
            {
             before(grammarAccess.getTransmissionTypeAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:479:1: ( rule__TransmissionType__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:479:2: rule__TransmissionType__Alternatives
            {
            pushFollow(FOLLOW_rule__TransmissionType__Alternatives_in_ruleTransmissionType946);
            rule__TransmissionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransmissionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransmissionType"


    // $ANTLR start "ruleArgumentType"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:491:1: ruleArgumentType : ( ( 'BYTE_ARRAY' ) ) ;
    public final void ruleArgumentType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:495:1: ( ( ( 'BYTE_ARRAY' ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:496:1: ( ( 'BYTE_ARRAY' ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:496:1: ( ( 'BYTE_ARRAY' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:497:1: ( 'BYTE_ARRAY' )
            {
             before(grammarAccess.getArgumentTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:498:1: ( 'BYTE_ARRAY' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:498:3: 'BYTE_ARRAY'
            {
            match(input,11,FOLLOW_11_in_ruleArgumentType983); 

            }

             after(grammarAccess.getArgumentTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgumentType"


    // $ANTLR start "ruleQuantity"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:511:1: ruleQuantity : ( ( rule__Quantity__Alternatives ) ) ;
    public final void ruleQuantity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:515:1: ( ( ( rule__Quantity__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:516:1: ( ( rule__Quantity__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:516:1: ( ( rule__Quantity__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:517:1: ( rule__Quantity__Alternatives )
            {
             before(grammarAccess.getQuantityAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:518:1: ( rule__Quantity__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:518:2: rule__Quantity__Alternatives
            {
            pushFollow(FOLLOW_rule__Quantity__Alternatives_in_ruleQuantity1021);
            rule__Quantity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuantityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuantity"


    // $ANTLR start "ruleType"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:530:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:534:1: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:535:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:535:1: ( ( rule__Type__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:536:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:537:1: ( rule__Type__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:537:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1057);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__DataModel__Alternatives_4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:548:1: rule__DataModel__Alternatives_4 : ( ( ( rule__DataModel__RepresentationsAssignment_4_0 ) ) | ( ( rule__DataModel__InterpretationsAssignment_4_1 ) ) );
    public final void rule__DataModel__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:552:1: ( ( ( rule__DataModel__RepresentationsAssignment_4_0 ) ) | ( ( rule__DataModel__InterpretationsAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=16 && LA1_0<=17)||(LA1_0>=51 && LA1_0<=52)||(LA1_0>=57 && LA1_0<=58)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:553:1: ( ( rule__DataModel__RepresentationsAssignment_4_0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:553:1: ( ( rule__DataModel__RepresentationsAssignment_4_0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:554:1: ( rule__DataModel__RepresentationsAssignment_4_0 )
                    {
                     before(grammarAccess.getDataModelAccess().getRepresentationsAssignment_4_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:555:1: ( rule__DataModel__RepresentationsAssignment_4_0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:555:2: rule__DataModel__RepresentationsAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__DataModel__RepresentationsAssignment_4_0_in_rule__DataModel__Alternatives_41092);
                    rule__DataModel__RepresentationsAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataModelAccess().getRepresentationsAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:559:6: ( ( rule__DataModel__InterpretationsAssignment_4_1 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:559:6: ( ( rule__DataModel__InterpretationsAssignment_4_1 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:560:1: ( rule__DataModel__InterpretationsAssignment_4_1 )
                    {
                     before(grammarAccess.getDataModelAccess().getInterpretationsAssignment_4_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:561:1: ( rule__DataModel__InterpretationsAssignment_4_1 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:561:2: rule__DataModel__InterpretationsAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__DataModel__InterpretationsAssignment_4_1_in_rule__DataModel__Alternatives_41110);
                    rule__DataModel__InterpretationsAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataModelAccess().getInterpretationsAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Alternatives_4"


    // $ANTLR start "rule__Options__Alternatives_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:570:1: rule__Options__Alternatives_1 : ( ( ( rule__Options__Group_1_0__0 ) ) | ( ( rule__Options__Group_1_1__0 ) ) | ( ( rule__Options__Group_1_2__0 ) ) );
    public final void rule__Options__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:574:1: ( ( ( rule__Options__Group_1_0__0 ) ) | ( ( rule__Options__Group_1_1__0 ) ) | ( ( rule__Options__Group_1_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt2=1;
                }
                break;
            case 42:
                {
                alt2=2;
                }
                break;
            case 44:
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
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:575:1: ( ( rule__Options__Group_1_0__0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:575:1: ( ( rule__Options__Group_1_0__0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:576:1: ( rule__Options__Group_1_0__0 )
                    {
                     before(grammarAccess.getOptionsAccess().getGroup_1_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:577:1: ( rule__Options__Group_1_0__0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:577:2: rule__Options__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Options__Group_1_0__0_in_rule__Options__Alternatives_11143);
                    rule__Options__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionsAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:581:6: ( ( rule__Options__Group_1_1__0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:581:6: ( ( rule__Options__Group_1_1__0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:582:1: ( rule__Options__Group_1_1__0 )
                    {
                     before(grammarAccess.getOptionsAccess().getGroup_1_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:583:1: ( rule__Options__Group_1_1__0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:583:2: rule__Options__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Options__Group_1_1__0_in_rule__Options__Alternatives_11161);
                    rule__Options__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionsAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:587:6: ( ( rule__Options__Group_1_2__0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:587:6: ( ( rule__Options__Group_1_2__0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:588:1: ( rule__Options__Group_1_2__0 )
                    {
                     before(grammarAccess.getOptionsAccess().getGroup_1_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:589:1: ( rule__Options__Group_1_2__0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:589:2: rule__Options__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Options__Group_1_2__0_in_rule__Options__Alternatives_11179);
                    rule__Options__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionsAccess().getGroup_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Alternatives_1"


    // $ANTLR start "rule__Representation__Alternatives_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:598:1: rule__Representation__Alternatives_0 : ( ( 'repr' ) | ( 'representation' ) );
    public final void rule__Representation__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:602:1: ( ( 'repr' ) | ( 'representation' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:603:1: ( 'repr' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:603:1: ( 'repr' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:604:1: 'repr'
                    {
                     before(grammarAccess.getRepresentationAccess().getReprKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Representation__Alternatives_01213); 
                     after(grammarAccess.getRepresentationAccess().getReprKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:611:6: ( 'representation' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:611:6: ( 'representation' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:612:1: 'representation'
                    {
                     before(grammarAccess.getRepresentationAccess().getRepresentationKeyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Representation__Alternatives_01233); 
                     after(grammarAccess.getRepresentationAccess().getRepresentationKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Alternatives_0"


    // $ANTLR start "rule__Representation__Alternatives_6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:624:1: rule__Representation__Alternatives_6 : ( ( 'bytes' ) | ( 'byte' ) );
    public final void rule__Representation__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:628:1: ( ( 'bytes' ) | ( 'byte' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:629:1: ( 'bytes' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:629:1: ( 'bytes' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:630:1: 'bytes'
                    {
                     before(grammarAccess.getRepresentationAccess().getBytesKeyword_6_0()); 
                    match(input,14,FOLLOW_14_in_rule__Representation__Alternatives_61268); 
                     after(grammarAccess.getRepresentationAccess().getBytesKeyword_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:637:6: ( 'byte' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:637:6: ( 'byte' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:638:1: 'byte'
                    {
                     before(grammarAccess.getRepresentationAccess().getByteKeyword_6_1()); 
                    match(input,15,FOLLOW_15_in_rule__Representation__Alternatives_61288); 
                     after(grammarAccess.getRepresentationAccess().getByteKeyword_6_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Alternatives_6"


    // $ANTLR start "rule__Interpretation__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:650:1: rule__Interpretation__Alternatives : ( ( ruleConstant ) | ( rulePrimitiveInterpretation ) | ( ruleMeasurement ) | ( ruleInterpretationGroup ) | ( ruleCalculated ) );
    public final void rule__Interpretation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:654:1: ( ( ruleConstant ) | ( rulePrimitiveInterpretation ) | ( ruleMeasurement ) | ( ruleInterpretationGroup ) | ( ruleCalculated ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt5=1;
                }
                break;
            case 57:
                {
                alt5=2;
                }
                break;
            case 52:
                {
                alt5=3;
                }
                break;
            case 51:
                {
                alt5=4;
                }
                break;
            case 16:
            case 17:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:655:1: ( ruleConstant )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:655:1: ( ruleConstant )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:656:1: ruleConstant
                    {
                     before(grammarAccess.getInterpretationAccess().getConstantParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConstant_in_rule__Interpretation__Alternatives1322);
                    ruleConstant();

                    state._fsp--;

                     after(grammarAccess.getInterpretationAccess().getConstantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:661:6: ( rulePrimitiveInterpretation )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:661:6: ( rulePrimitiveInterpretation )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:662:1: rulePrimitiveInterpretation
                    {
                     before(grammarAccess.getInterpretationAccess().getPrimitiveInterpretationParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePrimitiveInterpretation_in_rule__Interpretation__Alternatives1339);
                    rulePrimitiveInterpretation();

                    state._fsp--;

                     after(grammarAccess.getInterpretationAccess().getPrimitiveInterpretationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:667:6: ( ruleMeasurement )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:667:6: ( ruleMeasurement )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:668:1: ruleMeasurement
                    {
                     before(grammarAccess.getInterpretationAccess().getMeasurementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMeasurement_in_rule__Interpretation__Alternatives1356);
                    ruleMeasurement();

                    state._fsp--;

                     after(grammarAccess.getInterpretationAccess().getMeasurementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:673:6: ( ruleInterpretationGroup )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:673:6: ( ruleInterpretationGroup )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:674:1: ruleInterpretationGroup
                    {
                     before(grammarAccess.getInterpretationAccess().getInterpretationGroupParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleInterpretationGroup_in_rule__Interpretation__Alternatives1373);
                    ruleInterpretationGroup();

                    state._fsp--;

                     after(grammarAccess.getInterpretationAccess().getInterpretationGroupParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:679:6: ( ruleCalculated )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:679:6: ( ruleCalculated )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:680:1: ruleCalculated
                    {
                     before(grammarAccess.getInterpretationAccess().getCalculatedParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCalculated_in_rule__Interpretation__Alternatives1390);
                    ruleCalculated();

                    state._fsp--;

                     after(grammarAccess.getInterpretationAccess().getCalculatedParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interpretation__Alternatives"


    // $ANTLR start "rule__Calculated__Alternatives_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:690:1: rule__Calculated__Alternatives_0 : ( ( 'calculate' ) | ( 'calculated' ) );
    public final void rule__Calculated__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:694:1: ( ( 'calculate' ) | ( 'calculated' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:695:1: ( 'calculate' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:695:1: ( 'calculate' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:696:1: 'calculate'
                    {
                     before(grammarAccess.getCalculatedAccess().getCalculateKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Calculated__Alternatives_01423); 
                     after(grammarAccess.getCalculatedAccess().getCalculateKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:703:6: ( 'calculated' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:703:6: ( 'calculated' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:704:1: 'calculated'
                    {
                     before(grammarAccess.getCalculatedAccess().getCalculatedKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Calculated__Alternatives_01443); 
                     after(grammarAccess.getCalculatedAccess().getCalculatedKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Alternatives_0"


    // $ANTLR start "rule__GenerationLanguage__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:716:1: rule__GenerationLanguage__Alternatives : ( ( ( 'JAVA' ) ) | ( ( 'CPP' ) ) | ( ( 'C' ) ) );
    public final void rule__GenerationLanguage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:720:1: ( ( ( 'JAVA' ) ) | ( ( 'CPP' ) ) | ( ( 'C' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:721:1: ( ( 'JAVA' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:721:1: ( ( 'JAVA' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:722:1: ( 'JAVA' )
                    {
                     before(grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:723:1: ( 'JAVA' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:723:3: 'JAVA'
                    {
                    match(input,18,FOLLOW_18_in_rule__GenerationLanguage__Alternatives1478); 

                    }

                     after(grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:728:6: ( ( 'CPP' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:728:6: ( ( 'CPP' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:729:1: ( 'CPP' )
                    {
                     before(grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:730:1: ( 'CPP' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:730:3: 'CPP'
                    {
                    match(input,19,FOLLOW_19_in_rule__GenerationLanguage__Alternatives1499); 

                    }

                     after(grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:735:6: ( ( 'C' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:735:6: ( ( 'C' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:736:1: ( 'C' )
                    {
                     before(grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:737:1: ( 'C' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:737:3: 'C'
                    {
                    match(input,20,FOLLOW_20_in_rule__GenerationLanguage__Alternatives1520); 

                    }

                     after(grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationLanguage__Alternatives"


    // $ANTLR start "rule__TransmissionType__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:747:1: rule__TransmissionType__Alternatives : ( ( ( 'PUSH' ) ) | ( ( 'PULL' ) ) );
    public final void rule__TransmissionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:751:1: ( ( ( 'PUSH' ) ) | ( ( 'PULL' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:752:1: ( ( 'PUSH' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:752:1: ( ( 'PUSH' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:753:1: ( 'PUSH' )
                    {
                     before(grammarAccess.getTransmissionTypeAccess().getPUSHEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:754:1: ( 'PUSH' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:754:3: 'PUSH'
                    {
                    match(input,21,FOLLOW_21_in_rule__TransmissionType__Alternatives1556); 

                    }

                     after(grammarAccess.getTransmissionTypeAccess().getPUSHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:759:6: ( ( 'PULL' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:759:6: ( ( 'PULL' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:760:1: ( 'PULL' )
                    {
                     before(grammarAccess.getTransmissionTypeAccess().getPULLEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:761:1: ( 'PULL' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:761:3: 'PULL'
                    {
                    match(input,22,FOLLOW_22_in_rule__TransmissionType__Alternatives1577); 

                    }

                     after(grammarAccess.getTransmissionTypeAccess().getPULLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransmissionType__Alternatives"


    // $ANTLR start "rule__Quantity__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:771:1: rule__Quantity__Alternatives : ( ( ( 'FLOW' ) ) | ( ( 'TEMPERATURE' ) ) | ( ( 'VOLUME' ) ) | ( ( 'DURATION' ) ) | ( ( 'PRESSURE' ) ) );
    public final void rule__Quantity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:775:1: ( ( ( 'FLOW' ) ) | ( ( 'TEMPERATURE' ) ) | ( ( 'VOLUME' ) ) | ( ( 'DURATION' ) ) | ( ( 'PRESSURE' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            case 26:
                {
                alt9=4;
                }
                break;
            case 27:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:776:1: ( ( 'FLOW' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:776:1: ( ( 'FLOW' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:777:1: ( 'FLOW' )
                    {
                     before(grammarAccess.getQuantityAccess().getFLOWEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:778:1: ( 'FLOW' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:778:3: 'FLOW'
                    {
                    match(input,23,FOLLOW_23_in_rule__Quantity__Alternatives1613); 

                    }

                     after(grammarAccess.getQuantityAccess().getFLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:783:6: ( ( 'TEMPERATURE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:783:6: ( ( 'TEMPERATURE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:784:1: ( 'TEMPERATURE' )
                    {
                     before(grammarAccess.getQuantityAccess().getTEMPERATUREEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:785:1: ( 'TEMPERATURE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:785:3: 'TEMPERATURE'
                    {
                    match(input,24,FOLLOW_24_in_rule__Quantity__Alternatives1634); 

                    }

                     after(grammarAccess.getQuantityAccess().getTEMPERATUREEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:790:6: ( ( 'VOLUME' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:790:6: ( ( 'VOLUME' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:791:1: ( 'VOLUME' )
                    {
                     before(grammarAccess.getQuantityAccess().getVOLUMEEnumLiteralDeclaration_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:792:1: ( 'VOLUME' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:792:3: 'VOLUME'
                    {
                    match(input,25,FOLLOW_25_in_rule__Quantity__Alternatives1655); 

                    }

                     after(grammarAccess.getQuantityAccess().getVOLUMEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:797:6: ( ( 'DURATION' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:797:6: ( ( 'DURATION' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:798:1: ( 'DURATION' )
                    {
                     before(grammarAccess.getQuantityAccess().getDURATIONEnumLiteralDeclaration_3()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:799:1: ( 'DURATION' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:799:3: 'DURATION'
                    {
                    match(input,26,FOLLOW_26_in_rule__Quantity__Alternatives1676); 

                    }

                     after(grammarAccess.getQuantityAccess().getDURATIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:804:6: ( ( 'PRESSURE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:804:6: ( ( 'PRESSURE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:805:1: ( 'PRESSURE' )
                    {
                     before(grammarAccess.getQuantityAccess().getPRESSUREEnumLiteralDeclaration_4()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:806:1: ( 'PRESSURE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:806:3: 'PRESSURE'
                    {
                    match(input,27,FOLLOW_27_in_rule__Quantity__Alternatives1697); 

                    }

                     after(grammarAccess.getQuantityAccess().getPRESSUREEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantity__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:816:1: rule__Type__Alternatives : ( ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) | ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:820:1: ( ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) | ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case 30:
                {
                alt10=3;
                }
                break;
            case 31:
                {
                alt10=4;
                }
                break;
            case 32:
                {
                alt10=5;
                }
                break;
            case 33:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:821:1: ( ( 'BYTE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:821:1: ( ( 'BYTE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:822:1: ( 'BYTE' )
                    {
                     before(grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:823:1: ( 'BYTE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:823:3: 'BYTE'
                    {
                    match(input,28,FOLLOW_28_in_rule__Type__Alternatives1733); 

                    }

                     after(grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:828:6: ( ( 'SHORT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:828:6: ( ( 'SHORT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:829:1: ( 'SHORT' )
                    {
                     before(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:830:1: ( 'SHORT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:830:3: 'SHORT'
                    {
                    match(input,29,FOLLOW_29_in_rule__Type__Alternatives1754); 

                    }

                     after(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:835:6: ( ( 'INT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:835:6: ( ( 'INT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:836:1: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:837:1: ( 'INT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:837:3: 'INT'
                    {
                    match(input,30,FOLLOW_30_in_rule__Type__Alternatives1775); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:842:6: ( ( 'LONG' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:842:6: ( ( 'LONG' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:843:1: ( 'LONG' )
                    {
                     before(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_3()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:844:1: ( 'LONG' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:844:3: 'LONG'
                    {
                    match(input,31,FOLLOW_31_in_rule__Type__Alternatives1796); 

                    }

                     after(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:849:6: ( ( 'FLOAT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:849:6: ( ( 'FLOAT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:850:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:851:1: ( 'FLOAT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:851:3: 'FLOAT'
                    {
                    match(input,32,FOLLOW_32_in_rule__Type__Alternatives1817); 

                    }

                     after(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:856:6: ( ( 'DOUBLE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:856:6: ( ( 'DOUBLE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:857:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:858:1: ( 'DOUBLE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:858:3: 'DOUBLE'
                    {
                    match(input,33,FOLLOW_33_in_rule__Type__Alternatives1838); 

                    }

                     after(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__DataModel__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:870:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:874:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:875:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__01871);
            rule__DataModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__01874);
            rule__DataModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__0"


    // $ANTLR start "rule__DataModel__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:882:1: rule__DataModel__Group__0__Impl : ( 'options' ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:886:1: ( ( 'options' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:887:1: ( 'options' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:887:1: ( 'options' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:888:1: 'options'
            {
             before(grammarAccess.getDataModelAccess().getOptionsKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__DataModel__Group__0__Impl1902); 
             after(grammarAccess.getDataModelAccess().getOptionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__0__Impl"


    // $ANTLR start "rule__DataModel__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:901:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:905:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:906:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__11933);
            rule__DataModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__11936);
            rule__DataModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__1"


    // $ANTLR start "rule__DataModel__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:913:1: rule__DataModel__Group__1__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:917:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:918:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:918:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:919:1: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__DataModel__Group__1__Impl1964); 
             after(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__1__Impl"


    // $ANTLR start "rule__DataModel__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:932:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl rule__DataModel__Group__3 ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:936:1: ( rule__DataModel__Group__2__Impl rule__DataModel__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:937:2: rule__DataModel__Group__2__Impl rule__DataModel__Group__3
            {
            pushFollow(FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__21995);
            rule__DataModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__21998);
            rule__DataModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__2"


    // $ANTLR start "rule__DataModel__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:944:1: rule__DataModel__Group__2__Impl : ( ( rule__DataModel__OptionsAssignment_2 ) ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:948:1: ( ( ( rule__DataModel__OptionsAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:949:1: ( ( rule__DataModel__OptionsAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:949:1: ( ( rule__DataModel__OptionsAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:950:1: ( rule__DataModel__OptionsAssignment_2 )
            {
             before(grammarAccess.getDataModelAccess().getOptionsAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:951:1: ( rule__DataModel__OptionsAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:951:2: rule__DataModel__OptionsAssignment_2
            {
            pushFollow(FOLLOW_rule__DataModel__OptionsAssignment_2_in_rule__DataModel__Group__2__Impl2025);
            rule__DataModel__OptionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getOptionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__2__Impl"


    // $ANTLR start "rule__DataModel__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:961:1: rule__DataModel__Group__3 : rule__DataModel__Group__3__Impl rule__DataModel__Group__4 ;
    public final void rule__DataModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:965:1: ( rule__DataModel__Group__3__Impl rule__DataModel__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:966:2: rule__DataModel__Group__3__Impl rule__DataModel__Group__4
            {
            pushFollow(FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__32055);
            rule__DataModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__32058);
            rule__DataModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__3"


    // $ANTLR start "rule__DataModel__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:973:1: rule__DataModel__Group__3__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:977:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:978:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:978:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:979:1: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__DataModel__Group__3__Impl2086); 
             after(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__3__Impl"


    // $ANTLR start "rule__DataModel__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:992:1: rule__DataModel__Group__4 : rule__DataModel__Group__4__Impl rule__DataModel__Group__5 ;
    public final void rule__DataModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:996:1: ( rule__DataModel__Group__4__Impl rule__DataModel__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:997:2: rule__DataModel__Group__4__Impl rule__DataModel__Group__5
            {
            pushFollow(FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__42117);
            rule__DataModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__5_in_rule__DataModel__Group__42120);
            rule__DataModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__4"


    // $ANTLR start "rule__DataModel__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1004:1: rule__DataModel__Group__4__Impl : ( ( rule__DataModel__Alternatives_4 )* ) ;
    public final void rule__DataModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1008:1: ( ( ( rule__DataModel__Alternatives_4 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1009:1: ( ( rule__DataModel__Alternatives_4 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1009:1: ( ( rule__DataModel__Alternatives_4 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1010:1: ( rule__DataModel__Alternatives_4 )*
            {
             before(grammarAccess.getDataModelAccess().getAlternatives_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1011:1: ( rule__DataModel__Alternatives_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=12 && LA11_0<=13)||(LA11_0>=16 && LA11_0<=17)||(LA11_0>=51 && LA11_0<=52)||(LA11_0>=57 && LA11_0<=58)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1011:2: rule__DataModel__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__DataModel__Alternatives_4_in_rule__DataModel__Group__4__Impl2147);
            	    rule__DataModel__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__4__Impl"


    // $ANTLR start "rule__DataModel__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1021:1: rule__DataModel__Group__5 : rule__DataModel__Group__5__Impl rule__DataModel__Group__6 ;
    public final void rule__DataModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1025:1: ( rule__DataModel__Group__5__Impl rule__DataModel__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1026:2: rule__DataModel__Group__5__Impl rule__DataModel__Group__6
            {
            pushFollow(FOLLOW_rule__DataModel__Group__5__Impl_in_rule__DataModel__Group__52178);
            rule__DataModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__6_in_rule__DataModel__Group__52181);
            rule__DataModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__5"


    // $ANTLR start "rule__DataModel__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1033:1: rule__DataModel__Group__5__Impl : ( 'transmit' ) ;
    public final void rule__DataModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1037:1: ( ( 'transmit' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1038:1: ( 'transmit' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1038:1: ( 'transmit' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1039:1: 'transmit'
            {
             before(grammarAccess.getDataModelAccess().getTransmitKeyword_5()); 
            match(input,37,FOLLOW_37_in_rule__DataModel__Group__5__Impl2209); 
             after(grammarAccess.getDataModelAccess().getTransmitKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__5__Impl"


    // $ANTLR start "rule__DataModel__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1052:1: rule__DataModel__Group__6 : rule__DataModel__Group__6__Impl rule__DataModel__Group__7 ;
    public final void rule__DataModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1056:1: ( rule__DataModel__Group__6__Impl rule__DataModel__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1057:2: rule__DataModel__Group__6__Impl rule__DataModel__Group__7
            {
            pushFollow(FOLLOW_rule__DataModel__Group__6__Impl_in_rule__DataModel__Group__62240);
            rule__DataModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__7_in_rule__DataModel__Group__62243);
            rule__DataModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__6"


    // $ANTLR start "rule__DataModel__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1064:1: rule__DataModel__Group__6__Impl : ( ( rule__DataModel__TransmitAssignment_6 ) ) ;
    public final void rule__DataModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1068:1: ( ( ( rule__DataModel__TransmitAssignment_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1069:1: ( ( rule__DataModel__TransmitAssignment_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1069:1: ( ( rule__DataModel__TransmitAssignment_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1070:1: ( rule__DataModel__TransmitAssignment_6 )
            {
             before(grammarAccess.getDataModelAccess().getTransmitAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1071:1: ( rule__DataModel__TransmitAssignment_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1071:2: rule__DataModel__TransmitAssignment_6
            {
            pushFollow(FOLLOW_rule__DataModel__TransmitAssignment_6_in_rule__DataModel__Group__6__Impl2270);
            rule__DataModel__TransmitAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getTransmitAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__6__Impl"


    // $ANTLR start "rule__DataModel__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1081:1: rule__DataModel__Group__7 : rule__DataModel__Group__7__Impl ;
    public final void rule__DataModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1085:1: ( rule__DataModel__Group__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1086:2: rule__DataModel__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group__7__Impl_in_rule__DataModel__Group__72300);
            rule__DataModel__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__7"


    // $ANTLR start "rule__DataModel__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1092:1: rule__DataModel__Group__7__Impl : ( ( rule__DataModel__Group_7__0 )* ) ;
    public final void rule__DataModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1096:1: ( ( ( rule__DataModel__Group_7__0 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1097:1: ( ( rule__DataModel__Group_7__0 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1097:1: ( ( rule__DataModel__Group_7__0 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1098:1: ( rule__DataModel__Group_7__0 )*
            {
             before(grammarAccess.getDataModelAccess().getGroup_7()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1099:1: ( rule__DataModel__Group_7__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1099:2: rule__DataModel__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__DataModel__Group_7__0_in_rule__DataModel__Group__7__Impl2327);
            	    rule__DataModel__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__7__Impl"


    // $ANTLR start "rule__DataModel__Group_7__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1125:1: rule__DataModel__Group_7__0 : rule__DataModel__Group_7__0__Impl rule__DataModel__Group_7__1 ;
    public final void rule__DataModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1129:1: ( rule__DataModel__Group_7__0__Impl rule__DataModel__Group_7__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1130:2: rule__DataModel__Group_7__0__Impl rule__DataModel__Group_7__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group_7__0__Impl_in_rule__DataModel__Group_7__02374);
            rule__DataModel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group_7__1_in_rule__DataModel__Group_7__02377);
            rule__DataModel__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_7__0"


    // $ANTLR start "rule__DataModel__Group_7__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1137:1: rule__DataModel__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DataModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1141:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1142:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1142:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1143:1: ','
            {
             before(grammarAccess.getDataModelAccess().getCommaKeyword_7_0()); 
            match(input,38,FOLLOW_38_in_rule__DataModel__Group_7__0__Impl2405); 
             after(grammarAccess.getDataModelAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_7__0__Impl"


    // $ANTLR start "rule__DataModel__Group_7__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1156:1: rule__DataModel__Group_7__1 : rule__DataModel__Group_7__1__Impl ;
    public final void rule__DataModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1160:1: ( rule__DataModel__Group_7__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1161:2: rule__DataModel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group_7__1__Impl_in_rule__DataModel__Group_7__12436);
            rule__DataModel__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_7__1"


    // $ANTLR start "rule__DataModel__Group_7__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1167:1: rule__DataModel__Group_7__1__Impl : ( ( rule__DataModel__TransmitAssignment_7_1 ) ) ;
    public final void rule__DataModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1171:1: ( ( ( rule__DataModel__TransmitAssignment_7_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1172:1: ( ( rule__DataModel__TransmitAssignment_7_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1172:1: ( ( rule__DataModel__TransmitAssignment_7_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1173:1: ( rule__DataModel__TransmitAssignment_7_1 )
            {
             before(grammarAccess.getDataModelAccess().getTransmitAssignment_7_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1174:1: ( rule__DataModel__TransmitAssignment_7_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1174:2: rule__DataModel__TransmitAssignment_7_1
            {
            pushFollow(FOLLOW_rule__DataModel__TransmitAssignment_7_1_in_rule__DataModel__Group_7__1__Impl2463);
            rule__DataModel__TransmitAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getTransmitAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_7__1__Impl"


    // $ANTLR start "rule__Options__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1188:1: rule__Options__Group__0 : rule__Options__Group__0__Impl rule__Options__Group__1 ;
    public final void rule__Options__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1192:1: ( rule__Options__Group__0__Impl rule__Options__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1193:2: rule__Options__Group__0__Impl rule__Options__Group__1
            {
            pushFollow(FOLLOW_rule__Options__Group__0__Impl_in_rule__Options__Group__02497);
            rule__Options__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group__1_in_rule__Options__Group__02500);
            rule__Options__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group__0"


    // $ANTLR start "rule__Options__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1200:1: rule__Options__Group__0__Impl : ( () ) ;
    public final void rule__Options__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1204:1: ( ( () ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1205:1: ( () )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1205:1: ( () )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1206:1: ()
            {
             before(grammarAccess.getOptionsAccess().getOptionsAction_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1207:1: ()
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1209:1: 
            {
            }

             after(grammarAccess.getOptionsAccess().getOptionsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group__0__Impl"


    // $ANTLR start "rule__Options__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1219:1: rule__Options__Group__1 : rule__Options__Group__1__Impl ;
    public final void rule__Options__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1223:1: ( rule__Options__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1224:2: rule__Options__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group__1__Impl_in_rule__Options__Group__12558);
            rule__Options__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group__1"


    // $ANTLR start "rule__Options__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1230:1: rule__Options__Group__1__Impl : ( ( rule__Options__Alternatives_1 )* ) ;
    public final void rule__Options__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1234:1: ( ( ( rule__Options__Alternatives_1 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1235:1: ( ( rule__Options__Alternatives_1 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1235:1: ( ( rule__Options__Alternatives_1 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1236:1: ( rule__Options__Alternatives_1 )*
            {
             before(grammarAccess.getOptionsAccess().getAlternatives_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1237:1: ( rule__Options__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39||LA13_0==42||LA13_0==44) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1237:2: rule__Options__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Options__Alternatives_1_in_rule__Options__Group__1__Impl2585);
            	    rule__Options__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOptionsAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group__1__Impl"


    // $ANTLR start "rule__Options__Group_1_0__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1251:1: rule__Options__Group_1_0__0 : rule__Options__Group_1_0__0__Impl rule__Options__Group_1_0__1 ;
    public final void rule__Options__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1255:1: ( rule__Options__Group_1_0__0__Impl rule__Options__Group_1_0__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1256:2: rule__Options__Group_1_0__0__Impl rule__Options__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__0__Impl_in_rule__Options__Group_1_0__02620);
            rule__Options__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_0__1_in_rule__Options__Group_1_0__02623);
            rule__Options__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_0__0"


    // $ANTLR start "rule__Options__Group_1_0__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1263:1: rule__Options__Group_1_0__0__Impl : ( 'transmission' ) ;
    public final void rule__Options__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1267:1: ( ( 'transmission' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1268:1: ( 'transmission' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1268:1: ( 'transmission' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1269:1: 'transmission'
            {
             before(grammarAccess.getOptionsAccess().getTransmissionKeyword_1_0_0()); 
            match(input,39,FOLLOW_39_in_rule__Options__Group_1_0__0__Impl2651); 
             after(grammarAccess.getOptionsAccess().getTransmissionKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_0__0__Impl"


    // $ANTLR start "rule__Options__Group_1_0__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1282:1: rule__Options__Group_1_0__1 : rule__Options__Group_1_0__1__Impl rule__Options__Group_1_0__2 ;
    public final void rule__Options__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1286:1: ( rule__Options__Group_1_0__1__Impl rule__Options__Group_1_0__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1287:2: rule__Options__Group_1_0__1__Impl rule__Options__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__1__Impl_in_rule__Options__Group_1_0__12682);
            rule__Options__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_0__2_in_rule__Options__Group_1_0__12685);
            rule__Options__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_0__1"


    // $ANTLR start "rule__Options__Group_1_0__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1294:1: rule__Options__Group_1_0__1__Impl : ( 'type' ) ;
    public final void rule__Options__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1298:1: ( ( 'type' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1299:1: ( 'type' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1299:1: ( 'type' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1300:1: 'type'
            {
             before(grammarAccess.getOptionsAccess().getTypeKeyword_1_0_1()); 
            match(input,40,FOLLOW_40_in_rule__Options__Group_1_0__1__Impl2713); 
             after(grammarAccess.getOptionsAccess().getTypeKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_0__1__Impl"


    // $ANTLR start "rule__Options__Group_1_0__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1313:1: rule__Options__Group_1_0__2 : rule__Options__Group_1_0__2__Impl rule__Options__Group_1_0__3 ;
    public final void rule__Options__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1317:1: ( rule__Options__Group_1_0__2__Impl rule__Options__Group_1_0__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1318:2: rule__Options__Group_1_0__2__Impl rule__Options__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__2__Impl_in_rule__Options__Group_1_0__22744);
            rule__Options__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_0__3_in_rule__Options__Group_1_0__22747);
            rule__Options__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_0__2"


    // $ANTLR start "rule__Options__Group_1_0__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1325:1: rule__Options__Group_1_0__2__Impl : ( ':' ) ;
    public final void rule__Options__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1329:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1330:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1330:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1331:1: ':'
            {
             before(grammarAccess.getOptionsAccess().getColonKeyword_1_0_2()); 
            match(input,41,FOLLOW_41_in_rule__Options__Group_1_0__2__Impl2775); 
             after(grammarAccess.getOptionsAccess().getColonKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_0__2__Impl"


    // $ANTLR start "rule__Options__Group_1_0__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1344:1: rule__Options__Group_1_0__3 : rule__Options__Group_1_0__3__Impl ;
    public final void rule__Options__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1348:1: ( rule__Options__Group_1_0__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1349:2: rule__Options__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__3__Impl_in_rule__Options__Group_1_0__32806);
            rule__Options__Group_1_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_0__3"


    // $ANTLR start "rule__Options__Group_1_0__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1355:1: rule__Options__Group_1_0__3__Impl : ( ( rule__Options__TransmissionTypeAssignment_1_0_3 ) ) ;
    public final void rule__Options__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1359:1: ( ( ( rule__Options__TransmissionTypeAssignment_1_0_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1360:1: ( ( rule__Options__TransmissionTypeAssignment_1_0_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1360:1: ( ( rule__Options__TransmissionTypeAssignment_1_0_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1361:1: ( rule__Options__TransmissionTypeAssignment_1_0_3 )
            {
             before(grammarAccess.getOptionsAccess().getTransmissionTypeAssignment_1_0_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1362:1: ( rule__Options__TransmissionTypeAssignment_1_0_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1362:2: rule__Options__TransmissionTypeAssignment_1_0_3
            {
            pushFollow(FOLLOW_rule__Options__TransmissionTypeAssignment_1_0_3_in_rule__Options__Group_1_0__3__Impl2833);
            rule__Options__TransmissionTypeAssignment_1_0_3();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getTransmissionTypeAssignment_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_0__3__Impl"


    // $ANTLR start "rule__Options__Group_1_1__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1380:1: rule__Options__Group_1_1__0 : rule__Options__Group_1_1__0__Impl rule__Options__Group_1_1__1 ;
    public final void rule__Options__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1384:1: ( rule__Options__Group_1_1__0__Impl rule__Options__Group_1_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1385:2: rule__Options__Group_1_1__0__Impl rule__Options__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__0__Impl_in_rule__Options__Group_1_1__02871);
            rule__Options__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_1__1_in_rule__Options__Group_1_1__02874);
            rule__Options__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_1__0"


    // $ANTLR start "rule__Options__Group_1_1__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1392:1: rule__Options__Group_1_1__0__Impl : ( 'sensor' ) ;
    public final void rule__Options__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1396:1: ( ( 'sensor' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1397:1: ( 'sensor' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1397:1: ( 'sensor' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1398:1: 'sensor'
            {
             before(grammarAccess.getOptionsAccess().getSensorKeyword_1_1_0()); 
            match(input,42,FOLLOW_42_in_rule__Options__Group_1_1__0__Impl2902); 
             after(grammarAccess.getOptionsAccess().getSensorKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_1__0__Impl"


    // $ANTLR start "rule__Options__Group_1_1__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1411:1: rule__Options__Group_1_1__1 : rule__Options__Group_1_1__1__Impl rule__Options__Group_1_1__2 ;
    public final void rule__Options__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1415:1: ( rule__Options__Group_1_1__1__Impl rule__Options__Group_1_1__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1416:2: rule__Options__Group_1_1__1__Impl rule__Options__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__1__Impl_in_rule__Options__Group_1_1__12933);
            rule__Options__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_1__2_in_rule__Options__Group_1_1__12936);
            rule__Options__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_1__1"


    // $ANTLR start "rule__Options__Group_1_1__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1423:1: rule__Options__Group_1_1__1__Impl : ( 'language' ) ;
    public final void rule__Options__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1427:1: ( ( 'language' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1428:1: ( 'language' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1428:1: ( 'language' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1429:1: 'language'
            {
             before(grammarAccess.getOptionsAccess().getLanguageKeyword_1_1_1()); 
            match(input,43,FOLLOW_43_in_rule__Options__Group_1_1__1__Impl2964); 
             after(grammarAccess.getOptionsAccess().getLanguageKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_1__1__Impl"


    // $ANTLR start "rule__Options__Group_1_1__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1442:1: rule__Options__Group_1_1__2 : rule__Options__Group_1_1__2__Impl rule__Options__Group_1_1__3 ;
    public final void rule__Options__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1446:1: ( rule__Options__Group_1_1__2__Impl rule__Options__Group_1_1__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1447:2: rule__Options__Group_1_1__2__Impl rule__Options__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__2__Impl_in_rule__Options__Group_1_1__22995);
            rule__Options__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_1__3_in_rule__Options__Group_1_1__22998);
            rule__Options__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_1__2"


    // $ANTLR start "rule__Options__Group_1_1__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1454:1: rule__Options__Group_1_1__2__Impl : ( ':' ) ;
    public final void rule__Options__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1458:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1459:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1459:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1460:1: ':'
            {
             before(grammarAccess.getOptionsAccess().getColonKeyword_1_1_2()); 
            match(input,41,FOLLOW_41_in_rule__Options__Group_1_1__2__Impl3026); 
             after(grammarAccess.getOptionsAccess().getColonKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_1__2__Impl"


    // $ANTLR start "rule__Options__Group_1_1__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1473:1: rule__Options__Group_1_1__3 : rule__Options__Group_1_1__3__Impl ;
    public final void rule__Options__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1477:1: ( rule__Options__Group_1_1__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1478:2: rule__Options__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__3__Impl_in_rule__Options__Group_1_1__33057);
            rule__Options__Group_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_1__3"


    // $ANTLR start "rule__Options__Group_1_1__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1484:1: rule__Options__Group_1_1__3__Impl : ( ( rule__Options__SensorLanguageAssignment_1_1_3 ) ) ;
    public final void rule__Options__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1488:1: ( ( ( rule__Options__SensorLanguageAssignment_1_1_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1489:1: ( ( rule__Options__SensorLanguageAssignment_1_1_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1489:1: ( ( rule__Options__SensorLanguageAssignment_1_1_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1490:1: ( rule__Options__SensorLanguageAssignment_1_1_3 )
            {
             before(grammarAccess.getOptionsAccess().getSensorLanguageAssignment_1_1_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1491:1: ( rule__Options__SensorLanguageAssignment_1_1_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1491:2: rule__Options__SensorLanguageAssignment_1_1_3
            {
            pushFollow(FOLLOW_rule__Options__SensorLanguageAssignment_1_1_3_in_rule__Options__Group_1_1__3__Impl3084);
            rule__Options__SensorLanguageAssignment_1_1_3();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getSensorLanguageAssignment_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_1__3__Impl"


    // $ANTLR start "rule__Options__Group_1_2__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1509:1: rule__Options__Group_1_2__0 : rule__Options__Group_1_2__0__Impl rule__Options__Group_1_2__1 ;
    public final void rule__Options__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1513:1: ( rule__Options__Group_1_2__0__Impl rule__Options__Group_1_2__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1514:2: rule__Options__Group_1_2__0__Impl rule__Options__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Options__Group_1_2__0__Impl_in_rule__Options__Group_1_2__03122);
            rule__Options__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_2__1_in_rule__Options__Group_1_2__03125);
            rule__Options__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_2__0"


    // $ANTLR start "rule__Options__Group_1_2__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1521:1: rule__Options__Group_1_2__0__Impl : ( 'receiver' ) ;
    public final void rule__Options__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1525:1: ( ( 'receiver' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1526:1: ( 'receiver' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1526:1: ( 'receiver' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1527:1: 'receiver'
            {
             before(grammarAccess.getOptionsAccess().getReceiverKeyword_1_2_0()); 
            match(input,44,FOLLOW_44_in_rule__Options__Group_1_2__0__Impl3153); 
             after(grammarAccess.getOptionsAccess().getReceiverKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_2__0__Impl"


    // $ANTLR start "rule__Options__Group_1_2__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1540:1: rule__Options__Group_1_2__1 : rule__Options__Group_1_2__1__Impl rule__Options__Group_1_2__2 ;
    public final void rule__Options__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1544:1: ( rule__Options__Group_1_2__1__Impl rule__Options__Group_1_2__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1545:2: rule__Options__Group_1_2__1__Impl rule__Options__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__Options__Group_1_2__1__Impl_in_rule__Options__Group_1_2__13184);
            rule__Options__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_2__2_in_rule__Options__Group_1_2__13187);
            rule__Options__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_2__1"


    // $ANTLR start "rule__Options__Group_1_2__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1552:1: rule__Options__Group_1_2__1__Impl : ( 'language' ) ;
    public final void rule__Options__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1556:1: ( ( 'language' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1557:1: ( 'language' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1557:1: ( 'language' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1558:1: 'language'
            {
             before(grammarAccess.getOptionsAccess().getLanguageKeyword_1_2_1()); 
            match(input,43,FOLLOW_43_in_rule__Options__Group_1_2__1__Impl3215); 
             after(grammarAccess.getOptionsAccess().getLanguageKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_2__1__Impl"


    // $ANTLR start "rule__Options__Group_1_2__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1571:1: rule__Options__Group_1_2__2 : rule__Options__Group_1_2__2__Impl rule__Options__Group_1_2__3 ;
    public final void rule__Options__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1575:1: ( rule__Options__Group_1_2__2__Impl rule__Options__Group_1_2__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1576:2: rule__Options__Group_1_2__2__Impl rule__Options__Group_1_2__3
            {
            pushFollow(FOLLOW_rule__Options__Group_1_2__2__Impl_in_rule__Options__Group_1_2__23246);
            rule__Options__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_2__3_in_rule__Options__Group_1_2__23249);
            rule__Options__Group_1_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_2__2"


    // $ANTLR start "rule__Options__Group_1_2__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1583:1: rule__Options__Group_1_2__2__Impl : ( ':' ) ;
    public final void rule__Options__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1587:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1588:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1588:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1589:1: ':'
            {
             before(grammarAccess.getOptionsAccess().getColonKeyword_1_2_2()); 
            match(input,41,FOLLOW_41_in_rule__Options__Group_1_2__2__Impl3277); 
             after(grammarAccess.getOptionsAccess().getColonKeyword_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_2__2__Impl"


    // $ANTLR start "rule__Options__Group_1_2__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1602:1: rule__Options__Group_1_2__3 : rule__Options__Group_1_2__3__Impl ;
    public final void rule__Options__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1606:1: ( rule__Options__Group_1_2__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1607:2: rule__Options__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group_1_2__3__Impl_in_rule__Options__Group_1_2__33308);
            rule__Options__Group_1_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_2__3"


    // $ANTLR start "rule__Options__Group_1_2__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1613:1: rule__Options__Group_1_2__3__Impl : ( ( rule__Options__ReceiverLanguageAssignment_1_2_3 ) ) ;
    public final void rule__Options__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1617:1: ( ( ( rule__Options__ReceiverLanguageAssignment_1_2_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1618:1: ( ( rule__Options__ReceiverLanguageAssignment_1_2_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1618:1: ( ( rule__Options__ReceiverLanguageAssignment_1_2_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1619:1: ( rule__Options__ReceiverLanguageAssignment_1_2_3 )
            {
             before(grammarAccess.getOptionsAccess().getReceiverLanguageAssignment_1_2_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1620:1: ( rule__Options__ReceiverLanguageAssignment_1_2_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1620:2: rule__Options__ReceiverLanguageAssignment_1_2_3
            {
            pushFollow(FOLLOW_rule__Options__ReceiverLanguageAssignment_1_2_3_in_rule__Options__Group_1_2__3__Impl3335);
            rule__Options__ReceiverLanguageAssignment_1_2_3();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getReceiverLanguageAssignment_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1_2__3__Impl"


    // $ANTLR start "rule__Representation__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1638:1: rule__Representation__Group__0 : rule__Representation__Group__0__Impl rule__Representation__Group__1 ;
    public final void rule__Representation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1642:1: ( rule__Representation__Group__0__Impl rule__Representation__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1643:2: rule__Representation__Group__0__Impl rule__Representation__Group__1
            {
            pushFollow(FOLLOW_rule__Representation__Group__0__Impl_in_rule__Representation__Group__03373);
            rule__Representation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__1_in_rule__Representation__Group__03376);
            rule__Representation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__0"


    // $ANTLR start "rule__Representation__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1650:1: rule__Representation__Group__0__Impl : ( ( rule__Representation__Alternatives_0 ) ) ;
    public final void rule__Representation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1654:1: ( ( ( rule__Representation__Alternatives_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1655:1: ( ( rule__Representation__Alternatives_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1655:1: ( ( rule__Representation__Alternatives_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1656:1: ( rule__Representation__Alternatives_0 )
            {
             before(grammarAccess.getRepresentationAccess().getAlternatives_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1657:1: ( rule__Representation__Alternatives_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1657:2: rule__Representation__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Representation__Alternatives_0_in_rule__Representation__Group__0__Impl3403);
            rule__Representation__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRepresentationAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__0__Impl"


    // $ANTLR start "rule__Representation__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1667:1: rule__Representation__Group__1 : rule__Representation__Group__1__Impl rule__Representation__Group__2 ;
    public final void rule__Representation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1671:1: ( rule__Representation__Group__1__Impl rule__Representation__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1672:2: rule__Representation__Group__1__Impl rule__Representation__Group__2
            {
            pushFollow(FOLLOW_rule__Representation__Group__1__Impl_in_rule__Representation__Group__13433);
            rule__Representation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__2_in_rule__Representation__Group__13436);
            rule__Representation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__1"


    // $ANTLR start "rule__Representation__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1679:1: rule__Representation__Group__1__Impl : ( ( rule__Representation__NameAssignment_1 ) ) ;
    public final void rule__Representation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1683:1: ( ( ( rule__Representation__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1684:1: ( ( rule__Representation__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1684:1: ( ( rule__Representation__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1685:1: ( rule__Representation__NameAssignment_1 )
            {
             before(grammarAccess.getRepresentationAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1686:1: ( rule__Representation__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1686:2: rule__Representation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Representation__NameAssignment_1_in_rule__Representation__Group__1__Impl3463);
            rule__Representation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRepresentationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__1__Impl"


    // $ANTLR start "rule__Representation__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1696:1: rule__Representation__Group__2 : rule__Representation__Group__2__Impl rule__Representation__Group__3 ;
    public final void rule__Representation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1700:1: ( rule__Representation__Group__2__Impl rule__Representation__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1701:2: rule__Representation__Group__2__Impl rule__Representation__Group__3
            {
            pushFollow(FOLLOW_rule__Representation__Group__2__Impl_in_rule__Representation__Group__23493);
            rule__Representation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__3_in_rule__Representation__Group__23496);
            rule__Representation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__2"


    // $ANTLR start "rule__Representation__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1708:1: rule__Representation__Group__2__Impl : ( 'is' ) ;
    public final void rule__Representation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1712:1: ( ( 'is' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1713:1: ( 'is' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1713:1: ( 'is' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1714:1: 'is'
            {
             before(grammarAccess.getRepresentationAccess().getIsKeyword_2()); 
            match(input,45,FOLLOW_45_in_rule__Representation__Group__2__Impl3524); 
             after(grammarAccess.getRepresentationAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__2__Impl"


    // $ANTLR start "rule__Representation__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1727:1: rule__Representation__Group__3 : rule__Representation__Group__3__Impl rule__Representation__Group__4 ;
    public final void rule__Representation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1731:1: ( rule__Representation__Group__3__Impl rule__Representation__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1732:2: rule__Representation__Group__3__Impl rule__Representation__Group__4
            {
            pushFollow(FOLLOW_rule__Representation__Group__3__Impl_in_rule__Representation__Group__33555);
            rule__Representation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__4_in_rule__Representation__Group__33558);
            rule__Representation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__3"


    // $ANTLR start "rule__Representation__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1739:1: rule__Representation__Group__3__Impl : ( ( rule__Representation__TypeAssignment_3 ) ) ;
    public final void rule__Representation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1743:1: ( ( ( rule__Representation__TypeAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1744:1: ( ( rule__Representation__TypeAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1744:1: ( ( rule__Representation__TypeAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1745:1: ( rule__Representation__TypeAssignment_3 )
            {
             before(grammarAccess.getRepresentationAccess().getTypeAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1746:1: ( rule__Representation__TypeAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1746:2: rule__Representation__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Representation__TypeAssignment_3_in_rule__Representation__Group__3__Impl3585);
            rule__Representation__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRepresentationAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__3__Impl"


    // $ANTLR start "rule__Representation__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1756:1: rule__Representation__Group__4 : rule__Representation__Group__4__Impl rule__Representation__Group__5 ;
    public final void rule__Representation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1760:1: ( rule__Representation__Group__4__Impl rule__Representation__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1761:2: rule__Representation__Group__4__Impl rule__Representation__Group__5
            {
            pushFollow(FOLLOW_rule__Representation__Group__4__Impl_in_rule__Representation__Group__43615);
            rule__Representation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__5_in_rule__Representation__Group__43618);
            rule__Representation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__4"


    // $ANTLR start "rule__Representation__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1768:1: rule__Representation__Group__4__Impl : ( 'by' ) ;
    public final void rule__Representation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1772:1: ( ( 'by' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1773:1: ( 'by' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1773:1: ( 'by' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1774:1: 'by'
            {
             before(grammarAccess.getRepresentationAccess().getByKeyword_4()); 
            match(input,46,FOLLOW_46_in_rule__Representation__Group__4__Impl3646); 
             after(grammarAccess.getRepresentationAccess().getByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__4__Impl"


    // $ANTLR start "rule__Representation__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1787:1: rule__Representation__Group__5 : rule__Representation__Group__5__Impl rule__Representation__Group__6 ;
    public final void rule__Representation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1791:1: ( rule__Representation__Group__5__Impl rule__Representation__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1792:2: rule__Representation__Group__5__Impl rule__Representation__Group__6
            {
            pushFollow(FOLLOW_rule__Representation__Group__5__Impl_in_rule__Representation__Group__53677);
            rule__Representation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__6_in_rule__Representation__Group__53680);
            rule__Representation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__5"


    // $ANTLR start "rule__Representation__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1799:1: rule__Representation__Group__5__Impl : ( ( rule__Representation__ByteCountAssignment_5 ) ) ;
    public final void rule__Representation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1803:1: ( ( ( rule__Representation__ByteCountAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1804:1: ( ( rule__Representation__ByteCountAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1804:1: ( ( rule__Representation__ByteCountAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1805:1: ( rule__Representation__ByteCountAssignment_5 )
            {
             before(grammarAccess.getRepresentationAccess().getByteCountAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1806:1: ( rule__Representation__ByteCountAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1806:2: rule__Representation__ByteCountAssignment_5
            {
            pushFollow(FOLLOW_rule__Representation__ByteCountAssignment_5_in_rule__Representation__Group__5__Impl3707);
            rule__Representation__ByteCountAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRepresentationAccess().getByteCountAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__5__Impl"


    // $ANTLR start "rule__Representation__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1816:1: rule__Representation__Group__6 : rule__Representation__Group__6__Impl ;
    public final void rule__Representation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1820:1: ( rule__Representation__Group__6__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1821:2: rule__Representation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Representation__Group__6__Impl_in_rule__Representation__Group__63737);
            rule__Representation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__6"


    // $ANTLR start "rule__Representation__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1827:1: rule__Representation__Group__6__Impl : ( ( rule__Representation__Alternatives_6 ) ) ;
    public final void rule__Representation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1831:1: ( ( ( rule__Representation__Alternatives_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1832:1: ( ( rule__Representation__Alternatives_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1832:1: ( ( rule__Representation__Alternatives_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1833:1: ( rule__Representation__Alternatives_6 )
            {
             before(grammarAccess.getRepresentationAccess().getAlternatives_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1834:1: ( rule__Representation__Alternatives_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1834:2: rule__Representation__Alternatives_6
            {
            pushFollow(FOLLOW_rule__Representation__Alternatives_6_in_rule__Representation__Group__6__Impl3764);
            rule__Representation__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getRepresentationAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__6__Impl"


    // $ANTLR start "rule__Calculated__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1858:1: rule__Calculated__Group__0 : rule__Calculated__Group__0__Impl rule__Calculated__Group__1 ;
    public final void rule__Calculated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1862:1: ( rule__Calculated__Group__0__Impl rule__Calculated__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1863:2: rule__Calculated__Group__0__Impl rule__Calculated__Group__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group__0__Impl_in_rule__Calculated__Group__03808);
            rule__Calculated__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__1_in_rule__Calculated__Group__03811);
            rule__Calculated__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__0"


    // $ANTLR start "rule__Calculated__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1870:1: rule__Calculated__Group__0__Impl : ( ( rule__Calculated__Alternatives_0 ) ) ;
    public final void rule__Calculated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1874:1: ( ( ( rule__Calculated__Alternatives_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1875:1: ( ( rule__Calculated__Alternatives_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1875:1: ( ( rule__Calculated__Alternatives_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1876:1: ( rule__Calculated__Alternatives_0 )
            {
             before(grammarAccess.getCalculatedAccess().getAlternatives_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1877:1: ( rule__Calculated__Alternatives_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1877:2: rule__Calculated__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Calculated__Alternatives_0_in_rule__Calculated__Group__0__Impl3838);
            rule__Calculated__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__0__Impl"


    // $ANTLR start "rule__Calculated__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1887:1: rule__Calculated__Group__1 : rule__Calculated__Group__1__Impl rule__Calculated__Group__2 ;
    public final void rule__Calculated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1891:1: ( rule__Calculated__Group__1__Impl rule__Calculated__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1892:2: rule__Calculated__Group__1__Impl rule__Calculated__Group__2
            {
            pushFollow(FOLLOW_rule__Calculated__Group__1__Impl_in_rule__Calculated__Group__13868);
            rule__Calculated__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__2_in_rule__Calculated__Group__13871);
            rule__Calculated__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__1"


    // $ANTLR start "rule__Calculated__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1899:1: rule__Calculated__Group__1__Impl : ( ( rule__Calculated__NameAssignment_1 ) ) ;
    public final void rule__Calculated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1903:1: ( ( ( rule__Calculated__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1904:1: ( ( rule__Calculated__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1904:1: ( ( rule__Calculated__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1905:1: ( rule__Calculated__NameAssignment_1 )
            {
             before(grammarAccess.getCalculatedAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1906:1: ( rule__Calculated__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1906:2: rule__Calculated__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Calculated__NameAssignment_1_in_rule__Calculated__Group__1__Impl3898);
            rule__Calculated__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__1__Impl"


    // $ANTLR start "rule__Calculated__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1916:1: rule__Calculated__Group__2 : rule__Calculated__Group__2__Impl rule__Calculated__Group__3 ;
    public final void rule__Calculated__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1920:1: ( rule__Calculated__Group__2__Impl rule__Calculated__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1921:2: rule__Calculated__Group__2__Impl rule__Calculated__Group__3
            {
            pushFollow(FOLLOW_rule__Calculated__Group__2__Impl_in_rule__Calculated__Group__23928);
            rule__Calculated__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__3_in_rule__Calculated__Group__23931);
            rule__Calculated__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__2"


    // $ANTLR start "rule__Calculated__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1928:1: rule__Calculated__Group__2__Impl : ( 'as' ) ;
    public final void rule__Calculated__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1932:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1933:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1933:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1934:1: 'as'
            {
             before(grammarAccess.getCalculatedAccess().getAsKeyword_2()); 
            match(input,47,FOLLOW_47_in_rule__Calculated__Group__2__Impl3959); 
             after(grammarAccess.getCalculatedAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__2__Impl"


    // $ANTLR start "rule__Calculated__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1947:1: rule__Calculated__Group__3 : rule__Calculated__Group__3__Impl rule__Calculated__Group__4 ;
    public final void rule__Calculated__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1951:1: ( rule__Calculated__Group__3__Impl rule__Calculated__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1952:2: rule__Calculated__Group__3__Impl rule__Calculated__Group__4
            {
            pushFollow(FOLLOW_rule__Calculated__Group__3__Impl_in_rule__Calculated__Group__33990);
            rule__Calculated__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__4_in_rule__Calculated__Group__33993);
            rule__Calculated__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__3"


    // $ANTLR start "rule__Calculated__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1959:1: rule__Calculated__Group__3__Impl : ( ( rule__Calculated__RepresentationAssignment_3 ) ) ;
    public final void rule__Calculated__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1963:1: ( ( ( rule__Calculated__RepresentationAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1964:1: ( ( rule__Calculated__RepresentationAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1964:1: ( ( rule__Calculated__RepresentationAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1965:1: ( rule__Calculated__RepresentationAssignment_3 )
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1966:1: ( rule__Calculated__RepresentationAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1966:2: rule__Calculated__RepresentationAssignment_3
            {
            pushFollow(FOLLOW_rule__Calculated__RepresentationAssignment_3_in_rule__Calculated__Group__3__Impl4020);
            rule__Calculated__RepresentationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getRepresentationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__3__Impl"


    // $ANTLR start "rule__Calculated__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1976:1: rule__Calculated__Group__4 : rule__Calculated__Group__4__Impl rule__Calculated__Group__5 ;
    public final void rule__Calculated__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1980:1: ( rule__Calculated__Group__4__Impl rule__Calculated__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1981:2: rule__Calculated__Group__4__Impl rule__Calculated__Group__5
            {
            pushFollow(FOLLOW_rule__Calculated__Group__4__Impl_in_rule__Calculated__Group__44050);
            rule__Calculated__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__5_in_rule__Calculated__Group__44053);
            rule__Calculated__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__4"


    // $ANTLR start "rule__Calculated__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1988:1: rule__Calculated__Group__4__Impl : ( 'by' ) ;
    public final void rule__Calculated__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1992:1: ( ( 'by' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1993:1: ( 'by' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1993:1: ( 'by' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1994:1: 'by'
            {
             before(grammarAccess.getCalculatedAccess().getByKeyword_4()); 
            match(input,46,FOLLOW_46_in_rule__Calculated__Group__4__Impl4081); 
             after(grammarAccess.getCalculatedAccess().getByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__4__Impl"


    // $ANTLR start "rule__Calculated__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2007:1: rule__Calculated__Group__5 : rule__Calculated__Group__5__Impl rule__Calculated__Group__6 ;
    public final void rule__Calculated__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2011:1: ( rule__Calculated__Group__5__Impl rule__Calculated__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2012:2: rule__Calculated__Group__5__Impl rule__Calculated__Group__6
            {
            pushFollow(FOLLOW_rule__Calculated__Group__5__Impl_in_rule__Calculated__Group__54112);
            rule__Calculated__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__6_in_rule__Calculated__Group__54115);
            rule__Calculated__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__5"


    // $ANTLR start "rule__Calculated__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2019:1: rule__Calculated__Group__5__Impl : ( ( rule__Calculated__MethodNameAssignment_5 ) ) ;
    public final void rule__Calculated__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2023:1: ( ( ( rule__Calculated__MethodNameAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2024:1: ( ( rule__Calculated__MethodNameAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2024:1: ( ( rule__Calculated__MethodNameAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2025:1: ( rule__Calculated__MethodNameAssignment_5 )
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2026:1: ( rule__Calculated__MethodNameAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2026:2: rule__Calculated__MethodNameAssignment_5
            {
            pushFollow(FOLLOW_rule__Calculated__MethodNameAssignment_5_in_rule__Calculated__Group__5__Impl4142);
            rule__Calculated__MethodNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getMethodNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__5__Impl"


    // $ANTLR start "rule__Calculated__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2036:1: rule__Calculated__Group__6 : rule__Calculated__Group__6__Impl rule__Calculated__Group__7 ;
    public final void rule__Calculated__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2040:1: ( rule__Calculated__Group__6__Impl rule__Calculated__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2041:2: rule__Calculated__Group__6__Impl rule__Calculated__Group__7
            {
            pushFollow(FOLLOW_rule__Calculated__Group__6__Impl_in_rule__Calculated__Group__64172);
            rule__Calculated__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__7_in_rule__Calculated__Group__64175);
            rule__Calculated__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__6"


    // $ANTLR start "rule__Calculated__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2048:1: rule__Calculated__Group__6__Impl : ( ( rule__Calculated__Group_6__0 )? ) ;
    public final void rule__Calculated__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2052:1: ( ( ( rule__Calculated__Group_6__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2053:1: ( ( rule__Calculated__Group_6__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2053:1: ( ( rule__Calculated__Group_6__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2054:1: ( rule__Calculated__Group_6__0 )?
            {
             before(grammarAccess.getCalculatedAccess().getGroup_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2055:1: ( rule__Calculated__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2055:2: rule__Calculated__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Calculated__Group_6__0_in_rule__Calculated__Group__6__Impl4202);
                    rule__Calculated__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalculatedAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__6__Impl"


    // $ANTLR start "rule__Calculated__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2065:1: rule__Calculated__Group__7 : rule__Calculated__Group__7__Impl rule__Calculated__Group__8 ;
    public final void rule__Calculated__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2069:1: ( rule__Calculated__Group__7__Impl rule__Calculated__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2070:2: rule__Calculated__Group__7__Impl rule__Calculated__Group__8
            {
            pushFollow(FOLLOW_rule__Calculated__Group__7__Impl_in_rule__Calculated__Group__74233);
            rule__Calculated__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__8_in_rule__Calculated__Group__74236);
            rule__Calculated__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__7"


    // $ANTLR start "rule__Calculated__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2077:1: rule__Calculated__Group__7__Impl : ( 'with' ) ;
    public final void rule__Calculated__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2081:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2082:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2082:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2083:1: 'with'
            {
             before(grammarAccess.getCalculatedAccess().getWithKeyword_7()); 
            match(input,48,FOLLOW_48_in_rule__Calculated__Group__7__Impl4264); 
             after(grammarAccess.getCalculatedAccess().getWithKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__7__Impl"


    // $ANTLR start "rule__Calculated__Group__8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2096:1: rule__Calculated__Group__8 : rule__Calculated__Group__8__Impl rule__Calculated__Group__9 ;
    public final void rule__Calculated__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2100:1: ( rule__Calculated__Group__8__Impl rule__Calculated__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2101:2: rule__Calculated__Group__8__Impl rule__Calculated__Group__9
            {
            pushFollow(FOLLOW_rule__Calculated__Group__8__Impl_in_rule__Calculated__Group__84295);
            rule__Calculated__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__9_in_rule__Calculated__Group__84298);
            rule__Calculated__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__8"


    // $ANTLR start "rule__Calculated__Group__8__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2108:1: rule__Calculated__Group__8__Impl : ( ( rule__Calculated__ParameterAssignment_8 ) ) ;
    public final void rule__Calculated__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2112:1: ( ( ( rule__Calculated__ParameterAssignment_8 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2113:1: ( ( rule__Calculated__ParameterAssignment_8 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2113:1: ( ( rule__Calculated__ParameterAssignment_8 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2114:1: ( rule__Calculated__ParameterAssignment_8 )
            {
             before(grammarAccess.getCalculatedAccess().getParameterAssignment_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2115:1: ( rule__Calculated__ParameterAssignment_8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2115:2: rule__Calculated__ParameterAssignment_8
            {
            pushFollow(FOLLOW_rule__Calculated__ParameterAssignment_8_in_rule__Calculated__Group__8__Impl4325);
            rule__Calculated__ParameterAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getParameterAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__8__Impl"


    // $ANTLR start "rule__Calculated__Group__9"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2125:1: rule__Calculated__Group__9 : rule__Calculated__Group__9__Impl ;
    public final void rule__Calculated__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2129:1: ( rule__Calculated__Group__9__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2130:2: rule__Calculated__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group__9__Impl_in_rule__Calculated__Group__94355);
            rule__Calculated__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__9"


    // $ANTLR start "rule__Calculated__Group__9__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2136:1: rule__Calculated__Group__9__Impl : ( ( rule__Calculated__Group_9__0 )* ) ;
    public final void rule__Calculated__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2140:1: ( ( ( rule__Calculated__Group_9__0 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2141:1: ( ( rule__Calculated__Group_9__0 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2141:1: ( ( rule__Calculated__Group_9__0 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2142:1: ( rule__Calculated__Group_9__0 )*
            {
             before(grammarAccess.getCalculatedAccess().getGroup_9()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2143:1: ( rule__Calculated__Group_9__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2143:2: rule__Calculated__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Calculated__Group_9__0_in_rule__Calculated__Group__9__Impl4382);
            	    rule__Calculated__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getCalculatedAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__9__Impl"


    // $ANTLR start "rule__Calculated__Group_6__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2173:1: rule__Calculated__Group_6__0 : rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1 ;
    public final void rule__Calculated__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2177:1: ( rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2178:2: rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group_6__0__Impl_in_rule__Calculated__Group_6__04433);
            rule__Calculated__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group_6__1_in_rule__Calculated__Group_6__04436);
            rule__Calculated__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_6__0"


    // $ANTLR start "rule__Calculated__Group_6__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2185:1: rule__Calculated__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Calculated__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2189:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2190:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2190:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2191:1: ','
            {
             before(grammarAccess.getCalculatedAccess().getCommaKeyword_6_0()); 
            match(input,38,FOLLOW_38_in_rule__Calculated__Group_6__0__Impl4464); 
             after(grammarAccess.getCalculatedAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_6__0__Impl"


    // $ANTLR start "rule__Calculated__Group_6__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2204:1: rule__Calculated__Group_6__1 : rule__Calculated__Group_6__1__Impl ;
    public final void rule__Calculated__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2208:1: ( rule__Calculated__Group_6__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2209:2: rule__Calculated__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group_6__1__Impl_in_rule__Calculated__Group_6__14495);
            rule__Calculated__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_6__1"


    // $ANTLR start "rule__Calculated__Group_6__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2215:1: rule__Calculated__Group_6__1__Impl : ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) ) ;
    public final void rule__Calculated__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2219:1: ( ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2220:1: ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2220:1: ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2221:1: ( rule__Calculated__MethodNameOutAssignment_6_1 )
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameOutAssignment_6_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2222:1: ( rule__Calculated__MethodNameOutAssignment_6_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2222:2: rule__Calculated__MethodNameOutAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Calculated__MethodNameOutAssignment_6_1_in_rule__Calculated__Group_6__1__Impl4522);
            rule__Calculated__MethodNameOutAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getMethodNameOutAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_6__1__Impl"


    // $ANTLR start "rule__Calculated__Group_9__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2236:1: rule__Calculated__Group_9__0 : rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1 ;
    public final void rule__Calculated__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2240:1: ( rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2241:2: rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group_9__0__Impl_in_rule__Calculated__Group_9__04556);
            rule__Calculated__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group_9__1_in_rule__Calculated__Group_9__04559);
            rule__Calculated__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_9__0"


    // $ANTLR start "rule__Calculated__Group_9__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2248:1: rule__Calculated__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Calculated__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2252:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2253:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2253:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2254:1: ','
            {
             before(grammarAccess.getCalculatedAccess().getCommaKeyword_9_0()); 
            match(input,38,FOLLOW_38_in_rule__Calculated__Group_9__0__Impl4587); 
             after(grammarAccess.getCalculatedAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_9__0__Impl"


    // $ANTLR start "rule__Calculated__Group_9__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2267:1: rule__Calculated__Group_9__1 : rule__Calculated__Group_9__1__Impl ;
    public final void rule__Calculated__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2271:1: ( rule__Calculated__Group_9__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2272:2: rule__Calculated__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group_9__1__Impl_in_rule__Calculated__Group_9__14618);
            rule__Calculated__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_9__1"


    // $ANTLR start "rule__Calculated__Group_9__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2278:1: rule__Calculated__Group_9__1__Impl : ( ( rule__Calculated__ParameterAssignment_9_1 ) ) ;
    public final void rule__Calculated__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2282:1: ( ( ( rule__Calculated__ParameterAssignment_9_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2283:1: ( ( rule__Calculated__ParameterAssignment_9_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2283:1: ( ( rule__Calculated__ParameterAssignment_9_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2284:1: ( rule__Calculated__ParameterAssignment_9_1 )
            {
             before(grammarAccess.getCalculatedAccess().getParameterAssignment_9_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2285:1: ( rule__Calculated__ParameterAssignment_9_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2285:2: rule__Calculated__ParameterAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Calculated__ParameterAssignment_9_1_in_rule__Calculated__Group_9__1__Impl4645);
            rule__Calculated__ParameterAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getParameterAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_9__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2299:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2303:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2304:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04679);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04682);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2311:1: rule__Parameter__Group__0__Impl : ( '(' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2315:1: ( ( '(' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2316:1: ( '(' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2316:1: ( '(' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2317:1: '('
            {
             before(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__Parameter__Group__0__Impl4710); 
             after(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2330:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2334:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2335:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14741);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14744);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2342:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__InterpretationAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2346:1: ( ( ( rule__Parameter__InterpretationAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2347:1: ( ( rule__Parameter__InterpretationAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2347:1: ( ( rule__Parameter__InterpretationAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2348:1: ( rule__Parameter__InterpretationAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getInterpretationAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2349:1: ( rule__Parameter__InterpretationAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2349:2: rule__Parameter__InterpretationAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__InterpretationAssignment_1_in_rule__Parameter__Group__1__Impl4771);
            rule__Parameter__InterpretationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getInterpretationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2359:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2363:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2364:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24801);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__24804);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2371:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2375:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2376:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2376:1: ( ( rule__Parameter__Group_2__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2377:1: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2378:1: ( rule__Parameter__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2378:2: rule__Parameter__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl4831);
                    rule__Parameter__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2388:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2392:1: ( rule__Parameter__Group__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2393:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__34862);
            rule__Parameter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2399:1: rule__Parameter__Group__3__Impl : ( ')' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2403:1: ( ( ')' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2404:1: ( ')' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2404:1: ( ')' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2405:1: ')'
            {
             before(grammarAccess.getParameterAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FOLLOW_50_in_rule__Parameter__Group__3__Impl4890); 
             after(grammarAccess.getParameterAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group_2__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2426:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2430:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2431:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__04929);
            rule__Parameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__04932);
            rule__Parameter__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__0"


    // $ANTLR start "rule__Parameter__Group_2__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2438:1: rule__Parameter__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2442:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2443:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2443:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2444:1: 'as'
            {
             before(grammarAccess.getParameterAccess().getAsKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__Parameter__Group_2__0__Impl4960); 
             after(grammarAccess.getParameterAccess().getAsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__0__Impl"


    // $ANTLR start "rule__Parameter__Group_2__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2457:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2461:1: ( rule__Parameter__Group_2__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2462:2: rule__Parameter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__14991);
            rule__Parameter__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__1"


    // $ANTLR start "rule__Parameter__Group_2__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2468:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2472:1: ( ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2473:1: ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2473:1: ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2474:1: ( rule__Parameter__ArgumentTypeAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getArgumentTypeAssignment_2_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2475:1: ( rule__Parameter__ArgumentTypeAssignment_2_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2475:2: rule__Parameter__ArgumentTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Parameter__ArgumentTypeAssignment_2_1_in_rule__Parameter__Group_2__1__Impl5018);
            rule__Parameter__ArgumentTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getArgumentTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__1__Impl"


    // $ANTLR start "rule__InterpretationGroup__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2489:1: rule__InterpretationGroup__Group__0 : rule__InterpretationGroup__Group__0__Impl rule__InterpretationGroup__Group__1 ;
    public final void rule__InterpretationGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2493:1: ( rule__InterpretationGroup__Group__0__Impl rule__InterpretationGroup__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2494:2: rule__InterpretationGroup__Group__0__Impl rule__InterpretationGroup__Group__1
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__0__Impl_in_rule__InterpretationGroup__Group__05052);
            rule__InterpretationGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterpretationGroup__Group__1_in_rule__InterpretationGroup__Group__05055);
            rule__InterpretationGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterpretationGroup__Group__0"


    // $ANTLR start "rule__InterpretationGroup__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2501:1: rule__InterpretationGroup__Group__0__Impl : ( 'group' ) ;
    public final void rule__InterpretationGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2505:1: ( ( 'group' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2506:1: ( 'group' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2506:1: ( 'group' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2507:1: 'group'
            {
             before(grammarAccess.getInterpretationGroupAccess().getGroupKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__InterpretationGroup__Group__0__Impl5083); 
             after(grammarAccess.getInterpretationGroupAccess().getGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterpretationGroup__Group__0__Impl"


    // $ANTLR start "rule__InterpretationGroup__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2520:1: rule__InterpretationGroup__Group__1 : rule__InterpretationGroup__Group__1__Impl rule__InterpretationGroup__Group__2 ;
    public final void rule__InterpretationGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2524:1: ( rule__InterpretationGroup__Group__1__Impl rule__InterpretationGroup__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2525:2: rule__InterpretationGroup__Group__1__Impl rule__InterpretationGroup__Group__2
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__1__Impl_in_rule__InterpretationGroup__Group__15114);
            rule__InterpretationGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterpretationGroup__Group__2_in_rule__InterpretationGroup__Group__15117);
            rule__InterpretationGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterpretationGroup__Group__1"


    // $ANTLR start "rule__InterpretationGroup__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2532:1: rule__InterpretationGroup__Group__1__Impl : ( ( rule__InterpretationGroup__NameAssignment_1 ) ) ;
    public final void rule__InterpretationGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2536:1: ( ( ( rule__InterpretationGroup__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2537:1: ( ( rule__InterpretationGroup__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2537:1: ( ( rule__InterpretationGroup__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2538:1: ( rule__InterpretationGroup__NameAssignment_1 )
            {
             before(grammarAccess.getInterpretationGroupAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2539:1: ( rule__InterpretationGroup__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2539:2: rule__InterpretationGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__NameAssignment_1_in_rule__InterpretationGroup__Group__1__Impl5144);
            rule__InterpretationGroup__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterpretationGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterpretationGroup__Group__1__Impl"


    // $ANTLR start "rule__InterpretationGroup__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2549:1: rule__InterpretationGroup__Group__2 : rule__InterpretationGroup__Group__2__Impl rule__InterpretationGroup__Group__3 ;
    public final void rule__InterpretationGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2553:1: ( rule__InterpretationGroup__Group__2__Impl rule__InterpretationGroup__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2554:2: rule__InterpretationGroup__Group__2__Impl rule__InterpretationGroup__Group__3
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__2__Impl_in_rule__InterpretationGroup__Group__25174);
            rule__InterpretationGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterpretationGroup__Group__3_in_rule__InterpretationGroup__Group__25177);
            rule__InterpretationGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterpretationGroup__Group__2"


    // $ANTLR start "rule__InterpretationGroup__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2561:1: rule__InterpretationGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__InterpretationGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2565:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2566:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2566:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2567:1: '{'
            {
             before(grammarAccess.getInterpretationGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__InterpretationGroup__Group__2__Impl5205); 
             after(grammarAccess.getInterpretationGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterpretationGroup__Group__2__Impl"


    // $ANTLR start "rule__InterpretationGroup__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2580:1: rule__InterpretationGroup__Group__3 : rule__InterpretationGroup__Group__3__Impl rule__InterpretationGroup__Group__4 ;
    public final void rule__InterpretationGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2584:1: ( rule__InterpretationGroup__Group__3__Impl rule__InterpretationGroup__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2585:2: rule__InterpretationGroup__Group__3__Impl rule__InterpretationGroup__Group__4
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__3__Impl_in_rule__InterpretationGroup__Group__35236);
            rule__InterpretationGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterpretationGroup__Group__4_in_rule__InterpretationGroup__Group__35239);
            rule__InterpretationGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterpretationGroup__Group__3"


    // $ANTLR start "rule__InterpretationGroup__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2592:1: rule__InterpretationGroup__Group__3__Impl : ( ( rule__InterpretationGroup__InterpretationsAssignment_3 )* ) ;
    public final void rule__InterpretationGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2596:1: ( ( ( rule__InterpretationGroup__InterpretationsAssignment_3 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2597:1: ( ( rule__InterpretationGroup__InterpretationsAssignment_3 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2597:1: ( ( rule__InterpretationGroup__InterpretationsAssignment_3 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2598:1: ( rule__InterpretationGroup__InterpretationsAssignment_3 )*
            {
             before(grammarAccess.getInterpretationGroupAccess().getInterpretationsAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2599:1: ( rule__InterpretationGroup__InterpretationsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=16 && LA17_0<=17)||(LA17_0>=51 && LA17_0<=52)||(LA17_0>=57 && LA17_0<=58)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2599:2: rule__InterpretationGroup__InterpretationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__InterpretationGroup__InterpretationsAssignment_3_in_rule__InterpretationGroup__Group__3__Impl5266);
            	    rule__InterpretationGroup__InterpretationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getInterpretationGroupAccess().getInterpretationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterpretationGroup__Group__3__Impl"


    // $ANTLR start "rule__InterpretationGroup__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2609:1: rule__InterpretationGroup__Group__4 : rule__InterpretationGroup__Group__4__Impl ;
    public final void rule__InterpretationGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2613:1: ( rule__InterpretationGroup__Group__4__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2614:2: rule__InterpretationGroup__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__4__Impl_in_rule__InterpretationGroup__Group__45297);
            rule__InterpretationGroup__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterpretationGroup__Group__4"


    // $ANTLR start "rule__InterpretationGroup__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2620:1: rule__InterpretationGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__InterpretationGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2624:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2625:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2625:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2626:1: '}'
            {
             before(grammarAccess.getInterpretationGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__InterpretationGroup__Group__4__Impl5325); 
             after(grammarAccess.getInterpretationGroupAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterpretationGroup__Group__4__Impl"


    // $ANTLR start "rule__Measurement__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2649:1: rule__Measurement__Group__0 : rule__Measurement__Group__0__Impl rule__Measurement__Group__1 ;
    public final void rule__Measurement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2653:1: ( rule__Measurement__Group__0__Impl rule__Measurement__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2654:2: rule__Measurement__Group__0__Impl rule__Measurement__Group__1
            {
            pushFollow(FOLLOW_rule__Measurement__Group__0__Impl_in_rule__Measurement__Group__05366);
            rule__Measurement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__1_in_rule__Measurement__Group__05369);
            rule__Measurement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__0"


    // $ANTLR start "rule__Measurement__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2661:1: rule__Measurement__Group__0__Impl : ( 'measurement' ) ;
    public final void rule__Measurement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2665:1: ( ( 'measurement' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2666:1: ( 'measurement' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2666:1: ( 'measurement' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2667:1: 'measurement'
            {
             before(grammarAccess.getMeasurementAccess().getMeasurementKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__Measurement__Group__0__Impl5397); 
             after(grammarAccess.getMeasurementAccess().getMeasurementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__0__Impl"


    // $ANTLR start "rule__Measurement__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2680:1: rule__Measurement__Group__1 : rule__Measurement__Group__1__Impl rule__Measurement__Group__2 ;
    public final void rule__Measurement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2684:1: ( rule__Measurement__Group__1__Impl rule__Measurement__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2685:2: rule__Measurement__Group__1__Impl rule__Measurement__Group__2
            {
            pushFollow(FOLLOW_rule__Measurement__Group__1__Impl_in_rule__Measurement__Group__15428);
            rule__Measurement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__2_in_rule__Measurement__Group__15431);
            rule__Measurement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__1"


    // $ANTLR start "rule__Measurement__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2692:1: rule__Measurement__Group__1__Impl : ( 'of' ) ;
    public final void rule__Measurement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2696:1: ( ( 'of' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2697:1: ( 'of' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2697:1: ( 'of' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2698:1: 'of'
            {
             before(grammarAccess.getMeasurementAccess().getOfKeyword_1()); 
            match(input,53,FOLLOW_53_in_rule__Measurement__Group__1__Impl5459); 
             after(grammarAccess.getMeasurementAccess().getOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__1__Impl"


    // $ANTLR start "rule__Measurement__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2711:1: rule__Measurement__Group__2 : rule__Measurement__Group__2__Impl rule__Measurement__Group__3 ;
    public final void rule__Measurement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2715:1: ( rule__Measurement__Group__2__Impl rule__Measurement__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2716:2: rule__Measurement__Group__2__Impl rule__Measurement__Group__3
            {
            pushFollow(FOLLOW_rule__Measurement__Group__2__Impl_in_rule__Measurement__Group__25490);
            rule__Measurement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__3_in_rule__Measurement__Group__25493);
            rule__Measurement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__2"


    // $ANTLR start "rule__Measurement__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2723:1: rule__Measurement__Group__2__Impl : ( ( rule__Measurement__QuantityAssignment_2 ) ) ;
    public final void rule__Measurement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2727:1: ( ( ( rule__Measurement__QuantityAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2728:1: ( ( rule__Measurement__QuantityAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2728:1: ( ( rule__Measurement__QuantityAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2729:1: ( rule__Measurement__QuantityAssignment_2 )
            {
             before(grammarAccess.getMeasurementAccess().getQuantityAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2730:1: ( rule__Measurement__QuantityAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2730:2: rule__Measurement__QuantityAssignment_2
            {
            pushFollow(FOLLOW_rule__Measurement__QuantityAssignment_2_in_rule__Measurement__Group__2__Impl5520);
            rule__Measurement__QuantityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getQuantityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__2__Impl"


    // $ANTLR start "rule__Measurement__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2740:1: rule__Measurement__Group__3 : rule__Measurement__Group__3__Impl rule__Measurement__Group__4 ;
    public final void rule__Measurement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2744:1: ( rule__Measurement__Group__3__Impl rule__Measurement__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2745:2: rule__Measurement__Group__3__Impl rule__Measurement__Group__4
            {
            pushFollow(FOLLOW_rule__Measurement__Group__3__Impl_in_rule__Measurement__Group__35550);
            rule__Measurement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__4_in_rule__Measurement__Group__35553);
            rule__Measurement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__3"


    // $ANTLR start "rule__Measurement__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2752:1: rule__Measurement__Group__3__Impl : ( ( rule__Measurement__NameAssignment_3 ) ) ;
    public final void rule__Measurement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2756:1: ( ( ( rule__Measurement__NameAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2757:1: ( ( rule__Measurement__NameAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2757:1: ( ( rule__Measurement__NameAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2758:1: ( rule__Measurement__NameAssignment_3 )
            {
             before(grammarAccess.getMeasurementAccess().getNameAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2759:1: ( rule__Measurement__NameAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2759:2: rule__Measurement__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Measurement__NameAssignment_3_in_rule__Measurement__Group__3__Impl5580);
            rule__Measurement__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__3__Impl"


    // $ANTLR start "rule__Measurement__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2769:1: rule__Measurement__Group__4 : rule__Measurement__Group__4__Impl rule__Measurement__Group__5 ;
    public final void rule__Measurement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2773:1: ( rule__Measurement__Group__4__Impl rule__Measurement__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2774:2: rule__Measurement__Group__4__Impl rule__Measurement__Group__5
            {
            pushFollow(FOLLOW_rule__Measurement__Group__4__Impl_in_rule__Measurement__Group__45610);
            rule__Measurement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__5_in_rule__Measurement__Group__45613);
            rule__Measurement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__4"


    // $ANTLR start "rule__Measurement__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2781:1: rule__Measurement__Group__4__Impl : ( 'in' ) ;
    public final void rule__Measurement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2785:1: ( ( 'in' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2786:1: ( 'in' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2786:1: ( 'in' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2787:1: 'in'
            {
             before(grammarAccess.getMeasurementAccess().getInKeyword_4()); 
            match(input,54,FOLLOW_54_in_rule__Measurement__Group__4__Impl5641); 
             after(grammarAccess.getMeasurementAccess().getInKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__4__Impl"


    // $ANTLR start "rule__Measurement__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2800:1: rule__Measurement__Group__5 : rule__Measurement__Group__5__Impl rule__Measurement__Group__6 ;
    public final void rule__Measurement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2804:1: ( rule__Measurement__Group__5__Impl rule__Measurement__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2805:2: rule__Measurement__Group__5__Impl rule__Measurement__Group__6
            {
            pushFollow(FOLLOW_rule__Measurement__Group__5__Impl_in_rule__Measurement__Group__55672);
            rule__Measurement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__6_in_rule__Measurement__Group__55675);
            rule__Measurement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__5"


    // $ANTLR start "rule__Measurement__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2812:1: rule__Measurement__Group__5__Impl : ( ( rule__Measurement__ScaleAssignment_5 )? ) ;
    public final void rule__Measurement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2816:1: ( ( ( rule__Measurement__ScaleAssignment_5 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2817:1: ( ( rule__Measurement__ScaleAssignment_5 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2817:1: ( ( rule__Measurement__ScaleAssignment_5 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2818:1: ( rule__Measurement__ScaleAssignment_5 )?
            {
             before(grammarAccess.getMeasurementAccess().getScaleAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2819:1: ( rule__Measurement__ScaleAssignment_5 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2819:2: rule__Measurement__ScaleAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Measurement__ScaleAssignment_5_in_rule__Measurement__Group__5__Impl5702);
                    rule__Measurement__ScaleAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementAccess().getScaleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__5__Impl"


    // $ANTLR start "rule__Measurement__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2829:1: rule__Measurement__Group__6 : rule__Measurement__Group__6__Impl rule__Measurement__Group__7 ;
    public final void rule__Measurement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2833:1: ( rule__Measurement__Group__6__Impl rule__Measurement__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2834:2: rule__Measurement__Group__6__Impl rule__Measurement__Group__7
            {
            pushFollow(FOLLOW_rule__Measurement__Group__6__Impl_in_rule__Measurement__Group__65733);
            rule__Measurement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__7_in_rule__Measurement__Group__65736);
            rule__Measurement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__6"


    // $ANTLR start "rule__Measurement__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2841:1: rule__Measurement__Group__6__Impl : ( ( rule__Measurement__UnitAssignment_6 ) ) ;
    public final void rule__Measurement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2845:1: ( ( ( rule__Measurement__UnitAssignment_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2846:1: ( ( rule__Measurement__UnitAssignment_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2846:1: ( ( rule__Measurement__UnitAssignment_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2847:1: ( rule__Measurement__UnitAssignment_6 )
            {
             before(grammarAccess.getMeasurementAccess().getUnitAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2848:1: ( rule__Measurement__UnitAssignment_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2848:2: rule__Measurement__UnitAssignment_6
            {
            pushFollow(FOLLOW_rule__Measurement__UnitAssignment_6_in_rule__Measurement__Group__6__Impl5763);
            rule__Measurement__UnitAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getUnitAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__6__Impl"


    // $ANTLR start "rule__Measurement__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2858:1: rule__Measurement__Group__7 : rule__Measurement__Group__7__Impl rule__Measurement__Group__8 ;
    public final void rule__Measurement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2862:1: ( rule__Measurement__Group__7__Impl rule__Measurement__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2863:2: rule__Measurement__Group__7__Impl rule__Measurement__Group__8
            {
            pushFollow(FOLLOW_rule__Measurement__Group__7__Impl_in_rule__Measurement__Group__75793);
            rule__Measurement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__8_in_rule__Measurement__Group__75796);
            rule__Measurement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__7"


    // $ANTLR start "rule__Measurement__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2870:1: rule__Measurement__Group__7__Impl : ( 'as' ) ;
    public final void rule__Measurement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2874:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2875:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2875:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2876:1: 'as'
            {
             before(grammarAccess.getMeasurementAccess().getAsKeyword_7()); 
            match(input,47,FOLLOW_47_in_rule__Measurement__Group__7__Impl5824); 
             after(grammarAccess.getMeasurementAccess().getAsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__7__Impl"


    // $ANTLR start "rule__Measurement__Group__8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2889:1: rule__Measurement__Group__8 : rule__Measurement__Group__8__Impl rule__Measurement__Group__9 ;
    public final void rule__Measurement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2893:1: ( rule__Measurement__Group__8__Impl rule__Measurement__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2894:2: rule__Measurement__Group__8__Impl rule__Measurement__Group__9
            {
            pushFollow(FOLLOW_rule__Measurement__Group__8__Impl_in_rule__Measurement__Group__85855);
            rule__Measurement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__9_in_rule__Measurement__Group__85858);
            rule__Measurement__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__8"


    // $ANTLR start "rule__Measurement__Group__8__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2901:1: rule__Measurement__Group__8__Impl : ( ( rule__Measurement__RepresentationAssignment_8 ) ) ;
    public final void rule__Measurement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2905:1: ( ( ( rule__Measurement__RepresentationAssignment_8 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2906:1: ( ( rule__Measurement__RepresentationAssignment_8 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2906:1: ( ( rule__Measurement__RepresentationAssignment_8 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2907:1: ( rule__Measurement__RepresentationAssignment_8 )
            {
             before(grammarAccess.getMeasurementAccess().getRepresentationAssignment_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2908:1: ( rule__Measurement__RepresentationAssignment_8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2908:2: rule__Measurement__RepresentationAssignment_8
            {
            pushFollow(FOLLOW_rule__Measurement__RepresentationAssignment_8_in_rule__Measurement__Group__8__Impl5885);
            rule__Measurement__RepresentationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getRepresentationAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__8__Impl"


    // $ANTLR start "rule__Measurement__Group__9"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2918:1: rule__Measurement__Group__9 : rule__Measurement__Group__9__Impl ;
    public final void rule__Measurement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2922:1: ( rule__Measurement__Group__9__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2923:2: rule__Measurement__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Measurement__Group__9__Impl_in_rule__Measurement__Group__95915);
            rule__Measurement__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__9"


    // $ANTLR start "rule__Measurement__Group__9__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2929:1: rule__Measurement__Group__9__Impl : ( ( rule__Measurement__ConstraintsAssignment_9 )* ) ;
    public final void rule__Measurement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2933:1: ( ( ( rule__Measurement__ConstraintsAssignment_9 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2934:1: ( ( rule__Measurement__ConstraintsAssignment_9 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2934:1: ( ( rule__Measurement__ConstraintsAssignment_9 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2935:1: ( rule__Measurement__ConstraintsAssignment_9 )*
            {
             before(grammarAccess.getMeasurementAccess().getConstraintsAssignment_9()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2936:1: ( rule__Measurement__ConstraintsAssignment_9 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==55) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2936:2: rule__Measurement__ConstraintsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Measurement__ConstraintsAssignment_9_in_rule__Measurement__Group__9__Impl5942);
            	    rule__Measurement__ConstraintsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMeasurementAccess().getConstraintsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__Group__9__Impl"


    // $ANTLR start "rule__MeasurementInRange__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2966:1: rule__MeasurementInRange__Group__0 : rule__MeasurementInRange__Group__0__Impl rule__MeasurementInRange__Group__1 ;
    public final void rule__MeasurementInRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2970:1: ( rule__MeasurementInRange__Group__0__Impl rule__MeasurementInRange__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2971:2: rule__MeasurementInRange__Group__0__Impl rule__MeasurementInRange__Group__1
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__Group__0__Impl_in_rule__MeasurementInRange__Group__05993);
            rule__MeasurementInRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementInRange__Group__1_in_rule__MeasurementInRange__Group__05996);
            rule__MeasurementInRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementInRange__Group__0"


    // $ANTLR start "rule__MeasurementInRange__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2978:1: rule__MeasurementInRange__Group__0__Impl : ( 'from' ) ;
    public final void rule__MeasurementInRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2982:1: ( ( 'from' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2983:1: ( 'from' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2983:1: ( 'from' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2984:1: 'from'
            {
             before(grammarAccess.getMeasurementInRangeAccess().getFromKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__MeasurementInRange__Group__0__Impl6024); 
             after(grammarAccess.getMeasurementInRangeAccess().getFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementInRange__Group__0__Impl"


    // $ANTLR start "rule__MeasurementInRange__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2997:1: rule__MeasurementInRange__Group__1 : rule__MeasurementInRange__Group__1__Impl rule__MeasurementInRange__Group__2 ;
    public final void rule__MeasurementInRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3001:1: ( rule__MeasurementInRange__Group__1__Impl rule__MeasurementInRange__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3002:2: rule__MeasurementInRange__Group__1__Impl rule__MeasurementInRange__Group__2
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__Group__1__Impl_in_rule__MeasurementInRange__Group__16055);
            rule__MeasurementInRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementInRange__Group__2_in_rule__MeasurementInRange__Group__16058);
            rule__MeasurementInRange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementInRange__Group__1"


    // $ANTLR start "rule__MeasurementInRange__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3009:1: rule__MeasurementInRange__Group__1__Impl : ( ( rule__MeasurementInRange__LowerBoundAssignment_1 ) ) ;
    public final void rule__MeasurementInRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3013:1: ( ( ( rule__MeasurementInRange__LowerBoundAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3014:1: ( ( rule__MeasurementInRange__LowerBoundAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3014:1: ( ( rule__MeasurementInRange__LowerBoundAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3015:1: ( rule__MeasurementInRange__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getMeasurementInRangeAccess().getLowerBoundAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3016:1: ( rule__MeasurementInRange__LowerBoundAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3016:2: rule__MeasurementInRange__LowerBoundAssignment_1
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__LowerBoundAssignment_1_in_rule__MeasurementInRange__Group__1__Impl6085);
            rule__MeasurementInRange__LowerBoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementInRangeAccess().getLowerBoundAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementInRange__Group__1__Impl"


    // $ANTLR start "rule__MeasurementInRange__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3026:1: rule__MeasurementInRange__Group__2 : rule__MeasurementInRange__Group__2__Impl rule__MeasurementInRange__Group__3 ;
    public final void rule__MeasurementInRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3030:1: ( rule__MeasurementInRange__Group__2__Impl rule__MeasurementInRange__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3031:2: rule__MeasurementInRange__Group__2__Impl rule__MeasurementInRange__Group__3
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__Group__2__Impl_in_rule__MeasurementInRange__Group__26115);
            rule__MeasurementInRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementInRange__Group__3_in_rule__MeasurementInRange__Group__26118);
            rule__MeasurementInRange__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementInRange__Group__2"


    // $ANTLR start "rule__MeasurementInRange__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3038:1: rule__MeasurementInRange__Group__2__Impl : ( 'to' ) ;
    public final void rule__MeasurementInRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3042:1: ( ( 'to' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3043:1: ( 'to' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3043:1: ( 'to' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3044:1: 'to'
            {
             before(grammarAccess.getMeasurementInRangeAccess().getToKeyword_2()); 
            match(input,56,FOLLOW_56_in_rule__MeasurementInRange__Group__2__Impl6146); 
             after(grammarAccess.getMeasurementInRangeAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementInRange__Group__2__Impl"


    // $ANTLR start "rule__MeasurementInRange__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3057:1: rule__MeasurementInRange__Group__3 : rule__MeasurementInRange__Group__3__Impl ;
    public final void rule__MeasurementInRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3061:1: ( rule__MeasurementInRange__Group__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3062:2: rule__MeasurementInRange__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__Group__3__Impl_in_rule__MeasurementInRange__Group__36177);
            rule__MeasurementInRange__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementInRange__Group__3"


    // $ANTLR start "rule__MeasurementInRange__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3068:1: rule__MeasurementInRange__Group__3__Impl : ( ( rule__MeasurementInRange__UpperBoundAssignment_3 ) ) ;
    public final void rule__MeasurementInRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3072:1: ( ( ( rule__MeasurementInRange__UpperBoundAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3073:1: ( ( rule__MeasurementInRange__UpperBoundAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3073:1: ( ( rule__MeasurementInRange__UpperBoundAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3074:1: ( rule__MeasurementInRange__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getMeasurementInRangeAccess().getUpperBoundAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3075:1: ( rule__MeasurementInRange__UpperBoundAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3075:2: rule__MeasurementInRange__UpperBoundAssignment_3
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__UpperBoundAssignment_3_in_rule__MeasurementInRange__Group__3__Impl6204);
            rule__MeasurementInRange__UpperBoundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementInRangeAccess().getUpperBoundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementInRange__Group__3__Impl"


    // $ANTLR start "rule__Measure__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3093:1: rule__Measure__Group__0 : rule__Measure__Group__0__Impl rule__Measure__Group__1 ;
    public final void rule__Measure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3097:1: ( rule__Measure__Group__0__Impl rule__Measure__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3098:2: rule__Measure__Group__0__Impl rule__Measure__Group__1
            {
            pushFollow(FOLLOW_rule__Measure__Group__0__Impl_in_rule__Measure__Group__06242);
            rule__Measure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measure__Group__1_in_rule__Measure__Group__06245);
            rule__Measure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__0"


    // $ANTLR start "rule__Measure__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3105:1: rule__Measure__Group__0__Impl : ( ( rule__Measure__ValueAssignment_0 ) ) ;
    public final void rule__Measure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3109:1: ( ( ( rule__Measure__ValueAssignment_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3110:1: ( ( rule__Measure__ValueAssignment_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3110:1: ( ( rule__Measure__ValueAssignment_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3111:1: ( rule__Measure__ValueAssignment_0 )
            {
             before(grammarAccess.getMeasureAccess().getValueAssignment_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3112:1: ( rule__Measure__ValueAssignment_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3112:2: rule__Measure__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__Measure__ValueAssignment_0_in_rule__Measure__Group__0__Impl6272);
            rule__Measure__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__0__Impl"


    // $ANTLR start "rule__Measure__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3122:1: rule__Measure__Group__1 : rule__Measure__Group__1__Impl ;
    public final void rule__Measure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3126:1: ( rule__Measure__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3127:2: rule__Measure__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Measure__Group__1__Impl_in_rule__Measure__Group__16302);
            rule__Measure__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__1"


    // $ANTLR start "rule__Measure__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3133:1: rule__Measure__Group__1__Impl : ( ( rule__Measure__UnitAssignment_1 ) ) ;
    public final void rule__Measure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3137:1: ( ( ( rule__Measure__UnitAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3138:1: ( ( rule__Measure__UnitAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3138:1: ( ( rule__Measure__UnitAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3139:1: ( rule__Measure__UnitAssignment_1 )
            {
             before(grammarAccess.getMeasureAccess().getUnitAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3140:1: ( rule__Measure__UnitAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3140:2: rule__Measure__UnitAssignment_1
            {
            pushFollow(FOLLOW_rule__Measure__UnitAssignment_1_in_rule__Measure__Group__1__Impl6329);
            rule__Measure__UnitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getUnitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveInterpretation__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3154:1: rule__PrimitiveInterpretation__Group__0 : rule__PrimitiveInterpretation__Group__0__Impl rule__PrimitiveInterpretation__Group__1 ;
    public final void rule__PrimitiveInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3158:1: ( rule__PrimitiveInterpretation__Group__0__Impl rule__PrimitiveInterpretation__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3159:2: rule__PrimitiveInterpretation__Group__0__Impl rule__PrimitiveInterpretation__Group__1
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__0__Impl_in_rule__PrimitiveInterpretation__Group__06363);
            rule__PrimitiveInterpretation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__1_in_rule__PrimitiveInterpretation__Group__06366);
            rule__PrimitiveInterpretation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveInterpretation__Group__0"


    // $ANTLR start "rule__PrimitiveInterpretation__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3166:1: rule__PrimitiveInterpretation__Group__0__Impl : ( 'primitive' ) ;
    public final void rule__PrimitiveInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3170:1: ( ( 'primitive' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3171:1: ( 'primitive' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3171:1: ( 'primitive' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3172:1: 'primitive'
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getPrimitiveKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__PrimitiveInterpretation__Group__0__Impl6394); 
             after(grammarAccess.getPrimitiveInterpretationAccess().getPrimitiveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveInterpretation__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveInterpretation__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3185:1: rule__PrimitiveInterpretation__Group__1 : rule__PrimitiveInterpretation__Group__1__Impl rule__PrimitiveInterpretation__Group__2 ;
    public final void rule__PrimitiveInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3189:1: ( rule__PrimitiveInterpretation__Group__1__Impl rule__PrimitiveInterpretation__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3190:2: rule__PrimitiveInterpretation__Group__1__Impl rule__PrimitiveInterpretation__Group__2
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__1__Impl_in_rule__PrimitiveInterpretation__Group__16425);
            rule__PrimitiveInterpretation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__2_in_rule__PrimitiveInterpretation__Group__16428);
            rule__PrimitiveInterpretation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveInterpretation__Group__1"


    // $ANTLR start "rule__PrimitiveInterpretation__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3197:1: rule__PrimitiveInterpretation__Group__1__Impl : ( ( rule__PrimitiveInterpretation__TypeAssignment_1 ) ) ;
    public final void rule__PrimitiveInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3201:1: ( ( ( rule__PrimitiveInterpretation__TypeAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3202:1: ( ( rule__PrimitiveInterpretation__TypeAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3202:1: ( ( rule__PrimitiveInterpretation__TypeAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3203:1: ( rule__PrimitiveInterpretation__TypeAssignment_1 )
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getTypeAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3204:1: ( rule__PrimitiveInterpretation__TypeAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3204:2: rule__PrimitiveInterpretation__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__TypeAssignment_1_in_rule__PrimitiveInterpretation__Group__1__Impl6455);
            rule__PrimitiveInterpretation__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveInterpretationAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveInterpretation__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveInterpretation__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3214:1: rule__PrimitiveInterpretation__Group__2 : rule__PrimitiveInterpretation__Group__2__Impl rule__PrimitiveInterpretation__Group__3 ;
    public final void rule__PrimitiveInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3218:1: ( rule__PrimitiveInterpretation__Group__2__Impl rule__PrimitiveInterpretation__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3219:2: rule__PrimitiveInterpretation__Group__2__Impl rule__PrimitiveInterpretation__Group__3
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__2__Impl_in_rule__PrimitiveInterpretation__Group__26485);
            rule__PrimitiveInterpretation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__3_in_rule__PrimitiveInterpretation__Group__26488);
            rule__PrimitiveInterpretation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveInterpretation__Group__2"


    // $ANTLR start "rule__PrimitiveInterpretation__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3226:1: rule__PrimitiveInterpretation__Group__2__Impl : ( ( rule__PrimitiveInterpretation__NameAssignment_2 ) ) ;
    public final void rule__PrimitiveInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3230:1: ( ( ( rule__PrimitiveInterpretation__NameAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3231:1: ( ( rule__PrimitiveInterpretation__NameAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3231:1: ( ( rule__PrimitiveInterpretation__NameAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3232:1: ( rule__PrimitiveInterpretation__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getNameAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3233:1: ( rule__PrimitiveInterpretation__NameAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3233:2: rule__PrimitiveInterpretation__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__NameAssignment_2_in_rule__PrimitiveInterpretation__Group__2__Impl6515);
            rule__PrimitiveInterpretation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveInterpretationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveInterpretation__Group__2__Impl"


    // $ANTLR start "rule__PrimitiveInterpretation__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3243:1: rule__PrimitiveInterpretation__Group__3 : rule__PrimitiveInterpretation__Group__3__Impl rule__PrimitiveInterpretation__Group__4 ;
    public final void rule__PrimitiveInterpretation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3247:1: ( rule__PrimitiveInterpretation__Group__3__Impl rule__PrimitiveInterpretation__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3248:2: rule__PrimitiveInterpretation__Group__3__Impl rule__PrimitiveInterpretation__Group__4
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__3__Impl_in_rule__PrimitiveInterpretation__Group__36545);
            rule__PrimitiveInterpretation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__4_in_rule__PrimitiveInterpretation__Group__36548);
            rule__PrimitiveInterpretation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveInterpretation__Group__3"


    // $ANTLR start "rule__PrimitiveInterpretation__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3255:1: rule__PrimitiveInterpretation__Group__3__Impl : ( 'as' ) ;
    public final void rule__PrimitiveInterpretation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3259:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3260:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3260:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3261:1: 'as'
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getAsKeyword_3()); 
            match(input,47,FOLLOW_47_in_rule__PrimitiveInterpretation__Group__3__Impl6576); 
             after(grammarAccess.getPrimitiveInterpretationAccess().getAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveInterpretation__Group__3__Impl"


    // $ANTLR start "rule__PrimitiveInterpretation__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3274:1: rule__PrimitiveInterpretation__Group__4 : rule__PrimitiveInterpretation__Group__4__Impl ;
    public final void rule__PrimitiveInterpretation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3278:1: ( rule__PrimitiveInterpretation__Group__4__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3279:2: rule__PrimitiveInterpretation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__4__Impl_in_rule__PrimitiveInterpretation__Group__46607);
            rule__PrimitiveInterpretation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveInterpretation__Group__4"


    // $ANTLR start "rule__PrimitiveInterpretation__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3285:1: rule__PrimitiveInterpretation__Group__4__Impl : ( ( rule__PrimitiveInterpretation__RepresentationAssignment_4 ) ) ;
    public final void rule__PrimitiveInterpretation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3289:1: ( ( ( rule__PrimitiveInterpretation__RepresentationAssignment_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3290:1: ( ( rule__PrimitiveInterpretation__RepresentationAssignment_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3290:1: ( ( rule__PrimitiveInterpretation__RepresentationAssignment_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3291:1: ( rule__PrimitiveInterpretation__RepresentationAssignment_4 )
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getRepresentationAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3292:1: ( rule__PrimitiveInterpretation__RepresentationAssignment_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3292:2: rule__PrimitiveInterpretation__RepresentationAssignment_4
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__RepresentationAssignment_4_in_rule__PrimitiveInterpretation__Group__4__Impl6634);
            rule__PrimitiveInterpretation__RepresentationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveInterpretationAccess().getRepresentationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveInterpretation__Group__4__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3312:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3316:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3317:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__06674);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__06677);
            rule__Constant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3324:1: rule__Constant__Group__0__Impl : ( 'constant' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3328:1: ( ( 'constant' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3329:1: ( 'constant' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3329:1: ( 'constant' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3330:1: 'constant'
            {
             before(grammarAccess.getConstantAccess().getConstantKeyword_0()); 
            match(input,58,FOLLOW_58_in_rule__Constant__Group__0__Impl6705); 
             after(grammarAccess.getConstantAccess().getConstantKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3343:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3347:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3348:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__16736);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__16739);
            rule__Constant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3355:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3359:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3360:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3360:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3361:1: ( rule__Constant__NameAssignment_1 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3362:1: ( rule__Constant__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3362:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl6766);
            rule__Constant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3372:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3376:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3377:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__26796);
            rule__Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__26799);
            rule__Constant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3384:1: rule__Constant__Group__2__Impl : ( 'as' ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3388:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3389:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3389:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3390:1: 'as'
            {
             before(grammarAccess.getConstantAccess().getAsKeyword_2()); 
            match(input,47,FOLLOW_47_in_rule__Constant__Group__2__Impl6827); 
             after(grammarAccess.getConstantAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3403:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3407:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3408:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__36858);
            rule__Constant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__36861);
            rule__Constant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3415:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__RepresentationAssignment_3 ) ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3419:1: ( ( ( rule__Constant__RepresentationAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3420:1: ( ( rule__Constant__RepresentationAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3420:1: ( ( rule__Constant__RepresentationAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3421:1: ( rule__Constant__RepresentationAssignment_3 )
            {
             before(grammarAccess.getConstantAccess().getRepresentationAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3422:1: ( rule__Constant__RepresentationAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3422:2: rule__Constant__RepresentationAssignment_3
            {
            pushFollow(FOLLOW_rule__Constant__RepresentationAssignment_3_in_rule__Constant__Group__3__Impl6888);
            rule__Constant__RepresentationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getRepresentationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__Constant__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3432:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl rule__Constant__Group__5 ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3436:1: ( rule__Constant__Group__4__Impl rule__Constant__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3437:2: rule__Constant__Group__4__Impl rule__Constant__Group__5
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__46918);
            rule__Constant__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__5_in_rule__Constant__Group__46921);
            rule__Constant__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4"


    // $ANTLR start "rule__Constant__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3444:1: rule__Constant__Group__4__Impl : ( 'is' ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3448:1: ( ( 'is' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3449:1: ( 'is' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3449:1: ( 'is' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3450:1: 'is'
            {
             before(grammarAccess.getConstantAccess().getIsKeyword_4()); 
            match(input,45,FOLLOW_45_in_rule__Constant__Group__4__Impl6949); 
             after(grammarAccess.getConstantAccess().getIsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4__Impl"


    // $ANTLR start "rule__Constant__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3463:1: rule__Constant__Group__5 : rule__Constant__Group__5__Impl ;
    public final void rule__Constant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3467:1: ( rule__Constant__Group__5__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3468:2: rule__Constant__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__5__Impl_in_rule__Constant__Group__56980);
            rule__Constant__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__5"


    // $ANTLR start "rule__Constant__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3474:1: rule__Constant__Group__5__Impl : ( ( rule__Constant__ConstantValueAssignment_5 ) ) ;
    public final void rule__Constant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3478:1: ( ( ( rule__Constant__ConstantValueAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3479:1: ( ( rule__Constant__ConstantValueAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3479:1: ( ( rule__Constant__ConstantValueAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3480:1: ( rule__Constant__ConstantValueAssignment_5 )
            {
             before(grammarAccess.getConstantAccess().getConstantValueAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3481:1: ( rule__Constant__ConstantValueAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3481:2: rule__Constant__ConstantValueAssignment_5
            {
            pushFollow(FOLLOW_rule__Constant__ConstantValueAssignment_5_in_rule__Constant__Group__5__Impl7007);
            rule__Constant__ConstantValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getConstantValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__5__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3503:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3507:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3508:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__07049);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__07052);
            rule__DOUBLE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__0"


    // $ANTLR start "rule__DOUBLE__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3515:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3519:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3520:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3520:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3521:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl7079); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3532:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3536:1: ( rule__DOUBLE__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3537:2: rule__DOUBLE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__17108);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__1"


    // $ANTLR start "rule__DOUBLE__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3543:1: rule__DOUBLE__Group__1__Impl : ( ( rule__DOUBLE__Group_1__0 )? ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3547:1: ( ( ( rule__DOUBLE__Group_1__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3548:1: ( ( rule__DOUBLE__Group_1__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3548:1: ( ( rule__DOUBLE__Group_1__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3549:1: ( rule__DOUBLE__Group_1__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3550:1: ( rule__DOUBLE__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==59) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3550:2: rule__DOUBLE__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl7135);
                    rule__DOUBLE__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDOUBLEAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group_1__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3564:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3568:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3569:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__07170);
            rule__DOUBLE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__07173);
            rule__DOUBLE__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_1__0"


    // $ANTLR start "rule__DOUBLE__Group_1__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3576:1: rule__DOUBLE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3580:1: ( ( '.' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3581:1: ( '.' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3581:1: ( '.' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3582:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
            match(input,59,FOLLOW_59_in_rule__DOUBLE__Group_1__0__Impl7201); 
             after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_1__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group_1__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3595:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3599:1: ( rule__DOUBLE__Group_1__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3600:2: rule__DOUBLE__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__17232);
            rule__DOUBLE__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_1__1"


    // $ANTLR start "rule__DOUBLE__Group_1__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3606:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3610:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3611:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3611:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3612:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl7259); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_1__1__Impl"


    // $ANTLR start "rule__DataModel__OptionsAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3628:1: rule__DataModel__OptionsAssignment_2 : ( ruleOptions ) ;
    public final void rule__DataModel__OptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3632:1: ( ( ruleOptions ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3633:1: ( ruleOptions )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3633:1: ( ruleOptions )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3634:1: ruleOptions
            {
             before(grammarAccess.getDataModelAccess().getOptionsOptionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOptions_in_rule__DataModel__OptionsAssignment_27297);
            ruleOptions();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getOptionsOptionsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__OptionsAssignment_2"


    // $ANTLR start "rule__DataModel__RepresentationsAssignment_4_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3643:1: rule__DataModel__RepresentationsAssignment_4_0 : ( ruleRepresentation ) ;
    public final void rule__DataModel__RepresentationsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3647:1: ( ( ruleRepresentation ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3648:1: ( ruleRepresentation )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3648:1: ( ruleRepresentation )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3649:1: ruleRepresentation
            {
             before(grammarAccess.getDataModelAccess().getRepresentationsRepresentationParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleRepresentation_in_rule__DataModel__RepresentationsAssignment_4_07328);
            ruleRepresentation();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getRepresentationsRepresentationParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__RepresentationsAssignment_4_0"


    // $ANTLR start "rule__DataModel__InterpretationsAssignment_4_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3658:1: rule__DataModel__InterpretationsAssignment_4_1 : ( ruleInterpretation ) ;
    public final void rule__DataModel__InterpretationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3662:1: ( ( ruleInterpretation ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3663:1: ( ruleInterpretation )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3663:1: ( ruleInterpretation )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3664:1: ruleInterpretation
            {
             before(grammarAccess.getDataModelAccess().getInterpretationsInterpretationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleInterpretation_in_rule__DataModel__InterpretationsAssignment_4_17359);
            ruleInterpretation();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getInterpretationsInterpretationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__InterpretationsAssignment_4_1"


    // $ANTLR start "rule__DataModel__TransmitAssignment_6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3673:1: rule__DataModel__TransmitAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__DataModel__TransmitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3677:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3678:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3678:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3679:1: ( RULE_ID )
            {
             before(grammarAccess.getDataModelAccess().getTransmitInterpretationCrossReference_6_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3680:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3681:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getTransmitInterpretationIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_67394); 
             after(grammarAccess.getDataModelAccess().getTransmitInterpretationIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getDataModelAccess().getTransmitInterpretationCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__TransmitAssignment_6"


    // $ANTLR start "rule__DataModel__TransmitAssignment_7_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3692:1: rule__DataModel__TransmitAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataModel__TransmitAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3696:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3697:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3697:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3698:1: ( RULE_ID )
            {
             before(grammarAccess.getDataModelAccess().getTransmitInterpretationCrossReference_7_1_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3699:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3700:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getTransmitInterpretationIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_7_17433); 
             after(grammarAccess.getDataModelAccess().getTransmitInterpretationIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getDataModelAccess().getTransmitInterpretationCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__TransmitAssignment_7_1"


    // $ANTLR start "rule__Options__TransmissionTypeAssignment_1_0_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3711:1: rule__Options__TransmissionTypeAssignment_1_0_3 : ( ruleTransmissionType ) ;
    public final void rule__Options__TransmissionTypeAssignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3715:1: ( ( ruleTransmissionType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3716:1: ( ruleTransmissionType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3716:1: ( ruleTransmissionType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3717:1: ruleTransmissionType
            {
             before(grammarAccess.getOptionsAccess().getTransmissionTypeTransmissionTypeEnumRuleCall_1_0_3_0()); 
            pushFollow(FOLLOW_ruleTransmissionType_in_rule__Options__TransmissionTypeAssignment_1_0_37468);
            ruleTransmissionType();

            state._fsp--;

             after(grammarAccess.getOptionsAccess().getTransmissionTypeTransmissionTypeEnumRuleCall_1_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__TransmissionTypeAssignment_1_0_3"


    // $ANTLR start "rule__Options__SensorLanguageAssignment_1_1_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3726:1: rule__Options__SensorLanguageAssignment_1_1_3 : ( ruleGenerationLanguage ) ;
    public final void rule__Options__SensorLanguageAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3730:1: ( ( ruleGenerationLanguage ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3731:1: ( ruleGenerationLanguage )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3731:1: ( ruleGenerationLanguage )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3732:1: ruleGenerationLanguage
            {
             before(grammarAccess.getOptionsAccess().getSensorLanguageGenerationLanguageEnumRuleCall_1_1_3_0()); 
            pushFollow(FOLLOW_ruleGenerationLanguage_in_rule__Options__SensorLanguageAssignment_1_1_37499);
            ruleGenerationLanguage();

            state._fsp--;

             after(grammarAccess.getOptionsAccess().getSensorLanguageGenerationLanguageEnumRuleCall_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__SensorLanguageAssignment_1_1_3"


    // $ANTLR start "rule__Options__ReceiverLanguageAssignment_1_2_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3741:1: rule__Options__ReceiverLanguageAssignment_1_2_3 : ( ruleGenerationLanguage ) ;
    public final void rule__Options__ReceiverLanguageAssignment_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3745:1: ( ( ruleGenerationLanguage ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3746:1: ( ruleGenerationLanguage )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3746:1: ( ruleGenerationLanguage )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3747:1: ruleGenerationLanguage
            {
             before(grammarAccess.getOptionsAccess().getReceiverLanguageGenerationLanguageEnumRuleCall_1_2_3_0()); 
            pushFollow(FOLLOW_ruleGenerationLanguage_in_rule__Options__ReceiverLanguageAssignment_1_2_37530);
            ruleGenerationLanguage();

            state._fsp--;

             after(grammarAccess.getOptionsAccess().getReceiverLanguageGenerationLanguageEnumRuleCall_1_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__ReceiverLanguageAssignment_1_2_3"


    // $ANTLR start "rule__Representation__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3756:1: rule__Representation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Representation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3760:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3761:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3761:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3762:1: RULE_ID
            {
             before(grammarAccess.getRepresentationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Representation__NameAssignment_17561); 
             after(grammarAccess.getRepresentationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__NameAssignment_1"


    // $ANTLR start "rule__Representation__TypeAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3771:1: rule__Representation__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Representation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3775:1: ( ( ruleType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3776:1: ( ruleType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3776:1: ( ruleType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3777:1: ruleType
            {
             before(grammarAccess.getRepresentationAccess().getTypeTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Representation__TypeAssignment_37592);
            ruleType();

            state._fsp--;

             after(grammarAccess.getRepresentationAccess().getTypeTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__TypeAssignment_3"


    // $ANTLR start "rule__Representation__ByteCountAssignment_5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3786:1: rule__Representation__ByteCountAssignment_5 : ( RULE_INT ) ;
    public final void rule__Representation__ByteCountAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3790:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3791:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3791:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3792:1: RULE_INT
            {
             before(grammarAccess.getRepresentationAccess().getByteCountINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Representation__ByteCountAssignment_57623); 
             after(grammarAccess.getRepresentationAccess().getByteCountINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__ByteCountAssignment_5"


    // $ANTLR start "rule__Calculated__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3801:1: rule__Calculated__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Calculated__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3805:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3806:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3806:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3807:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__NameAssignment_17654); 
             after(grammarAccess.getCalculatedAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__NameAssignment_1"


    // $ANTLR start "rule__Calculated__RepresentationAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3816:1: rule__Calculated__RepresentationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Calculated__RepresentationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3820:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3821:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3821:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3822:1: ( RULE_ID )
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationRepresentationCrossReference_3_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3823:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3824:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationRepresentationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__RepresentationAssignment_37689); 
             after(grammarAccess.getCalculatedAccess().getRepresentationRepresentationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCalculatedAccess().getRepresentationRepresentationCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__RepresentationAssignment_3"


    // $ANTLR start "rule__Calculated__MethodNameAssignment_5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3835:1: rule__Calculated__MethodNameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Calculated__MethodNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3839:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3840:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3840:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3841:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__MethodNameAssignment_57724); 
             after(grammarAccess.getCalculatedAccess().getMethodNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__MethodNameAssignment_5"


    // $ANTLR start "rule__Calculated__MethodNameOutAssignment_6_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3850:1: rule__Calculated__MethodNameOutAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Calculated__MethodNameOutAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3854:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3855:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3855:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3856:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameOutIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__MethodNameOutAssignment_6_17755); 
             after(grammarAccess.getCalculatedAccess().getMethodNameOutIDTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__MethodNameOutAssignment_6_1"


    // $ANTLR start "rule__Calculated__ParameterAssignment_8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3865:1: rule__Calculated__ParameterAssignment_8 : ( ruleParameter ) ;
    public final void rule__Calculated__ParameterAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3869:1: ( ( ruleParameter ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3870:1: ( ruleParameter )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3870:1: ( ruleParameter )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3871:1: ruleParameter
            {
             before(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_87786);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__ParameterAssignment_8"


    // $ANTLR start "rule__Calculated__ParameterAssignment_9_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3880:1: rule__Calculated__ParameterAssignment_9_1 : ( ruleParameter ) ;
    public final void rule__Calculated__ParameterAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3884:1: ( ( ruleParameter ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3885:1: ( ruleParameter )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3885:1: ( ruleParameter )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3886:1: ruleParameter
            {
             before(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_9_17817);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__ParameterAssignment_9_1"


    // $ANTLR start "rule__Parameter__InterpretationAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3895:1: rule__Parameter__InterpretationAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__InterpretationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3899:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3900:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3900:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3901:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getInterpretationInterpretationCrossReference_1_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3902:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3903:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getInterpretationInterpretationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__InterpretationAssignment_17852); 
             after(grammarAccess.getParameterAccess().getInterpretationInterpretationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getInterpretationInterpretationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__InterpretationAssignment_1"


    // $ANTLR start "rule__Parameter__ArgumentTypeAssignment_2_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3914:1: rule__Parameter__ArgumentTypeAssignment_2_1 : ( ruleArgumentType ) ;
    public final void rule__Parameter__ArgumentTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3918:1: ( ( ruleArgumentType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3919:1: ( ruleArgumentType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3919:1: ( ruleArgumentType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3920:1: ruleArgumentType
            {
             before(grammarAccess.getParameterAccess().getArgumentTypeArgumentTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleArgumentType_in_rule__Parameter__ArgumentTypeAssignment_2_17887);
            ruleArgumentType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getArgumentTypeArgumentTypeEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ArgumentTypeAssignment_2_1"


    // $ANTLR start "rule__InterpretationGroup__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3929:1: rule__InterpretationGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InterpretationGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3933:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3934:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3934:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3935:1: RULE_ID
            {
             before(grammarAccess.getInterpretationGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InterpretationGroup__NameAssignment_17918); 
             after(grammarAccess.getInterpretationGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterpretationGroup__NameAssignment_1"


    // $ANTLR start "rule__InterpretationGroup__InterpretationsAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3944:1: rule__InterpretationGroup__InterpretationsAssignment_3 : ( ruleInterpretation ) ;
    public final void rule__InterpretationGroup__InterpretationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3948:1: ( ( ruleInterpretation ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3949:1: ( ruleInterpretation )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3949:1: ( ruleInterpretation )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3950:1: ruleInterpretation
            {
             before(grammarAccess.getInterpretationGroupAccess().getInterpretationsInterpretationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInterpretation_in_rule__InterpretationGroup__InterpretationsAssignment_37949);
            ruleInterpretation();

            state._fsp--;

             after(grammarAccess.getInterpretationGroupAccess().getInterpretationsInterpretationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterpretationGroup__InterpretationsAssignment_3"


    // $ANTLR start "rule__Measurement__QuantityAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3959:1: rule__Measurement__QuantityAssignment_2 : ( ruleQuantity ) ;
    public final void rule__Measurement__QuantityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3963:1: ( ( ruleQuantity ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3964:1: ( ruleQuantity )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3964:1: ( ruleQuantity )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3965:1: ruleQuantity
            {
             before(grammarAccess.getMeasurementAccess().getQuantityQuantityEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQuantity_in_rule__Measurement__QuantityAssignment_27980);
            ruleQuantity();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getQuantityQuantityEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__QuantityAssignment_2"


    // $ANTLR start "rule__Measurement__NameAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3974:1: rule__Measurement__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Measurement__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3978:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3979:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3979:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3980:1: RULE_ID
            {
             before(grammarAccess.getMeasurementAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Measurement__NameAssignment_38011); 
             after(grammarAccess.getMeasurementAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__NameAssignment_3"


    // $ANTLR start "rule__Measurement__ScaleAssignment_5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3989:1: rule__Measurement__ScaleAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__Measurement__ScaleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3993:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3994:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3994:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3995:1: ruleDOUBLE
            {
             before(grammarAccess.getMeasurementAccess().getScaleDOUBLEParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Measurement__ScaleAssignment_58042);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getScaleDOUBLEParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__ScaleAssignment_5"


    // $ANTLR start "rule__Measurement__UnitAssignment_6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4004:1: rule__Measurement__UnitAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Measurement__UnitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4008:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4009:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4009:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4010:1: RULE_STRING
            {
             before(grammarAccess.getMeasurementAccess().getUnitSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Measurement__UnitAssignment_68073); 
             after(grammarAccess.getMeasurementAccess().getUnitSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__UnitAssignment_6"


    // $ANTLR start "rule__Measurement__RepresentationAssignment_8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4019:1: rule__Measurement__RepresentationAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Measurement__RepresentationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4023:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4024:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4024:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4025:1: ( RULE_ID )
            {
             before(grammarAccess.getMeasurementAccess().getRepresentationRepresentationCrossReference_8_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4026:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4027:1: RULE_ID
            {
             before(grammarAccess.getMeasurementAccess().getRepresentationRepresentationIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Measurement__RepresentationAssignment_88108); 
             after(grammarAccess.getMeasurementAccess().getRepresentationRepresentationIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getMeasurementAccess().getRepresentationRepresentationCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__RepresentationAssignment_8"


    // $ANTLR start "rule__Measurement__ConstraintsAssignment_9"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4038:1: rule__Measurement__ConstraintsAssignment_9 : ( ruleMeasurementConstraint ) ;
    public final void rule__Measurement__ConstraintsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4042:1: ( ( ruleMeasurementConstraint ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4043:1: ( ruleMeasurementConstraint )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4043:1: ( ruleMeasurementConstraint )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4044:1: ruleMeasurementConstraint
            {
             before(grammarAccess.getMeasurementAccess().getConstraintsMeasurementConstraintParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleMeasurementConstraint_in_rule__Measurement__ConstraintsAssignment_98143);
            ruleMeasurementConstraint();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getConstraintsMeasurementConstraintParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measurement__ConstraintsAssignment_9"


    // $ANTLR start "rule__MeasurementInRange__LowerBoundAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4053:1: rule__MeasurementInRange__LowerBoundAssignment_1 : ( ruleMeasure ) ;
    public final void rule__MeasurementInRange__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4057:1: ( ( ruleMeasure ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4058:1: ( ruleMeasure )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4058:1: ( ruleMeasure )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4059:1: ruleMeasure
            {
             before(grammarAccess.getMeasurementInRangeAccess().getLowerBoundMeasureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMeasure_in_rule__MeasurementInRange__LowerBoundAssignment_18174);
            ruleMeasure();

            state._fsp--;

             after(grammarAccess.getMeasurementInRangeAccess().getLowerBoundMeasureParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementInRange__LowerBoundAssignment_1"


    // $ANTLR start "rule__MeasurementInRange__UpperBoundAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4068:1: rule__MeasurementInRange__UpperBoundAssignment_3 : ( ruleMeasure ) ;
    public final void rule__MeasurementInRange__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4072:1: ( ( ruleMeasure ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4073:1: ( ruleMeasure )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4073:1: ( ruleMeasure )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4074:1: ruleMeasure
            {
             before(grammarAccess.getMeasurementInRangeAccess().getUpperBoundMeasureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMeasure_in_rule__MeasurementInRange__UpperBoundAssignment_38205);
            ruleMeasure();

            state._fsp--;

             after(grammarAccess.getMeasurementInRangeAccess().getUpperBoundMeasureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementInRange__UpperBoundAssignment_3"


    // $ANTLR start "rule__Measure__ValueAssignment_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4083:1: rule__Measure__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Measure__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4087:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4088:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4088:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4089:1: ruleDOUBLE
            {
             before(grammarAccess.getMeasureAccess().getValueDOUBLEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Measure__ValueAssignment_08236);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getMeasureAccess().getValueDOUBLEParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__ValueAssignment_0"


    // $ANTLR start "rule__Measure__UnitAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4098:1: rule__Measure__UnitAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Measure__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4102:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4103:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4103:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4104:1: RULE_STRING
            {
             before(grammarAccess.getMeasureAccess().getUnitSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Measure__UnitAssignment_18267); 
             after(grammarAccess.getMeasureAccess().getUnitSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__UnitAssignment_1"


    // $ANTLR start "rule__PrimitiveInterpretation__TypeAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4113:1: rule__PrimitiveInterpretation__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__PrimitiveInterpretation__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4117:1: ( ( ruleType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4118:1: ( ruleType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4118:1: ( ruleType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4119:1: ruleType
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getTypeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__PrimitiveInterpretation__TypeAssignment_18298);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPrimitiveInterpretationAccess().getTypeTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveInterpretation__TypeAssignment_1"


    // $ANTLR start "rule__PrimitiveInterpretation__NameAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4128:1: rule__PrimitiveInterpretation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PrimitiveInterpretation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4132:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4133:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4133:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4134:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimitiveInterpretation__NameAssignment_28329); 
             after(grammarAccess.getPrimitiveInterpretationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveInterpretation__NameAssignment_2"


    // $ANTLR start "rule__PrimitiveInterpretation__RepresentationAssignment_4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4143:1: rule__PrimitiveInterpretation__RepresentationAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__PrimitiveInterpretation__RepresentationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4147:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4148:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4148:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4149:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getRepresentationRepresentationCrossReference_4_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4150:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4151:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getRepresentationRepresentationIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimitiveInterpretation__RepresentationAssignment_48364); 
             after(grammarAccess.getPrimitiveInterpretationAccess().getRepresentationRepresentationIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getPrimitiveInterpretationAccess().getRepresentationRepresentationCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveInterpretation__RepresentationAssignment_4"


    // $ANTLR start "rule__Constant__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4162:1: rule__Constant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4166:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4167:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4167:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4168:1: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_18399); 
             after(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NameAssignment_1"


    // $ANTLR start "rule__Constant__RepresentationAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4177:1: rule__Constant__RepresentationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Constant__RepresentationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4181:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4182:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4182:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4183:1: ( RULE_ID )
            {
             before(grammarAccess.getConstantAccess().getRepresentationRepresentationCrossReference_3_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4184:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4185:1: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getRepresentationRepresentationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__RepresentationAssignment_38434); 
             after(grammarAccess.getConstantAccess().getRepresentationRepresentationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConstantAccess().getRepresentationRepresentationCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__RepresentationAssignment_3"


    // $ANTLR start "rule__Constant__ConstantValueAssignment_5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4196:1: rule__Constant__ConstantValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Constant__ConstantValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4200:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4201:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4201:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4202:1: RULE_STRING
            {
             before(grammarAccess.getConstantAccess().getConstantValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constant__ConstantValueAssignment_58469); 
             after(grammarAccess.getConstantAccess().getConstantValueSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ConstantValueAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0_in_ruleDataModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptions_in_entryRuleOptions121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptions128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group__0_in_ruleOptions154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepresentation_in_entryRuleRepresentation181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepresentation188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__0_in_ruleRepresentation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretation_in_entryRuleInterpretation241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterpretation248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interpretation__Alternatives_in_ruleInterpretation274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_entryRuleCalculated301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalculated308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__0_in_ruleCalculated334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretationGroup_in_entryRuleInterpretationGroup421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterpretationGroup428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__0_in_ruleInterpretationGroup454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurement_in_entryRuleMeasurement481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurement488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__0_in_ruleMeasurement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementConstraint_in_entryRuleMeasurementConstraint541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementConstraint548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementInRange_in_ruleMeasurementConstraint574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementInRange_in_entryRuleMeasurementInRange600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementInRange607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__0_in_ruleMeasurementInRange633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_entryRuleMeasure660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasure667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__Group__0_in_ruleMeasure693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveInterpretation_in_entryRulePrimitiveInterpretation720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveInterpretation727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__0_in_rulePrimitiveInterpretation753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationLanguage__Alternatives_in_ruleGenerationLanguage910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransmissionType__Alternatives_in_ruleTransmissionType946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleArgumentType983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantity__Alternatives_in_ruleQuantity1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__RepresentationsAssignment_4_0_in_rule__DataModel__Alternatives_41092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__InterpretationsAssignment_4_1_in_rule__DataModel__Alternatives_41110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__0_in_rule__Options__Alternatives_11143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__0_in_rule__Options__Alternatives_11161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__0_in_rule__Options__Alternatives_11179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Representation__Alternatives_01213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Representation__Alternatives_01233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Representation__Alternatives_61268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Representation__Alternatives_61288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__Interpretation__Alternatives1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveInterpretation_in_rule__Interpretation__Alternatives1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurement_in_rule__Interpretation__Alternatives1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretationGroup_in_rule__Interpretation__Alternatives1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_rule__Interpretation__Alternatives1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Calculated__Alternatives_01423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Calculated__Alternatives_01443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GenerationLanguage__Alternatives1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GenerationLanguage__Alternatives1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GenerationLanguage__Alternatives1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TransmissionType__Alternatives1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TransmissionType__Alternatives1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Quantity__Alternatives1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Quantity__Alternatives1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Quantity__Alternatives1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Quantity__Alternatives1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Quantity__Alternatives1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Type__Alternatives1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Type__Alternatives1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Type__Alternatives1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Type__Alternatives1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Type__Alternatives1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Type__Alternatives1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__01871 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__01874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DataModel__Group__0__Impl1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__11933 = new BitSet(new long[]{0x0000148000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__11936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DataModel__Group__1__Impl1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__21995 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__21998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__OptionsAssignment_2_in_rule__DataModel__Group__2__Impl2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__32055 = new BitSet(new long[]{0x0618002000033000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__32058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DataModel__Group__3__Impl2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__42117 = new BitSet(new long[]{0x0618002000033000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__5_in_rule__DataModel__Group__42120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Alternatives_4_in_rule__DataModel__Group__4__Impl2147 = new BitSet(new long[]{0x0618000000033002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__5__Impl_in_rule__DataModel__Group__52178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataModel__Group__6_in_rule__DataModel__Group__52181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__DataModel__Group__5__Impl2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__6__Impl_in_rule__DataModel__Group__62240 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__7_in_rule__DataModel__Group__62243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__TransmitAssignment_6_in_rule__DataModel__Group__6__Impl2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__7__Impl_in_rule__DataModel__Group__72300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_7__0_in_rule__DataModel__Group__7__Impl2327 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_7__0__Impl_in_rule__DataModel__Group_7__02374 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataModel__Group_7__1_in_rule__DataModel__Group_7__02377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DataModel__Group_7__0__Impl2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_7__1__Impl_in_rule__DataModel__Group_7__12436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__TransmitAssignment_7_1_in_rule__DataModel__Group_7__1__Impl2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group__0__Impl_in_rule__Options__Group__02497 = new BitSet(new long[]{0x0000148000000000L});
    public static final BitSet FOLLOW_rule__Options__Group__1_in_rule__Options__Group__02500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group__1__Impl_in_rule__Options__Group__12558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Alternatives_1_in_rule__Options__Group__1__Impl2585 = new BitSet(new long[]{0x0000148000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__0__Impl_in_rule__Options__Group_1_0__02620 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__1_in_rule__Options__Group_1_0__02623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Options__Group_1_0__0__Impl2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__1__Impl_in_rule__Options__Group_1_0__12682 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__2_in_rule__Options__Group_1_0__12685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Options__Group_1_0__1__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__2__Impl_in_rule__Options__Group_1_0__22744 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__3_in_rule__Options__Group_1_0__22747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Options__Group_1_0__2__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__3__Impl_in_rule__Options__Group_1_0__32806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__TransmissionTypeAssignment_1_0_3_in_rule__Options__Group_1_0__3__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__0__Impl_in_rule__Options__Group_1_1__02871 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__1_in_rule__Options__Group_1_1__02874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Options__Group_1_1__0__Impl2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__1__Impl_in_rule__Options__Group_1_1__12933 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__2_in_rule__Options__Group_1_1__12936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Options__Group_1_1__1__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__2__Impl_in_rule__Options__Group_1_1__22995 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__3_in_rule__Options__Group_1_1__22998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Options__Group_1_1__2__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__3__Impl_in_rule__Options__Group_1_1__33057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__SensorLanguageAssignment_1_1_3_in_rule__Options__Group_1_1__3__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__0__Impl_in_rule__Options__Group_1_2__03122 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__1_in_rule__Options__Group_1_2__03125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Options__Group_1_2__0__Impl3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__1__Impl_in_rule__Options__Group_1_2__13184 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__2_in_rule__Options__Group_1_2__13187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Options__Group_1_2__1__Impl3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__2__Impl_in_rule__Options__Group_1_2__23246 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__3_in_rule__Options__Group_1_2__23249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Options__Group_1_2__2__Impl3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__3__Impl_in_rule__Options__Group_1_2__33308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__ReceiverLanguageAssignment_1_2_3_in_rule__Options__Group_1_2__3__Impl3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__0__Impl_in_rule__Representation__Group__03373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Representation__Group__1_in_rule__Representation__Group__03376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Alternatives_0_in_rule__Representation__Group__0__Impl3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__1__Impl_in_rule__Representation__Group__13433 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__2_in_rule__Representation__Group__13436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__NameAssignment_1_in_rule__Representation__Group__1__Impl3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__2__Impl_in_rule__Representation__Group__23493 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__3_in_rule__Representation__Group__23496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Representation__Group__2__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__3__Impl_in_rule__Representation__Group__33555 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__4_in_rule__Representation__Group__33558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__TypeAssignment_3_in_rule__Representation__Group__3__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__4__Impl_in_rule__Representation__Group__43615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Representation__Group__5_in_rule__Representation__Group__43618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Representation__Group__4__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__5__Impl_in_rule__Representation__Group__53677 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Representation__Group__6_in_rule__Representation__Group__53680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__ByteCountAssignment_5_in_rule__Representation__Group__5__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__6__Impl_in_rule__Representation__Group__63737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Alternatives_6_in_rule__Representation__Group__6__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__0__Impl_in_rule__Calculated__Group__03808 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__1_in_rule__Calculated__Group__03811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Alternatives_0_in_rule__Calculated__Group__0__Impl3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__1__Impl_in_rule__Calculated__Group__13868 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__2_in_rule__Calculated__Group__13871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__NameAssignment_1_in_rule__Calculated__Group__1__Impl3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__2__Impl_in_rule__Calculated__Group__23928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__3_in_rule__Calculated__Group__23931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Calculated__Group__2__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__3__Impl_in_rule__Calculated__Group__33990 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__4_in_rule__Calculated__Group__33993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__RepresentationAssignment_3_in_rule__Calculated__Group__3__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__4__Impl_in_rule__Calculated__Group__44050 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__5_in_rule__Calculated__Group__44053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Calculated__Group__4__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__5__Impl_in_rule__Calculated__Group__54112 = new BitSet(new long[]{0x0001004000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__6_in_rule__Calculated__Group__54115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__MethodNameAssignment_5_in_rule__Calculated__Group__5__Impl4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__6__Impl_in_rule__Calculated__Group__64172 = new BitSet(new long[]{0x0001004000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__7_in_rule__Calculated__Group__64175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__0_in_rule__Calculated__Group__6__Impl4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__7__Impl_in_rule__Calculated__Group__74233 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__8_in_rule__Calculated__Group__74236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Calculated__Group__7__Impl4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__8__Impl_in_rule__Calculated__Group__84295 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__9_in_rule__Calculated__Group__84298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__ParameterAssignment_8_in_rule__Calculated__Group__8__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__9__Impl_in_rule__Calculated__Group__94355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__0_in_rule__Calculated__Group__9__Impl4382 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__0__Impl_in_rule__Calculated__Group_6__04433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__1_in_rule__Calculated__Group_6__04436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Calculated__Group_6__0__Impl4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__1__Impl_in_rule__Calculated__Group_6__14495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__MethodNameOutAssignment_6_1_in_rule__Calculated__Group_6__1__Impl4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__0__Impl_in_rule__Calculated__Group_9__04556 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__1_in_rule__Calculated__Group_9__04559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Calculated__Group_9__0__Impl4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__1__Impl_in_rule__Calculated__Group_9__14618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__ParameterAssignment_9_1_in_rule__Calculated__Group_9__1__Impl4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04679 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Parameter__Group__0__Impl4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14741 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__InterpretationAssignment_1_in_rule__Parameter__Group__1__Impl4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24801 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__24804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__34862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Parameter__Group__3__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__04929 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__04932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Parameter__Group_2__0__Impl4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__14991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ArgumentTypeAssignment_2_1_in_rule__Parameter__Group_2__1__Impl5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__0__Impl_in_rule__InterpretationGroup__Group__05052 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__1_in_rule__InterpretationGroup__Group__05055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__InterpretationGroup__Group__0__Impl5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__1__Impl_in_rule__InterpretationGroup__Group__15114 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__2_in_rule__InterpretationGroup__Group__15117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__NameAssignment_1_in_rule__InterpretationGroup__Group__1__Impl5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__2__Impl_in_rule__InterpretationGroup__Group__25174 = new BitSet(new long[]{0x0618001000033000L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__3_in_rule__InterpretationGroup__Group__25177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__InterpretationGroup__Group__2__Impl5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__3__Impl_in_rule__InterpretationGroup__Group__35236 = new BitSet(new long[]{0x0618001000033000L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__4_in_rule__InterpretationGroup__Group__35239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__InterpretationsAssignment_3_in_rule__InterpretationGroup__Group__3__Impl5266 = new BitSet(new long[]{0x0618000000033002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__4__Impl_in_rule__InterpretationGroup__Group__45297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__InterpretationGroup__Group__4__Impl5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__0__Impl_in_rule__Measurement__Group__05366 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__1_in_rule__Measurement__Group__05369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Measurement__Group__0__Impl5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__1__Impl_in_rule__Measurement__Group__15428 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__2_in_rule__Measurement__Group__15431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Measurement__Group__1__Impl5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__2__Impl_in_rule__Measurement__Group__25490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Measurement__Group__3_in_rule__Measurement__Group__25493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__QuantityAssignment_2_in_rule__Measurement__Group__2__Impl5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__3__Impl_in_rule__Measurement__Group__35550 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__4_in_rule__Measurement__Group__35553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__NameAssignment_3_in_rule__Measurement__Group__3__Impl5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__4__Impl_in_rule__Measurement__Group__45610 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Measurement__Group__5_in_rule__Measurement__Group__45613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Measurement__Group__4__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__5__Impl_in_rule__Measurement__Group__55672 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Measurement__Group__6_in_rule__Measurement__Group__55675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__ScaleAssignment_5_in_rule__Measurement__Group__5__Impl5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__6__Impl_in_rule__Measurement__Group__65733 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__7_in_rule__Measurement__Group__65736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__UnitAssignment_6_in_rule__Measurement__Group__6__Impl5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__7__Impl_in_rule__Measurement__Group__75793 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Measurement__Group__8_in_rule__Measurement__Group__75796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Measurement__Group__7__Impl5824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__8__Impl_in_rule__Measurement__Group__85855 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__9_in_rule__Measurement__Group__85858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__RepresentationAssignment_8_in_rule__Measurement__Group__8__Impl5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__9__Impl_in_rule__Measurement__Group__95915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__ConstraintsAssignment_9_in_rule__Measurement__Group__9__Impl5942 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__0__Impl_in_rule__MeasurementInRange__Group__05993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__1_in_rule__MeasurementInRange__Group__05996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__MeasurementInRange__Group__0__Impl6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__1__Impl_in_rule__MeasurementInRange__Group__16055 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__2_in_rule__MeasurementInRange__Group__16058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__LowerBoundAssignment_1_in_rule__MeasurementInRange__Group__1__Impl6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__2__Impl_in_rule__MeasurementInRange__Group__26115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__3_in_rule__MeasurementInRange__Group__26118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__MeasurementInRange__Group__2__Impl6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__3__Impl_in_rule__MeasurementInRange__Group__36177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__UpperBoundAssignment_3_in_rule__MeasurementInRange__Group__3__Impl6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__Group__0__Impl_in_rule__Measure__Group__06242 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Measure__Group__1_in_rule__Measure__Group__06245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__ValueAssignment_0_in_rule__Measure__Group__0__Impl6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__Group__1__Impl_in_rule__Measure__Group__16302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__UnitAssignment_1_in_rule__Measure__Group__1__Impl6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__0__Impl_in_rule__PrimitiveInterpretation__Group__06363 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__1_in_rule__PrimitiveInterpretation__Group__06366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__PrimitiveInterpretation__Group__0__Impl6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__1__Impl_in_rule__PrimitiveInterpretation__Group__16425 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__2_in_rule__PrimitiveInterpretation__Group__16428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__TypeAssignment_1_in_rule__PrimitiveInterpretation__Group__1__Impl6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__2__Impl_in_rule__PrimitiveInterpretation__Group__26485 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__3_in_rule__PrimitiveInterpretation__Group__26488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__NameAssignment_2_in_rule__PrimitiveInterpretation__Group__2__Impl6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__3__Impl_in_rule__PrimitiveInterpretation__Group__36545 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__4_in_rule__PrimitiveInterpretation__Group__36548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__PrimitiveInterpretation__Group__3__Impl6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__4__Impl_in_rule__PrimitiveInterpretation__Group__46607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__RepresentationAssignment_4_in_rule__PrimitiveInterpretation__Group__4__Impl6634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__06674 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__06677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Constant__Group__0__Impl6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__16736 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__16739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl6766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__26796 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__26799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Constant__Group__2__Impl6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__36858 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__36861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__RepresentationAssignment_3_in_rule__Constant__Group__3__Impl6888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__46918 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Constant__Group__5_in_rule__Constant__Group__46921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Constant__Group__4__Impl6949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__5__Impl_in_rule__Constant__Group__56980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ConstantValueAssignment_5_in_rule__Constant__Group__5__Impl7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__07049 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__07052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__17108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl7135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__07170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__07173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__DOUBLE__Group_1__0__Impl7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__17232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptions_in_rule__DataModel__OptionsAssignment_27297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepresentation_in_rule__DataModel__RepresentationsAssignment_4_07328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretation_in_rule__DataModel__InterpretationsAssignment_4_17359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_67394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_7_17433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransmissionType_in_rule__Options__TransmissionTypeAssignment_1_0_37468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_rule__Options__SensorLanguageAssignment_1_1_37499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_rule__Options__ReceiverLanguageAssignment_1_2_37530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Representation__NameAssignment_17561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Representation__TypeAssignment_37592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Representation__ByteCountAssignment_57623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__NameAssignment_17654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__RepresentationAssignment_37689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__MethodNameAssignment_57724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__MethodNameOutAssignment_6_17755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_87786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_9_17817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__InterpretationAssignment_17852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentType_in_rule__Parameter__ArgumentTypeAssignment_2_17887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InterpretationGroup__NameAssignment_17918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretation_in_rule__InterpretationGroup__InterpretationsAssignment_37949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantity_in_rule__Measurement__QuantityAssignment_27980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Measurement__NameAssignment_38011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Measurement__ScaleAssignment_58042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Measurement__UnitAssignment_68073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Measurement__RepresentationAssignment_88108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementConstraint_in_rule__Measurement__ConstraintsAssignment_98143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_rule__MeasurementInRange__LowerBoundAssignment_18174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_rule__MeasurementInRange__UpperBoundAssignment_38205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Measure__ValueAssignment_08236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Measure__UnitAssignment_18267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__PrimitiveInterpretation__TypeAssignment_18298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveInterpretation__NameAssignment_28329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveInterpretation__RepresentationAssignment_48364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_18399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__RepresentationAssignment_38434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constant__ConstantValueAssignment_58469 = new BitSet(new long[]{0x0000000000000002L});

}