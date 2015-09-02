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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_UNIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'_8BIT'", "'_16BIT'", "'_32BIT'", "'_64BIT'", "'SENSIDL_BINARY'", "'SENSIDL_JSON'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'SIGNED_CHAR'", "'UNSIGNED_CHAR'", "'SIGNED_SHORT'", "'UNSIGNED_SHORT'", "'SIGNED_LONG'", "'UNSIGNED_LONG'", "'SIGNED_LONG_LONG'", "'UNSIGNED_LONG_LONG'", "'FLOAT'", "'DOUBLE'", "'LONG_DOUBLE'", "'sensorInterface'", "'{'", "'}'", "';'", "'with'", "'identifier'", "'encoding'", "'alignment'", "'sensorData'", "'dataSet'", "'as'", "'in'", "'adjusted'", "'by'", "':'", "','", "'constant'", "'='", "'value'", "'range'", "'...'", "'scaling factor'", "'and'", "'offset'", "'linear mapping'", "'['", "']'", "'=>'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_UNIT=7;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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




    // $ANTLR start "entryRuleNamedElement"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:60:1: entryRuleNamedElement : ruleNamedElement EOF ;
    public final void entryRuleNamedElement() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:61:1: ( ruleNamedElement EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:62:1: ruleNamedElement EOF
            {
             before(grammarAccess.getNamedElementRule()); 
            pushFollow(FOLLOW_ruleNamedElement_in_entryRuleNamedElement61);
            ruleNamedElement();

            state._fsp--;

             after(grammarAccess.getNamedElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedElement68); 

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
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:69:1: ruleNamedElement : ( ( rule__NamedElement__Alternatives ) ) ;
    public final void ruleNamedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:73:2: ( ( ( rule__NamedElement__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:74:1: ( ( rule__NamedElement__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:74:1: ( ( rule__NamedElement__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:75:1: ( rule__NamedElement__Alternatives )
            {
             before(grammarAccess.getNamedElementAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:76:1: ( rule__NamedElement__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:76:2: rule__NamedElement__Alternatives
            {
            pushFollow(FOLLOW_rule__NamedElement__Alternatives_in_ruleNamedElement94);
            rule__NamedElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamedElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleSensorInterface"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:88:1: entryRuleSensorInterface : ruleSensorInterface EOF ;
    public final void entryRuleSensorInterface() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:89:1: ( ruleSensorInterface EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:90:1: ruleSensorInterface EOF
            {
             before(grammarAccess.getSensorInterfaceRule()); 
            pushFollow(FOLLOW_ruleSensorInterface_in_entryRuleSensorInterface121);
            ruleSensorInterface();

            state._fsp--;

             after(grammarAccess.getSensorInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorInterface128); 

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
    // $ANTLR end "entryRuleSensorInterface"


    // $ANTLR start "ruleSensorInterface"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:97:1: ruleSensorInterface : ( ( rule__SensorInterface__Group__0 ) ) ;
    public final void ruleSensorInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:101:2: ( ( ( rule__SensorInterface__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:102:1: ( ( rule__SensorInterface__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:102:1: ( ( rule__SensorInterface__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:103:1: ( rule__SensorInterface__Group__0 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:104:1: ( rule__SensorInterface__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:104:2: rule__SensorInterface__Group__0
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__0_in_ruleSensorInterface154);
            rule__SensorInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorInterface"


    // $ANTLR start "entryRuleSensorMetaInformation"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:116:1: entryRuleSensorMetaInformation : ruleSensorMetaInformation EOF ;
    public final void entryRuleSensorMetaInformation() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:117:1: ( ruleSensorMetaInformation EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:118:1: ruleSensorMetaInformation EOF
            {
             before(grammarAccess.getSensorMetaInformationRule()); 
            pushFollow(FOLLOW_ruleSensorMetaInformation_in_entryRuleSensorMetaInformation181);
            ruleSensorMetaInformation();

            state._fsp--;

             after(grammarAccess.getSensorMetaInformationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorMetaInformation188); 

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
    // $ANTLR end "entryRuleSensorMetaInformation"


    // $ANTLR start "ruleSensorMetaInformation"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:125:1: ruleSensorMetaInformation : ( ( rule__SensorMetaInformation__Group__0 ) ) ;
    public final void ruleSensorMetaInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:129:2: ( ( ( rule__SensorMetaInformation__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:130:1: ( ( rule__SensorMetaInformation__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:130:1: ( ( rule__SensorMetaInformation__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:131:1: ( rule__SensorMetaInformation__Group__0 )
            {
             before(grammarAccess.getSensorMetaInformationAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:132:1: ( rule__SensorMetaInformation__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:132:2: rule__SensorMetaInformation__Group__0
            {
            pushFollow(FOLLOW_rule__SensorMetaInformation__Group__0_in_ruleSensorMetaInformation214);
            rule__SensorMetaInformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorMetaInformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorMetaInformation"


    // $ANTLR start "entryRuleSensorDataDescription"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:144:1: entryRuleSensorDataDescription : ruleSensorDataDescription EOF ;
    public final void entryRuleSensorDataDescription() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:145:1: ( ruleSensorDataDescription EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:146:1: ruleSensorDataDescription EOF
            {
             before(grammarAccess.getSensorDataDescriptionRule()); 
            pushFollow(FOLLOW_ruleSensorDataDescription_in_entryRuleSensorDataDescription241);
            ruleSensorDataDescription();

            state._fsp--;

             after(grammarAccess.getSensorDataDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorDataDescription248); 

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
    // $ANTLR end "entryRuleSensorDataDescription"


    // $ANTLR start "ruleSensorDataDescription"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:153:1: ruleSensorDataDescription : ( ( rule__SensorDataDescription__Group__0 ) ) ;
    public final void ruleSensorDataDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:157:2: ( ( ( rule__SensorDataDescription__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:158:1: ( ( rule__SensorDataDescription__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:158:1: ( ( rule__SensorDataDescription__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:159:1: ( rule__SensorDataDescription__Group__0 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:160:1: ( rule__SensorDataDescription__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:160:2: rule__SensorDataDescription__Group__0
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__0_in_ruleSensorDataDescription274);
            rule__SensorDataDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorDataDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorDataDescription"


    // $ANTLR start "entryRuleDataSet"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:172:1: entryRuleDataSet : ruleDataSet EOF ;
    public final void entryRuleDataSet() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:173:1: ( ruleDataSet EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:174:1: ruleDataSet EOF
            {
             before(grammarAccess.getDataSetRule()); 
            pushFollow(FOLLOW_ruleDataSet_in_entryRuleDataSet301);
            ruleDataSet();

            state._fsp--;

             after(grammarAccess.getDataSetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSet308); 

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
    // $ANTLR end "entryRuleDataSet"


    // $ANTLR start "ruleDataSet"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:181:1: ruleDataSet : ( ( rule__DataSet__Group__0 ) ) ;
    public final void ruleDataSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:185:2: ( ( ( rule__DataSet__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:186:1: ( ( rule__DataSet__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:186:1: ( ( rule__DataSet__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:187:1: ( rule__DataSet__Group__0 )
            {
             before(grammarAccess.getDataSetAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:188:1: ( rule__DataSet__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:188:2: rule__DataSet__Group__0
            {
            pushFollow(FOLLOW_rule__DataSet__Group__0_in_ruleDataSet334);
            rule__DataSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataSet"


    // $ANTLR start "entryRuleData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:200:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:201:1: ( ruleData EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:202:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData361);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData368); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:209:1: ruleData : ( ( rule__Data__Alternatives ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:213:2: ( ( ( rule__Data__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:214:1: ( ( rule__Data__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:214:1: ( ( rule__Data__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:215:1: ( rule__Data__Alternatives )
            {
             before(grammarAccess.getDataAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:216:1: ( rule__Data__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:216:2: rule__Data__Alternatives
            {
            pushFollow(FOLLOW_rule__Data__Alternatives_in_ruleData394);
            rule__Data__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleMeasurementData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:228:1: entryRuleMeasurementData : ruleMeasurementData EOF ;
    public final void entryRuleMeasurementData() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:229:1: ( ruleMeasurementData EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:230:1: ruleMeasurementData EOF
            {
             before(grammarAccess.getMeasurementDataRule()); 
            pushFollow(FOLLOW_ruleMeasurementData_in_entryRuleMeasurementData421);
            ruleMeasurementData();

            state._fsp--;

             after(grammarAccess.getMeasurementDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementData428); 

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
    // $ANTLR end "entryRuleMeasurementData"


    // $ANTLR start "ruleMeasurementData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:237:1: ruleMeasurementData : ( ( rule__MeasurementData__Group__0 ) ) ;
    public final void ruleMeasurementData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:241:2: ( ( ( rule__MeasurementData__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:242:1: ( ( rule__MeasurementData__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:242:1: ( ( rule__MeasurementData__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:243:1: ( rule__MeasurementData__Group__0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:244:1: ( rule__MeasurementData__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:244:2: rule__MeasurementData__Group__0
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__0_in_ruleMeasurementData454);
            rule__MeasurementData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasurementData"


    // $ANTLR start "entryRuleNonMeasurementData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:256:1: entryRuleNonMeasurementData : ruleNonMeasurementData EOF ;
    public final void entryRuleNonMeasurementData() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:257:1: ( ruleNonMeasurementData EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:258:1: ruleNonMeasurementData EOF
            {
             before(grammarAccess.getNonMeasurementDataRule()); 
            pushFollow(FOLLOW_ruleNonMeasurementData_in_entryRuleNonMeasurementData481);
            ruleNonMeasurementData();

            state._fsp--;

             after(grammarAccess.getNonMeasurementDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonMeasurementData488); 

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
    // $ANTLR end "entryRuleNonMeasurementData"


    // $ANTLR start "ruleNonMeasurementData"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:265:1: ruleNonMeasurementData : ( ( rule__NonMeasurementData__Group__0 ) ) ;
    public final void ruleNonMeasurementData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:269:2: ( ( ( rule__NonMeasurementData__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:270:1: ( ( rule__NonMeasurementData__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:270:1: ( ( rule__NonMeasurementData__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:271:1: ( rule__NonMeasurementData__Group__0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:272:1: ( rule__NonMeasurementData__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:272:2: rule__NonMeasurementData__Group__0
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__0_in_ruleNonMeasurementData514);
            rule__NonMeasurementData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonMeasurementData"


    // $ANTLR start "entryRuleDataAdjustement"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:284:1: entryRuleDataAdjustement : ruleDataAdjustement EOF ;
    public final void entryRuleDataAdjustement() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:285:1: ( ruleDataAdjustement EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:286:1: ruleDataAdjustement EOF
            {
             before(grammarAccess.getDataAdjustementRule()); 
            pushFollow(FOLLOW_ruleDataAdjustement_in_entryRuleDataAdjustement541);
            ruleDataAdjustement();

            state._fsp--;

             after(grammarAccess.getDataAdjustementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAdjustement548); 

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
    // $ANTLR end "entryRuleDataAdjustement"


    // $ANTLR start "ruleDataAdjustement"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:293:1: ruleDataAdjustement : ( ( rule__DataAdjustement__Alternatives ) ) ;
    public final void ruleDataAdjustement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:297:2: ( ( ( rule__DataAdjustement__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:298:1: ( ( rule__DataAdjustement__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:298:1: ( ( rule__DataAdjustement__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:299:1: ( rule__DataAdjustement__Alternatives )
            {
             before(grammarAccess.getDataAdjustementAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:300:1: ( rule__DataAdjustement__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:300:2: rule__DataAdjustement__Alternatives
            {
            pushFollow(FOLLOW_rule__DataAdjustement__Alternatives_in_ruleDataAdjustement574);
            rule__DataAdjustement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataAdjustementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataAdjustement"


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


    // $ANTLR start "entryRuleInterval"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:340:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:341:1: ( ruleInterval EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:342:1: ruleInterval EOF
            {
             before(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_ruleInterval_in_entryRuleInterval661);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getIntervalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterval668); 

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
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:349:1: ruleInterval : ( ( rule__Interval__Group__0 ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:353:2: ( ( ( rule__Interval__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:354:1: ( ( rule__Interval__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:354:1: ( ( rule__Interval__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:355:1: ( rule__Interval__Group__0 )
            {
             before(grammarAccess.getIntervalAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:356:1: ( rule__Interval__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:356:2: rule__Interval__Group__0
            {
            pushFollow(FOLLOW_rule__Interval__Group__0_in_ruleInterval694);
            rule__Interval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleDataConversion"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:368:1: entryRuleDataConversion : ruleDataConversion EOF ;
    public final void entryRuleDataConversion() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:369:1: ( ruleDataConversion EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:370:1: ruleDataConversion EOF
            {
             before(grammarAccess.getDataConversionRule()); 
            pushFollow(FOLLOW_ruleDataConversion_in_entryRuleDataConversion721);
            ruleDataConversion();

            state._fsp--;

             after(grammarAccess.getDataConversionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataConversion728); 

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
    // $ANTLR end "entryRuleDataConversion"


    // $ANTLR start "ruleDataConversion"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:377:1: ruleDataConversion : ( ruleLinearDataConversion ) ;
    public final void ruleDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:381:2: ( ( ruleLinearDataConversion ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:382:1: ( ruleLinearDataConversion )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:382:1: ( ruleLinearDataConversion )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:383:1: ruleLinearDataConversion
            {
             before(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall()); 
            pushFollow(FOLLOW_ruleLinearDataConversion_in_ruleDataConversion754);
            ruleLinearDataConversion();

            state._fsp--;

             after(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataConversion"


    // $ANTLR start "entryRuleLinearDataConversion"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:396:1: entryRuleLinearDataConversion : ruleLinearDataConversion EOF ;
    public final void entryRuleLinearDataConversion() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:397:1: ( ruleLinearDataConversion EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:398:1: ruleLinearDataConversion EOF
            {
             before(grammarAccess.getLinearDataConversionRule()); 
            pushFollow(FOLLOW_ruleLinearDataConversion_in_entryRuleLinearDataConversion780);
            ruleLinearDataConversion();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinearDataConversion787); 

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
    // $ANTLR end "entryRuleLinearDataConversion"


    // $ANTLR start "ruleLinearDataConversion"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:405:1: ruleLinearDataConversion : ( ( rule__LinearDataConversion__Alternatives ) ) ;
    public final void ruleLinearDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:409:2: ( ( ( rule__LinearDataConversion__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:410:1: ( ( rule__LinearDataConversion__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:410:1: ( ( rule__LinearDataConversion__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:411:1: ( rule__LinearDataConversion__Alternatives )
            {
             before(grammarAccess.getLinearDataConversionAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:412:1: ( rule__LinearDataConversion__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:412:2: rule__LinearDataConversion__Alternatives
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Alternatives_in_ruleLinearDataConversion813);
            rule__LinearDataConversion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinearDataConversion"


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


    // $ANTLR start "entryRuleBOOLEAN"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:452:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:453:1: ( ruleBOOLEAN EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:454:1: ruleBOOLEAN EOF
            {
             before(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN900);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getBOOLEANRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN907); 

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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:461:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:465:2: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:466:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:466:1: ( ( rule__BOOLEAN__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:467:1: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:468:1: ( rule__BOOLEAN__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:468:2: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN933);
            rule__BOOLEAN__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLEANAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "ruleAlignment"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:481:1: ruleAlignment : ( ( rule__Alignment__Alternatives ) ) ;
    public final void ruleAlignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:485:1: ( ( ( rule__Alignment__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:486:1: ( ( rule__Alignment__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:486:1: ( ( rule__Alignment__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:487:1: ( rule__Alignment__Alternatives )
            {
             before(grammarAccess.getAlignmentAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:488:1: ( rule__Alignment__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:488:2: rule__Alignment__Alternatives
            {
            pushFollow(FOLLOW_rule__Alignment__Alternatives_in_ruleAlignment970);
            rule__Alignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAlignmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlignment"


    // $ANTLR start "ruleCoding"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:500:1: ruleCoding : ( ( rule__Coding__Alternatives ) ) ;
    public final void ruleCoding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:504:1: ( ( ( rule__Coding__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:505:1: ( ( rule__Coding__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:505:1: ( ( rule__Coding__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:506:1: ( rule__Coding__Alternatives )
            {
             before(grammarAccess.getCodingAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:507:1: ( rule__Coding__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:507:2: rule__Coding__Alternatives
            {
            pushFollow(FOLLOW_rule__Coding__Alternatives_in_ruleCoding1006);
            rule__Coding__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCodingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoding"


    // $ANTLR start "ruleEndianness"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:519:1: ruleEndianness : ( ( rule__Endianness__Alternatives ) ) ;
    public final void ruleEndianness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:523:1: ( ( ( rule__Endianness__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:524:1: ( ( rule__Endianness__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:524:1: ( ( rule__Endianness__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:525:1: ( rule__Endianness__Alternatives )
            {
             before(grammarAccess.getEndiannessAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:526:1: ( rule__Endianness__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:526:2: rule__Endianness__Alternatives
            {
            pushFollow(FOLLOW_rule__Endianness__Alternatives_in_ruleEndianness1042);
            rule__Endianness__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEndiannessAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndianness"


    // $ANTLR start "ruleDataType"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:538:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:542:1: ( ( ( rule__DataType__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:543:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:543:1: ( ( rule__DataType__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:544:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:545:1: ( rule__DataType__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:545:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType1078);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__NamedElement__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:556:1: rule__NamedElement__Alternatives : ( ( ruleSensorInterface ) | ( ruleSensorDataDescription ) | ( ruleDataSet ) | ( ruleData ) );
    public final void rule__NamedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:560:1: ( ( ruleSensorInterface ) | ( ruleSensorDataDescription ) | ( ruleDataSet ) | ( ruleData ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt1=1;
                }
                break;
            case 41:
                {
                alt1=2;
                }
                break;
            case 42:
                {
                alt1=3;
                }
                break;
            case RULE_ID:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:561:1: ( ruleSensorInterface )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:561:1: ( ruleSensorInterface )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:562:1: ruleSensorInterface
                    {
                     before(grammarAccess.getNamedElementAccess().getSensorInterfaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSensorInterface_in_rule__NamedElement__Alternatives1113);
                    ruleSensorInterface();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getSensorInterfaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:567:6: ( ruleSensorDataDescription )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:567:6: ( ruleSensorDataDescription )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:568:1: ruleSensorDataDescription
                    {
                     before(grammarAccess.getNamedElementAccess().getSensorDataDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSensorDataDescription_in_rule__NamedElement__Alternatives1130);
                    ruleSensorDataDescription();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getSensorDataDescriptionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:573:6: ( ruleDataSet )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:573:6: ( ruleDataSet )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:574:1: ruleDataSet
                    {
                     before(grammarAccess.getNamedElementAccess().getDataSetParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDataSet_in_rule__NamedElement__Alternatives1147);
                    ruleDataSet();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getDataSetParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:579:6: ( ruleData )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:579:6: ( ruleData )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:580:1: ruleData
                    {
                     before(grammarAccess.getNamedElementAccess().getDataParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleData_in_rule__NamedElement__Alternatives1164);
                    ruleData();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getDataParserRuleCall_3()); 

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
    // $ANTLR end "rule__NamedElement__Alternatives"


    // $ANTLR start "rule__Data__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:590:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:594:1: ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:595:1: ( ruleMeasurementData )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:595:1: ( ruleMeasurementData )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:596:1: ruleMeasurementData
                    {
                     before(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMeasurementData_in_rule__Data__Alternatives1196);
                    ruleMeasurementData();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:601:6: ( ruleNonMeasurementData )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:601:6: ( ruleNonMeasurementData )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:602:1: ruleNonMeasurementData
                    {
                     before(grammarAccess.getDataAccess().getNonMeasurementDataParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNonMeasurementData_in_rule__Data__Alternatives1213);
                    ruleNonMeasurementData();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getNonMeasurementDataParserRuleCall_1()); 

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
    // $ANTLR end "rule__Data__Alternatives"


    // $ANTLR start "rule__DataAdjustement__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:612:1: rule__DataAdjustement__Alternatives : ( ( ruleDataRange ) | ( ruleDataConversion ) );
    public final void rule__DataAdjustement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:616:1: ( ( ruleDataRange ) | ( ruleDataConversion ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==52) ) {
                    alt3=1;
                }
                else if ( (LA3_1==54) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==57) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:617:1: ( ruleDataRange )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:617:1: ( ruleDataRange )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:618:1: ruleDataRange
                    {
                     before(grammarAccess.getDataAdjustementAccess().getDataRangeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDataRange_in_rule__DataAdjustement__Alternatives1245);
                    ruleDataRange();

                    state._fsp--;

                     after(grammarAccess.getDataAdjustementAccess().getDataRangeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:623:6: ( ruleDataConversion )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:623:6: ( ruleDataConversion )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:624:1: ruleDataConversion
                    {
                     before(grammarAccess.getDataAdjustementAccess().getDataConversionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataConversion_in_rule__DataAdjustement__Alternatives1262);
                    ruleDataConversion();

                    state._fsp--;

                     after(grammarAccess.getDataAdjustementAccess().getDataConversionParserRuleCall_1()); 

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
    // $ANTLR end "rule__DataAdjustement__Alternatives"


    // $ANTLR start "rule__LinearDataConversion__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:634:1: rule__LinearDataConversion__Alternatives : ( ( ( rule__LinearDataConversion__Group_0__0 ) ) | ( ( rule__LinearDataConversion__Group_1__0 ) ) );
    public final void rule__LinearDataConversion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:638:1: ( ( ( rule__LinearDataConversion__Group_0__0 ) ) | ( ( rule__LinearDataConversion__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37) ) {
                alt4=1;
            }
            else if ( (LA4_0==57) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:639:1: ( ( rule__LinearDataConversion__Group_0__0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:639:1: ( ( rule__LinearDataConversion__Group_0__0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:640:1: ( rule__LinearDataConversion__Group_0__0 )
                    {
                     before(grammarAccess.getLinearDataConversionAccess().getGroup_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:641:1: ( rule__LinearDataConversion__Group_0__0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:641:2: rule__LinearDataConversion__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__0_in_rule__LinearDataConversion__Alternatives1294);
                    rule__LinearDataConversion__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinearDataConversionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:645:6: ( ( rule__LinearDataConversion__Group_1__0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:645:6: ( ( rule__LinearDataConversion__Group_1__0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:646:1: ( rule__LinearDataConversion__Group_1__0 )
                    {
                     before(grammarAccess.getLinearDataConversionAccess().getGroup_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:647:1: ( rule__LinearDataConversion__Group_1__0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:647:2: rule__LinearDataConversion__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__0_in_rule__LinearDataConversion__Alternatives1312);
                    rule__LinearDataConversion__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinearDataConversionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LinearDataConversion__Alternatives"


    // $ANTLR start "rule__BOOLEAN__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:656:1: rule__BOOLEAN__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:660:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:661:1: ( 'true' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:661:1: ( 'true' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:662:1: 'true'
                    {
                     before(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__BOOLEAN__Alternatives1346); 
                     after(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:669:6: ( 'false' )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:669:6: ( 'false' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:670:1: 'false'
                    {
                     before(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__BOOLEAN__Alternatives1366); 
                     after(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__BOOLEAN__Alternatives"


    // $ANTLR start "rule__Alignment__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:682:1: rule__Alignment__Alternatives : ( ( ( '_8BIT' ) ) | ( ( '_16BIT' ) ) | ( ( '_32BIT' ) ) | ( ( '_64BIT' ) ) );
    public final void rule__Alignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:686:1: ( ( ( '_8BIT' ) ) | ( ( '_16BIT' ) ) | ( ( '_32BIT' ) ) | ( ( '_64BIT' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
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
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:687:1: ( ( '_8BIT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:687:1: ( ( '_8BIT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:688:1: ( '_8BIT' )
                    {
                     before(grammarAccess.getAlignmentAccess().get_8BITEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:689:1: ( '_8BIT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:689:3: '_8BIT'
                    {
                    match(input,14,FOLLOW_14_in_rule__Alignment__Alternatives1401); 

                    }

                     after(grammarAccess.getAlignmentAccess().get_8BITEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:694:6: ( ( '_16BIT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:694:6: ( ( '_16BIT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:695:1: ( '_16BIT' )
                    {
                     before(grammarAccess.getAlignmentAccess().get_16BITEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:696:1: ( '_16BIT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:696:3: '_16BIT'
                    {
                    match(input,15,FOLLOW_15_in_rule__Alignment__Alternatives1422); 

                    }

                     after(grammarAccess.getAlignmentAccess().get_16BITEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:701:6: ( ( '_32BIT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:701:6: ( ( '_32BIT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:702:1: ( '_32BIT' )
                    {
                     before(grammarAccess.getAlignmentAccess().get_32BITEnumLiteralDeclaration_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:703:1: ( '_32BIT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:703:3: '_32BIT'
                    {
                    match(input,16,FOLLOW_16_in_rule__Alignment__Alternatives1443); 

                    }

                     after(grammarAccess.getAlignmentAccess().get_32BITEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:708:6: ( ( '_64BIT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:708:6: ( ( '_64BIT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:709:1: ( '_64BIT' )
                    {
                     before(grammarAccess.getAlignmentAccess().get_64BITEnumLiteralDeclaration_3()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:710:1: ( '_64BIT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:710:3: '_64BIT'
                    {
                    match(input,17,FOLLOW_17_in_rule__Alignment__Alternatives1464); 

                    }

                     after(grammarAccess.getAlignmentAccess().get_64BITEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Alignment__Alternatives"


    // $ANTLR start "rule__Coding__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:720:1: rule__Coding__Alternatives : ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) );
    public final void rule__Coding__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:724:1: ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:725:1: ( ( 'SENSIDL_BINARY' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:725:1: ( ( 'SENSIDL_BINARY' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:726:1: ( 'SENSIDL_BINARY' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:727:1: ( 'SENSIDL_BINARY' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:727:3: 'SENSIDL_BINARY'
                    {
                    match(input,18,FOLLOW_18_in_rule__Coding__Alternatives1500); 

                    }

                     after(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:732:6: ( ( 'SENSIDL_JSON' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:732:6: ( ( 'SENSIDL_JSON' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:733:1: ( 'SENSIDL_JSON' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_JSONEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:734:1: ( 'SENSIDL_JSON' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:734:3: 'SENSIDL_JSON'
                    {
                    match(input,19,FOLLOW_19_in_rule__Coding__Alternatives1521); 

                    }

                     after(grammarAccess.getCodingAccess().getSENSIDL_JSONEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Coding__Alternatives"


    // $ANTLR start "rule__Endianness__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:744:1: rule__Endianness__Alternatives : ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) );
    public final void rule__Endianness__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:748:1: ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:749:1: ( ( 'BIG_ENDIAN' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:749:1: ( ( 'BIG_ENDIAN' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:750:1: ( 'BIG_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:751:1: ( 'BIG_ENDIAN' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:751:3: 'BIG_ENDIAN'
                    {
                    match(input,20,FOLLOW_20_in_rule__Endianness__Alternatives1557); 

                    }

                     after(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:756:6: ( ( 'LITTLE_ENDIAN' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:756:6: ( ( 'LITTLE_ENDIAN' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:757:1: ( 'LITTLE_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:758:1: ( 'LITTLE_ENDIAN' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:758:3: 'LITTLE_ENDIAN'
                    {
                    match(input,21,FOLLOW_21_in_rule__Endianness__Alternatives1578); 

                    }

                     after(grammarAccess.getEndiannessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Endianness__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:768:1: rule__DataType__Alternatives : ( ( ( 'SIGNED_CHAR' ) ) | ( ( 'UNSIGNED_CHAR' ) ) | ( ( 'SIGNED_SHORT' ) ) | ( ( 'UNSIGNED_SHORT' ) ) | ( ( 'SIGNED_LONG' ) ) | ( ( 'UNSIGNED_LONG' ) ) | ( ( 'SIGNED_LONG_LONG' ) ) | ( ( 'UNSIGNED_LONG_LONG' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'LONG_DOUBLE' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:772:1: ( ( ( 'SIGNED_CHAR' ) ) | ( ( 'UNSIGNED_CHAR' ) ) | ( ( 'SIGNED_SHORT' ) ) | ( ( 'UNSIGNED_SHORT' ) ) | ( ( 'SIGNED_LONG' ) ) | ( ( 'UNSIGNED_LONG' ) ) | ( ( 'SIGNED_LONG_LONG' ) ) | ( ( 'UNSIGNED_LONG_LONG' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'LONG_DOUBLE' ) ) )
            int alt9=11;
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
            case 31:
                {
                alt9=10;
                }
                break;
            case 32:
                {
                alt9=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:773:1: ( ( 'SIGNED_CHAR' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:773:1: ( ( 'SIGNED_CHAR' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:774:1: ( 'SIGNED_CHAR' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSIGNED_CHAREnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:775:1: ( 'SIGNED_CHAR' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:775:3: 'SIGNED_CHAR'
                    {
                    match(input,22,FOLLOW_22_in_rule__DataType__Alternatives1614); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSIGNED_CHAREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:780:6: ( ( 'UNSIGNED_CHAR' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:780:6: ( ( 'UNSIGNED_CHAR' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:781:1: ( 'UNSIGNED_CHAR' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUNSIGNED_CHAREnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:782:1: ( 'UNSIGNED_CHAR' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:782:3: 'UNSIGNED_CHAR'
                    {
                    match(input,23,FOLLOW_23_in_rule__DataType__Alternatives1635); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUNSIGNED_CHAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:787:6: ( ( 'SIGNED_SHORT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:787:6: ( ( 'SIGNED_SHORT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:788:1: ( 'SIGNED_SHORT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSIGNED_SHORTEnumLiteralDeclaration_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:789:1: ( 'SIGNED_SHORT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:789:3: 'SIGNED_SHORT'
                    {
                    match(input,24,FOLLOW_24_in_rule__DataType__Alternatives1656); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSIGNED_SHORTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:794:6: ( ( 'UNSIGNED_SHORT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:794:6: ( ( 'UNSIGNED_SHORT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:795:1: ( 'UNSIGNED_SHORT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUNSIGNED_SHORTEnumLiteralDeclaration_3()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:796:1: ( 'UNSIGNED_SHORT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:796:3: 'UNSIGNED_SHORT'
                    {
                    match(input,25,FOLLOW_25_in_rule__DataType__Alternatives1677); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUNSIGNED_SHORTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:801:6: ( ( 'SIGNED_LONG' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:801:6: ( ( 'SIGNED_LONG' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:802:1: ( 'SIGNED_LONG' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSIGNED_LONGEnumLiteralDeclaration_4()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:803:1: ( 'SIGNED_LONG' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:803:3: 'SIGNED_LONG'
                    {
                    match(input,26,FOLLOW_26_in_rule__DataType__Alternatives1698); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSIGNED_LONGEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:808:6: ( ( 'UNSIGNED_LONG' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:808:6: ( ( 'UNSIGNED_LONG' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:809:1: ( 'UNSIGNED_LONG' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUNSIGNED_LONGEnumLiteralDeclaration_5()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:810:1: ( 'UNSIGNED_LONG' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:810:3: 'UNSIGNED_LONG'
                    {
                    match(input,27,FOLLOW_27_in_rule__DataType__Alternatives1719); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUNSIGNED_LONGEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:815:6: ( ( 'SIGNED_LONG_LONG' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:815:6: ( ( 'SIGNED_LONG_LONG' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:816:1: ( 'SIGNED_LONG_LONG' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSIGNED_LONG_LONGEnumLiteralDeclaration_6()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:817:1: ( 'SIGNED_LONG_LONG' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:817:3: 'SIGNED_LONG_LONG'
                    {
                    match(input,28,FOLLOW_28_in_rule__DataType__Alternatives1740); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSIGNED_LONG_LONGEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:822:6: ( ( 'UNSIGNED_LONG_LONG' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:822:6: ( ( 'UNSIGNED_LONG_LONG' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:823:1: ( 'UNSIGNED_LONG_LONG' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUNSIGNED_LONG_LONGEnumLiteralDeclaration_7()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:824:1: ( 'UNSIGNED_LONG_LONG' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:824:3: 'UNSIGNED_LONG_LONG'
                    {
                    match(input,29,FOLLOW_29_in_rule__DataType__Alternatives1761); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUNSIGNED_LONG_LONGEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:829:6: ( ( 'FLOAT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:829:6: ( ( 'FLOAT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:830:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:831:1: ( 'FLOAT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:831:3: 'FLOAT'
                    {
                    match(input,30,FOLLOW_30_in_rule__DataType__Alternatives1782); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:836:6: ( ( 'DOUBLE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:836:6: ( ( 'DOUBLE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:837:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:838:1: ( 'DOUBLE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:838:3: 'DOUBLE'
                    {
                    match(input,31,FOLLOW_31_in_rule__DataType__Alternatives1803); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:843:6: ( ( 'LONG_DOUBLE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:843:6: ( ( 'LONG_DOUBLE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:844:1: ( 'LONG_DOUBLE' )
                    {
                     before(grammarAccess.getDataTypeAccess().getLONG_DOUBLEEnumLiteralDeclaration_10()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:845:1: ( 'LONG_DOUBLE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:845:3: 'LONG_DOUBLE'
                    {
                    match(input,32,FOLLOW_32_in_rule__DataType__Alternatives1824); 

                    }

                     after(grammarAccess.getDataTypeAccess().getLONG_DOUBLEEnumLiteralDeclaration_10()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__SensorInterface__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:857:1: rule__SensorInterface__Group__0 : rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 ;
    public final void rule__SensorInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:861:1: ( rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:862:2: rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__0__Impl_in_rule__SensorInterface__Group__01857);
            rule__SensorInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__1_in_rule__SensorInterface__Group__01860);
            rule__SensorInterface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__0"


    // $ANTLR start "rule__SensorInterface__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:869:1: rule__SensorInterface__Group__0__Impl : ( 'sensorInterface' ) ;
    public final void rule__SensorInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:873:1: ( ( 'sensorInterface' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:874:1: ( 'sensorInterface' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:874:1: ( 'sensorInterface' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:875:1: 'sensorInterface'
            {
             before(grammarAccess.getSensorInterfaceAccess().getSensorInterfaceKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__SensorInterface__Group__0__Impl1888); 
             after(grammarAccess.getSensorInterfaceAccess().getSensorInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__0__Impl"


    // $ANTLR start "rule__SensorInterface__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:888:1: rule__SensorInterface__Group__1 : rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 ;
    public final void rule__SensorInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:892:1: ( rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:893:2: rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__1__Impl_in_rule__SensorInterface__Group__11919);
            rule__SensorInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__2_in_rule__SensorInterface__Group__11922);
            rule__SensorInterface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__1"


    // $ANTLR start "rule__SensorInterface__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:900:1: rule__SensorInterface__Group__1__Impl : ( ( rule__SensorInterface__NameAssignment_1 ) ) ;
    public final void rule__SensorInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:904:1: ( ( ( rule__SensorInterface__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:905:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:905:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:906:1: ( rule__SensorInterface__NameAssignment_1 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:907:1: ( rule__SensorInterface__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:907:2: rule__SensorInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SensorInterface__NameAssignment_1_in_rule__SensorInterface__Group__1__Impl1949);
            rule__SensorInterface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__1__Impl"


    // $ANTLR start "rule__SensorInterface__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:917:1: rule__SensorInterface__Group__2 : rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 ;
    public final void rule__SensorInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:921:1: ( rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:922:2: rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__2__Impl_in_rule__SensorInterface__Group__21979);
            rule__SensorInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__3_in_rule__SensorInterface__Group__21982);
            rule__SensorInterface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__2"


    // $ANTLR start "rule__SensorInterface__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:929:1: rule__SensorInterface__Group__2__Impl : ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) ;
    public final void rule__SensorInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:933:1: ( ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:934:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:934:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:935:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:936:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:936:2: rule__SensorInterface__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SensorInterface__DescriptionAssignment_2_in_rule__SensorInterface__Group__2__Impl2009);
                    rule__SensorInterface__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorInterfaceAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__2__Impl"


    // $ANTLR start "rule__SensorInterface__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:946:1: rule__SensorInterface__Group__3 : rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 ;
    public final void rule__SensorInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:950:1: ( rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:951:2: rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__3__Impl_in_rule__SensorInterface__Group__32040);
            rule__SensorInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__4_in_rule__SensorInterface__Group__32043);
            rule__SensorInterface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__3"


    // $ANTLR start "rule__SensorInterface__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:958:1: rule__SensorInterface__Group__3__Impl : ( ( rule__SensorInterface__Group_3__0 )? ) ;
    public final void rule__SensorInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:962:1: ( ( ( rule__SensorInterface__Group_3__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:963:1: ( ( rule__SensorInterface__Group_3__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:963:1: ( ( rule__SensorInterface__Group_3__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:964:1: ( rule__SensorInterface__Group_3__0 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:965:1: ( rule__SensorInterface__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:965:2: rule__SensorInterface__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SensorInterface__Group_3__0_in_rule__SensorInterface__Group__3__Impl2070);
                    rule__SensorInterface__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorInterfaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__3__Impl"


    // $ANTLR start "rule__SensorInterface__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:975:1: rule__SensorInterface__Group__4 : rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 ;
    public final void rule__SensorInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:979:1: ( rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:980:2: rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__4__Impl_in_rule__SensorInterface__Group__42101);
            rule__SensorInterface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__5_in_rule__SensorInterface__Group__42104);
            rule__SensorInterface__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__4"


    // $ANTLR start "rule__SensorInterface__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:987:1: rule__SensorInterface__Group__4__Impl : ( '{' ) ;
    public final void rule__SensorInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:991:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:992:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:992:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:993:1: '{'
            {
             before(grammarAccess.getSensorInterfaceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__SensorInterface__Group__4__Impl2132); 
             after(grammarAccess.getSensorInterfaceAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__4__Impl"


    // $ANTLR start "rule__SensorInterface__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1006:1: rule__SensorInterface__Group__5 : rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 ;
    public final void rule__SensorInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1010:1: ( rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1011:2: rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__5__Impl_in_rule__SensorInterface__Group__52163);
            rule__SensorInterface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__6_in_rule__SensorInterface__Group__52166);
            rule__SensorInterface__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__5"


    // $ANTLR start "rule__SensorInterface__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1018:1: rule__SensorInterface__Group__5__Impl : ( ( rule__SensorInterface__MetaInformationAssignment_5 ) ) ;
    public final void rule__SensorInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1022:1: ( ( ( rule__SensorInterface__MetaInformationAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1023:1: ( ( rule__SensorInterface__MetaInformationAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1023:1: ( ( rule__SensorInterface__MetaInformationAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1024:1: ( rule__SensorInterface__MetaInformationAssignment_5 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getMetaInformationAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1025:1: ( rule__SensorInterface__MetaInformationAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1025:2: rule__SensorInterface__MetaInformationAssignment_5
            {
            pushFollow(FOLLOW_rule__SensorInterface__MetaInformationAssignment_5_in_rule__SensorInterface__Group__5__Impl2193);
            rule__SensorInterface__MetaInformationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSensorInterfaceAccess().getMetaInformationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__5__Impl"


    // $ANTLR start "rule__SensorInterface__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1035:1: rule__SensorInterface__Group__6 : rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 ;
    public final void rule__SensorInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1039:1: ( rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1040:2: rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__6__Impl_in_rule__SensorInterface__Group__62223);
            rule__SensorInterface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__7_in_rule__SensorInterface__Group__62226);
            rule__SensorInterface__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__6"


    // $ANTLR start "rule__SensorInterface__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1047:1: rule__SensorInterface__Group__6__Impl : ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) ;
    public final void rule__SensorInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1051:1: ( ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1052:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1052:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1053:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1054:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1054:2: rule__SensorInterface__DataDescriptionAssignment_6
            {
            pushFollow(FOLLOW_rule__SensorInterface__DataDescriptionAssignment_6_in_rule__SensorInterface__Group__6__Impl2253);
            rule__SensorInterface__DataDescriptionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSensorInterfaceAccess().getDataDescriptionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__6__Impl"


    // $ANTLR start "rule__SensorInterface__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1064:1: rule__SensorInterface__Group__7 : rule__SensorInterface__Group__7__Impl rule__SensorInterface__Group__8 ;
    public final void rule__SensorInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1068:1: ( rule__SensorInterface__Group__7__Impl rule__SensorInterface__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1069:2: rule__SensorInterface__Group__7__Impl rule__SensorInterface__Group__8
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__7__Impl_in_rule__SensorInterface__Group__72283);
            rule__SensorInterface__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__8_in_rule__SensorInterface__Group__72286);
            rule__SensorInterface__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__7"


    // $ANTLR start "rule__SensorInterface__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1076:1: rule__SensorInterface__Group__7__Impl : ( '}' ) ;
    public final void rule__SensorInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1080:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1081:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1081:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1082:1: '}'
            {
             before(grammarAccess.getSensorInterfaceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,35,FOLLOW_35_in_rule__SensorInterface__Group__7__Impl2314); 
             after(grammarAccess.getSensorInterfaceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__7__Impl"


    // $ANTLR start "rule__SensorInterface__Group__8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1095:1: rule__SensorInterface__Group__8 : rule__SensorInterface__Group__8__Impl ;
    public final void rule__SensorInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1099:1: ( rule__SensorInterface__Group__8__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1100:2: rule__SensorInterface__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__8__Impl_in_rule__SensorInterface__Group__82345);
            rule__SensorInterface__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__8"


    // $ANTLR start "rule__SensorInterface__Group__8__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1106:1: rule__SensorInterface__Group__8__Impl : ( ';' ) ;
    public final void rule__SensorInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1110:1: ( ( ';' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1111:1: ( ';' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1111:1: ( ';' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1112:1: ';'
            {
             before(grammarAccess.getSensorInterfaceAccess().getSemicolonKeyword_8()); 
            match(input,36,FOLLOW_36_in_rule__SensorInterface__Group__8__Impl2373); 
             after(grammarAccess.getSensorInterfaceAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group__8__Impl"


    // $ANTLR start "rule__SensorInterface__Group_3__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1143:1: rule__SensorInterface__Group_3__0 : rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 ;
    public final void rule__SensorInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1147:1: ( rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1148:2: rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group_3__0__Impl_in_rule__SensorInterface__Group_3__02422);
            rule__SensorInterface__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group_3__1_in_rule__SensorInterface__Group_3__02425);
            rule__SensorInterface__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group_3__0"


    // $ANTLR start "rule__SensorInterface__Group_3__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1155:1: rule__SensorInterface__Group_3__0__Impl : ( 'with' ) ;
    public final void rule__SensorInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1159:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1160:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1160:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1161:1: 'with'
            {
             before(grammarAccess.getSensorInterfaceAccess().getWithKeyword_3_0()); 
            match(input,37,FOLLOW_37_in_rule__SensorInterface__Group_3__0__Impl2453); 
             after(grammarAccess.getSensorInterfaceAccess().getWithKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group_3__0__Impl"


    // $ANTLR start "rule__SensorInterface__Group_3__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1174:1: rule__SensorInterface__Group_3__1 : rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 ;
    public final void rule__SensorInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1178:1: ( rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1179:2: rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group_3__1__Impl_in_rule__SensorInterface__Group_3__12484);
            rule__SensorInterface__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group_3__2_in_rule__SensorInterface__Group_3__12487);
            rule__SensorInterface__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group_3__1"


    // $ANTLR start "rule__SensorInterface__Group_3__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1186:1: rule__SensorInterface__Group_3__1__Impl : ( 'identifier' ) ;
    public final void rule__SensorInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1190:1: ( ( 'identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1191:1: ( 'identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1191:1: ( 'identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1192:1: 'identifier'
            {
             before(grammarAccess.getSensorInterfaceAccess().getIdentifierKeyword_3_1()); 
            match(input,38,FOLLOW_38_in_rule__SensorInterface__Group_3__1__Impl2515); 
             after(grammarAccess.getSensorInterfaceAccess().getIdentifierKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group_3__1__Impl"


    // $ANTLR start "rule__SensorInterface__Group_3__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1205:1: rule__SensorInterface__Group_3__2 : rule__SensorInterface__Group_3__2__Impl ;
    public final void rule__SensorInterface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1209:1: ( rule__SensorInterface__Group_3__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1210:2: rule__SensorInterface__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group_3__2__Impl_in_rule__SensorInterface__Group_3__22546);
            rule__SensorInterface__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group_3__2"


    // $ANTLR start "rule__SensorInterface__Group_3__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1216:1: rule__SensorInterface__Group_3__2__Impl : ( ( rule__SensorInterface__IDAssignment_3_2 ) ) ;
    public final void rule__SensorInterface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1220:1: ( ( ( rule__SensorInterface__IDAssignment_3_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1221:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1221:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1222:1: ( rule__SensorInterface__IDAssignment_3_2 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDAssignment_3_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1223:1: ( rule__SensorInterface__IDAssignment_3_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1223:2: rule__SensorInterface__IDAssignment_3_2
            {
            pushFollow(FOLLOW_rule__SensorInterface__IDAssignment_3_2_in_rule__SensorInterface__Group_3__2__Impl2573);
            rule__SensorInterface__IDAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorInterfaceAccess().getIDAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__Group_3__2__Impl"


    // $ANTLR start "rule__SensorMetaInformation__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1239:1: rule__SensorMetaInformation__Group__0 : rule__SensorMetaInformation__Group__0__Impl rule__SensorMetaInformation__Group__1 ;
    public final void rule__SensorMetaInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1243:1: ( rule__SensorMetaInformation__Group__0__Impl rule__SensorMetaInformation__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1244:2: rule__SensorMetaInformation__Group__0__Impl rule__SensorMetaInformation__Group__1
            {
            pushFollow(FOLLOW_rule__SensorMetaInformation__Group__0__Impl_in_rule__SensorMetaInformation__Group__02609);
            rule__SensorMetaInformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorMetaInformation__Group__1_in_rule__SensorMetaInformation__Group__02612);
            rule__SensorMetaInformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__Group__0"


    // $ANTLR start "rule__SensorMetaInformation__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1251:1: rule__SensorMetaInformation__Group__0__Impl : ( 'encoding' ) ;
    public final void rule__SensorMetaInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1255:1: ( ( 'encoding' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1256:1: ( 'encoding' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1256:1: ( 'encoding' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1257:1: 'encoding'
            {
             before(grammarAccess.getSensorMetaInformationAccess().getEncodingKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__SensorMetaInformation__Group__0__Impl2640); 
             after(grammarAccess.getSensorMetaInformationAccess().getEncodingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__Group__0__Impl"


    // $ANTLR start "rule__SensorMetaInformation__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1270:1: rule__SensorMetaInformation__Group__1 : rule__SensorMetaInformation__Group__1__Impl rule__SensorMetaInformation__Group__2 ;
    public final void rule__SensorMetaInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1274:1: ( rule__SensorMetaInformation__Group__1__Impl rule__SensorMetaInformation__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1275:2: rule__SensorMetaInformation__Group__1__Impl rule__SensorMetaInformation__Group__2
            {
            pushFollow(FOLLOW_rule__SensorMetaInformation__Group__1__Impl_in_rule__SensorMetaInformation__Group__12671);
            rule__SensorMetaInformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorMetaInformation__Group__2_in_rule__SensorMetaInformation__Group__12674);
            rule__SensorMetaInformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__Group__1"


    // $ANTLR start "rule__SensorMetaInformation__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1282:1: rule__SensorMetaInformation__Group__1__Impl : ( ( rule__SensorMetaInformation__CodingAssignment_1 ) ) ;
    public final void rule__SensorMetaInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1286:1: ( ( ( rule__SensorMetaInformation__CodingAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1287:1: ( ( rule__SensorMetaInformation__CodingAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1287:1: ( ( rule__SensorMetaInformation__CodingAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1288:1: ( rule__SensorMetaInformation__CodingAssignment_1 )
            {
             before(grammarAccess.getSensorMetaInformationAccess().getCodingAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1289:1: ( rule__SensorMetaInformation__CodingAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1289:2: rule__SensorMetaInformation__CodingAssignment_1
            {
            pushFollow(FOLLOW_rule__SensorMetaInformation__CodingAssignment_1_in_rule__SensorMetaInformation__Group__1__Impl2701);
            rule__SensorMetaInformation__CodingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorMetaInformationAccess().getCodingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__Group__1__Impl"


    // $ANTLR start "rule__SensorMetaInformation__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1299:1: rule__SensorMetaInformation__Group__2 : rule__SensorMetaInformation__Group__2__Impl rule__SensorMetaInformation__Group__3 ;
    public final void rule__SensorMetaInformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1303:1: ( rule__SensorMetaInformation__Group__2__Impl rule__SensorMetaInformation__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1304:2: rule__SensorMetaInformation__Group__2__Impl rule__SensorMetaInformation__Group__3
            {
            pushFollow(FOLLOW_rule__SensorMetaInformation__Group__2__Impl_in_rule__SensorMetaInformation__Group__22731);
            rule__SensorMetaInformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorMetaInformation__Group__3_in_rule__SensorMetaInformation__Group__22734);
            rule__SensorMetaInformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__Group__2"


    // $ANTLR start "rule__SensorMetaInformation__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1311:1: rule__SensorMetaInformation__Group__2__Impl : ( 'with' ) ;
    public final void rule__SensorMetaInformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1315:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1316:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1316:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1317:1: 'with'
            {
             before(grammarAccess.getSensorMetaInformationAccess().getWithKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__SensorMetaInformation__Group__2__Impl2762); 
             after(grammarAccess.getSensorMetaInformationAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__Group__2__Impl"


    // $ANTLR start "rule__SensorMetaInformation__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1330:1: rule__SensorMetaInformation__Group__3 : rule__SensorMetaInformation__Group__3__Impl rule__SensorMetaInformation__Group__4 ;
    public final void rule__SensorMetaInformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1334:1: ( rule__SensorMetaInformation__Group__3__Impl rule__SensorMetaInformation__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1335:2: rule__SensorMetaInformation__Group__3__Impl rule__SensorMetaInformation__Group__4
            {
            pushFollow(FOLLOW_rule__SensorMetaInformation__Group__3__Impl_in_rule__SensorMetaInformation__Group__32793);
            rule__SensorMetaInformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorMetaInformation__Group__4_in_rule__SensorMetaInformation__Group__32796);
            rule__SensorMetaInformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__Group__3"


    // $ANTLR start "rule__SensorMetaInformation__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1342:1: rule__SensorMetaInformation__Group__3__Impl : ( ( rule__SensorMetaInformation__EndiannessAssignment_3 ) ) ;
    public final void rule__SensorMetaInformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1346:1: ( ( ( rule__SensorMetaInformation__EndiannessAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1347:1: ( ( rule__SensorMetaInformation__EndiannessAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1347:1: ( ( rule__SensorMetaInformation__EndiannessAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1348:1: ( rule__SensorMetaInformation__EndiannessAssignment_3 )
            {
             before(grammarAccess.getSensorMetaInformationAccess().getEndiannessAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1349:1: ( rule__SensorMetaInformation__EndiannessAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1349:2: rule__SensorMetaInformation__EndiannessAssignment_3
            {
            pushFollow(FOLLOW_rule__SensorMetaInformation__EndiannessAssignment_3_in_rule__SensorMetaInformation__Group__3__Impl2823);
            rule__SensorMetaInformation__EndiannessAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorMetaInformationAccess().getEndiannessAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__Group__3__Impl"


    // $ANTLR start "rule__SensorMetaInformation__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1359:1: rule__SensorMetaInformation__Group__4 : rule__SensorMetaInformation__Group__4__Impl rule__SensorMetaInformation__Group__5 ;
    public final void rule__SensorMetaInformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1363:1: ( rule__SensorMetaInformation__Group__4__Impl rule__SensorMetaInformation__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1364:2: rule__SensorMetaInformation__Group__4__Impl rule__SensorMetaInformation__Group__5
            {
            pushFollow(FOLLOW_rule__SensorMetaInformation__Group__4__Impl_in_rule__SensorMetaInformation__Group__42853);
            rule__SensorMetaInformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorMetaInformation__Group__5_in_rule__SensorMetaInformation__Group__42856);
            rule__SensorMetaInformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__Group__4"


    // $ANTLR start "rule__SensorMetaInformation__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1371:1: rule__SensorMetaInformation__Group__4__Impl : ( 'alignment' ) ;
    public final void rule__SensorMetaInformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1375:1: ( ( 'alignment' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1376:1: ( 'alignment' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1376:1: ( 'alignment' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1377:1: 'alignment'
            {
             before(grammarAccess.getSensorMetaInformationAccess().getAlignmentKeyword_4()); 
            match(input,40,FOLLOW_40_in_rule__SensorMetaInformation__Group__4__Impl2884); 
             after(grammarAccess.getSensorMetaInformationAccess().getAlignmentKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__Group__4__Impl"


    // $ANTLR start "rule__SensorMetaInformation__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1390:1: rule__SensorMetaInformation__Group__5 : rule__SensorMetaInformation__Group__5__Impl rule__SensorMetaInformation__Group__6 ;
    public final void rule__SensorMetaInformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1394:1: ( rule__SensorMetaInformation__Group__5__Impl rule__SensorMetaInformation__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1395:2: rule__SensorMetaInformation__Group__5__Impl rule__SensorMetaInformation__Group__6
            {
            pushFollow(FOLLOW_rule__SensorMetaInformation__Group__5__Impl_in_rule__SensorMetaInformation__Group__52915);
            rule__SensorMetaInformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorMetaInformation__Group__6_in_rule__SensorMetaInformation__Group__52918);
            rule__SensorMetaInformation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__Group__5"


    // $ANTLR start "rule__SensorMetaInformation__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1402:1: rule__SensorMetaInformation__Group__5__Impl : ( ( rule__SensorMetaInformation__AlignmentAssignment_5 ) ) ;
    public final void rule__SensorMetaInformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1406:1: ( ( ( rule__SensorMetaInformation__AlignmentAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1407:1: ( ( rule__SensorMetaInformation__AlignmentAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1407:1: ( ( rule__SensorMetaInformation__AlignmentAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1408:1: ( rule__SensorMetaInformation__AlignmentAssignment_5 )
            {
             before(grammarAccess.getSensorMetaInformationAccess().getAlignmentAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1409:1: ( rule__SensorMetaInformation__AlignmentAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1409:2: rule__SensorMetaInformation__AlignmentAssignment_5
            {
            pushFollow(FOLLOW_rule__SensorMetaInformation__AlignmentAssignment_5_in_rule__SensorMetaInformation__Group__5__Impl2945);
            rule__SensorMetaInformation__AlignmentAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSensorMetaInformationAccess().getAlignmentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__Group__5__Impl"


    // $ANTLR start "rule__SensorMetaInformation__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1419:1: rule__SensorMetaInformation__Group__6 : rule__SensorMetaInformation__Group__6__Impl ;
    public final void rule__SensorMetaInformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1423:1: ( rule__SensorMetaInformation__Group__6__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1424:2: rule__SensorMetaInformation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SensorMetaInformation__Group__6__Impl_in_rule__SensorMetaInformation__Group__62975);
            rule__SensorMetaInformation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__Group__6"


    // $ANTLR start "rule__SensorMetaInformation__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1430:1: rule__SensorMetaInformation__Group__6__Impl : ( ';' ) ;
    public final void rule__SensorMetaInformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1434:1: ( ( ';' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1435:1: ( ';' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1435:1: ( ';' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1436:1: ';'
            {
             before(grammarAccess.getSensorMetaInformationAccess().getSemicolonKeyword_6()); 
            match(input,36,FOLLOW_36_in_rule__SensorMetaInformation__Group__6__Impl3003); 
             after(grammarAccess.getSensorMetaInformationAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__Group__6__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1463:1: rule__SensorDataDescription__Group__0 : rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 ;
    public final void rule__SensorDataDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1467:1: ( rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1468:2: rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__0__Impl_in_rule__SensorDataDescription__Group__03048);
            rule__SensorDataDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__1_in_rule__SensorDataDescription__Group__03051);
            rule__SensorDataDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__0"


    // $ANTLR start "rule__SensorDataDescription__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1475:1: rule__SensorDataDescription__Group__0__Impl : ( 'sensorData' ) ;
    public final void rule__SensorDataDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1479:1: ( ( 'sensorData' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1480:1: ( 'sensorData' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1480:1: ( 'sensorData' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1481:1: 'sensorData'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSensorDataKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__SensorDataDescription__Group__0__Impl3079); 
             after(grammarAccess.getSensorDataDescriptionAccess().getSensorDataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__0__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1494:1: rule__SensorDataDescription__Group__1 : rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 ;
    public final void rule__SensorDataDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1498:1: ( rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1499:2: rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__1__Impl_in_rule__SensorDataDescription__Group__13110);
            rule__SensorDataDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__2_in_rule__SensorDataDescription__Group__13113);
            rule__SensorDataDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__1"


    // $ANTLR start "rule__SensorDataDescription__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1506:1: rule__SensorDataDescription__Group__1__Impl : ( ( rule__SensorDataDescription__NameAssignment_1 ) ) ;
    public final void rule__SensorDataDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1510:1: ( ( ( rule__SensorDataDescription__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1511:1: ( ( rule__SensorDataDescription__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1511:1: ( ( rule__SensorDataDescription__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1512:1: ( rule__SensorDataDescription__NameAssignment_1 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1513:1: ( rule__SensorDataDescription__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1513:2: rule__SensorDataDescription__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__NameAssignment_1_in_rule__SensorDataDescription__Group__1__Impl3140);
            rule__SensorDataDescription__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorDataDescriptionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__1__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1523:1: rule__SensorDataDescription__Group__2 : rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 ;
    public final void rule__SensorDataDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1527:1: ( rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1528:2: rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__2__Impl_in_rule__SensorDataDescription__Group__23170);
            rule__SensorDataDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__3_in_rule__SensorDataDescription__Group__23173);
            rule__SensorDataDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__2"


    // $ANTLR start "rule__SensorDataDescription__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1535:1: rule__SensorDataDescription__Group__2__Impl : ( ( rule__SensorDataDescription__DescriptionAssignment_2 )? ) ;
    public final void rule__SensorDataDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1539:1: ( ( ( rule__SensorDataDescription__DescriptionAssignment_2 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1540:1: ( ( rule__SensorDataDescription__DescriptionAssignment_2 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1540:1: ( ( rule__SensorDataDescription__DescriptionAssignment_2 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1541:1: ( rule__SensorDataDescription__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDescriptionAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1542:1: ( rule__SensorDataDescription__DescriptionAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1542:2: rule__SensorDataDescription__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SensorDataDescription__DescriptionAssignment_2_in_rule__SensorDataDescription__Group__2__Impl3200);
                    rule__SensorDataDescription__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorDataDescriptionAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__2__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1552:1: rule__SensorDataDescription__Group__3 : rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 ;
    public final void rule__SensorDataDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1556:1: ( rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1557:2: rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__3__Impl_in_rule__SensorDataDescription__Group__33231);
            rule__SensorDataDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__4_in_rule__SensorDataDescription__Group__33234);
            rule__SensorDataDescription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__3"


    // $ANTLR start "rule__SensorDataDescription__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1564:1: rule__SensorDataDescription__Group__3__Impl : ( ( rule__SensorDataDescription__Group_3__0 )? ) ;
    public final void rule__SensorDataDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1568:1: ( ( ( rule__SensorDataDescription__Group_3__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1569:1: ( ( rule__SensorDataDescription__Group_3__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1569:1: ( ( rule__SensorDataDescription__Group_3__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1570:1: ( rule__SensorDataDescription__Group_3__0 )?
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1571:1: ( rule__SensorDataDescription__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1571:2: rule__SensorDataDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SensorDataDescription__Group_3__0_in_rule__SensorDataDescription__Group__3__Impl3261);
                    rule__SensorDataDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorDataDescriptionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__3__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1581:1: rule__SensorDataDescription__Group__4 : rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 ;
    public final void rule__SensorDataDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1585:1: ( rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1586:2: rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__4__Impl_in_rule__SensorDataDescription__Group__43292);
            rule__SensorDataDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__5_in_rule__SensorDataDescription__Group__43295);
            rule__SensorDataDescription__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__4"


    // $ANTLR start "rule__SensorDataDescription__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1593:1: rule__SensorDataDescription__Group__4__Impl : ( '{' ) ;
    public final void rule__SensorDataDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1597:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1598:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1598:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1599:1: '{'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__SensorDataDescription__Group__4__Impl3323); 
             after(grammarAccess.getSensorDataDescriptionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__4__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1612:1: rule__SensorDataDescription__Group__5 : rule__SensorDataDescription__Group__5__Impl rule__SensorDataDescription__Group__6 ;
    public final void rule__SensorDataDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1616:1: ( rule__SensorDataDescription__Group__5__Impl rule__SensorDataDescription__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1617:2: rule__SensorDataDescription__Group__5__Impl rule__SensorDataDescription__Group__6
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__5__Impl_in_rule__SensorDataDescription__Group__53354);
            rule__SensorDataDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__6_in_rule__SensorDataDescription__Group__53357);
            rule__SensorDataDescription__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__5"


    // $ANTLR start "rule__SensorDataDescription__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1624:1: rule__SensorDataDescription__Group__5__Impl : ( ( rule__SensorDataDescription__DataSetsAssignment_5 )* ) ;
    public final void rule__SensorDataDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1628:1: ( ( ( rule__SensorDataDescription__DataSetsAssignment_5 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1629:1: ( ( rule__SensorDataDescription__DataSetsAssignment_5 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1629:1: ( ( rule__SensorDataDescription__DataSetsAssignment_5 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1630:1: ( rule__SensorDataDescription__DataSetsAssignment_5 )*
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1631:1: ( rule__SensorDataDescription__DataSetsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1631:2: rule__SensorDataDescription__DataSetsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SensorDataDescription__DataSetsAssignment_5_in_rule__SensorDataDescription__Group__5__Impl3384);
            	    rule__SensorDataDescription__DataSetsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSensorDataDescriptionAccess().getDataSetsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__5__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1641:1: rule__SensorDataDescription__Group__6 : rule__SensorDataDescription__Group__6__Impl rule__SensorDataDescription__Group__7 ;
    public final void rule__SensorDataDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1645:1: ( rule__SensorDataDescription__Group__6__Impl rule__SensorDataDescription__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1646:2: rule__SensorDataDescription__Group__6__Impl rule__SensorDataDescription__Group__7
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__6__Impl_in_rule__SensorDataDescription__Group__63415);
            rule__SensorDataDescription__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__7_in_rule__SensorDataDescription__Group__63418);
            rule__SensorDataDescription__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__6"


    // $ANTLR start "rule__SensorDataDescription__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1653:1: rule__SensorDataDescription__Group__6__Impl : ( '}' ) ;
    public final void rule__SensorDataDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1657:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1658:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1658:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1659:1: '}'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,35,FOLLOW_35_in_rule__SensorDataDescription__Group__6__Impl3446); 
             after(grammarAccess.getSensorDataDescriptionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__6__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1672:1: rule__SensorDataDescription__Group__7 : rule__SensorDataDescription__Group__7__Impl ;
    public final void rule__SensorDataDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1676:1: ( rule__SensorDataDescription__Group__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1677:2: rule__SensorDataDescription__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__7__Impl_in_rule__SensorDataDescription__Group__73477);
            rule__SensorDataDescription__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__7"


    // $ANTLR start "rule__SensorDataDescription__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1683:1: rule__SensorDataDescription__Group__7__Impl : ( ';' ) ;
    public final void rule__SensorDataDescription__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1687:1: ( ( ';' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1688:1: ( ';' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1688:1: ( ';' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1689:1: ';'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSemicolonKeyword_7()); 
            match(input,36,FOLLOW_36_in_rule__SensorDataDescription__Group__7__Impl3505); 
             after(grammarAccess.getSensorDataDescriptionAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__7__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group_3__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1718:1: rule__SensorDataDescription__Group_3__0 : rule__SensorDataDescription__Group_3__0__Impl rule__SensorDataDescription__Group_3__1 ;
    public final void rule__SensorDataDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1722:1: ( rule__SensorDataDescription__Group_3__0__Impl rule__SensorDataDescription__Group_3__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1723:2: rule__SensorDataDescription__Group_3__0__Impl rule__SensorDataDescription__Group_3__1
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group_3__0__Impl_in_rule__SensorDataDescription__Group_3__03552);
            rule__SensorDataDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group_3__1_in_rule__SensorDataDescription__Group_3__03555);
            rule__SensorDataDescription__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_3__0"


    // $ANTLR start "rule__SensorDataDescription__Group_3__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1730:1: rule__SensorDataDescription__Group_3__0__Impl : ( 'with' ) ;
    public final void rule__SensorDataDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1734:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1735:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1735:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1736:1: 'with'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getWithKeyword_3_0()); 
            match(input,37,FOLLOW_37_in_rule__SensorDataDescription__Group_3__0__Impl3583); 
             after(grammarAccess.getSensorDataDescriptionAccess().getWithKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_3__0__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group_3__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1749:1: rule__SensorDataDescription__Group_3__1 : rule__SensorDataDescription__Group_3__1__Impl rule__SensorDataDescription__Group_3__2 ;
    public final void rule__SensorDataDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1753:1: ( rule__SensorDataDescription__Group_3__1__Impl rule__SensorDataDescription__Group_3__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1754:2: rule__SensorDataDescription__Group_3__1__Impl rule__SensorDataDescription__Group_3__2
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group_3__1__Impl_in_rule__SensorDataDescription__Group_3__13614);
            rule__SensorDataDescription__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group_3__2_in_rule__SensorDataDescription__Group_3__13617);
            rule__SensorDataDescription__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_3__1"


    // $ANTLR start "rule__SensorDataDescription__Group_3__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1761:1: rule__SensorDataDescription__Group_3__1__Impl : ( 'identifier' ) ;
    public final void rule__SensorDataDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1765:1: ( ( 'identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1766:1: ( 'identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1766:1: ( 'identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1767:1: 'identifier'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIdentifierKeyword_3_1()); 
            match(input,38,FOLLOW_38_in_rule__SensorDataDescription__Group_3__1__Impl3645); 
             after(grammarAccess.getSensorDataDescriptionAccess().getIdentifierKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_3__1__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group_3__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1780:1: rule__SensorDataDescription__Group_3__2 : rule__SensorDataDescription__Group_3__2__Impl ;
    public final void rule__SensorDataDescription__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1784:1: ( rule__SensorDataDescription__Group_3__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1785:2: rule__SensorDataDescription__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group_3__2__Impl_in_rule__SensorDataDescription__Group_3__23676);
            rule__SensorDataDescription__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_3__2"


    // $ANTLR start "rule__SensorDataDescription__Group_3__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1791:1: rule__SensorDataDescription__Group_3__2__Impl : ( ( rule__SensorDataDescription__IDAssignment_3_2 ) ) ;
    public final void rule__SensorDataDescription__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1795:1: ( ( ( rule__SensorDataDescription__IDAssignment_3_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1796:1: ( ( rule__SensorDataDescription__IDAssignment_3_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1796:1: ( ( rule__SensorDataDescription__IDAssignment_3_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1797:1: ( rule__SensorDataDescription__IDAssignment_3_2 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDAssignment_3_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1798:1: ( rule__SensorDataDescription__IDAssignment_3_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1798:2: rule__SensorDataDescription__IDAssignment_3_2
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__IDAssignment_3_2_in_rule__SensorDataDescription__Group_3__2__Impl3703);
            rule__SensorDataDescription__IDAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorDataDescriptionAccess().getIDAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_3__2__Impl"


    // $ANTLR start "rule__DataSet__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1814:1: rule__DataSet__Group__0 : rule__DataSet__Group__0__Impl rule__DataSet__Group__1 ;
    public final void rule__DataSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1818:1: ( rule__DataSet__Group__0__Impl rule__DataSet__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1819:2: rule__DataSet__Group__0__Impl rule__DataSet__Group__1
            {
            pushFollow(FOLLOW_rule__DataSet__Group__0__Impl_in_rule__DataSet__Group__03739);
            rule__DataSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__1_in_rule__DataSet__Group__03742);
            rule__DataSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__0"


    // $ANTLR start "rule__DataSet__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1826:1: rule__DataSet__Group__0__Impl : ( 'dataSet' ) ;
    public final void rule__DataSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1830:1: ( ( 'dataSet' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1831:1: ( 'dataSet' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1831:1: ( 'dataSet' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1832:1: 'dataSet'
            {
             before(grammarAccess.getDataSetAccess().getDataSetKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__DataSet__Group__0__Impl3770); 
             after(grammarAccess.getDataSetAccess().getDataSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__0__Impl"


    // $ANTLR start "rule__DataSet__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1845:1: rule__DataSet__Group__1 : rule__DataSet__Group__1__Impl rule__DataSet__Group__2 ;
    public final void rule__DataSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1849:1: ( rule__DataSet__Group__1__Impl rule__DataSet__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1850:2: rule__DataSet__Group__1__Impl rule__DataSet__Group__2
            {
            pushFollow(FOLLOW_rule__DataSet__Group__1__Impl_in_rule__DataSet__Group__13801);
            rule__DataSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__2_in_rule__DataSet__Group__13804);
            rule__DataSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__1"


    // $ANTLR start "rule__DataSet__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1857:1: rule__DataSet__Group__1__Impl : ( ( rule__DataSet__NameAssignment_1 ) ) ;
    public final void rule__DataSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1861:1: ( ( ( rule__DataSet__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1862:1: ( ( rule__DataSet__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1862:1: ( ( rule__DataSet__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1863:1: ( rule__DataSet__NameAssignment_1 )
            {
             before(grammarAccess.getDataSetAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1864:1: ( rule__DataSet__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1864:2: rule__DataSet__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataSet__NameAssignment_1_in_rule__DataSet__Group__1__Impl3831);
            rule__DataSet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__1__Impl"


    // $ANTLR start "rule__DataSet__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1874:1: rule__DataSet__Group__2 : rule__DataSet__Group__2__Impl rule__DataSet__Group__3 ;
    public final void rule__DataSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1878:1: ( rule__DataSet__Group__2__Impl rule__DataSet__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1879:2: rule__DataSet__Group__2__Impl rule__DataSet__Group__3
            {
            pushFollow(FOLLOW_rule__DataSet__Group__2__Impl_in_rule__DataSet__Group__23861);
            rule__DataSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__3_in_rule__DataSet__Group__23864);
            rule__DataSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__2"


    // $ANTLR start "rule__DataSet__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1886:1: rule__DataSet__Group__2__Impl : ( ( rule__DataSet__DescriptionAssignment_2 )? ) ;
    public final void rule__DataSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1890:1: ( ( ( rule__DataSet__DescriptionAssignment_2 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1891:1: ( ( rule__DataSet__DescriptionAssignment_2 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1891:1: ( ( rule__DataSet__DescriptionAssignment_2 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1892:1: ( rule__DataSet__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getDataSetAccess().getDescriptionAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1893:1: ( rule__DataSet__DescriptionAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1893:2: rule__DataSet__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__DataSet__DescriptionAssignment_2_in_rule__DataSet__Group__2__Impl3891);
                    rule__DataSet__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSetAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__2__Impl"


    // $ANTLR start "rule__DataSet__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1903:1: rule__DataSet__Group__3 : rule__DataSet__Group__3__Impl rule__DataSet__Group__4 ;
    public final void rule__DataSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1907:1: ( rule__DataSet__Group__3__Impl rule__DataSet__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1908:2: rule__DataSet__Group__3__Impl rule__DataSet__Group__4
            {
            pushFollow(FOLLOW_rule__DataSet__Group__3__Impl_in_rule__DataSet__Group__33922);
            rule__DataSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__4_in_rule__DataSet__Group__33925);
            rule__DataSet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__3"


    // $ANTLR start "rule__DataSet__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1915:1: rule__DataSet__Group__3__Impl : ( ( rule__DataSet__Group_3__0 )? ) ;
    public final void rule__DataSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1919:1: ( ( ( rule__DataSet__Group_3__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1920:1: ( ( rule__DataSet__Group_3__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1920:1: ( ( rule__DataSet__Group_3__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1921:1: ( rule__DataSet__Group_3__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1922:1: ( rule__DataSet__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1922:2: rule__DataSet__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DataSet__Group_3__0_in_rule__DataSet__Group__3__Impl3952);
                    rule__DataSet__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSetAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__3__Impl"


    // $ANTLR start "rule__DataSet__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1932:1: rule__DataSet__Group__4 : rule__DataSet__Group__4__Impl rule__DataSet__Group__5 ;
    public final void rule__DataSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1936:1: ( rule__DataSet__Group__4__Impl rule__DataSet__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1937:2: rule__DataSet__Group__4__Impl rule__DataSet__Group__5
            {
            pushFollow(FOLLOW_rule__DataSet__Group__4__Impl_in_rule__DataSet__Group__43983);
            rule__DataSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__5_in_rule__DataSet__Group__43986);
            rule__DataSet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__4"


    // $ANTLR start "rule__DataSet__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1944:1: rule__DataSet__Group__4__Impl : ( '{' ) ;
    public final void rule__DataSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1948:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1949:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1949:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1950:1: '{'
            {
             before(grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__DataSet__Group__4__Impl4014); 
             after(grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__4__Impl"


    // $ANTLR start "rule__DataSet__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1963:1: rule__DataSet__Group__5 : rule__DataSet__Group__5__Impl rule__DataSet__Group__6 ;
    public final void rule__DataSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1967:1: ( rule__DataSet__Group__5__Impl rule__DataSet__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1968:2: rule__DataSet__Group__5__Impl rule__DataSet__Group__6
            {
            pushFollow(FOLLOW_rule__DataSet__Group__5__Impl_in_rule__DataSet__Group__54045);
            rule__DataSet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__6_in_rule__DataSet__Group__54048);
            rule__DataSet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__5"


    // $ANTLR start "rule__DataSet__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1975:1: rule__DataSet__Group__5__Impl : ( ( rule__DataSet__SubDataSetsAssignment_5 )? ) ;
    public final void rule__DataSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1979:1: ( ( ( rule__DataSet__SubDataSetsAssignment_5 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1980:1: ( ( rule__DataSet__SubDataSetsAssignment_5 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1980:1: ( ( rule__DataSet__SubDataSetsAssignment_5 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1981:1: ( rule__DataSet__SubDataSetsAssignment_5 )?
            {
             before(grammarAccess.getDataSetAccess().getSubDataSetsAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1982:1: ( rule__DataSet__SubDataSetsAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1982:2: rule__DataSet__SubDataSetsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__DataSet__SubDataSetsAssignment_5_in_rule__DataSet__Group__5__Impl4075);
                    rule__DataSet__SubDataSetsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSetAccess().getSubDataSetsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__5__Impl"


    // $ANTLR start "rule__DataSet__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1992:1: rule__DataSet__Group__6 : rule__DataSet__Group__6__Impl rule__DataSet__Group__7 ;
    public final void rule__DataSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1996:1: ( rule__DataSet__Group__6__Impl rule__DataSet__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1997:2: rule__DataSet__Group__6__Impl rule__DataSet__Group__7
            {
            pushFollow(FOLLOW_rule__DataSet__Group__6__Impl_in_rule__DataSet__Group__64106);
            rule__DataSet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__7_in_rule__DataSet__Group__64109);
            rule__DataSet__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__6"


    // $ANTLR start "rule__DataSet__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2004:1: rule__DataSet__Group__6__Impl : ( ( rule__DataSet__DataAssignment_6 )* ) ;
    public final void rule__DataSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2008:1: ( ( ( rule__DataSet__DataAssignment_6 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2009:1: ( ( rule__DataSet__DataAssignment_6 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2009:1: ( ( rule__DataSet__DataAssignment_6 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2010:1: ( rule__DataSet__DataAssignment_6 )*
            {
             before(grammarAccess.getDataSetAccess().getDataAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2011:1: ( rule__DataSet__DataAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2011:2: rule__DataSet__DataAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__DataSet__DataAssignment_6_in_rule__DataSet__Group__6__Impl4136);
            	    rule__DataSet__DataAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDataSetAccess().getDataAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__6__Impl"


    // $ANTLR start "rule__DataSet__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2021:1: rule__DataSet__Group__7 : rule__DataSet__Group__7__Impl rule__DataSet__Group__8 ;
    public final void rule__DataSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2025:1: ( rule__DataSet__Group__7__Impl rule__DataSet__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2026:2: rule__DataSet__Group__7__Impl rule__DataSet__Group__8
            {
            pushFollow(FOLLOW_rule__DataSet__Group__7__Impl_in_rule__DataSet__Group__74167);
            rule__DataSet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__8_in_rule__DataSet__Group__74170);
            rule__DataSet__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__7"


    // $ANTLR start "rule__DataSet__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2033:1: rule__DataSet__Group__7__Impl : ( '}' ) ;
    public final void rule__DataSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2037:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2038:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2038:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2039:1: '}'
            {
             before(grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_7()); 
            match(input,35,FOLLOW_35_in_rule__DataSet__Group__7__Impl4198); 
             after(grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__7__Impl"


    // $ANTLR start "rule__DataSet__Group__8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2052:1: rule__DataSet__Group__8 : rule__DataSet__Group__8__Impl ;
    public final void rule__DataSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2056:1: ( rule__DataSet__Group__8__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2057:2: rule__DataSet__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__DataSet__Group__8__Impl_in_rule__DataSet__Group__84229);
            rule__DataSet__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__8"


    // $ANTLR start "rule__DataSet__Group__8__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2063:1: rule__DataSet__Group__8__Impl : ( ';' ) ;
    public final void rule__DataSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2067:1: ( ( ';' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2068:1: ( ';' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2068:1: ( ';' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2069:1: ';'
            {
             before(grammarAccess.getDataSetAccess().getSemicolonKeyword_8()); 
            match(input,36,FOLLOW_36_in_rule__DataSet__Group__8__Impl4257); 
             after(grammarAccess.getDataSetAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group__8__Impl"


    // $ANTLR start "rule__DataSet__Group_3__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2100:1: rule__DataSet__Group_3__0 : rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 ;
    public final void rule__DataSet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2104:1: ( rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2105:2: rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1
            {
            pushFollow(FOLLOW_rule__DataSet__Group_3__0__Impl_in_rule__DataSet__Group_3__04306);
            rule__DataSet__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group_3__1_in_rule__DataSet__Group_3__04309);
            rule__DataSet__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_3__0"


    // $ANTLR start "rule__DataSet__Group_3__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2112:1: rule__DataSet__Group_3__0__Impl : ( 'with' ) ;
    public final void rule__DataSet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2116:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2117:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2117:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2118:1: 'with'
            {
             before(grammarAccess.getDataSetAccess().getWithKeyword_3_0()); 
            match(input,37,FOLLOW_37_in_rule__DataSet__Group_3__0__Impl4337); 
             after(grammarAccess.getDataSetAccess().getWithKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_3__0__Impl"


    // $ANTLR start "rule__DataSet__Group_3__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2131:1: rule__DataSet__Group_3__1 : rule__DataSet__Group_3__1__Impl rule__DataSet__Group_3__2 ;
    public final void rule__DataSet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2135:1: ( rule__DataSet__Group_3__1__Impl rule__DataSet__Group_3__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2136:2: rule__DataSet__Group_3__1__Impl rule__DataSet__Group_3__2
            {
            pushFollow(FOLLOW_rule__DataSet__Group_3__1__Impl_in_rule__DataSet__Group_3__14368);
            rule__DataSet__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group_3__2_in_rule__DataSet__Group_3__14371);
            rule__DataSet__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_3__1"


    // $ANTLR start "rule__DataSet__Group_3__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2143:1: rule__DataSet__Group_3__1__Impl : ( 'identifier' ) ;
    public final void rule__DataSet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2147:1: ( ( 'identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2148:1: ( 'identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2148:1: ( 'identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2149:1: 'identifier'
            {
             before(grammarAccess.getDataSetAccess().getIdentifierKeyword_3_1()); 
            match(input,38,FOLLOW_38_in_rule__DataSet__Group_3__1__Impl4399); 
             after(grammarAccess.getDataSetAccess().getIdentifierKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_3__1__Impl"


    // $ANTLR start "rule__DataSet__Group_3__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2162:1: rule__DataSet__Group_3__2 : rule__DataSet__Group_3__2__Impl ;
    public final void rule__DataSet__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2166:1: ( rule__DataSet__Group_3__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2167:2: rule__DataSet__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__DataSet__Group_3__2__Impl_in_rule__DataSet__Group_3__24430);
            rule__DataSet__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_3__2"


    // $ANTLR start "rule__DataSet__Group_3__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2173:1: rule__DataSet__Group_3__2__Impl : ( ( rule__DataSet__IDAssignment_3_2 ) ) ;
    public final void rule__DataSet__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2177:1: ( ( ( rule__DataSet__IDAssignment_3_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2178:1: ( ( rule__DataSet__IDAssignment_3_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2178:1: ( ( rule__DataSet__IDAssignment_3_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2179:1: ( rule__DataSet__IDAssignment_3_2 )
            {
             before(grammarAccess.getDataSetAccess().getIDAssignment_3_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2180:1: ( rule__DataSet__IDAssignment_3_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2180:2: rule__DataSet__IDAssignment_3_2
            {
            pushFollow(FOLLOW_rule__DataSet__IDAssignment_3_2_in_rule__DataSet__Group_3__2__Impl4457);
            rule__DataSet__IDAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getDataSetAccess().getIDAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_3__2__Impl"


    // $ANTLR start "rule__MeasurementData__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2196:1: rule__MeasurementData__Group__0 : rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 ;
    public final void rule__MeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2200:1: ( rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2201:2: rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__0__Impl_in_rule__MeasurementData__Group__04493);
            rule__MeasurementData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__1_in_rule__MeasurementData__Group__04496);
            rule__MeasurementData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__0"


    // $ANTLR start "rule__MeasurementData__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2208:1: rule__MeasurementData__Group__0__Impl : ( ( rule__MeasurementData__NameAssignment_0 ) ) ;
    public final void rule__MeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2212:1: ( ( ( rule__MeasurementData__NameAssignment_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2213:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2213:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2214:1: ( rule__MeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getNameAssignment_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2215:1: ( rule__MeasurementData__NameAssignment_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2215:2: rule__MeasurementData__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MeasurementData__NameAssignment_0_in_rule__MeasurementData__Group__0__Impl4523);
            rule__MeasurementData__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2225:1: rule__MeasurementData__Group__1 : rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 ;
    public final void rule__MeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2229:1: ( rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2230:2: rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__1__Impl_in_rule__MeasurementData__Group__14553);
            rule__MeasurementData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__2_in_rule__MeasurementData__Group__14556);
            rule__MeasurementData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__1"


    // $ANTLR start "rule__MeasurementData__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2237:1: rule__MeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2241:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2242:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2242:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2243:1: 'as'
            {
             before(grammarAccess.getMeasurementDataAccess().getAsKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__MeasurementData__Group__1__Impl4584); 
             after(grammarAccess.getMeasurementDataAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2256:1: rule__MeasurementData__Group__2 : rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 ;
    public final void rule__MeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2260:1: ( rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2261:2: rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__2__Impl_in_rule__MeasurementData__Group__24615);
            rule__MeasurementData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__3_in_rule__MeasurementData__Group__24618);
            rule__MeasurementData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__2"


    // $ANTLR start "rule__MeasurementData__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2268:1: rule__MeasurementData__Group__2__Impl : ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2272:1: ( ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2273:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2273:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2274:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2275:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2275:2: rule__MeasurementData__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__MeasurementData__DataTypeAssignment_2_in_rule__MeasurementData__Group__2__Impl4645);
            rule__MeasurementData__DataTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getDataTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__2__Impl"


    // $ANTLR start "rule__MeasurementData__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2285:1: rule__MeasurementData__Group__3 : rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 ;
    public final void rule__MeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2289:1: ( rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2290:2: rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__3__Impl_in_rule__MeasurementData__Group__34675);
            rule__MeasurementData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__4_in_rule__MeasurementData__Group__34678);
            rule__MeasurementData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__3"


    // $ANTLR start "rule__MeasurementData__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2297:1: rule__MeasurementData__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2301:1: ( ( 'in' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2302:1: ( 'in' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2302:1: ( 'in' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2303:1: 'in'
            {
             before(grammarAccess.getMeasurementDataAccess().getInKeyword_3()); 
            match(input,44,FOLLOW_44_in_rule__MeasurementData__Group__3__Impl4706); 
             after(grammarAccess.getMeasurementDataAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__3__Impl"


    // $ANTLR start "rule__MeasurementData__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2316:1: rule__MeasurementData__Group__4 : rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 ;
    public final void rule__MeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2320:1: ( rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2321:2: rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__4__Impl_in_rule__MeasurementData__Group__44737);
            rule__MeasurementData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__5_in_rule__MeasurementData__Group__44740);
            rule__MeasurementData__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__4"


    // $ANTLR start "rule__MeasurementData__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2328:1: rule__MeasurementData__Group__4__Impl : ( ( rule__MeasurementData__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2332:1: ( ( ( rule__MeasurementData__UnitAssignment_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2333:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2333:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2334:1: ( rule__MeasurementData__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2335:1: ( rule__MeasurementData__UnitAssignment_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2335:2: rule__MeasurementData__UnitAssignment_4
            {
            pushFollow(FOLLOW_rule__MeasurementData__UnitAssignment_4_in_rule__MeasurementData__Group__4__Impl4767);
            rule__MeasurementData__UnitAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getUnitAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__4__Impl"


    // $ANTLR start "rule__MeasurementData__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2345:1: rule__MeasurementData__Group__5 : rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 ;
    public final void rule__MeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2349:1: ( rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2350:2: rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__5__Impl_in_rule__MeasurementData__Group__54797);
            rule__MeasurementData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__6_in_rule__MeasurementData__Group__54800);
            rule__MeasurementData__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__5"


    // $ANTLR start "rule__MeasurementData__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2357:1: rule__MeasurementData__Group__5__Impl : ( ( rule__MeasurementData__Group_5__0 )? ) ;
    public final void rule__MeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2361:1: ( ( ( rule__MeasurementData__Group_5__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2362:1: ( ( rule__MeasurementData__Group_5__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2362:1: ( ( rule__MeasurementData__Group_5__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2363:1: ( rule__MeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2364:1: ( rule__MeasurementData__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2364:2: rule__MeasurementData__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MeasurementData__Group_5__0_in_rule__MeasurementData__Group__5__Impl4827);
                    rule__MeasurementData__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__5__Impl"


    // $ANTLR start "rule__MeasurementData__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2374:1: rule__MeasurementData__Group__6 : rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 ;
    public final void rule__MeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2378:1: ( rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2379:2: rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__6__Impl_in_rule__MeasurementData__Group__64858);
            rule__MeasurementData__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__7_in_rule__MeasurementData__Group__64861);
            rule__MeasurementData__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__6"


    // $ANTLR start "rule__MeasurementData__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2386:1: rule__MeasurementData__Group__6__Impl : ( ( rule__MeasurementData__Group_6__0 )? ) ;
    public final void rule__MeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2390:1: ( ( ( rule__MeasurementData__Group_6__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2391:1: ( ( rule__MeasurementData__Group_6__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2391:1: ( ( rule__MeasurementData__Group_6__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2392:1: ( rule__MeasurementData__Group_6__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2393:1: ( rule__MeasurementData__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2393:2: rule__MeasurementData__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__MeasurementData__Group_6__0_in_rule__MeasurementData__Group__6__Impl4888);
                    rule__MeasurementData__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__6__Impl"


    // $ANTLR start "rule__MeasurementData__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2403:1: rule__MeasurementData__Group__7 : rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8 ;
    public final void rule__MeasurementData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2407:1: ( rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2408:2: rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__7__Impl_in_rule__MeasurementData__Group__74919);
            rule__MeasurementData__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__8_in_rule__MeasurementData__Group__74922);
            rule__MeasurementData__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__7"


    // $ANTLR start "rule__MeasurementData__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2415:1: rule__MeasurementData__Group__7__Impl : ( ( rule__MeasurementData__DescriptionAssignment_7 )? ) ;
    public final void rule__MeasurementData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2419:1: ( ( ( rule__MeasurementData__DescriptionAssignment_7 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2420:1: ( ( rule__MeasurementData__DescriptionAssignment_7 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2420:1: ( ( rule__MeasurementData__DescriptionAssignment_7 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2421:1: ( rule__MeasurementData__DescriptionAssignment_7 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionAssignment_7()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2422:1: ( rule__MeasurementData__DescriptionAssignment_7 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2422:2: rule__MeasurementData__DescriptionAssignment_7
                    {
                    pushFollow(FOLLOW_rule__MeasurementData__DescriptionAssignment_7_in_rule__MeasurementData__Group__7__Impl4949);
                    rule__MeasurementData__DescriptionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataAccess().getDescriptionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__7__Impl"


    // $ANTLR start "rule__MeasurementData__Group__8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2432:1: rule__MeasurementData__Group__8 : rule__MeasurementData__Group__8__Impl ;
    public final void rule__MeasurementData__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2436:1: ( rule__MeasurementData__Group__8__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2437:2: rule__MeasurementData__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__8__Impl_in_rule__MeasurementData__Group__84980);
            rule__MeasurementData__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__8"


    // $ANTLR start "rule__MeasurementData__Group__8__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2443:1: rule__MeasurementData__Group__8__Impl : ( ';' ) ;
    public final void rule__MeasurementData__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2447:1: ( ( ';' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2448:1: ( ';' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2448:1: ( ';' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2449:1: ';'
            {
             before(grammarAccess.getMeasurementDataAccess().getSemicolonKeyword_8()); 
            match(input,36,FOLLOW_36_in_rule__MeasurementData__Group__8__Impl5008); 
             after(grammarAccess.getMeasurementDataAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group__8__Impl"


    // $ANTLR start "rule__MeasurementData__Group_5__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2480:1: rule__MeasurementData__Group_5__0 : rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 ;
    public final void rule__MeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2484:1: ( rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2485:2: rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_5__0__Impl_in_rule__MeasurementData__Group_5__05057);
            rule__MeasurementData__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_5__1_in_rule__MeasurementData__Group_5__05060);
            rule__MeasurementData__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_5__0"


    // $ANTLR start "rule__MeasurementData__Group_5__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2492:1: rule__MeasurementData__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__MeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2496:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2497:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2497:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2498:1: 'with'
            {
             before(grammarAccess.getMeasurementDataAccess().getWithKeyword_5_0()); 
            match(input,37,FOLLOW_37_in_rule__MeasurementData__Group_5__0__Impl5088); 
             after(grammarAccess.getMeasurementDataAccess().getWithKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_5__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_5__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2511:1: rule__MeasurementData__Group_5__1 : rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 ;
    public final void rule__MeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2515:1: ( rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2516:2: rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_5__1__Impl_in_rule__MeasurementData__Group_5__15119);
            rule__MeasurementData__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_5__2_in_rule__MeasurementData__Group_5__15122);
            rule__MeasurementData__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_5__1"


    // $ANTLR start "rule__MeasurementData__Group_5__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2523:1: rule__MeasurementData__Group_5__1__Impl : ( 'identifier' ) ;
    public final void rule__MeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2527:1: ( ( 'identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2528:1: ( 'identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2528:1: ( 'identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2529:1: 'identifier'
            {
             before(grammarAccess.getMeasurementDataAccess().getIdentifierKeyword_5_1()); 
            match(input,38,FOLLOW_38_in_rule__MeasurementData__Group_5__1__Impl5150); 
             after(grammarAccess.getMeasurementDataAccess().getIdentifierKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_5__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group_5__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2542:1: rule__MeasurementData__Group_5__2 : rule__MeasurementData__Group_5__2__Impl ;
    public final void rule__MeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2546:1: ( rule__MeasurementData__Group_5__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2547:2: rule__MeasurementData__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_5__2__Impl_in_rule__MeasurementData__Group_5__25181);
            rule__MeasurementData__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_5__2"


    // $ANTLR start "rule__MeasurementData__Group_5__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2553:1: rule__MeasurementData__Group_5__2__Impl : ( ( rule__MeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2557:1: ( ( ( rule__MeasurementData__IDAssignment_5_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2558:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2558:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2559:1: ( rule__MeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getIDAssignment_5_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2560:1: ( rule__MeasurementData__IDAssignment_5_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2560:2: rule__MeasurementData__IDAssignment_5_2
            {
            pushFollow(FOLLOW_rule__MeasurementData__IDAssignment_5_2_in_rule__MeasurementData__Group_5__2__Impl5208);
            rule__MeasurementData__IDAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getIDAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_5__2__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2576:1: rule__MeasurementData__Group_6__0 : rule__MeasurementData__Group_6__0__Impl rule__MeasurementData__Group_6__1 ;
    public final void rule__MeasurementData__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2580:1: ( rule__MeasurementData__Group_6__0__Impl rule__MeasurementData__Group_6__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2581:2: rule__MeasurementData__Group_6__0__Impl rule__MeasurementData__Group_6__1
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6__0__Impl_in_rule__MeasurementData__Group_6__05244);
            rule__MeasurementData__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_6__1_in_rule__MeasurementData__Group_6__05247);
            rule__MeasurementData__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6__0"


    // $ANTLR start "rule__MeasurementData__Group_6__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2588:1: rule__MeasurementData__Group_6__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2592:1: ( ( 'adjusted' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2593:1: ( 'adjusted' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2593:1: ( 'adjusted' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2594:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0()); 
            match(input,45,FOLLOW_45_in_rule__MeasurementData__Group_6__0__Impl5275); 
             after(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2607:1: rule__MeasurementData__Group_6__1 : rule__MeasurementData__Group_6__1__Impl rule__MeasurementData__Group_6__2 ;
    public final void rule__MeasurementData__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2611:1: ( rule__MeasurementData__Group_6__1__Impl rule__MeasurementData__Group_6__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2612:2: rule__MeasurementData__Group_6__1__Impl rule__MeasurementData__Group_6__2
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6__1__Impl_in_rule__MeasurementData__Group_6__15306);
            rule__MeasurementData__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_6__2_in_rule__MeasurementData__Group_6__15309);
            rule__MeasurementData__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6__1"


    // $ANTLR start "rule__MeasurementData__Group_6__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2619:1: rule__MeasurementData__Group_6__1__Impl : ( 'by' ) ;
    public final void rule__MeasurementData__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2623:1: ( ( 'by' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2624:1: ( 'by' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2624:1: ( 'by' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2625:1: 'by'
            {
             before(grammarAccess.getMeasurementDataAccess().getByKeyword_6_1()); 
            match(input,46,FOLLOW_46_in_rule__MeasurementData__Group_6__1__Impl5337); 
             after(grammarAccess.getMeasurementDataAccess().getByKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2638:1: rule__MeasurementData__Group_6__2 : rule__MeasurementData__Group_6__2__Impl rule__MeasurementData__Group_6__3 ;
    public final void rule__MeasurementData__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2642:1: ( rule__MeasurementData__Group_6__2__Impl rule__MeasurementData__Group_6__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2643:2: rule__MeasurementData__Group_6__2__Impl rule__MeasurementData__Group_6__3
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6__2__Impl_in_rule__MeasurementData__Group_6__25368);
            rule__MeasurementData__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_6__3_in_rule__MeasurementData__Group_6__25371);
            rule__MeasurementData__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6__2"


    // $ANTLR start "rule__MeasurementData__Group_6__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2650:1: rule__MeasurementData__Group_6__2__Impl : ( ':' ) ;
    public final void rule__MeasurementData__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2654:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2655:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2655:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2656:1: ':'
            {
             before(grammarAccess.getMeasurementDataAccess().getColonKeyword_6_2()); 
            match(input,47,FOLLOW_47_in_rule__MeasurementData__Group_6__2__Impl5399); 
             after(grammarAccess.getMeasurementDataAccess().getColonKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6__2__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2669:1: rule__MeasurementData__Group_6__3 : rule__MeasurementData__Group_6__3__Impl rule__MeasurementData__Group_6__4 ;
    public final void rule__MeasurementData__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2673:1: ( rule__MeasurementData__Group_6__3__Impl rule__MeasurementData__Group_6__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2674:2: rule__MeasurementData__Group_6__3__Impl rule__MeasurementData__Group_6__4
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6__3__Impl_in_rule__MeasurementData__Group_6__35430);
            rule__MeasurementData__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_6__4_in_rule__MeasurementData__Group_6__35433);
            rule__MeasurementData__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6__3"


    // $ANTLR start "rule__MeasurementData__Group_6__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2681:1: rule__MeasurementData__Group_6__3__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_3 ) ) ;
    public final void rule__MeasurementData__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2685:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2686:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2686:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2687:1: ( rule__MeasurementData__AdjustmentsAssignment_6_3 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2688:1: ( rule__MeasurementData__AdjustmentsAssignment_6_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2688:2: rule__MeasurementData__AdjustmentsAssignment_6_3
            {
            pushFollow(FOLLOW_rule__MeasurementData__AdjustmentsAssignment_6_3_in_rule__MeasurementData__Group_6__3__Impl5460);
            rule__MeasurementData__AdjustmentsAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6__3__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2698:1: rule__MeasurementData__Group_6__4 : rule__MeasurementData__Group_6__4__Impl ;
    public final void rule__MeasurementData__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2702:1: ( rule__MeasurementData__Group_6__4__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2703:2: rule__MeasurementData__Group_6__4__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6__4__Impl_in_rule__MeasurementData__Group_6__45490);
            rule__MeasurementData__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6__4"


    // $ANTLR start "rule__MeasurementData__Group_6__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2709:1: rule__MeasurementData__Group_6__4__Impl : ( ( rule__MeasurementData__Group_6_4__0 )* ) ;
    public final void rule__MeasurementData__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2713:1: ( ( ( rule__MeasurementData__Group_6_4__0 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2714:1: ( ( rule__MeasurementData__Group_6_4__0 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2714:1: ( ( rule__MeasurementData__Group_6_4__0 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2715:1: ( rule__MeasurementData__Group_6_4__0 )*
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_6_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2716:1: ( rule__MeasurementData__Group_6_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==48) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2716:2: rule__MeasurementData__Group_6_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MeasurementData__Group_6_4__0_in_rule__MeasurementData__Group_6__4__Impl5517);
            	    rule__MeasurementData__Group_6_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMeasurementDataAccess().getGroup_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6__4__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_4__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2736:1: rule__MeasurementData__Group_6_4__0 : rule__MeasurementData__Group_6_4__0__Impl rule__MeasurementData__Group_6_4__1 ;
    public final void rule__MeasurementData__Group_6_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2740:1: ( rule__MeasurementData__Group_6_4__0__Impl rule__MeasurementData__Group_6_4__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2741:2: rule__MeasurementData__Group_6_4__0__Impl rule__MeasurementData__Group_6_4__1
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6_4__0__Impl_in_rule__MeasurementData__Group_6_4__05558);
            rule__MeasurementData__Group_6_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_6_4__1_in_rule__MeasurementData__Group_6_4__05561);
            rule__MeasurementData__Group_6_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_4__0"


    // $ANTLR start "rule__MeasurementData__Group_6_4__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2748:1: rule__MeasurementData__Group_6_4__0__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_6_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2752:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2753:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2753:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2754:1: ','
            {
             before(grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_4_0()); 
            match(input,48,FOLLOW_48_in_rule__MeasurementData__Group_6_4__0__Impl5589); 
             after(grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_4__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_4__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2767:1: rule__MeasurementData__Group_6_4__1 : rule__MeasurementData__Group_6_4__1__Impl ;
    public final void rule__MeasurementData__Group_6_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2771:1: ( rule__MeasurementData__Group_6_4__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2772:2: rule__MeasurementData__Group_6_4__1__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6_4__1__Impl_in_rule__MeasurementData__Group_6_4__15620);
            rule__MeasurementData__Group_6_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_4__1"


    // $ANTLR start "rule__MeasurementData__Group_6_4__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2778:1: rule__MeasurementData__Group_6_4__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_4_1 ) ) ;
    public final void rule__MeasurementData__Group_6_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2782:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_4_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2783:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_4_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2783:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_4_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2784:1: ( rule__MeasurementData__AdjustmentsAssignment_6_4_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_4_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2785:1: ( rule__MeasurementData__AdjustmentsAssignment_6_4_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2785:2: rule__MeasurementData__AdjustmentsAssignment_6_4_1
            {
            pushFollow(FOLLOW_rule__MeasurementData__AdjustmentsAssignment_6_4_1_in_rule__MeasurementData__Group_6_4__1__Impl5647);
            rule__MeasurementData__AdjustmentsAssignment_6_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_4__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2799:1: rule__NonMeasurementData__Group__0 : rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 ;
    public final void rule__NonMeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2803:1: ( rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2804:2: rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__0__Impl_in_rule__NonMeasurementData__Group__05681);
            rule__NonMeasurementData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__1_in_rule__NonMeasurementData__Group__05684);
            rule__NonMeasurementData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__0"


    // $ANTLR start "rule__NonMeasurementData__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2811:1: rule__NonMeasurementData__Group__0__Impl : ( ( rule__NonMeasurementData__NameAssignment_0 ) ) ;
    public final void rule__NonMeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2815:1: ( ( ( rule__NonMeasurementData__NameAssignment_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2816:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2816:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2817:1: ( rule__NonMeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameAssignment_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2818:1: ( rule__NonMeasurementData__NameAssignment_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2818:2: rule__NonMeasurementData__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__NameAssignment_0_in_rule__NonMeasurementData__Group__0__Impl5711);
            rule__NonMeasurementData__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2828:1: rule__NonMeasurementData__Group__1 : rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 ;
    public final void rule__NonMeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2832:1: ( rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2833:2: rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__1__Impl_in_rule__NonMeasurementData__Group__15741);
            rule__NonMeasurementData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__2_in_rule__NonMeasurementData__Group__15744);
            rule__NonMeasurementData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__1"


    // $ANTLR start "rule__NonMeasurementData__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2840:1: rule__NonMeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__NonMeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2844:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2845:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2845:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2846:1: 'as'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAsKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__NonMeasurementData__Group__1__Impl5772); 
             after(grammarAccess.getNonMeasurementDataAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2859:1: rule__NonMeasurementData__Group__2 : rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 ;
    public final void rule__NonMeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2863:1: ( rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2864:2: rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__2__Impl_in_rule__NonMeasurementData__Group__25803);
            rule__NonMeasurementData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__3_in_rule__NonMeasurementData__Group__25806);
            rule__NonMeasurementData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__2"


    // $ANTLR start "rule__NonMeasurementData__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2871:1: rule__NonMeasurementData__Group__2__Impl : ( ( rule__NonMeasurementData__DataTypeAssignment_2 ) ) ;
    public final void rule__NonMeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2875:1: ( ( ( rule__NonMeasurementData__DataTypeAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2876:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2876:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2877:1: ( rule__NonMeasurementData__DataTypeAssignment_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2878:1: ( rule__NonMeasurementData__DataTypeAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2878:2: rule__NonMeasurementData__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__DataTypeAssignment_2_in_rule__NonMeasurementData__Group__2__Impl5833);
            rule__NonMeasurementData__DataTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__2__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2888:1: rule__NonMeasurementData__Group__3 : rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 ;
    public final void rule__NonMeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2892:1: ( rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2893:2: rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__3__Impl_in_rule__NonMeasurementData__Group__35863);
            rule__NonMeasurementData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__4_in_rule__NonMeasurementData__Group__35866);
            rule__NonMeasurementData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__3"


    // $ANTLR start "rule__NonMeasurementData__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2900:1: rule__NonMeasurementData__Group__3__Impl : ( 'constant' ) ;
    public final void rule__NonMeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2904:1: ( ( 'constant' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2905:1: ( 'constant' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2905:1: ( 'constant' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2906:1: 'constant'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantKeyword_3()); 
            match(input,49,FOLLOW_49_in_rule__NonMeasurementData__Group__3__Impl5894); 
             after(grammarAccess.getNonMeasurementDataAccess().getConstantKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__3__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2919:1: rule__NonMeasurementData__Group__4 : rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 ;
    public final void rule__NonMeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2923:1: ( rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2924:2: rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__4__Impl_in_rule__NonMeasurementData__Group__45925);
            rule__NonMeasurementData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__5_in_rule__NonMeasurementData__Group__45928);
            rule__NonMeasurementData__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__4"


    // $ANTLR start "rule__NonMeasurementData__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2931:1: rule__NonMeasurementData__Group__4__Impl : ( '=' ) ;
    public final void rule__NonMeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2935:1: ( ( '=' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2936:1: ( '=' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2936:1: ( '=' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2937:1: '='
            {
             before(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4()); 
            match(input,50,FOLLOW_50_in_rule__NonMeasurementData__Group__4__Impl5956); 
             after(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__4__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2950:1: rule__NonMeasurementData__Group__5 : rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 ;
    public final void rule__NonMeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2954:1: ( rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2955:2: rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__5__Impl_in_rule__NonMeasurementData__Group__55987);
            rule__NonMeasurementData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__6_in_rule__NonMeasurementData__Group__55990);
            rule__NonMeasurementData__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__5"


    // $ANTLR start "rule__NonMeasurementData__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2962:1: rule__NonMeasurementData__Group__5__Impl : ( ( rule__NonMeasurementData__ConstantAssignment_5 ) ) ;
    public final void rule__NonMeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2966:1: ( ( ( rule__NonMeasurementData__ConstantAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2967:1: ( ( rule__NonMeasurementData__ConstantAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2967:1: ( ( rule__NonMeasurementData__ConstantAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2968:1: ( rule__NonMeasurementData__ConstantAssignment_5 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2969:1: ( rule__NonMeasurementData__ConstantAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2969:2: rule__NonMeasurementData__ConstantAssignment_5
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__ConstantAssignment_5_in_rule__NonMeasurementData__Group__5__Impl6017);
            rule__NonMeasurementData__ConstantAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getConstantAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__5__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2979:1: rule__NonMeasurementData__Group__6 : rule__NonMeasurementData__Group__6__Impl rule__NonMeasurementData__Group__7 ;
    public final void rule__NonMeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2983:1: ( rule__NonMeasurementData__Group__6__Impl rule__NonMeasurementData__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2984:2: rule__NonMeasurementData__Group__6__Impl rule__NonMeasurementData__Group__7
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__6__Impl_in_rule__NonMeasurementData__Group__66047);
            rule__NonMeasurementData__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__7_in_rule__NonMeasurementData__Group__66050);
            rule__NonMeasurementData__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__6"


    // $ANTLR start "rule__NonMeasurementData__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2991:1: rule__NonMeasurementData__Group__6__Impl : ( 'value' ) ;
    public final void rule__NonMeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2995:1: ( ( 'value' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2996:1: ( 'value' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2996:1: ( 'value' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2997:1: 'value'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_6()); 
            match(input,51,FOLLOW_51_in_rule__NonMeasurementData__Group__6__Impl6078); 
             after(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__6__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3010:1: rule__NonMeasurementData__Group__7 : rule__NonMeasurementData__Group__7__Impl rule__NonMeasurementData__Group__8 ;
    public final void rule__NonMeasurementData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3014:1: ( rule__NonMeasurementData__Group__7__Impl rule__NonMeasurementData__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3015:2: rule__NonMeasurementData__Group__7__Impl rule__NonMeasurementData__Group__8
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__7__Impl_in_rule__NonMeasurementData__Group__76109);
            rule__NonMeasurementData__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__8_in_rule__NonMeasurementData__Group__76112);
            rule__NonMeasurementData__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__7"


    // $ANTLR start "rule__NonMeasurementData__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3022:1: rule__NonMeasurementData__Group__7__Impl : ( '=' ) ;
    public final void rule__NonMeasurementData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3026:1: ( ( '=' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3027:1: ( '=' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3027:1: ( '=' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3028:1: '='
            {
             before(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_7()); 
            match(input,50,FOLLOW_50_in_rule__NonMeasurementData__Group__7__Impl6140); 
             after(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__7__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3041:1: rule__NonMeasurementData__Group__8 : rule__NonMeasurementData__Group__8__Impl rule__NonMeasurementData__Group__9 ;
    public final void rule__NonMeasurementData__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3045:1: ( rule__NonMeasurementData__Group__8__Impl rule__NonMeasurementData__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3046:2: rule__NonMeasurementData__Group__8__Impl rule__NonMeasurementData__Group__9
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__8__Impl_in_rule__NonMeasurementData__Group__86171);
            rule__NonMeasurementData__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__9_in_rule__NonMeasurementData__Group__86174);
            rule__NonMeasurementData__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__8"


    // $ANTLR start "rule__NonMeasurementData__Group__8__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3053:1: rule__NonMeasurementData__Group__8__Impl : ( ( rule__NonMeasurementData__ValueAssignment_8 ) ) ;
    public final void rule__NonMeasurementData__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3057:1: ( ( ( rule__NonMeasurementData__ValueAssignment_8 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3058:1: ( ( rule__NonMeasurementData__ValueAssignment_8 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3058:1: ( ( rule__NonMeasurementData__ValueAssignment_8 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3059:1: ( rule__NonMeasurementData__ValueAssignment_8 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_8()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3060:1: ( rule__NonMeasurementData__ValueAssignment_8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3060:2: rule__NonMeasurementData__ValueAssignment_8
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__ValueAssignment_8_in_rule__NonMeasurementData__Group__8__Impl6201);
            rule__NonMeasurementData__ValueAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__8__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__9"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3070:1: rule__NonMeasurementData__Group__9 : rule__NonMeasurementData__Group__9__Impl rule__NonMeasurementData__Group__10 ;
    public final void rule__NonMeasurementData__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3074:1: ( rule__NonMeasurementData__Group__9__Impl rule__NonMeasurementData__Group__10 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3075:2: rule__NonMeasurementData__Group__9__Impl rule__NonMeasurementData__Group__10
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__9__Impl_in_rule__NonMeasurementData__Group__96231);
            rule__NonMeasurementData__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__10_in_rule__NonMeasurementData__Group__96234);
            rule__NonMeasurementData__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__9"


    // $ANTLR start "rule__NonMeasurementData__Group__9__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3082:1: rule__NonMeasurementData__Group__9__Impl : ( ( rule__NonMeasurementData__Group_9__0 )? ) ;
    public final void rule__NonMeasurementData__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3086:1: ( ( ( rule__NonMeasurementData__Group_9__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3087:1: ( ( rule__NonMeasurementData__Group_9__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3087:1: ( ( rule__NonMeasurementData__Group_9__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3088:1: ( rule__NonMeasurementData__Group_9__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_9()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3089:1: ( rule__NonMeasurementData__Group_9__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3089:2: rule__NonMeasurementData__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__NonMeasurementData__Group_9__0_in_rule__NonMeasurementData__Group__9__Impl6261);
                    rule__NonMeasurementData__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__9__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__10"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3099:1: rule__NonMeasurementData__Group__10 : rule__NonMeasurementData__Group__10__Impl rule__NonMeasurementData__Group__11 ;
    public final void rule__NonMeasurementData__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3103:1: ( rule__NonMeasurementData__Group__10__Impl rule__NonMeasurementData__Group__11 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3104:2: rule__NonMeasurementData__Group__10__Impl rule__NonMeasurementData__Group__11
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__10__Impl_in_rule__NonMeasurementData__Group__106292);
            rule__NonMeasurementData__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__11_in_rule__NonMeasurementData__Group__106295);
            rule__NonMeasurementData__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__10"


    // $ANTLR start "rule__NonMeasurementData__Group__10__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3111:1: rule__NonMeasurementData__Group__10__Impl : ( ( rule__NonMeasurementData__DescriptionAssignment_10 )? ) ;
    public final void rule__NonMeasurementData__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3115:1: ( ( ( rule__NonMeasurementData__DescriptionAssignment_10 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3116:1: ( ( rule__NonMeasurementData__DescriptionAssignment_10 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3116:1: ( ( rule__NonMeasurementData__DescriptionAssignment_10 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3117:1: ( rule__NonMeasurementData__DescriptionAssignment_10 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionAssignment_10()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3118:1: ( rule__NonMeasurementData__DescriptionAssignment_10 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3118:2: rule__NonMeasurementData__DescriptionAssignment_10
                    {
                    pushFollow(FOLLOW_rule__NonMeasurementData__DescriptionAssignment_10_in_rule__NonMeasurementData__Group__10__Impl6322);
                    rule__NonMeasurementData__DescriptionAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getDescriptionAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__10__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__11"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3128:1: rule__NonMeasurementData__Group__11 : rule__NonMeasurementData__Group__11__Impl ;
    public final void rule__NonMeasurementData__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3132:1: ( rule__NonMeasurementData__Group__11__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3133:2: rule__NonMeasurementData__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__11__Impl_in_rule__NonMeasurementData__Group__116353);
            rule__NonMeasurementData__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__11"


    // $ANTLR start "rule__NonMeasurementData__Group__11__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3139:1: rule__NonMeasurementData__Group__11__Impl : ( ';' ) ;
    public final void rule__NonMeasurementData__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3143:1: ( ( ';' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3144:1: ( ';' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3144:1: ( ';' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3145:1: ';'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getSemicolonKeyword_11()); 
            match(input,36,FOLLOW_36_in_rule__NonMeasurementData__Group__11__Impl6381); 
             after(grammarAccess.getNonMeasurementDataAccess().getSemicolonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group__11__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_9__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3182:1: rule__NonMeasurementData__Group_9__0 : rule__NonMeasurementData__Group_9__0__Impl rule__NonMeasurementData__Group_9__1 ;
    public final void rule__NonMeasurementData__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3186:1: ( rule__NonMeasurementData__Group_9__0__Impl rule__NonMeasurementData__Group_9__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3187:2: rule__NonMeasurementData__Group_9__0__Impl rule__NonMeasurementData__Group_9__1
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_9__0__Impl_in_rule__NonMeasurementData__Group_9__06436);
            rule__NonMeasurementData__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group_9__1_in_rule__NonMeasurementData__Group_9__06439);
            rule__NonMeasurementData__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_9__0"


    // $ANTLR start "rule__NonMeasurementData__Group_9__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3194:1: rule__NonMeasurementData__Group_9__0__Impl : ( 'with' ) ;
    public final void rule__NonMeasurementData__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3198:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3199:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3199:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3200:1: 'with'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getWithKeyword_9_0()); 
            match(input,37,FOLLOW_37_in_rule__NonMeasurementData__Group_9__0__Impl6467); 
             after(grammarAccess.getNonMeasurementDataAccess().getWithKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_9__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_9__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3213:1: rule__NonMeasurementData__Group_9__1 : rule__NonMeasurementData__Group_9__1__Impl rule__NonMeasurementData__Group_9__2 ;
    public final void rule__NonMeasurementData__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3217:1: ( rule__NonMeasurementData__Group_9__1__Impl rule__NonMeasurementData__Group_9__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3218:2: rule__NonMeasurementData__Group_9__1__Impl rule__NonMeasurementData__Group_9__2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_9__1__Impl_in_rule__NonMeasurementData__Group_9__16498);
            rule__NonMeasurementData__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group_9__2_in_rule__NonMeasurementData__Group_9__16501);
            rule__NonMeasurementData__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_9__1"


    // $ANTLR start "rule__NonMeasurementData__Group_9__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3225:1: rule__NonMeasurementData__Group_9__1__Impl : ( 'identifier' ) ;
    public final void rule__NonMeasurementData__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3229:1: ( ( 'identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3230:1: ( 'identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3230:1: ( 'identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3231:1: 'identifier'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIdentifierKeyword_9_1()); 
            match(input,38,FOLLOW_38_in_rule__NonMeasurementData__Group_9__1__Impl6529); 
             after(grammarAccess.getNonMeasurementDataAccess().getIdentifierKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_9__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_9__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3244:1: rule__NonMeasurementData__Group_9__2 : rule__NonMeasurementData__Group_9__2__Impl ;
    public final void rule__NonMeasurementData__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3248:1: ( rule__NonMeasurementData__Group_9__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3249:2: rule__NonMeasurementData__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_9__2__Impl_in_rule__NonMeasurementData__Group_9__26560);
            rule__NonMeasurementData__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_9__2"


    // $ANTLR start "rule__NonMeasurementData__Group_9__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3255:1: rule__NonMeasurementData__Group_9__2__Impl : ( ( rule__NonMeasurementData__IDAssignment_9_2 ) ) ;
    public final void rule__NonMeasurementData__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3259:1: ( ( ( rule__NonMeasurementData__IDAssignment_9_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3260:1: ( ( rule__NonMeasurementData__IDAssignment_9_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3260:1: ( ( rule__NonMeasurementData__IDAssignment_9_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3261:1: ( rule__NonMeasurementData__IDAssignment_9_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDAssignment_9_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3262:1: ( rule__NonMeasurementData__IDAssignment_9_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3262:2: rule__NonMeasurementData__IDAssignment_9_2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__IDAssignment_9_2_in_rule__NonMeasurementData__Group_9__2__Impl6587);
            rule__NonMeasurementData__IDAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getIDAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_9__2__Impl"


    // $ANTLR start "rule__DataRange__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3278:1: rule__DataRange__Group__0 : rule__DataRange__Group__0__Impl rule__DataRange__Group__1 ;
    public final void rule__DataRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3282:1: ( rule__DataRange__Group__0__Impl rule__DataRange__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3283:2: rule__DataRange__Group__0__Impl rule__DataRange__Group__1
            {
            pushFollow(FOLLOW_rule__DataRange__Group__0__Impl_in_rule__DataRange__Group__06623);
            rule__DataRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group__1_in_rule__DataRange__Group__06626);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3290:1: rule__DataRange__Group__0__Impl : ( 'with' ) ;
    public final void rule__DataRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3294:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3295:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3295:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3296:1: 'with'
            {
             before(grammarAccess.getDataRangeAccess().getWithKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__DataRange__Group__0__Impl6654); 
             after(grammarAccess.getDataRangeAccess().getWithKeyword_0()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3309:1: rule__DataRange__Group__1 : rule__DataRange__Group__1__Impl rule__DataRange__Group__2 ;
    public final void rule__DataRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3313:1: ( rule__DataRange__Group__1__Impl rule__DataRange__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3314:2: rule__DataRange__Group__1__Impl rule__DataRange__Group__2
            {
            pushFollow(FOLLOW_rule__DataRange__Group__1__Impl_in_rule__DataRange__Group__16685);
            rule__DataRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group__2_in_rule__DataRange__Group__16688);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3321:1: rule__DataRange__Group__1__Impl : ( 'range' ) ;
    public final void rule__DataRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3325:1: ( ( 'range' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3326:1: ( 'range' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3326:1: ( 'range' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3327:1: 'range'
            {
             before(grammarAccess.getDataRangeAccess().getRangeKeyword_1()); 
            match(input,52,FOLLOW_52_in_rule__DataRange__Group__1__Impl6716); 
             after(grammarAccess.getDataRangeAccess().getRangeKeyword_1()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3340:1: rule__DataRange__Group__2 : rule__DataRange__Group__2__Impl rule__DataRange__Group__3 ;
    public final void rule__DataRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3344:1: ( rule__DataRange__Group__2__Impl rule__DataRange__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3345:2: rule__DataRange__Group__2__Impl rule__DataRange__Group__3
            {
            pushFollow(FOLLOW_rule__DataRange__Group__2__Impl_in_rule__DataRange__Group__26747);
            rule__DataRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group__3_in_rule__DataRange__Group__26750);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3352:1: rule__DataRange__Group__2__Impl : ( ( rule__DataRange__RangeAssignment_2 ) ) ;
    public final void rule__DataRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3356:1: ( ( ( rule__DataRange__RangeAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3357:1: ( ( rule__DataRange__RangeAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3357:1: ( ( rule__DataRange__RangeAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3358:1: ( rule__DataRange__RangeAssignment_2 )
            {
             before(grammarAccess.getDataRangeAccess().getRangeAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3359:1: ( rule__DataRange__RangeAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3359:2: rule__DataRange__RangeAssignment_2
            {
            pushFollow(FOLLOW_rule__DataRange__RangeAssignment_2_in_rule__DataRange__Group__2__Impl6777);
            rule__DataRange__RangeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataRangeAccess().getRangeAssignment_2()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3369:1: rule__DataRange__Group__3 : rule__DataRange__Group__3__Impl ;
    public final void rule__DataRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3373:1: ( rule__DataRange__Group__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3374:2: rule__DataRange__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DataRange__Group__3__Impl_in_rule__DataRange__Group__36807);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3380:1: rule__DataRange__Group__3__Impl : ( ';' ) ;
    public final void rule__DataRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3384:1: ( ( ';' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3385:1: ( ';' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3385:1: ( ';' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3386:1: ';'
            {
             before(grammarAccess.getDataRangeAccess().getSemicolonKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__DataRange__Group__3__Impl6835); 
             after(grammarAccess.getDataRangeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Interval__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3407:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3411:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3412:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
            {
            pushFollow(FOLLOW_rule__Interval__Group__0__Impl_in_rule__Interval__Group__06874);
            rule__Interval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group__1_in_rule__Interval__Group__06877);
            rule__Interval__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__0"


    // $ANTLR start "rule__Interval__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3419:1: rule__Interval__Group__0__Impl : ( ( rule__Interval__LowerBoundAssignment_0 ) ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3423:1: ( ( ( rule__Interval__LowerBoundAssignment_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3424:1: ( ( rule__Interval__LowerBoundAssignment_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3424:1: ( ( rule__Interval__LowerBoundAssignment_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3425:1: ( rule__Interval__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundAssignment_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3426:1: ( rule__Interval__LowerBoundAssignment_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3426:2: rule__Interval__LowerBoundAssignment_0
            {
            pushFollow(FOLLOW_rule__Interval__LowerBoundAssignment_0_in_rule__Interval__Group__0__Impl6904);
            rule__Interval__LowerBoundAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getLowerBoundAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__0__Impl"


    // $ANTLR start "rule__Interval__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3436:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3440:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3441:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FOLLOW_rule__Interval__Group__1__Impl_in_rule__Interval__Group__16934);
            rule__Interval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group__2_in_rule__Interval__Group__16937);
            rule__Interval__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__1"


    // $ANTLR start "rule__Interval__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3448:1: rule__Interval__Group__1__Impl : ( '...' ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3452:1: ( ( '...' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3453:1: ( '...' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3453:1: ( '...' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3454:1: '...'
            {
             before(grammarAccess.getIntervalAccess().getFullStopFullStopFullStopKeyword_1()); 
            match(input,53,FOLLOW_53_in_rule__Interval__Group__1__Impl6965); 
             after(grammarAccess.getIntervalAccess().getFullStopFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__1__Impl"


    // $ANTLR start "rule__Interval__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3467:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3471:1: ( rule__Interval__Group__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3472:2: rule__Interval__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Interval__Group__2__Impl_in_rule__Interval__Group__26996);
            rule__Interval__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__2"


    // $ANTLR start "rule__Interval__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3478:1: rule__Interval__Group__2__Impl : ( ( rule__Interval__UpperBoundAssignment_2 ) ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3482:1: ( ( ( rule__Interval__UpperBoundAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3483:1: ( ( rule__Interval__UpperBoundAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3483:1: ( ( rule__Interval__UpperBoundAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3484:1: ( rule__Interval__UpperBoundAssignment_2 )
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3485:1: ( rule__Interval__UpperBoundAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3485:2: rule__Interval__UpperBoundAssignment_2
            {
            pushFollow(FOLLOW_rule__Interval__UpperBoundAssignment_2_in_rule__Interval__Group__2__Impl7023);
            rule__Interval__UpperBoundAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getUpperBoundAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__2__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_0__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3501:1: rule__LinearDataConversion__Group_0__0 : rule__LinearDataConversion__Group_0__0__Impl rule__LinearDataConversion__Group_0__1 ;
    public final void rule__LinearDataConversion__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3505:1: ( rule__LinearDataConversion__Group_0__0__Impl rule__LinearDataConversion__Group_0__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3506:2: rule__LinearDataConversion__Group_0__0__Impl rule__LinearDataConversion__Group_0__1
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__0__Impl_in_rule__LinearDataConversion__Group_0__07059);
            rule__LinearDataConversion__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__1_in_rule__LinearDataConversion__Group_0__07062);
            rule__LinearDataConversion__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__0"


    // $ANTLR start "rule__LinearDataConversion__Group_0__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3513:1: rule__LinearDataConversion__Group_0__0__Impl : ( 'with' ) ;
    public final void rule__LinearDataConversion__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3517:1: ( ( 'with' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3518:1: ( 'with' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3518:1: ( 'with' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3519:1: 'with'
            {
             before(grammarAccess.getLinearDataConversionAccess().getWithKeyword_0_0()); 
            match(input,37,FOLLOW_37_in_rule__LinearDataConversion__Group_0__0__Impl7090); 
             after(grammarAccess.getLinearDataConversionAccess().getWithKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__0__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_0__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3532:1: rule__LinearDataConversion__Group_0__1 : rule__LinearDataConversion__Group_0__1__Impl rule__LinearDataConversion__Group_0__2 ;
    public final void rule__LinearDataConversion__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3536:1: ( rule__LinearDataConversion__Group_0__1__Impl rule__LinearDataConversion__Group_0__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3537:2: rule__LinearDataConversion__Group_0__1__Impl rule__LinearDataConversion__Group_0__2
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__1__Impl_in_rule__LinearDataConversion__Group_0__17121);
            rule__LinearDataConversion__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__2_in_rule__LinearDataConversion__Group_0__17124);
            rule__LinearDataConversion__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__1"


    // $ANTLR start "rule__LinearDataConversion__Group_0__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3544:1: rule__LinearDataConversion__Group_0__1__Impl : ( 'scaling factor' ) ;
    public final void rule__LinearDataConversion__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3548:1: ( ( 'scaling factor' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3549:1: ( 'scaling factor' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3549:1: ( 'scaling factor' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3550:1: 'scaling factor'
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorKeyword_0_1()); 
            match(input,54,FOLLOW_54_in_rule__LinearDataConversion__Group_0__1__Impl7152); 
             after(grammarAccess.getLinearDataConversionAccess().getScalingFactorKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__1__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_0__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3563:1: rule__LinearDataConversion__Group_0__2 : rule__LinearDataConversion__Group_0__2__Impl rule__LinearDataConversion__Group_0__3 ;
    public final void rule__LinearDataConversion__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3567:1: ( rule__LinearDataConversion__Group_0__2__Impl rule__LinearDataConversion__Group_0__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3568:2: rule__LinearDataConversion__Group_0__2__Impl rule__LinearDataConversion__Group_0__3
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__2__Impl_in_rule__LinearDataConversion__Group_0__27183);
            rule__LinearDataConversion__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__3_in_rule__LinearDataConversion__Group_0__27186);
            rule__LinearDataConversion__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__2"


    // $ANTLR start "rule__LinearDataConversion__Group_0__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3575:1: rule__LinearDataConversion__Group_0__2__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3579:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3580:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3580:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3581:1: ':'
            {
             before(grammarAccess.getLinearDataConversionAccess().getColonKeyword_0_2()); 
            match(input,47,FOLLOW_47_in_rule__LinearDataConversion__Group_0__2__Impl7214); 
             after(grammarAccess.getLinearDataConversionAccess().getColonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__2__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_0__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3594:1: rule__LinearDataConversion__Group_0__3 : rule__LinearDataConversion__Group_0__3__Impl rule__LinearDataConversion__Group_0__4 ;
    public final void rule__LinearDataConversion__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3598:1: ( rule__LinearDataConversion__Group_0__3__Impl rule__LinearDataConversion__Group_0__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3599:2: rule__LinearDataConversion__Group_0__3__Impl rule__LinearDataConversion__Group_0__4
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__3__Impl_in_rule__LinearDataConversion__Group_0__37245);
            rule__LinearDataConversion__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__4_in_rule__LinearDataConversion__Group_0__37248);
            rule__LinearDataConversion__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__3"


    // $ANTLR start "rule__LinearDataConversion__Group_0__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3606:1: rule__LinearDataConversion__Group_0__3__Impl : ( ( rule__LinearDataConversion__ScalingFactorAssignment_0_3 ) ) ;
    public final void rule__LinearDataConversion__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3610:1: ( ( ( rule__LinearDataConversion__ScalingFactorAssignment_0_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3611:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_0_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3611:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_0_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3612:1: ( rule__LinearDataConversion__ScalingFactorAssignment_0_3 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorAssignment_0_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3613:1: ( rule__LinearDataConversion__ScalingFactorAssignment_0_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3613:2: rule__LinearDataConversion__ScalingFactorAssignment_0_3
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__ScalingFactorAssignment_0_3_in_rule__LinearDataConversion__Group_0__3__Impl7275);
            rule__LinearDataConversion__ScalingFactorAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionAccess().getScalingFactorAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__3__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_0__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3623:1: rule__LinearDataConversion__Group_0__4 : rule__LinearDataConversion__Group_0__4__Impl rule__LinearDataConversion__Group_0__5 ;
    public final void rule__LinearDataConversion__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3627:1: ( rule__LinearDataConversion__Group_0__4__Impl rule__LinearDataConversion__Group_0__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3628:2: rule__LinearDataConversion__Group_0__4__Impl rule__LinearDataConversion__Group_0__5
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__4__Impl_in_rule__LinearDataConversion__Group_0__47305);
            rule__LinearDataConversion__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__5_in_rule__LinearDataConversion__Group_0__47308);
            rule__LinearDataConversion__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__4"


    // $ANTLR start "rule__LinearDataConversion__Group_0__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3635:1: rule__LinearDataConversion__Group_0__4__Impl : ( 'and' ) ;
    public final void rule__LinearDataConversion__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3639:1: ( ( 'and' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3640:1: ( 'and' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3640:1: ( 'and' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3641:1: 'and'
            {
             before(grammarAccess.getLinearDataConversionAccess().getAndKeyword_0_4()); 
            match(input,55,FOLLOW_55_in_rule__LinearDataConversion__Group_0__4__Impl7336); 
             after(grammarAccess.getLinearDataConversionAccess().getAndKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__4__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_0__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3654:1: rule__LinearDataConversion__Group_0__5 : rule__LinearDataConversion__Group_0__5__Impl rule__LinearDataConversion__Group_0__6 ;
    public final void rule__LinearDataConversion__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3658:1: ( rule__LinearDataConversion__Group_0__5__Impl rule__LinearDataConversion__Group_0__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3659:2: rule__LinearDataConversion__Group_0__5__Impl rule__LinearDataConversion__Group_0__6
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__5__Impl_in_rule__LinearDataConversion__Group_0__57367);
            rule__LinearDataConversion__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__6_in_rule__LinearDataConversion__Group_0__57370);
            rule__LinearDataConversion__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__5"


    // $ANTLR start "rule__LinearDataConversion__Group_0__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3666:1: rule__LinearDataConversion__Group_0__5__Impl : ( 'offset' ) ;
    public final void rule__LinearDataConversion__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3670:1: ( ( 'offset' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3671:1: ( 'offset' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3671:1: ( 'offset' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3672:1: 'offset'
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetKeyword_0_5()); 
            match(input,56,FOLLOW_56_in_rule__LinearDataConversion__Group_0__5__Impl7398); 
             after(grammarAccess.getLinearDataConversionAccess().getOffsetKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__5__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_0__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3685:1: rule__LinearDataConversion__Group_0__6 : rule__LinearDataConversion__Group_0__6__Impl rule__LinearDataConversion__Group_0__7 ;
    public final void rule__LinearDataConversion__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3689:1: ( rule__LinearDataConversion__Group_0__6__Impl rule__LinearDataConversion__Group_0__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3690:2: rule__LinearDataConversion__Group_0__6__Impl rule__LinearDataConversion__Group_0__7
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__6__Impl_in_rule__LinearDataConversion__Group_0__67429);
            rule__LinearDataConversion__Group_0__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__7_in_rule__LinearDataConversion__Group_0__67432);
            rule__LinearDataConversion__Group_0__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__6"


    // $ANTLR start "rule__LinearDataConversion__Group_0__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3697:1: rule__LinearDataConversion__Group_0__6__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3701:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3702:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3702:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3703:1: ':'
            {
             before(grammarAccess.getLinearDataConversionAccess().getColonKeyword_0_6()); 
            match(input,47,FOLLOW_47_in_rule__LinearDataConversion__Group_0__6__Impl7460); 
             after(grammarAccess.getLinearDataConversionAccess().getColonKeyword_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__6__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_0__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3716:1: rule__LinearDataConversion__Group_0__7 : rule__LinearDataConversion__Group_0__7__Impl ;
    public final void rule__LinearDataConversion__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3720:1: ( rule__LinearDataConversion__Group_0__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3721:2: rule__LinearDataConversion__Group_0__7__Impl
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_0__7__Impl_in_rule__LinearDataConversion__Group_0__77491);
            rule__LinearDataConversion__Group_0__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__7"


    // $ANTLR start "rule__LinearDataConversion__Group_0__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3727:1: rule__LinearDataConversion__Group_0__7__Impl : ( ( rule__LinearDataConversion__OffsetAssignment_0_7 ) ) ;
    public final void rule__LinearDataConversion__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3731:1: ( ( ( rule__LinearDataConversion__OffsetAssignment_0_7 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3732:1: ( ( rule__LinearDataConversion__OffsetAssignment_0_7 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3732:1: ( ( rule__LinearDataConversion__OffsetAssignment_0_7 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3733:1: ( rule__LinearDataConversion__OffsetAssignment_0_7 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetAssignment_0_7()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3734:1: ( rule__LinearDataConversion__OffsetAssignment_0_7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3734:2: rule__LinearDataConversion__OffsetAssignment_0_7
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__OffsetAssignment_0_7_in_rule__LinearDataConversion__Group_0__7__Impl7518);
            rule__LinearDataConversion__OffsetAssignment_0_7();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionAccess().getOffsetAssignment_0_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_0__7__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_1__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3760:1: rule__LinearDataConversion__Group_1__0 : rule__LinearDataConversion__Group_1__0__Impl rule__LinearDataConversion__Group_1__1 ;
    public final void rule__LinearDataConversion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3764:1: ( rule__LinearDataConversion__Group_1__0__Impl rule__LinearDataConversion__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3765:2: rule__LinearDataConversion__Group_1__0__Impl rule__LinearDataConversion__Group_1__1
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__0__Impl_in_rule__LinearDataConversion__Group_1__07564);
            rule__LinearDataConversion__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__1_in_rule__LinearDataConversion__Group_1__07567);
            rule__LinearDataConversion__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__0"


    // $ANTLR start "rule__LinearDataConversion__Group_1__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3772:1: rule__LinearDataConversion__Group_1__0__Impl : ( 'linear mapping' ) ;
    public final void rule__LinearDataConversion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3776:1: ( ( 'linear mapping' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3777:1: ( 'linear mapping' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3777:1: ( 'linear mapping' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3778:1: 'linear mapping'
            {
             before(grammarAccess.getLinearDataConversionAccess().getLinearMappingKeyword_1_0()); 
            match(input,57,FOLLOW_57_in_rule__LinearDataConversion__Group_1__0__Impl7595); 
             after(grammarAccess.getLinearDataConversionAccess().getLinearMappingKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__0__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_1__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3791:1: rule__LinearDataConversion__Group_1__1 : rule__LinearDataConversion__Group_1__1__Impl rule__LinearDataConversion__Group_1__2 ;
    public final void rule__LinearDataConversion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3795:1: ( rule__LinearDataConversion__Group_1__1__Impl rule__LinearDataConversion__Group_1__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3796:2: rule__LinearDataConversion__Group_1__1__Impl rule__LinearDataConversion__Group_1__2
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__1__Impl_in_rule__LinearDataConversion__Group_1__17626);
            rule__LinearDataConversion__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__2_in_rule__LinearDataConversion__Group_1__17629);
            rule__LinearDataConversion__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__1"


    // $ANTLR start "rule__LinearDataConversion__Group_1__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3803:1: rule__LinearDataConversion__Group_1__1__Impl : ( '[' ) ;
    public final void rule__LinearDataConversion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3807:1: ( ( '[' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3808:1: ( '[' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3808:1: ( '[' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3809:1: '['
            {
             before(grammarAccess.getLinearDataConversionAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,58,FOLLOW_58_in_rule__LinearDataConversion__Group_1__1__Impl7657); 
             after(grammarAccess.getLinearDataConversionAccess().getLeftSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__1__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_1__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3822:1: rule__LinearDataConversion__Group_1__2 : rule__LinearDataConversion__Group_1__2__Impl rule__LinearDataConversion__Group_1__3 ;
    public final void rule__LinearDataConversion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3826:1: ( rule__LinearDataConversion__Group_1__2__Impl rule__LinearDataConversion__Group_1__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3827:2: rule__LinearDataConversion__Group_1__2__Impl rule__LinearDataConversion__Group_1__3
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__2__Impl_in_rule__LinearDataConversion__Group_1__27688);
            rule__LinearDataConversion__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__3_in_rule__LinearDataConversion__Group_1__27691);
            rule__LinearDataConversion__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__2"


    // $ANTLR start "rule__LinearDataConversion__Group_1__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3834:1: rule__LinearDataConversion__Group_1__2__Impl : ( ( rule__LinearDataConversion__FromIntervalAssignment_1_2 ) ) ;
    public final void rule__LinearDataConversion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3838:1: ( ( ( rule__LinearDataConversion__FromIntervalAssignment_1_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3839:1: ( ( rule__LinearDataConversion__FromIntervalAssignment_1_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3839:1: ( ( rule__LinearDataConversion__FromIntervalAssignment_1_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3840:1: ( rule__LinearDataConversion__FromIntervalAssignment_1_2 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getFromIntervalAssignment_1_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3841:1: ( rule__LinearDataConversion__FromIntervalAssignment_1_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3841:2: rule__LinearDataConversion__FromIntervalAssignment_1_2
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__FromIntervalAssignment_1_2_in_rule__LinearDataConversion__Group_1__2__Impl7718);
            rule__LinearDataConversion__FromIntervalAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionAccess().getFromIntervalAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__2__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_1__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3851:1: rule__LinearDataConversion__Group_1__3 : rule__LinearDataConversion__Group_1__3__Impl rule__LinearDataConversion__Group_1__4 ;
    public final void rule__LinearDataConversion__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3855:1: ( rule__LinearDataConversion__Group_1__3__Impl rule__LinearDataConversion__Group_1__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3856:2: rule__LinearDataConversion__Group_1__3__Impl rule__LinearDataConversion__Group_1__4
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__3__Impl_in_rule__LinearDataConversion__Group_1__37748);
            rule__LinearDataConversion__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__4_in_rule__LinearDataConversion__Group_1__37751);
            rule__LinearDataConversion__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__3"


    // $ANTLR start "rule__LinearDataConversion__Group_1__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3863:1: rule__LinearDataConversion__Group_1__3__Impl : ( ']' ) ;
    public final void rule__LinearDataConversion__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3867:1: ( ( ']' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3868:1: ( ']' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3868:1: ( ']' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3869:1: ']'
            {
             before(grammarAccess.getLinearDataConversionAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,59,FOLLOW_59_in_rule__LinearDataConversion__Group_1__3__Impl7779); 
             after(grammarAccess.getLinearDataConversionAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__3__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_1__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3882:1: rule__LinearDataConversion__Group_1__4 : rule__LinearDataConversion__Group_1__4__Impl rule__LinearDataConversion__Group_1__5 ;
    public final void rule__LinearDataConversion__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3886:1: ( rule__LinearDataConversion__Group_1__4__Impl rule__LinearDataConversion__Group_1__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3887:2: rule__LinearDataConversion__Group_1__4__Impl rule__LinearDataConversion__Group_1__5
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__4__Impl_in_rule__LinearDataConversion__Group_1__47810);
            rule__LinearDataConversion__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__5_in_rule__LinearDataConversion__Group_1__47813);
            rule__LinearDataConversion__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__4"


    // $ANTLR start "rule__LinearDataConversion__Group_1__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3894:1: rule__LinearDataConversion__Group_1__4__Impl : ( '=>' ) ;
    public final void rule__LinearDataConversion__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3898:1: ( ( '=>' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3899:1: ( '=>' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3899:1: ( '=>' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3900:1: '=>'
            {
             before(grammarAccess.getLinearDataConversionAccess().getEqualsSignGreaterThanSignKeyword_1_4()); 
            match(input,60,FOLLOW_60_in_rule__LinearDataConversion__Group_1__4__Impl7841); 
             after(grammarAccess.getLinearDataConversionAccess().getEqualsSignGreaterThanSignKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__4__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_1__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3913:1: rule__LinearDataConversion__Group_1__5 : rule__LinearDataConversion__Group_1__5__Impl rule__LinearDataConversion__Group_1__6 ;
    public final void rule__LinearDataConversion__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3917:1: ( rule__LinearDataConversion__Group_1__5__Impl rule__LinearDataConversion__Group_1__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3918:2: rule__LinearDataConversion__Group_1__5__Impl rule__LinearDataConversion__Group_1__6
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__5__Impl_in_rule__LinearDataConversion__Group_1__57872);
            rule__LinearDataConversion__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__6_in_rule__LinearDataConversion__Group_1__57875);
            rule__LinearDataConversion__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__5"


    // $ANTLR start "rule__LinearDataConversion__Group_1__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3925:1: rule__LinearDataConversion__Group_1__5__Impl : ( '[' ) ;
    public final void rule__LinearDataConversion__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3929:1: ( ( '[' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3930:1: ( '[' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3930:1: ( '[' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3931:1: '['
            {
             before(grammarAccess.getLinearDataConversionAccess().getLeftSquareBracketKeyword_1_5()); 
            match(input,58,FOLLOW_58_in_rule__LinearDataConversion__Group_1__5__Impl7903); 
             after(grammarAccess.getLinearDataConversionAccess().getLeftSquareBracketKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__5__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_1__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3944:1: rule__LinearDataConversion__Group_1__6 : rule__LinearDataConversion__Group_1__6__Impl rule__LinearDataConversion__Group_1__7 ;
    public final void rule__LinearDataConversion__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3948:1: ( rule__LinearDataConversion__Group_1__6__Impl rule__LinearDataConversion__Group_1__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3949:2: rule__LinearDataConversion__Group_1__6__Impl rule__LinearDataConversion__Group_1__7
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__6__Impl_in_rule__LinearDataConversion__Group_1__67934);
            rule__LinearDataConversion__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__7_in_rule__LinearDataConversion__Group_1__67937);
            rule__LinearDataConversion__Group_1__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__6"


    // $ANTLR start "rule__LinearDataConversion__Group_1__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3956:1: rule__LinearDataConversion__Group_1__6__Impl : ( ( rule__LinearDataConversion__ToIntervalAssignment_1_6 ) ) ;
    public final void rule__LinearDataConversion__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3960:1: ( ( ( rule__LinearDataConversion__ToIntervalAssignment_1_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3961:1: ( ( rule__LinearDataConversion__ToIntervalAssignment_1_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3961:1: ( ( rule__LinearDataConversion__ToIntervalAssignment_1_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3962:1: ( rule__LinearDataConversion__ToIntervalAssignment_1_6 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getToIntervalAssignment_1_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3963:1: ( rule__LinearDataConversion__ToIntervalAssignment_1_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3963:2: rule__LinearDataConversion__ToIntervalAssignment_1_6
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__ToIntervalAssignment_1_6_in_rule__LinearDataConversion__Group_1__6__Impl7964);
            rule__LinearDataConversion__ToIntervalAssignment_1_6();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionAccess().getToIntervalAssignment_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__6__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group_1__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3973:1: rule__LinearDataConversion__Group_1__7 : rule__LinearDataConversion__Group_1__7__Impl ;
    public final void rule__LinearDataConversion__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3977:1: ( rule__LinearDataConversion__Group_1__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3978:2: rule__LinearDataConversion__Group_1__7__Impl
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group_1__7__Impl_in_rule__LinearDataConversion__Group_1__77994);
            rule__LinearDataConversion__Group_1__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__7"


    // $ANTLR start "rule__LinearDataConversion__Group_1__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3984:1: rule__LinearDataConversion__Group_1__7__Impl : ( ']' ) ;
    public final void rule__LinearDataConversion__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3988:1: ( ( ']' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3989:1: ( ']' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3989:1: ( ']' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3990:1: ']'
            {
             before(grammarAccess.getLinearDataConversionAccess().getRightSquareBracketKeyword_1_7()); 
            match(input,59,FOLLOW_59_in_rule__LinearDataConversion__Group_1__7__Impl8022); 
             after(grammarAccess.getLinearDataConversionAccess().getRightSquareBracketKeyword_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group_1__7__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4019:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4023:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4024:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__08069);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__08072);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4031:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4035:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4036:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4036:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4037:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl8099); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4048:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4052:1: ( rule__DOUBLE__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4053:2: rule__DOUBLE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__18128);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4059:1: rule__DOUBLE__Group__1__Impl : ( ( rule__DOUBLE__Group_1__0 )? ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4063:1: ( ( ( rule__DOUBLE__Group_1__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4064:1: ( ( rule__DOUBLE__Group_1__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4064:1: ( ( rule__DOUBLE__Group_1__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4065:1: ( rule__DOUBLE__Group_1__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4066:1: ( rule__DOUBLE__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==61) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4066:2: rule__DOUBLE__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl8155);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4080:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4084:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4085:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__08190);
            rule__DOUBLE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__08193);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4092:1: rule__DOUBLE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4096:1: ( ( '.' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4097:1: ( '.' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4097:1: ( '.' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4098:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
            match(input,61,FOLLOW_61_in_rule__DOUBLE__Group_1__0__Impl8221); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4111:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4115:1: ( rule__DOUBLE__Group_1__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4116:2: rule__DOUBLE__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__18252);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4122:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4126:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4127:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4127:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4128:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl8279); 
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


    // $ANTLR start "rule__SensorInterface__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4144:1: rule__SensorInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4148:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4149:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4149:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4150:1: RULE_ID
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SensorInterface__NameAssignment_18317); 
             after(grammarAccess.getSensorInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__NameAssignment_1"


    // $ANTLR start "rule__SensorInterface__DescriptionAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4159:1: rule__SensorInterface__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SensorInterface__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4163:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4164:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4164:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4165:1: RULE_STRING
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SensorInterface__DescriptionAssignment_28348); 
             after(grammarAccess.getSensorInterfaceAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__DescriptionAssignment_2"


    // $ANTLR start "rule__SensorInterface__IDAssignment_3_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4174:1: rule__SensorInterface__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__SensorInterface__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4178:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4179:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4179:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4180:1: RULE_STRING
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SensorInterface__IDAssignment_3_28379); 
             after(grammarAccess.getSensorInterfaceAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__IDAssignment_3_2"


    // $ANTLR start "rule__SensorInterface__MetaInformationAssignment_5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4189:1: rule__SensorInterface__MetaInformationAssignment_5 : ( ruleSensorMetaInformation ) ;
    public final void rule__SensorInterface__MetaInformationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4193:1: ( ( ruleSensorMetaInformation ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4194:1: ( ruleSensorMetaInformation )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4194:1: ( ruleSensorMetaInformation )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4195:1: ruleSensorMetaInformation
            {
             before(grammarAccess.getSensorInterfaceAccess().getMetaInformationSensorMetaInformationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleSensorMetaInformation_in_rule__SensorInterface__MetaInformationAssignment_58410);
            ruleSensorMetaInformation();

            state._fsp--;

             after(grammarAccess.getSensorInterfaceAccess().getMetaInformationSensorMetaInformationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__MetaInformationAssignment_5"


    // $ANTLR start "rule__SensorInterface__DataDescriptionAssignment_6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4204:1: rule__SensorInterface__DataDescriptionAssignment_6 : ( ruleSensorDataDescription ) ;
    public final void rule__SensorInterface__DataDescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4208:1: ( ( ruleSensorDataDescription ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4209:1: ( ruleSensorDataDescription )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4209:1: ( ruleSensorDataDescription )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4210:1: ruleSensorDataDescription
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionSensorDataDescriptionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSensorDataDescription_in_rule__SensorInterface__DataDescriptionAssignment_68441);
            ruleSensorDataDescription();

            state._fsp--;

             after(grammarAccess.getSensorInterfaceAccess().getDataDescriptionSensorDataDescriptionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__DataDescriptionAssignment_6"


    // $ANTLR start "rule__SensorMetaInformation__CodingAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4219:1: rule__SensorMetaInformation__CodingAssignment_1 : ( ruleCoding ) ;
    public final void rule__SensorMetaInformation__CodingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4223:1: ( ( ruleCoding ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4224:1: ( ruleCoding )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4224:1: ( ruleCoding )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4225:1: ruleCoding
            {
             before(grammarAccess.getSensorMetaInformationAccess().getCodingCodingEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCoding_in_rule__SensorMetaInformation__CodingAssignment_18472);
            ruleCoding();

            state._fsp--;

             after(grammarAccess.getSensorMetaInformationAccess().getCodingCodingEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__CodingAssignment_1"


    // $ANTLR start "rule__SensorMetaInformation__EndiannessAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4234:1: rule__SensorMetaInformation__EndiannessAssignment_3 : ( ruleEndianness ) ;
    public final void rule__SensorMetaInformation__EndiannessAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4238:1: ( ( ruleEndianness ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4239:1: ( ruleEndianness )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4239:1: ( ruleEndianness )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4240:1: ruleEndianness
            {
             before(grammarAccess.getSensorMetaInformationAccess().getEndiannessEndiannessEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEndianness_in_rule__SensorMetaInformation__EndiannessAssignment_38503);
            ruleEndianness();

            state._fsp--;

             after(grammarAccess.getSensorMetaInformationAccess().getEndiannessEndiannessEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__EndiannessAssignment_3"


    // $ANTLR start "rule__SensorMetaInformation__AlignmentAssignment_5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4249:1: rule__SensorMetaInformation__AlignmentAssignment_5 : ( ruleAlignment ) ;
    public final void rule__SensorMetaInformation__AlignmentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4253:1: ( ( ruleAlignment ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4254:1: ( ruleAlignment )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4254:1: ( ruleAlignment )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4255:1: ruleAlignment
            {
             before(grammarAccess.getSensorMetaInformationAccess().getAlignmentAlignmentEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAlignment_in_rule__SensorMetaInformation__AlignmentAssignment_58534);
            ruleAlignment();

            state._fsp--;

             after(grammarAccess.getSensorMetaInformationAccess().getAlignmentAlignmentEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorMetaInformation__AlignmentAssignment_5"


    // $ANTLR start "rule__SensorDataDescription__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4264:1: rule__SensorDataDescription__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorDataDescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4268:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4269:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4269:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4270:1: RULE_ID
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SensorDataDescription__NameAssignment_18565); 
             after(grammarAccess.getSensorDataDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__NameAssignment_1"


    // $ANTLR start "rule__SensorDataDescription__DescriptionAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4279:1: rule__SensorDataDescription__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SensorDataDescription__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4283:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4284:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4284:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4285:1: RULE_STRING
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SensorDataDescription__DescriptionAssignment_28596); 
             after(grammarAccess.getSensorDataDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__DescriptionAssignment_2"


    // $ANTLR start "rule__SensorDataDescription__IDAssignment_3_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4294:1: rule__SensorDataDescription__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__SensorDataDescription__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4298:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4299:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4299:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4300:1: RULE_STRING
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SensorDataDescription__IDAssignment_3_28627); 
             after(grammarAccess.getSensorDataDescriptionAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__IDAssignment_3_2"


    // $ANTLR start "rule__SensorDataDescription__DataSetsAssignment_5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4309:1: rule__SensorDataDescription__DataSetsAssignment_5 : ( ruleDataSet ) ;
    public final void rule__SensorDataDescription__DataSetsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4313:1: ( ( ruleDataSet ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4314:1: ( ruleDataSet )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4314:1: ( ruleDataSet )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4315:1: ruleDataSet
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsDataSetParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDataSet_in_rule__SensorDataDescription__DataSetsAssignment_58658);
            ruleDataSet();

            state._fsp--;

             after(grammarAccess.getSensorDataDescriptionAccess().getDataSetsDataSetParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__DataSetsAssignment_5"


    // $ANTLR start "rule__DataSet__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4324:1: rule__DataSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4328:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4329:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4329:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4330:1: RULE_ID
            {
             before(grammarAccess.getDataSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataSet__NameAssignment_18689); 
             after(grammarAccess.getDataSetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__NameAssignment_1"


    // $ANTLR start "rule__DataSet__DescriptionAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4339:1: rule__DataSet__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DataSet__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4343:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4344:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4344:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4345:1: RULE_STRING
            {
             before(grammarAccess.getDataSetAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataSet__DescriptionAssignment_28720); 
             after(grammarAccess.getDataSetAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__DescriptionAssignment_2"


    // $ANTLR start "rule__DataSet__IDAssignment_3_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4354:1: rule__DataSet__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__DataSet__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4358:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4359:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4359:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4360:1: RULE_STRING
            {
             before(grammarAccess.getDataSetAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataSet__IDAssignment_3_28751); 
             after(grammarAccess.getDataSetAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__IDAssignment_3_2"


    // $ANTLR start "rule__DataSet__SubDataSetsAssignment_5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4369:1: rule__DataSet__SubDataSetsAssignment_5 : ( ruleDataSet ) ;
    public final void rule__DataSet__SubDataSetsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4373:1: ( ( ruleDataSet ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4374:1: ( ruleDataSet )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4374:1: ( ruleDataSet )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4375:1: ruleDataSet
            {
             before(grammarAccess.getDataSetAccess().getSubDataSetsDataSetParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDataSet_in_rule__DataSet__SubDataSetsAssignment_58782);
            ruleDataSet();

            state._fsp--;

             after(grammarAccess.getDataSetAccess().getSubDataSetsDataSetParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__SubDataSetsAssignment_5"


    // $ANTLR start "rule__DataSet__DataAssignment_6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4384:1: rule__DataSet__DataAssignment_6 : ( ruleData ) ;
    public final void rule__DataSet__DataAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4388:1: ( ( ruleData ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4389:1: ( ruleData )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4389:1: ( ruleData )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4390:1: ruleData
            {
             before(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__DataSet__DataAssignment_68813);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__DataAssignment_6"


    // $ANTLR start "rule__MeasurementData__NameAssignment_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4399:1: rule__MeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4403:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4404:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4404:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4405:1: RULE_ID
            {
             before(grammarAccess.getMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MeasurementData__NameAssignment_08844); 
             after(grammarAccess.getMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__NameAssignment_0"


    // $ANTLR start "rule__MeasurementData__DataTypeAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4414:1: rule__MeasurementData__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__MeasurementData__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4418:1: ( ( ruleDataType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4419:1: ( ruleDataType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4419:1: ( ruleDataType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4420:1: ruleDataType
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__MeasurementData__DataTypeAssignment_28875);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__DataTypeAssignment_2"


    // $ANTLR start "rule__MeasurementData__UnitAssignment_4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4429:1: rule__MeasurementData__UnitAssignment_4 : ( RULE_UNIT ) ;
    public final void rule__MeasurementData__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4433:1: ( ( RULE_UNIT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4434:1: ( RULE_UNIT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4434:1: ( RULE_UNIT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4435:1: RULE_UNIT
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitUNITTerminalRuleCall_4_0()); 
            match(input,RULE_UNIT,FOLLOW_RULE_UNIT_in_rule__MeasurementData__UnitAssignment_48906); 
             after(grammarAccess.getMeasurementDataAccess().getUnitUNITTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__UnitAssignment_4"


    // $ANTLR start "rule__MeasurementData__IDAssignment_5_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4444:1: rule__MeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4448:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4449:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4449:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4450:1: RULE_STRING
            {
             before(grammarAccess.getMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MeasurementData__IDAssignment_5_28937); 
             after(grammarAccess.getMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__IDAssignment_5_2"


    // $ANTLR start "rule__MeasurementData__AdjustmentsAssignment_6_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4459:1: rule__MeasurementData__AdjustmentsAssignment_6_3 : ( ruleDataAdjustement ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4463:1: ( ( ruleDataAdjustement ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4464:1: ( ruleDataAdjustement )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4464:1: ( ruleDataAdjustement )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4465:1: ruleDataAdjustement
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustementParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_ruleDataAdjustement_in_rule__MeasurementData__AdjustmentsAssignment_6_38968);
            ruleDataAdjustement();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustementParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__AdjustmentsAssignment_6_3"


    // $ANTLR start "rule__MeasurementData__AdjustmentsAssignment_6_4_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4474:1: rule__MeasurementData__AdjustmentsAssignment_6_4_1 : ( ruleDataAdjustement ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4478:1: ( ( ruleDataAdjustement ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4479:1: ( ruleDataAdjustement )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4479:1: ( ruleDataAdjustement )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4480:1: ruleDataAdjustement
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustementParserRuleCall_6_4_1_0()); 
            pushFollow(FOLLOW_ruleDataAdjustement_in_rule__MeasurementData__AdjustmentsAssignment_6_4_18999);
            ruleDataAdjustement();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustementParserRuleCall_6_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__AdjustmentsAssignment_6_4_1"


    // $ANTLR start "rule__MeasurementData__DescriptionAssignment_7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4489:1: rule__MeasurementData__DescriptionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__MeasurementData__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4493:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4494:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4494:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4495:1: RULE_STRING
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MeasurementData__DescriptionAssignment_79030); 
             after(grammarAccess.getMeasurementDataAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__DescriptionAssignment_7"


    // $ANTLR start "rule__NonMeasurementData__NameAssignment_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4504:1: rule__NonMeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NonMeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4508:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4509:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4509:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4510:1: RULE_ID
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NonMeasurementData__NameAssignment_09061); 
             after(grammarAccess.getNonMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__NameAssignment_0"


    // $ANTLR start "rule__NonMeasurementData__DataTypeAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4519:1: rule__NonMeasurementData__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4523:1: ( ( ruleDataType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4524:1: ( ruleDataType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4524:1: ( ruleDataType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4525:1: ruleDataType
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__NonMeasurementData__DataTypeAssignment_29092);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__DataTypeAssignment_2"


    // $ANTLR start "rule__NonMeasurementData__ConstantAssignment_5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4534:1: rule__NonMeasurementData__ConstantAssignment_5 : ( ruleBOOLEAN ) ;
    public final void rule__NonMeasurementData__ConstantAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4538:1: ( ( ruleBOOLEAN ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4539:1: ( ruleBOOLEAN )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4539:1: ( ruleBOOLEAN )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4540:1: ruleBOOLEAN
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantBOOLEANParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__NonMeasurementData__ConstantAssignment_59123);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getNonMeasurementDataAccess().getConstantBOOLEANParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ConstantAssignment_5"


    // $ANTLR start "rule__NonMeasurementData__ValueAssignment_8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4549:1: rule__NonMeasurementData__ValueAssignment_8 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__ValueAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4553:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4554:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4554:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4555:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NonMeasurementData__ValueAssignment_89154); 
             after(grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ValueAssignment_8"


    // $ANTLR start "rule__NonMeasurementData__IDAssignment_9_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4564:1: rule__NonMeasurementData__IDAssignment_9_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__IDAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4568:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4569:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4569:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4570:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_9_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NonMeasurementData__IDAssignment_9_29185); 
             after(grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__IDAssignment_9_2"


    // $ANTLR start "rule__NonMeasurementData__DescriptionAssignment_10"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4579:1: rule__NonMeasurementData__DescriptionAssignment_10 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__DescriptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4583:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4584:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4584:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4585:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NonMeasurementData__DescriptionAssignment_109216); 
             after(grammarAccess.getNonMeasurementDataAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__DescriptionAssignment_10"


    // $ANTLR start "rule__DataRange__RangeAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4594:1: rule__DataRange__RangeAssignment_2 : ( ruleInterval ) ;
    public final void rule__DataRange__RangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4598:1: ( ( ruleInterval ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4599:1: ( ruleInterval )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4599:1: ( ruleInterval )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4600:1: ruleInterval
            {
             before(grammarAccess.getDataRangeAccess().getRangeIntervalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInterval_in_rule__DataRange__RangeAssignment_29247);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getDataRangeAccess().getRangeIntervalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__RangeAssignment_2"


    // $ANTLR start "rule__Interval__LowerBoundAssignment_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4609:1: rule__Interval__LowerBoundAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Interval__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4613:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4614:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4614:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4615:1: ruleDOUBLE
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Interval__LowerBoundAssignment_09278);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__LowerBoundAssignment_0"


    // $ANTLR start "rule__Interval__UpperBoundAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4624:1: rule__Interval__UpperBoundAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Interval__UpperBoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4628:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4629:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4629:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4630:1: ruleDOUBLE
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Interval__UpperBoundAssignment_29309);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__UpperBoundAssignment_2"


    // $ANTLR start "rule__LinearDataConversion__ScalingFactorAssignment_0_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4639:1: rule__LinearDataConversion__ScalingFactorAssignment_0_3 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__ScalingFactorAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4643:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4644:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4644:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4645:1: ruleDOUBLE
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__LinearDataConversion__ScalingFactorAssignment_0_39340);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__ScalingFactorAssignment_0_3"


    // $ANTLR start "rule__LinearDataConversion__OffsetAssignment_0_7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4654:1: rule__LinearDataConversion__OffsetAssignment_0_7 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__OffsetAssignment_0_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4658:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4659:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4659:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4660:1: ruleDOUBLE
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetDOUBLEParserRuleCall_0_7_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__LinearDataConversion__OffsetAssignment_0_79371);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionAccess().getOffsetDOUBLEParserRuleCall_0_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__OffsetAssignment_0_7"


    // $ANTLR start "rule__LinearDataConversion__FromIntervalAssignment_1_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4669:1: rule__LinearDataConversion__FromIntervalAssignment_1_2 : ( ruleInterval ) ;
    public final void rule__LinearDataConversion__FromIntervalAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4673:1: ( ( ruleInterval ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4674:1: ( ruleInterval )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4674:1: ( ruleInterval )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4675:1: ruleInterval
            {
             before(grammarAccess.getLinearDataConversionAccess().getFromIntervalIntervalParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleInterval_in_rule__LinearDataConversion__FromIntervalAssignment_1_29402);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionAccess().getFromIntervalIntervalParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__FromIntervalAssignment_1_2"


    // $ANTLR start "rule__LinearDataConversion__ToIntervalAssignment_1_6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4684:1: rule__LinearDataConversion__ToIntervalAssignment_1_6 : ( ruleInterval ) ;
    public final void rule__LinearDataConversion__ToIntervalAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4688:1: ( ( ruleInterval ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4689:1: ( ruleInterval )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4689:1: ( ruleInterval )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4690:1: ruleInterval
            {
             before(grammarAccess.getLinearDataConversionAccess().getToIntervalIntervalParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_ruleInterval_in_rule__LinearDataConversion__ToIntervalAssignment_1_69433);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionAccess().getToIntervalIntervalParserRuleCall_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__ToIntervalAssignment_1_6"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\20\uffff";
    static final String DFA2_eofS =
        "\20\uffff";
    static final String DFA2_minS =
        "\1\5\1\53\1\26\13\54\2\uffff";
    static final String DFA2_maxS =
        "\1\5\1\53\1\40\13\61\2\uffff";
    static final String DFA2_acceptS =
        "\16\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\20\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "\1\17\4\uffff\1\16",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "590:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleNamedElement_in_entryRuleNamedElement61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedElement68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElement__Alternatives_in_ruleNamedElement94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorInterface_in_entryRuleSensorInterface121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorInterface128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__0_in_ruleSensorInterface154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorMetaInformation_in_entryRuleSensorMetaInformation181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorMetaInformation188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__Group__0_in_ruleSensorMetaInformation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorDataDescription_in_entryRuleSensorDataDescription241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorDataDescription248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__0_in_ruleSensorDataDescription274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSet_in_entryRuleDataSet301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSet308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__0_in_ruleDataSet334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Alternatives_in_ruleData394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementData_in_entryRuleMeasurementData421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementData428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__0_in_ruleMeasurementData454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasurementData_in_entryRuleNonMeasurementData481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonMeasurementData488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__0_in_ruleNonMeasurementData514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdjustement_in_entryRuleDataAdjustement541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAdjustement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdjustement__Alternatives_in_ruleDataAdjustement574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_entryRuleDataRange601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataRange608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__0_in_ruleDataRange634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_entryRuleInterval661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterval668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__0_in_ruleInterval694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConversion_in_entryRuleDataConversion721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataConversion728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversion_in_ruleDataConversion754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversion_in_entryRuleLinearDataConversion780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinearDataConversion787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Alternatives_in_ruleLinearDataConversion813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alignment__Alternatives_in_ruleAlignment970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coding__Alternatives_in_ruleCoding1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Endianness__Alternatives_in_ruleEndianness1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorInterface_in_rule__NamedElement__Alternatives1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorDataDescription_in_rule__NamedElement__Alternatives1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSet_in_rule__NamedElement__Alternatives1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__NamedElement__Alternatives1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementData_in_rule__Data__Alternatives1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasurementData_in_rule__Data__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_rule__DataAdjustement__Alternatives1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConversion_in_rule__DataAdjustement__Alternatives1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__0_in_rule__LinearDataConversion__Alternatives1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__0_in_rule__LinearDataConversion__Alternatives1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BOOLEAN__Alternatives1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BOOLEAN__Alternatives1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Alignment__Alternatives1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Alignment__Alternatives1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Alignment__Alternatives1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Alignment__Alternatives1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Coding__Alternatives1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Coding__Alternatives1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Endianness__Alternatives1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Endianness__Alternatives1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DataType__Alternatives1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DataType__Alternatives1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DataType__Alternatives1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DataType__Alternatives1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DataType__Alternatives1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DataType__Alternatives1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DataType__Alternatives1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DataType__Alternatives1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DataType__Alternatives1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DataType__Alternatives1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DataType__Alternatives1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__0__Impl_in_rule__SensorInterface__Group__01857 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__1_in_rule__SensorInterface__Group__01860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SensorInterface__Group__0__Impl1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__1__Impl_in_rule__SensorInterface__Group__11919 = new BitSet(new long[]{0x0000002400000040L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__2_in_rule__SensorInterface__Group__11922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__NameAssignment_1_in_rule__SensorInterface__Group__1__Impl1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__2__Impl_in_rule__SensorInterface__Group__21979 = new BitSet(new long[]{0x0000002400000040L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__3_in_rule__SensorInterface__Group__21982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__DescriptionAssignment_2_in_rule__SensorInterface__Group__2__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__3__Impl_in_rule__SensorInterface__Group__32040 = new BitSet(new long[]{0x0000002400000040L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__4_in_rule__SensorInterface__Group__32043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__0_in_rule__SensorInterface__Group__3__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__4__Impl_in_rule__SensorInterface__Group__42101 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__5_in_rule__SensorInterface__Group__42104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SensorInterface__Group__4__Impl2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__5__Impl_in_rule__SensorInterface__Group__52163 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__6_in_rule__SensorInterface__Group__52166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__MetaInformationAssignment_5_in_rule__SensorInterface__Group__5__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__6__Impl_in_rule__SensorInterface__Group__62223 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__7_in_rule__SensorInterface__Group__62226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__DataDescriptionAssignment_6_in_rule__SensorInterface__Group__6__Impl2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__7__Impl_in_rule__SensorInterface__Group__72283 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__8_in_rule__SensorInterface__Group__72286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SensorInterface__Group__7__Impl2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__8__Impl_in_rule__SensorInterface__Group__82345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SensorInterface__Group__8__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__0__Impl_in_rule__SensorInterface__Group_3__02422 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__1_in_rule__SensorInterface__Group_3__02425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__SensorInterface__Group_3__0__Impl2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__1__Impl_in_rule__SensorInterface__Group_3__12484 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__2_in_rule__SensorInterface__Group_3__12487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__SensorInterface__Group_3__1__Impl2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__2__Impl_in_rule__SensorInterface__Group_3__22546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__IDAssignment_3_2_in_rule__SensorInterface__Group_3__2__Impl2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__Group__0__Impl_in_rule__SensorMetaInformation__Group__02609 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__Group__1_in_rule__SensorMetaInformation__Group__02612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__SensorMetaInformation__Group__0__Impl2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__Group__1__Impl_in_rule__SensorMetaInformation__Group__12671 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__Group__2_in_rule__SensorMetaInformation__Group__12674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__CodingAssignment_1_in_rule__SensorMetaInformation__Group__1__Impl2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__Group__2__Impl_in_rule__SensorMetaInformation__Group__22731 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__Group__3_in_rule__SensorMetaInformation__Group__22734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__SensorMetaInformation__Group__2__Impl2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__Group__3__Impl_in_rule__SensorMetaInformation__Group__32793 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__Group__4_in_rule__SensorMetaInformation__Group__32796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__EndiannessAssignment_3_in_rule__SensorMetaInformation__Group__3__Impl2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__Group__4__Impl_in_rule__SensorMetaInformation__Group__42853 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__Group__5_in_rule__SensorMetaInformation__Group__42856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SensorMetaInformation__Group__4__Impl2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__Group__5__Impl_in_rule__SensorMetaInformation__Group__52915 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__Group__6_in_rule__SensorMetaInformation__Group__52918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__AlignmentAssignment_5_in_rule__SensorMetaInformation__Group__5__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorMetaInformation__Group__6__Impl_in_rule__SensorMetaInformation__Group__62975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SensorMetaInformation__Group__6__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__0__Impl_in_rule__SensorDataDescription__Group__03048 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__1_in_rule__SensorDataDescription__Group__03051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SensorDataDescription__Group__0__Impl3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__1__Impl_in_rule__SensorDataDescription__Group__13110 = new BitSet(new long[]{0x0000002400000040L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__2_in_rule__SensorDataDescription__Group__13113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__NameAssignment_1_in_rule__SensorDataDescription__Group__1__Impl3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__2__Impl_in_rule__SensorDataDescription__Group__23170 = new BitSet(new long[]{0x0000002400000040L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__3_in_rule__SensorDataDescription__Group__23173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__DescriptionAssignment_2_in_rule__SensorDataDescription__Group__2__Impl3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__3__Impl_in_rule__SensorDataDescription__Group__33231 = new BitSet(new long[]{0x0000002400000040L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__4_in_rule__SensorDataDescription__Group__33234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_3__0_in_rule__SensorDataDescription__Group__3__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__4__Impl_in_rule__SensorDataDescription__Group__43292 = new BitSet(new long[]{0x0000040800000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__5_in_rule__SensorDataDescription__Group__43295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SensorDataDescription__Group__4__Impl3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__5__Impl_in_rule__SensorDataDescription__Group__53354 = new BitSet(new long[]{0x0000040800000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__6_in_rule__SensorDataDescription__Group__53357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__DataSetsAssignment_5_in_rule__SensorDataDescription__Group__5__Impl3384 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__6__Impl_in_rule__SensorDataDescription__Group__63415 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__7_in_rule__SensorDataDescription__Group__63418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SensorDataDescription__Group__6__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__7__Impl_in_rule__SensorDataDescription__Group__73477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SensorDataDescription__Group__7__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_3__0__Impl_in_rule__SensorDataDescription__Group_3__03552 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_3__1_in_rule__SensorDataDescription__Group_3__03555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__SensorDataDescription__Group_3__0__Impl3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_3__1__Impl_in_rule__SensorDataDescription__Group_3__13614 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_3__2_in_rule__SensorDataDescription__Group_3__13617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__SensorDataDescription__Group_3__1__Impl3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_3__2__Impl_in_rule__SensorDataDescription__Group_3__23676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__IDAssignment_3_2_in_rule__SensorDataDescription__Group_3__2__Impl3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__0__Impl_in_rule__DataSet__Group__03739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataSet__Group__1_in_rule__DataSet__Group__03742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__DataSet__Group__0__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__1__Impl_in_rule__DataSet__Group__13801 = new BitSet(new long[]{0x0000002400000040L});
    public static final BitSet FOLLOW_rule__DataSet__Group__2_in_rule__DataSet__Group__13804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__NameAssignment_1_in_rule__DataSet__Group__1__Impl3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__2__Impl_in_rule__DataSet__Group__23861 = new BitSet(new long[]{0x0000002400000040L});
    public static final BitSet FOLLOW_rule__DataSet__Group__3_in_rule__DataSet__Group__23864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__DescriptionAssignment_2_in_rule__DataSet__Group__2__Impl3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__3__Impl_in_rule__DataSet__Group__33922 = new BitSet(new long[]{0x0000002400000040L});
    public static final BitSet FOLLOW_rule__DataSet__Group__4_in_rule__DataSet__Group__33925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__0_in_rule__DataSet__Group__3__Impl3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__4__Impl_in_rule__DataSet__Group__43983 = new BitSet(new long[]{0x0000040800000020L});
    public static final BitSet FOLLOW_rule__DataSet__Group__5_in_rule__DataSet__Group__43986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DataSet__Group__4__Impl4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__5__Impl_in_rule__DataSet__Group__54045 = new BitSet(new long[]{0x0000040800000020L});
    public static final BitSet FOLLOW_rule__DataSet__Group__6_in_rule__DataSet__Group__54048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__SubDataSetsAssignment_5_in_rule__DataSet__Group__5__Impl4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__6__Impl_in_rule__DataSet__Group__64106 = new BitSet(new long[]{0x0000040800000020L});
    public static final BitSet FOLLOW_rule__DataSet__Group__7_in_rule__DataSet__Group__64109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__DataAssignment_6_in_rule__DataSet__Group__6__Impl4136 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__DataSet__Group__7__Impl_in_rule__DataSet__Group__74167 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DataSet__Group__8_in_rule__DataSet__Group__74170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DataSet__Group__7__Impl4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__8__Impl_in_rule__DataSet__Group__84229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DataSet__Group__8__Impl4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__0__Impl_in_rule__DataSet__Group_3__04306 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__1_in_rule__DataSet__Group_3__04309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__DataSet__Group_3__0__Impl4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__1__Impl_in_rule__DataSet__Group_3__14368 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__2_in_rule__DataSet__Group_3__14371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DataSet__Group_3__1__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__2__Impl_in_rule__DataSet__Group_3__24430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__IDAssignment_3_2_in_rule__DataSet__Group_3__2__Impl4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__0__Impl_in_rule__MeasurementData__Group__04493 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__1_in_rule__MeasurementData__Group__04496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__NameAssignment_0_in_rule__MeasurementData__Group__0__Impl4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__1__Impl_in_rule__MeasurementData__Group__14553 = new BitSet(new long[]{0x00000001FFC00000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__2_in_rule__MeasurementData__Group__14556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MeasurementData__Group__1__Impl4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__2__Impl_in_rule__MeasurementData__Group__24615 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__3_in_rule__MeasurementData__Group__24618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__DataTypeAssignment_2_in_rule__MeasurementData__Group__2__Impl4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__3__Impl_in_rule__MeasurementData__Group__34675 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__4_in_rule__MeasurementData__Group__34678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MeasurementData__Group__3__Impl4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__4__Impl_in_rule__MeasurementData__Group__44737 = new BitSet(new long[]{0x0000203000000040L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__5_in_rule__MeasurementData__Group__44740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__UnitAssignment_4_in_rule__MeasurementData__Group__4__Impl4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__5__Impl_in_rule__MeasurementData__Group__54797 = new BitSet(new long[]{0x0000203000000040L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__6_in_rule__MeasurementData__Group__54800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__0_in_rule__MeasurementData__Group__5__Impl4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__6__Impl_in_rule__MeasurementData__Group__64858 = new BitSet(new long[]{0x0000203000000040L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__7_in_rule__MeasurementData__Group__64861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__0_in_rule__MeasurementData__Group__6__Impl4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__7__Impl_in_rule__MeasurementData__Group__74919 = new BitSet(new long[]{0x0000203000000040L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__8_in_rule__MeasurementData__Group__74922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__DescriptionAssignment_7_in_rule__MeasurementData__Group__7__Impl4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__8__Impl_in_rule__MeasurementData__Group__84980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__MeasurementData__Group__8__Impl5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__0__Impl_in_rule__MeasurementData__Group_5__05057 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__1_in_rule__MeasurementData__Group_5__05060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__MeasurementData__Group_5__0__Impl5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__1__Impl_in_rule__MeasurementData__Group_5__15119 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__2_in_rule__MeasurementData__Group_5__15122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MeasurementData__Group_5__1__Impl5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__2__Impl_in_rule__MeasurementData__Group_5__25181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__IDAssignment_5_2_in_rule__MeasurementData__Group_5__2__Impl5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__0__Impl_in_rule__MeasurementData__Group_6__05244 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__1_in_rule__MeasurementData__Group_6__05247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__MeasurementData__Group_6__0__Impl5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__1__Impl_in_rule__MeasurementData__Group_6__15306 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__2_in_rule__MeasurementData__Group_6__15309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__MeasurementData__Group_6__1__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__2__Impl_in_rule__MeasurementData__Group_6__25368 = new BitSet(new long[]{0x0200002000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__3_in_rule__MeasurementData__Group_6__25371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MeasurementData__Group_6__2__Impl5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__3__Impl_in_rule__MeasurementData__Group_6__35430 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__4_in_rule__MeasurementData__Group_6__35433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__AdjustmentsAssignment_6_3_in_rule__MeasurementData__Group_6__3__Impl5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__4__Impl_in_rule__MeasurementData__Group_6__45490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6_4__0_in_rule__MeasurementData__Group_6__4__Impl5517 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6_4__0__Impl_in_rule__MeasurementData__Group_6_4__05558 = new BitSet(new long[]{0x0200002000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6_4__1_in_rule__MeasurementData__Group_6_4__05561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MeasurementData__Group_6_4__0__Impl5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6_4__1__Impl_in_rule__MeasurementData__Group_6_4__15620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__AdjustmentsAssignment_6_4_1_in_rule__MeasurementData__Group_6_4__1__Impl5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__0__Impl_in_rule__NonMeasurementData__Group__05681 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__1_in_rule__NonMeasurementData__Group__05684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__NameAssignment_0_in_rule__NonMeasurementData__Group__0__Impl5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__1__Impl_in_rule__NonMeasurementData__Group__15741 = new BitSet(new long[]{0x00000001FFC00000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__2_in_rule__NonMeasurementData__Group__15744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__NonMeasurementData__Group__1__Impl5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__2__Impl_in_rule__NonMeasurementData__Group__25803 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__3_in_rule__NonMeasurementData__Group__25806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__DataTypeAssignment_2_in_rule__NonMeasurementData__Group__2__Impl5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__3__Impl_in_rule__NonMeasurementData__Group__35863 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__4_in_rule__NonMeasurementData__Group__35866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__NonMeasurementData__Group__3__Impl5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__4__Impl_in_rule__NonMeasurementData__Group__45925 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__5_in_rule__NonMeasurementData__Group__45928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__NonMeasurementData__Group__4__Impl5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__5__Impl_in_rule__NonMeasurementData__Group__55987 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__6_in_rule__NonMeasurementData__Group__55990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__ConstantAssignment_5_in_rule__NonMeasurementData__Group__5__Impl6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__6__Impl_in_rule__NonMeasurementData__Group__66047 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__7_in_rule__NonMeasurementData__Group__66050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__NonMeasurementData__Group__6__Impl6078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__7__Impl_in_rule__NonMeasurementData__Group__76109 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__8_in_rule__NonMeasurementData__Group__76112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__NonMeasurementData__Group__7__Impl6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__8__Impl_in_rule__NonMeasurementData__Group__86171 = new BitSet(new long[]{0x0000003000000040L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__9_in_rule__NonMeasurementData__Group__86174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__ValueAssignment_8_in_rule__NonMeasurementData__Group__8__Impl6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__9__Impl_in_rule__NonMeasurementData__Group__96231 = new BitSet(new long[]{0x0000003000000040L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__10_in_rule__NonMeasurementData__Group__96234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_9__0_in_rule__NonMeasurementData__Group__9__Impl6261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__10__Impl_in_rule__NonMeasurementData__Group__106292 = new BitSet(new long[]{0x0000003000000040L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__11_in_rule__NonMeasurementData__Group__106295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__DescriptionAssignment_10_in_rule__NonMeasurementData__Group__10__Impl6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__11__Impl_in_rule__NonMeasurementData__Group__116353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__NonMeasurementData__Group__11__Impl6381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_9__0__Impl_in_rule__NonMeasurementData__Group_9__06436 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_9__1_in_rule__NonMeasurementData__Group_9__06439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__NonMeasurementData__Group_9__0__Impl6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_9__1__Impl_in_rule__NonMeasurementData__Group_9__16498 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_9__2_in_rule__NonMeasurementData__Group_9__16501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__NonMeasurementData__Group_9__1__Impl6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_9__2__Impl_in_rule__NonMeasurementData__Group_9__26560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__IDAssignment_9_2_in_rule__NonMeasurementData__Group_9__2__Impl6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__0__Impl_in_rule__DataRange__Group__06623 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__DataRange__Group__1_in_rule__DataRange__Group__06626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__DataRange__Group__0__Impl6654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__1__Impl_in_rule__DataRange__Group__16685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataRange__Group__2_in_rule__DataRange__Group__16688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__DataRange__Group__1__Impl6716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__2__Impl_in_rule__DataRange__Group__26747 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DataRange__Group__3_in_rule__DataRange__Group__26750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__RangeAssignment_2_in_rule__DataRange__Group__2__Impl6777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__3__Impl_in_rule__DataRange__Group__36807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DataRange__Group__3__Impl6835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__0__Impl_in_rule__Interval__Group__06874 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Interval__Group__1_in_rule__Interval__Group__06877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__LowerBoundAssignment_0_in_rule__Interval__Group__0__Impl6904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__1__Impl_in_rule__Interval__Group__16934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interval__Group__2_in_rule__Interval__Group__16937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Interval__Group__1__Impl6965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__2__Impl_in_rule__Interval__Group__26996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__UpperBoundAssignment_2_in_rule__Interval__Group__2__Impl7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__0__Impl_in_rule__LinearDataConversion__Group_0__07059 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__1_in_rule__LinearDataConversion__Group_0__07062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__LinearDataConversion__Group_0__0__Impl7090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__1__Impl_in_rule__LinearDataConversion__Group_0__17121 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__2_in_rule__LinearDataConversion__Group_0__17124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__LinearDataConversion__Group_0__1__Impl7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__2__Impl_in_rule__LinearDataConversion__Group_0__27183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__3_in_rule__LinearDataConversion__Group_0__27186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__LinearDataConversion__Group_0__2__Impl7214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__3__Impl_in_rule__LinearDataConversion__Group_0__37245 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__4_in_rule__LinearDataConversion__Group_0__37248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__ScalingFactorAssignment_0_3_in_rule__LinearDataConversion__Group_0__3__Impl7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__4__Impl_in_rule__LinearDataConversion__Group_0__47305 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__5_in_rule__LinearDataConversion__Group_0__47308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__LinearDataConversion__Group_0__4__Impl7336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__5__Impl_in_rule__LinearDataConversion__Group_0__57367 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__6_in_rule__LinearDataConversion__Group_0__57370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__LinearDataConversion__Group_0__5__Impl7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__6__Impl_in_rule__LinearDataConversion__Group_0__67429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__7_in_rule__LinearDataConversion__Group_0__67432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__LinearDataConversion__Group_0__6__Impl7460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_0__7__Impl_in_rule__LinearDataConversion__Group_0__77491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__OffsetAssignment_0_7_in_rule__LinearDataConversion__Group_0__7__Impl7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__0__Impl_in_rule__LinearDataConversion__Group_1__07564 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__1_in_rule__LinearDataConversion__Group_1__07567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__LinearDataConversion__Group_1__0__Impl7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__1__Impl_in_rule__LinearDataConversion__Group_1__17626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__2_in_rule__LinearDataConversion__Group_1__17629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__LinearDataConversion__Group_1__1__Impl7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__2__Impl_in_rule__LinearDataConversion__Group_1__27688 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__3_in_rule__LinearDataConversion__Group_1__27691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__FromIntervalAssignment_1_2_in_rule__LinearDataConversion__Group_1__2__Impl7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__3__Impl_in_rule__LinearDataConversion__Group_1__37748 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__4_in_rule__LinearDataConversion__Group_1__37751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__LinearDataConversion__Group_1__3__Impl7779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__4__Impl_in_rule__LinearDataConversion__Group_1__47810 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__5_in_rule__LinearDataConversion__Group_1__47813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__LinearDataConversion__Group_1__4__Impl7841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__5__Impl_in_rule__LinearDataConversion__Group_1__57872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__6_in_rule__LinearDataConversion__Group_1__57875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__LinearDataConversion__Group_1__5__Impl7903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__6__Impl_in_rule__LinearDataConversion__Group_1__67934 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__7_in_rule__LinearDataConversion__Group_1__67937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__ToIntervalAssignment_1_6_in_rule__LinearDataConversion__Group_1__6__Impl7964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group_1__7__Impl_in_rule__LinearDataConversion__Group_1__77994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__LinearDataConversion__Group_1__7__Impl8022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__08069 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__08072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl8099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__18128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl8155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__08190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__08193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__DOUBLE__Group_1__0__Impl8221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__18252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl8279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SensorInterface__NameAssignment_18317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SensorInterface__DescriptionAssignment_28348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SensorInterface__IDAssignment_3_28379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorMetaInformation_in_rule__SensorInterface__MetaInformationAssignment_58410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorDataDescription_in_rule__SensorInterface__DataDescriptionAssignment_68441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoding_in_rule__SensorMetaInformation__CodingAssignment_18472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndianness_in_rule__SensorMetaInformation__EndiannessAssignment_38503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignment_in_rule__SensorMetaInformation__AlignmentAssignment_58534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SensorDataDescription__NameAssignment_18565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SensorDataDescription__DescriptionAssignment_28596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SensorDataDescription__IDAssignment_3_28627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSet_in_rule__SensorDataDescription__DataSetsAssignment_58658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataSet__NameAssignment_18689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataSet__DescriptionAssignment_28720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataSet__IDAssignment_3_28751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSet_in_rule__DataSet__SubDataSetsAssignment_58782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__DataSet__DataAssignment_68813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MeasurementData__NameAssignment_08844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__MeasurementData__DataTypeAssignment_28875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNIT_in_rule__MeasurementData__UnitAssignment_48906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MeasurementData__IDAssignment_5_28937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdjustement_in_rule__MeasurementData__AdjustmentsAssignment_6_38968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdjustement_in_rule__MeasurementData__AdjustmentsAssignment_6_4_18999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MeasurementData__DescriptionAssignment_79030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NonMeasurementData__NameAssignment_09061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__NonMeasurementData__DataTypeAssignment_29092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__NonMeasurementData__ConstantAssignment_59123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NonMeasurementData__ValueAssignment_89154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NonMeasurementData__IDAssignment_9_29185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NonMeasurementData__DescriptionAssignment_109216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_rule__DataRange__RangeAssignment_29247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Interval__LowerBoundAssignment_09278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Interval__UpperBoundAssignment_29309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__LinearDataConversion__ScalingFactorAssignment_0_39340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__LinearDataConversion__OffsetAssignment_0_79371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_rule__LinearDataConversion__FromIntervalAssignment_1_29402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_rule__LinearDataConversion__ToIntervalAssignment_1_69433 = new BitSet(new long[]{0x0000000000000002L});

}