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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BYTE_ARRAY'", "'repr'", "'representation'", "'bytes'", "'byte'", "'calculate'", "'calculated'", "'JAVA'", "'CPP'", "'C'", "'FLOW'", "'TEMPERATURE'", "'VOLUME'", "'DURATION'", "'PRESSURE'", "'BYTE'", "'SHORT'", "'INT'", "'LONG'", "'FLOAT'", "'DOUBLE'", "'options'", "'{'", "'}'", "'transmit'", "','", "'transmission'", "'type'", "':'", "'sensor'", "'language'", "'receiver'", "'push'", "'with'", "'pull'", "'Frequency'", "'timeDivisionMultiplexing'", "'and'", "'Duration'", "'timeSlot'", "'is'", "'by'", "'as'", "'('", "')'", "'group'", "'measurement'", "'of'", "'in'", "'from'", "'to'", "'scaling factor'", "'offset'", "'primitive'", "'constant'", "'.'"
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

            if ( (LA3_0==45||LA3_0==47) ) {
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

            if ( (LA4_0==47) ) {
                alt4=1;
            }
            else if ( (LA4_0==45) ) {
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1844:1: rule__Push__Group__1__Impl : ( 'with' ) ;
    public final void rule__Push__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1848:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1849:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1849:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1850:1: 'with'
            {
             before(grammarAccess.getPushAccess().getWithKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__Push__Group__1__Impl3822); 
             after(grammarAccess.getPushAccess().getWithKeyword_1()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1863:1: rule__Push__Group__2 : rule__Push__Group__2__Impl ;
    public final void rule__Push__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1867:1: ( rule__Push__Group__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1868:2: rule__Push__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Push__Group__2__Impl_in_rule__Push__Group__23853);
            rule__Push__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1874:1: rule__Push__Group__2__Impl : ( ( rule__Push__MethodNameAssignment_2 ) ) ;
    public final void rule__Push__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1878:1: ( ( ( rule__Push__MethodNameAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1879:1: ( ( rule__Push__MethodNameAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1879:1: ( ( rule__Push__MethodNameAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1880:1: ( rule__Push__MethodNameAssignment_2 )
            {
             before(grammarAccess.getPushAccess().getMethodNameAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1881:1: ( rule__Push__MethodNameAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1881:2: rule__Push__MethodNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Push__MethodNameAssignment_2_in_rule__Push__Group__2__Impl3880);
            rule__Push__MethodNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPushAccess().getMethodNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Pull__Group_1__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1897:1: rule__Pull__Group_1__0 : rule__Pull__Group_1__0__Impl rule__Pull__Group_1__1 ;
    public final void rule__Pull__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1901:1: ( rule__Pull__Group_1__0__Impl rule__Pull__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1902:2: rule__Pull__Group_1__0__Impl rule__Pull__Group_1__1
            {
            pushFollow(FOLLOW_rule__Pull__Group_1__0__Impl_in_rule__Pull__Group_1__03916);
            rule__Pull__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pull__Group_1__1_in_rule__Pull__Group_1__03919);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1909:1: rule__Pull__Group_1__0__Impl : ( 'pull' ) ;
    public final void rule__Pull__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1913:1: ( ( 'pull' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1914:1: ( 'pull' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1914:1: ( 'pull' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1915:1: 'pull'
            {
             before(grammarAccess.getPullAccess().getPullKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__Pull__Group_1__0__Impl3947); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1928:1: rule__Pull__Group_1__1 : rule__Pull__Group_1__1__Impl rule__Pull__Group_1__2 ;
    public final void rule__Pull__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1932:1: ( rule__Pull__Group_1__1__Impl rule__Pull__Group_1__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1933:2: rule__Pull__Group_1__1__Impl rule__Pull__Group_1__2
            {
            pushFollow(FOLLOW_rule__Pull__Group_1__1__Impl_in_rule__Pull__Group_1__13978);
            rule__Pull__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pull__Group_1__2_in_rule__Pull__Group_1__13981);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1940:1: rule__Pull__Group_1__1__Impl : ( 'with' ) ;
    public final void rule__Pull__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1944:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1945:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1945:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1946:1: 'with'
            {
             before(grammarAccess.getPullAccess().getWithKeyword_1_1()); 
            match(input,44,FOLLOW_44_in_rule__Pull__Group_1__1__Impl4009); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1959:1: rule__Pull__Group_1__2 : rule__Pull__Group_1__2__Impl rule__Pull__Group_1__3 ;
    public final void rule__Pull__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1963:1: ( rule__Pull__Group_1__2__Impl rule__Pull__Group_1__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1964:2: rule__Pull__Group_1__2__Impl rule__Pull__Group_1__3
            {
            pushFollow(FOLLOW_rule__Pull__Group_1__2__Impl_in_rule__Pull__Group_1__24040);
            rule__Pull__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pull__Group_1__3_in_rule__Pull__Group_1__24043);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1971:1: rule__Pull__Group_1__2__Impl : ( 'Frequency' ) ;
    public final void rule__Pull__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1975:1: ( ( 'Frequency' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1976:1: ( 'Frequency' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1976:1: ( 'Frequency' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1977:1: 'Frequency'
            {
             before(grammarAccess.getPullAccess().getFrequencyKeyword_1_2()); 
            match(input,46,FOLLOW_46_in_rule__Pull__Group_1__2__Impl4071); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1990:1: rule__Pull__Group_1__3 : rule__Pull__Group_1__3__Impl rule__Pull__Group_1__4 ;
    public final void rule__Pull__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1994:1: ( rule__Pull__Group_1__3__Impl rule__Pull__Group_1__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1995:2: rule__Pull__Group_1__3__Impl rule__Pull__Group_1__4
            {
            pushFollow(FOLLOW_rule__Pull__Group_1__3__Impl_in_rule__Pull__Group_1__34102);
            rule__Pull__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pull__Group_1__4_in_rule__Pull__Group_1__34105);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2002:1: rule__Pull__Group_1__3__Impl : ( ':' ) ;
    public final void rule__Pull__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2006:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2007:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2007:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2008:1: ':'
            {
             before(grammarAccess.getPullAccess().getColonKeyword_1_3()); 
            match(input,39,FOLLOW_39_in_rule__Pull__Group_1__3__Impl4133); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2021:1: rule__Pull__Group_1__4 : rule__Pull__Group_1__4__Impl ;
    public final void rule__Pull__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2025:1: ( rule__Pull__Group_1__4__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2026:2: rule__Pull__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Pull__Group_1__4__Impl_in_rule__Pull__Group_1__44164);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2032:1: rule__Pull__Group_1__4__Impl : ( ( rule__Pull__FrequencyAssignment_1_4 ) ) ;
    public final void rule__Pull__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2036:1: ( ( ( rule__Pull__FrequencyAssignment_1_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2037:1: ( ( rule__Pull__FrequencyAssignment_1_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2037:1: ( ( rule__Pull__FrequencyAssignment_1_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2038:1: ( rule__Pull__FrequencyAssignment_1_4 )
            {
             before(grammarAccess.getPullAccess().getFrequencyAssignment_1_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2039:1: ( rule__Pull__FrequencyAssignment_1_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2039:2: rule__Pull__FrequencyAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Pull__FrequencyAssignment_1_4_in_rule__Pull__Group_1__4__Impl4191);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2059:1: rule__TimeDivisionMultiplexing__Group__0 : rule__TimeDivisionMultiplexing__Group__0__Impl rule__TimeDivisionMultiplexing__Group__1 ;
    public final void rule__TimeDivisionMultiplexing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2063:1: ( rule__TimeDivisionMultiplexing__Group__0__Impl rule__TimeDivisionMultiplexing__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2064:2: rule__TimeDivisionMultiplexing__Group__0__Impl rule__TimeDivisionMultiplexing__Group__1
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__0__Impl_in_rule__TimeDivisionMultiplexing__Group__04231);
            rule__TimeDivisionMultiplexing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__1_in_rule__TimeDivisionMultiplexing__Group__04234);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2071:1: rule__TimeDivisionMultiplexing__Group__0__Impl : ( 'timeDivisionMultiplexing' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2075:1: ( ( 'timeDivisionMultiplexing' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2076:1: ( 'timeDivisionMultiplexing' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2076:1: ( 'timeDivisionMultiplexing' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2077:1: 'timeDivisionMultiplexing'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getTimeDivisionMultiplexingKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__TimeDivisionMultiplexing__Group__0__Impl4262); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2090:1: rule__TimeDivisionMultiplexing__Group__1 : rule__TimeDivisionMultiplexing__Group__1__Impl rule__TimeDivisionMultiplexing__Group__2 ;
    public final void rule__TimeDivisionMultiplexing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2094:1: ( rule__TimeDivisionMultiplexing__Group__1__Impl rule__TimeDivisionMultiplexing__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2095:2: rule__TimeDivisionMultiplexing__Group__1__Impl rule__TimeDivisionMultiplexing__Group__2
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__1__Impl_in_rule__TimeDivisionMultiplexing__Group__14293);
            rule__TimeDivisionMultiplexing__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__2_in_rule__TimeDivisionMultiplexing__Group__14296);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2102:1: rule__TimeDivisionMultiplexing__Group__1__Impl : ( 'with' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2106:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2107:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2107:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2108:1: 'with'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getWithKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__TimeDivisionMultiplexing__Group__1__Impl4324); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2121:1: rule__TimeDivisionMultiplexing__Group__2 : rule__TimeDivisionMultiplexing__Group__2__Impl rule__TimeDivisionMultiplexing__Group__3 ;
    public final void rule__TimeDivisionMultiplexing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2125:1: ( rule__TimeDivisionMultiplexing__Group__2__Impl rule__TimeDivisionMultiplexing__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2126:2: rule__TimeDivisionMultiplexing__Group__2__Impl rule__TimeDivisionMultiplexing__Group__3
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__2__Impl_in_rule__TimeDivisionMultiplexing__Group__24355);
            rule__TimeDivisionMultiplexing__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__3_in_rule__TimeDivisionMultiplexing__Group__24358);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2133:1: rule__TimeDivisionMultiplexing__Group__2__Impl : ( 'Frequency' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2137:1: ( ( 'Frequency' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2138:1: ( 'Frequency' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2138:1: ( 'Frequency' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2139:1: 'Frequency'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getFrequencyKeyword_2()); 
            match(input,46,FOLLOW_46_in_rule__TimeDivisionMultiplexing__Group__2__Impl4386); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2152:1: rule__TimeDivisionMultiplexing__Group__3 : rule__TimeDivisionMultiplexing__Group__3__Impl rule__TimeDivisionMultiplexing__Group__4 ;
    public final void rule__TimeDivisionMultiplexing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2156:1: ( rule__TimeDivisionMultiplexing__Group__3__Impl rule__TimeDivisionMultiplexing__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2157:2: rule__TimeDivisionMultiplexing__Group__3__Impl rule__TimeDivisionMultiplexing__Group__4
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__3__Impl_in_rule__TimeDivisionMultiplexing__Group__34417);
            rule__TimeDivisionMultiplexing__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__4_in_rule__TimeDivisionMultiplexing__Group__34420);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2164:1: rule__TimeDivisionMultiplexing__Group__3__Impl : ( ':' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2168:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2169:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2169:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2170:1: ':'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getColonKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__TimeDivisionMultiplexing__Group__3__Impl4448); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2183:1: rule__TimeDivisionMultiplexing__Group__4 : rule__TimeDivisionMultiplexing__Group__4__Impl rule__TimeDivisionMultiplexing__Group__5 ;
    public final void rule__TimeDivisionMultiplexing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2187:1: ( rule__TimeDivisionMultiplexing__Group__4__Impl rule__TimeDivisionMultiplexing__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2188:2: rule__TimeDivisionMultiplexing__Group__4__Impl rule__TimeDivisionMultiplexing__Group__5
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__4__Impl_in_rule__TimeDivisionMultiplexing__Group__44479);
            rule__TimeDivisionMultiplexing__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__5_in_rule__TimeDivisionMultiplexing__Group__44482);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2195:1: rule__TimeDivisionMultiplexing__Group__4__Impl : ( ( rule__TimeDivisionMultiplexing__FrequencyAssignment_4 ) ) ;
    public final void rule__TimeDivisionMultiplexing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2199:1: ( ( ( rule__TimeDivisionMultiplexing__FrequencyAssignment_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2200:1: ( ( rule__TimeDivisionMultiplexing__FrequencyAssignment_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2200:1: ( ( rule__TimeDivisionMultiplexing__FrequencyAssignment_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2201:1: ( rule__TimeDivisionMultiplexing__FrequencyAssignment_4 )
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getFrequencyAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2202:1: ( rule__TimeDivisionMultiplexing__FrequencyAssignment_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2202:2: rule__TimeDivisionMultiplexing__FrequencyAssignment_4
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__FrequencyAssignment_4_in_rule__TimeDivisionMultiplexing__Group__4__Impl4509);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2212:1: rule__TimeDivisionMultiplexing__Group__5 : rule__TimeDivisionMultiplexing__Group__5__Impl rule__TimeDivisionMultiplexing__Group__6 ;
    public final void rule__TimeDivisionMultiplexing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2216:1: ( rule__TimeDivisionMultiplexing__Group__5__Impl rule__TimeDivisionMultiplexing__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2217:2: rule__TimeDivisionMultiplexing__Group__5__Impl rule__TimeDivisionMultiplexing__Group__6
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__5__Impl_in_rule__TimeDivisionMultiplexing__Group__54539);
            rule__TimeDivisionMultiplexing__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__6_in_rule__TimeDivisionMultiplexing__Group__54542);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2224:1: rule__TimeDivisionMultiplexing__Group__5__Impl : ( 'and' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2228:1: ( ( 'and' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2229:1: ( 'and' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2229:1: ( 'and' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2230:1: 'and'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getAndKeyword_5()); 
            match(input,48,FOLLOW_48_in_rule__TimeDivisionMultiplexing__Group__5__Impl4570); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2243:1: rule__TimeDivisionMultiplexing__Group__6 : rule__TimeDivisionMultiplexing__Group__6__Impl rule__TimeDivisionMultiplexing__Group__7 ;
    public final void rule__TimeDivisionMultiplexing__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2247:1: ( rule__TimeDivisionMultiplexing__Group__6__Impl rule__TimeDivisionMultiplexing__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2248:2: rule__TimeDivisionMultiplexing__Group__6__Impl rule__TimeDivisionMultiplexing__Group__7
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__6__Impl_in_rule__TimeDivisionMultiplexing__Group__64601);
            rule__TimeDivisionMultiplexing__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__7_in_rule__TimeDivisionMultiplexing__Group__64604);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2255:1: rule__TimeDivisionMultiplexing__Group__6__Impl : ( 'Duration' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2259:1: ( ( 'Duration' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2260:1: ( 'Duration' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2260:1: ( 'Duration' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2261:1: 'Duration'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getDurationKeyword_6()); 
            match(input,49,FOLLOW_49_in_rule__TimeDivisionMultiplexing__Group__6__Impl4632); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2274:1: rule__TimeDivisionMultiplexing__Group__7 : rule__TimeDivisionMultiplexing__Group__7__Impl rule__TimeDivisionMultiplexing__Group__8 ;
    public final void rule__TimeDivisionMultiplexing__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2278:1: ( rule__TimeDivisionMultiplexing__Group__7__Impl rule__TimeDivisionMultiplexing__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2279:2: rule__TimeDivisionMultiplexing__Group__7__Impl rule__TimeDivisionMultiplexing__Group__8
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__7__Impl_in_rule__TimeDivisionMultiplexing__Group__74663);
            rule__TimeDivisionMultiplexing__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__8_in_rule__TimeDivisionMultiplexing__Group__74666);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2286:1: rule__TimeDivisionMultiplexing__Group__7__Impl : ( ':' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2290:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2291:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2291:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2292:1: ':'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getColonKeyword_7()); 
            match(input,39,FOLLOW_39_in_rule__TimeDivisionMultiplexing__Group__7__Impl4694); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2305:1: rule__TimeDivisionMultiplexing__Group__8 : rule__TimeDivisionMultiplexing__Group__8__Impl rule__TimeDivisionMultiplexing__Group__9 ;
    public final void rule__TimeDivisionMultiplexing__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2309:1: ( rule__TimeDivisionMultiplexing__Group__8__Impl rule__TimeDivisionMultiplexing__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2310:2: rule__TimeDivisionMultiplexing__Group__8__Impl rule__TimeDivisionMultiplexing__Group__9
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__8__Impl_in_rule__TimeDivisionMultiplexing__Group__84725);
            rule__TimeDivisionMultiplexing__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__9_in_rule__TimeDivisionMultiplexing__Group__84728);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2317:1: rule__TimeDivisionMultiplexing__Group__8__Impl : ( ( rule__TimeDivisionMultiplexing__DurationAssignment_8 ) ) ;
    public final void rule__TimeDivisionMultiplexing__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2321:1: ( ( ( rule__TimeDivisionMultiplexing__DurationAssignment_8 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2322:1: ( ( rule__TimeDivisionMultiplexing__DurationAssignment_8 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2322:1: ( ( rule__TimeDivisionMultiplexing__DurationAssignment_8 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2323:1: ( rule__TimeDivisionMultiplexing__DurationAssignment_8 )
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getDurationAssignment_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2324:1: ( rule__TimeDivisionMultiplexing__DurationAssignment_8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2324:2: rule__TimeDivisionMultiplexing__DurationAssignment_8
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__DurationAssignment_8_in_rule__TimeDivisionMultiplexing__Group__8__Impl4755);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2334:1: rule__TimeDivisionMultiplexing__Group__9 : rule__TimeDivisionMultiplexing__Group__9__Impl rule__TimeDivisionMultiplexing__Group__10 ;
    public final void rule__TimeDivisionMultiplexing__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2338:1: ( rule__TimeDivisionMultiplexing__Group__9__Impl rule__TimeDivisionMultiplexing__Group__10 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2339:2: rule__TimeDivisionMultiplexing__Group__9__Impl rule__TimeDivisionMultiplexing__Group__10
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__9__Impl_in_rule__TimeDivisionMultiplexing__Group__94785);
            rule__TimeDivisionMultiplexing__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__10_in_rule__TimeDivisionMultiplexing__Group__94788);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2346:1: rule__TimeDivisionMultiplexing__Group__9__Impl : ( 'and' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2350:1: ( ( 'and' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2351:1: ( 'and' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2351:1: ( 'and' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2352:1: 'and'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getAndKeyword_9()); 
            match(input,48,FOLLOW_48_in_rule__TimeDivisionMultiplexing__Group__9__Impl4816); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2365:1: rule__TimeDivisionMultiplexing__Group__10 : rule__TimeDivisionMultiplexing__Group__10__Impl rule__TimeDivisionMultiplexing__Group__11 ;
    public final void rule__TimeDivisionMultiplexing__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2369:1: ( rule__TimeDivisionMultiplexing__Group__10__Impl rule__TimeDivisionMultiplexing__Group__11 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2370:2: rule__TimeDivisionMultiplexing__Group__10__Impl rule__TimeDivisionMultiplexing__Group__11
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__10__Impl_in_rule__TimeDivisionMultiplexing__Group__104847);
            rule__TimeDivisionMultiplexing__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__11_in_rule__TimeDivisionMultiplexing__Group__104850);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2377:1: rule__TimeDivisionMultiplexing__Group__10__Impl : ( 'timeSlot' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2381:1: ( ( 'timeSlot' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2382:1: ( 'timeSlot' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2382:1: ( 'timeSlot' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2383:1: 'timeSlot'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getTimeSlotKeyword_10()); 
            match(input,50,FOLLOW_50_in_rule__TimeDivisionMultiplexing__Group__10__Impl4878); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2396:1: rule__TimeDivisionMultiplexing__Group__11 : rule__TimeDivisionMultiplexing__Group__11__Impl rule__TimeDivisionMultiplexing__Group__12 ;
    public final void rule__TimeDivisionMultiplexing__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2400:1: ( rule__TimeDivisionMultiplexing__Group__11__Impl rule__TimeDivisionMultiplexing__Group__12 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2401:2: rule__TimeDivisionMultiplexing__Group__11__Impl rule__TimeDivisionMultiplexing__Group__12
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__11__Impl_in_rule__TimeDivisionMultiplexing__Group__114909);
            rule__TimeDivisionMultiplexing__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__12_in_rule__TimeDivisionMultiplexing__Group__114912);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2408:1: rule__TimeDivisionMultiplexing__Group__11__Impl : ( ':' ) ;
    public final void rule__TimeDivisionMultiplexing__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2412:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2413:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2413:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2414:1: ':'
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getColonKeyword_11()); 
            match(input,39,FOLLOW_39_in_rule__TimeDivisionMultiplexing__Group__11__Impl4940); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2427:1: rule__TimeDivisionMultiplexing__Group__12 : rule__TimeDivisionMultiplexing__Group__12__Impl ;
    public final void rule__TimeDivisionMultiplexing__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2431:1: ( rule__TimeDivisionMultiplexing__Group__12__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2432:2: rule__TimeDivisionMultiplexing__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__Group__12__Impl_in_rule__TimeDivisionMultiplexing__Group__124971);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2438:1: rule__TimeDivisionMultiplexing__Group__12__Impl : ( ( rule__TimeDivisionMultiplexing__TimeSlotAssignment_12 ) ) ;
    public final void rule__TimeDivisionMultiplexing__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2442:1: ( ( ( rule__TimeDivisionMultiplexing__TimeSlotAssignment_12 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2443:1: ( ( rule__TimeDivisionMultiplexing__TimeSlotAssignment_12 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2443:1: ( ( rule__TimeDivisionMultiplexing__TimeSlotAssignment_12 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2444:1: ( rule__TimeDivisionMultiplexing__TimeSlotAssignment_12 )
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getTimeSlotAssignment_12()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2445:1: ( rule__TimeDivisionMultiplexing__TimeSlotAssignment_12 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2445:2: rule__TimeDivisionMultiplexing__TimeSlotAssignment_12
            {
            pushFollow(FOLLOW_rule__TimeDivisionMultiplexing__TimeSlotAssignment_12_in_rule__TimeDivisionMultiplexing__Group__12__Impl4998);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2481:1: rule__Representation__Group__0 : rule__Representation__Group__0__Impl rule__Representation__Group__1 ;
    public final void rule__Representation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2485:1: ( rule__Representation__Group__0__Impl rule__Representation__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2486:2: rule__Representation__Group__0__Impl rule__Representation__Group__1
            {
            pushFollow(FOLLOW_rule__Representation__Group__0__Impl_in_rule__Representation__Group__05054);
            rule__Representation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__1_in_rule__Representation__Group__05057);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2493:1: rule__Representation__Group__0__Impl : ( ( rule__Representation__Alternatives_0 ) ) ;
    public final void rule__Representation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2497:1: ( ( ( rule__Representation__Alternatives_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2498:1: ( ( rule__Representation__Alternatives_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2498:1: ( ( rule__Representation__Alternatives_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2499:1: ( rule__Representation__Alternatives_0 )
            {
             before(grammarAccess.getRepresentationAccess().getAlternatives_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2500:1: ( rule__Representation__Alternatives_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2500:2: rule__Representation__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Representation__Alternatives_0_in_rule__Representation__Group__0__Impl5084);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2510:1: rule__Representation__Group__1 : rule__Representation__Group__1__Impl rule__Representation__Group__2 ;
    public final void rule__Representation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2514:1: ( rule__Representation__Group__1__Impl rule__Representation__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2515:2: rule__Representation__Group__1__Impl rule__Representation__Group__2
            {
            pushFollow(FOLLOW_rule__Representation__Group__1__Impl_in_rule__Representation__Group__15114);
            rule__Representation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__2_in_rule__Representation__Group__15117);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2522:1: rule__Representation__Group__1__Impl : ( ( rule__Representation__NameAssignment_1 ) ) ;
    public final void rule__Representation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2526:1: ( ( ( rule__Representation__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2527:1: ( ( rule__Representation__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2527:1: ( ( rule__Representation__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2528:1: ( rule__Representation__NameAssignment_1 )
            {
             before(grammarAccess.getRepresentationAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2529:1: ( rule__Representation__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2529:2: rule__Representation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Representation__NameAssignment_1_in_rule__Representation__Group__1__Impl5144);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2539:1: rule__Representation__Group__2 : rule__Representation__Group__2__Impl rule__Representation__Group__3 ;
    public final void rule__Representation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2543:1: ( rule__Representation__Group__2__Impl rule__Representation__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2544:2: rule__Representation__Group__2__Impl rule__Representation__Group__3
            {
            pushFollow(FOLLOW_rule__Representation__Group__2__Impl_in_rule__Representation__Group__25174);
            rule__Representation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__3_in_rule__Representation__Group__25177);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2551:1: rule__Representation__Group__2__Impl : ( 'is' ) ;
    public final void rule__Representation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2555:1: ( ( 'is' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2556:1: ( 'is' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2556:1: ( 'is' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2557:1: 'is'
            {
             before(grammarAccess.getRepresentationAccess().getIsKeyword_2()); 
            match(input,51,FOLLOW_51_in_rule__Representation__Group__2__Impl5205); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2570:1: rule__Representation__Group__3 : rule__Representation__Group__3__Impl rule__Representation__Group__4 ;
    public final void rule__Representation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2574:1: ( rule__Representation__Group__3__Impl rule__Representation__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2575:2: rule__Representation__Group__3__Impl rule__Representation__Group__4
            {
            pushFollow(FOLLOW_rule__Representation__Group__3__Impl_in_rule__Representation__Group__35236);
            rule__Representation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__4_in_rule__Representation__Group__35239);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2582:1: rule__Representation__Group__3__Impl : ( ( rule__Representation__TypeAssignment_3 ) ) ;
    public final void rule__Representation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2586:1: ( ( ( rule__Representation__TypeAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2587:1: ( ( rule__Representation__TypeAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2587:1: ( ( rule__Representation__TypeAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2588:1: ( rule__Representation__TypeAssignment_3 )
            {
             before(grammarAccess.getRepresentationAccess().getTypeAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2589:1: ( rule__Representation__TypeAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2589:2: rule__Representation__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Representation__TypeAssignment_3_in_rule__Representation__Group__3__Impl5266);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2599:1: rule__Representation__Group__4 : rule__Representation__Group__4__Impl rule__Representation__Group__5 ;
    public final void rule__Representation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2603:1: ( rule__Representation__Group__4__Impl rule__Representation__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2604:2: rule__Representation__Group__4__Impl rule__Representation__Group__5
            {
            pushFollow(FOLLOW_rule__Representation__Group__4__Impl_in_rule__Representation__Group__45296);
            rule__Representation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__5_in_rule__Representation__Group__45299);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2611:1: rule__Representation__Group__4__Impl : ( 'by' ) ;
    public final void rule__Representation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2615:1: ( ( 'by' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2616:1: ( 'by' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2616:1: ( 'by' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2617:1: 'by'
            {
             before(grammarAccess.getRepresentationAccess().getByKeyword_4()); 
            match(input,52,FOLLOW_52_in_rule__Representation__Group__4__Impl5327); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2630:1: rule__Representation__Group__5 : rule__Representation__Group__5__Impl rule__Representation__Group__6 ;
    public final void rule__Representation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2634:1: ( rule__Representation__Group__5__Impl rule__Representation__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2635:2: rule__Representation__Group__5__Impl rule__Representation__Group__6
            {
            pushFollow(FOLLOW_rule__Representation__Group__5__Impl_in_rule__Representation__Group__55358);
            rule__Representation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__6_in_rule__Representation__Group__55361);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2642:1: rule__Representation__Group__5__Impl : ( ( rule__Representation__ByteCountAssignment_5 ) ) ;
    public final void rule__Representation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2646:1: ( ( ( rule__Representation__ByteCountAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2647:1: ( ( rule__Representation__ByteCountAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2647:1: ( ( rule__Representation__ByteCountAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2648:1: ( rule__Representation__ByteCountAssignment_5 )
            {
             before(grammarAccess.getRepresentationAccess().getByteCountAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2649:1: ( rule__Representation__ByteCountAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2649:2: rule__Representation__ByteCountAssignment_5
            {
            pushFollow(FOLLOW_rule__Representation__ByteCountAssignment_5_in_rule__Representation__Group__5__Impl5388);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2659:1: rule__Representation__Group__6 : rule__Representation__Group__6__Impl ;
    public final void rule__Representation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2663:1: ( rule__Representation__Group__6__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2664:2: rule__Representation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Representation__Group__6__Impl_in_rule__Representation__Group__65418);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2670:1: rule__Representation__Group__6__Impl : ( ( rule__Representation__Alternatives_6 ) ) ;
    public final void rule__Representation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2674:1: ( ( ( rule__Representation__Alternatives_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2675:1: ( ( rule__Representation__Alternatives_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2675:1: ( ( rule__Representation__Alternatives_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2676:1: ( rule__Representation__Alternatives_6 )
            {
             before(grammarAccess.getRepresentationAccess().getAlternatives_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2677:1: ( rule__Representation__Alternatives_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2677:2: rule__Representation__Alternatives_6
            {
            pushFollow(FOLLOW_rule__Representation__Alternatives_6_in_rule__Representation__Group__6__Impl5445);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2701:1: rule__Calculated__Group__0 : rule__Calculated__Group__0__Impl rule__Calculated__Group__1 ;
    public final void rule__Calculated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2705:1: ( rule__Calculated__Group__0__Impl rule__Calculated__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2706:2: rule__Calculated__Group__0__Impl rule__Calculated__Group__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group__0__Impl_in_rule__Calculated__Group__05489);
            rule__Calculated__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__1_in_rule__Calculated__Group__05492);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2713:1: rule__Calculated__Group__0__Impl : ( ( rule__Calculated__Alternatives_0 ) ) ;
    public final void rule__Calculated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2717:1: ( ( ( rule__Calculated__Alternatives_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2718:1: ( ( rule__Calculated__Alternatives_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2718:1: ( ( rule__Calculated__Alternatives_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2719:1: ( rule__Calculated__Alternatives_0 )
            {
             before(grammarAccess.getCalculatedAccess().getAlternatives_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2720:1: ( rule__Calculated__Alternatives_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2720:2: rule__Calculated__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Calculated__Alternatives_0_in_rule__Calculated__Group__0__Impl5519);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2730:1: rule__Calculated__Group__1 : rule__Calculated__Group__1__Impl rule__Calculated__Group__2 ;
    public final void rule__Calculated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2734:1: ( rule__Calculated__Group__1__Impl rule__Calculated__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2735:2: rule__Calculated__Group__1__Impl rule__Calculated__Group__2
            {
            pushFollow(FOLLOW_rule__Calculated__Group__1__Impl_in_rule__Calculated__Group__15549);
            rule__Calculated__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__2_in_rule__Calculated__Group__15552);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2742:1: rule__Calculated__Group__1__Impl : ( ( rule__Calculated__NameAssignment_1 ) ) ;
    public final void rule__Calculated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2746:1: ( ( ( rule__Calculated__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2747:1: ( ( rule__Calculated__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2747:1: ( ( rule__Calculated__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2748:1: ( rule__Calculated__NameAssignment_1 )
            {
             before(grammarAccess.getCalculatedAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2749:1: ( rule__Calculated__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2749:2: rule__Calculated__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Calculated__NameAssignment_1_in_rule__Calculated__Group__1__Impl5579);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2759:1: rule__Calculated__Group__2 : rule__Calculated__Group__2__Impl rule__Calculated__Group__3 ;
    public final void rule__Calculated__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2763:1: ( rule__Calculated__Group__2__Impl rule__Calculated__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2764:2: rule__Calculated__Group__2__Impl rule__Calculated__Group__3
            {
            pushFollow(FOLLOW_rule__Calculated__Group__2__Impl_in_rule__Calculated__Group__25609);
            rule__Calculated__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__3_in_rule__Calculated__Group__25612);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2771:1: rule__Calculated__Group__2__Impl : ( 'as' ) ;
    public final void rule__Calculated__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2775:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2776:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2776:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2777:1: 'as'
            {
             before(grammarAccess.getCalculatedAccess().getAsKeyword_2()); 
            match(input,53,FOLLOW_53_in_rule__Calculated__Group__2__Impl5640); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2790:1: rule__Calculated__Group__3 : rule__Calculated__Group__3__Impl rule__Calculated__Group__4 ;
    public final void rule__Calculated__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2794:1: ( rule__Calculated__Group__3__Impl rule__Calculated__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2795:2: rule__Calculated__Group__3__Impl rule__Calculated__Group__4
            {
            pushFollow(FOLLOW_rule__Calculated__Group__3__Impl_in_rule__Calculated__Group__35671);
            rule__Calculated__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__4_in_rule__Calculated__Group__35674);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2802:1: rule__Calculated__Group__3__Impl : ( ( rule__Calculated__RepresentationAssignment_3 ) ) ;
    public final void rule__Calculated__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2806:1: ( ( ( rule__Calculated__RepresentationAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2807:1: ( ( rule__Calculated__RepresentationAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2807:1: ( ( rule__Calculated__RepresentationAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2808:1: ( rule__Calculated__RepresentationAssignment_3 )
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2809:1: ( rule__Calculated__RepresentationAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2809:2: rule__Calculated__RepresentationAssignment_3
            {
            pushFollow(FOLLOW_rule__Calculated__RepresentationAssignment_3_in_rule__Calculated__Group__3__Impl5701);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2819:1: rule__Calculated__Group__4 : rule__Calculated__Group__4__Impl rule__Calculated__Group__5 ;
    public final void rule__Calculated__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2823:1: ( rule__Calculated__Group__4__Impl rule__Calculated__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2824:2: rule__Calculated__Group__4__Impl rule__Calculated__Group__5
            {
            pushFollow(FOLLOW_rule__Calculated__Group__4__Impl_in_rule__Calculated__Group__45731);
            rule__Calculated__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__5_in_rule__Calculated__Group__45734);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2831:1: rule__Calculated__Group__4__Impl : ( 'by' ) ;
    public final void rule__Calculated__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2835:1: ( ( 'by' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2836:1: ( 'by' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2836:1: ( 'by' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2837:1: 'by'
            {
             before(grammarAccess.getCalculatedAccess().getByKeyword_4()); 
            match(input,52,FOLLOW_52_in_rule__Calculated__Group__4__Impl5762); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2850:1: rule__Calculated__Group__5 : rule__Calculated__Group__5__Impl rule__Calculated__Group__6 ;
    public final void rule__Calculated__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2854:1: ( rule__Calculated__Group__5__Impl rule__Calculated__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2855:2: rule__Calculated__Group__5__Impl rule__Calculated__Group__6
            {
            pushFollow(FOLLOW_rule__Calculated__Group__5__Impl_in_rule__Calculated__Group__55793);
            rule__Calculated__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__6_in_rule__Calculated__Group__55796);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2862:1: rule__Calculated__Group__5__Impl : ( ( rule__Calculated__MethodNameAssignment_5 ) ) ;
    public final void rule__Calculated__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2866:1: ( ( ( rule__Calculated__MethodNameAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2867:1: ( ( rule__Calculated__MethodNameAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2867:1: ( ( rule__Calculated__MethodNameAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2868:1: ( rule__Calculated__MethodNameAssignment_5 )
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2869:1: ( rule__Calculated__MethodNameAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2869:2: rule__Calculated__MethodNameAssignment_5
            {
            pushFollow(FOLLOW_rule__Calculated__MethodNameAssignment_5_in_rule__Calculated__Group__5__Impl5823);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2879:1: rule__Calculated__Group__6 : rule__Calculated__Group__6__Impl rule__Calculated__Group__7 ;
    public final void rule__Calculated__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2883:1: ( rule__Calculated__Group__6__Impl rule__Calculated__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2884:2: rule__Calculated__Group__6__Impl rule__Calculated__Group__7
            {
            pushFollow(FOLLOW_rule__Calculated__Group__6__Impl_in_rule__Calculated__Group__65853);
            rule__Calculated__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__7_in_rule__Calculated__Group__65856);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2891:1: rule__Calculated__Group__6__Impl : ( ( rule__Calculated__Group_6__0 )? ) ;
    public final void rule__Calculated__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2895:1: ( ( ( rule__Calculated__Group_6__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2896:1: ( ( rule__Calculated__Group_6__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2896:1: ( ( rule__Calculated__Group_6__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2897:1: ( rule__Calculated__Group_6__0 )?
            {
             before(grammarAccess.getCalculatedAccess().getGroup_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2898:1: ( rule__Calculated__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2898:2: rule__Calculated__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Calculated__Group_6__0_in_rule__Calculated__Group__6__Impl5883);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2908:1: rule__Calculated__Group__7 : rule__Calculated__Group__7__Impl rule__Calculated__Group__8 ;
    public final void rule__Calculated__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2912:1: ( rule__Calculated__Group__7__Impl rule__Calculated__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2913:2: rule__Calculated__Group__7__Impl rule__Calculated__Group__8
            {
            pushFollow(FOLLOW_rule__Calculated__Group__7__Impl_in_rule__Calculated__Group__75914);
            rule__Calculated__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__8_in_rule__Calculated__Group__75917);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2920:1: rule__Calculated__Group__7__Impl : ( 'with' ) ;
    public final void rule__Calculated__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2924:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2925:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2925:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2926:1: 'with'
            {
             before(grammarAccess.getCalculatedAccess().getWithKeyword_7()); 
            match(input,44,FOLLOW_44_in_rule__Calculated__Group__7__Impl5945); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2939:1: rule__Calculated__Group__8 : rule__Calculated__Group__8__Impl rule__Calculated__Group__9 ;
    public final void rule__Calculated__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2943:1: ( rule__Calculated__Group__8__Impl rule__Calculated__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2944:2: rule__Calculated__Group__8__Impl rule__Calculated__Group__9
            {
            pushFollow(FOLLOW_rule__Calculated__Group__8__Impl_in_rule__Calculated__Group__85976);
            rule__Calculated__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__9_in_rule__Calculated__Group__85979);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2951:1: rule__Calculated__Group__8__Impl : ( ( rule__Calculated__ParameterAssignment_8 ) ) ;
    public final void rule__Calculated__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2955:1: ( ( ( rule__Calculated__ParameterAssignment_8 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2956:1: ( ( rule__Calculated__ParameterAssignment_8 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2956:1: ( ( rule__Calculated__ParameterAssignment_8 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2957:1: ( rule__Calculated__ParameterAssignment_8 )
            {
             before(grammarAccess.getCalculatedAccess().getParameterAssignment_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2958:1: ( rule__Calculated__ParameterAssignment_8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2958:2: rule__Calculated__ParameterAssignment_8
            {
            pushFollow(FOLLOW_rule__Calculated__ParameterAssignment_8_in_rule__Calculated__Group__8__Impl6006);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2968:1: rule__Calculated__Group__9 : rule__Calculated__Group__9__Impl ;
    public final void rule__Calculated__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2972:1: ( rule__Calculated__Group__9__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2973:2: rule__Calculated__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group__9__Impl_in_rule__Calculated__Group__96036);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2979:1: rule__Calculated__Group__9__Impl : ( ( rule__Calculated__Group_9__0 )* ) ;
    public final void rule__Calculated__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2983:1: ( ( ( rule__Calculated__Group_9__0 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2984:1: ( ( rule__Calculated__Group_9__0 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2984:1: ( ( rule__Calculated__Group_9__0 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2985:1: ( rule__Calculated__Group_9__0 )*
            {
             before(grammarAccess.getCalculatedAccess().getGroup_9()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2986:1: ( rule__Calculated__Group_9__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2986:2: rule__Calculated__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Calculated__Group_9__0_in_rule__Calculated__Group__9__Impl6063);
            	    rule__Calculated__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3016:1: rule__Calculated__Group_6__0 : rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1 ;
    public final void rule__Calculated__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3020:1: ( rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3021:2: rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group_6__0__Impl_in_rule__Calculated__Group_6__06114);
            rule__Calculated__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group_6__1_in_rule__Calculated__Group_6__06117);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3028:1: rule__Calculated__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Calculated__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3032:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3033:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3033:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3034:1: ','
            {
             before(grammarAccess.getCalculatedAccess().getCommaKeyword_6_0()); 
            match(input,36,FOLLOW_36_in_rule__Calculated__Group_6__0__Impl6145); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3047:1: rule__Calculated__Group_6__1 : rule__Calculated__Group_6__1__Impl ;
    public final void rule__Calculated__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3051:1: ( rule__Calculated__Group_6__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3052:2: rule__Calculated__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group_6__1__Impl_in_rule__Calculated__Group_6__16176);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3058:1: rule__Calculated__Group_6__1__Impl : ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) ) ;
    public final void rule__Calculated__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3062:1: ( ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3063:1: ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3063:1: ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3064:1: ( rule__Calculated__MethodNameOutAssignment_6_1 )
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameOutAssignment_6_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3065:1: ( rule__Calculated__MethodNameOutAssignment_6_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3065:2: rule__Calculated__MethodNameOutAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Calculated__MethodNameOutAssignment_6_1_in_rule__Calculated__Group_6__1__Impl6203);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3079:1: rule__Calculated__Group_9__0 : rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1 ;
    public final void rule__Calculated__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3083:1: ( rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3084:2: rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group_9__0__Impl_in_rule__Calculated__Group_9__06237);
            rule__Calculated__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group_9__1_in_rule__Calculated__Group_9__06240);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3091:1: rule__Calculated__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Calculated__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3095:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3096:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3096:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3097:1: ','
            {
             before(grammarAccess.getCalculatedAccess().getCommaKeyword_9_0()); 
            match(input,36,FOLLOW_36_in_rule__Calculated__Group_9__0__Impl6268); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3110:1: rule__Calculated__Group_9__1 : rule__Calculated__Group_9__1__Impl ;
    public final void rule__Calculated__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3114:1: ( rule__Calculated__Group_9__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3115:2: rule__Calculated__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group_9__1__Impl_in_rule__Calculated__Group_9__16299);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3121:1: rule__Calculated__Group_9__1__Impl : ( ( rule__Calculated__ParameterAssignment_9_1 ) ) ;
    public final void rule__Calculated__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3125:1: ( ( ( rule__Calculated__ParameterAssignment_9_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3126:1: ( ( rule__Calculated__ParameterAssignment_9_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3126:1: ( ( rule__Calculated__ParameterAssignment_9_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3127:1: ( rule__Calculated__ParameterAssignment_9_1 )
            {
             before(grammarAccess.getCalculatedAccess().getParameterAssignment_9_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3128:1: ( rule__Calculated__ParameterAssignment_9_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3128:2: rule__Calculated__ParameterAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Calculated__ParameterAssignment_9_1_in_rule__Calculated__Group_9__1__Impl6326);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3142:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3146:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3147:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06360);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06363);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3154:1: rule__Parameter__Group__0__Impl : ( '(' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3158:1: ( ( '(' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3159:1: ( '(' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3159:1: ( '(' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3160:1: '('
            {
             before(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__Parameter__Group__0__Impl6391); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3173:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3177:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3178:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16422);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16425);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3185:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__InterpretationAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3189:1: ( ( ( rule__Parameter__InterpretationAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3190:1: ( ( rule__Parameter__InterpretationAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3190:1: ( ( rule__Parameter__InterpretationAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3191:1: ( rule__Parameter__InterpretationAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getInterpretationAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3192:1: ( rule__Parameter__InterpretationAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3192:2: rule__Parameter__InterpretationAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__InterpretationAssignment_1_in_rule__Parameter__Group__1__Impl6452);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3202:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3206:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3207:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26482);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__26485);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3214:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3218:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3219:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3219:1: ( ( rule__Parameter__Group_2__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3220:1: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3221:1: ( rule__Parameter__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==53) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3221:2: rule__Parameter__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl6512);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3231:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3235:1: ( rule__Parameter__Group__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3236:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__36543);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3242:1: rule__Parameter__Group__3__Impl : ( ')' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3246:1: ( ( ')' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3247:1: ( ')' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3247:1: ( ')' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3248:1: ')'
            {
             before(grammarAccess.getParameterAccess().getRightParenthesisKeyword_3()); 
            match(input,55,FOLLOW_55_in_rule__Parameter__Group__3__Impl6571); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3269:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3273:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3274:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__06610);
            rule__Parameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__06613);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3281:1: rule__Parameter__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3285:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3286:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3286:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3287:1: 'as'
            {
             before(grammarAccess.getParameterAccess().getAsKeyword_2_0()); 
            match(input,53,FOLLOW_53_in_rule__Parameter__Group_2__0__Impl6641); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3300:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3304:1: ( rule__Parameter__Group_2__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3305:2: rule__Parameter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__16672);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3311:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3315:1: ( ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3316:1: ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3316:1: ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3317:1: ( rule__Parameter__ArgumentTypeAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getArgumentTypeAssignment_2_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3318:1: ( rule__Parameter__ArgumentTypeAssignment_2_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3318:2: rule__Parameter__ArgumentTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Parameter__ArgumentTypeAssignment_2_1_in_rule__Parameter__Group_2__1__Impl6699);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3332:1: rule__InterpretationGroup__Group__0 : rule__InterpretationGroup__Group__0__Impl rule__InterpretationGroup__Group__1 ;
    public final void rule__InterpretationGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3336:1: ( rule__InterpretationGroup__Group__0__Impl rule__InterpretationGroup__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3337:2: rule__InterpretationGroup__Group__0__Impl rule__InterpretationGroup__Group__1
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__0__Impl_in_rule__InterpretationGroup__Group__06733);
            rule__InterpretationGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterpretationGroup__Group__1_in_rule__InterpretationGroup__Group__06736);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3344:1: rule__InterpretationGroup__Group__0__Impl : ( 'group' ) ;
    public final void rule__InterpretationGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3348:1: ( ( 'group' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3349:1: ( 'group' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3349:1: ( 'group' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3350:1: 'group'
            {
             before(grammarAccess.getInterpretationGroupAccess().getGroupKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__InterpretationGroup__Group__0__Impl6764); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3363:1: rule__InterpretationGroup__Group__1 : rule__InterpretationGroup__Group__1__Impl rule__InterpretationGroup__Group__2 ;
    public final void rule__InterpretationGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3367:1: ( rule__InterpretationGroup__Group__1__Impl rule__InterpretationGroup__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3368:2: rule__InterpretationGroup__Group__1__Impl rule__InterpretationGroup__Group__2
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__1__Impl_in_rule__InterpretationGroup__Group__16795);
            rule__InterpretationGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterpretationGroup__Group__2_in_rule__InterpretationGroup__Group__16798);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3375:1: rule__InterpretationGroup__Group__1__Impl : ( ( rule__InterpretationGroup__NameAssignment_1 ) ) ;
    public final void rule__InterpretationGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3379:1: ( ( ( rule__InterpretationGroup__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3380:1: ( ( rule__InterpretationGroup__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3380:1: ( ( rule__InterpretationGroup__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3381:1: ( rule__InterpretationGroup__NameAssignment_1 )
            {
             before(grammarAccess.getInterpretationGroupAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3382:1: ( rule__InterpretationGroup__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3382:2: rule__InterpretationGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__NameAssignment_1_in_rule__InterpretationGroup__Group__1__Impl6825);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3392:1: rule__InterpretationGroup__Group__2 : rule__InterpretationGroup__Group__2__Impl rule__InterpretationGroup__Group__3 ;
    public final void rule__InterpretationGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3396:1: ( rule__InterpretationGroup__Group__2__Impl rule__InterpretationGroup__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3397:2: rule__InterpretationGroup__Group__2__Impl rule__InterpretationGroup__Group__3
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__2__Impl_in_rule__InterpretationGroup__Group__26855);
            rule__InterpretationGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterpretationGroup__Group__3_in_rule__InterpretationGroup__Group__26858);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3404:1: rule__InterpretationGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__InterpretationGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3408:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3409:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3409:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3410:1: '{'
            {
             before(grammarAccess.getInterpretationGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__InterpretationGroup__Group__2__Impl6886); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3423:1: rule__InterpretationGroup__Group__3 : rule__InterpretationGroup__Group__3__Impl rule__InterpretationGroup__Group__4 ;
    public final void rule__InterpretationGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3427:1: ( rule__InterpretationGroup__Group__3__Impl rule__InterpretationGroup__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3428:2: rule__InterpretationGroup__Group__3__Impl rule__InterpretationGroup__Group__4
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__3__Impl_in_rule__InterpretationGroup__Group__36917);
            rule__InterpretationGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterpretationGroup__Group__4_in_rule__InterpretationGroup__Group__36920);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3435:1: rule__InterpretationGroup__Group__3__Impl : ( ( rule__InterpretationGroup__InterpretationsAssignment_3 )* ) ;
    public final void rule__InterpretationGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3439:1: ( ( ( rule__InterpretationGroup__InterpretationsAssignment_3 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3440:1: ( ( rule__InterpretationGroup__InterpretationsAssignment_3 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3440:1: ( ( rule__InterpretationGroup__InterpretationsAssignment_3 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3441:1: ( rule__InterpretationGroup__InterpretationsAssignment_3 )*
            {
             before(grammarAccess.getInterpretationGroupAccess().getInterpretationsAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3442:1: ( rule__InterpretationGroup__InterpretationsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=16 && LA19_0<=17)||(LA19_0>=56 && LA19_0<=57)||(LA19_0>=64 && LA19_0<=65)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3442:2: rule__InterpretationGroup__InterpretationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__InterpretationGroup__InterpretationsAssignment_3_in_rule__InterpretationGroup__Group__3__Impl6947);
            	    rule__InterpretationGroup__InterpretationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3452:1: rule__InterpretationGroup__Group__4 : rule__InterpretationGroup__Group__4__Impl ;
    public final void rule__InterpretationGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3456:1: ( rule__InterpretationGroup__Group__4__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3457:2: rule__InterpretationGroup__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InterpretationGroup__Group__4__Impl_in_rule__InterpretationGroup__Group__46978);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3463:1: rule__InterpretationGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__InterpretationGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3467:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3468:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3468:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3469:1: '}'
            {
             before(grammarAccess.getInterpretationGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__InterpretationGroup__Group__4__Impl7006); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3492:1: rule__Measurement__Group__0 : rule__Measurement__Group__0__Impl rule__Measurement__Group__1 ;
    public final void rule__Measurement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3496:1: ( rule__Measurement__Group__0__Impl rule__Measurement__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3497:2: rule__Measurement__Group__0__Impl rule__Measurement__Group__1
            {
            pushFollow(FOLLOW_rule__Measurement__Group__0__Impl_in_rule__Measurement__Group__07047);
            rule__Measurement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__1_in_rule__Measurement__Group__07050);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3504:1: rule__Measurement__Group__0__Impl : ( 'measurement' ) ;
    public final void rule__Measurement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3508:1: ( ( 'measurement' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3509:1: ( 'measurement' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3509:1: ( 'measurement' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3510:1: 'measurement'
            {
             before(grammarAccess.getMeasurementAccess().getMeasurementKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__Measurement__Group__0__Impl7078); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3523:1: rule__Measurement__Group__1 : rule__Measurement__Group__1__Impl rule__Measurement__Group__2 ;
    public final void rule__Measurement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3527:1: ( rule__Measurement__Group__1__Impl rule__Measurement__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3528:2: rule__Measurement__Group__1__Impl rule__Measurement__Group__2
            {
            pushFollow(FOLLOW_rule__Measurement__Group__1__Impl_in_rule__Measurement__Group__17109);
            rule__Measurement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__2_in_rule__Measurement__Group__17112);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3535:1: rule__Measurement__Group__1__Impl : ( 'of' ) ;
    public final void rule__Measurement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3539:1: ( ( 'of' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3540:1: ( 'of' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3540:1: ( 'of' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3541:1: 'of'
            {
             before(grammarAccess.getMeasurementAccess().getOfKeyword_1()); 
            match(input,58,FOLLOW_58_in_rule__Measurement__Group__1__Impl7140); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3554:1: rule__Measurement__Group__2 : rule__Measurement__Group__2__Impl rule__Measurement__Group__3 ;
    public final void rule__Measurement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3558:1: ( rule__Measurement__Group__2__Impl rule__Measurement__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3559:2: rule__Measurement__Group__2__Impl rule__Measurement__Group__3
            {
            pushFollow(FOLLOW_rule__Measurement__Group__2__Impl_in_rule__Measurement__Group__27171);
            rule__Measurement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__3_in_rule__Measurement__Group__27174);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3566:1: rule__Measurement__Group__2__Impl : ( ( rule__Measurement__QuantityAssignment_2 ) ) ;
    public final void rule__Measurement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3570:1: ( ( ( rule__Measurement__QuantityAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3571:1: ( ( rule__Measurement__QuantityAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3571:1: ( ( rule__Measurement__QuantityAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3572:1: ( rule__Measurement__QuantityAssignment_2 )
            {
             before(grammarAccess.getMeasurementAccess().getQuantityAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3573:1: ( rule__Measurement__QuantityAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3573:2: rule__Measurement__QuantityAssignment_2
            {
            pushFollow(FOLLOW_rule__Measurement__QuantityAssignment_2_in_rule__Measurement__Group__2__Impl7201);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3583:1: rule__Measurement__Group__3 : rule__Measurement__Group__3__Impl rule__Measurement__Group__4 ;
    public final void rule__Measurement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3587:1: ( rule__Measurement__Group__3__Impl rule__Measurement__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3588:2: rule__Measurement__Group__3__Impl rule__Measurement__Group__4
            {
            pushFollow(FOLLOW_rule__Measurement__Group__3__Impl_in_rule__Measurement__Group__37231);
            rule__Measurement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__4_in_rule__Measurement__Group__37234);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3595:1: rule__Measurement__Group__3__Impl : ( ( rule__Measurement__NameAssignment_3 ) ) ;
    public final void rule__Measurement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3599:1: ( ( ( rule__Measurement__NameAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3600:1: ( ( rule__Measurement__NameAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3600:1: ( ( rule__Measurement__NameAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3601:1: ( rule__Measurement__NameAssignment_3 )
            {
             before(grammarAccess.getMeasurementAccess().getNameAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3602:1: ( rule__Measurement__NameAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3602:2: rule__Measurement__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Measurement__NameAssignment_3_in_rule__Measurement__Group__3__Impl7261);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3612:1: rule__Measurement__Group__4 : rule__Measurement__Group__4__Impl rule__Measurement__Group__5 ;
    public final void rule__Measurement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3616:1: ( rule__Measurement__Group__4__Impl rule__Measurement__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3617:2: rule__Measurement__Group__4__Impl rule__Measurement__Group__5
            {
            pushFollow(FOLLOW_rule__Measurement__Group__4__Impl_in_rule__Measurement__Group__47291);
            rule__Measurement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__5_in_rule__Measurement__Group__47294);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3624:1: rule__Measurement__Group__4__Impl : ( 'in' ) ;
    public final void rule__Measurement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3628:1: ( ( 'in' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3629:1: ( 'in' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3629:1: ( 'in' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3630:1: 'in'
            {
             before(grammarAccess.getMeasurementAccess().getInKeyword_4()); 
            match(input,59,FOLLOW_59_in_rule__Measurement__Group__4__Impl7322); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3643:1: rule__Measurement__Group__5 : rule__Measurement__Group__5__Impl rule__Measurement__Group__6 ;
    public final void rule__Measurement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3647:1: ( rule__Measurement__Group__5__Impl rule__Measurement__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3648:2: rule__Measurement__Group__5__Impl rule__Measurement__Group__6
            {
            pushFollow(FOLLOW_rule__Measurement__Group__5__Impl_in_rule__Measurement__Group__57353);
            rule__Measurement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__6_in_rule__Measurement__Group__57356);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3655:1: rule__Measurement__Group__5__Impl : ( ( rule__Measurement__ScaleAssignment_5 )? ) ;
    public final void rule__Measurement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3659:1: ( ( ( rule__Measurement__ScaleAssignment_5 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3660:1: ( ( rule__Measurement__ScaleAssignment_5 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3660:1: ( ( rule__Measurement__ScaleAssignment_5 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3661:1: ( rule__Measurement__ScaleAssignment_5 )?
            {
             before(grammarAccess.getMeasurementAccess().getScaleAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3662:1: ( rule__Measurement__ScaleAssignment_5 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3662:2: rule__Measurement__ScaleAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Measurement__ScaleAssignment_5_in_rule__Measurement__Group__5__Impl7383);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3672:1: rule__Measurement__Group__6 : rule__Measurement__Group__6__Impl rule__Measurement__Group__7 ;
    public final void rule__Measurement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3676:1: ( rule__Measurement__Group__6__Impl rule__Measurement__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3677:2: rule__Measurement__Group__6__Impl rule__Measurement__Group__7
            {
            pushFollow(FOLLOW_rule__Measurement__Group__6__Impl_in_rule__Measurement__Group__67414);
            rule__Measurement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__7_in_rule__Measurement__Group__67417);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3684:1: rule__Measurement__Group__6__Impl : ( ( rule__Measurement__UnitAssignment_6 ) ) ;
    public final void rule__Measurement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3688:1: ( ( ( rule__Measurement__UnitAssignment_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3689:1: ( ( rule__Measurement__UnitAssignment_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3689:1: ( ( rule__Measurement__UnitAssignment_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3690:1: ( rule__Measurement__UnitAssignment_6 )
            {
             before(grammarAccess.getMeasurementAccess().getUnitAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3691:1: ( rule__Measurement__UnitAssignment_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3691:2: rule__Measurement__UnitAssignment_6
            {
            pushFollow(FOLLOW_rule__Measurement__UnitAssignment_6_in_rule__Measurement__Group__6__Impl7444);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3701:1: rule__Measurement__Group__7 : rule__Measurement__Group__7__Impl rule__Measurement__Group__8 ;
    public final void rule__Measurement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3705:1: ( rule__Measurement__Group__7__Impl rule__Measurement__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3706:2: rule__Measurement__Group__7__Impl rule__Measurement__Group__8
            {
            pushFollow(FOLLOW_rule__Measurement__Group__7__Impl_in_rule__Measurement__Group__77474);
            rule__Measurement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__8_in_rule__Measurement__Group__77477);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3713:1: rule__Measurement__Group__7__Impl : ( 'as' ) ;
    public final void rule__Measurement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3717:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3718:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3718:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3719:1: 'as'
            {
             before(grammarAccess.getMeasurementAccess().getAsKeyword_7()); 
            match(input,53,FOLLOW_53_in_rule__Measurement__Group__7__Impl7505); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3732:1: rule__Measurement__Group__8 : rule__Measurement__Group__8__Impl rule__Measurement__Group__9 ;
    public final void rule__Measurement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3736:1: ( rule__Measurement__Group__8__Impl rule__Measurement__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3737:2: rule__Measurement__Group__8__Impl rule__Measurement__Group__9
            {
            pushFollow(FOLLOW_rule__Measurement__Group__8__Impl_in_rule__Measurement__Group__87536);
            rule__Measurement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measurement__Group__9_in_rule__Measurement__Group__87539);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3744:1: rule__Measurement__Group__8__Impl : ( ( rule__Measurement__RepresentationAssignment_8 ) ) ;
    public final void rule__Measurement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3748:1: ( ( ( rule__Measurement__RepresentationAssignment_8 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3749:1: ( ( rule__Measurement__RepresentationAssignment_8 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3749:1: ( ( rule__Measurement__RepresentationAssignment_8 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3750:1: ( rule__Measurement__RepresentationAssignment_8 )
            {
             before(grammarAccess.getMeasurementAccess().getRepresentationAssignment_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3751:1: ( rule__Measurement__RepresentationAssignment_8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3751:2: rule__Measurement__RepresentationAssignment_8
            {
            pushFollow(FOLLOW_rule__Measurement__RepresentationAssignment_8_in_rule__Measurement__Group__8__Impl7566);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3761:1: rule__Measurement__Group__9 : rule__Measurement__Group__9__Impl ;
    public final void rule__Measurement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3765:1: ( rule__Measurement__Group__9__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3766:2: rule__Measurement__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Measurement__Group__9__Impl_in_rule__Measurement__Group__97596);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3772:1: rule__Measurement__Group__9__Impl : ( ( rule__Measurement__ConstraintsAssignment_9 )* ) ;
    public final void rule__Measurement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3776:1: ( ( ( rule__Measurement__ConstraintsAssignment_9 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3777:1: ( ( rule__Measurement__ConstraintsAssignment_9 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3777:1: ( ( rule__Measurement__ConstraintsAssignment_9 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3778:1: ( rule__Measurement__ConstraintsAssignment_9 )*
            {
             before(grammarAccess.getMeasurementAccess().getConstraintsAssignment_9()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3779:1: ( rule__Measurement__ConstraintsAssignment_9 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==44||LA21_0==60) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3779:2: rule__Measurement__ConstraintsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Measurement__ConstraintsAssignment_9_in_rule__Measurement__Group__9__Impl7623);
            	    rule__Measurement__ConstraintsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3809:1: rule__MeasurementInRange__Group__0 : rule__MeasurementInRange__Group__0__Impl rule__MeasurementInRange__Group__1 ;
    public final void rule__MeasurementInRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3813:1: ( rule__MeasurementInRange__Group__0__Impl rule__MeasurementInRange__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3814:2: rule__MeasurementInRange__Group__0__Impl rule__MeasurementInRange__Group__1
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__Group__0__Impl_in_rule__MeasurementInRange__Group__07674);
            rule__MeasurementInRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementInRange__Group__1_in_rule__MeasurementInRange__Group__07677);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3821:1: rule__MeasurementInRange__Group__0__Impl : ( 'from' ) ;
    public final void rule__MeasurementInRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3825:1: ( ( 'from' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3826:1: ( 'from' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3826:1: ( 'from' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3827:1: 'from'
            {
             before(grammarAccess.getMeasurementInRangeAccess().getFromKeyword_0()); 
            match(input,60,FOLLOW_60_in_rule__MeasurementInRange__Group__0__Impl7705); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3840:1: rule__MeasurementInRange__Group__1 : rule__MeasurementInRange__Group__1__Impl rule__MeasurementInRange__Group__2 ;
    public final void rule__MeasurementInRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3844:1: ( rule__MeasurementInRange__Group__1__Impl rule__MeasurementInRange__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3845:2: rule__MeasurementInRange__Group__1__Impl rule__MeasurementInRange__Group__2
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__Group__1__Impl_in_rule__MeasurementInRange__Group__17736);
            rule__MeasurementInRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementInRange__Group__2_in_rule__MeasurementInRange__Group__17739);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3852:1: rule__MeasurementInRange__Group__1__Impl : ( ( rule__MeasurementInRange__LowerBoundAssignment_1 ) ) ;
    public final void rule__MeasurementInRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3856:1: ( ( ( rule__MeasurementInRange__LowerBoundAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3857:1: ( ( rule__MeasurementInRange__LowerBoundAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3857:1: ( ( rule__MeasurementInRange__LowerBoundAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3858:1: ( rule__MeasurementInRange__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getMeasurementInRangeAccess().getLowerBoundAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3859:1: ( rule__MeasurementInRange__LowerBoundAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3859:2: rule__MeasurementInRange__LowerBoundAssignment_1
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__LowerBoundAssignment_1_in_rule__MeasurementInRange__Group__1__Impl7766);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3869:1: rule__MeasurementInRange__Group__2 : rule__MeasurementInRange__Group__2__Impl rule__MeasurementInRange__Group__3 ;
    public final void rule__MeasurementInRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3873:1: ( rule__MeasurementInRange__Group__2__Impl rule__MeasurementInRange__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3874:2: rule__MeasurementInRange__Group__2__Impl rule__MeasurementInRange__Group__3
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__Group__2__Impl_in_rule__MeasurementInRange__Group__27796);
            rule__MeasurementInRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementInRange__Group__3_in_rule__MeasurementInRange__Group__27799);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3881:1: rule__MeasurementInRange__Group__2__Impl : ( 'to' ) ;
    public final void rule__MeasurementInRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3885:1: ( ( 'to' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3886:1: ( 'to' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3886:1: ( 'to' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3887:1: 'to'
            {
             before(grammarAccess.getMeasurementInRangeAccess().getToKeyword_2()); 
            match(input,61,FOLLOW_61_in_rule__MeasurementInRange__Group__2__Impl7827); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3900:1: rule__MeasurementInRange__Group__3 : rule__MeasurementInRange__Group__3__Impl ;
    public final void rule__MeasurementInRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3904:1: ( rule__MeasurementInRange__Group__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3905:2: rule__MeasurementInRange__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__Group__3__Impl_in_rule__MeasurementInRange__Group__37858);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3911:1: rule__MeasurementInRange__Group__3__Impl : ( ( rule__MeasurementInRange__UpperBoundAssignment_3 ) ) ;
    public final void rule__MeasurementInRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3915:1: ( ( ( rule__MeasurementInRange__UpperBoundAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3916:1: ( ( rule__MeasurementInRange__UpperBoundAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3916:1: ( ( rule__MeasurementInRange__UpperBoundAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3917:1: ( rule__MeasurementInRange__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getMeasurementInRangeAccess().getUpperBoundAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3918:1: ( rule__MeasurementInRange__UpperBoundAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3918:2: rule__MeasurementInRange__UpperBoundAssignment_3
            {
            pushFollow(FOLLOW_rule__MeasurementInRange__UpperBoundAssignment_3_in_rule__MeasurementInRange__Group__3__Impl7885);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3936:1: rule__MeasurementAdaption__Group__0 : rule__MeasurementAdaption__Group__0__Impl rule__MeasurementAdaption__Group__1 ;
    public final void rule__MeasurementAdaption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3940:1: ( rule__MeasurementAdaption__Group__0__Impl rule__MeasurementAdaption__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3941:2: rule__MeasurementAdaption__Group__0__Impl rule__MeasurementAdaption__Group__1
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__0__Impl_in_rule__MeasurementAdaption__Group__07923);
            rule__MeasurementAdaption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__1_in_rule__MeasurementAdaption__Group__07926);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3948:1: rule__MeasurementAdaption__Group__0__Impl : ( 'with' ) ;
    public final void rule__MeasurementAdaption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3952:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3953:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3953:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3954:1: 'with'
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getWithKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__MeasurementAdaption__Group__0__Impl7954); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3967:1: rule__MeasurementAdaption__Group__1 : rule__MeasurementAdaption__Group__1__Impl rule__MeasurementAdaption__Group__2 ;
    public final void rule__MeasurementAdaption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3971:1: ( rule__MeasurementAdaption__Group__1__Impl rule__MeasurementAdaption__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3972:2: rule__MeasurementAdaption__Group__1__Impl rule__MeasurementAdaption__Group__2
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__1__Impl_in_rule__MeasurementAdaption__Group__17985);
            rule__MeasurementAdaption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__2_in_rule__MeasurementAdaption__Group__17988);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3979:1: rule__MeasurementAdaption__Group__1__Impl : ( 'scaling factor' ) ;
    public final void rule__MeasurementAdaption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3983:1: ( ( 'scaling factor' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3984:1: ( 'scaling factor' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3984:1: ( 'scaling factor' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3985:1: 'scaling factor'
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getScalingFactorKeyword_1()); 
            match(input,62,FOLLOW_62_in_rule__MeasurementAdaption__Group__1__Impl8016); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3998:1: rule__MeasurementAdaption__Group__2 : rule__MeasurementAdaption__Group__2__Impl rule__MeasurementAdaption__Group__3 ;
    public final void rule__MeasurementAdaption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4002:1: ( rule__MeasurementAdaption__Group__2__Impl rule__MeasurementAdaption__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4003:2: rule__MeasurementAdaption__Group__2__Impl rule__MeasurementAdaption__Group__3
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__2__Impl_in_rule__MeasurementAdaption__Group__28047);
            rule__MeasurementAdaption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__3_in_rule__MeasurementAdaption__Group__28050);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4010:1: rule__MeasurementAdaption__Group__2__Impl : ( ':' ) ;
    public final void rule__MeasurementAdaption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4014:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4015:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4015:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4016:1: ':'
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getColonKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__MeasurementAdaption__Group__2__Impl8078); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4029:1: rule__MeasurementAdaption__Group__3 : rule__MeasurementAdaption__Group__3__Impl rule__MeasurementAdaption__Group__4 ;
    public final void rule__MeasurementAdaption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4033:1: ( rule__MeasurementAdaption__Group__3__Impl rule__MeasurementAdaption__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4034:2: rule__MeasurementAdaption__Group__3__Impl rule__MeasurementAdaption__Group__4
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__3__Impl_in_rule__MeasurementAdaption__Group__38109);
            rule__MeasurementAdaption__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__4_in_rule__MeasurementAdaption__Group__38112);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4041:1: rule__MeasurementAdaption__Group__3__Impl : ( ( rule__MeasurementAdaption__ScalingFactorAssignment_3 ) ) ;
    public final void rule__MeasurementAdaption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4045:1: ( ( ( rule__MeasurementAdaption__ScalingFactorAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4046:1: ( ( rule__MeasurementAdaption__ScalingFactorAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4046:1: ( ( rule__MeasurementAdaption__ScalingFactorAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4047:1: ( rule__MeasurementAdaption__ScalingFactorAssignment_3 )
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getScalingFactorAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4048:1: ( rule__MeasurementAdaption__ScalingFactorAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4048:2: rule__MeasurementAdaption__ScalingFactorAssignment_3
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__ScalingFactorAssignment_3_in_rule__MeasurementAdaption__Group__3__Impl8139);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4058:1: rule__MeasurementAdaption__Group__4 : rule__MeasurementAdaption__Group__4__Impl rule__MeasurementAdaption__Group__5 ;
    public final void rule__MeasurementAdaption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4062:1: ( rule__MeasurementAdaption__Group__4__Impl rule__MeasurementAdaption__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4063:2: rule__MeasurementAdaption__Group__4__Impl rule__MeasurementAdaption__Group__5
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__4__Impl_in_rule__MeasurementAdaption__Group__48169);
            rule__MeasurementAdaption__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__5_in_rule__MeasurementAdaption__Group__48172);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4070:1: rule__MeasurementAdaption__Group__4__Impl : ( 'and' ) ;
    public final void rule__MeasurementAdaption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4074:1: ( ( 'and' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4075:1: ( 'and' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4075:1: ( 'and' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4076:1: 'and'
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getAndKeyword_4()); 
            match(input,48,FOLLOW_48_in_rule__MeasurementAdaption__Group__4__Impl8200); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4089:1: rule__MeasurementAdaption__Group__5 : rule__MeasurementAdaption__Group__5__Impl rule__MeasurementAdaption__Group__6 ;
    public final void rule__MeasurementAdaption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4093:1: ( rule__MeasurementAdaption__Group__5__Impl rule__MeasurementAdaption__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4094:2: rule__MeasurementAdaption__Group__5__Impl rule__MeasurementAdaption__Group__6
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__5__Impl_in_rule__MeasurementAdaption__Group__58231);
            rule__MeasurementAdaption__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__6_in_rule__MeasurementAdaption__Group__58234);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4101:1: rule__MeasurementAdaption__Group__5__Impl : ( 'offset' ) ;
    public final void rule__MeasurementAdaption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4105:1: ( ( 'offset' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4106:1: ( 'offset' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4106:1: ( 'offset' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4107:1: 'offset'
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getOffsetKeyword_5()); 
            match(input,63,FOLLOW_63_in_rule__MeasurementAdaption__Group__5__Impl8262); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4120:1: rule__MeasurementAdaption__Group__6 : rule__MeasurementAdaption__Group__6__Impl rule__MeasurementAdaption__Group__7 ;
    public final void rule__MeasurementAdaption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4124:1: ( rule__MeasurementAdaption__Group__6__Impl rule__MeasurementAdaption__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4125:2: rule__MeasurementAdaption__Group__6__Impl rule__MeasurementAdaption__Group__7
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__6__Impl_in_rule__MeasurementAdaption__Group__68293);
            rule__MeasurementAdaption__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__7_in_rule__MeasurementAdaption__Group__68296);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4132:1: rule__MeasurementAdaption__Group__6__Impl : ( ':' ) ;
    public final void rule__MeasurementAdaption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4136:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4137:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4137:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4138:1: ':'
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getColonKeyword_6()); 
            match(input,39,FOLLOW_39_in_rule__MeasurementAdaption__Group__6__Impl8324); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4151:1: rule__MeasurementAdaption__Group__7 : rule__MeasurementAdaption__Group__7__Impl ;
    public final void rule__MeasurementAdaption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4155:1: ( rule__MeasurementAdaption__Group__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4156:2: rule__MeasurementAdaption__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__Group__7__Impl_in_rule__MeasurementAdaption__Group__78355);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4162:1: rule__MeasurementAdaption__Group__7__Impl : ( ( rule__MeasurementAdaption__OffsetAssignment_7 ) ) ;
    public final void rule__MeasurementAdaption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4166:1: ( ( ( rule__MeasurementAdaption__OffsetAssignment_7 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4167:1: ( ( rule__MeasurementAdaption__OffsetAssignment_7 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4167:1: ( ( rule__MeasurementAdaption__OffsetAssignment_7 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4168:1: ( rule__MeasurementAdaption__OffsetAssignment_7 )
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getOffsetAssignment_7()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4169:1: ( rule__MeasurementAdaption__OffsetAssignment_7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4169:2: rule__MeasurementAdaption__OffsetAssignment_7
            {
            pushFollow(FOLLOW_rule__MeasurementAdaption__OffsetAssignment_7_in_rule__MeasurementAdaption__Group__7__Impl8382);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4195:1: rule__Measure__Group__0 : rule__Measure__Group__0__Impl rule__Measure__Group__1 ;
    public final void rule__Measure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4199:1: ( rule__Measure__Group__0__Impl rule__Measure__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4200:2: rule__Measure__Group__0__Impl rule__Measure__Group__1
            {
            pushFollow(FOLLOW_rule__Measure__Group__0__Impl_in_rule__Measure__Group__08428);
            rule__Measure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Measure__Group__1_in_rule__Measure__Group__08431);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4207:1: rule__Measure__Group__0__Impl : ( ( rule__Measure__ValueAssignment_0 ) ) ;
    public final void rule__Measure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4211:1: ( ( ( rule__Measure__ValueAssignment_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4212:1: ( ( rule__Measure__ValueAssignment_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4212:1: ( ( rule__Measure__ValueAssignment_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4213:1: ( rule__Measure__ValueAssignment_0 )
            {
             before(grammarAccess.getMeasureAccess().getValueAssignment_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4214:1: ( rule__Measure__ValueAssignment_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4214:2: rule__Measure__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__Measure__ValueAssignment_0_in_rule__Measure__Group__0__Impl8458);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4224:1: rule__Measure__Group__1 : rule__Measure__Group__1__Impl ;
    public final void rule__Measure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4228:1: ( rule__Measure__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4229:2: rule__Measure__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Measure__Group__1__Impl_in_rule__Measure__Group__18488);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4235:1: rule__Measure__Group__1__Impl : ( ( rule__Measure__UnitAssignment_1 ) ) ;
    public final void rule__Measure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4239:1: ( ( ( rule__Measure__UnitAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4240:1: ( ( rule__Measure__UnitAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4240:1: ( ( rule__Measure__UnitAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4241:1: ( rule__Measure__UnitAssignment_1 )
            {
             before(grammarAccess.getMeasureAccess().getUnitAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4242:1: ( rule__Measure__UnitAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4242:2: rule__Measure__UnitAssignment_1
            {
            pushFollow(FOLLOW_rule__Measure__UnitAssignment_1_in_rule__Measure__Group__1__Impl8515);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4256:1: rule__PrimitiveInterpretation__Group__0 : rule__PrimitiveInterpretation__Group__0__Impl rule__PrimitiveInterpretation__Group__1 ;
    public final void rule__PrimitiveInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4260:1: ( rule__PrimitiveInterpretation__Group__0__Impl rule__PrimitiveInterpretation__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4261:2: rule__PrimitiveInterpretation__Group__0__Impl rule__PrimitiveInterpretation__Group__1
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__0__Impl_in_rule__PrimitiveInterpretation__Group__08549);
            rule__PrimitiveInterpretation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__1_in_rule__PrimitiveInterpretation__Group__08552);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4268:1: rule__PrimitiveInterpretation__Group__0__Impl : ( 'primitive' ) ;
    public final void rule__PrimitiveInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4272:1: ( ( 'primitive' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4273:1: ( 'primitive' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4273:1: ( 'primitive' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4274:1: 'primitive'
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getPrimitiveKeyword_0()); 
            match(input,64,FOLLOW_64_in_rule__PrimitiveInterpretation__Group__0__Impl8580); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4287:1: rule__PrimitiveInterpretation__Group__1 : rule__PrimitiveInterpretation__Group__1__Impl rule__PrimitiveInterpretation__Group__2 ;
    public final void rule__PrimitiveInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4291:1: ( rule__PrimitiveInterpretation__Group__1__Impl rule__PrimitiveInterpretation__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4292:2: rule__PrimitiveInterpretation__Group__1__Impl rule__PrimitiveInterpretation__Group__2
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__1__Impl_in_rule__PrimitiveInterpretation__Group__18611);
            rule__PrimitiveInterpretation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__2_in_rule__PrimitiveInterpretation__Group__18614);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4299:1: rule__PrimitiveInterpretation__Group__1__Impl : ( ( rule__PrimitiveInterpretation__TypeAssignment_1 ) ) ;
    public final void rule__PrimitiveInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4303:1: ( ( ( rule__PrimitiveInterpretation__TypeAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4304:1: ( ( rule__PrimitiveInterpretation__TypeAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4304:1: ( ( rule__PrimitiveInterpretation__TypeAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4305:1: ( rule__PrimitiveInterpretation__TypeAssignment_1 )
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getTypeAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4306:1: ( rule__PrimitiveInterpretation__TypeAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4306:2: rule__PrimitiveInterpretation__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__TypeAssignment_1_in_rule__PrimitiveInterpretation__Group__1__Impl8641);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4316:1: rule__PrimitiveInterpretation__Group__2 : rule__PrimitiveInterpretation__Group__2__Impl rule__PrimitiveInterpretation__Group__3 ;
    public final void rule__PrimitiveInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4320:1: ( rule__PrimitiveInterpretation__Group__2__Impl rule__PrimitiveInterpretation__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4321:2: rule__PrimitiveInterpretation__Group__2__Impl rule__PrimitiveInterpretation__Group__3
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__2__Impl_in_rule__PrimitiveInterpretation__Group__28671);
            rule__PrimitiveInterpretation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__3_in_rule__PrimitiveInterpretation__Group__28674);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4328:1: rule__PrimitiveInterpretation__Group__2__Impl : ( ( rule__PrimitiveInterpretation__NameAssignment_2 ) ) ;
    public final void rule__PrimitiveInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4332:1: ( ( ( rule__PrimitiveInterpretation__NameAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4333:1: ( ( rule__PrimitiveInterpretation__NameAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4333:1: ( ( rule__PrimitiveInterpretation__NameAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4334:1: ( rule__PrimitiveInterpretation__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getNameAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4335:1: ( rule__PrimitiveInterpretation__NameAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4335:2: rule__PrimitiveInterpretation__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__NameAssignment_2_in_rule__PrimitiveInterpretation__Group__2__Impl8701);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4345:1: rule__PrimitiveInterpretation__Group__3 : rule__PrimitiveInterpretation__Group__3__Impl rule__PrimitiveInterpretation__Group__4 ;
    public final void rule__PrimitiveInterpretation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4349:1: ( rule__PrimitiveInterpretation__Group__3__Impl rule__PrimitiveInterpretation__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4350:2: rule__PrimitiveInterpretation__Group__3__Impl rule__PrimitiveInterpretation__Group__4
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__3__Impl_in_rule__PrimitiveInterpretation__Group__38731);
            rule__PrimitiveInterpretation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__4_in_rule__PrimitiveInterpretation__Group__38734);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4357:1: rule__PrimitiveInterpretation__Group__3__Impl : ( 'as' ) ;
    public final void rule__PrimitiveInterpretation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4361:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4362:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4362:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4363:1: 'as'
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getAsKeyword_3()); 
            match(input,53,FOLLOW_53_in_rule__PrimitiveInterpretation__Group__3__Impl8762); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4376:1: rule__PrimitiveInterpretation__Group__4 : rule__PrimitiveInterpretation__Group__4__Impl ;
    public final void rule__PrimitiveInterpretation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4380:1: ( rule__PrimitiveInterpretation__Group__4__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4381:2: rule__PrimitiveInterpretation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__Group__4__Impl_in_rule__PrimitiveInterpretation__Group__48793);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4387:1: rule__PrimitiveInterpretation__Group__4__Impl : ( ( rule__PrimitiveInterpretation__RepresentationAssignment_4 ) ) ;
    public final void rule__PrimitiveInterpretation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4391:1: ( ( ( rule__PrimitiveInterpretation__RepresentationAssignment_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4392:1: ( ( rule__PrimitiveInterpretation__RepresentationAssignment_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4392:1: ( ( rule__PrimitiveInterpretation__RepresentationAssignment_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4393:1: ( rule__PrimitiveInterpretation__RepresentationAssignment_4 )
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getRepresentationAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4394:1: ( rule__PrimitiveInterpretation__RepresentationAssignment_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4394:2: rule__PrimitiveInterpretation__RepresentationAssignment_4
            {
            pushFollow(FOLLOW_rule__PrimitiveInterpretation__RepresentationAssignment_4_in_rule__PrimitiveInterpretation__Group__4__Impl8820);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4414:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4418:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4419:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__08860);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__08863);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4426:1: rule__Constant__Group__0__Impl : ( 'constant' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4430:1: ( ( 'constant' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4431:1: ( 'constant' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4431:1: ( 'constant' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4432:1: 'constant'
            {
             before(grammarAccess.getConstantAccess().getConstantKeyword_0()); 
            match(input,65,FOLLOW_65_in_rule__Constant__Group__0__Impl8891); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4445:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4449:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4450:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__18922);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__18925);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4457:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4461:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4462:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4462:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4463:1: ( rule__Constant__NameAssignment_1 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4464:1: ( rule__Constant__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4464:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl8952);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4474:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4478:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4479:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__28982);
            rule__Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__28985);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4486:1: rule__Constant__Group__2__Impl : ( 'as' ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4490:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4491:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4491:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4492:1: 'as'
            {
             before(grammarAccess.getConstantAccess().getAsKeyword_2()); 
            match(input,53,FOLLOW_53_in_rule__Constant__Group__2__Impl9013); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4505:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4509:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4510:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__39044);
            rule__Constant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__39047);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4517:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__RepresentationAssignment_3 ) ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4521:1: ( ( ( rule__Constant__RepresentationAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4522:1: ( ( rule__Constant__RepresentationAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4522:1: ( ( rule__Constant__RepresentationAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4523:1: ( rule__Constant__RepresentationAssignment_3 )
            {
             before(grammarAccess.getConstantAccess().getRepresentationAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4524:1: ( rule__Constant__RepresentationAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4524:2: rule__Constant__RepresentationAssignment_3
            {
            pushFollow(FOLLOW_rule__Constant__RepresentationAssignment_3_in_rule__Constant__Group__3__Impl9074);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4534:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl rule__Constant__Group__5 ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4538:1: ( rule__Constant__Group__4__Impl rule__Constant__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4539:2: rule__Constant__Group__4__Impl rule__Constant__Group__5
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__49104);
            rule__Constant__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__5_in_rule__Constant__Group__49107);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4546:1: rule__Constant__Group__4__Impl : ( 'is' ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4550:1: ( ( 'is' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4551:1: ( 'is' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4551:1: ( 'is' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4552:1: 'is'
            {
             before(grammarAccess.getConstantAccess().getIsKeyword_4()); 
            match(input,51,FOLLOW_51_in_rule__Constant__Group__4__Impl9135); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4565:1: rule__Constant__Group__5 : rule__Constant__Group__5__Impl ;
    public final void rule__Constant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4569:1: ( rule__Constant__Group__5__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4570:2: rule__Constant__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__5__Impl_in_rule__Constant__Group__59166);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4576:1: rule__Constant__Group__5__Impl : ( ( rule__Constant__ConstantValueAssignment_5 ) ) ;
    public final void rule__Constant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4580:1: ( ( ( rule__Constant__ConstantValueAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4581:1: ( ( rule__Constant__ConstantValueAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4581:1: ( ( rule__Constant__ConstantValueAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4582:1: ( rule__Constant__ConstantValueAssignment_5 )
            {
             before(grammarAccess.getConstantAccess().getConstantValueAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4583:1: ( rule__Constant__ConstantValueAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4583:2: rule__Constant__ConstantValueAssignment_5
            {
            pushFollow(FOLLOW_rule__Constant__ConstantValueAssignment_5_in_rule__Constant__Group__5__Impl9193);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4605:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4609:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4610:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__09235);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__09238);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4617:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4621:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4622:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4622:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4623:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl9265); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4634:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4638:1: ( rule__DOUBLE__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4639:2: rule__DOUBLE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__19294);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4645:1: rule__DOUBLE__Group__1__Impl : ( ( rule__DOUBLE__Group_1__0 )? ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4649:1: ( ( ( rule__DOUBLE__Group_1__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4650:1: ( ( rule__DOUBLE__Group_1__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4650:1: ( ( rule__DOUBLE__Group_1__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4651:1: ( rule__DOUBLE__Group_1__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4652:1: ( rule__DOUBLE__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==66) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4652:2: rule__DOUBLE__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl9321);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4666:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4670:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4671:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__09356);
            rule__DOUBLE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__09359);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4678:1: rule__DOUBLE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4682:1: ( ( '.' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4683:1: ( '.' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4683:1: ( '.' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4684:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
            match(input,66,FOLLOW_66_in_rule__DOUBLE__Group_1__0__Impl9387); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4697:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4701:1: ( rule__DOUBLE__Group_1__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4702:2: rule__DOUBLE__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__19418);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4708:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4712:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4713:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4713:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4714:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl9445); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4730:1: rule__DataModel__OptionsAssignment_2 : ( ruleOptions ) ;
    public final void rule__DataModel__OptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4734:1: ( ( ruleOptions ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4735:1: ( ruleOptions )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4735:1: ( ruleOptions )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4736:1: ruleOptions
            {
             before(grammarAccess.getDataModelAccess().getOptionsOptionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOptions_in_rule__DataModel__OptionsAssignment_29483);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4745:1: rule__DataModel__RepresentationsAssignment_4_0 : ( ruleRepresentation ) ;
    public final void rule__DataModel__RepresentationsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4749:1: ( ( ruleRepresentation ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4750:1: ( ruleRepresentation )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4750:1: ( ruleRepresentation )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4751:1: ruleRepresentation
            {
             before(grammarAccess.getDataModelAccess().getRepresentationsRepresentationParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleRepresentation_in_rule__DataModel__RepresentationsAssignment_4_09514);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4760:1: rule__DataModel__InterpretationsAssignment_4_1 : ( ruleInterpretation ) ;
    public final void rule__DataModel__InterpretationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4764:1: ( ( ruleInterpretation ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4765:1: ( ruleInterpretation )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4765:1: ( ruleInterpretation )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4766:1: ruleInterpretation
            {
             before(grammarAccess.getDataModelAccess().getInterpretationsInterpretationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleInterpretation_in_rule__DataModel__InterpretationsAssignment_4_19545);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4775:1: rule__DataModel__TransmitAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__DataModel__TransmitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4779:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4780:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4780:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4781:1: ( RULE_ID )
            {
             before(grammarAccess.getDataModelAccess().getTransmitInterpretationCrossReference_6_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4782:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4783:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getTransmitInterpretationIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_69580); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4794:1: rule__DataModel__TransmitAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataModel__TransmitAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4798:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4799:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4799:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4800:1: ( RULE_ID )
            {
             before(grammarAccess.getDataModelAccess().getTransmitInterpretationCrossReference_7_1_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4801:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4802:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getTransmitInterpretationIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_7_19619); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4813:1: rule__Options__TransmissionTypeAssignment_1_0_3 : ( ruleTransmission ) ;
    public final void rule__Options__TransmissionTypeAssignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4817:1: ( ( ruleTransmission ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4818:1: ( ruleTransmission )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4818:1: ( ruleTransmission )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4819:1: ruleTransmission
            {
             before(grammarAccess.getOptionsAccess().getTransmissionTypeTransmissionParserRuleCall_1_0_3_0()); 
            pushFollow(FOLLOW_ruleTransmission_in_rule__Options__TransmissionTypeAssignment_1_0_39654);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4828:1: rule__Options__SensorLanguageAssignment_1_1_3 : ( ruleGenerationLanguage ) ;
    public final void rule__Options__SensorLanguageAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4832:1: ( ( ruleGenerationLanguage ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4833:1: ( ruleGenerationLanguage )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4833:1: ( ruleGenerationLanguage )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4834:1: ruleGenerationLanguage
            {
             before(grammarAccess.getOptionsAccess().getSensorLanguageGenerationLanguageEnumRuleCall_1_1_3_0()); 
            pushFollow(FOLLOW_ruleGenerationLanguage_in_rule__Options__SensorLanguageAssignment_1_1_39685);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4843:1: rule__Options__ReceiverLanguageAssignment_1_2_3 : ( ruleGenerationLanguage ) ;
    public final void rule__Options__ReceiverLanguageAssignment_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4847:1: ( ( ruleGenerationLanguage ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4848:1: ( ruleGenerationLanguage )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4848:1: ( ruleGenerationLanguage )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4849:1: ruleGenerationLanguage
            {
             before(grammarAccess.getOptionsAccess().getReceiverLanguageGenerationLanguageEnumRuleCall_1_2_3_0()); 
            pushFollow(FOLLOW_ruleGenerationLanguage_in_rule__Options__ReceiverLanguageAssignment_1_2_39716);
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


    // $ANTLR start "rule__Push__MethodNameAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4858:1: rule__Push__MethodNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Push__MethodNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4862:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4863:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4863:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4864:1: RULE_ID
            {
             before(grammarAccess.getPushAccess().getMethodNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Push__MethodNameAssignment_29747); 
             after(grammarAccess.getPushAccess().getMethodNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__MethodNameAssignment_2"


    // $ANTLR start "rule__Pull__FrequencyAssignment_1_4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4873:1: rule__Pull__FrequencyAssignment_1_4 : ( RULE_INT ) ;
    public final void rule__Pull__FrequencyAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4877:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4878:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4878:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4879:1: RULE_INT
            {
             before(grammarAccess.getPullAccess().getFrequencyINTTerminalRuleCall_1_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Pull__FrequencyAssignment_1_49778); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4888:1: rule__TimeDivisionMultiplexing__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__TimeDivisionMultiplexing__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4892:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4893:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4893:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4894:1: RULE_INT
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getFrequencyINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TimeDivisionMultiplexing__FrequencyAssignment_49809); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4903:1: rule__TimeDivisionMultiplexing__DurationAssignment_8 : ( ruleDOUBLE ) ;
    public final void rule__TimeDivisionMultiplexing__DurationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4907:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4908:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4908:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4909:1: ruleDOUBLE
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getDurationDOUBLEParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__TimeDivisionMultiplexing__DurationAssignment_89840);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4918:1: rule__TimeDivisionMultiplexing__TimeSlotAssignment_12 : ( ruleDOUBLE ) ;
    public final void rule__TimeDivisionMultiplexing__TimeSlotAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4922:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4923:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4923:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4924:1: ruleDOUBLE
            {
             before(grammarAccess.getTimeDivisionMultiplexingAccess().getTimeSlotDOUBLEParserRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__TimeDivisionMultiplexing__TimeSlotAssignment_129871);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4933:1: rule__Representation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Representation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4937:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4938:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4938:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4939:1: RULE_ID
            {
             before(grammarAccess.getRepresentationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Representation__NameAssignment_19902); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4948:1: rule__Representation__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Representation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4952:1: ( ( ruleType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4953:1: ( ruleType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4953:1: ( ruleType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4954:1: ruleType
            {
             before(grammarAccess.getRepresentationAccess().getTypeTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Representation__TypeAssignment_39933);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4963:1: rule__Representation__ByteCountAssignment_5 : ( RULE_INT ) ;
    public final void rule__Representation__ByteCountAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4967:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4968:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4968:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4969:1: RULE_INT
            {
             before(grammarAccess.getRepresentationAccess().getByteCountINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Representation__ByteCountAssignment_59964); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4978:1: rule__Calculated__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Calculated__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4982:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4983:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4983:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4984:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__NameAssignment_19995); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4993:1: rule__Calculated__RepresentationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Calculated__RepresentationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4997:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4998:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4998:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4999:1: ( RULE_ID )
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationRepresentationCrossReference_3_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5000:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5001:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationRepresentationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__RepresentationAssignment_310030); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5012:1: rule__Calculated__MethodNameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Calculated__MethodNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5016:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5017:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5017:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5018:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__MethodNameAssignment_510065); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5027:1: rule__Calculated__MethodNameOutAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Calculated__MethodNameOutAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5031:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5032:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5032:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5033:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameOutIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__MethodNameOutAssignment_6_110096); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5042:1: rule__Calculated__ParameterAssignment_8 : ( ruleParameter ) ;
    public final void rule__Calculated__ParameterAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5046:1: ( ( ruleParameter ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5047:1: ( ruleParameter )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5047:1: ( ruleParameter )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5048:1: ruleParameter
            {
             before(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_810127);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5057:1: rule__Calculated__ParameterAssignment_9_1 : ( ruleParameter ) ;
    public final void rule__Calculated__ParameterAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5061:1: ( ( ruleParameter ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5062:1: ( ruleParameter )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5062:1: ( ruleParameter )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5063:1: ruleParameter
            {
             before(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_9_110158);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5072:1: rule__Parameter__InterpretationAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__InterpretationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5076:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5077:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5077:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5078:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getInterpretationInterpretationCrossReference_1_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5079:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5080:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getInterpretationInterpretationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__InterpretationAssignment_110193); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5091:1: rule__Parameter__ArgumentTypeAssignment_2_1 : ( ruleArgumentType ) ;
    public final void rule__Parameter__ArgumentTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5095:1: ( ( ruleArgumentType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5096:1: ( ruleArgumentType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5096:1: ( ruleArgumentType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5097:1: ruleArgumentType
            {
             before(grammarAccess.getParameterAccess().getArgumentTypeArgumentTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleArgumentType_in_rule__Parameter__ArgumentTypeAssignment_2_110228);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5106:1: rule__InterpretationGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InterpretationGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5110:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5111:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5111:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5112:1: RULE_ID
            {
             before(grammarAccess.getInterpretationGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InterpretationGroup__NameAssignment_110259); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5121:1: rule__InterpretationGroup__InterpretationsAssignment_3 : ( ruleInterpretation ) ;
    public final void rule__InterpretationGroup__InterpretationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5125:1: ( ( ruleInterpretation ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5126:1: ( ruleInterpretation )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5126:1: ( ruleInterpretation )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5127:1: ruleInterpretation
            {
             before(grammarAccess.getInterpretationGroupAccess().getInterpretationsInterpretationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInterpretation_in_rule__InterpretationGroup__InterpretationsAssignment_310290);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5136:1: rule__Measurement__QuantityAssignment_2 : ( ruleQuantity ) ;
    public final void rule__Measurement__QuantityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5140:1: ( ( ruleQuantity ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5141:1: ( ruleQuantity )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5141:1: ( ruleQuantity )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5142:1: ruleQuantity
            {
             before(grammarAccess.getMeasurementAccess().getQuantityQuantityEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQuantity_in_rule__Measurement__QuantityAssignment_210321);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5151:1: rule__Measurement__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Measurement__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5155:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5156:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5156:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5157:1: RULE_ID
            {
             before(grammarAccess.getMeasurementAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Measurement__NameAssignment_310352); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5166:1: rule__Measurement__ScaleAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__Measurement__ScaleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5170:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5171:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5171:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5172:1: ruleDOUBLE
            {
             before(grammarAccess.getMeasurementAccess().getScaleDOUBLEParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Measurement__ScaleAssignment_510383);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5181:1: rule__Measurement__UnitAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Measurement__UnitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5185:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5186:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5186:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5187:1: RULE_STRING
            {
             before(grammarAccess.getMeasurementAccess().getUnitSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Measurement__UnitAssignment_610414); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5196:1: rule__Measurement__RepresentationAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Measurement__RepresentationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5200:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5201:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5201:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5202:1: ( RULE_ID )
            {
             before(grammarAccess.getMeasurementAccess().getRepresentationRepresentationCrossReference_8_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5203:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5204:1: RULE_ID
            {
             before(grammarAccess.getMeasurementAccess().getRepresentationRepresentationIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Measurement__RepresentationAssignment_810449); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5215:1: rule__Measurement__ConstraintsAssignment_9 : ( ruleMeasurementConstraint ) ;
    public final void rule__Measurement__ConstraintsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5219:1: ( ( ruleMeasurementConstraint ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5220:1: ( ruleMeasurementConstraint )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5220:1: ( ruleMeasurementConstraint )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5221:1: ruleMeasurementConstraint
            {
             before(grammarAccess.getMeasurementAccess().getConstraintsMeasurementConstraintParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleMeasurementConstraint_in_rule__Measurement__ConstraintsAssignment_910484);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5230:1: rule__MeasurementInRange__LowerBoundAssignment_1 : ( ruleMeasure ) ;
    public final void rule__MeasurementInRange__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5234:1: ( ( ruleMeasure ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5235:1: ( ruleMeasure )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5235:1: ( ruleMeasure )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5236:1: ruleMeasure
            {
             before(grammarAccess.getMeasurementInRangeAccess().getLowerBoundMeasureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMeasure_in_rule__MeasurementInRange__LowerBoundAssignment_110515);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5245:1: rule__MeasurementInRange__UpperBoundAssignment_3 : ( ruleMeasure ) ;
    public final void rule__MeasurementInRange__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5249:1: ( ( ruleMeasure ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5250:1: ( ruleMeasure )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5250:1: ( ruleMeasure )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5251:1: ruleMeasure
            {
             before(grammarAccess.getMeasurementInRangeAccess().getUpperBoundMeasureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMeasure_in_rule__MeasurementInRange__UpperBoundAssignment_310546);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5260:1: rule__MeasurementAdaption__ScalingFactorAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__MeasurementAdaption__ScalingFactorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5264:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5265:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5265:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5266:1: ruleDOUBLE
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getScalingFactorDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__MeasurementAdaption__ScalingFactorAssignment_310577);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5275:1: rule__MeasurementAdaption__OffsetAssignment_7 : ( ruleDOUBLE ) ;
    public final void rule__MeasurementAdaption__OffsetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5279:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5280:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5280:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5281:1: ruleDOUBLE
            {
             before(grammarAccess.getMeasurementAdaptionAccess().getOffsetDOUBLEParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__MeasurementAdaption__OffsetAssignment_710608);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5290:1: rule__Measure__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Measure__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5294:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5295:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5295:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5296:1: ruleDOUBLE
            {
             before(grammarAccess.getMeasureAccess().getValueDOUBLEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Measure__ValueAssignment_010639);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5305:1: rule__Measure__UnitAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Measure__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5309:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5310:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5310:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5311:1: RULE_STRING
            {
             before(grammarAccess.getMeasureAccess().getUnitSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Measure__UnitAssignment_110670); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5320:1: rule__PrimitiveInterpretation__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__PrimitiveInterpretation__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5324:1: ( ( ruleType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5325:1: ( ruleType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5325:1: ( ruleType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5326:1: ruleType
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getTypeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__PrimitiveInterpretation__TypeAssignment_110701);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5335:1: rule__PrimitiveInterpretation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PrimitiveInterpretation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5339:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5340:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5340:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5341:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimitiveInterpretation__NameAssignment_210732); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5350:1: rule__PrimitiveInterpretation__RepresentationAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__PrimitiveInterpretation__RepresentationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5354:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5355:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5355:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5356:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getRepresentationRepresentationCrossReference_4_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5357:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5358:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveInterpretationAccess().getRepresentationRepresentationIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimitiveInterpretation__RepresentationAssignment_410767); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5369:1: rule__Constant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5373:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5374:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5374:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5375:1: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_110802); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5384:1: rule__Constant__RepresentationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Constant__RepresentationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5388:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5389:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5389:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5390:1: ( RULE_ID )
            {
             before(grammarAccess.getConstantAccess().getRepresentationRepresentationCrossReference_3_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5391:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5392:1: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getRepresentationRepresentationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__RepresentationAssignment_310837); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5403:1: rule__Constant__ConstantValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Constant__ConstantValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5407:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5408:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5408:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5409:1: RULE_STRING
            {
             before(grammarAccess.getConstantAccess().getConstantValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constant__ConstantValueAssignment_510872); 
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
    public static final BitSet FOLLOW_rule__Options__Group_1_0__2__Impl_in_rule__Options__Group_1_0__23100 = new BitSet(new long[]{0x0000A80000000000L});
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
    public static final BitSet FOLLOW_rule__Push__Group__1__Impl_in_rule__Push__Group__13791 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Push__Group__2_in_rule__Push__Group__13794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Push__Group__1__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__Group__2__Impl_in_rule__Push__Group__23853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Push__MethodNameAssignment_2_in_rule__Push__Group__2__Impl3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__0__Impl_in_rule__Pull__Group_1__03916 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__1_in_rule__Pull__Group_1__03919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Pull__Group_1__0__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__1__Impl_in_rule__Pull__Group_1__13978 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__2_in_rule__Pull__Group_1__13981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Pull__Group_1__1__Impl4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__2__Impl_in_rule__Pull__Group_1__24040 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__3_in_rule__Pull__Group_1__24043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Pull__Group_1__2__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__3__Impl_in_rule__Pull__Group_1__34102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__4_in_rule__Pull__Group_1__34105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Pull__Group_1__3__Impl4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pull__Group_1__4__Impl_in_rule__Pull__Group_1__44164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pull__FrequencyAssignment_1_4_in_rule__Pull__Group_1__4__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__0__Impl_in_rule__TimeDivisionMultiplexing__Group__04231 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__1_in_rule__TimeDivisionMultiplexing__Group__04234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TimeDivisionMultiplexing__Group__0__Impl4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__1__Impl_in_rule__TimeDivisionMultiplexing__Group__14293 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__2_in_rule__TimeDivisionMultiplexing__Group__14296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TimeDivisionMultiplexing__Group__1__Impl4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__2__Impl_in_rule__TimeDivisionMultiplexing__Group__24355 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__3_in_rule__TimeDivisionMultiplexing__Group__24358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__TimeDivisionMultiplexing__Group__2__Impl4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__3__Impl_in_rule__TimeDivisionMultiplexing__Group__34417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__4_in_rule__TimeDivisionMultiplexing__Group__34420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TimeDivisionMultiplexing__Group__3__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__4__Impl_in_rule__TimeDivisionMultiplexing__Group__44479 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__5_in_rule__TimeDivisionMultiplexing__Group__44482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__FrequencyAssignment_4_in_rule__TimeDivisionMultiplexing__Group__4__Impl4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__5__Impl_in_rule__TimeDivisionMultiplexing__Group__54539 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__6_in_rule__TimeDivisionMultiplexing__Group__54542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TimeDivisionMultiplexing__Group__5__Impl4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__6__Impl_in_rule__TimeDivisionMultiplexing__Group__64601 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__7_in_rule__TimeDivisionMultiplexing__Group__64604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TimeDivisionMultiplexing__Group__6__Impl4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__7__Impl_in_rule__TimeDivisionMultiplexing__Group__74663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__8_in_rule__TimeDivisionMultiplexing__Group__74666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TimeDivisionMultiplexing__Group__7__Impl4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__8__Impl_in_rule__TimeDivisionMultiplexing__Group__84725 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__9_in_rule__TimeDivisionMultiplexing__Group__84728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__DurationAssignment_8_in_rule__TimeDivisionMultiplexing__Group__8__Impl4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__9__Impl_in_rule__TimeDivisionMultiplexing__Group__94785 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__10_in_rule__TimeDivisionMultiplexing__Group__94788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TimeDivisionMultiplexing__Group__9__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__10__Impl_in_rule__TimeDivisionMultiplexing__Group__104847 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__11_in_rule__TimeDivisionMultiplexing__Group__104850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__TimeDivisionMultiplexing__Group__10__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__11__Impl_in_rule__TimeDivisionMultiplexing__Group__114909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__12_in_rule__TimeDivisionMultiplexing__Group__114912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TimeDivisionMultiplexing__Group__11__Impl4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__Group__12__Impl_in_rule__TimeDivisionMultiplexing__Group__124971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeDivisionMultiplexing__TimeSlotAssignment_12_in_rule__TimeDivisionMultiplexing__Group__12__Impl4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__0__Impl_in_rule__Representation__Group__05054 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Representation__Group__1_in_rule__Representation__Group__05057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Alternatives_0_in_rule__Representation__Group__0__Impl5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__1__Impl_in_rule__Representation__Group__15114 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__2_in_rule__Representation__Group__15117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__NameAssignment_1_in_rule__Representation__Group__1__Impl5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__2__Impl_in_rule__Representation__Group__25174 = new BitSet(new long[]{0x00000000FC000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__3_in_rule__Representation__Group__25177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Representation__Group__2__Impl5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__3__Impl_in_rule__Representation__Group__35236 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__4_in_rule__Representation__Group__35239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__TypeAssignment_3_in_rule__Representation__Group__3__Impl5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__4__Impl_in_rule__Representation__Group__45296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Representation__Group__5_in_rule__Representation__Group__45299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Representation__Group__4__Impl5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__5__Impl_in_rule__Representation__Group__55358 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Representation__Group__6_in_rule__Representation__Group__55361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__ByteCountAssignment_5_in_rule__Representation__Group__5__Impl5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__6__Impl_in_rule__Representation__Group__65418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Alternatives_6_in_rule__Representation__Group__6__Impl5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__0__Impl_in_rule__Calculated__Group__05489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__1_in_rule__Calculated__Group__05492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Alternatives_0_in_rule__Calculated__Group__0__Impl5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__1__Impl_in_rule__Calculated__Group__15549 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__2_in_rule__Calculated__Group__15552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__NameAssignment_1_in_rule__Calculated__Group__1__Impl5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__2__Impl_in_rule__Calculated__Group__25609 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__3_in_rule__Calculated__Group__25612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Calculated__Group__2__Impl5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__3__Impl_in_rule__Calculated__Group__35671 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__4_in_rule__Calculated__Group__35674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__RepresentationAssignment_3_in_rule__Calculated__Group__3__Impl5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__4__Impl_in_rule__Calculated__Group__45731 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__5_in_rule__Calculated__Group__45734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Calculated__Group__4__Impl5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__5__Impl_in_rule__Calculated__Group__55793 = new BitSet(new long[]{0x0000101000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__6_in_rule__Calculated__Group__55796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__MethodNameAssignment_5_in_rule__Calculated__Group__5__Impl5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__6__Impl_in_rule__Calculated__Group__65853 = new BitSet(new long[]{0x0000101000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__7_in_rule__Calculated__Group__65856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__0_in_rule__Calculated__Group__6__Impl5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__7__Impl_in_rule__Calculated__Group__75914 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__8_in_rule__Calculated__Group__75917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Calculated__Group__7__Impl5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__8__Impl_in_rule__Calculated__Group__85976 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__9_in_rule__Calculated__Group__85979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__ParameterAssignment_8_in_rule__Calculated__Group__8__Impl6006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__9__Impl_in_rule__Calculated__Group__96036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__0_in_rule__Calculated__Group__9__Impl6063 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__0__Impl_in_rule__Calculated__Group_6__06114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__1_in_rule__Calculated__Group_6__06117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Calculated__Group_6__0__Impl6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__1__Impl_in_rule__Calculated__Group_6__16176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__MethodNameOutAssignment_6_1_in_rule__Calculated__Group_6__1__Impl6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__0__Impl_in_rule__Calculated__Group_9__06237 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__1_in_rule__Calculated__Group_9__06240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Calculated__Group_9__0__Impl6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__1__Impl_in_rule__Calculated__Group_9__16299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__ParameterAssignment_9_1_in_rule__Calculated__Group_9__1__Impl6326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Parameter__Group__0__Impl6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16422 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__InterpretationAssignment_1_in_rule__Parameter__Group__1__Impl6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26482 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__26485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__36543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Parameter__Group__3__Impl6571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__06610 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__06613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Parameter__Group_2__0__Impl6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__16672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ArgumentTypeAssignment_2_1_in_rule__Parameter__Group_2__1__Impl6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__0__Impl_in_rule__InterpretationGroup__Group__06733 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__1_in_rule__InterpretationGroup__Group__06736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__InterpretationGroup__Group__0__Impl6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__1__Impl_in_rule__InterpretationGroup__Group__16795 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__2_in_rule__InterpretationGroup__Group__16798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__NameAssignment_1_in_rule__InterpretationGroup__Group__1__Impl6825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__2__Impl_in_rule__InterpretationGroup__Group__26855 = new BitSet(new long[]{0x0300000400033000L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__3_in_rule__InterpretationGroup__Group__26858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InterpretationGroup__Group__2__Impl6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__3__Impl_in_rule__InterpretationGroup__Group__36917 = new BitSet(new long[]{0x0300000400033000L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__4_in_rule__InterpretationGroup__Group__36920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__InterpretationsAssignment_3_in_rule__InterpretationGroup__Group__3__Impl6947 = new BitSet(new long[]{0x0300000000033002L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__InterpretationGroup__Group__4__Impl_in_rule__InterpretationGroup__Group__46978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__InterpretationGroup__Group__4__Impl7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__0__Impl_in_rule__Measurement__Group__07047 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__1_in_rule__Measurement__Group__07050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Measurement__Group__0__Impl7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__1__Impl_in_rule__Measurement__Group__17109 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__2_in_rule__Measurement__Group__17112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Measurement__Group__1__Impl7140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__2__Impl_in_rule__Measurement__Group__27171 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Measurement__Group__3_in_rule__Measurement__Group__27174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__QuantityAssignment_2_in_rule__Measurement__Group__2__Impl7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__3__Impl_in_rule__Measurement__Group__37231 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__4_in_rule__Measurement__Group__37234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__NameAssignment_3_in_rule__Measurement__Group__3__Impl7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__4__Impl_in_rule__Measurement__Group__47291 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Measurement__Group__5_in_rule__Measurement__Group__47294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Measurement__Group__4__Impl7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__5__Impl_in_rule__Measurement__Group__57353 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Measurement__Group__6_in_rule__Measurement__Group__57356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__ScaleAssignment_5_in_rule__Measurement__Group__5__Impl7383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__6__Impl_in_rule__Measurement__Group__67414 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__7_in_rule__Measurement__Group__67417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__UnitAssignment_6_in_rule__Measurement__Group__6__Impl7444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__7__Impl_in_rule__Measurement__Group__77474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Measurement__Group__8_in_rule__Measurement__Group__77477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Measurement__Group__7__Impl7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__8__Impl_in_rule__Measurement__Group__87536 = new BitSet(new long[]{0x1000100000000000L});
    public static final BitSet FOLLOW_rule__Measurement__Group__9_in_rule__Measurement__Group__87539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__RepresentationAssignment_8_in_rule__Measurement__Group__8__Impl7566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__Group__9__Impl_in_rule__Measurement__Group__97596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measurement__ConstraintsAssignment_9_in_rule__Measurement__Group__9__Impl7623 = new BitSet(new long[]{0x1000100000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__0__Impl_in_rule__MeasurementInRange__Group__07674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__1_in_rule__MeasurementInRange__Group__07677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__MeasurementInRange__Group__0__Impl7705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__1__Impl_in_rule__MeasurementInRange__Group__17736 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__2_in_rule__MeasurementInRange__Group__17739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__LowerBoundAssignment_1_in_rule__MeasurementInRange__Group__1__Impl7766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__2__Impl_in_rule__MeasurementInRange__Group__27796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__3_in_rule__MeasurementInRange__Group__27799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__MeasurementInRange__Group__2__Impl7827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__Group__3__Impl_in_rule__MeasurementInRange__Group__37858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementInRange__UpperBoundAssignment_3_in_rule__MeasurementInRange__Group__3__Impl7885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__0__Impl_in_rule__MeasurementAdaption__Group__07923 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__1_in_rule__MeasurementAdaption__Group__07926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MeasurementAdaption__Group__0__Impl7954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__1__Impl_in_rule__MeasurementAdaption__Group__17985 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__2_in_rule__MeasurementAdaption__Group__17988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__MeasurementAdaption__Group__1__Impl8016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__2__Impl_in_rule__MeasurementAdaption__Group__28047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__3_in_rule__MeasurementAdaption__Group__28050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MeasurementAdaption__Group__2__Impl8078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__3__Impl_in_rule__MeasurementAdaption__Group__38109 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__4_in_rule__MeasurementAdaption__Group__38112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__ScalingFactorAssignment_3_in_rule__MeasurementAdaption__Group__3__Impl8139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__4__Impl_in_rule__MeasurementAdaption__Group__48169 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__5_in_rule__MeasurementAdaption__Group__48172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MeasurementAdaption__Group__4__Impl8200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__5__Impl_in_rule__MeasurementAdaption__Group__58231 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__6_in_rule__MeasurementAdaption__Group__58234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__MeasurementAdaption__Group__5__Impl8262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__6__Impl_in_rule__MeasurementAdaption__Group__68293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__7_in_rule__MeasurementAdaption__Group__68296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MeasurementAdaption__Group__6__Impl8324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__Group__7__Impl_in_rule__MeasurementAdaption__Group__78355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementAdaption__OffsetAssignment_7_in_rule__MeasurementAdaption__Group__7__Impl8382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__Group__0__Impl_in_rule__Measure__Group__08428 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Measure__Group__1_in_rule__Measure__Group__08431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__ValueAssignment_0_in_rule__Measure__Group__0__Impl8458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__Group__1__Impl_in_rule__Measure__Group__18488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Measure__UnitAssignment_1_in_rule__Measure__Group__1__Impl8515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__0__Impl_in_rule__PrimitiveInterpretation__Group__08549 = new BitSet(new long[]{0x00000000FC000000L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__1_in_rule__PrimitiveInterpretation__Group__08552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__PrimitiveInterpretation__Group__0__Impl8580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__1__Impl_in_rule__PrimitiveInterpretation__Group__18611 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__2_in_rule__PrimitiveInterpretation__Group__18614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__TypeAssignment_1_in_rule__PrimitiveInterpretation__Group__1__Impl8641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__2__Impl_in_rule__PrimitiveInterpretation__Group__28671 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__3_in_rule__PrimitiveInterpretation__Group__28674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__NameAssignment_2_in_rule__PrimitiveInterpretation__Group__2__Impl8701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__3__Impl_in_rule__PrimitiveInterpretation__Group__38731 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__4_in_rule__PrimitiveInterpretation__Group__38734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__PrimitiveInterpretation__Group__3__Impl8762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__Group__4__Impl_in_rule__PrimitiveInterpretation__Group__48793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveInterpretation__RepresentationAssignment_4_in_rule__PrimitiveInterpretation__Group__4__Impl8820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__08860 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__08863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Constant__Group__0__Impl8891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__18922 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__18925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl8952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__28982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__28985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Constant__Group__2__Impl9013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__39044 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__39047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__RepresentationAssignment_3_in_rule__Constant__Group__3__Impl9074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__49104 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Constant__Group__5_in_rule__Constant__Group__49107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Constant__Group__4__Impl9135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__5__Impl_in_rule__Constant__Group__59166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ConstantValueAssignment_5_in_rule__Constant__Group__5__Impl9193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__09235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__09238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl9265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__19294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl9321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__09356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__09359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__DOUBLE__Group_1__0__Impl9387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__19418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl9445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptions_in_rule__DataModel__OptionsAssignment_29483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepresentation_in_rule__DataModel__RepresentationsAssignment_4_09514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretation_in_rule__DataModel__InterpretationsAssignment_4_19545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_69580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_7_19619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransmission_in_rule__Options__TransmissionTypeAssignment_1_0_39654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_rule__Options__SensorLanguageAssignment_1_1_39685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_rule__Options__ReceiverLanguageAssignment_1_2_39716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Push__MethodNameAssignment_29747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Pull__FrequencyAssignment_1_49778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TimeDivisionMultiplexing__FrequencyAssignment_49809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__TimeDivisionMultiplexing__DurationAssignment_89840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__TimeDivisionMultiplexing__TimeSlotAssignment_129871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Representation__NameAssignment_19902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Representation__TypeAssignment_39933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Representation__ByteCountAssignment_59964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__NameAssignment_19995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__RepresentationAssignment_310030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__MethodNameAssignment_510065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__MethodNameOutAssignment_6_110096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_810127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_9_110158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__InterpretationAssignment_110193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentType_in_rule__Parameter__ArgumentTypeAssignment_2_110228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InterpretationGroup__NameAssignment_110259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterpretation_in_rule__InterpretationGroup__InterpretationsAssignment_310290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantity_in_rule__Measurement__QuantityAssignment_210321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Measurement__NameAssignment_310352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Measurement__ScaleAssignment_510383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Measurement__UnitAssignment_610414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Measurement__RepresentationAssignment_810449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementConstraint_in_rule__Measurement__ConstraintsAssignment_910484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_rule__MeasurementInRange__LowerBoundAssignment_110515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasure_in_rule__MeasurementInRange__UpperBoundAssignment_310546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__MeasurementAdaption__ScalingFactorAssignment_310577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__MeasurementAdaption__OffsetAssignment_710608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Measure__ValueAssignment_010639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Measure__UnitAssignment_110670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__PrimitiveInterpretation__TypeAssignment_110701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveInterpretation__NameAssignment_210732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveInterpretation__RepresentationAssignment_410767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_110802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__RepresentationAssignment_310837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constant__ConstantValueAssignment_510872 = new BitSet(new long[]{0x0000000000000002L});

}