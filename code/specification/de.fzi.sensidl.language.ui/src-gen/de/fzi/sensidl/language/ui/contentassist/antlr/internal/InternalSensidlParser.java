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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BYTE_ARRAY'", "'repr'", "'representation'", "'bytes'", "'byte'", "'calculate'", "'calculated'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'JAVA'", "'CPP'", "'C'", "'CSHARP'", "'BOOL'", "'CHAR'", "'SHORT'", "'INT'", "'LONG'", "'LONGLONG'", "'FLOAT'", "'DOUBLE'", "'LONGDOUBLE'", "'datamodel'", "'{'", "'options'", "'}'", "'transmit'", "','", "'Endianess'", "':'", "'sensor'", "'language'", "'receiver'", "'is'", "'in'", "'description'", "'id'", "'data'", "'of'", "'as'", "'basicdata'", "'const'", "'by'", "'with'", "'('", "')'", "'set'", "'from'", "'to'", "'scaling factor'", "'and'", "'offset'", "'.'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:118:1: entryRuleRepresentation : ruleRepresentation EOF ;
    public final void entryRuleRepresentation() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:119:1: ( ruleRepresentation EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:120:1: ruleRepresentation EOF
            {
             before(grammarAccess.getRepresentationRule()); 
            pushFollow(FOLLOW_ruleRepresentation_in_entryRuleRepresentation183);
            ruleRepresentation();

            state._fsp--;

             after(grammarAccess.getRepresentationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepresentation190); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:127:1: ruleRepresentation : ( ( rule__Representation__Group__0 ) ) ;
    public final void ruleRepresentation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:131:2: ( ( ( rule__Representation__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:132:1: ( ( rule__Representation__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:132:1: ( ( rule__Representation__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:133:1: ( rule__Representation__Group__0 )
            {
             before(grammarAccess.getRepresentationAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:134:1: ( rule__Representation__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:134:2: rule__Representation__Group__0
            {
            pushFollow(FOLLOW_rule__Representation__Group__0_in_ruleRepresentation216);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:146:1: entryRuleDatafield : ruleDatafield EOF ;
    public final void entryRuleDatafield() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:147:1: ( ruleDatafield EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:148:1: ruleDatafield EOF
            {
             before(grammarAccess.getDatafieldRule()); 
            pushFollow(FOLLOW_ruleDatafield_in_entryRuleDatafield243);
            ruleDatafield();

            state._fsp--;

             after(grammarAccess.getDatafieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatafield250); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:155:1: ruleDatafield : ( ( rule__Datafield__Alternatives ) ) ;
    public final void ruleDatafield() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:159:2: ( ( ( rule__Datafield__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:160:1: ( ( rule__Datafield__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:160:1: ( ( rule__Datafield__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:161:1: ( rule__Datafield__Alternatives )
            {
             before(grammarAccess.getDatafieldAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:162:1: ( rule__Datafield__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:162:2: rule__Datafield__Alternatives
            {
            pushFollow(FOLLOW_rule__Datafield__Alternatives_in_ruleDatafield276);
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


    // $ANTLR start "entryRuleVariableData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:174:1: entryRuleVariableData : ruleVariableData EOF ;
    public final void entryRuleVariableData() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:175:1: ( ruleVariableData EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:176:1: ruleVariableData EOF
            {
             before(grammarAccess.getVariableDataRule()); 
            pushFollow(FOLLOW_ruleVariableData_in_entryRuleVariableData303);
            ruleVariableData();

            state._fsp--;

             after(grammarAccess.getVariableDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableData310); 

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
    // $ANTLR end "entryRuleVariableData"


    // $ANTLR start "ruleVariableData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:183:1: ruleVariableData : ( ( rule__VariableData__Alternatives ) ) ;
    public final void ruleVariableData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:187:2: ( ( ( rule__VariableData__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:188:1: ( ( rule__VariableData__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:188:1: ( ( rule__VariableData__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:189:1: ( rule__VariableData__Alternatives )
            {
             before(grammarAccess.getVariableDataAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:190:1: ( rule__VariableData__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:190:2: rule__VariableData__Alternatives
            {
            pushFollow(FOLLOW_rule__VariableData__Alternatives_in_ruleVariableData336);
            rule__VariableData__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableDataAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableData"


    // $ANTLR start "entryRuleMeasuredData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:202:1: entryRuleMeasuredData : ruleMeasuredData EOF ;
    public final void entryRuleMeasuredData() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:203:1: ( ruleMeasuredData EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:204:1: ruleMeasuredData EOF
            {
             before(grammarAccess.getMeasuredDataRule()); 
            pushFollow(FOLLOW_ruleMeasuredData_in_entryRuleMeasuredData363);
            ruleMeasuredData();

            state._fsp--;

             after(grammarAccess.getMeasuredDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasuredData370); 

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
    // $ANTLR end "entryRuleMeasuredData"


    // $ANTLR start "ruleMeasuredData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:211:1: ruleMeasuredData : ( ( rule__MeasuredData__Group__0 ) ) ;
    public final void ruleMeasuredData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:215:2: ( ( ( rule__MeasuredData__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:216:1: ( ( rule__MeasuredData__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:216:1: ( ( rule__MeasuredData__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:217:1: ( rule__MeasuredData__Group__0 )
            {
             before(grammarAccess.getMeasuredDataAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:218:1: ( rule__MeasuredData__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:218:2: rule__MeasuredData__Group__0
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group__0_in_ruleMeasuredData396);
            rule__MeasuredData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasuredDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasuredData"


    // $ANTLR start "entryRuleNonMeasuredData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:230:1: entryRuleNonMeasuredData : ruleNonMeasuredData EOF ;
    public final void entryRuleNonMeasuredData() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:231:1: ( ruleNonMeasuredData EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:232:1: ruleNonMeasuredData EOF
            {
             before(grammarAccess.getNonMeasuredDataRule()); 
            pushFollow(FOLLOW_ruleNonMeasuredData_in_entryRuleNonMeasuredData423);
            ruleNonMeasuredData();

            state._fsp--;

             after(grammarAccess.getNonMeasuredDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonMeasuredData430); 

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
    // $ANTLR end "entryRuleNonMeasuredData"


    // $ANTLR start "ruleNonMeasuredData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:239:1: ruleNonMeasuredData : ( ( rule__NonMeasuredData__Group__0 ) ) ;
    public final void ruleNonMeasuredData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:243:2: ( ( ( rule__NonMeasuredData__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:244:1: ( ( rule__NonMeasuredData__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:244:1: ( ( rule__NonMeasuredData__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:245:1: ( rule__NonMeasuredData__Group__0 )
            {
             before(grammarAccess.getNonMeasuredDataAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:246:1: ( rule__NonMeasuredData__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:246:2: rule__NonMeasuredData__Group__0
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__Group__0_in_ruleNonMeasuredData456);
            rule__NonMeasuredData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasuredDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonMeasuredData"


    // $ANTLR start "entryRuleConstantData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:258:1: entryRuleConstantData : ruleConstantData EOF ;
    public final void entryRuleConstantData() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:259:1: ( ruleConstantData EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:260:1: ruleConstantData EOF
            {
             before(grammarAccess.getConstantDataRule()); 
            pushFollow(FOLLOW_ruleConstantData_in_entryRuleConstantData483);
            ruleConstantData();

            state._fsp--;

             after(grammarAccess.getConstantDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantData490); 

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
    // $ANTLR end "entryRuleConstantData"


    // $ANTLR start "ruleConstantData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:267:1: ruleConstantData : ( ( rule__ConstantData__Group__0 ) ) ;
    public final void ruleConstantData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:271:2: ( ( ( rule__ConstantData__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:272:1: ( ( rule__ConstantData__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:272:1: ( ( rule__ConstantData__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:273:1: ( rule__ConstantData__Group__0 )
            {
             before(grammarAccess.getConstantDataAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:274:1: ( rule__ConstantData__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:274:2: rule__ConstantData__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantData__Group__0_in_ruleConstantData516);
            rule__ConstantData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantData"


    // $ANTLR start "entryRuleCalculated"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:286:1: entryRuleCalculated : ruleCalculated EOF ;
    public final void entryRuleCalculated() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:287:1: ( ruleCalculated EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:288:1: ruleCalculated EOF
            {
             before(grammarAccess.getCalculatedRule()); 
            pushFollow(FOLLOW_ruleCalculated_in_entryRuleCalculated543);
            ruleCalculated();

            state._fsp--;

             after(grammarAccess.getCalculatedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalculated550); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:295:1: ruleCalculated : ( ( rule__Calculated__Group__0 ) ) ;
    public final void ruleCalculated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:299:2: ( ( ( rule__Calculated__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:300:1: ( ( rule__Calculated__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:300:1: ( ( rule__Calculated__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:301:1: ( rule__Calculated__Group__0 )
            {
             before(grammarAccess.getCalculatedAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:302:1: ( rule__Calculated__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:302:2: rule__Calculated__Group__0
            {
            pushFollow(FOLLOW_rule__Calculated__Group__0_in_ruleCalculated576);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:314:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:315:1: ( ruleParameter EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:316:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter603);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter610); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:323:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:327:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:328:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:328:1: ( ( rule__Parameter__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:329:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:330:1: ( rule__Parameter__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:330:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter636);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:342:1: entryRuleDatastructure : ruleDatastructure EOF ;
    public final void entryRuleDatastructure() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:343:1: ( ruleDatastructure EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:344:1: ruleDatastructure EOF
            {
             before(grammarAccess.getDatastructureRule()); 
            pushFollow(FOLLOW_ruleDatastructure_in_entryRuleDatastructure663);
            ruleDatastructure();

            state._fsp--;

             after(grammarAccess.getDatastructureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatastructure670); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:351:1: ruleDatastructure : ( ( rule__Datastructure__Group__0 ) ) ;
    public final void ruleDatastructure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:355:2: ( ( ( rule__Datastructure__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:356:1: ( ( rule__Datastructure__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:356:1: ( ( rule__Datastructure__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:357:1: ( rule__Datastructure__Group__0 )
            {
             before(grammarAccess.getDatastructureAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:358:1: ( rule__Datastructure__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:358:2: rule__Datastructure__Group__0
            {
            pushFollow(FOLLOW_rule__Datastructure__Group__0_in_ruleDatastructure696);
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


    // $ANTLR start "entryRuleConstraint"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:370:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:371:1: ( ruleConstraint EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:372:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint723);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint730); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:379:1: ruleConstraint : ( ruleDataConstraint ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:383:2: ( ( ruleDataConstraint ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:384:1: ( ruleDataConstraint )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:384:1: ( ruleDataConstraint )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:385:1: ruleDataConstraint
            {
             before(grammarAccess.getConstraintAccess().getDataConstraintParserRuleCall()); 
            pushFollow(FOLLOW_ruleDataConstraint_in_ruleConstraint756);
            ruleDataConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getDataConstraintParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleDataConstraint"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:398:1: entryRuleDataConstraint : ruleDataConstraint EOF ;
    public final void entryRuleDataConstraint() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:399:1: ( ruleDataConstraint EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:400:1: ruleDataConstraint EOF
            {
             before(grammarAccess.getDataConstraintRule()); 
            pushFollow(FOLLOW_ruleDataConstraint_in_entryRuleDataConstraint782);
            ruleDataConstraint();

            state._fsp--;

             after(grammarAccess.getDataConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataConstraint789); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:407:1: ruleDataConstraint : ( ( rule__DataConstraint__Alternatives ) ) ;
    public final void ruleDataConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:411:2: ( ( ( rule__DataConstraint__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:412:1: ( ( rule__DataConstraint__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:412:1: ( ( rule__DataConstraint__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:413:1: ( rule__DataConstraint__Alternatives )
            {
             before(grammarAccess.getDataConstraintAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:414:1: ( rule__DataConstraint__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:414:2: rule__DataConstraint__Alternatives
            {
            pushFollow(FOLLOW_rule__DataConstraint__Alternatives_in_ruleDataConstraint815);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:426:1: entryRuleDataRange : ruleDataRange EOF ;
    public final void entryRuleDataRange() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:427:1: ( ruleDataRange EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:428:1: ruleDataRange EOF
            {
             before(grammarAccess.getDataRangeRule()); 
            pushFollow(FOLLOW_ruleDataRange_in_entryRuleDataRange842);
            ruleDataRange();

            state._fsp--;

             after(grammarAccess.getDataRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataRange849); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:435:1: ruleDataRange : ( ( rule__DataRange__Group__0 ) ) ;
    public final void ruleDataRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:439:2: ( ( ( rule__DataRange__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:440:1: ( ( rule__DataRange__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:440:1: ( ( rule__DataRange__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:441:1: ( rule__DataRange__Group__0 )
            {
             before(grammarAccess.getDataRangeAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:442:1: ( rule__DataRange__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:442:2: rule__DataRange__Group__0
            {
            pushFollow(FOLLOW_rule__DataRange__Group__0_in_ruleDataRange875);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:454:1: entryRuleDataAdaption : ruleDataAdaption EOF ;
    public final void entryRuleDataAdaption() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:455:1: ( ruleDataAdaption EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:456:1: ruleDataAdaption EOF
            {
             before(grammarAccess.getDataAdaptionRule()); 
            pushFollow(FOLLOW_ruleDataAdaption_in_entryRuleDataAdaption902);
            ruleDataAdaption();

            state._fsp--;

             after(grammarAccess.getDataAdaptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAdaption909); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:463:1: ruleDataAdaption : ( ( rule__DataAdaption__Group__0 ) ) ;
    public final void ruleDataAdaption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:467:2: ( ( ( rule__DataAdaption__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:468:1: ( ( rule__DataAdaption__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:468:1: ( ( rule__DataAdaption__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:469:1: ( rule__DataAdaption__Group__0 )
            {
             before(grammarAccess.getDataAdaptionAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:470:1: ( rule__DataAdaption__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:470:2: rule__DataAdaption__Group__0
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__0_in_ruleDataAdaption935);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:482:1: entryRuleBound : ruleBound EOF ;
    public final void entryRuleBound() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:483:1: ( ruleBound EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:484:1: ruleBound EOF
            {
             before(grammarAccess.getBoundRule()); 
            pushFollow(FOLLOW_ruleBound_in_entryRuleBound962);
            ruleBound();

            state._fsp--;

             after(grammarAccess.getBoundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBound969); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:491:1: ruleBound : ( ( rule__Bound__Group__0 ) ) ;
    public final void ruleBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:495:2: ( ( ( rule__Bound__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:496:1: ( ( rule__Bound__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:496:1: ( ( rule__Bound__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:497:1: ( rule__Bound__Group__0 )
            {
             before(grammarAccess.getBoundAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:498:1: ( rule__Bound__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:498:2: rule__Bound__Group__0
            {
            pushFollow(FOLLOW_rule__Bound__Group__0_in_ruleBound995);
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


    // $ANTLR start "entryRuleDOUBLE"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:510:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:511:1: ( ruleDOUBLE EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:512:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE1022);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE1029); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:519:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:523:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:524:1: ( ( rule__DOUBLE__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:524:1: ( ( rule__DOUBLE__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:525:1: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:526:1: ( rule__DOUBLE__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:526:2: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE1055);
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


    // $ANTLR start "ruleEndianess"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:539:1: ruleEndianess : ( ( rule__Endianess__Alternatives ) ) ;
    public final void ruleEndianess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:543:1: ( ( ( rule__Endianess__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:544:1: ( ( rule__Endianess__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:544:1: ( ( rule__Endianess__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:545:1: ( rule__Endianess__Alternatives )
            {
             before(grammarAccess.getEndianessAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:546:1: ( rule__Endianess__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:546:2: rule__Endianess__Alternatives
            {
            pushFollow(FOLLOW_rule__Endianess__Alternatives_in_ruleEndianess1092);
            rule__Endianess__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEndianessAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndianess"


    // $ANTLR start "ruleGenerationLanguage"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:558:1: ruleGenerationLanguage : ( ( rule__GenerationLanguage__Alternatives ) ) ;
    public final void ruleGenerationLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:562:1: ( ( ( rule__GenerationLanguage__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:563:1: ( ( rule__GenerationLanguage__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:563:1: ( ( rule__GenerationLanguage__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:564:1: ( rule__GenerationLanguage__Alternatives )
            {
             before(grammarAccess.getGenerationLanguageAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:565:1: ( rule__GenerationLanguage__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:565:2: rule__GenerationLanguage__Alternatives
            {
            pushFollow(FOLLOW_rule__GenerationLanguage__Alternatives_in_ruleGenerationLanguage1128);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:577:1: ruleArgumentType : ( ( 'BYTE_ARRAY' ) ) ;
    public final void ruleArgumentType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:581:1: ( ( ( 'BYTE_ARRAY' ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:582:1: ( ( 'BYTE_ARRAY' ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:582:1: ( ( 'BYTE_ARRAY' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:583:1: ( 'BYTE_ARRAY' )
            {
             before(grammarAccess.getArgumentTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:584:1: ( 'BYTE_ARRAY' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:584:3: 'BYTE_ARRAY'
            {
            match(input,11,FOLLOW_11_in_ruleArgumentType1165); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:597:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:601:1: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:602:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:602:1: ( ( rule__Type__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:603:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:604:1: ( rule__Type__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:604:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1203);
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


    // $ANTLR start "rule__DataModel__Alternatives_6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:615:1: rule__DataModel__Alternatives_6 : ( ( ( rule__DataModel__RepresentationsAssignment_6_0 ) ) | ( ( rule__DataModel__DatafieldsAssignment_6_1 ) ) );
    public final void rule__DataModel__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:619:1: ( ( ( rule__DataModel__RepresentationsAssignment_6_0 ) ) | ( ( rule__DataModel__DatafieldsAssignment_6_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=16 && LA1_0<=17)||LA1_0==48||(LA1_0>=51 && LA1_0<=52)||LA1_0==57) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:620:1: ( ( rule__DataModel__RepresentationsAssignment_6_0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:620:1: ( ( rule__DataModel__RepresentationsAssignment_6_0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:621:1: ( rule__DataModel__RepresentationsAssignment_6_0 )
                    {
                     before(grammarAccess.getDataModelAccess().getRepresentationsAssignment_6_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:622:1: ( rule__DataModel__RepresentationsAssignment_6_0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:622:2: rule__DataModel__RepresentationsAssignment_6_0
                    {
                    pushFollow(FOLLOW_rule__DataModel__RepresentationsAssignment_6_0_in_rule__DataModel__Alternatives_61238);
                    rule__DataModel__RepresentationsAssignment_6_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataModelAccess().getRepresentationsAssignment_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:626:6: ( ( rule__DataModel__DatafieldsAssignment_6_1 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:626:6: ( ( rule__DataModel__DatafieldsAssignment_6_1 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:627:1: ( rule__DataModel__DatafieldsAssignment_6_1 )
                    {
                     before(grammarAccess.getDataModelAccess().getDatafieldsAssignment_6_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:628:1: ( rule__DataModel__DatafieldsAssignment_6_1 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:628:2: rule__DataModel__DatafieldsAssignment_6_1
                    {
                    pushFollow(FOLLOW_rule__DataModel__DatafieldsAssignment_6_1_in_rule__DataModel__Alternatives_61256);
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


    // $ANTLR start "rule__Representation__Alternatives_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:638:1: rule__Representation__Alternatives_0 : ( ( 'repr' ) | ( 'representation' ) );
    public final void rule__Representation__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:642:1: ( ( 'repr' ) | ( 'representation' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:643:1: ( 'repr' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:643:1: ( 'repr' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:644:1: 'repr'
                    {
                     before(grammarAccess.getRepresentationAccess().getReprKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Representation__Alternatives_01291); 
                     after(grammarAccess.getRepresentationAccess().getReprKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:651:6: ( 'representation' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:651:6: ( 'representation' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:652:1: 'representation'
                    {
                     before(grammarAccess.getRepresentationAccess().getRepresentationKeyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Representation__Alternatives_01311); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:664:1: rule__Representation__Alternatives_4 : ( ( 'bytes' ) | ( 'byte' ) );
    public final void rule__Representation__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:668:1: ( ( 'bytes' ) | ( 'byte' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:669:1: ( 'bytes' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:669:1: ( 'bytes' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:670:1: 'bytes'
                    {
                     before(grammarAccess.getRepresentationAccess().getBytesKeyword_4_0()); 
                    match(input,14,FOLLOW_14_in_rule__Representation__Alternatives_41346); 
                     after(grammarAccess.getRepresentationAccess().getBytesKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:677:6: ( 'byte' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:677:6: ( 'byte' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:678:1: 'byte'
                    {
                     before(grammarAccess.getRepresentationAccess().getByteKeyword_4_1()); 
                    match(input,15,FOLLOW_15_in_rule__Representation__Alternatives_41366); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:690:1: rule__Datafield__Alternatives : ( ( ruleVariableData ) | ( ruleConstantData ) | ( ruleDatastructure ) | ( ruleCalculated ) );
    public final void rule__Datafield__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:694:1: ( ( ruleVariableData ) | ( ruleConstantData ) | ( ruleDatastructure ) | ( ruleCalculated ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 48:
            case 51:
                {
                alt4=1;
                }
                break;
            case 52:
                {
                alt4=2;
                }
                break;
            case 57:
                {
                alt4=3;
                }
                break;
            case 16:
            case 17:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:695:1: ( ruleVariableData )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:695:1: ( ruleVariableData )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:696:1: ruleVariableData
                    {
                     before(grammarAccess.getDatafieldAccess().getVariableDataParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVariableData_in_rule__Datafield__Alternatives1400);
                    ruleVariableData();

                    state._fsp--;

                     after(grammarAccess.getDatafieldAccess().getVariableDataParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:701:6: ( ruleConstantData )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:701:6: ( ruleConstantData )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:702:1: ruleConstantData
                    {
                     before(grammarAccess.getDatafieldAccess().getConstantDataParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleConstantData_in_rule__Datafield__Alternatives1417);
                    ruleConstantData();

                    state._fsp--;

                     after(grammarAccess.getDatafieldAccess().getConstantDataParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:707:6: ( ruleDatastructure )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:707:6: ( ruleDatastructure )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:708:1: ruleDatastructure
                    {
                     before(grammarAccess.getDatafieldAccess().getDatastructureParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDatastructure_in_rule__Datafield__Alternatives1434);
                    ruleDatastructure();

                    state._fsp--;

                     after(grammarAccess.getDatafieldAccess().getDatastructureParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:713:6: ( ruleCalculated )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:713:6: ( ruleCalculated )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:714:1: ruleCalculated
                    {
                     before(grammarAccess.getDatafieldAccess().getCalculatedParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleCalculated_in_rule__Datafield__Alternatives1451);
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


    // $ANTLR start "rule__VariableData__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:724:1: rule__VariableData__Alternatives : ( ( ruleMeasuredData ) | ( ruleNonMeasuredData ) );
    public final void rule__VariableData__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:728:1: ( ( ruleMeasuredData ) | ( ruleNonMeasuredData ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==48) ) {
                alt5=1;
            }
            else if ( (LA5_0==51) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:729:1: ( ruleMeasuredData )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:729:1: ( ruleMeasuredData )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:730:1: ruleMeasuredData
                    {
                     before(grammarAccess.getVariableDataAccess().getMeasuredDataParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMeasuredData_in_rule__VariableData__Alternatives1483);
                    ruleMeasuredData();

                    state._fsp--;

                     after(grammarAccess.getVariableDataAccess().getMeasuredDataParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:735:6: ( ruleNonMeasuredData )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:735:6: ( ruleNonMeasuredData )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:736:1: ruleNonMeasuredData
                    {
                     before(grammarAccess.getVariableDataAccess().getNonMeasuredDataParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNonMeasuredData_in_rule__VariableData__Alternatives1500);
                    ruleNonMeasuredData();

                    state._fsp--;

                     after(grammarAccess.getVariableDataAccess().getNonMeasuredDataParserRuleCall_1()); 

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
    // $ANTLR end "rule__VariableData__Alternatives"


    // $ANTLR start "rule__Calculated__Alternatives_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:746:1: rule__Calculated__Alternatives_0 : ( ( 'calculate' ) | ( 'calculated' ) );
    public final void rule__Calculated__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:750:1: ( ( 'calculate' ) | ( 'calculated' ) )
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
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:751:1: ( 'calculate' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:751:1: ( 'calculate' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:752:1: 'calculate'
                    {
                     before(grammarAccess.getCalculatedAccess().getCalculateKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Calculated__Alternatives_01533); 
                     after(grammarAccess.getCalculatedAccess().getCalculateKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:759:6: ( 'calculated' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:759:6: ( 'calculated' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:760:1: 'calculated'
                    {
                     before(grammarAccess.getCalculatedAccess().getCalculatedKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Calculated__Alternatives_01553); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:772:1: rule__DataConstraint__Alternatives : ( ( ruleDataRange ) | ( ruleDataAdaption ) );
    public final void rule__DataConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:776:1: ( ( ruleDataRange ) | ( ruleDataAdaption ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==58) ) {
                alt7=1;
            }
            else if ( (LA7_0==54) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:777:1: ( ruleDataRange )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:777:1: ( ruleDataRange )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:778:1: ruleDataRange
                    {
                     before(grammarAccess.getDataConstraintAccess().getDataRangeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDataRange_in_rule__DataConstraint__Alternatives1587);
                    ruleDataRange();

                    state._fsp--;

                     after(grammarAccess.getDataConstraintAccess().getDataRangeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:783:6: ( ruleDataAdaption )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:783:6: ( ruleDataAdaption )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:784:1: ruleDataAdaption
                    {
                     before(grammarAccess.getDataConstraintAccess().getDataAdaptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataAdaption_in_rule__DataConstraint__Alternatives1604);
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


    // $ANTLR start "rule__Endianess__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:794:1: rule__Endianess__Alternatives : ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) );
    public final void rule__Endianess__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:798:1: ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:799:1: ( ( 'BIG_ENDIAN' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:799:1: ( ( 'BIG_ENDIAN' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:800:1: ( 'BIG_ENDIAN' )
                    {
                     before(grammarAccess.getEndianessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:801:1: ( 'BIG_ENDIAN' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:801:3: 'BIG_ENDIAN'
                    {
                    match(input,18,FOLLOW_18_in_rule__Endianess__Alternatives1637); 

                    }

                     after(grammarAccess.getEndianessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:806:6: ( ( 'LITTLE_ENDIAN' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:806:6: ( ( 'LITTLE_ENDIAN' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:807:1: ( 'LITTLE_ENDIAN' )
                    {
                     before(grammarAccess.getEndianessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:808:1: ( 'LITTLE_ENDIAN' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:808:3: 'LITTLE_ENDIAN'
                    {
                    match(input,19,FOLLOW_19_in_rule__Endianess__Alternatives1658); 

                    }

                     after(grammarAccess.getEndianessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Endianess__Alternatives"


    // $ANTLR start "rule__GenerationLanguage__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:818:1: rule__GenerationLanguage__Alternatives : ( ( ( 'JAVA' ) ) | ( ( 'CPP' ) ) | ( ( 'C' ) ) | ( ( 'CSHARP' ) ) );
    public final void rule__GenerationLanguage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:822:1: ( ( ( 'JAVA' ) ) | ( ( 'CPP' ) ) | ( ( 'C' ) ) | ( ( 'CSHARP' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:823:1: ( ( 'JAVA' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:823:1: ( ( 'JAVA' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:824:1: ( 'JAVA' )
                    {
                     before(grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:825:1: ( 'JAVA' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:825:3: 'JAVA'
                    {
                    match(input,20,FOLLOW_20_in_rule__GenerationLanguage__Alternatives1694); 

                    }

                     after(grammarAccess.getGenerationLanguageAccess().getJAVAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:830:6: ( ( 'CPP' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:830:6: ( ( 'CPP' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:831:1: ( 'CPP' )
                    {
                     before(grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:832:1: ( 'CPP' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:832:3: 'CPP'
                    {
                    match(input,21,FOLLOW_21_in_rule__GenerationLanguage__Alternatives1715); 

                    }

                     after(grammarAccess.getGenerationLanguageAccess().getCPPEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:837:6: ( ( 'C' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:837:6: ( ( 'C' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:838:1: ( 'C' )
                    {
                     before(grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:839:1: ( 'C' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:839:3: 'C'
                    {
                    match(input,22,FOLLOW_22_in_rule__GenerationLanguage__Alternatives1736); 

                    }

                     after(grammarAccess.getGenerationLanguageAccess().getCEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:844:6: ( ( 'CSHARP' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:844:6: ( ( 'CSHARP' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:845:1: ( 'CSHARP' )
                    {
                     before(grammarAccess.getGenerationLanguageAccess().getCSHARPEnumLiteralDeclaration_3()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:846:1: ( 'CSHARP' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:846:3: 'CSHARP'
                    {
                    match(input,23,FOLLOW_23_in_rule__GenerationLanguage__Alternatives1757); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:856:1: rule__Type__Alternatives : ( ( ( 'BOOL' ) ) | ( ( 'CHAR' ) ) | ( ( 'SHORT' ) ) | ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'LONGLONG' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'LONGDOUBLE' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:860:1: ( ( ( 'BOOL' ) ) | ( ( 'CHAR' ) ) | ( ( 'SHORT' ) ) | ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'LONGLONG' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'LONGDOUBLE' ) ) )
            int alt10=9;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            case 27:
                {
                alt10=4;
                }
                break;
            case 28:
                {
                alt10=5;
                }
                break;
            case 29:
                {
                alt10=6;
                }
                break;
            case 30:
                {
                alt10=7;
                }
                break;
            case 31:
                {
                alt10=8;
                }
                break;
            case 32:
                {
                alt10=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:861:1: ( ( 'BOOL' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:861:1: ( ( 'BOOL' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:862:1: ( 'BOOL' )
                    {
                     before(grammarAccess.getTypeAccess().getBOOLEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:863:1: ( 'BOOL' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:863:3: 'BOOL'
                    {
                    match(input,24,FOLLOW_24_in_rule__Type__Alternatives1793); 

                    }

                     after(grammarAccess.getTypeAccess().getBOOLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:868:6: ( ( 'CHAR' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:868:6: ( ( 'CHAR' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:869:1: ( 'CHAR' )
                    {
                     before(grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:870:1: ( 'CHAR' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:870:3: 'CHAR'
                    {
                    match(input,25,FOLLOW_25_in_rule__Type__Alternatives1814); 

                    }

                     after(grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:875:6: ( ( 'SHORT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:875:6: ( ( 'SHORT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:876:1: ( 'SHORT' )
                    {
                     before(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:877:1: ( 'SHORT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:877:3: 'SHORT'
                    {
                    match(input,26,FOLLOW_26_in_rule__Type__Alternatives1835); 

                    }

                     after(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:882:6: ( ( 'INT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:882:6: ( ( 'INT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:883:1: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_3()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:884:1: ( 'INT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:884:3: 'INT'
                    {
                    match(input,27,FOLLOW_27_in_rule__Type__Alternatives1856); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:889:6: ( ( 'LONG' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:889:6: ( ( 'LONG' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:890:1: ( 'LONG' )
                    {
                     before(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_4()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:891:1: ( 'LONG' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:891:3: 'LONG'
                    {
                    match(input,28,FOLLOW_28_in_rule__Type__Alternatives1877); 

                    }

                     after(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:896:6: ( ( 'LONGLONG' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:896:6: ( ( 'LONGLONG' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:897:1: ( 'LONGLONG' )
                    {
                     before(grammarAccess.getTypeAccess().getLONGLONGEnumLiteralDeclaration_5()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:898:1: ( 'LONGLONG' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:898:3: 'LONGLONG'
                    {
                    match(input,29,FOLLOW_29_in_rule__Type__Alternatives1898); 

                    }

                     after(grammarAccess.getTypeAccess().getLONGLONGEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:903:6: ( ( 'FLOAT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:903:6: ( ( 'FLOAT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:904:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_6()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:905:1: ( 'FLOAT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:905:3: 'FLOAT'
                    {
                    match(input,30,FOLLOW_30_in_rule__Type__Alternatives1919); 

                    }

                     after(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:910:6: ( ( 'DOUBLE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:910:6: ( ( 'DOUBLE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:911:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_7()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:912:1: ( 'DOUBLE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:912:3: 'DOUBLE'
                    {
                    match(input,31,FOLLOW_31_in_rule__Type__Alternatives1940); 

                    }

                     after(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:917:6: ( ( 'LONGDOUBLE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:917:6: ( ( 'LONGDOUBLE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:918:1: ( 'LONGDOUBLE' )
                    {
                     before(grammarAccess.getTypeAccess().getLONGDOUBLEEnumLiteralDeclaration_8()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:919:1: ( 'LONGDOUBLE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:919:3: 'LONGDOUBLE'
                    {
                    match(input,32,FOLLOW_32_in_rule__Type__Alternatives1961); 

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


    // $ANTLR start "rule__DataModel__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:931:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:935:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:936:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__01994);
            rule__DataModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__01997);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:943:1: rule__DataModel__Group__0__Impl : ( 'datamodel' ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:947:1: ( ( 'datamodel' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:948:1: ( 'datamodel' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:948:1: ( 'datamodel' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:949:1: 'datamodel'
            {
             before(grammarAccess.getDataModelAccess().getDatamodelKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__DataModel__Group__0__Impl2025); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:962:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:966:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:967:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__12056);
            rule__DataModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__12059);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:974:1: rule__DataModel__Group__1__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:978:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:979:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:979:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:980:1: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__DataModel__Group__1__Impl2087); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:993:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl rule__DataModel__Group__3 ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:997:1: ( rule__DataModel__Group__2__Impl rule__DataModel__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:998:2: rule__DataModel__Group__2__Impl rule__DataModel__Group__3
            {
            pushFollow(FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__22118);
            rule__DataModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__22121);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1005:1: rule__DataModel__Group__2__Impl : ( 'options' ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1009:1: ( ( 'options' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1010:1: ( 'options' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1010:1: ( 'options' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1011:1: 'options'
            {
             before(grammarAccess.getDataModelAccess().getOptionsKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__DataModel__Group__2__Impl2149); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1024:1: rule__DataModel__Group__3 : rule__DataModel__Group__3__Impl rule__DataModel__Group__4 ;
    public final void rule__DataModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1028:1: ( rule__DataModel__Group__3__Impl rule__DataModel__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1029:2: rule__DataModel__Group__3__Impl rule__DataModel__Group__4
            {
            pushFollow(FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__32180);
            rule__DataModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__32183);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1036:1: rule__DataModel__Group__3__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1040:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1041:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1041:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1042:1: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__DataModel__Group__3__Impl2211); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1055:1: rule__DataModel__Group__4 : rule__DataModel__Group__4__Impl rule__DataModel__Group__5 ;
    public final void rule__DataModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1059:1: ( rule__DataModel__Group__4__Impl rule__DataModel__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1060:2: rule__DataModel__Group__4__Impl rule__DataModel__Group__5
            {
            pushFollow(FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__42242);
            rule__DataModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__5_in_rule__DataModel__Group__42245);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1067:1: rule__DataModel__Group__4__Impl : ( ( rule__DataModel__OptionsAssignment_4 ) ) ;
    public final void rule__DataModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1071:1: ( ( ( rule__DataModel__OptionsAssignment_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1072:1: ( ( rule__DataModel__OptionsAssignment_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1072:1: ( ( rule__DataModel__OptionsAssignment_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1073:1: ( rule__DataModel__OptionsAssignment_4 )
            {
             before(grammarAccess.getDataModelAccess().getOptionsAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1074:1: ( rule__DataModel__OptionsAssignment_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1074:2: rule__DataModel__OptionsAssignment_4
            {
            pushFollow(FOLLOW_rule__DataModel__OptionsAssignment_4_in_rule__DataModel__Group__4__Impl2272);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1084:1: rule__DataModel__Group__5 : rule__DataModel__Group__5__Impl rule__DataModel__Group__6 ;
    public final void rule__DataModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1088:1: ( rule__DataModel__Group__5__Impl rule__DataModel__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1089:2: rule__DataModel__Group__5__Impl rule__DataModel__Group__6
            {
            pushFollow(FOLLOW_rule__DataModel__Group__5__Impl_in_rule__DataModel__Group__52302);
            rule__DataModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__6_in_rule__DataModel__Group__52305);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1096:1: rule__DataModel__Group__5__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1100:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1101:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1101:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1102:1: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_36_in_rule__DataModel__Group__5__Impl2333); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1115:1: rule__DataModel__Group__6 : rule__DataModel__Group__6__Impl rule__DataModel__Group__7 ;
    public final void rule__DataModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1119:1: ( rule__DataModel__Group__6__Impl rule__DataModel__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1120:2: rule__DataModel__Group__6__Impl rule__DataModel__Group__7
            {
            pushFollow(FOLLOW_rule__DataModel__Group__6__Impl_in_rule__DataModel__Group__62364);
            rule__DataModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__7_in_rule__DataModel__Group__62367);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1127:1: rule__DataModel__Group__6__Impl : ( ( rule__DataModel__Alternatives_6 )* ) ;
    public final void rule__DataModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1131:1: ( ( ( rule__DataModel__Alternatives_6 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1132:1: ( ( rule__DataModel__Alternatives_6 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1132:1: ( ( rule__DataModel__Alternatives_6 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1133:1: ( rule__DataModel__Alternatives_6 )*
            {
             before(grammarAccess.getDataModelAccess().getAlternatives_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1134:1: ( rule__DataModel__Alternatives_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=12 && LA11_0<=13)||(LA11_0>=16 && LA11_0<=17)||LA11_0==48||(LA11_0>=51 && LA11_0<=52)||LA11_0==57) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1134:2: rule__DataModel__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_rule__DataModel__Alternatives_6_in_rule__DataModel__Group__6__Impl2394);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1144:1: rule__DataModel__Group__7 : rule__DataModel__Group__7__Impl rule__DataModel__Group__8 ;
    public final void rule__DataModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1148:1: ( rule__DataModel__Group__7__Impl rule__DataModel__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1149:2: rule__DataModel__Group__7__Impl rule__DataModel__Group__8
            {
            pushFollow(FOLLOW_rule__DataModel__Group__7__Impl_in_rule__DataModel__Group__72425);
            rule__DataModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__8_in_rule__DataModel__Group__72428);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1156:1: rule__DataModel__Group__7__Impl : ( 'transmit' ) ;
    public final void rule__DataModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1160:1: ( ( 'transmit' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1161:1: ( 'transmit' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1161:1: ( 'transmit' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1162:1: 'transmit'
            {
             before(grammarAccess.getDataModelAccess().getTransmitKeyword_7()); 
            match(input,37,FOLLOW_37_in_rule__DataModel__Group__7__Impl2456); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1175:1: rule__DataModel__Group__8 : rule__DataModel__Group__8__Impl rule__DataModel__Group__9 ;
    public final void rule__DataModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1179:1: ( rule__DataModel__Group__8__Impl rule__DataModel__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1180:2: rule__DataModel__Group__8__Impl rule__DataModel__Group__9
            {
            pushFollow(FOLLOW_rule__DataModel__Group__8__Impl_in_rule__DataModel__Group__82487);
            rule__DataModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__9_in_rule__DataModel__Group__82490);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1187:1: rule__DataModel__Group__8__Impl : ( ( rule__DataModel__TransmitAssignment_8 ) ) ;
    public final void rule__DataModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1191:1: ( ( ( rule__DataModel__TransmitAssignment_8 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1192:1: ( ( rule__DataModel__TransmitAssignment_8 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1192:1: ( ( rule__DataModel__TransmitAssignment_8 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1193:1: ( rule__DataModel__TransmitAssignment_8 )
            {
             before(grammarAccess.getDataModelAccess().getTransmitAssignment_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1194:1: ( rule__DataModel__TransmitAssignment_8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1194:2: rule__DataModel__TransmitAssignment_8
            {
            pushFollow(FOLLOW_rule__DataModel__TransmitAssignment_8_in_rule__DataModel__Group__8__Impl2517);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1204:1: rule__DataModel__Group__9 : rule__DataModel__Group__9__Impl rule__DataModel__Group__10 ;
    public final void rule__DataModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1208:1: ( rule__DataModel__Group__9__Impl rule__DataModel__Group__10 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1209:2: rule__DataModel__Group__9__Impl rule__DataModel__Group__10
            {
            pushFollow(FOLLOW_rule__DataModel__Group__9__Impl_in_rule__DataModel__Group__92547);
            rule__DataModel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__10_in_rule__DataModel__Group__92550);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1216:1: rule__DataModel__Group__9__Impl : ( ( rule__DataModel__Group_9__0 )* ) ;
    public final void rule__DataModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1220:1: ( ( ( rule__DataModel__Group_9__0 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1221:1: ( ( rule__DataModel__Group_9__0 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1221:1: ( ( rule__DataModel__Group_9__0 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1222:1: ( rule__DataModel__Group_9__0 )*
            {
             before(grammarAccess.getDataModelAccess().getGroup_9()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1223:1: ( rule__DataModel__Group_9__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1223:2: rule__DataModel__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__DataModel__Group_9__0_in_rule__DataModel__Group__9__Impl2577);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1233:1: rule__DataModel__Group__10 : rule__DataModel__Group__10__Impl ;
    public final void rule__DataModel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1237:1: ( rule__DataModel__Group__10__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1238:2: rule__DataModel__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group__10__Impl_in_rule__DataModel__Group__102608);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1244:1: rule__DataModel__Group__10__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1248:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1249:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1249:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1250:1: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_10()); 
            match(input,36,FOLLOW_36_in_rule__DataModel__Group__10__Impl2636); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1285:1: rule__DataModel__Group_9__0 : rule__DataModel__Group_9__0__Impl rule__DataModel__Group_9__1 ;
    public final void rule__DataModel__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1289:1: ( rule__DataModel__Group_9__0__Impl rule__DataModel__Group_9__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1290:2: rule__DataModel__Group_9__0__Impl rule__DataModel__Group_9__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group_9__0__Impl_in_rule__DataModel__Group_9__02689);
            rule__DataModel__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group_9__1_in_rule__DataModel__Group_9__02692);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1297:1: rule__DataModel__Group_9__0__Impl : ( ',' ) ;
    public final void rule__DataModel__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1301:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1302:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1302:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1303:1: ','
            {
             before(grammarAccess.getDataModelAccess().getCommaKeyword_9_0()); 
            match(input,38,FOLLOW_38_in_rule__DataModel__Group_9__0__Impl2720); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1316:1: rule__DataModel__Group_9__1 : rule__DataModel__Group_9__1__Impl ;
    public final void rule__DataModel__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1320:1: ( rule__DataModel__Group_9__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1321:2: rule__DataModel__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group_9__1__Impl_in_rule__DataModel__Group_9__12751);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1327:1: rule__DataModel__Group_9__1__Impl : ( ( rule__DataModel__TransmitAssignment_9_1 ) ) ;
    public final void rule__DataModel__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1331:1: ( ( ( rule__DataModel__TransmitAssignment_9_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1332:1: ( ( rule__DataModel__TransmitAssignment_9_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1332:1: ( ( rule__DataModel__TransmitAssignment_9_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1333:1: ( rule__DataModel__TransmitAssignment_9_1 )
            {
             before(grammarAccess.getDataModelAccess().getTransmitAssignment_9_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1334:1: ( rule__DataModel__TransmitAssignment_9_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1334:2: rule__DataModel__TransmitAssignment_9_1
            {
            pushFollow(FOLLOW_rule__DataModel__TransmitAssignment_9_1_in_rule__DataModel__Group_9__1__Impl2778);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1348:1: rule__Options__Group__0 : rule__Options__Group__0__Impl rule__Options__Group__1 ;
    public final void rule__Options__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1352:1: ( rule__Options__Group__0__Impl rule__Options__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1353:2: rule__Options__Group__0__Impl rule__Options__Group__1
            {
            pushFollow(FOLLOW_rule__Options__Group__0__Impl_in_rule__Options__Group__02812);
            rule__Options__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group__1_in_rule__Options__Group__02815);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1360:1: rule__Options__Group__0__Impl : ( () ) ;
    public final void rule__Options__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1364:1: ( ( () ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1365:1: ( () )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1365:1: ( () )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1366:1: ()
            {
             before(grammarAccess.getOptionsAccess().getOptionsAction_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1367:1: ()
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1369:1: 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1379:1: rule__Options__Group__1 : rule__Options__Group__1__Impl ;
    public final void rule__Options__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1383:1: ( rule__Options__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1384:2: rule__Options__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group__1__Impl_in_rule__Options__Group__12873);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1390:1: rule__Options__Group__1__Impl : ( ( rule__Options__Group_1__0 ) ) ;
    public final void rule__Options__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1394:1: ( ( ( rule__Options__Group_1__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1395:1: ( ( rule__Options__Group_1__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1395:1: ( ( rule__Options__Group_1__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1396:1: ( rule__Options__Group_1__0 )
            {
             before(grammarAccess.getOptionsAccess().getGroup_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1397:1: ( rule__Options__Group_1__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1397:2: rule__Options__Group_1__0
            {
            pushFollow(FOLLOW_rule__Options__Group_1__0_in_rule__Options__Group__1__Impl2900);
            rule__Options__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Options__Group_1__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1411:1: rule__Options__Group_1__0 : rule__Options__Group_1__0__Impl rule__Options__Group_1__1 ;
    public final void rule__Options__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1415:1: ( rule__Options__Group_1__0__Impl rule__Options__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1416:2: rule__Options__Group_1__0__Impl rule__Options__Group_1__1
            {
            pushFollow(FOLLOW_rule__Options__Group_1__0__Impl_in_rule__Options__Group_1__02934);
            rule__Options__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1__1_in_rule__Options__Group_1__02937);
            rule__Options__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1__0"


    // $ANTLR start "rule__Options__Group_1__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1423:1: rule__Options__Group_1__0__Impl : ( ( rule__Options__Group_1_0__0 ) ) ;
    public final void rule__Options__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1427:1: ( ( ( rule__Options__Group_1_0__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1428:1: ( ( rule__Options__Group_1_0__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1428:1: ( ( rule__Options__Group_1_0__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1429:1: ( rule__Options__Group_1_0__0 )
            {
             before(grammarAccess.getOptionsAccess().getGroup_1_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1430:1: ( rule__Options__Group_1_0__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1430:2: rule__Options__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__0_in_rule__Options__Group_1__0__Impl2964);
            rule__Options__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1__0__Impl"


    // $ANTLR start "rule__Options__Group_1__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1440:1: rule__Options__Group_1__1 : rule__Options__Group_1__1__Impl rule__Options__Group_1__2 ;
    public final void rule__Options__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1444:1: ( rule__Options__Group_1__1__Impl rule__Options__Group_1__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1445:2: rule__Options__Group_1__1__Impl rule__Options__Group_1__2
            {
            pushFollow(FOLLOW_rule__Options__Group_1__1__Impl_in_rule__Options__Group_1__12994);
            rule__Options__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1__2_in_rule__Options__Group_1__12997);
            rule__Options__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1__1"


    // $ANTLR start "rule__Options__Group_1__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1452:1: rule__Options__Group_1__1__Impl : ( ( rule__Options__Group_1_1__0 ) ) ;
    public final void rule__Options__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1456:1: ( ( ( rule__Options__Group_1_1__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1457:1: ( ( rule__Options__Group_1_1__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1457:1: ( ( rule__Options__Group_1_1__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1458:1: ( rule__Options__Group_1_1__0 )
            {
             before(grammarAccess.getOptionsAccess().getGroup_1_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1459:1: ( rule__Options__Group_1_1__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1459:2: rule__Options__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__0_in_rule__Options__Group_1__1__Impl3024);
            rule__Options__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1__1__Impl"


    // $ANTLR start "rule__Options__Group_1__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1469:1: rule__Options__Group_1__2 : rule__Options__Group_1__2__Impl ;
    public final void rule__Options__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1473:1: ( rule__Options__Group_1__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1474:2: rule__Options__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group_1__2__Impl_in_rule__Options__Group_1__23054);
            rule__Options__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1__2"


    // $ANTLR start "rule__Options__Group_1__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1480:1: rule__Options__Group_1__2__Impl : ( ( rule__Options__Group_1_2__0 ) ) ;
    public final void rule__Options__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1484:1: ( ( ( rule__Options__Group_1_2__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1485:1: ( ( rule__Options__Group_1_2__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1485:1: ( ( rule__Options__Group_1_2__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1486:1: ( rule__Options__Group_1_2__0 )
            {
             before(grammarAccess.getOptionsAccess().getGroup_1_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1487:1: ( rule__Options__Group_1_2__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1487:2: rule__Options__Group_1_2__0
            {
            pushFollow(FOLLOW_rule__Options__Group_1_2__0_in_rule__Options__Group_1__2__Impl3081);
            rule__Options__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group_1__2__Impl"


    // $ANTLR start "rule__Options__Group_1_0__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1503:1: rule__Options__Group_1_0__0 : rule__Options__Group_1_0__0__Impl rule__Options__Group_1_0__1 ;
    public final void rule__Options__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1507:1: ( rule__Options__Group_1_0__0__Impl rule__Options__Group_1_0__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1508:2: rule__Options__Group_1_0__0__Impl rule__Options__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__0__Impl_in_rule__Options__Group_1_0__03117);
            rule__Options__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_0__1_in_rule__Options__Group_1_0__03120);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1515:1: rule__Options__Group_1_0__0__Impl : ( 'Endianess' ) ;
    public final void rule__Options__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1519:1: ( ( 'Endianess' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1520:1: ( 'Endianess' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1520:1: ( 'Endianess' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1521:1: 'Endianess'
            {
             before(grammarAccess.getOptionsAccess().getEndianessKeyword_1_0_0()); 
            match(input,39,FOLLOW_39_in_rule__Options__Group_1_0__0__Impl3148); 
             after(grammarAccess.getOptionsAccess().getEndianessKeyword_1_0_0()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1534:1: rule__Options__Group_1_0__1 : rule__Options__Group_1_0__1__Impl rule__Options__Group_1_0__2 ;
    public final void rule__Options__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1538:1: ( rule__Options__Group_1_0__1__Impl rule__Options__Group_1_0__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1539:2: rule__Options__Group_1_0__1__Impl rule__Options__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__1__Impl_in_rule__Options__Group_1_0__13179);
            rule__Options__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_0__2_in_rule__Options__Group_1_0__13182);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1546:1: rule__Options__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Options__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1550:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1551:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1551:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1552:1: ':'
            {
             before(grammarAccess.getOptionsAccess().getColonKeyword_1_0_1()); 
            match(input,40,FOLLOW_40_in_rule__Options__Group_1_0__1__Impl3210); 
             after(grammarAccess.getOptionsAccess().getColonKeyword_1_0_1()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1565:1: rule__Options__Group_1_0__2 : rule__Options__Group_1_0__2__Impl ;
    public final void rule__Options__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1569:1: ( rule__Options__Group_1_0__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1570:2: rule__Options__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group_1_0__2__Impl_in_rule__Options__Group_1_0__23241);
            rule__Options__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1576:1: rule__Options__Group_1_0__2__Impl : ( ( rule__Options__EndianessAssignment_1_0_2 ) ) ;
    public final void rule__Options__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1580:1: ( ( ( rule__Options__EndianessAssignment_1_0_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1581:1: ( ( rule__Options__EndianessAssignment_1_0_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1581:1: ( ( rule__Options__EndianessAssignment_1_0_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1582:1: ( rule__Options__EndianessAssignment_1_0_2 )
            {
             before(grammarAccess.getOptionsAccess().getEndianessAssignment_1_0_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1583:1: ( rule__Options__EndianessAssignment_1_0_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1583:2: rule__Options__EndianessAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Options__EndianessAssignment_1_0_2_in_rule__Options__Group_1_0__2__Impl3268);
            rule__Options__EndianessAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getEndianessAssignment_1_0_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Options__Group_1_1__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1599:1: rule__Options__Group_1_1__0 : rule__Options__Group_1_1__0__Impl rule__Options__Group_1_1__1 ;
    public final void rule__Options__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1603:1: ( rule__Options__Group_1_1__0__Impl rule__Options__Group_1_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1604:2: rule__Options__Group_1_1__0__Impl rule__Options__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__0__Impl_in_rule__Options__Group_1_1__03304);
            rule__Options__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_1__1_in_rule__Options__Group_1_1__03307);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1611:1: rule__Options__Group_1_1__0__Impl : ( 'sensor' ) ;
    public final void rule__Options__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1615:1: ( ( 'sensor' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1616:1: ( 'sensor' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1616:1: ( 'sensor' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1617:1: 'sensor'
            {
             before(grammarAccess.getOptionsAccess().getSensorKeyword_1_1_0()); 
            match(input,41,FOLLOW_41_in_rule__Options__Group_1_1__0__Impl3335); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1630:1: rule__Options__Group_1_1__1 : rule__Options__Group_1_1__1__Impl rule__Options__Group_1_1__2 ;
    public final void rule__Options__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1634:1: ( rule__Options__Group_1_1__1__Impl rule__Options__Group_1_1__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1635:2: rule__Options__Group_1_1__1__Impl rule__Options__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__1__Impl_in_rule__Options__Group_1_1__13366);
            rule__Options__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_1__2_in_rule__Options__Group_1_1__13369);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1642:1: rule__Options__Group_1_1__1__Impl : ( 'language' ) ;
    public final void rule__Options__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1646:1: ( ( 'language' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1647:1: ( 'language' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1647:1: ( 'language' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1648:1: 'language'
            {
             before(grammarAccess.getOptionsAccess().getLanguageKeyword_1_1_1()); 
            match(input,42,FOLLOW_42_in_rule__Options__Group_1_1__1__Impl3397); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1661:1: rule__Options__Group_1_1__2 : rule__Options__Group_1_1__2__Impl rule__Options__Group_1_1__3 ;
    public final void rule__Options__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1665:1: ( rule__Options__Group_1_1__2__Impl rule__Options__Group_1_1__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1666:2: rule__Options__Group_1_1__2__Impl rule__Options__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__2__Impl_in_rule__Options__Group_1_1__23428);
            rule__Options__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_1__3_in_rule__Options__Group_1_1__23431);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1673:1: rule__Options__Group_1_1__2__Impl : ( ':' ) ;
    public final void rule__Options__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1677:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1678:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1678:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1679:1: ':'
            {
             before(grammarAccess.getOptionsAccess().getColonKeyword_1_1_2()); 
            match(input,40,FOLLOW_40_in_rule__Options__Group_1_1__2__Impl3459); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1692:1: rule__Options__Group_1_1__3 : rule__Options__Group_1_1__3__Impl ;
    public final void rule__Options__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1696:1: ( rule__Options__Group_1_1__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1697:2: rule__Options__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group_1_1__3__Impl_in_rule__Options__Group_1_1__33490);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1703:1: rule__Options__Group_1_1__3__Impl : ( ( rule__Options__SensorLanguageAssignment_1_1_3 ) ) ;
    public final void rule__Options__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1707:1: ( ( ( rule__Options__SensorLanguageAssignment_1_1_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1708:1: ( ( rule__Options__SensorLanguageAssignment_1_1_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1708:1: ( ( rule__Options__SensorLanguageAssignment_1_1_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1709:1: ( rule__Options__SensorLanguageAssignment_1_1_3 )
            {
             before(grammarAccess.getOptionsAccess().getSensorLanguageAssignment_1_1_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1710:1: ( rule__Options__SensorLanguageAssignment_1_1_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1710:2: rule__Options__SensorLanguageAssignment_1_1_3
            {
            pushFollow(FOLLOW_rule__Options__SensorLanguageAssignment_1_1_3_in_rule__Options__Group_1_1__3__Impl3517);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1728:1: rule__Options__Group_1_2__0 : rule__Options__Group_1_2__0__Impl rule__Options__Group_1_2__1 ;
    public final void rule__Options__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1732:1: ( rule__Options__Group_1_2__0__Impl rule__Options__Group_1_2__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1733:2: rule__Options__Group_1_2__0__Impl rule__Options__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Options__Group_1_2__0__Impl_in_rule__Options__Group_1_2__03555);
            rule__Options__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_2__1_in_rule__Options__Group_1_2__03558);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1740:1: rule__Options__Group_1_2__0__Impl : ( 'receiver' ) ;
    public final void rule__Options__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1744:1: ( ( 'receiver' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1745:1: ( 'receiver' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1745:1: ( 'receiver' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1746:1: 'receiver'
            {
             before(grammarAccess.getOptionsAccess().getReceiverKeyword_1_2_0()); 
            match(input,43,FOLLOW_43_in_rule__Options__Group_1_2__0__Impl3586); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1759:1: rule__Options__Group_1_2__1 : rule__Options__Group_1_2__1__Impl rule__Options__Group_1_2__2 ;
    public final void rule__Options__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1763:1: ( rule__Options__Group_1_2__1__Impl rule__Options__Group_1_2__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1764:2: rule__Options__Group_1_2__1__Impl rule__Options__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__Options__Group_1_2__1__Impl_in_rule__Options__Group_1_2__13617);
            rule__Options__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_2__2_in_rule__Options__Group_1_2__13620);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1771:1: rule__Options__Group_1_2__1__Impl : ( 'language' ) ;
    public final void rule__Options__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1775:1: ( ( 'language' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1776:1: ( 'language' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1776:1: ( 'language' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1777:1: 'language'
            {
             before(grammarAccess.getOptionsAccess().getLanguageKeyword_1_2_1()); 
            match(input,42,FOLLOW_42_in_rule__Options__Group_1_2__1__Impl3648); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1790:1: rule__Options__Group_1_2__2 : rule__Options__Group_1_2__2__Impl rule__Options__Group_1_2__3 ;
    public final void rule__Options__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1794:1: ( rule__Options__Group_1_2__2__Impl rule__Options__Group_1_2__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1795:2: rule__Options__Group_1_2__2__Impl rule__Options__Group_1_2__3
            {
            pushFollow(FOLLOW_rule__Options__Group_1_2__2__Impl_in_rule__Options__Group_1_2__23679);
            rule__Options__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_1_2__3_in_rule__Options__Group_1_2__23682);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1802:1: rule__Options__Group_1_2__2__Impl : ( ':' ) ;
    public final void rule__Options__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1806:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1807:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1807:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1808:1: ':'
            {
             before(grammarAccess.getOptionsAccess().getColonKeyword_1_2_2()); 
            match(input,40,FOLLOW_40_in_rule__Options__Group_1_2__2__Impl3710); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1821:1: rule__Options__Group_1_2__3 : rule__Options__Group_1_2__3__Impl ;
    public final void rule__Options__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1825:1: ( rule__Options__Group_1_2__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1826:2: rule__Options__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group_1_2__3__Impl_in_rule__Options__Group_1_2__33741);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1832:1: rule__Options__Group_1_2__3__Impl : ( ( rule__Options__ReceiverLanguageAssignment_1_2_3 ) ) ;
    public final void rule__Options__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1836:1: ( ( ( rule__Options__ReceiverLanguageAssignment_1_2_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1837:1: ( ( rule__Options__ReceiverLanguageAssignment_1_2_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1837:1: ( ( rule__Options__ReceiverLanguageAssignment_1_2_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1838:1: ( rule__Options__ReceiverLanguageAssignment_1_2_3 )
            {
             before(grammarAccess.getOptionsAccess().getReceiverLanguageAssignment_1_2_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1839:1: ( rule__Options__ReceiverLanguageAssignment_1_2_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1839:2: rule__Options__ReceiverLanguageAssignment_1_2_3
            {
            pushFollow(FOLLOW_rule__Options__ReceiverLanguageAssignment_1_2_3_in_rule__Options__Group_1_2__3__Impl3768);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1857:1: rule__Representation__Group__0 : rule__Representation__Group__0__Impl rule__Representation__Group__1 ;
    public final void rule__Representation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1861:1: ( rule__Representation__Group__0__Impl rule__Representation__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1862:2: rule__Representation__Group__0__Impl rule__Representation__Group__1
            {
            pushFollow(FOLLOW_rule__Representation__Group__0__Impl_in_rule__Representation__Group__03806);
            rule__Representation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__1_in_rule__Representation__Group__03809);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1869:1: rule__Representation__Group__0__Impl : ( ( rule__Representation__Alternatives_0 ) ) ;
    public final void rule__Representation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1873:1: ( ( ( rule__Representation__Alternatives_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1874:1: ( ( rule__Representation__Alternatives_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1874:1: ( ( rule__Representation__Alternatives_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1875:1: ( rule__Representation__Alternatives_0 )
            {
             before(grammarAccess.getRepresentationAccess().getAlternatives_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1876:1: ( rule__Representation__Alternatives_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1876:2: rule__Representation__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Representation__Alternatives_0_in_rule__Representation__Group__0__Impl3836);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1886:1: rule__Representation__Group__1 : rule__Representation__Group__1__Impl rule__Representation__Group__2 ;
    public final void rule__Representation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1890:1: ( rule__Representation__Group__1__Impl rule__Representation__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1891:2: rule__Representation__Group__1__Impl rule__Representation__Group__2
            {
            pushFollow(FOLLOW_rule__Representation__Group__1__Impl_in_rule__Representation__Group__13866);
            rule__Representation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__2_in_rule__Representation__Group__13869);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1898:1: rule__Representation__Group__1__Impl : ( ( rule__Representation__NameAssignment_1 ) ) ;
    public final void rule__Representation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1902:1: ( ( ( rule__Representation__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1903:1: ( ( rule__Representation__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1903:1: ( ( rule__Representation__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1904:1: ( rule__Representation__NameAssignment_1 )
            {
             before(grammarAccess.getRepresentationAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1905:1: ( rule__Representation__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1905:2: rule__Representation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Representation__NameAssignment_1_in_rule__Representation__Group__1__Impl3896);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1915:1: rule__Representation__Group__2 : rule__Representation__Group__2__Impl rule__Representation__Group__3 ;
    public final void rule__Representation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1919:1: ( rule__Representation__Group__2__Impl rule__Representation__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1920:2: rule__Representation__Group__2__Impl rule__Representation__Group__3
            {
            pushFollow(FOLLOW_rule__Representation__Group__2__Impl_in_rule__Representation__Group__23926);
            rule__Representation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__3_in_rule__Representation__Group__23929);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1927:1: rule__Representation__Group__2__Impl : ( 'is' ) ;
    public final void rule__Representation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1931:1: ( ( 'is' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1932:1: ( 'is' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1932:1: ( 'is' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1933:1: 'is'
            {
             before(grammarAccess.getRepresentationAccess().getIsKeyword_2()); 
            match(input,44,FOLLOW_44_in_rule__Representation__Group__2__Impl3957); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1946:1: rule__Representation__Group__3 : rule__Representation__Group__3__Impl rule__Representation__Group__4 ;
    public final void rule__Representation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1950:1: ( rule__Representation__Group__3__Impl rule__Representation__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1951:2: rule__Representation__Group__3__Impl rule__Representation__Group__4
            {
            pushFollow(FOLLOW_rule__Representation__Group__3__Impl_in_rule__Representation__Group__33988);
            rule__Representation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__4_in_rule__Representation__Group__33991);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1958:1: rule__Representation__Group__3__Impl : ( ( rule__Representation__ByteCountAssignment_3 ) ) ;
    public final void rule__Representation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1962:1: ( ( ( rule__Representation__ByteCountAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1963:1: ( ( rule__Representation__ByteCountAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1963:1: ( ( rule__Representation__ByteCountAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1964:1: ( rule__Representation__ByteCountAssignment_3 )
            {
             before(grammarAccess.getRepresentationAccess().getByteCountAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1965:1: ( rule__Representation__ByteCountAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1965:2: rule__Representation__ByteCountAssignment_3
            {
            pushFollow(FOLLOW_rule__Representation__ByteCountAssignment_3_in_rule__Representation__Group__3__Impl4018);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1975:1: rule__Representation__Group__4 : rule__Representation__Group__4__Impl rule__Representation__Group__5 ;
    public final void rule__Representation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1979:1: ( rule__Representation__Group__4__Impl rule__Representation__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1980:2: rule__Representation__Group__4__Impl rule__Representation__Group__5
            {
            pushFollow(FOLLOW_rule__Representation__Group__4__Impl_in_rule__Representation__Group__44048);
            rule__Representation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__5_in_rule__Representation__Group__44051);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1987:1: rule__Representation__Group__4__Impl : ( ( rule__Representation__Alternatives_4 ) ) ;
    public final void rule__Representation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1991:1: ( ( ( rule__Representation__Alternatives_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1992:1: ( ( rule__Representation__Alternatives_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1992:1: ( ( rule__Representation__Alternatives_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1993:1: ( rule__Representation__Alternatives_4 )
            {
             before(grammarAccess.getRepresentationAccess().getAlternatives_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1994:1: ( rule__Representation__Alternatives_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1994:2: rule__Representation__Alternatives_4
            {
            pushFollow(FOLLOW_rule__Representation__Alternatives_4_in_rule__Representation__Group__4__Impl4078);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2004:1: rule__Representation__Group__5 : rule__Representation__Group__5__Impl rule__Representation__Group__6 ;
    public final void rule__Representation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2008:1: ( rule__Representation__Group__5__Impl rule__Representation__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2009:2: rule__Representation__Group__5__Impl rule__Representation__Group__6
            {
            pushFollow(FOLLOW_rule__Representation__Group__5__Impl_in_rule__Representation__Group__54108);
            rule__Representation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__6_in_rule__Representation__Group__54111);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2016:1: rule__Representation__Group__5__Impl : ( 'in' ) ;
    public final void rule__Representation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2020:1: ( ( 'in' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2021:1: ( 'in' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2021:1: ( 'in' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2022:1: 'in'
            {
             before(grammarAccess.getRepresentationAccess().getInKeyword_5()); 
            match(input,45,FOLLOW_45_in_rule__Representation__Group__5__Impl4139); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2035:1: rule__Representation__Group__6 : rule__Representation__Group__6__Impl rule__Representation__Group__7 ;
    public final void rule__Representation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2039:1: ( rule__Representation__Group__6__Impl rule__Representation__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2040:2: rule__Representation__Group__6__Impl rule__Representation__Group__7
            {
            pushFollow(FOLLOW_rule__Representation__Group__6__Impl_in_rule__Representation__Group__64170);
            rule__Representation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__7_in_rule__Representation__Group__64173);
            rule__Representation__Group__7();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2047:1: rule__Representation__Group__6__Impl : ( ( rule__Representation__TypeAssignment_6 ) ) ;
    public final void rule__Representation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2051:1: ( ( ( rule__Representation__TypeAssignment_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2052:1: ( ( rule__Representation__TypeAssignment_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2052:1: ( ( rule__Representation__TypeAssignment_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2053:1: ( rule__Representation__TypeAssignment_6 )
            {
             before(grammarAccess.getRepresentationAccess().getTypeAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2054:1: ( rule__Representation__TypeAssignment_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2054:2: rule__Representation__TypeAssignment_6
            {
            pushFollow(FOLLOW_rule__Representation__TypeAssignment_6_in_rule__Representation__Group__6__Impl4200);
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


    // $ANTLR start "rule__Representation__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2064:1: rule__Representation__Group__7 : rule__Representation__Group__7__Impl rule__Representation__Group__8 ;
    public final void rule__Representation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2068:1: ( rule__Representation__Group__7__Impl rule__Representation__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2069:2: rule__Representation__Group__7__Impl rule__Representation__Group__8
            {
            pushFollow(FOLLOW_rule__Representation__Group__7__Impl_in_rule__Representation__Group__74230);
            rule__Representation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group__8_in_rule__Representation__Group__74233);
            rule__Representation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__7"


    // $ANTLR start "rule__Representation__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2076:1: rule__Representation__Group__7__Impl : ( ( rule__Representation__Group_7__0 )? ) ;
    public final void rule__Representation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2080:1: ( ( ( rule__Representation__Group_7__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2081:1: ( ( rule__Representation__Group_7__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2081:1: ( ( rule__Representation__Group_7__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2082:1: ( rule__Representation__Group_7__0 )?
            {
             before(grammarAccess.getRepresentationAccess().getGroup_7()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2083:1: ( rule__Representation__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2083:2: rule__Representation__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Representation__Group_7__0_in_rule__Representation__Group__7__Impl4260);
                    rule__Representation__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRepresentationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__7__Impl"


    // $ANTLR start "rule__Representation__Group__8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2093:1: rule__Representation__Group__8 : rule__Representation__Group__8__Impl ;
    public final void rule__Representation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2097:1: ( rule__Representation__Group__8__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2098:2: rule__Representation__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Representation__Group__8__Impl_in_rule__Representation__Group__84291);
            rule__Representation__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__8"


    // $ANTLR start "rule__Representation__Group__8__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2104:1: rule__Representation__Group__8__Impl : ( ( rule__Representation__Group_8__0 )? ) ;
    public final void rule__Representation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2108:1: ( ( ( rule__Representation__Group_8__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2109:1: ( ( rule__Representation__Group_8__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2109:1: ( ( rule__Representation__Group_8__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2110:1: ( rule__Representation__Group_8__0 )?
            {
             before(grammarAccess.getRepresentationAccess().getGroup_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2111:1: ( rule__Representation__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==47) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2111:2: rule__Representation__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Representation__Group_8__0_in_rule__Representation__Group__8__Impl4318);
                    rule__Representation__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRepresentationAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group__8__Impl"


    // $ANTLR start "rule__Representation__Group_7__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2139:1: rule__Representation__Group_7__0 : rule__Representation__Group_7__0__Impl rule__Representation__Group_7__1 ;
    public final void rule__Representation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2143:1: ( rule__Representation__Group_7__0__Impl rule__Representation__Group_7__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2144:2: rule__Representation__Group_7__0__Impl rule__Representation__Group_7__1
            {
            pushFollow(FOLLOW_rule__Representation__Group_7__0__Impl_in_rule__Representation__Group_7__04367);
            rule__Representation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group_7__1_in_rule__Representation__Group_7__04370);
            rule__Representation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group_7__0"


    // $ANTLR start "rule__Representation__Group_7__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2151:1: rule__Representation__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__Representation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2155:1: ( ( 'description' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2156:1: ( 'description' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2156:1: ( 'description' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2157:1: 'description'
            {
             before(grammarAccess.getRepresentationAccess().getDescriptionKeyword_7_0()); 
            match(input,46,FOLLOW_46_in_rule__Representation__Group_7__0__Impl4398); 
             after(grammarAccess.getRepresentationAccess().getDescriptionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group_7__0__Impl"


    // $ANTLR start "rule__Representation__Group_7__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2170:1: rule__Representation__Group_7__1 : rule__Representation__Group_7__1__Impl rule__Representation__Group_7__2 ;
    public final void rule__Representation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2174:1: ( rule__Representation__Group_7__1__Impl rule__Representation__Group_7__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2175:2: rule__Representation__Group_7__1__Impl rule__Representation__Group_7__2
            {
            pushFollow(FOLLOW_rule__Representation__Group_7__1__Impl_in_rule__Representation__Group_7__14429);
            rule__Representation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group_7__2_in_rule__Representation__Group_7__14432);
            rule__Representation__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group_7__1"


    // $ANTLR start "rule__Representation__Group_7__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2182:1: rule__Representation__Group_7__1__Impl : ( ':' ) ;
    public final void rule__Representation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2186:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2187:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2187:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2188:1: ':'
            {
             before(grammarAccess.getRepresentationAccess().getColonKeyword_7_1()); 
            match(input,40,FOLLOW_40_in_rule__Representation__Group_7__1__Impl4460); 
             after(grammarAccess.getRepresentationAccess().getColonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group_7__1__Impl"


    // $ANTLR start "rule__Representation__Group_7__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2201:1: rule__Representation__Group_7__2 : rule__Representation__Group_7__2__Impl ;
    public final void rule__Representation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2205:1: ( rule__Representation__Group_7__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2206:2: rule__Representation__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Representation__Group_7__2__Impl_in_rule__Representation__Group_7__24491);
            rule__Representation__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group_7__2"


    // $ANTLR start "rule__Representation__Group_7__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2212:1: rule__Representation__Group_7__2__Impl : ( ( rule__Representation__DescriptionAssignment_7_2 ) ) ;
    public final void rule__Representation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2216:1: ( ( ( rule__Representation__DescriptionAssignment_7_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2217:1: ( ( rule__Representation__DescriptionAssignment_7_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2217:1: ( ( rule__Representation__DescriptionAssignment_7_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2218:1: ( rule__Representation__DescriptionAssignment_7_2 )
            {
             before(grammarAccess.getRepresentationAccess().getDescriptionAssignment_7_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2219:1: ( rule__Representation__DescriptionAssignment_7_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2219:2: rule__Representation__DescriptionAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Representation__DescriptionAssignment_7_2_in_rule__Representation__Group_7__2__Impl4518);
            rule__Representation__DescriptionAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRepresentationAccess().getDescriptionAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group_7__2__Impl"


    // $ANTLR start "rule__Representation__Group_8__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2235:1: rule__Representation__Group_8__0 : rule__Representation__Group_8__0__Impl rule__Representation__Group_8__1 ;
    public final void rule__Representation__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2239:1: ( rule__Representation__Group_8__0__Impl rule__Representation__Group_8__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2240:2: rule__Representation__Group_8__0__Impl rule__Representation__Group_8__1
            {
            pushFollow(FOLLOW_rule__Representation__Group_8__0__Impl_in_rule__Representation__Group_8__04554);
            rule__Representation__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group_8__1_in_rule__Representation__Group_8__04557);
            rule__Representation__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group_8__0"


    // $ANTLR start "rule__Representation__Group_8__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2247:1: rule__Representation__Group_8__0__Impl : ( 'id' ) ;
    public final void rule__Representation__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2251:1: ( ( 'id' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2252:1: ( 'id' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2252:1: ( 'id' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2253:1: 'id'
            {
             before(grammarAccess.getRepresentationAccess().getIdKeyword_8_0()); 
            match(input,47,FOLLOW_47_in_rule__Representation__Group_8__0__Impl4585); 
             after(grammarAccess.getRepresentationAccess().getIdKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group_8__0__Impl"


    // $ANTLR start "rule__Representation__Group_8__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2266:1: rule__Representation__Group_8__1 : rule__Representation__Group_8__1__Impl rule__Representation__Group_8__2 ;
    public final void rule__Representation__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2270:1: ( rule__Representation__Group_8__1__Impl rule__Representation__Group_8__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2271:2: rule__Representation__Group_8__1__Impl rule__Representation__Group_8__2
            {
            pushFollow(FOLLOW_rule__Representation__Group_8__1__Impl_in_rule__Representation__Group_8__14616);
            rule__Representation__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Representation__Group_8__2_in_rule__Representation__Group_8__14619);
            rule__Representation__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group_8__1"


    // $ANTLR start "rule__Representation__Group_8__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2278:1: rule__Representation__Group_8__1__Impl : ( ':' ) ;
    public final void rule__Representation__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2282:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2283:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2283:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2284:1: ':'
            {
             before(grammarAccess.getRepresentationAccess().getColonKeyword_8_1()); 
            match(input,40,FOLLOW_40_in_rule__Representation__Group_8__1__Impl4647); 
             after(grammarAccess.getRepresentationAccess().getColonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group_8__1__Impl"


    // $ANTLR start "rule__Representation__Group_8__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2297:1: rule__Representation__Group_8__2 : rule__Representation__Group_8__2__Impl ;
    public final void rule__Representation__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2301:1: ( rule__Representation__Group_8__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2302:2: rule__Representation__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Representation__Group_8__2__Impl_in_rule__Representation__Group_8__24678);
            rule__Representation__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group_8__2"


    // $ANTLR start "rule__Representation__Group_8__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2308:1: rule__Representation__Group_8__2__Impl : ( ( rule__Representation__IDAssignment_8_2 ) ) ;
    public final void rule__Representation__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2312:1: ( ( ( rule__Representation__IDAssignment_8_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2313:1: ( ( rule__Representation__IDAssignment_8_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2313:1: ( ( rule__Representation__IDAssignment_8_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2314:1: ( rule__Representation__IDAssignment_8_2 )
            {
             before(grammarAccess.getRepresentationAccess().getIDAssignment_8_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2315:1: ( rule__Representation__IDAssignment_8_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2315:2: rule__Representation__IDAssignment_8_2
            {
            pushFollow(FOLLOW_rule__Representation__IDAssignment_8_2_in_rule__Representation__Group_8__2__Impl4705);
            rule__Representation__IDAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getRepresentationAccess().getIDAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__Group_8__2__Impl"


    // $ANTLR start "rule__MeasuredData__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2331:1: rule__MeasuredData__Group__0 : rule__MeasuredData__Group__0__Impl rule__MeasuredData__Group__1 ;
    public final void rule__MeasuredData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2335:1: ( rule__MeasuredData__Group__0__Impl rule__MeasuredData__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2336:2: rule__MeasuredData__Group__0__Impl rule__MeasuredData__Group__1
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group__0__Impl_in_rule__MeasuredData__Group__04741);
            rule__MeasuredData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasuredData__Group__1_in_rule__MeasuredData__Group__04744);
            rule__MeasuredData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__0"


    // $ANTLR start "rule__MeasuredData__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2343:1: rule__MeasuredData__Group__0__Impl : ( 'data' ) ;
    public final void rule__MeasuredData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2347:1: ( ( 'data' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2348:1: ( 'data' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2348:1: ( 'data' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2349:1: 'data'
            {
             before(grammarAccess.getMeasuredDataAccess().getDataKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__MeasuredData__Group__0__Impl4772); 
             after(grammarAccess.getMeasuredDataAccess().getDataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__0__Impl"


    // $ANTLR start "rule__MeasuredData__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2362:1: rule__MeasuredData__Group__1 : rule__MeasuredData__Group__1__Impl rule__MeasuredData__Group__2 ;
    public final void rule__MeasuredData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2366:1: ( rule__MeasuredData__Group__1__Impl rule__MeasuredData__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2367:2: rule__MeasuredData__Group__1__Impl rule__MeasuredData__Group__2
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group__1__Impl_in_rule__MeasuredData__Group__14803);
            rule__MeasuredData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasuredData__Group__2_in_rule__MeasuredData__Group__14806);
            rule__MeasuredData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__1"


    // $ANTLR start "rule__MeasuredData__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2374:1: rule__MeasuredData__Group__1__Impl : ( 'of' ) ;
    public final void rule__MeasuredData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2378:1: ( ( 'of' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2379:1: ( 'of' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2379:1: ( 'of' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2380:1: 'of'
            {
             before(grammarAccess.getMeasuredDataAccess().getOfKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__MeasuredData__Group__1__Impl4834); 
             after(grammarAccess.getMeasuredDataAccess().getOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__1__Impl"


    // $ANTLR start "rule__MeasuredData__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2393:1: rule__MeasuredData__Group__2 : rule__MeasuredData__Group__2__Impl rule__MeasuredData__Group__3 ;
    public final void rule__MeasuredData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2397:1: ( rule__MeasuredData__Group__2__Impl rule__MeasuredData__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2398:2: rule__MeasuredData__Group__2__Impl rule__MeasuredData__Group__3
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group__2__Impl_in_rule__MeasuredData__Group__24865);
            rule__MeasuredData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasuredData__Group__3_in_rule__MeasuredData__Group__24868);
            rule__MeasuredData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__2"


    // $ANTLR start "rule__MeasuredData__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2405:1: rule__MeasuredData__Group__2__Impl : ( ( rule__MeasuredData__NameAssignment_2 ) ) ;
    public final void rule__MeasuredData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2409:1: ( ( ( rule__MeasuredData__NameAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2410:1: ( ( rule__MeasuredData__NameAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2410:1: ( ( rule__MeasuredData__NameAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2411:1: ( rule__MeasuredData__NameAssignment_2 )
            {
             before(grammarAccess.getMeasuredDataAccess().getNameAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2412:1: ( rule__MeasuredData__NameAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2412:2: rule__MeasuredData__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MeasuredData__NameAssignment_2_in_rule__MeasuredData__Group__2__Impl4895);
            rule__MeasuredData__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasuredDataAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__2__Impl"


    // $ANTLR start "rule__MeasuredData__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2422:1: rule__MeasuredData__Group__3 : rule__MeasuredData__Group__3__Impl rule__MeasuredData__Group__4 ;
    public final void rule__MeasuredData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2426:1: ( rule__MeasuredData__Group__3__Impl rule__MeasuredData__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2427:2: rule__MeasuredData__Group__3__Impl rule__MeasuredData__Group__4
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group__3__Impl_in_rule__MeasuredData__Group__34925);
            rule__MeasuredData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasuredData__Group__4_in_rule__MeasuredData__Group__34928);
            rule__MeasuredData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__3"


    // $ANTLR start "rule__MeasuredData__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2434:1: rule__MeasuredData__Group__3__Impl : ( ( rule__MeasuredData__Group_3__0 )? ) ;
    public final void rule__MeasuredData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2438:1: ( ( ( rule__MeasuredData__Group_3__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2439:1: ( ( rule__MeasuredData__Group_3__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2439:1: ( ( rule__MeasuredData__Group_3__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2440:1: ( rule__MeasuredData__Group_3__0 )?
            {
             before(grammarAccess.getMeasuredDataAccess().getGroup_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2441:1: ( rule__MeasuredData__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==45) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2441:2: rule__MeasuredData__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__MeasuredData__Group_3__0_in_rule__MeasuredData__Group__3__Impl4955);
                    rule__MeasuredData__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasuredDataAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__3__Impl"


    // $ANTLR start "rule__MeasuredData__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2451:1: rule__MeasuredData__Group__4 : rule__MeasuredData__Group__4__Impl rule__MeasuredData__Group__5 ;
    public final void rule__MeasuredData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2455:1: ( rule__MeasuredData__Group__4__Impl rule__MeasuredData__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2456:2: rule__MeasuredData__Group__4__Impl rule__MeasuredData__Group__5
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group__4__Impl_in_rule__MeasuredData__Group__44986);
            rule__MeasuredData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasuredData__Group__5_in_rule__MeasuredData__Group__44989);
            rule__MeasuredData__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__4"


    // $ANTLR start "rule__MeasuredData__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2463:1: rule__MeasuredData__Group__4__Impl : ( 'as' ) ;
    public final void rule__MeasuredData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2467:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2468:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2468:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2469:1: 'as'
            {
             before(grammarAccess.getMeasuredDataAccess().getAsKeyword_4()); 
            match(input,50,FOLLOW_50_in_rule__MeasuredData__Group__4__Impl5017); 
             after(grammarAccess.getMeasuredDataAccess().getAsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__4__Impl"


    // $ANTLR start "rule__MeasuredData__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2482:1: rule__MeasuredData__Group__5 : rule__MeasuredData__Group__5__Impl rule__MeasuredData__Group__6 ;
    public final void rule__MeasuredData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2486:1: ( rule__MeasuredData__Group__5__Impl rule__MeasuredData__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2487:2: rule__MeasuredData__Group__5__Impl rule__MeasuredData__Group__6
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group__5__Impl_in_rule__MeasuredData__Group__55048);
            rule__MeasuredData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasuredData__Group__6_in_rule__MeasuredData__Group__55051);
            rule__MeasuredData__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__5"


    // $ANTLR start "rule__MeasuredData__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2494:1: rule__MeasuredData__Group__5__Impl : ( ( rule__MeasuredData__RepresentationAssignment_5 ) ) ;
    public final void rule__MeasuredData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2498:1: ( ( ( rule__MeasuredData__RepresentationAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2499:1: ( ( rule__MeasuredData__RepresentationAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2499:1: ( ( rule__MeasuredData__RepresentationAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2500:1: ( rule__MeasuredData__RepresentationAssignment_5 )
            {
             before(grammarAccess.getMeasuredDataAccess().getRepresentationAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2501:1: ( rule__MeasuredData__RepresentationAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2501:2: rule__MeasuredData__RepresentationAssignment_5
            {
            pushFollow(FOLLOW_rule__MeasuredData__RepresentationAssignment_5_in_rule__MeasuredData__Group__5__Impl5078);
            rule__MeasuredData__RepresentationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMeasuredDataAccess().getRepresentationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__5__Impl"


    // $ANTLR start "rule__MeasuredData__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2511:1: rule__MeasuredData__Group__6 : rule__MeasuredData__Group__6__Impl rule__MeasuredData__Group__7 ;
    public final void rule__MeasuredData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2515:1: ( rule__MeasuredData__Group__6__Impl rule__MeasuredData__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2516:2: rule__MeasuredData__Group__6__Impl rule__MeasuredData__Group__7
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group__6__Impl_in_rule__MeasuredData__Group__65108);
            rule__MeasuredData__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasuredData__Group__7_in_rule__MeasuredData__Group__65111);
            rule__MeasuredData__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__6"


    // $ANTLR start "rule__MeasuredData__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2523:1: rule__MeasuredData__Group__6__Impl : ( ( rule__MeasuredData__Group_6__0 )? ) ;
    public final void rule__MeasuredData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2527:1: ( ( ( rule__MeasuredData__Group_6__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2528:1: ( ( rule__MeasuredData__Group_6__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2528:1: ( ( rule__MeasuredData__Group_6__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2529:1: ( rule__MeasuredData__Group_6__0 )?
            {
             before(grammarAccess.getMeasuredDataAccess().getGroup_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2530:1: ( rule__MeasuredData__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==40) ) {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3==RULE_STRING) ) {
                        alt16=1;
                    }
                }
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2530:2: rule__MeasuredData__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__MeasuredData__Group_6__0_in_rule__MeasuredData__Group__6__Impl5138);
                    rule__MeasuredData__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasuredDataAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__6__Impl"


    // $ANTLR start "rule__MeasuredData__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2540:1: rule__MeasuredData__Group__7 : rule__MeasuredData__Group__7__Impl rule__MeasuredData__Group__8 ;
    public final void rule__MeasuredData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2544:1: ( rule__MeasuredData__Group__7__Impl rule__MeasuredData__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2545:2: rule__MeasuredData__Group__7__Impl rule__MeasuredData__Group__8
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group__7__Impl_in_rule__MeasuredData__Group__75169);
            rule__MeasuredData__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasuredData__Group__8_in_rule__MeasuredData__Group__75172);
            rule__MeasuredData__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__7"


    // $ANTLR start "rule__MeasuredData__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2552:1: rule__MeasuredData__Group__7__Impl : ( ( rule__MeasuredData__Group_7__0 )? ) ;
    public final void rule__MeasuredData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2556:1: ( ( ( rule__MeasuredData__Group_7__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2557:1: ( ( rule__MeasuredData__Group_7__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2557:1: ( ( rule__MeasuredData__Group_7__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2558:1: ( rule__MeasuredData__Group_7__0 )?
            {
             before(grammarAccess.getMeasuredDataAccess().getGroup_7()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2559:1: ( rule__MeasuredData__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==40) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==RULE_STRING) ) {
                        alt17=1;
                    }
                }
            }
            switch (alt17) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2559:2: rule__MeasuredData__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__MeasuredData__Group_7__0_in_rule__MeasuredData__Group__7__Impl5199);
                    rule__MeasuredData__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasuredDataAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__7__Impl"


    // $ANTLR start "rule__MeasuredData__Group__8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2569:1: rule__MeasuredData__Group__8 : rule__MeasuredData__Group__8__Impl ;
    public final void rule__MeasuredData__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2573:1: ( rule__MeasuredData__Group__8__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2574:2: rule__MeasuredData__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group__8__Impl_in_rule__MeasuredData__Group__85230);
            rule__MeasuredData__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__8"


    // $ANTLR start "rule__MeasuredData__Group__8__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2580:1: rule__MeasuredData__Group__8__Impl : ( ( rule__MeasuredData__ConstraintsAssignment_8 )* ) ;
    public final void rule__MeasuredData__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2584:1: ( ( ( rule__MeasuredData__ConstraintsAssignment_8 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2585:1: ( ( rule__MeasuredData__ConstraintsAssignment_8 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2585:1: ( ( rule__MeasuredData__ConstraintsAssignment_8 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2586:1: ( rule__MeasuredData__ConstraintsAssignment_8 )*
            {
             before(grammarAccess.getMeasuredDataAccess().getConstraintsAssignment_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2587:1: ( rule__MeasuredData__ConstraintsAssignment_8 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==54||LA18_0==58) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2587:2: rule__MeasuredData__ConstraintsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__MeasuredData__ConstraintsAssignment_8_in_rule__MeasuredData__Group__8__Impl5257);
            	    rule__MeasuredData__ConstraintsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMeasuredDataAccess().getConstraintsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group__8__Impl"


    // $ANTLR start "rule__MeasuredData__Group_3__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2615:1: rule__MeasuredData__Group_3__0 : rule__MeasuredData__Group_3__0__Impl rule__MeasuredData__Group_3__1 ;
    public final void rule__MeasuredData__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2619:1: ( rule__MeasuredData__Group_3__0__Impl rule__MeasuredData__Group_3__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2620:2: rule__MeasuredData__Group_3__0__Impl rule__MeasuredData__Group_3__1
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group_3__0__Impl_in_rule__MeasuredData__Group_3__05306);
            rule__MeasuredData__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasuredData__Group_3__1_in_rule__MeasuredData__Group_3__05309);
            rule__MeasuredData__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_3__0"


    // $ANTLR start "rule__MeasuredData__Group_3__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2627:1: rule__MeasuredData__Group_3__0__Impl : ( 'in' ) ;
    public final void rule__MeasuredData__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2631:1: ( ( 'in' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2632:1: ( 'in' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2632:1: ( 'in' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2633:1: 'in'
            {
             before(grammarAccess.getMeasuredDataAccess().getInKeyword_3_0()); 
            match(input,45,FOLLOW_45_in_rule__MeasuredData__Group_3__0__Impl5337); 
             after(grammarAccess.getMeasuredDataAccess().getInKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_3__0__Impl"


    // $ANTLR start "rule__MeasuredData__Group_3__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2646:1: rule__MeasuredData__Group_3__1 : rule__MeasuredData__Group_3__1__Impl rule__MeasuredData__Group_3__2 ;
    public final void rule__MeasuredData__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2650:1: ( rule__MeasuredData__Group_3__1__Impl rule__MeasuredData__Group_3__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2651:2: rule__MeasuredData__Group_3__1__Impl rule__MeasuredData__Group_3__2
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group_3__1__Impl_in_rule__MeasuredData__Group_3__15368);
            rule__MeasuredData__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasuredData__Group_3__2_in_rule__MeasuredData__Group_3__15371);
            rule__MeasuredData__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_3__1"


    // $ANTLR start "rule__MeasuredData__Group_3__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2658:1: rule__MeasuredData__Group_3__1__Impl : ( ( rule__MeasuredData__ScaleAssignment_3_1 )? ) ;
    public final void rule__MeasuredData__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2662:1: ( ( ( rule__MeasuredData__ScaleAssignment_3_1 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2663:1: ( ( rule__MeasuredData__ScaleAssignment_3_1 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2663:1: ( ( rule__MeasuredData__ScaleAssignment_3_1 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2664:1: ( rule__MeasuredData__ScaleAssignment_3_1 )?
            {
             before(grammarAccess.getMeasuredDataAccess().getScaleAssignment_3_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2665:1: ( rule__MeasuredData__ScaleAssignment_3_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2665:2: rule__MeasuredData__ScaleAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__MeasuredData__ScaleAssignment_3_1_in_rule__MeasuredData__Group_3__1__Impl5398);
                    rule__MeasuredData__ScaleAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasuredDataAccess().getScaleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_3__1__Impl"


    // $ANTLR start "rule__MeasuredData__Group_3__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2675:1: rule__MeasuredData__Group_3__2 : rule__MeasuredData__Group_3__2__Impl ;
    public final void rule__MeasuredData__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2679:1: ( rule__MeasuredData__Group_3__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2680:2: rule__MeasuredData__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group_3__2__Impl_in_rule__MeasuredData__Group_3__25429);
            rule__MeasuredData__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_3__2"


    // $ANTLR start "rule__MeasuredData__Group_3__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2686:1: rule__MeasuredData__Group_3__2__Impl : ( ( rule__MeasuredData__UnitAssignment_3_2 ) ) ;
    public final void rule__MeasuredData__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2690:1: ( ( ( rule__MeasuredData__UnitAssignment_3_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2691:1: ( ( rule__MeasuredData__UnitAssignment_3_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2691:1: ( ( rule__MeasuredData__UnitAssignment_3_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2692:1: ( rule__MeasuredData__UnitAssignment_3_2 )
            {
             before(grammarAccess.getMeasuredDataAccess().getUnitAssignment_3_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2693:1: ( rule__MeasuredData__UnitAssignment_3_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2693:2: rule__MeasuredData__UnitAssignment_3_2
            {
            pushFollow(FOLLOW_rule__MeasuredData__UnitAssignment_3_2_in_rule__MeasuredData__Group_3__2__Impl5456);
            rule__MeasuredData__UnitAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasuredDataAccess().getUnitAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_3__2__Impl"


    // $ANTLR start "rule__MeasuredData__Group_6__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2709:1: rule__MeasuredData__Group_6__0 : rule__MeasuredData__Group_6__0__Impl rule__MeasuredData__Group_6__1 ;
    public final void rule__MeasuredData__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2713:1: ( rule__MeasuredData__Group_6__0__Impl rule__MeasuredData__Group_6__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2714:2: rule__MeasuredData__Group_6__0__Impl rule__MeasuredData__Group_6__1
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group_6__0__Impl_in_rule__MeasuredData__Group_6__05492);
            rule__MeasuredData__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasuredData__Group_6__1_in_rule__MeasuredData__Group_6__05495);
            rule__MeasuredData__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_6__0"


    // $ANTLR start "rule__MeasuredData__Group_6__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2721:1: rule__MeasuredData__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__MeasuredData__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2725:1: ( ( 'description' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2726:1: ( 'description' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2726:1: ( 'description' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2727:1: 'description'
            {
             before(grammarAccess.getMeasuredDataAccess().getDescriptionKeyword_6_0()); 
            match(input,46,FOLLOW_46_in_rule__MeasuredData__Group_6__0__Impl5523); 
             after(grammarAccess.getMeasuredDataAccess().getDescriptionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_6__0__Impl"


    // $ANTLR start "rule__MeasuredData__Group_6__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2740:1: rule__MeasuredData__Group_6__1 : rule__MeasuredData__Group_6__1__Impl rule__MeasuredData__Group_6__2 ;
    public final void rule__MeasuredData__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2744:1: ( rule__MeasuredData__Group_6__1__Impl rule__MeasuredData__Group_6__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2745:2: rule__MeasuredData__Group_6__1__Impl rule__MeasuredData__Group_6__2
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group_6__1__Impl_in_rule__MeasuredData__Group_6__15554);
            rule__MeasuredData__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasuredData__Group_6__2_in_rule__MeasuredData__Group_6__15557);
            rule__MeasuredData__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_6__1"


    // $ANTLR start "rule__MeasuredData__Group_6__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2752:1: rule__MeasuredData__Group_6__1__Impl : ( ':' ) ;
    public final void rule__MeasuredData__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2756:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2757:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2757:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2758:1: ':'
            {
             before(grammarAccess.getMeasuredDataAccess().getColonKeyword_6_1()); 
            match(input,40,FOLLOW_40_in_rule__MeasuredData__Group_6__1__Impl5585); 
             after(grammarAccess.getMeasuredDataAccess().getColonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_6__1__Impl"


    // $ANTLR start "rule__MeasuredData__Group_6__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2771:1: rule__MeasuredData__Group_6__2 : rule__MeasuredData__Group_6__2__Impl ;
    public final void rule__MeasuredData__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2775:1: ( rule__MeasuredData__Group_6__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2776:2: rule__MeasuredData__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group_6__2__Impl_in_rule__MeasuredData__Group_6__25616);
            rule__MeasuredData__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_6__2"


    // $ANTLR start "rule__MeasuredData__Group_6__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2782:1: rule__MeasuredData__Group_6__2__Impl : ( ( rule__MeasuredData__DescriptionAssignment_6_2 ) ) ;
    public final void rule__MeasuredData__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2786:1: ( ( ( rule__MeasuredData__DescriptionAssignment_6_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2787:1: ( ( rule__MeasuredData__DescriptionAssignment_6_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2787:1: ( ( rule__MeasuredData__DescriptionAssignment_6_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2788:1: ( rule__MeasuredData__DescriptionAssignment_6_2 )
            {
             before(grammarAccess.getMeasuredDataAccess().getDescriptionAssignment_6_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2789:1: ( rule__MeasuredData__DescriptionAssignment_6_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2789:2: rule__MeasuredData__DescriptionAssignment_6_2
            {
            pushFollow(FOLLOW_rule__MeasuredData__DescriptionAssignment_6_2_in_rule__MeasuredData__Group_6__2__Impl5643);
            rule__MeasuredData__DescriptionAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasuredDataAccess().getDescriptionAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_6__2__Impl"


    // $ANTLR start "rule__MeasuredData__Group_7__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2805:1: rule__MeasuredData__Group_7__0 : rule__MeasuredData__Group_7__0__Impl rule__MeasuredData__Group_7__1 ;
    public final void rule__MeasuredData__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2809:1: ( rule__MeasuredData__Group_7__0__Impl rule__MeasuredData__Group_7__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2810:2: rule__MeasuredData__Group_7__0__Impl rule__MeasuredData__Group_7__1
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group_7__0__Impl_in_rule__MeasuredData__Group_7__05679);
            rule__MeasuredData__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasuredData__Group_7__1_in_rule__MeasuredData__Group_7__05682);
            rule__MeasuredData__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_7__0"


    // $ANTLR start "rule__MeasuredData__Group_7__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2817:1: rule__MeasuredData__Group_7__0__Impl : ( 'id' ) ;
    public final void rule__MeasuredData__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2821:1: ( ( 'id' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2822:1: ( 'id' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2822:1: ( 'id' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2823:1: 'id'
            {
             before(grammarAccess.getMeasuredDataAccess().getIdKeyword_7_0()); 
            match(input,47,FOLLOW_47_in_rule__MeasuredData__Group_7__0__Impl5710); 
             after(grammarAccess.getMeasuredDataAccess().getIdKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_7__0__Impl"


    // $ANTLR start "rule__MeasuredData__Group_7__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2836:1: rule__MeasuredData__Group_7__1 : rule__MeasuredData__Group_7__1__Impl rule__MeasuredData__Group_7__2 ;
    public final void rule__MeasuredData__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2840:1: ( rule__MeasuredData__Group_7__1__Impl rule__MeasuredData__Group_7__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2841:2: rule__MeasuredData__Group_7__1__Impl rule__MeasuredData__Group_7__2
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group_7__1__Impl_in_rule__MeasuredData__Group_7__15741);
            rule__MeasuredData__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasuredData__Group_7__2_in_rule__MeasuredData__Group_7__15744);
            rule__MeasuredData__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_7__1"


    // $ANTLR start "rule__MeasuredData__Group_7__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2848:1: rule__MeasuredData__Group_7__1__Impl : ( ':' ) ;
    public final void rule__MeasuredData__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2852:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2853:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2853:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2854:1: ':'
            {
             before(grammarAccess.getMeasuredDataAccess().getColonKeyword_7_1()); 
            match(input,40,FOLLOW_40_in_rule__MeasuredData__Group_7__1__Impl5772); 
             after(grammarAccess.getMeasuredDataAccess().getColonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_7__1__Impl"


    // $ANTLR start "rule__MeasuredData__Group_7__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2867:1: rule__MeasuredData__Group_7__2 : rule__MeasuredData__Group_7__2__Impl ;
    public final void rule__MeasuredData__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2871:1: ( rule__MeasuredData__Group_7__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2872:2: rule__MeasuredData__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__MeasuredData__Group_7__2__Impl_in_rule__MeasuredData__Group_7__25803);
            rule__MeasuredData__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_7__2"


    // $ANTLR start "rule__MeasuredData__Group_7__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2878:1: rule__MeasuredData__Group_7__2__Impl : ( ( rule__MeasuredData__IDAssignment_7_2 ) ) ;
    public final void rule__MeasuredData__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2882:1: ( ( ( rule__MeasuredData__IDAssignment_7_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2883:1: ( ( rule__MeasuredData__IDAssignment_7_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2883:1: ( ( rule__MeasuredData__IDAssignment_7_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2884:1: ( rule__MeasuredData__IDAssignment_7_2 )
            {
             before(grammarAccess.getMeasuredDataAccess().getIDAssignment_7_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2885:1: ( rule__MeasuredData__IDAssignment_7_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2885:2: rule__MeasuredData__IDAssignment_7_2
            {
            pushFollow(FOLLOW_rule__MeasuredData__IDAssignment_7_2_in_rule__MeasuredData__Group_7__2__Impl5830);
            rule__MeasuredData__IDAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasuredDataAccess().getIDAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__Group_7__2__Impl"


    // $ANTLR start "rule__NonMeasuredData__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2901:1: rule__NonMeasuredData__Group__0 : rule__NonMeasuredData__Group__0__Impl rule__NonMeasuredData__Group__1 ;
    public final void rule__NonMeasuredData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2905:1: ( rule__NonMeasuredData__Group__0__Impl rule__NonMeasuredData__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2906:2: rule__NonMeasuredData__Group__0__Impl rule__NonMeasuredData__Group__1
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__Group__0__Impl_in_rule__NonMeasuredData__Group__05866);
            rule__NonMeasuredData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasuredData__Group__1_in_rule__NonMeasuredData__Group__05869);
            rule__NonMeasuredData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group__0"


    // $ANTLR start "rule__NonMeasuredData__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2913:1: rule__NonMeasuredData__Group__0__Impl : ( 'basicdata' ) ;
    public final void rule__NonMeasuredData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2917:1: ( ( 'basicdata' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2918:1: ( 'basicdata' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2918:1: ( 'basicdata' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2919:1: 'basicdata'
            {
             before(grammarAccess.getNonMeasuredDataAccess().getBasicdataKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__NonMeasuredData__Group__0__Impl5897); 
             after(grammarAccess.getNonMeasuredDataAccess().getBasicdataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group__0__Impl"


    // $ANTLR start "rule__NonMeasuredData__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2932:1: rule__NonMeasuredData__Group__1 : rule__NonMeasuredData__Group__1__Impl rule__NonMeasuredData__Group__2 ;
    public final void rule__NonMeasuredData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2936:1: ( rule__NonMeasuredData__Group__1__Impl rule__NonMeasuredData__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2937:2: rule__NonMeasuredData__Group__1__Impl rule__NonMeasuredData__Group__2
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__Group__1__Impl_in_rule__NonMeasuredData__Group__15928);
            rule__NonMeasuredData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasuredData__Group__2_in_rule__NonMeasuredData__Group__15931);
            rule__NonMeasuredData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group__1"


    // $ANTLR start "rule__NonMeasuredData__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2944:1: rule__NonMeasuredData__Group__1__Impl : ( ( rule__NonMeasuredData__TypeAssignment_1 ) ) ;
    public final void rule__NonMeasuredData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2948:1: ( ( ( rule__NonMeasuredData__TypeAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2949:1: ( ( rule__NonMeasuredData__TypeAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2949:1: ( ( rule__NonMeasuredData__TypeAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2950:1: ( rule__NonMeasuredData__TypeAssignment_1 )
            {
             before(grammarAccess.getNonMeasuredDataAccess().getTypeAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2951:1: ( rule__NonMeasuredData__TypeAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2951:2: rule__NonMeasuredData__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__TypeAssignment_1_in_rule__NonMeasuredData__Group__1__Impl5958);
            rule__NonMeasuredData__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasuredDataAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group__1__Impl"


    // $ANTLR start "rule__NonMeasuredData__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2961:1: rule__NonMeasuredData__Group__2 : rule__NonMeasuredData__Group__2__Impl rule__NonMeasuredData__Group__3 ;
    public final void rule__NonMeasuredData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2965:1: ( rule__NonMeasuredData__Group__2__Impl rule__NonMeasuredData__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2966:2: rule__NonMeasuredData__Group__2__Impl rule__NonMeasuredData__Group__3
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__Group__2__Impl_in_rule__NonMeasuredData__Group__25988);
            rule__NonMeasuredData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasuredData__Group__3_in_rule__NonMeasuredData__Group__25991);
            rule__NonMeasuredData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group__2"


    // $ANTLR start "rule__NonMeasuredData__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2973:1: rule__NonMeasuredData__Group__2__Impl : ( ( rule__NonMeasuredData__NameAssignment_2 ) ) ;
    public final void rule__NonMeasuredData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2977:1: ( ( ( rule__NonMeasuredData__NameAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2978:1: ( ( rule__NonMeasuredData__NameAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2978:1: ( ( rule__NonMeasuredData__NameAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2979:1: ( rule__NonMeasuredData__NameAssignment_2 )
            {
             before(grammarAccess.getNonMeasuredDataAccess().getNameAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2980:1: ( rule__NonMeasuredData__NameAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2980:2: rule__NonMeasuredData__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__NameAssignment_2_in_rule__NonMeasuredData__Group__2__Impl6018);
            rule__NonMeasuredData__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasuredDataAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group__2__Impl"


    // $ANTLR start "rule__NonMeasuredData__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2990:1: rule__NonMeasuredData__Group__3 : rule__NonMeasuredData__Group__3__Impl rule__NonMeasuredData__Group__4 ;
    public final void rule__NonMeasuredData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2994:1: ( rule__NonMeasuredData__Group__3__Impl rule__NonMeasuredData__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2995:2: rule__NonMeasuredData__Group__3__Impl rule__NonMeasuredData__Group__4
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__Group__3__Impl_in_rule__NonMeasuredData__Group__36048);
            rule__NonMeasuredData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasuredData__Group__4_in_rule__NonMeasuredData__Group__36051);
            rule__NonMeasuredData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group__3"


    // $ANTLR start "rule__NonMeasuredData__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3002:1: rule__NonMeasuredData__Group__3__Impl : ( 'as' ) ;
    public final void rule__NonMeasuredData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3006:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3007:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3007:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3008:1: 'as'
            {
             before(grammarAccess.getNonMeasuredDataAccess().getAsKeyword_3()); 
            match(input,50,FOLLOW_50_in_rule__NonMeasuredData__Group__3__Impl6079); 
             after(grammarAccess.getNonMeasuredDataAccess().getAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group__3__Impl"


    // $ANTLR start "rule__NonMeasuredData__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3021:1: rule__NonMeasuredData__Group__4 : rule__NonMeasuredData__Group__4__Impl rule__NonMeasuredData__Group__5 ;
    public final void rule__NonMeasuredData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3025:1: ( rule__NonMeasuredData__Group__4__Impl rule__NonMeasuredData__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3026:2: rule__NonMeasuredData__Group__4__Impl rule__NonMeasuredData__Group__5
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__Group__4__Impl_in_rule__NonMeasuredData__Group__46110);
            rule__NonMeasuredData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasuredData__Group__5_in_rule__NonMeasuredData__Group__46113);
            rule__NonMeasuredData__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group__4"


    // $ANTLR start "rule__NonMeasuredData__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3033:1: rule__NonMeasuredData__Group__4__Impl : ( ( rule__NonMeasuredData__RepresentationAssignment_4 ) ) ;
    public final void rule__NonMeasuredData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3037:1: ( ( ( rule__NonMeasuredData__RepresentationAssignment_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3038:1: ( ( rule__NonMeasuredData__RepresentationAssignment_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3038:1: ( ( rule__NonMeasuredData__RepresentationAssignment_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3039:1: ( rule__NonMeasuredData__RepresentationAssignment_4 )
            {
             before(grammarAccess.getNonMeasuredDataAccess().getRepresentationAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3040:1: ( rule__NonMeasuredData__RepresentationAssignment_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3040:2: rule__NonMeasuredData__RepresentationAssignment_4
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__RepresentationAssignment_4_in_rule__NonMeasuredData__Group__4__Impl6140);
            rule__NonMeasuredData__RepresentationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasuredDataAccess().getRepresentationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group__4__Impl"


    // $ANTLR start "rule__NonMeasuredData__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3050:1: rule__NonMeasuredData__Group__5 : rule__NonMeasuredData__Group__5__Impl rule__NonMeasuredData__Group__6 ;
    public final void rule__NonMeasuredData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3054:1: ( rule__NonMeasuredData__Group__5__Impl rule__NonMeasuredData__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3055:2: rule__NonMeasuredData__Group__5__Impl rule__NonMeasuredData__Group__6
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__Group__5__Impl_in_rule__NonMeasuredData__Group__56170);
            rule__NonMeasuredData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasuredData__Group__6_in_rule__NonMeasuredData__Group__56173);
            rule__NonMeasuredData__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group__5"


    // $ANTLR start "rule__NonMeasuredData__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3062:1: rule__NonMeasuredData__Group__5__Impl : ( ( rule__NonMeasuredData__Group_5__0 )? ) ;
    public final void rule__NonMeasuredData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3066:1: ( ( ( rule__NonMeasuredData__Group_5__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3067:1: ( ( rule__NonMeasuredData__Group_5__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3067:1: ( ( rule__NonMeasuredData__Group_5__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3068:1: ( rule__NonMeasuredData__Group_5__0 )?
            {
             before(grammarAccess.getNonMeasuredDataAccess().getGroup_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3069:1: ( rule__NonMeasuredData__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==40) ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3==RULE_STRING) ) {
                        alt20=1;
                    }
                }
            }
            switch (alt20) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3069:2: rule__NonMeasuredData__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__NonMeasuredData__Group_5__0_in_rule__NonMeasuredData__Group__5__Impl6200);
                    rule__NonMeasuredData__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasuredDataAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group__5__Impl"


    // $ANTLR start "rule__NonMeasuredData__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3079:1: rule__NonMeasuredData__Group__6 : rule__NonMeasuredData__Group__6__Impl ;
    public final void rule__NonMeasuredData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3083:1: ( rule__NonMeasuredData__Group__6__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3084:2: rule__NonMeasuredData__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__Group__6__Impl_in_rule__NonMeasuredData__Group__66231);
            rule__NonMeasuredData__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group__6"


    // $ANTLR start "rule__NonMeasuredData__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3090:1: rule__NonMeasuredData__Group__6__Impl : ( ( rule__NonMeasuredData__Group_6__0 )? ) ;
    public final void rule__NonMeasuredData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3094:1: ( ( ( rule__NonMeasuredData__Group_6__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3095:1: ( ( rule__NonMeasuredData__Group_6__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3095:1: ( ( rule__NonMeasuredData__Group_6__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3096:1: ( rule__NonMeasuredData__Group_6__0 )?
            {
             before(grammarAccess.getNonMeasuredDataAccess().getGroup_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3097:1: ( rule__NonMeasuredData__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==40) ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3==RULE_STRING) ) {
                        alt21=1;
                    }
                }
            }
            switch (alt21) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3097:2: rule__NonMeasuredData__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__NonMeasuredData__Group_6__0_in_rule__NonMeasuredData__Group__6__Impl6258);
                    rule__NonMeasuredData__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasuredDataAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group__6__Impl"


    // $ANTLR start "rule__NonMeasuredData__Group_5__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3121:1: rule__NonMeasuredData__Group_5__0 : rule__NonMeasuredData__Group_5__0__Impl rule__NonMeasuredData__Group_5__1 ;
    public final void rule__NonMeasuredData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3125:1: ( rule__NonMeasuredData__Group_5__0__Impl rule__NonMeasuredData__Group_5__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3126:2: rule__NonMeasuredData__Group_5__0__Impl rule__NonMeasuredData__Group_5__1
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__Group_5__0__Impl_in_rule__NonMeasuredData__Group_5__06303);
            rule__NonMeasuredData__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasuredData__Group_5__1_in_rule__NonMeasuredData__Group_5__06306);
            rule__NonMeasuredData__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group_5__0"


    // $ANTLR start "rule__NonMeasuredData__Group_5__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3133:1: rule__NonMeasuredData__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__NonMeasuredData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3137:1: ( ( 'description' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3138:1: ( 'description' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3138:1: ( 'description' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3139:1: 'description'
            {
             before(grammarAccess.getNonMeasuredDataAccess().getDescriptionKeyword_5_0()); 
            match(input,46,FOLLOW_46_in_rule__NonMeasuredData__Group_5__0__Impl6334); 
             after(grammarAccess.getNonMeasuredDataAccess().getDescriptionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group_5__0__Impl"


    // $ANTLR start "rule__NonMeasuredData__Group_5__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3152:1: rule__NonMeasuredData__Group_5__1 : rule__NonMeasuredData__Group_5__1__Impl rule__NonMeasuredData__Group_5__2 ;
    public final void rule__NonMeasuredData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3156:1: ( rule__NonMeasuredData__Group_5__1__Impl rule__NonMeasuredData__Group_5__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3157:2: rule__NonMeasuredData__Group_5__1__Impl rule__NonMeasuredData__Group_5__2
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__Group_5__1__Impl_in_rule__NonMeasuredData__Group_5__16365);
            rule__NonMeasuredData__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasuredData__Group_5__2_in_rule__NonMeasuredData__Group_5__16368);
            rule__NonMeasuredData__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group_5__1"


    // $ANTLR start "rule__NonMeasuredData__Group_5__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3164:1: rule__NonMeasuredData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__NonMeasuredData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3168:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3169:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3169:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3170:1: ':'
            {
             before(grammarAccess.getNonMeasuredDataAccess().getColonKeyword_5_1()); 
            match(input,40,FOLLOW_40_in_rule__NonMeasuredData__Group_5__1__Impl6396); 
             after(grammarAccess.getNonMeasuredDataAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group_5__1__Impl"


    // $ANTLR start "rule__NonMeasuredData__Group_5__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3183:1: rule__NonMeasuredData__Group_5__2 : rule__NonMeasuredData__Group_5__2__Impl ;
    public final void rule__NonMeasuredData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3187:1: ( rule__NonMeasuredData__Group_5__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3188:2: rule__NonMeasuredData__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__Group_5__2__Impl_in_rule__NonMeasuredData__Group_5__26427);
            rule__NonMeasuredData__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group_5__2"


    // $ANTLR start "rule__NonMeasuredData__Group_5__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3194:1: rule__NonMeasuredData__Group_5__2__Impl : ( ( rule__NonMeasuredData__DescriptionAssignment_5_2 ) ) ;
    public final void rule__NonMeasuredData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3198:1: ( ( ( rule__NonMeasuredData__DescriptionAssignment_5_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3199:1: ( ( rule__NonMeasuredData__DescriptionAssignment_5_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3199:1: ( ( rule__NonMeasuredData__DescriptionAssignment_5_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3200:1: ( rule__NonMeasuredData__DescriptionAssignment_5_2 )
            {
             before(grammarAccess.getNonMeasuredDataAccess().getDescriptionAssignment_5_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3201:1: ( rule__NonMeasuredData__DescriptionAssignment_5_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3201:2: rule__NonMeasuredData__DescriptionAssignment_5_2
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__DescriptionAssignment_5_2_in_rule__NonMeasuredData__Group_5__2__Impl6454);
            rule__NonMeasuredData__DescriptionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasuredDataAccess().getDescriptionAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group_5__2__Impl"


    // $ANTLR start "rule__NonMeasuredData__Group_6__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3217:1: rule__NonMeasuredData__Group_6__0 : rule__NonMeasuredData__Group_6__0__Impl rule__NonMeasuredData__Group_6__1 ;
    public final void rule__NonMeasuredData__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3221:1: ( rule__NonMeasuredData__Group_6__0__Impl rule__NonMeasuredData__Group_6__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3222:2: rule__NonMeasuredData__Group_6__0__Impl rule__NonMeasuredData__Group_6__1
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__Group_6__0__Impl_in_rule__NonMeasuredData__Group_6__06490);
            rule__NonMeasuredData__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasuredData__Group_6__1_in_rule__NonMeasuredData__Group_6__06493);
            rule__NonMeasuredData__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group_6__0"


    // $ANTLR start "rule__NonMeasuredData__Group_6__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3229:1: rule__NonMeasuredData__Group_6__0__Impl : ( 'id' ) ;
    public final void rule__NonMeasuredData__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3233:1: ( ( 'id' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3234:1: ( 'id' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3234:1: ( 'id' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3235:1: 'id'
            {
             before(grammarAccess.getNonMeasuredDataAccess().getIdKeyword_6_0()); 
            match(input,47,FOLLOW_47_in_rule__NonMeasuredData__Group_6__0__Impl6521); 
             after(grammarAccess.getNonMeasuredDataAccess().getIdKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group_6__0__Impl"


    // $ANTLR start "rule__NonMeasuredData__Group_6__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3248:1: rule__NonMeasuredData__Group_6__1 : rule__NonMeasuredData__Group_6__1__Impl rule__NonMeasuredData__Group_6__2 ;
    public final void rule__NonMeasuredData__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3252:1: ( rule__NonMeasuredData__Group_6__1__Impl rule__NonMeasuredData__Group_6__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3253:2: rule__NonMeasuredData__Group_6__1__Impl rule__NonMeasuredData__Group_6__2
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__Group_6__1__Impl_in_rule__NonMeasuredData__Group_6__16552);
            rule__NonMeasuredData__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasuredData__Group_6__2_in_rule__NonMeasuredData__Group_6__16555);
            rule__NonMeasuredData__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group_6__1"


    // $ANTLR start "rule__NonMeasuredData__Group_6__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3260:1: rule__NonMeasuredData__Group_6__1__Impl : ( ':' ) ;
    public final void rule__NonMeasuredData__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3264:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3265:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3265:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3266:1: ':'
            {
             before(grammarAccess.getNonMeasuredDataAccess().getColonKeyword_6_1()); 
            match(input,40,FOLLOW_40_in_rule__NonMeasuredData__Group_6__1__Impl6583); 
             after(grammarAccess.getNonMeasuredDataAccess().getColonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group_6__1__Impl"


    // $ANTLR start "rule__NonMeasuredData__Group_6__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3279:1: rule__NonMeasuredData__Group_6__2 : rule__NonMeasuredData__Group_6__2__Impl ;
    public final void rule__NonMeasuredData__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3283:1: ( rule__NonMeasuredData__Group_6__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3284:2: rule__NonMeasuredData__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__Group_6__2__Impl_in_rule__NonMeasuredData__Group_6__26614);
            rule__NonMeasuredData__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group_6__2"


    // $ANTLR start "rule__NonMeasuredData__Group_6__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3290:1: rule__NonMeasuredData__Group_6__2__Impl : ( ( rule__NonMeasuredData__IDAssignment_6_2 ) ) ;
    public final void rule__NonMeasuredData__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3294:1: ( ( ( rule__NonMeasuredData__IDAssignment_6_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3295:1: ( ( rule__NonMeasuredData__IDAssignment_6_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3295:1: ( ( rule__NonMeasuredData__IDAssignment_6_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3296:1: ( rule__NonMeasuredData__IDAssignment_6_2 )
            {
             before(grammarAccess.getNonMeasuredDataAccess().getIDAssignment_6_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3297:1: ( rule__NonMeasuredData__IDAssignment_6_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3297:2: rule__NonMeasuredData__IDAssignment_6_2
            {
            pushFollow(FOLLOW_rule__NonMeasuredData__IDAssignment_6_2_in_rule__NonMeasuredData__Group_6__2__Impl6641);
            rule__NonMeasuredData__IDAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasuredDataAccess().getIDAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__Group_6__2__Impl"


    // $ANTLR start "rule__ConstantData__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3313:1: rule__ConstantData__Group__0 : rule__ConstantData__Group__0__Impl rule__ConstantData__Group__1 ;
    public final void rule__ConstantData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3317:1: ( rule__ConstantData__Group__0__Impl rule__ConstantData__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3318:2: rule__ConstantData__Group__0__Impl rule__ConstantData__Group__1
            {
            pushFollow(FOLLOW_rule__ConstantData__Group__0__Impl_in_rule__ConstantData__Group__06677);
            rule__ConstantData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantData__Group__1_in_rule__ConstantData__Group__06680);
            rule__ConstantData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group__0"


    // $ANTLR start "rule__ConstantData__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3325:1: rule__ConstantData__Group__0__Impl : ( 'const' ) ;
    public final void rule__ConstantData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3329:1: ( ( 'const' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3330:1: ( 'const' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3330:1: ( 'const' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3331:1: 'const'
            {
             before(grammarAccess.getConstantDataAccess().getConstKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__ConstantData__Group__0__Impl6708); 
             after(grammarAccess.getConstantDataAccess().getConstKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group__0__Impl"


    // $ANTLR start "rule__ConstantData__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3344:1: rule__ConstantData__Group__1 : rule__ConstantData__Group__1__Impl rule__ConstantData__Group__2 ;
    public final void rule__ConstantData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3348:1: ( rule__ConstantData__Group__1__Impl rule__ConstantData__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3349:2: rule__ConstantData__Group__1__Impl rule__ConstantData__Group__2
            {
            pushFollow(FOLLOW_rule__ConstantData__Group__1__Impl_in_rule__ConstantData__Group__16739);
            rule__ConstantData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantData__Group__2_in_rule__ConstantData__Group__16742);
            rule__ConstantData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group__1"


    // $ANTLR start "rule__ConstantData__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3356:1: rule__ConstantData__Group__1__Impl : ( ( rule__ConstantData__NameAssignment_1 ) ) ;
    public final void rule__ConstantData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3360:1: ( ( ( rule__ConstantData__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3361:1: ( ( rule__ConstantData__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3361:1: ( ( rule__ConstantData__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3362:1: ( rule__ConstantData__NameAssignment_1 )
            {
             before(grammarAccess.getConstantDataAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3363:1: ( rule__ConstantData__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3363:2: rule__ConstantData__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ConstantData__NameAssignment_1_in_rule__ConstantData__Group__1__Impl6769);
            rule__ConstantData__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantDataAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group__1__Impl"


    // $ANTLR start "rule__ConstantData__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3373:1: rule__ConstantData__Group__2 : rule__ConstantData__Group__2__Impl rule__ConstantData__Group__3 ;
    public final void rule__ConstantData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3377:1: ( rule__ConstantData__Group__2__Impl rule__ConstantData__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3378:2: rule__ConstantData__Group__2__Impl rule__ConstantData__Group__3
            {
            pushFollow(FOLLOW_rule__ConstantData__Group__2__Impl_in_rule__ConstantData__Group__26799);
            rule__ConstantData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantData__Group__3_in_rule__ConstantData__Group__26802);
            rule__ConstantData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group__2"


    // $ANTLR start "rule__ConstantData__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3385:1: rule__ConstantData__Group__2__Impl : ( 'as' ) ;
    public final void rule__ConstantData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3389:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3390:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3390:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3391:1: 'as'
            {
             before(grammarAccess.getConstantDataAccess().getAsKeyword_2()); 
            match(input,50,FOLLOW_50_in_rule__ConstantData__Group__2__Impl6830); 
             after(grammarAccess.getConstantDataAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group__2__Impl"


    // $ANTLR start "rule__ConstantData__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3404:1: rule__ConstantData__Group__3 : rule__ConstantData__Group__3__Impl rule__ConstantData__Group__4 ;
    public final void rule__ConstantData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3408:1: ( rule__ConstantData__Group__3__Impl rule__ConstantData__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3409:2: rule__ConstantData__Group__3__Impl rule__ConstantData__Group__4
            {
            pushFollow(FOLLOW_rule__ConstantData__Group__3__Impl_in_rule__ConstantData__Group__36861);
            rule__ConstantData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantData__Group__4_in_rule__ConstantData__Group__36864);
            rule__ConstantData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group__3"


    // $ANTLR start "rule__ConstantData__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3416:1: rule__ConstantData__Group__3__Impl : ( ( rule__ConstantData__RepresentationAssignment_3 ) ) ;
    public final void rule__ConstantData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3420:1: ( ( ( rule__ConstantData__RepresentationAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3421:1: ( ( rule__ConstantData__RepresentationAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3421:1: ( ( rule__ConstantData__RepresentationAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3422:1: ( rule__ConstantData__RepresentationAssignment_3 )
            {
             before(grammarAccess.getConstantDataAccess().getRepresentationAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3423:1: ( rule__ConstantData__RepresentationAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3423:2: rule__ConstantData__RepresentationAssignment_3
            {
            pushFollow(FOLLOW_rule__ConstantData__RepresentationAssignment_3_in_rule__ConstantData__Group__3__Impl6891);
            rule__ConstantData__RepresentationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstantDataAccess().getRepresentationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group__3__Impl"


    // $ANTLR start "rule__ConstantData__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3433:1: rule__ConstantData__Group__4 : rule__ConstantData__Group__4__Impl rule__ConstantData__Group__5 ;
    public final void rule__ConstantData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3437:1: ( rule__ConstantData__Group__4__Impl rule__ConstantData__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3438:2: rule__ConstantData__Group__4__Impl rule__ConstantData__Group__5
            {
            pushFollow(FOLLOW_rule__ConstantData__Group__4__Impl_in_rule__ConstantData__Group__46921);
            rule__ConstantData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantData__Group__5_in_rule__ConstantData__Group__46924);
            rule__ConstantData__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group__4"


    // $ANTLR start "rule__ConstantData__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3445:1: rule__ConstantData__Group__4__Impl : ( ( rule__ConstantData__Group_4__0 )? ) ;
    public final void rule__ConstantData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3449:1: ( ( ( rule__ConstantData__Group_4__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3450:1: ( ( rule__ConstantData__Group_4__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3450:1: ( ( rule__ConstantData__Group_4__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3451:1: ( rule__ConstantData__Group_4__0 )?
            {
             before(grammarAccess.getConstantDataAccess().getGroup_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3452:1: ( rule__ConstantData__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3452:2: rule__ConstantData__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ConstantData__Group_4__0_in_rule__ConstantData__Group__4__Impl6951);
                    rule__ConstantData__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantDataAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group__4__Impl"


    // $ANTLR start "rule__ConstantData__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3462:1: rule__ConstantData__Group__5 : rule__ConstantData__Group__5__Impl rule__ConstantData__Group__6 ;
    public final void rule__ConstantData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3466:1: ( rule__ConstantData__Group__5__Impl rule__ConstantData__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3467:2: rule__ConstantData__Group__5__Impl rule__ConstantData__Group__6
            {
            pushFollow(FOLLOW_rule__ConstantData__Group__5__Impl_in_rule__ConstantData__Group__56982);
            rule__ConstantData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantData__Group__6_in_rule__ConstantData__Group__56985);
            rule__ConstantData__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group__5"


    // $ANTLR start "rule__ConstantData__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3474:1: rule__ConstantData__Group__5__Impl : ( ( rule__ConstantData__Group_5__0 )? ) ;
    public final void rule__ConstantData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3478:1: ( ( ( rule__ConstantData__Group_5__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3479:1: ( ( rule__ConstantData__Group_5__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3479:1: ( ( rule__ConstantData__Group_5__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3480:1: ( rule__ConstantData__Group_5__0 )?
            {
             before(grammarAccess.getConstantDataAccess().getGroup_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3481:1: ( rule__ConstantData__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==40) ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3==RULE_STRING) ) {
                        alt23=1;
                    }
                }
            }
            switch (alt23) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3481:2: rule__ConstantData__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ConstantData__Group_5__0_in_rule__ConstantData__Group__5__Impl7012);
                    rule__ConstantData__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantDataAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group__5__Impl"


    // $ANTLR start "rule__ConstantData__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3491:1: rule__ConstantData__Group__6 : rule__ConstantData__Group__6__Impl ;
    public final void rule__ConstantData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3495:1: ( rule__ConstantData__Group__6__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3496:2: rule__ConstantData__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ConstantData__Group__6__Impl_in_rule__ConstantData__Group__67043);
            rule__ConstantData__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group__6"


    // $ANTLR start "rule__ConstantData__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3502:1: rule__ConstantData__Group__6__Impl : ( ( rule__ConstantData__Group_6__0 )? ) ;
    public final void rule__ConstantData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3506:1: ( ( ( rule__ConstantData__Group_6__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3507:1: ( ( rule__ConstantData__Group_6__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3507:1: ( ( rule__ConstantData__Group_6__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3508:1: ( rule__ConstantData__Group_6__0 )?
            {
             before(grammarAccess.getConstantDataAccess().getGroup_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3509:1: ( rule__ConstantData__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==47) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==40) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==RULE_STRING) ) {
                        alt24=1;
                    }
                }
            }
            switch (alt24) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3509:2: rule__ConstantData__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ConstantData__Group_6__0_in_rule__ConstantData__Group__6__Impl7070);
                    rule__ConstantData__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantDataAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group__6__Impl"


    // $ANTLR start "rule__ConstantData__Group_4__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3533:1: rule__ConstantData__Group_4__0 : rule__ConstantData__Group_4__0__Impl rule__ConstantData__Group_4__1 ;
    public final void rule__ConstantData__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3537:1: ( rule__ConstantData__Group_4__0__Impl rule__ConstantData__Group_4__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3538:2: rule__ConstantData__Group_4__0__Impl rule__ConstantData__Group_4__1
            {
            pushFollow(FOLLOW_rule__ConstantData__Group_4__0__Impl_in_rule__ConstantData__Group_4__07115);
            rule__ConstantData__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantData__Group_4__1_in_rule__ConstantData__Group_4__07118);
            rule__ConstantData__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_4__0"


    // $ANTLR start "rule__ConstantData__Group_4__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3545:1: rule__ConstantData__Group_4__0__Impl : ( 'is' ) ;
    public final void rule__ConstantData__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3549:1: ( ( 'is' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3550:1: ( 'is' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3550:1: ( 'is' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3551:1: 'is'
            {
             before(grammarAccess.getConstantDataAccess().getIsKeyword_4_0()); 
            match(input,44,FOLLOW_44_in_rule__ConstantData__Group_4__0__Impl7146); 
             after(grammarAccess.getConstantDataAccess().getIsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_4__0__Impl"


    // $ANTLR start "rule__ConstantData__Group_4__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3564:1: rule__ConstantData__Group_4__1 : rule__ConstantData__Group_4__1__Impl ;
    public final void rule__ConstantData__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3568:1: ( rule__ConstantData__Group_4__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3569:2: rule__ConstantData__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstantData__Group_4__1__Impl_in_rule__ConstantData__Group_4__17177);
            rule__ConstantData__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_4__1"


    // $ANTLR start "rule__ConstantData__Group_4__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3575:1: rule__ConstantData__Group_4__1__Impl : ( ( rule__ConstantData__ConstValueAssignment_4_1 ) ) ;
    public final void rule__ConstantData__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3579:1: ( ( ( rule__ConstantData__ConstValueAssignment_4_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3580:1: ( ( rule__ConstantData__ConstValueAssignment_4_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3580:1: ( ( rule__ConstantData__ConstValueAssignment_4_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3581:1: ( rule__ConstantData__ConstValueAssignment_4_1 )
            {
             before(grammarAccess.getConstantDataAccess().getConstValueAssignment_4_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3582:1: ( rule__ConstantData__ConstValueAssignment_4_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3582:2: rule__ConstantData__ConstValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ConstantData__ConstValueAssignment_4_1_in_rule__ConstantData__Group_4__1__Impl7204);
            rule__ConstantData__ConstValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantDataAccess().getConstValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_4__1__Impl"


    // $ANTLR start "rule__ConstantData__Group_5__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3596:1: rule__ConstantData__Group_5__0 : rule__ConstantData__Group_5__0__Impl rule__ConstantData__Group_5__1 ;
    public final void rule__ConstantData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3600:1: ( rule__ConstantData__Group_5__0__Impl rule__ConstantData__Group_5__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3601:2: rule__ConstantData__Group_5__0__Impl rule__ConstantData__Group_5__1
            {
            pushFollow(FOLLOW_rule__ConstantData__Group_5__0__Impl_in_rule__ConstantData__Group_5__07238);
            rule__ConstantData__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantData__Group_5__1_in_rule__ConstantData__Group_5__07241);
            rule__ConstantData__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_5__0"


    // $ANTLR start "rule__ConstantData__Group_5__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3608:1: rule__ConstantData__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__ConstantData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3612:1: ( ( 'description' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3613:1: ( 'description' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3613:1: ( 'description' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3614:1: 'description'
            {
             before(grammarAccess.getConstantDataAccess().getDescriptionKeyword_5_0()); 
            match(input,46,FOLLOW_46_in_rule__ConstantData__Group_5__0__Impl7269); 
             after(grammarAccess.getConstantDataAccess().getDescriptionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_5__0__Impl"


    // $ANTLR start "rule__ConstantData__Group_5__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3627:1: rule__ConstantData__Group_5__1 : rule__ConstantData__Group_5__1__Impl rule__ConstantData__Group_5__2 ;
    public final void rule__ConstantData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3631:1: ( rule__ConstantData__Group_5__1__Impl rule__ConstantData__Group_5__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3632:2: rule__ConstantData__Group_5__1__Impl rule__ConstantData__Group_5__2
            {
            pushFollow(FOLLOW_rule__ConstantData__Group_5__1__Impl_in_rule__ConstantData__Group_5__17300);
            rule__ConstantData__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantData__Group_5__2_in_rule__ConstantData__Group_5__17303);
            rule__ConstantData__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_5__1"


    // $ANTLR start "rule__ConstantData__Group_5__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3639:1: rule__ConstantData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__ConstantData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3643:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3644:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3644:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3645:1: ':'
            {
             before(grammarAccess.getConstantDataAccess().getColonKeyword_5_1()); 
            match(input,40,FOLLOW_40_in_rule__ConstantData__Group_5__1__Impl7331); 
             after(grammarAccess.getConstantDataAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_5__1__Impl"


    // $ANTLR start "rule__ConstantData__Group_5__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3658:1: rule__ConstantData__Group_5__2 : rule__ConstantData__Group_5__2__Impl ;
    public final void rule__ConstantData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3662:1: ( rule__ConstantData__Group_5__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3663:2: rule__ConstantData__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ConstantData__Group_5__2__Impl_in_rule__ConstantData__Group_5__27362);
            rule__ConstantData__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_5__2"


    // $ANTLR start "rule__ConstantData__Group_5__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3669:1: rule__ConstantData__Group_5__2__Impl : ( ( rule__ConstantData__DescriptionAssignment_5_2 ) ) ;
    public final void rule__ConstantData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3673:1: ( ( ( rule__ConstantData__DescriptionAssignment_5_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3674:1: ( ( rule__ConstantData__DescriptionAssignment_5_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3674:1: ( ( rule__ConstantData__DescriptionAssignment_5_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3675:1: ( rule__ConstantData__DescriptionAssignment_5_2 )
            {
             before(grammarAccess.getConstantDataAccess().getDescriptionAssignment_5_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3676:1: ( rule__ConstantData__DescriptionAssignment_5_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3676:2: rule__ConstantData__DescriptionAssignment_5_2
            {
            pushFollow(FOLLOW_rule__ConstantData__DescriptionAssignment_5_2_in_rule__ConstantData__Group_5__2__Impl7389);
            rule__ConstantData__DescriptionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getConstantDataAccess().getDescriptionAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_5__2__Impl"


    // $ANTLR start "rule__ConstantData__Group_6__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3692:1: rule__ConstantData__Group_6__0 : rule__ConstantData__Group_6__0__Impl rule__ConstantData__Group_6__1 ;
    public final void rule__ConstantData__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3696:1: ( rule__ConstantData__Group_6__0__Impl rule__ConstantData__Group_6__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3697:2: rule__ConstantData__Group_6__0__Impl rule__ConstantData__Group_6__1
            {
            pushFollow(FOLLOW_rule__ConstantData__Group_6__0__Impl_in_rule__ConstantData__Group_6__07425);
            rule__ConstantData__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantData__Group_6__1_in_rule__ConstantData__Group_6__07428);
            rule__ConstantData__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_6__0"


    // $ANTLR start "rule__ConstantData__Group_6__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3704:1: rule__ConstantData__Group_6__0__Impl : ( 'id' ) ;
    public final void rule__ConstantData__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3708:1: ( ( 'id' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3709:1: ( 'id' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3709:1: ( 'id' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3710:1: 'id'
            {
             before(grammarAccess.getConstantDataAccess().getIdKeyword_6_0()); 
            match(input,47,FOLLOW_47_in_rule__ConstantData__Group_6__0__Impl7456); 
             after(grammarAccess.getConstantDataAccess().getIdKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_6__0__Impl"


    // $ANTLR start "rule__ConstantData__Group_6__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3723:1: rule__ConstantData__Group_6__1 : rule__ConstantData__Group_6__1__Impl rule__ConstantData__Group_6__2 ;
    public final void rule__ConstantData__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3727:1: ( rule__ConstantData__Group_6__1__Impl rule__ConstantData__Group_6__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3728:2: rule__ConstantData__Group_6__1__Impl rule__ConstantData__Group_6__2
            {
            pushFollow(FOLLOW_rule__ConstantData__Group_6__1__Impl_in_rule__ConstantData__Group_6__17487);
            rule__ConstantData__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantData__Group_6__2_in_rule__ConstantData__Group_6__17490);
            rule__ConstantData__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_6__1"


    // $ANTLR start "rule__ConstantData__Group_6__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3735:1: rule__ConstantData__Group_6__1__Impl : ( ':' ) ;
    public final void rule__ConstantData__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3739:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3740:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3740:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3741:1: ':'
            {
             before(grammarAccess.getConstantDataAccess().getColonKeyword_6_1()); 
            match(input,40,FOLLOW_40_in_rule__ConstantData__Group_6__1__Impl7518); 
             after(grammarAccess.getConstantDataAccess().getColonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_6__1__Impl"


    // $ANTLR start "rule__ConstantData__Group_6__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3754:1: rule__ConstantData__Group_6__2 : rule__ConstantData__Group_6__2__Impl ;
    public final void rule__ConstantData__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3758:1: ( rule__ConstantData__Group_6__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3759:2: rule__ConstantData__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__ConstantData__Group_6__2__Impl_in_rule__ConstantData__Group_6__27549);
            rule__ConstantData__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_6__2"


    // $ANTLR start "rule__ConstantData__Group_6__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3765:1: rule__ConstantData__Group_6__2__Impl : ( ( rule__ConstantData__IDAssignment_6_2 ) ) ;
    public final void rule__ConstantData__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3769:1: ( ( ( rule__ConstantData__IDAssignment_6_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3770:1: ( ( rule__ConstantData__IDAssignment_6_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3770:1: ( ( rule__ConstantData__IDAssignment_6_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3771:1: ( rule__ConstantData__IDAssignment_6_2 )
            {
             before(grammarAccess.getConstantDataAccess().getIDAssignment_6_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3772:1: ( rule__ConstantData__IDAssignment_6_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3772:2: rule__ConstantData__IDAssignment_6_2
            {
            pushFollow(FOLLOW_rule__ConstantData__IDAssignment_6_2_in_rule__ConstantData__Group_6__2__Impl7576);
            rule__ConstantData__IDAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getConstantDataAccess().getIDAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__Group_6__2__Impl"


    // $ANTLR start "rule__Calculated__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3788:1: rule__Calculated__Group__0 : rule__Calculated__Group__0__Impl rule__Calculated__Group__1 ;
    public final void rule__Calculated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3792:1: ( rule__Calculated__Group__0__Impl rule__Calculated__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3793:2: rule__Calculated__Group__0__Impl rule__Calculated__Group__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group__0__Impl_in_rule__Calculated__Group__07612);
            rule__Calculated__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__1_in_rule__Calculated__Group__07615);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3800:1: rule__Calculated__Group__0__Impl : ( ( rule__Calculated__Alternatives_0 ) ) ;
    public final void rule__Calculated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3804:1: ( ( ( rule__Calculated__Alternatives_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3805:1: ( ( rule__Calculated__Alternatives_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3805:1: ( ( rule__Calculated__Alternatives_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3806:1: ( rule__Calculated__Alternatives_0 )
            {
             before(grammarAccess.getCalculatedAccess().getAlternatives_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3807:1: ( rule__Calculated__Alternatives_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3807:2: rule__Calculated__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Calculated__Alternatives_0_in_rule__Calculated__Group__0__Impl7642);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3817:1: rule__Calculated__Group__1 : rule__Calculated__Group__1__Impl rule__Calculated__Group__2 ;
    public final void rule__Calculated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3821:1: ( rule__Calculated__Group__1__Impl rule__Calculated__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3822:2: rule__Calculated__Group__1__Impl rule__Calculated__Group__2
            {
            pushFollow(FOLLOW_rule__Calculated__Group__1__Impl_in_rule__Calculated__Group__17672);
            rule__Calculated__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__2_in_rule__Calculated__Group__17675);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3829:1: rule__Calculated__Group__1__Impl : ( ( rule__Calculated__NameAssignment_1 ) ) ;
    public final void rule__Calculated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3833:1: ( ( ( rule__Calculated__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3834:1: ( ( rule__Calculated__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3834:1: ( ( rule__Calculated__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3835:1: ( rule__Calculated__NameAssignment_1 )
            {
             before(grammarAccess.getCalculatedAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3836:1: ( rule__Calculated__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3836:2: rule__Calculated__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Calculated__NameAssignment_1_in_rule__Calculated__Group__1__Impl7702);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3846:1: rule__Calculated__Group__2 : rule__Calculated__Group__2__Impl rule__Calculated__Group__3 ;
    public final void rule__Calculated__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3850:1: ( rule__Calculated__Group__2__Impl rule__Calculated__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3851:2: rule__Calculated__Group__2__Impl rule__Calculated__Group__3
            {
            pushFollow(FOLLOW_rule__Calculated__Group__2__Impl_in_rule__Calculated__Group__27732);
            rule__Calculated__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__3_in_rule__Calculated__Group__27735);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3858:1: rule__Calculated__Group__2__Impl : ( 'as' ) ;
    public final void rule__Calculated__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3862:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3863:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3863:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3864:1: 'as'
            {
             before(grammarAccess.getCalculatedAccess().getAsKeyword_2()); 
            match(input,50,FOLLOW_50_in_rule__Calculated__Group__2__Impl7763); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3877:1: rule__Calculated__Group__3 : rule__Calculated__Group__3__Impl rule__Calculated__Group__4 ;
    public final void rule__Calculated__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3881:1: ( rule__Calculated__Group__3__Impl rule__Calculated__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3882:2: rule__Calculated__Group__3__Impl rule__Calculated__Group__4
            {
            pushFollow(FOLLOW_rule__Calculated__Group__3__Impl_in_rule__Calculated__Group__37794);
            rule__Calculated__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__4_in_rule__Calculated__Group__37797);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3889:1: rule__Calculated__Group__3__Impl : ( ( rule__Calculated__RepresentationAssignment_3 ) ) ;
    public final void rule__Calculated__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3893:1: ( ( ( rule__Calculated__RepresentationAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3894:1: ( ( rule__Calculated__RepresentationAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3894:1: ( ( rule__Calculated__RepresentationAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3895:1: ( rule__Calculated__RepresentationAssignment_3 )
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3896:1: ( rule__Calculated__RepresentationAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3896:2: rule__Calculated__RepresentationAssignment_3
            {
            pushFollow(FOLLOW_rule__Calculated__RepresentationAssignment_3_in_rule__Calculated__Group__3__Impl7824);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3906:1: rule__Calculated__Group__4 : rule__Calculated__Group__4__Impl rule__Calculated__Group__5 ;
    public final void rule__Calculated__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3910:1: ( rule__Calculated__Group__4__Impl rule__Calculated__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3911:2: rule__Calculated__Group__4__Impl rule__Calculated__Group__5
            {
            pushFollow(FOLLOW_rule__Calculated__Group__4__Impl_in_rule__Calculated__Group__47854);
            rule__Calculated__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__5_in_rule__Calculated__Group__47857);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3918:1: rule__Calculated__Group__4__Impl : ( 'by' ) ;
    public final void rule__Calculated__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3922:1: ( ( 'by' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3923:1: ( 'by' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3923:1: ( 'by' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3924:1: 'by'
            {
             before(grammarAccess.getCalculatedAccess().getByKeyword_4()); 
            match(input,53,FOLLOW_53_in_rule__Calculated__Group__4__Impl7885); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3937:1: rule__Calculated__Group__5 : rule__Calculated__Group__5__Impl rule__Calculated__Group__6 ;
    public final void rule__Calculated__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3941:1: ( rule__Calculated__Group__5__Impl rule__Calculated__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3942:2: rule__Calculated__Group__5__Impl rule__Calculated__Group__6
            {
            pushFollow(FOLLOW_rule__Calculated__Group__5__Impl_in_rule__Calculated__Group__57916);
            rule__Calculated__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__6_in_rule__Calculated__Group__57919);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3949:1: rule__Calculated__Group__5__Impl : ( ( rule__Calculated__MethodNameAssignment_5 ) ) ;
    public final void rule__Calculated__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3953:1: ( ( ( rule__Calculated__MethodNameAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3954:1: ( ( rule__Calculated__MethodNameAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3954:1: ( ( rule__Calculated__MethodNameAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3955:1: ( rule__Calculated__MethodNameAssignment_5 )
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3956:1: ( rule__Calculated__MethodNameAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3956:2: rule__Calculated__MethodNameAssignment_5
            {
            pushFollow(FOLLOW_rule__Calculated__MethodNameAssignment_5_in_rule__Calculated__Group__5__Impl7946);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3966:1: rule__Calculated__Group__6 : rule__Calculated__Group__6__Impl rule__Calculated__Group__7 ;
    public final void rule__Calculated__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3970:1: ( rule__Calculated__Group__6__Impl rule__Calculated__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3971:2: rule__Calculated__Group__6__Impl rule__Calculated__Group__7
            {
            pushFollow(FOLLOW_rule__Calculated__Group__6__Impl_in_rule__Calculated__Group__67976);
            rule__Calculated__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__7_in_rule__Calculated__Group__67979);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3978:1: rule__Calculated__Group__6__Impl : ( ( rule__Calculated__Group_6__0 )? ) ;
    public final void rule__Calculated__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3982:1: ( ( ( rule__Calculated__Group_6__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3983:1: ( ( rule__Calculated__Group_6__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3983:1: ( ( rule__Calculated__Group_6__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3984:1: ( rule__Calculated__Group_6__0 )?
            {
             before(grammarAccess.getCalculatedAccess().getGroup_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3985:1: ( rule__Calculated__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3985:2: rule__Calculated__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Calculated__Group_6__0_in_rule__Calculated__Group__6__Impl8006);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3995:1: rule__Calculated__Group__7 : rule__Calculated__Group__7__Impl rule__Calculated__Group__8 ;
    public final void rule__Calculated__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3999:1: ( rule__Calculated__Group__7__Impl rule__Calculated__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4000:2: rule__Calculated__Group__7__Impl rule__Calculated__Group__8
            {
            pushFollow(FOLLOW_rule__Calculated__Group__7__Impl_in_rule__Calculated__Group__78037);
            rule__Calculated__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__8_in_rule__Calculated__Group__78040);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4007:1: rule__Calculated__Group__7__Impl : ( 'with' ) ;
    public final void rule__Calculated__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4011:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4012:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4012:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4013:1: 'with'
            {
             before(grammarAccess.getCalculatedAccess().getWithKeyword_7()); 
            match(input,54,FOLLOW_54_in_rule__Calculated__Group__7__Impl8068); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4026:1: rule__Calculated__Group__8 : rule__Calculated__Group__8__Impl rule__Calculated__Group__9 ;
    public final void rule__Calculated__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4030:1: ( rule__Calculated__Group__8__Impl rule__Calculated__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4031:2: rule__Calculated__Group__8__Impl rule__Calculated__Group__9
            {
            pushFollow(FOLLOW_rule__Calculated__Group__8__Impl_in_rule__Calculated__Group__88099);
            rule__Calculated__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__9_in_rule__Calculated__Group__88102);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4038:1: rule__Calculated__Group__8__Impl : ( ( rule__Calculated__ParameterAssignment_8 ) ) ;
    public final void rule__Calculated__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4042:1: ( ( ( rule__Calculated__ParameterAssignment_8 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4043:1: ( ( rule__Calculated__ParameterAssignment_8 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4043:1: ( ( rule__Calculated__ParameterAssignment_8 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4044:1: ( rule__Calculated__ParameterAssignment_8 )
            {
             before(grammarAccess.getCalculatedAccess().getParameterAssignment_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4045:1: ( rule__Calculated__ParameterAssignment_8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4045:2: rule__Calculated__ParameterAssignment_8
            {
            pushFollow(FOLLOW_rule__Calculated__ParameterAssignment_8_in_rule__Calculated__Group__8__Impl8129);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4055:1: rule__Calculated__Group__9 : rule__Calculated__Group__9__Impl rule__Calculated__Group__10 ;
    public final void rule__Calculated__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4059:1: ( rule__Calculated__Group__9__Impl rule__Calculated__Group__10 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4060:2: rule__Calculated__Group__9__Impl rule__Calculated__Group__10
            {
            pushFollow(FOLLOW_rule__Calculated__Group__9__Impl_in_rule__Calculated__Group__98159);
            rule__Calculated__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__10_in_rule__Calculated__Group__98162);
            rule__Calculated__Group__10();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4067:1: rule__Calculated__Group__9__Impl : ( ( rule__Calculated__Group_9__0 )* ) ;
    public final void rule__Calculated__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4071:1: ( ( ( rule__Calculated__Group_9__0 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4072:1: ( ( rule__Calculated__Group_9__0 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4072:1: ( ( rule__Calculated__Group_9__0 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4073:1: ( rule__Calculated__Group_9__0 )*
            {
             before(grammarAccess.getCalculatedAccess().getGroup_9()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4074:1: ( rule__Calculated__Group_9__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==38) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4074:2: rule__Calculated__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Calculated__Group_9__0_in_rule__Calculated__Group__9__Impl8189);
            	    rule__Calculated__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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


    // $ANTLR start "rule__Calculated__Group__10"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4084:1: rule__Calculated__Group__10 : rule__Calculated__Group__10__Impl rule__Calculated__Group__11 ;
    public final void rule__Calculated__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4088:1: ( rule__Calculated__Group__10__Impl rule__Calculated__Group__11 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4089:2: rule__Calculated__Group__10__Impl rule__Calculated__Group__11
            {
            pushFollow(FOLLOW_rule__Calculated__Group__10__Impl_in_rule__Calculated__Group__108220);
            rule__Calculated__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group__11_in_rule__Calculated__Group__108223);
            rule__Calculated__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__10"


    // $ANTLR start "rule__Calculated__Group__10__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4096:1: rule__Calculated__Group__10__Impl : ( ( rule__Calculated__Group_10__0 )? ) ;
    public final void rule__Calculated__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4100:1: ( ( ( rule__Calculated__Group_10__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4101:1: ( ( rule__Calculated__Group_10__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4101:1: ( ( rule__Calculated__Group_10__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4102:1: ( rule__Calculated__Group_10__0 )?
            {
             before(grammarAccess.getCalculatedAccess().getGroup_10()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4103:1: ( rule__Calculated__Group_10__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==40) ) {
                    int LA27_3 = input.LA(3);

                    if ( (LA27_3==RULE_STRING) ) {
                        alt27=1;
                    }
                }
            }
            switch (alt27) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4103:2: rule__Calculated__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Calculated__Group_10__0_in_rule__Calculated__Group__10__Impl8250);
                    rule__Calculated__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalculatedAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__10__Impl"


    // $ANTLR start "rule__Calculated__Group__11"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4113:1: rule__Calculated__Group__11 : rule__Calculated__Group__11__Impl ;
    public final void rule__Calculated__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4117:1: ( rule__Calculated__Group__11__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4118:2: rule__Calculated__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group__11__Impl_in_rule__Calculated__Group__118281);
            rule__Calculated__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__11"


    // $ANTLR start "rule__Calculated__Group__11__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4124:1: rule__Calculated__Group__11__Impl : ( ( rule__Calculated__Group_11__0 )? ) ;
    public final void rule__Calculated__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4128:1: ( ( ( rule__Calculated__Group_11__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4129:1: ( ( rule__Calculated__Group_11__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4129:1: ( ( rule__Calculated__Group_11__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4130:1: ( rule__Calculated__Group_11__0 )?
            {
             before(grammarAccess.getCalculatedAccess().getGroup_11()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4131:1: ( rule__Calculated__Group_11__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==40) ) {
                    int LA28_3 = input.LA(3);

                    if ( (LA28_3==RULE_STRING) ) {
                        alt28=1;
                    }
                }
            }
            switch (alt28) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4131:2: rule__Calculated__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Calculated__Group_11__0_in_rule__Calculated__Group__11__Impl8308);
                    rule__Calculated__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalculatedAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group__11__Impl"


    // $ANTLR start "rule__Calculated__Group_6__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4165:1: rule__Calculated__Group_6__0 : rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1 ;
    public final void rule__Calculated__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4169:1: ( rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4170:2: rule__Calculated__Group_6__0__Impl rule__Calculated__Group_6__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group_6__0__Impl_in_rule__Calculated__Group_6__08363);
            rule__Calculated__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group_6__1_in_rule__Calculated__Group_6__08366);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4177:1: rule__Calculated__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Calculated__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4181:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4182:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4182:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4183:1: ','
            {
             before(grammarAccess.getCalculatedAccess().getCommaKeyword_6_0()); 
            match(input,38,FOLLOW_38_in_rule__Calculated__Group_6__0__Impl8394); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4196:1: rule__Calculated__Group_6__1 : rule__Calculated__Group_6__1__Impl ;
    public final void rule__Calculated__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4200:1: ( rule__Calculated__Group_6__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4201:2: rule__Calculated__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group_6__1__Impl_in_rule__Calculated__Group_6__18425);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4207:1: rule__Calculated__Group_6__1__Impl : ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) ) ;
    public final void rule__Calculated__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4211:1: ( ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4212:1: ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4212:1: ( ( rule__Calculated__MethodNameOutAssignment_6_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4213:1: ( rule__Calculated__MethodNameOutAssignment_6_1 )
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameOutAssignment_6_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4214:1: ( rule__Calculated__MethodNameOutAssignment_6_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4214:2: rule__Calculated__MethodNameOutAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Calculated__MethodNameOutAssignment_6_1_in_rule__Calculated__Group_6__1__Impl8452);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4228:1: rule__Calculated__Group_9__0 : rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1 ;
    public final void rule__Calculated__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4232:1: ( rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4233:2: rule__Calculated__Group_9__0__Impl rule__Calculated__Group_9__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group_9__0__Impl_in_rule__Calculated__Group_9__08486);
            rule__Calculated__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group_9__1_in_rule__Calculated__Group_9__08489);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4240:1: rule__Calculated__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Calculated__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4244:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4245:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4245:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4246:1: ','
            {
             before(grammarAccess.getCalculatedAccess().getCommaKeyword_9_0()); 
            match(input,38,FOLLOW_38_in_rule__Calculated__Group_9__0__Impl8517); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4259:1: rule__Calculated__Group_9__1 : rule__Calculated__Group_9__1__Impl ;
    public final void rule__Calculated__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4263:1: ( rule__Calculated__Group_9__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4264:2: rule__Calculated__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group_9__1__Impl_in_rule__Calculated__Group_9__18548);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4270:1: rule__Calculated__Group_9__1__Impl : ( ( rule__Calculated__ParameterAssignment_9_1 ) ) ;
    public final void rule__Calculated__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4274:1: ( ( ( rule__Calculated__ParameterAssignment_9_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4275:1: ( ( rule__Calculated__ParameterAssignment_9_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4275:1: ( ( rule__Calculated__ParameterAssignment_9_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4276:1: ( rule__Calculated__ParameterAssignment_9_1 )
            {
             before(grammarAccess.getCalculatedAccess().getParameterAssignment_9_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4277:1: ( rule__Calculated__ParameterAssignment_9_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4277:2: rule__Calculated__ParameterAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Calculated__ParameterAssignment_9_1_in_rule__Calculated__Group_9__1__Impl8575);
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


    // $ANTLR start "rule__Calculated__Group_10__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4291:1: rule__Calculated__Group_10__0 : rule__Calculated__Group_10__0__Impl rule__Calculated__Group_10__1 ;
    public final void rule__Calculated__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4295:1: ( rule__Calculated__Group_10__0__Impl rule__Calculated__Group_10__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4296:2: rule__Calculated__Group_10__0__Impl rule__Calculated__Group_10__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group_10__0__Impl_in_rule__Calculated__Group_10__08609);
            rule__Calculated__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group_10__1_in_rule__Calculated__Group_10__08612);
            rule__Calculated__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_10__0"


    // $ANTLR start "rule__Calculated__Group_10__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4303:1: rule__Calculated__Group_10__0__Impl : ( 'description' ) ;
    public final void rule__Calculated__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4307:1: ( ( 'description' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4308:1: ( 'description' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4308:1: ( 'description' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4309:1: 'description'
            {
             before(grammarAccess.getCalculatedAccess().getDescriptionKeyword_10_0()); 
            match(input,46,FOLLOW_46_in_rule__Calculated__Group_10__0__Impl8640); 
             after(grammarAccess.getCalculatedAccess().getDescriptionKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_10__0__Impl"


    // $ANTLR start "rule__Calculated__Group_10__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4322:1: rule__Calculated__Group_10__1 : rule__Calculated__Group_10__1__Impl rule__Calculated__Group_10__2 ;
    public final void rule__Calculated__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4326:1: ( rule__Calculated__Group_10__1__Impl rule__Calculated__Group_10__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4327:2: rule__Calculated__Group_10__1__Impl rule__Calculated__Group_10__2
            {
            pushFollow(FOLLOW_rule__Calculated__Group_10__1__Impl_in_rule__Calculated__Group_10__18671);
            rule__Calculated__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group_10__2_in_rule__Calculated__Group_10__18674);
            rule__Calculated__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_10__1"


    // $ANTLR start "rule__Calculated__Group_10__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4334:1: rule__Calculated__Group_10__1__Impl : ( ':' ) ;
    public final void rule__Calculated__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4338:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4339:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4339:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4340:1: ':'
            {
             before(grammarAccess.getCalculatedAccess().getColonKeyword_10_1()); 
            match(input,40,FOLLOW_40_in_rule__Calculated__Group_10__1__Impl8702); 
             after(grammarAccess.getCalculatedAccess().getColonKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_10__1__Impl"


    // $ANTLR start "rule__Calculated__Group_10__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4353:1: rule__Calculated__Group_10__2 : rule__Calculated__Group_10__2__Impl ;
    public final void rule__Calculated__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4357:1: ( rule__Calculated__Group_10__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4358:2: rule__Calculated__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group_10__2__Impl_in_rule__Calculated__Group_10__28733);
            rule__Calculated__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_10__2"


    // $ANTLR start "rule__Calculated__Group_10__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4364:1: rule__Calculated__Group_10__2__Impl : ( ( rule__Calculated__DescriptionAssignment_10_2 ) ) ;
    public final void rule__Calculated__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4368:1: ( ( ( rule__Calculated__DescriptionAssignment_10_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4369:1: ( ( rule__Calculated__DescriptionAssignment_10_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4369:1: ( ( rule__Calculated__DescriptionAssignment_10_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4370:1: ( rule__Calculated__DescriptionAssignment_10_2 )
            {
             before(grammarAccess.getCalculatedAccess().getDescriptionAssignment_10_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4371:1: ( rule__Calculated__DescriptionAssignment_10_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4371:2: rule__Calculated__DescriptionAssignment_10_2
            {
            pushFollow(FOLLOW_rule__Calculated__DescriptionAssignment_10_2_in_rule__Calculated__Group_10__2__Impl8760);
            rule__Calculated__DescriptionAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getDescriptionAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_10__2__Impl"


    // $ANTLR start "rule__Calculated__Group_11__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4387:1: rule__Calculated__Group_11__0 : rule__Calculated__Group_11__0__Impl rule__Calculated__Group_11__1 ;
    public final void rule__Calculated__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4391:1: ( rule__Calculated__Group_11__0__Impl rule__Calculated__Group_11__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4392:2: rule__Calculated__Group_11__0__Impl rule__Calculated__Group_11__1
            {
            pushFollow(FOLLOW_rule__Calculated__Group_11__0__Impl_in_rule__Calculated__Group_11__08796);
            rule__Calculated__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group_11__1_in_rule__Calculated__Group_11__08799);
            rule__Calculated__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_11__0"


    // $ANTLR start "rule__Calculated__Group_11__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4399:1: rule__Calculated__Group_11__0__Impl : ( 'id' ) ;
    public final void rule__Calculated__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4403:1: ( ( 'id' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4404:1: ( 'id' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4404:1: ( 'id' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4405:1: 'id'
            {
             before(grammarAccess.getCalculatedAccess().getIdKeyword_11_0()); 
            match(input,47,FOLLOW_47_in_rule__Calculated__Group_11__0__Impl8827); 
             after(grammarAccess.getCalculatedAccess().getIdKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_11__0__Impl"


    // $ANTLR start "rule__Calculated__Group_11__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4418:1: rule__Calculated__Group_11__1 : rule__Calculated__Group_11__1__Impl rule__Calculated__Group_11__2 ;
    public final void rule__Calculated__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4422:1: ( rule__Calculated__Group_11__1__Impl rule__Calculated__Group_11__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4423:2: rule__Calculated__Group_11__1__Impl rule__Calculated__Group_11__2
            {
            pushFollow(FOLLOW_rule__Calculated__Group_11__1__Impl_in_rule__Calculated__Group_11__18858);
            rule__Calculated__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculated__Group_11__2_in_rule__Calculated__Group_11__18861);
            rule__Calculated__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_11__1"


    // $ANTLR start "rule__Calculated__Group_11__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4430:1: rule__Calculated__Group_11__1__Impl : ( ':' ) ;
    public final void rule__Calculated__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4434:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4435:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4435:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4436:1: ':'
            {
             before(grammarAccess.getCalculatedAccess().getColonKeyword_11_1()); 
            match(input,40,FOLLOW_40_in_rule__Calculated__Group_11__1__Impl8889); 
             after(grammarAccess.getCalculatedAccess().getColonKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_11__1__Impl"


    // $ANTLR start "rule__Calculated__Group_11__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4449:1: rule__Calculated__Group_11__2 : rule__Calculated__Group_11__2__Impl ;
    public final void rule__Calculated__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4453:1: ( rule__Calculated__Group_11__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4454:2: rule__Calculated__Group_11__2__Impl
            {
            pushFollow(FOLLOW_rule__Calculated__Group_11__2__Impl_in_rule__Calculated__Group_11__28920);
            rule__Calculated__Group_11__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_11__2"


    // $ANTLR start "rule__Calculated__Group_11__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4460:1: rule__Calculated__Group_11__2__Impl : ( ( rule__Calculated__IDAssignment_11_2 ) ) ;
    public final void rule__Calculated__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4464:1: ( ( ( rule__Calculated__IDAssignment_11_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4465:1: ( ( rule__Calculated__IDAssignment_11_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4465:1: ( ( rule__Calculated__IDAssignment_11_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4466:1: ( rule__Calculated__IDAssignment_11_2 )
            {
             before(grammarAccess.getCalculatedAccess().getIDAssignment_11_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4467:1: ( rule__Calculated__IDAssignment_11_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4467:2: rule__Calculated__IDAssignment_11_2
            {
            pushFollow(FOLLOW_rule__Calculated__IDAssignment_11_2_in_rule__Calculated__Group_11__2__Impl8947);
            rule__Calculated__IDAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getIDAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__Group_11__2__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4483:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4487:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4488:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__08983);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__08986);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4495:1: rule__Parameter__Group__0__Impl : ( '(' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4499:1: ( ( '(' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4500:1: ( '(' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4500:1: ( '(' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4501:1: '('
            {
             before(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__Parameter__Group__0__Impl9014); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4514:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4518:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4519:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__19045);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__19048);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4526:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__DatafieldAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4530:1: ( ( ( rule__Parameter__DatafieldAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4531:1: ( ( rule__Parameter__DatafieldAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4531:1: ( ( rule__Parameter__DatafieldAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4532:1: ( rule__Parameter__DatafieldAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getDatafieldAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4533:1: ( rule__Parameter__DatafieldAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4533:2: rule__Parameter__DatafieldAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__DatafieldAssignment_1_in_rule__Parameter__Group__1__Impl9075);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4543:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4547:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4548:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__29105);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__29108);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4555:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4559:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4560:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4560:1: ( ( rule__Parameter__Group_2__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4561:1: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4562:1: ( rule__Parameter__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4562:2: rule__Parameter__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl9135);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4572:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4576:1: ( rule__Parameter__Group__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4577:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__39166);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4583:1: rule__Parameter__Group__3__Impl : ( ')' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4587:1: ( ( ')' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4588:1: ( ')' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4588:1: ( ')' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4589:1: ')'
            {
             before(grammarAccess.getParameterAccess().getRightParenthesisKeyword_3()); 
            match(input,56,FOLLOW_56_in_rule__Parameter__Group__3__Impl9194); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4610:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4614:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4615:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__09233);
            rule__Parameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__09236);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4622:1: rule__Parameter__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4626:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4627:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4627:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4628:1: 'as'
            {
             before(grammarAccess.getParameterAccess().getAsKeyword_2_0()); 
            match(input,50,FOLLOW_50_in_rule__Parameter__Group_2__0__Impl9264); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4641:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4645:1: ( rule__Parameter__Group_2__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4646:2: rule__Parameter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__19295);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4652:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4656:1: ( ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4657:1: ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4657:1: ( ( rule__Parameter__ArgumentTypeAssignment_2_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4658:1: ( rule__Parameter__ArgumentTypeAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getArgumentTypeAssignment_2_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4659:1: ( rule__Parameter__ArgumentTypeAssignment_2_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4659:2: rule__Parameter__ArgumentTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Parameter__ArgumentTypeAssignment_2_1_in_rule__Parameter__Group_2__1__Impl9322);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4673:1: rule__Datastructure__Group__0 : rule__Datastructure__Group__0__Impl rule__Datastructure__Group__1 ;
    public final void rule__Datastructure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4677:1: ( rule__Datastructure__Group__0__Impl rule__Datastructure__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4678:2: rule__Datastructure__Group__0__Impl rule__Datastructure__Group__1
            {
            pushFollow(FOLLOW_rule__Datastructure__Group__0__Impl_in_rule__Datastructure__Group__09356);
            rule__Datastructure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datastructure__Group__1_in_rule__Datastructure__Group__09359);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4685:1: rule__Datastructure__Group__0__Impl : ( 'set' ) ;
    public final void rule__Datastructure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4689:1: ( ( 'set' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4690:1: ( 'set' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4690:1: ( 'set' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4691:1: 'set'
            {
             before(grammarAccess.getDatastructureAccess().getSetKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__Datastructure__Group__0__Impl9387); 
             after(grammarAccess.getDatastructureAccess().getSetKeyword_0()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4704:1: rule__Datastructure__Group__1 : rule__Datastructure__Group__1__Impl rule__Datastructure__Group__2 ;
    public final void rule__Datastructure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4708:1: ( rule__Datastructure__Group__1__Impl rule__Datastructure__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4709:2: rule__Datastructure__Group__1__Impl rule__Datastructure__Group__2
            {
            pushFollow(FOLLOW_rule__Datastructure__Group__1__Impl_in_rule__Datastructure__Group__19418);
            rule__Datastructure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datastructure__Group__2_in_rule__Datastructure__Group__19421);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4716:1: rule__Datastructure__Group__1__Impl : ( ( rule__Datastructure__NameAssignment_1 ) ) ;
    public final void rule__Datastructure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4720:1: ( ( ( rule__Datastructure__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4721:1: ( ( rule__Datastructure__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4721:1: ( ( rule__Datastructure__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4722:1: ( rule__Datastructure__NameAssignment_1 )
            {
             before(grammarAccess.getDatastructureAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4723:1: ( rule__Datastructure__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4723:2: rule__Datastructure__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Datastructure__NameAssignment_1_in_rule__Datastructure__Group__1__Impl9448);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4733:1: rule__Datastructure__Group__2 : rule__Datastructure__Group__2__Impl rule__Datastructure__Group__3 ;
    public final void rule__Datastructure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4737:1: ( rule__Datastructure__Group__2__Impl rule__Datastructure__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4738:2: rule__Datastructure__Group__2__Impl rule__Datastructure__Group__3
            {
            pushFollow(FOLLOW_rule__Datastructure__Group__2__Impl_in_rule__Datastructure__Group__29478);
            rule__Datastructure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datastructure__Group__3_in_rule__Datastructure__Group__29481);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4745:1: rule__Datastructure__Group__2__Impl : ( '{' ) ;
    public final void rule__Datastructure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4749:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4750:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4750:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4751:1: '{'
            {
             before(grammarAccess.getDatastructureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Datastructure__Group__2__Impl9509); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4764:1: rule__Datastructure__Group__3 : rule__Datastructure__Group__3__Impl rule__Datastructure__Group__4 ;
    public final void rule__Datastructure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4768:1: ( rule__Datastructure__Group__3__Impl rule__Datastructure__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4769:2: rule__Datastructure__Group__3__Impl rule__Datastructure__Group__4
            {
            pushFollow(FOLLOW_rule__Datastructure__Group__3__Impl_in_rule__Datastructure__Group__39540);
            rule__Datastructure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datastructure__Group__4_in_rule__Datastructure__Group__39543);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4776:1: rule__Datastructure__Group__3__Impl : ( ( rule__Datastructure__DatafieldsAssignment_3 )* ) ;
    public final void rule__Datastructure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4780:1: ( ( ( rule__Datastructure__DatafieldsAssignment_3 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4781:1: ( ( rule__Datastructure__DatafieldsAssignment_3 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4781:1: ( ( rule__Datastructure__DatafieldsAssignment_3 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4782:1: ( rule__Datastructure__DatafieldsAssignment_3 )*
            {
             before(grammarAccess.getDatastructureAccess().getDatafieldsAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4783:1: ( rule__Datastructure__DatafieldsAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=16 && LA30_0<=17)||LA30_0==48||(LA30_0>=51 && LA30_0<=52)||LA30_0==57) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4783:2: rule__Datastructure__DatafieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Datastructure__DatafieldsAssignment_3_in_rule__Datastructure__Group__3__Impl9570);
            	    rule__Datastructure__DatafieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4793:1: rule__Datastructure__Group__4 : rule__Datastructure__Group__4__Impl rule__Datastructure__Group__5 ;
    public final void rule__Datastructure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4797:1: ( rule__Datastructure__Group__4__Impl rule__Datastructure__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4798:2: rule__Datastructure__Group__4__Impl rule__Datastructure__Group__5
            {
            pushFollow(FOLLOW_rule__Datastructure__Group__4__Impl_in_rule__Datastructure__Group__49601);
            rule__Datastructure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datastructure__Group__5_in_rule__Datastructure__Group__49604);
            rule__Datastructure__Group__5();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4805:1: rule__Datastructure__Group__4__Impl : ( ( rule__Datastructure__Group_4__0 )? ) ;
    public final void rule__Datastructure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4809:1: ( ( ( rule__Datastructure__Group_4__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4810:1: ( ( rule__Datastructure__Group_4__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4810:1: ( ( rule__Datastructure__Group_4__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4811:1: ( rule__Datastructure__Group_4__0 )?
            {
             before(grammarAccess.getDatastructureAccess().getGroup_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4812:1: ( rule__Datastructure__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4812:2: rule__Datastructure__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Datastructure__Group_4__0_in_rule__Datastructure__Group__4__Impl9631);
                    rule__Datastructure__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatastructureAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Datastructure__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4822:1: rule__Datastructure__Group__5 : rule__Datastructure__Group__5__Impl rule__Datastructure__Group__6 ;
    public final void rule__Datastructure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4826:1: ( rule__Datastructure__Group__5__Impl rule__Datastructure__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4827:2: rule__Datastructure__Group__5__Impl rule__Datastructure__Group__6
            {
            pushFollow(FOLLOW_rule__Datastructure__Group__5__Impl_in_rule__Datastructure__Group__59662);
            rule__Datastructure__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datastructure__Group__6_in_rule__Datastructure__Group__59665);
            rule__Datastructure__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group__5"


    // $ANTLR start "rule__Datastructure__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4834:1: rule__Datastructure__Group__5__Impl : ( ( rule__Datastructure__Group_5__0 )? ) ;
    public final void rule__Datastructure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4838:1: ( ( ( rule__Datastructure__Group_5__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4839:1: ( ( rule__Datastructure__Group_5__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4839:1: ( ( rule__Datastructure__Group_5__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4840:1: ( rule__Datastructure__Group_5__0 )?
            {
             before(grammarAccess.getDatastructureAccess().getGroup_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4841:1: ( rule__Datastructure__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4841:2: rule__Datastructure__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Datastructure__Group_5__0_in_rule__Datastructure__Group__5__Impl9692);
                    rule__Datastructure__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatastructureAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group__5__Impl"


    // $ANTLR start "rule__Datastructure__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4851:1: rule__Datastructure__Group__6 : rule__Datastructure__Group__6__Impl ;
    public final void rule__Datastructure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4855:1: ( rule__Datastructure__Group__6__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4856:2: rule__Datastructure__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Datastructure__Group__6__Impl_in_rule__Datastructure__Group__69723);
            rule__Datastructure__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group__6"


    // $ANTLR start "rule__Datastructure__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4862:1: rule__Datastructure__Group__6__Impl : ( '}' ) ;
    public final void rule__Datastructure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4866:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4867:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4867:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4868:1: '}'
            {
             before(grammarAccess.getDatastructureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,36,FOLLOW_36_in_rule__Datastructure__Group__6__Impl9751); 
             after(grammarAccess.getDatastructureAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group__6__Impl"


    // $ANTLR start "rule__Datastructure__Group_4__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4895:1: rule__Datastructure__Group_4__0 : rule__Datastructure__Group_4__0__Impl rule__Datastructure__Group_4__1 ;
    public final void rule__Datastructure__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4899:1: ( rule__Datastructure__Group_4__0__Impl rule__Datastructure__Group_4__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4900:2: rule__Datastructure__Group_4__0__Impl rule__Datastructure__Group_4__1
            {
            pushFollow(FOLLOW_rule__Datastructure__Group_4__0__Impl_in_rule__Datastructure__Group_4__09796);
            rule__Datastructure__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datastructure__Group_4__1_in_rule__Datastructure__Group_4__09799);
            rule__Datastructure__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group_4__0"


    // $ANTLR start "rule__Datastructure__Group_4__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4907:1: rule__Datastructure__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Datastructure__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4911:1: ( ( 'description' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4912:1: ( 'description' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4912:1: ( 'description' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4913:1: 'description'
            {
             before(grammarAccess.getDatastructureAccess().getDescriptionKeyword_4_0()); 
            match(input,46,FOLLOW_46_in_rule__Datastructure__Group_4__0__Impl9827); 
             after(grammarAccess.getDatastructureAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group_4__0__Impl"


    // $ANTLR start "rule__Datastructure__Group_4__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4926:1: rule__Datastructure__Group_4__1 : rule__Datastructure__Group_4__1__Impl rule__Datastructure__Group_4__2 ;
    public final void rule__Datastructure__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4930:1: ( rule__Datastructure__Group_4__1__Impl rule__Datastructure__Group_4__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4931:2: rule__Datastructure__Group_4__1__Impl rule__Datastructure__Group_4__2
            {
            pushFollow(FOLLOW_rule__Datastructure__Group_4__1__Impl_in_rule__Datastructure__Group_4__19858);
            rule__Datastructure__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datastructure__Group_4__2_in_rule__Datastructure__Group_4__19861);
            rule__Datastructure__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group_4__1"


    // $ANTLR start "rule__Datastructure__Group_4__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4938:1: rule__Datastructure__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Datastructure__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4942:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4943:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4943:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4944:1: ':'
            {
             before(grammarAccess.getDatastructureAccess().getColonKeyword_4_1()); 
            match(input,40,FOLLOW_40_in_rule__Datastructure__Group_4__1__Impl9889); 
             after(grammarAccess.getDatastructureAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group_4__1__Impl"


    // $ANTLR start "rule__Datastructure__Group_4__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4957:1: rule__Datastructure__Group_4__2 : rule__Datastructure__Group_4__2__Impl ;
    public final void rule__Datastructure__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4961:1: ( rule__Datastructure__Group_4__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4962:2: rule__Datastructure__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Datastructure__Group_4__2__Impl_in_rule__Datastructure__Group_4__29920);
            rule__Datastructure__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group_4__2"


    // $ANTLR start "rule__Datastructure__Group_4__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4968:1: rule__Datastructure__Group_4__2__Impl : ( ( rule__Datastructure__DescriptionAssignment_4_2 ) ) ;
    public final void rule__Datastructure__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4972:1: ( ( ( rule__Datastructure__DescriptionAssignment_4_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4973:1: ( ( rule__Datastructure__DescriptionAssignment_4_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4973:1: ( ( rule__Datastructure__DescriptionAssignment_4_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4974:1: ( rule__Datastructure__DescriptionAssignment_4_2 )
            {
             before(grammarAccess.getDatastructureAccess().getDescriptionAssignment_4_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4975:1: ( rule__Datastructure__DescriptionAssignment_4_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4975:2: rule__Datastructure__DescriptionAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Datastructure__DescriptionAssignment_4_2_in_rule__Datastructure__Group_4__2__Impl9947);
            rule__Datastructure__DescriptionAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDatastructureAccess().getDescriptionAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group_4__2__Impl"


    // $ANTLR start "rule__Datastructure__Group_5__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4991:1: rule__Datastructure__Group_5__0 : rule__Datastructure__Group_5__0__Impl rule__Datastructure__Group_5__1 ;
    public final void rule__Datastructure__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4995:1: ( rule__Datastructure__Group_5__0__Impl rule__Datastructure__Group_5__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4996:2: rule__Datastructure__Group_5__0__Impl rule__Datastructure__Group_5__1
            {
            pushFollow(FOLLOW_rule__Datastructure__Group_5__0__Impl_in_rule__Datastructure__Group_5__09983);
            rule__Datastructure__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datastructure__Group_5__1_in_rule__Datastructure__Group_5__09986);
            rule__Datastructure__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group_5__0"


    // $ANTLR start "rule__Datastructure__Group_5__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5003:1: rule__Datastructure__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__Datastructure__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5007:1: ( ( 'id' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5008:1: ( 'id' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5008:1: ( 'id' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5009:1: 'id'
            {
             before(grammarAccess.getDatastructureAccess().getIdKeyword_5_0()); 
            match(input,47,FOLLOW_47_in_rule__Datastructure__Group_5__0__Impl10014); 
             after(grammarAccess.getDatastructureAccess().getIdKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group_5__0__Impl"


    // $ANTLR start "rule__Datastructure__Group_5__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5022:1: rule__Datastructure__Group_5__1 : rule__Datastructure__Group_5__1__Impl rule__Datastructure__Group_5__2 ;
    public final void rule__Datastructure__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5026:1: ( rule__Datastructure__Group_5__1__Impl rule__Datastructure__Group_5__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5027:2: rule__Datastructure__Group_5__1__Impl rule__Datastructure__Group_5__2
            {
            pushFollow(FOLLOW_rule__Datastructure__Group_5__1__Impl_in_rule__Datastructure__Group_5__110045);
            rule__Datastructure__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Datastructure__Group_5__2_in_rule__Datastructure__Group_5__110048);
            rule__Datastructure__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group_5__1"


    // $ANTLR start "rule__Datastructure__Group_5__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5034:1: rule__Datastructure__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Datastructure__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5038:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5039:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5039:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5040:1: ':'
            {
             before(grammarAccess.getDatastructureAccess().getColonKeyword_5_1()); 
            match(input,40,FOLLOW_40_in_rule__Datastructure__Group_5__1__Impl10076); 
             after(grammarAccess.getDatastructureAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group_5__1__Impl"


    // $ANTLR start "rule__Datastructure__Group_5__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5053:1: rule__Datastructure__Group_5__2 : rule__Datastructure__Group_5__2__Impl ;
    public final void rule__Datastructure__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5057:1: ( rule__Datastructure__Group_5__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5058:2: rule__Datastructure__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Datastructure__Group_5__2__Impl_in_rule__Datastructure__Group_5__210107);
            rule__Datastructure__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group_5__2"


    // $ANTLR start "rule__Datastructure__Group_5__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5064:1: rule__Datastructure__Group_5__2__Impl : ( ( rule__Datastructure__IDAssignment_5_2 ) ) ;
    public final void rule__Datastructure__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5068:1: ( ( ( rule__Datastructure__IDAssignment_5_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5069:1: ( ( rule__Datastructure__IDAssignment_5_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5069:1: ( ( rule__Datastructure__IDAssignment_5_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5070:1: ( rule__Datastructure__IDAssignment_5_2 )
            {
             before(grammarAccess.getDatastructureAccess().getIDAssignment_5_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5071:1: ( rule__Datastructure__IDAssignment_5_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5071:2: rule__Datastructure__IDAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Datastructure__IDAssignment_5_2_in_rule__Datastructure__Group_5__2__Impl10134);
            rule__Datastructure__IDAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDatastructureAccess().getIDAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__Group_5__2__Impl"


    // $ANTLR start "rule__DataRange__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5087:1: rule__DataRange__Group__0 : rule__DataRange__Group__0__Impl rule__DataRange__Group__1 ;
    public final void rule__DataRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5091:1: ( rule__DataRange__Group__0__Impl rule__DataRange__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5092:2: rule__DataRange__Group__0__Impl rule__DataRange__Group__1
            {
            pushFollow(FOLLOW_rule__DataRange__Group__0__Impl_in_rule__DataRange__Group__010170);
            rule__DataRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group__1_in_rule__DataRange__Group__010173);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5099:1: rule__DataRange__Group__0__Impl : ( 'from' ) ;
    public final void rule__DataRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5103:1: ( ( 'from' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5104:1: ( 'from' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5104:1: ( 'from' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5105:1: 'from'
            {
             before(grammarAccess.getDataRangeAccess().getFromKeyword_0()); 
            match(input,58,FOLLOW_58_in_rule__DataRange__Group__0__Impl10201); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5118:1: rule__DataRange__Group__1 : rule__DataRange__Group__1__Impl rule__DataRange__Group__2 ;
    public final void rule__DataRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5122:1: ( rule__DataRange__Group__1__Impl rule__DataRange__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5123:2: rule__DataRange__Group__1__Impl rule__DataRange__Group__2
            {
            pushFollow(FOLLOW_rule__DataRange__Group__1__Impl_in_rule__DataRange__Group__110232);
            rule__DataRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group__2_in_rule__DataRange__Group__110235);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5130:1: rule__DataRange__Group__1__Impl : ( ( rule__DataRange__LowerBoundAssignment_1 ) ) ;
    public final void rule__DataRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5134:1: ( ( ( rule__DataRange__LowerBoundAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5135:1: ( ( rule__DataRange__LowerBoundAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5135:1: ( ( rule__DataRange__LowerBoundAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5136:1: ( rule__DataRange__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getDataRangeAccess().getLowerBoundAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5137:1: ( rule__DataRange__LowerBoundAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5137:2: rule__DataRange__LowerBoundAssignment_1
            {
            pushFollow(FOLLOW_rule__DataRange__LowerBoundAssignment_1_in_rule__DataRange__Group__1__Impl10262);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5147:1: rule__DataRange__Group__2 : rule__DataRange__Group__2__Impl rule__DataRange__Group__3 ;
    public final void rule__DataRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5151:1: ( rule__DataRange__Group__2__Impl rule__DataRange__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5152:2: rule__DataRange__Group__2__Impl rule__DataRange__Group__3
            {
            pushFollow(FOLLOW_rule__DataRange__Group__2__Impl_in_rule__DataRange__Group__210292);
            rule__DataRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group__3_in_rule__DataRange__Group__210295);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5159:1: rule__DataRange__Group__2__Impl : ( 'to' ) ;
    public final void rule__DataRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5163:1: ( ( 'to' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5164:1: ( 'to' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5164:1: ( 'to' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5165:1: 'to'
            {
             before(grammarAccess.getDataRangeAccess().getToKeyword_2()); 
            match(input,59,FOLLOW_59_in_rule__DataRange__Group__2__Impl10323); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5178:1: rule__DataRange__Group__3 : rule__DataRange__Group__3__Impl rule__DataRange__Group__4 ;
    public final void rule__DataRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5182:1: ( rule__DataRange__Group__3__Impl rule__DataRange__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5183:2: rule__DataRange__Group__3__Impl rule__DataRange__Group__4
            {
            pushFollow(FOLLOW_rule__DataRange__Group__3__Impl_in_rule__DataRange__Group__310354);
            rule__DataRange__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group__4_in_rule__DataRange__Group__310357);
            rule__DataRange__Group__4();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5190:1: rule__DataRange__Group__3__Impl : ( ( rule__DataRange__UpperBoundAssignment_3 ) ) ;
    public final void rule__DataRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5194:1: ( ( ( rule__DataRange__UpperBoundAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5195:1: ( ( rule__DataRange__UpperBoundAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5195:1: ( ( rule__DataRange__UpperBoundAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5196:1: ( rule__DataRange__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getDataRangeAccess().getUpperBoundAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5197:1: ( rule__DataRange__UpperBoundAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5197:2: rule__DataRange__UpperBoundAssignment_3
            {
            pushFollow(FOLLOW_rule__DataRange__UpperBoundAssignment_3_in_rule__DataRange__Group__3__Impl10384);
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


    // $ANTLR start "rule__DataRange__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5207:1: rule__DataRange__Group__4 : rule__DataRange__Group__4__Impl rule__DataRange__Group__5 ;
    public final void rule__DataRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5211:1: ( rule__DataRange__Group__4__Impl rule__DataRange__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5212:2: rule__DataRange__Group__4__Impl rule__DataRange__Group__5
            {
            pushFollow(FOLLOW_rule__DataRange__Group__4__Impl_in_rule__DataRange__Group__410414);
            rule__DataRange__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group__5_in_rule__DataRange__Group__410417);
            rule__DataRange__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group__4"


    // $ANTLR start "rule__DataRange__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5219:1: rule__DataRange__Group__4__Impl : ( ( rule__DataRange__Group_4__0 )? ) ;
    public final void rule__DataRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5223:1: ( ( ( rule__DataRange__Group_4__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5224:1: ( ( rule__DataRange__Group_4__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5224:1: ( ( rule__DataRange__Group_4__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5225:1: ( rule__DataRange__Group_4__0 )?
            {
             before(grammarAccess.getDataRangeAccess().getGroup_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5226:1: ( rule__DataRange__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==40) ) {
                    int LA33_3 = input.LA(3);

                    if ( (LA33_3==RULE_STRING) ) {
                        alt33=1;
                    }
                }
            }
            switch (alt33) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5226:2: rule__DataRange__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__DataRange__Group_4__0_in_rule__DataRange__Group__4__Impl10444);
                    rule__DataRange__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataRangeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group__4__Impl"


    // $ANTLR start "rule__DataRange__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5236:1: rule__DataRange__Group__5 : rule__DataRange__Group__5__Impl ;
    public final void rule__DataRange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5240:1: ( rule__DataRange__Group__5__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5241:2: rule__DataRange__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DataRange__Group__5__Impl_in_rule__DataRange__Group__510475);
            rule__DataRange__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group__5"


    // $ANTLR start "rule__DataRange__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5247:1: rule__DataRange__Group__5__Impl : ( ( rule__DataRange__Group_5__0 )? ) ;
    public final void rule__DataRange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5251:1: ( ( ( rule__DataRange__Group_5__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5252:1: ( ( rule__DataRange__Group_5__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5252:1: ( ( rule__DataRange__Group_5__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5253:1: ( rule__DataRange__Group_5__0 )?
            {
             before(grammarAccess.getDataRangeAccess().getGroup_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5254:1: ( rule__DataRange__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==40) ) {
                    int LA34_3 = input.LA(3);

                    if ( (LA34_3==RULE_STRING) ) {
                        alt34=1;
                    }
                }
            }
            switch (alt34) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5254:2: rule__DataRange__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__DataRange__Group_5__0_in_rule__DataRange__Group__5__Impl10502);
                    rule__DataRange__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataRangeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group__5__Impl"


    // $ANTLR start "rule__DataRange__Group_4__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5276:1: rule__DataRange__Group_4__0 : rule__DataRange__Group_4__0__Impl rule__DataRange__Group_4__1 ;
    public final void rule__DataRange__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5280:1: ( rule__DataRange__Group_4__0__Impl rule__DataRange__Group_4__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5281:2: rule__DataRange__Group_4__0__Impl rule__DataRange__Group_4__1
            {
            pushFollow(FOLLOW_rule__DataRange__Group_4__0__Impl_in_rule__DataRange__Group_4__010545);
            rule__DataRange__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group_4__1_in_rule__DataRange__Group_4__010548);
            rule__DataRange__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group_4__0"


    // $ANTLR start "rule__DataRange__Group_4__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5288:1: rule__DataRange__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__DataRange__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5292:1: ( ( 'description' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5293:1: ( 'description' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5293:1: ( 'description' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5294:1: 'description'
            {
             before(grammarAccess.getDataRangeAccess().getDescriptionKeyword_4_0()); 
            match(input,46,FOLLOW_46_in_rule__DataRange__Group_4__0__Impl10576); 
             after(grammarAccess.getDataRangeAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group_4__0__Impl"


    // $ANTLR start "rule__DataRange__Group_4__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5307:1: rule__DataRange__Group_4__1 : rule__DataRange__Group_4__1__Impl rule__DataRange__Group_4__2 ;
    public final void rule__DataRange__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5311:1: ( rule__DataRange__Group_4__1__Impl rule__DataRange__Group_4__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5312:2: rule__DataRange__Group_4__1__Impl rule__DataRange__Group_4__2
            {
            pushFollow(FOLLOW_rule__DataRange__Group_4__1__Impl_in_rule__DataRange__Group_4__110607);
            rule__DataRange__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group_4__2_in_rule__DataRange__Group_4__110610);
            rule__DataRange__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group_4__1"


    // $ANTLR start "rule__DataRange__Group_4__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5319:1: rule__DataRange__Group_4__1__Impl : ( ':' ) ;
    public final void rule__DataRange__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5323:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5324:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5324:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5325:1: ':'
            {
             before(grammarAccess.getDataRangeAccess().getColonKeyword_4_1()); 
            match(input,40,FOLLOW_40_in_rule__DataRange__Group_4__1__Impl10638); 
             after(grammarAccess.getDataRangeAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group_4__1__Impl"


    // $ANTLR start "rule__DataRange__Group_4__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5338:1: rule__DataRange__Group_4__2 : rule__DataRange__Group_4__2__Impl ;
    public final void rule__DataRange__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5342:1: ( rule__DataRange__Group_4__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5343:2: rule__DataRange__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__DataRange__Group_4__2__Impl_in_rule__DataRange__Group_4__210669);
            rule__DataRange__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group_4__2"


    // $ANTLR start "rule__DataRange__Group_4__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5349:1: rule__DataRange__Group_4__2__Impl : ( ( rule__DataRange__DescriptionAssignment_4_2 ) ) ;
    public final void rule__DataRange__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5353:1: ( ( ( rule__DataRange__DescriptionAssignment_4_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5354:1: ( ( rule__DataRange__DescriptionAssignment_4_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5354:1: ( ( rule__DataRange__DescriptionAssignment_4_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5355:1: ( rule__DataRange__DescriptionAssignment_4_2 )
            {
             before(grammarAccess.getDataRangeAccess().getDescriptionAssignment_4_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5356:1: ( rule__DataRange__DescriptionAssignment_4_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5356:2: rule__DataRange__DescriptionAssignment_4_2
            {
            pushFollow(FOLLOW_rule__DataRange__DescriptionAssignment_4_2_in_rule__DataRange__Group_4__2__Impl10696);
            rule__DataRange__DescriptionAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDataRangeAccess().getDescriptionAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group_4__2__Impl"


    // $ANTLR start "rule__DataRange__Group_5__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5372:1: rule__DataRange__Group_5__0 : rule__DataRange__Group_5__0__Impl rule__DataRange__Group_5__1 ;
    public final void rule__DataRange__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5376:1: ( rule__DataRange__Group_5__0__Impl rule__DataRange__Group_5__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5377:2: rule__DataRange__Group_5__0__Impl rule__DataRange__Group_5__1
            {
            pushFollow(FOLLOW_rule__DataRange__Group_5__0__Impl_in_rule__DataRange__Group_5__010732);
            rule__DataRange__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group_5__1_in_rule__DataRange__Group_5__010735);
            rule__DataRange__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group_5__0"


    // $ANTLR start "rule__DataRange__Group_5__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5384:1: rule__DataRange__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__DataRange__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5388:1: ( ( 'id' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5389:1: ( 'id' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5389:1: ( 'id' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5390:1: 'id'
            {
             before(grammarAccess.getDataRangeAccess().getIdKeyword_5_0()); 
            match(input,47,FOLLOW_47_in_rule__DataRange__Group_5__0__Impl10763); 
             after(grammarAccess.getDataRangeAccess().getIdKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group_5__0__Impl"


    // $ANTLR start "rule__DataRange__Group_5__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5403:1: rule__DataRange__Group_5__1 : rule__DataRange__Group_5__1__Impl rule__DataRange__Group_5__2 ;
    public final void rule__DataRange__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5407:1: ( rule__DataRange__Group_5__1__Impl rule__DataRange__Group_5__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5408:2: rule__DataRange__Group_5__1__Impl rule__DataRange__Group_5__2
            {
            pushFollow(FOLLOW_rule__DataRange__Group_5__1__Impl_in_rule__DataRange__Group_5__110794);
            rule__DataRange__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group_5__2_in_rule__DataRange__Group_5__110797);
            rule__DataRange__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group_5__1"


    // $ANTLR start "rule__DataRange__Group_5__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5415:1: rule__DataRange__Group_5__1__Impl : ( ':' ) ;
    public final void rule__DataRange__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5419:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5420:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5420:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5421:1: ':'
            {
             before(grammarAccess.getDataRangeAccess().getColonKeyword_5_1()); 
            match(input,40,FOLLOW_40_in_rule__DataRange__Group_5__1__Impl10825); 
             after(grammarAccess.getDataRangeAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group_5__1__Impl"


    // $ANTLR start "rule__DataRange__Group_5__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5434:1: rule__DataRange__Group_5__2 : rule__DataRange__Group_5__2__Impl ;
    public final void rule__DataRange__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5438:1: ( rule__DataRange__Group_5__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5439:2: rule__DataRange__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__DataRange__Group_5__2__Impl_in_rule__DataRange__Group_5__210856);
            rule__DataRange__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group_5__2"


    // $ANTLR start "rule__DataRange__Group_5__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5445:1: rule__DataRange__Group_5__2__Impl : ( ( rule__DataRange__IDAssignment_5_2 ) ) ;
    public final void rule__DataRange__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5449:1: ( ( ( rule__DataRange__IDAssignment_5_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5450:1: ( ( rule__DataRange__IDAssignment_5_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5450:1: ( ( rule__DataRange__IDAssignment_5_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5451:1: ( rule__DataRange__IDAssignment_5_2 )
            {
             before(grammarAccess.getDataRangeAccess().getIDAssignment_5_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5452:1: ( rule__DataRange__IDAssignment_5_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5452:2: rule__DataRange__IDAssignment_5_2
            {
            pushFollow(FOLLOW_rule__DataRange__IDAssignment_5_2_in_rule__DataRange__Group_5__2__Impl10883);
            rule__DataRange__IDAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDataRangeAccess().getIDAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__Group_5__2__Impl"


    // $ANTLR start "rule__DataAdaption__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5468:1: rule__DataAdaption__Group__0 : rule__DataAdaption__Group__0__Impl rule__DataAdaption__Group__1 ;
    public final void rule__DataAdaption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5472:1: ( rule__DataAdaption__Group__0__Impl rule__DataAdaption__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5473:2: rule__DataAdaption__Group__0__Impl rule__DataAdaption__Group__1
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__0__Impl_in_rule__DataAdaption__Group__010919);
            rule__DataAdaption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__1_in_rule__DataAdaption__Group__010922);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5480:1: rule__DataAdaption__Group__0__Impl : ( 'with' ) ;
    public final void rule__DataAdaption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5484:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5485:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5485:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5486:1: 'with'
            {
             before(grammarAccess.getDataAdaptionAccess().getWithKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__DataAdaption__Group__0__Impl10950); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5499:1: rule__DataAdaption__Group__1 : rule__DataAdaption__Group__1__Impl rule__DataAdaption__Group__2 ;
    public final void rule__DataAdaption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5503:1: ( rule__DataAdaption__Group__1__Impl rule__DataAdaption__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5504:2: rule__DataAdaption__Group__1__Impl rule__DataAdaption__Group__2
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__1__Impl_in_rule__DataAdaption__Group__110981);
            rule__DataAdaption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__2_in_rule__DataAdaption__Group__110984);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5511:1: rule__DataAdaption__Group__1__Impl : ( 'scaling factor' ) ;
    public final void rule__DataAdaption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5515:1: ( ( 'scaling factor' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5516:1: ( 'scaling factor' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5516:1: ( 'scaling factor' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5517:1: 'scaling factor'
            {
             before(grammarAccess.getDataAdaptionAccess().getScalingFactorKeyword_1()); 
            match(input,60,FOLLOW_60_in_rule__DataAdaption__Group__1__Impl11012); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5530:1: rule__DataAdaption__Group__2 : rule__DataAdaption__Group__2__Impl rule__DataAdaption__Group__3 ;
    public final void rule__DataAdaption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5534:1: ( rule__DataAdaption__Group__2__Impl rule__DataAdaption__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5535:2: rule__DataAdaption__Group__2__Impl rule__DataAdaption__Group__3
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__2__Impl_in_rule__DataAdaption__Group__211043);
            rule__DataAdaption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__3_in_rule__DataAdaption__Group__211046);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5542:1: rule__DataAdaption__Group__2__Impl : ( ':' ) ;
    public final void rule__DataAdaption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5546:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5547:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5547:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5548:1: ':'
            {
             before(grammarAccess.getDataAdaptionAccess().getColonKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__DataAdaption__Group__2__Impl11074); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5561:1: rule__DataAdaption__Group__3 : rule__DataAdaption__Group__3__Impl rule__DataAdaption__Group__4 ;
    public final void rule__DataAdaption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5565:1: ( rule__DataAdaption__Group__3__Impl rule__DataAdaption__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5566:2: rule__DataAdaption__Group__3__Impl rule__DataAdaption__Group__4
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__3__Impl_in_rule__DataAdaption__Group__311105);
            rule__DataAdaption__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__4_in_rule__DataAdaption__Group__311108);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5573:1: rule__DataAdaption__Group__3__Impl : ( ( rule__DataAdaption__ScalingFactorAssignment_3 ) ) ;
    public final void rule__DataAdaption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5577:1: ( ( ( rule__DataAdaption__ScalingFactorAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5578:1: ( ( rule__DataAdaption__ScalingFactorAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5578:1: ( ( rule__DataAdaption__ScalingFactorAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5579:1: ( rule__DataAdaption__ScalingFactorAssignment_3 )
            {
             before(grammarAccess.getDataAdaptionAccess().getScalingFactorAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5580:1: ( rule__DataAdaption__ScalingFactorAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5580:2: rule__DataAdaption__ScalingFactorAssignment_3
            {
            pushFollow(FOLLOW_rule__DataAdaption__ScalingFactorAssignment_3_in_rule__DataAdaption__Group__3__Impl11135);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5590:1: rule__DataAdaption__Group__4 : rule__DataAdaption__Group__4__Impl rule__DataAdaption__Group__5 ;
    public final void rule__DataAdaption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5594:1: ( rule__DataAdaption__Group__4__Impl rule__DataAdaption__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5595:2: rule__DataAdaption__Group__4__Impl rule__DataAdaption__Group__5
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__4__Impl_in_rule__DataAdaption__Group__411165);
            rule__DataAdaption__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__5_in_rule__DataAdaption__Group__411168);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5602:1: rule__DataAdaption__Group__4__Impl : ( 'and' ) ;
    public final void rule__DataAdaption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5606:1: ( ( 'and' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5607:1: ( 'and' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5607:1: ( 'and' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5608:1: 'and'
            {
             before(grammarAccess.getDataAdaptionAccess().getAndKeyword_4()); 
            match(input,61,FOLLOW_61_in_rule__DataAdaption__Group__4__Impl11196); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5621:1: rule__DataAdaption__Group__5 : rule__DataAdaption__Group__5__Impl rule__DataAdaption__Group__6 ;
    public final void rule__DataAdaption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5625:1: ( rule__DataAdaption__Group__5__Impl rule__DataAdaption__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5626:2: rule__DataAdaption__Group__5__Impl rule__DataAdaption__Group__6
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__5__Impl_in_rule__DataAdaption__Group__511227);
            rule__DataAdaption__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__6_in_rule__DataAdaption__Group__511230);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5633:1: rule__DataAdaption__Group__5__Impl : ( 'offset' ) ;
    public final void rule__DataAdaption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5637:1: ( ( 'offset' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5638:1: ( 'offset' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5638:1: ( 'offset' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5639:1: 'offset'
            {
             before(grammarAccess.getDataAdaptionAccess().getOffsetKeyword_5()); 
            match(input,62,FOLLOW_62_in_rule__DataAdaption__Group__5__Impl11258); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5652:1: rule__DataAdaption__Group__6 : rule__DataAdaption__Group__6__Impl rule__DataAdaption__Group__7 ;
    public final void rule__DataAdaption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5656:1: ( rule__DataAdaption__Group__6__Impl rule__DataAdaption__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5657:2: rule__DataAdaption__Group__6__Impl rule__DataAdaption__Group__7
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__6__Impl_in_rule__DataAdaption__Group__611289);
            rule__DataAdaption__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__7_in_rule__DataAdaption__Group__611292);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5664:1: rule__DataAdaption__Group__6__Impl : ( ':' ) ;
    public final void rule__DataAdaption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5668:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5669:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5669:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5670:1: ':'
            {
             before(grammarAccess.getDataAdaptionAccess().getColonKeyword_6()); 
            match(input,40,FOLLOW_40_in_rule__DataAdaption__Group__6__Impl11320); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5683:1: rule__DataAdaption__Group__7 : rule__DataAdaption__Group__7__Impl rule__DataAdaption__Group__8 ;
    public final void rule__DataAdaption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5687:1: ( rule__DataAdaption__Group__7__Impl rule__DataAdaption__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5688:2: rule__DataAdaption__Group__7__Impl rule__DataAdaption__Group__8
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__7__Impl_in_rule__DataAdaption__Group__711351);
            rule__DataAdaption__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__8_in_rule__DataAdaption__Group__711354);
            rule__DataAdaption__Group__8();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5695:1: rule__DataAdaption__Group__7__Impl : ( ( rule__DataAdaption__OffsetAssignment_7 ) ) ;
    public final void rule__DataAdaption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5699:1: ( ( ( rule__DataAdaption__OffsetAssignment_7 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5700:1: ( ( rule__DataAdaption__OffsetAssignment_7 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5700:1: ( ( rule__DataAdaption__OffsetAssignment_7 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5701:1: ( rule__DataAdaption__OffsetAssignment_7 )
            {
             before(grammarAccess.getDataAdaptionAccess().getOffsetAssignment_7()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5702:1: ( rule__DataAdaption__OffsetAssignment_7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5702:2: rule__DataAdaption__OffsetAssignment_7
            {
            pushFollow(FOLLOW_rule__DataAdaption__OffsetAssignment_7_in_rule__DataAdaption__Group__7__Impl11381);
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


    // $ANTLR start "rule__DataAdaption__Group__8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5712:1: rule__DataAdaption__Group__8 : rule__DataAdaption__Group__8__Impl rule__DataAdaption__Group__9 ;
    public final void rule__DataAdaption__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5716:1: ( rule__DataAdaption__Group__8__Impl rule__DataAdaption__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5717:2: rule__DataAdaption__Group__8__Impl rule__DataAdaption__Group__9
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__8__Impl_in_rule__DataAdaption__Group__811411);
            rule__DataAdaption__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group__9_in_rule__DataAdaption__Group__811414);
            rule__DataAdaption__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group__8"


    // $ANTLR start "rule__DataAdaption__Group__8__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5724:1: rule__DataAdaption__Group__8__Impl : ( ( rule__DataAdaption__Group_8__0 )? ) ;
    public final void rule__DataAdaption__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5728:1: ( ( ( rule__DataAdaption__Group_8__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5729:1: ( ( rule__DataAdaption__Group_8__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5729:1: ( ( rule__DataAdaption__Group_8__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5730:1: ( rule__DataAdaption__Group_8__0 )?
            {
             before(grammarAccess.getDataAdaptionAccess().getGroup_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5731:1: ( rule__DataAdaption__Group_8__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==40) ) {
                    int LA35_3 = input.LA(3);

                    if ( (LA35_3==RULE_STRING) ) {
                        alt35=1;
                    }
                }
            }
            switch (alt35) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5731:2: rule__DataAdaption__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__DataAdaption__Group_8__0_in_rule__DataAdaption__Group__8__Impl11441);
                    rule__DataAdaption__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAdaptionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group__8__Impl"


    // $ANTLR start "rule__DataAdaption__Group__9"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5741:1: rule__DataAdaption__Group__9 : rule__DataAdaption__Group__9__Impl ;
    public final void rule__DataAdaption__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5745:1: ( rule__DataAdaption__Group__9__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5746:2: rule__DataAdaption__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group__9__Impl_in_rule__DataAdaption__Group__911472);
            rule__DataAdaption__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group__9"


    // $ANTLR start "rule__DataAdaption__Group__9__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5752:1: rule__DataAdaption__Group__9__Impl : ( ( rule__DataAdaption__Group_9__0 )? ) ;
    public final void rule__DataAdaption__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5756:1: ( ( ( rule__DataAdaption__Group_9__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5757:1: ( ( rule__DataAdaption__Group_9__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5757:1: ( ( rule__DataAdaption__Group_9__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5758:1: ( rule__DataAdaption__Group_9__0 )?
            {
             before(grammarAccess.getDataAdaptionAccess().getGroup_9()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5759:1: ( rule__DataAdaption__Group_9__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==40) ) {
                    int LA36_3 = input.LA(3);

                    if ( (LA36_3==RULE_STRING) ) {
                        alt36=1;
                    }
                }
            }
            switch (alt36) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5759:2: rule__DataAdaption__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__DataAdaption__Group_9__0_in_rule__DataAdaption__Group__9__Impl11499);
                    rule__DataAdaption__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAdaptionAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group__9__Impl"


    // $ANTLR start "rule__DataAdaption__Group_8__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5789:1: rule__DataAdaption__Group_8__0 : rule__DataAdaption__Group_8__0__Impl rule__DataAdaption__Group_8__1 ;
    public final void rule__DataAdaption__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5793:1: ( rule__DataAdaption__Group_8__0__Impl rule__DataAdaption__Group_8__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5794:2: rule__DataAdaption__Group_8__0__Impl rule__DataAdaption__Group_8__1
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group_8__0__Impl_in_rule__DataAdaption__Group_8__011550);
            rule__DataAdaption__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group_8__1_in_rule__DataAdaption__Group_8__011553);
            rule__DataAdaption__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group_8__0"


    // $ANTLR start "rule__DataAdaption__Group_8__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5801:1: rule__DataAdaption__Group_8__0__Impl : ( 'description' ) ;
    public final void rule__DataAdaption__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5805:1: ( ( 'description' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5806:1: ( 'description' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5806:1: ( 'description' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5807:1: 'description'
            {
             before(grammarAccess.getDataAdaptionAccess().getDescriptionKeyword_8_0()); 
            match(input,46,FOLLOW_46_in_rule__DataAdaption__Group_8__0__Impl11581); 
             after(grammarAccess.getDataAdaptionAccess().getDescriptionKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group_8__0__Impl"


    // $ANTLR start "rule__DataAdaption__Group_8__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5820:1: rule__DataAdaption__Group_8__1 : rule__DataAdaption__Group_8__1__Impl rule__DataAdaption__Group_8__2 ;
    public final void rule__DataAdaption__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5824:1: ( rule__DataAdaption__Group_8__1__Impl rule__DataAdaption__Group_8__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5825:2: rule__DataAdaption__Group_8__1__Impl rule__DataAdaption__Group_8__2
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group_8__1__Impl_in_rule__DataAdaption__Group_8__111612);
            rule__DataAdaption__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group_8__2_in_rule__DataAdaption__Group_8__111615);
            rule__DataAdaption__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group_8__1"


    // $ANTLR start "rule__DataAdaption__Group_8__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5832:1: rule__DataAdaption__Group_8__1__Impl : ( ':' ) ;
    public final void rule__DataAdaption__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5836:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5837:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5837:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5838:1: ':'
            {
             before(grammarAccess.getDataAdaptionAccess().getColonKeyword_8_1()); 
            match(input,40,FOLLOW_40_in_rule__DataAdaption__Group_8__1__Impl11643); 
             after(grammarAccess.getDataAdaptionAccess().getColonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group_8__1__Impl"


    // $ANTLR start "rule__DataAdaption__Group_8__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5851:1: rule__DataAdaption__Group_8__2 : rule__DataAdaption__Group_8__2__Impl ;
    public final void rule__DataAdaption__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5855:1: ( rule__DataAdaption__Group_8__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5856:2: rule__DataAdaption__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group_8__2__Impl_in_rule__DataAdaption__Group_8__211674);
            rule__DataAdaption__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group_8__2"


    // $ANTLR start "rule__DataAdaption__Group_8__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5862:1: rule__DataAdaption__Group_8__2__Impl : ( ( rule__DataAdaption__DescriptionAssignment_8_2 ) ) ;
    public final void rule__DataAdaption__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5866:1: ( ( ( rule__DataAdaption__DescriptionAssignment_8_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5867:1: ( ( rule__DataAdaption__DescriptionAssignment_8_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5867:1: ( ( rule__DataAdaption__DescriptionAssignment_8_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5868:1: ( rule__DataAdaption__DescriptionAssignment_8_2 )
            {
             before(grammarAccess.getDataAdaptionAccess().getDescriptionAssignment_8_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5869:1: ( rule__DataAdaption__DescriptionAssignment_8_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5869:2: rule__DataAdaption__DescriptionAssignment_8_2
            {
            pushFollow(FOLLOW_rule__DataAdaption__DescriptionAssignment_8_2_in_rule__DataAdaption__Group_8__2__Impl11701);
            rule__DataAdaption__DescriptionAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getDataAdaptionAccess().getDescriptionAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group_8__2__Impl"


    // $ANTLR start "rule__DataAdaption__Group_9__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5885:1: rule__DataAdaption__Group_9__0 : rule__DataAdaption__Group_9__0__Impl rule__DataAdaption__Group_9__1 ;
    public final void rule__DataAdaption__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5889:1: ( rule__DataAdaption__Group_9__0__Impl rule__DataAdaption__Group_9__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5890:2: rule__DataAdaption__Group_9__0__Impl rule__DataAdaption__Group_9__1
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group_9__0__Impl_in_rule__DataAdaption__Group_9__011737);
            rule__DataAdaption__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group_9__1_in_rule__DataAdaption__Group_9__011740);
            rule__DataAdaption__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group_9__0"


    // $ANTLR start "rule__DataAdaption__Group_9__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5897:1: rule__DataAdaption__Group_9__0__Impl : ( 'id' ) ;
    public final void rule__DataAdaption__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5901:1: ( ( 'id' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5902:1: ( 'id' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5902:1: ( 'id' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5903:1: 'id'
            {
             before(grammarAccess.getDataAdaptionAccess().getIdKeyword_9_0()); 
            match(input,47,FOLLOW_47_in_rule__DataAdaption__Group_9__0__Impl11768); 
             after(grammarAccess.getDataAdaptionAccess().getIdKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group_9__0__Impl"


    // $ANTLR start "rule__DataAdaption__Group_9__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5916:1: rule__DataAdaption__Group_9__1 : rule__DataAdaption__Group_9__1__Impl rule__DataAdaption__Group_9__2 ;
    public final void rule__DataAdaption__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5920:1: ( rule__DataAdaption__Group_9__1__Impl rule__DataAdaption__Group_9__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5921:2: rule__DataAdaption__Group_9__1__Impl rule__DataAdaption__Group_9__2
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group_9__1__Impl_in_rule__DataAdaption__Group_9__111799);
            rule__DataAdaption__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAdaption__Group_9__2_in_rule__DataAdaption__Group_9__111802);
            rule__DataAdaption__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group_9__1"


    // $ANTLR start "rule__DataAdaption__Group_9__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5928:1: rule__DataAdaption__Group_9__1__Impl : ( ':' ) ;
    public final void rule__DataAdaption__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5932:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5933:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5933:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5934:1: ':'
            {
             before(grammarAccess.getDataAdaptionAccess().getColonKeyword_9_1()); 
            match(input,40,FOLLOW_40_in_rule__DataAdaption__Group_9__1__Impl11830); 
             after(grammarAccess.getDataAdaptionAccess().getColonKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group_9__1__Impl"


    // $ANTLR start "rule__DataAdaption__Group_9__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5947:1: rule__DataAdaption__Group_9__2 : rule__DataAdaption__Group_9__2__Impl ;
    public final void rule__DataAdaption__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5951:1: ( rule__DataAdaption__Group_9__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5952:2: rule__DataAdaption__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__DataAdaption__Group_9__2__Impl_in_rule__DataAdaption__Group_9__211861);
            rule__DataAdaption__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group_9__2"


    // $ANTLR start "rule__DataAdaption__Group_9__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5958:1: rule__DataAdaption__Group_9__2__Impl : ( ( rule__DataAdaption__IDAssignment_9_2 ) ) ;
    public final void rule__DataAdaption__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5962:1: ( ( ( rule__DataAdaption__IDAssignment_9_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5963:1: ( ( rule__DataAdaption__IDAssignment_9_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5963:1: ( ( rule__DataAdaption__IDAssignment_9_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5964:1: ( rule__DataAdaption__IDAssignment_9_2 )
            {
             before(grammarAccess.getDataAdaptionAccess().getIDAssignment_9_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5965:1: ( rule__DataAdaption__IDAssignment_9_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5965:2: rule__DataAdaption__IDAssignment_9_2
            {
            pushFollow(FOLLOW_rule__DataAdaption__IDAssignment_9_2_in_rule__DataAdaption__Group_9__2__Impl11888);
            rule__DataAdaption__IDAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getDataAdaptionAccess().getIDAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__Group_9__2__Impl"


    // $ANTLR start "rule__Bound__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5981:1: rule__Bound__Group__0 : rule__Bound__Group__0__Impl rule__Bound__Group__1 ;
    public final void rule__Bound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5985:1: ( rule__Bound__Group__0__Impl rule__Bound__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5986:2: rule__Bound__Group__0__Impl rule__Bound__Group__1
            {
            pushFollow(FOLLOW_rule__Bound__Group__0__Impl_in_rule__Bound__Group__011924);
            rule__Bound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bound__Group__1_in_rule__Bound__Group__011927);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5993:1: rule__Bound__Group__0__Impl : ( ( rule__Bound__ValueAssignment_0 ) ) ;
    public final void rule__Bound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5997:1: ( ( ( rule__Bound__ValueAssignment_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5998:1: ( ( rule__Bound__ValueAssignment_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5998:1: ( ( rule__Bound__ValueAssignment_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5999:1: ( rule__Bound__ValueAssignment_0 )
            {
             before(grammarAccess.getBoundAccess().getValueAssignment_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6000:1: ( rule__Bound__ValueAssignment_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6000:2: rule__Bound__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__Bound__ValueAssignment_0_in_rule__Bound__Group__0__Impl11954);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6010:1: rule__Bound__Group__1 : rule__Bound__Group__1__Impl ;
    public final void rule__Bound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6014:1: ( rule__Bound__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6015:2: rule__Bound__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Bound__Group__1__Impl_in_rule__Bound__Group__111984);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6021:1: rule__Bound__Group__1__Impl : ( ( rule__Bound__UnitAssignment_1 )? ) ;
    public final void rule__Bound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6025:1: ( ( ( rule__Bound__UnitAssignment_1 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6026:1: ( ( rule__Bound__UnitAssignment_1 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6026:1: ( ( rule__Bound__UnitAssignment_1 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6027:1: ( rule__Bound__UnitAssignment_1 )?
            {
             before(grammarAccess.getBoundAccess().getUnitAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6028:1: ( rule__Bound__UnitAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6028:2: rule__Bound__UnitAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Bound__UnitAssignment_1_in_rule__Bound__Group__1__Impl12011);
                    rule__Bound__UnitAssignment_1();

                    state._fsp--;


                    }
                    break;

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


    // $ANTLR start "rule__DOUBLE__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6042:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6046:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6047:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__012046);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__012049);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6054:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6058:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6059:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6059:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6060:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl12076); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6071:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6075:1: ( rule__DOUBLE__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6076:2: rule__DOUBLE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__112105);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6082:1: rule__DOUBLE__Group__1__Impl : ( ( rule__DOUBLE__Group_1__0 )? ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6086:1: ( ( ( rule__DOUBLE__Group_1__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6087:1: ( ( rule__DOUBLE__Group_1__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6087:1: ( ( rule__DOUBLE__Group_1__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6088:1: ( rule__DOUBLE__Group_1__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6089:1: ( rule__DOUBLE__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==63) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6089:2: rule__DOUBLE__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl12132);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6103:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6107:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6108:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__012167);
            rule__DOUBLE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__012170);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6115:1: rule__DOUBLE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6119:1: ( ( '.' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6120:1: ( '.' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6120:1: ( '.' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6121:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
            match(input,63,FOLLOW_63_in_rule__DOUBLE__Group_1__0__Impl12198); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6134:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6138:1: ( rule__DOUBLE__Group_1__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6139:2: rule__DOUBLE__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__112229);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6145:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6149:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6150:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6150:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6151:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl12256); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6167:1: rule__DataModel__OptionsAssignment_4 : ( ruleOptions ) ;
    public final void rule__DataModel__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6171:1: ( ( ruleOptions ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6172:1: ( ruleOptions )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6172:1: ( ruleOptions )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6173:1: ruleOptions
            {
             before(grammarAccess.getDataModelAccess().getOptionsOptionsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleOptions_in_rule__DataModel__OptionsAssignment_412294);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6182:1: rule__DataModel__RepresentationsAssignment_6_0 : ( ruleRepresentation ) ;
    public final void rule__DataModel__RepresentationsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6186:1: ( ( ruleRepresentation ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6187:1: ( ruleRepresentation )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6187:1: ( ruleRepresentation )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6188:1: ruleRepresentation
            {
             before(grammarAccess.getDataModelAccess().getRepresentationsRepresentationParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleRepresentation_in_rule__DataModel__RepresentationsAssignment_6_012325);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6197:1: rule__DataModel__DatafieldsAssignment_6_1 : ( ruleDatafield ) ;
    public final void rule__DataModel__DatafieldsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6201:1: ( ( ruleDatafield ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6202:1: ( ruleDatafield )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6202:1: ( ruleDatafield )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6203:1: ruleDatafield
            {
             before(grammarAccess.getDataModelAccess().getDatafieldsDatafieldParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleDatafield_in_rule__DataModel__DatafieldsAssignment_6_112356);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6212:1: rule__DataModel__TransmitAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__DataModel__TransmitAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6216:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6217:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6217:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6218:1: ( RULE_ID )
            {
             before(grammarAccess.getDataModelAccess().getTransmitDatafieldCrossReference_8_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6219:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6220:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getTransmitDatafieldIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_812391); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6231:1: rule__DataModel__TransmitAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataModel__TransmitAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6235:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6236:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6236:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6237:1: ( RULE_ID )
            {
             before(grammarAccess.getDataModelAccess().getTransmitDatafieldCrossReference_9_1_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6238:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6239:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getTransmitDatafieldIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_9_112430); 
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


    // $ANTLR start "rule__Options__EndianessAssignment_1_0_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6250:1: rule__Options__EndianessAssignment_1_0_2 : ( ruleEndianess ) ;
    public final void rule__Options__EndianessAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6254:1: ( ( ruleEndianess ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6255:1: ( ruleEndianess )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6255:1: ( ruleEndianess )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6256:1: ruleEndianess
            {
             before(grammarAccess.getOptionsAccess().getEndianessEndianessEnumRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_ruleEndianess_in_rule__Options__EndianessAssignment_1_0_212465);
            ruleEndianess();

            state._fsp--;

             after(grammarAccess.getOptionsAccess().getEndianessEndianessEnumRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__EndianessAssignment_1_0_2"


    // $ANTLR start "rule__Options__SensorLanguageAssignment_1_1_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6265:1: rule__Options__SensorLanguageAssignment_1_1_3 : ( ruleGenerationLanguage ) ;
    public final void rule__Options__SensorLanguageAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6269:1: ( ( ruleGenerationLanguage ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6270:1: ( ruleGenerationLanguage )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6270:1: ( ruleGenerationLanguage )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6271:1: ruleGenerationLanguage
            {
             before(grammarAccess.getOptionsAccess().getSensorLanguageGenerationLanguageEnumRuleCall_1_1_3_0()); 
            pushFollow(FOLLOW_ruleGenerationLanguage_in_rule__Options__SensorLanguageAssignment_1_1_312496);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6280:1: rule__Options__ReceiverLanguageAssignment_1_2_3 : ( ruleGenerationLanguage ) ;
    public final void rule__Options__ReceiverLanguageAssignment_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6284:1: ( ( ruleGenerationLanguage ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6285:1: ( ruleGenerationLanguage )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6285:1: ( ruleGenerationLanguage )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6286:1: ruleGenerationLanguage
            {
             before(grammarAccess.getOptionsAccess().getReceiverLanguageGenerationLanguageEnumRuleCall_1_2_3_0()); 
            pushFollow(FOLLOW_ruleGenerationLanguage_in_rule__Options__ReceiverLanguageAssignment_1_2_312527);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6295:1: rule__Representation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Representation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6299:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6300:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6300:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6301:1: RULE_ID
            {
             before(grammarAccess.getRepresentationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Representation__NameAssignment_112558); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6310:1: rule__Representation__ByteCountAssignment_3 : ( RULE_INT ) ;
    public final void rule__Representation__ByteCountAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6314:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6315:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6315:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6316:1: RULE_INT
            {
             before(grammarAccess.getRepresentationAccess().getByteCountINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Representation__ByteCountAssignment_312589); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6325:1: rule__Representation__TypeAssignment_6 : ( ruleType ) ;
    public final void rule__Representation__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6329:1: ( ( ruleType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6330:1: ( ruleType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6330:1: ( ruleType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6331:1: ruleType
            {
             before(grammarAccess.getRepresentationAccess().getTypeTypeEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Representation__TypeAssignment_612620);
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


    // $ANTLR start "rule__Representation__DescriptionAssignment_7_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6340:1: rule__Representation__DescriptionAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__Representation__DescriptionAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6344:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6345:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6345:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6346:1: RULE_STRING
            {
             before(grammarAccess.getRepresentationAccess().getDescriptionSTRINGTerminalRuleCall_7_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Representation__DescriptionAssignment_7_212651); 
             after(grammarAccess.getRepresentationAccess().getDescriptionSTRINGTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__DescriptionAssignment_7_2"


    // $ANTLR start "rule__Representation__IDAssignment_8_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6355:1: rule__Representation__IDAssignment_8_2 : ( RULE_STRING ) ;
    public final void rule__Representation__IDAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6359:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6360:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6360:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6361:1: RULE_STRING
            {
             before(grammarAccess.getRepresentationAccess().getIDSTRINGTerminalRuleCall_8_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Representation__IDAssignment_8_212682); 
             after(grammarAccess.getRepresentationAccess().getIDSTRINGTerminalRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Representation__IDAssignment_8_2"


    // $ANTLR start "rule__MeasuredData__NameAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6370:1: rule__MeasuredData__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MeasuredData__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6374:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6375:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6375:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6376:1: RULE_ID
            {
             before(grammarAccess.getMeasuredDataAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MeasuredData__NameAssignment_212713); 
             after(grammarAccess.getMeasuredDataAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__NameAssignment_2"


    // $ANTLR start "rule__MeasuredData__ScaleAssignment_3_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6385:1: rule__MeasuredData__ScaleAssignment_3_1 : ( ruleDOUBLE ) ;
    public final void rule__MeasuredData__ScaleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6389:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6390:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6390:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6391:1: ruleDOUBLE
            {
             before(grammarAccess.getMeasuredDataAccess().getScaleDOUBLEParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__MeasuredData__ScaleAssignment_3_112744);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getMeasuredDataAccess().getScaleDOUBLEParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__ScaleAssignment_3_1"


    // $ANTLR start "rule__MeasuredData__UnitAssignment_3_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6400:1: rule__MeasuredData__UnitAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__MeasuredData__UnitAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6404:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6405:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6405:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6406:1: RULE_STRING
            {
             before(grammarAccess.getMeasuredDataAccess().getUnitSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MeasuredData__UnitAssignment_3_212775); 
             after(grammarAccess.getMeasuredDataAccess().getUnitSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__UnitAssignment_3_2"


    // $ANTLR start "rule__MeasuredData__RepresentationAssignment_5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6415:1: rule__MeasuredData__RepresentationAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__MeasuredData__RepresentationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6419:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6420:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6420:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6421:1: ( RULE_ID )
            {
             before(grammarAccess.getMeasuredDataAccess().getRepresentationRepresentationCrossReference_5_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6422:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6423:1: RULE_ID
            {
             before(grammarAccess.getMeasuredDataAccess().getRepresentationRepresentationIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MeasuredData__RepresentationAssignment_512810); 
             after(grammarAccess.getMeasuredDataAccess().getRepresentationRepresentationIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMeasuredDataAccess().getRepresentationRepresentationCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__RepresentationAssignment_5"


    // $ANTLR start "rule__MeasuredData__DescriptionAssignment_6_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6434:1: rule__MeasuredData__DescriptionAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__MeasuredData__DescriptionAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6438:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6439:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6439:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6440:1: RULE_STRING
            {
             before(grammarAccess.getMeasuredDataAccess().getDescriptionSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MeasuredData__DescriptionAssignment_6_212845); 
             after(grammarAccess.getMeasuredDataAccess().getDescriptionSTRINGTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__DescriptionAssignment_6_2"


    // $ANTLR start "rule__MeasuredData__IDAssignment_7_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6449:1: rule__MeasuredData__IDAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__MeasuredData__IDAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6453:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6454:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6454:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6455:1: RULE_STRING
            {
             before(grammarAccess.getMeasuredDataAccess().getIDSTRINGTerminalRuleCall_7_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MeasuredData__IDAssignment_7_212876); 
             after(grammarAccess.getMeasuredDataAccess().getIDSTRINGTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__IDAssignment_7_2"


    // $ANTLR start "rule__MeasuredData__ConstraintsAssignment_8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6464:1: rule__MeasuredData__ConstraintsAssignment_8 : ( ruleDataConstraint ) ;
    public final void rule__MeasuredData__ConstraintsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6468:1: ( ( ruleDataConstraint ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6469:1: ( ruleDataConstraint )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6469:1: ( ruleDataConstraint )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6470:1: ruleDataConstraint
            {
             before(grammarAccess.getMeasuredDataAccess().getConstraintsDataConstraintParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleDataConstraint_in_rule__MeasuredData__ConstraintsAssignment_812907);
            ruleDataConstraint();

            state._fsp--;

             after(grammarAccess.getMeasuredDataAccess().getConstraintsDataConstraintParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredData__ConstraintsAssignment_8"


    // $ANTLR start "rule__NonMeasuredData__TypeAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6479:1: rule__NonMeasuredData__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__NonMeasuredData__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6483:1: ( ( ruleType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6484:1: ( ruleType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6484:1: ( ruleType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6485:1: ruleType
            {
             before(grammarAccess.getNonMeasuredDataAccess().getTypeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__NonMeasuredData__TypeAssignment_112938);
            ruleType();

            state._fsp--;

             after(grammarAccess.getNonMeasuredDataAccess().getTypeTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__TypeAssignment_1"


    // $ANTLR start "rule__NonMeasuredData__NameAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6494:1: rule__NonMeasuredData__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__NonMeasuredData__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6498:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6499:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6499:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6500:1: RULE_ID
            {
             before(grammarAccess.getNonMeasuredDataAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NonMeasuredData__NameAssignment_212969); 
             after(grammarAccess.getNonMeasuredDataAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__NameAssignment_2"


    // $ANTLR start "rule__NonMeasuredData__RepresentationAssignment_4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6509:1: rule__NonMeasuredData__RepresentationAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__NonMeasuredData__RepresentationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6513:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6514:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6514:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6515:1: ( RULE_ID )
            {
             before(grammarAccess.getNonMeasuredDataAccess().getRepresentationRepresentationCrossReference_4_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6516:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6517:1: RULE_ID
            {
             before(grammarAccess.getNonMeasuredDataAccess().getRepresentationRepresentationIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NonMeasuredData__RepresentationAssignment_413004); 
             after(grammarAccess.getNonMeasuredDataAccess().getRepresentationRepresentationIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getNonMeasuredDataAccess().getRepresentationRepresentationCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__RepresentationAssignment_4"


    // $ANTLR start "rule__NonMeasuredData__DescriptionAssignment_5_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6528:1: rule__NonMeasuredData__DescriptionAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasuredData__DescriptionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6532:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6533:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6533:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6534:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasuredDataAccess().getDescriptionSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NonMeasuredData__DescriptionAssignment_5_213039); 
             after(grammarAccess.getNonMeasuredDataAccess().getDescriptionSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__DescriptionAssignment_5_2"


    // $ANTLR start "rule__NonMeasuredData__IDAssignment_6_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6543:1: rule__NonMeasuredData__IDAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasuredData__IDAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6547:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6548:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6548:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6549:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasuredDataAccess().getIDSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NonMeasuredData__IDAssignment_6_213070); 
             after(grammarAccess.getNonMeasuredDataAccess().getIDSTRINGTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasuredData__IDAssignment_6_2"


    // $ANTLR start "rule__ConstantData__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6558:1: rule__ConstantData__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConstantData__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6562:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6563:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6563:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6564:1: RULE_ID
            {
             before(grammarAccess.getConstantDataAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantData__NameAssignment_113101); 
             after(grammarAccess.getConstantDataAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__NameAssignment_1"


    // $ANTLR start "rule__ConstantData__RepresentationAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6573:1: rule__ConstantData__RepresentationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConstantData__RepresentationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6577:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6578:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6578:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6579:1: ( RULE_ID )
            {
             before(grammarAccess.getConstantDataAccess().getRepresentationRepresentationCrossReference_3_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6580:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6581:1: RULE_ID
            {
             before(grammarAccess.getConstantDataAccess().getRepresentationRepresentationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantData__RepresentationAssignment_313136); 
             after(grammarAccess.getConstantDataAccess().getRepresentationRepresentationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConstantDataAccess().getRepresentationRepresentationCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__RepresentationAssignment_3"


    // $ANTLR start "rule__ConstantData__ConstValueAssignment_4_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6592:1: rule__ConstantData__ConstValueAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ConstantData__ConstValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6596:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6597:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6597:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6598:1: RULE_STRING
            {
             before(grammarAccess.getConstantDataAccess().getConstValueSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ConstantData__ConstValueAssignment_4_113171); 
             after(grammarAccess.getConstantDataAccess().getConstValueSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__ConstValueAssignment_4_1"


    // $ANTLR start "rule__ConstantData__DescriptionAssignment_5_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6607:1: rule__ConstantData__DescriptionAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__ConstantData__DescriptionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6611:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6612:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6612:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6613:1: RULE_STRING
            {
             before(grammarAccess.getConstantDataAccess().getDescriptionSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ConstantData__DescriptionAssignment_5_213202); 
             after(grammarAccess.getConstantDataAccess().getDescriptionSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__DescriptionAssignment_5_2"


    // $ANTLR start "rule__ConstantData__IDAssignment_6_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6622:1: rule__ConstantData__IDAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__ConstantData__IDAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6626:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6627:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6627:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6628:1: RULE_STRING
            {
             before(grammarAccess.getConstantDataAccess().getIDSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ConstantData__IDAssignment_6_213233); 
             after(grammarAccess.getConstantDataAccess().getIDSTRINGTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantData__IDAssignment_6_2"


    // $ANTLR start "rule__Calculated__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6637:1: rule__Calculated__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Calculated__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6641:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6642:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6642:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6643:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__NameAssignment_113264); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6652:1: rule__Calculated__RepresentationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Calculated__RepresentationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6656:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6657:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6657:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6658:1: ( RULE_ID )
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationRepresentationCrossReference_3_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6659:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6660:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getRepresentationRepresentationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__RepresentationAssignment_313299); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6671:1: rule__Calculated__MethodNameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Calculated__MethodNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6675:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6676:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6676:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6677:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__MethodNameAssignment_513334); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6686:1: rule__Calculated__MethodNameOutAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Calculated__MethodNameOutAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6690:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6691:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6691:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6692:1: RULE_ID
            {
             before(grammarAccess.getCalculatedAccess().getMethodNameOutIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calculated__MethodNameOutAssignment_6_113365); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6701:1: rule__Calculated__ParameterAssignment_8 : ( ruleParameter ) ;
    public final void rule__Calculated__ParameterAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6705:1: ( ( ruleParameter ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6706:1: ( ruleParameter )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6706:1: ( ruleParameter )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6707:1: ruleParameter
            {
             before(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_813396);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6716:1: rule__Calculated__ParameterAssignment_9_1 : ( ruleParameter ) ;
    public final void rule__Calculated__ParameterAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6720:1: ( ( ruleParameter ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6721:1: ( ruleParameter )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6721:1: ( ruleParameter )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6722:1: ruleParameter
            {
             before(grammarAccess.getCalculatedAccess().getParameterParameterParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_9_113427);
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


    // $ANTLR start "rule__Calculated__DescriptionAssignment_10_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6731:1: rule__Calculated__DescriptionAssignment_10_2 : ( RULE_STRING ) ;
    public final void rule__Calculated__DescriptionAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6735:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6736:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6736:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6737:1: RULE_STRING
            {
             before(grammarAccess.getCalculatedAccess().getDescriptionSTRINGTerminalRuleCall_10_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Calculated__DescriptionAssignment_10_213458); 
             after(grammarAccess.getCalculatedAccess().getDescriptionSTRINGTerminalRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__DescriptionAssignment_10_2"


    // $ANTLR start "rule__Calculated__IDAssignment_11_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6746:1: rule__Calculated__IDAssignment_11_2 : ( RULE_STRING ) ;
    public final void rule__Calculated__IDAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6750:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6751:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6751:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6752:1: RULE_STRING
            {
             before(grammarAccess.getCalculatedAccess().getIDSTRINGTerminalRuleCall_11_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Calculated__IDAssignment_11_213489); 
             after(grammarAccess.getCalculatedAccess().getIDSTRINGTerminalRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculated__IDAssignment_11_2"


    // $ANTLR start "rule__Parameter__DatafieldAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6761:1: rule__Parameter__DatafieldAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__DatafieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6765:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6766:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6766:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6767:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getDatafieldDatafieldCrossReference_1_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6768:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6769:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getDatafieldDatafieldIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__DatafieldAssignment_113524); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6780:1: rule__Parameter__ArgumentTypeAssignment_2_1 : ( ruleArgumentType ) ;
    public final void rule__Parameter__ArgumentTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6784:1: ( ( ruleArgumentType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6785:1: ( ruleArgumentType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6785:1: ( ruleArgumentType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6786:1: ruleArgumentType
            {
             before(grammarAccess.getParameterAccess().getArgumentTypeArgumentTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleArgumentType_in_rule__Parameter__ArgumentTypeAssignment_2_113559);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6795:1: rule__Datastructure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datastructure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6799:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6800:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6800:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6801:1: RULE_ID
            {
             before(grammarAccess.getDatastructureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Datastructure__NameAssignment_113590); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6810:1: rule__Datastructure__DatafieldsAssignment_3 : ( ruleDatafield ) ;
    public final void rule__Datastructure__DatafieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6814:1: ( ( ruleDatafield ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6815:1: ( ruleDatafield )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6815:1: ( ruleDatafield )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6816:1: ruleDatafield
            {
             before(grammarAccess.getDatastructureAccess().getDatafieldsDatafieldParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDatafield_in_rule__Datastructure__DatafieldsAssignment_313621);
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


    // $ANTLR start "rule__Datastructure__DescriptionAssignment_4_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6825:1: rule__Datastructure__DescriptionAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Datastructure__DescriptionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6829:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6830:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6830:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6831:1: RULE_STRING
            {
             before(grammarAccess.getDatastructureAccess().getDescriptionSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Datastructure__DescriptionAssignment_4_213652); 
             after(grammarAccess.getDatastructureAccess().getDescriptionSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__DescriptionAssignment_4_2"


    // $ANTLR start "rule__Datastructure__IDAssignment_5_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6840:1: rule__Datastructure__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Datastructure__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6844:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6845:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6845:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6846:1: RULE_STRING
            {
             before(grammarAccess.getDatastructureAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Datastructure__IDAssignment_5_213683); 
             after(grammarAccess.getDatastructureAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datastructure__IDAssignment_5_2"


    // $ANTLR start "rule__DataRange__LowerBoundAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6855:1: rule__DataRange__LowerBoundAssignment_1 : ( ruleBound ) ;
    public final void rule__DataRange__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6859:1: ( ( ruleBound ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6860:1: ( ruleBound )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6860:1: ( ruleBound )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6861:1: ruleBound
            {
             before(grammarAccess.getDataRangeAccess().getLowerBoundBoundParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBound_in_rule__DataRange__LowerBoundAssignment_113714);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6870:1: rule__DataRange__UpperBoundAssignment_3 : ( ruleBound ) ;
    public final void rule__DataRange__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6874:1: ( ( ruleBound ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6875:1: ( ruleBound )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6875:1: ( ruleBound )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6876:1: ruleBound
            {
             before(grammarAccess.getDataRangeAccess().getUpperBoundBoundParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBound_in_rule__DataRange__UpperBoundAssignment_313745);
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


    // $ANTLR start "rule__DataRange__DescriptionAssignment_4_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6885:1: rule__DataRange__DescriptionAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__DataRange__DescriptionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6889:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6890:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6890:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6891:1: RULE_STRING
            {
             before(grammarAccess.getDataRangeAccess().getDescriptionSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataRange__DescriptionAssignment_4_213776); 
             after(grammarAccess.getDataRangeAccess().getDescriptionSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__DescriptionAssignment_4_2"


    // $ANTLR start "rule__DataRange__IDAssignment_5_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6900:1: rule__DataRange__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__DataRange__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6904:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6905:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6905:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6906:1: RULE_STRING
            {
             before(grammarAccess.getDataRangeAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataRange__IDAssignment_5_213807); 
             after(grammarAccess.getDataRangeAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__IDAssignment_5_2"


    // $ANTLR start "rule__DataAdaption__ScalingFactorAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6915:1: rule__DataAdaption__ScalingFactorAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__DataAdaption__ScalingFactorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6919:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6920:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6920:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6921:1: ruleDOUBLE
            {
             before(grammarAccess.getDataAdaptionAccess().getScalingFactorDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__DataAdaption__ScalingFactorAssignment_313838);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6930:1: rule__DataAdaption__OffsetAssignment_7 : ( ruleDOUBLE ) ;
    public final void rule__DataAdaption__OffsetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6934:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6935:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6935:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6936:1: ruleDOUBLE
            {
             before(grammarAccess.getDataAdaptionAccess().getOffsetDOUBLEParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__DataAdaption__OffsetAssignment_713869);
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


    // $ANTLR start "rule__DataAdaption__DescriptionAssignment_8_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6945:1: rule__DataAdaption__DescriptionAssignment_8_2 : ( RULE_STRING ) ;
    public final void rule__DataAdaption__DescriptionAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6949:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6950:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6950:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6951:1: RULE_STRING
            {
             before(grammarAccess.getDataAdaptionAccess().getDescriptionSTRINGTerminalRuleCall_8_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataAdaption__DescriptionAssignment_8_213900); 
             after(grammarAccess.getDataAdaptionAccess().getDescriptionSTRINGTerminalRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__DescriptionAssignment_8_2"


    // $ANTLR start "rule__DataAdaption__IDAssignment_9_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6960:1: rule__DataAdaption__IDAssignment_9_2 : ( RULE_STRING ) ;
    public final void rule__DataAdaption__IDAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6964:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6965:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6965:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6966:1: RULE_STRING
            {
             before(grammarAccess.getDataAdaptionAccess().getIDSTRINGTerminalRuleCall_9_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataAdaption__IDAssignment_9_213931); 
             after(grammarAccess.getDataAdaptionAccess().getIDSTRINGTerminalRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAdaption__IDAssignment_9_2"


    // $ANTLR start "rule__Bound__ValueAssignment_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6975:1: rule__Bound__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Bound__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6979:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6980:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6980:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6981:1: ruleDOUBLE
            {
             before(grammarAccess.getBoundAccess().getValueDOUBLEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Bound__ValueAssignment_013962);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6990:1: rule__Bound__UnitAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Bound__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6994:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6995:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6995:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:6996:1: RULE_STRING
            {
             before(grammarAccess.getBoundAccess().getUnitSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Bound__UnitAssignment_113993); 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0_in_ruleDataModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptions_in_entryRuleOptions121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptions128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group__0_in_ruleOptions154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepresentation_in_entryRuleRepresentation183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepresentation190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__0_in_ruleRepresentation216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatafield_in_entryRuleDatafield243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatafield250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datafield__Alternatives_in_ruleDatafield276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableData_in_entryRuleVariableData303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableData310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableData__Alternatives_in_ruleVariableData336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasuredData_in_entryRuleMeasuredData363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasuredData370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__0_in_ruleMeasuredData396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasuredData_in_entryRuleNonMeasuredData423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonMeasuredData430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group__0_in_ruleNonMeasuredData456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantData_in_entryRuleConstantData483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantData490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group__0_in_ruleConstantData516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_entryRuleCalculated543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalculated550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__0_in_ruleCalculated576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatastructure_in_entryRuleDatastructure663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatastructure670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__0_in_ruleDatastructure696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConstraint_in_ruleConstraint756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConstraint_in_entryRuleDataConstraint782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataConstraint789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataConstraint__Alternatives_in_ruleDataConstraint815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_entryRuleDataRange842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataRange849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__0_in_ruleDataRange875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdaption_in_entryRuleDataAdaption902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAdaption909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__0_in_ruleDataAdaption935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_entryRuleBound962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBound969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__Group__0_in_ruleBound995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Endianess__Alternatives_in_ruleEndianess1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenerationLanguage__Alternatives_in_ruleGenerationLanguage1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleArgumentType1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__RepresentationsAssignment_6_0_in_rule__DataModel__Alternatives_61238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__DatafieldsAssignment_6_1_in_rule__DataModel__Alternatives_61256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Representation__Alternatives_01291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Representation__Alternatives_01311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Representation__Alternatives_41346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Representation__Alternatives_41366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableData_in_rule__Datafield__Alternatives1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantData_in_rule__Datafield__Alternatives1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatastructure_in_rule__Datafield__Alternatives1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculated_in_rule__Datafield__Alternatives1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasuredData_in_rule__VariableData__Alternatives1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasuredData_in_rule__VariableData__Alternatives1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Calculated__Alternatives_01533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Calculated__Alternatives_01553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_rule__DataConstraint__Alternatives1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdaption_in_rule__DataConstraint__Alternatives1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Endianess__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Endianess__Alternatives1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GenerationLanguage__Alternatives1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__GenerationLanguage__Alternatives1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__GenerationLanguage__Alternatives1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__GenerationLanguage__Alternatives1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Type__Alternatives1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Type__Alternatives1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Type__Alternatives1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Type__Alternatives1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Type__Alternatives1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Type__Alternatives1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Type__Alternatives1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Type__Alternatives1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Type__Alternatives1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__01994 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__01997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DataModel__Group__0__Impl2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__12056 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__12059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DataModel__Group__1__Impl2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__22118 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__22121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DataModel__Group__2__Impl2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__32180 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__32183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DataModel__Group__3__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__42242 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__5_in_rule__DataModel__Group__42245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__OptionsAssignment_4_in_rule__DataModel__Group__4__Impl2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__5__Impl_in_rule__DataModel__Group__52302 = new BitSet(new long[]{0x0219002000033000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__6_in_rule__DataModel__Group__52305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DataModel__Group__5__Impl2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__6__Impl_in_rule__DataModel__Group__62364 = new BitSet(new long[]{0x0219002000033000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__7_in_rule__DataModel__Group__62367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Alternatives_6_in_rule__DataModel__Group__6__Impl2394 = new BitSet(new long[]{0x0219000000033002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__7__Impl_in_rule__DataModel__Group__72425 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataModel__Group__8_in_rule__DataModel__Group__72428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__DataModel__Group__7__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__8__Impl_in_rule__DataModel__Group__82487 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__9_in_rule__DataModel__Group__82490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__TransmitAssignment_8_in_rule__DataModel__Group__8__Impl2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__9__Impl_in_rule__DataModel__Group__92547 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__10_in_rule__DataModel__Group__92550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_9__0_in_rule__DataModel__Group__9__Impl2577 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__10__Impl_in_rule__DataModel__Group__102608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DataModel__Group__10__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_9__0__Impl_in_rule__DataModel__Group_9__02689 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataModel__Group_9__1_in_rule__DataModel__Group_9__02692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DataModel__Group_9__0__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_9__1__Impl_in_rule__DataModel__Group_9__12751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__TransmitAssignment_9_1_in_rule__DataModel__Group_9__1__Impl2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group__0__Impl_in_rule__Options__Group__02812 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Options__Group__1_in_rule__Options__Group__02815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group__1__Impl_in_rule__Options__Group__12873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1__0_in_rule__Options__Group__1__Impl2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1__0__Impl_in_rule__Options__Group_1__02934 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1__1_in_rule__Options__Group_1__02937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__0_in_rule__Options__Group_1__0__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1__1__Impl_in_rule__Options__Group_1__12994 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1__2_in_rule__Options__Group_1__12997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__0_in_rule__Options__Group_1__1__Impl3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1__2__Impl_in_rule__Options__Group_1__23054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__0_in_rule__Options__Group_1__2__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__0__Impl_in_rule__Options__Group_1_0__03117 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__1_in_rule__Options__Group_1_0__03120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Options__Group_1_0__0__Impl3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__1__Impl_in_rule__Options__Group_1_0__13179 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__2_in_rule__Options__Group_1_0__13182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Options__Group_1_0__1__Impl3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_0__2__Impl_in_rule__Options__Group_1_0__23241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__EndianessAssignment_1_0_2_in_rule__Options__Group_1_0__2__Impl3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__0__Impl_in_rule__Options__Group_1_1__03304 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__1_in_rule__Options__Group_1_1__03307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Options__Group_1_1__0__Impl3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__1__Impl_in_rule__Options__Group_1_1__13366 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__2_in_rule__Options__Group_1_1__13369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Options__Group_1_1__1__Impl3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__2__Impl_in_rule__Options__Group_1_1__23428 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__3_in_rule__Options__Group_1_1__23431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Options__Group_1_1__2__Impl3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_1__3__Impl_in_rule__Options__Group_1_1__33490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__SensorLanguageAssignment_1_1_3_in_rule__Options__Group_1_1__3__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__0__Impl_in_rule__Options__Group_1_2__03555 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__1_in_rule__Options__Group_1_2__03558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Options__Group_1_2__0__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__1__Impl_in_rule__Options__Group_1_2__13617 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__2_in_rule__Options__Group_1_2__13620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Options__Group_1_2__1__Impl3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__2__Impl_in_rule__Options__Group_1_2__23679 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__3_in_rule__Options__Group_1_2__23682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Options__Group_1_2__2__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_1_2__3__Impl_in_rule__Options__Group_1_2__33741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__ReceiverLanguageAssignment_1_2_3_in_rule__Options__Group_1_2__3__Impl3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__0__Impl_in_rule__Representation__Group__03806 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Representation__Group__1_in_rule__Representation__Group__03809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Alternatives_0_in_rule__Representation__Group__0__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__1__Impl_in_rule__Representation__Group__13866 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__2_in_rule__Representation__Group__13869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__NameAssignment_1_in_rule__Representation__Group__1__Impl3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__2__Impl_in_rule__Representation__Group__23926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Representation__Group__3_in_rule__Representation__Group__23929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Representation__Group__2__Impl3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__3__Impl_in_rule__Representation__Group__33988 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Representation__Group__4_in_rule__Representation__Group__33991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__ByteCountAssignment_3_in_rule__Representation__Group__3__Impl4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__4__Impl_in_rule__Representation__Group__44048 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__5_in_rule__Representation__Group__44051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Alternatives_4_in_rule__Representation__Group__4__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__5__Impl_in_rule__Representation__Group__54108 = new BitSet(new long[]{0x00000001FF000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__6_in_rule__Representation__Group__54111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Representation__Group__5__Impl4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__6__Impl_in_rule__Representation__Group__64170 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__7_in_rule__Representation__Group__64173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__TypeAssignment_6_in_rule__Representation__Group__6__Impl4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__7__Impl_in_rule__Representation__Group__74230 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__Representation__Group__8_in_rule__Representation__Group__74233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group_7__0_in_rule__Representation__Group__7__Impl4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group__8__Impl_in_rule__Representation__Group__84291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group_8__0_in_rule__Representation__Group__8__Impl4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group_7__0__Impl_in_rule__Representation__Group_7__04367 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Representation__Group_7__1_in_rule__Representation__Group_7__04370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Representation__Group_7__0__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group_7__1__Impl_in_rule__Representation__Group_7__14429 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Representation__Group_7__2_in_rule__Representation__Group_7__14432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Representation__Group_7__1__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group_7__2__Impl_in_rule__Representation__Group_7__24491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__DescriptionAssignment_7_2_in_rule__Representation__Group_7__2__Impl4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group_8__0__Impl_in_rule__Representation__Group_8__04554 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Representation__Group_8__1_in_rule__Representation__Group_8__04557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Representation__Group_8__0__Impl4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group_8__1__Impl_in_rule__Representation__Group_8__14616 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Representation__Group_8__2_in_rule__Representation__Group_8__14619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Representation__Group_8__1__Impl4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__Group_8__2__Impl_in_rule__Representation__Group_8__24678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Representation__IDAssignment_8_2_in_rule__Representation__Group_8__2__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__0__Impl_in_rule__MeasuredData__Group__04741 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__1_in_rule__MeasuredData__Group__04744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MeasuredData__Group__0__Impl4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__1__Impl_in_rule__MeasuredData__Group__14803 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__2_in_rule__MeasuredData__Group__14806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MeasuredData__Group__1__Impl4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__2__Impl_in_rule__MeasuredData__Group__24865 = new BitSet(new long[]{0x0004200000000000L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__3_in_rule__MeasuredData__Group__24868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__NameAssignment_2_in_rule__MeasuredData__Group__2__Impl4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__3__Impl_in_rule__MeasuredData__Group__34925 = new BitSet(new long[]{0x0004200000000000L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__4_in_rule__MeasuredData__Group__34928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_3__0_in_rule__MeasuredData__Group__3__Impl4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__4__Impl_in_rule__MeasuredData__Group__44986 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__5_in_rule__MeasuredData__Group__44989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__MeasuredData__Group__4__Impl5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__5__Impl_in_rule__MeasuredData__Group__55048 = new BitSet(new long[]{0x0440C00000000000L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__6_in_rule__MeasuredData__Group__55051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__RepresentationAssignment_5_in_rule__MeasuredData__Group__5__Impl5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__6__Impl_in_rule__MeasuredData__Group__65108 = new BitSet(new long[]{0x0440C00000000000L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__7_in_rule__MeasuredData__Group__65111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_6__0_in_rule__MeasuredData__Group__6__Impl5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__7__Impl_in_rule__MeasuredData__Group__75169 = new BitSet(new long[]{0x0440C00000000000L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__8_in_rule__MeasuredData__Group__75172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_7__0_in_rule__MeasuredData__Group__7__Impl5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group__8__Impl_in_rule__MeasuredData__Group__85230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__ConstraintsAssignment_8_in_rule__MeasuredData__Group__8__Impl5257 = new BitSet(new long[]{0x0440000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_3__0__Impl_in_rule__MeasuredData__Group_3__05306 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_3__1_in_rule__MeasuredData__Group_3__05309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__MeasuredData__Group_3__0__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_3__1__Impl_in_rule__MeasuredData__Group_3__15368 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_3__2_in_rule__MeasuredData__Group_3__15371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__ScaleAssignment_3_1_in_rule__MeasuredData__Group_3__1__Impl5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_3__2__Impl_in_rule__MeasuredData__Group_3__25429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__UnitAssignment_3_2_in_rule__MeasuredData__Group_3__2__Impl5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_6__0__Impl_in_rule__MeasuredData__Group_6__05492 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_6__1_in_rule__MeasuredData__Group_6__05495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__MeasuredData__Group_6__0__Impl5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_6__1__Impl_in_rule__MeasuredData__Group_6__15554 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_6__2_in_rule__MeasuredData__Group_6__15557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MeasuredData__Group_6__1__Impl5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_6__2__Impl_in_rule__MeasuredData__Group_6__25616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__DescriptionAssignment_6_2_in_rule__MeasuredData__Group_6__2__Impl5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_7__0__Impl_in_rule__MeasuredData__Group_7__05679 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_7__1_in_rule__MeasuredData__Group_7__05682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MeasuredData__Group_7__0__Impl5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_7__1__Impl_in_rule__MeasuredData__Group_7__15741 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_7__2_in_rule__MeasuredData__Group_7__15744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MeasuredData__Group_7__1__Impl5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__Group_7__2__Impl_in_rule__MeasuredData__Group_7__25803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasuredData__IDAssignment_7_2_in_rule__MeasuredData__Group_7__2__Impl5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group__0__Impl_in_rule__NonMeasuredData__Group__05866 = new BitSet(new long[]{0x00000001FF000000L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group__1_in_rule__NonMeasuredData__Group__05869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__NonMeasuredData__Group__0__Impl5897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group__1__Impl_in_rule__NonMeasuredData__Group__15928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group__2_in_rule__NonMeasuredData__Group__15931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__TypeAssignment_1_in_rule__NonMeasuredData__Group__1__Impl5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group__2__Impl_in_rule__NonMeasuredData__Group__25988 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group__3_in_rule__NonMeasuredData__Group__25991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__NameAssignment_2_in_rule__NonMeasuredData__Group__2__Impl6018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group__3__Impl_in_rule__NonMeasuredData__Group__36048 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group__4_in_rule__NonMeasuredData__Group__36051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__NonMeasuredData__Group__3__Impl6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group__4__Impl_in_rule__NonMeasuredData__Group__46110 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group__5_in_rule__NonMeasuredData__Group__46113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__RepresentationAssignment_4_in_rule__NonMeasuredData__Group__4__Impl6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group__5__Impl_in_rule__NonMeasuredData__Group__56170 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group__6_in_rule__NonMeasuredData__Group__56173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group_5__0_in_rule__NonMeasuredData__Group__5__Impl6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group__6__Impl_in_rule__NonMeasuredData__Group__66231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group_6__0_in_rule__NonMeasuredData__Group__6__Impl6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group_5__0__Impl_in_rule__NonMeasuredData__Group_5__06303 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group_5__1_in_rule__NonMeasuredData__Group_5__06306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__NonMeasuredData__Group_5__0__Impl6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group_5__1__Impl_in_rule__NonMeasuredData__Group_5__16365 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group_5__2_in_rule__NonMeasuredData__Group_5__16368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__NonMeasuredData__Group_5__1__Impl6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group_5__2__Impl_in_rule__NonMeasuredData__Group_5__26427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__DescriptionAssignment_5_2_in_rule__NonMeasuredData__Group_5__2__Impl6454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group_6__0__Impl_in_rule__NonMeasuredData__Group_6__06490 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group_6__1_in_rule__NonMeasuredData__Group_6__06493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__NonMeasuredData__Group_6__0__Impl6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group_6__1__Impl_in_rule__NonMeasuredData__Group_6__16552 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group_6__2_in_rule__NonMeasuredData__Group_6__16555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__NonMeasuredData__Group_6__1__Impl6583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__Group_6__2__Impl_in_rule__NonMeasuredData__Group_6__26614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasuredData__IDAssignment_6_2_in_rule__NonMeasuredData__Group_6__2__Impl6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group__0__Impl_in_rule__ConstantData__Group__06677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConstantData__Group__1_in_rule__ConstantData__Group__06680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ConstantData__Group__0__Impl6708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group__1__Impl_in_rule__ConstantData__Group__16739 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__ConstantData__Group__2_in_rule__ConstantData__Group__16742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__NameAssignment_1_in_rule__ConstantData__Group__1__Impl6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group__2__Impl_in_rule__ConstantData__Group__26799 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConstantData__Group__3_in_rule__ConstantData__Group__26802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ConstantData__Group__2__Impl6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group__3__Impl_in_rule__ConstantData__Group__36861 = new BitSet(new long[]{0x0000D00000000000L});
    public static final BitSet FOLLOW_rule__ConstantData__Group__4_in_rule__ConstantData__Group__36864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__RepresentationAssignment_3_in_rule__ConstantData__Group__3__Impl6891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group__4__Impl_in_rule__ConstantData__Group__46921 = new BitSet(new long[]{0x0000D00000000000L});
    public static final BitSet FOLLOW_rule__ConstantData__Group__5_in_rule__ConstantData__Group__46924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_4__0_in_rule__ConstantData__Group__4__Impl6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group__5__Impl_in_rule__ConstantData__Group__56982 = new BitSet(new long[]{0x0000D00000000000L});
    public static final BitSet FOLLOW_rule__ConstantData__Group__6_in_rule__ConstantData__Group__56985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_5__0_in_rule__ConstantData__Group__5__Impl7012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group__6__Impl_in_rule__ConstantData__Group__67043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_6__0_in_rule__ConstantData__Group__6__Impl7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_4__0__Impl_in_rule__ConstantData__Group_4__07115 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_4__1_in_rule__ConstantData__Group_4__07118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ConstantData__Group_4__0__Impl7146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_4__1__Impl_in_rule__ConstantData__Group_4__17177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__ConstValueAssignment_4_1_in_rule__ConstantData__Group_4__1__Impl7204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_5__0__Impl_in_rule__ConstantData__Group_5__07238 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_5__1_in_rule__ConstantData__Group_5__07241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ConstantData__Group_5__0__Impl7269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_5__1__Impl_in_rule__ConstantData__Group_5__17300 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_5__2_in_rule__ConstantData__Group_5__17303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ConstantData__Group_5__1__Impl7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_5__2__Impl_in_rule__ConstantData__Group_5__27362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__DescriptionAssignment_5_2_in_rule__ConstantData__Group_5__2__Impl7389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_6__0__Impl_in_rule__ConstantData__Group_6__07425 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_6__1_in_rule__ConstantData__Group_6__07428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ConstantData__Group_6__0__Impl7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_6__1__Impl_in_rule__ConstantData__Group_6__17487 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_6__2_in_rule__ConstantData__Group_6__17490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ConstantData__Group_6__1__Impl7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__Group_6__2__Impl_in_rule__ConstantData__Group_6__27549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantData__IDAssignment_6_2_in_rule__ConstantData__Group_6__2__Impl7576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__0__Impl_in_rule__Calculated__Group__07612 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__1_in_rule__Calculated__Group__07615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Alternatives_0_in_rule__Calculated__Group__0__Impl7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__1__Impl_in_rule__Calculated__Group__17672 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__2_in_rule__Calculated__Group__17675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__NameAssignment_1_in_rule__Calculated__Group__1__Impl7702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__2__Impl_in_rule__Calculated__Group__27732 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__3_in_rule__Calculated__Group__27735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Calculated__Group__2__Impl7763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__3__Impl_in_rule__Calculated__Group__37794 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__4_in_rule__Calculated__Group__37797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__RepresentationAssignment_3_in_rule__Calculated__Group__3__Impl7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__4__Impl_in_rule__Calculated__Group__47854 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group__5_in_rule__Calculated__Group__47857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Calculated__Group__4__Impl7885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__5__Impl_in_rule__Calculated__Group__57916 = new BitSet(new long[]{0x0040004000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__6_in_rule__Calculated__Group__57919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__MethodNameAssignment_5_in_rule__Calculated__Group__5__Impl7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__6__Impl_in_rule__Calculated__Group__67976 = new BitSet(new long[]{0x0040004000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__7_in_rule__Calculated__Group__67979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__0_in_rule__Calculated__Group__6__Impl8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__7__Impl_in_rule__Calculated__Group__78037 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__8_in_rule__Calculated__Group__78040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Calculated__Group__7__Impl8068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__8__Impl_in_rule__Calculated__Group__88099 = new BitSet(new long[]{0x0000C04000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__9_in_rule__Calculated__Group__88102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__ParameterAssignment_8_in_rule__Calculated__Group__8__Impl8129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__9__Impl_in_rule__Calculated__Group__98159 = new BitSet(new long[]{0x0000C04000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__10_in_rule__Calculated__Group__98162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__0_in_rule__Calculated__Group__9__Impl8189 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__10__Impl_in_rule__Calculated__Group__108220 = new BitSet(new long[]{0x0000C04000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group__11_in_rule__Calculated__Group__108223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_10__0_in_rule__Calculated__Group__10__Impl8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group__11__Impl_in_rule__Calculated__Group__118281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_11__0_in_rule__Calculated__Group__11__Impl8308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__0__Impl_in_rule__Calculated__Group_6__08363 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__1_in_rule__Calculated__Group_6__08366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Calculated__Group_6__0__Impl8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_6__1__Impl_in_rule__Calculated__Group_6__18425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__MethodNameOutAssignment_6_1_in_rule__Calculated__Group_6__1__Impl8452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__0__Impl_in_rule__Calculated__Group_9__08486 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__1_in_rule__Calculated__Group_9__08489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Calculated__Group_9__0__Impl8517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_9__1__Impl_in_rule__Calculated__Group_9__18548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__ParameterAssignment_9_1_in_rule__Calculated__Group_9__1__Impl8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_10__0__Impl_in_rule__Calculated__Group_10__08609 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group_10__1_in_rule__Calculated__Group_10__08612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Calculated__Group_10__0__Impl8640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_10__1__Impl_in_rule__Calculated__Group_10__18671 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Calculated__Group_10__2_in_rule__Calculated__Group_10__18674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Calculated__Group_10__1__Impl8702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_10__2__Impl_in_rule__Calculated__Group_10__28733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__DescriptionAssignment_10_2_in_rule__Calculated__Group_10__2__Impl8760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_11__0__Impl_in_rule__Calculated__Group_11__08796 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Calculated__Group_11__1_in_rule__Calculated__Group_11__08799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Calculated__Group_11__0__Impl8827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_11__1__Impl_in_rule__Calculated__Group_11__18858 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Calculated__Group_11__2_in_rule__Calculated__Group_11__18861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Calculated__Group_11__1__Impl8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__Group_11__2__Impl_in_rule__Calculated__Group_11__28920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculated__IDAssignment_11_2_in_rule__Calculated__Group_11__2__Impl8947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__08983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__08986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Parameter__Group__0__Impl9014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__19045 = new BitSet(new long[]{0x0104000000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__19048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DatafieldAssignment_1_in_rule__Parameter__Group__1__Impl9075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__29105 = new BitSet(new long[]{0x0104000000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__29108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl9135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__39166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Parameter__Group__3__Impl9194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__09233 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__09236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Parameter__Group_2__0__Impl9264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__19295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ArgumentTypeAssignment_2_1_in_rule__Parameter__Group_2__1__Impl9322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__0__Impl_in_rule__Datastructure__Group__09356 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__1_in_rule__Datastructure__Group__09359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Datastructure__Group__0__Impl9387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__1__Impl_in_rule__Datastructure__Group__19418 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__2_in_rule__Datastructure__Group__19421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__NameAssignment_1_in_rule__Datastructure__Group__1__Impl9448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__2__Impl_in_rule__Datastructure__Group__29478 = new BitSet(new long[]{0x0219C01000033000L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__3_in_rule__Datastructure__Group__29481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Datastructure__Group__2__Impl9509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__3__Impl_in_rule__Datastructure__Group__39540 = new BitSet(new long[]{0x0219C01000033000L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__4_in_rule__Datastructure__Group__39543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__DatafieldsAssignment_3_in_rule__Datastructure__Group__3__Impl9570 = new BitSet(new long[]{0x0219000000033002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__4__Impl_in_rule__Datastructure__Group__49601 = new BitSet(new long[]{0x0219C01000033000L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__5_in_rule__Datastructure__Group__49604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group_4__0_in_rule__Datastructure__Group__4__Impl9631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__5__Impl_in_rule__Datastructure__Group__59662 = new BitSet(new long[]{0x0219C01000033000L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__6_in_rule__Datastructure__Group__59665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group_5__0_in_rule__Datastructure__Group__5__Impl9692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group__6__Impl_in_rule__Datastructure__Group__69723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Datastructure__Group__6__Impl9751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group_4__0__Impl_in_rule__Datastructure__Group_4__09796 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Datastructure__Group_4__1_in_rule__Datastructure__Group_4__09799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Datastructure__Group_4__0__Impl9827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group_4__1__Impl_in_rule__Datastructure__Group_4__19858 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Datastructure__Group_4__2_in_rule__Datastructure__Group_4__19861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Datastructure__Group_4__1__Impl9889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group_4__2__Impl_in_rule__Datastructure__Group_4__29920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__DescriptionAssignment_4_2_in_rule__Datastructure__Group_4__2__Impl9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group_5__0__Impl_in_rule__Datastructure__Group_5__09983 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Datastructure__Group_5__1_in_rule__Datastructure__Group_5__09986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Datastructure__Group_5__0__Impl10014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group_5__1__Impl_in_rule__Datastructure__Group_5__110045 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Datastructure__Group_5__2_in_rule__Datastructure__Group_5__110048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Datastructure__Group_5__1__Impl10076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__Group_5__2__Impl_in_rule__Datastructure__Group_5__210107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datastructure__IDAssignment_5_2_in_rule__Datastructure__Group_5__2__Impl10134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__0__Impl_in_rule__DataRange__Group__010170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataRange__Group__1_in_rule__DataRange__Group__010173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__DataRange__Group__0__Impl10201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__1__Impl_in_rule__DataRange__Group__110232 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__DataRange__Group__2_in_rule__DataRange__Group__110235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__LowerBoundAssignment_1_in_rule__DataRange__Group__1__Impl10262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__2__Impl_in_rule__DataRange__Group__210292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataRange__Group__3_in_rule__DataRange__Group__210295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__DataRange__Group__2__Impl10323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__3__Impl_in_rule__DataRange__Group__310354 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__DataRange__Group__4_in_rule__DataRange__Group__310357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__UpperBoundAssignment_3_in_rule__DataRange__Group__3__Impl10384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__4__Impl_in_rule__DataRange__Group__410414 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__DataRange__Group__5_in_rule__DataRange__Group__410417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group_4__0_in_rule__DataRange__Group__4__Impl10444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__5__Impl_in_rule__DataRange__Group__510475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group_5__0_in_rule__DataRange__Group__5__Impl10502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group_4__0__Impl_in_rule__DataRange__Group_4__010545 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DataRange__Group_4__1_in_rule__DataRange__Group_4__010548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DataRange__Group_4__0__Impl10576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group_4__1__Impl_in_rule__DataRange__Group_4__110607 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DataRange__Group_4__2_in_rule__DataRange__Group_4__110610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DataRange__Group_4__1__Impl10638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group_4__2__Impl_in_rule__DataRange__Group_4__210669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__DescriptionAssignment_4_2_in_rule__DataRange__Group_4__2__Impl10696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group_5__0__Impl_in_rule__DataRange__Group_5__010732 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DataRange__Group_5__1_in_rule__DataRange__Group_5__010735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DataRange__Group_5__0__Impl10763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group_5__1__Impl_in_rule__DataRange__Group_5__110794 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DataRange__Group_5__2_in_rule__DataRange__Group_5__110797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DataRange__Group_5__1__Impl10825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group_5__2__Impl_in_rule__DataRange__Group_5__210856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__IDAssignment_5_2_in_rule__DataRange__Group_5__2__Impl10883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__0__Impl_in_rule__DataAdaption__Group__010919 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__1_in_rule__DataAdaption__Group__010922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__DataAdaption__Group__0__Impl10950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__1__Impl_in_rule__DataAdaption__Group__110981 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__2_in_rule__DataAdaption__Group__110984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__DataAdaption__Group__1__Impl11012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__2__Impl_in_rule__DataAdaption__Group__211043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__3_in_rule__DataAdaption__Group__211046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DataAdaption__Group__2__Impl11074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__3__Impl_in_rule__DataAdaption__Group__311105 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__4_in_rule__DataAdaption__Group__311108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__ScalingFactorAssignment_3_in_rule__DataAdaption__Group__3__Impl11135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__4__Impl_in_rule__DataAdaption__Group__411165 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__5_in_rule__DataAdaption__Group__411168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__DataAdaption__Group__4__Impl11196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__5__Impl_in_rule__DataAdaption__Group__511227 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__6_in_rule__DataAdaption__Group__511230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__DataAdaption__Group__5__Impl11258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__6__Impl_in_rule__DataAdaption__Group__611289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__7_in_rule__DataAdaption__Group__611292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DataAdaption__Group__6__Impl11320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__7__Impl_in_rule__DataAdaption__Group__711351 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__8_in_rule__DataAdaption__Group__711354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__OffsetAssignment_7_in_rule__DataAdaption__Group__7__Impl11381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__8__Impl_in_rule__DataAdaption__Group__811411 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__9_in_rule__DataAdaption__Group__811414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group_8__0_in_rule__DataAdaption__Group__8__Impl11441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group__9__Impl_in_rule__DataAdaption__Group__911472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group_9__0_in_rule__DataAdaption__Group__9__Impl11499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group_8__0__Impl_in_rule__DataAdaption__Group_8__011550 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group_8__1_in_rule__DataAdaption__Group_8__011553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DataAdaption__Group_8__0__Impl11581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group_8__1__Impl_in_rule__DataAdaption__Group_8__111612 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group_8__2_in_rule__DataAdaption__Group_8__111615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DataAdaption__Group_8__1__Impl11643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group_8__2__Impl_in_rule__DataAdaption__Group_8__211674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__DescriptionAssignment_8_2_in_rule__DataAdaption__Group_8__2__Impl11701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group_9__0__Impl_in_rule__DataAdaption__Group_9__011737 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group_9__1_in_rule__DataAdaption__Group_9__011740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DataAdaption__Group_9__0__Impl11768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group_9__1__Impl_in_rule__DataAdaption__Group_9__111799 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group_9__2_in_rule__DataAdaption__Group_9__111802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DataAdaption__Group_9__1__Impl11830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__Group_9__2__Impl_in_rule__DataAdaption__Group_9__211861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdaption__IDAssignment_9_2_in_rule__DataAdaption__Group_9__2__Impl11888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__Group__0__Impl_in_rule__Bound__Group__011924 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Bound__Group__1_in_rule__Bound__Group__011927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__ValueAssignment_0_in_rule__Bound__Group__0__Impl11954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__Group__1__Impl_in_rule__Bound__Group__111984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__UnitAssignment_1_in_rule__Bound__Group__1__Impl12011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__012046 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__012049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl12076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__112105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl12132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__012167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__012170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__DOUBLE__Group_1__0__Impl12198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__112229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl12256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptions_in_rule__DataModel__OptionsAssignment_412294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepresentation_in_rule__DataModel__RepresentationsAssignment_6_012325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatafield_in_rule__DataModel__DatafieldsAssignment_6_112356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_812391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__TransmitAssignment_9_112430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndianess_in_rule__Options__EndianessAssignment_1_0_212465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_rule__Options__SensorLanguageAssignment_1_1_312496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerationLanguage_in_rule__Options__ReceiverLanguageAssignment_1_2_312527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Representation__NameAssignment_112558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Representation__ByteCountAssignment_312589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Representation__TypeAssignment_612620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Representation__DescriptionAssignment_7_212651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Representation__IDAssignment_8_212682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MeasuredData__NameAssignment_212713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__MeasuredData__ScaleAssignment_3_112744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MeasuredData__UnitAssignment_3_212775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MeasuredData__RepresentationAssignment_512810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MeasuredData__DescriptionAssignment_6_212845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MeasuredData__IDAssignment_7_212876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConstraint_in_rule__MeasuredData__ConstraintsAssignment_812907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__NonMeasuredData__TypeAssignment_112938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NonMeasuredData__NameAssignment_212969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NonMeasuredData__RepresentationAssignment_413004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NonMeasuredData__DescriptionAssignment_5_213039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NonMeasuredData__IDAssignment_6_213070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantData__NameAssignment_113101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantData__RepresentationAssignment_313136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ConstantData__ConstValueAssignment_4_113171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ConstantData__DescriptionAssignment_5_213202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ConstantData__IDAssignment_6_213233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__NameAssignment_113264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__RepresentationAssignment_313299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__MethodNameAssignment_513334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calculated__MethodNameOutAssignment_6_113365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_813396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Calculated__ParameterAssignment_9_113427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Calculated__DescriptionAssignment_10_213458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Calculated__IDAssignment_11_213489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__DatafieldAssignment_113524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentType_in_rule__Parameter__ArgumentTypeAssignment_2_113559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Datastructure__NameAssignment_113590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatafield_in_rule__Datastructure__DatafieldsAssignment_313621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Datastructure__DescriptionAssignment_4_213652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Datastructure__IDAssignment_5_213683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_rule__DataRange__LowerBoundAssignment_113714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_rule__DataRange__UpperBoundAssignment_313745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataRange__DescriptionAssignment_4_213776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataRange__IDAssignment_5_213807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__DataAdaption__ScalingFactorAssignment_313838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__DataAdaption__OffsetAssignment_713869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataAdaption__DescriptionAssignment_8_213900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataAdaption__IDAssignment_9_213931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Bound__ValueAssignment_013962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Bound__UnitAssignment_113993 = new BitSet(new long[]{0x0000000000000002L});

}