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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_ANY_OTHER", "RULE_DESCRIPTION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'STRING'", "'SENSIDL_BINARY'", "'SENSIDL_JSON'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'INT8'", "'UINT8'", "'INT16'", "'UINT16'", "'INT32'", "'UINT32'", "'INT64'", "'UINT64'", "'FLOAT'", "'DOUBLE'", "'BOOLEAN'", "'sensorInterface'", "'{'", "'}'", "'with identifier'", "':'", "'encoding'", "','", "'endianness'", "'alignment'", "'BIT'", "'sensorData'", "'dataSet'", "'uses'", "'as'", "'in'", "'adjusted'", "'value'", "'='", "'with range'", "'['", "';'", "']'", "'with scaling factor'", "'and offset'", "'by linear mapping'", "'=>'", "'.'", "'constant'"
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


    // $ANTLR start "entryRuleMeasurementDataNotAdjustable"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:256:1: entryRuleMeasurementDataNotAdjustable : ruleMeasurementDataNotAdjustable EOF ;
    public final void entryRuleMeasurementDataNotAdjustable() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:257:1: ( ruleMeasurementDataNotAdjustable EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:258:1: ruleMeasurementDataNotAdjustable EOF
            {
             before(grammarAccess.getMeasurementDataNotAdjustableRule()); 
            pushFollow(FOLLOW_ruleMeasurementDataNotAdjustable_in_entryRuleMeasurementDataNotAdjustable481);
            ruleMeasurementDataNotAdjustable();

            state._fsp--;

             after(grammarAccess.getMeasurementDataNotAdjustableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeasurementDataNotAdjustable488); 

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
    // $ANTLR end "entryRuleMeasurementDataNotAdjustable"


    // $ANTLR start "ruleMeasurementDataNotAdjustable"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:265:1: ruleMeasurementDataNotAdjustable : ( ( rule__MeasurementDataNotAdjustable__Group__0 ) ) ;
    public final void ruleMeasurementDataNotAdjustable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:269:2: ( ( ( rule__MeasurementDataNotAdjustable__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:270:1: ( ( rule__MeasurementDataNotAdjustable__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:270:1: ( ( rule__MeasurementDataNotAdjustable__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:271:1: ( rule__MeasurementDataNotAdjustable__Group__0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:272:1: ( rule__MeasurementDataNotAdjustable__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:272:2: rule__MeasurementDataNotAdjustable__Group__0
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group__0_in_ruleMeasurementDataNotAdjustable514);
            rule__MeasurementDataNotAdjustable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasurementDataNotAdjustable"


    // $ANTLR start "entryRuleDataAdjustment"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:284:1: entryRuleDataAdjustment : ruleDataAdjustment EOF ;
    public final void entryRuleDataAdjustment() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:285:1: ( ruleDataAdjustment EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:286:1: ruleDataAdjustment EOF
            {
             before(grammarAccess.getDataAdjustmentRule()); 
            pushFollow(FOLLOW_ruleDataAdjustment_in_entryRuleDataAdjustment541);
            ruleDataAdjustment();

            state._fsp--;

             after(grammarAccess.getDataAdjustmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAdjustment548); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:293:1: ruleDataAdjustment : ( ( rule__DataAdjustment__Alternatives ) ) ;
    public final void ruleDataAdjustment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:297:2: ( ( ( rule__DataAdjustment__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:298:1: ( ( rule__DataAdjustment__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:298:1: ( ( rule__DataAdjustment__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:299:1: ( rule__DataAdjustment__Alternatives )
            {
             before(grammarAccess.getDataAdjustmentAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:300:1: ( rule__DataAdjustment__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:300:2: rule__DataAdjustment__Alternatives
            {
            pushFollow(FOLLOW_rule__DataAdjustment__Alternatives_in_ruleDataAdjustment574);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:377:1: ruleDataConversion : ( ( rule__DataConversion__Alternatives ) ) ;
    public final void ruleDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:381:2: ( ( ( rule__DataConversion__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:382:1: ( ( rule__DataConversion__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:382:1: ( ( rule__DataConversion__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:383:1: ( rule__DataConversion__Alternatives )
            {
             before(grammarAccess.getDataConversionAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:384:1: ( rule__DataConversion__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:384:2: rule__DataConversion__Alternatives
            {
            pushFollow(FOLLOW_rule__DataConversion__Alternatives_in_ruleDataConversion754);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:396:1: entryRuleLinearDataConversion : ruleLinearDataConversion EOF ;
    public final void entryRuleLinearDataConversion() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:397:1: ( ruleLinearDataConversion EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:398:1: ruleLinearDataConversion EOF
            {
             before(grammarAccess.getLinearDataConversionRule()); 
            pushFollow(FOLLOW_ruleLinearDataConversion_in_entryRuleLinearDataConversion781);
            ruleLinearDataConversion();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinearDataConversion788); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:405:1: ruleLinearDataConversion : ( ( rule__LinearDataConversion__Group__0 ) ) ;
    public final void ruleLinearDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:409:2: ( ( ( rule__LinearDataConversion__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:410:1: ( ( rule__LinearDataConversion__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:410:1: ( ( rule__LinearDataConversion__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:411:1: ( rule__LinearDataConversion__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:412:1: ( rule__LinearDataConversion__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:412:2: rule__LinearDataConversion__Group__0
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group__0_in_ruleLinearDataConversion814);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:424:1: entryRuleLinearDataConversionWithInterval : ruleLinearDataConversionWithInterval EOF ;
    public final void entryRuleLinearDataConversionWithInterval() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:425:1: ( ruleLinearDataConversionWithInterval EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:426:1: ruleLinearDataConversionWithInterval EOF
            {
             before(grammarAccess.getLinearDataConversionWithIntervalRule()); 
            pushFollow(FOLLOW_ruleLinearDataConversionWithInterval_in_entryRuleLinearDataConversionWithInterval841);
            ruleLinearDataConversionWithInterval();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionWithIntervalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinearDataConversionWithInterval848); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:433:1: ruleLinearDataConversionWithInterval : ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) ;
    public final void ruleLinearDataConversionWithInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:437:2: ( ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:438:1: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:438:1: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:439:1: ( rule__LinearDataConversionWithInterval__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:440:1: ( rule__LinearDataConversionWithInterval__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:440:2: rule__LinearDataConversionWithInterval__Group__0
            {
            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__0_in_ruleLinearDataConversionWithInterval874);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:452:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:453:1: ( ruleDOUBLE EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:454:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE901);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE908); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:461:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:465:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:466:1: ( ( rule__DOUBLE__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:466:1: ( ( rule__DOUBLE__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:467:1: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:468:1: ( rule__DOUBLE__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:468:2: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE934);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:480:1: entryRuleUNIT : ruleUNIT EOF ;
    public final void entryRuleUNIT() throws RecognitionException {
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:481:1: ( ruleUNIT EOF )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:482:1: ruleUNIT EOF
            {
             before(grammarAccess.getUNITRule()); 
            pushFollow(FOLLOW_ruleUNIT_in_entryRuleUNIT961);
            ruleUNIT();

            state._fsp--;

             after(grammarAccess.getUNITRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNIT968); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:489:1: ruleUNIT : ( ( rule__UNIT__Group__0 ) ) ;
    public final void ruleUNIT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:493:2: ( ( ( rule__UNIT__Group__0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:494:1: ( ( rule__UNIT__Group__0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:494:1: ( ( rule__UNIT__Group__0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:495:1: ( rule__UNIT__Group__0 )
            {
             before(grammarAccess.getUNITAccess().getGroup()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:496:1: ( rule__UNIT__Group__0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:496:2: rule__UNIT__Group__0
            {
            pushFollow(FOLLOW_rule__UNIT__Group__0_in_ruleUNIT994);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:509:1: ruleCoding : ( ( rule__Coding__Alternatives ) ) ;
    public final void ruleCoding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:513:1: ( ( ( rule__Coding__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:514:1: ( ( rule__Coding__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:514:1: ( ( rule__Coding__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:515:1: ( rule__Coding__Alternatives )
            {
             before(grammarAccess.getCodingAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:516:1: ( rule__Coding__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:516:2: rule__Coding__Alternatives
            {
            pushFollow(FOLLOW_rule__Coding__Alternatives_in_ruleCoding1031);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:528:1: ruleEndianness : ( ( rule__Endianness__Alternatives ) ) ;
    public final void ruleEndianness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:532:1: ( ( ( rule__Endianness__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:533:1: ( ( rule__Endianness__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:533:1: ( ( rule__Endianness__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:534:1: ( rule__Endianness__Alternatives )
            {
             before(grammarAccess.getEndiannessAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:535:1: ( rule__Endianness__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:535:2: rule__Endianness__Alternatives
            {
            pushFollow(FOLLOW_rule__Endianness__Alternatives_in_ruleEndianness1067);
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


    // $ANTLR start "ruleDataTypeNotAdjustable"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:547:1: ruleDataTypeNotAdjustable : ( ( 'STRING' ) ) ;
    public final void ruleDataTypeNotAdjustable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:551:1: ( ( ( 'STRING' ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:552:1: ( ( 'STRING' ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:552:1: ( ( 'STRING' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:553:1: ( 'STRING' )
            {
             before(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:554:1: ( 'STRING' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:554:3: 'STRING'
            {
            match(input,12,FOLLOW_12_in_ruleDataTypeNotAdjustable1104); 

            }

             after(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypeNotAdjustable"


    // $ANTLR start "ruleDataType"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:567:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:571:1: ( ( ( rule__DataType__Alternatives ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:572:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:572:1: ( ( rule__DataType__Alternatives ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:573:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:574:1: ( rule__DataType__Alternatives )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:574:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType1142);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:585:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:589:1: ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:590:1: ( ruleMeasurementData )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:590:1: ( ruleMeasurementData )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:591:1: ruleMeasurementData
                    {
                     before(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMeasurementData_in_rule__Data__Alternatives1177);
                    ruleMeasurementData();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:596:6: ( ruleNonMeasurementData )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:596:6: ( ruleNonMeasurementData )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:597:1: ruleNonMeasurementData
                    {
                     before(grammarAccess.getDataAccess().getNonMeasurementDataParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNonMeasurementData_in_rule__Data__Alternatives1194);
                    ruleNonMeasurementData();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getNonMeasurementDataParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:602:6: ( ruleMeasurementDataNotAdjustable )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:602:6: ( ruleMeasurementDataNotAdjustable )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:603:1: ruleMeasurementDataNotAdjustable
                    {
                     before(grammarAccess.getDataAccess().getMeasurementDataNotAdjustableParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMeasurementDataNotAdjustable_in_rule__Data__Alternatives1211);
                    ruleMeasurementDataNotAdjustable();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getMeasurementDataNotAdjustableParserRuleCall_2()); 

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


    // $ANTLR start "rule__NonMeasurementData__Alternatives_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:613:1: rule__NonMeasurementData__Alternatives_2 : ( ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) ) | ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) ) );
    public final void rule__NonMeasurementData__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:617:1: ( ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) ) | ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=17 && LA2_0<=27)) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:618:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:618:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:619:1: ( rule__NonMeasurementData__DataTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:620:1: ( rule__NonMeasurementData__DataTypeAssignment_2_0 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:620:2: rule__NonMeasurementData__DataTypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__NonMeasurementData__DataTypeAssignment_2_0_in_rule__NonMeasurementData__Alternatives_21243);
                    rule__NonMeasurementData__DataTypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:624:6: ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:624:6: ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:625:1: ( rule__NonMeasurementData__DataTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:626:1: ( rule__NonMeasurementData__DataTypeAssignment_2_1 )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:626:2: rule__NonMeasurementData__DataTypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__NonMeasurementData__DataTypeAssignment_2_1_in_rule__NonMeasurementData__Alternatives_21261);
                    rule__NonMeasurementData__DataTypeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__NonMeasurementData__Alternatives_2"


    // $ANTLR start "rule__DataAdjustment__Alternatives"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:635:1: rule__DataAdjustment__Alternatives : ( ( ruleDataRange ) | ( ruleDataConversion ) );
    public final void rule__DataAdjustment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:639:1: ( ( ruleDataRange ) | ( ruleDataConversion ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==46) ) {
                alt3=1;
            }
            else if ( (LA3_0==50||LA3_0==52) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:640:1: ( ruleDataRange )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:640:1: ( ruleDataRange )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:641:1: ruleDataRange
                    {
                     before(grammarAccess.getDataAdjustmentAccess().getDataRangeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDataRange_in_rule__DataAdjustment__Alternatives1294);
                    ruleDataRange();

                    state._fsp--;

                     after(grammarAccess.getDataAdjustmentAccess().getDataRangeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:646:6: ( ruleDataConversion )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:646:6: ( ruleDataConversion )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:647:1: ruleDataConversion
                    {
                     before(grammarAccess.getDataAdjustmentAccess().getDataConversionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataConversion_in_rule__DataAdjustment__Alternatives1311);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:657:1: rule__DataConversion__Alternatives : ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) );
    public final void rule__DataConversion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:661:1: ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==50) ) {
                alt4=1;
            }
            else if ( (LA4_0==52) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:662:1: ( ruleLinearDataConversion )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:662:1: ( ruleLinearDataConversion )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:663:1: ruleLinearDataConversion
                    {
                     before(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLinearDataConversion_in_rule__DataConversion__Alternatives1343);
                    ruleLinearDataConversion();

                    state._fsp--;

                     after(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:668:6: ( ruleLinearDataConversionWithInterval )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:668:6: ( ruleLinearDataConversionWithInterval )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:669:1: ruleLinearDataConversionWithInterval
                    {
                     before(grammarAccess.getDataConversionAccess().getLinearDataConversionWithIntervalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLinearDataConversionWithInterval_in_rule__DataConversion__Alternatives1360);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:679:1: rule__Coding__Alternatives : ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) );
    public final void rule__Coding__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:683:1: ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:684:1: ( ( 'SENSIDL_BINARY' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:684:1: ( ( 'SENSIDL_BINARY' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:685:1: ( 'SENSIDL_BINARY' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:686:1: ( 'SENSIDL_BINARY' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:686:3: 'SENSIDL_BINARY'
                    {
                    match(input,13,FOLLOW_13_in_rule__Coding__Alternatives1393); 

                    }

                     after(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:691:6: ( ( 'SENSIDL_JSON' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:691:6: ( ( 'SENSIDL_JSON' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:692:1: ( 'SENSIDL_JSON' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_JSONEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:693:1: ( 'SENSIDL_JSON' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:693:3: 'SENSIDL_JSON'
                    {
                    match(input,14,FOLLOW_14_in_rule__Coding__Alternatives1414); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:703:1: rule__Endianness__Alternatives : ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) );
    public final void rule__Endianness__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:707:1: ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:708:1: ( ( 'BIG_ENDIAN' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:708:1: ( ( 'BIG_ENDIAN' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:709:1: ( 'BIG_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:710:1: ( 'BIG_ENDIAN' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:710:3: 'BIG_ENDIAN'
                    {
                    match(input,15,FOLLOW_15_in_rule__Endianness__Alternatives1450); 

                    }

                     after(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:715:6: ( ( 'LITTLE_ENDIAN' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:715:6: ( ( 'LITTLE_ENDIAN' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:716:1: ( 'LITTLE_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:717:1: ( 'LITTLE_ENDIAN' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:717:3: 'LITTLE_ENDIAN'
                    {
                    match(input,16,FOLLOW_16_in_rule__Endianness__Alternatives1471); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:727:1: rule__DataType__Alternatives : ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'BOOLEAN' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:731:1: ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'BOOLEAN' ) ) )
            int alt7=11;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            case 23:
                {
                alt7=7;
                }
                break;
            case 24:
                {
                alt7=8;
                }
                break;
            case 25:
                {
                alt7=9;
                }
                break;
            case 26:
                {
                alt7=10;
                }
                break;
            case 27:
                {
                alt7=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:732:1: ( ( 'INT8' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:732:1: ( ( 'INT8' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:733:1: ( 'INT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:734:1: ( 'INT8' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:734:3: 'INT8'
                    {
                    match(input,17,FOLLOW_17_in_rule__DataType__Alternatives1507); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:739:6: ( ( 'UINT8' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:739:6: ( ( 'UINT8' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:740:1: ( 'UINT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:741:1: ( 'UINT8' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:741:3: 'UINT8'
                    {
                    match(input,18,FOLLOW_18_in_rule__DataType__Alternatives1528); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:746:6: ( ( 'INT16' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:746:6: ( ( 'INT16' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:747:1: ( 'INT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:748:1: ( 'INT16' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:748:3: 'INT16'
                    {
                    match(input,19,FOLLOW_19_in_rule__DataType__Alternatives1549); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:753:6: ( ( 'UINT16' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:753:6: ( ( 'UINT16' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:754:1: ( 'UINT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:755:1: ( 'UINT16' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:755:3: 'UINT16'
                    {
                    match(input,20,FOLLOW_20_in_rule__DataType__Alternatives1570); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:760:6: ( ( 'INT32' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:760:6: ( ( 'INT32' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:761:1: ( 'INT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:762:1: ( 'INT32' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:762:3: 'INT32'
                    {
                    match(input,21,FOLLOW_21_in_rule__DataType__Alternatives1591); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:767:6: ( ( 'UINT32' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:767:6: ( ( 'UINT32' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:768:1: ( 'UINT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:769:1: ( 'UINT32' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:769:3: 'UINT32'
                    {
                    match(input,22,FOLLOW_22_in_rule__DataType__Alternatives1612); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:774:6: ( ( 'INT64' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:774:6: ( ( 'INT64' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:775:1: ( 'INT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:776:1: ( 'INT64' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:776:3: 'INT64'
                    {
                    match(input,23,FOLLOW_23_in_rule__DataType__Alternatives1633); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:781:6: ( ( 'UINT64' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:781:6: ( ( 'UINT64' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:782:1: ( 'UINT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:783:1: ( 'UINT64' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:783:3: 'UINT64'
                    {
                    match(input,24,FOLLOW_24_in_rule__DataType__Alternatives1654); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:788:6: ( ( 'FLOAT' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:788:6: ( ( 'FLOAT' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:789:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:790:1: ( 'FLOAT' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:790:3: 'FLOAT'
                    {
                    match(input,25,FOLLOW_25_in_rule__DataType__Alternatives1675); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:795:6: ( ( 'DOUBLE' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:795:6: ( ( 'DOUBLE' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:796:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:797:1: ( 'DOUBLE' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:797:3: 'DOUBLE'
                    {
                    match(input,26,FOLLOW_26_in_rule__DataType__Alternatives1696); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:802:6: ( ( 'BOOLEAN' ) )
                    {
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:802:6: ( ( 'BOOLEAN' ) )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:803:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_10()); 
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:804:1: ( 'BOOLEAN' )
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:804:3: 'BOOLEAN'
                    {
                    match(input,27,FOLLOW_27_in_rule__DataType__Alternatives1717); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_10()); 

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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:816:1: rule__SensorInterface__Group__0 : rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 ;
    public final void rule__SensorInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:820:1: ( rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:821:2: rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__0__Impl_in_rule__SensorInterface__Group__01750);
            rule__SensorInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__1_in_rule__SensorInterface__Group__01753);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:828:1: rule__SensorInterface__Group__0__Impl : ( 'sensorInterface' ) ;
    public final void rule__SensorInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:832:1: ( ( 'sensorInterface' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:833:1: ( 'sensorInterface' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:833:1: ( 'sensorInterface' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:834:1: 'sensorInterface'
            {
             before(grammarAccess.getSensorInterfaceAccess().getSensorInterfaceKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__SensorInterface__Group__0__Impl1781); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:847:1: rule__SensorInterface__Group__1 : rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 ;
    public final void rule__SensorInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:851:1: ( rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:852:2: rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__1__Impl_in_rule__SensorInterface__Group__11812);
            rule__SensorInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__2_in_rule__SensorInterface__Group__11815);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:859:1: rule__SensorInterface__Group__1__Impl : ( ( rule__SensorInterface__NameAssignment_1 ) ) ;
    public final void rule__SensorInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:863:1: ( ( ( rule__SensorInterface__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:864:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:864:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:865:1: ( rule__SensorInterface__NameAssignment_1 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:866:1: ( rule__SensorInterface__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:866:2: rule__SensorInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SensorInterface__NameAssignment_1_in_rule__SensorInterface__Group__1__Impl1842);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:876:1: rule__SensorInterface__Group__2 : rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 ;
    public final void rule__SensorInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:880:1: ( rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:881:2: rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__2__Impl_in_rule__SensorInterface__Group__21872);
            rule__SensorInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__3_in_rule__SensorInterface__Group__21875);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:888:1: rule__SensorInterface__Group__2__Impl : ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) ;
    public final void rule__SensorInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:892:1: ( ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:893:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:893:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:894:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:895:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DESCRIPTION) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:895:2: rule__SensorInterface__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SensorInterface__DescriptionAssignment_2_in_rule__SensorInterface__Group__2__Impl1902);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:905:1: rule__SensorInterface__Group__3 : rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 ;
    public final void rule__SensorInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:909:1: ( rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:910:2: rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__3__Impl_in_rule__SensorInterface__Group__31933);
            rule__SensorInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__4_in_rule__SensorInterface__Group__31936);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:917:1: rule__SensorInterface__Group__3__Impl : ( ( rule__SensorInterface__Group_3__0 )? ) ;
    public final void rule__SensorInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:921:1: ( ( ( rule__SensorInterface__Group_3__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:922:1: ( ( rule__SensorInterface__Group_3__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:922:1: ( ( rule__SensorInterface__Group_3__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:923:1: ( rule__SensorInterface__Group_3__0 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:924:1: ( rule__SensorInterface__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:924:2: rule__SensorInterface__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SensorInterface__Group_3__0_in_rule__SensorInterface__Group__3__Impl1963);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:934:1: rule__SensorInterface__Group__4 : rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 ;
    public final void rule__SensorInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:938:1: ( rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:939:2: rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__4__Impl_in_rule__SensorInterface__Group__41994);
            rule__SensorInterface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__5_in_rule__SensorInterface__Group__41997);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:946:1: rule__SensorInterface__Group__4__Impl : ( '{' ) ;
    public final void rule__SensorInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:950:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:951:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:951:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:952:1: '{'
            {
             before(grammarAccess.getSensorInterfaceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__SensorInterface__Group__4__Impl2025); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:965:1: rule__SensorInterface__Group__5 : rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 ;
    public final void rule__SensorInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:969:1: ( rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:970:2: rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__5__Impl_in_rule__SensorInterface__Group__52056);
            rule__SensorInterface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__6_in_rule__SensorInterface__Group__52059);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:977:1: rule__SensorInterface__Group__5__Impl : ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) ;
    public final void rule__SensorInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:981:1: ( ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:982:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:982:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:983:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:984:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:984:2: rule__SensorInterface__EncodingSettingsAssignment_5
            {
            pushFollow(FOLLOW_rule__SensorInterface__EncodingSettingsAssignment_5_in_rule__SensorInterface__Group__5__Impl2086);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:994:1: rule__SensorInterface__Group__6 : rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 ;
    public final void rule__SensorInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:998:1: ( rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:999:2: rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__6__Impl_in_rule__SensorInterface__Group__62116);
            rule__SensorInterface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group__7_in_rule__SensorInterface__Group__62119);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1006:1: rule__SensorInterface__Group__6__Impl : ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) ;
    public final void rule__SensorInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1010:1: ( ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1011:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1011:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1012:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1013:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1013:2: rule__SensorInterface__DataDescriptionAssignment_6
            {
            pushFollow(FOLLOW_rule__SensorInterface__DataDescriptionAssignment_6_in_rule__SensorInterface__Group__6__Impl2146);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1023:1: rule__SensorInterface__Group__7 : rule__SensorInterface__Group__7__Impl ;
    public final void rule__SensorInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1027:1: ( rule__SensorInterface__Group__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1028:2: rule__SensorInterface__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group__7__Impl_in_rule__SensorInterface__Group__72176);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1034:1: rule__SensorInterface__Group__7__Impl : ( '}' ) ;
    public final void rule__SensorInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1038:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1039:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1039:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1040:1: '}'
            {
             before(grammarAccess.getSensorInterfaceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_30_in_rule__SensorInterface__Group__7__Impl2204); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1069:1: rule__SensorInterface__Group_3__0 : rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 ;
    public final void rule__SensorInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1073:1: ( rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1074:2: rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group_3__0__Impl_in_rule__SensorInterface__Group_3__02251);
            rule__SensorInterface__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group_3__1_in_rule__SensorInterface__Group_3__02254);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1081:1: rule__SensorInterface__Group_3__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1085:1: ( ( 'with identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1086:1: ( 'with identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1086:1: ( 'with identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1087:1: 'with identifier'
            {
             before(grammarAccess.getSensorInterfaceAccess().getWithIdentifierKeyword_3_0()); 
            match(input,31,FOLLOW_31_in_rule__SensorInterface__Group_3__0__Impl2282); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1100:1: rule__SensorInterface__Group_3__1 : rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 ;
    public final void rule__SensorInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1104:1: ( rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1105:2: rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group_3__1__Impl_in_rule__SensorInterface__Group_3__12313);
            rule__SensorInterface__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorInterface__Group_3__2_in_rule__SensorInterface__Group_3__12316);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1112:1: rule__SensorInterface__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SensorInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1116:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1117:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1117:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1118:1: ':'
            {
             before(grammarAccess.getSensorInterfaceAccess().getColonKeyword_3_1()); 
            match(input,32,FOLLOW_32_in_rule__SensorInterface__Group_3__1__Impl2344); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1131:1: rule__SensorInterface__Group_3__2 : rule__SensorInterface__Group_3__2__Impl ;
    public final void rule__SensorInterface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1135:1: ( rule__SensorInterface__Group_3__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1136:2: rule__SensorInterface__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__SensorInterface__Group_3__2__Impl_in_rule__SensorInterface__Group_3__22375);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1142:1: rule__SensorInterface__Group_3__2__Impl : ( ( rule__SensorInterface__IDAssignment_3_2 ) ) ;
    public final void rule__SensorInterface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1146:1: ( ( ( rule__SensorInterface__IDAssignment_3_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1147:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1147:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1148:1: ( rule__SensorInterface__IDAssignment_3_2 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDAssignment_3_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1149:1: ( rule__SensorInterface__IDAssignment_3_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1149:2: rule__SensorInterface__IDAssignment_3_2
            {
            pushFollow(FOLLOW_rule__SensorInterface__IDAssignment_3_2_in_rule__SensorInterface__Group_3__2__Impl2402);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1165:1: rule__EncodingSettings__Group__0 : rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 ;
    public final void rule__EncodingSettings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1169:1: ( rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1170:2: rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__0__Impl_in_rule__EncodingSettings__Group__02438);
            rule__EncodingSettings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__1_in_rule__EncodingSettings__Group__02441);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1177:1: rule__EncodingSettings__Group__0__Impl : ( 'encoding' ) ;
    public final void rule__EncodingSettings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1181:1: ( ( 'encoding' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1182:1: ( 'encoding' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1182:1: ( 'encoding' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1183:1: 'encoding'
            {
             before(grammarAccess.getEncodingSettingsAccess().getEncodingKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__EncodingSettings__Group__0__Impl2469); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1196:1: rule__EncodingSettings__Group__1 : rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 ;
    public final void rule__EncodingSettings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1200:1: ( rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1201:2: rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__1__Impl_in_rule__EncodingSettings__Group__12500);
            rule__EncodingSettings__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__2_in_rule__EncodingSettings__Group__12503);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1208:1: rule__EncodingSettings__Group__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1212:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1213:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1213:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1214:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__EncodingSettings__Group__1__Impl2531); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1227:1: rule__EncodingSettings__Group__2 : rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 ;
    public final void rule__EncodingSettings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1231:1: ( rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1232:2: rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__2__Impl_in_rule__EncodingSettings__Group__22562);
            rule__EncodingSettings__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__3_in_rule__EncodingSettings__Group__22565);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1239:1: rule__EncodingSettings__Group__2__Impl : ( ( rule__EncodingSettings__CodingAssignment_2 ) ) ;
    public final void rule__EncodingSettings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1243:1: ( ( ( rule__EncodingSettings__CodingAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1244:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1244:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1245:1: ( rule__EncodingSettings__CodingAssignment_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getCodingAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1246:1: ( rule__EncodingSettings__CodingAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1246:2: rule__EncodingSettings__CodingAssignment_2
            {
            pushFollow(FOLLOW_rule__EncodingSettings__CodingAssignment_2_in_rule__EncodingSettings__Group__2__Impl2592);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1256:1: rule__EncodingSettings__Group__3 : rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 ;
    public final void rule__EncodingSettings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1260:1: ( rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1261:2: rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__3__Impl_in_rule__EncodingSettings__Group__32622);
            rule__EncodingSettings__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__4_in_rule__EncodingSettings__Group__32625);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1268:1: rule__EncodingSettings__Group__3__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1272:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1273:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1273:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1274:1: ','
            {
             before(grammarAccess.getEncodingSettingsAccess().getCommaKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__EncodingSettings__Group__3__Impl2653); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1287:1: rule__EncodingSettings__Group__4 : rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 ;
    public final void rule__EncodingSettings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1291:1: ( rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1292:2: rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__4__Impl_in_rule__EncodingSettings__Group__42684);
            rule__EncodingSettings__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__5_in_rule__EncodingSettings__Group__42687);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1299:1: rule__EncodingSettings__Group__4__Impl : ( 'endianness' ) ;
    public final void rule__EncodingSettings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1303:1: ( ( 'endianness' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1304:1: ( 'endianness' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1304:1: ( 'endianness' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1305:1: 'endianness'
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__EncodingSettings__Group__4__Impl2715); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1318:1: rule__EncodingSettings__Group__5 : rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 ;
    public final void rule__EncodingSettings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1322:1: ( rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1323:2: rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__5__Impl_in_rule__EncodingSettings__Group__52746);
            rule__EncodingSettings__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__6_in_rule__EncodingSettings__Group__52749);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1330:1: rule__EncodingSettings__Group__5__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1334:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1335:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1335:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1336:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_5()); 
            match(input,32,FOLLOW_32_in_rule__EncodingSettings__Group__5__Impl2777); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1349:1: rule__EncodingSettings__Group__6 : rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 ;
    public final void rule__EncodingSettings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1353:1: ( rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1354:2: rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__6__Impl_in_rule__EncodingSettings__Group__62808);
            rule__EncodingSettings__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__7_in_rule__EncodingSettings__Group__62811);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1361:1: rule__EncodingSettings__Group__6__Impl : ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) ;
    public final void rule__EncodingSettings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1365:1: ( ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1366:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1366:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1367:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1368:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1368:2: rule__EncodingSettings__EndiannessAssignment_6
            {
            pushFollow(FOLLOW_rule__EncodingSettings__EndiannessAssignment_6_in_rule__EncodingSettings__Group__6__Impl2838);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1378:1: rule__EncodingSettings__Group__7 : rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 ;
    public final void rule__EncodingSettings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1382:1: ( rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1383:2: rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__7__Impl_in_rule__EncodingSettings__Group__72868);
            rule__EncodingSettings__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__8_in_rule__EncodingSettings__Group__72871);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1390:1: rule__EncodingSettings__Group__7__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1394:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1395:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1395:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1396:1: ','
            {
             before(grammarAccess.getEncodingSettingsAccess().getCommaKeyword_7()); 
            match(input,34,FOLLOW_34_in_rule__EncodingSettings__Group__7__Impl2899); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1409:1: rule__EncodingSettings__Group__8 : rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 ;
    public final void rule__EncodingSettings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1413:1: ( rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1414:2: rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__8__Impl_in_rule__EncodingSettings__Group__82930);
            rule__EncodingSettings__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__9_in_rule__EncodingSettings__Group__82933);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1421:1: rule__EncodingSettings__Group__8__Impl : ( 'alignment' ) ;
    public final void rule__EncodingSettings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1425:1: ( ( 'alignment' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1426:1: ( 'alignment' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1426:1: ( 'alignment' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1427:1: 'alignment'
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentKeyword_8()); 
            match(input,36,FOLLOW_36_in_rule__EncodingSettings__Group__8__Impl2961); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1440:1: rule__EncodingSettings__Group__9 : rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 ;
    public final void rule__EncodingSettings__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1444:1: ( rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1445:2: rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__9__Impl_in_rule__EncodingSettings__Group__92992);
            rule__EncodingSettings__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__10_in_rule__EncodingSettings__Group__92995);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1452:1: rule__EncodingSettings__Group__9__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1456:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1457:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1457:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1458:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_9()); 
            match(input,32,FOLLOW_32_in_rule__EncodingSettings__Group__9__Impl3023); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1471:1: rule__EncodingSettings__Group__10 : rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 ;
    public final void rule__EncodingSettings__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1475:1: ( rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1476:2: rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__10__Impl_in_rule__EncodingSettings__Group__103054);
            rule__EncodingSettings__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__11_in_rule__EncodingSettings__Group__103057);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1483:1: rule__EncodingSettings__Group__10__Impl : ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) ;
    public final void rule__EncodingSettings__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1487:1: ( ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1488:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1488:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1489:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentAssignment_10()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1490:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1490:2: rule__EncodingSettings__AlignmentAssignment_10
            {
            pushFollow(FOLLOW_rule__EncodingSettings__AlignmentAssignment_10_in_rule__EncodingSettings__Group__10__Impl3084);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1500:1: rule__EncodingSettings__Group__11 : rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 ;
    public final void rule__EncodingSettings__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1504:1: ( rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1505:2: rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__11__Impl_in_rule__EncodingSettings__Group__113114);
            rule__EncodingSettings__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group__12_in_rule__EncodingSettings__Group__113117);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1512:1: rule__EncodingSettings__Group__11__Impl : ( 'BIT' ) ;
    public final void rule__EncodingSettings__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1516:1: ( ( 'BIT' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1517:1: ( 'BIT' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1517:1: ( 'BIT' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1518:1: 'BIT'
            {
             before(grammarAccess.getEncodingSettingsAccess().getBITKeyword_11()); 
            match(input,37,FOLLOW_37_in_rule__EncodingSettings__Group__11__Impl3145); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1531:1: rule__EncodingSettings__Group__12 : rule__EncodingSettings__Group__12__Impl ;
    public final void rule__EncodingSettings__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1535:1: ( rule__EncodingSettings__Group__12__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1536:2: rule__EncodingSettings__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group__12__Impl_in_rule__EncodingSettings__Group__123176);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1542:1: rule__EncodingSettings__Group__12__Impl : ( ( rule__EncodingSettings__Group_12__0 )? ) ;
    public final void rule__EncodingSettings__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1546:1: ( ( ( rule__EncodingSettings__Group_12__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1547:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1547:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1548:1: ( rule__EncodingSettings__Group_12__0 )?
            {
             before(grammarAccess.getEncodingSettingsAccess().getGroup_12()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1549:1: ( rule__EncodingSettings__Group_12__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1549:2: rule__EncodingSettings__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__EncodingSettings__Group_12__0_in_rule__EncodingSettings__Group__12__Impl3203);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1585:1: rule__EncodingSettings__Group_12__0 : rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 ;
    public final void rule__EncodingSettings__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1589:1: ( rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1590:2: rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group_12__0__Impl_in_rule__EncodingSettings__Group_12__03260);
            rule__EncodingSettings__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group_12__1_in_rule__EncodingSettings__Group_12__03263);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1597:1: rule__EncodingSettings__Group_12__0__Impl : ( 'with identifier' ) ;
    public final void rule__EncodingSettings__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1601:1: ( ( 'with identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1602:1: ( 'with identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1602:1: ( 'with identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1603:1: 'with identifier'
            {
             before(grammarAccess.getEncodingSettingsAccess().getWithIdentifierKeyword_12_0()); 
            match(input,31,FOLLOW_31_in_rule__EncodingSettings__Group_12__0__Impl3291); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1616:1: rule__EncodingSettings__Group_12__1 : rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 ;
    public final void rule__EncodingSettings__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1620:1: ( rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1621:2: rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group_12__1__Impl_in_rule__EncodingSettings__Group_12__13322);
            rule__EncodingSettings__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EncodingSettings__Group_12__2_in_rule__EncodingSettings__Group_12__13325);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1628:1: rule__EncodingSettings__Group_12__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1632:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1633:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1633:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1634:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_12_1()); 
            match(input,32,FOLLOW_32_in_rule__EncodingSettings__Group_12__1__Impl3353); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1647:1: rule__EncodingSettings__Group_12__2 : rule__EncodingSettings__Group_12__2__Impl ;
    public final void rule__EncodingSettings__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1651:1: ( rule__EncodingSettings__Group_12__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1652:2: rule__EncodingSettings__Group_12__2__Impl
            {
            pushFollow(FOLLOW_rule__EncodingSettings__Group_12__2__Impl_in_rule__EncodingSettings__Group_12__23384);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1658:1: rule__EncodingSettings__Group_12__2__Impl : ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) ;
    public final void rule__EncodingSettings__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1662:1: ( ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1663:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1663:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1664:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getIDAssignment_12_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1665:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1665:2: rule__EncodingSettings__IDAssignment_12_2
            {
            pushFollow(FOLLOW_rule__EncodingSettings__IDAssignment_12_2_in_rule__EncodingSettings__Group_12__2__Impl3411);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1681:1: rule__SensorDataDescription__Group__0 : rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 ;
    public final void rule__SensorDataDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1685:1: ( rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1686:2: rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__0__Impl_in_rule__SensorDataDescription__Group__03447);
            rule__SensorDataDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__1_in_rule__SensorDataDescription__Group__03450);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1693:1: rule__SensorDataDescription__Group__0__Impl : ( 'sensorData' ) ;
    public final void rule__SensorDataDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1697:1: ( ( 'sensorData' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1698:1: ( 'sensorData' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1698:1: ( 'sensorData' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1699:1: 'sensorData'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSensorDataKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__SensorDataDescription__Group__0__Impl3478); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1712:1: rule__SensorDataDescription__Group__1 : rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 ;
    public final void rule__SensorDataDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1716:1: ( rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1717:2: rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__1__Impl_in_rule__SensorDataDescription__Group__13509);
            rule__SensorDataDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__2_in_rule__SensorDataDescription__Group__13512);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1724:1: rule__SensorDataDescription__Group__1__Impl : ( () ) ;
    public final void rule__SensorDataDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1728:1: ( ( () ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1729:1: ( () )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1729:1: ( () )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1730:1: ()
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1731:1: ()
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1733:1: 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1743:1: rule__SensorDataDescription__Group__2 : rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 ;
    public final void rule__SensorDataDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1747:1: ( rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1748:2: rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__2__Impl_in_rule__SensorDataDescription__Group__23570);
            rule__SensorDataDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__3_in_rule__SensorDataDescription__Group__23573);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1755:1: rule__SensorDataDescription__Group__2__Impl : ( ( rule__SensorDataDescription__Group_2__0 )? ) ;
    public final void rule__SensorDataDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1759:1: ( ( ( rule__SensorDataDescription__Group_2__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1760:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1760:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1761:1: ( rule__SensorDataDescription__Group_2__0 )?
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1762:1: ( rule__SensorDataDescription__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1762:2: rule__SensorDataDescription__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SensorDataDescription__Group_2__0_in_rule__SensorDataDescription__Group__2__Impl3600);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1772:1: rule__SensorDataDescription__Group__3 : rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 ;
    public final void rule__SensorDataDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1776:1: ( rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1777:2: rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__3__Impl_in_rule__SensorDataDescription__Group__33631);
            rule__SensorDataDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__4_in_rule__SensorDataDescription__Group__33634);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1784:1: rule__SensorDataDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__SensorDataDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1788:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1789:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1789:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1790:1: '{'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__SensorDataDescription__Group__3__Impl3662); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1803:1: rule__SensorDataDescription__Group__4 : rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 ;
    public final void rule__SensorDataDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1807:1: ( rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1808:2: rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__4__Impl_in_rule__SensorDataDescription__Group__43693);
            rule__SensorDataDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group__5_in_rule__SensorDataDescription__Group__43696);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1815:1: rule__SensorDataDescription__Group__4__Impl : ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) ;
    public final void rule__SensorDataDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1819:1: ( ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1820:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1820:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1821:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1822:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1822:2: rule__SensorDataDescription__DataSetsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SensorDataDescription__DataSetsAssignment_4_in_rule__SensorDataDescription__Group__4__Impl3723);
            	    rule__SensorDataDescription__DataSetsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1832:1: rule__SensorDataDescription__Group__5 : rule__SensorDataDescription__Group__5__Impl ;
    public final void rule__SensorDataDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1836:1: ( rule__SensorDataDescription__Group__5__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1837:2: rule__SensorDataDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group__5__Impl_in_rule__SensorDataDescription__Group__53754);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1843:1: rule__SensorDataDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__SensorDataDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1847:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1848:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1848:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1849:1: '}'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__SensorDataDescription__Group__5__Impl3782); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1874:1: rule__SensorDataDescription__Group_2__0 : rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 ;
    public final void rule__SensorDataDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1878:1: ( rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1879:2: rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group_2__0__Impl_in_rule__SensorDataDescription__Group_2__03825);
            rule__SensorDataDescription__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group_2__1_in_rule__SensorDataDescription__Group_2__03828);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1886:1: rule__SensorDataDescription__Group_2__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorDataDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1890:1: ( ( 'with identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1891:1: ( 'with identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1891:1: ( 'with identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1892:1: 'with identifier'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getWithIdentifierKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__SensorDataDescription__Group_2__0__Impl3856); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1905:1: rule__SensorDataDescription__Group_2__1 : rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 ;
    public final void rule__SensorDataDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1909:1: ( rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1910:2: rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group_2__1__Impl_in_rule__SensorDataDescription__Group_2__13887);
            rule__SensorDataDescription__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorDataDescription__Group_2__2_in_rule__SensorDataDescription__Group_2__13890);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1917:1: rule__SensorDataDescription__Group_2__1__Impl : ( ':' ) ;
    public final void rule__SensorDataDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1921:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1922:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1922:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1923:1: ':'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getColonKeyword_2_1()); 
            match(input,32,FOLLOW_32_in_rule__SensorDataDescription__Group_2__1__Impl3918); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1936:1: rule__SensorDataDescription__Group_2__2 : rule__SensorDataDescription__Group_2__2__Impl ;
    public final void rule__SensorDataDescription__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1940:1: ( rule__SensorDataDescription__Group_2__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1941:2: rule__SensorDataDescription__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__Group_2__2__Impl_in_rule__SensorDataDescription__Group_2__23949);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1947:1: rule__SensorDataDescription__Group_2__2__Impl : ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) ;
    public final void rule__SensorDataDescription__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1951:1: ( ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1952:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1952:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1953:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDAssignment_2_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1954:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1954:2: rule__SensorDataDescription__IDAssignment_2_2
            {
            pushFollow(FOLLOW_rule__SensorDataDescription__IDAssignment_2_2_in_rule__SensorDataDescription__Group_2__2__Impl3976);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1970:1: rule__DataSet__Group__0 : rule__DataSet__Group__0__Impl rule__DataSet__Group__1 ;
    public final void rule__DataSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1974:1: ( rule__DataSet__Group__0__Impl rule__DataSet__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1975:2: rule__DataSet__Group__0__Impl rule__DataSet__Group__1
            {
            pushFollow(FOLLOW_rule__DataSet__Group__0__Impl_in_rule__DataSet__Group__04012);
            rule__DataSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__1_in_rule__DataSet__Group__04015);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1982:1: rule__DataSet__Group__0__Impl : ( 'dataSet' ) ;
    public final void rule__DataSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1986:1: ( ( 'dataSet' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1987:1: ( 'dataSet' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1987:1: ( 'dataSet' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:1988:1: 'dataSet'
            {
             before(grammarAccess.getDataSetAccess().getDataSetKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__DataSet__Group__0__Impl4043); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2001:1: rule__DataSet__Group__1 : rule__DataSet__Group__1__Impl rule__DataSet__Group__2 ;
    public final void rule__DataSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2005:1: ( rule__DataSet__Group__1__Impl rule__DataSet__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2006:2: rule__DataSet__Group__1__Impl rule__DataSet__Group__2
            {
            pushFollow(FOLLOW_rule__DataSet__Group__1__Impl_in_rule__DataSet__Group__14074);
            rule__DataSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__2_in_rule__DataSet__Group__14077);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2013:1: rule__DataSet__Group__1__Impl : ( ( rule__DataSet__NameAssignment_1 ) ) ;
    public final void rule__DataSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2017:1: ( ( ( rule__DataSet__NameAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2018:1: ( ( rule__DataSet__NameAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2018:1: ( ( rule__DataSet__NameAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2019:1: ( rule__DataSet__NameAssignment_1 )
            {
             before(grammarAccess.getDataSetAccess().getNameAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2020:1: ( rule__DataSet__NameAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2020:2: rule__DataSet__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataSet__NameAssignment_1_in_rule__DataSet__Group__1__Impl4104);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2030:1: rule__DataSet__Group__2 : rule__DataSet__Group__2__Impl rule__DataSet__Group__3 ;
    public final void rule__DataSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2034:1: ( rule__DataSet__Group__2__Impl rule__DataSet__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2035:2: rule__DataSet__Group__2__Impl rule__DataSet__Group__3
            {
            pushFollow(FOLLOW_rule__DataSet__Group__2__Impl_in_rule__DataSet__Group__24134);
            rule__DataSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__3_in_rule__DataSet__Group__24137);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2042:1: rule__DataSet__Group__2__Impl : ( ( rule__DataSet__Group_2__0 )? ) ;
    public final void rule__DataSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2046:1: ( ( ( rule__DataSet__Group_2__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2047:1: ( ( rule__DataSet__Group_2__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2047:1: ( ( rule__DataSet__Group_2__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2048:1: ( rule__DataSet__Group_2__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2049:1: ( rule__DataSet__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2049:2: rule__DataSet__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DataSet__Group_2__0_in_rule__DataSet__Group__2__Impl4164);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2059:1: rule__DataSet__Group__3 : rule__DataSet__Group__3__Impl rule__DataSet__Group__4 ;
    public final void rule__DataSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2063:1: ( rule__DataSet__Group__3__Impl rule__DataSet__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2064:2: rule__DataSet__Group__3__Impl rule__DataSet__Group__4
            {
            pushFollow(FOLLOW_rule__DataSet__Group__3__Impl_in_rule__DataSet__Group__34195);
            rule__DataSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__4_in_rule__DataSet__Group__34198);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2071:1: rule__DataSet__Group__3__Impl : ( ( rule__DataSet__Group_3__0 )? ) ;
    public final void rule__DataSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2075:1: ( ( ( rule__DataSet__Group_3__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2076:1: ( ( rule__DataSet__Group_3__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2076:1: ( ( rule__DataSet__Group_3__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2077:1: ( rule__DataSet__Group_3__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2078:1: ( rule__DataSet__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2078:2: rule__DataSet__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DataSet__Group_3__0_in_rule__DataSet__Group__3__Impl4225);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2088:1: rule__DataSet__Group__4 : rule__DataSet__Group__4__Impl rule__DataSet__Group__5 ;
    public final void rule__DataSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2092:1: ( rule__DataSet__Group__4__Impl rule__DataSet__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2093:2: rule__DataSet__Group__4__Impl rule__DataSet__Group__5
            {
            pushFollow(FOLLOW_rule__DataSet__Group__4__Impl_in_rule__DataSet__Group__44256);
            rule__DataSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__5_in_rule__DataSet__Group__44259);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2100:1: rule__DataSet__Group__4__Impl : ( ( rule__DataSet__DescriptionAssignment_4 )? ) ;
    public final void rule__DataSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2104:1: ( ( ( rule__DataSet__DescriptionAssignment_4 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2105:1: ( ( rule__DataSet__DescriptionAssignment_4 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2105:1: ( ( rule__DataSet__DescriptionAssignment_4 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2106:1: ( rule__DataSet__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getDataSetAccess().getDescriptionAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2107:1: ( rule__DataSet__DescriptionAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DESCRIPTION) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2107:2: rule__DataSet__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__DataSet__DescriptionAssignment_4_in_rule__DataSet__Group__4__Impl4286);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2117:1: rule__DataSet__Group__5 : rule__DataSet__Group__5__Impl rule__DataSet__Group__6 ;
    public final void rule__DataSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2121:1: ( rule__DataSet__Group__5__Impl rule__DataSet__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2122:2: rule__DataSet__Group__5__Impl rule__DataSet__Group__6
            {
            pushFollow(FOLLOW_rule__DataSet__Group__5__Impl_in_rule__DataSet__Group__54317);
            rule__DataSet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__6_in_rule__DataSet__Group__54320);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2129:1: rule__DataSet__Group__5__Impl : ( '{' ) ;
    public final void rule__DataSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2133:1: ( ( '{' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2134:1: ( '{' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2134:1: ( '{' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2135:1: '{'
            {
             before(grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__DataSet__Group__5__Impl4348); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2148:1: rule__DataSet__Group__6 : rule__DataSet__Group__6__Impl rule__DataSet__Group__7 ;
    public final void rule__DataSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2152:1: ( rule__DataSet__Group__6__Impl rule__DataSet__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2153:2: rule__DataSet__Group__6__Impl rule__DataSet__Group__7
            {
            pushFollow(FOLLOW_rule__DataSet__Group__6__Impl_in_rule__DataSet__Group__64379);
            rule__DataSet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group__7_in_rule__DataSet__Group__64382);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2160:1: rule__DataSet__Group__6__Impl : ( ( rule__DataSet__DataAssignment_6 )* ) ;
    public final void rule__DataSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2164:1: ( ( ( rule__DataSet__DataAssignment_6 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2165:1: ( ( rule__DataSet__DataAssignment_6 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2165:1: ( ( rule__DataSet__DataAssignment_6 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2166:1: ( rule__DataSet__DataAssignment_6 )*
            {
             before(grammarAccess.getDataSetAccess().getDataAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2167:1: ( rule__DataSet__DataAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2167:2: rule__DataSet__DataAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__DataSet__DataAssignment_6_in_rule__DataSet__Group__6__Impl4409);
            	    rule__DataSet__DataAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2177:1: rule__DataSet__Group__7 : rule__DataSet__Group__7__Impl ;
    public final void rule__DataSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2181:1: ( rule__DataSet__Group__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2182:2: rule__DataSet__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__DataSet__Group__7__Impl_in_rule__DataSet__Group__74440);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2188:1: rule__DataSet__Group__7__Impl : ( '}' ) ;
    public final void rule__DataSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2192:1: ( ( '}' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2193:1: ( '}' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2193:1: ( '}' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2194:1: '}'
            {
             before(grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_30_in_rule__DataSet__Group__7__Impl4468); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2223:1: rule__DataSet__Group_2__0 : rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 ;
    public final void rule__DataSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2227:1: ( rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2228:2: rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1
            {
            pushFollow(FOLLOW_rule__DataSet__Group_2__0__Impl_in_rule__DataSet__Group_2__04515);
            rule__DataSet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group_2__1_in_rule__DataSet__Group_2__04518);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2235:1: rule__DataSet__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__DataSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2239:1: ( ( 'uses' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2240:1: ( 'uses' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2240:1: ( 'uses' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2241:1: 'uses'
            {
             before(grammarAccess.getDataSetAccess().getUsesKeyword_2_0()); 
            match(input,40,FOLLOW_40_in_rule__DataSet__Group_2__0__Impl4546); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2254:1: rule__DataSet__Group_2__1 : rule__DataSet__Group_2__1__Impl ;
    public final void rule__DataSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2258:1: ( rule__DataSet__Group_2__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2259:2: rule__DataSet__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DataSet__Group_2__1__Impl_in_rule__DataSet__Group_2__14577);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2265:1: rule__DataSet__Group_2__1__Impl : ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) ) ;
    public final void rule__DataSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2269:1: ( ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2270:1: ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2270:1: ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2271:1: ( rule__DataSet__ParentDataSetAssignment_2_1 )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetAssignment_2_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2272:1: ( rule__DataSet__ParentDataSetAssignment_2_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2272:2: rule__DataSet__ParentDataSetAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DataSet__ParentDataSetAssignment_2_1_in_rule__DataSet__Group_2__1__Impl4604);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2286:1: rule__DataSet__Group_3__0 : rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 ;
    public final void rule__DataSet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2290:1: ( rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2291:2: rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1
            {
            pushFollow(FOLLOW_rule__DataSet__Group_3__0__Impl_in_rule__DataSet__Group_3__04638);
            rule__DataSet__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group_3__1_in_rule__DataSet__Group_3__04641);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2298:1: rule__DataSet__Group_3__0__Impl : ( 'with identifier' ) ;
    public final void rule__DataSet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2302:1: ( ( 'with identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2303:1: ( 'with identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2303:1: ( 'with identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2304:1: 'with identifier'
            {
             before(grammarAccess.getDataSetAccess().getWithIdentifierKeyword_3_0()); 
            match(input,31,FOLLOW_31_in_rule__DataSet__Group_3__0__Impl4669); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2317:1: rule__DataSet__Group_3__1 : rule__DataSet__Group_3__1__Impl rule__DataSet__Group_3__2 ;
    public final void rule__DataSet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2321:1: ( rule__DataSet__Group_3__1__Impl rule__DataSet__Group_3__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2322:2: rule__DataSet__Group_3__1__Impl rule__DataSet__Group_3__2
            {
            pushFollow(FOLLOW_rule__DataSet__Group_3__1__Impl_in_rule__DataSet__Group_3__14700);
            rule__DataSet__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataSet__Group_3__2_in_rule__DataSet__Group_3__14703);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2329:1: rule__DataSet__Group_3__1__Impl : ( ':' ) ;
    public final void rule__DataSet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2333:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2334:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2334:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2335:1: ':'
            {
             before(grammarAccess.getDataSetAccess().getColonKeyword_3_1()); 
            match(input,32,FOLLOW_32_in_rule__DataSet__Group_3__1__Impl4731); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2348:1: rule__DataSet__Group_3__2 : rule__DataSet__Group_3__2__Impl ;
    public final void rule__DataSet__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2352:1: ( rule__DataSet__Group_3__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2353:2: rule__DataSet__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__DataSet__Group_3__2__Impl_in_rule__DataSet__Group_3__24762);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2359:1: rule__DataSet__Group_3__2__Impl : ( ( rule__DataSet__IDAssignment_3_2 ) ) ;
    public final void rule__DataSet__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2363:1: ( ( ( rule__DataSet__IDAssignment_3_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2364:1: ( ( rule__DataSet__IDAssignment_3_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2364:1: ( ( rule__DataSet__IDAssignment_3_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2365:1: ( rule__DataSet__IDAssignment_3_2 )
            {
             before(grammarAccess.getDataSetAccess().getIDAssignment_3_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2366:1: ( rule__DataSet__IDAssignment_3_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2366:2: rule__DataSet__IDAssignment_3_2
            {
            pushFollow(FOLLOW_rule__DataSet__IDAssignment_3_2_in_rule__DataSet__Group_3__2__Impl4789);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2382:1: rule__MeasurementData__Group__0 : rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 ;
    public final void rule__MeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2386:1: ( rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2387:2: rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__0__Impl_in_rule__MeasurementData__Group__04825);
            rule__MeasurementData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__1_in_rule__MeasurementData__Group__04828);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2394:1: rule__MeasurementData__Group__0__Impl : ( ( rule__MeasurementData__NameAssignment_0 ) ) ;
    public final void rule__MeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2398:1: ( ( ( rule__MeasurementData__NameAssignment_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2399:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2399:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2400:1: ( rule__MeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getNameAssignment_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2401:1: ( rule__MeasurementData__NameAssignment_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2401:2: rule__MeasurementData__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MeasurementData__NameAssignment_0_in_rule__MeasurementData__Group__0__Impl4855);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2411:1: rule__MeasurementData__Group__1 : rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 ;
    public final void rule__MeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2415:1: ( rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2416:2: rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__1__Impl_in_rule__MeasurementData__Group__14885);
            rule__MeasurementData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__2_in_rule__MeasurementData__Group__14888);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2423:1: rule__MeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2427:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2428:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2428:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2429:1: 'as'
            {
             before(grammarAccess.getMeasurementDataAccess().getAsKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__MeasurementData__Group__1__Impl4916); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2442:1: rule__MeasurementData__Group__2 : rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 ;
    public final void rule__MeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2446:1: ( rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2447:2: rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__2__Impl_in_rule__MeasurementData__Group__24947);
            rule__MeasurementData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__3_in_rule__MeasurementData__Group__24950);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2454:1: rule__MeasurementData__Group__2__Impl : ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2458:1: ( ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2459:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2459:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2460:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2461:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2461:2: rule__MeasurementData__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__MeasurementData__DataTypeAssignment_2_in_rule__MeasurementData__Group__2__Impl4977);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2471:1: rule__MeasurementData__Group__3 : rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 ;
    public final void rule__MeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2475:1: ( rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2476:2: rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__3__Impl_in_rule__MeasurementData__Group__35007);
            rule__MeasurementData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__4_in_rule__MeasurementData__Group__35010);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2483:1: rule__MeasurementData__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2487:1: ( ( 'in' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2488:1: ( 'in' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2488:1: ( 'in' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2489:1: 'in'
            {
             before(grammarAccess.getMeasurementDataAccess().getInKeyword_3()); 
            match(input,42,FOLLOW_42_in_rule__MeasurementData__Group__3__Impl5038); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2502:1: rule__MeasurementData__Group__4 : rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 ;
    public final void rule__MeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2506:1: ( rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2507:2: rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__4__Impl_in_rule__MeasurementData__Group__45069);
            rule__MeasurementData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__5_in_rule__MeasurementData__Group__45072);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2514:1: rule__MeasurementData__Group__4__Impl : ( ( rule__MeasurementData__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2518:1: ( ( ( rule__MeasurementData__UnitAssignment_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2519:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2519:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2520:1: ( rule__MeasurementData__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2521:1: ( rule__MeasurementData__UnitAssignment_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2521:2: rule__MeasurementData__UnitAssignment_4
            {
            pushFollow(FOLLOW_rule__MeasurementData__UnitAssignment_4_in_rule__MeasurementData__Group__4__Impl5099);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2531:1: rule__MeasurementData__Group__5 : rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 ;
    public final void rule__MeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2535:1: ( rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2536:2: rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__5__Impl_in_rule__MeasurementData__Group__55129);
            rule__MeasurementData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__6_in_rule__MeasurementData__Group__55132);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2543:1: rule__MeasurementData__Group__5__Impl : ( ( rule__MeasurementData__Group_5__0 )? ) ;
    public final void rule__MeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2547:1: ( ( ( rule__MeasurementData__Group_5__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2548:1: ( ( rule__MeasurementData__Group_5__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2548:1: ( ( rule__MeasurementData__Group_5__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2549:1: ( rule__MeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2550:1: ( rule__MeasurementData__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2550:2: rule__MeasurementData__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MeasurementData__Group_5__0_in_rule__MeasurementData__Group__5__Impl5159);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2560:1: rule__MeasurementData__Group__6 : rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 ;
    public final void rule__MeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2564:1: ( rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2565:2: rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__6__Impl_in_rule__MeasurementData__Group__65190);
            rule__MeasurementData__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group__7_in_rule__MeasurementData__Group__65193);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2572:1: rule__MeasurementData__Group__6__Impl : ( ( rule__MeasurementData__Group_6__0 )? ) ;
    public final void rule__MeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2576:1: ( ( ( rule__MeasurementData__Group_6__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2577:1: ( ( rule__MeasurementData__Group_6__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2577:1: ( ( rule__MeasurementData__Group_6__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2578:1: ( rule__MeasurementData__Group_6__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2579:1: ( rule__MeasurementData__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2579:2: rule__MeasurementData__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__MeasurementData__Group_6__0_in_rule__MeasurementData__Group__6__Impl5220);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2589:1: rule__MeasurementData__Group__7 : rule__MeasurementData__Group__7__Impl ;
    public final void rule__MeasurementData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2593:1: ( rule__MeasurementData__Group__7__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2594:2: rule__MeasurementData__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group__7__Impl_in_rule__MeasurementData__Group__75251);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2600:1: rule__MeasurementData__Group__7__Impl : ( ( rule__MeasurementData__DescriptionAssignment_7 )? ) ;
    public final void rule__MeasurementData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2604:1: ( ( ( rule__MeasurementData__DescriptionAssignment_7 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2605:1: ( ( rule__MeasurementData__DescriptionAssignment_7 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2605:1: ( ( rule__MeasurementData__DescriptionAssignment_7 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2606:1: ( rule__MeasurementData__DescriptionAssignment_7 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionAssignment_7()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2607:1: ( rule__MeasurementData__DescriptionAssignment_7 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DESCRIPTION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2607:2: rule__MeasurementData__DescriptionAssignment_7
                    {
                    pushFollow(FOLLOW_rule__MeasurementData__DescriptionAssignment_7_in_rule__MeasurementData__Group__7__Impl5278);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2633:1: rule__MeasurementData__Group_5__0 : rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 ;
    public final void rule__MeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2637:1: ( rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2638:2: rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_5__0__Impl_in_rule__MeasurementData__Group_5__05325);
            rule__MeasurementData__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_5__1_in_rule__MeasurementData__Group_5__05328);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2645:1: rule__MeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2649:1: ( ( 'with identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2650:1: ( 'with identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2650:1: ( 'with identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2651:1: 'with identifier'
            {
             before(grammarAccess.getMeasurementDataAccess().getWithIdentifierKeyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__MeasurementData__Group_5__0__Impl5356); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2664:1: rule__MeasurementData__Group_5__1 : rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 ;
    public final void rule__MeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2668:1: ( rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2669:2: rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_5__1__Impl_in_rule__MeasurementData__Group_5__15387);
            rule__MeasurementData__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_5__2_in_rule__MeasurementData__Group_5__15390);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2676:1: rule__MeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2680:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2681:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2681:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2682:1: ':'
            {
             before(grammarAccess.getMeasurementDataAccess().getColonKeyword_5_1()); 
            match(input,32,FOLLOW_32_in_rule__MeasurementData__Group_5__1__Impl5418); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2695:1: rule__MeasurementData__Group_5__2 : rule__MeasurementData__Group_5__2__Impl ;
    public final void rule__MeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2699:1: ( rule__MeasurementData__Group_5__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2700:2: rule__MeasurementData__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_5__2__Impl_in_rule__MeasurementData__Group_5__25449);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2706:1: rule__MeasurementData__Group_5__2__Impl : ( ( rule__MeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2710:1: ( ( ( rule__MeasurementData__IDAssignment_5_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2711:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2711:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2712:1: ( rule__MeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getIDAssignment_5_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2713:1: ( rule__MeasurementData__IDAssignment_5_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2713:2: rule__MeasurementData__IDAssignment_5_2
            {
            pushFollow(FOLLOW_rule__MeasurementData__IDAssignment_5_2_in_rule__MeasurementData__Group_5__2__Impl5476);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2729:1: rule__MeasurementData__Group_6__0 : rule__MeasurementData__Group_6__0__Impl rule__MeasurementData__Group_6__1 ;
    public final void rule__MeasurementData__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2733:1: ( rule__MeasurementData__Group_6__0__Impl rule__MeasurementData__Group_6__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2734:2: rule__MeasurementData__Group_6__0__Impl rule__MeasurementData__Group_6__1
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6__0__Impl_in_rule__MeasurementData__Group_6__05512);
            rule__MeasurementData__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_6__1_in_rule__MeasurementData__Group_6__05515);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2741:1: rule__MeasurementData__Group_6__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2745:1: ( ( 'adjusted' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2746:1: ( 'adjusted' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2746:1: ( 'adjusted' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2747:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0()); 
            match(input,43,FOLLOW_43_in_rule__MeasurementData__Group_6__0__Impl5543); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2760:1: rule__MeasurementData__Group_6__1 : rule__MeasurementData__Group_6__1__Impl rule__MeasurementData__Group_6__2 ;
    public final void rule__MeasurementData__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2764:1: ( rule__MeasurementData__Group_6__1__Impl rule__MeasurementData__Group_6__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2765:2: rule__MeasurementData__Group_6__1__Impl rule__MeasurementData__Group_6__2
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6__1__Impl_in_rule__MeasurementData__Group_6__15574);
            rule__MeasurementData__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_6__2_in_rule__MeasurementData__Group_6__15577);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2772:1: rule__MeasurementData__Group_6__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_1 ) ) ;
    public final void rule__MeasurementData__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2776:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2777:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2777:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2778:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2779:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2779:2: rule__MeasurementData__AdjustmentsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__MeasurementData__AdjustmentsAssignment_6_1_in_rule__MeasurementData__Group_6__1__Impl5604);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2789:1: rule__MeasurementData__Group_6__2 : rule__MeasurementData__Group_6__2__Impl ;
    public final void rule__MeasurementData__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2793:1: ( rule__MeasurementData__Group_6__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2794:2: rule__MeasurementData__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6__2__Impl_in_rule__MeasurementData__Group_6__25634);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2800:1: rule__MeasurementData__Group_6__2__Impl : ( ( rule__MeasurementData__Group_6_2__0 )* ) ;
    public final void rule__MeasurementData__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2804:1: ( ( ( rule__MeasurementData__Group_6_2__0 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2805:1: ( ( rule__MeasurementData__Group_6_2__0 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2805:1: ( ( rule__MeasurementData__Group_6_2__0 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2806:1: ( rule__MeasurementData__Group_6_2__0 )*
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_6_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2807:1: ( rule__MeasurementData__Group_6_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2807:2: rule__MeasurementData__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MeasurementData__Group_6_2__0_in_rule__MeasurementData__Group_6__2__Impl5661);
            	    rule__MeasurementData__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2823:1: rule__MeasurementData__Group_6_2__0 : rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 ;
    public final void rule__MeasurementData__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2827:1: ( rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2828:2: rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6_2__0__Impl_in_rule__MeasurementData__Group_6_2__05698);
            rule__MeasurementData__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementData__Group_6_2__1_in_rule__MeasurementData__Group_6_2__05701);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2835:1: rule__MeasurementData__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2839:1: ( ( ',' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2840:1: ( ',' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2840:1: ( ',' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2841:1: ','
            {
             before(grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_2_0()); 
            match(input,34,FOLLOW_34_in_rule__MeasurementData__Group_6_2__0__Impl5729); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2854:1: rule__MeasurementData__Group_6_2__1 : rule__MeasurementData__Group_6_2__1__Impl ;
    public final void rule__MeasurementData__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2858:1: ( rule__MeasurementData__Group_6_2__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2859:2: rule__MeasurementData__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementData__Group_6_2__1__Impl_in_rule__MeasurementData__Group_6_2__15760);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2865:1: rule__MeasurementData__Group_6_2__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) ;
    public final void rule__MeasurementData__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2869:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2870:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2870:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2871:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2872:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2872:2: rule__MeasurementData__AdjustmentsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__MeasurementData__AdjustmentsAssignment_6_2_1_in_rule__MeasurementData__Group_6_2__1__Impl5787);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2886:1: rule__NonMeasurementData__Group__0 : rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 ;
    public final void rule__NonMeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2890:1: ( rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2891:2: rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__0__Impl_in_rule__NonMeasurementData__Group__05821);
            rule__NonMeasurementData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__1_in_rule__NonMeasurementData__Group__05824);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2898:1: rule__NonMeasurementData__Group__0__Impl : ( ( rule__NonMeasurementData__NameAssignment_0 ) ) ;
    public final void rule__NonMeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2902:1: ( ( ( rule__NonMeasurementData__NameAssignment_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2903:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2903:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2904:1: ( rule__NonMeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameAssignment_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2905:1: ( rule__NonMeasurementData__NameAssignment_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2905:2: rule__NonMeasurementData__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__NameAssignment_0_in_rule__NonMeasurementData__Group__0__Impl5851);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2915:1: rule__NonMeasurementData__Group__1 : rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 ;
    public final void rule__NonMeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2919:1: ( rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2920:2: rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__1__Impl_in_rule__NonMeasurementData__Group__15881);
            rule__NonMeasurementData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__2_in_rule__NonMeasurementData__Group__15884);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2927:1: rule__NonMeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__NonMeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2931:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2932:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2932:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2933:1: 'as'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAsKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__NonMeasurementData__Group__1__Impl5912); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2946:1: rule__NonMeasurementData__Group__2 : rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 ;
    public final void rule__NonMeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2950:1: ( rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2951:2: rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__2__Impl_in_rule__NonMeasurementData__Group__25943);
            rule__NonMeasurementData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__3_in_rule__NonMeasurementData__Group__25946);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2958:1: rule__NonMeasurementData__Group__2__Impl : ( ( rule__NonMeasurementData__Alternatives_2 ) ) ;
    public final void rule__NonMeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2962:1: ( ( ( rule__NonMeasurementData__Alternatives_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2963:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2963:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2964:1: ( rule__NonMeasurementData__Alternatives_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2965:1: ( rule__NonMeasurementData__Alternatives_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2965:2: rule__NonMeasurementData__Alternatives_2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Alternatives_2_in_rule__NonMeasurementData__Group__2__Impl5973);
            rule__NonMeasurementData__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getAlternatives_2()); 

            }


            }

        }
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2975:1: rule__NonMeasurementData__Group__3 : rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 ;
    public final void rule__NonMeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2979:1: ( rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2980:2: rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__3__Impl_in_rule__NonMeasurementData__Group__36003);
            rule__NonMeasurementData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__4_in_rule__NonMeasurementData__Group__36006);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2987:1: rule__NonMeasurementData__Group__3__Impl : ( ( rule__NonMeasurementData__ConstantAssignment_3 )? ) ;
    public final void rule__NonMeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2991:1: ( ( ( rule__NonMeasurementData__ConstantAssignment_3 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2992:1: ( ( rule__NonMeasurementData__ConstantAssignment_3 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2992:1: ( ( rule__NonMeasurementData__ConstantAssignment_3 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2993:1: ( rule__NonMeasurementData__ConstantAssignment_3 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2994:1: ( rule__NonMeasurementData__ConstantAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==55) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:2994:2: rule__NonMeasurementData__ConstantAssignment_3
                    {
                    pushFollow(FOLLOW_rule__NonMeasurementData__ConstantAssignment_3_in_rule__NonMeasurementData__Group__3__Impl6033);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3004:1: rule__NonMeasurementData__Group__4 : rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 ;
    public final void rule__NonMeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3008:1: ( rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3009:2: rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__4__Impl_in_rule__NonMeasurementData__Group__46064);
            rule__NonMeasurementData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__5_in_rule__NonMeasurementData__Group__46067);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3016:1: rule__NonMeasurementData__Group__4__Impl : ( ( rule__NonMeasurementData__Group_4__0 )? ) ;
    public final void rule__NonMeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3020:1: ( ( ( rule__NonMeasurementData__Group_4__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3021:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3021:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3022:1: ( rule__NonMeasurementData__Group_4__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3023:1: ( rule__NonMeasurementData__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3023:2: rule__NonMeasurementData__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__NonMeasurementData__Group_4__0_in_rule__NonMeasurementData__Group__4__Impl6094);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3033:1: rule__NonMeasurementData__Group__5 : rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 ;
    public final void rule__NonMeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3037:1: ( rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3038:2: rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__5__Impl_in_rule__NonMeasurementData__Group__56125);
            rule__NonMeasurementData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group__6_in_rule__NonMeasurementData__Group__56128);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3045:1: rule__NonMeasurementData__Group__5__Impl : ( ( rule__NonMeasurementData__Group_5__0 )? ) ;
    public final void rule__NonMeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3049:1: ( ( ( rule__NonMeasurementData__Group_5__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3050:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3050:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3051:1: ( rule__NonMeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3052:1: ( rule__NonMeasurementData__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3052:2: rule__NonMeasurementData__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__NonMeasurementData__Group_5__0_in_rule__NonMeasurementData__Group__5__Impl6155);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3062:1: rule__NonMeasurementData__Group__6 : rule__NonMeasurementData__Group__6__Impl ;
    public final void rule__NonMeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3066:1: ( rule__NonMeasurementData__Group__6__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3067:2: rule__NonMeasurementData__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group__6__Impl_in_rule__NonMeasurementData__Group__66186);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3073:1: rule__NonMeasurementData__Group__6__Impl : ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? ) ;
    public final void rule__NonMeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3077:1: ( ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3078:1: ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3078:1: ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3079:1: ( rule__NonMeasurementData__DescriptionAssignment_6 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3080:1: ( rule__NonMeasurementData__DescriptionAssignment_6 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_DESCRIPTION) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3080:2: rule__NonMeasurementData__DescriptionAssignment_6
                    {
                    pushFollow(FOLLOW_rule__NonMeasurementData__DescriptionAssignment_6_in_rule__NonMeasurementData__Group__6__Impl6213);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3104:1: rule__NonMeasurementData__Group_4__0 : rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 ;
    public final void rule__NonMeasurementData__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3108:1: ( rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3109:2: rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_4__0__Impl_in_rule__NonMeasurementData__Group_4__06258);
            rule__NonMeasurementData__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group_4__1_in_rule__NonMeasurementData__Group_4__06261);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3116:1: rule__NonMeasurementData__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__NonMeasurementData__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3120:1: ( ( 'value' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3121:1: ( 'value' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3121:1: ( 'value' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3122:1: 'value'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_4_0()); 
            match(input,44,FOLLOW_44_in_rule__NonMeasurementData__Group_4__0__Impl6289); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3135:1: rule__NonMeasurementData__Group_4__1 : rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 ;
    public final void rule__NonMeasurementData__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3139:1: ( rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3140:2: rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_4__1__Impl_in_rule__NonMeasurementData__Group_4__16320);
            rule__NonMeasurementData__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group_4__2_in_rule__NonMeasurementData__Group_4__16323);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3147:1: rule__NonMeasurementData__Group_4__1__Impl : ( '=' ) ;
    public final void rule__NonMeasurementData__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3151:1: ( ( '=' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3152:1: ( '=' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3152:1: ( '=' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3153:1: '='
            {
             before(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4_1()); 
            match(input,45,FOLLOW_45_in_rule__NonMeasurementData__Group_4__1__Impl6351); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3166:1: rule__NonMeasurementData__Group_4__2 : rule__NonMeasurementData__Group_4__2__Impl ;
    public final void rule__NonMeasurementData__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3170:1: ( rule__NonMeasurementData__Group_4__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3171:2: rule__NonMeasurementData__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_4__2__Impl_in_rule__NonMeasurementData__Group_4__26382);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3177:1: rule__NonMeasurementData__Group_4__2__Impl : ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) ) ;
    public final void rule__NonMeasurementData__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3181:1: ( ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3182:1: ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3182:1: ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3183:1: ( rule__NonMeasurementData__ValueAssignment_4_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_4_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3184:1: ( rule__NonMeasurementData__ValueAssignment_4_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3184:2: rule__NonMeasurementData__ValueAssignment_4_2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__ValueAssignment_4_2_in_rule__NonMeasurementData__Group_4__2__Impl6409);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3200:1: rule__NonMeasurementData__Group_5__0 : rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 ;
    public final void rule__NonMeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3204:1: ( rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3205:2: rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_5__0__Impl_in_rule__NonMeasurementData__Group_5__06445);
            rule__NonMeasurementData__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group_5__1_in_rule__NonMeasurementData__Group_5__06448);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3212:1: rule__NonMeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__NonMeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3216:1: ( ( 'with identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3217:1: ( 'with identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3217:1: ( 'with identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3218:1: 'with identifier'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getWithIdentifierKeyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__NonMeasurementData__Group_5__0__Impl6476); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3231:1: rule__NonMeasurementData__Group_5__1 : rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2 ;
    public final void rule__NonMeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3235:1: ( rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3236:2: rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_5__1__Impl_in_rule__NonMeasurementData__Group_5__16507);
            rule__NonMeasurementData__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonMeasurementData__Group_5__2_in_rule__NonMeasurementData__Group_5__16510);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3243:1: rule__NonMeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__NonMeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3247:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3248:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3248:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3249:1: ':'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getColonKeyword_5_1()); 
            match(input,32,FOLLOW_32_in_rule__NonMeasurementData__Group_5__1__Impl6538); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3262:1: rule__NonMeasurementData__Group_5__2 : rule__NonMeasurementData__Group_5__2__Impl ;
    public final void rule__NonMeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3266:1: ( rule__NonMeasurementData__Group_5__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3267:2: rule__NonMeasurementData__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__Group_5__2__Impl_in_rule__NonMeasurementData__Group_5__26569);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3273:1: rule__NonMeasurementData__Group_5__2__Impl : ( ( rule__NonMeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__NonMeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3277:1: ( ( ( rule__NonMeasurementData__IDAssignment_5_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3278:1: ( ( rule__NonMeasurementData__IDAssignment_5_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3278:1: ( ( rule__NonMeasurementData__IDAssignment_5_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3279:1: ( rule__NonMeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDAssignment_5_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3280:1: ( rule__NonMeasurementData__IDAssignment_5_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3280:2: rule__NonMeasurementData__IDAssignment_5_2
            {
            pushFollow(FOLLOW_rule__NonMeasurementData__IDAssignment_5_2_in_rule__NonMeasurementData__Group_5__2__Impl6596);
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


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3296:1: rule__MeasurementDataNotAdjustable__Group__0 : rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3300:1: ( rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3301:2: rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group__0__Impl_in_rule__MeasurementDataNotAdjustable__Group__06632);
            rule__MeasurementDataNotAdjustable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group__1_in_rule__MeasurementDataNotAdjustable__Group__06635);
            rule__MeasurementDataNotAdjustable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__0"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3308:1: rule__MeasurementDataNotAdjustable__Group__0__Impl : ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3312:1: ( ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3313:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3313:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3314:1: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameAssignment_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3315:1: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3315:2: rule__MeasurementDataNotAdjustable__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__NameAssignment_0_in_rule__MeasurementDataNotAdjustable__Group__0__Impl6662);
            rule__MeasurementDataNotAdjustable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__0__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3325:1: rule__MeasurementDataNotAdjustable__Group__1 : rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3329:1: ( rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3330:2: rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group__1__Impl_in_rule__MeasurementDataNotAdjustable__Group__16692);
            rule__MeasurementDataNotAdjustable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group__2_in_rule__MeasurementDataNotAdjustable__Group__16695);
            rule__MeasurementDataNotAdjustable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__1"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3337:1: rule__MeasurementDataNotAdjustable__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3341:1: ( ( 'as' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3342:1: ( 'as' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3342:1: ( 'as' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3343:1: 'as'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getAsKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__MeasurementDataNotAdjustable__Group__1__Impl6723); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__1__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3356:1: rule__MeasurementDataNotAdjustable__Group__2 : rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 ;
    public final void rule__MeasurementDataNotAdjustable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3360:1: ( rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3361:2: rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group__2__Impl_in_rule__MeasurementDataNotAdjustable__Group__26754);
            rule__MeasurementDataNotAdjustable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group__3_in_rule__MeasurementDataNotAdjustable__Group__26757);
            rule__MeasurementDataNotAdjustable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__2"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3368:1: rule__MeasurementDataNotAdjustable__Group__2__Impl : ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3372:1: ( ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3373:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3373:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3374:1: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3375:1: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3375:2: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__DataTypeAssignment_2_in_rule__MeasurementDataNotAdjustable__Group__2__Impl6784);
            rule__MeasurementDataNotAdjustable__DataTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__2__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3385:1: rule__MeasurementDataNotAdjustable__Group__3 : rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 ;
    public final void rule__MeasurementDataNotAdjustable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3389:1: ( rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3390:2: rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group__3__Impl_in_rule__MeasurementDataNotAdjustable__Group__36814);
            rule__MeasurementDataNotAdjustable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group__4_in_rule__MeasurementDataNotAdjustable__Group__36817);
            rule__MeasurementDataNotAdjustable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__3"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__3__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3397:1: rule__MeasurementDataNotAdjustable__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3401:1: ( ( 'in' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3402:1: ( 'in' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3402:1: ( 'in' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3403:1: 'in'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getInKeyword_3()); 
            match(input,42,FOLLOW_42_in_rule__MeasurementDataNotAdjustable__Group__3__Impl6845); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__3__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3416:1: rule__MeasurementDataNotAdjustable__Group__4 : rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 ;
    public final void rule__MeasurementDataNotAdjustable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3420:1: ( rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3421:2: rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group__4__Impl_in_rule__MeasurementDataNotAdjustable__Group__46876);
            rule__MeasurementDataNotAdjustable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group__5_in_rule__MeasurementDataNotAdjustable__Group__46879);
            rule__MeasurementDataNotAdjustable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__4"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__4__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3428:1: rule__MeasurementDataNotAdjustable__Group__4__Impl : ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3432:1: ( ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3433:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3433:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3434:1: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitAssignment_4()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3435:1: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3435:2: rule__MeasurementDataNotAdjustable__UnitAssignment_4
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__UnitAssignment_4_in_rule__MeasurementDataNotAdjustable__Group__4__Impl6906);
            rule__MeasurementDataNotAdjustable__UnitAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__4__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__5"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3445:1: rule__MeasurementDataNotAdjustable__Group__5 : rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 ;
    public final void rule__MeasurementDataNotAdjustable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3449:1: ( rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3450:2: rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group__5__Impl_in_rule__MeasurementDataNotAdjustable__Group__56936);
            rule__MeasurementDataNotAdjustable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group__6_in_rule__MeasurementDataNotAdjustable__Group__56939);
            rule__MeasurementDataNotAdjustable__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__5"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__5__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3457:1: rule__MeasurementDataNotAdjustable__Group__5__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3461:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3462:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3462:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3463:1: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3464:1: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3464:2: rule__MeasurementDataNotAdjustable__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group_5__0_in_rule__MeasurementDataNotAdjustable__Group__5__Impl6966);
                    rule__MeasurementDataNotAdjustable__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__5__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3474:1: rule__MeasurementDataNotAdjustable__Group__6 : rule__MeasurementDataNotAdjustable__Group__6__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3478:1: ( rule__MeasurementDataNotAdjustable__Group__6__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3479:2: rule__MeasurementDataNotAdjustable__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group__6__Impl_in_rule__MeasurementDataNotAdjustable__Group__66997);
            rule__MeasurementDataNotAdjustable__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__6"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__6__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3485:1: rule__MeasurementDataNotAdjustable__Group__6__Impl : ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3489:1: ( ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3490:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3490:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3491:1: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionAssignment_6()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3492:1: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DESCRIPTION) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3492:2: rule__MeasurementDataNotAdjustable__DescriptionAssignment_6
                    {
                    pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__DescriptionAssignment_6_in_rule__MeasurementDataNotAdjustable__Group__6__Impl7024);
                    rule__MeasurementDataNotAdjustable__DescriptionAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__6__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_5__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3516:1: rule__MeasurementDataNotAdjustable__Group_5__0 : rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3520:1: ( rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3521:2: rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group_5__0__Impl_in_rule__MeasurementDataNotAdjustable__Group_5__07069);
            rule__MeasurementDataNotAdjustable__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group_5__1_in_rule__MeasurementDataNotAdjustable__Group_5__07072);
            rule__MeasurementDataNotAdjustable__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_5__0"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_5__0__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3528:1: rule__MeasurementDataNotAdjustable__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3532:1: ( ( 'with identifier' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3533:1: ( 'with identifier' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3533:1: ( 'with identifier' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3534:1: 'with identifier'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getWithIdentifierKeyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__MeasurementDataNotAdjustable__Group_5__0__Impl7100); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getWithIdentifierKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_5__0__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_5__1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3547:1: rule__MeasurementDataNotAdjustable__Group_5__1 : rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3551:1: ( rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3552:2: rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group_5__1__Impl_in_rule__MeasurementDataNotAdjustable__Group_5__17131);
            rule__MeasurementDataNotAdjustable__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group_5__2_in_rule__MeasurementDataNotAdjustable__Group_5__17134);
            rule__MeasurementDataNotAdjustable__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_5__1"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_5__1__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3559:1: rule__MeasurementDataNotAdjustable__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3563:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3564:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3564:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3565:1: ':'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getColonKeyword_5_1()); 
            match(input,32,FOLLOW_32_in_rule__MeasurementDataNotAdjustable__Group_5__1__Impl7162); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_5__1__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_5__2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3578:1: rule__MeasurementDataNotAdjustable__Group_5__2 : rule__MeasurementDataNotAdjustable__Group_5__2__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3582:1: ( rule__MeasurementDataNotAdjustable__Group_5__2__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3583:2: rule__MeasurementDataNotAdjustable__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__Group_5__2__Impl_in_rule__MeasurementDataNotAdjustable__Group_5__27193);
            rule__MeasurementDataNotAdjustable__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_5__2"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_5__2__Impl"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3589:1: rule__MeasurementDataNotAdjustable__Group_5__2__Impl : ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3593:1: ( ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3594:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3594:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3595:1: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDAssignment_5_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3596:1: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3596:2: rule__MeasurementDataNotAdjustable__IDAssignment_5_2
            {
            pushFollow(FOLLOW_rule__MeasurementDataNotAdjustable__IDAssignment_5_2_in_rule__MeasurementDataNotAdjustable__Group_5__2__Impl7220);
            rule__MeasurementDataNotAdjustable__IDAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_5__2__Impl"


    // $ANTLR start "rule__DataRange__Group__0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3612:1: rule__DataRange__Group__0 : rule__DataRange__Group__0__Impl rule__DataRange__Group__1 ;
    public final void rule__DataRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3616:1: ( rule__DataRange__Group__0__Impl rule__DataRange__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3617:2: rule__DataRange__Group__0__Impl rule__DataRange__Group__1
            {
            pushFollow(FOLLOW_rule__DataRange__Group__0__Impl_in_rule__DataRange__Group__07256);
            rule__DataRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataRange__Group__1_in_rule__DataRange__Group__07259);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3624:1: rule__DataRange__Group__0__Impl : ( 'with range' ) ;
    public final void rule__DataRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3628:1: ( ( 'with range' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3629:1: ( 'with range' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3629:1: ( 'with range' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3630:1: 'with range'
            {
             before(grammarAccess.getDataRangeAccess().getWithRangeKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__DataRange__Group__0__Impl7287); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3643:1: rule__DataRange__Group__1 : rule__DataRange__Group__1__Impl ;
    public final void rule__DataRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3647:1: ( rule__DataRange__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3648:2: rule__DataRange__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataRange__Group__1__Impl_in_rule__DataRange__Group__17318);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3654:1: rule__DataRange__Group__1__Impl : ( ( rule__DataRange__RangeAssignment_1 ) ) ;
    public final void rule__DataRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3658:1: ( ( ( rule__DataRange__RangeAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3659:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3659:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3660:1: ( rule__DataRange__RangeAssignment_1 )
            {
             before(grammarAccess.getDataRangeAccess().getRangeAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3661:1: ( rule__DataRange__RangeAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3661:2: rule__DataRange__RangeAssignment_1
            {
            pushFollow(FOLLOW_rule__DataRange__RangeAssignment_1_in_rule__DataRange__Group__1__Impl7345);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3675:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3679:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3680:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
            {
            pushFollow(FOLLOW_rule__Interval__Group__0__Impl_in_rule__Interval__Group__07379);
            rule__Interval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group__1_in_rule__Interval__Group__07382);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3687:1: rule__Interval__Group__0__Impl : ( '[' ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3691:1: ( ( '[' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3692:1: ( '[' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3692:1: ( '[' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3693:1: '['
            {
             before(grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Interval__Group__0__Impl7410); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3706:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3710:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3711:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FOLLOW_rule__Interval__Group__1__Impl_in_rule__Interval__Group__17441);
            rule__Interval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group__2_in_rule__Interval__Group__17444);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3718:1: rule__Interval__Group__1__Impl : ( ( rule__Interval__LowerBoundAssignment_1 ) ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3722:1: ( ( ( rule__Interval__LowerBoundAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3723:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3723:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3724:1: ( rule__Interval__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3725:1: ( rule__Interval__LowerBoundAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3725:2: rule__Interval__LowerBoundAssignment_1
            {
            pushFollow(FOLLOW_rule__Interval__LowerBoundAssignment_1_in_rule__Interval__Group__1__Impl7471);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3735:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl rule__Interval__Group__3 ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3739:1: ( rule__Interval__Group__2__Impl rule__Interval__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3740:2: rule__Interval__Group__2__Impl rule__Interval__Group__3
            {
            pushFollow(FOLLOW_rule__Interval__Group__2__Impl_in_rule__Interval__Group__27501);
            rule__Interval__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group__3_in_rule__Interval__Group__27504);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3747:1: rule__Interval__Group__2__Impl : ( ';' ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3751:1: ( ( ';' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3752:1: ( ';' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3752:1: ( ';' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3753:1: ';'
            {
             before(grammarAccess.getIntervalAccess().getSemicolonKeyword_2()); 
            match(input,48,FOLLOW_48_in_rule__Interval__Group__2__Impl7532); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3766:1: rule__Interval__Group__3 : rule__Interval__Group__3__Impl rule__Interval__Group__4 ;
    public final void rule__Interval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3770:1: ( rule__Interval__Group__3__Impl rule__Interval__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3771:2: rule__Interval__Group__3__Impl rule__Interval__Group__4
            {
            pushFollow(FOLLOW_rule__Interval__Group__3__Impl_in_rule__Interval__Group__37563);
            rule__Interval__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group__4_in_rule__Interval__Group__37566);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3778:1: rule__Interval__Group__3__Impl : ( ( rule__Interval__UpperBoundAssignment_3 ) ) ;
    public final void rule__Interval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3782:1: ( ( ( rule__Interval__UpperBoundAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3783:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3783:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3784:1: ( rule__Interval__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3785:1: ( rule__Interval__UpperBoundAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3785:2: rule__Interval__UpperBoundAssignment_3
            {
            pushFollow(FOLLOW_rule__Interval__UpperBoundAssignment_3_in_rule__Interval__Group__3__Impl7593);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3795:1: rule__Interval__Group__4 : rule__Interval__Group__4__Impl ;
    public final void rule__Interval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3799:1: ( rule__Interval__Group__4__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3800:2: rule__Interval__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Interval__Group__4__Impl_in_rule__Interval__Group__47623);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3806:1: rule__Interval__Group__4__Impl : ( ']' ) ;
    public final void rule__Interval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3810:1: ( ( ']' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3811:1: ( ']' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3811:1: ( ']' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3812:1: ']'
            {
             before(grammarAccess.getIntervalAccess().getRightSquareBracketKeyword_4()); 
            match(input,49,FOLLOW_49_in_rule__Interval__Group__4__Impl7651); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3835:1: rule__LinearDataConversion__Group__0 : rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 ;
    public final void rule__LinearDataConversion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3839:1: ( rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3840:2: rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group__0__Impl_in_rule__LinearDataConversion__Group__07692);
            rule__LinearDataConversion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group__1_in_rule__LinearDataConversion__Group__07695);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3847:1: rule__LinearDataConversion__Group__0__Impl : ( 'with scaling factor' ) ;
    public final void rule__LinearDataConversion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3851:1: ( ( 'with scaling factor' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3852:1: ( 'with scaling factor' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3852:1: ( 'with scaling factor' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3853:1: 'with scaling factor'
            {
             before(grammarAccess.getLinearDataConversionAccess().getWithScalingFactorKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__LinearDataConversion__Group__0__Impl7723); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3866:1: rule__LinearDataConversion__Group__1 : rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 ;
    public final void rule__LinearDataConversion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3870:1: ( rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3871:2: rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group__1__Impl_in_rule__LinearDataConversion__Group__17754);
            rule__LinearDataConversion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group__2_in_rule__LinearDataConversion__Group__17757);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3878:1: rule__LinearDataConversion__Group__1__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3882:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3883:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3883:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3884:1: ':'
            {
             before(grammarAccess.getLinearDataConversionAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__LinearDataConversion__Group__1__Impl7785); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3897:1: rule__LinearDataConversion__Group__2 : rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 ;
    public final void rule__LinearDataConversion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3901:1: ( rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3902:2: rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group__2__Impl_in_rule__LinearDataConversion__Group__27816);
            rule__LinearDataConversion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group__3_in_rule__LinearDataConversion__Group__27819);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3909:1: rule__LinearDataConversion__Group__2__Impl : ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) ;
    public final void rule__LinearDataConversion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3913:1: ( ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3914:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3914:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3915:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorAssignment_2()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3916:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3916:2: rule__LinearDataConversion__ScalingFactorAssignment_2
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__ScalingFactorAssignment_2_in_rule__LinearDataConversion__Group__2__Impl7846);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3926:1: rule__LinearDataConversion__Group__3 : rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 ;
    public final void rule__LinearDataConversion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3930:1: ( rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3931:2: rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group__3__Impl_in_rule__LinearDataConversion__Group__37876);
            rule__LinearDataConversion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group__4_in_rule__LinearDataConversion__Group__37879);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3938:1: rule__LinearDataConversion__Group__3__Impl : ( 'and offset' ) ;
    public final void rule__LinearDataConversion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3942:1: ( ( 'and offset' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3943:1: ( 'and offset' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3943:1: ( 'and offset' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3944:1: 'and offset'
            {
             before(grammarAccess.getLinearDataConversionAccess().getAndOffsetKeyword_3()); 
            match(input,51,FOLLOW_51_in_rule__LinearDataConversion__Group__3__Impl7907); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3957:1: rule__LinearDataConversion__Group__4 : rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 ;
    public final void rule__LinearDataConversion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3961:1: ( rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3962:2: rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group__4__Impl_in_rule__LinearDataConversion__Group__47938);
            rule__LinearDataConversion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversion__Group__5_in_rule__LinearDataConversion__Group__47941);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3969:1: rule__LinearDataConversion__Group__4__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3973:1: ( ( ':' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3974:1: ( ':' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3974:1: ( ':' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3975:1: ':'
            {
             before(grammarAccess.getLinearDataConversionAccess().getColonKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__LinearDataConversion__Group__4__Impl7969); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3988:1: rule__LinearDataConversion__Group__5 : rule__LinearDataConversion__Group__5__Impl ;
    public final void rule__LinearDataConversion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3992:1: ( rule__LinearDataConversion__Group__5__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3993:2: rule__LinearDataConversion__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__Group__5__Impl_in_rule__LinearDataConversion__Group__58000);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:3999:1: rule__LinearDataConversion__Group__5__Impl : ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) ;
    public final void rule__LinearDataConversion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4003:1: ( ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4004:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4004:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4005:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetAssignment_5()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4006:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4006:2: rule__LinearDataConversion__OffsetAssignment_5
            {
            pushFollow(FOLLOW_rule__LinearDataConversion__OffsetAssignment_5_in_rule__LinearDataConversion__Group__5__Impl8027);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4028:1: rule__LinearDataConversionWithInterval__Group__0 : rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 ;
    public final void rule__LinearDataConversionWithInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4032:1: ( rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4033:2: rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1
            {
            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__0__Impl_in_rule__LinearDataConversionWithInterval__Group__08069);
            rule__LinearDataConversionWithInterval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__1_in_rule__LinearDataConversionWithInterval__Group__08072);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4040:1: rule__LinearDataConversionWithInterval__Group__0__Impl : ( 'by linear mapping' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4044:1: ( ( 'by linear mapping' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4045:1: ( 'by linear mapping' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4045:1: ( 'by linear mapping' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4046:1: 'by linear mapping'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getByLinearMappingKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__LinearDataConversionWithInterval__Group__0__Impl8100); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4059:1: rule__LinearDataConversionWithInterval__Group__1 : rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 ;
    public final void rule__LinearDataConversionWithInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4063:1: ( rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4064:2: rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2
            {
            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__1__Impl_in_rule__LinearDataConversionWithInterval__Group__18131);
            rule__LinearDataConversionWithInterval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__2_in_rule__LinearDataConversionWithInterval__Group__18134);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4071:1: rule__LinearDataConversionWithInterval__Group__1__Impl : ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4075:1: ( ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4076:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4076:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4077:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalAssignment_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4078:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4078:2: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1
            {
            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__FromIntervalAssignment_1_in_rule__LinearDataConversionWithInterval__Group__1__Impl8161);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4088:1: rule__LinearDataConversionWithInterval__Group__2 : rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 ;
    public final void rule__LinearDataConversionWithInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4092:1: ( rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4093:2: rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3
            {
            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__2__Impl_in_rule__LinearDataConversionWithInterval__Group__28191);
            rule__LinearDataConversionWithInterval__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__3_in_rule__LinearDataConversionWithInterval__Group__28194);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4100:1: rule__LinearDataConversionWithInterval__Group__2__Impl : ( '=>' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4104:1: ( ( '=>' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4105:1: ( '=>' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4105:1: ( '=>' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4106:1: '=>'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,53,FOLLOW_53_in_rule__LinearDataConversionWithInterval__Group__2__Impl8222); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4119:1: rule__LinearDataConversionWithInterval__Group__3 : rule__LinearDataConversionWithInterval__Group__3__Impl ;
    public final void rule__LinearDataConversionWithInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4123:1: ( rule__LinearDataConversionWithInterval__Group__3__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4124:2: rule__LinearDataConversionWithInterval__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__Group__3__Impl_in_rule__LinearDataConversionWithInterval__Group__38253);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4130:1: rule__LinearDataConversionWithInterval__Group__3__Impl : ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4134:1: ( ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4135:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4135:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4136:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalAssignment_3()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4137:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4137:2: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3
            {
            pushFollow(FOLLOW_rule__LinearDataConversionWithInterval__ToIntervalAssignment_3_in_rule__LinearDataConversionWithInterval__Group__3__Impl8280);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4155:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4159:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4160:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__08318);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__08321);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4167:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4171:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4172:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4172:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4173:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl8348); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4184:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4188:1: ( rule__DOUBLE__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4189:2: rule__DOUBLE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__18377);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4195:1: rule__DOUBLE__Group__1__Impl : ( ( rule__DOUBLE__Group_1__0 )? ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4199:1: ( ( ( rule__DOUBLE__Group_1__0 )? ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4200:1: ( ( rule__DOUBLE__Group_1__0 )? )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4200:1: ( ( rule__DOUBLE__Group_1__0 )? )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4201:1: ( rule__DOUBLE__Group_1__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4202:1: ( rule__DOUBLE__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4202:2: rule__DOUBLE__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl8404);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4216:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4220:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4221:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__08439);
            rule__DOUBLE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__08442);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4228:1: rule__DOUBLE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4232:1: ( ( '.' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4233:1: ( '.' )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4233:1: ( '.' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4234:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
            match(input,54,FOLLOW_54_in_rule__DOUBLE__Group_1__0__Impl8470); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4247:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4251:1: ( rule__DOUBLE__Group_1__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4252:2: rule__DOUBLE__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__18501);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4258:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4262:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4263:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4263:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4264:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl8528); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4279:1: rule__UNIT__Group__0 : rule__UNIT__Group__0__Impl rule__UNIT__Group__1 ;
    public final void rule__UNIT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4283:1: ( rule__UNIT__Group__0__Impl rule__UNIT__Group__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4284:2: rule__UNIT__Group__0__Impl rule__UNIT__Group__1
            {
            pushFollow(FOLLOW_rule__UNIT__Group__0__Impl_in_rule__UNIT__Group__08561);
            rule__UNIT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UNIT__Group__1_in_rule__UNIT__Group__08564);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4291:1: rule__UNIT__Group__0__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4295:1: ( ( ( RULE_ID )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4296:1: ( ( RULE_ID )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4296:1: ( ( RULE_ID )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4297:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4298:1: ( RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==EOF||(LA28_2>=RULE_ID && LA28_2<=RULE_DESCRIPTION)||(LA28_2>=30 && LA28_2<=31)||LA28_2==43) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4298:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UNIT__Group__0__Impl8592); 

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4308:1: rule__UNIT__Group__1 : rule__UNIT__Group__1__Impl ;
    public final void rule__UNIT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4312:1: ( rule__UNIT__Group__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4313:2: rule__UNIT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UNIT__Group__1__Impl_in_rule__UNIT__Group__18623);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4319:1: rule__UNIT__Group__1__Impl : ( ( rule__UNIT__Group_1__0 )* ) ;
    public final void rule__UNIT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4323:1: ( ( ( rule__UNIT__Group_1__0 )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4324:1: ( ( rule__UNIT__Group_1__0 )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4324:1: ( ( rule__UNIT__Group_1__0 )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4325:1: ( rule__UNIT__Group_1__0 )*
            {
             before(grammarAccess.getUNITAccess().getGroup_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4326:1: ( rule__UNIT__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ANY_OTHER) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4326:2: rule__UNIT__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__UNIT__Group_1__0_in_rule__UNIT__Group__1__Impl8650);
            	    rule__UNIT__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4340:1: rule__UNIT__Group_1__0 : rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 ;
    public final void rule__UNIT__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4344:1: ( rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4345:2: rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1
            {
            pushFollow(FOLLOW_rule__UNIT__Group_1__0__Impl_in_rule__UNIT__Group_1__08685);
            rule__UNIT__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UNIT__Group_1__1_in_rule__UNIT__Group_1__08688);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4352:1: rule__UNIT__Group_1__0__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__UNIT__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4356:1: ( ( RULE_ANY_OTHER ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4357:1: ( RULE_ANY_OTHER )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4357:1: ( RULE_ANY_OTHER )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4358:1: RULE_ANY_OTHER
            {
             before(grammarAccess.getUNITAccess().getANY_OTHERTerminalRuleCall_1_0()); 
            match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__UNIT__Group_1__0__Impl8715); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4369:1: rule__UNIT__Group_1__1 : rule__UNIT__Group_1__1__Impl ;
    public final void rule__UNIT__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4373:1: ( rule__UNIT__Group_1__1__Impl )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4374:2: rule__UNIT__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UNIT__Group_1__1__Impl_in_rule__UNIT__Group_1__18744);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4380:1: rule__UNIT__Group_1__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4384:1: ( ( ( RULE_ID )* ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4385:1: ( ( RULE_ID )* )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4385:1: ( ( RULE_ID )* )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4386:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4387:1: ( RULE_ID )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    int LA30_2 = input.LA(2);

                    if ( (LA30_2==EOF||(LA30_2>=RULE_ID && LA30_2<=RULE_DESCRIPTION)||(LA30_2>=30 && LA30_2<=31)||LA30_2==43) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4387:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UNIT__Group_1__1__Impl8772); 

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4402:1: rule__SensorInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4406:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4407:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4407:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4408:1: RULE_ID
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SensorInterface__NameAssignment_18812); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4417:1: rule__SensorInterface__DescriptionAssignment_2 : ( RULE_DESCRIPTION ) ;
    public final void rule__SensorInterface__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4421:1: ( ( RULE_DESCRIPTION ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4422:1: ( RULE_DESCRIPTION )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4422:1: ( RULE_DESCRIPTION )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4423:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionDESCRIPTIONTerminalRuleCall_2_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_rule__SensorInterface__DescriptionAssignment_28843); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4432:1: rule__SensorInterface__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__SensorInterface__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4436:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4437:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4437:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4438:1: RULE_STRING
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SensorInterface__IDAssignment_3_28874); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4447:1: rule__SensorInterface__EncodingSettingsAssignment_5 : ( ruleEncodingSettings ) ;
    public final void rule__SensorInterface__EncodingSettingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4451:1: ( ( ruleEncodingSettings ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4452:1: ( ruleEncodingSettings )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4452:1: ( ruleEncodingSettings )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4453:1: ruleEncodingSettings
            {
             before(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsEncodingSettingsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEncodingSettings_in_rule__SensorInterface__EncodingSettingsAssignment_58905);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4462:1: rule__SensorInterface__DataDescriptionAssignment_6 : ( ruleSensorDataDescription ) ;
    public final void rule__SensorInterface__DataDescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4466:1: ( ( ruleSensorDataDescription ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4467:1: ( ruleSensorDataDescription )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4467:1: ( ruleSensorDataDescription )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4468:1: ruleSensorDataDescription
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionSensorDataDescriptionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSensorDataDescription_in_rule__SensorInterface__DataDescriptionAssignment_68936);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4477:1: rule__EncodingSettings__CodingAssignment_2 : ( ruleCoding ) ;
    public final void rule__EncodingSettings__CodingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4481:1: ( ( ruleCoding ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4482:1: ( ruleCoding )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4482:1: ( ruleCoding )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4483:1: ruleCoding
            {
             before(grammarAccess.getEncodingSettingsAccess().getCodingCodingEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCoding_in_rule__EncodingSettings__CodingAssignment_28967);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4492:1: rule__EncodingSettings__EndiannessAssignment_6 : ( ruleEndianness ) ;
    public final void rule__EncodingSettings__EndiannessAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4496:1: ( ( ruleEndianness ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4497:1: ( ruleEndianness )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4497:1: ( ruleEndianness )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4498:1: ruleEndianness
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessEndiannessEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEndianness_in_rule__EncodingSettings__EndiannessAssignment_68998);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4507:1: rule__EncodingSettings__AlignmentAssignment_10 : ( RULE_INT ) ;
    public final void rule__EncodingSettings__AlignmentAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4511:1: ( ( RULE_INT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4512:1: ( RULE_INT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4512:1: ( RULE_INT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4513:1: RULE_INT
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EncodingSettings__AlignmentAssignment_109029); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4522:1: rule__EncodingSettings__IDAssignment_12_2 : ( RULE_STRING ) ;
    public final void rule__EncodingSettings__IDAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4526:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4527:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4527:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4528:1: RULE_STRING
            {
             before(grammarAccess.getEncodingSettingsAccess().getIDSTRINGTerminalRuleCall_12_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EncodingSettings__IDAssignment_12_29060); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4537:1: rule__SensorDataDescription__IDAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__SensorDataDescription__IDAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4541:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4542:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4542:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4543:1: RULE_STRING
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SensorDataDescription__IDAssignment_2_29091); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4552:1: rule__SensorDataDescription__DataSetsAssignment_4 : ( ruleDataSet ) ;
    public final void rule__SensorDataDescription__DataSetsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4556:1: ( ( ruleDataSet ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4557:1: ( ruleDataSet )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4557:1: ( ruleDataSet )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4558:1: ruleDataSet
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsDataSetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDataSet_in_rule__SensorDataDescription__DataSetsAssignment_49122);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4567:1: rule__DataSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4571:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4572:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4572:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4573:1: RULE_ID
            {
             before(grammarAccess.getDataSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataSet__NameAssignment_19153); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4582:1: rule__DataSet__ParentDataSetAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__ParentDataSetAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4586:1: ( ( ( RULE_ID ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4587:1: ( ( RULE_ID ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4587:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4588:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_2_1_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4589:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4590:1: RULE_ID
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataSet__ParentDataSetAssignment_2_19188); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4601:1: rule__DataSet__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__DataSet__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4605:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4606:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4606:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4607:1: RULE_STRING
            {
             before(grammarAccess.getDataSetAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataSet__IDAssignment_3_29223); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4616:1: rule__DataSet__DescriptionAssignment_4 : ( RULE_DESCRIPTION ) ;
    public final void rule__DataSet__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4620:1: ( ( RULE_DESCRIPTION ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4621:1: ( RULE_DESCRIPTION )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4621:1: ( RULE_DESCRIPTION )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4622:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getDataSetAccess().getDescriptionDESCRIPTIONTerminalRuleCall_4_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_rule__DataSet__DescriptionAssignment_49254); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4631:1: rule__DataSet__DataAssignment_6 : ( ruleData ) ;
    public final void rule__DataSet__DataAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4635:1: ( ( ruleData ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4636:1: ( ruleData )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4636:1: ( ruleData )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4637:1: ruleData
            {
             before(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__DataSet__DataAssignment_69285);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4646:1: rule__MeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4650:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4651:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4651:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4652:1: RULE_ID
            {
             before(grammarAccess.getMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MeasurementData__NameAssignment_09316); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4661:1: rule__MeasurementData__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__MeasurementData__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4665:1: ( ( ruleDataType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4666:1: ( ruleDataType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4666:1: ( ruleDataType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4667:1: ruleDataType
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__MeasurementData__DataTypeAssignment_29347);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4676:1: rule__MeasurementData__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementData__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4680:1: ( ( ruleUNIT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4681:1: ( ruleUNIT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4681:1: ( ruleUNIT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4682:1: ruleUNIT
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitUNITParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleUNIT_in_rule__MeasurementData__UnitAssignment_49378);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4691:1: rule__MeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4695:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4696:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4696:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4697:1: RULE_STRING
            {
             before(grammarAccess.getMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MeasurementData__IDAssignment_5_29409); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4706:1: rule__MeasurementData__AdjustmentsAssignment_6_1 : ( ruleDataAdjustment ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4710:1: ( ( ruleDataAdjustment ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4711:1: ( ruleDataAdjustment )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4711:1: ( ruleDataAdjustment )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4712:1: ruleDataAdjustment
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustmentParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleDataAdjustment_in_rule__MeasurementData__AdjustmentsAssignment_6_19440);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4721:1: rule__MeasurementData__AdjustmentsAssignment_6_2_1 : ( ruleDataAdjustment ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4725:1: ( ( ruleDataAdjustment ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4726:1: ( ruleDataAdjustment )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4726:1: ( ruleDataAdjustment )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4727:1: ruleDataAdjustment
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustmentParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_ruleDataAdjustment_in_rule__MeasurementData__AdjustmentsAssignment_6_2_19471);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4736:1: rule__MeasurementData__DescriptionAssignment_7 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementData__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4740:1: ( ( RULE_DESCRIPTION ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4741:1: ( RULE_DESCRIPTION )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4741:1: ( RULE_DESCRIPTION )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4742:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_7_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_rule__MeasurementData__DescriptionAssignment_79502); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4751:1: rule__NonMeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NonMeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4755:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4756:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4756:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4757:1: RULE_ID
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NonMeasurementData__NameAssignment_09533); 
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


    // $ANTLR start "rule__NonMeasurementData__DataTypeAssignment_2_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4766:1: rule__NonMeasurementData__DataTypeAssignment_2_0 : ( ruleDataType ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4770:1: ( ( ruleDataType ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4771:1: ( ruleDataType )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4771:1: ( ruleDataType )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4772:1: ruleDataType
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__NonMeasurementData__DataTypeAssignment_2_09564);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__DataTypeAssignment_2_0"


    // $ANTLR start "rule__NonMeasurementData__DataTypeAssignment_2_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4781:1: rule__NonMeasurementData__DataTypeAssignment_2_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4785:1: ( ( ruleDataTypeNotAdjustable ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4786:1: ( ruleDataTypeNotAdjustable )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4786:1: ( ruleDataTypeNotAdjustable )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4787:1: ruleDataTypeNotAdjustable
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDataTypeNotAdjustable_in_rule__NonMeasurementData__DataTypeAssignment_2_19595);
            ruleDataTypeNotAdjustable();

            state._fsp--;

             after(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__DataTypeAssignment_2_1"


    // $ANTLR start "rule__NonMeasurementData__ConstantAssignment_3"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4796:1: rule__NonMeasurementData__ConstantAssignment_3 : ( ( 'constant' ) ) ;
    public final void rule__NonMeasurementData__ConstantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4800:1: ( ( ( 'constant' ) ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4801:1: ( ( 'constant' ) )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4801:1: ( ( 'constant' ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4802:1: ( 'constant' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4803:1: ( 'constant' )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4804:1: 'constant'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 
            match(input,55,FOLLOW_55_in_rule__NonMeasurementData__ConstantAssignment_39631); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4819:1: rule__NonMeasurementData__ValueAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4823:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4824:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4824:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4825:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NonMeasurementData__ValueAssignment_4_29670); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4834:1: rule__NonMeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4838:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4839:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4839:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4840:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NonMeasurementData__IDAssignment_5_29701); 
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4849:1: rule__NonMeasurementData__DescriptionAssignment_6 : ( RULE_DESCRIPTION ) ;
    public final void rule__NonMeasurementData__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4853:1: ( ( RULE_DESCRIPTION ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4854:1: ( RULE_DESCRIPTION )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4854:1: ( RULE_DESCRIPTION )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4855:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_6_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_rule__NonMeasurementData__DescriptionAssignment_69732); 
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


    // $ANTLR start "rule__MeasurementDataNotAdjustable__NameAssignment_0"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4864:1: rule__MeasurementDataNotAdjustable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementDataNotAdjustable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4868:1: ( ( RULE_ID ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4869:1: ( RULE_ID )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4869:1: ( RULE_ID )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4870:1: RULE_ID
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MeasurementDataNotAdjustable__NameAssignment_09763); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__NameAssignment_0"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__DataTypeAssignment_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4879:1: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__MeasurementDataNotAdjustable__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4883:1: ( ( ruleDataTypeNotAdjustable ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4884:1: ( ruleDataTypeNotAdjustable )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4884:1: ( ruleDataTypeNotAdjustable )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4885:1: ruleDataTypeNotAdjustable
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDataTypeNotAdjustable_in_rule__MeasurementDataNotAdjustable__DataTypeAssignment_29794);
            ruleDataTypeNotAdjustable();

            state._fsp--;

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__DataTypeAssignment_2"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__UnitAssignment_4"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4894:1: rule__MeasurementDataNotAdjustable__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementDataNotAdjustable__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4898:1: ( ( ruleUNIT ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4899:1: ( ruleUNIT )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4899:1: ( ruleUNIT )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4900:1: ruleUNIT
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitUNITParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleUNIT_in_rule__MeasurementDataNotAdjustable__UnitAssignment_49825);
            ruleUNIT();

            state._fsp--;

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitUNITParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__UnitAssignment_4"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__IDAssignment_5_2"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4909:1: rule__MeasurementDataNotAdjustable__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementDataNotAdjustable__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4913:1: ( ( RULE_STRING ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4914:1: ( RULE_STRING )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4914:1: ( RULE_STRING )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4915:1: RULE_STRING
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MeasurementDataNotAdjustable__IDAssignment_5_29856); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__IDAssignment_5_2"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__DescriptionAssignment_6"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4924:1: rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementDataNotAdjustable__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4928:1: ( ( RULE_DESCRIPTION ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4929:1: ( RULE_DESCRIPTION )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4929:1: ( RULE_DESCRIPTION )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4930:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionDESCRIPTIONTerminalRuleCall_6_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_RULE_DESCRIPTION_in_rule__MeasurementDataNotAdjustable__DescriptionAssignment_69887); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionDESCRIPTIONTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__DescriptionAssignment_6"


    // $ANTLR start "rule__DataRange__RangeAssignment_1"
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4939:1: rule__DataRange__RangeAssignment_1 : ( ruleInterval ) ;
    public final void rule__DataRange__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4943:1: ( ( ruleInterval ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4944:1: ( ruleInterval )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4944:1: ( ruleInterval )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4945:1: ruleInterval
            {
             before(grammarAccess.getDataRangeAccess().getRangeIntervalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInterval_in_rule__DataRange__RangeAssignment_19918);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4954:1: rule__Interval__LowerBoundAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Interval__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4958:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4959:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4959:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4960:1: ruleDOUBLE
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Interval__LowerBoundAssignment_19949);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4969:1: rule__Interval__UpperBoundAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Interval__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4973:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4974:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4974:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4975:1: ruleDOUBLE
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__Interval__UpperBoundAssignment_39980);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4984:1: rule__LinearDataConversion__ScalingFactorAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__ScalingFactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4988:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4989:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4989:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4990:1: ruleDOUBLE
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__LinearDataConversion__ScalingFactorAssignment_210011);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:4999:1: rule__LinearDataConversion__OffsetAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__OffsetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5003:1: ( ( ruleDOUBLE ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5004:1: ( ruleDOUBLE )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5004:1: ( ruleDOUBLE )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5005:1: ruleDOUBLE
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetDOUBLEParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__LinearDataConversion__OffsetAssignment_510042);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5014:1: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__FromIntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5018:1: ( ( ruleInterval ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5019:1: ( ruleInterval )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5019:1: ( ruleInterval )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5020:1: ruleInterval
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalIntervalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInterval_in_rule__LinearDataConversionWithInterval__FromIntervalAssignment_110073);
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
    // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5029:1: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__ToIntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5033:1: ( ( ruleInterval ) )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5034:1: ( ruleInterval )
            {
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5034:1: ( ruleInterval )
            // ../de.fzi.sensidl.language.ui/src-gen/de/fzi/sensidl/language/ui/contentassist/antlr/internal/InternalSensidl.g:5035:1: ruleInterval
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalIntervalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInterval_in_rule__LinearDataConversionWithInterval__ToIntervalAssignment_310104);
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
        "\22\uffff";
    static final String DFA1_eofS =
        "\3\uffff\14\20\3\uffff";
    static final String DFA1_minS =
        "\1\5\1\51\1\14\14\5\3\uffff";
    static final String DFA1_maxS =
        "\1\5\1\51\1\33\14\67\3\uffff";
    static final String DFA1_acceptS =
        "\17\uffff\1\1\1\2\1\3";
    static final String DFA1_specialS =
        "\22\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\2",
            "\1\16\4\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
            "\1\15",
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
            "\1\20\1\uffff\1\20\26\uffff\2\20\12\uffff\1\21\1\uffff\1\20"+
            "\12\uffff\1\20",
            "",
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
            return "585:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) );";
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
    public static final BitSet FOLLOW_ruleMeasurementDataNotAdjustable_in_entryRuleMeasurementDataNotAdjustable481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeasurementDataNotAdjustable488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group__0_in_ruleMeasurementDataNotAdjustable514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdjustment_in_entryRuleDataAdjustment541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAdjustment548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAdjustment__Alternatives_in_ruleDataAdjustment574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_entryRuleDataRange601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataRange608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__0_in_ruleDataRange634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_entryRuleInterval661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterval668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__0_in_ruleInterval694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConversion_in_entryRuleDataConversion721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataConversion728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataConversion__Alternatives_in_ruleDataConversion754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversion_in_entryRuleLinearDataConversion781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinearDataConversion788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__0_in_ruleLinearDataConversion814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversionWithInterval_in_entryRuleLinearDataConversionWithInterval841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinearDataConversionWithInterval848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__0_in_ruleLinearDataConversionWithInterval874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNIT_in_entryRuleUNIT961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNIT968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group__0_in_ruleUNIT994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coding__Alternatives_in_ruleCoding1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Endianness__Alternatives_in_ruleEndianness1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDataTypeNotAdjustable1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementData_in_rule__Data__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonMeasurementData_in_rule__Data__Alternatives1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeasurementDataNotAdjustable_in_rule__Data__Alternatives1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__DataTypeAssignment_2_0_in_rule__NonMeasurementData__Alternatives_21243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__DataTypeAssignment_2_1_in_rule__NonMeasurementData__Alternatives_21261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataRange_in_rule__DataAdjustment__Alternatives1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataConversion_in_rule__DataAdjustment__Alternatives1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversion_in_rule__DataConversion__Alternatives1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinearDataConversionWithInterval_in_rule__DataConversion__Alternatives1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Coding__Alternatives1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Coding__Alternatives1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Endianness__Alternatives1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Endianness__Alternatives1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DataType__Alternatives1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DataType__Alternatives1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DataType__Alternatives1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DataType__Alternatives1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DataType__Alternatives1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DataType__Alternatives1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DataType__Alternatives1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DataType__Alternatives1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DataType__Alternatives1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DataType__Alternatives1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DataType__Alternatives1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__0__Impl_in_rule__SensorInterface__Group__01750 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__1_in_rule__SensorInterface__Group__01753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SensorInterface__Group__0__Impl1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__1__Impl_in_rule__SensorInterface__Group__11812 = new BitSet(new long[]{0x00000000A0000080L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__2_in_rule__SensorInterface__Group__11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__NameAssignment_1_in_rule__SensorInterface__Group__1__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__2__Impl_in_rule__SensorInterface__Group__21872 = new BitSet(new long[]{0x00000000A0000080L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__3_in_rule__SensorInterface__Group__21875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__DescriptionAssignment_2_in_rule__SensorInterface__Group__2__Impl1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__3__Impl_in_rule__SensorInterface__Group__31933 = new BitSet(new long[]{0x00000000A0000080L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__4_in_rule__SensorInterface__Group__31936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__0_in_rule__SensorInterface__Group__3__Impl1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__4__Impl_in_rule__SensorInterface__Group__41994 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__5_in_rule__SensorInterface__Group__41997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SensorInterface__Group__4__Impl2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__5__Impl_in_rule__SensorInterface__Group__52056 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__6_in_rule__SensorInterface__Group__52059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__EncodingSettingsAssignment_5_in_rule__SensorInterface__Group__5__Impl2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__6__Impl_in_rule__SensorInterface__Group__62116 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__7_in_rule__SensorInterface__Group__62119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__DataDescriptionAssignment_6_in_rule__SensorInterface__Group__6__Impl2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group__7__Impl_in_rule__SensorInterface__Group__72176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SensorInterface__Group__7__Impl2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__0__Impl_in_rule__SensorInterface__Group_3__02251 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__1_in_rule__SensorInterface__Group_3__02254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SensorInterface__Group_3__0__Impl2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__1__Impl_in_rule__SensorInterface__Group_3__12313 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__2_in_rule__SensorInterface__Group_3__12316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SensorInterface__Group_3__1__Impl2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__Group_3__2__Impl_in_rule__SensorInterface__Group_3__22375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorInterface__IDAssignment_3_2_in_rule__SensorInterface__Group_3__2__Impl2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__0__Impl_in_rule__EncodingSettings__Group__02438 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__1_in_rule__EncodingSettings__Group__02441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EncodingSettings__Group__0__Impl2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__1__Impl_in_rule__EncodingSettings__Group__12500 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__2_in_rule__EncodingSettings__Group__12503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EncodingSettings__Group__1__Impl2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__2__Impl_in_rule__EncodingSettings__Group__22562 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__3_in_rule__EncodingSettings__Group__22565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__CodingAssignment_2_in_rule__EncodingSettings__Group__2__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__3__Impl_in_rule__EncodingSettings__Group__32622 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__4_in_rule__EncodingSettings__Group__32625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EncodingSettings__Group__3__Impl2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__4__Impl_in_rule__EncodingSettings__Group__42684 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__5_in_rule__EncodingSettings__Group__42687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EncodingSettings__Group__4__Impl2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__5__Impl_in_rule__EncodingSettings__Group__52746 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__6_in_rule__EncodingSettings__Group__52749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EncodingSettings__Group__5__Impl2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__6__Impl_in_rule__EncodingSettings__Group__62808 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__7_in_rule__EncodingSettings__Group__62811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__EndiannessAssignment_6_in_rule__EncodingSettings__Group__6__Impl2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__7__Impl_in_rule__EncodingSettings__Group__72868 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__8_in_rule__EncodingSettings__Group__72871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EncodingSettings__Group__7__Impl2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__8__Impl_in_rule__EncodingSettings__Group__82930 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__9_in_rule__EncodingSettings__Group__82933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EncodingSettings__Group__8__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__9__Impl_in_rule__EncodingSettings__Group__92992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__10_in_rule__EncodingSettings__Group__92995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EncodingSettings__Group__9__Impl3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__10__Impl_in_rule__EncodingSettings__Group__103054 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__11_in_rule__EncodingSettings__Group__103057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__AlignmentAssignment_10_in_rule__EncodingSettings__Group__10__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__11__Impl_in_rule__EncodingSettings__Group__113114 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__12_in_rule__EncodingSettings__Group__113117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EncodingSettings__Group__11__Impl3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group__12__Impl_in_rule__EncodingSettings__Group__123176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group_12__0_in_rule__EncodingSettings__Group__12__Impl3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group_12__0__Impl_in_rule__EncodingSettings__Group_12__03260 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group_12__1_in_rule__EncodingSettings__Group_12__03263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EncodingSettings__Group_12__0__Impl3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group_12__1__Impl_in_rule__EncodingSettings__Group_12__13322 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group_12__2_in_rule__EncodingSettings__Group_12__13325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EncodingSettings__Group_12__1__Impl3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__Group_12__2__Impl_in_rule__EncodingSettings__Group_12__23384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodingSettings__IDAssignment_12_2_in_rule__EncodingSettings__Group_12__2__Impl3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__0__Impl_in_rule__SensorDataDescription__Group__03447 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__1_in_rule__SensorDataDescription__Group__03450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__SensorDataDescription__Group__0__Impl3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__1__Impl_in_rule__SensorDataDescription__Group__13509 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__2_in_rule__SensorDataDescription__Group__13512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__2__Impl_in_rule__SensorDataDescription__Group__23570 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__3_in_rule__SensorDataDescription__Group__23573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_2__0_in_rule__SensorDataDescription__Group__2__Impl3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__3__Impl_in_rule__SensorDataDescription__Group__33631 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__4_in_rule__SensorDataDescription__Group__33634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SensorDataDescription__Group__3__Impl3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__4__Impl_in_rule__SensorDataDescription__Group__43693 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__5_in_rule__SensorDataDescription__Group__43696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__DataSetsAssignment_4_in_rule__SensorDataDescription__Group__4__Impl3723 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group__5__Impl_in_rule__SensorDataDescription__Group__53754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SensorDataDescription__Group__5__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_2__0__Impl_in_rule__SensorDataDescription__Group_2__03825 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_2__1_in_rule__SensorDataDescription__Group_2__03828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SensorDataDescription__Group_2__0__Impl3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_2__1__Impl_in_rule__SensorDataDescription__Group_2__13887 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_2__2_in_rule__SensorDataDescription__Group_2__13890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SensorDataDescription__Group_2__1__Impl3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__Group_2__2__Impl_in_rule__SensorDataDescription__Group_2__23949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorDataDescription__IDAssignment_2_2_in_rule__SensorDataDescription__Group_2__2__Impl3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__0__Impl_in_rule__DataSet__Group__04012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataSet__Group__1_in_rule__DataSet__Group__04015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__DataSet__Group__0__Impl4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__1__Impl_in_rule__DataSet__Group__14074 = new BitSet(new long[]{0x00000100A0000080L});
    public static final BitSet FOLLOW_rule__DataSet__Group__2_in_rule__DataSet__Group__14077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__NameAssignment_1_in_rule__DataSet__Group__1__Impl4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__2__Impl_in_rule__DataSet__Group__24134 = new BitSet(new long[]{0x00000100A0000080L});
    public static final BitSet FOLLOW_rule__DataSet__Group__3_in_rule__DataSet__Group__24137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_2__0_in_rule__DataSet__Group__2__Impl4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__3__Impl_in_rule__DataSet__Group__34195 = new BitSet(new long[]{0x00000100A0000080L});
    public static final BitSet FOLLOW_rule__DataSet__Group__4_in_rule__DataSet__Group__34198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__0_in_rule__DataSet__Group__3__Impl4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__4__Impl_in_rule__DataSet__Group__44256 = new BitSet(new long[]{0x00000100A0000080L});
    public static final BitSet FOLLOW_rule__DataSet__Group__5_in_rule__DataSet__Group__44259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__DescriptionAssignment_4_in_rule__DataSet__Group__4__Impl4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__5__Impl_in_rule__DataSet__Group__54317 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__DataSet__Group__6_in_rule__DataSet__Group__54320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DataSet__Group__5__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group__6__Impl_in_rule__DataSet__Group__64379 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__DataSet__Group__7_in_rule__DataSet__Group__64382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__DataAssignment_6_in_rule__DataSet__Group__6__Impl4409 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__DataSet__Group__7__Impl_in_rule__DataSet__Group__74440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DataSet__Group__7__Impl4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_2__0__Impl_in_rule__DataSet__Group_2__04515 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataSet__Group_2__1_in_rule__DataSet__Group_2__04518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DataSet__Group_2__0__Impl4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_2__1__Impl_in_rule__DataSet__Group_2__14577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__ParentDataSetAssignment_2_1_in_rule__DataSet__Group_2__1__Impl4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__0__Impl_in_rule__DataSet__Group_3__04638 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__1_in_rule__DataSet__Group_3__04641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DataSet__Group_3__0__Impl4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__1__Impl_in_rule__DataSet__Group_3__14700 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__2_in_rule__DataSet__Group_3__14703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DataSet__Group_3__1__Impl4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__Group_3__2__Impl_in_rule__DataSet__Group_3__24762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataSet__IDAssignment_3_2_in_rule__DataSet__Group_3__2__Impl4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__0__Impl_in_rule__MeasurementData__Group__04825 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__1_in_rule__MeasurementData__Group__04828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__NameAssignment_0_in_rule__MeasurementData__Group__0__Impl4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__1__Impl_in_rule__MeasurementData__Group__14885 = new BitSet(new long[]{0x000000000FFE0000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__2_in_rule__MeasurementData__Group__14888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MeasurementData__Group__1__Impl4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__2__Impl_in_rule__MeasurementData__Group__24947 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__3_in_rule__MeasurementData__Group__24950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__DataTypeAssignment_2_in_rule__MeasurementData__Group__2__Impl4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__3__Impl_in_rule__MeasurementData__Group__35007 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__4_in_rule__MeasurementData__Group__35010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MeasurementData__Group__3__Impl5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__4__Impl_in_rule__MeasurementData__Group__45069 = new BitSet(new long[]{0x0000080080000080L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__5_in_rule__MeasurementData__Group__45072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__UnitAssignment_4_in_rule__MeasurementData__Group__4__Impl5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__5__Impl_in_rule__MeasurementData__Group__55129 = new BitSet(new long[]{0x0000080080000080L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__6_in_rule__MeasurementData__Group__55132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__0_in_rule__MeasurementData__Group__5__Impl5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__6__Impl_in_rule__MeasurementData__Group__65190 = new BitSet(new long[]{0x0000080080000080L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__7_in_rule__MeasurementData__Group__65193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__0_in_rule__MeasurementData__Group__6__Impl5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group__7__Impl_in_rule__MeasurementData__Group__75251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__DescriptionAssignment_7_in_rule__MeasurementData__Group__7__Impl5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__0__Impl_in_rule__MeasurementData__Group_5__05325 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__1_in_rule__MeasurementData__Group_5__05328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MeasurementData__Group_5__0__Impl5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__1__Impl_in_rule__MeasurementData__Group_5__15387 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__2_in_rule__MeasurementData__Group_5__15390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MeasurementData__Group_5__1__Impl5418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_5__2__Impl_in_rule__MeasurementData__Group_5__25449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__IDAssignment_5_2_in_rule__MeasurementData__Group_5__2__Impl5476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__0__Impl_in_rule__MeasurementData__Group_6__05512 = new BitSet(new long[]{0x0014400000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__1_in_rule__MeasurementData__Group_6__05515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MeasurementData__Group_6__0__Impl5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__1__Impl_in_rule__MeasurementData__Group_6__15574 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__2_in_rule__MeasurementData__Group_6__15577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__AdjustmentsAssignment_6_1_in_rule__MeasurementData__Group_6__1__Impl5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6__2__Impl_in_rule__MeasurementData__Group_6__25634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6_2__0_in_rule__MeasurementData__Group_6__2__Impl5661 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6_2__0__Impl_in_rule__MeasurementData__Group_6_2__05698 = new BitSet(new long[]{0x0014400000000000L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6_2__1_in_rule__MeasurementData__Group_6_2__05701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MeasurementData__Group_6_2__0__Impl5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__Group_6_2__1__Impl_in_rule__MeasurementData__Group_6_2__15760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementData__AdjustmentsAssignment_6_2_1_in_rule__MeasurementData__Group_6_2__1__Impl5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__0__Impl_in_rule__NonMeasurementData__Group__05821 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__1_in_rule__NonMeasurementData__Group__05824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__NameAssignment_0_in_rule__NonMeasurementData__Group__0__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__1__Impl_in_rule__NonMeasurementData__Group__15881 = new BitSet(new long[]{0x000000000FFE1000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__2_in_rule__NonMeasurementData__Group__15884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__NonMeasurementData__Group__1__Impl5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__2__Impl_in_rule__NonMeasurementData__Group__25943 = new BitSet(new long[]{0x0080100080000080L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__3_in_rule__NonMeasurementData__Group__25946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Alternatives_2_in_rule__NonMeasurementData__Group__2__Impl5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__3__Impl_in_rule__NonMeasurementData__Group__36003 = new BitSet(new long[]{0x0080100080000080L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__4_in_rule__NonMeasurementData__Group__36006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__ConstantAssignment_3_in_rule__NonMeasurementData__Group__3__Impl6033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__4__Impl_in_rule__NonMeasurementData__Group__46064 = new BitSet(new long[]{0x0080100080000080L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__5_in_rule__NonMeasurementData__Group__46067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_4__0_in_rule__NonMeasurementData__Group__4__Impl6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__5__Impl_in_rule__NonMeasurementData__Group__56125 = new BitSet(new long[]{0x0080100080000080L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__6_in_rule__NonMeasurementData__Group__56128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_5__0_in_rule__NonMeasurementData__Group__5__Impl6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group__6__Impl_in_rule__NonMeasurementData__Group__66186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__DescriptionAssignment_6_in_rule__NonMeasurementData__Group__6__Impl6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_4__0__Impl_in_rule__NonMeasurementData__Group_4__06258 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_4__1_in_rule__NonMeasurementData__Group_4__06261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__NonMeasurementData__Group_4__0__Impl6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_4__1__Impl_in_rule__NonMeasurementData__Group_4__16320 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_4__2_in_rule__NonMeasurementData__Group_4__16323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__NonMeasurementData__Group_4__1__Impl6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_4__2__Impl_in_rule__NonMeasurementData__Group_4__26382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__ValueAssignment_4_2_in_rule__NonMeasurementData__Group_4__2__Impl6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_5__0__Impl_in_rule__NonMeasurementData__Group_5__06445 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_5__1_in_rule__NonMeasurementData__Group_5__06448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__NonMeasurementData__Group_5__0__Impl6476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_5__1__Impl_in_rule__NonMeasurementData__Group_5__16507 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_5__2_in_rule__NonMeasurementData__Group_5__16510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__NonMeasurementData__Group_5__1__Impl6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__Group_5__2__Impl_in_rule__NonMeasurementData__Group_5__26569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonMeasurementData__IDAssignment_5_2_in_rule__NonMeasurementData__Group_5__2__Impl6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group__0__Impl_in_rule__MeasurementDataNotAdjustable__Group__06632 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group__1_in_rule__MeasurementDataNotAdjustable__Group__06635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__NameAssignment_0_in_rule__MeasurementDataNotAdjustable__Group__0__Impl6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group__1__Impl_in_rule__MeasurementDataNotAdjustable__Group__16692 = new BitSet(new long[]{0x000000000FFE1000L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group__2_in_rule__MeasurementDataNotAdjustable__Group__16695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MeasurementDataNotAdjustable__Group__1__Impl6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group__2__Impl_in_rule__MeasurementDataNotAdjustable__Group__26754 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group__3_in_rule__MeasurementDataNotAdjustable__Group__26757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__DataTypeAssignment_2_in_rule__MeasurementDataNotAdjustable__Group__2__Impl6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group__3__Impl_in_rule__MeasurementDataNotAdjustable__Group__36814 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group__4_in_rule__MeasurementDataNotAdjustable__Group__36817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MeasurementDataNotAdjustable__Group__3__Impl6845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group__4__Impl_in_rule__MeasurementDataNotAdjustable__Group__46876 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group__5_in_rule__MeasurementDataNotAdjustable__Group__46879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__UnitAssignment_4_in_rule__MeasurementDataNotAdjustable__Group__4__Impl6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group__5__Impl_in_rule__MeasurementDataNotAdjustable__Group__56936 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group__6_in_rule__MeasurementDataNotAdjustable__Group__56939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group_5__0_in_rule__MeasurementDataNotAdjustable__Group__5__Impl6966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group__6__Impl_in_rule__MeasurementDataNotAdjustable__Group__66997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__DescriptionAssignment_6_in_rule__MeasurementDataNotAdjustable__Group__6__Impl7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group_5__0__Impl_in_rule__MeasurementDataNotAdjustable__Group_5__07069 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group_5__1_in_rule__MeasurementDataNotAdjustable__Group_5__07072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MeasurementDataNotAdjustable__Group_5__0__Impl7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group_5__1__Impl_in_rule__MeasurementDataNotAdjustable__Group_5__17131 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group_5__2_in_rule__MeasurementDataNotAdjustable__Group_5__17134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MeasurementDataNotAdjustable__Group_5__1__Impl7162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__Group_5__2__Impl_in_rule__MeasurementDataNotAdjustable__Group_5__27193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MeasurementDataNotAdjustable__IDAssignment_5_2_in_rule__MeasurementDataNotAdjustable__Group_5__2__Impl7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__0__Impl_in_rule__DataRange__Group__07256 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__DataRange__Group__1_in_rule__DataRange__Group__07259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DataRange__Group__0__Impl7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__Group__1__Impl_in_rule__DataRange__Group__17318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataRange__RangeAssignment_1_in_rule__DataRange__Group__1__Impl7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__0__Impl_in_rule__Interval__Group__07379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interval__Group__1_in_rule__Interval__Group__07382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Interval__Group__0__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__1__Impl_in_rule__Interval__Group__17441 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Interval__Group__2_in_rule__Interval__Group__17444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__LowerBoundAssignment_1_in_rule__Interval__Group__1__Impl7471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__2__Impl_in_rule__Interval__Group__27501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interval__Group__3_in_rule__Interval__Group__27504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Interval__Group__2__Impl7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__3__Impl_in_rule__Interval__Group__37563 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Interval__Group__4_in_rule__Interval__Group__37566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__UpperBoundAssignment_3_in_rule__Interval__Group__3__Impl7593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group__4__Impl_in_rule__Interval__Group__47623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Interval__Group__4__Impl7651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__0__Impl_in_rule__LinearDataConversion__Group__07692 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__1_in_rule__LinearDataConversion__Group__07695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__LinearDataConversion__Group__0__Impl7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__1__Impl_in_rule__LinearDataConversion__Group__17754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__2_in_rule__LinearDataConversion__Group__17757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__LinearDataConversion__Group__1__Impl7785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__2__Impl_in_rule__LinearDataConversion__Group__27816 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__3_in_rule__LinearDataConversion__Group__27819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__ScalingFactorAssignment_2_in_rule__LinearDataConversion__Group__2__Impl7846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__3__Impl_in_rule__LinearDataConversion__Group__37876 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__4_in_rule__LinearDataConversion__Group__37879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__LinearDataConversion__Group__3__Impl7907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__4__Impl_in_rule__LinearDataConversion__Group__47938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__5_in_rule__LinearDataConversion__Group__47941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__LinearDataConversion__Group__4__Impl7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__Group__5__Impl_in_rule__LinearDataConversion__Group__58000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversion__OffsetAssignment_5_in_rule__LinearDataConversion__Group__5__Impl8027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__0__Impl_in_rule__LinearDataConversionWithInterval__Group__08069 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__1_in_rule__LinearDataConversionWithInterval__Group__08072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__LinearDataConversionWithInterval__Group__0__Impl8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__1__Impl_in_rule__LinearDataConversionWithInterval__Group__18131 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__2_in_rule__LinearDataConversionWithInterval__Group__18134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__FromIntervalAssignment_1_in_rule__LinearDataConversionWithInterval__Group__1__Impl8161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__2__Impl_in_rule__LinearDataConversionWithInterval__Group__28191 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__3_in_rule__LinearDataConversionWithInterval__Group__28194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__LinearDataConversionWithInterval__Group__2__Impl8222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__Group__3__Impl_in_rule__LinearDataConversionWithInterval__Group__38253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinearDataConversionWithInterval__ToIntervalAssignment_3_in_rule__LinearDataConversionWithInterval__Group__3__Impl8280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__08318 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__08321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__18377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0_in_rule__DOUBLE__Group__1__Impl8404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__0__Impl_in_rule__DOUBLE__Group_1__08439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1_in_rule__DOUBLE__Group_1__08442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__DOUBLE__Group_1__0__Impl8470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group_1__1__Impl_in_rule__DOUBLE__Group_1__18501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group_1__1__Impl8528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group__0__Impl_in_rule__UNIT__Group__08561 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__UNIT__Group__1_in_rule__UNIT__Group__08564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UNIT__Group__0__Impl8592 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__UNIT__Group__1__Impl_in_rule__UNIT__Group__18623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group_1__0_in_rule__UNIT__Group__1__Impl8650 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__UNIT__Group_1__0__Impl_in_rule__UNIT__Group_1__08685 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UNIT__Group_1__1_in_rule__UNIT__Group_1__08688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__UNIT__Group_1__0__Impl8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNIT__Group_1__1__Impl_in_rule__UNIT__Group_1__18744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UNIT__Group_1__1__Impl8772 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SensorInterface__NameAssignment_18812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_rule__SensorInterface__DescriptionAssignment_28843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SensorInterface__IDAssignment_3_28874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodingSettings_in_rule__SensorInterface__EncodingSettingsAssignment_58905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorDataDescription_in_rule__SensorInterface__DataDescriptionAssignment_68936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoding_in_rule__EncodingSettings__CodingAssignment_28967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndianness_in_rule__EncodingSettings__EndiannessAssignment_68998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EncodingSettings__AlignmentAssignment_109029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EncodingSettings__IDAssignment_12_29060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SensorDataDescription__IDAssignment_2_29091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSet_in_rule__SensorDataDescription__DataSetsAssignment_49122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataSet__NameAssignment_19153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataSet__ParentDataSetAssignment_2_19188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataSet__IDAssignment_3_29223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_rule__DataSet__DescriptionAssignment_49254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__DataSet__DataAssignment_69285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MeasurementData__NameAssignment_09316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__MeasurementData__DataTypeAssignment_29347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNIT_in_rule__MeasurementData__UnitAssignment_49378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MeasurementData__IDAssignment_5_29409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdjustment_in_rule__MeasurementData__AdjustmentsAssignment_6_19440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAdjustment_in_rule__MeasurementData__AdjustmentsAssignment_6_2_19471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_rule__MeasurementData__DescriptionAssignment_79502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NonMeasurementData__NameAssignment_09533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__NonMeasurementData__DataTypeAssignment_2_09564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeNotAdjustable_in_rule__NonMeasurementData__DataTypeAssignment_2_19595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__NonMeasurementData__ConstantAssignment_39631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NonMeasurementData__ValueAssignment_4_29670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NonMeasurementData__IDAssignment_5_29701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_rule__NonMeasurementData__DescriptionAssignment_69732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MeasurementDataNotAdjustable__NameAssignment_09763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeNotAdjustable_in_rule__MeasurementDataNotAdjustable__DataTypeAssignment_29794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNIT_in_rule__MeasurementDataNotAdjustable__UnitAssignment_49825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MeasurementDataNotAdjustable__IDAssignment_5_29856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESCRIPTION_in_rule__MeasurementDataNotAdjustable__DescriptionAssignment_69887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_rule__DataRange__RangeAssignment_19918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Interval__LowerBoundAssignment_19949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Interval__UpperBoundAssignment_39980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__LinearDataConversion__ScalingFactorAssignment_210011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__LinearDataConversion__OffsetAssignment_510042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_rule__LinearDataConversionWithInterval__FromIntervalAssignment_110073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_rule__LinearDataConversionWithInterval__ToIntervalAssignment_310104 = new BitSet(new long[]{0x0000000000000002L});

}