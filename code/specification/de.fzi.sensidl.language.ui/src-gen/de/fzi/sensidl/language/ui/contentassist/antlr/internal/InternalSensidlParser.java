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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_ANY_OTHER", "RULE_DESCRIPTION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'SENSIDL_BINARY'", "'SENSIDL_JSON'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'INT8'", "'UINT8'", "'INT16'", "'UINT16'", "'INT32'", "'UINT32'", "'INT64'", "'UINT64'", "'FLOAT'", "'DOUBLE'", "'BOOLEAN'", "'STRING'", "'sensorInterface'", "'{'", "'}'", "'with identifier'", "':'", "'encoding'", "','", "'endianness'", "'alignment'", "'BIT'", "'sensorData'", "'dataSet'", "'uses'", "'as'", "'in'", "'adjusted'", "'value'", "'='", "'with range'", "'['", "';'", "']'", "'with scaling factor'", "'and offset'", "'by linear mapping'", "'=>'", "'.'", "'constant'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int RULE_DESCRIPTION=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=6;
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




    // $ANTLR start "entryRuleSensorInterface"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:60:1: entryRuleSensorInterface : ruleSensorInterface EOF ;
    public final void entryRuleSensorInterface() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:61:1: ( ruleSensorInterface EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:62:1: ruleSensorInterface EOF
            {
             before(grammarAccess.getSensorInterfaceRule()); 
            pushFollow(FOLLOW_ruleSensorInterface_in_entryRuleSensorInterface61);
            ruleSensorInterface();

            state._fsp--;

             after(grammarAccess.getSensorInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorInterface68); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:69:1: ruleSensorInterface : ( ( rule__SensorInterface__Group__0 ) ) ;
    public final void ruleSensorInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:73:2: ( ( ( rule__SensorInterface__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:74:1: ( ( rule__SensorInterface__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:74:1: ( ( rule__SensorInterface__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:75:1: ( rule__SensorInterface__Group__0 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:76:1: ( rule__SensorInterface__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:76:2: rule__SensorInterface__Group__0
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__0_in_ruleSensorInterface94);
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


    // $ANTLR start "entryRuleEncodingSettings"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:88:1: entryRuleEncodingSettings : ruleEncodingSettings EOF ;
    public final void entryRuleEncodingSettings() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:89:1: ( ruleEncodingSettings EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:90:1: ruleEncodingSettings EOF
            {
             before(grammarAccess.getEncodingSettingsRule()); 
            pushFollow(FOLLOW_ruleEncodingSettings_in_entryRuleEncodingSettings121);
            ruleEncodingSettings();

            state._fsp--;

             after(grammarAccess.getEncodingSettingsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncodingSettings128); 

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
    // $ANTLR end "entryRuleEncodingSettings"


    // $ANTLR start "ruleEncodingSettings"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:97:1: ruleEncodingSettings : ( ( rule__EncodingSettings__Group__0 ) ) ;
    public final void ruleEncodingSettings() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:101:2: ( ( ( rule__EncodingSettings__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:102:1: ( ( rule__EncodingSettings__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:102:1: ( ( rule__EncodingSettings__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:103:1: ( rule__EncodingSettings__Group__0 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:104:1: ( rule__EncodingSettings__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:104:2: rule__EncodingSettings__Group__0
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__0_in_ruleEncodingSettings154);
            rule__EncodingSettings__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEncodingSettingsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEncodingSettings"


    // $ANTLR start "entryRuleSensorDataDescription"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:116:1: entryRuleSensorDataDescription : ruleSensorDataDescription EOF ;
    public final void entryRuleSensorDataDescription() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:117:1: ( ruleSensorDataDescription EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:118:1: ruleSensorDataDescription EOF
            {
             before(grammarAccess.getSensorDataDescriptionRule()); 
            pushFollow(FOLLOW_ruleSensorDataDescription_in_entryRuleSensorDataDescription181);
            ruleSensorDataDescription();

            state._fsp--;

             after(grammarAccess.getSensorDataDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorDataDescription188); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:125:1: ruleSensorDataDescription : ( ( rule__SensorDataDescription__Group__0 ) ) ;
    public final void ruleSensorDataDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:129:2: ( ( ( rule__SensorDataDescription__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:130:1: ( ( rule__SensorDataDescription__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:130:1: ( ( rule__SensorDataDescription__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:131:1: ( rule__SensorDataDescription__Group__0 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:132:1: ( rule__SensorDataDescription__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:132:2: rule__SensorDataDescription__Group__0
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__0_in_ruleSensorDataDescription214);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:144:1: entryRuleDataSet : ruleDataSet EOF ;
    public final void entryRuleDataSet() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:145:1: ( ruleDataSet EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:146:1: ruleDataSet EOF
            {
             before(grammarAccess.getDataSetRule()); 
            pushFollow(FOLLOW_ruleDataSet_in_entryRuleDataSet241);
            ruleDataSet();

            state._fsp--;

             after(grammarAccess.getDataSetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSet248); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:153:1: ruleDataSet : ( ( rule__DataSet__Group__0 ) ) ;
    public final void ruleDataSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:157:2: ( ( ( rule__DataSet__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:158:1: ( ( rule__DataSet__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:158:1: ( ( rule__DataSet__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:159:1: ( rule__DataSet__Group__0 )
            {
             before(grammarAccess.getDataSetAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:160:1: ( rule__DataSet__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:160:2: rule__DataSet__Group__0
            {
            pushFollow(FOLLOW_rule__DataSet__Group__0_in_ruleDataSet274);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:172:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:173:1: ( ruleData EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:174:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData301);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData308); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:181:1: ruleData : ( ( rule__Data__Alternatives ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:185:2: ( ( ( rule__Data__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:186:1: ( ( rule__Data__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:186:1: ( ( rule__Data__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:187:1: ( rule__Data__Alternatives )
            {
             before(grammarAccess.getDataAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:188:1: ( rule__Data__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:188:2: rule__Data__Alternatives
            {
            pushFollow(FOLLOW_rule__Data__Alternatives_in_ruleData334);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:200:1: entryRuleMeasurementData : ruleMeasurementData EOF ;
    public final void entryRuleMeasurementData() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:201:1: ( ruleMeasurementData EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:202:1: ruleMeasurementData EOF
            {
             before(grammarAccess.getMeasurementDataRule()); 
            pushFollow(FOLLOW_ruleMeasurementData_in_entryRuleMeasurementData361);
            ruleMeasurementData();

            state._fsp--;

             after(grammarAccess.getMeasurementDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementData368); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:209:1: ruleMeasurementData : ( ( rule__MeasurementData__Group__0 ) ) ;
    public final void ruleMeasurementData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:213:2: ( ( ( rule__MeasurementData__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:214:1: ( ( rule__MeasurementData__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:214:1: ( ( rule__MeasurementData__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:215:1: ( rule__MeasurementData__Group__0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:216:1: ( rule__MeasurementData__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:216:2: rule__MeasurementData__Group__0
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__0_in_ruleMeasurementData394);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:228:1: entryRuleNonMeasurementData : ruleNonMeasurementData EOF ;
    public final void entryRuleNonMeasurementData() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:229:1: ( ruleNonMeasurementData EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:230:1: ruleNonMeasurementData EOF
            {
             before(grammarAccess.getNonMeasurementDataRule()); 
            pushFollow(FOLLOW_ruleNonMeasurementData_in_entryRuleNonMeasurementData421);
            ruleNonMeasurementData();

            state._fsp--;

             after(grammarAccess.getNonMeasurementDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonMeasurementData428); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:237:1: ruleNonMeasurementData : ( ( rule__NonMeasurementData__Group__0 ) ) ;
    public final void ruleNonMeasurementData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:241:2: ( ( ( rule__NonMeasurementData__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:242:1: ( ( rule__NonMeasurementData__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:242:1: ( ( rule__NonMeasurementData__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:243:1: ( rule__NonMeasurementData__Group__0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:244:1: ( rule__NonMeasurementData__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:244:2: rule__NonMeasurementData__Group__0
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__0_in_ruleNonMeasurementData454);
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


    // $ANTLR start "entryRuleDataAdjustment"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:256:1: entryRuleDataAdjustment : ruleDataAdjustment EOF ;
    public final void entryRuleDataAdjustment() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:257:1: ( ruleDataAdjustment EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:258:1: ruleDataAdjustment EOF
            {
             before(grammarAccess.getDataAdjustmentRule()); 
            pushFollow(FOLLOW_ruleDataAdjustment_in_entryRuleDataAdjustment481);
            ruleDataAdjustment();

            state._fsp--;

             after(grammarAccess.getDataAdjustmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAdjustment488); 

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
    // $ANTLR end "entryRuleDataAdjustment"


    // $ANTLR start "ruleDataAdjustment"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:265:1: ruleDataAdjustment : ( ( rule__DataAdjustment__Alternatives ) ) ;
    public final void ruleDataAdjustment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:269:2: ( ( ( rule__DataAdjustment__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:270:1: ( ( rule__DataAdjustment__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:270:1: ( ( rule__DataAdjustment__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:271:1: ( rule__DataAdjustment__Alternatives )
            {
             before(grammarAccess.getDataAdjustmentAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:272:1: ( rule__DataAdjustment__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:272:2: rule__DataAdjustment__Alternatives
            {
            pushFollow(FOLLOW_rule__DataAdjustment__Alternatives_in_ruleDataAdjustment514);
            rule__DataAdjustment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataAdjustmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataAdjustment"


    // $ANTLR start "entryRuleDataRange"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:284:1: entryRuleDataRange : ruleDataRange EOF ;
    public final void entryRuleDataRange() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:285:1: ( ruleDataRange EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:286:1: ruleDataRange EOF
            {
             before(grammarAccess.getDataRangeRule()); 
            pushFollow(FOLLOW_ruleDataRange_in_entryRuleDataRange541);
            ruleDataRange();

            state._fsp--;

             after(grammarAccess.getDataRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataRange548); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:293:1: ruleDataRange : ( ( rule__DataRange__Group__0 ) ) ;
    public final void ruleDataRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:297:2: ( ( ( rule__DataRange__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:298:1: ( ( rule__DataRange__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:298:1: ( ( rule__DataRange__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:299:1: ( rule__DataRange__Group__0 )
            {
             before(grammarAccess.getDataRangeAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:300:1: ( rule__DataRange__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:300:2: rule__DataRange__Group__0
            {
            pushFollow(FOLLOW_rule__DataRange__Group__0_in_ruleDataRange574);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:312:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:313:1: ( ruleInterval EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:314:1: ruleInterval EOF
            {
             before(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_ruleInterval_in_entryRuleInterval601);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getIntervalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterval608); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:321:1: ruleInterval : ( ( rule__Interval__Group__0 ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:325:2: ( ( ( rule__Interval__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:326:1: ( ( rule__Interval__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:326:1: ( ( rule__Interval__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:327:1: ( rule__Interval__Group__0 )
            {
             before(grammarAccess.getIntervalAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:328:1: ( rule__Interval__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:328:2: rule__Interval__Group__0
            {
            pushFollow(FOLLOW_rule__Interval__Group__0_in_ruleInterval634);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:340:1: entryRuleDataConversion : ruleDataConversion EOF ;
    public final void entryRuleDataConversion() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:341:1: ( ruleDataConversion EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:342:1: ruleDataConversion EOF
            {
             before(grammarAccess.getDataConversionRule()); 
            pushFollow(FOLLOW_ruleDataConversion_in_entryRuleDataConversion661);
            ruleDataConversion();

            state._fsp--;

             after(grammarAccess.getDataConversionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataConversion668); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:349:1: ruleDataConversion : ( ( rule__DataConversion__Alternatives ) ) ;
    public final void ruleDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:353:2: ( ( ( rule__DataConversion__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:354:1: ( ( rule__DataConversion__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:354:1: ( ( rule__DataConversion__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:355:1: ( rule__DataConversion__Alternatives )
            {
             before(grammarAccess.getDataConversionAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:356:1: ( rule__DataConversion__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:356:2: rule__DataConversion__Alternatives
            {
            pushFollow(FOLLOW_rule__DataConversion__Alternatives_in_ruleDataConversion694);
            rule__DataConversion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataConversionAccess().getAlternatives()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:368:1: entryRuleLinearDataConversion : ruleLinearDataConversion EOF ;
    public final void entryRuleLinearDataConversion() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:369:1: ( ruleLinearDataConversion EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:370:1: ruleLinearDataConversion EOF
            {
             before(grammarAccess.getLinearDataConversionRule()); 
            pushFollow(FOLLOW_ruleLinearDataConversion_in_entryRuleLinearDataConversion721);
            ruleLinearDataConversion();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinearDataConversion728); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:377:1: ruleLinearDataConversion : ( ( rule__LinearDataConversion__Group__0 ) ) ;
    public final void ruleLinearDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:381:2: ( ( ( rule__LinearDataConversion__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:382:1: ( ( rule__LinearDataConversion__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:382:1: ( ( rule__LinearDataConversion__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:383:1: ( rule__LinearDataConversion__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:384:1: ( rule__LinearDataConversion__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:384:2: rule__LinearDataConversion__Group__0
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group__0_in_ruleLinearDataConversion754);
            rule__LinearDataConversion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLinearDataConversionWithInterval"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:396:1: entryRuleLinearDataConversionWithInterval : ruleLinearDataConversionWithInterval EOF ;
    public final void entryRuleLinearDataConversionWithInterval() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:397:1: ( ruleLinearDataConversionWithInterval EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:398:1: ruleLinearDataConversionWithInterval EOF
            {
             before(grammarAccess.getLinearDataConversionWithIntervalRule()); 
            pushFollow(FOLLOW_ruleLinearDataConversionWithInterval_in_entryRuleLinearDataConversionWithInterval781);
            ruleLinearDataConversionWithInterval();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionWithIntervalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinearDataConversionWithInterval788); 

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
    // $ANTLR end "entryRuleLinearDataConversionWithInterval"


    // $ANTLR start "ruleLinearDataConversionWithInterval"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:405:1: ruleLinearDataConversionWithInterval : ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) ;
    public final void ruleLinearDataConversionWithInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:409:2: ( ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:410:1: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:410:1: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:411:1: ( rule__LinearDataConversionWithInterval__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:412:1: ( rule__LinearDataConversionWithInterval__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:412:2: rule__LinearDataConversionWithInterval__Group__0
            {
            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__0_in_ruleLinearDataConversionWithInterval814);
            rule__LinearDataConversionWithInterval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinearDataConversionWithInterval"


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


    // $ANTLR start "entryRuleUNIT"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:452:1: entryRuleUNIT : ruleUNIT EOF ;
    public final void entryRuleUNIT() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:453:1: ( ruleUNIT EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:454:1: ruleUNIT EOF
            {
             before(grammarAccess.getUNITRule()); 
            pushFollow(FOLLOW_ruleUNIT_in_entryRuleUNIT901);
            ruleUNIT();

            state._fsp--;

             after(grammarAccess.getUNITRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNIT908); 

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
    // $ANTLR end "entryRuleUNIT"


    // $ANTLR start "ruleUNIT"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:461:1: ruleUNIT : ( ( rule__UNIT__Group__0 ) ) ;
    public final void ruleUNIT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:465:2: ( ( ( rule__UNIT__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:466:1: ( ( rule__UNIT__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:466:1: ( ( rule__UNIT__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:467:1: ( rule__UNIT__Group__0 )
            {
             before(grammarAccess.getUNITAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:468:1: ( rule__UNIT__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:468:2: rule__UNIT__Group__0
            {
            pushFollow(FOLLOW_rule__UNIT__Group__0_in_ruleUNIT934);
            rule__UNIT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUNITAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUNIT"


    // $ANTLR start "ruleCoding"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:481:1: ruleCoding : ( ( rule__Coding__Alternatives ) ) ;
    public final void ruleCoding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:485:1: ( ( ( rule__Coding__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:486:1: ( ( rule__Coding__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:486:1: ( ( rule__Coding__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:487:1: ( rule__Coding__Alternatives )
            {
             before(grammarAccess.getCodingAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:488:1: ( rule__Coding__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:488:2: rule__Coding__Alternatives
            {
            pushFollow(FOLLOW_rule__Coding__Alternatives_in_ruleCoding971);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:500:1: ruleEndianness : ( ( rule__Endianness__Alternatives ) ) ;
    public final void ruleEndianness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:504:1: ( ( ( rule__Endianness__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:505:1: ( ( rule__Endianness__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:505:1: ( ( rule__Endianness__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:506:1: ( rule__Endianness__Alternatives )
            {
             before(grammarAccess.getEndiannessAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:507:1: ( rule__Endianness__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:507:2: rule__Endianness__Alternatives
            {
            pushFollow(FOLLOW_rule__Endianness__Alternatives_in_ruleEndianness1007);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:519:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:523:1: ( ( ( rule__DataType__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:524:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:524:1: ( ( rule__DataType__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:525:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:526:1: ( rule__DataType__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:526:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType1043);
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


    // $ANTLR start "rule__Data__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:537:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:541:1: ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:542:1: ( ruleMeasurementData )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:542:1: ( ruleMeasurementData )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:543:1: ruleMeasurementData
                    {
                     before(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMeasurementData_in_rule__Data__Alternatives1078);
                    ruleMeasurementData();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:548:6: ( ruleNonMeasurementData )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:548:6: ( ruleNonMeasurementData )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:549:1: ruleNonMeasurementData
                    {
                     before(grammarAccess.getDataAccess().getNonMeasurementDataParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNonMeasurementData_in_rule__Data__Alternatives1095);
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


    // $ANTLR start "rule__DataAdjustment__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:559:1: rule__DataAdjustment__Alternatives : ( ( ruleDataRange ) | ( ruleDataConversion ) );
    public final void rule__DataAdjustment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:563:1: ( ( ruleDataRange ) | ( ruleDataConversion ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==46) ) {
                alt2=1;
            }
            else if ( (LA2_0==50||LA2_0==52) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:564:1: ( ruleDataRange )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:564:1: ( ruleDataRange )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:565:1: ruleDataRange
                    {
                     before(grammarAccess.getDataAdjustmentAccess().getDataRangeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDataRange_in_rule__DataAdjustment__Alternatives1127);
                    ruleDataRange();

                    state._fsp--;

                     after(grammarAccess.getDataAdjustmentAccess().getDataRangeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:570:6: ( ruleDataConversion )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:570:6: ( ruleDataConversion )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:571:1: ruleDataConversion
                    {
                     before(grammarAccess.getDataAdjustmentAccess().getDataConversionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataConversion_in_rule__DataAdjustment__Alternatives1144);
                    ruleDataConversion();

                    state._fsp--;

                     after(grammarAccess.getDataAdjustmentAccess().getDataConversionParserRuleCall_1()); 

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
    // $ANTLR end "rule__DataAdjustment__Alternatives"


    // $ANTLR start "rule__DataConversion__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:581:1: rule__DataConversion__Alternatives : ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) );
    public final void rule__DataConversion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:585:1: ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==50) ) {
                alt3=1;
            }
            else if ( (LA3_0==52) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:586:1: ( ruleLinearDataConversion )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:586:1: ( ruleLinearDataConversion )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:587:1: ruleLinearDataConversion
                    {
                     before(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLinearDataConversion_in_rule__DataConversion__Alternatives1176);
                    ruleLinearDataConversion();

                    state._fsp--;

                     after(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:592:6: ( ruleLinearDataConversionWithInterval )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:592:6: ( ruleLinearDataConversionWithInterval )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:593:1: ruleLinearDataConversionWithInterval
                    {
                     before(grammarAccess.getDataConversionAccess().getLinearDataConversionWithIntervalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLinearDataConversionWithInterval_in_rule__DataConversion__Alternatives1193);
                    ruleLinearDataConversionWithInterval();

                    state._fsp--;

                     after(grammarAccess.getDataConversionAccess().getLinearDataConversionWithIntervalParserRuleCall_1()); 

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
    // $ANTLR end "rule__DataConversion__Alternatives"


    // $ANTLR start "rule__Coding__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:603:1: rule__Coding__Alternatives : ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) );
    public final void rule__Coding__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:607:1: ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:608:1: ( ( 'SENSIDL_BINARY' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:608:1: ( ( 'SENSIDL_BINARY' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:609:1: ( 'SENSIDL_BINARY' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:610:1: ( 'SENSIDL_BINARY' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:610:3: 'SENSIDL_BINARY'
                    {
                    match(input,12,FOLLOW_12_in_rule__Coding__Alternatives1226); 

                    }

                     after(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:615:6: ( ( 'SENSIDL_JSON' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:615:6: ( ( 'SENSIDL_JSON' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:616:1: ( 'SENSIDL_JSON' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_JSONEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:617:1: ( 'SENSIDL_JSON' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:617:3: 'SENSIDL_JSON'
                    {
                    match(input,13,FOLLOW_13_in_rule__Coding__Alternatives1247); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:627:1: rule__Endianness__Alternatives : ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) );
    public final void rule__Endianness__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:631:1: ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:632:1: ( ( 'BIG_ENDIAN' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:632:1: ( ( 'BIG_ENDIAN' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:633:1: ( 'BIG_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:634:1: ( 'BIG_ENDIAN' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:634:3: 'BIG_ENDIAN'
                    {
                    match(input,14,FOLLOW_14_in_rule__Endianness__Alternatives1283); 

                    }

                     after(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:639:6: ( ( 'LITTLE_ENDIAN' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:639:6: ( ( 'LITTLE_ENDIAN' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:640:1: ( 'LITTLE_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:641:1: ( 'LITTLE_ENDIAN' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:641:3: 'LITTLE_ENDIAN'
                    {
                    match(input,15,FOLLOW_15_in_rule__Endianness__Alternatives1304); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:651:1: rule__DataType__Alternatives : ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'STRING' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:655:1: ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'STRING' ) ) )
            int alt6=12;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            case 21:
                {
                alt6=6;
                }
                break;
            case 22:
                {
                alt6=7;
                }
                break;
            case 23:
                {
                alt6=8;
                }
                break;
            case 24:
                {
                alt6=9;
                }
                break;
            case 25:
                {
                alt6=10;
                }
                break;
            case 26:
                {
                alt6=11;
                }
                break;
            case 27:
                {
                alt6=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:656:1: ( ( 'INT8' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:656:1: ( ( 'INT8' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:657:1: ( 'INT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:658:1: ( 'INT8' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:658:3: 'INT8'
                    {
                    match(input,16,FOLLOW_16_in_rule__DataType__Alternatives1340); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:663:6: ( ( 'UINT8' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:663:6: ( ( 'UINT8' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:664:1: ( 'UINT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:665:1: ( 'UINT8' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:665:3: 'UINT8'
                    {
                    match(input,17,FOLLOW_17_in_rule__DataType__Alternatives1361); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:670:6: ( ( 'INT16' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:670:6: ( ( 'INT16' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:671:1: ( 'INT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:672:1: ( 'INT16' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:672:3: 'INT16'
                    {
                    match(input,18,FOLLOW_18_in_rule__DataType__Alternatives1382); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:677:6: ( ( 'UINT16' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:677:6: ( ( 'UINT16' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:678:1: ( 'UINT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:679:1: ( 'UINT16' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:679:3: 'UINT16'
                    {
                    match(input,19,FOLLOW_19_in_rule__DataType__Alternatives1403); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:684:6: ( ( 'INT32' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:684:6: ( ( 'INT32' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:685:1: ( 'INT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:686:1: ( 'INT32' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:686:3: 'INT32'
                    {
                    match(input,20,FOLLOW_20_in_rule__DataType__Alternatives1424); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:691:6: ( ( 'UINT32' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:691:6: ( ( 'UINT32' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:692:1: ( 'UINT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:693:1: ( 'UINT32' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:693:3: 'UINT32'
                    {
                    match(input,21,FOLLOW_21_in_rule__DataType__Alternatives1445); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:698:6: ( ( 'INT64' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:698:6: ( ( 'INT64' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:699:1: ( 'INT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:700:1: ( 'INT64' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:700:3: 'INT64'
                    {
                    match(input,22,FOLLOW_22_in_rule__DataType__Alternatives1466); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:705:6: ( ( 'UINT64' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:705:6: ( ( 'UINT64' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:706:1: ( 'UINT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:707:1: ( 'UINT64' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:707:3: 'UINT64'
                    {
                    match(input,23,FOLLOW_23_in_rule__DataType__Alternatives1487); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:712:6: ( ( 'FLOAT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:712:6: ( ( 'FLOAT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:713:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:714:1: ( 'FLOAT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:714:3: 'FLOAT'
                    {
                    match(input,24,FOLLOW_24_in_rule__DataType__Alternatives1508); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:719:6: ( ( 'DOUBLE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:719:6: ( ( 'DOUBLE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:720:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:721:1: ( 'DOUBLE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:721:3: 'DOUBLE'
                    {
                    match(input,25,FOLLOW_25_in_rule__DataType__Alternatives1529); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:726:6: ( ( 'BOOLEAN' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:726:6: ( ( 'BOOLEAN' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:727:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_10()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:728:1: ( 'BOOLEAN' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:728:3: 'BOOLEAN'
                    {
                    match(input,26,FOLLOW_26_in_rule__DataType__Alternatives1550); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:733:6: ( ( 'STRING' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:733:6: ( ( 'STRING' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:734:1: ( 'STRING' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_11()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:735:1: ( 'STRING' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:735:3: 'STRING'
                    {
                    match(input,27,FOLLOW_27_in_rule__DataType__Alternatives1571); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_11()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:747:1: rule__SensorInterface__Group__0 : rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 ;
    public final void rule__SensorInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:751:1: ( rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:752:2: rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__0__Impl_in_rule__SensorInterface__Group__01604);
            rule__SensorInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__1_in_rule__SensorInterface__Group__01607);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:759:1: rule__SensorInterface__Group__0__Impl : ( 'sensorInterface' ) ;
    public final void rule__SensorInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:763:1: ( ( 'sensorInterface' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:764:1: ( 'sensorInterface' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:764:1: ( 'sensorInterface' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:765:1: 'sensorInterface'
            {
             before(grammarAccess.getSensorInterfaceAccess().getSensorInterfaceKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__SensorInterface__Group__0__Impl1635); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:778:1: rule__SensorInterface__Group__1 : rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 ;
    public final void rule__SensorInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:782:1: ( rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:783:2: rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__1__Impl_in_rule__SensorInterface__Group__11666);
            rule__SensorInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__2_in_rule__SensorInterface__Group__11669);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:790:1: rule__SensorInterface__Group__1__Impl : ( ( rule__SensorInterface__NameAssignment_1 ) ) ;
    public final void rule__SensorInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:794:1: ( ( ( rule__SensorInterface__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:795:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:795:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:796:1: ( rule__SensorInterface__NameAssignment_1 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:797:1: ( rule__SensorInterface__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:797:2: rule__SensorInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SensorInterface__NameAssignment_1_in_rule__SensorInterface__Group__1__Impl1696);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:807:1: rule__SensorInterface__Group__2 : rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 ;
    public final void rule__SensorInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:811:1: ( rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:812:2: rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__2__Impl_in_rule__SensorInterface__Group__21726);
            rule__SensorInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__3_in_rule__SensorInterface__Group__21729);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:819:1: rule__SensorInterface__Group__2__Impl : ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) ;
    public final void rule__SensorInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:823:1: ( ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:824:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:824:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:825:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:826:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DESCRIPTION) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:826:2: rule__SensorInterface__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SensorInterface__DescriptionAssignment_2_in_rule__SensorInterface__Group__2__Impl1756);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:836:1: rule__SensorInterface__Group__3 : rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 ;
    public final void rule__SensorInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:840:1: ( rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:841:2: rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__3__Impl_in_rule__SensorInterface__Group__31787);
            rule__SensorInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__4_in_rule__SensorInterface__Group__31790);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:848:1: rule__SensorInterface__Group__3__Impl : ( ( rule__SensorInterface__Group_3__0 )? ) ;
    public final void rule__SensorInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:852:1: ( ( ( rule__SensorInterface__Group_3__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:853:1: ( ( rule__SensorInterface__Group_3__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:853:1: ( ( rule__SensorInterface__Group_3__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:854:1: ( rule__SensorInterface__Group_3__0 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:855:1: ( rule__SensorInterface__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:855:2: rule__SensorInterface__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SensorInterface__Group_3__0_in_rule__SensorInterface__Group__3__Impl1817);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:865:1: rule__SensorInterface__Group__4 : rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 ;
    public final void rule__SensorInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:869:1: ( rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:870:2: rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__4__Impl_in_rule__SensorInterface__Group__41848);
            rule__SensorInterface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__5_in_rule__SensorInterface__Group__41851);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:877:1: rule__SensorInterface__Group__4__Impl : ( '{' ) ;
    public final void rule__SensorInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:881:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:882:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:882:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:883:1: '{'
            {
             before(grammarAccess.getSensorInterfaceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__SensorInterface__Group__4__Impl1879); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:896:1: rule__SensorInterface__Group__5 : rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 ;
    public final void rule__SensorInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:900:1: ( rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:901:2: rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__5__Impl_in_rule__SensorInterface__Group__51910);
            rule__SensorInterface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__6_in_rule__SensorInterface__Group__51913);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:908:1: rule__SensorInterface__Group__5__Impl : ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) ;
    public final void rule__SensorInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:912:1: ( ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:913:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:913:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:914:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:915:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:915:2: rule__SensorInterface__EncodingSettingsAssignment_5
            {
            pushFollow(FOLLOW_rule__SensorInterface__EncodingSettingsAssignment_5_in_rule__SensorInterface__Group__5__Impl1940);
            rule__SensorInterface__EncodingSettingsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsAssignment_5()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:925:1: rule__SensorInterface__Group__6 : rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 ;
    public final void rule__SensorInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:929:1: ( rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:930:2: rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__6__Impl_in_rule__SensorInterface__Group__61970);
            rule__SensorInterface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__7_in_rule__SensorInterface__Group__61973);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:937:1: rule__SensorInterface__Group__6__Impl : ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) ;
    public final void rule__SensorInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:941:1: ( ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:942:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:942:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:943:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:944:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:944:2: rule__SensorInterface__DataDescriptionAssignment_6
            {
            pushFollow(FOLLOW_rule__SensorInterface__DataDescriptionAssignment_6_in_rule__SensorInterface__Group__6__Impl2000);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:954:1: rule__SensorInterface__Group__7 : rule__SensorInterface__Group__7__Impl ;
    public final void rule__SensorInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:958:1: ( rule__SensorInterface__Group__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:959:2: rule__SensorInterface__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__7__Impl_in_rule__SensorInterface__Group__72030);
            rule__SensorInterface__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:965:1: rule__SensorInterface__Group__7__Impl : ( '}' ) ;
    public final void rule__SensorInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:969:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:970:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:970:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:971:1: '}'
            {
             before(grammarAccess.getSensorInterfaceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_30_in_rule__SensorInterface__Group__7__Impl2058); 
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


    // $ANTLR start "rule__SensorInterface__Group_3__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1000:1: rule__SensorInterface__Group_3__0 : rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 ;
    public final void rule__SensorInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1004:1: ( rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1005:2: rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group_3__0__Impl_in_rule__SensorInterface__Group_3__02105);
            rule__SensorInterface__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group_3__1_in_rule__SensorInterface__Group_3__02108);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1012:1: rule__SensorInterface__Group_3__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1016:1: ( ( 'with identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1017:1: ( 'with identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1017:1: ( 'with identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1018:1: 'with identifier'
            {
             before(grammarAccess.getSensorInterfaceAccess().getWithIdentifierKeyword_3_0()); 
            match(input,31,FOLLOW_31_in_rule__SensorInterface__Group_3__0__Impl2136); 
             after(grammarAccess.getSensorInterfaceAccess().getWithIdentifierKeyword_3_0()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1031:1: rule__SensorInterface__Group_3__1 : rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 ;
    public final void rule__SensorInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1035:1: ( rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1036:2: rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group_3__1__Impl_in_rule__SensorInterface__Group_3__12167);
            rule__SensorInterface__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group_3__2_in_rule__SensorInterface__Group_3__12170);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1043:1: rule__SensorInterface__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SensorInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1047:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1048:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1048:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1049:1: ':'
            {
             before(grammarAccess.getSensorInterfaceAccess().getColonKeyword_3_1()); 
            match(input,32,FOLLOW_32_in_rule__SensorInterface__Group_3__1__Impl2198); 
             after(grammarAccess.getSensorInterfaceAccess().getColonKeyword_3_1()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1062:1: rule__SensorInterface__Group_3__2 : rule__SensorInterface__Group_3__2__Impl ;
    public final void rule__SensorInterface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1066:1: ( rule__SensorInterface__Group_3__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1067:2: rule__SensorInterface__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group_3__2__Impl_in_rule__SensorInterface__Group_3__22229);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1073:1: rule__SensorInterface__Group_3__2__Impl : ( ( rule__SensorInterface__IDAssignment_3_2 ) ) ;
    public final void rule__SensorInterface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1077:1: ( ( ( rule__SensorInterface__IDAssignment_3_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1078:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1078:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1079:1: ( rule__SensorInterface__IDAssignment_3_2 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDAssignment_3_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1080:1: ( rule__SensorInterface__IDAssignment_3_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1080:2: rule__SensorInterface__IDAssignment_3_2
            {
            pushFollow(FOLLOW_rule__SensorInterface__IDAssignment_3_2_in_rule__SensorInterface__Group_3__2__Impl2256);
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


    // $ANTLR start "rule__EncodingSettings__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1096:1: rule__EncodingSettings__Group__0 : rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 ;
    public final void rule__EncodingSettings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1100:1: ( rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1101:2: rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__0__Impl_in_rule__EncodingSettings__Group__02292);
            rule__EncodingSettings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__1_in_rule__EncodingSettings__Group__02295);
            rule__EncodingSettings__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__0"


    // $ANTLR start "rule__EncodingSettings__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1108:1: rule__EncodingSettings__Group__0__Impl : ( 'encoding' ) ;
    public final void rule__EncodingSettings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1112:1: ( ( 'encoding' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1113:1: ( 'encoding' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1113:1: ( 'encoding' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1114:1: 'encoding'
            {
             before(grammarAccess.getEncodingSettingsAccess().getEncodingKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__EncodingSettings__Group__0__Impl2323); 
             after(grammarAccess.getEncodingSettingsAccess().getEncodingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__0__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1127:1: rule__EncodingSettings__Group__1 : rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 ;
    public final void rule__EncodingSettings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1131:1: ( rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1132:2: rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__1__Impl_in_rule__EncodingSettings__Group__12354);
            rule__EncodingSettings__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__2_in_rule__EncodingSettings__Group__12357);
            rule__EncodingSettings__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__1"


    // $ANTLR start "rule__EncodingSettings__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1139:1: rule__EncodingSettings__Group__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1143:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1144:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1144:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1145:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__EncodingSettings__Group__1__Impl2385); 
             after(grammarAccess.getEncodingSettingsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__1__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1158:1: rule__EncodingSettings__Group__2 : rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 ;
    public final void rule__EncodingSettings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1162:1: ( rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1163:2: rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__2__Impl_in_rule__EncodingSettings__Group__22416);
            rule__EncodingSettings__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__3_in_rule__EncodingSettings__Group__22419);
            rule__EncodingSettings__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__2"


    // $ANTLR start "rule__EncodingSettings__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1170:1: rule__EncodingSettings__Group__2__Impl : ( ( rule__EncodingSettings__CodingAssignment_2 ) ) ;
    public final void rule__EncodingSettings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1174:1: ( ( ( rule__EncodingSettings__CodingAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1175:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1175:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1176:1: ( rule__EncodingSettings__CodingAssignment_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getCodingAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1177:1: ( rule__EncodingSettings__CodingAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1177:2: rule__EncodingSettings__CodingAssignment_2
            {
            pushFollow(FOLLOW_rule__EncodingSettings__CodingAssignment_2_in_rule__EncodingSettings__Group__2__Impl2446);
            rule__EncodingSettings__CodingAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEncodingSettingsAccess().getCodingAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__2__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1187:1: rule__EncodingSettings__Group__3 : rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 ;
    public final void rule__EncodingSettings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1191:1: ( rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1192:2: rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__3__Impl_in_rule__EncodingSettings__Group__32476);
            rule__EncodingSettings__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__4_in_rule__EncodingSettings__Group__32479);
            rule__EncodingSettings__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__3"


    // $ANTLR start "rule__EncodingSettings__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1199:1: rule__EncodingSettings__Group__3__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1203:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1204:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1204:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1205:1: ','
            {
             before(grammarAccess.getEncodingSettingsAccess().getCommaKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__EncodingSettings__Group__3__Impl2507); 
             after(grammarAccess.getEncodingSettingsAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__3__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1218:1: rule__EncodingSettings__Group__4 : rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 ;
    public final void rule__EncodingSettings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1222:1: ( rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1223:2: rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__4__Impl_in_rule__EncodingSettings__Group__42538);
            rule__EncodingSettings__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__5_in_rule__EncodingSettings__Group__42541);
            rule__EncodingSettings__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__4"


    // $ANTLR start "rule__EncodingSettings__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1230:1: rule__EncodingSettings__Group__4__Impl : ( 'endianness' ) ;
    public final void rule__EncodingSettings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1234:1: ( ( 'endianness' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1235:1: ( 'endianness' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1235:1: ( 'endianness' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1236:1: 'endianness'
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__EncodingSettings__Group__4__Impl2569); 
             after(grammarAccess.getEncodingSettingsAccess().getEndiannessKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__4__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1249:1: rule__EncodingSettings__Group__5 : rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 ;
    public final void rule__EncodingSettings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1253:1: ( rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1254:2: rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__5__Impl_in_rule__EncodingSettings__Group__52600);
            rule__EncodingSettings__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__6_in_rule__EncodingSettings__Group__52603);
            rule__EncodingSettings__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__5"


    // $ANTLR start "rule__EncodingSettings__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1261:1: rule__EncodingSettings__Group__5__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1265:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1266:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1266:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1267:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_5()); 
            match(input,32,FOLLOW_32_in_rule__EncodingSettings__Group__5__Impl2631); 
             after(grammarAccess.getEncodingSettingsAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__5__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1280:1: rule__EncodingSettings__Group__6 : rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 ;
    public final void rule__EncodingSettings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1284:1: ( rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1285:2: rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__6__Impl_in_rule__EncodingSettings__Group__62662);
            rule__EncodingSettings__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__7_in_rule__EncodingSettings__Group__62665);
            rule__EncodingSettings__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__6"


    // $ANTLR start "rule__EncodingSettings__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1292:1: rule__EncodingSettings__Group__6__Impl : ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) ;
    public final void rule__EncodingSettings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1296:1: ( ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1297:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1297:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1298:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1299:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1299:2: rule__EncodingSettings__EndiannessAssignment_6
            {
            pushFollow(FOLLOW_rule__EncodingSettings__EndiannessAssignment_6_in_rule__EncodingSettings__Group__6__Impl2692);
            rule__EncodingSettings__EndiannessAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEncodingSettingsAccess().getEndiannessAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__6__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1309:1: rule__EncodingSettings__Group__7 : rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 ;
    public final void rule__EncodingSettings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1313:1: ( rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1314:2: rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__7__Impl_in_rule__EncodingSettings__Group__72722);
            rule__EncodingSettings__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__8_in_rule__EncodingSettings__Group__72725);
            rule__EncodingSettings__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__7"


    // $ANTLR start "rule__EncodingSettings__Group__7__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1321:1: rule__EncodingSettings__Group__7__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1325:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1326:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1326:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1327:1: ','
            {
             before(grammarAccess.getEncodingSettingsAccess().getCommaKeyword_7()); 
            match(input,34,FOLLOW_34_in_rule__EncodingSettings__Group__7__Impl2753); 
             after(grammarAccess.getEncodingSettingsAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__7__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__8"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1340:1: rule__EncodingSettings__Group__8 : rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 ;
    public final void rule__EncodingSettings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1344:1: ( rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1345:2: rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__8__Impl_in_rule__EncodingSettings__Group__82784);
            rule__EncodingSettings__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__9_in_rule__EncodingSettings__Group__82787);
            rule__EncodingSettings__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__8"


    // $ANTLR start "rule__EncodingSettings__Group__8__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1352:1: rule__EncodingSettings__Group__8__Impl : ( 'alignment' ) ;
    public final void rule__EncodingSettings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1356:1: ( ( 'alignment' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1357:1: ( 'alignment' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1357:1: ( 'alignment' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1358:1: 'alignment'
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentKeyword_8()); 
            match(input,36,FOLLOW_36_in_rule__EncodingSettings__Group__8__Impl2815); 
             after(grammarAccess.getEncodingSettingsAccess().getAlignmentKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__8__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__9"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1371:1: rule__EncodingSettings__Group__9 : rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 ;
    public final void rule__EncodingSettings__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1375:1: ( rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1376:2: rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__9__Impl_in_rule__EncodingSettings__Group__92846);
            rule__EncodingSettings__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__10_in_rule__EncodingSettings__Group__92849);
            rule__EncodingSettings__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__9"


    // $ANTLR start "rule__EncodingSettings__Group__9__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1383:1: rule__EncodingSettings__Group__9__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1387:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1388:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1388:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1389:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_9()); 
            match(input,32,FOLLOW_32_in_rule__EncodingSettings__Group__9__Impl2877); 
             after(grammarAccess.getEncodingSettingsAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__9__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__10"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1402:1: rule__EncodingSettings__Group__10 : rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 ;
    public final void rule__EncodingSettings__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1406:1: ( rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1407:2: rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__10__Impl_in_rule__EncodingSettings__Group__102908);
            rule__EncodingSettings__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__11_in_rule__EncodingSettings__Group__102911);
            rule__EncodingSettings__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__10"


    // $ANTLR start "rule__EncodingSettings__Group__10__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1414:1: rule__EncodingSettings__Group__10__Impl : ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) ;
    public final void rule__EncodingSettings__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1418:1: ( ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1419:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1419:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1420:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentAssignment_10()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1421:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1421:2: rule__EncodingSettings__AlignmentAssignment_10
            {
            pushFollow(FOLLOW_rule__EncodingSettings__AlignmentAssignment_10_in_rule__EncodingSettings__Group__10__Impl2938);
            rule__EncodingSettings__AlignmentAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getEncodingSettingsAccess().getAlignmentAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__10__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__11"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1431:1: rule__EncodingSettings__Group__11 : rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 ;
    public final void rule__EncodingSettings__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1435:1: ( rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1436:2: rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__11__Impl_in_rule__EncodingSettings__Group__112968);
            rule__EncodingSettings__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__12_in_rule__EncodingSettings__Group__112971);
            rule__EncodingSettings__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__11"


    // $ANTLR start "rule__EncodingSettings__Group__11__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1443:1: rule__EncodingSettings__Group__11__Impl : ( 'BIT' ) ;
    public final void rule__EncodingSettings__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1447:1: ( ( 'BIT' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1448:1: ( 'BIT' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1448:1: ( 'BIT' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1449:1: 'BIT'
            {
             before(grammarAccess.getEncodingSettingsAccess().getBITKeyword_11()); 
            match(input,37,FOLLOW_37_in_rule__EncodingSettings__Group__11__Impl2999); 
             after(grammarAccess.getEncodingSettingsAccess().getBITKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__11__Impl"


    // $ANTLR start "rule__EncodingSettings__Group__12"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1462:1: rule__EncodingSettings__Group__12 : rule__EncodingSettings__Group__12__Impl ;
    public final void rule__EncodingSettings__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1466:1: ( rule__EncodingSettings__Group__12__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1467:2: rule__EncodingSettings__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__12__Impl_in_rule__EncodingSettings__Group__123030);
            rule__EncodingSettings__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__12"


    // $ANTLR start "rule__EncodingSettings__Group__12__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1473:1: rule__EncodingSettings__Group__12__Impl : ( ( rule__EncodingSettings__Group_12__0 )? ) ;
    public final void rule__EncodingSettings__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1477:1: ( ( ( rule__EncodingSettings__Group_12__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1478:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1478:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1479:1: ( rule__EncodingSettings__Group_12__0 )?
            {
             before(grammarAccess.getEncodingSettingsAccess().getGroup_12()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1480:1: ( rule__EncodingSettings__Group_12__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1480:2: rule__EncodingSettings__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__EncodingSettings__Group_12__0_in_rule__EncodingSettings__Group__12__Impl3057);
                    rule__EncodingSettings__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEncodingSettingsAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group__12__Impl"


    // $ANTLR start "rule__EncodingSettings__Group_12__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1516:1: rule__EncodingSettings__Group_12__0 : rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 ;
    public final void rule__EncodingSettings__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1520:1: ( rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1521:2: rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group_12__0__Impl_in_rule__EncodingSettings__Group_12__03114);
            rule__EncodingSettings__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group_12__1_in_rule__EncodingSettings__Group_12__03117);
            rule__EncodingSettings__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group_12__0"


    // $ANTLR start "rule__EncodingSettings__Group_12__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1528:1: rule__EncodingSettings__Group_12__0__Impl : ( 'with identifier' ) ;
    public final void rule__EncodingSettings__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1532:1: ( ( 'with identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1533:1: ( 'with identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1533:1: ( 'with identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1534:1: 'with identifier'
            {
             before(grammarAccess.getEncodingSettingsAccess().getWithIdentifierKeyword_12_0()); 
            match(input,31,FOLLOW_31_in_rule__EncodingSettings__Group_12__0__Impl3145); 
             after(grammarAccess.getEncodingSettingsAccess().getWithIdentifierKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group_12__0__Impl"


    // $ANTLR start "rule__EncodingSettings__Group_12__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1547:1: rule__EncodingSettings__Group_12__1 : rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 ;
    public final void rule__EncodingSettings__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1551:1: ( rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1552:2: rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group_12__1__Impl_in_rule__EncodingSettings__Group_12__13176);
            rule__EncodingSettings__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group_12__2_in_rule__EncodingSettings__Group_12__13179);
            rule__EncodingSettings__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group_12__1"


    // $ANTLR start "rule__EncodingSettings__Group_12__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1559:1: rule__EncodingSettings__Group_12__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1563:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1564:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1564:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1565:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_12_1()); 
            match(input,32,FOLLOW_32_in_rule__EncodingSettings__Group_12__1__Impl3207); 
             after(grammarAccess.getEncodingSettingsAccess().getColonKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group_12__1__Impl"


    // $ANTLR start "rule__EncodingSettings__Group_12__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1578:1: rule__EncodingSettings__Group_12__2 : rule__EncodingSettings__Group_12__2__Impl ;
    public final void rule__EncodingSettings__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1582:1: ( rule__EncodingSettings__Group_12__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1583:2: rule__EncodingSettings__Group_12__2__Impl
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group_12__2__Impl_in_rule__EncodingSettings__Group_12__23238);
            rule__EncodingSettings__Group_12__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group_12__2"


    // $ANTLR start "rule__EncodingSettings__Group_12__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1589:1: rule__EncodingSettings__Group_12__2__Impl : ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) ;
    public final void rule__EncodingSettings__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1593:1: ( ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1594:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1594:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1595:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getIDAssignment_12_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1596:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1596:2: rule__EncodingSettings__IDAssignment_12_2
            {
            pushFollow(FOLLOW_rule__EncodingSettings__IDAssignment_12_2_in_rule__EncodingSettings__Group_12__2__Impl3265);
            rule__EncodingSettings__IDAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getEncodingSettingsAccess().getIDAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__Group_12__2__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1612:1: rule__SensorDataDescription__Group__0 : rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 ;
    public final void rule__SensorDataDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1616:1: ( rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1617:2: rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__0__Impl_in_rule__SensorDataDescription__Group__03301);
            rule__SensorDataDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__1_in_rule__SensorDataDescription__Group__03304);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1624:1: rule__SensorDataDescription__Group__0__Impl : ( 'sensorData' ) ;
    public final void rule__SensorDataDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1628:1: ( ( 'sensorData' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1629:1: ( 'sensorData' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1629:1: ( 'sensorData' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1630:1: 'sensorData'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSensorDataKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__SensorDataDescription__Group__0__Impl3332); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1643:1: rule__SensorDataDescription__Group__1 : rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 ;
    public final void rule__SensorDataDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1647:1: ( rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1648:2: rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__1__Impl_in_rule__SensorDataDescription__Group__13363);
            rule__SensorDataDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__2_in_rule__SensorDataDescription__Group__13366);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1655:1: rule__SensorDataDescription__Group__1__Impl : ( () ) ;
    public final void rule__SensorDataDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1659:1: ( ( () ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1660:1: ( () )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1660:1: ( () )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1661:1: ()
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1662:1: ()
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1664:1: 
            {
            }

             after(grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group__1__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1674:1: rule__SensorDataDescription__Group__2 : rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 ;
    public final void rule__SensorDataDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1678:1: ( rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1679:2: rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__2__Impl_in_rule__SensorDataDescription__Group__23424);
            rule__SensorDataDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__3_in_rule__SensorDataDescription__Group__23427);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1686:1: rule__SensorDataDescription__Group__2__Impl : ( ( rule__SensorDataDescription__Group_2__0 )? ) ;
    public final void rule__SensorDataDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1690:1: ( ( ( rule__SensorDataDescription__Group_2__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1691:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1691:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1692:1: ( rule__SensorDataDescription__Group_2__0 )?
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1693:1: ( rule__SensorDataDescription__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1693:2: rule__SensorDataDescription__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SensorDataDescription__Group_2__0_in_rule__SensorDataDescription__Group__2__Impl3454);
                    rule__SensorDataDescription__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorDataDescriptionAccess().getGroup_2()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1703:1: rule__SensorDataDescription__Group__3 : rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 ;
    public final void rule__SensorDataDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1707:1: ( rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1708:2: rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__3__Impl_in_rule__SensorDataDescription__Group__33485);
            rule__SensorDataDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__4_in_rule__SensorDataDescription__Group__33488);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1715:1: rule__SensorDataDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__SensorDataDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1719:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1720:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1720:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1721:1: '{'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__SensorDataDescription__Group__3__Impl3516); 
             after(grammarAccess.getSensorDataDescriptionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1734:1: rule__SensorDataDescription__Group__4 : rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 ;
    public final void rule__SensorDataDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1738:1: ( rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1739:2: rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__4__Impl_in_rule__SensorDataDescription__Group__43547);
            rule__SensorDataDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__5_in_rule__SensorDataDescription__Group__43550);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1746:1: rule__SensorDataDescription__Group__4__Impl : ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) ;
    public final void rule__SensorDataDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1750:1: ( ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1751:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1751:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1752:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1753:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1753:2: rule__SensorDataDescription__DataSetsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SensorDataDescription__DataSetsAssignment_4_in_rule__SensorDataDescription__Group__4__Impl3577);
            	    rule__SensorDataDescription__DataSetsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSensorDataDescriptionAccess().getDataSetsAssignment_4()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1763:1: rule__SensorDataDescription__Group__5 : rule__SensorDataDescription__Group__5__Impl ;
    public final void rule__SensorDataDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1767:1: ( rule__SensorDataDescription__Group__5__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1768:2: rule__SensorDataDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__5__Impl_in_rule__SensorDataDescription__Group__53608);
            rule__SensorDataDescription__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1774:1: rule__SensorDataDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__SensorDataDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1778:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1779:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1779:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1780:1: '}'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__SensorDataDescription__Group__5__Impl3636); 
             after(grammarAccess.getSensorDataDescriptionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__SensorDataDescription__Group_2__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1805:1: rule__SensorDataDescription__Group_2__0 : rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 ;
    public final void rule__SensorDataDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1809:1: ( rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1810:2: rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group_2__0__Impl_in_rule__SensorDataDescription__Group_2__03679);
            rule__SensorDataDescription__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group_2__1_in_rule__SensorDataDescription__Group_2__03682);
            rule__SensorDataDescription__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_2__0"


    // $ANTLR start "rule__SensorDataDescription__Group_2__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1817:1: rule__SensorDataDescription__Group_2__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorDataDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1821:1: ( ( 'with identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1822:1: ( 'with identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1822:1: ( 'with identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1823:1: 'with identifier'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getWithIdentifierKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__SensorDataDescription__Group_2__0__Impl3710); 
             after(grammarAccess.getSensorDataDescriptionAccess().getWithIdentifierKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_2__0__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group_2__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1836:1: rule__SensorDataDescription__Group_2__1 : rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 ;
    public final void rule__SensorDataDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1840:1: ( rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1841:2: rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group_2__1__Impl_in_rule__SensorDataDescription__Group_2__13741);
            rule__SensorDataDescription__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group_2__2_in_rule__SensorDataDescription__Group_2__13744);
            rule__SensorDataDescription__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_2__1"


    // $ANTLR start "rule__SensorDataDescription__Group_2__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1848:1: rule__SensorDataDescription__Group_2__1__Impl : ( ':' ) ;
    public final void rule__SensorDataDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1852:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1853:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1853:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1854:1: ':'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getColonKeyword_2_1()); 
            match(input,32,FOLLOW_32_in_rule__SensorDataDescription__Group_2__1__Impl3772); 
             after(grammarAccess.getSensorDataDescriptionAccess().getColonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_2__1__Impl"


    // $ANTLR start "rule__SensorDataDescription__Group_2__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1867:1: rule__SensorDataDescription__Group_2__2 : rule__SensorDataDescription__Group_2__2__Impl ;
    public final void rule__SensorDataDescription__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1871:1: ( rule__SensorDataDescription__Group_2__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1872:2: rule__SensorDataDescription__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group_2__2__Impl_in_rule__SensorDataDescription__Group_2__23803);
            rule__SensorDataDescription__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_2__2"


    // $ANTLR start "rule__SensorDataDescription__Group_2__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1878:1: rule__SensorDataDescription__Group_2__2__Impl : ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) ;
    public final void rule__SensorDataDescription__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1882:1: ( ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1883:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1883:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1884:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDAssignment_2_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1885:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1885:2: rule__SensorDataDescription__IDAssignment_2_2
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__IDAssignment_2_2_in_rule__SensorDataDescription__Group_2__2__Impl3830);
            rule__SensorDataDescription__IDAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorDataDescriptionAccess().getIDAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__Group_2__2__Impl"


    // $ANTLR start "rule__DataSet__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1901:1: rule__DataSet__Group__0 : rule__DataSet__Group__0__Impl rule__DataSet__Group__1 ;
    public final void rule__DataSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1905:1: ( rule__DataSet__Group__0__Impl rule__DataSet__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1906:2: rule__DataSet__Group__0__Impl rule__DataSet__Group__1
            {
            pushFollow(FOLLOW_rule__DataSet__Group__0__Impl_in_rule__DataSet__Group__03866);
            rule__DataSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__1_in_rule__DataSet__Group__03869);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1913:1: rule__DataSet__Group__0__Impl : ( 'dataSet' ) ;
    public final void rule__DataSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1917:1: ( ( 'dataSet' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1918:1: ( 'dataSet' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1918:1: ( 'dataSet' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1919:1: 'dataSet'
            {
             before(grammarAccess.getDataSetAccess().getDataSetKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__DataSet__Group__0__Impl3897); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1932:1: rule__DataSet__Group__1 : rule__DataSet__Group__1__Impl rule__DataSet__Group__2 ;
    public final void rule__DataSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1936:1: ( rule__DataSet__Group__1__Impl rule__DataSet__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1937:2: rule__DataSet__Group__1__Impl rule__DataSet__Group__2
            {
            pushFollow(FOLLOW_rule__DataSet__Group__1__Impl_in_rule__DataSet__Group__13928);
            rule__DataSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__2_in_rule__DataSet__Group__13931);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1944:1: rule__DataSet__Group__1__Impl : ( ( rule__DataSet__NameAssignment_1 ) ) ;
    public final void rule__DataSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1948:1: ( ( ( rule__DataSet__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1949:1: ( ( rule__DataSet__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1949:1: ( ( rule__DataSet__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1950:1: ( rule__DataSet__NameAssignment_1 )
            {
             before(grammarAccess.getDataSetAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1951:1: ( rule__DataSet__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1951:2: rule__DataSet__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataSet__NameAssignment_1_in_rule__DataSet__Group__1__Impl3958);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1961:1: rule__DataSet__Group__2 : rule__DataSet__Group__2__Impl rule__DataSet__Group__3 ;
    public final void rule__DataSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1965:1: ( rule__DataSet__Group__2__Impl rule__DataSet__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1966:2: rule__DataSet__Group__2__Impl rule__DataSet__Group__3
            {
            pushFollow(FOLLOW_rule__DataSet__Group__2__Impl_in_rule__DataSet__Group__23988);
            rule__DataSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__3_in_rule__DataSet__Group__23991);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1973:1: rule__DataSet__Group__2__Impl : ( ( rule__DataSet__Group_2__0 )? ) ;
    public final void rule__DataSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1977:1: ( ( ( rule__DataSet__Group_2__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1978:1: ( ( rule__DataSet__Group_2__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1978:1: ( ( rule__DataSet__Group_2__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1979:1: ( rule__DataSet__Group_2__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1980:1: ( rule__DataSet__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1980:2: rule__DataSet__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DataSet__Group_2__0_in_rule__DataSet__Group__2__Impl4018);
                    rule__DataSet__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSetAccess().getGroup_2()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1990:1: rule__DataSet__Group__3 : rule__DataSet__Group__3__Impl rule__DataSet__Group__4 ;
    public final void rule__DataSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1994:1: ( rule__DataSet__Group__3__Impl rule__DataSet__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1995:2: rule__DataSet__Group__3__Impl rule__DataSet__Group__4
            {
            pushFollow(FOLLOW_rule__DataSet__Group__3__Impl_in_rule__DataSet__Group__34049);
            rule__DataSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__4_in_rule__DataSet__Group__34052);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2002:1: rule__DataSet__Group__3__Impl : ( ( rule__DataSet__Group_3__0 )? ) ;
    public final void rule__DataSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2006:1: ( ( ( rule__DataSet__Group_3__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2007:1: ( ( rule__DataSet__Group_3__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2007:1: ( ( rule__DataSet__Group_3__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2008:1: ( rule__DataSet__Group_3__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2009:1: ( rule__DataSet__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2009:2: rule__DataSet__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DataSet__Group_3__0_in_rule__DataSet__Group__3__Impl4079);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2019:1: rule__DataSet__Group__4 : rule__DataSet__Group__4__Impl rule__DataSet__Group__5 ;
    public final void rule__DataSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2023:1: ( rule__DataSet__Group__4__Impl rule__DataSet__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2024:2: rule__DataSet__Group__4__Impl rule__DataSet__Group__5
            {
            pushFollow(FOLLOW_rule__DataSet__Group__4__Impl_in_rule__DataSet__Group__44110);
            rule__DataSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__5_in_rule__DataSet__Group__44113);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2031:1: rule__DataSet__Group__4__Impl : ( ( rule__DataSet__DescriptionAssignment_4 )? ) ;
    public final void rule__DataSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2035:1: ( ( ( rule__DataSet__DescriptionAssignment_4 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2036:1: ( ( rule__DataSet__DescriptionAssignment_4 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2036:1: ( ( rule__DataSet__DescriptionAssignment_4 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2037:1: ( rule__DataSet__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getDataSetAccess().getDescriptionAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2038:1: ( rule__DataSet__DescriptionAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DESCRIPTION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2038:2: rule__DataSet__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__DataSet__DescriptionAssignment_4_in_rule__DataSet__Group__4__Impl4140);
                    rule__DataSet__DescriptionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSetAccess().getDescriptionAssignment_4()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2048:1: rule__DataSet__Group__5 : rule__DataSet__Group__5__Impl rule__DataSet__Group__6 ;
    public final void rule__DataSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2052:1: ( rule__DataSet__Group__5__Impl rule__DataSet__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2053:2: rule__DataSet__Group__5__Impl rule__DataSet__Group__6
            {
            pushFollow(FOLLOW_rule__DataSet__Group__5__Impl_in_rule__DataSet__Group__54171);
            rule__DataSet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__6_in_rule__DataSet__Group__54174);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2060:1: rule__DataSet__Group__5__Impl : ( '{' ) ;
    public final void rule__DataSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2064:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2065:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2065:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2066:1: '{'
            {
             before(grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__DataSet__Group__5__Impl4202); 
             after(grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2079:1: rule__DataSet__Group__6 : rule__DataSet__Group__6__Impl rule__DataSet__Group__7 ;
    public final void rule__DataSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2083:1: ( rule__DataSet__Group__6__Impl rule__DataSet__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2084:2: rule__DataSet__Group__6__Impl rule__DataSet__Group__7
            {
            pushFollow(FOLLOW_rule__DataSet__Group__6__Impl_in_rule__DataSet__Group__64233);
            rule__DataSet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__7_in_rule__DataSet__Group__64236);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2091:1: rule__DataSet__Group__6__Impl : ( ( rule__DataSet__DataAssignment_6 )* ) ;
    public final void rule__DataSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2095:1: ( ( ( rule__DataSet__DataAssignment_6 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2096:1: ( ( rule__DataSet__DataAssignment_6 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2096:1: ( ( rule__DataSet__DataAssignment_6 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2097:1: ( rule__DataSet__DataAssignment_6 )*
            {
             before(grammarAccess.getDataSetAccess().getDataAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2098:1: ( rule__DataSet__DataAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2098:2: rule__DataSet__DataAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__DataSet__DataAssignment_6_in_rule__DataSet__Group__6__Impl4263);
            	    rule__DataSet__DataAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2108:1: rule__DataSet__Group__7 : rule__DataSet__Group__7__Impl ;
    public final void rule__DataSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2112:1: ( rule__DataSet__Group__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2113:2: rule__DataSet__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__DataSet__Group__7__Impl_in_rule__DataSet__Group__74294);
            rule__DataSet__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2119:1: rule__DataSet__Group__7__Impl : ( '}' ) ;
    public final void rule__DataSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2123:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2124:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2124:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2125:1: '}'
            {
             before(grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_30_in_rule__DataSet__Group__7__Impl4322); 
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


    // $ANTLR start "rule__DataSet__Group_2__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2154:1: rule__DataSet__Group_2__0 : rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 ;
    public final void rule__DataSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2158:1: ( rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2159:2: rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1
            {
            pushFollow(FOLLOW_rule__DataSet__Group_2__0__Impl_in_rule__DataSet__Group_2__04369);
            rule__DataSet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group_2__1_in_rule__DataSet__Group_2__04372);
            rule__DataSet__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_2__0"


    // $ANTLR start "rule__DataSet__Group_2__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2166:1: rule__DataSet__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__DataSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2170:1: ( ( 'uses' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2171:1: ( 'uses' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2171:1: ( 'uses' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2172:1: 'uses'
            {
             before(grammarAccess.getDataSetAccess().getUsesKeyword_2_0()); 
            match(input,40,FOLLOW_40_in_rule__DataSet__Group_2__0__Impl4400); 
             after(grammarAccess.getDataSetAccess().getUsesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_2__0__Impl"


    // $ANTLR start "rule__DataSet__Group_2__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2185:1: rule__DataSet__Group_2__1 : rule__DataSet__Group_2__1__Impl ;
    public final void rule__DataSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2189:1: ( rule__DataSet__Group_2__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2190:2: rule__DataSet__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DataSet__Group_2__1__Impl_in_rule__DataSet__Group_2__14431);
            rule__DataSet__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_2__1"


    // $ANTLR start "rule__DataSet__Group_2__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2196:1: rule__DataSet__Group_2__1__Impl : ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) ) ;
    public final void rule__DataSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2200:1: ( ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2201:1: ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2201:1: ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2202:1: ( rule__DataSet__ParentDataSetAssignment_2_1 )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetAssignment_2_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2203:1: ( rule__DataSet__ParentDataSetAssignment_2_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2203:2: rule__DataSet__ParentDataSetAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DataSet__ParentDataSetAssignment_2_1_in_rule__DataSet__Group_2__1__Impl4458);
            rule__DataSet__ParentDataSetAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSetAccess().getParentDataSetAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_2__1__Impl"


    // $ANTLR start "rule__DataSet__Group_3__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2217:1: rule__DataSet__Group_3__0 : rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 ;
    public final void rule__DataSet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2221:1: ( rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2222:2: rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1
            {
            pushFollow(FOLLOW_rule__DataSet__Group_3__0__Impl_in_rule__DataSet__Group_3__04492);
            rule__DataSet__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group_3__1_in_rule__DataSet__Group_3__04495);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2229:1: rule__DataSet__Group_3__0__Impl : ( 'with identifier' ) ;
    public final void rule__DataSet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2233:1: ( ( 'with identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2234:1: ( 'with identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2234:1: ( 'with identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2235:1: 'with identifier'
            {
             before(grammarAccess.getDataSetAccess().getWithIdentifierKeyword_3_0()); 
            match(input,31,FOLLOW_31_in_rule__DataSet__Group_3__0__Impl4523); 
             after(grammarAccess.getDataSetAccess().getWithIdentifierKeyword_3_0()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2248:1: rule__DataSet__Group_3__1 : rule__DataSet__Group_3__1__Impl rule__DataSet__Group_3__2 ;
    public final void rule__DataSet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2252:1: ( rule__DataSet__Group_3__1__Impl rule__DataSet__Group_3__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2253:2: rule__DataSet__Group_3__1__Impl rule__DataSet__Group_3__2
            {
            pushFollow(FOLLOW_rule__DataSet__Group_3__1__Impl_in_rule__DataSet__Group_3__14554);
            rule__DataSet__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group_3__2_in_rule__DataSet__Group_3__14557);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2260:1: rule__DataSet__Group_3__1__Impl : ( ':' ) ;
    public final void rule__DataSet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2264:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2265:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2265:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2266:1: ':'
            {
             before(grammarAccess.getDataSetAccess().getColonKeyword_3_1()); 
            match(input,32,FOLLOW_32_in_rule__DataSet__Group_3__1__Impl4585); 
             after(grammarAccess.getDataSetAccess().getColonKeyword_3_1()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2279:1: rule__DataSet__Group_3__2 : rule__DataSet__Group_3__2__Impl ;
    public final void rule__DataSet__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2283:1: ( rule__DataSet__Group_3__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2284:2: rule__DataSet__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__DataSet__Group_3__2__Impl_in_rule__DataSet__Group_3__24616);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2290:1: rule__DataSet__Group_3__2__Impl : ( ( rule__DataSet__IDAssignment_3_2 ) ) ;
    public final void rule__DataSet__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2294:1: ( ( ( rule__DataSet__IDAssignment_3_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2295:1: ( ( rule__DataSet__IDAssignment_3_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2295:1: ( ( rule__DataSet__IDAssignment_3_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2296:1: ( rule__DataSet__IDAssignment_3_2 )
            {
             before(grammarAccess.getDataSetAccess().getIDAssignment_3_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2297:1: ( rule__DataSet__IDAssignment_3_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2297:2: rule__DataSet__IDAssignment_3_2
            {
            pushFollow(FOLLOW_rule__DataSet__IDAssignment_3_2_in_rule__DataSet__Group_3__2__Impl4643);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2313:1: rule__MeasurementData__Group__0 : rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 ;
    public final void rule__MeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2317:1: ( rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2318:2: rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__0__Impl_in_rule__MeasurementData__Group__04679);
            rule__MeasurementData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__1_in_rule__MeasurementData__Group__04682);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2325:1: rule__MeasurementData__Group__0__Impl : ( ( rule__MeasurementData__NameAssignment_0 ) ) ;
    public final void rule__MeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2329:1: ( ( ( rule__MeasurementData__NameAssignment_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2330:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2330:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2331:1: ( rule__MeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getNameAssignment_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2332:1: ( rule__MeasurementData__NameAssignment_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2332:2: rule__MeasurementData__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MeasurementData__NameAssignment_0_in_rule__MeasurementData__Group__0__Impl4709);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2342:1: rule__MeasurementData__Group__1 : rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 ;
    public final void rule__MeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2346:1: ( rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2347:2: rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__1__Impl_in_rule__MeasurementData__Group__14739);
            rule__MeasurementData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__2_in_rule__MeasurementData__Group__14742);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2354:1: rule__MeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2358:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2359:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2359:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2360:1: 'as'
            {
             before(grammarAccess.getMeasurementDataAccess().getAsKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__MeasurementData__Group__1__Impl4770); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2373:1: rule__MeasurementData__Group__2 : rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 ;
    public final void rule__MeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2377:1: ( rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2378:2: rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__2__Impl_in_rule__MeasurementData__Group__24801);
            rule__MeasurementData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__3_in_rule__MeasurementData__Group__24804);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2385:1: rule__MeasurementData__Group__2__Impl : ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2389:1: ( ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2390:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2390:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2391:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2392:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2392:2: rule__MeasurementData__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__MeasurementData__DataTypeAssignment_2_in_rule__MeasurementData__Group__2__Impl4831);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2402:1: rule__MeasurementData__Group__3 : rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 ;
    public final void rule__MeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2406:1: ( rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2407:2: rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__3__Impl_in_rule__MeasurementData__Group__34861);
            rule__MeasurementData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__4_in_rule__MeasurementData__Group__34864);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2414:1: rule__MeasurementData__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2418:1: ( ( 'in' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2419:1: ( 'in' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2419:1: ( 'in' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2420:1: 'in'
            {
             before(grammarAccess.getMeasurementDataAccess().getInKeyword_3()); 
            match(input,42,FOLLOW_42_in_rule__MeasurementData__Group__3__Impl4892); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2433:1: rule__MeasurementData__Group__4 : rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 ;
    public final void rule__MeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2437:1: ( rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2438:2: rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__4__Impl_in_rule__MeasurementData__Group__44923);
            rule__MeasurementData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__5_in_rule__MeasurementData__Group__44926);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2445:1: rule__MeasurementData__Group__4__Impl : ( ( rule__MeasurementData__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2449:1: ( ( ( rule__MeasurementData__UnitAssignment_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2450:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2450:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2451:1: ( rule__MeasurementData__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2452:1: ( rule__MeasurementData__UnitAssignment_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2452:2: rule__MeasurementData__UnitAssignment_4
            {
            pushFollow(FOLLOW_rule__MeasurementData__UnitAssignment_4_in_rule__MeasurementData__Group__4__Impl4953);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2462:1: rule__MeasurementData__Group__5 : rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 ;
    public final void rule__MeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2466:1: ( rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2467:2: rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__5__Impl_in_rule__MeasurementData__Group__54983);
            rule__MeasurementData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__6_in_rule__MeasurementData__Group__54986);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2474:1: rule__MeasurementData__Group__5__Impl : ( ( rule__MeasurementData__Group_5__0 )? ) ;
    public final void rule__MeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2478:1: ( ( ( rule__MeasurementData__Group_5__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2479:1: ( ( rule__MeasurementData__Group_5__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2479:1: ( ( rule__MeasurementData__Group_5__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2480:1: ( rule__MeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2481:1: ( rule__MeasurementData__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2481:2: rule__MeasurementData__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MeasurementData__Group_5__0_in_rule__MeasurementData__Group__5__Impl5013);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2491:1: rule__MeasurementData__Group__6 : rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 ;
    public final void rule__MeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2495:1: ( rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2496:2: rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__6__Impl_in_rule__MeasurementData__Group__65044);
            rule__MeasurementData__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__7_in_rule__MeasurementData__Group__65047);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2503:1: rule__MeasurementData__Group__6__Impl : ( ( rule__MeasurementData__Group_6__0 )? ) ;
    public final void rule__MeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2507:1: ( ( ( rule__MeasurementData__Group_6__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2508:1: ( ( rule__MeasurementData__Group_6__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2508:1: ( ( rule__MeasurementData__Group_6__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2509:1: ( rule__MeasurementData__Group_6__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2510:1: ( rule__MeasurementData__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2510:2: rule__MeasurementData__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__MeasurementData__Group_6__0_in_rule__MeasurementData__Group__6__Impl5074);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2520:1: rule__MeasurementData__Group__7 : rule__MeasurementData__Group__7__Impl ;
    public final void rule__MeasurementData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2524:1: ( rule__MeasurementData__Group__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2525:2: rule__MeasurementData__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__7__Impl_in_rule__MeasurementData__Group__75105);
            rule__MeasurementData__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2531:1: rule__MeasurementData__Group__7__Impl : ( ( rule__MeasurementData__DescriptionAssignment_7 )? ) ;
    public final void rule__MeasurementData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2535:1: ( ( ( rule__MeasurementData__DescriptionAssignment_7 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2536:1: ( ( rule__MeasurementData__DescriptionAssignment_7 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2536:1: ( ( rule__MeasurementData__DescriptionAssignment_7 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2537:1: ( rule__MeasurementData__DescriptionAssignment_7 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionAssignment_7()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2538:1: ( rule__MeasurementData__DescriptionAssignment_7 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DESCRIPTION) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2538:2: rule__MeasurementData__DescriptionAssignment_7
                    {
                    pushFollow(FOLLOW_rule__MeasurementData__DescriptionAssignment_7_in_rule__MeasurementData__Group__7__Impl5132);
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


    // $ANTLR start "rule__MeasurementData__Group_5__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2564:1: rule__MeasurementData__Group_5__0 : rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 ;
    public final void rule__MeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2568:1: ( rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2569:2: rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_5__0__Impl_in_rule__MeasurementData__Group_5__05179);
            rule__MeasurementData__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_5__1_in_rule__MeasurementData__Group_5__05182);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2576:1: rule__MeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2580:1: ( ( 'with identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2581:1: ( 'with identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2581:1: ( 'with identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2582:1: 'with identifier'
            {
             before(grammarAccess.getMeasurementDataAccess().getWithIdentifierKeyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__MeasurementData__Group_5__0__Impl5210); 
             after(grammarAccess.getMeasurementDataAccess().getWithIdentifierKeyword_5_0()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2595:1: rule__MeasurementData__Group_5__1 : rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 ;
    public final void rule__MeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2599:1: ( rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2600:2: rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_5__1__Impl_in_rule__MeasurementData__Group_5__15241);
            rule__MeasurementData__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_5__2_in_rule__MeasurementData__Group_5__15244);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2607:1: rule__MeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2611:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2612:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2612:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2613:1: ':'
            {
             before(grammarAccess.getMeasurementDataAccess().getColonKeyword_5_1()); 
            match(input,32,FOLLOW_32_in_rule__MeasurementData__Group_5__1__Impl5272); 
             after(grammarAccess.getMeasurementDataAccess().getColonKeyword_5_1()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2626:1: rule__MeasurementData__Group_5__2 : rule__MeasurementData__Group_5__2__Impl ;
    public final void rule__MeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2630:1: ( rule__MeasurementData__Group_5__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2631:2: rule__MeasurementData__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_5__2__Impl_in_rule__MeasurementData__Group_5__25303);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2637:1: rule__MeasurementData__Group_5__2__Impl : ( ( rule__MeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2641:1: ( ( ( rule__MeasurementData__IDAssignment_5_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2642:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2642:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2643:1: ( rule__MeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getIDAssignment_5_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2644:1: ( rule__MeasurementData__IDAssignment_5_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2644:2: rule__MeasurementData__IDAssignment_5_2
            {
            pushFollow(FOLLOW_rule__MeasurementData__IDAssignment_5_2_in_rule__MeasurementData__Group_5__2__Impl5330);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2660:1: rule__MeasurementData__Group_6__0 : rule__MeasurementData__Group_6__0__Impl rule__MeasurementData__Group_6__1 ;
    public final void rule__MeasurementData__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2664:1: ( rule__MeasurementData__Group_6__0__Impl rule__MeasurementData__Group_6__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2665:2: rule__MeasurementData__Group_6__0__Impl rule__MeasurementData__Group_6__1
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6__0__Impl_in_rule__MeasurementData__Group_6__05366);
            rule__MeasurementData__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_6__1_in_rule__MeasurementData__Group_6__05369);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2672:1: rule__MeasurementData__Group_6__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2676:1: ( ( 'adjusted' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2677:1: ( 'adjusted' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2677:1: ( 'adjusted' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2678:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0()); 
            match(input,43,FOLLOW_43_in_rule__MeasurementData__Group_6__0__Impl5397); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2691:1: rule__MeasurementData__Group_6__1 : rule__MeasurementData__Group_6__1__Impl rule__MeasurementData__Group_6__2 ;
    public final void rule__MeasurementData__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2695:1: ( rule__MeasurementData__Group_6__1__Impl rule__MeasurementData__Group_6__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2696:2: rule__MeasurementData__Group_6__1__Impl rule__MeasurementData__Group_6__2
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6__1__Impl_in_rule__MeasurementData__Group_6__15428);
            rule__MeasurementData__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_6__2_in_rule__MeasurementData__Group_6__15431);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2703:1: rule__MeasurementData__Group_6__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_1 ) ) ;
    public final void rule__MeasurementData__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2707:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2708:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2708:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2709:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2710:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2710:2: rule__MeasurementData__AdjustmentsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__MeasurementData__AdjustmentsAssignment_6_1_in_rule__MeasurementData__Group_6__1__Impl5458);
            rule__MeasurementData__AdjustmentsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_1()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2720:1: rule__MeasurementData__Group_6__2 : rule__MeasurementData__Group_6__2__Impl ;
    public final void rule__MeasurementData__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2724:1: ( rule__MeasurementData__Group_6__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2725:2: rule__MeasurementData__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6__2__Impl_in_rule__MeasurementData__Group_6__25488);
            rule__MeasurementData__Group_6__2__Impl();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2731:1: rule__MeasurementData__Group_6__2__Impl : ( ( rule__MeasurementData__Group_6_2__0 )* ) ;
    public final void rule__MeasurementData__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2735:1: ( ( ( rule__MeasurementData__Group_6_2__0 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2736:1: ( ( rule__MeasurementData__Group_6_2__0 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2736:1: ( ( rule__MeasurementData__Group_6_2__0 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2737:1: ( rule__MeasurementData__Group_6_2__0 )*
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_6_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2738:1: ( rule__MeasurementData__Group_6_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2738:2: rule__MeasurementData__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MeasurementData__Group_6_2__0_in_rule__MeasurementData__Group_6__2__Impl5515);
            	    rule__MeasurementData__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMeasurementDataAccess().getGroup_6_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__MeasurementData__Group_6_2__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2754:1: rule__MeasurementData__Group_6_2__0 : rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 ;
    public final void rule__MeasurementData__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2758:1: ( rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2759:2: rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6_2__0__Impl_in_rule__MeasurementData__Group_6_2__05552);
            rule__MeasurementData__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_6_2__1_in_rule__MeasurementData__Group_6_2__05555);
            rule__MeasurementData__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__0"


    // $ANTLR start "rule__MeasurementData__Group_6_2__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2766:1: rule__MeasurementData__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2770:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2771:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2771:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2772:1: ','
            {
             before(grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_2_0()); 
            match(input,34,FOLLOW_34_in_rule__MeasurementData__Group_6_2__0__Impl5583); 
             after(grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_2__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2785:1: rule__MeasurementData__Group_6_2__1 : rule__MeasurementData__Group_6_2__1__Impl ;
    public final void rule__MeasurementData__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2789:1: ( rule__MeasurementData__Group_6_2__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2790:2: rule__MeasurementData__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6_2__1__Impl_in_rule__MeasurementData__Group_6_2__15614);
            rule__MeasurementData__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__1"


    // $ANTLR start "rule__MeasurementData__Group_6_2__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2796:1: rule__MeasurementData__Group_6_2__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) ;
    public final void rule__MeasurementData__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2800:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2801:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2801:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2802:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2803:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2803:2: rule__MeasurementData__AdjustmentsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__MeasurementData__AdjustmentsAssignment_6_2_1_in_rule__MeasurementData__Group_6_2__1__Impl5641);
            rule__MeasurementData__AdjustmentsAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2817:1: rule__NonMeasurementData__Group__0 : rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 ;
    public final void rule__NonMeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2821:1: ( rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2822:2: rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__0__Impl_in_rule__NonMeasurementData__Group__05675);
            rule__NonMeasurementData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__1_in_rule__NonMeasurementData__Group__05678);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2829:1: rule__NonMeasurementData__Group__0__Impl : ( ( rule__NonMeasurementData__NameAssignment_0 ) ) ;
    public final void rule__NonMeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2833:1: ( ( ( rule__NonMeasurementData__NameAssignment_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2834:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2834:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2835:1: ( rule__NonMeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameAssignment_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2836:1: ( rule__NonMeasurementData__NameAssignment_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2836:2: rule__NonMeasurementData__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__NameAssignment_0_in_rule__NonMeasurementData__Group__0__Impl5705);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2846:1: rule__NonMeasurementData__Group__1 : rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 ;
    public final void rule__NonMeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2850:1: ( rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2851:2: rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__1__Impl_in_rule__NonMeasurementData__Group__15735);
            rule__NonMeasurementData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__2_in_rule__NonMeasurementData__Group__15738);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2858:1: rule__NonMeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__NonMeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2862:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2863:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2863:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2864:1: 'as'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAsKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__NonMeasurementData__Group__1__Impl5766); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2877:1: rule__NonMeasurementData__Group__2 : rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 ;
    public final void rule__NonMeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2881:1: ( rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2882:2: rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__2__Impl_in_rule__NonMeasurementData__Group__25797);
            rule__NonMeasurementData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__3_in_rule__NonMeasurementData__Group__25800);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2889:1: rule__NonMeasurementData__Group__2__Impl : ( ( rule__NonMeasurementData__DataTypeAssignment_2 ) ) ;
    public final void rule__NonMeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2893:1: ( ( ( rule__NonMeasurementData__DataTypeAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2894:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2894:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2895:1: ( rule__NonMeasurementData__DataTypeAssignment_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2896:1: ( rule__NonMeasurementData__DataTypeAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2896:2: rule__NonMeasurementData__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__DataTypeAssignment_2_in_rule__NonMeasurementData__Group__2__Impl5827);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2906:1: rule__NonMeasurementData__Group__3 : rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 ;
    public final void rule__NonMeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2910:1: ( rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2911:2: rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__3__Impl_in_rule__NonMeasurementData__Group__35857);
            rule__NonMeasurementData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__4_in_rule__NonMeasurementData__Group__35860);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2918:1: rule__NonMeasurementData__Group__3__Impl : ( ( rule__NonMeasurementData__ConstantAssignment_3 )? ) ;
    public final void rule__NonMeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2922:1: ( ( ( rule__NonMeasurementData__ConstantAssignment_3 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2923:1: ( ( rule__NonMeasurementData__ConstantAssignment_3 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2923:1: ( ( rule__NonMeasurementData__ConstantAssignment_3 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2924:1: ( rule__NonMeasurementData__ConstantAssignment_3 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2925:1: ( rule__NonMeasurementData__ConstantAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==55) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2925:2: rule__NonMeasurementData__ConstantAssignment_3
                    {
                    pushFollow(FOLLOW_rule__NonMeasurementData__ConstantAssignment_3_in_rule__NonMeasurementData__Group__3__Impl5887);
                    rule__NonMeasurementData__ConstantAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getConstantAssignment_3()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2935:1: rule__NonMeasurementData__Group__4 : rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 ;
    public final void rule__NonMeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2939:1: ( rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2940:2: rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__4__Impl_in_rule__NonMeasurementData__Group__45918);
            rule__NonMeasurementData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__5_in_rule__NonMeasurementData__Group__45921);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2947:1: rule__NonMeasurementData__Group__4__Impl : ( ( rule__NonMeasurementData__Group_4__0 )? ) ;
    public final void rule__NonMeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2951:1: ( ( ( rule__NonMeasurementData__Group_4__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2952:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2952:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2953:1: ( rule__NonMeasurementData__Group_4__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2954:1: ( rule__NonMeasurementData__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2954:2: rule__NonMeasurementData__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__NonMeasurementData__Group_4__0_in_rule__NonMeasurementData__Group__4__Impl5948);
                    rule__NonMeasurementData__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getGroup_4()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2964:1: rule__NonMeasurementData__Group__5 : rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 ;
    public final void rule__NonMeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2968:1: ( rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2969:2: rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__5__Impl_in_rule__NonMeasurementData__Group__55979);
            rule__NonMeasurementData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__6_in_rule__NonMeasurementData__Group__55982);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2976:1: rule__NonMeasurementData__Group__5__Impl : ( ( rule__NonMeasurementData__Group_5__0 )? ) ;
    public final void rule__NonMeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2980:1: ( ( ( rule__NonMeasurementData__Group_5__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2981:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2981:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2982:1: ( rule__NonMeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2983:1: ( rule__NonMeasurementData__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2983:2: rule__NonMeasurementData__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__NonMeasurementData__Group_5__0_in_rule__NonMeasurementData__Group__5__Impl6009);
                    rule__NonMeasurementData__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getGroup_5()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2993:1: rule__NonMeasurementData__Group__6 : rule__NonMeasurementData__Group__6__Impl ;
    public final void rule__NonMeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2997:1: ( rule__NonMeasurementData__Group__6__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2998:2: rule__NonMeasurementData__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__6__Impl_in_rule__NonMeasurementData__Group__66040);
            rule__NonMeasurementData__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3004:1: rule__NonMeasurementData__Group__6__Impl : ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? ) ;
    public final void rule__NonMeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3008:1: ( ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3009:1: ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3009:1: ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3010:1: ( rule__NonMeasurementData__DescriptionAssignment_6 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3011:1: ( rule__NonMeasurementData__DescriptionAssignment_6 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_DESCRIPTION) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3011:2: rule__NonMeasurementData__DescriptionAssignment_6
                    {
                    pushFollow(FOLLOW_rule__NonMeasurementData__DescriptionAssignment_6_in_rule__NonMeasurementData__Group__6__Impl6067);
                    rule__NonMeasurementData__DescriptionAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getDescriptionAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__NonMeasurementData__Group_4__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3035:1: rule__NonMeasurementData__Group_4__0 : rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 ;
    public final void rule__NonMeasurementData__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3039:1: ( rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3040:2: rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_4__0__Impl_in_rule__NonMeasurementData__Group_4__06112);
            rule__NonMeasurementData__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group_4__1_in_rule__NonMeasurementData__Group_4__06115);
            rule__NonMeasurementData__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_4__0"


    // $ANTLR start "rule__NonMeasurementData__Group_4__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3047:1: rule__NonMeasurementData__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__NonMeasurementData__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3051:1: ( ( 'value' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3052:1: ( 'value' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3052:1: ( 'value' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3053:1: 'value'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_4_0()); 
            match(input,44,FOLLOW_44_in_rule__NonMeasurementData__Group_4__0__Impl6143); 
             after(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_4__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_4__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3066:1: rule__NonMeasurementData__Group_4__1 : rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 ;
    public final void rule__NonMeasurementData__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3070:1: ( rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3071:2: rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_4__1__Impl_in_rule__NonMeasurementData__Group_4__16174);
            rule__NonMeasurementData__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group_4__2_in_rule__NonMeasurementData__Group_4__16177);
            rule__NonMeasurementData__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_4__1"


    // $ANTLR start "rule__NonMeasurementData__Group_4__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3078:1: rule__NonMeasurementData__Group_4__1__Impl : ( '=' ) ;
    public final void rule__NonMeasurementData__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3082:1: ( ( '=' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3083:1: ( '=' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3083:1: ( '=' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3084:1: '='
            {
             before(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4_1()); 
            match(input,45,FOLLOW_45_in_rule__NonMeasurementData__Group_4__1__Impl6205); 
             after(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_4__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_4__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3097:1: rule__NonMeasurementData__Group_4__2 : rule__NonMeasurementData__Group_4__2__Impl ;
    public final void rule__NonMeasurementData__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3101:1: ( rule__NonMeasurementData__Group_4__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3102:2: rule__NonMeasurementData__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_4__2__Impl_in_rule__NonMeasurementData__Group_4__26236);
            rule__NonMeasurementData__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_4__2"


    // $ANTLR start "rule__NonMeasurementData__Group_4__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3108:1: rule__NonMeasurementData__Group_4__2__Impl : ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) ) ;
    public final void rule__NonMeasurementData__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3112:1: ( ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3113:1: ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3113:1: ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3114:1: ( rule__NonMeasurementData__ValueAssignment_4_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_4_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3115:1: ( rule__NonMeasurementData__ValueAssignment_4_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3115:2: rule__NonMeasurementData__ValueAssignment_4_2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__ValueAssignment_4_2_in_rule__NonMeasurementData__Group_4__2__Impl6263);
            rule__NonMeasurementData__ValueAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_4__2__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_5__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3131:1: rule__NonMeasurementData__Group_5__0 : rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 ;
    public final void rule__NonMeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3135:1: ( rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3136:2: rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_5__0__Impl_in_rule__NonMeasurementData__Group_5__06299);
            rule__NonMeasurementData__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group_5__1_in_rule__NonMeasurementData__Group_5__06302);
            rule__NonMeasurementData__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5__0"


    // $ANTLR start "rule__NonMeasurementData__Group_5__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3143:1: rule__NonMeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__NonMeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3147:1: ( ( 'with identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3148:1: ( 'with identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3148:1: ( 'with identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3149:1: 'with identifier'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getWithIdentifierKeyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__NonMeasurementData__Group_5__0__Impl6330); 
             after(grammarAccess.getNonMeasurementDataAccess().getWithIdentifierKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_5__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3162:1: rule__NonMeasurementData__Group_5__1 : rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2 ;
    public final void rule__NonMeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3166:1: ( rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3167:2: rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_5__1__Impl_in_rule__NonMeasurementData__Group_5__16361);
            rule__NonMeasurementData__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group_5__2_in_rule__NonMeasurementData__Group_5__16364);
            rule__NonMeasurementData__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5__1"


    // $ANTLR start "rule__NonMeasurementData__Group_5__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3174:1: rule__NonMeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__NonMeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3178:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3179:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3179:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3180:1: ':'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getColonKeyword_5_1()); 
            match(input,32,FOLLOW_32_in_rule__NonMeasurementData__Group_5__1__Impl6392); 
             after(grammarAccess.getNonMeasurementDataAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_5__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3193:1: rule__NonMeasurementData__Group_5__2 : rule__NonMeasurementData__Group_5__2__Impl ;
    public final void rule__NonMeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3197:1: ( rule__NonMeasurementData__Group_5__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3198:2: rule__NonMeasurementData__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_5__2__Impl_in_rule__NonMeasurementData__Group_5__26423);
            rule__NonMeasurementData__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5__2"


    // $ANTLR start "rule__NonMeasurementData__Group_5__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3204:1: rule__NonMeasurementData__Group_5__2__Impl : ( ( rule__NonMeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__NonMeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3208:1: ( ( ( rule__NonMeasurementData__IDAssignment_5_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3209:1: ( ( rule__NonMeasurementData__IDAssignment_5_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3209:1: ( ( rule__NonMeasurementData__IDAssignment_5_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3210:1: ( rule__NonMeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDAssignment_5_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3211:1: ( rule__NonMeasurementData__IDAssignment_5_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3211:2: rule__NonMeasurementData__IDAssignment_5_2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__IDAssignment_5_2_in_rule__NonMeasurementData__Group_5__2__Impl6450);
            rule__NonMeasurementData__IDAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getIDAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5__2__Impl"


    // $ANTLR start "rule__DataRange__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3227:1: rule__DataRange__Group__0 : rule__DataRange__Group__0__Impl rule__DataRange__Group__1 ;
    public final void rule__DataRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3231:1: ( rule__DataRange__Group__0__Impl rule__DataRange__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3232:2: rule__DataRange__Group__0__Impl rule__DataRange__Group__1
            {
            pushFollow(FOLLOW_rule__DataRange__Group__0__Impl_in_rule__DataRange__Group__06486);
            rule__DataRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group__1_in_rule__DataRange__Group__06489);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3239:1: rule__DataRange__Group__0__Impl : ( 'with range' ) ;
    public final void rule__DataRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3243:1: ( ( 'with range' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3244:1: ( 'with range' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3244:1: ( 'with range' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3245:1: 'with range'
            {
             before(grammarAccess.getDataRangeAccess().getWithRangeKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__DataRange__Group__0__Impl6517); 
             after(grammarAccess.getDataRangeAccess().getWithRangeKeyword_0()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3258:1: rule__DataRange__Group__1 : rule__DataRange__Group__1__Impl ;
    public final void rule__DataRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3262:1: ( rule__DataRange__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3263:2: rule__DataRange__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataRange__Group__1__Impl_in_rule__DataRange__Group__16548);
            rule__DataRange__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3269:1: rule__DataRange__Group__1__Impl : ( ( rule__DataRange__RangeAssignment_1 ) ) ;
    public final void rule__DataRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3273:1: ( ( ( rule__DataRange__RangeAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3274:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3274:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3275:1: ( rule__DataRange__RangeAssignment_1 )
            {
             before(grammarAccess.getDataRangeAccess().getRangeAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3276:1: ( rule__DataRange__RangeAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3276:2: rule__DataRange__RangeAssignment_1
            {
            pushFollow(FOLLOW_rule__DataRange__RangeAssignment_1_in_rule__DataRange__Group__1__Impl6575);
            rule__DataRange__RangeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataRangeAccess().getRangeAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Interval__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3290:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3294:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3295:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
            {
            pushFollow(FOLLOW_rule__Interval__Group__0__Impl_in_rule__Interval__Group__06609);
            rule__Interval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group__1_in_rule__Interval__Group__06612);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3302:1: rule__Interval__Group__0__Impl : ( '[' ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3306:1: ( ( '[' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3307:1: ( '[' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3307:1: ( '[' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3308:1: '['
            {
             before(grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Interval__Group__0__Impl6640); 
             after(grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3321:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3325:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3326:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FOLLOW_rule__Interval__Group__1__Impl_in_rule__Interval__Group__16671);
            rule__Interval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group__2_in_rule__Interval__Group__16674);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3333:1: rule__Interval__Group__1__Impl : ( ( rule__Interval__LowerBoundAssignment_1 ) ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3337:1: ( ( ( rule__Interval__LowerBoundAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3338:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3338:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3339:1: ( rule__Interval__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3340:1: ( rule__Interval__LowerBoundAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3340:2: rule__Interval__LowerBoundAssignment_1
            {
            pushFollow(FOLLOW_rule__Interval__LowerBoundAssignment_1_in_rule__Interval__Group__1__Impl6701);
            rule__Interval__LowerBoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getLowerBoundAssignment_1()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3350:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl rule__Interval__Group__3 ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3354:1: ( rule__Interval__Group__2__Impl rule__Interval__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3355:2: rule__Interval__Group__2__Impl rule__Interval__Group__3
            {
            pushFollow(FOLLOW_rule__Interval__Group__2__Impl_in_rule__Interval__Group__26731);
            rule__Interval__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group__3_in_rule__Interval__Group__26734);
            rule__Interval__Group__3();

            state._fsp--;


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3362:1: rule__Interval__Group__2__Impl : ( ';' ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3366:1: ( ( ';' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3367:1: ( ';' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3367:1: ( ';' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3368:1: ';'
            {
             before(grammarAccess.getIntervalAccess().getSemicolonKeyword_2()); 
            match(input,48,FOLLOW_48_in_rule__Interval__Group__2__Impl6762); 
             after(grammarAccess.getIntervalAccess().getSemicolonKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Interval__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3381:1: rule__Interval__Group__3 : rule__Interval__Group__3__Impl rule__Interval__Group__4 ;
    public final void rule__Interval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3385:1: ( rule__Interval__Group__3__Impl rule__Interval__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3386:2: rule__Interval__Group__3__Impl rule__Interval__Group__4
            {
            pushFollow(FOLLOW_rule__Interval__Group__3__Impl_in_rule__Interval__Group__36793);
            rule__Interval__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group__4_in_rule__Interval__Group__36796);
            rule__Interval__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__3"


    // $ANTLR start "rule__Interval__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3393:1: rule__Interval__Group__3__Impl : ( ( rule__Interval__UpperBoundAssignment_3 ) ) ;
    public final void rule__Interval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3397:1: ( ( ( rule__Interval__UpperBoundAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3398:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3398:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3399:1: ( rule__Interval__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3400:1: ( rule__Interval__UpperBoundAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3400:2: rule__Interval__UpperBoundAssignment_3
            {
            pushFollow(FOLLOW_rule__Interval__UpperBoundAssignment_3_in_rule__Interval__Group__3__Impl6823);
            rule__Interval__UpperBoundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getUpperBoundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__3__Impl"


    // $ANTLR start "rule__Interval__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3410:1: rule__Interval__Group__4 : rule__Interval__Group__4__Impl ;
    public final void rule__Interval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3414:1: ( rule__Interval__Group__4__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3415:2: rule__Interval__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Interval__Group__4__Impl_in_rule__Interval__Group__46853);
            rule__Interval__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__4"


    // $ANTLR start "rule__Interval__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3421:1: rule__Interval__Group__4__Impl : ( ']' ) ;
    public final void rule__Interval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3425:1: ( ( ']' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3426:1: ( ']' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3426:1: ( ']' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3427:1: ']'
            {
             before(grammarAccess.getIntervalAccess().getRightSquareBracketKeyword_4()); 
            match(input,49,FOLLOW_49_in_rule__Interval__Group__4__Impl6881); 
             after(grammarAccess.getIntervalAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__4__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3450:1: rule__LinearDataConversion__Group__0 : rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 ;
    public final void rule__LinearDataConversion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3454:1: ( rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3455:2: rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group__0__Impl_in_rule__LinearDataConversion__Group__06922);
            rule__LinearDataConversion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group__1_in_rule__LinearDataConversion__Group__06925);
            rule__LinearDataConversion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__0"


    // $ANTLR start "rule__LinearDataConversion__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3462:1: rule__LinearDataConversion__Group__0__Impl : ( 'with scaling factor' ) ;
    public final void rule__LinearDataConversion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3466:1: ( ( 'with scaling factor' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3467:1: ( 'with scaling factor' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3467:1: ( 'with scaling factor' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3468:1: 'with scaling factor'
            {
             before(grammarAccess.getLinearDataConversionAccess().getWithScalingFactorKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__LinearDataConversion__Group__0__Impl6953); 
             after(grammarAccess.getLinearDataConversionAccess().getWithScalingFactorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__0__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3481:1: rule__LinearDataConversion__Group__1 : rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 ;
    public final void rule__LinearDataConversion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3485:1: ( rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3486:2: rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group__1__Impl_in_rule__LinearDataConversion__Group__16984);
            rule__LinearDataConversion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group__2_in_rule__LinearDataConversion__Group__16987);
            rule__LinearDataConversion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__1"


    // $ANTLR start "rule__LinearDataConversion__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3493:1: rule__LinearDataConversion__Group__1__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3497:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3498:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3498:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3499:1: ':'
            {
             before(grammarAccess.getLinearDataConversionAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__LinearDataConversion__Group__1__Impl7015); 
             after(grammarAccess.getLinearDataConversionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__1__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3512:1: rule__LinearDataConversion__Group__2 : rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 ;
    public final void rule__LinearDataConversion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3516:1: ( rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3517:2: rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group__2__Impl_in_rule__LinearDataConversion__Group__27046);
            rule__LinearDataConversion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group__3_in_rule__LinearDataConversion__Group__27049);
            rule__LinearDataConversion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__2"


    // $ANTLR start "rule__LinearDataConversion__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3524:1: rule__LinearDataConversion__Group__2__Impl : ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) ;
    public final void rule__LinearDataConversion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3528:1: ( ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3529:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3529:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3530:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3531:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3531:2: rule__LinearDataConversion__ScalingFactorAssignment_2
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__ScalingFactorAssignment_2_in_rule__LinearDataConversion__Group__2__Impl7076);
            rule__LinearDataConversion__ScalingFactorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionAccess().getScalingFactorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__2__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3541:1: rule__LinearDataConversion__Group__3 : rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 ;
    public final void rule__LinearDataConversion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3545:1: ( rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3546:2: rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group__3__Impl_in_rule__LinearDataConversion__Group__37106);
            rule__LinearDataConversion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group__4_in_rule__LinearDataConversion__Group__37109);
            rule__LinearDataConversion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__3"


    // $ANTLR start "rule__LinearDataConversion__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3553:1: rule__LinearDataConversion__Group__3__Impl : ( 'and offset' ) ;
    public final void rule__LinearDataConversion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3557:1: ( ( 'and offset' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3558:1: ( 'and offset' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3558:1: ( 'and offset' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3559:1: 'and offset'
            {
             before(grammarAccess.getLinearDataConversionAccess().getAndOffsetKeyword_3()); 
            match(input,51,FOLLOW_51_in_rule__LinearDataConversion__Group__3__Impl7137); 
             after(grammarAccess.getLinearDataConversionAccess().getAndOffsetKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__3__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3572:1: rule__LinearDataConversion__Group__4 : rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 ;
    public final void rule__LinearDataConversion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3576:1: ( rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3577:2: rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group__4__Impl_in_rule__LinearDataConversion__Group__47168);
            rule__LinearDataConversion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group__5_in_rule__LinearDataConversion__Group__47171);
            rule__LinearDataConversion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__4"


    // $ANTLR start "rule__LinearDataConversion__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3584:1: rule__LinearDataConversion__Group__4__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3588:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3589:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3589:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3590:1: ':'
            {
             before(grammarAccess.getLinearDataConversionAccess().getColonKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__LinearDataConversion__Group__4__Impl7199); 
             after(grammarAccess.getLinearDataConversionAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__4__Impl"


    // $ANTLR start "rule__LinearDataConversion__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3603:1: rule__LinearDataConversion__Group__5 : rule__LinearDataConversion__Group__5__Impl ;
    public final void rule__LinearDataConversion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3607:1: ( rule__LinearDataConversion__Group__5__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3608:2: rule__LinearDataConversion__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group__5__Impl_in_rule__LinearDataConversion__Group__57230);
            rule__LinearDataConversion__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__5"


    // $ANTLR start "rule__LinearDataConversion__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3614:1: rule__LinearDataConversion__Group__5__Impl : ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) ;
    public final void rule__LinearDataConversion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3618:1: ( ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3619:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3619:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3620:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3621:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3621:2: rule__LinearDataConversion__OffsetAssignment_5
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__OffsetAssignment_5_in_rule__LinearDataConversion__Group__5__Impl7257);
            rule__LinearDataConversion__OffsetAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionAccess().getOffsetAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__Group__5__Impl"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3643:1: rule__LinearDataConversionWithInterval__Group__0 : rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 ;
    public final void rule__LinearDataConversionWithInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3647:1: ( rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3648:2: rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1
            {
            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__0__Impl_in_rule__LinearDataConversionWithInterval__Group__07299);
            rule__LinearDataConversionWithInterval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__1_in_rule__LinearDataConversionWithInterval__Group__07302);
            rule__LinearDataConversionWithInterval__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__0"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3655:1: rule__LinearDataConversionWithInterval__Group__0__Impl : ( 'by linear mapping' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3659:1: ( ( 'by linear mapping' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3660:1: ( 'by linear mapping' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3660:1: ( 'by linear mapping' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3661:1: 'by linear mapping'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getByLinearMappingKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__LinearDataConversionWithInterval__Group__0__Impl7330); 
             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getByLinearMappingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__0__Impl"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3674:1: rule__LinearDataConversionWithInterval__Group__1 : rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 ;
    public final void rule__LinearDataConversionWithInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3678:1: ( rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3679:2: rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2
            {
            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__1__Impl_in_rule__LinearDataConversionWithInterval__Group__17361);
            rule__LinearDataConversionWithInterval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__2_in_rule__LinearDataConversionWithInterval__Group__17364);
            rule__LinearDataConversionWithInterval__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__1"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3686:1: rule__LinearDataConversionWithInterval__Group__1__Impl : ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3690:1: ( ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3691:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3691:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3692:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3693:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3693:2: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1
            {
            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__FromIntervalAssignment_1_in_rule__LinearDataConversionWithInterval__Group__1__Impl7391);
            rule__LinearDataConversionWithInterval__FromIntervalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__1__Impl"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3703:1: rule__LinearDataConversionWithInterval__Group__2 : rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 ;
    public final void rule__LinearDataConversionWithInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3707:1: ( rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3708:2: rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3
            {
            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__2__Impl_in_rule__LinearDataConversionWithInterval__Group__27421);
            rule__LinearDataConversionWithInterval__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__3_in_rule__LinearDataConversionWithInterval__Group__27424);
            rule__LinearDataConversionWithInterval__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__2"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3715:1: rule__LinearDataConversionWithInterval__Group__2__Impl : ( '=>' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3719:1: ( ( '=>' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3720:1: ( '=>' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3720:1: ( '=>' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3721:1: '=>'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,53,FOLLOW_53_in_rule__LinearDataConversionWithInterval__Group__2__Impl7452); 
             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getEqualsSignGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__2__Impl"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3734:1: rule__LinearDataConversionWithInterval__Group__3 : rule__LinearDataConversionWithInterval__Group__3__Impl ;
    public final void rule__LinearDataConversionWithInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3738:1: ( rule__LinearDataConversionWithInterval__Group__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3739:2: rule__LinearDataConversionWithInterval__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__3__Impl_in_rule__LinearDataConversionWithInterval__Group__37483);
            rule__LinearDataConversionWithInterval__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__3"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3745:1: rule__LinearDataConversionWithInterval__Group__3__Impl : ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3749:1: ( ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3750:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3750:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3751:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3752:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3752:2: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3
            {
            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__ToIntervalAssignment_3_in_rule__LinearDataConversionWithInterval__Group__3__Impl7510);
            rule__LinearDataConversionWithInterval__ToIntervalAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__3__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3770:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3774:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3775:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__07548);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__07551);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3782:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3786:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3787:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3787:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3788:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl7578); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3799:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3803:1: ( rule__DOUBLE__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3804:2: rule__DOUBLE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__17607);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3810:1: rule__DOUBLE__Group__1__Impl : ( ( rule__DOUBLE__Group_1__0 )? ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3814:1: ( ( ( rule__DOUBLE__Group_1__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3815:1: ( ( rule__DOUBLE__Group_1__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3815:1: ( ( rule__DOUBLE__Group_1__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3816:1: ( rule__DOUBLE__Group_1__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3817:1: ( rule__DOUBLE__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==54) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3817:2: rule__DOUBLE__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl7634);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3831:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3835:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3836:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__07669);
            rule__DOUBLE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__07672);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3843:1: rule__DOUBLE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3847:1: ( ( '.' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3848:1: ( '.' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3848:1: ( '.' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3849:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
            match(input,54,FOLLOW_54_in_rule__DOUBLE__Group_1__0__Impl7700); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3862:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3866:1: ( rule__DOUBLE__Group_1__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3867:2: rule__DOUBLE__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__17731);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3873:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3877:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3878:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3878:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3879:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl7758); 
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


    // $ANTLR start "rule__UNIT__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3894:1: rule__UNIT__Group__0 : rule__UNIT__Group__0__Impl rule__UNIT__Group__1 ;
    public final void rule__UNIT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3898:1: ( rule__UNIT__Group__0__Impl rule__UNIT__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3899:2: rule__UNIT__Group__0__Impl rule__UNIT__Group__1
            {
            pushFollow(FOLLOW_rule__UNIT__Group__0__Impl_in_rule__UNIT__Group__07791);
            rule__UNIT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UNIT__Group__1_in_rule__UNIT__Group__07794);
            rule__UNIT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__0"


    // $ANTLR start "rule__UNIT__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3906:1: rule__UNIT__Group__0__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3910:1: ( ( ( RULE_ID )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3911:1: ( ( RULE_ID )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3911:1: ( ( RULE_ID )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3912:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3913:1: ( RULE_ID )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==EOF||(LA25_2>=RULE_ID && LA25_2<=RULE_DESCRIPTION)||(LA25_2>=30 && LA25_2<=31)||LA25_2==43) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3913:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UNIT__Group__0__Impl7822); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getUNITAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__0__Impl"


    // $ANTLR start "rule__UNIT__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3923:1: rule__UNIT__Group__1 : rule__UNIT__Group__1__Impl ;
    public final void rule__UNIT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3927:1: ( rule__UNIT__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3928:2: rule__UNIT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UNIT__Group__1__Impl_in_rule__UNIT__Group__17853);
            rule__UNIT__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__1"


    // $ANTLR start "rule__UNIT__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3934:1: rule__UNIT__Group__1__Impl : ( ( rule__UNIT__Group_1__0 )* ) ;
    public final void rule__UNIT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3938:1: ( ( ( rule__UNIT__Group_1__0 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3939:1: ( ( rule__UNIT__Group_1__0 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3939:1: ( ( rule__UNIT__Group_1__0 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3940:1: ( rule__UNIT__Group_1__0 )*
            {
             before(grammarAccess.getUNITAccess().getGroup_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3941:1: ( rule__UNIT__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ANY_OTHER) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3941:2: rule__UNIT__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__UNIT__Group_1__0_in_rule__UNIT__Group__1__Impl7880);
            	    rule__UNIT__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getUNITAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group__1__Impl"


    // $ANTLR start "rule__UNIT__Group_1__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3955:1: rule__UNIT__Group_1__0 : rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 ;
    public final void rule__UNIT__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3959:1: ( rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3960:2: rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1
            {
            pushFollow(FOLLOW_rule__UNIT__Group_1__0__Impl_in_rule__UNIT__Group_1__07915);
            rule__UNIT__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UNIT__Group_1__1_in_rule__UNIT__Group_1__07918);
            rule__UNIT__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group_1__0"


    // $ANTLR start "rule__UNIT__Group_1__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3967:1: rule__UNIT__Group_1__0__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__UNIT__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3971:1: ( ( RULE_ANY_OTHER ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3972:1: ( RULE_ANY_OTHER )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3972:1: ( RULE_ANY_OTHER )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3973:1: RULE_ANY_OTHER
            {
             before(grammarAccess.getUNITAccess().getANY_OTHERTerminalRuleCall_1_0()); 
            match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__UNIT__Group_1__0__Impl7945); 
             after(grammarAccess.getUNITAccess().getANY_OTHERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group_1__0__Impl"


    // $ANTLR start "rule__UNIT__Group_1__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3984:1: rule__UNIT__Group_1__1 : rule__UNIT__Group_1__1__Impl ;
    public final void rule__UNIT__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3988:1: ( rule__UNIT__Group_1__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3989:2: rule__UNIT__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UNIT__Group_1__1__Impl_in_rule__UNIT__Group_1__17974);
            rule__UNIT__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group_1__1"


    // $ANTLR start "rule__UNIT__Group_1__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3995:1: rule__UNIT__Group_1__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3999:1: ( ( ( RULE_ID )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4000:1: ( ( RULE_ID )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4000:1: ( ( RULE_ID )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4001:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4002:1: ( RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==EOF||(LA27_2>=RULE_ID && LA27_2<=RULE_DESCRIPTION)||(LA27_2>=30 && LA27_2<=31)||LA27_2==43) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4002:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UNIT__Group_1__1__Impl8002); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNIT__Group_1__1__Impl"


    // $ANTLR start "rule__SensorInterface__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4017:1: rule__SensorInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4021:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4022:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4022:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4023:1: RULE_ID
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SensorInterface__NameAssignment_18042); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4032:1: rule__SensorInterface__DescriptionAssignment_2 : ( RULE_DESCRIPTION ) ;
    public final void rule__SensorInterface__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4036:1: ( ( RULE_DESCRIPTION ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4037:1: ( RULE_DESCRIPTION )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4037:1: ( RULE_DESCRIPTION )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4038:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionDESCRIPTIONTerminalRuleCall_2_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_rule__SensorInterface__DescriptionAssignment_28073); 
             after(grammarAccess.getSensorInterfaceAccess().getDescriptionDESCRIPTIONTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4047:1: rule__SensorInterface__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__SensorInterface__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4051:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4052:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4052:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4053:1: RULE_STRING
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SensorInterface__IDAssignment_3_28104); 
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


    // $ANTLR start "rule__SensorInterface__EncodingSettingsAssignment_5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4062:1: rule__SensorInterface__EncodingSettingsAssignment_5 : ( ruleEncodingSettings ) ;
    public final void rule__SensorInterface__EncodingSettingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4066:1: ( ( ruleEncodingSettings ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4067:1: ( ruleEncodingSettings )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4067:1: ( ruleEncodingSettings )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4068:1: ruleEncodingSettings
            {
             before(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsEncodingSettingsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEncodingSettings_in_rule__SensorInterface__EncodingSettingsAssignment_58135);
            ruleEncodingSettings();

            state._fsp--;

             after(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsEncodingSettingsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorInterface__EncodingSettingsAssignment_5"


    // $ANTLR start "rule__SensorInterface__DataDescriptionAssignment_6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4077:1: rule__SensorInterface__DataDescriptionAssignment_6 : ( ruleSensorDataDescription ) ;
    public final void rule__SensorInterface__DataDescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4081:1: ( ( ruleSensorDataDescription ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4082:1: ( ruleSensorDataDescription )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4082:1: ( ruleSensorDataDescription )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4083:1: ruleSensorDataDescription
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionSensorDataDescriptionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSensorDataDescription_in_rule__SensorInterface__DataDescriptionAssignment_68166);
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


    // $ANTLR start "rule__EncodingSettings__CodingAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4092:1: rule__EncodingSettings__CodingAssignment_2 : ( ruleCoding ) ;
    public final void rule__EncodingSettings__CodingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4096:1: ( ( ruleCoding ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4097:1: ( ruleCoding )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4097:1: ( ruleCoding )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4098:1: ruleCoding
            {
             before(grammarAccess.getEncodingSettingsAccess().getCodingCodingEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCoding_in_rule__EncodingSettings__CodingAssignment_28197);
            ruleCoding();

            state._fsp--;

             after(grammarAccess.getEncodingSettingsAccess().getCodingCodingEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__CodingAssignment_2"


    // $ANTLR start "rule__EncodingSettings__EndiannessAssignment_6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4107:1: rule__EncodingSettings__EndiannessAssignment_6 : ( ruleEndianness ) ;
    public final void rule__EncodingSettings__EndiannessAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4111:1: ( ( ruleEndianness ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4112:1: ( ruleEndianness )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4112:1: ( ruleEndianness )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4113:1: ruleEndianness
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessEndiannessEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEndianness_in_rule__EncodingSettings__EndiannessAssignment_68228);
            ruleEndianness();

            state._fsp--;

             after(grammarAccess.getEncodingSettingsAccess().getEndiannessEndiannessEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__EndiannessAssignment_6"


    // $ANTLR start "rule__EncodingSettings__AlignmentAssignment_10"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4122:1: rule__EncodingSettings__AlignmentAssignment_10 : ( RULE_INT ) ;
    public final void rule__EncodingSettings__AlignmentAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4126:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4127:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4127:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4128:1: RULE_INT
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EncodingSettings__AlignmentAssignment_108259); 
             after(grammarAccess.getEncodingSettingsAccess().getAlignmentINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__AlignmentAssignment_10"


    // $ANTLR start "rule__EncodingSettings__IDAssignment_12_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4137:1: rule__EncodingSettings__IDAssignment_12_2 : ( RULE_STRING ) ;
    public final void rule__EncodingSettings__IDAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4141:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4142:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4142:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4143:1: RULE_STRING
            {
             before(grammarAccess.getEncodingSettingsAccess().getIDSTRINGTerminalRuleCall_12_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EncodingSettings__IDAssignment_12_28290); 
             after(grammarAccess.getEncodingSettingsAccess().getIDSTRINGTerminalRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EncodingSettings__IDAssignment_12_2"


    // $ANTLR start "rule__SensorDataDescription__IDAssignment_2_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4152:1: rule__SensorDataDescription__IDAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__SensorDataDescription__IDAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4156:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4157:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4157:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4158:1: RULE_STRING
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SensorDataDescription__IDAssignment_2_28321); 
             after(grammarAccess.getSensorDataDescriptionAccess().getIDSTRINGTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__IDAssignment_2_2"


    // $ANTLR start "rule__SensorDataDescription__DataSetsAssignment_4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4167:1: rule__SensorDataDescription__DataSetsAssignment_4 : ( ruleDataSet ) ;
    public final void rule__SensorDataDescription__DataSetsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4171:1: ( ( ruleDataSet ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4172:1: ( ruleDataSet )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4172:1: ( ruleDataSet )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4173:1: ruleDataSet
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsDataSetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDataSet_in_rule__SensorDataDescription__DataSetsAssignment_48352);
            ruleDataSet();

            state._fsp--;

             after(grammarAccess.getSensorDataDescriptionAccess().getDataSetsDataSetParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDataDescription__DataSetsAssignment_4"


    // $ANTLR start "rule__DataSet__NameAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4182:1: rule__DataSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4186:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4187:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4187:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4188:1: RULE_ID
            {
             before(grammarAccess.getDataSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataSet__NameAssignment_18383); 
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


    // $ANTLR start "rule__DataSet__ParentDataSetAssignment_2_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4197:1: rule__DataSet__ParentDataSetAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__ParentDataSetAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4201:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4202:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4202:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4203:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_2_1_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4204:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4205:1: RULE_ID
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataSet__ParentDataSetAssignment_2_18418); 
             after(grammarAccess.getDataSetAccess().getParentDataSetDataSetIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__ParentDataSetAssignment_2_1"


    // $ANTLR start "rule__DataSet__IDAssignment_3_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4216:1: rule__DataSet__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__DataSet__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4220:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4221:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4221:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4222:1: RULE_STRING
            {
             before(grammarAccess.getDataSetAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataSet__IDAssignment_3_28453); 
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


    // $ANTLR start "rule__DataSet__DescriptionAssignment_4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4231:1: rule__DataSet__DescriptionAssignment_4 : ( RULE_DESCRIPTION ) ;
    public final void rule__DataSet__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4235:1: ( ( RULE_DESCRIPTION ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4236:1: ( RULE_DESCRIPTION )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4236:1: ( RULE_DESCRIPTION )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4237:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getDataSetAccess().getDescriptionDESCRIPTIONTerminalRuleCall_4_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_rule__DataSet__DescriptionAssignment_48484); 
             after(grammarAccess.getDataSetAccess().getDescriptionDESCRIPTIONTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__DescriptionAssignment_4"


    // $ANTLR start "rule__DataSet__DataAssignment_6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4246:1: rule__DataSet__DataAssignment_6 : ( ruleData ) ;
    public final void rule__DataSet__DataAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4250:1: ( ( ruleData ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4251:1: ( ruleData )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4251:1: ( ruleData )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4252:1: ruleData
            {
             before(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__DataSet__DataAssignment_68515);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4261:1: rule__MeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4265:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4266:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4266:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4267:1: RULE_ID
            {
             before(grammarAccess.getMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MeasurementData__NameAssignment_08546); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4276:1: rule__MeasurementData__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__MeasurementData__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4280:1: ( ( ruleDataType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4281:1: ( ruleDataType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4281:1: ( ruleDataType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4282:1: ruleDataType
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__MeasurementData__DataTypeAssignment_28577);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4291:1: rule__MeasurementData__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementData__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4295:1: ( ( ruleUNIT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4296:1: ( ruleUNIT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4296:1: ( ruleUNIT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4297:1: ruleUNIT
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitUNITParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleUNIT_in_rule__MeasurementData__UnitAssignment_48608);
            ruleUNIT();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getUnitUNITParserRuleCall_4_0()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4306:1: rule__MeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4310:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4311:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4311:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4312:1: RULE_STRING
            {
             before(grammarAccess.getMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MeasurementData__IDAssignment_5_28639); 
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


    // $ANTLR start "rule__MeasurementData__AdjustmentsAssignment_6_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4321:1: rule__MeasurementData__AdjustmentsAssignment_6_1 : ( ruleDataAdjustment ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4325:1: ( ( ruleDataAdjustment ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4326:1: ( ruleDataAdjustment )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4326:1: ( ruleDataAdjustment )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4327:1: ruleDataAdjustment
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustmentParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleDataAdjustment_in_rule__MeasurementData__AdjustmentsAssignment_6_18670);
            ruleDataAdjustment();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustmentParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__AdjustmentsAssignment_6_1"


    // $ANTLR start "rule__MeasurementData__AdjustmentsAssignment_6_2_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4336:1: rule__MeasurementData__AdjustmentsAssignment_6_2_1 : ( ruleDataAdjustment ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4340:1: ( ( ruleDataAdjustment ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4341:1: ( ruleDataAdjustment )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4341:1: ( ruleDataAdjustment )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4342:1: ruleDataAdjustment
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustmentParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_ruleDataAdjustment_in_rule__MeasurementData__AdjustmentsAssignment_6_2_18701);
            ruleDataAdjustment();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustmentParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__AdjustmentsAssignment_6_2_1"


    // $ANTLR start "rule__MeasurementData__DescriptionAssignment_7"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4351:1: rule__MeasurementData__DescriptionAssignment_7 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementData__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4355:1: ( ( RULE_DESCRIPTION ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4356:1: ( RULE_DESCRIPTION )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4356:1: ( RULE_DESCRIPTION )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4357:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_7_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_rule__MeasurementData__DescriptionAssignment_78732); 
             after(grammarAccess.getMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_7_0()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4366:1: rule__NonMeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NonMeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4370:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4371:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4371:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4372:1: RULE_ID
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NonMeasurementData__NameAssignment_08763); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4381:1: rule__NonMeasurementData__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4385:1: ( ( ruleDataType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4386:1: ( ruleDataType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4386:1: ( ruleDataType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4387:1: ruleDataType
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__NonMeasurementData__DataTypeAssignment_28794);
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


    // $ANTLR start "rule__NonMeasurementData__ConstantAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4396:1: rule__NonMeasurementData__ConstantAssignment_3 : ( ( 'constant' ) ) ;
    public final void rule__NonMeasurementData__ConstantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4400:1: ( ( ( 'constant' ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4401:1: ( ( 'constant' ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4401:1: ( ( 'constant' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4402:1: ( 'constant' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4403:1: ( 'constant' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4404:1: 'constant'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 
            match(input,55,FOLLOW_55_in_rule__NonMeasurementData__ConstantAssignment_38830); 
             after(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 

            }

             after(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ConstantAssignment_3"


    // $ANTLR start "rule__NonMeasurementData__ValueAssignment_4_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4419:1: rule__NonMeasurementData__ValueAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4423:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4424:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4424:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4425:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NonMeasurementData__ValueAssignment_4_28869); 
             after(grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ValueAssignment_4_2"


    // $ANTLR start "rule__NonMeasurementData__IDAssignment_5_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4434:1: rule__NonMeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4438:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4439:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4439:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4440:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NonMeasurementData__IDAssignment_5_28900); 
             after(grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__IDAssignment_5_2"


    // $ANTLR start "rule__NonMeasurementData__DescriptionAssignment_6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4449:1: rule__NonMeasurementData__DescriptionAssignment_6 : ( RULE_DESCRIPTION ) ;
    public final void rule__NonMeasurementData__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4453:1: ( ( RULE_DESCRIPTION ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4454:1: ( RULE_DESCRIPTION )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4454:1: ( RULE_DESCRIPTION )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4455:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_6_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_rule__NonMeasurementData__DescriptionAssignment_68931); 
             after(grammarAccess.getNonMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__DescriptionAssignment_6"


    // $ANTLR start "rule__DataRange__RangeAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4464:1: rule__DataRange__RangeAssignment_1 : ( ruleInterval ) ;
    public final void rule__DataRange__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4468:1: ( ( ruleInterval ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4469:1: ( ruleInterval )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4469:1: ( ruleInterval )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4470:1: ruleInterval
            {
             before(grammarAccess.getDataRangeAccess().getRangeIntervalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInterval_in_rule__DataRange__RangeAssignment_18962);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getDataRangeAccess().getRangeIntervalParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataRange__RangeAssignment_1"


    // $ANTLR start "rule__Interval__LowerBoundAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4479:1: rule__Interval__LowerBoundAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Interval__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4483:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4484:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4484:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4485:1: ruleDOUBLE
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Interval__LowerBoundAssignment_18993);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__LowerBoundAssignment_1"


    // $ANTLR start "rule__Interval__UpperBoundAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4494:1: rule__Interval__UpperBoundAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Interval__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4498:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4499:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4499:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4500:1: ruleDOUBLE
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Interval__UpperBoundAssignment_39024);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__UpperBoundAssignment_3"


    // $ANTLR start "rule__LinearDataConversion__ScalingFactorAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4509:1: rule__LinearDataConversion__ScalingFactorAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__ScalingFactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4513:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4514:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4514:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4515:1: ruleDOUBLE
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__LinearDataConversion__ScalingFactorAssignment_29055);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__ScalingFactorAssignment_2"


    // $ANTLR start "rule__LinearDataConversion__OffsetAssignment_5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4524:1: rule__LinearDataConversion__OffsetAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__OffsetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4528:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4529:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4529:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4530:1: ruleDOUBLE
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetDOUBLEParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__LinearDataConversion__OffsetAssignment_59086);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionAccess().getOffsetDOUBLEParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversion__OffsetAssignment_5"


    // $ANTLR start "rule__LinearDataConversionWithInterval__FromIntervalAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4539:1: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__FromIntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4543:1: ( ( ruleInterval ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4544:1: ( ruleInterval )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4544:1: ( ruleInterval )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4545:1: ruleInterval
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalIntervalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInterval_in_rule__LinearDataConversionWithInterval__FromIntervalAssignment_19117);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalIntervalParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__FromIntervalAssignment_1"


    // $ANTLR start "rule__LinearDataConversionWithInterval__ToIntervalAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4554:1: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__ToIntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4558:1: ( ( ruleInterval ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4559:1: ( ruleInterval )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4559:1: ( ruleInterval )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4560:1: ruleInterval
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalIntervalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInterval_in_rule__LinearDataConversionWithInterval__ToIntervalAssignment_39148);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalIntervalParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__ToIntervalAssignment_3"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\21\uffff";
    static final String DFA1_eofS =
        "\3\uffff\14\20\2\uffff";
    static final String DFA1_minS =
        "\1\5\1\51\1\20\14\5\2\uffff";
    static final String DFA1_maxS =
        "\1\5\1\51\1\33\14\67\2\uffff";
    static final String DFA1_acceptS =
        "\17\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\21\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\17\1\uffff\1\20"+
            "\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\17\1\uffff\1\20"+
            "\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\17\1\uffff\1\20"+
            "\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\17\1\uffff\1\20"+
            "\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\17\1\uffff\1\20"+
            "\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\17\1\uffff\1\20"+
            "\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\17\1\uffff\1\20"+
            "\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\17\1\uffff\1\20"+
            "\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\17\1\uffff\1\20"+
            "\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\17\1\uffff\1\20"+
            "\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\17\1\uffff\1\20"+
            "\12\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\17\1\uffff\1\20"+
            "\12\uffff\1\20",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "537:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleSensorInterface_in_entryRuleSensorInterface61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorInterface68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__0_in_ruleSensorInterface94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodingSettings_in_entryRuleEncodingSettings121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncodingSettings128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__0_in_ruleEncodingSettings154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorDataDescription_in_entryRuleSensorDataDescription181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorDataDescription188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__0_in_ruleSensorDataDescription214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSet_in_entryRuleDataSet241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSet248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__0_in_ruleDataSet274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Alternatives_in_ruleData334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementData_in_entryRuleMeasurementData361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementData368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__0_in_ruleMeasurementData394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasurementData_in_entryRuleNonMeasurementData421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonMeasurementData428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__0_in_ruleNonMeasurementData454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdjustment_in_entryRuleDataAdjustment481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAdjustment488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdjustment__Alternatives_in_ruleDataAdjustment514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_entryRuleDataRange541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataRange548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__0_in_ruleDataRange574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_entryRuleInterval601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterval608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__0_in_ruleInterval634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConversion_in_entryRuleDataConversion661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataConversion668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataConversion__Alternatives_in_ruleDataConversion694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversion_in_entryRuleLinearDataConversion721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinearDataConversion728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__0_in_ruleLinearDataConversion754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversionWithInterval_in_entryRuleLinearDataConversionWithInterval781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinearDataConversionWithInterval788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__0_in_ruleLinearDataConversionWithInterval814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNIT_in_entryRuleUNIT901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNIT908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group__0_in_ruleUNIT934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coding__Alternatives_in_ruleCoding971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Endianness__Alternatives_in_ruleEndianness1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementData_in_rule__Data__Alternatives1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasurementData_in_rule__Data__Alternatives1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_rule__DataAdjustment__Alternatives1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConversion_in_rule__DataAdjustment__Alternatives1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversion_in_rule__DataConversion__Alternatives1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversionWithInterval_in_rule__DataConversion__Alternatives1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Coding__Alternatives1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Coding__Alternatives1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Endianness__Alternatives1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Endianness__Alternatives1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DataType__Alternatives1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DataType__Alternatives1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DataType__Alternatives1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DataType__Alternatives1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DataType__Alternatives1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DataType__Alternatives1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DataType__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DataType__Alternatives1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DataType__Alternatives1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DataType__Alternatives1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DataType__Alternatives1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DataType__Alternatives1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__0__Impl_in_rule__SensorInterface__Group__01604 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__1_in_rule__SensorInterface__Group__01607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SensorInterface__Group__0__Impl1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__1__Impl_in_rule__SensorInterface__Group__11666 = new BitSet(new long[]{0x00000000A0000080L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__2_in_rule__SensorInterface__Group__11669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__NameAssignment_1_in_rule__SensorInterface__Group__1__Impl1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__2__Impl_in_rule__SensorInterface__Group__21726 = new BitSet(new long[]{0x00000000A0000080L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__3_in_rule__SensorInterface__Group__21729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__DescriptionAssignment_2_in_rule__SensorInterface__Group__2__Impl1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__3__Impl_in_rule__SensorInterface__Group__31787 = new BitSet(new long[]{0x00000000A0000080L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__4_in_rule__SensorInterface__Group__31790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__0_in_rule__SensorInterface__Group__3__Impl1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__4__Impl_in_rule__SensorInterface__Group__41848 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__5_in_rule__SensorInterface__Group__41851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SensorInterface__Group__4__Impl1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__5__Impl_in_rule__SensorInterface__Group__51910 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__6_in_rule__SensorInterface__Group__51913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__EncodingSettingsAssignment_5_in_rule__SensorInterface__Group__5__Impl1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__6__Impl_in_rule__SensorInterface__Group__61970 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__7_in_rule__SensorInterface__Group__61973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__DataDescriptionAssignment_6_in_rule__SensorInterface__Group__6__Impl2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__7__Impl_in_rule__SensorInterface__Group__72030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SensorInterface__Group__7__Impl2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__0__Impl_in_rule__SensorInterface__Group_3__02105 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__1_in_rule__SensorInterface__Group_3__02108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SensorInterface__Group_3__0__Impl2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__1__Impl_in_rule__SensorInterface__Group_3__12167 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__2_in_rule__SensorInterface__Group_3__12170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SensorInterface__Group_3__1__Impl2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__2__Impl_in_rule__SensorInterface__Group_3__22229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__IDAssignment_3_2_in_rule__SensorInterface__Group_3__2__Impl2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__0__Impl_in_rule__EncodingSettings__Group__02292 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__1_in_rule__EncodingSettings__Group__02295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EncodingSettings__Group__0__Impl2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__1__Impl_in_rule__EncodingSettings__Group__12354 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__2_in_rule__EncodingSettings__Group__12357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EncodingSettings__Group__1__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__2__Impl_in_rule__EncodingSettings__Group__22416 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__3_in_rule__EncodingSettings__Group__22419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__CodingAssignment_2_in_rule__EncodingSettings__Group__2__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__3__Impl_in_rule__EncodingSettings__Group__32476 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__4_in_rule__EncodingSettings__Group__32479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EncodingSettings__Group__3__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__4__Impl_in_rule__EncodingSettings__Group__42538 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__5_in_rule__EncodingSettings__Group__42541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EncodingSettings__Group__4__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__5__Impl_in_rule__EncodingSettings__Group__52600 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__6_in_rule__EncodingSettings__Group__52603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EncodingSettings__Group__5__Impl2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__6__Impl_in_rule__EncodingSettings__Group__62662 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__7_in_rule__EncodingSettings__Group__62665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__EndiannessAssignment_6_in_rule__EncodingSettings__Group__6__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__7__Impl_in_rule__EncodingSettings__Group__72722 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__8_in_rule__EncodingSettings__Group__72725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EncodingSettings__Group__7__Impl2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__8__Impl_in_rule__EncodingSettings__Group__82784 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__9_in_rule__EncodingSettings__Group__82787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EncodingSettings__Group__8__Impl2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__9__Impl_in_rule__EncodingSettings__Group__92846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__10_in_rule__EncodingSettings__Group__92849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EncodingSettings__Group__9__Impl2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__10__Impl_in_rule__EncodingSettings__Group__102908 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__11_in_rule__EncodingSettings__Group__102911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__AlignmentAssignment_10_in_rule__EncodingSettings__Group__10__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__11__Impl_in_rule__EncodingSettings__Group__112968 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__12_in_rule__EncodingSettings__Group__112971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EncodingSettings__Group__11__Impl2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__12__Impl_in_rule__EncodingSettings__Group__123030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group_12__0_in_rule__EncodingSettings__Group__12__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group_12__0__Impl_in_rule__EncodingSettings__Group_12__03114 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group_12__1_in_rule__EncodingSettings__Group_12__03117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EncodingSettings__Group_12__0__Impl3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group_12__1__Impl_in_rule__EncodingSettings__Group_12__13176 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group_12__2_in_rule__EncodingSettings__Group_12__13179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EncodingSettings__Group_12__1__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group_12__2__Impl_in_rule__EncodingSettings__Group_12__23238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__IDAssignment_12_2_in_rule__EncodingSettings__Group_12__2__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__0__Impl_in_rule__SensorDataDescription__Group__03301 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__1_in_rule__SensorDataDescription__Group__03304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__SensorDataDescription__Group__0__Impl3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__1__Impl_in_rule__SensorDataDescription__Group__13363 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__2_in_rule__SensorDataDescription__Group__13366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__2__Impl_in_rule__SensorDataDescription__Group__23424 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__3_in_rule__SensorDataDescription__Group__23427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_2__0_in_rule__SensorDataDescription__Group__2__Impl3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__3__Impl_in_rule__SensorDataDescription__Group__33485 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__4_in_rule__SensorDataDescription__Group__33488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SensorDataDescription__Group__3__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__4__Impl_in_rule__SensorDataDescription__Group__43547 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__5_in_rule__SensorDataDescription__Group__43550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__DataSetsAssignment_4_in_rule__SensorDataDescription__Group__4__Impl3577 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__5__Impl_in_rule__SensorDataDescription__Group__53608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SensorDataDescription__Group__5__Impl3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_2__0__Impl_in_rule__SensorDataDescription__Group_2__03679 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_2__1_in_rule__SensorDataDescription__Group_2__03682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SensorDataDescription__Group_2__0__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_2__1__Impl_in_rule__SensorDataDescription__Group_2__13741 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_2__2_in_rule__SensorDataDescription__Group_2__13744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SensorDataDescription__Group_2__1__Impl3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_2__2__Impl_in_rule__SensorDataDescription__Group_2__23803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__IDAssignment_2_2_in_rule__SensorDataDescription__Group_2__2__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__0__Impl_in_rule__DataSet__Group__03866 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataSet__Group__1_in_rule__DataSet__Group__03869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__DataSet__Group__0__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__1__Impl_in_rule__DataSet__Group__13928 = new BitSet(new long[]{0x00000100A0000080L});
    public static final BitSet FOLLOW_rule__DataSet__Group__2_in_rule__DataSet__Group__13931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__NameAssignment_1_in_rule__DataSet__Group__1__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__2__Impl_in_rule__DataSet__Group__23988 = new BitSet(new long[]{0x00000100A0000080L});
    public static final BitSet FOLLOW_rule__DataSet__Group__3_in_rule__DataSet__Group__23991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_2__0_in_rule__DataSet__Group__2__Impl4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__3__Impl_in_rule__DataSet__Group__34049 = new BitSet(new long[]{0x00000100A0000080L});
    public static final BitSet FOLLOW_rule__DataSet__Group__4_in_rule__DataSet__Group__34052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__0_in_rule__DataSet__Group__3__Impl4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__4__Impl_in_rule__DataSet__Group__44110 = new BitSet(new long[]{0x00000100A0000080L});
    public static final BitSet FOLLOW_rule__DataSet__Group__5_in_rule__DataSet__Group__44113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__DescriptionAssignment_4_in_rule__DataSet__Group__4__Impl4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__5__Impl_in_rule__DataSet__Group__54171 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__DataSet__Group__6_in_rule__DataSet__Group__54174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DataSet__Group__5__Impl4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__6__Impl_in_rule__DataSet__Group__64233 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__DataSet__Group__7_in_rule__DataSet__Group__64236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__DataAssignment_6_in_rule__DataSet__Group__6__Impl4263 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__DataSet__Group__7__Impl_in_rule__DataSet__Group__74294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DataSet__Group__7__Impl4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_2__0__Impl_in_rule__DataSet__Group_2__04369 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataSet__Group_2__1_in_rule__DataSet__Group_2__04372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DataSet__Group_2__0__Impl4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_2__1__Impl_in_rule__DataSet__Group_2__14431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__ParentDataSetAssignment_2_1_in_rule__DataSet__Group_2__1__Impl4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__0__Impl_in_rule__DataSet__Group_3__04492 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__1_in_rule__DataSet__Group_3__04495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DataSet__Group_3__0__Impl4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__1__Impl_in_rule__DataSet__Group_3__14554 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__2_in_rule__DataSet__Group_3__14557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DataSet__Group_3__1__Impl4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__2__Impl_in_rule__DataSet__Group_3__24616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__IDAssignment_3_2_in_rule__DataSet__Group_3__2__Impl4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__0__Impl_in_rule__MeasurementData__Group__04679 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__1_in_rule__MeasurementData__Group__04682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__NameAssignment_0_in_rule__MeasurementData__Group__0__Impl4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__1__Impl_in_rule__MeasurementData__Group__14739 = new BitSet(new long[]{0x000000000FFF0000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__2_in_rule__MeasurementData__Group__14742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MeasurementData__Group__1__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__2__Impl_in_rule__MeasurementData__Group__24801 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__3_in_rule__MeasurementData__Group__24804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__DataTypeAssignment_2_in_rule__MeasurementData__Group__2__Impl4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__3__Impl_in_rule__MeasurementData__Group__34861 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__4_in_rule__MeasurementData__Group__34864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MeasurementData__Group__3__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__4__Impl_in_rule__MeasurementData__Group__44923 = new BitSet(new long[]{0x0000080080000080L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__5_in_rule__MeasurementData__Group__44926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__UnitAssignment_4_in_rule__MeasurementData__Group__4__Impl4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__5__Impl_in_rule__MeasurementData__Group__54983 = new BitSet(new long[]{0x0000080080000080L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__6_in_rule__MeasurementData__Group__54986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__0_in_rule__MeasurementData__Group__5__Impl5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__6__Impl_in_rule__MeasurementData__Group__65044 = new BitSet(new long[]{0x0000080080000080L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__7_in_rule__MeasurementData__Group__65047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__0_in_rule__MeasurementData__Group__6__Impl5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__7__Impl_in_rule__MeasurementData__Group__75105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__DescriptionAssignment_7_in_rule__MeasurementData__Group__7__Impl5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__0__Impl_in_rule__MeasurementData__Group_5__05179 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__1_in_rule__MeasurementData__Group_5__05182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MeasurementData__Group_5__0__Impl5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__1__Impl_in_rule__MeasurementData__Group_5__15241 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__2_in_rule__MeasurementData__Group_5__15244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MeasurementData__Group_5__1__Impl5272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__2__Impl_in_rule__MeasurementData__Group_5__25303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__IDAssignment_5_2_in_rule__MeasurementData__Group_5__2__Impl5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__0__Impl_in_rule__MeasurementData__Group_6__05366 = new BitSet(new long[]{0x0014400000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__1_in_rule__MeasurementData__Group_6__05369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MeasurementData__Group_6__0__Impl5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__1__Impl_in_rule__MeasurementData__Group_6__15428 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__2_in_rule__MeasurementData__Group_6__15431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__AdjustmentsAssignment_6_1_in_rule__MeasurementData__Group_6__1__Impl5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__2__Impl_in_rule__MeasurementData__Group_6__25488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6_2__0_in_rule__MeasurementData__Group_6__2__Impl5515 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6_2__0__Impl_in_rule__MeasurementData__Group_6_2__05552 = new BitSet(new long[]{0x0014400000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6_2__1_in_rule__MeasurementData__Group_6_2__05555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MeasurementData__Group_6_2__0__Impl5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6_2__1__Impl_in_rule__MeasurementData__Group_6_2__15614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__AdjustmentsAssignment_6_2_1_in_rule__MeasurementData__Group_6_2__1__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__0__Impl_in_rule__NonMeasurementData__Group__05675 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__1_in_rule__NonMeasurementData__Group__05678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__NameAssignment_0_in_rule__NonMeasurementData__Group__0__Impl5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__1__Impl_in_rule__NonMeasurementData__Group__15735 = new BitSet(new long[]{0x000000000FFF0000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__2_in_rule__NonMeasurementData__Group__15738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__NonMeasurementData__Group__1__Impl5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__2__Impl_in_rule__NonMeasurementData__Group__25797 = new BitSet(new long[]{0x0080100080000080L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__3_in_rule__NonMeasurementData__Group__25800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__DataTypeAssignment_2_in_rule__NonMeasurementData__Group__2__Impl5827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__3__Impl_in_rule__NonMeasurementData__Group__35857 = new BitSet(new long[]{0x0080100080000080L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__4_in_rule__NonMeasurementData__Group__35860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__ConstantAssignment_3_in_rule__NonMeasurementData__Group__3__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__4__Impl_in_rule__NonMeasurementData__Group__45918 = new BitSet(new long[]{0x0080100080000080L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__5_in_rule__NonMeasurementData__Group__45921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_4__0_in_rule__NonMeasurementData__Group__4__Impl5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__5__Impl_in_rule__NonMeasurementData__Group__55979 = new BitSet(new long[]{0x0080100080000080L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__6_in_rule__NonMeasurementData__Group__55982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_5__0_in_rule__NonMeasurementData__Group__5__Impl6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__6__Impl_in_rule__NonMeasurementData__Group__66040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__DescriptionAssignment_6_in_rule__NonMeasurementData__Group__6__Impl6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_4__0__Impl_in_rule__NonMeasurementData__Group_4__06112 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_4__1_in_rule__NonMeasurementData__Group_4__06115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__NonMeasurementData__Group_4__0__Impl6143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_4__1__Impl_in_rule__NonMeasurementData__Group_4__16174 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_4__2_in_rule__NonMeasurementData__Group_4__16177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__NonMeasurementData__Group_4__1__Impl6205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_4__2__Impl_in_rule__NonMeasurementData__Group_4__26236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__ValueAssignment_4_2_in_rule__NonMeasurementData__Group_4__2__Impl6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_5__0__Impl_in_rule__NonMeasurementData__Group_5__06299 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_5__1_in_rule__NonMeasurementData__Group_5__06302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__NonMeasurementData__Group_5__0__Impl6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_5__1__Impl_in_rule__NonMeasurementData__Group_5__16361 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_5__2_in_rule__NonMeasurementData__Group_5__16364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__NonMeasurementData__Group_5__1__Impl6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_5__2__Impl_in_rule__NonMeasurementData__Group_5__26423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__IDAssignment_5_2_in_rule__NonMeasurementData__Group_5__2__Impl6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__0__Impl_in_rule__DataRange__Group__06486 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__DataRange__Group__1_in_rule__DataRange__Group__06489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DataRange__Group__0__Impl6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__1__Impl_in_rule__DataRange__Group__16548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__RangeAssignment_1_in_rule__DataRange__Group__1__Impl6575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__0__Impl_in_rule__Interval__Group__06609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interval__Group__1_in_rule__Interval__Group__06612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Interval__Group__0__Impl6640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__1__Impl_in_rule__Interval__Group__16671 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Interval__Group__2_in_rule__Interval__Group__16674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__LowerBoundAssignment_1_in_rule__Interval__Group__1__Impl6701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__2__Impl_in_rule__Interval__Group__26731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interval__Group__3_in_rule__Interval__Group__26734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Interval__Group__2__Impl6762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__3__Impl_in_rule__Interval__Group__36793 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Interval__Group__4_in_rule__Interval__Group__36796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__UpperBoundAssignment_3_in_rule__Interval__Group__3__Impl6823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__4__Impl_in_rule__Interval__Group__46853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Interval__Group__4__Impl6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__0__Impl_in_rule__LinearDataConversion__Group__06922 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__1_in_rule__LinearDataConversion__Group__06925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__LinearDataConversion__Group__0__Impl6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__1__Impl_in_rule__LinearDataConversion__Group__16984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__2_in_rule__LinearDataConversion__Group__16987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__LinearDataConversion__Group__1__Impl7015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__2__Impl_in_rule__LinearDataConversion__Group__27046 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__3_in_rule__LinearDataConversion__Group__27049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__ScalingFactorAssignment_2_in_rule__LinearDataConversion__Group__2__Impl7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__3__Impl_in_rule__LinearDataConversion__Group__37106 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__4_in_rule__LinearDataConversion__Group__37109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__LinearDataConversion__Group__3__Impl7137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__4__Impl_in_rule__LinearDataConversion__Group__47168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__5_in_rule__LinearDataConversion__Group__47171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__LinearDataConversion__Group__4__Impl7199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__5__Impl_in_rule__LinearDataConversion__Group__57230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__OffsetAssignment_5_in_rule__LinearDataConversion__Group__5__Impl7257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__0__Impl_in_rule__LinearDataConversionWithInterval__Group__07299 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__1_in_rule__LinearDataConversionWithInterval__Group__07302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__LinearDataConversionWithInterval__Group__0__Impl7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__1__Impl_in_rule__LinearDataConversionWithInterval__Group__17361 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__2_in_rule__LinearDataConversionWithInterval__Group__17364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__FromIntervalAssignment_1_in_rule__LinearDataConversionWithInterval__Group__1__Impl7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__2__Impl_in_rule__LinearDataConversionWithInterval__Group__27421 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__3_in_rule__LinearDataConversionWithInterval__Group__27424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__LinearDataConversionWithInterval__Group__2__Impl7452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__3__Impl_in_rule__LinearDataConversionWithInterval__Group__37483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__ToIntervalAssignment_3_in_rule__LinearDataConversionWithInterval__Group__3__Impl7510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__07548 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__07551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__17607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__07669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__07672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__DOUBLE__Group_1__0__Impl7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__17731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl7758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group__0__Impl_in_rule__UNIT__Group__07791 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__UNIT__Group__1_in_rule__UNIT__Group__07794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UNIT__Group__0__Impl7822 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__UNIT__Group__1__Impl_in_rule__UNIT__Group__17853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group_1__0_in_rule__UNIT__Group__1__Impl7880 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__UNIT__Group_1__0__Impl_in_rule__UNIT__Group_1__07915 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UNIT__Group_1__1_in_rule__UNIT__Group_1__07918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__UNIT__Group_1__0__Impl7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group_1__1__Impl_in_rule__UNIT__Group_1__17974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UNIT__Group_1__1__Impl8002 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SensorInterface__NameAssignment_18042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_rule__SensorInterface__DescriptionAssignment_28073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SensorInterface__IDAssignment_3_28104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodingSettings_in_rule__SensorInterface__EncodingSettingsAssignment_58135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorDataDescription_in_rule__SensorInterface__DataDescriptionAssignment_68166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoding_in_rule__EncodingSettings__CodingAssignment_28197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndianness_in_rule__EncodingSettings__EndiannessAssignment_68228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EncodingSettings__AlignmentAssignment_108259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EncodingSettings__IDAssignment_12_28290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SensorDataDescription__IDAssignment_2_28321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSet_in_rule__SensorDataDescription__DataSetsAssignment_48352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataSet__NameAssignment_18383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataSet__ParentDataSetAssignment_2_18418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataSet__IDAssignment_3_28453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_rule__DataSet__DescriptionAssignment_48484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__DataSet__DataAssignment_68515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MeasurementData__NameAssignment_08546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__MeasurementData__DataTypeAssignment_28577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNIT_in_rule__MeasurementData__UnitAssignment_48608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MeasurementData__IDAssignment_5_28639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdjustment_in_rule__MeasurementData__AdjustmentsAssignment_6_18670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdjustment_in_rule__MeasurementData__AdjustmentsAssignment_6_2_18701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_rule__MeasurementData__DescriptionAssignment_78732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NonMeasurementData__NameAssignment_08763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__NonMeasurementData__DataTypeAssignment_28794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__NonMeasurementData__ConstantAssignment_38830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NonMeasurementData__ValueAssignment_4_28869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NonMeasurementData__IDAssignment_5_28900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_rule__NonMeasurementData__DescriptionAssignment_68931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_rule__DataRange__RangeAssignment_18962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Interval__LowerBoundAssignment_18993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Interval__UpperBoundAssignment_39024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__LinearDataConversion__ScalingFactorAssignment_29055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__LinearDataConversion__OffsetAssignment_59086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_rule__LinearDataConversionWithInterval__FromIntervalAssignment_19117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_rule__LinearDataConversionWithInterval__ToIntervalAssignment_39148 = new BitSet(new long[]{0x0000000000000002L});

}