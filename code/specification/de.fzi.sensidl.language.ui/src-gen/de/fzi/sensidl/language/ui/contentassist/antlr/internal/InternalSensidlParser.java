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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BYTE_ARRAY'", "'repr'", "'representation'", "'bytes'", "'byte'", "'calculate'", "'calculated'", "'JAVA'", "'CPP'", "'C'", "'CSHARP'", "'BOOL'", "'CHAR'", "'SHORT'", "'INT'", "'LONG'", "'LONGLONG'", "'FLOAT'", "'DOUBLE'", "'LONGDOUBLE'", "'LSB'", "'MSB'", "'datamodel'", "'{'", "'options'", "'}'", "'transmit'", "','", "'sensor'", "'language'", "':'", "'receiver'", "'is'", "'in'", "'as'", "'by'", "'with'", "'('", "')'", "'structure'", "'data'", "'of'", "'bit'", "'numbering'", "'from'", "'to'", "'scaling factor'", "'and'", "'offset'", "'primitive'", "'.'"
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


    // $ANTLR start "entryRuleDatafield"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:144:1: entryRuleDatafield : ruleDatafield EOF ;
    public final void entryRuleDatafield() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:145:1: ( ruleDatafield EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:146:1: ruleDatafield EOF
            {
             before(grammarAccess.getDatafieldRule()); 
            pushFollow(FOLLOW_ruleDatafield_in_entryRuleDatafield241);
            ruleDatafield();

            state._fsp--;

             after(grammarAccess.getDatafieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatafield248); 

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
    // $ANTLR end "entryRuleDatafield"


    // $ANTLR start "ruleDatafield"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:153:1: ruleDatafield : ( ( rule__Datafield__Alternatives ) ) ;
    public final void ruleDatafield() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:157:2: ( ( ( rule__Datafield__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:158:1: ( ( rule__Datafield__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:158:1: ( ( rule__Datafield__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:159:1: ( rule__Datafield__Alternatives )
            {
             before(grammarAccess.getDatafieldAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:160:1: ( rule__Datafield__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:160:2: rule__Datafield__Alternatives
            {
            pushFollow(FOLLOW_rule__Datafield__Alternatives_in_ruleDatafield274);
            rule__Datafield__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatafieldAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDatafield"


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


    // $ANTLR start "entryRuleDatastructure"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:228:1: entryRuleDatastructure : ruleDatastructure EOF ;
    public final void entryRuleDatastructure() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:229:1: ( ruleDatastructure EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:230:1: ruleDatastructure EOF
            {
             before(grammarAccess.getDatastructureRule()); 
            pushFollow(FOLLOW_ruleDatastructure_in_entryRuleDatastructure421);
            ruleDatastructure();

            state._fsp--;

             after(grammarAccess.getDatastructureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatastructure428); 

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
    // $ANTLR end "entryRuleDatastructure"


    // $ANTLR start "ruleDatastructure"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:237:1: ruleDatastructure : ( ( rule__Datastructure__Group__0 ) ) ;
    public final void ruleDatastructure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:241:2: ( ( ( rule__Datastructure__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:242:1: ( ( rule__Datastructure__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:242:1: ( ( rule__Datastructure__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:243:1: ( rule__Datastructure__Group__0 )
            {
             before(grammarAccess.getDatastructureAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:244:1: ( rule__Datastructure__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:244:2: rule__Datastructure__Group__0
            {
            pushFollow(FOLLOW_rule__Datastructure__Group__0_in_ruleDatastructure454);
            rule__Datastructure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatastructureAccess().getGroup()); 

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
    // $ANTLR end "ruleDatastructure"


    // $ANTLR start "entryRuleData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:256:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:257:1: ( ruleData EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:258:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData481);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData488); 

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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:265:1: ruleData : ( ( rule__Data__Group__0 ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:269:2: ( ( ( rule__Data__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:270:1: ( ( rule__Data__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:270:1: ( ( rule__Data__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:271:1: ( rule__Data__Group__0 )
            {
             before(grammarAccess.getDataAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:272:1: ( rule__Data__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:272:2: rule__Data__Group__0
            {
            pushFollow(FOLLOW_rule__Data__Group__0_in_ruleData514);
            rule__Data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getGroup()); 

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleDataConstraint"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:284:1: entryRuleDataConstraint : ruleDataConstraint EOF ;
    public final void entryRuleDataConstraint() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:285:1: ( ruleDataConstraint EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:286:1: ruleDataConstraint EOF
            {
             before(grammarAccess.getDataConstraintRule()); 
            pushFollow(FOLLOW_ruleDataConstraint_in_entryRuleDataConstraint541);
            ruleDataConstraint();

            state._fsp--;

             after(grammarAccess.getDataConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataConstraint548); 

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
    // $ANTLR end "entryRuleDataConstraint"


    // $ANTLR start "ruleDataConstraint"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:293:1: ruleDataConstraint : ( ( rule__DataConstraint__Alternatives ) ) ;
    public final void ruleDataConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:297:2: ( ( ( rule__DataConstraint__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:298:1: ( ( rule__DataConstraint__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:298:1: ( ( rule__DataConstraint__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:299:1: ( rule__DataConstraint__Alternatives )
            {
             before(grammarAccess.getDataConstraintAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:300:1: ( rule__DataConstraint__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:300:2: rule__DataConstraint__Alternatives
            {
            pushFollow(FOLLOW_rule__DataConstraint__Alternatives_in_ruleDataConstraint574);
            rule__DataConstraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataConstraintAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataConstraint"


    // $ANTLR start "entryRuleDataRange"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:312:1: entryRuleDataRange : ruleDataRange EOF ;
    public final void entryRuleDataRange() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:313:1: ( ruleDataRange EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:314:1: ruleDataRange EOF
            {
             before(grammarAccess.getDataRangeRule()); 
            pushFollow(FOLLOW_ruleDataRange_in_entryRuleDataRange601);
            ruleDataRange();

            state._fsp--;

             after(grammarAccess.getDataRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataRange608); 

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
    // $ANTLR end "entryRuleDataRange"


    // $ANTLR start "ruleDataRange"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:321:1: ruleDataRange : ( ( rule__DataRange__Group__0 ) ) ;
    public final void ruleDataRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:325:2: ( ( ( rule__DataRange__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:326:1: ( ( rule__DataRange__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:326:1: ( ( rule__DataRange__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:327:1: ( rule__DataRange__Group__0 )
            {
             before(grammarAccess.getDataRangeAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:328:1: ( rule__DataRange__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:328:2: rule__DataRange__Group__0
            {
            pushFollow(FOLLOW_rule__DataRange__Group__0_in_ruleDataRange634);
            rule__DataRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataRangeAccess().getGroup()); 

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
    // $ANTLR end "ruleDataRange"


    // $ANTLR start "entryRuleDataAdaption"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:340:1: entryRuleDataAdaption : ruleDataAdaption EOF ;
    public final void entryRuleDataAdaption() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:341:1: ( ruleDataAdaption EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:342:1: ruleDataAdaption EOF
            {
             before(grammarAccess.getDataAdaptionRule()); 
            pushFollow(FOLLOW_ruleDataAdaption_in_entryRuleDataAdaption661);
            ruleDataAdaption();

            state._fsp--;

             after(grammarAccess.getDataAdaptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAdaption668); 

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
    // $ANTLR end "entryRuleDataAdaption"


    // $ANTLR start "ruleDataAdaption"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:349:1: ruleDataAdaption : ( ( rule__DataAdaption__Group__0 ) ) ;
    public final void ruleDataAdaption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:353:2: ( ( ( rule__DataAdaption__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:354:1: ( ( rule__DataAdaption__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:354:1: ( ( rule__DataAdaption__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:355:1: ( rule__DataAdaption__Group__0 )
            {
             before(grammarAccess.getDataAdaptionAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:356:1: ( rule__DataAdaption__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:356:2: rule__DataAdaption__Group__0
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__0_in_ruleDataAdaption694);
            rule__DataAdaption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAdaptionAccess().getGroup()); 

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
    // $ANTLR end "ruleDataAdaption"


    // $ANTLR start "entryRuleBound"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:368:1: entryRuleBound : ruleBound EOF ;
    public final void entryRuleBound() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:369:1: ( ruleBound EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:370:1: ruleBound EOF
            {
             before(grammarAccess.getBoundRule()); 
            pushFollow(FOLLOW_ruleBound_in_entryRuleBound721);
            ruleBound();

            state._fsp--;

             after(grammarAccess.getBoundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBound728); 

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
    // $ANTLR end "entryRuleBound"


    // $ANTLR start "ruleBound"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:377:1: ruleBound : ( ( rule__Bound__Group__0 ) ) ;
    public final void ruleBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:381:2: ( ( ( rule__Bound__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:382:1: ( ( rule__Bound__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:382:1: ( ( rule__Bound__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:383:1: ( rule__Bound__Group__0 )
            {
             before(grammarAccess.getBoundAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:384:1: ( rule__Bound__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:384:2: rule__Bound__Group__0
            {
            pushFollow(FOLLOW_rule__Bound__Group__0_in_ruleBound754);
            rule__Bound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoundAccess().getGroup()); 

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
    // $ANTLR end "ruleBound"


    // $ANTLR start "entryRuleMetadata"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:396:1: entryRuleMetadata : ruleMetadata EOF ;
    public final void entryRuleMetadata() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:397:1: ( ruleMetadata EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:398:1: ruleMetadata EOF
            {
             before(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_ruleMetadata_in_entryRuleMetadata781);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getMetadataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadata788); 

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
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:405:1: ruleMetadata : ( ( rule__Metadata__Group__0 ) ) ;
    public final void ruleMetadata() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:409:2: ( ( ( rule__Metadata__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:410:1: ( ( rule__Metadata__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:410:1: ( ( rule__Metadata__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:411:1: ( rule__Metadata__Group__0 )
            {
             before(grammarAccess.getMetadataAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:412:1: ( rule__Metadata__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:412:2: rule__Metadata__Group__0
            {
            pushFollow(FOLLOW_rule__Metadata__Group__0_in_ruleMetadata814);
            rule__Metadata__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getGroup()); 

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
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleDOUBLE"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:424:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:425:1: ( ruleDOUBLE EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:426:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE841);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE848); 

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
            pushFollow(FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE874);
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
            pushFollow(FOLLOW_rule__GenerationLanguage__Alternatives_in_ruleGenerationLanguage911);
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


    // $ANTLR start "ruleArgumentType"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:472:1: ruleArgumentType : ( ( 'BYTE_ARRAY' ) ) ;
    public final void ruleArgumentType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:476:1: ( ( ( 'BYTE_ARRAY' ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:477:1: ( ( 'BYTE_ARRAY' ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:477:1: ( ( 'BYTE_ARRAY' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:478:1: ( 'BYTE_ARRAY' )
            {
             before(grammarAccess.getArgumentTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:479:1: ( 'BYTE_ARRAY' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:479:3: 'BYTE_ARRAY'
            {
            match(input,11,FOLLOW_11_in_ruleArgumentType948); 

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


    // $ANTLR start "ruleType"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:492:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:496:1: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:497:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:497:1: ( ( rule__Type__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:498:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:499:1: ( rule__Type__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:499:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType986);
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


    // $ANTLR start "ruleBitNumbering"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:511:1: ruleBitNumbering : ( ( rule__BitNumbering__Alternatives ) ) ;
    public final void ruleBitNumbering() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:515:1: ( ( ( rule__BitNumbering__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:516:1: ( ( rule__BitNumbering__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:516:1: ( ( rule__BitNumbering__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:517:1: ( rule__BitNumbering__Alternatives )
            {
             before(grammarAccess.getBitNumberingAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:518:1: ( rule__BitNumbering__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:518:2: rule__BitNumbering__Alternatives
            {
            pushFollow(FOLLOW_rule__BitNumbering__Alternatives_in_ruleBitNumbering1022);
            rule__BitNumbering__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBitNumberingAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBitNumbering"


    // $ANTLR start "rule__DataModel__Alternatives_6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:529:1: rule__DataModel__Alternatives_6 : ( ( ( rule__DataModel__RepresentationsAssignment_6_0 ) ) | ( ( rule__DataModel__DatafieldsAssignment_6_1 ) ) );
    public final void rule__DataModel__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:533:1: ( ( ( rule__DataModel__RepresentationsAssignment_6_0 ) ) | ( ( rule__DataModel__DatafieldsAssignment_6_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=16 && LA1_0<=17)||(LA1_0>=50 && LA1_0<=51)||LA1_0==60) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:534:1: ( ( rule__DataModel__RepresentationsAssignment_6_0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:534:1: ( ( rule__DataModel__RepresentationsAssignment_6_0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:535:1: ( rule__DataModel__RepresentationsAssignment_6_0 )
                    {
                     before(grammarAccess.getDataModelAccess().getRepresentationsAssignment_6_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:536:1: ( rule__DataModel__RepresentationsAssignment_6_0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:536:2: rule__DataModel__RepresentationsAssignment_6_0
                    {
                    pushFollow(FOLLOW_rule__DataModel__RepresentationsAssignment_6_0_in_rule__DataModel__Alternatives_61057);
                    rule__DataModel__RepresentationsAssignment_6_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataModelAccess().getRepresentationsAssignment_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:540:6: ( ( rule__DataModel__DatafieldsAssignment_6_1 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:540:6: ( ( rule__DataModel__DatafieldsAssignment_6_1 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:541:1: ( rule__DataModel__DatafieldsAssignment_6_1 )
                    {
                     before(grammarAccess.getDataModelAccess().getDatafieldsAssignment_6_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:542:1: ( rule__DataModel__DatafieldsAssignment_6_1 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:542:2: rule__DataModel__DatafieldsAssignment_6_1
                    {
                    pushFollow(FOLLOW_rule__DataModel__DatafieldsAssignment_6_1_in_rule__DataModel__Alternatives_61075);
                    rule__DataModel__DatafieldsAssignment_6_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataModelAccess().getDatafieldsAssignment_6_1()); 

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
    // $ANTLR end "rule__DataModel__Alternatives_6"


    // $ANTLR start "rule__Options__Alternatives_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:551:1: rule__Options__Alternatives_1 : ( ( ( rule__Options__Group_1_0__0 ) ) | ( ( rule__Options__Group_1_1__0 ) ) );
    public final void rule__Options__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:555:1: ( ( ( rule__Options__Group_1_0__0 ) ) | ( ( rule__Options__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==39) ) {
                alt2=1;
            }
            else if ( (LA2_0==42) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:556:1: ( ( rule__Options__Group_1_0__0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:556:1: ( ( rule__Options__Group_1_0__0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:557:1: ( rule__Options__Group_1_0__0 )
                    {
                     before(grammarAccess.getOptionsAccess().getGroup_1_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:558:1: ( rule__Options__Group_1_0__0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:558:2: rule__Options__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Options__Group_1_0__0_in_rule__Options__Alternatives_11108);
                    rule__Options__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionsAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:562:6: ( ( rule__Options__Group_1_1__0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:562:6: ( ( rule__Options__Group_1_1__0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:563:1: ( rule__Options__Group_1_1__0 )
                    {
                     before(grammarAccess.getOptionsAccess().getGroup_1_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:564:1: ( rule__Options__Group_1_1__0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:564:2: rule__Options__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Options__Group_1_1__0_in_rule__Options__Alternatives_11126);
                    rule__Options__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionsAccess().getGroup_1_1()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:573:1: rule__Representation__Alternatives_0 : ( ( 'repr' ) | ( 'representation' ) );
    public final void rule__Representation__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:577:1: ( ( 'repr' ) | ( 'representation' ) )
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
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:578:1: ( 'repr' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:578:1: ( 'repr' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:579:1: 'repr'
                    {
                     before(grammarAccess.getRepresentationAccess().getReprKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Representation__Alternatives_01160); 
                     after(grammarAccess.getRepresentationAccess().getReprKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:586:6: ( 'representation' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:586:6: ( 'representation' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:587:1: 'representation'
                    {
                     before(grammarAccess.getRepresentationAccess().getRepresentationKeyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Representation__Alternatives_01180); 
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


    // $ANTLR start "rule__Representation__Alternatives_4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:599:1: rule__Representation__Alternatives_4 : ( ( 'bytes' ) | ( 'byte' ) );
    public final void rule__Representation__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:603:1: ( ( 'bytes' ) | ( 'byte' ) )
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
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:604:1: ( 'bytes' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:604:1: ( 'bytes' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:605:1: 'bytes'
                    {
                     before(grammarAccess.getRepresentationAccess().getBytesKeyword_4_0()); 
                    match(input,14,FOLLOW_14_in_rule__Representation__Alternatives_41215); 
                     after(grammarAccess.getRepresentationAccess().getBytesKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:612:6: ( 'byte' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:612:6: ( 'byte' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:613:1: 'byte'
                    {
                     before(grammarAccess.getRepresentationAccess().getByteKeyword_4_1()); 
                    match(input,15,FOLLOW_15_in_rule__Representation__Alternatives_41235); 
                     after(grammarAccess.getRepresentationAccess().getByteKeyword_4_1()); 

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
    // $ANTLR end "rule__Representation__Alternatives_4"


    // $ANTLR start "rule__Datafield__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:625:1: rule__Datafield__Alternatives : ( ( ruleMetadata ) | ( ruleData ) | ( ruleDatastructure ) | ( ruleCalculated ) );
    public final void rule__Datafield__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:629:1: ( ( ruleMetadata ) | ( ruleData ) | ( ruleDatastructure ) | ( ruleCalculated ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt5=1;
                }
                break;
            case 51:
                {
                alt5=2;
                }
                break;
            case 50:
                {
                alt5=3;
                }
                break;
            case 16:
            case 17:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:630:1: ( ruleMetadata )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:630:1: ( ruleMetadata )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:631:1: ruleMetadata
                    {
                     before(grammarAccess.getDatafieldAccess().getMetadataParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMetadata_in_rule__Datafield__Alternatives1269);
                    ruleMetadata();

                    state._fsp--;

                     after(grammarAccess.getDatafieldAccess().getMetadataParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:636:6: ( ruleData )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:636:6: ( ruleData )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:637:1: ruleData
                    {
                     before(grammarAccess.getDatafieldAccess().getDataParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleData_in_rule__Datafield__Alternatives1286);
                    ruleData();

                    state._fsp--;

                     after(grammarAccess.getDatafieldAccess().getDataParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:642:6: ( ruleDatastructure )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:642:6: ( ruleDatastructure )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:643:1: ruleDatastructure
                    {
                     before(grammarAccess.getDatafieldAccess().getDatastructureParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDatastructure_in_rule__Datafield__Alternatives1303);
                    ruleDatastructure();

                    state._fsp--;

                     after(grammarAccess.getDatafieldAccess().getDatastructureParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:648:6: ( ruleCalculated )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:648:6: ( ruleCalculated )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:649:1: ruleCalculated
                    {
                     before(grammarAccess.getDatafieldAccess().getCalculatedParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleCalculated_in_rule__Datafield__Alternatives1320);
                    ruleCalculated();

                    state._fsp--;

                     after(grammarAccess.getDatafieldAccess().getCalculatedParserRuleCall_3()); 

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
    // $ANTLR end "rule__Datafield__Alternatives"


    // $ANTLR start "rule__Calculated__Alternatives_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:659:1: rule__Calculated__Alternatives_0 : ( ( 'calculate' ) | ( 'calculated' ) );
    public final void rule__Calculated__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:663:1: ( ( 'calculate' ) | ( 'calculated' ) )
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
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:664:1: ( 'calculate' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:664:1: ( 'calculate' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:665:1: 'calculate'
                    {
                     before(grammarAccess.getCalculatedAccess().getCalculateKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Calculated__Alternatives_01353); 
                     after(grammarAccess.getCalculatedAccess().getCalculateKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:672:6: ( 'calculated' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:672:6: ( 'calculated' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:673:1: 'calculated'
                    {
                     before(grammarAccess.getCalculatedAccess().getCalculatedKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Calculated__Alternatives_01373); 
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


    // $ANTLR start "rule__DataConstraint__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:685:1: rule__DataConstraint__Alternatives : ( ( ruleDataRange ) | ( ruleDataAdaption ) );
    public final void rule__DataConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:689:1: ( ( ruleDataRange ) | ( ruleDataAdaption ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==55) ) {
                alt7=1;
            }
            else if ( (LA7_0==47) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:690:1: ( ruleDataRange )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:690:1: ( ruleDataRange )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:691:1: ruleDataRange
                    {
                     before(grammarAccess.getDataConstraintAccess().getDataRangeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDataRange_in_rule__DataConstraint__Alternatives1407);
                    ruleDataRange();

                    state._fsp--;

                     after(grammarAccess.getDataConstraintAccess().getDataRangeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:696:6: ( ruleDataAdaption )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:696:6: ( ruleDataAdaption )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:697:1: ruleDataAdaption
                    {
                     before(grammarAccess.getDataConstraintAccess().getDataAdaptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataAdaption_in_rule__DataConstraint__Alternatives1424);
                    ruleDataAdaption();

                    state._fsp--;

                     after(grammarAccess.getDataConstraintAccess().getDataAdaptionParserRuleCall_1()); 

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
    // $ANTLR end "rule__DataConstraint__Alternatives"


    // $ANTLR start "rule__GenerationLanguage__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:707:1: rule__GenerationLanguage__Alternatives : ( ( ( 'JAVA' ) ) | ( ( 'CPP' ) ) | ( ( 'C' ) ) | ( ( 'CSHARP' ) ) );
    public final void rule__GenerationLanguage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:711:1: ( ( ( 'JAVA' ) ) | ( ( 'CPP' ) ) | ( ( 'C' ) ) | ( ( 'CSHARP' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:712:1: ( ( 'JAVA' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:712:1: ( ( 'JAVA' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:713:1: ( 'JAVA' )
                    {
                     before(grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:714:1: ( 'JAVA' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:714:3: 'JAVA'
                    {
                    match(input,18,FOLLOW_18_in_rule__GenerationLanguage__Alternatives1457); 

                    }

                     after(grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:719:6: ( ( 'CPP' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:719:6: ( ( 'CPP' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:720:1: ( 'CPP' )
                    {
                     before(grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:721:1: ( 'CPP' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:721:3: 'CPP'
                    {
                    match(input,19,FOLLOW_19_in_rule__GenerationLanguage__Alternatives1478); 

                    }

                     after(grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:726:6: ( ( 'C' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:726:6: ( ( 'C' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:727:1: ( 'C' )
                    {
                     before(grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:728:1: ( 'C' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:728:3: 'C'
                    {
                    match(input,20,FOLLOW_20_in_rule__GenerationLanguage__Alternatives1499); 

                    }

                     after(grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:733:6: ( ( 'CSHARP' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:733:6: ( ( 'CSHARP' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:734:1: ( 'CSHARP' )
                    {
                     before(grammarAccess.getGenerationLanguageAccess().getCSHARPEnumLiteralDeclaration_3()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:735:1: ( 'CSHARP' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:735:3: 'CSHARP'
                    {
                    match(input,21,FOLLOW_21_in_rule__GenerationLanguage__Alternatives1520); 

                    }

                     after(grammarAccess.getGenerationLanguageAccess().getCSHARPEnumLiteralDeclaration_3()); 

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


    // $ANTLR start "rule__Type__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:745:1: rule__Type__Alternatives : ( ( ( 'BOOL' ) ) | ( ( 'CHAR' ) ) | ( ( 'SHORT' ) ) | ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'LONGLONG' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'LONGDOUBLE' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:749:1: ( ( ( 'BOOL' ) ) | ( ( 'CHAR' ) ) | ( ( 'SHORT' ) ) | ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'LONGLONG' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'LONGDOUBLE' ) ) )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            case 26:
                {
                alt9=5;
                }
                break;
            case 27:
                {
                alt9=6;
                }
                break;
            case 28:
                {
                alt9=7;
                }
                break;
            case 29:
                {
                alt9=8;
                }
                break;
            case 30:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:750:1: ( ( 'BOOL' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:750:1: ( ( 'BOOL' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:751:1: ( 'BOOL' )
                    {
                     before(grammarAccess.getTypeAccess().getBOOLEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:752:1: ( 'BOOL' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:752:3: 'BOOL'
                    {
                    match(input,22,FOLLOW_22_in_rule__Type__Alternatives1556); 

                    }

                     after(grammarAccess.getTypeAccess().getBOOLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:757:6: ( ( 'CHAR' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:757:6: ( ( 'CHAR' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:758:1: ( 'CHAR' )
                    {
                     before(grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:759:1: ( 'CHAR' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:759:3: 'CHAR'
                    {
                    match(input,23,FOLLOW_23_in_rule__Type__Alternatives1577); 

                    }

                     after(grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:764:6: ( ( 'SHORT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:764:6: ( ( 'SHORT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:765:1: ( 'SHORT' )
                    {
                     before(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:766:1: ( 'SHORT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:766:3: 'SHORT'
                    {
                    match(input,24,FOLLOW_24_in_rule__Type__Alternatives1598); 

                    }

                     after(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:771:6: ( ( 'INT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:771:6: ( ( 'INT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:772:1: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_3()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:773:1: ( 'INT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:773:3: 'INT'
                    {
                    match(input,25,FOLLOW_25_in_rule__Type__Alternatives1619); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:778:6: ( ( 'LONG' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:778:6: ( ( 'LONG' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:779:1: ( 'LONG' )
                    {
                     before(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_4()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:780:1: ( 'LONG' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:780:3: 'LONG'
                    {
                    match(input,26,FOLLOW_26_in_rule__Type__Alternatives1640); 

                    }

                     after(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:785:6: ( ( 'LONGLONG' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:785:6: ( ( 'LONGLONG' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:786:1: ( 'LONGLONG' )
                    {
                     before(grammarAccess.getTypeAccess().getLONGLONGEnumLiteralDeclaration_5()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:787:1: ( 'LONGLONG' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:787:3: 'LONGLONG'
                    {
                    match(input,27,FOLLOW_27_in_rule__Type__Alternatives1661); 

                    }

                     after(grammarAccess.getTypeAccess().getLONGLONGEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:792:6: ( ( 'FLOAT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:792:6: ( ( 'FLOAT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:793:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_6()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:794:1: ( 'FLOAT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:794:3: 'FLOAT'
                    {
                    match(input,28,FOLLOW_28_in_rule__Type__Alternatives1682); 

                    }

                     after(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:799:6: ( ( 'DOUBLE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:799:6: ( ( 'DOUBLE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:800:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_7()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:801:1: ( 'DOUBLE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:801:3: 'DOUBLE'
                    {
                    match(input,29,FOLLOW_29_in_rule__Type__Alternatives1703); 

                    }

                     after(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:806:6: ( ( 'LONGDOUBLE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:806:6: ( ( 'LONGDOUBLE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:807:1: ( 'LONGDOUBLE' )
                    {
                     before(grammarAccess.getTypeAccess().getLONGDOUBLEEnumLiteralDeclaration_8()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:808:1: ( 'LONGDOUBLE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:808:3: 'LONGDOUBLE'
                    {
                    match(input,30,FOLLOW_30_in_rule__Type__Alternatives1724); 

                    }

                     after(grammarAccess.getTypeAccess().getLONGDOUBLEEnumLiteralDeclaration_8()); 

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


    // $ANTLR start "rule__BitNumbering__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:818:1: rule__BitNumbering__Alternatives : ( ( ( 'LSB' ) ) | ( ( 'MSB' ) ) );
    public final void rule__BitNumbering__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:822:1: ( ( ( 'LSB' ) ) | ( ( 'MSB' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            else if ( (LA10_0==32) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:823:1: ( ( 'LSB' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:823:1: ( ( 'LSB' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:824:1: ( 'LSB' )
                    {
                     before(grammarAccess.getBitNumberingAccess().getLSBEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:825:1: ( 'LSB' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:825:3: 'LSB'
                    {
                    match(input,31,FOLLOW_31_in_rule__BitNumbering__Alternatives1760); 

                    }

                     after(grammarAccess.getBitNumberingAccess().getLSBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:830:6: ( ( 'MSB' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:830:6: ( ( 'MSB' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:831:1: ( 'MSB' )
                    {
                     before(grammarAccess.getBitNumberingAccess().getMSBEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:832:1: ( 'MSB' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:832:3: 'MSB'
                    {
                    match(input,32,FOLLOW_32_in_rule__BitNumbering__Alternatives1781); 

                    }

                     after(grammarAccess.getBitNumberingAccess().getMSBEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BitNumbering__Alternatives"


    // $ANTLR start "rule__DataModel__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:844:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:848:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:849:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__01814);
            rule__DataModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__01817);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:856:1: rule__DataModel__Group__0__Impl : ( 'datamodel' ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:860:1: ( ( 'datamodel' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:861:1: ( 'datamodel' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:861:1: ( 'datamodel' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:862:1: 'datamodel'
            {
             before(grammarAccess.getDataModelAccess().getDatamodelKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__DataModel__Group__0__Impl1845); 
             after(grammarAccess.getDataModelAccess().getDatamodelKeyword_0()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:875:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:879:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:880:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__11876);
            rule__DataModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__11879);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:887:1: rule__DataModel__Group__1__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:891:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:892:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:892:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:893:1: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__DataModel__Group__1__Impl1907); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:906:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl rule__DataModel__Group__3 ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:910:1: ( rule__DataModel__Group__2__Impl rule__DataModel__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:911:2: rule__DataModel__Group__2__Impl rule__DataModel__Group__3
            {
            pushFollow(FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__21938);
            rule__DataModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__21941);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:918:1: rule__DataModel__Group__2__Impl : ( 'options' ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:922:1: ( ( 'options' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:923:1: ( 'options' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:923:1: ( 'options' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:924:1: 'options'
            {
             before(grammarAccess.getDataModelAccess().getOptionsKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__DataModel__Group__2__Impl1969); 
             after(grammarAccess.getDataModelAccess().getOptionsKeyword_2()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:937:1: rule__DataModel__Group__3 : rule__DataModel__Group__3__Impl rule__DataModel__Group__4 ;
    public final void rule__DataModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:941:1: ( rule__DataModel__Group__3__Impl rule__DataModel__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:942:2: rule__DataModel__Group__3__Impl rule__DataModel__Group__4
            {
            pushFollow(FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__32000);
            rule__DataModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__32003);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:949:1: rule__DataModel__Group__3__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:953:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:954:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:954:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:955:1: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__DataModel__Group__3__Impl2031); 
             after(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:968:1: rule__DataModel__Group__4 : rule__DataModel__Group__4__Impl rule__DataModel__Group__5 ;
    public final void rule__DataModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:972:1: ( rule__DataModel__Group__4__Impl rule__DataModel__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:973:2: rule__DataModel__Group__4__Impl rule__DataModel__Group__5
            {
            pushFollow(FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__42062);
            rule__DataModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__5_in_rule__DataModel__Group__42065);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:980:1: rule__DataModel__Group__4__Impl : ( ( rule__DataModel__OptionsAssignment_4 ) ) ;
    public final void rule__DataModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:984:1: ( ( ( rule__DataModel__OptionsAssignment_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:985:1: ( ( rule__DataModel__OptionsAssignment_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:985:1: ( ( rule__DataModel__OptionsAssignment_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:986:1: ( rule__DataModel__OptionsAssignment_4 )
            {
             before(grammarAccess.getDataModelAccess().getOptionsAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:987:1: ( rule__DataModel__OptionsAssignment_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:987:2: rule__DataModel__OptionsAssignment_4
            {
            pushFollow(FOLLOW_rule__DataModel__OptionsAssignment_4_in_rule__DataModel__Group__4__Impl2092);
            rule__DataModel__OptionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getOptionsAssignment_4()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:997:1: rule__DataModel__Group__5 : rule__DataModel__Group__5__Impl rule__DataModel__Group__6 ;
    public final void rule__DataModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1001:1: ( rule__DataModel__Group__5__Impl rule__DataModel__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1002:2: rule__DataModel__Group__5__Impl rule__DataModel__Group__6
            {
            pushFollow(FOLLOW_rule__DataModel__Group__5__Impl_in_rule__DataModel__Group__52122);
            rule__DataModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__6_in_rule__DataModel__Group__52125);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1009:1: rule__DataModel__Group__5__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1013:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1014:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1014:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1015:1: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_36_in_rule__DataModel__Group__5__Impl2153); 
             after(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_5()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1028:1: rule__DataModel__Group__6 : rule__DataModel__Group__6__Impl rule__DataModel__Group__7 ;
    public final void rule__DataModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1032:1: ( rule__DataModel__Group__6__Impl rule__DataModel__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1033:2: rule__DataModel__Group__6__Impl rule__DataModel__Group__7
            {
            pushFollow(FOLLOW_rule__DataModel__Group__6__Impl_in_rule__DataModel__Group__62184);
            rule__DataModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__7_in_rule__DataModel__Group__62187);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1040:1: rule__DataModel__Group__6__Impl : ( ( rule__DataModel__Alternatives_6 )* ) ;
    public final void rule__DataModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1044:1: ( ( ( rule__DataModel__Alternatives_6 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1045:1: ( ( rule__DataModel__Alternatives_6 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1045:1: ( ( rule__DataModel__Alternatives_6 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1046:1: ( rule__DataModel__Alternatives_6 )*
            {
             before(grammarAccess.getDataModelAccess().getAlternatives_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1047:1: ( rule__DataModel__Alternatives_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=12 && LA11_0<=13)||(LA11_0>=16 && LA11_0<=17)||(LA11_0>=50 && LA11_0<=51)||LA11_0==60) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1047:2: rule__DataModel__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_rule__DataModel__Alternatives_6_in_rule__DataModel__Group__6__Impl2214);
            	    rule__DataModel__Alternatives_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getAlternatives_6()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1057:1: rule__DataModel__Group__7 : rule__DataModel__Group__7__Impl rule__DataModel__Group__8 ;
    public final void rule__DataModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1061:1: ( rule__DataModel__Group__7__Impl rule__DataModel__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1062:2: rule__DataModel__Group__7__Impl rule__DataModel__Group__8
            {
            pushFollow(FOLLOW_rule__DataModel__Group__7__Impl_in_rule__DataModel__Group__72245);
            rule__DataModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__8_in_rule__DataModel__Group__72248);
            rule__DataModel__Group__8();

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1069:1: rule__DataModel__Group__7__Impl : ( 'transmit' ) ;
    public final void rule__DataModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1073:1: ( ( 'transmit' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1074:1: ( 'transmit' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1074:1: ( 'transmit' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1075:1: 'transmit'
            {
             before(grammarAccess.getDataModelAccess().getTransmitKeyword_7()); 
            match(input,37,FOLLOW_37_in_rule__DataModel__Group__7__Impl2276); 
             after(grammarAccess.getDataModelAccess().getTransmitKeyword_7()); 

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


    // $ANTLR start "rule__DataModel__Group__8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1088:1: rule__DataModel__Group__8 : rule__DataModel__Group__8__Impl rule__DataModel__Group__9 ;
    public final void rule__DataModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1092:1: ( rule__DataModel__Group__8__Impl rule__DataModel__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1093:2: rule__DataModel__Group__8__Impl rule__DataModel__Group__9
            {
            pushFollow(FOLLOW_rule__DataModel__Group__8__Impl_in_rule__DataModel__Group__82307);
            rule__DataModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__9_in_rule__DataModel__Group__82310);
            rule__DataModel__Group__9();

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
    // $ANTLR end "rule__DataModel__Group__8"


    // $ANTLR start "rule__DataModel__Group__8__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1100:1: rule__DataModel__Group__8__Impl : ( ( rule__DataModel__TransmitAssignment_8 ) ) ;
    public final void rule__DataModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1104:1: ( ( ( rule__DataModel__TransmitAssignment_8 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1105:1: ( ( rule__DataModel__TransmitAssignment_8 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1105:1: ( ( rule__DataModel__TransmitAssignment_8 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1106:1: ( rule__DataModel__TransmitAssignment_8 )
            {
             before(grammarAccess.getDataModelAccess().getTransmitAssignment_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1107:1: ( rule__DataModel__TransmitAssignment_8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1107:2: rule__DataModel__TransmitAssignment_8
            {
            pushFollow(FOLLOW_rule__DataModel__TransmitAssignment_8_in_rule__DataModel__Group__8__Impl2337);
            rule__DataModel__TransmitAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getTransmitAssignment_8()); 

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
    // $ANTLR end "rule__DataModel__Group__8__Impl"


    // $ANTLR start "rule__DataModel__Group__9"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1117:1: rule__DataModel__Group__9 : rule__DataModel__Group__9__Impl rule__DataModel__Group__10 ;
    public final void rule__DataModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1121:1: ( rule__DataModel__Group__9__Impl rule__DataModel__Group__10 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1122:2: rule__DataModel__Group__9__Impl rule__DataModel__Group__10
            {
            pushFollow(FOLLOW_rule__DataModel__Group__9__Impl_in_rule__DataModel__Group__92367);
            rule__DataModel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__10_in_rule__DataModel__Group__92370);
            rule__DataModel__Group__10();

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
    // $ANTLR end "rule__DataModel__Group__9"


    // $ANTLR start "rule__DataModel__Group__9__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1129:1: rule__DataModel__Group__9__Impl : ( ( rule__DataModel__Group_9__0 )* ) ;
    public final void rule__DataModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1133:1: ( ( ( rule__DataModel__Group_9__0 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1134:1: ( ( rule__DataModel__Group_9__0 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1134:1: ( ( rule__DataModel__Group_9__0 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1135:1: ( rule__DataModel__Group_9__0 )*
            {
             before(grammarAccess.getDataModelAccess().getGroup_9()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1136:1: ( rule__DataModel__Group_9__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1136:2: rule__DataModel__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__DataModel__Group_9__0_in_rule__DataModel__Group__9__Impl2397);
            	    rule__DataModel__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getGroup_9()); 

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
    // $ANTLR end "rule__DataModel__Group__9__Impl"


    // $ANTLR start "rule__DataModel__Group__10"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1146:1: rule__DataModel__Group__10 : rule__DataModel__Group__10__Impl ;
    public final void rule__DataModel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1150:1: ( rule__DataModel__Group__10__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1151:2: rule__DataModel__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group__10__Impl_in_rule__DataModel__Group__102428);
            rule__DataModel__Group__10__Impl();

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
    // $ANTLR end "rule__DataModel__Group__10"


    // $ANTLR start "rule__DataModel__Group__10__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1157:1: rule__DataModel__Group__10__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1161:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1162:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1162:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1163:1: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_10()); 
            match(input,36,FOLLOW_36_in_rule__DataModel__Group__10__Impl2456); 
             after(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__DataModel__Group__10__Impl"


    // $ANTLR start "rule__DataModel__Group_9__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1198:1: rule__DataModel__Group_9__0 : rule__DataModel__Group_9__0__Impl rule__DataModel__Group_9__1 ;
    public final void rule__DataModel__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1202:1: ( rule__DataModel__Group_9__0__Impl rule__DataModel__Group_9__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1203:2: rule__DataModel__Group_9__0__Impl rule__DataModel__Group_9__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group_9__0__Impl_in_rule__DataModel__Group_9__02509);
            rule__DataModel__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group_9__1_in_rule__DataModel__Group_9__02512);
            rule__DataModel__Group_9__1();

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
    // $ANTLR end "rule__DataModel__Group_9__0"


    // $ANTLR start "rule__DataModel__Group_9__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1210:1: rule__DataModel__Group_9__0__Impl : ( ',' ) ;
    public final void rule__DataModel__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1214:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1215:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1215:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1216:1: ','
            {
             before(grammarAccess.getDataModelAccess().getCommaKeyword_9_0()); 
            match(input,38,FOLLOW_38_in_rule__DataModel__Group_9__0__Impl2540); 
             after(grammarAccess.getDataModelAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__DataModel__Group_9__0__Impl"


    // $ANTLR start "rule__DataModel__Group_9__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1229:1: rule__DataModel__Group_9__1 : rule__DataModel__Group_9__1__Impl ;
    public final void rule__DataModel__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1233:1: ( rule__DataModel__Group_9__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1234:2: rule__DataModel__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group_9__1__Impl_in_rule__DataModel__Group_9__12571);
            rule__DataModel__Group_9__1__Impl();

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
    // $ANTLR end "rule__DataModel__Group_9__1"


    // $ANTLR start "rule__DataModel__Group_9__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1240:1: rule__DataModel__Group_9__1__Impl : ( ( rule__DataModel__TransmitAssignment_9_1 ) ) ;
    public final void rule__DataModel__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1244:1: ( ( ( rule__DataModel__TransmitAssignment_9_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1245:1: ( ( rule__DataModel__TransmitAssignment_9_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1245:1: ( ( rule__DataModel__TransmitAssignment_9_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1246:1: ( rule__DataModel__TransmitAssignment_9_1 )
            {
             before(grammarAccess.getDataModelAccess().getTransmitAssignment_9_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1247:1: ( rule__DataModel__TransmitAssignment_9_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1247:2: rule__DataModel__TransmitAssignment_9_1
            {
            pushFollow(FOLLOW_rule__DataModel__TransmitAssignment_9_1_in_rule__DataModel__Group_9__1__Impl2598);
            rule__DataModel__TransmitAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getTransmitAssignment_9_1()); 

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
    // $ANTLR end "rule__DataModel__Group_9__1__Impl"


    // $ANTLR start "rule__Options__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1261:1: rule__Options__Group__0 : rule__Options__Group__0__Impl rule__Options__Group__1 ;
    public final void rule__Options__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1265:1: ( rule__Options__Group__0__Impl rule__Options__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1266:2: rule__Options__Group__0__Impl rule__Options__Group__1
            {
            pushFollow(FOLLOW_rule__Options__Group__0__Impl_in_rule__Options__Group__02632);
            rule__Options__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group__1_in_rule__Options__Group__02635);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1273:1: rule__Options__Group__0__Impl : ( () ) ;
    public final void rule__Options__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1277:1: ( ( () ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1278:1: ( () )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1278:1: ( () )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1279:1: ()
            {
             before(grammarAccess.getOptionsAccess().getOptionsAction_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1280:1: ()
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1282:1: 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1292:1: rule__Options__Group__1 : rule__Options__Group__1__Impl ;
    public final void rule__Options__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1296:1: ( rule__Options__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1297:2: rule__Options__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group__1__Impl_in_rule__Options__Group__12693);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1303:1: rule__Options__Group__1__Impl : ( ( rule__Options__Alternatives_1 )* ) ;
    public final void rule__Options__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1307:1: ( ( ( rule__Options__Alternatives_1 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1308:1: ( ( rule__Options__Alternatives_1 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1308:1: ( ( rule__Options__Alternatives_1 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1309:1: ( rule__Options__Alternatives_1 )*
            {
             before(grammarAccess.getOptionsAccess().getAlternatives_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1310:1: ( rule__Options__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39||LA13_0==42) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1310:2: rule__Options__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Options__Alternatives_1_in_rule__Options__Group__1__Impl2720);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1324:1: rule__Options__Group_1_0__0 : rule__Options__Group_1_0__0__Impl rule__Options__Group_1_0__1 ;
    public final void rule__Options__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1328:1: ( rule__Options__Group_1_0__0__Impl rule__Options__Group_1_0__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1329:2: rule__Options__Group_1_0__0__Impl rule__Options__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__0__Impl_in_rule__Options__Group_1_0__02755);
            rule__Options__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_0__1_in_rule__Options__Group_1_0__02758);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1336:1: rule__Options__Group_1_0__0__Impl : ( 'sensor' ) ;
    public final void rule__Options__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1340:1: ( ( 'sensor' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1341:1: ( 'sensor' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1341:1: ( 'sensor' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1342:1: 'sensor'
            {
             before(grammarAccess.getOptionsAccess().getSensorKeyword_1_0_0()); 
            match(input,39,FOLLOW_39_in_rule__Options__Group_1_0__0__Impl2786); 
             after(grammarAccess.getOptionsAccess().getSensorKeyword_1_0_0()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1355:1: rule__Options__Group_1_0__1 : rule__Options__Group_1_0__1__Impl rule__Options__Group_1_0__2 ;
    public final void rule__Options__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1359:1: ( rule__Options__Group_1_0__1__Impl rule__Options__Group_1_0__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1360:2: rule__Options__Group_1_0__1__Impl rule__Options__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__1__Impl_in_rule__Options__Group_1_0__12817);
            rule__Options__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_0__2_in_rule__Options__Group_1_0__12820);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1367:1: rule__Options__Group_1_0__1__Impl : ( 'language' ) ;
    public final void rule__Options__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1371:1: ( ( 'language' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1372:1: ( 'language' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1372:1: ( 'language' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1373:1: 'language'
            {
             before(grammarAccess.getOptionsAccess().getLanguageKeyword_1_0_1()); 
            match(input,40,FOLLOW_40_in_rule__Options__Group_1_0__1__Impl2848); 
             after(grammarAccess.getOptionsAccess().getLanguageKeyword_1_0_1()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1386:1: rule__Options__Group_1_0__2 : rule__Options__Group_1_0__2__Impl rule__Options__Group_1_0__3 ;
    public final void rule__Options__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1390:1: ( rule__Options__Group_1_0__2__Impl rule__Options__Group_1_0__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1391:2: rule__Options__Group_1_0__2__Impl rule__Options__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__2__Impl_in_rule__Options__Group_1_0__22879);
            rule__Options__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_0__3_in_rule__Options__Group_1_0__22882);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1398:1: rule__Options__Group_1_0__2__Impl : ( ':' ) ;
    public final void rule__Options__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1402:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1403:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1403:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1404:1: ':'
            {
             before(grammarAccess.getOptionsAccess().getColonKeyword_1_0_2()); 
            match(input,41,FOLLOW_41_in_rule__Options__Group_1_0__2__Impl2910); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1417:1: rule__Options__Group_1_0__3 : rule__Options__Group_1_0__3__Impl ;
    public final void rule__Options__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1421:1: ( rule__Options__Group_1_0__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1422:2: rule__Options__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__3__Impl_in_rule__Options__Group_1_0__32941);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1428:1: rule__Options__Group_1_0__3__Impl : ( ( rule__Options__SensorLanguageAssignment_1_0_3 ) ) ;
    public final void rule__Options__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1432:1: ( ( ( rule__Options__SensorLanguageAssignment_1_0_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1433:1: ( ( rule__Options__SensorLanguageAssignment_1_0_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1433:1: ( ( rule__Options__SensorLanguageAssignment_1_0_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1434:1: ( rule__Options__SensorLanguageAssignment_1_0_3 )
            {
             before(grammarAccess.getOptionsAccess().getSensorLanguageAssignment_1_0_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1435:1: ( rule__Options__SensorLanguageAssignment_1_0_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1435:2: rule__Options__SensorLanguageAssignment_1_0_3
            {
            pushFollow(FOLLOW_rule__Options__SensorLanguageAssignment_1_0_3_in_rule__Options__Group_1_0__3__Impl2968);
            rule__Options__SensorLanguageAssignment_1_0_3();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getSensorLanguageAssignment_1_0_3()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1453:1: rule__Options__Group_1_1__0 : rule__Options__Group_1_1__0__Impl rule__Options__Group_1_1__1 ;
    public final void rule__Options__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1457:1: ( rule__Options__Group_1_1__0__Impl rule__Options__Group_1_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1458:2: rule__Options__Group_1_1__0__Impl rule__Options__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__0__Impl_in_rule__Options__Group_1_1__03006);
            rule__Options__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_1__1_in_rule__Options__Group_1_1__03009);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1465:1: rule__Options__Group_1_1__0__Impl : ( 'receiver' ) ;
    public final void rule__Options__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1469:1: ( ( 'receiver' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1470:1: ( 'receiver' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1470:1: ( 'receiver' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1471:1: 'receiver'
            {
             before(grammarAccess.getOptionsAccess().getReceiverKeyword_1_1_0()); 
            match(input,42,FOLLOW_42_in_rule__Options__Group_1_1__0__Impl3037); 
             after(grammarAccess.getOptionsAccess().getReceiverKeyword_1_1_0()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1484:1: rule__Options__Group_1_1__1 : rule__Options__Group_1_1__1__Impl rule__Options__Group_1_1__2 ;
    public final void rule__Options__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1488:1: ( rule__Options__Group_1_1__1__Impl rule__Options__Group_1_1__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1489:2: rule__Options__Group_1_1__1__Impl rule__Options__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__1__Impl_in_rule__Options__Group_1_1__13068);
            rule__Options__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_1__2_in_rule__Options__Group_1_1__13071);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1496:1: rule__Options__Group_1_1__1__Impl : ( 'language' ) ;
    public final void rule__Options__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1500:1: ( ( 'language' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1501:1: ( 'language' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1501:1: ( 'language' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1502:1: 'language'
            {
             before(grammarAccess.getOptionsAccess().getLanguageKeyword_1_1_1()); 
            match(input,40,FOLLOW_40_in_rule__Options__Group_1_1__1__Impl3099); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1515:1: rule__Options__Group_1_1__2 : rule__Options__Group_1_1__2__Impl rule__Options__Group_1_1__3 ;
    public final void rule__Options__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1519:1: ( rule__Options__Group_1_1__2__Impl rule__Options__Group_1_1__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1520:2: rule__Options__Group_1_1__2__Impl rule__Options__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__2__Impl_in_rule__Options__Group_1_1__23130);
            rule__Options__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_1__3_in_rule__Options__Group_1_1__23133);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1527:1: rule__Options__Group_1_1__2__Impl : ( ':' ) ;
    public final void rule__Options__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1531:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1532:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1532:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1533:1: ':'
            {
             before(grammarAccess.getOptionsAccess().getColonKeyword_1_1_2()); 
            match(input,41,FOLLOW_41_in_rule__Options__Group_1_1__2__Impl3161); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1546:1: rule__Options__Group_1_1__3 : rule__Options__Group_1_1__3__Impl ;
    public final void rule__Options__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1550:1: ( rule__Options__Group_1_1__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1551:2: rule__Options__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__3__Impl_in_rule__Options__Group_1_1__33192);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1557:1: rule__Options__Group_1_1__3__Impl : ( ( rule__Options__ReceiverLanguageAssignment_1_1_3 ) ) ;
    public final void rule__Options__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1561:1: ( ( ( rule__Options__ReceiverLanguageAssignment_1_1_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1562:1: ( ( rule__Options__ReceiverLanguageAssignment_1_1_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1562:1: ( ( rule__Options__ReceiverLanguageAssignment_1_1_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1563:1: ( rule__Options__ReceiverLanguageAssignment_1_1_3 )
            {
             before(grammarAccess.getOptionsAccess().getReceiverLanguageAssignment_1_1_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1564:1: ( rule__Options__ReceiverLanguageAssignment_1_1_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1564:2: rule__Options__ReceiverLanguageAssignment_1_1_3
            {
            pushFollow(FOLLOW_rule__Options__ReceiverLanguageAssignment_1_1_3_in_rule__Options__Group_1_1__3__Impl3219);
            rule__Options__ReceiverLanguageAssignment_1_1_3();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getReceiverLanguageAssignment_1_1_3()); 

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


    // $ANTLR start "rule__Representation__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1582:1: rule__Representation__Group__0 : rule__Representation__Group__0__Impl rule__Representation__Group__1 ;
    public final void rule__Representation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1586:1: ( rule__Representation__Group__0__Impl rule__Representation__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1587:2: rule__Representation__Group__0__Impl rule__Representation__Group__1
            {
            pushFollow(FOLLOW_rule__Representation__Group__0__Impl_in_rule__Representation__Group__03257);
            rule__Representation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__1_in_rule__Representation__Group__03260);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1594:1: rule__Representation__Group__0__Impl : ( ( rule__Representation__Alternatives_0 ) ) ;
    public final void rule__Representation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1598:1: ( ( ( rule__Representation__Alternatives_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1599:1: ( ( rule__Representation__Alternatives_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1599:1: ( ( rule__Representation__Alternatives_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1600:1: ( rule__Representation__Alternatives_0 )
            {
             before(grammarAccess.getRepresentationAccess().getAlternatives_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1601:1: ( rule__Representation__Alternatives_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1601:2: rule__Representation__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Representation__Alternatives_0_in_rule__Representation__Group__0__Impl3287);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1611:1: rule__Representation__Group__1 : rule__Representation__Group__1__Impl rule__Representation__Group__2 ;
    public final void rule__Representation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1615:1: ( rule__Representation__Group__1__Impl rule__Representation__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1616:2: rule__Representation__Group__1__Impl rule__Representation__Group__2
            {
            pushFollow(FOLLOW_rule__Representation__Group__1__Impl_in_rule__Representation__Group__13317);
            rule__Representation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__2_in_rule__Representation__Group__13320);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1623:1: rule__Representation__Group__1__Impl : ( ( rule__Representation__NameAssignment_1 ) ) ;
    public final void rule__Representation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1627:1: ( ( ( rule__Representation__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1628:1: ( ( rule__Representation__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1628:1: ( ( rule__Representation__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1629:1: ( rule__Representation__NameAssignment_1 )
            {
             before(grammarAccess.getRepresentationAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1630:1: ( rule__Representation__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1630:2: rule__Representation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Representation__NameAssignment_1_in_rule__Representation__Group__1__Impl3347);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1640:1: rule__Representation__Group__2 : rule__Representation__Group__2__Impl rule__Representation__Group__3 ;
    public final void rule__Representation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1644:1: ( rule__Representation__Group__2__Impl rule__Representation__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1645:2: rule__Representation__Group__2__Impl rule__Representation__Group__3
            {
            pushFollow(FOLLOW_rule__Representation__Group__2__Impl_in_rule__Representation__Group__23377);
            rule__Representation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__3_in_rule__Representation__Group__23380);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1652:1: rule__Representation__Group__2__Impl : ( 'is' ) ;
    public final void rule__Representation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1656:1: ( ( 'is' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1657:1: ( 'is' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1657:1: ( 'is' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1658:1: 'is'
            {
             before(grammarAccess.getRepresentationAccess().getIsKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__Representation__Group__2__Impl3408); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1671:1: rule__Representation__Group__3 : rule__Representation__Group__3__Impl rule__Representation__Group__4 ;
    public final void rule__Representation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1675:1: ( rule__Representation__Group__3__Impl rule__Representation__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1676:2: rule__Representation__Group__3__Impl rule__Representation__Group__4
            {
            pushFollow(FOLLOW_rule__Representation__Group__3__Impl_in_rule__Representation__Group__33439);
            rule__Representation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__4_in_rule__Representation__Group__33442);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1683:1: rule__Representation__Group__3__Impl : ( ( rule__Representation__ByteCountAssignment_3 ) ) ;
    public final void rule__Representation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1687:1: ( ( ( rule__Representation__ByteCountAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1688:1: ( ( rule__Representation__ByteCountAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1688:1: ( ( rule__Representation__ByteCountAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1689:1: ( rule__Representation__ByteCountAssignment_3 )
            {
             before(grammarAccess.getRepresentationAccess().getByteCountAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1690:1: ( rule__Representation__ByteCountAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1690:2: rule__Representation__ByteCountAssignment_3
            {
            pushFollow(FOLLOW_rule__Representation__ByteCountAssignment_3_in_rule__Representation__Group__3__Impl3469);
            rule__Representation__ByteCountAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRepresentationAccess().getByteCountAssignment_3()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1700:1: rule__Representation__Group__4 : rule__Representation__Group__4__Impl rule__Representation__Group__5 ;
    public final void rule__Representation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1704:1: ( rule__Representation__Group__4__Impl rule__Representation__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1705:2: rule__Representation__Group__4__Impl rule__Representation__Group__5
            {
            pushFollow(FOLLOW_rule__Representation__Group__4__Impl_in_rule__Representation__Group__43499);
            rule__Representation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__5_in_rule__Representation__Group__43502);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1712:1: rule__Representation__Group__4__Impl : ( ( rule__Representation__Alternatives_4 ) ) ;
    public final void rule__Representation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1716:1: ( ( ( rule__Representation__Alternatives_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1717:1: ( ( rule__Representation__Alternatives_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1717:1: ( ( rule__Representation__Alternatives_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1718:1: ( rule__Representation__Alternatives_4 )
            {
             before(grammarAccess.getRepresentationAccess().getAlternatives_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1719:1: ( rule__Representation__Alternatives_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1719:2: rule__Representation__Alternatives_4
            {
            pushFollow(FOLLOW_rule__Representation__Alternatives_4_in_rule__Representation__Group__4__Impl3529);
            rule__Representation__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getRepresentationAccess().getAlternatives_4()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1729:1: rule__Representation__Group__5 : rule__Representation__Group__5__Impl rule__Representation__Group__6 ;
    public final void rule__Representation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1733:1: ( rule__Representation__Group__5__Impl rule__Representation__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1734:2: rule__Representation__Group__5__Impl rule__Representation__Group__6
            {
            pushFollow(FOLLOW_rule__Representation__Group__5__Impl_in_rule__Representation__Group__53559);
            rule__Representation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__6_in_rule__Representation__Group__53562);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1741:1: rule__Representation__Group__5__Impl : ( 'in' ) ;
    public final void rule__Representation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1745:1: ( ( 'in' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1746:1: ( 'in' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1746:1: ( 'in' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1747:1: 'in'
            {
             before(grammarAccess.getRepresentationAccess().getInKeyword_5()); 
            match(input,44,FOLLOW_44_in_rule__Representation__Group__5__Impl3590); 
             after(grammarAccess.getRepresentationAccess().getInKeyword_5()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1760:1: rule__Representation__Group__6 : rule__Representation__Group__6__Impl ;
    public final void rule__Representation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1764:1: ( rule__Representation__Group__6__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1765:2: rule__Representation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Representation__Group__6__Impl_in_rule__Representation__Group__63621);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1771:1: rule__Representation__Group__6__Impl : ( ( rule__Representation__TypeAssignment_6 ) ) ;
    public final void rule__Representation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1775:1: ( ( ( rule__Representation__TypeAssignment_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1776:1: ( ( rule__Representation__TypeAssignment_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1776:1: ( ( rule__Representation__TypeAssignment_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1777:1: ( rule__Representation__TypeAssignment_6 )
            {
             before(grammarAccess.getRepresentationAccess().getTypeAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1778:1: ( rule__Representation__TypeAssignment_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1778:2: rule__Representation__TypeAssignment_6
            {
            pushFollow(FOLLOW_rule__Representation__TypeAssignment_6_in_rule__Representation__Group__6__Impl3648);
            rule__Representation__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRepresentationAccess().getTypeAssignment_6()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1802:1: rule__Calculated__Group__0 : rule__Calculated__Group__0__Impl rule__Calculated__Group__1 ;
    public final void rule__Calculated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1806:1: ( rule__Calculated__Group__0__Impl rule__Calculated__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1807:2: rule__Calculated__Group__0__Impl rule__Calculated__Group__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group__0__Impl_in_rule__Calculated__Group__03692);
            rule__Calculated__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__1_in_rule__Calculated__Group__03695);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1814:1: rule__Calculated__Group__0__Impl : ( ( rule__Calculated__Alternatives_0 ) ) ;
    public final void rule__Calculated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1818:1: ( ( ( rule__Calculated__Alternatives_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1819:1: ( ( rule__Calculated__Alternatives_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1819:1: ( ( rule__Calculated__Alternatives_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1820:1: ( rule__Calculated__Alternatives_0 )
            {
             before(grammarAccess.getCalculatedAccess().getAlternatives_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1821:1: ( rule__Calculated__Alternatives_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1821:2: rule__Calculated__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Calculated__Alternatives_0_in_rule__Calculated__Group__0__Impl3722);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1831:1: rule__Calculated__Group__1 : rule__Calculated__Group__1__Impl rule__Calculated__Group__2 ;
    public final void rule__Calculated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1835:1: ( rule__Calculated__Group__1__Impl rule__Calculated__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1836:2: rule__Calculated__Group__1__Impl rule__Calculated__Group__2
            {
            pushFollow(FOLLOW_rule__Calculated__Group__1__Impl_in_rule__Calculated__Group__13752);
            rule__Calculated__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__2_in_rule__Calculated__Group__13755);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1843:1: rule__Calculated__Group__1__Impl : ( ( rule__Calculated__NameAssignment_1 ) ) ;
    public final void rule__Calculated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1847:1: ( ( ( rule__Calculated__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1848:1: ( ( rule__Calculated__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1848:1: ( ( rule__Calculated__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1849:1: ( rule__Calculated__NameAssignment_1 )
            {
             before(grammarAccess.getCalculatedAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1850:1: ( rule__Calculated__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1850:2: rule__Calculated__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Calculated__NameAssignment_1_in_rule__Calculated__Group__1__Impl3782);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1860:1: rule__Calculated__Group__2 : rule__Calculated__Group__2__Impl rule__Calculated__Group__3 ;
    public final void rule__Calculated__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1864:1: ( rule__Calculated__Group__2__Impl rule__Calculated__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1865:2: rule__Calculated__Group__2__Impl rule__Calculated__Group__3
            {
            pushFollow(FOLLOW_rule__Calculated__Group__2__Impl_in_rule__Calculated__Group__23812);
            rule__Calculated__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__3_in_rule__Calculated__Group__23815);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1872:1: rule__Calculated__Group__2__Impl : ( 'as' ) ;
    public final void rule__Calculated__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1876:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1877:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1877:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1878:1: 'as'
            {
             before(grammarAccess.getCalculatedAccess().getAsKeyword_2()); 
            match(input,45,FOLLOW_45_in_rule__Calculated__Group__2__Impl3843); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1891:1: rule__Calculated__Group__3 : rule__Calculated__Group__3__Impl rule__Calculated__Group__4 ;
    public final void rule__Calculated__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1895:1: ( rule__Calculated__Group__3__Impl rule__Calculated__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1896:2: rule__Calculated__Group__3__Impl rule__Calculated__Group__4
            {
            pushFollow(FOLLOW_rule__Calculated__Group__3__Impl_in_rule__Calculated__Group__33874);
            rule__Calculated__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__4_in_rule__Calculated__Group__33877);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1903:1: rule__Calculated__Group__3__Impl : ( ( rule__Calculated__RepresentationAssignment_3 ) ) ;
    public final void rule__Calculated__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1907:1: ( ( ( rule__Calculated__RepresentationAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1908:1: ( ( rule__Calculated__RepresentationAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1908:1: ( ( rule__Calculated__RepresentationAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1909:1: ( rule__Calculated__RepresentationAssignment_3 )
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1910:1: ( rule__Calculated__RepresentationAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1910:2: rule__Calculated__RepresentationAssignment_3
            {
            pushFollow(FOLLOW_rule__Calculated__RepresentationAssignment_3_in_rule__Calculated__Group__3__Impl3904);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1920:1: rule__Calculated__Group__4 : rule__Calculated__Group__4__Impl rule__Calculated__Group__5 ;
    public final void rule__Calculated__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1924:1: ( rule__Calculated__Group__4__Impl rule__Calculated__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1925:2: rule__Calculated__Group__4__Impl rule__Calculated__Group__5
            {
            pushFollow(FOLLOW_rule__Calculated__Group__4__Impl_in_rule__Calculated__Group__43934);
            rule__Calculated__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__5_in_rule__Calculated__Group__43937);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1932:1: rule__Calculated__Group__4__Impl : ( 'by' ) ;
    public final void rule__Calculated__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1936:1: ( ( 'by' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1937:1: ( 'by' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1937:1: ( 'by' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1938:1: 'by'
            {
             before(grammarAccess.getCalculatedAccess().getByKeyword_4()); 
            match(input,46,FOLLOW_46_in_rule__Calculated__Group__4__Impl3965); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1951:1: rule__Calculated__Group__5 : rule__Calculated__Group__5__Impl rule__Calculated__Group__6 ;
    public final void rule__Calculated__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1955:1: ( rule__Calculated__Group__5__Impl rule__Calculated__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1956:2: rule__Calculated__Group__5__Impl rule__Calculated__Group__6
            {
            pushFollow(FOLLOW_rule__Calculated__Group__5__Impl_in_rule__Calculated__Group__53996);
            rule__Calculated__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__6_in_rule__Calculated__Group__53999);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1963:1: rule__Calculated__Group__5__Impl : ( ( rule__Calculated__MethodNameAssignment_5 ) ) ;
    public final void rule__Calculated__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1967:1: ( ( ( rule__Calculated__MethodNameAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1968:1: ( ( rule__Calculated__MethodNameAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1968:1: ( ( rule__Calculated__MethodNameAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1969:1: ( rule__Calculated__MethodNameAssignment_5 )
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1970:1: ( rule__Calculated__MethodNameAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1970:2: rule__Calculated__MethodNameAssignment_5
            {
            pushFollow(FOLLOW_rule__Calculated__MethodNameAssignment_5_in_rule__Calculated__Group__5__Impl4026);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1980:1: rule__Calculated__Group__6 : rule__Calculated__Group__6__Impl rule__Calculated__Group__7 ;
    public final void rule__Calculated__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1984:1: ( rule__Calculated__Group__6__Impl rule__Calculated__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1985:2: rule__Calculated__Group__6__Impl rule__Calculated__Group__7
            {
            pushFollow(FOLLOW_rule__Calculated__Group__6__Impl_in_rule__Calculated__Group__64056);
            rule__Calculated__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__7_in_rule__Calculated__Group__64059);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1992:1: rule__Calculated__Group__6__Impl : ( ( rule__Calculated__Group_6__0 )? ) ;
    public final void rule__Calculated__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1996:1: ( ( ( rule__Calculated__Group_6__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1997:1: ( ( rule__Calculated__Group_6__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1997:1: ( ( rule__Calculated__Group_6__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1998:1: ( rule__Calculated__Group_6__0 )?
            {
             before(grammarAccess.getCalculatedAccess().getGroup_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1999:1: ( rule__Calculated__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1999:2: rule__Calculated__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Calculated__Group_6__0_in_rule__Calculated__Group__6__Impl4086);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2009:1: rule__Calculated__Group__7 : rule__Calculated__Group__7__Impl rule__Calculated__Group__8 ;
    public final void rule__Calculated__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2013:1: ( rule__Calculated__Group__7__Impl rule__Calculated__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2014:2: rule__Calculated__Group__7__Impl rule__Calculated__Group__8
            {
            pushFollow(FOLLOW_rule__Calculated__Group__7__Impl_in_rule__Calculated__Group__74117);
            rule__Calculated__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__8_in_rule__Calculated__Group__74120);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2021:1: rule__Calculated__Group__7__Impl : ( 'with' ) ;
    public final void rule__Calculated__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2025:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2026:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2026:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2027:1: 'with'
            {
             before(grammarAccess.getCalculatedAccess().getWithKeyword_7()); 
            match(input,47,FOLLOW_47_in_rule__Calculated__Group__7__Impl4148); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2040:1: rule__Calculated__Group__8 : rule__Calculated__Group__8__Impl rule__Calculated__Group__9 ;
    public final void rule__Calculated__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2044:1: ( rule__Calculated__Group__8__Impl rule__Calculated__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2045:2: rule__Calculated__Group__8__Impl rule__Calculated__Group__9
            {
            pushFollow(FOLLOW_rule__Calculated__Group__8__Impl_in_rule__Calculated__Group__84179);
            rule__Calculated__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__9_in_rule__Calculated__Group__84182);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2052:1: rule__Calculated__Group__8__Impl : ( ( rule__Calculated__ParameterAssignment_8 ) ) ;
    public final void rule__Calculated__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2056:1: ( ( ( rule__Calculated__ParameterAssignment_8 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2057:1: ( ( rule__Calculated__ParameterAssignment_8 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2057:1: ( ( rule__Calculated__ParameterAssignment_8 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2058:1: ( rule__Calculated__ParameterAssignment_8 )
            {
             before(grammarAccess.getCalculatedAccess().getParameterAssignment_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2059:1: ( rule__Calculated__ParameterAssignment_8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2059:2: rule__Calculated__ParameterAssignment_8
            {
            pushFollow(FOLLOW_rule__Calculated__ParameterAssignment_8_in_rule__Calculated__Group__8__Impl4209);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2069:1: rule__Calculated__Group__9 : rule__Calculated__Group__9__Impl ;
    public final void rule__Calculated__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2073:1: ( rule__Calculated__Group__9__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2074:2: rule__Calculated__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group__9__Impl_in_rule__Calculated__Group__94239);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2080:1: rule__Calculated__Group__9__Impl : ( ( rule__Calculated__Group_9__0 )* ) ;
    public final void rule__Calculated__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2084:1: ( ( ( rule__Calculated__Group_9__0 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2085:1: ( ( rule__Calculated__Group_9__0 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2085:1: ( ( rule__Calculated__Group_9__0 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2086:1: ( rule__Calculated__Group_9__0 )*
            {
             before(grammarAccess.getCalculatedAccess().getGroup_9()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2087:1: ( rule__Calculated__Group_9__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2087:2: rule__Calculated__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Calculated__Group_9__0_in_rule__Calculated__Group__9__Impl4266);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2117:1: rule__Calculated__Group_6__0 : rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1 ;
    public final void rule__Calculated__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2121:1: ( rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2122:2: rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group_6__0__Impl_in_rule__Calculated__Group_6__04317);
            rule__Calculated__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group_6__1_in_rule__Calculated__Group_6__04320);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2129:1: rule__Calculated__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Calculated__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2133:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2134:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2134:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2135:1: ','
            {
             before(grammarAccess.getCalculatedAccess().getCommaKeyword_6_0()); 
            match(input,38,FOLLOW_38_in_rule__Calculated__Group_6__0__Impl4348); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2148:1: rule__Calculated__Group_6__1 : rule__Calculated__Group_6__1__Impl ;
    public final void rule__Calculated__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2152:1: ( rule__Calculated__Group_6__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2153:2: rule__Calculated__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group_6__1__Impl_in_rule__Calculated__Group_6__14379);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2159:1: rule__Calculated__Group_6__1__Impl : ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) ) ;
    public final void rule__Calculated__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2163:1: ( ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2164:1: ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2164:1: ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2165:1: ( rule__Calculated__MethodNameOutAssignment_6_1 )
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameOutAssignment_6_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2166:1: ( rule__Calculated__MethodNameOutAssignment_6_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2166:2: rule__Calculated__MethodNameOutAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Calculated__MethodNameOutAssignment_6_1_in_rule__Calculated__Group_6__1__Impl4406);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2180:1: rule__Calculated__Group_9__0 : rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1 ;
    public final void rule__Calculated__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2184:1: ( rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2185:2: rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group_9__0__Impl_in_rule__Calculated__Group_9__04440);
            rule__Calculated__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group_9__1_in_rule__Calculated__Group_9__04443);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2192:1: rule__Calculated__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Calculated__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2196:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2197:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2197:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2198:1: ','
            {
             before(grammarAccess.getCalculatedAccess().getCommaKeyword_9_0()); 
            match(input,38,FOLLOW_38_in_rule__Calculated__Group_9__0__Impl4471); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2211:1: rule__Calculated__Group_9__1 : rule__Calculated__Group_9__1__Impl ;
    public final void rule__Calculated__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2215:1: ( rule__Calculated__Group_9__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2216:2: rule__Calculated__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group_9__1__Impl_in_rule__Calculated__Group_9__14502);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2222:1: rule__Calculated__Group_9__1__Impl : ( ( rule__Calculated__ParameterAssignment_9_1 ) ) ;
    public final void rule__Calculated__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2226:1: ( ( ( rule__Calculated__ParameterAssignment_9_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2227:1: ( ( rule__Calculated__ParameterAssignment_9_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2227:1: ( ( rule__Calculated__ParameterAssignment_9_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2228:1: ( rule__Calculated__ParameterAssignment_9_1 )
            {
             before(grammarAccess.getCalculatedAccess().getParameterAssignment_9_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2229:1: ( rule__Calculated__ParameterAssignment_9_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2229:2: rule__Calculated__ParameterAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Calculated__ParameterAssignment_9_1_in_rule__Calculated__Group_9__1__Impl4529);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2243:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2247:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2248:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04563);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04566);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2255:1: rule__Parameter__Group__0__Impl : ( '(' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2259:1: ( ( '(' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2260:1: ( '(' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2260:1: ( '(' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2261:1: '('
            {
             before(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__Parameter__Group__0__Impl4594); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2274:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2278:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2279:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14625);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14628);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2286:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__DatafieldAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2290:1: ( ( ( rule__Parameter__DatafieldAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2291:1: ( ( rule__Parameter__DatafieldAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2291:1: ( ( rule__Parameter__DatafieldAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2292:1: ( rule__Parameter__DatafieldAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getDatafieldAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2293:1: ( rule__Parameter__DatafieldAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2293:2: rule__Parameter__DatafieldAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__DatafieldAssignment_1_in_rule__Parameter__Group__1__Impl4655);
            rule__Parameter__DatafieldAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getDatafieldAssignment_1()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2303:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2307:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2308:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24685);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__24688);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2315:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2319:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2320:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2320:1: ( ( rule__Parameter__Group_2__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2321:1: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2322:1: ( rule__Parameter__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2322:2: rule__Parameter__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl4715);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2332:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2336:1: ( rule__Parameter__Group__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2337:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__34746);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2343:1: rule__Parameter__Group__3__Impl : ( ')' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2347:1: ( ( ')' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2348:1: ( ')' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2348:1: ( ')' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2349:1: ')'
            {
             before(grammarAccess.getParameterAccess().getRightParenthesisKeyword_3()); 
            match(input,49,FOLLOW_49_in_rule__Parameter__Group__3__Impl4774); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2370:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2374:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2375:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__04813);
            rule__Parameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__04816);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2382:1: rule__Parameter__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2386:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2387:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2387:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2388:1: 'as'
            {
             before(grammarAccess.getParameterAccess().getAsKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__Parameter__Group_2__0__Impl4844); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2401:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2405:1: ( rule__Parameter__Group_2__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2406:2: rule__Parameter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__14875);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2412:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2416:1: ( ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2417:1: ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2417:1: ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2418:1: ( rule__Parameter__ArgumentTypeAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getArgumentTypeAssignment_2_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2419:1: ( rule__Parameter__ArgumentTypeAssignment_2_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2419:2: rule__Parameter__ArgumentTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Parameter__ArgumentTypeAssignment_2_1_in_rule__Parameter__Group_2__1__Impl4902);
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


    // $ANTLR start "rule__Datastructure__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2433:1: rule__Datastructure__Group__0 : rule__Datastructure__Group__0__Impl rule__Datastructure__Group__1 ;
    public final void rule__Datastructure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2437:1: ( rule__Datastructure__Group__0__Impl rule__Datastructure__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2438:2: rule__Datastructure__Group__0__Impl rule__Datastructure__Group__1
            {
            pushFollow(FOLLOW_rule__Datastructure__Group__0__Impl_in_rule__Datastructure__Group__04936);
            rule__Datastructure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datastructure__Group__1_in_rule__Datastructure__Group__04939);
            rule__Datastructure__Group__1();

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
    // $ANTLR end "rule__Datastructure__Group__0"


    // $ANTLR start "rule__Datastructure__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2445:1: rule__Datastructure__Group__0__Impl : ( 'structure' ) ;
    public final void rule__Datastructure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2449:1: ( ( 'structure' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2450:1: ( 'structure' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2450:1: ( 'structure' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2451:1: 'structure'
            {
             before(grammarAccess.getDatastructureAccess().getStructureKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__Datastructure__Group__0__Impl4967); 
             after(grammarAccess.getDatastructureAccess().getStructureKeyword_0()); 

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
    // $ANTLR end "rule__Datastructure__Group__0__Impl"


    // $ANTLR start "rule__Datastructure__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2464:1: rule__Datastructure__Group__1 : rule__Datastructure__Group__1__Impl rule__Datastructure__Group__2 ;
    public final void rule__Datastructure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2468:1: ( rule__Datastructure__Group__1__Impl rule__Datastructure__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2469:2: rule__Datastructure__Group__1__Impl rule__Datastructure__Group__2
            {
            pushFollow(FOLLOW_rule__Datastructure__Group__1__Impl_in_rule__Datastructure__Group__14998);
            rule__Datastructure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datastructure__Group__2_in_rule__Datastructure__Group__15001);
            rule__Datastructure__Group__2();

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
    // $ANTLR end "rule__Datastructure__Group__1"


    // $ANTLR start "rule__Datastructure__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2476:1: rule__Datastructure__Group__1__Impl : ( ( rule__Datastructure__NameAssignment_1 ) ) ;
    public final void rule__Datastructure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2480:1: ( ( ( rule__Datastructure__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2481:1: ( ( rule__Datastructure__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2481:1: ( ( rule__Datastructure__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2482:1: ( rule__Datastructure__NameAssignment_1 )
            {
             before(grammarAccess.getDatastructureAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2483:1: ( rule__Datastructure__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2483:2: rule__Datastructure__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Datastructure__NameAssignment_1_in_rule__Datastructure__Group__1__Impl5028);
            rule__Datastructure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatastructureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Datastructure__Group__1__Impl"


    // $ANTLR start "rule__Datastructure__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2493:1: rule__Datastructure__Group__2 : rule__Datastructure__Group__2__Impl rule__Datastructure__Group__3 ;
    public final void rule__Datastructure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2497:1: ( rule__Datastructure__Group__2__Impl rule__Datastructure__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2498:2: rule__Datastructure__Group__2__Impl rule__Datastructure__Group__3
            {
            pushFollow(FOLLOW_rule__Datastructure__Group__2__Impl_in_rule__Datastructure__Group__25058);
            rule__Datastructure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datastructure__Group__3_in_rule__Datastructure__Group__25061);
            rule__Datastructure__Group__3();

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
    // $ANTLR end "rule__Datastructure__Group__2"


    // $ANTLR start "rule__Datastructure__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2505:1: rule__Datastructure__Group__2__Impl : ( '{' ) ;
    public final void rule__Datastructure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2509:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2510:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2510:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2511:1: '{'
            {
             before(grammarAccess.getDatastructureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Datastructure__Group__2__Impl5089); 
             after(grammarAccess.getDatastructureAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Datastructure__Group__2__Impl"


    // $ANTLR start "rule__Datastructure__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2524:1: rule__Datastructure__Group__3 : rule__Datastructure__Group__3__Impl rule__Datastructure__Group__4 ;
    public final void rule__Datastructure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2528:1: ( rule__Datastructure__Group__3__Impl rule__Datastructure__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2529:2: rule__Datastructure__Group__3__Impl rule__Datastructure__Group__4
            {
            pushFollow(FOLLOW_rule__Datastructure__Group__3__Impl_in_rule__Datastructure__Group__35120);
            rule__Datastructure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datastructure__Group__4_in_rule__Datastructure__Group__35123);
            rule__Datastructure__Group__4();

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
    // $ANTLR end "rule__Datastructure__Group__3"


    // $ANTLR start "rule__Datastructure__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2536:1: rule__Datastructure__Group__3__Impl : ( ( rule__Datastructure__DatafieldsAssignment_3 )* ) ;
    public final void rule__Datastructure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2540:1: ( ( ( rule__Datastructure__DatafieldsAssignment_3 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2541:1: ( ( rule__Datastructure__DatafieldsAssignment_3 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2541:1: ( ( rule__Datastructure__DatafieldsAssignment_3 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2542:1: ( rule__Datastructure__DatafieldsAssignment_3 )*
            {
             before(grammarAccess.getDatastructureAccess().getDatafieldsAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2543:1: ( rule__Datastructure__DatafieldsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=16 && LA17_0<=17)||(LA17_0>=50 && LA17_0<=51)||LA17_0==60) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2543:2: rule__Datastructure__DatafieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Datastructure__DatafieldsAssignment_3_in_rule__Datastructure__Group__3__Impl5150);
            	    rule__Datastructure__DatafieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDatastructureAccess().getDatafieldsAssignment_3()); 

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
    // $ANTLR end "rule__Datastructure__Group__3__Impl"


    // $ANTLR start "rule__Datastructure__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2553:1: rule__Datastructure__Group__4 : rule__Datastructure__Group__4__Impl ;
    public final void rule__Datastructure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2557:1: ( rule__Datastructure__Group__4__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2558:2: rule__Datastructure__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Datastructure__Group__4__Impl_in_rule__Datastructure__Group__45181);
            rule__Datastructure__Group__4__Impl();

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
    // $ANTLR end "rule__Datastructure__Group__4"


    // $ANTLR start "rule__Datastructure__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2564:1: rule__Datastructure__Group__4__Impl : ( '}' ) ;
    public final void rule__Datastructure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2568:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2569:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2569:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2570:1: '}'
            {
             before(grammarAccess.getDatastructureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__Datastructure__Group__4__Impl5209); 
             after(grammarAccess.getDatastructureAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Datastructure__Group__4__Impl"


    // $ANTLR start "rule__Data__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2593:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2597:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2598:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_rule__Data__Group__0__Impl_in_rule__Data__Group__05250);
            rule__Data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Data__Group__1_in_rule__Data__Group__05253);
            rule__Data__Group__1();

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
    // $ANTLR end "rule__Data__Group__0"


    // $ANTLR start "rule__Data__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2605:1: rule__Data__Group__0__Impl : ( 'data' ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2609:1: ( ( 'data' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2610:1: ( 'data' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2610:1: ( 'data' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2611:1: 'data'
            {
             before(grammarAccess.getDataAccess().getDataKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__Data__Group__0__Impl5281); 
             after(grammarAccess.getDataAccess().getDataKeyword_0()); 

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
    // $ANTLR end "rule__Data__Group__0__Impl"


    // $ANTLR start "rule__Data__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2624:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2628:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2629:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_rule__Data__Group__1__Impl_in_rule__Data__Group__15312);
            rule__Data__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Data__Group__2_in_rule__Data__Group__15315);
            rule__Data__Group__2();

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
    // $ANTLR end "rule__Data__Group__1"


    // $ANTLR start "rule__Data__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2636:1: rule__Data__Group__1__Impl : ( 'of' ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2640:1: ( ( 'of' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2641:1: ( 'of' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2641:1: ( 'of' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2642:1: 'of'
            {
             before(grammarAccess.getDataAccess().getOfKeyword_1()); 
            match(input,52,FOLLOW_52_in_rule__Data__Group__1__Impl5343); 
             after(grammarAccess.getDataAccess().getOfKeyword_1()); 

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
    // $ANTLR end "rule__Data__Group__1__Impl"


    // $ANTLR start "rule__Data__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2655:1: rule__Data__Group__2 : rule__Data__Group__2__Impl rule__Data__Group__3 ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2659:1: ( rule__Data__Group__2__Impl rule__Data__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2660:2: rule__Data__Group__2__Impl rule__Data__Group__3
            {
            pushFollow(FOLLOW_rule__Data__Group__2__Impl_in_rule__Data__Group__25374);
            rule__Data__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Data__Group__3_in_rule__Data__Group__25377);
            rule__Data__Group__3();

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
    // $ANTLR end "rule__Data__Group__2"


    // $ANTLR start "rule__Data__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2667:1: rule__Data__Group__2__Impl : ( ( rule__Data__NameAssignment_2 ) ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2671:1: ( ( ( rule__Data__NameAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2672:1: ( ( rule__Data__NameAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2672:1: ( ( rule__Data__NameAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2673:1: ( rule__Data__NameAssignment_2 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2674:1: ( rule__Data__NameAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2674:2: rule__Data__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Data__NameAssignment_2_in_rule__Data__Group__2__Impl5404);
            rule__Data__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Data__Group__2__Impl"


    // $ANTLR start "rule__Data__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2684:1: rule__Data__Group__3 : rule__Data__Group__3__Impl rule__Data__Group__4 ;
    public final void rule__Data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2688:1: ( rule__Data__Group__3__Impl rule__Data__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2689:2: rule__Data__Group__3__Impl rule__Data__Group__4
            {
            pushFollow(FOLLOW_rule__Data__Group__3__Impl_in_rule__Data__Group__35434);
            rule__Data__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Data__Group__4_in_rule__Data__Group__35437);
            rule__Data__Group__4();

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
    // $ANTLR end "rule__Data__Group__3"


    // $ANTLR start "rule__Data__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2696:1: rule__Data__Group__3__Impl : ( ( rule__Data__Group_3__0 )? ) ;
    public final void rule__Data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2700:1: ( ( ( rule__Data__Group_3__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2701:1: ( ( rule__Data__Group_3__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2701:1: ( ( rule__Data__Group_3__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2702:1: ( rule__Data__Group_3__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2703:1: ( rule__Data__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2703:2: rule__Data__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Data__Group_3__0_in_rule__Data__Group__3__Impl5464);
                    rule__Data__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Data__Group__3__Impl"


    // $ANTLR start "rule__Data__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2713:1: rule__Data__Group__4 : rule__Data__Group__4__Impl rule__Data__Group__5 ;
    public final void rule__Data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2717:1: ( rule__Data__Group__4__Impl rule__Data__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2718:2: rule__Data__Group__4__Impl rule__Data__Group__5
            {
            pushFollow(FOLLOW_rule__Data__Group__4__Impl_in_rule__Data__Group__45495);
            rule__Data__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Data__Group__5_in_rule__Data__Group__45498);
            rule__Data__Group__5();

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
    // $ANTLR end "rule__Data__Group__4"


    // $ANTLR start "rule__Data__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2725:1: rule__Data__Group__4__Impl : ( 'as' ) ;
    public final void rule__Data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2729:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2730:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2730:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2731:1: 'as'
            {
             before(grammarAccess.getDataAccess().getAsKeyword_4()); 
            match(input,45,FOLLOW_45_in_rule__Data__Group__4__Impl5526); 
             after(grammarAccess.getDataAccess().getAsKeyword_4()); 

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
    // $ANTLR end "rule__Data__Group__4__Impl"


    // $ANTLR start "rule__Data__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2744:1: rule__Data__Group__5 : rule__Data__Group__5__Impl rule__Data__Group__6 ;
    public final void rule__Data__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2748:1: ( rule__Data__Group__5__Impl rule__Data__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2749:2: rule__Data__Group__5__Impl rule__Data__Group__6
            {
            pushFollow(FOLLOW_rule__Data__Group__5__Impl_in_rule__Data__Group__55557);
            rule__Data__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Data__Group__6_in_rule__Data__Group__55560);
            rule__Data__Group__6();

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
    // $ANTLR end "rule__Data__Group__5"


    // $ANTLR start "rule__Data__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2756:1: rule__Data__Group__5__Impl : ( ( rule__Data__RepresentationAssignment_5 ) ) ;
    public final void rule__Data__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2760:1: ( ( ( rule__Data__RepresentationAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2761:1: ( ( rule__Data__RepresentationAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2761:1: ( ( rule__Data__RepresentationAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2762:1: ( rule__Data__RepresentationAssignment_5 )
            {
             before(grammarAccess.getDataAccess().getRepresentationAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2763:1: ( rule__Data__RepresentationAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2763:2: rule__Data__RepresentationAssignment_5
            {
            pushFollow(FOLLOW_rule__Data__RepresentationAssignment_5_in_rule__Data__Group__5__Impl5587);
            rule__Data__RepresentationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getRepresentationAssignment_5()); 

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
    // $ANTLR end "rule__Data__Group__5__Impl"


    // $ANTLR start "rule__Data__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2773:1: rule__Data__Group__6 : rule__Data__Group__6__Impl rule__Data__Group__7 ;
    public final void rule__Data__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2777:1: ( rule__Data__Group__6__Impl rule__Data__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2778:2: rule__Data__Group__6__Impl rule__Data__Group__7
            {
            pushFollow(FOLLOW_rule__Data__Group__6__Impl_in_rule__Data__Group__65617);
            rule__Data__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Data__Group__7_in_rule__Data__Group__65620);
            rule__Data__Group__7();

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
    // $ANTLR end "rule__Data__Group__6"


    // $ANTLR start "rule__Data__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2785:1: rule__Data__Group__6__Impl : ( ( rule__Data__Group_6__0 )? ) ;
    public final void rule__Data__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2789:1: ( ( ( rule__Data__Group_6__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2790:1: ( ( rule__Data__Group_6__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2790:1: ( ( rule__Data__Group_6__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2791:1: ( rule__Data__Group_6__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2792:1: ( rule__Data__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==53) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2792:2: rule__Data__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Data__Group_6__0_in_rule__Data__Group__6__Impl5647);
                    rule__Data__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Data__Group__6__Impl"


    // $ANTLR start "rule__Data__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2802:1: rule__Data__Group__7 : rule__Data__Group__7__Impl ;
    public final void rule__Data__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2806:1: ( rule__Data__Group__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2807:2: rule__Data__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group__7__Impl_in_rule__Data__Group__75678);
            rule__Data__Group__7__Impl();

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
    // $ANTLR end "rule__Data__Group__7"


    // $ANTLR start "rule__Data__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2813:1: rule__Data__Group__7__Impl : ( ( rule__Data__ConstraintsAssignment_7 )* ) ;
    public final void rule__Data__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2817:1: ( ( ( rule__Data__ConstraintsAssignment_7 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2818:1: ( ( rule__Data__ConstraintsAssignment_7 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2818:1: ( ( rule__Data__ConstraintsAssignment_7 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2819:1: ( rule__Data__ConstraintsAssignment_7 )*
            {
             before(grammarAccess.getDataAccess().getConstraintsAssignment_7()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2820:1: ( rule__Data__ConstraintsAssignment_7 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==47||LA20_0==55) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2820:2: rule__Data__ConstraintsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Data__ConstraintsAssignment_7_in_rule__Data__Group__7__Impl5705);
            	    rule__Data__ConstraintsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getDataAccess().getConstraintsAssignment_7()); 

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
    // $ANTLR end "rule__Data__Group__7__Impl"


    // $ANTLR start "rule__Data__Group_3__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2846:1: rule__Data__Group_3__0 : rule__Data__Group_3__0__Impl rule__Data__Group_3__1 ;
    public final void rule__Data__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2850:1: ( rule__Data__Group_3__0__Impl rule__Data__Group_3__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2851:2: rule__Data__Group_3__0__Impl rule__Data__Group_3__1
            {
            pushFollow(FOLLOW_rule__Data__Group_3__0__Impl_in_rule__Data__Group_3__05752);
            rule__Data__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Data__Group_3__1_in_rule__Data__Group_3__05755);
            rule__Data__Group_3__1();

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
    // $ANTLR end "rule__Data__Group_3__0"


    // $ANTLR start "rule__Data__Group_3__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2858:1: rule__Data__Group_3__0__Impl : ( 'in' ) ;
    public final void rule__Data__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2862:1: ( ( 'in' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2863:1: ( 'in' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2863:1: ( 'in' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2864:1: 'in'
            {
             before(grammarAccess.getDataAccess().getInKeyword_3_0()); 
            match(input,44,FOLLOW_44_in_rule__Data__Group_3__0__Impl5783); 
             after(grammarAccess.getDataAccess().getInKeyword_3_0()); 

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
    // $ANTLR end "rule__Data__Group_3__0__Impl"


    // $ANTLR start "rule__Data__Group_3__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2877:1: rule__Data__Group_3__1 : rule__Data__Group_3__1__Impl rule__Data__Group_3__2 ;
    public final void rule__Data__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2881:1: ( rule__Data__Group_3__1__Impl rule__Data__Group_3__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2882:2: rule__Data__Group_3__1__Impl rule__Data__Group_3__2
            {
            pushFollow(FOLLOW_rule__Data__Group_3__1__Impl_in_rule__Data__Group_3__15814);
            rule__Data__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Data__Group_3__2_in_rule__Data__Group_3__15817);
            rule__Data__Group_3__2();

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
    // $ANTLR end "rule__Data__Group_3__1"


    // $ANTLR start "rule__Data__Group_3__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2889:1: rule__Data__Group_3__1__Impl : ( ( rule__Data__ScaleAssignment_3_1 )? ) ;
    public final void rule__Data__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2893:1: ( ( ( rule__Data__ScaleAssignment_3_1 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2894:1: ( ( rule__Data__ScaleAssignment_3_1 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2894:1: ( ( rule__Data__ScaleAssignment_3_1 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2895:1: ( rule__Data__ScaleAssignment_3_1 )?
            {
             before(grammarAccess.getDataAccess().getScaleAssignment_3_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2896:1: ( rule__Data__ScaleAssignment_3_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2896:2: rule__Data__ScaleAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Data__ScaleAssignment_3_1_in_rule__Data__Group_3__1__Impl5844);
                    rule__Data__ScaleAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getScaleAssignment_3_1()); 

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
    // $ANTLR end "rule__Data__Group_3__1__Impl"


    // $ANTLR start "rule__Data__Group_3__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2906:1: rule__Data__Group_3__2 : rule__Data__Group_3__2__Impl ;
    public final void rule__Data__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2910:1: ( rule__Data__Group_3__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2911:2: rule__Data__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group_3__2__Impl_in_rule__Data__Group_3__25875);
            rule__Data__Group_3__2__Impl();

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
    // $ANTLR end "rule__Data__Group_3__2"


    // $ANTLR start "rule__Data__Group_3__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2917:1: rule__Data__Group_3__2__Impl : ( ( rule__Data__UnitAssignment_3_2 ) ) ;
    public final void rule__Data__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2921:1: ( ( ( rule__Data__UnitAssignment_3_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2922:1: ( ( rule__Data__UnitAssignment_3_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2922:1: ( ( rule__Data__UnitAssignment_3_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2923:1: ( rule__Data__UnitAssignment_3_2 )
            {
             before(grammarAccess.getDataAccess().getUnitAssignment_3_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2924:1: ( rule__Data__UnitAssignment_3_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2924:2: rule__Data__UnitAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Data__UnitAssignment_3_2_in_rule__Data__Group_3__2__Impl5902);
            rule__Data__UnitAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getUnitAssignment_3_2()); 

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
    // $ANTLR end "rule__Data__Group_3__2__Impl"


    // $ANTLR start "rule__Data__Group_6__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2940:1: rule__Data__Group_6__0 : rule__Data__Group_6__0__Impl rule__Data__Group_6__1 ;
    public final void rule__Data__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2944:1: ( rule__Data__Group_6__0__Impl rule__Data__Group_6__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2945:2: rule__Data__Group_6__0__Impl rule__Data__Group_6__1
            {
            pushFollow(FOLLOW_rule__Data__Group_6__0__Impl_in_rule__Data__Group_6__05938);
            rule__Data__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Data__Group_6__1_in_rule__Data__Group_6__05941);
            rule__Data__Group_6__1();

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
    // $ANTLR end "rule__Data__Group_6__0"


    // $ANTLR start "rule__Data__Group_6__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2952:1: rule__Data__Group_6__0__Impl : ( 'with' ) ;
    public final void rule__Data__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2956:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2957:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2957:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2958:1: 'with'
            {
             before(grammarAccess.getDataAccess().getWithKeyword_6_0()); 
            match(input,47,FOLLOW_47_in_rule__Data__Group_6__0__Impl5969); 
             after(grammarAccess.getDataAccess().getWithKeyword_6_0()); 

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
    // $ANTLR end "rule__Data__Group_6__0__Impl"


    // $ANTLR start "rule__Data__Group_6__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2971:1: rule__Data__Group_6__1 : rule__Data__Group_6__1__Impl rule__Data__Group_6__2 ;
    public final void rule__Data__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2975:1: ( rule__Data__Group_6__1__Impl rule__Data__Group_6__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2976:2: rule__Data__Group_6__1__Impl rule__Data__Group_6__2
            {
            pushFollow(FOLLOW_rule__Data__Group_6__1__Impl_in_rule__Data__Group_6__16000);
            rule__Data__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Data__Group_6__2_in_rule__Data__Group_6__16003);
            rule__Data__Group_6__2();

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
    // $ANTLR end "rule__Data__Group_6__1"


    // $ANTLR start "rule__Data__Group_6__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2983:1: rule__Data__Group_6__1__Impl : ( 'bit' ) ;
    public final void rule__Data__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2987:1: ( ( 'bit' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2988:1: ( 'bit' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2988:1: ( 'bit' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2989:1: 'bit'
            {
             before(grammarAccess.getDataAccess().getBitKeyword_6_1()); 
            match(input,53,FOLLOW_53_in_rule__Data__Group_6__1__Impl6031); 
             after(grammarAccess.getDataAccess().getBitKeyword_6_1()); 

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
    // $ANTLR end "rule__Data__Group_6__1__Impl"


    // $ANTLR start "rule__Data__Group_6__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3002:1: rule__Data__Group_6__2 : rule__Data__Group_6__2__Impl rule__Data__Group_6__3 ;
    public final void rule__Data__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3006:1: ( rule__Data__Group_6__2__Impl rule__Data__Group_6__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3007:2: rule__Data__Group_6__2__Impl rule__Data__Group_6__3
            {
            pushFollow(FOLLOW_rule__Data__Group_6__2__Impl_in_rule__Data__Group_6__26062);
            rule__Data__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Data__Group_6__3_in_rule__Data__Group_6__26065);
            rule__Data__Group_6__3();

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
    // $ANTLR end "rule__Data__Group_6__2"


    // $ANTLR start "rule__Data__Group_6__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3014:1: rule__Data__Group_6__2__Impl : ( 'numbering' ) ;
    public final void rule__Data__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3018:1: ( ( 'numbering' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3019:1: ( 'numbering' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3019:1: ( 'numbering' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3020:1: 'numbering'
            {
             before(grammarAccess.getDataAccess().getNumberingKeyword_6_2()); 
            match(input,54,FOLLOW_54_in_rule__Data__Group_6__2__Impl6093); 
             after(grammarAccess.getDataAccess().getNumberingKeyword_6_2()); 

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
    // $ANTLR end "rule__Data__Group_6__2__Impl"


    // $ANTLR start "rule__Data__Group_6__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3033:1: rule__Data__Group_6__3 : rule__Data__Group_6__3__Impl ;
    public final void rule__Data__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3037:1: ( rule__Data__Group_6__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3038:2: rule__Data__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group_6__3__Impl_in_rule__Data__Group_6__36124);
            rule__Data__Group_6__3__Impl();

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
    // $ANTLR end "rule__Data__Group_6__3"


    // $ANTLR start "rule__Data__Group_6__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3044:1: rule__Data__Group_6__3__Impl : ( ( rule__Data__BitNumberingAssignment_6_3 ) ) ;
    public final void rule__Data__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3048:1: ( ( ( rule__Data__BitNumberingAssignment_6_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3049:1: ( ( rule__Data__BitNumberingAssignment_6_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3049:1: ( ( rule__Data__BitNumberingAssignment_6_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3050:1: ( rule__Data__BitNumberingAssignment_6_3 )
            {
             before(grammarAccess.getDataAccess().getBitNumberingAssignment_6_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3051:1: ( rule__Data__BitNumberingAssignment_6_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3051:2: rule__Data__BitNumberingAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Data__BitNumberingAssignment_6_3_in_rule__Data__Group_6__3__Impl6151);
            rule__Data__BitNumberingAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getBitNumberingAssignment_6_3()); 

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
    // $ANTLR end "rule__Data__Group_6__3__Impl"


    // $ANTLR start "rule__DataRange__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3069:1: rule__DataRange__Group__0 : rule__DataRange__Group__0__Impl rule__DataRange__Group__1 ;
    public final void rule__DataRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3073:1: ( rule__DataRange__Group__0__Impl rule__DataRange__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3074:2: rule__DataRange__Group__0__Impl rule__DataRange__Group__1
            {
            pushFollow(FOLLOW_rule__DataRange__Group__0__Impl_in_rule__DataRange__Group__06189);
            rule__DataRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group__1_in_rule__DataRange__Group__06192);
            rule__DataRange__Group__1();

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
    // $ANTLR end "rule__DataRange__Group__0"


    // $ANTLR start "rule__DataRange__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3081:1: rule__DataRange__Group__0__Impl : ( 'from' ) ;
    public final void rule__DataRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3085:1: ( ( 'from' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3086:1: ( 'from' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3086:1: ( 'from' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3087:1: 'from'
            {
             before(grammarAccess.getDataRangeAccess().getFromKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__DataRange__Group__0__Impl6220); 
             after(grammarAccess.getDataRangeAccess().getFromKeyword_0()); 

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
    // $ANTLR end "rule__DataRange__Group__0__Impl"


    // $ANTLR start "rule__DataRange__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3100:1: rule__DataRange__Group__1 : rule__DataRange__Group__1__Impl rule__DataRange__Group__2 ;
    public final void rule__DataRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3104:1: ( rule__DataRange__Group__1__Impl rule__DataRange__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3105:2: rule__DataRange__Group__1__Impl rule__DataRange__Group__2
            {
            pushFollow(FOLLOW_rule__DataRange__Group__1__Impl_in_rule__DataRange__Group__16251);
            rule__DataRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group__2_in_rule__DataRange__Group__16254);
            rule__DataRange__Group__2();

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
    // $ANTLR end "rule__DataRange__Group__1"


    // $ANTLR start "rule__DataRange__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3112:1: rule__DataRange__Group__1__Impl : ( ( rule__DataRange__LowerBoundAssignment_1 ) ) ;
    public final void rule__DataRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3116:1: ( ( ( rule__DataRange__LowerBoundAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3117:1: ( ( rule__DataRange__LowerBoundAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3117:1: ( ( rule__DataRange__LowerBoundAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3118:1: ( rule__DataRange__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getDataRangeAccess().getLowerBoundAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3119:1: ( rule__DataRange__LowerBoundAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3119:2: rule__DataRange__LowerBoundAssignment_1
            {
            pushFollow(FOLLOW_rule__DataRange__LowerBoundAssignment_1_in_rule__DataRange__Group__1__Impl6281);
            rule__DataRange__LowerBoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataRangeAccess().getLowerBoundAssignment_1()); 

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
    // $ANTLR end "rule__DataRange__Group__1__Impl"


    // $ANTLR start "rule__DataRange__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3129:1: rule__DataRange__Group__2 : rule__DataRange__Group__2__Impl rule__DataRange__Group__3 ;
    public final void rule__DataRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3133:1: ( rule__DataRange__Group__2__Impl rule__DataRange__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3134:2: rule__DataRange__Group__2__Impl rule__DataRange__Group__3
            {
            pushFollow(FOLLOW_rule__DataRange__Group__2__Impl_in_rule__DataRange__Group__26311);
            rule__DataRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group__3_in_rule__DataRange__Group__26314);
            rule__DataRange__Group__3();

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
    // $ANTLR end "rule__DataRange__Group__2"


    // $ANTLR start "rule__DataRange__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3141:1: rule__DataRange__Group__2__Impl : ( 'to' ) ;
    public final void rule__DataRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3145:1: ( ( 'to' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3146:1: ( 'to' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3146:1: ( 'to' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3147:1: 'to'
            {
             before(grammarAccess.getDataRangeAccess().getToKeyword_2()); 
            match(input,56,FOLLOW_56_in_rule__DataRange__Group__2__Impl6342); 
             after(grammarAccess.getDataRangeAccess().getToKeyword_2()); 

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
    // $ANTLR end "rule__DataRange__Group__2__Impl"


    // $ANTLR start "rule__DataRange__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3160:1: rule__DataRange__Group__3 : rule__DataRange__Group__3__Impl ;
    public final void rule__DataRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3164:1: ( rule__DataRange__Group__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3165:2: rule__DataRange__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DataRange__Group__3__Impl_in_rule__DataRange__Group__36373);
            rule__DataRange__Group__3__Impl();

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
    // $ANTLR end "rule__DataRange__Group__3"


    // $ANTLR start "rule__DataRange__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3171:1: rule__DataRange__Group__3__Impl : ( ( rule__DataRange__UpperBoundAssignment_3 ) ) ;
    public final void rule__DataRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3175:1: ( ( ( rule__DataRange__UpperBoundAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3176:1: ( ( rule__DataRange__UpperBoundAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3176:1: ( ( rule__DataRange__UpperBoundAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3177:1: ( rule__DataRange__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getDataRangeAccess().getUpperBoundAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3178:1: ( rule__DataRange__UpperBoundAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3178:2: rule__DataRange__UpperBoundAssignment_3
            {
            pushFollow(FOLLOW_rule__DataRange__UpperBoundAssignment_3_in_rule__DataRange__Group__3__Impl6400);
            rule__DataRange__UpperBoundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataRangeAccess().getUpperBoundAssignment_3()); 

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
    // $ANTLR end "rule__DataRange__Group__3__Impl"


    // $ANTLR start "rule__DataAdaption__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3196:1: rule__DataAdaption__Group__0 : rule__DataAdaption__Group__0__Impl rule__DataAdaption__Group__1 ;
    public final void rule__DataAdaption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3200:1: ( rule__DataAdaption__Group__0__Impl rule__DataAdaption__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3201:2: rule__DataAdaption__Group__0__Impl rule__DataAdaption__Group__1
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__0__Impl_in_rule__DataAdaption__Group__06438);
            rule__DataAdaption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__1_in_rule__DataAdaption__Group__06441);
            rule__DataAdaption__Group__1();

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
    // $ANTLR end "rule__DataAdaption__Group__0"


    // $ANTLR start "rule__DataAdaption__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3208:1: rule__DataAdaption__Group__0__Impl : ( 'with' ) ;
    public final void rule__DataAdaption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3212:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3213:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3213:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3214:1: 'with'
            {
             before(grammarAccess.getDataAdaptionAccess().getWithKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__DataAdaption__Group__0__Impl6469); 
             after(grammarAccess.getDataAdaptionAccess().getWithKeyword_0()); 

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
    // $ANTLR end "rule__DataAdaption__Group__0__Impl"


    // $ANTLR start "rule__DataAdaption__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3227:1: rule__DataAdaption__Group__1 : rule__DataAdaption__Group__1__Impl rule__DataAdaption__Group__2 ;
    public final void rule__DataAdaption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3231:1: ( rule__DataAdaption__Group__1__Impl rule__DataAdaption__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3232:2: rule__DataAdaption__Group__1__Impl rule__DataAdaption__Group__2
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__1__Impl_in_rule__DataAdaption__Group__16500);
            rule__DataAdaption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__2_in_rule__DataAdaption__Group__16503);
            rule__DataAdaption__Group__2();

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
    // $ANTLR end "rule__DataAdaption__Group__1"


    // $ANTLR start "rule__DataAdaption__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3239:1: rule__DataAdaption__Group__1__Impl : ( 'scaling factor' ) ;
    public final void rule__DataAdaption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3243:1: ( ( 'scaling factor' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3244:1: ( 'scaling factor' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3244:1: ( 'scaling factor' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3245:1: 'scaling factor'
            {
             before(grammarAccess.getDataAdaptionAccess().getScalingFactorKeyword_1()); 
            match(input,57,FOLLOW_57_in_rule__DataAdaption__Group__1__Impl6531); 
             after(grammarAccess.getDataAdaptionAccess().getScalingFactorKeyword_1()); 

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
    // $ANTLR end "rule__DataAdaption__Group__1__Impl"


    // $ANTLR start "rule__DataAdaption__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3258:1: rule__DataAdaption__Group__2 : rule__DataAdaption__Group__2__Impl rule__DataAdaption__Group__3 ;
    public final void rule__DataAdaption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3262:1: ( rule__DataAdaption__Group__2__Impl rule__DataAdaption__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3263:2: rule__DataAdaption__Group__2__Impl rule__DataAdaption__Group__3
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__2__Impl_in_rule__DataAdaption__Group__26562);
            rule__DataAdaption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__3_in_rule__DataAdaption__Group__26565);
            rule__DataAdaption__Group__3();

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
    // $ANTLR end "rule__DataAdaption__Group__2"


    // $ANTLR start "rule__DataAdaption__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3270:1: rule__DataAdaption__Group__2__Impl : ( ':' ) ;
    public final void rule__DataAdaption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3274:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3275:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3275:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3276:1: ':'
            {
             before(grammarAccess.getDataAdaptionAccess().getColonKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__DataAdaption__Group__2__Impl6593); 
             after(grammarAccess.getDataAdaptionAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__DataAdaption__Group__2__Impl"


    // $ANTLR start "rule__DataAdaption__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3289:1: rule__DataAdaption__Group__3 : rule__DataAdaption__Group__3__Impl rule__DataAdaption__Group__4 ;
    public final void rule__DataAdaption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3293:1: ( rule__DataAdaption__Group__3__Impl rule__DataAdaption__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3294:2: rule__DataAdaption__Group__3__Impl rule__DataAdaption__Group__4
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__3__Impl_in_rule__DataAdaption__Group__36624);
            rule__DataAdaption__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__4_in_rule__DataAdaption__Group__36627);
            rule__DataAdaption__Group__4();

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
    // $ANTLR end "rule__DataAdaption__Group__3"


    // $ANTLR start "rule__DataAdaption__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3301:1: rule__DataAdaption__Group__3__Impl : ( ( rule__DataAdaption__ScalingFactorAssignment_3 ) ) ;
    public final void rule__DataAdaption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3305:1: ( ( ( rule__DataAdaption__ScalingFactorAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3306:1: ( ( rule__DataAdaption__ScalingFactorAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3306:1: ( ( rule__DataAdaption__ScalingFactorAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3307:1: ( rule__DataAdaption__ScalingFactorAssignment_3 )
            {
             before(grammarAccess.getDataAdaptionAccess().getScalingFactorAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3308:1: ( rule__DataAdaption__ScalingFactorAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3308:2: rule__DataAdaption__ScalingFactorAssignment_3
            {
            pushFollow(FOLLOW_rule__DataAdaption__ScalingFactorAssignment_3_in_rule__DataAdaption__Group__3__Impl6654);
            rule__DataAdaption__ScalingFactorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataAdaptionAccess().getScalingFactorAssignment_3()); 

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
    // $ANTLR end "rule__DataAdaption__Group__3__Impl"


    // $ANTLR start "rule__DataAdaption__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3318:1: rule__DataAdaption__Group__4 : rule__DataAdaption__Group__4__Impl rule__DataAdaption__Group__5 ;
    public final void rule__DataAdaption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3322:1: ( rule__DataAdaption__Group__4__Impl rule__DataAdaption__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3323:2: rule__DataAdaption__Group__4__Impl rule__DataAdaption__Group__5
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__4__Impl_in_rule__DataAdaption__Group__46684);
            rule__DataAdaption__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__5_in_rule__DataAdaption__Group__46687);
            rule__DataAdaption__Group__5();

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
    // $ANTLR end "rule__DataAdaption__Group__4"


    // $ANTLR start "rule__DataAdaption__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3330:1: rule__DataAdaption__Group__4__Impl : ( 'and' ) ;
    public final void rule__DataAdaption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3334:1: ( ( 'and' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3335:1: ( 'and' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3335:1: ( 'and' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3336:1: 'and'
            {
             before(grammarAccess.getDataAdaptionAccess().getAndKeyword_4()); 
            match(input,58,FOLLOW_58_in_rule__DataAdaption__Group__4__Impl6715); 
             after(grammarAccess.getDataAdaptionAccess().getAndKeyword_4()); 

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
    // $ANTLR end "rule__DataAdaption__Group__4__Impl"


    // $ANTLR start "rule__DataAdaption__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3349:1: rule__DataAdaption__Group__5 : rule__DataAdaption__Group__5__Impl rule__DataAdaption__Group__6 ;
    public final void rule__DataAdaption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3353:1: ( rule__DataAdaption__Group__5__Impl rule__DataAdaption__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3354:2: rule__DataAdaption__Group__5__Impl rule__DataAdaption__Group__6
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__5__Impl_in_rule__DataAdaption__Group__56746);
            rule__DataAdaption__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__6_in_rule__DataAdaption__Group__56749);
            rule__DataAdaption__Group__6();

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
    // $ANTLR end "rule__DataAdaption__Group__5"


    // $ANTLR start "rule__DataAdaption__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3361:1: rule__DataAdaption__Group__5__Impl : ( 'offset' ) ;
    public final void rule__DataAdaption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3365:1: ( ( 'offset' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3366:1: ( 'offset' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3366:1: ( 'offset' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3367:1: 'offset'
            {
             before(grammarAccess.getDataAdaptionAccess().getOffsetKeyword_5()); 
            match(input,59,FOLLOW_59_in_rule__DataAdaption__Group__5__Impl6777); 
             after(grammarAccess.getDataAdaptionAccess().getOffsetKeyword_5()); 

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
    // $ANTLR end "rule__DataAdaption__Group__5__Impl"


    // $ANTLR start "rule__DataAdaption__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3380:1: rule__DataAdaption__Group__6 : rule__DataAdaption__Group__6__Impl rule__DataAdaption__Group__7 ;
    public final void rule__DataAdaption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3384:1: ( rule__DataAdaption__Group__6__Impl rule__DataAdaption__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3385:2: rule__DataAdaption__Group__6__Impl rule__DataAdaption__Group__7
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__6__Impl_in_rule__DataAdaption__Group__66808);
            rule__DataAdaption__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__7_in_rule__DataAdaption__Group__66811);
            rule__DataAdaption__Group__7();

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
    // $ANTLR end "rule__DataAdaption__Group__6"


    // $ANTLR start "rule__DataAdaption__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3392:1: rule__DataAdaption__Group__6__Impl : ( ':' ) ;
    public final void rule__DataAdaption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3396:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3397:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3397:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3398:1: ':'
            {
             before(grammarAccess.getDataAdaptionAccess().getColonKeyword_6()); 
            match(input,41,FOLLOW_41_in_rule__DataAdaption__Group__6__Impl6839); 
             after(grammarAccess.getDataAdaptionAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__DataAdaption__Group__6__Impl"


    // $ANTLR start "rule__DataAdaption__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3411:1: rule__DataAdaption__Group__7 : rule__DataAdaption__Group__7__Impl ;
    public final void rule__DataAdaption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3415:1: ( rule__DataAdaption__Group__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3416:2: rule__DataAdaption__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__7__Impl_in_rule__DataAdaption__Group__76870);
            rule__DataAdaption__Group__7__Impl();

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
    // $ANTLR end "rule__DataAdaption__Group__7"


    // $ANTLR start "rule__DataAdaption__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3422:1: rule__DataAdaption__Group__7__Impl : ( ( rule__DataAdaption__OffsetAssignment_7 ) ) ;
    public final void rule__DataAdaption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3426:1: ( ( ( rule__DataAdaption__OffsetAssignment_7 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3427:1: ( ( rule__DataAdaption__OffsetAssignment_7 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3427:1: ( ( rule__DataAdaption__OffsetAssignment_7 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3428:1: ( rule__DataAdaption__OffsetAssignment_7 )
            {
             before(grammarAccess.getDataAdaptionAccess().getOffsetAssignment_7()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3429:1: ( rule__DataAdaption__OffsetAssignment_7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3429:2: rule__DataAdaption__OffsetAssignment_7
            {
            pushFollow(FOLLOW_rule__DataAdaption__OffsetAssignment_7_in_rule__DataAdaption__Group__7__Impl6897);
            rule__DataAdaption__OffsetAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDataAdaptionAccess().getOffsetAssignment_7()); 

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
    // $ANTLR end "rule__DataAdaption__Group__7__Impl"


    // $ANTLR start "rule__Bound__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3455:1: rule__Bound__Group__0 : rule__Bound__Group__0__Impl rule__Bound__Group__1 ;
    public final void rule__Bound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3459:1: ( rule__Bound__Group__0__Impl rule__Bound__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3460:2: rule__Bound__Group__0__Impl rule__Bound__Group__1
            {
            pushFollow(FOLLOW_rule__Bound__Group__0__Impl_in_rule__Bound__Group__06943);
            rule__Bound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bound__Group__1_in_rule__Bound__Group__06946);
            rule__Bound__Group__1();

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
    // $ANTLR end "rule__Bound__Group__0"


    // $ANTLR start "rule__Bound__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3467:1: rule__Bound__Group__0__Impl : ( ( rule__Bound__ValueAssignment_0 ) ) ;
    public final void rule__Bound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3471:1: ( ( ( rule__Bound__ValueAssignment_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3472:1: ( ( rule__Bound__ValueAssignment_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3472:1: ( ( rule__Bound__ValueAssignment_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3473:1: ( rule__Bound__ValueAssignment_0 )
            {
             before(grammarAccess.getBoundAccess().getValueAssignment_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3474:1: ( rule__Bound__ValueAssignment_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3474:2: rule__Bound__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__Bound__ValueAssignment_0_in_rule__Bound__Group__0__Impl6973);
            rule__Bound__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBoundAccess().getValueAssignment_0()); 

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
    // $ANTLR end "rule__Bound__Group__0__Impl"


    // $ANTLR start "rule__Bound__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3484:1: rule__Bound__Group__1 : rule__Bound__Group__1__Impl ;
    public final void rule__Bound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3488:1: ( rule__Bound__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3489:2: rule__Bound__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Bound__Group__1__Impl_in_rule__Bound__Group__17003);
            rule__Bound__Group__1__Impl();

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
    // $ANTLR end "rule__Bound__Group__1"


    // $ANTLR start "rule__Bound__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3495:1: rule__Bound__Group__1__Impl : ( ( rule__Bound__UnitAssignment_1 ) ) ;
    public final void rule__Bound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3499:1: ( ( ( rule__Bound__UnitAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3500:1: ( ( rule__Bound__UnitAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3500:1: ( ( rule__Bound__UnitAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3501:1: ( rule__Bound__UnitAssignment_1 )
            {
             before(grammarAccess.getBoundAccess().getUnitAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3502:1: ( rule__Bound__UnitAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3502:2: rule__Bound__UnitAssignment_1
            {
            pushFollow(FOLLOW_rule__Bound__UnitAssignment_1_in_rule__Bound__Group__1__Impl7030);
            rule__Bound__UnitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundAccess().getUnitAssignment_1()); 

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
    // $ANTLR end "rule__Bound__Group__1__Impl"


    // $ANTLR start "rule__Metadata__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3516:1: rule__Metadata__Group__0 : rule__Metadata__Group__0__Impl rule__Metadata__Group__1 ;
    public final void rule__Metadata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3520:1: ( rule__Metadata__Group__0__Impl rule__Metadata__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3521:2: rule__Metadata__Group__0__Impl rule__Metadata__Group__1
            {
            pushFollow(FOLLOW_rule__Metadata__Group__0__Impl_in_rule__Metadata__Group__07064);
            rule__Metadata__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metadata__Group__1_in_rule__Metadata__Group__07067);
            rule__Metadata__Group__1();

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
    // $ANTLR end "rule__Metadata__Group__0"


    // $ANTLR start "rule__Metadata__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3528:1: rule__Metadata__Group__0__Impl : ( 'primitive' ) ;
    public final void rule__Metadata__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3532:1: ( ( 'primitive' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3533:1: ( 'primitive' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3533:1: ( 'primitive' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3534:1: 'primitive'
            {
             before(grammarAccess.getMetadataAccess().getPrimitiveKeyword_0()); 
            match(input,60,FOLLOW_60_in_rule__Metadata__Group__0__Impl7095); 
             after(grammarAccess.getMetadataAccess().getPrimitiveKeyword_0()); 

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
    // $ANTLR end "rule__Metadata__Group__0__Impl"


    // $ANTLR start "rule__Metadata__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3547:1: rule__Metadata__Group__1 : rule__Metadata__Group__1__Impl rule__Metadata__Group__2 ;
    public final void rule__Metadata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3551:1: ( rule__Metadata__Group__1__Impl rule__Metadata__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3552:2: rule__Metadata__Group__1__Impl rule__Metadata__Group__2
            {
            pushFollow(FOLLOW_rule__Metadata__Group__1__Impl_in_rule__Metadata__Group__17126);
            rule__Metadata__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metadata__Group__2_in_rule__Metadata__Group__17129);
            rule__Metadata__Group__2();

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
    // $ANTLR end "rule__Metadata__Group__1"


    // $ANTLR start "rule__Metadata__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3559:1: rule__Metadata__Group__1__Impl : ( ( rule__Metadata__TypeAssignment_1 ) ) ;
    public final void rule__Metadata__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3563:1: ( ( ( rule__Metadata__TypeAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3564:1: ( ( rule__Metadata__TypeAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3564:1: ( ( rule__Metadata__TypeAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3565:1: ( rule__Metadata__TypeAssignment_1 )
            {
             before(grammarAccess.getMetadataAccess().getTypeAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3566:1: ( rule__Metadata__TypeAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3566:2: rule__Metadata__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Metadata__TypeAssignment_1_in_rule__Metadata__Group__1__Impl7156);
            rule__Metadata__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Metadata__Group__1__Impl"


    // $ANTLR start "rule__Metadata__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3576:1: rule__Metadata__Group__2 : rule__Metadata__Group__2__Impl rule__Metadata__Group__3 ;
    public final void rule__Metadata__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3580:1: ( rule__Metadata__Group__2__Impl rule__Metadata__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3581:2: rule__Metadata__Group__2__Impl rule__Metadata__Group__3
            {
            pushFollow(FOLLOW_rule__Metadata__Group__2__Impl_in_rule__Metadata__Group__27186);
            rule__Metadata__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metadata__Group__3_in_rule__Metadata__Group__27189);
            rule__Metadata__Group__3();

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
    // $ANTLR end "rule__Metadata__Group__2"


    // $ANTLR start "rule__Metadata__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3588:1: rule__Metadata__Group__2__Impl : ( ( rule__Metadata__NameAssignment_2 ) ) ;
    public final void rule__Metadata__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3592:1: ( ( ( rule__Metadata__NameAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3593:1: ( ( rule__Metadata__NameAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3593:1: ( ( rule__Metadata__NameAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3594:1: ( rule__Metadata__NameAssignment_2 )
            {
             before(grammarAccess.getMetadataAccess().getNameAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3595:1: ( rule__Metadata__NameAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3595:2: rule__Metadata__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Metadata__NameAssignment_2_in_rule__Metadata__Group__2__Impl7216);
            rule__Metadata__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Metadata__Group__2__Impl"


    // $ANTLR start "rule__Metadata__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3605:1: rule__Metadata__Group__3 : rule__Metadata__Group__3__Impl rule__Metadata__Group__4 ;
    public final void rule__Metadata__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3609:1: ( rule__Metadata__Group__3__Impl rule__Metadata__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3610:2: rule__Metadata__Group__3__Impl rule__Metadata__Group__4
            {
            pushFollow(FOLLOW_rule__Metadata__Group__3__Impl_in_rule__Metadata__Group__37246);
            rule__Metadata__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metadata__Group__4_in_rule__Metadata__Group__37249);
            rule__Metadata__Group__4();

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
    // $ANTLR end "rule__Metadata__Group__3"


    // $ANTLR start "rule__Metadata__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3617:1: rule__Metadata__Group__3__Impl : ( 'as' ) ;
    public final void rule__Metadata__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3621:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3622:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3622:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3623:1: 'as'
            {
             before(grammarAccess.getMetadataAccess().getAsKeyword_3()); 
            match(input,45,FOLLOW_45_in_rule__Metadata__Group__3__Impl7277); 
             after(grammarAccess.getMetadataAccess().getAsKeyword_3()); 

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
    // $ANTLR end "rule__Metadata__Group__3__Impl"


    // $ANTLR start "rule__Metadata__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3636:1: rule__Metadata__Group__4 : rule__Metadata__Group__4__Impl ;
    public final void rule__Metadata__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3640:1: ( rule__Metadata__Group__4__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3641:2: rule__Metadata__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Metadata__Group__4__Impl_in_rule__Metadata__Group__47308);
            rule__Metadata__Group__4__Impl();

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
    // $ANTLR end "rule__Metadata__Group__4"


    // $ANTLR start "rule__Metadata__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3647:1: rule__Metadata__Group__4__Impl : ( ( rule__Metadata__RepresentationAssignment_4 ) ) ;
    public final void rule__Metadata__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3651:1: ( ( ( rule__Metadata__RepresentationAssignment_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3652:1: ( ( rule__Metadata__RepresentationAssignment_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3652:1: ( ( rule__Metadata__RepresentationAssignment_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3653:1: ( rule__Metadata__RepresentationAssignment_4 )
            {
             before(grammarAccess.getMetadataAccess().getRepresentationAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3654:1: ( rule__Metadata__RepresentationAssignment_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3654:2: rule__Metadata__RepresentationAssignment_4
            {
            pushFollow(FOLLOW_rule__Metadata__RepresentationAssignment_4_in_rule__Metadata__Group__4__Impl7335);
            rule__Metadata__RepresentationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getRepresentationAssignment_4()); 

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
    // $ANTLR end "rule__Metadata__Group__4__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3674:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3678:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3679:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__07375);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__07378);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3686:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3690:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3691:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3691:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3692:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl7405); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3703:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3707:1: ( rule__DOUBLE__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3708:2: rule__DOUBLE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__17434);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3714:1: rule__DOUBLE__Group__1__Impl : ( ( rule__DOUBLE__Group_1__0 )? ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3718:1: ( ( ( rule__DOUBLE__Group_1__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3719:1: ( ( rule__DOUBLE__Group_1__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3719:1: ( ( rule__DOUBLE__Group_1__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3720:1: ( rule__DOUBLE__Group_1__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3721:1: ( rule__DOUBLE__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==61) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3721:2: rule__DOUBLE__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl7461);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3735:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3739:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3740:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__07496);
            rule__DOUBLE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__07499);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3747:1: rule__DOUBLE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3751:1: ( ( '.' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3752:1: ( '.' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3752:1: ( '.' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3753:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
            match(input,61,FOLLOW_61_in_rule__DOUBLE__Group_1__0__Impl7527); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3766:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3770:1: ( rule__DOUBLE__Group_1__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3771:2: rule__DOUBLE__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__17558);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3777:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3781:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3782:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3782:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3783:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl7585); 
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


    // $ANTLR start "rule__DataModel__OptionsAssignment_4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3799:1: rule__DataModel__OptionsAssignment_4 : ( ruleOptions ) ;
    public final void rule__DataModel__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3803:1: ( ( ruleOptions ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3804:1: ( ruleOptions )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3804:1: ( ruleOptions )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3805:1: ruleOptions
            {
             before(grammarAccess.getDataModelAccess().getOptionsOptionsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleOptions_in_rule__DataModel__OptionsAssignment_47623);
            ruleOptions();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getOptionsOptionsParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DataModel__OptionsAssignment_4"


    // $ANTLR start "rule__DataModel__RepresentationsAssignment_6_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3814:1: rule__DataModel__RepresentationsAssignment_6_0 : ( ruleRepresentation ) ;
    public final void rule__DataModel__RepresentationsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3818:1: ( ( ruleRepresentation ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3819:1: ( ruleRepresentation )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3819:1: ( ruleRepresentation )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3820:1: ruleRepresentation
            {
             before(grammarAccess.getDataModelAccess().getRepresentationsRepresentationParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleRepresentation_in_rule__DataModel__RepresentationsAssignment_6_07654);
            ruleRepresentation();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getRepresentationsRepresentationParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__DataModel__RepresentationsAssignment_6_0"


    // $ANTLR start "rule__DataModel__DatafieldsAssignment_6_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3829:1: rule__DataModel__DatafieldsAssignment_6_1 : ( ruleDatafield ) ;
    public final void rule__DataModel__DatafieldsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3833:1: ( ( ruleDatafield ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3834:1: ( ruleDatafield )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3834:1: ( ruleDatafield )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3835:1: ruleDatafield
            {
             before(grammarAccess.getDataModelAccess().getDatafieldsDatafieldParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleDatafield_in_rule__DataModel__DatafieldsAssignment_6_17685);
            ruleDatafield();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getDatafieldsDatafieldParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__DataModel__DatafieldsAssignment_6_1"


    // $ANTLR start "rule__DataModel__TransmitAssignment_8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3844:1: rule__DataModel__TransmitAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__DataModel__TransmitAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3848:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3849:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3849:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3850:1: ( RULE_ID )
            {
             before(grammarAccess.getDataModelAccess().getTransmitDatafieldCrossReference_8_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3851:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3852:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getTransmitDatafieldIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_87720); 
             after(grammarAccess.getDataModelAccess().getTransmitDatafieldIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getDataModelAccess().getTransmitDatafieldCrossReference_8_0()); 

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
    // $ANTLR end "rule__DataModel__TransmitAssignment_8"


    // $ANTLR start "rule__DataModel__TransmitAssignment_9_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3863:1: rule__DataModel__TransmitAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataModel__TransmitAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3867:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3868:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3868:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3869:1: ( RULE_ID )
            {
             before(grammarAccess.getDataModelAccess().getTransmitDatafieldCrossReference_9_1_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3870:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3871:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getTransmitDatafieldIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_9_17759); 
             after(grammarAccess.getDataModelAccess().getTransmitDatafieldIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getDataModelAccess().getTransmitDatafieldCrossReference_9_1_0()); 

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
    // $ANTLR end "rule__DataModel__TransmitAssignment_9_1"


    // $ANTLR start "rule__Options__SensorLanguageAssignment_1_0_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3882:1: rule__Options__SensorLanguageAssignment_1_0_3 : ( ruleGenerationLanguage ) ;
    public final void rule__Options__SensorLanguageAssignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3886:1: ( ( ruleGenerationLanguage ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3887:1: ( ruleGenerationLanguage )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3887:1: ( ruleGenerationLanguage )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3888:1: ruleGenerationLanguage
            {
             before(grammarAccess.getOptionsAccess().getSensorLanguageGenerationLanguageEnumRuleCall_1_0_3_0()); 
            pushFollow(FOLLOW_ruleGenerationLanguage_in_rule__Options__SensorLanguageAssignment_1_0_37794);
            ruleGenerationLanguage();

            state._fsp--;

             after(grammarAccess.getOptionsAccess().getSensorLanguageGenerationLanguageEnumRuleCall_1_0_3_0()); 

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
    // $ANTLR end "rule__Options__SensorLanguageAssignment_1_0_3"


    // $ANTLR start "rule__Options__ReceiverLanguageAssignment_1_1_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3897:1: rule__Options__ReceiverLanguageAssignment_1_1_3 : ( ruleGenerationLanguage ) ;
    public final void rule__Options__ReceiverLanguageAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3901:1: ( ( ruleGenerationLanguage ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3902:1: ( ruleGenerationLanguage )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3902:1: ( ruleGenerationLanguage )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3903:1: ruleGenerationLanguage
            {
             before(grammarAccess.getOptionsAccess().getReceiverLanguageGenerationLanguageEnumRuleCall_1_1_3_0()); 
            pushFollow(FOLLOW_ruleGenerationLanguage_in_rule__Options__ReceiverLanguageAssignment_1_1_37825);
            ruleGenerationLanguage();

            state._fsp--;

             after(grammarAccess.getOptionsAccess().getReceiverLanguageGenerationLanguageEnumRuleCall_1_1_3_0()); 

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
    // $ANTLR end "rule__Options__ReceiverLanguageAssignment_1_1_3"


    // $ANTLR start "rule__Representation__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3912:1: rule__Representation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Representation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3916:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3917:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3917:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3918:1: RULE_ID
            {
             before(grammarAccess.getRepresentationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Representation__NameAssignment_17856); 
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


    // $ANTLR start "rule__Representation__ByteCountAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3927:1: rule__Representation__ByteCountAssignment_3 : ( RULE_INT ) ;
    public final void rule__Representation__ByteCountAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3931:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3932:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3932:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3933:1: RULE_INT
            {
             before(grammarAccess.getRepresentationAccess().getByteCountINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Representation__ByteCountAssignment_37887); 
             after(grammarAccess.getRepresentationAccess().getByteCountINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Representation__ByteCountAssignment_3"


    // $ANTLR start "rule__Representation__TypeAssignment_6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3942:1: rule__Representation__TypeAssignment_6 : ( ruleType ) ;
    public final void rule__Representation__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3946:1: ( ( ruleType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3947:1: ( ruleType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3947:1: ( ruleType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3948:1: ruleType
            {
             before(grammarAccess.getRepresentationAccess().getTypeTypeEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Representation__TypeAssignment_67918);
            ruleType();

            state._fsp--;

             after(grammarAccess.getRepresentationAccess().getTypeTypeEnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__Representation__TypeAssignment_6"


    // $ANTLR start "rule__Calculated__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3957:1: rule__Calculated__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Calculated__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3961:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3962:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3962:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3963:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__NameAssignment_17949); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3972:1: rule__Calculated__RepresentationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Calculated__RepresentationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3976:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3977:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3977:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3978:1: ( RULE_ID )
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationRepresentationCrossReference_3_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3979:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3980:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationRepresentationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__RepresentationAssignment_37984); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3991:1: rule__Calculated__MethodNameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Calculated__MethodNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3995:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3996:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3996:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3997:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__MethodNameAssignment_58019); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4006:1: rule__Calculated__MethodNameOutAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Calculated__MethodNameOutAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4010:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4011:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4011:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4012:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameOutIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__MethodNameOutAssignment_6_18050); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4021:1: rule__Calculated__ParameterAssignment_8 : ( ruleParameter ) ;
    public final void rule__Calculated__ParameterAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4025:1: ( ( ruleParameter ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4026:1: ( ruleParameter )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4026:1: ( ruleParameter )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4027:1: ruleParameter
            {
             before(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_88081);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4036:1: rule__Calculated__ParameterAssignment_9_1 : ( ruleParameter ) ;
    public final void rule__Calculated__ParameterAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4040:1: ( ( ruleParameter ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4041:1: ( ruleParameter )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4041:1: ( ruleParameter )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4042:1: ruleParameter
            {
             before(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_9_18112);
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


    // $ANTLR start "rule__Parameter__DatafieldAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4051:1: rule__Parameter__DatafieldAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__DatafieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4055:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4056:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4056:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4057:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getDatafieldDatafieldCrossReference_1_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4058:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4059:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getDatafieldDatafieldIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__DatafieldAssignment_18147); 
             after(grammarAccess.getParameterAccess().getDatafieldDatafieldIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getDatafieldDatafieldCrossReference_1_0()); 

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
    // $ANTLR end "rule__Parameter__DatafieldAssignment_1"


    // $ANTLR start "rule__Parameter__ArgumentTypeAssignment_2_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4070:1: rule__Parameter__ArgumentTypeAssignment_2_1 : ( ruleArgumentType ) ;
    public final void rule__Parameter__ArgumentTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4074:1: ( ( ruleArgumentType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4075:1: ( ruleArgumentType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4075:1: ( ruleArgumentType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4076:1: ruleArgumentType
            {
             before(grammarAccess.getParameterAccess().getArgumentTypeArgumentTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleArgumentType_in_rule__Parameter__ArgumentTypeAssignment_2_18182);
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


    // $ANTLR start "rule__Datastructure__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4085:1: rule__Datastructure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datastructure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4089:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4090:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4090:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4091:1: RULE_ID
            {
             before(grammarAccess.getDatastructureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Datastructure__NameAssignment_18213); 
             after(grammarAccess.getDatastructureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Datastructure__NameAssignment_1"


    // $ANTLR start "rule__Datastructure__DatafieldsAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4100:1: rule__Datastructure__DatafieldsAssignment_3 : ( ruleDatafield ) ;
    public final void rule__Datastructure__DatafieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4104:1: ( ( ruleDatafield ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4105:1: ( ruleDatafield )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4105:1: ( ruleDatafield )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4106:1: ruleDatafield
            {
             before(grammarAccess.getDatastructureAccess().getDatafieldsDatafieldParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDatafield_in_rule__Datastructure__DatafieldsAssignment_38244);
            ruleDatafield();

            state._fsp--;

             after(grammarAccess.getDatastructureAccess().getDatafieldsDatafieldParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Datastructure__DatafieldsAssignment_3"


    // $ANTLR start "rule__Data__NameAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4115:1: rule__Data__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Data__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4119:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4120:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4120:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4121:1: RULE_ID
            {
             before(grammarAccess.getDataAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Data__NameAssignment_28275); 
             after(grammarAccess.getDataAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Data__NameAssignment_2"


    // $ANTLR start "rule__Data__ScaleAssignment_3_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4130:1: rule__Data__ScaleAssignment_3_1 : ( ruleDOUBLE ) ;
    public final void rule__Data__ScaleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4134:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4135:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4135:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4136:1: ruleDOUBLE
            {
             before(grammarAccess.getDataAccess().getScaleDOUBLEParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Data__ScaleAssignment_3_18306);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDataAccess().getScaleDOUBLEParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Data__ScaleAssignment_3_1"


    // $ANTLR start "rule__Data__UnitAssignment_3_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4145:1: rule__Data__UnitAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__Data__UnitAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4149:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4150:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4150:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4151:1: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getUnitSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Data__UnitAssignment_3_28337); 
             after(grammarAccess.getDataAccess().getUnitSTRINGTerminalRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Data__UnitAssignment_3_2"


    // $ANTLR start "rule__Data__RepresentationAssignment_5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4160:1: rule__Data__RepresentationAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Data__RepresentationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4164:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4165:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4165:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4166:1: ( RULE_ID )
            {
             before(grammarAccess.getDataAccess().getRepresentationRepresentationCrossReference_5_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4167:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4168:1: RULE_ID
            {
             before(grammarAccess.getDataAccess().getRepresentationRepresentationIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Data__RepresentationAssignment_58372); 
             after(grammarAccess.getDataAccess().getRepresentationRepresentationIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDataAccess().getRepresentationRepresentationCrossReference_5_0()); 

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
    // $ANTLR end "rule__Data__RepresentationAssignment_5"


    // $ANTLR start "rule__Data__BitNumberingAssignment_6_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4179:1: rule__Data__BitNumberingAssignment_6_3 : ( ruleBitNumbering ) ;
    public final void rule__Data__BitNumberingAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4183:1: ( ( ruleBitNumbering ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4184:1: ( ruleBitNumbering )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4184:1: ( ruleBitNumbering )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4185:1: ruleBitNumbering
            {
             before(grammarAccess.getDataAccess().getBitNumberingBitNumberingEnumRuleCall_6_3_0()); 
            pushFollow(FOLLOW_ruleBitNumbering_in_rule__Data__BitNumberingAssignment_6_38407);
            ruleBitNumbering();

            state._fsp--;

             after(grammarAccess.getDataAccess().getBitNumberingBitNumberingEnumRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__Data__BitNumberingAssignment_6_3"


    // $ANTLR start "rule__Data__ConstraintsAssignment_7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4194:1: rule__Data__ConstraintsAssignment_7 : ( ruleDataConstraint ) ;
    public final void rule__Data__ConstraintsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4198:1: ( ( ruleDataConstraint ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4199:1: ( ruleDataConstraint )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4199:1: ( ruleDataConstraint )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4200:1: ruleDataConstraint
            {
             before(grammarAccess.getDataAccess().getConstraintsDataConstraintParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDataConstraint_in_rule__Data__ConstraintsAssignment_78438);
            ruleDataConstraint();

            state._fsp--;

             after(grammarAccess.getDataAccess().getConstraintsDataConstraintParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Data__ConstraintsAssignment_7"


    // $ANTLR start "rule__DataRange__LowerBoundAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4209:1: rule__DataRange__LowerBoundAssignment_1 : ( ruleBound ) ;
    public final void rule__DataRange__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4213:1: ( ( ruleBound ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4214:1: ( ruleBound )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4214:1: ( ruleBound )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4215:1: ruleBound
            {
             before(grammarAccess.getDataRangeAccess().getLowerBoundBoundParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBound_in_rule__DataRange__LowerBoundAssignment_18469);
            ruleBound();

            state._fsp--;

             after(grammarAccess.getDataRangeAccess().getLowerBoundBoundParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataRange__LowerBoundAssignment_1"


    // $ANTLR start "rule__DataRange__UpperBoundAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4224:1: rule__DataRange__UpperBoundAssignment_3 : ( ruleBound ) ;
    public final void rule__DataRange__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4228:1: ( ( ruleBound ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4229:1: ( ruleBound )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4229:1: ( ruleBound )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4230:1: ruleBound
            {
             before(grammarAccess.getDataRangeAccess().getUpperBoundBoundParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBound_in_rule__DataRange__UpperBoundAssignment_38500);
            ruleBound();

            state._fsp--;

             after(grammarAccess.getDataRangeAccess().getUpperBoundBoundParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DataRange__UpperBoundAssignment_3"


    // $ANTLR start "rule__DataAdaption__ScalingFactorAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4239:1: rule__DataAdaption__ScalingFactorAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__DataAdaption__ScalingFactorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4243:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4244:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4244:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4245:1: ruleDOUBLE
            {
             before(grammarAccess.getDataAdaptionAccess().getScalingFactorDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__DataAdaption__ScalingFactorAssignment_38531);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDataAdaptionAccess().getScalingFactorDOUBLEParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DataAdaption__ScalingFactorAssignment_3"


    // $ANTLR start "rule__DataAdaption__OffsetAssignment_7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4254:1: rule__DataAdaption__OffsetAssignment_7 : ( ruleDOUBLE ) ;
    public final void rule__DataAdaption__OffsetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4258:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4259:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4259:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4260:1: ruleDOUBLE
            {
             before(grammarAccess.getDataAdaptionAccess().getOffsetDOUBLEParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__DataAdaption__OffsetAssignment_78562);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDataAdaptionAccess().getOffsetDOUBLEParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__DataAdaption__OffsetAssignment_7"


    // $ANTLR start "rule__Bound__ValueAssignment_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4269:1: rule__Bound__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Bound__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4273:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4274:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4274:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4275:1: ruleDOUBLE
            {
             before(grammarAccess.getBoundAccess().getValueDOUBLEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Bound__ValueAssignment_08593);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getBoundAccess().getValueDOUBLEParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Bound__ValueAssignment_0"


    // $ANTLR start "rule__Bound__UnitAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4284:1: rule__Bound__UnitAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Bound__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4288:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4289:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4289:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4290:1: RULE_STRING
            {
             before(grammarAccess.getBoundAccess().getUnitSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Bound__UnitAssignment_18624); 
             after(grammarAccess.getBoundAccess().getUnitSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Bound__UnitAssignment_1"


    // $ANTLR start "rule__Metadata__TypeAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4299:1: rule__Metadata__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Metadata__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4303:1: ( ( ruleType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4304:1: ( ruleType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4304:1: ( ruleType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4305:1: ruleType
            {
             before(grammarAccess.getMetadataAccess().getTypeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Metadata__TypeAssignment_18655);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMetadataAccess().getTypeTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Metadata__TypeAssignment_1"


    // $ANTLR start "rule__Metadata__NameAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4314:1: rule__Metadata__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Metadata__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4318:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4319:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4319:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4320:1: RULE_ID
            {
             before(grammarAccess.getMetadataAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metadata__NameAssignment_28686); 
             after(grammarAccess.getMetadataAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Metadata__NameAssignment_2"


    // $ANTLR start "rule__Metadata__RepresentationAssignment_4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4329:1: rule__Metadata__RepresentationAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Metadata__RepresentationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4333:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4334:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4334:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4335:1: ( RULE_ID )
            {
             before(grammarAccess.getMetadataAccess().getRepresentationRepresentationCrossReference_4_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4336:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4337:1: RULE_ID
            {
             before(grammarAccess.getMetadataAccess().getRepresentationRepresentationIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metadata__RepresentationAssignment_48721); 
             after(grammarAccess.getMetadataAccess().getRepresentationRepresentationIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMetadataAccess().getRepresentationRepresentationCrossReference_4_0()); 

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
    // $ANTLR end "rule__Metadata__RepresentationAssignment_4"

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
    public static final BitSet FOLLOW_ruleDatafield_in_entryRuleDatafield241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatafield248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datafield__Alternatives_in_ruleDatafield274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_entryRuleCalculated301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalculated308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__0_in_ruleCalculated334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatastructure_in_entryRuleDatastructure421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatastructure428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__0_in_ruleDatastructure454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__0_in_ruleData514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConstraint_in_entryRuleDataConstraint541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataConstraint548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataConstraint__Alternatives_in_ruleDataConstraint574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_entryRuleDataRange601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataRange608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__0_in_ruleDataRange634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdaption_in_entryRuleDataAdaption661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAdaption668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__0_in_ruleDataAdaption694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_entryRuleBound721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBound728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__Group__0_in_ruleBound754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_entryRuleMetadata781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadata788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metadata__Group__0_in_ruleMetadata814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationLanguage__Alternatives_in_ruleGenerationLanguage911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleArgumentType948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BitNumbering__Alternatives_in_ruleBitNumbering1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__RepresentationsAssignment_6_0_in_rule__DataModel__Alternatives_61057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__DatafieldsAssignment_6_1_in_rule__DataModel__Alternatives_61075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__0_in_rule__Options__Alternatives_11108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__0_in_rule__Options__Alternatives_11126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Representation__Alternatives_01160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Representation__Alternatives_01180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Representation__Alternatives_41215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Representation__Alternatives_41235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_rule__Datafield__Alternatives1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__Datafield__Alternatives1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatastructure_in_rule__Datafield__Alternatives1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_rule__Datafield__Alternatives1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Calculated__Alternatives_01353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Calculated__Alternatives_01373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_rule__DataConstraint__Alternatives1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdaption_in_rule__DataConstraint__Alternatives1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GenerationLanguage__Alternatives1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GenerationLanguage__Alternatives1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GenerationLanguage__Alternatives1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__GenerationLanguage__Alternatives1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Type__Alternatives1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Type__Alternatives1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Type__Alternatives1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Type__Alternatives1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Type__Alternatives1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Type__Alternatives1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Type__Alternatives1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Type__Alternatives1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Type__Alternatives1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__BitNumbering__Alternatives1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__BitNumbering__Alternatives1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__01814 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__01817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DataModel__Group__0__Impl1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__11876 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__11879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DataModel__Group__1__Impl1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__21938 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__21941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DataModel__Group__2__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__32000 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__32003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DataModel__Group__3__Impl2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__42062 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__5_in_rule__DataModel__Group__42065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__OptionsAssignment_4_in_rule__DataModel__Group__4__Impl2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__5__Impl_in_rule__DataModel__Group__52122 = new BitSet(new long[]{0x100C002000033000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__6_in_rule__DataModel__Group__52125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DataModel__Group__5__Impl2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__6__Impl_in_rule__DataModel__Group__62184 = new BitSet(new long[]{0x100C002000033000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__7_in_rule__DataModel__Group__62187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Alternatives_6_in_rule__DataModel__Group__6__Impl2214 = new BitSet(new long[]{0x100C000000033002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__7__Impl_in_rule__DataModel__Group__72245 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataModel__Group__8_in_rule__DataModel__Group__72248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__DataModel__Group__7__Impl2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__8__Impl_in_rule__DataModel__Group__82307 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__9_in_rule__DataModel__Group__82310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__TransmitAssignment_8_in_rule__DataModel__Group__8__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__9__Impl_in_rule__DataModel__Group__92367 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__10_in_rule__DataModel__Group__92370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_9__0_in_rule__DataModel__Group__9__Impl2397 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__10__Impl_in_rule__DataModel__Group__102428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DataModel__Group__10__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_9__0__Impl_in_rule__DataModel__Group_9__02509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataModel__Group_9__1_in_rule__DataModel__Group_9__02512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DataModel__Group_9__0__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_9__1__Impl_in_rule__DataModel__Group_9__12571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__TransmitAssignment_9_1_in_rule__DataModel__Group_9__1__Impl2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group__0__Impl_in_rule__Options__Group__02632 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_rule__Options__Group__1_in_rule__Options__Group__02635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group__1__Impl_in_rule__Options__Group__12693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Alternatives_1_in_rule__Options__Group__1__Impl2720 = new BitSet(new long[]{0x0000048000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__0__Impl_in_rule__Options__Group_1_0__02755 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__1_in_rule__Options__Group_1_0__02758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Options__Group_1_0__0__Impl2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__1__Impl_in_rule__Options__Group_1_0__12817 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__2_in_rule__Options__Group_1_0__12820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Options__Group_1_0__1__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__2__Impl_in_rule__Options__Group_1_0__22879 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__3_in_rule__Options__Group_1_0__22882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Options__Group_1_0__2__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__3__Impl_in_rule__Options__Group_1_0__32941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__SensorLanguageAssignment_1_0_3_in_rule__Options__Group_1_0__3__Impl2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__0__Impl_in_rule__Options__Group_1_1__03006 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__1_in_rule__Options__Group_1_1__03009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Options__Group_1_1__0__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__1__Impl_in_rule__Options__Group_1_1__13068 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__2_in_rule__Options__Group_1_1__13071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Options__Group_1_1__1__Impl3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__2__Impl_in_rule__Options__Group_1_1__23130 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__3_in_rule__Options__Group_1_1__23133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Options__Group_1_1__2__Impl3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__3__Impl_in_rule__Options__Group_1_1__33192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__ReceiverLanguageAssignment_1_1_3_in_rule__Options__Group_1_1__3__Impl3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__0__Impl_in_rule__Representation__Group__03257 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Representation__Group__1_in_rule__Representation__Group__03260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Alternatives_0_in_rule__Representation__Group__0__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__1__Impl_in_rule__Representation__Group__13317 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__2_in_rule__Representation__Group__13320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__NameAssignment_1_in_rule__Representation__Group__1__Impl3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__2__Impl_in_rule__Representation__Group__23377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Representation__Group__3_in_rule__Representation__Group__23380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Representation__Group__2__Impl3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__3__Impl_in_rule__Representation__Group__33439 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Representation__Group__4_in_rule__Representation__Group__33442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__ByteCountAssignment_3_in_rule__Representation__Group__3__Impl3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__4__Impl_in_rule__Representation__Group__43499 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__5_in_rule__Representation__Group__43502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Alternatives_4_in_rule__Representation__Group__4__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__5__Impl_in_rule__Representation__Group__53559 = new BitSet(new long[]{0x000000007FC00000L});
    public static final BitSet FOLLOW_rule__Representation__Group__6_in_rule__Representation__Group__53562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Representation__Group__5__Impl3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__6__Impl_in_rule__Representation__Group__63621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__TypeAssignment_6_in_rule__Representation__Group__6__Impl3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__0__Impl_in_rule__Calculated__Group__03692 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__1_in_rule__Calculated__Group__03695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Alternatives_0_in_rule__Calculated__Group__0__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__1__Impl_in_rule__Calculated__Group__13752 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__2_in_rule__Calculated__Group__13755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__NameAssignment_1_in_rule__Calculated__Group__1__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__2__Impl_in_rule__Calculated__Group__23812 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__3_in_rule__Calculated__Group__23815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Calculated__Group__2__Impl3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__3__Impl_in_rule__Calculated__Group__33874 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__4_in_rule__Calculated__Group__33877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__RepresentationAssignment_3_in_rule__Calculated__Group__3__Impl3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__4__Impl_in_rule__Calculated__Group__43934 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__5_in_rule__Calculated__Group__43937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Calculated__Group__4__Impl3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__5__Impl_in_rule__Calculated__Group__53996 = new BitSet(new long[]{0x0000804000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__6_in_rule__Calculated__Group__53999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__MethodNameAssignment_5_in_rule__Calculated__Group__5__Impl4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__6__Impl_in_rule__Calculated__Group__64056 = new BitSet(new long[]{0x0000804000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__7_in_rule__Calculated__Group__64059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__0_in_rule__Calculated__Group__6__Impl4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__7__Impl_in_rule__Calculated__Group__74117 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__8_in_rule__Calculated__Group__74120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Calculated__Group__7__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__8__Impl_in_rule__Calculated__Group__84179 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__9_in_rule__Calculated__Group__84182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__ParameterAssignment_8_in_rule__Calculated__Group__8__Impl4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__9__Impl_in_rule__Calculated__Group__94239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__0_in_rule__Calculated__Group__9__Impl4266 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__0__Impl_in_rule__Calculated__Group_6__04317 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__1_in_rule__Calculated__Group_6__04320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Calculated__Group_6__0__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__1__Impl_in_rule__Calculated__Group_6__14379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__MethodNameOutAssignment_6_1_in_rule__Calculated__Group_6__1__Impl4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__0__Impl_in_rule__Calculated__Group_9__04440 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__1_in_rule__Calculated__Group_9__04443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Calculated__Group_9__0__Impl4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__1__Impl_in_rule__Calculated__Group_9__14502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__ParameterAssignment_9_1_in_rule__Calculated__Group_9__1__Impl4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04563 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Parameter__Group__0__Impl4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14625 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DatafieldAssignment_1_in_rule__Parameter__Group__1__Impl4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24685 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__24688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__34746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Parameter__Group__3__Impl4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__04813 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__04816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Parameter__Group_2__0__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__14875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ArgumentTypeAssignment_2_1_in_rule__Parameter__Group_2__1__Impl4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__0__Impl_in_rule__Datastructure__Group__04936 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__1_in_rule__Datastructure__Group__04939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Datastructure__Group__0__Impl4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__1__Impl_in_rule__Datastructure__Group__14998 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__2_in_rule__Datastructure__Group__15001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__NameAssignment_1_in_rule__Datastructure__Group__1__Impl5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__2__Impl_in_rule__Datastructure__Group__25058 = new BitSet(new long[]{0x100C001000033000L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__3_in_rule__Datastructure__Group__25061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Datastructure__Group__2__Impl5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__3__Impl_in_rule__Datastructure__Group__35120 = new BitSet(new long[]{0x100C001000033000L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__4_in_rule__Datastructure__Group__35123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__DatafieldsAssignment_3_in_rule__Datastructure__Group__3__Impl5150 = new BitSet(new long[]{0x100C000000033002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__4__Impl_in_rule__Datastructure__Group__45181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Datastructure__Group__4__Impl5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__0__Impl_in_rule__Data__Group__05250 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Data__Group__1_in_rule__Data__Group__05253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Data__Group__0__Impl5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__1__Impl_in_rule__Data__Group__15312 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Data__Group__2_in_rule__Data__Group__15315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Data__Group__1__Impl5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__2__Impl_in_rule__Data__Group__25374 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_rule__Data__Group__3_in_rule__Data__Group__25377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__NameAssignment_2_in_rule__Data__Group__2__Impl5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__3__Impl_in_rule__Data__Group__35434 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_rule__Data__Group__4_in_rule__Data__Group__35437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_3__0_in_rule__Data__Group__3__Impl5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__4__Impl_in_rule__Data__Group__45495 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Data__Group__5_in_rule__Data__Group__45498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Data__Group__4__Impl5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__5__Impl_in_rule__Data__Group__55557 = new BitSet(new long[]{0x0080800000000000L});
    public static final BitSet FOLLOW_rule__Data__Group__6_in_rule__Data__Group__55560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__RepresentationAssignment_5_in_rule__Data__Group__5__Impl5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__6__Impl_in_rule__Data__Group__65617 = new BitSet(new long[]{0x0080800000000000L});
    public static final BitSet FOLLOW_rule__Data__Group__7_in_rule__Data__Group__65620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_6__0_in_rule__Data__Group__6__Impl5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__7__Impl_in_rule__Data__Group__75678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__ConstraintsAssignment_7_in_rule__Data__Group__7__Impl5705 = new BitSet(new long[]{0x0080800000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_3__0__Impl_in_rule__Data__Group_3__05752 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Data__Group_3__1_in_rule__Data__Group_3__05755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Data__Group_3__0__Impl5783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_3__1__Impl_in_rule__Data__Group_3__15814 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Data__Group_3__2_in_rule__Data__Group_3__15817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__ScaleAssignment_3_1_in_rule__Data__Group_3__1__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_3__2__Impl_in_rule__Data__Group_3__25875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__UnitAssignment_3_2_in_rule__Data__Group_3__2__Impl5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_6__0__Impl_in_rule__Data__Group_6__05938 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Data__Group_6__1_in_rule__Data__Group_6__05941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Data__Group_6__0__Impl5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_6__1__Impl_in_rule__Data__Group_6__16000 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Data__Group_6__2_in_rule__Data__Group_6__16003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Data__Group_6__1__Impl6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_6__2__Impl_in_rule__Data__Group_6__26062 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Data__Group_6__3_in_rule__Data__Group_6__26065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Data__Group_6__2__Impl6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_6__3__Impl_in_rule__Data__Group_6__36124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__BitNumberingAssignment_6_3_in_rule__Data__Group_6__3__Impl6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__0__Impl_in_rule__DataRange__Group__06189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataRange__Group__1_in_rule__DataRange__Group__06192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__DataRange__Group__0__Impl6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__1__Impl_in_rule__DataRange__Group__16251 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__DataRange__Group__2_in_rule__DataRange__Group__16254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__LowerBoundAssignment_1_in_rule__DataRange__Group__1__Impl6281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__2__Impl_in_rule__DataRange__Group__26311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataRange__Group__3_in_rule__DataRange__Group__26314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__DataRange__Group__2__Impl6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__3__Impl_in_rule__DataRange__Group__36373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__UpperBoundAssignment_3_in_rule__DataRange__Group__3__Impl6400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__0__Impl_in_rule__DataAdaption__Group__06438 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__1_in_rule__DataAdaption__Group__06441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DataAdaption__Group__0__Impl6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__1__Impl_in_rule__DataAdaption__Group__16500 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__2_in_rule__DataAdaption__Group__16503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__DataAdaption__Group__1__Impl6531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__2__Impl_in_rule__DataAdaption__Group__26562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__3_in_rule__DataAdaption__Group__26565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__DataAdaption__Group__2__Impl6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__3__Impl_in_rule__DataAdaption__Group__36624 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__4_in_rule__DataAdaption__Group__36627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__ScalingFactorAssignment_3_in_rule__DataAdaption__Group__3__Impl6654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__4__Impl_in_rule__DataAdaption__Group__46684 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__5_in_rule__DataAdaption__Group__46687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__DataAdaption__Group__4__Impl6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__5__Impl_in_rule__DataAdaption__Group__56746 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__6_in_rule__DataAdaption__Group__56749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__DataAdaption__Group__5__Impl6777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__6__Impl_in_rule__DataAdaption__Group__66808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__7_in_rule__DataAdaption__Group__66811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__DataAdaption__Group__6__Impl6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__7__Impl_in_rule__DataAdaption__Group__76870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__OffsetAssignment_7_in_rule__DataAdaption__Group__7__Impl6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__Group__0__Impl_in_rule__Bound__Group__06943 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Bound__Group__1_in_rule__Bound__Group__06946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__ValueAssignment_0_in_rule__Bound__Group__0__Impl6973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__Group__1__Impl_in_rule__Bound__Group__17003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__UnitAssignment_1_in_rule__Bound__Group__1__Impl7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metadata__Group__0__Impl_in_rule__Metadata__Group__07064 = new BitSet(new long[]{0x000000007FC00000L});
    public static final BitSet FOLLOW_rule__Metadata__Group__1_in_rule__Metadata__Group__07067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Metadata__Group__0__Impl7095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metadata__Group__1__Impl_in_rule__Metadata__Group__17126 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Metadata__Group__2_in_rule__Metadata__Group__17129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metadata__TypeAssignment_1_in_rule__Metadata__Group__1__Impl7156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metadata__Group__2__Impl_in_rule__Metadata__Group__27186 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Metadata__Group__3_in_rule__Metadata__Group__27189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metadata__NameAssignment_2_in_rule__Metadata__Group__2__Impl7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metadata__Group__3__Impl_in_rule__Metadata__Group__37246 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Metadata__Group__4_in_rule__Metadata__Group__37249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Metadata__Group__3__Impl7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metadata__Group__4__Impl_in_rule__Metadata__Group__47308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metadata__RepresentationAssignment_4_in_rule__Metadata__Group__4__Impl7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__07375 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__07378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl7405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__17434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl7461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__07496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__07499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__DOUBLE__Group_1__0__Impl7527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__17558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptions_in_rule__DataModel__OptionsAssignment_47623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepresentation_in_rule__DataModel__RepresentationsAssignment_6_07654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatafield_in_rule__DataModel__DatafieldsAssignment_6_17685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_87720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_9_17759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_rule__Options__SensorLanguageAssignment_1_0_37794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_rule__Options__ReceiverLanguageAssignment_1_1_37825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Representation__NameAssignment_17856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Representation__ByteCountAssignment_37887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Representation__TypeAssignment_67918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__NameAssignment_17949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__RepresentationAssignment_37984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__MethodNameAssignment_58019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__MethodNameOutAssignment_6_18050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_88081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_9_18112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__DatafieldAssignment_18147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentType_in_rule__Parameter__ArgumentTypeAssignment_2_18182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Datastructure__NameAssignment_18213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatafield_in_rule__Datastructure__DatafieldsAssignment_38244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Data__NameAssignment_28275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Data__ScaleAssignment_3_18306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Data__UnitAssignment_3_28337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Data__RepresentationAssignment_58372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitNumbering_in_rule__Data__BitNumberingAssignment_6_38407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConstraint_in_rule__Data__ConstraintsAssignment_78438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_rule__DataRange__LowerBoundAssignment_18469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_rule__DataRange__UpperBoundAssignment_38500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__DataAdaption__ScalingFactorAssignment_38531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__DataAdaption__OffsetAssignment_78562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Bound__ValueAssignment_08593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Bound__UnitAssignment_18624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Metadata__TypeAssignment_18655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metadata__NameAssignment_28686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metadata__RepresentationAssignment_48721 = new BitSet(new long[]{0x0000000000000002L});

}