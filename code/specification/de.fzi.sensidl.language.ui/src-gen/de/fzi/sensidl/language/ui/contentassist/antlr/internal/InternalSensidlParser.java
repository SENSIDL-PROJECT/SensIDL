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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BYTE_ARRAY'", "'repr'", "'representation'", "'bytes'", "'byte'", "'calculate'", "'calculated'", "'JAVA'", "'CPP'", "'C'", "'FLOW'", "'TEMPERATURE'", "'VOLUME'", "'DURATION'", "'PRESSURE'", "'BYTE'", "'SHORT'", "'INT'", "'LONG'", "'FLOAT'", "'DOUBLE'", "'options'", "'{'", "'}'", "'transmit'", "','", "'transmission'", "'type'", "':'", "'sensor'", "'language'", "'receiver'", "'push'", "'with'", "'Frequency'", "'and'", "'pull'", "'timeDivisionMultiplexing'", "'Duration'", "'timeSlot'", "'is'", "'by'", "'as'", "'('", "')'", "'group'", "'measurement'", "'of'", "'in'", "'from'", "'to'", "'scaling factor'", "'offset'", "'primitive'", "'constant'", "'.'"
    };
    public static final int RULE_ID=5;
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


    // $ANTLR start "entryRuleTransmission"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:116:1: entryRuleTransmission : ruleTransmission EOF ;
    public final void entryRuleTransmission() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:117:1: ( ruleTransmission EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:118:1: ruleTransmission EOF
            {
             before(grammarAccess.getTransmissionRule()); 
            pushFollow(FOLLOW_ruleTransmission_in_entryRuleTransmission181);
            ruleTransmission();

            state._fsp--;

             after(grammarAccess.getTransmissionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransmission188); 

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
    // $ANTLR end "entryRuleTransmission"


    // $ANTLR start "ruleTransmission"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:125:1: ruleTransmission : ( ( rule__Transmission__Alternatives ) ) ;
    public final void ruleTransmission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:129:2: ( ( ( rule__Transmission__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:130:1: ( ( rule__Transmission__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:130:1: ( ( rule__Transmission__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:131:1: ( rule__Transmission__Alternatives )
            {
             before(grammarAccess.getTransmissionAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:132:1: ( rule__Transmission__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:132:2: rule__Transmission__Alternatives
            {
            pushFollow(FOLLOW_rule__Transmission__Alternatives_in_ruleTransmission214);
            rule__Transmission__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransmissionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransmission"


    // $ANTLR start "entryRulePush"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:144:1: entryRulePush : rulePush EOF ;
    public final void entryRulePush() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:145:1: ( rulePush EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:146:1: rulePush EOF
            {
             before(grammarAccess.getPushRule()); 
            pushFollow(FOLLOW_rulePush_in_entryRulePush241);
            rulePush();

            state._fsp--;

             after(grammarAccess.getPushRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePush248); 

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
    // $ANTLR end "entryRulePush"


    // $ANTLR start "rulePush"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:153:1: rulePush : ( ( rule__Push__Group__0 ) ) ;
    public final void rulePush() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:157:2: ( ( ( rule__Push__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:158:1: ( ( rule__Push__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:158:1: ( ( rule__Push__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:159:1: ( rule__Push__Group__0 )
            {
             before(grammarAccess.getPushAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:160:1: ( rule__Push__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:160:2: rule__Push__Group__0
            {
            pushFollow(FOLLOW_rule__Push__Group__0_in_rulePush274);
            rule__Push__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPushAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePush"


    // $ANTLR start "entryRulePull"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:172:1: entryRulePull : rulePull EOF ;
    public final void entryRulePull() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:173:1: ( rulePull EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:174:1: rulePull EOF
            {
             before(grammarAccess.getPullRule()); 
            pushFollow(FOLLOW_rulePull_in_entryRulePull301);
            rulePull();

            state._fsp--;

             after(grammarAccess.getPullRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePull308); 

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
    // $ANTLR end "entryRulePull"


    // $ANTLR start "rulePull"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:181:1: rulePull : ( ( rule__Pull__Alternatives ) ) ;
    public final void rulePull() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:185:2: ( ( ( rule__Pull__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:186:1: ( ( rule__Pull__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:186:1: ( ( rule__Pull__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:187:1: ( rule__Pull__Alternatives )
            {
             before(grammarAccess.getPullAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:188:1: ( rule__Pull__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:188:2: rule__Pull__Alternatives
            {
            pushFollow(FOLLOW_rule__Pull__Alternatives_in_rulePull334);
            rule__Pull__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPullAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePull"


    // $ANTLR start "entryRuleTimeDivisionMultiplexing"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:200:1: entryRuleTimeDivisionMultiplexing : ruleTimeDivisionMultiplexing EOF ;
    public final void entryRuleTimeDivisionMultiplexing() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:201:1: ( ruleTimeDivisionMultiplexing EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:202:1: ruleTimeDivisionMultiplexing EOF
            {
             before(grammarAccess.getTimeDivisionMultiplexingRule()); 
            pushFollow(FOLLOW_ruleTimeDivisionMultiplexing_in_entryRuleTimeDivisionMultiplexing361);
            ruleTimeDivisionMultiplexing();

            state._fsp--;

             after(grammarAccess.getTimeDivisionMultiplexingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeDivisionMultiplexing368); 

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
    // $ANTLR end "entryRuleTimeDivisionMultiplexing"


    // $ANTLR start "ruleTimeDivisionMultiplexing"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:209:1: ruleTimeDivisionMultiplexing : ( ( rule__TimeDivisionMultiplexing__Group__0 ) ) ;
    public final void ruleTimeDivisionMultiplexing() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:213:2: ( ( ( rule__TimeDivisionMultiplexing__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:214:1: ( ( rule__TimeDivisionMultiplexing__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:214:1: ( ( rule__TimeDivisionMultiplexing__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:215:1: ( rule__TimeDivisionMultiplexing__Group__0 )
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:216:1: ( rule__TimeDivisionMultiplexing__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:216:2: rule__TimeDivisionMultiplexing__Group__0
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__0_in_ruleTimeDivisionMultiplexing394);
            rule__TimeDivisionMultiplexing__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeDivisionMultiplexingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeDivisionMultiplexing"


    // $ANTLR start "entryRuleRepresentation"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:228:1: entryRuleRepresentation : ruleRepresentation EOF ;
    public final void entryRuleRepresentation() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:229:1: ( ruleRepresentation EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:230:1: ruleRepresentation EOF
            {
             before(grammarAccess.getRepresentationRule()); 
            pushFollow(FOLLOW_ruleRepresentation_in_entryRuleRepresentation421);
            ruleRepresentation();

            state._fsp--;

             after(grammarAccess.getRepresentationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepresentation428); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:237:1: ruleRepresentation : ( ( rule__Representation__Group__0 ) ) ;
    public final void ruleRepresentation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:241:2: ( ( ( rule__Representation__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:242:1: ( ( rule__Representation__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:242:1: ( ( rule__Representation__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:243:1: ( rule__Representation__Group__0 )
            {
             before(grammarAccess.getRepresentationAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:244:1: ( rule__Representation__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:244:2: rule__Representation__Group__0
            {
            pushFollow(FOLLOW_rule__Representation__Group__0_in_ruleRepresentation454);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:256:1: entryRuleInterpretation : ruleInterpretation EOF ;
    public final void entryRuleInterpretation() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:257:1: ( ruleInterpretation EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:258:1: ruleInterpretation EOF
            {
             before(grammarAccess.getInterpretationRule()); 
            pushFollow(FOLLOW_ruleInterpretation_in_entryRuleInterpretation481);
            ruleInterpretation();

            state._fsp--;

             after(grammarAccess.getInterpretationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterpretation488); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:265:1: ruleInterpretation : ( ( rule__Interpretation__Alternatives ) ) ;
    public final void ruleInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:269:2: ( ( ( rule__Interpretation__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:270:1: ( ( rule__Interpretation__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:270:1: ( ( rule__Interpretation__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:271:1: ( rule__Interpretation__Alternatives )
            {
             before(grammarAccess.getInterpretationAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:272:1: ( rule__Interpretation__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:272:2: rule__Interpretation__Alternatives
            {
            pushFollow(FOLLOW_rule__Interpretation__Alternatives_in_ruleInterpretation514);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:284:1: entryRuleCalculated : ruleCalculated EOF ;
    public final void entryRuleCalculated() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:285:1: ( ruleCalculated EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:286:1: ruleCalculated EOF
            {
             before(grammarAccess.getCalculatedRule()); 
            pushFollow(FOLLOW_ruleCalculated_in_entryRuleCalculated541);
            ruleCalculated();

            state._fsp--;

             after(grammarAccess.getCalculatedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalculated548); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:293:1: ruleCalculated : ( ( rule__Calculated__Group__0 ) ) ;
    public final void ruleCalculated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:297:2: ( ( ( rule__Calculated__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:298:1: ( ( rule__Calculated__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:298:1: ( ( rule__Calculated__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:299:1: ( rule__Calculated__Group__0 )
            {
             before(grammarAccess.getCalculatedAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:300:1: ( rule__Calculated__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:300:2: rule__Calculated__Group__0
            {
            pushFollow(FOLLOW_rule__Calculated__Group__0_in_ruleCalculated574);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:312:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:313:1: ( ruleParameter EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:314:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter601);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter608); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:321:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:325:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:326:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:326:1: ( ( rule__Parameter__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:327:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:328:1: ( rule__Parameter__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:328:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter634);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:340:1: entryRuleInterpretationGroup : ruleInterpretationGroup EOF ;
    public final void entryRuleInterpretationGroup() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:341:1: ( ruleInterpretationGroup EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:342:1: ruleInterpretationGroup EOF
            {
             before(grammarAccess.getInterpretationGroupRule()); 
            pushFollow(FOLLOW_ruleInterpretationGroup_in_entryRuleInterpretationGroup661);
            ruleInterpretationGroup();

            state._fsp--;

             after(grammarAccess.getInterpretationGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterpretationGroup668); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:349:1: ruleInterpretationGroup : ( ( rule__InterpretationGroup__Group__0 ) ) ;
    public final void ruleInterpretationGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:353:2: ( ( ( rule__InterpretationGroup__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:354:1: ( ( rule__InterpretationGroup__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:354:1: ( ( rule__InterpretationGroup__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:355:1: ( rule__InterpretationGroup__Group__0 )
            {
             before(grammarAccess.getInterpretationGroupAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:356:1: ( rule__InterpretationGroup__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:356:2: rule__InterpretationGroup__Group__0
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__0_in_ruleInterpretationGroup694);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:368:1: entryRuleMeasurement : ruleMeasurement EOF ;
    public final void entryRuleMeasurement() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:369:1: ( ruleMeasurement EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:370:1: ruleMeasurement EOF
            {
             before(grammarAccess.getMeasurementRule()); 
            pushFollow(FOLLOW_ruleMeasurement_in_entryRuleMeasurement721);
            ruleMeasurement();

            state._fsp--;

             after(grammarAccess.getMeasurementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurement728); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:377:1: ruleMeasurement : ( ( rule__Measurement__Group__0 ) ) ;
    public final void ruleMeasurement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:381:2: ( ( ( rule__Measurement__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:382:1: ( ( rule__Measurement__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:382:1: ( ( rule__Measurement__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:383:1: ( rule__Measurement__Group__0 )
            {
             before(grammarAccess.getMeasurementAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:384:1: ( rule__Measurement__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:384:2: rule__Measurement__Group__0
            {
            pushFollow(FOLLOW_rule__Measurement__Group__0_in_ruleMeasurement754);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:396:1: entryRuleMeasurementConstraint : ruleMeasurementConstraint EOF ;
    public final void entryRuleMeasurementConstraint() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:397:1: ( ruleMeasurementConstraint EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:398:1: ruleMeasurementConstraint EOF
            {
             before(grammarAccess.getMeasurementConstraintRule()); 
            pushFollow(FOLLOW_ruleMeasurementConstraint_in_entryRuleMeasurementConstraint781);
            ruleMeasurementConstraint();

            state._fsp--;

             after(grammarAccess.getMeasurementConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementConstraint788); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:405:1: ruleMeasurementConstraint : ( ( rule__MeasurementConstraint__Alternatives ) ) ;
    public final void ruleMeasurementConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:409:2: ( ( ( rule__MeasurementConstraint__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:410:1: ( ( rule__MeasurementConstraint__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:410:1: ( ( rule__MeasurementConstraint__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:411:1: ( rule__MeasurementConstraint__Alternatives )
            {
             before(grammarAccess.getMeasurementConstraintAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:412:1: ( rule__MeasurementConstraint__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:412:2: rule__MeasurementConstraint__Alternatives
            {
            pushFollow(FOLLOW_rule__MeasurementConstraint__Alternatives_in_ruleMeasurementConstraint814);
            rule__MeasurementConstraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementConstraintAccess().getAlternatives()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:424:1: entryRuleMeasurementInRange : ruleMeasurementInRange EOF ;
    public final void entryRuleMeasurementInRange() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:425:1: ( ruleMeasurementInRange EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:426:1: ruleMeasurementInRange EOF
            {
             before(grammarAccess.getMeasurementInRangeRule()); 
            pushFollow(FOLLOW_ruleMeasurementInRange_in_entryRuleMeasurementInRange841);
            ruleMeasurementInRange();

            state._fsp--;

             after(grammarAccess.getMeasurementInRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementInRange848); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:433:1: ruleMeasurementInRange : ( ( rule__MeasurementInRange__Group__0 ) ) ;
    public final void ruleMeasurementInRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:437:2: ( ( ( rule__MeasurementInRange__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:438:1: ( ( rule__MeasurementInRange__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:438:1: ( ( rule__MeasurementInRange__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:439:1: ( rule__MeasurementInRange__Group__0 )
            {
             before(grammarAccess.getMeasurementInRangeAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:440:1: ( rule__MeasurementInRange__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:440:2: rule__MeasurementInRange__Group__0
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__Group__0_in_ruleMeasurementInRange874);
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


    // $ANTLR start "entryRuleMeasurementAdaption"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:452:1: entryRuleMeasurementAdaption : ruleMeasurementAdaption EOF ;
    public final void entryRuleMeasurementAdaption() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:453:1: ( ruleMeasurementAdaption EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:454:1: ruleMeasurementAdaption EOF
            {
             before(grammarAccess.getMeasurementAdaptionRule()); 
            pushFollow(FOLLOW_ruleMeasurementAdaption_in_entryRuleMeasurementAdaption901);
            ruleMeasurementAdaption();

            state._fsp--;

             after(grammarAccess.getMeasurementAdaptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementAdaption908); 

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
    // $ANTLR end "entryRuleMeasurementAdaption"


    // $ANTLR start "ruleMeasurementAdaption"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:461:1: ruleMeasurementAdaption : ( ( rule__MeasurementAdaption__Group__0 ) ) ;
    public final void ruleMeasurementAdaption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:465:2: ( ( ( rule__MeasurementAdaption__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:466:1: ( ( rule__MeasurementAdaption__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:466:1: ( ( rule__MeasurementAdaption__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:467:1: ( rule__MeasurementAdaption__Group__0 )
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:468:1: ( rule__MeasurementAdaption__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:468:2: rule__MeasurementAdaption__Group__0
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__0_in_ruleMeasurementAdaption934);
            rule__MeasurementAdaption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAdaptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasurementAdaption"


    // $ANTLR start "entryRuleMeasure"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:480:1: entryRuleMeasure : ruleMeasure EOF ;
    public final void entryRuleMeasure() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:481:1: ( ruleMeasure EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:482:1: ruleMeasure EOF
            {
             before(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_ruleMeasure_in_entryRuleMeasure961);
            ruleMeasure();

            state._fsp--;

             after(grammarAccess.getMeasureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasure968); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:489:1: ruleMeasure : ( ( rule__Measure__Group__0 ) ) ;
    public final void ruleMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:493:2: ( ( ( rule__Measure__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:494:1: ( ( rule__Measure__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:494:1: ( ( rule__Measure__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:495:1: ( rule__Measure__Group__0 )
            {
             before(grammarAccess.getMeasureAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:496:1: ( rule__Measure__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:496:2: rule__Measure__Group__0
            {
            pushFollow(FOLLOW_rule__Measure__Group__0_in_ruleMeasure994);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:508:1: entryRulePrimitiveInterpretation : rulePrimitiveInterpretation EOF ;
    public final void entryRulePrimitiveInterpretation() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:509:1: ( rulePrimitiveInterpretation EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:510:1: rulePrimitiveInterpretation EOF
            {
             before(grammarAccess.getPrimitiveInterpretationRule()); 
            pushFollow(FOLLOW_rulePrimitiveInterpretation_in_entryRulePrimitiveInterpretation1021);
            rulePrimitiveInterpretation();

            state._fsp--;

             after(grammarAccess.getPrimitiveInterpretationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveInterpretation1028); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:517:1: rulePrimitiveInterpretation : ( ( rule__PrimitiveInterpretation__Group__0 ) ) ;
    public final void rulePrimitiveInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:521:2: ( ( ( rule__PrimitiveInterpretation__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:522:1: ( ( rule__PrimitiveInterpretation__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:522:1: ( ( rule__PrimitiveInterpretation__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:523:1: ( rule__PrimitiveInterpretation__Group__0 )
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:524:1: ( rule__PrimitiveInterpretation__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:524:2: rule__PrimitiveInterpretation__Group__0
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__0_in_rulePrimitiveInterpretation1054);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:536:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:537:1: ( ruleConstant EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:538:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant1081);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant1088); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:545:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:549:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:550:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:550:1: ( ( rule__Constant__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:551:1: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:552:1: ( rule__Constant__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:552:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant1114);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:564:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:565:1: ( ruleDOUBLE EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:566:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE1141);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE1148); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:573:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:577:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:578:1: ( ( rule__DOUBLE__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:578:1: ( ( rule__DOUBLE__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:579:1: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:580:1: ( rule__DOUBLE__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:580:2: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE1174);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:593:1: ruleGenerationLanguage : ( ( rule__GenerationLanguage__Alternatives ) ) ;
    public final void ruleGenerationLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:597:1: ( ( ( rule__GenerationLanguage__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:598:1: ( ( rule__GenerationLanguage__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:598:1: ( ( rule__GenerationLanguage__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:599:1: ( rule__GenerationLanguage__Alternatives )
            {
             before(grammarAccess.getGenerationLanguageAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:600:1: ( rule__GenerationLanguage__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:600:2: rule__GenerationLanguage__Alternatives
            {
            pushFollow(FOLLOW_rule__GenerationLanguage__Alternatives_in_ruleGenerationLanguage1211);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:612:1: ruleArgumentType : ( ( 'BYTE_ARRAY' ) ) ;
    public final void ruleArgumentType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:616:1: ( ( ( 'BYTE_ARRAY' ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:617:1: ( ( 'BYTE_ARRAY' ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:617:1: ( ( 'BYTE_ARRAY' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:618:1: ( 'BYTE_ARRAY' )
            {
             before(grammarAccess.getArgumentTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:619:1: ( 'BYTE_ARRAY' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:619:3: 'BYTE_ARRAY'
            {
            match(input,11,FOLLOW_11_in_ruleArgumentType1248); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:632:1: ruleQuantity : ( ( rule__Quantity__Alternatives ) ) ;
    public final void ruleQuantity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:636:1: ( ( ( rule__Quantity__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:637:1: ( ( rule__Quantity__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:637:1: ( ( rule__Quantity__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:638:1: ( rule__Quantity__Alternatives )
            {
             before(grammarAccess.getQuantityAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:639:1: ( rule__Quantity__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:639:2: rule__Quantity__Alternatives
            {
            pushFollow(FOLLOW_rule__Quantity__Alternatives_in_ruleQuantity1286);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:651:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:655:1: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:656:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:656:1: ( ( rule__Type__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:657:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:658:1: ( rule__Type__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:658:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1322);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:669:1: rule__DataModel__Alternatives_4 : ( ( ( rule__DataModel__RepresentationsAssignment_4_0 ) ) | ( ( rule__DataModel__InterpretationsAssignment_4_1 ) ) );
    public final void rule__DataModel__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:673:1: ( ( ( rule__DataModel__RepresentationsAssignment_4_0 ) ) | ( ( rule__DataModel__InterpretationsAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=16 && LA1_0<=17)||(LA1_0>=56 && LA1_0<=57)||(LA1_0>=64 && LA1_0<=65)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:674:1: ( ( rule__DataModel__RepresentationsAssignment_4_0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:674:1: ( ( rule__DataModel__RepresentationsAssignment_4_0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:675:1: ( rule__DataModel__RepresentationsAssignment_4_0 )
                    {
                     before(grammarAccess.getDataModelAccess().getRepresentationsAssignment_4_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:676:1: ( rule__DataModel__RepresentationsAssignment_4_0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:676:2: rule__DataModel__RepresentationsAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__DataModel__RepresentationsAssignment_4_0_in_rule__DataModel__Alternatives_41357);
                    rule__DataModel__RepresentationsAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataModelAccess().getRepresentationsAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:680:6: ( ( rule__DataModel__InterpretationsAssignment_4_1 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:680:6: ( ( rule__DataModel__InterpretationsAssignment_4_1 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:681:1: ( rule__DataModel__InterpretationsAssignment_4_1 )
                    {
                     before(grammarAccess.getDataModelAccess().getInterpretationsAssignment_4_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:682:1: ( rule__DataModel__InterpretationsAssignment_4_1 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:682:2: rule__DataModel__InterpretationsAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__DataModel__InterpretationsAssignment_4_1_in_rule__DataModel__Alternatives_41375);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:691:1: rule__Options__Alternatives_1 : ( ( ( rule__Options__Group_1_0__0 ) ) | ( ( rule__Options__Group_1_1__0 ) ) | ( ( rule__Options__Group_1_2__0 ) ) );
    public final void rule__Options__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:695:1: ( ( ( rule__Options__Group_1_0__0 ) ) | ( ( rule__Options__Group_1_1__0 ) ) | ( ( rule__Options__Group_1_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt2=1;
                }
                break;
            case 40:
                {
                alt2=2;
                }
                break;
            case 42:
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
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:696:1: ( ( rule__Options__Group_1_0__0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:696:1: ( ( rule__Options__Group_1_0__0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:697:1: ( rule__Options__Group_1_0__0 )
                    {
                     before(grammarAccess.getOptionsAccess().getGroup_1_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:698:1: ( rule__Options__Group_1_0__0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:698:2: rule__Options__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Options__Group_1_0__0_in_rule__Options__Alternatives_11408);
                    rule__Options__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionsAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:702:6: ( ( rule__Options__Group_1_1__0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:702:6: ( ( rule__Options__Group_1_1__0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:703:1: ( rule__Options__Group_1_1__0 )
                    {
                     before(grammarAccess.getOptionsAccess().getGroup_1_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:704:1: ( rule__Options__Group_1_1__0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:704:2: rule__Options__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Options__Group_1_1__0_in_rule__Options__Alternatives_11426);
                    rule__Options__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionsAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:708:6: ( ( rule__Options__Group_1_2__0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:708:6: ( ( rule__Options__Group_1_2__0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:709:1: ( rule__Options__Group_1_2__0 )
                    {
                     before(grammarAccess.getOptionsAccess().getGroup_1_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:710:1: ( rule__Options__Group_1_2__0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:710:2: rule__Options__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Options__Group_1_2__0_in_rule__Options__Alternatives_11444);
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


    // $ANTLR start "rule__Transmission__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:719:1: rule__Transmission__Alternatives : ( ( rulePull ) | ( rulePush ) );
    public final void rule__Transmission__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:723:1: ( ( rulePull ) | ( rulePush ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=47 && LA3_0<=48)) ) {
                alt3=1;
            }
            else if ( (LA3_0==43) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:724:1: ( rulePull )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:724:1: ( rulePull )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:725:1: rulePull
                    {
                     before(grammarAccess.getTransmissionAccess().getPullParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePull_in_rule__Transmission__Alternatives1477);
                    rulePull();

                    state._fsp--;

                     after(grammarAccess.getTransmissionAccess().getPullParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:730:6: ( rulePush )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:730:6: ( rulePush )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:731:1: rulePush
                    {
                     before(grammarAccess.getTransmissionAccess().getPushParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePush_in_rule__Transmission__Alternatives1494);
                    rulePush();

                    state._fsp--;

                     after(grammarAccess.getTransmissionAccess().getPushParserRuleCall_1()); 

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
    // $ANTLR end "rule__Transmission__Alternatives"


    // $ANTLR start "rule__Pull__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:741:1: rule__Pull__Alternatives : ( ( ruleTimeDivisionMultiplexing ) | ( ( rule__Pull__Group_1__0 ) ) );
    public final void rule__Pull__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:745:1: ( ( ruleTimeDivisionMultiplexing ) | ( ( rule__Pull__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==48) ) {
                alt4=1;
            }
            else if ( (LA4_0==47) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:746:1: ( ruleTimeDivisionMultiplexing )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:746:1: ( ruleTimeDivisionMultiplexing )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:747:1: ruleTimeDivisionMultiplexing
                    {
                     before(grammarAccess.getPullAccess().getTimeDivisionMultiplexingParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTimeDivisionMultiplexing_in_rule__Pull__Alternatives1526);
                    ruleTimeDivisionMultiplexing();

                    state._fsp--;

                     after(grammarAccess.getPullAccess().getTimeDivisionMultiplexingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:752:6: ( ( rule__Pull__Group_1__0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:752:6: ( ( rule__Pull__Group_1__0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:753:1: ( rule__Pull__Group_1__0 )
                    {
                     before(grammarAccess.getPullAccess().getGroup_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:754:1: ( rule__Pull__Group_1__0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:754:2: rule__Pull__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Pull__Group_1__0_in_rule__Pull__Alternatives1543);
                    rule__Pull__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPullAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Pull__Alternatives"


    // $ANTLR start "rule__Representation__Alternatives_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:763:1: rule__Representation__Alternatives_0 : ( ( 'repr' ) | ( 'representation' ) );
    public final void rule__Representation__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:767:1: ( ( 'repr' ) | ( 'representation' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:768:1: ( 'repr' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:768:1: ( 'repr' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:769:1: 'repr'
                    {
                     before(grammarAccess.getRepresentationAccess().getReprKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Representation__Alternatives_01577); 
                     after(grammarAccess.getRepresentationAccess().getReprKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:776:6: ( 'representation' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:776:6: ( 'representation' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:777:1: 'representation'
                    {
                     before(grammarAccess.getRepresentationAccess().getRepresentationKeyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Representation__Alternatives_01597); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:789:1: rule__Representation__Alternatives_6 : ( ( 'bytes' ) | ( 'byte' ) );
    public final void rule__Representation__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:793:1: ( ( 'bytes' ) | ( 'byte' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:794:1: ( 'bytes' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:794:1: ( 'bytes' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:795:1: 'bytes'
                    {
                     before(grammarAccess.getRepresentationAccess().getBytesKeyword_6_0()); 
                    match(input,14,FOLLOW_14_in_rule__Representation__Alternatives_61632); 
                     after(grammarAccess.getRepresentationAccess().getBytesKeyword_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:802:6: ( 'byte' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:802:6: ( 'byte' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:803:1: 'byte'
                    {
                     before(grammarAccess.getRepresentationAccess().getByteKeyword_6_1()); 
                    match(input,15,FOLLOW_15_in_rule__Representation__Alternatives_61652); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:815:1: rule__Interpretation__Alternatives : ( ( ruleConstant ) | ( rulePrimitiveInterpretation ) | ( ruleMeasurement ) | ( ruleInterpretationGroup ) | ( ruleCalculated ) );
    public final void rule__Interpretation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:819:1: ( ( ruleConstant ) | ( rulePrimitiveInterpretation ) | ( ruleMeasurement ) | ( ruleInterpretationGroup ) | ( ruleCalculated ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt7=1;
                }
                break;
            case 64:
                {
                alt7=2;
                }
                break;
            case 57:
                {
                alt7=3;
                }
                break;
            case 56:
                {
                alt7=4;
                }
                break;
            case 16:
            case 17:
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
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:820:1: ( ruleConstant )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:820:1: ( ruleConstant )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:821:1: ruleConstant
                    {
                     before(grammarAccess.getInterpretationAccess().getConstantParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConstant_in_rule__Interpretation__Alternatives1686);
                    ruleConstant();

                    state._fsp--;

                     after(grammarAccess.getInterpretationAccess().getConstantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:826:6: ( rulePrimitiveInterpretation )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:826:6: ( rulePrimitiveInterpretation )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:827:1: rulePrimitiveInterpretation
                    {
                     before(grammarAccess.getInterpretationAccess().getPrimitiveInterpretationParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePrimitiveInterpretation_in_rule__Interpretation__Alternatives1703);
                    rulePrimitiveInterpretation();

                    state._fsp--;

                     after(grammarAccess.getInterpretationAccess().getPrimitiveInterpretationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:832:6: ( ruleMeasurement )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:832:6: ( ruleMeasurement )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:833:1: ruleMeasurement
                    {
                     before(grammarAccess.getInterpretationAccess().getMeasurementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMeasurement_in_rule__Interpretation__Alternatives1720);
                    ruleMeasurement();

                    state._fsp--;

                     after(grammarAccess.getInterpretationAccess().getMeasurementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:838:6: ( ruleInterpretationGroup )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:838:6: ( ruleInterpretationGroup )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:839:1: ruleInterpretationGroup
                    {
                     before(grammarAccess.getInterpretationAccess().getInterpretationGroupParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleInterpretationGroup_in_rule__Interpretation__Alternatives1737);
                    ruleInterpretationGroup();

                    state._fsp--;

                     after(grammarAccess.getInterpretationAccess().getInterpretationGroupParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:844:6: ( ruleCalculated )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:844:6: ( ruleCalculated )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:845:1: ruleCalculated
                    {
                     before(grammarAccess.getInterpretationAccess().getCalculatedParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCalculated_in_rule__Interpretation__Alternatives1754);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:855:1: rule__Calculated__Alternatives_0 : ( ( 'calculate' ) | ( 'calculated' ) );
    public final void rule__Calculated__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:859:1: ( ( 'calculate' ) | ( 'calculated' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:860:1: ( 'calculate' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:860:1: ( 'calculate' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:861:1: 'calculate'
                    {
                     before(grammarAccess.getCalculatedAccess().getCalculateKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Calculated__Alternatives_01787); 
                     after(grammarAccess.getCalculatedAccess().getCalculateKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:868:6: ( 'calculated' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:868:6: ( 'calculated' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:869:1: 'calculated'
                    {
                     before(grammarAccess.getCalculatedAccess().getCalculatedKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Calculated__Alternatives_01807); 
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


    // $ANTLR start "rule__MeasurementConstraint__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:881:1: rule__MeasurementConstraint__Alternatives : ( ( ruleMeasurementInRange ) | ( ruleMeasurementAdaption ) );
    public final void rule__MeasurementConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:885:1: ( ( ruleMeasurementInRange ) | ( ruleMeasurementAdaption ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==60) ) {
                alt9=1;
            }
            else if ( (LA9_0==44) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:886:1: ( ruleMeasurementInRange )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:886:1: ( ruleMeasurementInRange )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:887:1: ruleMeasurementInRange
                    {
                     before(grammarAccess.getMeasurementConstraintAccess().getMeasurementInRangeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMeasurementInRange_in_rule__MeasurementConstraint__Alternatives1841);
                    ruleMeasurementInRange();

                    state._fsp--;

                     after(grammarAccess.getMeasurementConstraintAccess().getMeasurementInRangeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:892:6: ( ruleMeasurementAdaption )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:892:6: ( ruleMeasurementAdaption )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:893:1: ruleMeasurementAdaption
                    {
                     before(grammarAccess.getMeasurementConstraintAccess().getMeasurementAdaptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMeasurementAdaption_in_rule__MeasurementConstraint__Alternatives1858);
                    ruleMeasurementAdaption();

                    state._fsp--;

                     after(grammarAccess.getMeasurementConstraintAccess().getMeasurementAdaptionParserRuleCall_1()); 

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
    // $ANTLR end "rule__MeasurementConstraint__Alternatives"


    // $ANTLR start "rule__GenerationLanguage__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:903:1: rule__GenerationLanguage__Alternatives : ( ( ( 'JAVA' ) ) | ( ( 'CPP' ) ) | ( ( 'C' ) ) );
    public final void rule__GenerationLanguage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:907:1: ( ( ( 'JAVA' ) ) | ( ( 'CPP' ) ) | ( ( 'C' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:908:1: ( ( 'JAVA' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:908:1: ( ( 'JAVA' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:909:1: ( 'JAVA' )
                    {
                     before(grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:910:1: ( 'JAVA' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:910:3: 'JAVA'
                    {
                    match(input,18,FOLLOW_18_in_rule__GenerationLanguage__Alternatives1891); 

                    }

                     after(grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:915:6: ( ( 'CPP' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:915:6: ( ( 'CPP' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:916:1: ( 'CPP' )
                    {
                     before(grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:917:1: ( 'CPP' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:917:3: 'CPP'
                    {
                    match(input,19,FOLLOW_19_in_rule__GenerationLanguage__Alternatives1912); 

                    }

                     after(grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:922:6: ( ( 'C' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:922:6: ( ( 'C' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:923:1: ( 'C' )
                    {
                     before(grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:924:1: ( 'C' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:924:3: 'C'
                    {
                    match(input,20,FOLLOW_20_in_rule__GenerationLanguage__Alternatives1933); 

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


    // $ANTLR start "rule__Quantity__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:934:1: rule__Quantity__Alternatives : ( ( ( 'FLOW' ) ) | ( ( 'TEMPERATURE' ) ) | ( ( 'VOLUME' ) ) | ( ( 'DURATION' ) ) | ( ( 'PRESSURE' ) ) );
    public final void rule__Quantity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:938:1: ( ( ( 'FLOW' ) ) | ( ( 'TEMPERATURE' ) ) | ( ( 'VOLUME' ) ) | ( ( 'DURATION' ) ) | ( ( 'PRESSURE' ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt11=1;
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            case 24:
                {
                alt11=4;
                }
                break;
            case 25:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:939:1: ( ( 'FLOW' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:939:1: ( ( 'FLOW' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:940:1: ( 'FLOW' )
                    {
                     before(grammarAccess.getQuantityAccess().getFLOWEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:941:1: ( 'FLOW' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:941:3: 'FLOW'
                    {
                    match(input,21,FOLLOW_21_in_rule__Quantity__Alternatives1969); 

                    }

                     after(grammarAccess.getQuantityAccess().getFLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:946:6: ( ( 'TEMPERATURE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:946:6: ( ( 'TEMPERATURE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:947:1: ( 'TEMPERATURE' )
                    {
                     before(grammarAccess.getQuantityAccess().getTEMPERATUREEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:948:1: ( 'TEMPERATURE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:948:3: 'TEMPERATURE'
                    {
                    match(input,22,FOLLOW_22_in_rule__Quantity__Alternatives1990); 

                    }

                     after(grammarAccess.getQuantityAccess().getTEMPERATUREEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:953:6: ( ( 'VOLUME' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:953:6: ( ( 'VOLUME' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:954:1: ( 'VOLUME' )
                    {
                     before(grammarAccess.getQuantityAccess().getVOLUMEEnumLiteralDeclaration_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:955:1: ( 'VOLUME' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:955:3: 'VOLUME'
                    {
                    match(input,23,FOLLOW_23_in_rule__Quantity__Alternatives2011); 

                    }

                     after(grammarAccess.getQuantityAccess().getVOLUMEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:960:6: ( ( 'DURATION' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:960:6: ( ( 'DURATION' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:961:1: ( 'DURATION' )
                    {
                     before(grammarAccess.getQuantityAccess().getDURATIONEnumLiteralDeclaration_3()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:962:1: ( 'DURATION' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:962:3: 'DURATION'
                    {
                    match(input,24,FOLLOW_24_in_rule__Quantity__Alternatives2032); 

                    }

                     after(grammarAccess.getQuantityAccess().getDURATIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:967:6: ( ( 'PRESSURE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:967:6: ( ( 'PRESSURE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:968:1: ( 'PRESSURE' )
                    {
                     before(grammarAccess.getQuantityAccess().getPRESSUREEnumLiteralDeclaration_4()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:969:1: ( 'PRESSURE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:969:3: 'PRESSURE'
                    {
                    match(input,25,FOLLOW_25_in_rule__Quantity__Alternatives2053); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:979:1: rule__Type__Alternatives : ( ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) | ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:983:1: ( ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) | ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            case 29:
                {
                alt12=4;
                }
                break;
            case 30:
                {
                alt12=5;
                }
                break;
            case 31:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:984:1: ( ( 'BYTE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:984:1: ( ( 'BYTE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:985:1: ( 'BYTE' )
                    {
                     before(grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:986:1: ( 'BYTE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:986:3: 'BYTE'
                    {
                    match(input,26,FOLLOW_26_in_rule__Type__Alternatives2089); 

                    }

                     after(grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:991:6: ( ( 'SHORT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:991:6: ( ( 'SHORT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:992:1: ( 'SHORT' )
                    {
                     before(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:993:1: ( 'SHORT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:993:3: 'SHORT'
                    {
                    match(input,27,FOLLOW_27_in_rule__Type__Alternatives2110); 

                    }

                     after(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:998:6: ( ( 'INT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:998:6: ( ( 'INT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:999:1: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1000:1: ( 'INT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1000:3: 'INT'
                    {
                    match(input,28,FOLLOW_28_in_rule__Type__Alternatives2131); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1005:6: ( ( 'LONG' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1005:6: ( ( 'LONG' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1006:1: ( 'LONG' )
                    {
                     before(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_3()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1007:1: ( 'LONG' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1007:3: 'LONG'
                    {
                    match(input,29,FOLLOW_29_in_rule__Type__Alternatives2152); 

                    }

                     after(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1012:6: ( ( 'FLOAT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1012:6: ( ( 'FLOAT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1013:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1014:1: ( 'FLOAT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1014:3: 'FLOAT'
                    {
                    match(input,30,FOLLOW_30_in_rule__Type__Alternatives2173); 

                    }

                     after(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1019:6: ( ( 'DOUBLE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1019:6: ( ( 'DOUBLE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1020:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1021:1: ( 'DOUBLE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1021:3: 'DOUBLE'
                    {
                    match(input,31,FOLLOW_31_in_rule__Type__Alternatives2194); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1033:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1037:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1038:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__02227);
            rule__DataModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__02230);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1045:1: rule__DataModel__Group__0__Impl : ( 'options' ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1049:1: ( ( 'options' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1050:1: ( 'options' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1050:1: ( 'options' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1051:1: 'options'
            {
             before(grammarAccess.getDataModelAccess().getOptionsKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__DataModel__Group__0__Impl2258); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1064:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1068:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1069:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__12289);
            rule__DataModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__12292);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1076:1: rule__DataModel__Group__1__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1080:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1081:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1081:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1082:1: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__DataModel__Group__1__Impl2320); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1095:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl rule__DataModel__Group__3 ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1099:1: ( rule__DataModel__Group__2__Impl rule__DataModel__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1100:2: rule__DataModel__Group__2__Impl rule__DataModel__Group__3
            {
            pushFollow(FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__22351);
            rule__DataModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__22354);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1107:1: rule__DataModel__Group__2__Impl : ( ( rule__DataModel__OptionsAssignment_2 ) ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1111:1: ( ( ( rule__DataModel__OptionsAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1112:1: ( ( rule__DataModel__OptionsAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1112:1: ( ( rule__DataModel__OptionsAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1113:1: ( rule__DataModel__OptionsAssignment_2 )
            {
             before(grammarAccess.getDataModelAccess().getOptionsAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1114:1: ( rule__DataModel__OptionsAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1114:2: rule__DataModel__OptionsAssignment_2
            {
            pushFollow(FOLLOW_rule__DataModel__OptionsAssignment_2_in_rule__DataModel__Group__2__Impl2381);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1124:1: rule__DataModel__Group__3 : rule__DataModel__Group__3__Impl rule__DataModel__Group__4 ;
    public final void rule__DataModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1128:1: ( rule__DataModel__Group__3__Impl rule__DataModel__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1129:2: rule__DataModel__Group__3__Impl rule__DataModel__Group__4
            {
            pushFollow(FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__32411);
            rule__DataModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__32414);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1136:1: rule__DataModel__Group__3__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1140:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1141:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1141:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1142:1: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__DataModel__Group__3__Impl2442); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1155:1: rule__DataModel__Group__4 : rule__DataModel__Group__4__Impl rule__DataModel__Group__5 ;
    public final void rule__DataModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1159:1: ( rule__DataModel__Group__4__Impl rule__DataModel__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1160:2: rule__DataModel__Group__4__Impl rule__DataModel__Group__5
            {
            pushFollow(FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__42473);
            rule__DataModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__5_in_rule__DataModel__Group__42476);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1167:1: rule__DataModel__Group__4__Impl : ( ( rule__DataModel__Alternatives_4 )* ) ;
    public final void rule__DataModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1171:1: ( ( ( rule__DataModel__Alternatives_4 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1172:1: ( ( rule__DataModel__Alternatives_4 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1172:1: ( ( rule__DataModel__Alternatives_4 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1173:1: ( rule__DataModel__Alternatives_4 )*
            {
             before(grammarAccess.getDataModelAccess().getAlternatives_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1174:1: ( rule__DataModel__Alternatives_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=12 && LA13_0<=13)||(LA13_0>=16 && LA13_0<=17)||(LA13_0>=56 && LA13_0<=57)||(LA13_0>=64 && LA13_0<=65)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1174:2: rule__DataModel__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__DataModel__Alternatives_4_in_rule__DataModel__Group__4__Impl2503);
            	    rule__DataModel__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1184:1: rule__DataModel__Group__5 : rule__DataModel__Group__5__Impl rule__DataModel__Group__6 ;
    public final void rule__DataModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1188:1: ( rule__DataModel__Group__5__Impl rule__DataModel__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1189:2: rule__DataModel__Group__5__Impl rule__DataModel__Group__6
            {
            pushFollow(FOLLOW_rule__DataModel__Group__5__Impl_in_rule__DataModel__Group__52534);
            rule__DataModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__6_in_rule__DataModel__Group__52537);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1196:1: rule__DataModel__Group__5__Impl : ( 'transmit' ) ;
    public final void rule__DataModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1200:1: ( ( 'transmit' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1201:1: ( 'transmit' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1201:1: ( 'transmit' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1202:1: 'transmit'
            {
             before(grammarAccess.getDataModelAccess().getTransmitKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__DataModel__Group__5__Impl2565); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1215:1: rule__DataModel__Group__6 : rule__DataModel__Group__6__Impl rule__DataModel__Group__7 ;
    public final void rule__DataModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1219:1: ( rule__DataModel__Group__6__Impl rule__DataModel__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1220:2: rule__DataModel__Group__6__Impl rule__DataModel__Group__7
            {
            pushFollow(FOLLOW_rule__DataModel__Group__6__Impl_in_rule__DataModel__Group__62596);
            rule__DataModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__7_in_rule__DataModel__Group__62599);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1227:1: rule__DataModel__Group__6__Impl : ( ( rule__DataModel__TransmitAssignment_6 ) ) ;
    public final void rule__DataModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1231:1: ( ( ( rule__DataModel__TransmitAssignment_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1232:1: ( ( rule__DataModel__TransmitAssignment_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1232:1: ( ( rule__DataModel__TransmitAssignment_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1233:1: ( rule__DataModel__TransmitAssignment_6 )
            {
             before(grammarAccess.getDataModelAccess().getTransmitAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1234:1: ( rule__DataModel__TransmitAssignment_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1234:2: rule__DataModel__TransmitAssignment_6
            {
            pushFollow(FOLLOW_rule__DataModel__TransmitAssignment_6_in_rule__DataModel__Group__6__Impl2626);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1244:1: rule__DataModel__Group__7 : rule__DataModel__Group__7__Impl ;
    public final void rule__DataModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1248:1: ( rule__DataModel__Group__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1249:2: rule__DataModel__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group__7__Impl_in_rule__DataModel__Group__72656);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1255:1: rule__DataModel__Group__7__Impl : ( ( rule__DataModel__Group_7__0 )* ) ;
    public final void rule__DataModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1259:1: ( ( ( rule__DataModel__Group_7__0 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1260:1: ( ( rule__DataModel__Group_7__0 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1260:1: ( ( rule__DataModel__Group_7__0 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1261:1: ( rule__DataModel__Group_7__0 )*
            {
             before(grammarAccess.getDataModelAccess().getGroup_7()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1262:1: ( rule__DataModel__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1262:2: rule__DataModel__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__DataModel__Group_7__0_in_rule__DataModel__Group__7__Impl2683);
            	    rule__DataModel__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1288:1: rule__DataModel__Group_7__0 : rule__DataModel__Group_7__0__Impl rule__DataModel__Group_7__1 ;
    public final void rule__DataModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1292:1: ( rule__DataModel__Group_7__0__Impl rule__DataModel__Group_7__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1293:2: rule__DataModel__Group_7__0__Impl rule__DataModel__Group_7__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group_7__0__Impl_in_rule__DataModel__Group_7__02730);
            rule__DataModel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group_7__1_in_rule__DataModel__Group_7__02733);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1300:1: rule__DataModel__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DataModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1304:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1305:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1305:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1306:1: ','
            {
             before(grammarAccess.getDataModelAccess().getCommaKeyword_7_0()); 
            match(input,36,FOLLOW_36_in_rule__DataModel__Group_7__0__Impl2761); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1319:1: rule__DataModel__Group_7__1 : rule__DataModel__Group_7__1__Impl ;
    public final void rule__DataModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1323:1: ( rule__DataModel__Group_7__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1324:2: rule__DataModel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group_7__1__Impl_in_rule__DataModel__Group_7__12792);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1330:1: rule__DataModel__Group_7__1__Impl : ( ( rule__DataModel__TransmitAssignment_7_1 ) ) ;
    public final void rule__DataModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1334:1: ( ( ( rule__DataModel__TransmitAssignment_7_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1335:1: ( ( rule__DataModel__TransmitAssignment_7_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1335:1: ( ( rule__DataModel__TransmitAssignment_7_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1336:1: ( rule__DataModel__TransmitAssignment_7_1 )
            {
             before(grammarAccess.getDataModelAccess().getTransmitAssignment_7_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1337:1: ( rule__DataModel__TransmitAssignment_7_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1337:2: rule__DataModel__TransmitAssignment_7_1
            {
            pushFollow(FOLLOW_rule__DataModel__TransmitAssignment_7_1_in_rule__DataModel__Group_7__1__Impl2819);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1351:1: rule__Options__Group__0 : rule__Options__Group__0__Impl rule__Options__Group__1 ;
    public final void rule__Options__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1355:1: ( rule__Options__Group__0__Impl rule__Options__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1356:2: rule__Options__Group__0__Impl rule__Options__Group__1
            {
            pushFollow(FOLLOW_rule__Options__Group__0__Impl_in_rule__Options__Group__02853);
            rule__Options__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group__1_in_rule__Options__Group__02856);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1363:1: rule__Options__Group__0__Impl : ( () ) ;
    public final void rule__Options__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1367:1: ( ( () ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1368:1: ( () )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1368:1: ( () )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1369:1: ()
            {
             before(grammarAccess.getOptionsAccess().getOptionsAction_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1370:1: ()
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1372:1: 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1382:1: rule__Options__Group__1 : rule__Options__Group__1__Impl ;
    public final void rule__Options__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1386:1: ( rule__Options__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1387:2: rule__Options__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group__1__Impl_in_rule__Options__Group__12914);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1393:1: rule__Options__Group__1__Impl : ( ( rule__Options__Alternatives_1 )* ) ;
    public final void rule__Options__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1397:1: ( ( ( rule__Options__Alternatives_1 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1398:1: ( ( rule__Options__Alternatives_1 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1398:1: ( ( rule__Options__Alternatives_1 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1399:1: ( rule__Options__Alternatives_1 )*
            {
             before(grammarAccess.getOptionsAccess().getAlternatives_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1400:1: ( rule__Options__Alternatives_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37||LA15_0==40||LA15_0==42) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1400:2: rule__Options__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Options__Alternatives_1_in_rule__Options__Group__1__Impl2941);
            	    rule__Options__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1414:1: rule__Options__Group_1_0__0 : rule__Options__Group_1_0__0__Impl rule__Options__Group_1_0__1 ;
    public final void rule__Options__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1418:1: ( rule__Options__Group_1_0__0__Impl rule__Options__Group_1_0__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1419:2: rule__Options__Group_1_0__0__Impl rule__Options__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__0__Impl_in_rule__Options__Group_1_0__02976);
            rule__Options__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_0__1_in_rule__Options__Group_1_0__02979);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1426:1: rule__Options__Group_1_0__0__Impl : ( 'transmission' ) ;
    public final void rule__Options__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1430:1: ( ( 'transmission' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1431:1: ( 'transmission' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1431:1: ( 'transmission' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1432:1: 'transmission'
            {
             before(grammarAccess.getOptionsAccess().getTransmissionKeyword_1_0_0()); 
            match(input,37,FOLLOW_37_in_rule__Options__Group_1_0__0__Impl3007); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1445:1: rule__Options__Group_1_0__1 : rule__Options__Group_1_0__1__Impl rule__Options__Group_1_0__2 ;
    public final void rule__Options__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1449:1: ( rule__Options__Group_1_0__1__Impl rule__Options__Group_1_0__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1450:2: rule__Options__Group_1_0__1__Impl rule__Options__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__1__Impl_in_rule__Options__Group_1_0__13038);
            rule__Options__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_0__2_in_rule__Options__Group_1_0__13041);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1457:1: rule__Options__Group_1_0__1__Impl : ( 'type' ) ;
    public final void rule__Options__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1461:1: ( ( 'type' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1462:1: ( 'type' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1462:1: ( 'type' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1463:1: 'type'
            {
             before(grammarAccess.getOptionsAccess().getTypeKeyword_1_0_1()); 
            match(input,38,FOLLOW_38_in_rule__Options__Group_1_0__1__Impl3069); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1476:1: rule__Options__Group_1_0__2 : rule__Options__Group_1_0__2__Impl rule__Options__Group_1_0__3 ;
    public final void rule__Options__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1480:1: ( rule__Options__Group_1_0__2__Impl rule__Options__Group_1_0__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1481:2: rule__Options__Group_1_0__2__Impl rule__Options__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__2__Impl_in_rule__Options__Group_1_0__23100);
            rule__Options__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_0__3_in_rule__Options__Group_1_0__23103);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1488:1: rule__Options__Group_1_0__2__Impl : ( ':' ) ;
    public final void rule__Options__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1492:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1493:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1493:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1494:1: ':'
            {
             before(grammarAccess.getOptionsAccess().getColonKeyword_1_0_2()); 
            match(input,39,FOLLOW_39_in_rule__Options__Group_1_0__2__Impl3131); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1507:1: rule__Options__Group_1_0__3 : rule__Options__Group_1_0__3__Impl ;
    public final void rule__Options__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1511:1: ( rule__Options__Group_1_0__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1512:2: rule__Options__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__3__Impl_in_rule__Options__Group_1_0__33162);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1518:1: rule__Options__Group_1_0__3__Impl : ( ( rule__Options__TransmissionTypeAssignment_1_0_3 ) ) ;
    public final void rule__Options__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1522:1: ( ( ( rule__Options__TransmissionTypeAssignment_1_0_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1523:1: ( ( rule__Options__TransmissionTypeAssignment_1_0_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1523:1: ( ( rule__Options__TransmissionTypeAssignment_1_0_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1524:1: ( rule__Options__TransmissionTypeAssignment_1_0_3 )
            {
             before(grammarAccess.getOptionsAccess().getTransmissionTypeAssignment_1_0_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1525:1: ( rule__Options__TransmissionTypeAssignment_1_0_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1525:2: rule__Options__TransmissionTypeAssignment_1_0_3
            {
            pushFollow(FOLLOW_rule__Options__TransmissionTypeAssignment_1_0_3_in_rule__Options__Group_1_0__3__Impl3189);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1543:1: rule__Options__Group_1_1__0 : rule__Options__Group_1_1__0__Impl rule__Options__Group_1_1__1 ;
    public final void rule__Options__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1547:1: ( rule__Options__Group_1_1__0__Impl rule__Options__Group_1_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1548:2: rule__Options__Group_1_1__0__Impl rule__Options__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__0__Impl_in_rule__Options__Group_1_1__03227);
            rule__Options__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_1__1_in_rule__Options__Group_1_1__03230);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1555:1: rule__Options__Group_1_1__0__Impl : ( 'sensor' ) ;
    public final void rule__Options__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1559:1: ( ( 'sensor' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1560:1: ( 'sensor' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1560:1: ( 'sensor' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1561:1: 'sensor'
            {
             before(grammarAccess.getOptionsAccess().getSensorKeyword_1_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Options__Group_1_1__0__Impl3258); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1574:1: rule__Options__Group_1_1__1 : rule__Options__Group_1_1__1__Impl rule__Options__Group_1_1__2 ;
    public final void rule__Options__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1578:1: ( rule__Options__Group_1_1__1__Impl rule__Options__Group_1_1__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1579:2: rule__Options__Group_1_1__1__Impl rule__Options__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__1__Impl_in_rule__Options__Group_1_1__13289);
            rule__Options__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_1__2_in_rule__Options__Group_1_1__13292);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1586:1: rule__Options__Group_1_1__1__Impl : ( 'language' ) ;
    public final void rule__Options__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1590:1: ( ( 'language' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1591:1: ( 'language' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1591:1: ( 'language' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1592:1: 'language'
            {
             before(grammarAccess.getOptionsAccess().getLanguageKeyword_1_1_1()); 
            match(input,41,FOLLOW_41_in_rule__Options__Group_1_1__1__Impl3320); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1605:1: rule__Options__Group_1_1__2 : rule__Options__Group_1_1__2__Impl rule__Options__Group_1_1__3 ;
    public final void rule__Options__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1609:1: ( rule__Options__Group_1_1__2__Impl rule__Options__Group_1_1__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1610:2: rule__Options__Group_1_1__2__Impl rule__Options__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__2__Impl_in_rule__Options__Group_1_1__23351);
            rule__Options__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_1__3_in_rule__Options__Group_1_1__23354);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1617:1: rule__Options__Group_1_1__2__Impl : ( ':' ) ;
    public final void rule__Options__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1621:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1622:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1622:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1623:1: ':'
            {
             before(grammarAccess.getOptionsAccess().getColonKeyword_1_1_2()); 
            match(input,39,FOLLOW_39_in_rule__Options__Group_1_1__2__Impl3382); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1636:1: rule__Options__Group_1_1__3 : rule__Options__Group_1_1__3__Impl ;
    public final void rule__Options__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1640:1: ( rule__Options__Group_1_1__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1641:2: rule__Options__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__3__Impl_in_rule__Options__Group_1_1__33413);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1647:1: rule__Options__Group_1_1__3__Impl : ( ( rule__Options__SensorLanguageAssignment_1_1_3 ) ) ;
    public final void rule__Options__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1651:1: ( ( ( rule__Options__SensorLanguageAssignment_1_1_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1652:1: ( ( rule__Options__SensorLanguageAssignment_1_1_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1652:1: ( ( rule__Options__SensorLanguageAssignment_1_1_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1653:1: ( rule__Options__SensorLanguageAssignment_1_1_3 )
            {
             before(grammarAccess.getOptionsAccess().getSensorLanguageAssignment_1_1_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1654:1: ( rule__Options__SensorLanguageAssignment_1_1_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1654:2: rule__Options__SensorLanguageAssignment_1_1_3
            {
            pushFollow(FOLLOW_rule__Options__SensorLanguageAssignment_1_1_3_in_rule__Options__Group_1_1__3__Impl3440);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1672:1: rule__Options__Group_1_2__0 : rule__Options__Group_1_2__0__Impl rule__Options__Group_1_2__1 ;
    public final void rule__Options__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1676:1: ( rule__Options__Group_1_2__0__Impl rule__Options__Group_1_2__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1677:2: rule__Options__Group_1_2__0__Impl rule__Options__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Options__Group_1_2__0__Impl_in_rule__Options__Group_1_2__03478);
            rule__Options__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_2__1_in_rule__Options__Group_1_2__03481);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1684:1: rule__Options__Group_1_2__0__Impl : ( 'receiver' ) ;
    public final void rule__Options__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1688:1: ( ( 'receiver' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1689:1: ( 'receiver' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1689:1: ( 'receiver' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1690:1: 'receiver'
            {
             before(grammarAccess.getOptionsAccess().getReceiverKeyword_1_2_0()); 
            match(input,42,FOLLOW_42_in_rule__Options__Group_1_2__0__Impl3509); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1703:1: rule__Options__Group_1_2__1 : rule__Options__Group_1_2__1__Impl rule__Options__Group_1_2__2 ;
    public final void rule__Options__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1707:1: ( rule__Options__Group_1_2__1__Impl rule__Options__Group_1_2__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1708:2: rule__Options__Group_1_2__1__Impl rule__Options__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__Options__Group_1_2__1__Impl_in_rule__Options__Group_1_2__13540);
            rule__Options__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_2__2_in_rule__Options__Group_1_2__13543);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1715:1: rule__Options__Group_1_2__1__Impl : ( 'language' ) ;
    public final void rule__Options__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1719:1: ( ( 'language' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1720:1: ( 'language' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1720:1: ( 'language' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1721:1: 'language'
            {
             before(grammarAccess.getOptionsAccess().getLanguageKeyword_1_2_1()); 
            match(input,41,FOLLOW_41_in_rule__Options__Group_1_2__1__Impl3571); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1734:1: rule__Options__Group_1_2__2 : rule__Options__Group_1_2__2__Impl rule__Options__Group_1_2__3 ;
    public final void rule__Options__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1738:1: ( rule__Options__Group_1_2__2__Impl rule__Options__Group_1_2__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1739:2: rule__Options__Group_1_2__2__Impl rule__Options__Group_1_2__3
            {
            pushFollow(FOLLOW_rule__Options__Group_1_2__2__Impl_in_rule__Options__Group_1_2__23602);
            rule__Options__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_2__3_in_rule__Options__Group_1_2__23605);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1746:1: rule__Options__Group_1_2__2__Impl : ( ':' ) ;
    public final void rule__Options__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1750:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1751:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1751:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1752:1: ':'
            {
             before(grammarAccess.getOptionsAccess().getColonKeyword_1_2_2()); 
            match(input,39,FOLLOW_39_in_rule__Options__Group_1_2__2__Impl3633); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1765:1: rule__Options__Group_1_2__3 : rule__Options__Group_1_2__3__Impl ;
    public final void rule__Options__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1769:1: ( rule__Options__Group_1_2__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1770:2: rule__Options__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group_1_2__3__Impl_in_rule__Options__Group_1_2__33664);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1776:1: rule__Options__Group_1_2__3__Impl : ( ( rule__Options__ReceiverLanguageAssignment_1_2_3 ) ) ;
    public final void rule__Options__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1780:1: ( ( ( rule__Options__ReceiverLanguageAssignment_1_2_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1781:1: ( ( rule__Options__ReceiverLanguageAssignment_1_2_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1781:1: ( ( rule__Options__ReceiverLanguageAssignment_1_2_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1782:1: ( rule__Options__ReceiverLanguageAssignment_1_2_3 )
            {
             before(grammarAccess.getOptionsAccess().getReceiverLanguageAssignment_1_2_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1783:1: ( rule__Options__ReceiverLanguageAssignment_1_2_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1783:2: rule__Options__ReceiverLanguageAssignment_1_2_3
            {
            pushFollow(FOLLOW_rule__Options__ReceiverLanguageAssignment_1_2_3_in_rule__Options__Group_1_2__3__Impl3691);
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


    // $ANTLR start "rule__Push__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1801:1: rule__Push__Group__0 : rule__Push__Group__0__Impl rule__Push__Group__1 ;
    public final void rule__Push__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1805:1: ( rule__Push__Group__0__Impl rule__Push__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1806:2: rule__Push__Group__0__Impl rule__Push__Group__1
            {
            pushFollow(FOLLOW_rule__Push__Group__0__Impl_in_rule__Push__Group__03729);
            rule__Push__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Push__Group__1_in_rule__Push__Group__03732);
            rule__Push__Group__1();

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
    // $ANTLR end "rule__Push__Group__0"


    // $ANTLR start "rule__Push__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1813:1: rule__Push__Group__0__Impl : ( 'push' ) ;
    public final void rule__Push__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1817:1: ( ( 'push' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1818:1: ( 'push' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1818:1: ( 'push' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1819:1: 'push'
            {
             before(grammarAccess.getPushAccess().getPushKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Push__Group__0__Impl3760); 
             after(grammarAccess.getPushAccess().getPushKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group__0__Impl"


    // $ANTLR start "rule__Push__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1832:1: rule__Push__Group__1 : rule__Push__Group__1__Impl rule__Push__Group__2 ;
    public final void rule__Push__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1836:1: ( rule__Push__Group__1__Impl rule__Push__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1837:2: rule__Push__Group__1__Impl rule__Push__Group__2
            {
            pushFollow(FOLLOW_rule__Push__Group__1__Impl_in_rule__Push__Group__13791);
            rule__Push__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Push__Group__2_in_rule__Push__Group__13794);
            rule__Push__Group__2();

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
    // $ANTLR end "rule__Push__Group__1"


    // $ANTLR start "rule__Push__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1844:1: rule__Push__Group__1__Impl : ( ( rule__Push__Group_1__0 )? ) ;
    public final void rule__Push__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1848:1: ( ( ( rule__Push__Group_1__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1849:1: ( ( rule__Push__Group_1__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1849:1: ( ( rule__Push__Group_1__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1850:1: ( rule__Push__Group_1__0 )?
            {
             before(grammarAccess.getPushAccess().getGroup_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1851:1: ( rule__Push__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==45) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1851:2: rule__Push__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Push__Group_1__0_in_rule__Push__Group__1__Impl3821);
                    rule__Push__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPushAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group__1__Impl"


    // $ANTLR start "rule__Push__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1861:1: rule__Push__Group__2 : rule__Push__Group__2__Impl rule__Push__Group__3 ;
    public final void rule__Push__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1865:1: ( rule__Push__Group__2__Impl rule__Push__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1866:2: rule__Push__Group__2__Impl rule__Push__Group__3
            {
            pushFollow(FOLLOW_rule__Push__Group__2__Impl_in_rule__Push__Group__23852);
            rule__Push__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Push__Group__3_in_rule__Push__Group__23855);
            rule__Push__Group__3();

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
    // $ANTLR end "rule__Push__Group__2"


    // $ANTLR start "rule__Push__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1873:1: rule__Push__Group__2__Impl : ( 'with' ) ;
    public final void rule__Push__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1877:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1878:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1878:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1879:1: 'with'
            {
             before(grammarAccess.getPushAccess().getWithKeyword_2()); 
            match(input,44,FOLLOW_44_in_rule__Push__Group__2__Impl3883); 
             after(grammarAccess.getPushAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group__2__Impl"


    // $ANTLR start "rule__Push__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1892:1: rule__Push__Group__3 : rule__Push__Group__3__Impl ;
    public final void rule__Push__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1896:1: ( rule__Push__Group__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1897:2: rule__Push__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Push__Group__3__Impl_in_rule__Push__Group__33914);
            rule__Push__Group__3__Impl();

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
    // $ANTLR end "rule__Push__Group__3"


    // $ANTLR start "rule__Push__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1903:1: rule__Push__Group__3__Impl : ( ( rule__Push__MethodNameAssignment_3 ) ) ;
    public final void rule__Push__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1907:1: ( ( ( rule__Push__MethodNameAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1908:1: ( ( rule__Push__MethodNameAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1908:1: ( ( rule__Push__MethodNameAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1909:1: ( rule__Push__MethodNameAssignment_3 )
            {
             before(grammarAccess.getPushAccess().getMethodNameAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1910:1: ( rule__Push__MethodNameAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1910:2: rule__Push__MethodNameAssignment_3
            {
            pushFollow(FOLLOW_rule__Push__MethodNameAssignment_3_in_rule__Push__Group__3__Impl3941);
            rule__Push__MethodNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPushAccess().getMethodNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group__3__Impl"


    // $ANTLR start "rule__Push__Group_1__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1928:1: rule__Push__Group_1__0 : rule__Push__Group_1__0__Impl rule__Push__Group_1__1 ;
    public final void rule__Push__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1932:1: ( rule__Push__Group_1__0__Impl rule__Push__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1933:2: rule__Push__Group_1__0__Impl rule__Push__Group_1__1
            {
            pushFollow(FOLLOW_rule__Push__Group_1__0__Impl_in_rule__Push__Group_1__03979);
            rule__Push__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Push__Group_1__1_in_rule__Push__Group_1__03982);
            rule__Push__Group_1__1();

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
    // $ANTLR end "rule__Push__Group_1__0"


    // $ANTLR start "rule__Push__Group_1__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1940:1: rule__Push__Group_1__0__Impl : ( 'with' ) ;
    public final void rule__Push__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1944:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1945:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1945:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1946:1: 'with'
            {
             before(grammarAccess.getPushAccess().getWithKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__Push__Group_1__0__Impl4010); 
             after(grammarAccess.getPushAccess().getWithKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group_1__0__Impl"


    // $ANTLR start "rule__Push__Group_1__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1959:1: rule__Push__Group_1__1 : rule__Push__Group_1__1__Impl rule__Push__Group_1__2 ;
    public final void rule__Push__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1963:1: ( rule__Push__Group_1__1__Impl rule__Push__Group_1__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1964:2: rule__Push__Group_1__1__Impl rule__Push__Group_1__2
            {
            pushFollow(FOLLOW_rule__Push__Group_1__1__Impl_in_rule__Push__Group_1__14041);
            rule__Push__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Push__Group_1__2_in_rule__Push__Group_1__14044);
            rule__Push__Group_1__2();

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
    // $ANTLR end "rule__Push__Group_1__1"


    // $ANTLR start "rule__Push__Group_1__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1971:1: rule__Push__Group_1__1__Impl : ( 'Frequency' ) ;
    public final void rule__Push__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1975:1: ( ( 'Frequency' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1976:1: ( 'Frequency' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1976:1: ( 'Frequency' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1977:1: 'Frequency'
            {
             before(grammarAccess.getPushAccess().getFrequencyKeyword_1_1()); 
            match(input,45,FOLLOW_45_in_rule__Push__Group_1__1__Impl4072); 
             after(grammarAccess.getPushAccess().getFrequencyKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group_1__1__Impl"


    // $ANTLR start "rule__Push__Group_1__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1990:1: rule__Push__Group_1__2 : rule__Push__Group_1__2__Impl rule__Push__Group_1__3 ;
    public final void rule__Push__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1994:1: ( rule__Push__Group_1__2__Impl rule__Push__Group_1__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1995:2: rule__Push__Group_1__2__Impl rule__Push__Group_1__3
            {
            pushFollow(FOLLOW_rule__Push__Group_1__2__Impl_in_rule__Push__Group_1__24103);
            rule__Push__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Push__Group_1__3_in_rule__Push__Group_1__24106);
            rule__Push__Group_1__3();

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
    // $ANTLR end "rule__Push__Group_1__2"


    // $ANTLR start "rule__Push__Group_1__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2002:1: rule__Push__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Push__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2006:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2007:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2007:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2008:1: ':'
            {
             before(grammarAccess.getPushAccess().getColonKeyword_1_2()); 
            match(input,39,FOLLOW_39_in_rule__Push__Group_1__2__Impl4134); 
             after(grammarAccess.getPushAccess().getColonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group_1__2__Impl"


    // $ANTLR start "rule__Push__Group_1__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2021:1: rule__Push__Group_1__3 : rule__Push__Group_1__3__Impl rule__Push__Group_1__4 ;
    public final void rule__Push__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2025:1: ( rule__Push__Group_1__3__Impl rule__Push__Group_1__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2026:2: rule__Push__Group_1__3__Impl rule__Push__Group_1__4
            {
            pushFollow(FOLLOW_rule__Push__Group_1__3__Impl_in_rule__Push__Group_1__34165);
            rule__Push__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Push__Group_1__4_in_rule__Push__Group_1__34168);
            rule__Push__Group_1__4();

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
    // $ANTLR end "rule__Push__Group_1__3"


    // $ANTLR start "rule__Push__Group_1__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2033:1: rule__Push__Group_1__3__Impl : ( ( rule__Push__FrequencyAssignment_1_3 ) ) ;
    public final void rule__Push__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2037:1: ( ( ( rule__Push__FrequencyAssignment_1_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2038:1: ( ( rule__Push__FrequencyAssignment_1_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2038:1: ( ( rule__Push__FrequencyAssignment_1_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2039:1: ( rule__Push__FrequencyAssignment_1_3 )
            {
             before(grammarAccess.getPushAccess().getFrequencyAssignment_1_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2040:1: ( rule__Push__FrequencyAssignment_1_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2040:2: rule__Push__FrequencyAssignment_1_3
            {
            pushFollow(FOLLOW_rule__Push__FrequencyAssignment_1_3_in_rule__Push__Group_1__3__Impl4195);
            rule__Push__FrequencyAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getPushAccess().getFrequencyAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group_1__3__Impl"


    // $ANTLR start "rule__Push__Group_1__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2050:1: rule__Push__Group_1__4 : rule__Push__Group_1__4__Impl ;
    public final void rule__Push__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2054:1: ( rule__Push__Group_1__4__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2055:2: rule__Push__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Push__Group_1__4__Impl_in_rule__Push__Group_1__44225);
            rule__Push__Group_1__4__Impl();

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
    // $ANTLR end "rule__Push__Group_1__4"


    // $ANTLR start "rule__Push__Group_1__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2061:1: rule__Push__Group_1__4__Impl : ( 'and' ) ;
    public final void rule__Push__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2065:1: ( ( 'and' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2066:1: ( 'and' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2066:1: ( 'and' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2067:1: 'and'
            {
             before(grammarAccess.getPushAccess().getAndKeyword_1_4()); 
            match(input,46,FOLLOW_46_in_rule__Push__Group_1__4__Impl4253); 
             after(grammarAccess.getPushAccess().getAndKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group_1__4__Impl"


    // $ANTLR start "rule__Pull__Group_1__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2090:1: rule__Pull__Group_1__0 : rule__Pull__Group_1__0__Impl rule__Pull__Group_1__1 ;
    public final void rule__Pull__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2094:1: ( rule__Pull__Group_1__0__Impl rule__Pull__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2095:2: rule__Pull__Group_1__0__Impl rule__Pull__Group_1__1
            {
            pushFollow(FOLLOW_rule__Pull__Group_1__0__Impl_in_rule__Pull__Group_1__04294);
            rule__Pull__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pull__Group_1__1_in_rule__Pull__Group_1__04297);
            rule__Pull__Group_1__1();

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
    // $ANTLR end "rule__Pull__Group_1__0"


    // $ANTLR start "rule__Pull__Group_1__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2102:1: rule__Pull__Group_1__0__Impl : ( 'pull' ) ;
    public final void rule__Pull__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2106:1: ( ( 'pull' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2107:1: ( 'pull' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2107:1: ( 'pull' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2108:1: 'pull'
            {
             before(grammarAccess.getPullAccess().getPullKeyword_1_0()); 
            match(input,47,FOLLOW_47_in_rule__Pull__Group_1__0__Impl4325); 
             after(grammarAccess.getPullAccess().getPullKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pull__Group_1__0__Impl"


    // $ANTLR start "rule__Pull__Group_1__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2121:1: rule__Pull__Group_1__1 : rule__Pull__Group_1__1__Impl rule__Pull__Group_1__2 ;
    public final void rule__Pull__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2125:1: ( rule__Pull__Group_1__1__Impl rule__Pull__Group_1__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2126:2: rule__Pull__Group_1__1__Impl rule__Pull__Group_1__2
            {
            pushFollow(FOLLOW_rule__Pull__Group_1__1__Impl_in_rule__Pull__Group_1__14356);
            rule__Pull__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pull__Group_1__2_in_rule__Pull__Group_1__14359);
            rule__Pull__Group_1__2();

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
    // $ANTLR end "rule__Pull__Group_1__1"


    // $ANTLR start "rule__Pull__Group_1__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2133:1: rule__Pull__Group_1__1__Impl : ( 'with' ) ;
    public final void rule__Pull__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2137:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2138:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2138:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2139:1: 'with'
            {
             before(grammarAccess.getPullAccess().getWithKeyword_1_1()); 
            match(input,44,FOLLOW_44_in_rule__Pull__Group_1__1__Impl4387); 
             after(grammarAccess.getPullAccess().getWithKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pull__Group_1__1__Impl"


    // $ANTLR start "rule__Pull__Group_1__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2152:1: rule__Pull__Group_1__2 : rule__Pull__Group_1__2__Impl rule__Pull__Group_1__3 ;
    public final void rule__Pull__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2156:1: ( rule__Pull__Group_1__2__Impl rule__Pull__Group_1__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2157:2: rule__Pull__Group_1__2__Impl rule__Pull__Group_1__3
            {
            pushFollow(FOLLOW_rule__Pull__Group_1__2__Impl_in_rule__Pull__Group_1__24418);
            rule__Pull__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pull__Group_1__3_in_rule__Pull__Group_1__24421);
            rule__Pull__Group_1__3();

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
    // $ANTLR end "rule__Pull__Group_1__2"


    // $ANTLR start "rule__Pull__Group_1__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2164:1: rule__Pull__Group_1__2__Impl : ( 'Frequency' ) ;
    public final void rule__Pull__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2168:1: ( ( 'Frequency' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2169:1: ( 'Frequency' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2169:1: ( 'Frequency' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2170:1: 'Frequency'
            {
             before(grammarAccess.getPullAccess().getFrequencyKeyword_1_2()); 
            match(input,45,FOLLOW_45_in_rule__Pull__Group_1__2__Impl4449); 
             after(grammarAccess.getPullAccess().getFrequencyKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pull__Group_1__2__Impl"


    // $ANTLR start "rule__Pull__Group_1__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2183:1: rule__Pull__Group_1__3 : rule__Pull__Group_1__3__Impl rule__Pull__Group_1__4 ;
    public final void rule__Pull__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2187:1: ( rule__Pull__Group_1__3__Impl rule__Pull__Group_1__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2188:2: rule__Pull__Group_1__3__Impl rule__Pull__Group_1__4
            {
            pushFollow(FOLLOW_rule__Pull__Group_1__3__Impl_in_rule__Pull__Group_1__34480);
            rule__Pull__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pull__Group_1__4_in_rule__Pull__Group_1__34483);
            rule__Pull__Group_1__4();

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
    // $ANTLR end "rule__Pull__Group_1__3"


    // $ANTLR start "rule__Pull__Group_1__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2195:1: rule__Pull__Group_1__3__Impl : ( ':' ) ;
    public final void rule__Pull__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2199:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2200:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2200:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2201:1: ':'
            {
             before(grammarAccess.getPullAccess().getColonKeyword_1_3()); 
            match(input,39,FOLLOW_39_in_rule__Pull__Group_1__3__Impl4511); 
             after(grammarAccess.getPullAccess().getColonKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pull__Group_1__3__Impl"


    // $ANTLR start "rule__Pull__Group_1__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2214:1: rule__Pull__Group_1__4 : rule__Pull__Group_1__4__Impl ;
    public final void rule__Pull__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2218:1: ( rule__Pull__Group_1__4__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2219:2: rule__Pull__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Pull__Group_1__4__Impl_in_rule__Pull__Group_1__44542);
            rule__Pull__Group_1__4__Impl();

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
    // $ANTLR end "rule__Pull__Group_1__4"


    // $ANTLR start "rule__Pull__Group_1__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2225:1: rule__Pull__Group_1__4__Impl : ( ( rule__Pull__FrequencyAssignment_1_4 ) ) ;
    public final void rule__Pull__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2229:1: ( ( ( rule__Pull__FrequencyAssignment_1_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2230:1: ( ( rule__Pull__FrequencyAssignment_1_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2230:1: ( ( rule__Pull__FrequencyAssignment_1_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2231:1: ( rule__Pull__FrequencyAssignment_1_4 )
            {
             before(grammarAccess.getPullAccess().getFrequencyAssignment_1_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2232:1: ( rule__Pull__FrequencyAssignment_1_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2232:2: rule__Pull__FrequencyAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Pull__FrequencyAssignment_1_4_in_rule__Pull__Group_1__4__Impl4569);
            rule__Pull__FrequencyAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getPullAccess().getFrequencyAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pull__Group_1__4__Impl"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2252:1: rule__TimeDivisionMultiplexing__Group__0 : rule__TimeDivisionMultiplexing__Group__0__Impl rule__TimeDivisionMultiplexing__Group__1 ;
    public final void rule__TimeDivisionMultiplexing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2256:1: ( rule__TimeDivisionMultiplexing__Group__0__Impl rule__TimeDivisionMultiplexing__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2257:2: rule__TimeDivisionMultiplexing__Group__0__Impl rule__TimeDivisionMultiplexing__Group__1
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__0__Impl_in_rule__TimeDivisionMultiplexing__Group__04609);
            rule__TimeDivisionMultiplexing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__1_in_rule__TimeDivisionMultiplexing__Group__04612);
            rule__TimeDivisionMultiplexing__Group__1();

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
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__0"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2264:1: rule__TimeDivisionMultiplexing__Group__0__Impl : ( 'timeDivisionMultiplexing' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2268:1: ( ( 'timeDivisionMultiplexing' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2269:1: ( 'timeDivisionMultiplexing' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2269:1: ( 'timeDivisionMultiplexing' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2270:1: 'timeDivisionMultiplexing'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getTimeDivisionMultiplexingKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__TimeDivisionMultiplexing__Group__0__Impl4640); 
             after(grammarAccess.getTimeDivisionMultiplexingAccess().getTimeDivisionMultiplexingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__0__Impl"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2283:1: rule__TimeDivisionMultiplexing__Group__1 : rule__TimeDivisionMultiplexing__Group__1__Impl rule__TimeDivisionMultiplexing__Group__2 ;
    public final void rule__TimeDivisionMultiplexing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2287:1: ( rule__TimeDivisionMultiplexing__Group__1__Impl rule__TimeDivisionMultiplexing__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2288:2: rule__TimeDivisionMultiplexing__Group__1__Impl rule__TimeDivisionMultiplexing__Group__2
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__1__Impl_in_rule__TimeDivisionMultiplexing__Group__14671);
            rule__TimeDivisionMultiplexing__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__2_in_rule__TimeDivisionMultiplexing__Group__14674);
            rule__TimeDivisionMultiplexing__Group__2();

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
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__1"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2295:1: rule__TimeDivisionMultiplexing__Group__1__Impl : ( 'with' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2299:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2300:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2300:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2301:1: 'with'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getWithKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__TimeDivisionMultiplexing__Group__1__Impl4702); 
             after(grammarAccess.getTimeDivisionMultiplexingAccess().getWithKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__1__Impl"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2314:1: rule__TimeDivisionMultiplexing__Group__2 : rule__TimeDivisionMultiplexing__Group__2__Impl rule__TimeDivisionMultiplexing__Group__3 ;
    public final void rule__TimeDivisionMultiplexing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2318:1: ( rule__TimeDivisionMultiplexing__Group__2__Impl rule__TimeDivisionMultiplexing__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2319:2: rule__TimeDivisionMultiplexing__Group__2__Impl rule__TimeDivisionMultiplexing__Group__3
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__2__Impl_in_rule__TimeDivisionMultiplexing__Group__24733);
            rule__TimeDivisionMultiplexing__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__3_in_rule__TimeDivisionMultiplexing__Group__24736);
            rule__TimeDivisionMultiplexing__Group__3();

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
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__2"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2326:1: rule__TimeDivisionMultiplexing__Group__2__Impl : ( 'Frequency' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2330:1: ( ( 'Frequency' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2331:1: ( 'Frequency' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2331:1: ( 'Frequency' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2332:1: 'Frequency'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getFrequencyKeyword_2()); 
            match(input,45,FOLLOW_45_in_rule__TimeDivisionMultiplexing__Group__2__Impl4764); 
             after(grammarAccess.getTimeDivisionMultiplexingAccess().getFrequencyKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__2__Impl"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2345:1: rule__TimeDivisionMultiplexing__Group__3 : rule__TimeDivisionMultiplexing__Group__3__Impl rule__TimeDivisionMultiplexing__Group__4 ;
    public final void rule__TimeDivisionMultiplexing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2349:1: ( rule__TimeDivisionMultiplexing__Group__3__Impl rule__TimeDivisionMultiplexing__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2350:2: rule__TimeDivisionMultiplexing__Group__3__Impl rule__TimeDivisionMultiplexing__Group__4
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__3__Impl_in_rule__TimeDivisionMultiplexing__Group__34795);
            rule__TimeDivisionMultiplexing__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__4_in_rule__TimeDivisionMultiplexing__Group__34798);
            rule__TimeDivisionMultiplexing__Group__4();

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
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__3"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2357:1: rule__TimeDivisionMultiplexing__Group__3__Impl : ( ':' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2361:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2362:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2362:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2363:1: ':'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getColonKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__TimeDivisionMultiplexing__Group__3__Impl4826); 
             after(grammarAccess.getTimeDivisionMultiplexingAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__3__Impl"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2376:1: rule__TimeDivisionMultiplexing__Group__4 : rule__TimeDivisionMultiplexing__Group__4__Impl rule__TimeDivisionMultiplexing__Group__5 ;
    public final void rule__TimeDivisionMultiplexing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2380:1: ( rule__TimeDivisionMultiplexing__Group__4__Impl rule__TimeDivisionMultiplexing__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2381:2: rule__TimeDivisionMultiplexing__Group__4__Impl rule__TimeDivisionMultiplexing__Group__5
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__4__Impl_in_rule__TimeDivisionMultiplexing__Group__44857);
            rule__TimeDivisionMultiplexing__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__5_in_rule__TimeDivisionMultiplexing__Group__44860);
            rule__TimeDivisionMultiplexing__Group__5();

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
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__4"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2388:1: rule__TimeDivisionMultiplexing__Group__4__Impl : ( ( rule__TimeDivisionMultiplexing__FrequencyAssignment_4 ) ) ;
    public final void rule__TimeDivisionMultiplexing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2392:1: ( ( ( rule__TimeDivisionMultiplexing__FrequencyAssignment_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2393:1: ( ( rule__TimeDivisionMultiplexing__FrequencyAssignment_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2393:1: ( ( rule__TimeDivisionMultiplexing__FrequencyAssignment_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2394:1: ( rule__TimeDivisionMultiplexing__FrequencyAssignment_4 )
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getFrequencyAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2395:1: ( rule__TimeDivisionMultiplexing__FrequencyAssignment_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2395:2: rule__TimeDivisionMultiplexing__FrequencyAssignment_4
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__FrequencyAssignment_4_in_rule__TimeDivisionMultiplexing__Group__4__Impl4887);
            rule__TimeDivisionMultiplexing__FrequencyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTimeDivisionMultiplexingAccess().getFrequencyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__4__Impl"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2405:1: rule__TimeDivisionMultiplexing__Group__5 : rule__TimeDivisionMultiplexing__Group__5__Impl rule__TimeDivisionMultiplexing__Group__6 ;
    public final void rule__TimeDivisionMultiplexing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2409:1: ( rule__TimeDivisionMultiplexing__Group__5__Impl rule__TimeDivisionMultiplexing__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2410:2: rule__TimeDivisionMultiplexing__Group__5__Impl rule__TimeDivisionMultiplexing__Group__6
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__5__Impl_in_rule__TimeDivisionMultiplexing__Group__54917);
            rule__TimeDivisionMultiplexing__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__6_in_rule__TimeDivisionMultiplexing__Group__54920);
            rule__TimeDivisionMultiplexing__Group__6();

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
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__5"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2417:1: rule__TimeDivisionMultiplexing__Group__5__Impl : ( 'and' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2421:1: ( ( 'and' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2422:1: ( 'and' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2422:1: ( 'and' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2423:1: 'and'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getAndKeyword_5()); 
            match(input,46,FOLLOW_46_in_rule__TimeDivisionMultiplexing__Group__5__Impl4948); 
             after(grammarAccess.getTimeDivisionMultiplexingAccess().getAndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__5__Impl"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2436:1: rule__TimeDivisionMultiplexing__Group__6 : rule__TimeDivisionMultiplexing__Group__6__Impl rule__TimeDivisionMultiplexing__Group__7 ;
    public final void rule__TimeDivisionMultiplexing__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2440:1: ( rule__TimeDivisionMultiplexing__Group__6__Impl rule__TimeDivisionMultiplexing__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2441:2: rule__TimeDivisionMultiplexing__Group__6__Impl rule__TimeDivisionMultiplexing__Group__7
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__6__Impl_in_rule__TimeDivisionMultiplexing__Group__64979);
            rule__TimeDivisionMultiplexing__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__7_in_rule__TimeDivisionMultiplexing__Group__64982);
            rule__TimeDivisionMultiplexing__Group__7();

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
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__6"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2448:1: rule__TimeDivisionMultiplexing__Group__6__Impl : ( 'Duration' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2452:1: ( ( 'Duration' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2453:1: ( 'Duration' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2453:1: ( 'Duration' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2454:1: 'Duration'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getDurationKeyword_6()); 
            match(input,49,FOLLOW_49_in_rule__TimeDivisionMultiplexing__Group__6__Impl5010); 
             after(grammarAccess.getTimeDivisionMultiplexingAccess().getDurationKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__6__Impl"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2467:1: rule__TimeDivisionMultiplexing__Group__7 : rule__TimeDivisionMultiplexing__Group__7__Impl rule__TimeDivisionMultiplexing__Group__8 ;
    public final void rule__TimeDivisionMultiplexing__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2471:1: ( rule__TimeDivisionMultiplexing__Group__7__Impl rule__TimeDivisionMultiplexing__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2472:2: rule__TimeDivisionMultiplexing__Group__7__Impl rule__TimeDivisionMultiplexing__Group__8
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__7__Impl_in_rule__TimeDivisionMultiplexing__Group__75041);
            rule__TimeDivisionMultiplexing__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__8_in_rule__TimeDivisionMultiplexing__Group__75044);
            rule__TimeDivisionMultiplexing__Group__8();

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
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__7"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2479:1: rule__TimeDivisionMultiplexing__Group__7__Impl : ( ':' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2483:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2484:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2484:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2485:1: ':'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getColonKeyword_7()); 
            match(input,39,FOLLOW_39_in_rule__TimeDivisionMultiplexing__Group__7__Impl5072); 
             after(grammarAccess.getTimeDivisionMultiplexingAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__7__Impl"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2498:1: rule__TimeDivisionMultiplexing__Group__8 : rule__TimeDivisionMultiplexing__Group__8__Impl rule__TimeDivisionMultiplexing__Group__9 ;
    public final void rule__TimeDivisionMultiplexing__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2502:1: ( rule__TimeDivisionMultiplexing__Group__8__Impl rule__TimeDivisionMultiplexing__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2503:2: rule__TimeDivisionMultiplexing__Group__8__Impl rule__TimeDivisionMultiplexing__Group__9
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__8__Impl_in_rule__TimeDivisionMultiplexing__Group__85103);
            rule__TimeDivisionMultiplexing__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__9_in_rule__TimeDivisionMultiplexing__Group__85106);
            rule__TimeDivisionMultiplexing__Group__9();

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
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__8"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__8__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2510:1: rule__TimeDivisionMultiplexing__Group__8__Impl : ( ( rule__TimeDivisionMultiplexing__DurationAssignment_8 ) ) ;
    public final void rule__TimeDivisionMultiplexing__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2514:1: ( ( ( rule__TimeDivisionMultiplexing__DurationAssignment_8 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2515:1: ( ( rule__TimeDivisionMultiplexing__DurationAssignment_8 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2515:1: ( ( rule__TimeDivisionMultiplexing__DurationAssignment_8 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2516:1: ( rule__TimeDivisionMultiplexing__DurationAssignment_8 )
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getDurationAssignment_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2517:1: ( rule__TimeDivisionMultiplexing__DurationAssignment_8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2517:2: rule__TimeDivisionMultiplexing__DurationAssignment_8
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__DurationAssignment_8_in_rule__TimeDivisionMultiplexing__Group__8__Impl5133);
            rule__TimeDivisionMultiplexing__DurationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTimeDivisionMultiplexingAccess().getDurationAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__8__Impl"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__9"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2527:1: rule__TimeDivisionMultiplexing__Group__9 : rule__TimeDivisionMultiplexing__Group__9__Impl rule__TimeDivisionMultiplexing__Group__10 ;
    public final void rule__TimeDivisionMultiplexing__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2531:1: ( rule__TimeDivisionMultiplexing__Group__9__Impl rule__TimeDivisionMultiplexing__Group__10 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2532:2: rule__TimeDivisionMultiplexing__Group__9__Impl rule__TimeDivisionMultiplexing__Group__10
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__9__Impl_in_rule__TimeDivisionMultiplexing__Group__95163);
            rule__TimeDivisionMultiplexing__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__10_in_rule__TimeDivisionMultiplexing__Group__95166);
            rule__TimeDivisionMultiplexing__Group__10();

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
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__9"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__9__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2539:1: rule__TimeDivisionMultiplexing__Group__9__Impl : ( 'and' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2543:1: ( ( 'and' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2544:1: ( 'and' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2544:1: ( 'and' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2545:1: 'and'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getAndKeyword_9()); 
            match(input,46,FOLLOW_46_in_rule__TimeDivisionMultiplexing__Group__9__Impl5194); 
             after(grammarAccess.getTimeDivisionMultiplexingAccess().getAndKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__9__Impl"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__10"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2558:1: rule__TimeDivisionMultiplexing__Group__10 : rule__TimeDivisionMultiplexing__Group__10__Impl rule__TimeDivisionMultiplexing__Group__11 ;
    public final void rule__TimeDivisionMultiplexing__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2562:1: ( rule__TimeDivisionMultiplexing__Group__10__Impl rule__TimeDivisionMultiplexing__Group__11 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2563:2: rule__TimeDivisionMultiplexing__Group__10__Impl rule__TimeDivisionMultiplexing__Group__11
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__10__Impl_in_rule__TimeDivisionMultiplexing__Group__105225);
            rule__TimeDivisionMultiplexing__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__11_in_rule__TimeDivisionMultiplexing__Group__105228);
            rule__TimeDivisionMultiplexing__Group__11();

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
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__10"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__10__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2570:1: rule__TimeDivisionMultiplexing__Group__10__Impl : ( 'timeSlot' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2574:1: ( ( 'timeSlot' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2575:1: ( 'timeSlot' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2575:1: ( 'timeSlot' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2576:1: 'timeSlot'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getTimeSlotKeyword_10()); 
            match(input,50,FOLLOW_50_in_rule__TimeDivisionMultiplexing__Group__10__Impl5256); 
             after(grammarAccess.getTimeDivisionMultiplexingAccess().getTimeSlotKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__10__Impl"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__11"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2589:1: rule__TimeDivisionMultiplexing__Group__11 : rule__TimeDivisionMultiplexing__Group__11__Impl rule__TimeDivisionMultiplexing__Group__12 ;
    public final void rule__TimeDivisionMultiplexing__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2593:1: ( rule__TimeDivisionMultiplexing__Group__11__Impl rule__TimeDivisionMultiplexing__Group__12 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2594:2: rule__TimeDivisionMultiplexing__Group__11__Impl rule__TimeDivisionMultiplexing__Group__12
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__11__Impl_in_rule__TimeDivisionMultiplexing__Group__115287);
            rule__TimeDivisionMultiplexing__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__12_in_rule__TimeDivisionMultiplexing__Group__115290);
            rule__TimeDivisionMultiplexing__Group__12();

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
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__11"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__11__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2601:1: rule__TimeDivisionMultiplexing__Group__11__Impl : ( ':' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2605:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2606:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2606:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2607:1: ':'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getColonKeyword_11()); 
            match(input,39,FOLLOW_39_in_rule__TimeDivisionMultiplexing__Group__11__Impl5318); 
             after(grammarAccess.getTimeDivisionMultiplexingAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__11__Impl"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__12"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2620:1: rule__TimeDivisionMultiplexing__Group__12 : rule__TimeDivisionMultiplexing__Group__12__Impl ;
    public final void rule__TimeDivisionMultiplexing__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2624:1: ( rule__TimeDivisionMultiplexing__Group__12__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2625:2: rule__TimeDivisionMultiplexing__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__12__Impl_in_rule__TimeDivisionMultiplexing__Group__125349);
            rule__TimeDivisionMultiplexing__Group__12__Impl();

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
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__12"


    // $ANTLR start "rule__TimeDivisionMultiplexing__Group__12__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2631:1: rule__TimeDivisionMultiplexing__Group__12__Impl : ( ( rule__TimeDivisionMultiplexing__TimeSlotAssignment_12 ) ) ;
    public final void rule__TimeDivisionMultiplexing__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2635:1: ( ( ( rule__TimeDivisionMultiplexing__TimeSlotAssignment_12 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2636:1: ( ( rule__TimeDivisionMultiplexing__TimeSlotAssignment_12 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2636:1: ( ( rule__TimeDivisionMultiplexing__TimeSlotAssignment_12 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2637:1: ( rule__TimeDivisionMultiplexing__TimeSlotAssignment_12 )
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getTimeSlotAssignment_12()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2638:1: ( rule__TimeDivisionMultiplexing__TimeSlotAssignment_12 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2638:2: rule__TimeDivisionMultiplexing__TimeSlotAssignment_12
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__TimeSlotAssignment_12_in_rule__TimeDivisionMultiplexing__Group__12__Impl5376);
            rule__TimeDivisionMultiplexing__TimeSlotAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getTimeDivisionMultiplexingAccess().getTimeSlotAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__Group__12__Impl"


    // $ANTLR start "rule__Representation__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2674:1: rule__Representation__Group__0 : rule__Representation__Group__0__Impl rule__Representation__Group__1 ;
    public final void rule__Representation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2678:1: ( rule__Representation__Group__0__Impl rule__Representation__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2679:2: rule__Representation__Group__0__Impl rule__Representation__Group__1
            {
            pushFollow(FOLLOW_rule__Representation__Group__0__Impl_in_rule__Representation__Group__05432);
            rule__Representation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__1_in_rule__Representation__Group__05435);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2686:1: rule__Representation__Group__0__Impl : ( ( rule__Representation__Alternatives_0 ) ) ;
    public final void rule__Representation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2690:1: ( ( ( rule__Representation__Alternatives_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2691:1: ( ( rule__Representation__Alternatives_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2691:1: ( ( rule__Representation__Alternatives_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2692:1: ( rule__Representation__Alternatives_0 )
            {
             before(grammarAccess.getRepresentationAccess().getAlternatives_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2693:1: ( rule__Representation__Alternatives_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2693:2: rule__Representation__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Representation__Alternatives_0_in_rule__Representation__Group__0__Impl5462);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2703:1: rule__Representation__Group__1 : rule__Representation__Group__1__Impl rule__Representation__Group__2 ;
    public final void rule__Representation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2707:1: ( rule__Representation__Group__1__Impl rule__Representation__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2708:2: rule__Representation__Group__1__Impl rule__Representation__Group__2
            {
            pushFollow(FOLLOW_rule__Representation__Group__1__Impl_in_rule__Representation__Group__15492);
            rule__Representation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__2_in_rule__Representation__Group__15495);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2715:1: rule__Representation__Group__1__Impl : ( ( rule__Representation__NameAssignment_1 ) ) ;
    public final void rule__Representation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2719:1: ( ( ( rule__Representation__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2720:1: ( ( rule__Representation__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2720:1: ( ( rule__Representation__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2721:1: ( rule__Representation__NameAssignment_1 )
            {
             before(grammarAccess.getRepresentationAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2722:1: ( rule__Representation__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2722:2: rule__Representation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Representation__NameAssignment_1_in_rule__Representation__Group__1__Impl5522);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2732:1: rule__Representation__Group__2 : rule__Representation__Group__2__Impl rule__Representation__Group__3 ;
    public final void rule__Representation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2736:1: ( rule__Representation__Group__2__Impl rule__Representation__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2737:2: rule__Representation__Group__2__Impl rule__Representation__Group__3
            {
            pushFollow(FOLLOW_rule__Representation__Group__2__Impl_in_rule__Representation__Group__25552);
            rule__Representation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__3_in_rule__Representation__Group__25555);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2744:1: rule__Representation__Group__2__Impl : ( 'is' ) ;
    public final void rule__Representation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2748:1: ( ( 'is' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2749:1: ( 'is' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2749:1: ( 'is' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2750:1: 'is'
            {
             before(grammarAccess.getRepresentationAccess().getIsKeyword_2()); 
            match(input,51,FOLLOW_51_in_rule__Representation__Group__2__Impl5583); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2763:1: rule__Representation__Group__3 : rule__Representation__Group__3__Impl rule__Representation__Group__4 ;
    public final void rule__Representation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2767:1: ( rule__Representation__Group__3__Impl rule__Representation__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2768:2: rule__Representation__Group__3__Impl rule__Representation__Group__4
            {
            pushFollow(FOLLOW_rule__Representation__Group__3__Impl_in_rule__Representation__Group__35614);
            rule__Representation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__4_in_rule__Representation__Group__35617);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2775:1: rule__Representation__Group__3__Impl : ( ( rule__Representation__TypeAssignment_3 ) ) ;
    public final void rule__Representation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2779:1: ( ( ( rule__Representation__TypeAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2780:1: ( ( rule__Representation__TypeAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2780:1: ( ( rule__Representation__TypeAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2781:1: ( rule__Representation__TypeAssignment_3 )
            {
             before(grammarAccess.getRepresentationAccess().getTypeAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2782:1: ( rule__Representation__TypeAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2782:2: rule__Representation__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Representation__TypeAssignment_3_in_rule__Representation__Group__3__Impl5644);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2792:1: rule__Representation__Group__4 : rule__Representation__Group__4__Impl rule__Representation__Group__5 ;
    public final void rule__Representation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2796:1: ( rule__Representation__Group__4__Impl rule__Representation__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2797:2: rule__Representation__Group__4__Impl rule__Representation__Group__5
            {
            pushFollow(FOLLOW_rule__Representation__Group__4__Impl_in_rule__Representation__Group__45674);
            rule__Representation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__5_in_rule__Representation__Group__45677);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2804:1: rule__Representation__Group__4__Impl : ( 'by' ) ;
    public final void rule__Representation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2808:1: ( ( 'by' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2809:1: ( 'by' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2809:1: ( 'by' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2810:1: 'by'
            {
             before(grammarAccess.getRepresentationAccess().getByKeyword_4()); 
            match(input,52,FOLLOW_52_in_rule__Representation__Group__4__Impl5705); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2823:1: rule__Representation__Group__5 : rule__Representation__Group__5__Impl rule__Representation__Group__6 ;
    public final void rule__Representation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2827:1: ( rule__Representation__Group__5__Impl rule__Representation__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2828:2: rule__Representation__Group__5__Impl rule__Representation__Group__6
            {
            pushFollow(FOLLOW_rule__Representation__Group__5__Impl_in_rule__Representation__Group__55736);
            rule__Representation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__6_in_rule__Representation__Group__55739);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2835:1: rule__Representation__Group__5__Impl : ( ( rule__Representation__ByteCountAssignment_5 ) ) ;
    public final void rule__Representation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2839:1: ( ( ( rule__Representation__ByteCountAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2840:1: ( ( rule__Representation__ByteCountAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2840:1: ( ( rule__Representation__ByteCountAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2841:1: ( rule__Representation__ByteCountAssignment_5 )
            {
             before(grammarAccess.getRepresentationAccess().getByteCountAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2842:1: ( rule__Representation__ByteCountAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2842:2: rule__Representation__ByteCountAssignment_5
            {
            pushFollow(FOLLOW_rule__Representation__ByteCountAssignment_5_in_rule__Representation__Group__5__Impl5766);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2852:1: rule__Representation__Group__6 : rule__Representation__Group__6__Impl ;
    public final void rule__Representation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2856:1: ( rule__Representation__Group__6__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2857:2: rule__Representation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Representation__Group__6__Impl_in_rule__Representation__Group__65796);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2863:1: rule__Representation__Group__6__Impl : ( ( rule__Representation__Alternatives_6 ) ) ;
    public final void rule__Representation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2867:1: ( ( ( rule__Representation__Alternatives_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2868:1: ( ( rule__Representation__Alternatives_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2868:1: ( ( rule__Representation__Alternatives_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2869:1: ( rule__Representation__Alternatives_6 )
            {
             before(grammarAccess.getRepresentationAccess().getAlternatives_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2870:1: ( rule__Representation__Alternatives_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2870:2: rule__Representation__Alternatives_6
            {
            pushFollow(FOLLOW_rule__Representation__Alternatives_6_in_rule__Representation__Group__6__Impl5823);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2894:1: rule__Calculated__Group__0 : rule__Calculated__Group__0__Impl rule__Calculated__Group__1 ;
    public final void rule__Calculated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2898:1: ( rule__Calculated__Group__0__Impl rule__Calculated__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2899:2: rule__Calculated__Group__0__Impl rule__Calculated__Group__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group__0__Impl_in_rule__Calculated__Group__05867);
            rule__Calculated__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__1_in_rule__Calculated__Group__05870);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2906:1: rule__Calculated__Group__0__Impl : ( ( rule__Calculated__Alternatives_0 ) ) ;
    public final void rule__Calculated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2910:1: ( ( ( rule__Calculated__Alternatives_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2911:1: ( ( rule__Calculated__Alternatives_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2911:1: ( ( rule__Calculated__Alternatives_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2912:1: ( rule__Calculated__Alternatives_0 )
            {
             before(grammarAccess.getCalculatedAccess().getAlternatives_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2913:1: ( rule__Calculated__Alternatives_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2913:2: rule__Calculated__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Calculated__Alternatives_0_in_rule__Calculated__Group__0__Impl5897);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2923:1: rule__Calculated__Group__1 : rule__Calculated__Group__1__Impl rule__Calculated__Group__2 ;
    public final void rule__Calculated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2927:1: ( rule__Calculated__Group__1__Impl rule__Calculated__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2928:2: rule__Calculated__Group__1__Impl rule__Calculated__Group__2
            {
            pushFollow(FOLLOW_rule__Calculated__Group__1__Impl_in_rule__Calculated__Group__15927);
            rule__Calculated__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__2_in_rule__Calculated__Group__15930);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2935:1: rule__Calculated__Group__1__Impl : ( ( rule__Calculated__NameAssignment_1 ) ) ;
    public final void rule__Calculated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2939:1: ( ( ( rule__Calculated__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2940:1: ( ( rule__Calculated__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2940:1: ( ( rule__Calculated__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2941:1: ( rule__Calculated__NameAssignment_1 )
            {
             before(grammarAccess.getCalculatedAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2942:1: ( rule__Calculated__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2942:2: rule__Calculated__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Calculated__NameAssignment_1_in_rule__Calculated__Group__1__Impl5957);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2952:1: rule__Calculated__Group__2 : rule__Calculated__Group__2__Impl rule__Calculated__Group__3 ;
    public final void rule__Calculated__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2956:1: ( rule__Calculated__Group__2__Impl rule__Calculated__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2957:2: rule__Calculated__Group__2__Impl rule__Calculated__Group__3
            {
            pushFollow(FOLLOW_rule__Calculated__Group__2__Impl_in_rule__Calculated__Group__25987);
            rule__Calculated__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__3_in_rule__Calculated__Group__25990);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2964:1: rule__Calculated__Group__2__Impl : ( 'as' ) ;
    public final void rule__Calculated__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2968:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2969:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2969:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2970:1: 'as'
            {
             before(grammarAccess.getCalculatedAccess().getAsKeyword_2()); 
            match(input,53,FOLLOW_53_in_rule__Calculated__Group__2__Impl6018); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2983:1: rule__Calculated__Group__3 : rule__Calculated__Group__3__Impl rule__Calculated__Group__4 ;
    public final void rule__Calculated__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2987:1: ( rule__Calculated__Group__3__Impl rule__Calculated__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2988:2: rule__Calculated__Group__3__Impl rule__Calculated__Group__4
            {
            pushFollow(FOLLOW_rule__Calculated__Group__3__Impl_in_rule__Calculated__Group__36049);
            rule__Calculated__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__4_in_rule__Calculated__Group__36052);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2995:1: rule__Calculated__Group__3__Impl : ( ( rule__Calculated__RepresentationAssignment_3 ) ) ;
    public final void rule__Calculated__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2999:1: ( ( ( rule__Calculated__RepresentationAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3000:1: ( ( rule__Calculated__RepresentationAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3000:1: ( ( rule__Calculated__RepresentationAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3001:1: ( rule__Calculated__RepresentationAssignment_3 )
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3002:1: ( rule__Calculated__RepresentationAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3002:2: rule__Calculated__RepresentationAssignment_3
            {
            pushFollow(FOLLOW_rule__Calculated__RepresentationAssignment_3_in_rule__Calculated__Group__3__Impl6079);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3012:1: rule__Calculated__Group__4 : rule__Calculated__Group__4__Impl rule__Calculated__Group__5 ;
    public final void rule__Calculated__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3016:1: ( rule__Calculated__Group__4__Impl rule__Calculated__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3017:2: rule__Calculated__Group__4__Impl rule__Calculated__Group__5
            {
            pushFollow(FOLLOW_rule__Calculated__Group__4__Impl_in_rule__Calculated__Group__46109);
            rule__Calculated__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__5_in_rule__Calculated__Group__46112);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3024:1: rule__Calculated__Group__4__Impl : ( 'by' ) ;
    public final void rule__Calculated__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3028:1: ( ( 'by' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3029:1: ( 'by' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3029:1: ( 'by' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3030:1: 'by'
            {
             before(grammarAccess.getCalculatedAccess().getByKeyword_4()); 
            match(input,52,FOLLOW_52_in_rule__Calculated__Group__4__Impl6140); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3043:1: rule__Calculated__Group__5 : rule__Calculated__Group__5__Impl rule__Calculated__Group__6 ;
    public final void rule__Calculated__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3047:1: ( rule__Calculated__Group__5__Impl rule__Calculated__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3048:2: rule__Calculated__Group__5__Impl rule__Calculated__Group__6
            {
            pushFollow(FOLLOW_rule__Calculated__Group__5__Impl_in_rule__Calculated__Group__56171);
            rule__Calculated__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__6_in_rule__Calculated__Group__56174);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3055:1: rule__Calculated__Group__5__Impl : ( ( rule__Calculated__MethodNameAssignment_5 ) ) ;
    public final void rule__Calculated__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3059:1: ( ( ( rule__Calculated__MethodNameAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3060:1: ( ( rule__Calculated__MethodNameAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3060:1: ( ( rule__Calculated__MethodNameAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3061:1: ( rule__Calculated__MethodNameAssignment_5 )
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3062:1: ( rule__Calculated__MethodNameAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3062:2: rule__Calculated__MethodNameAssignment_5
            {
            pushFollow(FOLLOW_rule__Calculated__MethodNameAssignment_5_in_rule__Calculated__Group__5__Impl6201);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3072:1: rule__Calculated__Group__6 : rule__Calculated__Group__6__Impl rule__Calculated__Group__7 ;
    public final void rule__Calculated__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3076:1: ( rule__Calculated__Group__6__Impl rule__Calculated__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3077:2: rule__Calculated__Group__6__Impl rule__Calculated__Group__7
            {
            pushFollow(FOLLOW_rule__Calculated__Group__6__Impl_in_rule__Calculated__Group__66231);
            rule__Calculated__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__7_in_rule__Calculated__Group__66234);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3084:1: rule__Calculated__Group__6__Impl : ( ( rule__Calculated__Group_6__0 )? ) ;
    public final void rule__Calculated__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3088:1: ( ( ( rule__Calculated__Group_6__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3089:1: ( ( rule__Calculated__Group_6__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3089:1: ( ( rule__Calculated__Group_6__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3090:1: ( rule__Calculated__Group_6__0 )?
            {
             before(grammarAccess.getCalculatedAccess().getGroup_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3091:1: ( rule__Calculated__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3091:2: rule__Calculated__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Calculated__Group_6__0_in_rule__Calculated__Group__6__Impl6261);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3101:1: rule__Calculated__Group__7 : rule__Calculated__Group__7__Impl rule__Calculated__Group__8 ;
    public final void rule__Calculated__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3105:1: ( rule__Calculated__Group__7__Impl rule__Calculated__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3106:2: rule__Calculated__Group__7__Impl rule__Calculated__Group__8
            {
            pushFollow(FOLLOW_rule__Calculated__Group__7__Impl_in_rule__Calculated__Group__76292);
            rule__Calculated__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__8_in_rule__Calculated__Group__76295);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3113:1: rule__Calculated__Group__7__Impl : ( 'with' ) ;
    public final void rule__Calculated__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3117:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3118:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3118:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3119:1: 'with'
            {
             before(grammarAccess.getCalculatedAccess().getWithKeyword_7()); 
            match(input,44,FOLLOW_44_in_rule__Calculated__Group__7__Impl6323); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3132:1: rule__Calculated__Group__8 : rule__Calculated__Group__8__Impl rule__Calculated__Group__9 ;
    public final void rule__Calculated__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3136:1: ( rule__Calculated__Group__8__Impl rule__Calculated__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3137:2: rule__Calculated__Group__8__Impl rule__Calculated__Group__9
            {
            pushFollow(FOLLOW_rule__Calculated__Group__8__Impl_in_rule__Calculated__Group__86354);
            rule__Calculated__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__9_in_rule__Calculated__Group__86357);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3144:1: rule__Calculated__Group__8__Impl : ( ( rule__Calculated__ParameterAssignment_8 ) ) ;
    public final void rule__Calculated__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3148:1: ( ( ( rule__Calculated__ParameterAssignment_8 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3149:1: ( ( rule__Calculated__ParameterAssignment_8 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3149:1: ( ( rule__Calculated__ParameterAssignment_8 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3150:1: ( rule__Calculated__ParameterAssignment_8 )
            {
             before(grammarAccess.getCalculatedAccess().getParameterAssignment_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3151:1: ( rule__Calculated__ParameterAssignment_8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3151:2: rule__Calculated__ParameterAssignment_8
            {
            pushFollow(FOLLOW_rule__Calculated__ParameterAssignment_8_in_rule__Calculated__Group__8__Impl6384);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3161:1: rule__Calculated__Group__9 : rule__Calculated__Group__9__Impl ;
    public final void rule__Calculated__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3165:1: ( rule__Calculated__Group__9__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3166:2: rule__Calculated__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group__9__Impl_in_rule__Calculated__Group__96414);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3172:1: rule__Calculated__Group__9__Impl : ( ( rule__Calculated__Group_9__0 )* ) ;
    public final void rule__Calculated__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3176:1: ( ( ( rule__Calculated__Group_9__0 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3177:1: ( ( rule__Calculated__Group_9__0 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3177:1: ( ( rule__Calculated__Group_9__0 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3178:1: ( rule__Calculated__Group_9__0 )*
            {
             before(grammarAccess.getCalculatedAccess().getGroup_9()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3179:1: ( rule__Calculated__Group_9__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3179:2: rule__Calculated__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Calculated__Group_9__0_in_rule__Calculated__Group__9__Impl6441);
            	    rule__Calculated__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3209:1: rule__Calculated__Group_6__0 : rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1 ;
    public final void rule__Calculated__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3213:1: ( rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3214:2: rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group_6__0__Impl_in_rule__Calculated__Group_6__06492);
            rule__Calculated__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group_6__1_in_rule__Calculated__Group_6__06495);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3221:1: rule__Calculated__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Calculated__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3225:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3226:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3226:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3227:1: ','
            {
             before(grammarAccess.getCalculatedAccess().getCommaKeyword_6_0()); 
            match(input,36,FOLLOW_36_in_rule__Calculated__Group_6__0__Impl6523); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3240:1: rule__Calculated__Group_6__1 : rule__Calculated__Group_6__1__Impl ;
    public final void rule__Calculated__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3244:1: ( rule__Calculated__Group_6__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3245:2: rule__Calculated__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group_6__1__Impl_in_rule__Calculated__Group_6__16554);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3251:1: rule__Calculated__Group_6__1__Impl : ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) ) ;
    public final void rule__Calculated__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3255:1: ( ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3256:1: ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3256:1: ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3257:1: ( rule__Calculated__MethodNameOutAssignment_6_1 )
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameOutAssignment_6_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3258:1: ( rule__Calculated__MethodNameOutAssignment_6_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3258:2: rule__Calculated__MethodNameOutAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Calculated__MethodNameOutAssignment_6_1_in_rule__Calculated__Group_6__1__Impl6581);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3272:1: rule__Calculated__Group_9__0 : rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1 ;
    public final void rule__Calculated__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3276:1: ( rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3277:2: rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group_9__0__Impl_in_rule__Calculated__Group_9__06615);
            rule__Calculated__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group_9__1_in_rule__Calculated__Group_9__06618);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3284:1: rule__Calculated__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Calculated__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3288:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3289:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3289:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3290:1: ','
            {
             before(grammarAccess.getCalculatedAccess().getCommaKeyword_9_0()); 
            match(input,36,FOLLOW_36_in_rule__Calculated__Group_9__0__Impl6646); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3303:1: rule__Calculated__Group_9__1 : rule__Calculated__Group_9__1__Impl ;
    public final void rule__Calculated__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3307:1: ( rule__Calculated__Group_9__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3308:2: rule__Calculated__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group_9__1__Impl_in_rule__Calculated__Group_9__16677);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3314:1: rule__Calculated__Group_9__1__Impl : ( ( rule__Calculated__ParameterAssignment_9_1 ) ) ;
    public final void rule__Calculated__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3318:1: ( ( ( rule__Calculated__ParameterAssignment_9_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3319:1: ( ( rule__Calculated__ParameterAssignment_9_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3319:1: ( ( rule__Calculated__ParameterAssignment_9_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3320:1: ( rule__Calculated__ParameterAssignment_9_1 )
            {
             before(grammarAccess.getCalculatedAccess().getParameterAssignment_9_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3321:1: ( rule__Calculated__ParameterAssignment_9_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3321:2: rule__Calculated__ParameterAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Calculated__ParameterAssignment_9_1_in_rule__Calculated__Group_9__1__Impl6704);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3335:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3339:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3340:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06738);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06741);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3347:1: rule__Parameter__Group__0__Impl : ( '(' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3351:1: ( ( '(' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3352:1: ( '(' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3352:1: ( '(' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3353:1: '('
            {
             before(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__Parameter__Group__0__Impl6769); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3366:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3370:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3371:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16800);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16803);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3378:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__InterpretationAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3382:1: ( ( ( rule__Parameter__InterpretationAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3383:1: ( ( rule__Parameter__InterpretationAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3383:1: ( ( rule__Parameter__InterpretationAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3384:1: ( rule__Parameter__InterpretationAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getInterpretationAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3385:1: ( rule__Parameter__InterpretationAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3385:2: rule__Parameter__InterpretationAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__InterpretationAssignment_1_in_rule__Parameter__Group__1__Impl6830);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3395:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3399:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3400:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26860);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__26863);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3407:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3411:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3412:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3412:1: ( ( rule__Parameter__Group_2__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3413:1: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3414:1: ( rule__Parameter__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==53) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3414:2: rule__Parameter__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl6890);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3424:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3428:1: ( rule__Parameter__Group__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3429:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__36921);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3435:1: rule__Parameter__Group__3__Impl : ( ')' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3439:1: ( ( ')' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3440:1: ( ')' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3440:1: ( ')' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3441:1: ')'
            {
             before(grammarAccess.getParameterAccess().getRightParenthesisKeyword_3()); 
            match(input,55,FOLLOW_55_in_rule__Parameter__Group__3__Impl6949); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3462:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3466:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3467:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__06988);
            rule__Parameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__06991);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3474:1: rule__Parameter__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3478:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3479:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3479:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3480:1: 'as'
            {
             before(grammarAccess.getParameterAccess().getAsKeyword_2_0()); 
            match(input,53,FOLLOW_53_in_rule__Parameter__Group_2__0__Impl7019); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3493:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3497:1: ( rule__Parameter__Group_2__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3498:2: rule__Parameter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__17050);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3504:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3508:1: ( ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3509:1: ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3509:1: ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3510:1: ( rule__Parameter__ArgumentTypeAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getArgumentTypeAssignment_2_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3511:1: ( rule__Parameter__ArgumentTypeAssignment_2_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3511:2: rule__Parameter__ArgumentTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Parameter__ArgumentTypeAssignment_2_1_in_rule__Parameter__Group_2__1__Impl7077);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3525:1: rule__InterpretationGroup__Group__0 : rule__InterpretationGroup__Group__0__Impl rule__InterpretationGroup__Group__1 ;
    public final void rule__InterpretationGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3529:1: ( rule__InterpretationGroup__Group__0__Impl rule__InterpretationGroup__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3530:2: rule__InterpretationGroup__Group__0__Impl rule__InterpretationGroup__Group__1
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__0__Impl_in_rule__InterpretationGroup__Group__07111);
            rule__InterpretationGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterpretationGroup__Group__1_in_rule__InterpretationGroup__Group__07114);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3537:1: rule__InterpretationGroup__Group__0__Impl : ( 'group' ) ;
    public final void rule__InterpretationGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3541:1: ( ( 'group' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3542:1: ( 'group' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3542:1: ( 'group' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3543:1: 'group'
            {
             before(grammarAccess.getInterpretationGroupAccess().getGroupKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__InterpretationGroup__Group__0__Impl7142); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3556:1: rule__InterpretationGroup__Group__1 : rule__InterpretationGroup__Group__1__Impl rule__InterpretationGroup__Group__2 ;
    public final void rule__InterpretationGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3560:1: ( rule__InterpretationGroup__Group__1__Impl rule__InterpretationGroup__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3561:2: rule__InterpretationGroup__Group__1__Impl rule__InterpretationGroup__Group__2
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__1__Impl_in_rule__InterpretationGroup__Group__17173);
            rule__InterpretationGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterpretationGroup__Group__2_in_rule__InterpretationGroup__Group__17176);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3568:1: rule__InterpretationGroup__Group__1__Impl : ( ( rule__InterpretationGroup__NameAssignment_1 ) ) ;
    public final void rule__InterpretationGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3572:1: ( ( ( rule__InterpretationGroup__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3573:1: ( ( rule__InterpretationGroup__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3573:1: ( ( rule__InterpretationGroup__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3574:1: ( rule__InterpretationGroup__NameAssignment_1 )
            {
             before(grammarAccess.getInterpretationGroupAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3575:1: ( rule__InterpretationGroup__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3575:2: rule__InterpretationGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__NameAssignment_1_in_rule__InterpretationGroup__Group__1__Impl7203);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3585:1: rule__InterpretationGroup__Group__2 : rule__InterpretationGroup__Group__2__Impl rule__InterpretationGroup__Group__3 ;
    public final void rule__InterpretationGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3589:1: ( rule__InterpretationGroup__Group__2__Impl rule__InterpretationGroup__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3590:2: rule__InterpretationGroup__Group__2__Impl rule__InterpretationGroup__Group__3
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__2__Impl_in_rule__InterpretationGroup__Group__27233);
            rule__InterpretationGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterpretationGroup__Group__3_in_rule__InterpretationGroup__Group__27236);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3597:1: rule__InterpretationGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__InterpretationGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3601:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3602:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3602:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3603:1: '{'
            {
             before(grammarAccess.getInterpretationGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__InterpretationGroup__Group__2__Impl7264); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3616:1: rule__InterpretationGroup__Group__3 : rule__InterpretationGroup__Group__3__Impl rule__InterpretationGroup__Group__4 ;
    public final void rule__InterpretationGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3620:1: ( rule__InterpretationGroup__Group__3__Impl rule__InterpretationGroup__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3621:2: rule__InterpretationGroup__Group__3__Impl rule__InterpretationGroup__Group__4
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__3__Impl_in_rule__InterpretationGroup__Group__37295);
            rule__InterpretationGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterpretationGroup__Group__4_in_rule__InterpretationGroup__Group__37298);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3628:1: rule__InterpretationGroup__Group__3__Impl : ( ( rule__InterpretationGroup__InterpretationsAssignment_3 )* ) ;
    public final void rule__InterpretationGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3632:1: ( ( ( rule__InterpretationGroup__InterpretationsAssignment_3 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3633:1: ( ( rule__InterpretationGroup__InterpretationsAssignment_3 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3633:1: ( ( rule__InterpretationGroup__InterpretationsAssignment_3 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3634:1: ( rule__InterpretationGroup__InterpretationsAssignment_3 )*
            {
             before(grammarAccess.getInterpretationGroupAccess().getInterpretationsAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3635:1: ( rule__InterpretationGroup__InterpretationsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=16 && LA20_0<=17)||(LA20_0>=56 && LA20_0<=57)||(LA20_0>=64 && LA20_0<=65)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3635:2: rule__InterpretationGroup__InterpretationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__InterpretationGroup__InterpretationsAssignment_3_in_rule__InterpretationGroup__Group__3__Impl7325);
            	    rule__InterpretationGroup__InterpretationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3645:1: rule__InterpretationGroup__Group__4 : rule__InterpretationGroup__Group__4__Impl ;
    public final void rule__InterpretationGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3649:1: ( rule__InterpretationGroup__Group__4__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3650:2: rule__InterpretationGroup__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__4__Impl_in_rule__InterpretationGroup__Group__47356);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3656:1: rule__InterpretationGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__InterpretationGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3660:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3661:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3661:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3662:1: '}'
            {
             before(grammarAccess.getInterpretationGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__InterpretationGroup__Group__4__Impl7384); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3685:1: rule__Measurement__Group__0 : rule__Measurement__Group__0__Impl rule__Measurement__Group__1 ;
    public final void rule__Measurement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3689:1: ( rule__Measurement__Group__0__Impl rule__Measurement__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3690:2: rule__Measurement__Group__0__Impl rule__Measurement__Group__1
            {
            pushFollow(FOLLOW_rule__Measurement__Group__0__Impl_in_rule__Measurement__Group__07425);
            rule__Measurement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__1_in_rule__Measurement__Group__07428);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3697:1: rule__Measurement__Group__0__Impl : ( 'measurement' ) ;
    public final void rule__Measurement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3701:1: ( ( 'measurement' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3702:1: ( 'measurement' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3702:1: ( 'measurement' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3703:1: 'measurement'
            {
             before(grammarAccess.getMeasurementAccess().getMeasurementKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__Measurement__Group__0__Impl7456); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3716:1: rule__Measurement__Group__1 : rule__Measurement__Group__1__Impl rule__Measurement__Group__2 ;
    public final void rule__Measurement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3720:1: ( rule__Measurement__Group__1__Impl rule__Measurement__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3721:2: rule__Measurement__Group__1__Impl rule__Measurement__Group__2
            {
            pushFollow(FOLLOW_rule__Measurement__Group__1__Impl_in_rule__Measurement__Group__17487);
            rule__Measurement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__2_in_rule__Measurement__Group__17490);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3728:1: rule__Measurement__Group__1__Impl : ( 'of' ) ;
    public final void rule__Measurement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3732:1: ( ( 'of' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3733:1: ( 'of' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3733:1: ( 'of' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3734:1: 'of'
            {
             before(grammarAccess.getMeasurementAccess().getOfKeyword_1()); 
            match(input,58,FOLLOW_58_in_rule__Measurement__Group__1__Impl7518); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3747:1: rule__Measurement__Group__2 : rule__Measurement__Group__2__Impl rule__Measurement__Group__3 ;
    public final void rule__Measurement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3751:1: ( rule__Measurement__Group__2__Impl rule__Measurement__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3752:2: rule__Measurement__Group__2__Impl rule__Measurement__Group__3
            {
            pushFollow(FOLLOW_rule__Measurement__Group__2__Impl_in_rule__Measurement__Group__27549);
            rule__Measurement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__3_in_rule__Measurement__Group__27552);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3759:1: rule__Measurement__Group__2__Impl : ( ( rule__Measurement__QuantityAssignment_2 ) ) ;
    public final void rule__Measurement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3763:1: ( ( ( rule__Measurement__QuantityAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3764:1: ( ( rule__Measurement__QuantityAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3764:1: ( ( rule__Measurement__QuantityAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3765:1: ( rule__Measurement__QuantityAssignment_2 )
            {
             before(grammarAccess.getMeasurementAccess().getQuantityAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3766:1: ( rule__Measurement__QuantityAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3766:2: rule__Measurement__QuantityAssignment_2
            {
            pushFollow(FOLLOW_rule__Measurement__QuantityAssignment_2_in_rule__Measurement__Group__2__Impl7579);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3776:1: rule__Measurement__Group__3 : rule__Measurement__Group__3__Impl rule__Measurement__Group__4 ;
    public final void rule__Measurement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3780:1: ( rule__Measurement__Group__3__Impl rule__Measurement__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3781:2: rule__Measurement__Group__3__Impl rule__Measurement__Group__4
            {
            pushFollow(FOLLOW_rule__Measurement__Group__3__Impl_in_rule__Measurement__Group__37609);
            rule__Measurement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__4_in_rule__Measurement__Group__37612);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3788:1: rule__Measurement__Group__3__Impl : ( ( rule__Measurement__NameAssignment_3 ) ) ;
    public final void rule__Measurement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3792:1: ( ( ( rule__Measurement__NameAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3793:1: ( ( rule__Measurement__NameAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3793:1: ( ( rule__Measurement__NameAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3794:1: ( rule__Measurement__NameAssignment_3 )
            {
             before(grammarAccess.getMeasurementAccess().getNameAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3795:1: ( rule__Measurement__NameAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3795:2: rule__Measurement__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Measurement__NameAssignment_3_in_rule__Measurement__Group__3__Impl7639);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3805:1: rule__Measurement__Group__4 : rule__Measurement__Group__4__Impl rule__Measurement__Group__5 ;
    public final void rule__Measurement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3809:1: ( rule__Measurement__Group__4__Impl rule__Measurement__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3810:2: rule__Measurement__Group__4__Impl rule__Measurement__Group__5
            {
            pushFollow(FOLLOW_rule__Measurement__Group__4__Impl_in_rule__Measurement__Group__47669);
            rule__Measurement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__5_in_rule__Measurement__Group__47672);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3817:1: rule__Measurement__Group__4__Impl : ( 'in' ) ;
    public final void rule__Measurement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3821:1: ( ( 'in' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3822:1: ( 'in' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3822:1: ( 'in' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3823:1: 'in'
            {
             before(grammarAccess.getMeasurementAccess().getInKeyword_4()); 
            match(input,59,FOLLOW_59_in_rule__Measurement__Group__4__Impl7700); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3836:1: rule__Measurement__Group__5 : rule__Measurement__Group__5__Impl rule__Measurement__Group__6 ;
    public final void rule__Measurement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3840:1: ( rule__Measurement__Group__5__Impl rule__Measurement__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3841:2: rule__Measurement__Group__5__Impl rule__Measurement__Group__6
            {
            pushFollow(FOLLOW_rule__Measurement__Group__5__Impl_in_rule__Measurement__Group__57731);
            rule__Measurement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__6_in_rule__Measurement__Group__57734);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3848:1: rule__Measurement__Group__5__Impl : ( ( rule__Measurement__ScaleAssignment_5 )? ) ;
    public final void rule__Measurement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3852:1: ( ( ( rule__Measurement__ScaleAssignment_5 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3853:1: ( ( rule__Measurement__ScaleAssignment_5 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3853:1: ( ( rule__Measurement__ScaleAssignment_5 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3854:1: ( rule__Measurement__ScaleAssignment_5 )?
            {
             before(grammarAccess.getMeasurementAccess().getScaleAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3855:1: ( rule__Measurement__ScaleAssignment_5 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3855:2: rule__Measurement__ScaleAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Measurement__ScaleAssignment_5_in_rule__Measurement__Group__5__Impl7761);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3865:1: rule__Measurement__Group__6 : rule__Measurement__Group__6__Impl rule__Measurement__Group__7 ;
    public final void rule__Measurement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3869:1: ( rule__Measurement__Group__6__Impl rule__Measurement__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3870:2: rule__Measurement__Group__6__Impl rule__Measurement__Group__7
            {
            pushFollow(FOLLOW_rule__Measurement__Group__6__Impl_in_rule__Measurement__Group__67792);
            rule__Measurement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__7_in_rule__Measurement__Group__67795);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3877:1: rule__Measurement__Group__6__Impl : ( ( rule__Measurement__UnitAssignment_6 ) ) ;
    public final void rule__Measurement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3881:1: ( ( ( rule__Measurement__UnitAssignment_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3882:1: ( ( rule__Measurement__UnitAssignment_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3882:1: ( ( rule__Measurement__UnitAssignment_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3883:1: ( rule__Measurement__UnitAssignment_6 )
            {
             before(grammarAccess.getMeasurementAccess().getUnitAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3884:1: ( rule__Measurement__UnitAssignment_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3884:2: rule__Measurement__UnitAssignment_6
            {
            pushFollow(FOLLOW_rule__Measurement__UnitAssignment_6_in_rule__Measurement__Group__6__Impl7822);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3894:1: rule__Measurement__Group__7 : rule__Measurement__Group__7__Impl rule__Measurement__Group__8 ;
    public final void rule__Measurement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3898:1: ( rule__Measurement__Group__7__Impl rule__Measurement__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3899:2: rule__Measurement__Group__7__Impl rule__Measurement__Group__8
            {
            pushFollow(FOLLOW_rule__Measurement__Group__7__Impl_in_rule__Measurement__Group__77852);
            rule__Measurement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__8_in_rule__Measurement__Group__77855);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3906:1: rule__Measurement__Group__7__Impl : ( 'as' ) ;
    public final void rule__Measurement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3910:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3911:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3911:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3912:1: 'as'
            {
             before(grammarAccess.getMeasurementAccess().getAsKeyword_7()); 
            match(input,53,FOLLOW_53_in_rule__Measurement__Group__7__Impl7883); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3925:1: rule__Measurement__Group__8 : rule__Measurement__Group__8__Impl rule__Measurement__Group__9 ;
    public final void rule__Measurement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3929:1: ( rule__Measurement__Group__8__Impl rule__Measurement__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3930:2: rule__Measurement__Group__8__Impl rule__Measurement__Group__9
            {
            pushFollow(FOLLOW_rule__Measurement__Group__8__Impl_in_rule__Measurement__Group__87914);
            rule__Measurement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__9_in_rule__Measurement__Group__87917);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3937:1: rule__Measurement__Group__8__Impl : ( ( rule__Measurement__RepresentationAssignment_8 ) ) ;
    public final void rule__Measurement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3941:1: ( ( ( rule__Measurement__RepresentationAssignment_8 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3942:1: ( ( rule__Measurement__RepresentationAssignment_8 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3942:1: ( ( rule__Measurement__RepresentationAssignment_8 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3943:1: ( rule__Measurement__RepresentationAssignment_8 )
            {
             before(grammarAccess.getMeasurementAccess().getRepresentationAssignment_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3944:1: ( rule__Measurement__RepresentationAssignment_8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3944:2: rule__Measurement__RepresentationAssignment_8
            {
            pushFollow(FOLLOW_rule__Measurement__RepresentationAssignment_8_in_rule__Measurement__Group__8__Impl7944);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3954:1: rule__Measurement__Group__9 : rule__Measurement__Group__9__Impl ;
    public final void rule__Measurement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3958:1: ( rule__Measurement__Group__9__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3959:2: rule__Measurement__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Measurement__Group__9__Impl_in_rule__Measurement__Group__97974);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3965:1: rule__Measurement__Group__9__Impl : ( ( rule__Measurement__ConstraintsAssignment_9 )* ) ;
    public final void rule__Measurement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3969:1: ( ( ( rule__Measurement__ConstraintsAssignment_9 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3970:1: ( ( rule__Measurement__ConstraintsAssignment_9 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3970:1: ( ( rule__Measurement__ConstraintsAssignment_9 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3971:1: ( rule__Measurement__ConstraintsAssignment_9 )*
            {
             before(grammarAccess.getMeasurementAccess().getConstraintsAssignment_9()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3972:1: ( rule__Measurement__ConstraintsAssignment_9 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==44||LA22_0==60) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3972:2: rule__Measurement__ConstraintsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Measurement__ConstraintsAssignment_9_in_rule__Measurement__Group__9__Impl8001);
            	    rule__Measurement__ConstraintsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4002:1: rule__MeasurementInRange__Group__0 : rule__MeasurementInRange__Group__0__Impl rule__MeasurementInRange__Group__1 ;
    public final void rule__MeasurementInRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4006:1: ( rule__MeasurementInRange__Group__0__Impl rule__MeasurementInRange__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4007:2: rule__MeasurementInRange__Group__0__Impl rule__MeasurementInRange__Group__1
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__Group__0__Impl_in_rule__MeasurementInRange__Group__08052);
            rule__MeasurementInRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementInRange__Group__1_in_rule__MeasurementInRange__Group__08055);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4014:1: rule__MeasurementInRange__Group__0__Impl : ( 'from' ) ;
    public final void rule__MeasurementInRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4018:1: ( ( 'from' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4019:1: ( 'from' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4019:1: ( 'from' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4020:1: 'from'
            {
             before(grammarAccess.getMeasurementInRangeAccess().getFromKeyword_0()); 
            match(input,60,FOLLOW_60_in_rule__MeasurementInRange__Group__0__Impl8083); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4033:1: rule__MeasurementInRange__Group__1 : rule__MeasurementInRange__Group__1__Impl rule__MeasurementInRange__Group__2 ;
    public final void rule__MeasurementInRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4037:1: ( rule__MeasurementInRange__Group__1__Impl rule__MeasurementInRange__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4038:2: rule__MeasurementInRange__Group__1__Impl rule__MeasurementInRange__Group__2
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__Group__1__Impl_in_rule__MeasurementInRange__Group__18114);
            rule__MeasurementInRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementInRange__Group__2_in_rule__MeasurementInRange__Group__18117);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4045:1: rule__MeasurementInRange__Group__1__Impl : ( ( rule__MeasurementInRange__LowerBoundAssignment_1 ) ) ;
    public final void rule__MeasurementInRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4049:1: ( ( ( rule__MeasurementInRange__LowerBoundAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4050:1: ( ( rule__MeasurementInRange__LowerBoundAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4050:1: ( ( rule__MeasurementInRange__LowerBoundAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4051:1: ( rule__MeasurementInRange__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getMeasurementInRangeAccess().getLowerBoundAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4052:1: ( rule__MeasurementInRange__LowerBoundAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4052:2: rule__MeasurementInRange__LowerBoundAssignment_1
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__LowerBoundAssignment_1_in_rule__MeasurementInRange__Group__1__Impl8144);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4062:1: rule__MeasurementInRange__Group__2 : rule__MeasurementInRange__Group__2__Impl rule__MeasurementInRange__Group__3 ;
    public final void rule__MeasurementInRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4066:1: ( rule__MeasurementInRange__Group__2__Impl rule__MeasurementInRange__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4067:2: rule__MeasurementInRange__Group__2__Impl rule__MeasurementInRange__Group__3
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__Group__2__Impl_in_rule__MeasurementInRange__Group__28174);
            rule__MeasurementInRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementInRange__Group__3_in_rule__MeasurementInRange__Group__28177);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4074:1: rule__MeasurementInRange__Group__2__Impl : ( 'to' ) ;
    public final void rule__MeasurementInRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4078:1: ( ( 'to' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4079:1: ( 'to' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4079:1: ( 'to' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4080:1: 'to'
            {
             before(grammarAccess.getMeasurementInRangeAccess().getToKeyword_2()); 
            match(input,61,FOLLOW_61_in_rule__MeasurementInRange__Group__2__Impl8205); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4093:1: rule__MeasurementInRange__Group__3 : rule__MeasurementInRange__Group__3__Impl ;
    public final void rule__MeasurementInRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4097:1: ( rule__MeasurementInRange__Group__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4098:2: rule__MeasurementInRange__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__Group__3__Impl_in_rule__MeasurementInRange__Group__38236);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4104:1: rule__MeasurementInRange__Group__3__Impl : ( ( rule__MeasurementInRange__UpperBoundAssignment_3 ) ) ;
    public final void rule__MeasurementInRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4108:1: ( ( ( rule__MeasurementInRange__UpperBoundAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4109:1: ( ( rule__MeasurementInRange__UpperBoundAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4109:1: ( ( rule__MeasurementInRange__UpperBoundAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4110:1: ( rule__MeasurementInRange__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getMeasurementInRangeAccess().getUpperBoundAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4111:1: ( rule__MeasurementInRange__UpperBoundAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4111:2: rule__MeasurementInRange__UpperBoundAssignment_3
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__UpperBoundAssignment_3_in_rule__MeasurementInRange__Group__3__Impl8263);
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


    // $ANTLR start "rule__MeasurementAdaption__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4129:1: rule__MeasurementAdaption__Group__0 : rule__MeasurementAdaption__Group__0__Impl rule__MeasurementAdaption__Group__1 ;
    public final void rule__MeasurementAdaption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4133:1: ( rule__MeasurementAdaption__Group__0__Impl rule__MeasurementAdaption__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4134:2: rule__MeasurementAdaption__Group__0__Impl rule__MeasurementAdaption__Group__1
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__0__Impl_in_rule__MeasurementAdaption__Group__08301);
            rule__MeasurementAdaption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__1_in_rule__MeasurementAdaption__Group__08304);
            rule__MeasurementAdaption__Group__1();

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
    // $ANTLR end "rule__MeasurementAdaption__Group__0"


    // $ANTLR start "rule__MeasurementAdaption__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4141:1: rule__MeasurementAdaption__Group__0__Impl : ( 'with' ) ;
    public final void rule__MeasurementAdaption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4145:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4146:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4146:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4147:1: 'with'
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getWithKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__MeasurementAdaption__Group__0__Impl8332); 
             after(grammarAccess.getMeasurementAdaptionAccess().getWithKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementAdaption__Group__0__Impl"


    // $ANTLR start "rule__MeasurementAdaption__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4160:1: rule__MeasurementAdaption__Group__1 : rule__MeasurementAdaption__Group__1__Impl rule__MeasurementAdaption__Group__2 ;
    public final void rule__MeasurementAdaption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4164:1: ( rule__MeasurementAdaption__Group__1__Impl rule__MeasurementAdaption__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4165:2: rule__MeasurementAdaption__Group__1__Impl rule__MeasurementAdaption__Group__2
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__1__Impl_in_rule__MeasurementAdaption__Group__18363);
            rule__MeasurementAdaption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__2_in_rule__MeasurementAdaption__Group__18366);
            rule__MeasurementAdaption__Group__2();

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
    // $ANTLR end "rule__MeasurementAdaption__Group__1"


    // $ANTLR start "rule__MeasurementAdaption__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4172:1: rule__MeasurementAdaption__Group__1__Impl : ( 'scaling factor' ) ;
    public final void rule__MeasurementAdaption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4176:1: ( ( 'scaling factor' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4177:1: ( 'scaling factor' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4177:1: ( 'scaling factor' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4178:1: 'scaling factor'
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getScalingFactorKeyword_1()); 
            match(input,62,FOLLOW_62_in_rule__MeasurementAdaption__Group__1__Impl8394); 
             after(grammarAccess.getMeasurementAdaptionAccess().getScalingFactorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementAdaption__Group__1__Impl"


    // $ANTLR start "rule__MeasurementAdaption__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4191:1: rule__MeasurementAdaption__Group__2 : rule__MeasurementAdaption__Group__2__Impl rule__MeasurementAdaption__Group__3 ;
    public final void rule__MeasurementAdaption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4195:1: ( rule__MeasurementAdaption__Group__2__Impl rule__MeasurementAdaption__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4196:2: rule__MeasurementAdaption__Group__2__Impl rule__MeasurementAdaption__Group__3
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__2__Impl_in_rule__MeasurementAdaption__Group__28425);
            rule__MeasurementAdaption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__3_in_rule__MeasurementAdaption__Group__28428);
            rule__MeasurementAdaption__Group__3();

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
    // $ANTLR end "rule__MeasurementAdaption__Group__2"


    // $ANTLR start "rule__MeasurementAdaption__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4203:1: rule__MeasurementAdaption__Group__2__Impl : ( ':' ) ;
    public final void rule__MeasurementAdaption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4207:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4208:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4208:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4209:1: ':'
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getColonKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__MeasurementAdaption__Group__2__Impl8456); 
             after(grammarAccess.getMeasurementAdaptionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementAdaption__Group__2__Impl"


    // $ANTLR start "rule__MeasurementAdaption__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4222:1: rule__MeasurementAdaption__Group__3 : rule__MeasurementAdaption__Group__3__Impl rule__MeasurementAdaption__Group__4 ;
    public final void rule__MeasurementAdaption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4226:1: ( rule__MeasurementAdaption__Group__3__Impl rule__MeasurementAdaption__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4227:2: rule__MeasurementAdaption__Group__3__Impl rule__MeasurementAdaption__Group__4
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__3__Impl_in_rule__MeasurementAdaption__Group__38487);
            rule__MeasurementAdaption__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__4_in_rule__MeasurementAdaption__Group__38490);
            rule__MeasurementAdaption__Group__4();

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
    // $ANTLR end "rule__MeasurementAdaption__Group__3"


    // $ANTLR start "rule__MeasurementAdaption__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4234:1: rule__MeasurementAdaption__Group__3__Impl : ( ( rule__MeasurementAdaption__ScalingFactorAssignment_3 ) ) ;
    public final void rule__MeasurementAdaption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4238:1: ( ( ( rule__MeasurementAdaption__ScalingFactorAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4239:1: ( ( rule__MeasurementAdaption__ScalingFactorAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4239:1: ( ( rule__MeasurementAdaption__ScalingFactorAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4240:1: ( rule__MeasurementAdaption__ScalingFactorAssignment_3 )
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getScalingFactorAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4241:1: ( rule__MeasurementAdaption__ScalingFactorAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4241:2: rule__MeasurementAdaption__ScalingFactorAssignment_3
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__ScalingFactorAssignment_3_in_rule__MeasurementAdaption__Group__3__Impl8517);
            rule__MeasurementAdaption__ScalingFactorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAdaptionAccess().getScalingFactorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementAdaption__Group__3__Impl"


    // $ANTLR start "rule__MeasurementAdaption__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4251:1: rule__MeasurementAdaption__Group__4 : rule__MeasurementAdaption__Group__4__Impl rule__MeasurementAdaption__Group__5 ;
    public final void rule__MeasurementAdaption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4255:1: ( rule__MeasurementAdaption__Group__4__Impl rule__MeasurementAdaption__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4256:2: rule__MeasurementAdaption__Group__4__Impl rule__MeasurementAdaption__Group__5
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__4__Impl_in_rule__MeasurementAdaption__Group__48547);
            rule__MeasurementAdaption__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__5_in_rule__MeasurementAdaption__Group__48550);
            rule__MeasurementAdaption__Group__5();

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
    // $ANTLR end "rule__MeasurementAdaption__Group__4"


    // $ANTLR start "rule__MeasurementAdaption__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4263:1: rule__MeasurementAdaption__Group__4__Impl : ( 'and' ) ;
    public final void rule__MeasurementAdaption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4267:1: ( ( 'and' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4268:1: ( 'and' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4268:1: ( 'and' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4269:1: 'and'
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getAndKeyword_4()); 
            match(input,46,FOLLOW_46_in_rule__MeasurementAdaption__Group__4__Impl8578); 
             after(grammarAccess.getMeasurementAdaptionAccess().getAndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementAdaption__Group__4__Impl"


    // $ANTLR start "rule__MeasurementAdaption__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4282:1: rule__MeasurementAdaption__Group__5 : rule__MeasurementAdaption__Group__5__Impl rule__MeasurementAdaption__Group__6 ;
    public final void rule__MeasurementAdaption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4286:1: ( rule__MeasurementAdaption__Group__5__Impl rule__MeasurementAdaption__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4287:2: rule__MeasurementAdaption__Group__5__Impl rule__MeasurementAdaption__Group__6
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__5__Impl_in_rule__MeasurementAdaption__Group__58609);
            rule__MeasurementAdaption__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__6_in_rule__MeasurementAdaption__Group__58612);
            rule__MeasurementAdaption__Group__6();

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
    // $ANTLR end "rule__MeasurementAdaption__Group__5"


    // $ANTLR start "rule__MeasurementAdaption__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4294:1: rule__MeasurementAdaption__Group__5__Impl : ( 'offset' ) ;
    public final void rule__MeasurementAdaption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4298:1: ( ( 'offset' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4299:1: ( 'offset' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4299:1: ( 'offset' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4300:1: 'offset'
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getOffsetKeyword_5()); 
            match(input,63,FOLLOW_63_in_rule__MeasurementAdaption__Group__5__Impl8640); 
             after(grammarAccess.getMeasurementAdaptionAccess().getOffsetKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementAdaption__Group__5__Impl"


    // $ANTLR start "rule__MeasurementAdaption__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4313:1: rule__MeasurementAdaption__Group__6 : rule__MeasurementAdaption__Group__6__Impl rule__MeasurementAdaption__Group__7 ;
    public final void rule__MeasurementAdaption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4317:1: ( rule__MeasurementAdaption__Group__6__Impl rule__MeasurementAdaption__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4318:2: rule__MeasurementAdaption__Group__6__Impl rule__MeasurementAdaption__Group__7
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__6__Impl_in_rule__MeasurementAdaption__Group__68671);
            rule__MeasurementAdaption__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__7_in_rule__MeasurementAdaption__Group__68674);
            rule__MeasurementAdaption__Group__7();

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
    // $ANTLR end "rule__MeasurementAdaption__Group__6"


    // $ANTLR start "rule__MeasurementAdaption__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4325:1: rule__MeasurementAdaption__Group__6__Impl : ( ':' ) ;
    public final void rule__MeasurementAdaption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4329:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4330:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4330:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4331:1: ':'
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getColonKeyword_6()); 
            match(input,39,FOLLOW_39_in_rule__MeasurementAdaption__Group__6__Impl8702); 
             after(grammarAccess.getMeasurementAdaptionAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementAdaption__Group__6__Impl"


    // $ANTLR start "rule__MeasurementAdaption__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4344:1: rule__MeasurementAdaption__Group__7 : rule__MeasurementAdaption__Group__7__Impl ;
    public final void rule__MeasurementAdaption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4348:1: ( rule__MeasurementAdaption__Group__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4349:2: rule__MeasurementAdaption__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__7__Impl_in_rule__MeasurementAdaption__Group__78733);
            rule__MeasurementAdaption__Group__7__Impl();

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
    // $ANTLR end "rule__MeasurementAdaption__Group__7"


    // $ANTLR start "rule__MeasurementAdaption__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4355:1: rule__MeasurementAdaption__Group__7__Impl : ( ( rule__MeasurementAdaption__OffsetAssignment_7 ) ) ;
    public final void rule__MeasurementAdaption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4359:1: ( ( ( rule__MeasurementAdaption__OffsetAssignment_7 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4360:1: ( ( rule__MeasurementAdaption__OffsetAssignment_7 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4360:1: ( ( rule__MeasurementAdaption__OffsetAssignment_7 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4361:1: ( rule__MeasurementAdaption__OffsetAssignment_7 )
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getOffsetAssignment_7()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4362:1: ( rule__MeasurementAdaption__OffsetAssignment_7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4362:2: rule__MeasurementAdaption__OffsetAssignment_7
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__OffsetAssignment_7_in_rule__MeasurementAdaption__Group__7__Impl8760);
            rule__MeasurementAdaption__OffsetAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAdaptionAccess().getOffsetAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementAdaption__Group__7__Impl"


    // $ANTLR start "rule__Measure__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4388:1: rule__Measure__Group__0 : rule__Measure__Group__0__Impl rule__Measure__Group__1 ;
    public final void rule__Measure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4392:1: ( rule__Measure__Group__0__Impl rule__Measure__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4393:2: rule__Measure__Group__0__Impl rule__Measure__Group__1
            {
            pushFollow(FOLLOW_rule__Measure__Group__0__Impl_in_rule__Measure__Group__08806);
            rule__Measure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measure__Group__1_in_rule__Measure__Group__08809);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4400:1: rule__Measure__Group__0__Impl : ( ( rule__Measure__ValueAssignment_0 ) ) ;
    public final void rule__Measure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4404:1: ( ( ( rule__Measure__ValueAssignment_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4405:1: ( ( rule__Measure__ValueAssignment_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4405:1: ( ( rule__Measure__ValueAssignment_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4406:1: ( rule__Measure__ValueAssignment_0 )
            {
             before(grammarAccess.getMeasureAccess().getValueAssignment_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4407:1: ( rule__Measure__ValueAssignment_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4407:2: rule__Measure__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__Measure__ValueAssignment_0_in_rule__Measure__Group__0__Impl8836);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4417:1: rule__Measure__Group__1 : rule__Measure__Group__1__Impl ;
    public final void rule__Measure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4421:1: ( rule__Measure__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4422:2: rule__Measure__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Measure__Group__1__Impl_in_rule__Measure__Group__18866);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4428:1: rule__Measure__Group__1__Impl : ( ( rule__Measure__UnitAssignment_1 ) ) ;
    public final void rule__Measure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4432:1: ( ( ( rule__Measure__UnitAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4433:1: ( ( rule__Measure__UnitAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4433:1: ( ( rule__Measure__UnitAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4434:1: ( rule__Measure__UnitAssignment_1 )
            {
             before(grammarAccess.getMeasureAccess().getUnitAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4435:1: ( rule__Measure__UnitAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4435:2: rule__Measure__UnitAssignment_1
            {
            pushFollow(FOLLOW_rule__Measure__UnitAssignment_1_in_rule__Measure__Group__1__Impl8893);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4449:1: rule__PrimitiveInterpretation__Group__0 : rule__PrimitiveInterpretation__Group__0__Impl rule__PrimitiveInterpretation__Group__1 ;
    public final void rule__PrimitiveInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4453:1: ( rule__PrimitiveInterpretation__Group__0__Impl rule__PrimitiveInterpretation__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4454:2: rule__PrimitiveInterpretation__Group__0__Impl rule__PrimitiveInterpretation__Group__1
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__0__Impl_in_rule__PrimitiveInterpretation__Group__08927);
            rule__PrimitiveInterpretation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__1_in_rule__PrimitiveInterpretation__Group__08930);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4461:1: rule__PrimitiveInterpretation__Group__0__Impl : ( 'primitive' ) ;
    public final void rule__PrimitiveInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4465:1: ( ( 'primitive' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4466:1: ( 'primitive' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4466:1: ( 'primitive' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4467:1: 'primitive'
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getPrimitiveKeyword_0()); 
            match(input,64,FOLLOW_64_in_rule__PrimitiveInterpretation__Group__0__Impl8958); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4480:1: rule__PrimitiveInterpretation__Group__1 : rule__PrimitiveInterpretation__Group__1__Impl rule__PrimitiveInterpretation__Group__2 ;
    public final void rule__PrimitiveInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4484:1: ( rule__PrimitiveInterpretation__Group__1__Impl rule__PrimitiveInterpretation__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4485:2: rule__PrimitiveInterpretation__Group__1__Impl rule__PrimitiveInterpretation__Group__2
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__1__Impl_in_rule__PrimitiveInterpretation__Group__18989);
            rule__PrimitiveInterpretation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__2_in_rule__PrimitiveInterpretation__Group__18992);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4492:1: rule__PrimitiveInterpretation__Group__1__Impl : ( ( rule__PrimitiveInterpretation__TypeAssignment_1 ) ) ;
    public final void rule__PrimitiveInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4496:1: ( ( ( rule__PrimitiveInterpretation__TypeAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4497:1: ( ( rule__PrimitiveInterpretation__TypeAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4497:1: ( ( rule__PrimitiveInterpretation__TypeAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4498:1: ( rule__PrimitiveInterpretation__TypeAssignment_1 )
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getTypeAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4499:1: ( rule__PrimitiveInterpretation__TypeAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4499:2: rule__PrimitiveInterpretation__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__TypeAssignment_1_in_rule__PrimitiveInterpretation__Group__1__Impl9019);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4509:1: rule__PrimitiveInterpretation__Group__2 : rule__PrimitiveInterpretation__Group__2__Impl rule__PrimitiveInterpretation__Group__3 ;
    public final void rule__PrimitiveInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4513:1: ( rule__PrimitiveInterpretation__Group__2__Impl rule__PrimitiveInterpretation__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4514:2: rule__PrimitiveInterpretation__Group__2__Impl rule__PrimitiveInterpretation__Group__3
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__2__Impl_in_rule__PrimitiveInterpretation__Group__29049);
            rule__PrimitiveInterpretation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__3_in_rule__PrimitiveInterpretation__Group__29052);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4521:1: rule__PrimitiveInterpretation__Group__2__Impl : ( ( rule__PrimitiveInterpretation__NameAssignment_2 ) ) ;
    public final void rule__PrimitiveInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4525:1: ( ( ( rule__PrimitiveInterpretation__NameAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4526:1: ( ( rule__PrimitiveInterpretation__NameAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4526:1: ( ( rule__PrimitiveInterpretation__NameAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4527:1: ( rule__PrimitiveInterpretation__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getNameAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4528:1: ( rule__PrimitiveInterpretation__NameAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4528:2: rule__PrimitiveInterpretation__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__NameAssignment_2_in_rule__PrimitiveInterpretation__Group__2__Impl9079);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4538:1: rule__PrimitiveInterpretation__Group__3 : rule__PrimitiveInterpretation__Group__3__Impl rule__PrimitiveInterpretation__Group__4 ;
    public final void rule__PrimitiveInterpretation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4542:1: ( rule__PrimitiveInterpretation__Group__3__Impl rule__PrimitiveInterpretation__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4543:2: rule__PrimitiveInterpretation__Group__3__Impl rule__PrimitiveInterpretation__Group__4
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__3__Impl_in_rule__PrimitiveInterpretation__Group__39109);
            rule__PrimitiveInterpretation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__4_in_rule__PrimitiveInterpretation__Group__39112);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4550:1: rule__PrimitiveInterpretation__Group__3__Impl : ( 'as' ) ;
    public final void rule__PrimitiveInterpretation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4554:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4555:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4555:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4556:1: 'as'
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getAsKeyword_3()); 
            match(input,53,FOLLOW_53_in_rule__PrimitiveInterpretation__Group__3__Impl9140); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4569:1: rule__PrimitiveInterpretation__Group__4 : rule__PrimitiveInterpretation__Group__4__Impl ;
    public final void rule__PrimitiveInterpretation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4573:1: ( rule__PrimitiveInterpretation__Group__4__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4574:2: rule__PrimitiveInterpretation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__4__Impl_in_rule__PrimitiveInterpretation__Group__49171);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4580:1: rule__PrimitiveInterpretation__Group__4__Impl : ( ( rule__PrimitiveInterpretation__RepresentationAssignment_4 ) ) ;
    public final void rule__PrimitiveInterpretation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4584:1: ( ( ( rule__PrimitiveInterpretation__RepresentationAssignment_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4585:1: ( ( rule__PrimitiveInterpretation__RepresentationAssignment_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4585:1: ( ( rule__PrimitiveInterpretation__RepresentationAssignment_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4586:1: ( rule__PrimitiveInterpretation__RepresentationAssignment_4 )
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getRepresentationAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4587:1: ( rule__PrimitiveInterpretation__RepresentationAssignment_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4587:2: rule__PrimitiveInterpretation__RepresentationAssignment_4
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__RepresentationAssignment_4_in_rule__PrimitiveInterpretation__Group__4__Impl9198);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4607:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4611:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4612:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__09238);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__09241);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4619:1: rule__Constant__Group__0__Impl : ( 'constant' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4623:1: ( ( 'constant' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4624:1: ( 'constant' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4624:1: ( 'constant' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4625:1: 'constant'
            {
             before(grammarAccess.getConstantAccess().getConstantKeyword_0()); 
            match(input,65,FOLLOW_65_in_rule__Constant__Group__0__Impl9269); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4638:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4642:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4643:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__19300);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__19303);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4650:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4654:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4655:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4655:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4656:1: ( rule__Constant__NameAssignment_1 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4657:1: ( rule__Constant__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4657:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl9330);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4667:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4671:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4672:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__29360);
            rule__Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__29363);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4679:1: rule__Constant__Group__2__Impl : ( 'as' ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4683:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4684:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4684:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4685:1: 'as'
            {
             before(grammarAccess.getConstantAccess().getAsKeyword_2()); 
            match(input,53,FOLLOW_53_in_rule__Constant__Group__2__Impl9391); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4698:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4702:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4703:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__39422);
            rule__Constant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__39425);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4710:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__RepresentationAssignment_3 ) ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4714:1: ( ( ( rule__Constant__RepresentationAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4715:1: ( ( rule__Constant__RepresentationAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4715:1: ( ( rule__Constant__RepresentationAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4716:1: ( rule__Constant__RepresentationAssignment_3 )
            {
             before(grammarAccess.getConstantAccess().getRepresentationAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4717:1: ( rule__Constant__RepresentationAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4717:2: rule__Constant__RepresentationAssignment_3
            {
            pushFollow(FOLLOW_rule__Constant__RepresentationAssignment_3_in_rule__Constant__Group__3__Impl9452);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4727:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl rule__Constant__Group__5 ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4731:1: ( rule__Constant__Group__4__Impl rule__Constant__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4732:2: rule__Constant__Group__4__Impl rule__Constant__Group__5
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__49482);
            rule__Constant__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__5_in_rule__Constant__Group__49485);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4739:1: rule__Constant__Group__4__Impl : ( 'is' ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4743:1: ( ( 'is' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4744:1: ( 'is' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4744:1: ( 'is' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4745:1: 'is'
            {
             before(grammarAccess.getConstantAccess().getIsKeyword_4()); 
            match(input,51,FOLLOW_51_in_rule__Constant__Group__4__Impl9513); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4758:1: rule__Constant__Group__5 : rule__Constant__Group__5__Impl ;
    public final void rule__Constant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4762:1: ( rule__Constant__Group__5__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4763:2: rule__Constant__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__5__Impl_in_rule__Constant__Group__59544);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4769:1: rule__Constant__Group__5__Impl : ( ( rule__Constant__ConstantValueAssignment_5 ) ) ;
    public final void rule__Constant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4773:1: ( ( ( rule__Constant__ConstantValueAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4774:1: ( ( rule__Constant__ConstantValueAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4774:1: ( ( rule__Constant__ConstantValueAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4775:1: ( rule__Constant__ConstantValueAssignment_5 )
            {
             before(grammarAccess.getConstantAccess().getConstantValueAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4776:1: ( rule__Constant__ConstantValueAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4776:2: rule__Constant__ConstantValueAssignment_5
            {
            pushFollow(FOLLOW_rule__Constant__ConstantValueAssignment_5_in_rule__Constant__Group__5__Impl9571);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4798:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4802:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4803:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__09613);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__09616);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4810:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4814:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4815:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4815:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4816:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl9643); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4827:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4831:1: ( rule__DOUBLE__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4832:2: rule__DOUBLE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__19672);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4838:1: rule__DOUBLE__Group__1__Impl : ( ( rule__DOUBLE__Group_1__0 )? ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4842:1: ( ( ( rule__DOUBLE__Group_1__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4843:1: ( ( rule__DOUBLE__Group_1__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4843:1: ( ( rule__DOUBLE__Group_1__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4844:1: ( rule__DOUBLE__Group_1__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4845:1: ( rule__DOUBLE__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==66) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4845:2: rule__DOUBLE__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl9699);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4859:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4863:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4864:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__09734);
            rule__DOUBLE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__09737);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4871:1: rule__DOUBLE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4875:1: ( ( '.' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4876:1: ( '.' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4876:1: ( '.' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4877:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
            match(input,66,FOLLOW_66_in_rule__DOUBLE__Group_1__0__Impl9765); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4890:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4894:1: ( rule__DOUBLE__Group_1__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4895:2: rule__DOUBLE__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__19796);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4901:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4905:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4906:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4906:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4907:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl9823); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4923:1: rule__DataModel__OptionsAssignment_2 : ( ruleOptions ) ;
    public final void rule__DataModel__OptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4927:1: ( ( ruleOptions ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4928:1: ( ruleOptions )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4928:1: ( ruleOptions )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4929:1: ruleOptions
            {
             before(grammarAccess.getDataModelAccess().getOptionsOptionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOptions_in_rule__DataModel__OptionsAssignment_29861);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4938:1: rule__DataModel__RepresentationsAssignment_4_0 : ( ruleRepresentation ) ;
    public final void rule__DataModel__RepresentationsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4942:1: ( ( ruleRepresentation ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4943:1: ( ruleRepresentation )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4943:1: ( ruleRepresentation )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4944:1: ruleRepresentation
            {
             before(grammarAccess.getDataModelAccess().getRepresentationsRepresentationParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleRepresentation_in_rule__DataModel__RepresentationsAssignment_4_09892);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4953:1: rule__DataModel__InterpretationsAssignment_4_1 : ( ruleInterpretation ) ;
    public final void rule__DataModel__InterpretationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4957:1: ( ( ruleInterpretation ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4958:1: ( ruleInterpretation )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4958:1: ( ruleInterpretation )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4959:1: ruleInterpretation
            {
             before(grammarAccess.getDataModelAccess().getInterpretationsInterpretationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleInterpretation_in_rule__DataModel__InterpretationsAssignment_4_19923);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4968:1: rule__DataModel__TransmitAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__DataModel__TransmitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4972:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4973:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4973:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4974:1: ( RULE_ID )
            {
             before(grammarAccess.getDataModelAccess().getTransmitInterpretationCrossReference_6_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4975:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4976:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getTransmitInterpretationIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_69958); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4987:1: rule__DataModel__TransmitAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataModel__TransmitAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4991:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4992:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4992:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4993:1: ( RULE_ID )
            {
             before(grammarAccess.getDataModelAccess().getTransmitInterpretationCrossReference_7_1_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4994:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4995:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getTransmitInterpretationIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_7_19997); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5006:1: rule__Options__TransmissionTypeAssignment_1_0_3 : ( ruleTransmission ) ;
    public final void rule__Options__TransmissionTypeAssignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5010:1: ( ( ruleTransmission ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5011:1: ( ruleTransmission )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5011:1: ( ruleTransmission )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5012:1: ruleTransmission
            {
             before(grammarAccess.getOptionsAccess().getTransmissionTypeTransmissionParserRuleCall_1_0_3_0()); 
            pushFollow(FOLLOW_ruleTransmission_in_rule__Options__TransmissionTypeAssignment_1_0_310032);
            ruleTransmission();

            state._fsp--;

             after(grammarAccess.getOptionsAccess().getTransmissionTypeTransmissionParserRuleCall_1_0_3_0()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5021:1: rule__Options__SensorLanguageAssignment_1_1_3 : ( ruleGenerationLanguage ) ;
    public final void rule__Options__SensorLanguageAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5025:1: ( ( ruleGenerationLanguage ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5026:1: ( ruleGenerationLanguage )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5026:1: ( ruleGenerationLanguage )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5027:1: ruleGenerationLanguage
            {
             before(grammarAccess.getOptionsAccess().getSensorLanguageGenerationLanguageEnumRuleCall_1_1_3_0()); 
            pushFollow(FOLLOW_ruleGenerationLanguage_in_rule__Options__SensorLanguageAssignment_1_1_310063);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5036:1: rule__Options__ReceiverLanguageAssignment_1_2_3 : ( ruleGenerationLanguage ) ;
    public final void rule__Options__ReceiverLanguageAssignment_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5040:1: ( ( ruleGenerationLanguage ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5041:1: ( ruleGenerationLanguage )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5041:1: ( ruleGenerationLanguage )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5042:1: ruleGenerationLanguage
            {
             before(grammarAccess.getOptionsAccess().getReceiverLanguageGenerationLanguageEnumRuleCall_1_2_3_0()); 
            pushFollow(FOLLOW_ruleGenerationLanguage_in_rule__Options__ReceiverLanguageAssignment_1_2_310094);
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


    // $ANTLR start "rule__Push__FrequencyAssignment_1_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5051:1: rule__Push__FrequencyAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__Push__FrequencyAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5055:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5056:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5056:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5057:1: RULE_INT
            {
             before(grammarAccess.getPushAccess().getFrequencyINTTerminalRuleCall_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Push__FrequencyAssignment_1_310125); 
             after(grammarAccess.getPushAccess().getFrequencyINTTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__FrequencyAssignment_1_3"


    // $ANTLR start "rule__Push__MethodNameAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5066:1: rule__Push__MethodNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Push__MethodNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5070:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5071:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5071:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5072:1: RULE_ID
            {
             before(grammarAccess.getPushAccess().getMethodNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Push__MethodNameAssignment_310156); 
             after(grammarAccess.getPushAccess().getMethodNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__MethodNameAssignment_3"


    // $ANTLR start "rule__Pull__FrequencyAssignment_1_4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5081:1: rule__Pull__FrequencyAssignment_1_4 : ( RULE_INT ) ;
    public final void rule__Pull__FrequencyAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5085:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5086:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5086:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5087:1: RULE_INT
            {
             before(grammarAccess.getPullAccess().getFrequencyINTTerminalRuleCall_1_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Pull__FrequencyAssignment_1_410187); 
             after(grammarAccess.getPullAccess().getFrequencyINTTerminalRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pull__FrequencyAssignment_1_4"


    // $ANTLR start "rule__TimeDivisionMultiplexing__FrequencyAssignment_4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5096:1: rule__TimeDivisionMultiplexing__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__TimeDivisionMultiplexing__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5100:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5101:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5101:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5102:1: RULE_INT
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getFrequencyINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TimeDivisionMultiplexing__FrequencyAssignment_410218); 
             after(grammarAccess.getTimeDivisionMultiplexingAccess().getFrequencyINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__FrequencyAssignment_4"


    // $ANTLR start "rule__TimeDivisionMultiplexing__DurationAssignment_8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5111:1: rule__TimeDivisionMultiplexing__DurationAssignment_8 : ( ruleDOUBLE ) ;
    public final void rule__TimeDivisionMultiplexing__DurationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5115:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5116:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5116:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5117:1: ruleDOUBLE
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getDurationDOUBLEParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__TimeDivisionMultiplexing__DurationAssignment_810249);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getTimeDivisionMultiplexingAccess().getDurationDOUBLEParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__DurationAssignment_8"


    // $ANTLR start "rule__TimeDivisionMultiplexing__TimeSlotAssignment_12"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5126:1: rule__TimeDivisionMultiplexing__TimeSlotAssignment_12 : ( ruleDOUBLE ) ;
    public final void rule__TimeDivisionMultiplexing__TimeSlotAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5130:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5131:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5131:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5132:1: ruleDOUBLE
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getTimeSlotDOUBLEParserRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__TimeDivisionMultiplexing__TimeSlotAssignment_1210280);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getTimeDivisionMultiplexingAccess().getTimeSlotDOUBLEParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeDivisionMultiplexing__TimeSlotAssignment_12"


    // $ANTLR start "rule__Representation__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5141:1: rule__Representation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Representation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5145:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5146:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5146:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5147:1: RULE_ID
            {
             before(grammarAccess.getRepresentationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Representation__NameAssignment_110311); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5156:1: rule__Representation__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Representation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5160:1: ( ( ruleType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5161:1: ( ruleType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5161:1: ( ruleType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5162:1: ruleType
            {
             before(grammarAccess.getRepresentationAccess().getTypeTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Representation__TypeAssignment_310342);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5171:1: rule__Representation__ByteCountAssignment_5 : ( RULE_INT ) ;
    public final void rule__Representation__ByteCountAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5175:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5176:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5176:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5177:1: RULE_INT
            {
             before(grammarAccess.getRepresentationAccess().getByteCountINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Representation__ByteCountAssignment_510373); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5186:1: rule__Calculated__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Calculated__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5190:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5191:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5191:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5192:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__NameAssignment_110404); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5201:1: rule__Calculated__RepresentationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Calculated__RepresentationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5205:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5206:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5206:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5207:1: ( RULE_ID )
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationRepresentationCrossReference_3_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5208:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5209:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationRepresentationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__RepresentationAssignment_310439); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5220:1: rule__Calculated__MethodNameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Calculated__MethodNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5224:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5225:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5225:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5226:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__MethodNameAssignment_510474); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5235:1: rule__Calculated__MethodNameOutAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Calculated__MethodNameOutAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5239:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5240:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5240:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5241:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameOutIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__MethodNameOutAssignment_6_110505); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5250:1: rule__Calculated__ParameterAssignment_8 : ( ruleParameter ) ;
    public final void rule__Calculated__ParameterAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5254:1: ( ( ruleParameter ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5255:1: ( ruleParameter )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5255:1: ( ruleParameter )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5256:1: ruleParameter
            {
             before(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_810536);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5265:1: rule__Calculated__ParameterAssignment_9_1 : ( ruleParameter ) ;
    public final void rule__Calculated__ParameterAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5269:1: ( ( ruleParameter ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5270:1: ( ruleParameter )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5270:1: ( ruleParameter )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5271:1: ruleParameter
            {
             before(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_9_110567);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5280:1: rule__Parameter__InterpretationAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__InterpretationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5284:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5285:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5285:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5286:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getInterpretationInterpretationCrossReference_1_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5287:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5288:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getInterpretationInterpretationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__InterpretationAssignment_110602); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5299:1: rule__Parameter__ArgumentTypeAssignment_2_1 : ( ruleArgumentType ) ;
    public final void rule__Parameter__ArgumentTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5303:1: ( ( ruleArgumentType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5304:1: ( ruleArgumentType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5304:1: ( ruleArgumentType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5305:1: ruleArgumentType
            {
             before(grammarAccess.getParameterAccess().getArgumentTypeArgumentTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleArgumentType_in_rule__Parameter__ArgumentTypeAssignment_2_110637);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5314:1: rule__InterpretationGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InterpretationGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5318:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5319:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5319:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5320:1: RULE_ID
            {
             before(grammarAccess.getInterpretationGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InterpretationGroup__NameAssignment_110668); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5329:1: rule__InterpretationGroup__InterpretationsAssignment_3 : ( ruleInterpretation ) ;
    public final void rule__InterpretationGroup__InterpretationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5333:1: ( ( ruleInterpretation ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5334:1: ( ruleInterpretation )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5334:1: ( ruleInterpretation )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5335:1: ruleInterpretation
            {
             before(grammarAccess.getInterpretationGroupAccess().getInterpretationsInterpretationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInterpretation_in_rule__InterpretationGroup__InterpretationsAssignment_310699);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5344:1: rule__Measurement__QuantityAssignment_2 : ( ruleQuantity ) ;
    public final void rule__Measurement__QuantityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5348:1: ( ( ruleQuantity ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5349:1: ( ruleQuantity )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5349:1: ( ruleQuantity )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5350:1: ruleQuantity
            {
             before(grammarAccess.getMeasurementAccess().getQuantityQuantityEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQuantity_in_rule__Measurement__QuantityAssignment_210730);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5359:1: rule__Measurement__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Measurement__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5363:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5364:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5364:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5365:1: RULE_ID
            {
             before(grammarAccess.getMeasurementAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Measurement__NameAssignment_310761); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5374:1: rule__Measurement__ScaleAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__Measurement__ScaleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5378:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5379:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5379:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5380:1: ruleDOUBLE
            {
             before(grammarAccess.getMeasurementAccess().getScaleDOUBLEParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Measurement__ScaleAssignment_510792);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5389:1: rule__Measurement__UnitAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Measurement__UnitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5393:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5394:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5394:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5395:1: RULE_STRING
            {
             before(grammarAccess.getMeasurementAccess().getUnitSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Measurement__UnitAssignment_610823); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5404:1: rule__Measurement__RepresentationAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Measurement__RepresentationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5408:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5409:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5409:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5410:1: ( RULE_ID )
            {
             before(grammarAccess.getMeasurementAccess().getRepresentationRepresentationCrossReference_8_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5411:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5412:1: RULE_ID
            {
             before(grammarAccess.getMeasurementAccess().getRepresentationRepresentationIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Measurement__RepresentationAssignment_810858); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5423:1: rule__Measurement__ConstraintsAssignment_9 : ( ruleMeasurementConstraint ) ;
    public final void rule__Measurement__ConstraintsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5427:1: ( ( ruleMeasurementConstraint ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5428:1: ( ruleMeasurementConstraint )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5428:1: ( ruleMeasurementConstraint )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5429:1: ruleMeasurementConstraint
            {
             before(grammarAccess.getMeasurementAccess().getConstraintsMeasurementConstraintParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleMeasurementConstraint_in_rule__Measurement__ConstraintsAssignment_910893);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5438:1: rule__MeasurementInRange__LowerBoundAssignment_1 : ( ruleMeasure ) ;
    public final void rule__MeasurementInRange__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5442:1: ( ( ruleMeasure ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5443:1: ( ruleMeasure )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5443:1: ( ruleMeasure )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5444:1: ruleMeasure
            {
             before(grammarAccess.getMeasurementInRangeAccess().getLowerBoundMeasureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMeasure_in_rule__MeasurementInRange__LowerBoundAssignment_110924);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5453:1: rule__MeasurementInRange__UpperBoundAssignment_3 : ( ruleMeasure ) ;
    public final void rule__MeasurementInRange__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5457:1: ( ( ruleMeasure ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5458:1: ( ruleMeasure )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5458:1: ( ruleMeasure )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5459:1: ruleMeasure
            {
             before(grammarAccess.getMeasurementInRangeAccess().getUpperBoundMeasureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMeasure_in_rule__MeasurementInRange__UpperBoundAssignment_310955);
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


    // $ANTLR start "rule__MeasurementAdaption__ScalingFactorAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5468:1: rule__MeasurementAdaption__ScalingFactorAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__MeasurementAdaption__ScalingFactorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5472:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5473:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5473:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5474:1: ruleDOUBLE
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getScalingFactorDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__MeasurementAdaption__ScalingFactorAssignment_310986);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getMeasurementAdaptionAccess().getScalingFactorDOUBLEParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementAdaption__ScalingFactorAssignment_3"


    // $ANTLR start "rule__MeasurementAdaption__OffsetAssignment_7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5483:1: rule__MeasurementAdaption__OffsetAssignment_7 : ( ruleDOUBLE ) ;
    public final void rule__MeasurementAdaption__OffsetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5487:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5488:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5488:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5489:1: ruleDOUBLE
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getOffsetDOUBLEParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__MeasurementAdaption__OffsetAssignment_711017);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getMeasurementAdaptionAccess().getOffsetDOUBLEParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementAdaption__OffsetAssignment_7"


    // $ANTLR start "rule__Measure__ValueAssignment_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5498:1: rule__Measure__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Measure__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5502:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5503:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5503:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5504:1: ruleDOUBLE
            {
             before(grammarAccess.getMeasureAccess().getValueDOUBLEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Measure__ValueAssignment_011048);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5513:1: rule__Measure__UnitAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Measure__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5517:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5518:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5518:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5519:1: RULE_STRING
            {
             before(grammarAccess.getMeasureAccess().getUnitSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Measure__UnitAssignment_111079); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5528:1: rule__PrimitiveInterpretation__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__PrimitiveInterpretation__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5532:1: ( ( ruleType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5533:1: ( ruleType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5533:1: ( ruleType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5534:1: ruleType
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getTypeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__PrimitiveInterpretation__TypeAssignment_111110);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5543:1: rule__PrimitiveInterpretation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PrimitiveInterpretation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5547:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5548:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5548:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5549:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimitiveInterpretation__NameAssignment_211141); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5558:1: rule__PrimitiveInterpretation__RepresentationAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__PrimitiveInterpretation__RepresentationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5562:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5563:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5563:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5564:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getRepresentationRepresentationCrossReference_4_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5565:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5566:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getRepresentationRepresentationIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimitiveInterpretation__RepresentationAssignment_411176); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5577:1: rule__Constant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5581:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5582:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5582:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5583:1: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_111211); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5592:1: rule__Constant__RepresentationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Constant__RepresentationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5596:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5597:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5597:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5598:1: ( RULE_ID )
            {
             before(grammarAccess.getConstantAccess().getRepresentationRepresentationCrossReference_3_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5599:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5600:1: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getRepresentationRepresentationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__RepresentationAssignment_311246); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5611:1: rule__Constant__ConstantValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Constant__ConstantValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5615:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5616:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5616:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5617:1: RULE_STRING
            {
             before(grammarAccess.getConstantAccess().getConstantValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constant__ConstantValueAssignment_511281); 
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
    public static final BitSet FOLLOW_ruleTransmission_in_entryRuleTransmission181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransmission188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transmission__Alternatives_in_ruleTransmission214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePush_in_entryRulePush241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePush248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__Group__0_in_rulePush274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePull_in_entryRulePull301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePull308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pull__Alternatives_in_rulePull334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeDivisionMultiplexing_in_entryRuleTimeDivisionMultiplexing361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeDivisionMultiplexing368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__0_in_ruleTimeDivisionMultiplexing394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepresentation_in_entryRuleRepresentation421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepresentation428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__0_in_ruleRepresentation454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretation_in_entryRuleInterpretation481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterpretation488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interpretation__Alternatives_in_ruleInterpretation514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_entryRuleCalculated541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalculated548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__0_in_ruleCalculated574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretationGroup_in_entryRuleInterpretationGroup661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterpretationGroup668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__0_in_ruleInterpretationGroup694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurement_in_entryRuleMeasurement721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurement728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__0_in_ruleMeasurement754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementConstraint_in_entryRuleMeasurementConstraint781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementConstraint788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementConstraint__Alternatives_in_ruleMeasurementConstraint814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementInRange_in_entryRuleMeasurementInRange841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementInRange848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__0_in_ruleMeasurementInRange874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementAdaption_in_entryRuleMeasurementAdaption901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementAdaption908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__0_in_ruleMeasurementAdaption934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_entryRuleMeasure961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasure968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__Group__0_in_ruleMeasure994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveInterpretation_in_entryRulePrimitiveInterpretation1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveInterpretation1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__0_in_rulePrimitiveInterpretation1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationLanguage__Alternatives_in_ruleGenerationLanguage1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleArgumentType1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantity__Alternatives_in_ruleQuantity1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__RepresentationsAssignment_4_0_in_rule__DataModel__Alternatives_41357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__InterpretationsAssignment_4_1_in_rule__DataModel__Alternatives_41375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__0_in_rule__Options__Alternatives_11408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__0_in_rule__Options__Alternatives_11426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__0_in_rule__Options__Alternatives_11444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePull_in_rule__Transmission__Alternatives1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePush_in_rule__Transmission__Alternatives1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeDivisionMultiplexing_in_rule__Pull__Alternatives1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__0_in_rule__Pull__Alternatives1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Representation__Alternatives_01577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Representation__Alternatives_01597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Representation__Alternatives_61632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Representation__Alternatives_61652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__Interpretation__Alternatives1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveInterpretation_in_rule__Interpretation__Alternatives1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurement_in_rule__Interpretation__Alternatives1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretationGroup_in_rule__Interpretation__Alternatives1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_rule__Interpretation__Alternatives1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Calculated__Alternatives_01787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Calculated__Alternatives_01807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementInRange_in_rule__MeasurementConstraint__Alternatives1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementAdaption_in_rule__MeasurementConstraint__Alternatives1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GenerationLanguage__Alternatives1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GenerationLanguage__Alternatives1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GenerationLanguage__Alternatives1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Quantity__Alternatives1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Quantity__Alternatives1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Quantity__Alternatives2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Quantity__Alternatives2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Quantity__Alternatives2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Type__Alternatives2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Type__Alternatives2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Type__Alternatives2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Type__Alternatives2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Type__Alternatives2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Type__Alternatives2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__02227 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__02230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DataModel__Group__0__Impl2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__12289 = new BitSet(new long[]{0x0000052000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__12292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DataModel__Group__1__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__22351 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__22354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__OptionsAssignment_2_in_rule__DataModel__Group__2__Impl2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__32411 = new BitSet(new long[]{0x0300000800033000L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__32414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DataModel__Group__3__Impl2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__42473 = new BitSet(new long[]{0x0300000800033000L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__DataModel__Group__5_in_rule__DataModel__Group__42476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Alternatives_4_in_rule__DataModel__Group__4__Impl2503 = new BitSet(new long[]{0x0300000000033002L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__DataModel__Group__5__Impl_in_rule__DataModel__Group__52534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataModel__Group__6_in_rule__DataModel__Group__52537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DataModel__Group__5__Impl2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__6__Impl_in_rule__DataModel__Group__62596 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__7_in_rule__DataModel__Group__62599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__TransmitAssignment_6_in_rule__DataModel__Group__6__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__7__Impl_in_rule__DataModel__Group__72656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_7__0_in_rule__DataModel__Group__7__Impl2683 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_7__0__Impl_in_rule__DataModel__Group_7__02730 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataModel__Group_7__1_in_rule__DataModel__Group_7__02733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DataModel__Group_7__0__Impl2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_7__1__Impl_in_rule__DataModel__Group_7__12792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__TransmitAssignment_7_1_in_rule__DataModel__Group_7__1__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group__0__Impl_in_rule__Options__Group__02853 = new BitSet(new long[]{0x0000052000000000L});
    public static final BitSet FOLLOW_rule__Options__Group__1_in_rule__Options__Group__02856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group__1__Impl_in_rule__Options__Group__12914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Alternatives_1_in_rule__Options__Group__1__Impl2941 = new BitSet(new long[]{0x0000052000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__0__Impl_in_rule__Options__Group_1_0__02976 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__1_in_rule__Options__Group_1_0__02979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Options__Group_1_0__0__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__1__Impl_in_rule__Options__Group_1_0__13038 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__2_in_rule__Options__Group_1_0__13041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Options__Group_1_0__1__Impl3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__2__Impl_in_rule__Options__Group_1_0__23100 = new BitSet(new long[]{0x0001880000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__3_in_rule__Options__Group_1_0__23103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Options__Group_1_0__2__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__3__Impl_in_rule__Options__Group_1_0__33162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__TransmissionTypeAssignment_1_0_3_in_rule__Options__Group_1_0__3__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__0__Impl_in_rule__Options__Group_1_1__03227 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__1_in_rule__Options__Group_1_1__03230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Options__Group_1_1__0__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__1__Impl_in_rule__Options__Group_1_1__13289 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__2_in_rule__Options__Group_1_1__13292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Options__Group_1_1__1__Impl3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__2__Impl_in_rule__Options__Group_1_1__23351 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__3_in_rule__Options__Group_1_1__23354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Options__Group_1_1__2__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__3__Impl_in_rule__Options__Group_1_1__33413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__SensorLanguageAssignment_1_1_3_in_rule__Options__Group_1_1__3__Impl3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__0__Impl_in_rule__Options__Group_1_2__03478 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__1_in_rule__Options__Group_1_2__03481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Options__Group_1_2__0__Impl3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__1__Impl_in_rule__Options__Group_1_2__13540 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__2_in_rule__Options__Group_1_2__13543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Options__Group_1_2__1__Impl3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__2__Impl_in_rule__Options__Group_1_2__23602 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__3_in_rule__Options__Group_1_2__23605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Options__Group_1_2__2__Impl3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__3__Impl_in_rule__Options__Group_1_2__33664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__ReceiverLanguageAssignment_1_2_3_in_rule__Options__Group_1_2__3__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__Group__0__Impl_in_rule__Push__Group__03729 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Push__Group__1_in_rule__Push__Group__03732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Push__Group__0__Impl3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__Group__1__Impl_in_rule__Push__Group__13791 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Push__Group__2_in_rule__Push__Group__13794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__Group_1__0_in_rule__Push__Group__1__Impl3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__Group__2__Impl_in_rule__Push__Group__23852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Push__Group__3_in_rule__Push__Group__23855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Push__Group__2__Impl3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__Group__3__Impl_in_rule__Push__Group__33914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__MethodNameAssignment_3_in_rule__Push__Group__3__Impl3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__Group_1__0__Impl_in_rule__Push__Group_1__03979 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Push__Group_1__1_in_rule__Push__Group_1__03982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Push__Group_1__0__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__Group_1__1__Impl_in_rule__Push__Group_1__14041 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Push__Group_1__2_in_rule__Push__Group_1__14044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Push__Group_1__1__Impl4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__Group_1__2__Impl_in_rule__Push__Group_1__24103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Push__Group_1__3_in_rule__Push__Group_1__24106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Push__Group_1__2__Impl4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__Group_1__3__Impl_in_rule__Push__Group_1__34165 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Push__Group_1__4_in_rule__Push__Group_1__34168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__FrequencyAssignment_1_3_in_rule__Push__Group_1__3__Impl4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__Group_1__4__Impl_in_rule__Push__Group_1__44225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Push__Group_1__4__Impl4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__0__Impl_in_rule__Pull__Group_1__04294 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__1_in_rule__Pull__Group_1__04297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Pull__Group_1__0__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__1__Impl_in_rule__Pull__Group_1__14356 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__2_in_rule__Pull__Group_1__14359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Pull__Group_1__1__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__2__Impl_in_rule__Pull__Group_1__24418 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__3_in_rule__Pull__Group_1__24421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Pull__Group_1__2__Impl4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__3__Impl_in_rule__Pull__Group_1__34480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__4_in_rule__Pull__Group_1__34483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Pull__Group_1__3__Impl4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__4__Impl_in_rule__Pull__Group_1__44542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pull__FrequencyAssignment_1_4_in_rule__Pull__Group_1__4__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__0__Impl_in_rule__TimeDivisionMultiplexing__Group__04609 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__1_in_rule__TimeDivisionMultiplexing__Group__04612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TimeDivisionMultiplexing__Group__0__Impl4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__1__Impl_in_rule__TimeDivisionMultiplexing__Group__14671 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__2_in_rule__TimeDivisionMultiplexing__Group__14674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TimeDivisionMultiplexing__Group__1__Impl4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__2__Impl_in_rule__TimeDivisionMultiplexing__Group__24733 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__3_in_rule__TimeDivisionMultiplexing__Group__24736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__TimeDivisionMultiplexing__Group__2__Impl4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__3__Impl_in_rule__TimeDivisionMultiplexing__Group__34795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__4_in_rule__TimeDivisionMultiplexing__Group__34798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TimeDivisionMultiplexing__Group__3__Impl4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__4__Impl_in_rule__TimeDivisionMultiplexing__Group__44857 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__5_in_rule__TimeDivisionMultiplexing__Group__44860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__FrequencyAssignment_4_in_rule__TimeDivisionMultiplexing__Group__4__Impl4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__5__Impl_in_rule__TimeDivisionMultiplexing__Group__54917 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__6_in_rule__TimeDivisionMultiplexing__Group__54920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__TimeDivisionMultiplexing__Group__5__Impl4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__6__Impl_in_rule__TimeDivisionMultiplexing__Group__64979 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__7_in_rule__TimeDivisionMultiplexing__Group__64982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TimeDivisionMultiplexing__Group__6__Impl5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__7__Impl_in_rule__TimeDivisionMultiplexing__Group__75041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__8_in_rule__TimeDivisionMultiplexing__Group__75044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TimeDivisionMultiplexing__Group__7__Impl5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__8__Impl_in_rule__TimeDivisionMultiplexing__Group__85103 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__9_in_rule__TimeDivisionMultiplexing__Group__85106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__DurationAssignment_8_in_rule__TimeDivisionMultiplexing__Group__8__Impl5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__9__Impl_in_rule__TimeDivisionMultiplexing__Group__95163 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__10_in_rule__TimeDivisionMultiplexing__Group__95166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__TimeDivisionMultiplexing__Group__9__Impl5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__10__Impl_in_rule__TimeDivisionMultiplexing__Group__105225 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__11_in_rule__TimeDivisionMultiplexing__Group__105228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__TimeDivisionMultiplexing__Group__10__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__11__Impl_in_rule__TimeDivisionMultiplexing__Group__115287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__12_in_rule__TimeDivisionMultiplexing__Group__115290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TimeDivisionMultiplexing__Group__11__Impl5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__12__Impl_in_rule__TimeDivisionMultiplexing__Group__125349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__TimeSlotAssignment_12_in_rule__TimeDivisionMultiplexing__Group__12__Impl5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__0__Impl_in_rule__Representation__Group__05432 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Representation__Group__1_in_rule__Representation__Group__05435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Alternatives_0_in_rule__Representation__Group__0__Impl5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__1__Impl_in_rule__Representation__Group__15492 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__2_in_rule__Representation__Group__15495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__NameAssignment_1_in_rule__Representation__Group__1__Impl5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__2__Impl_in_rule__Representation__Group__25552 = new BitSet(new long[]{0x00000000FC000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__3_in_rule__Representation__Group__25555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Representation__Group__2__Impl5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__3__Impl_in_rule__Representation__Group__35614 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__4_in_rule__Representation__Group__35617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__TypeAssignment_3_in_rule__Representation__Group__3__Impl5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__4__Impl_in_rule__Representation__Group__45674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Representation__Group__5_in_rule__Representation__Group__45677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Representation__Group__4__Impl5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__5__Impl_in_rule__Representation__Group__55736 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Representation__Group__6_in_rule__Representation__Group__55739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__ByteCountAssignment_5_in_rule__Representation__Group__5__Impl5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__6__Impl_in_rule__Representation__Group__65796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Alternatives_6_in_rule__Representation__Group__6__Impl5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__0__Impl_in_rule__Calculated__Group__05867 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__1_in_rule__Calculated__Group__05870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Alternatives_0_in_rule__Calculated__Group__0__Impl5897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__1__Impl_in_rule__Calculated__Group__15927 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__2_in_rule__Calculated__Group__15930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__NameAssignment_1_in_rule__Calculated__Group__1__Impl5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__2__Impl_in_rule__Calculated__Group__25987 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__3_in_rule__Calculated__Group__25990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Calculated__Group__2__Impl6018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__3__Impl_in_rule__Calculated__Group__36049 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__4_in_rule__Calculated__Group__36052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__RepresentationAssignment_3_in_rule__Calculated__Group__3__Impl6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__4__Impl_in_rule__Calculated__Group__46109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__5_in_rule__Calculated__Group__46112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Calculated__Group__4__Impl6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__5__Impl_in_rule__Calculated__Group__56171 = new BitSet(new long[]{0x0000101000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__6_in_rule__Calculated__Group__56174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__MethodNameAssignment_5_in_rule__Calculated__Group__5__Impl6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__6__Impl_in_rule__Calculated__Group__66231 = new BitSet(new long[]{0x0000101000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__7_in_rule__Calculated__Group__66234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__0_in_rule__Calculated__Group__6__Impl6261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__7__Impl_in_rule__Calculated__Group__76292 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__8_in_rule__Calculated__Group__76295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Calculated__Group__7__Impl6323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__8__Impl_in_rule__Calculated__Group__86354 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__9_in_rule__Calculated__Group__86357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__ParameterAssignment_8_in_rule__Calculated__Group__8__Impl6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__9__Impl_in_rule__Calculated__Group__96414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__0_in_rule__Calculated__Group__9__Impl6441 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__0__Impl_in_rule__Calculated__Group_6__06492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__1_in_rule__Calculated__Group_6__06495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Calculated__Group_6__0__Impl6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__1__Impl_in_rule__Calculated__Group_6__16554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__MethodNameOutAssignment_6_1_in_rule__Calculated__Group_6__1__Impl6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__0__Impl_in_rule__Calculated__Group_9__06615 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__1_in_rule__Calculated__Group_9__06618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Calculated__Group_9__0__Impl6646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__1__Impl_in_rule__Calculated__Group_9__16677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__ParameterAssignment_9_1_in_rule__Calculated__Group_9__1__Impl6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06738 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Parameter__Group__0__Impl6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16800 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__InterpretationAssignment_1_in_rule__Parameter__Group__1__Impl6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26860 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__26863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__36921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Parameter__Group__3__Impl6949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__06988 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__06991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Parameter__Group_2__0__Impl7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__17050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ArgumentTypeAssignment_2_1_in_rule__Parameter__Group_2__1__Impl7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__0__Impl_in_rule__InterpretationGroup__Group__07111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__1_in_rule__InterpretationGroup__Group__07114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__InterpretationGroup__Group__0__Impl7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__1__Impl_in_rule__InterpretationGroup__Group__17173 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__2_in_rule__InterpretationGroup__Group__17176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__NameAssignment_1_in_rule__InterpretationGroup__Group__1__Impl7203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__2__Impl_in_rule__InterpretationGroup__Group__27233 = new BitSet(new long[]{0x0300000400033000L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__3_in_rule__InterpretationGroup__Group__27236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InterpretationGroup__Group__2__Impl7264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__3__Impl_in_rule__InterpretationGroup__Group__37295 = new BitSet(new long[]{0x0300000400033000L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__4_in_rule__InterpretationGroup__Group__37298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__InterpretationsAssignment_3_in_rule__InterpretationGroup__Group__3__Impl7325 = new BitSet(new long[]{0x0300000000033002L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__4__Impl_in_rule__InterpretationGroup__Group__47356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__InterpretationGroup__Group__4__Impl7384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__0__Impl_in_rule__Measurement__Group__07425 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__1_in_rule__Measurement__Group__07428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Measurement__Group__0__Impl7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__1__Impl_in_rule__Measurement__Group__17487 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__2_in_rule__Measurement__Group__17490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Measurement__Group__1__Impl7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__2__Impl_in_rule__Measurement__Group__27549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Measurement__Group__3_in_rule__Measurement__Group__27552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__QuantityAssignment_2_in_rule__Measurement__Group__2__Impl7579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__3__Impl_in_rule__Measurement__Group__37609 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__4_in_rule__Measurement__Group__37612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__NameAssignment_3_in_rule__Measurement__Group__3__Impl7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__4__Impl_in_rule__Measurement__Group__47669 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Measurement__Group__5_in_rule__Measurement__Group__47672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Measurement__Group__4__Impl7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__5__Impl_in_rule__Measurement__Group__57731 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Measurement__Group__6_in_rule__Measurement__Group__57734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__ScaleAssignment_5_in_rule__Measurement__Group__5__Impl7761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__6__Impl_in_rule__Measurement__Group__67792 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__7_in_rule__Measurement__Group__67795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__UnitAssignment_6_in_rule__Measurement__Group__6__Impl7822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__7__Impl_in_rule__Measurement__Group__77852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Measurement__Group__8_in_rule__Measurement__Group__77855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Measurement__Group__7__Impl7883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__8__Impl_in_rule__Measurement__Group__87914 = new BitSet(new long[]{0x1000100000000000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__9_in_rule__Measurement__Group__87917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__RepresentationAssignment_8_in_rule__Measurement__Group__8__Impl7944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__9__Impl_in_rule__Measurement__Group__97974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__ConstraintsAssignment_9_in_rule__Measurement__Group__9__Impl8001 = new BitSet(new long[]{0x1000100000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__0__Impl_in_rule__MeasurementInRange__Group__08052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__1_in_rule__MeasurementInRange__Group__08055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__MeasurementInRange__Group__0__Impl8083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__1__Impl_in_rule__MeasurementInRange__Group__18114 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__2_in_rule__MeasurementInRange__Group__18117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__LowerBoundAssignment_1_in_rule__MeasurementInRange__Group__1__Impl8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__2__Impl_in_rule__MeasurementInRange__Group__28174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__3_in_rule__MeasurementInRange__Group__28177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__MeasurementInRange__Group__2__Impl8205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__3__Impl_in_rule__MeasurementInRange__Group__38236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__UpperBoundAssignment_3_in_rule__MeasurementInRange__Group__3__Impl8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__0__Impl_in_rule__MeasurementAdaption__Group__08301 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__1_in_rule__MeasurementAdaption__Group__08304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MeasurementAdaption__Group__0__Impl8332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__1__Impl_in_rule__MeasurementAdaption__Group__18363 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__2_in_rule__MeasurementAdaption__Group__18366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__MeasurementAdaption__Group__1__Impl8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__2__Impl_in_rule__MeasurementAdaption__Group__28425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__3_in_rule__MeasurementAdaption__Group__28428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MeasurementAdaption__Group__2__Impl8456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__3__Impl_in_rule__MeasurementAdaption__Group__38487 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__4_in_rule__MeasurementAdaption__Group__38490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__ScalingFactorAssignment_3_in_rule__MeasurementAdaption__Group__3__Impl8517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__4__Impl_in_rule__MeasurementAdaption__Group__48547 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__5_in_rule__MeasurementAdaption__Group__48550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__MeasurementAdaption__Group__4__Impl8578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__5__Impl_in_rule__MeasurementAdaption__Group__58609 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__6_in_rule__MeasurementAdaption__Group__58612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__MeasurementAdaption__Group__5__Impl8640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__6__Impl_in_rule__MeasurementAdaption__Group__68671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__7_in_rule__MeasurementAdaption__Group__68674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MeasurementAdaption__Group__6__Impl8702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__7__Impl_in_rule__MeasurementAdaption__Group__78733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__OffsetAssignment_7_in_rule__MeasurementAdaption__Group__7__Impl8760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__Group__0__Impl_in_rule__Measure__Group__08806 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Measure__Group__1_in_rule__Measure__Group__08809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__ValueAssignment_0_in_rule__Measure__Group__0__Impl8836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__Group__1__Impl_in_rule__Measure__Group__18866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__UnitAssignment_1_in_rule__Measure__Group__1__Impl8893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__0__Impl_in_rule__PrimitiveInterpretation__Group__08927 = new BitSet(new long[]{0x00000000FC000000L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__1_in_rule__PrimitiveInterpretation__Group__08930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__PrimitiveInterpretation__Group__0__Impl8958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__1__Impl_in_rule__PrimitiveInterpretation__Group__18989 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__2_in_rule__PrimitiveInterpretation__Group__18992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__TypeAssignment_1_in_rule__PrimitiveInterpretation__Group__1__Impl9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__2__Impl_in_rule__PrimitiveInterpretation__Group__29049 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__3_in_rule__PrimitiveInterpretation__Group__29052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__NameAssignment_2_in_rule__PrimitiveInterpretation__Group__2__Impl9079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__3__Impl_in_rule__PrimitiveInterpretation__Group__39109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__4_in_rule__PrimitiveInterpretation__Group__39112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__PrimitiveInterpretation__Group__3__Impl9140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__4__Impl_in_rule__PrimitiveInterpretation__Group__49171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__RepresentationAssignment_4_in_rule__PrimitiveInterpretation__Group__4__Impl9198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__09238 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__09241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Constant__Group__0__Impl9269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__19300 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__19303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl9330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__29360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__29363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Constant__Group__2__Impl9391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__39422 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__39425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__RepresentationAssignment_3_in_rule__Constant__Group__3__Impl9452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__49482 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Constant__Group__5_in_rule__Constant__Group__49485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Constant__Group__4__Impl9513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__5__Impl_in_rule__Constant__Group__59544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ConstantValueAssignment_5_in_rule__Constant__Group__5__Impl9571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__09613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__09616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl9643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__19672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl9699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__09734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__09737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__DOUBLE__Group_1__0__Impl9765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__19796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl9823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptions_in_rule__DataModel__OptionsAssignment_29861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepresentation_in_rule__DataModel__RepresentationsAssignment_4_09892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretation_in_rule__DataModel__InterpretationsAssignment_4_19923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_69958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_7_19997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransmission_in_rule__Options__TransmissionTypeAssignment_1_0_310032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_rule__Options__SensorLanguageAssignment_1_1_310063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_rule__Options__ReceiverLanguageAssignment_1_2_310094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Push__FrequencyAssignment_1_310125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Push__MethodNameAssignment_310156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Pull__FrequencyAssignment_1_410187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TimeDivisionMultiplexing__FrequencyAssignment_410218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__TimeDivisionMultiplexing__DurationAssignment_810249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__TimeDivisionMultiplexing__TimeSlotAssignment_1210280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Representation__NameAssignment_110311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Representation__TypeAssignment_310342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Representation__ByteCountAssignment_510373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__NameAssignment_110404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__RepresentationAssignment_310439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__MethodNameAssignment_510474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__MethodNameOutAssignment_6_110505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_810536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_9_110567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__InterpretationAssignment_110602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentType_in_rule__Parameter__ArgumentTypeAssignment_2_110637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InterpretationGroup__NameAssignment_110668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretation_in_rule__InterpretationGroup__InterpretationsAssignment_310699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantity_in_rule__Measurement__QuantityAssignment_210730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Measurement__NameAssignment_310761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Measurement__ScaleAssignment_510792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Measurement__UnitAssignment_610823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Measurement__RepresentationAssignment_810858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementConstraint_in_rule__Measurement__ConstraintsAssignment_910893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_rule__MeasurementInRange__LowerBoundAssignment_110924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_rule__MeasurementInRange__UpperBoundAssignment_310955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__MeasurementAdaption__ScalingFactorAssignment_310986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__MeasurementAdaption__OffsetAssignment_711017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Measure__ValueAssignment_011048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Measure__UnitAssignment_111079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__PrimitiveInterpretation__TypeAssignment_111110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveInterpretation__NameAssignment_211141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveInterpretation__RepresentationAssignment_411176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_111211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__RepresentationAssignment_311246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constant__ConstantValueAssignment_511281 = new BitSet(new long[]{0x0000000000000002L});

}