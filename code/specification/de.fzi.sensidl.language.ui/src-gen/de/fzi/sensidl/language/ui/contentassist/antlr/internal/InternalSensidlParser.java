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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_ANY_OTHER", "RULE_DESCRIPTION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'SENSIDL_BINARY'", "'SENSIDL_JSON'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'STRING'", "'BOOLEAN'", "'INT8'", "'UINT8'", "'INT16'", "'UINT16'", "'INT32'", "'UINT32'", "'INT64'", "'UINT64'", "'FLOAT'", "'DOUBLE'", "'sensorInterface'", "'{'", "'}'", "'with identifier'", "':'", "'encoding'", "','", "'endianness'", "'alignment'", "'BIT'", "'sensorData'", "'dataSet'", "'uses'", "'as'", "'in'", "'adjusted'", "'exclude:'", "'value'", "'='", "'exclude'", "'with range'", "'['", "';'", "']'", "'with scaling factor'", "'and offset'", "'by linear mapping'", "'=>'", "'.'", "'setter'", "'getter'", "'constant'"
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
    public String getGrammarFileName() { return "InternalSensidl.g"; }


     
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
    // InternalSensidl.g:60:1: entryRuleSensorInterface : ruleSensorInterface EOF ;
    public final void entryRuleSensorInterface() throws RecognitionException {
        try {
            // InternalSensidl.g:61:1: ( ruleSensorInterface EOF )
            // InternalSensidl.g:62:1: ruleSensorInterface EOF
            {
             before(grammarAccess.getSensorInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorInterface();

            state._fsp--;

             after(grammarAccess.getSensorInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:69:1: ruleSensorInterface : ( ( rule__SensorInterface__Group__0 ) ) ;
    public final void ruleSensorInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:73:2: ( ( ( rule__SensorInterface__Group__0 ) ) )
            // InternalSensidl.g:74:1: ( ( rule__SensorInterface__Group__0 ) )
            {
            // InternalSensidl.g:74:1: ( ( rule__SensorInterface__Group__0 ) )
            // InternalSensidl.g:75:1: ( rule__SensorInterface__Group__0 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup()); 
            // InternalSensidl.g:76:1: ( rule__SensorInterface__Group__0 )
            // InternalSensidl.g:76:2: rule__SensorInterface__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:88:1: entryRuleEncodingSettings : ruleEncodingSettings EOF ;
    public final void entryRuleEncodingSettings() throws RecognitionException {
        try {
            // InternalSensidl.g:89:1: ( ruleEncodingSettings EOF )
            // InternalSensidl.g:90:1: ruleEncodingSettings EOF
            {
             before(grammarAccess.getEncodingSettingsRule()); 
            pushFollow(FOLLOW_1);
            ruleEncodingSettings();

            state._fsp--;

             after(grammarAccess.getEncodingSettingsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:97:1: ruleEncodingSettings : ( ( rule__EncodingSettings__Group__0 ) ) ;
    public final void ruleEncodingSettings() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:101:2: ( ( ( rule__EncodingSettings__Group__0 ) ) )
            // InternalSensidl.g:102:1: ( ( rule__EncodingSettings__Group__0 ) )
            {
            // InternalSensidl.g:102:1: ( ( rule__EncodingSettings__Group__0 ) )
            // InternalSensidl.g:103:1: ( rule__EncodingSettings__Group__0 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getGroup()); 
            // InternalSensidl.g:104:1: ( rule__EncodingSettings__Group__0 )
            // InternalSensidl.g:104:2: rule__EncodingSettings__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:116:1: entryRuleSensorDataDescription : ruleSensorDataDescription EOF ;
    public final void entryRuleSensorDataDescription() throws RecognitionException {
        try {
            // InternalSensidl.g:117:1: ( ruleSensorDataDescription EOF )
            // InternalSensidl.g:118:1: ruleSensorDataDescription EOF
            {
             before(grammarAccess.getSensorDataDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorDataDescription();

            state._fsp--;

             after(grammarAccess.getSensorDataDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:125:1: ruleSensorDataDescription : ( ( rule__SensorDataDescription__Group__0 ) ) ;
    public final void ruleSensorDataDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:129:2: ( ( ( rule__SensorDataDescription__Group__0 ) ) )
            // InternalSensidl.g:130:1: ( ( rule__SensorDataDescription__Group__0 ) )
            {
            // InternalSensidl.g:130:1: ( ( rule__SensorDataDescription__Group__0 ) )
            // InternalSensidl.g:131:1: ( rule__SensorDataDescription__Group__0 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup()); 
            // InternalSensidl.g:132:1: ( rule__SensorDataDescription__Group__0 )
            // InternalSensidl.g:132:2: rule__SensorDataDescription__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:144:1: entryRuleDataSet : ruleDataSet EOF ;
    public final void entryRuleDataSet() throws RecognitionException {
        try {
            // InternalSensidl.g:145:1: ( ruleDataSet EOF )
            // InternalSensidl.g:146:1: ruleDataSet EOF
            {
             before(grammarAccess.getDataSetRule()); 
            pushFollow(FOLLOW_1);
            ruleDataSet();

            state._fsp--;

             after(grammarAccess.getDataSetRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:153:1: ruleDataSet : ( ( rule__DataSet__Group__0 ) ) ;
    public final void ruleDataSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:157:2: ( ( ( rule__DataSet__Group__0 ) ) )
            // InternalSensidl.g:158:1: ( ( rule__DataSet__Group__0 ) )
            {
            // InternalSensidl.g:158:1: ( ( rule__DataSet__Group__0 ) )
            // InternalSensidl.g:159:1: ( rule__DataSet__Group__0 )
            {
             before(grammarAccess.getDataSetAccess().getGroup()); 
            // InternalSensidl.g:160:1: ( rule__DataSet__Group__0 )
            // InternalSensidl.g:160:2: rule__DataSet__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:172:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalSensidl.g:173:1: ( ruleData EOF )
            // InternalSensidl.g:174:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:181:1: ruleData : ( ( rule__Data__Alternatives ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:185:2: ( ( ( rule__Data__Alternatives ) ) )
            // InternalSensidl.g:186:1: ( ( rule__Data__Alternatives ) )
            {
            // InternalSensidl.g:186:1: ( ( rule__Data__Alternatives ) )
            // InternalSensidl.g:187:1: ( rule__Data__Alternatives )
            {
             before(grammarAccess.getDataAccess().getAlternatives()); 
            // InternalSensidl.g:188:1: ( rule__Data__Alternatives )
            // InternalSensidl.g:188:2: rule__Data__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:200:1: entryRuleMeasurementData : ruleMeasurementData EOF ;
    public final void entryRuleMeasurementData() throws RecognitionException {
        try {
            // InternalSensidl.g:201:1: ( ruleMeasurementData EOF )
            // InternalSensidl.g:202:1: ruleMeasurementData EOF
            {
             before(grammarAccess.getMeasurementDataRule()); 
            pushFollow(FOLLOW_1);
            ruleMeasurementData();

            state._fsp--;

             after(grammarAccess.getMeasurementDataRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:209:1: ruleMeasurementData : ( ( rule__MeasurementData__Group__0 ) ) ;
    public final void ruleMeasurementData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:213:2: ( ( ( rule__MeasurementData__Group__0 ) ) )
            // InternalSensidl.g:214:1: ( ( rule__MeasurementData__Group__0 ) )
            {
            // InternalSensidl.g:214:1: ( ( rule__MeasurementData__Group__0 ) )
            // InternalSensidl.g:215:1: ( rule__MeasurementData__Group__0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup()); 
            // InternalSensidl.g:216:1: ( rule__MeasurementData__Group__0 )
            // InternalSensidl.g:216:2: rule__MeasurementData__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:228:1: entryRuleNonMeasurementData : ruleNonMeasurementData EOF ;
    public final void entryRuleNonMeasurementData() throws RecognitionException {
        try {
            // InternalSensidl.g:229:1: ( ruleNonMeasurementData EOF )
            // InternalSensidl.g:230:1: ruleNonMeasurementData EOF
            {
             before(grammarAccess.getNonMeasurementDataRule()); 
            pushFollow(FOLLOW_1);
            ruleNonMeasurementData();

            state._fsp--;

             after(grammarAccess.getNonMeasurementDataRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:237:1: ruleNonMeasurementData : ( ( rule__NonMeasurementData__Group__0 ) ) ;
    public final void ruleNonMeasurementData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:241:2: ( ( ( rule__NonMeasurementData__Group__0 ) ) )
            // InternalSensidl.g:242:1: ( ( rule__NonMeasurementData__Group__0 ) )
            {
            // InternalSensidl.g:242:1: ( ( rule__NonMeasurementData__Group__0 ) )
            // InternalSensidl.g:243:1: ( rule__NonMeasurementData__Group__0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup()); 
            // InternalSensidl.g:244:1: ( rule__NonMeasurementData__Group__0 )
            // InternalSensidl.g:244:2: rule__NonMeasurementData__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:256:1: entryRuleMeasurementDataNotAdjustable : ruleMeasurementDataNotAdjustable EOF ;
    public final void entryRuleMeasurementDataNotAdjustable() throws RecognitionException {
        try {
            // InternalSensidl.g:257:1: ( ruleMeasurementDataNotAdjustable EOF )
            // InternalSensidl.g:258:1: ruleMeasurementDataNotAdjustable EOF
            {
             before(grammarAccess.getMeasurementDataNotAdjustableRule()); 
            pushFollow(FOLLOW_1);
            ruleMeasurementDataNotAdjustable();

            state._fsp--;

             after(grammarAccess.getMeasurementDataNotAdjustableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:265:1: ruleMeasurementDataNotAdjustable : ( ( rule__MeasurementDataNotAdjustable__Group__0 ) ) ;
    public final void ruleMeasurementDataNotAdjustable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:269:2: ( ( ( rule__MeasurementDataNotAdjustable__Group__0 ) ) )
            // InternalSensidl.g:270:1: ( ( rule__MeasurementDataNotAdjustable__Group__0 ) )
            {
            // InternalSensidl.g:270:1: ( ( rule__MeasurementDataNotAdjustable__Group__0 ) )
            // InternalSensidl.g:271:1: ( rule__MeasurementDataNotAdjustable__Group__0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup()); 
            // InternalSensidl.g:272:1: ( rule__MeasurementDataNotAdjustable__Group__0 )
            // InternalSensidl.g:272:2: rule__MeasurementDataNotAdjustable__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleDataRange"
    // InternalSensidl.g:284:1: entryRuleDataRange : ruleDataRange EOF ;
    public final void entryRuleDataRange() throws RecognitionException {
        try {
            // InternalSensidl.g:285:1: ( ruleDataRange EOF )
            // InternalSensidl.g:286:1: ruleDataRange EOF
            {
             before(grammarAccess.getDataRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataRange();

            state._fsp--;

             after(grammarAccess.getDataRangeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:293:1: ruleDataRange : ( ( rule__DataRange__Group__0 ) ) ;
    public final void ruleDataRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:297:2: ( ( ( rule__DataRange__Group__0 ) ) )
            // InternalSensidl.g:298:1: ( ( rule__DataRange__Group__0 ) )
            {
            // InternalSensidl.g:298:1: ( ( rule__DataRange__Group__0 ) )
            // InternalSensidl.g:299:1: ( rule__DataRange__Group__0 )
            {
             before(grammarAccess.getDataRangeAccess().getGroup()); 
            // InternalSensidl.g:300:1: ( rule__DataRange__Group__0 )
            // InternalSensidl.g:300:2: rule__DataRange__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:312:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // InternalSensidl.g:313:1: ( ruleInterval EOF )
            // InternalSensidl.g:314:1: ruleInterval EOF
            {
             before(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_1);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getIntervalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:321:1: ruleInterval : ( ( rule__Interval__Group__0 ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:325:2: ( ( ( rule__Interval__Group__0 ) ) )
            // InternalSensidl.g:326:1: ( ( rule__Interval__Group__0 ) )
            {
            // InternalSensidl.g:326:1: ( ( rule__Interval__Group__0 ) )
            // InternalSensidl.g:327:1: ( rule__Interval__Group__0 )
            {
             before(grammarAccess.getIntervalAccess().getGroup()); 
            // InternalSensidl.g:328:1: ( rule__Interval__Group__0 )
            // InternalSensidl.g:328:2: rule__Interval__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:340:1: entryRuleDataConversion : ruleDataConversion EOF ;
    public final void entryRuleDataConversion() throws RecognitionException {
        try {
            // InternalSensidl.g:341:1: ( ruleDataConversion EOF )
            // InternalSensidl.g:342:1: ruleDataConversion EOF
            {
             before(grammarAccess.getDataConversionRule()); 
            pushFollow(FOLLOW_1);
            ruleDataConversion();

            state._fsp--;

             after(grammarAccess.getDataConversionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:349:1: ruleDataConversion : ( ( rule__DataConversion__Alternatives ) ) ;
    public final void ruleDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:353:2: ( ( ( rule__DataConversion__Alternatives ) ) )
            // InternalSensidl.g:354:1: ( ( rule__DataConversion__Alternatives ) )
            {
            // InternalSensidl.g:354:1: ( ( rule__DataConversion__Alternatives ) )
            // InternalSensidl.g:355:1: ( rule__DataConversion__Alternatives )
            {
             before(grammarAccess.getDataConversionAccess().getAlternatives()); 
            // InternalSensidl.g:356:1: ( rule__DataConversion__Alternatives )
            // InternalSensidl.g:356:2: rule__DataConversion__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:368:1: entryRuleLinearDataConversion : ruleLinearDataConversion EOF ;
    public final void entryRuleLinearDataConversion() throws RecognitionException {
        try {
            // InternalSensidl.g:369:1: ( ruleLinearDataConversion EOF )
            // InternalSensidl.g:370:1: ruleLinearDataConversion EOF
            {
             before(grammarAccess.getLinearDataConversionRule()); 
            pushFollow(FOLLOW_1);
            ruleLinearDataConversion();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:377:1: ruleLinearDataConversion : ( ( rule__LinearDataConversion__Group__0 ) ) ;
    public final void ruleLinearDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:381:2: ( ( ( rule__LinearDataConversion__Group__0 ) ) )
            // InternalSensidl.g:382:1: ( ( rule__LinearDataConversion__Group__0 ) )
            {
            // InternalSensidl.g:382:1: ( ( rule__LinearDataConversion__Group__0 ) )
            // InternalSensidl.g:383:1: ( rule__LinearDataConversion__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getGroup()); 
            // InternalSensidl.g:384:1: ( rule__LinearDataConversion__Group__0 )
            // InternalSensidl.g:384:2: rule__LinearDataConversion__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:396:1: entryRuleLinearDataConversionWithInterval : ruleLinearDataConversionWithInterval EOF ;
    public final void entryRuleLinearDataConversionWithInterval() throws RecognitionException {
        try {
            // InternalSensidl.g:397:1: ( ruleLinearDataConversionWithInterval EOF )
            // InternalSensidl.g:398:1: ruleLinearDataConversionWithInterval EOF
            {
             before(grammarAccess.getLinearDataConversionWithIntervalRule()); 
            pushFollow(FOLLOW_1);
            ruleLinearDataConversionWithInterval();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionWithIntervalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:405:1: ruleLinearDataConversionWithInterval : ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) ;
    public final void ruleLinearDataConversionWithInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:409:2: ( ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) )
            // InternalSensidl.g:410:1: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            {
            // InternalSensidl.g:410:1: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            // InternalSensidl.g:411:1: ( rule__LinearDataConversionWithInterval__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getGroup()); 
            // InternalSensidl.g:412:1: ( rule__LinearDataConversionWithInterval__Group__0 )
            // InternalSensidl.g:412:2: rule__LinearDataConversionWithInterval__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:424:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalSensidl.g:425:1: ( ruleDOUBLE EOF )
            // InternalSensidl.g:426:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:433:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:437:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalSensidl.g:438:1: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalSensidl.g:438:1: ( ( rule__DOUBLE__Group__0 ) )
            // InternalSensidl.g:439:1: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalSensidl.g:440:1: ( rule__DOUBLE__Group__0 )
            // InternalSensidl.g:440:2: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:452:1: entryRuleUNIT : ruleUNIT EOF ;
    public final void entryRuleUNIT() throws RecognitionException {
        try {
            // InternalSensidl.g:453:1: ( ruleUNIT EOF )
            // InternalSensidl.g:454:1: ruleUNIT EOF
            {
             before(grammarAccess.getUNITRule()); 
            pushFollow(FOLLOW_1);
            ruleUNIT();

            state._fsp--;

             after(grammarAccess.getUNITRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSensidl.g:461:1: ruleUNIT : ( ( rule__UNIT__Group__0 ) ) ;
    public final void ruleUNIT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:465:2: ( ( ( rule__UNIT__Group__0 ) ) )
            // InternalSensidl.g:466:1: ( ( rule__UNIT__Group__0 ) )
            {
            // InternalSensidl.g:466:1: ( ( rule__UNIT__Group__0 ) )
            // InternalSensidl.g:467:1: ( rule__UNIT__Group__0 )
            {
             before(grammarAccess.getUNITAccess().getGroup()); 
            // InternalSensidl.g:468:1: ( rule__UNIT__Group__0 )
            // InternalSensidl.g:468:2: rule__UNIT__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:481:1: ruleCoding : ( ( rule__Coding__Alternatives ) ) ;
    public final void ruleCoding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:485:1: ( ( ( rule__Coding__Alternatives ) ) )
            // InternalSensidl.g:486:1: ( ( rule__Coding__Alternatives ) )
            {
            // InternalSensidl.g:486:1: ( ( rule__Coding__Alternatives ) )
            // InternalSensidl.g:487:1: ( rule__Coding__Alternatives )
            {
             before(grammarAccess.getCodingAccess().getAlternatives()); 
            // InternalSensidl.g:488:1: ( rule__Coding__Alternatives )
            // InternalSensidl.g:488:2: rule__Coding__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:500:1: ruleEndianness : ( ( rule__Endianness__Alternatives ) ) ;
    public final void ruleEndianness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:504:1: ( ( ( rule__Endianness__Alternatives ) ) )
            // InternalSensidl.g:505:1: ( ( rule__Endianness__Alternatives ) )
            {
            // InternalSensidl.g:505:1: ( ( rule__Endianness__Alternatives ) )
            // InternalSensidl.g:506:1: ( rule__Endianness__Alternatives )
            {
             before(grammarAccess.getEndiannessAccess().getAlternatives()); 
            // InternalSensidl.g:507:1: ( rule__Endianness__Alternatives )
            // InternalSensidl.g:507:2: rule__Endianness__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:519:1: ruleDataTypeNotAdjustable : ( ( rule__DataTypeNotAdjustable__Alternatives ) ) ;
    public final void ruleDataTypeNotAdjustable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:523:1: ( ( ( rule__DataTypeNotAdjustable__Alternatives ) ) )
            // InternalSensidl.g:524:1: ( ( rule__DataTypeNotAdjustable__Alternatives ) )
            {
            // InternalSensidl.g:524:1: ( ( rule__DataTypeNotAdjustable__Alternatives ) )
            // InternalSensidl.g:525:1: ( rule__DataTypeNotAdjustable__Alternatives )
            {
             before(grammarAccess.getDataTypeNotAdjustableAccess().getAlternatives()); 
            // InternalSensidl.g:526:1: ( rule__DataTypeNotAdjustable__Alternatives )
            // InternalSensidl.g:526:2: rule__DataTypeNotAdjustable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeNotAdjustable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeNotAdjustableAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalSensidl.g:538:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:542:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSensidl.g:543:1: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSensidl.g:543:1: ( ( rule__DataType__Alternatives ) )
            // InternalSensidl.g:544:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSensidl.g:545:1: ( rule__DataType__Alternatives )
            // InternalSensidl.g:545:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:556:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:560:1: ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalSensidl.g:561:1: ( ruleMeasurementData )
                    {
                    // InternalSensidl.g:561:1: ( ruleMeasurementData )
                    // InternalSensidl.g:562:1: ruleMeasurementData
                    {
                     before(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMeasurementData();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getMeasurementDataParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:567:6: ( ruleNonMeasurementData )
                    {
                    // InternalSensidl.g:567:6: ( ruleNonMeasurementData )
                    // InternalSensidl.g:568:1: ruleNonMeasurementData
                    {
                     before(grammarAccess.getDataAccess().getNonMeasurementDataParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNonMeasurementData();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getNonMeasurementDataParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:573:6: ( ruleMeasurementDataNotAdjustable )
                    {
                    // InternalSensidl.g:573:6: ( ruleMeasurementDataNotAdjustable )
                    // InternalSensidl.g:574:1: ruleMeasurementDataNotAdjustable
                    {
                     before(grammarAccess.getDataAccess().getMeasurementDataNotAdjustableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__MeasurementData__Alternatives_6"
    // InternalSensidl.g:584:1: rule__MeasurementData__Alternatives_6 : ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) );
    public final void rule__MeasurementData__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:588:1: ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSensidl.g:589:1: ( ( rule__MeasurementData__Group_6_0__0 ) )
                    {
                    // InternalSensidl.g:589:1: ( ( rule__MeasurementData__Group_6_0__0 ) )
                    // InternalSensidl.g:590:1: ( rule__MeasurementData__Group_6_0__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_0()); 
                    // InternalSensidl.g:591:1: ( rule__MeasurementData__Group_6_0__0 )
                    // InternalSensidl.g:591:2: rule__MeasurementData__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMeasurementDataAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:595:6: ( ( rule__MeasurementData__Group_6_1__0 ) )
                    {
                    // InternalSensidl.g:595:6: ( ( rule__MeasurementData__Group_6_1__0 ) )
                    // InternalSensidl.g:596:1: ( rule__MeasurementData__Group_6_1__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_1()); 
                    // InternalSensidl.g:597:1: ( rule__MeasurementData__Group_6_1__0 )
                    // InternalSensidl.g:597:2: rule__MeasurementData__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMeasurementDataAccess().getGroup_6_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:601:6: ( ( rule__MeasurementData__Group_6_2__0 ) )
                    {
                    // InternalSensidl.g:601:6: ( ( rule__MeasurementData__Group_6_2__0 ) )
                    // InternalSensidl.g:602:1: ( rule__MeasurementData__Group_6_2__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_2()); 
                    // InternalSensidl.g:603:1: ( rule__MeasurementData__Group_6_2__0 )
                    // InternalSensidl.g:603:2: rule__MeasurementData__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__Group_6_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMeasurementDataAccess().getGroup_6_2()); 

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
    // $ANTLR end "rule__MeasurementData__Alternatives_6"


    // $ANTLR start "rule__MeasurementData__Alternatives_7_1"
    // InternalSensidl.g:612:1: rule__MeasurementData__Alternatives_7_1 : ( ( ( rule__MeasurementData__Group_7_1_0__0 ) ) | ( ( rule__MeasurementData__Group_7_1_1__0 ) ) );
    public final void rule__MeasurementData__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:616:1: ( ( ( rule__MeasurementData__Group_7_1_0__0 ) ) | ( ( rule__MeasurementData__Group_7_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==57) ) {
                alt3=1;
            }
            else if ( (LA3_0==58) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSensidl.g:617:1: ( ( rule__MeasurementData__Group_7_1_0__0 ) )
                    {
                    // InternalSensidl.g:617:1: ( ( rule__MeasurementData__Group_7_1_0__0 ) )
                    // InternalSensidl.g:618:1: ( rule__MeasurementData__Group_7_1_0__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_0()); 
                    // InternalSensidl.g:619:1: ( rule__MeasurementData__Group_7_1_0__0 )
                    // InternalSensidl.g:619:2: rule__MeasurementData__Group_7_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__Group_7_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMeasurementDataAccess().getGroup_7_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:623:6: ( ( rule__MeasurementData__Group_7_1_1__0 ) )
                    {
                    // InternalSensidl.g:623:6: ( ( rule__MeasurementData__Group_7_1_1__0 ) )
                    // InternalSensidl.g:624:1: ( rule__MeasurementData__Group_7_1_1__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_1()); 
                    // InternalSensidl.g:625:1: ( rule__MeasurementData__Group_7_1_1__0 )
                    // InternalSensidl.g:625:2: rule__MeasurementData__Group_7_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__Group_7_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMeasurementDataAccess().getGroup_7_1_1()); 

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
    // $ANTLR end "rule__MeasurementData__Alternatives_7_1"


    // $ANTLR start "rule__NonMeasurementData__Alternatives_2"
    // InternalSensidl.g:634:1: rule__NonMeasurementData__Alternatives_2 : ( ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) ) | ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) ) );
    public final void rule__NonMeasurementData__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:638:1: ( ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) ) | ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=18 && LA4_0<=27)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=16 && LA4_0<=17)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSensidl.g:639:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) )
                    {
                    // InternalSensidl.g:639:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) )
                    // InternalSensidl.g:640:1: ( rule__NonMeasurementData__DataTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_0()); 
                    // InternalSensidl.g:641:1: ( rule__NonMeasurementData__DataTypeAssignment_2_0 )
                    // InternalSensidl.g:641:2: rule__NonMeasurementData__DataTypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__DataTypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:645:6: ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) )
                    {
                    // InternalSensidl.g:645:6: ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) )
                    // InternalSensidl.g:646:1: ( rule__NonMeasurementData__DataTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_1()); 
                    // InternalSensidl.g:647:1: ( rule__NonMeasurementData__DataTypeAssignment_2_1 )
                    // InternalSensidl.g:647:2: rule__NonMeasurementData__DataTypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__NonMeasurementData__Alternatives_6_1"
    // InternalSensidl.g:656:1: rule__NonMeasurementData__Alternatives_6_1 : ( ( ( rule__NonMeasurementData__Group_6_1_0__0 ) ) | ( ( rule__NonMeasurementData__Group_6_1_1__0 ) ) );
    public final void rule__NonMeasurementData__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:660:1: ( ( ( rule__NonMeasurementData__Group_6_1_0__0 ) ) | ( ( rule__NonMeasurementData__Group_6_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==57) ) {
                alt5=1;
            }
            else if ( (LA5_0==58) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSensidl.g:661:1: ( ( rule__NonMeasurementData__Group_6_1_0__0 ) )
                    {
                    // InternalSensidl.g:661:1: ( ( rule__NonMeasurementData__Group_6_1_0__0 ) )
                    // InternalSensidl.g:662:1: ( rule__NonMeasurementData__Group_6_1_0__0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_0()); 
                    // InternalSensidl.g:663:1: ( rule__NonMeasurementData__Group_6_1_0__0 )
                    // InternalSensidl.g:663:2: rule__NonMeasurementData__Group_6_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__Group_6_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:667:6: ( ( rule__NonMeasurementData__Group_6_1_1__0 ) )
                    {
                    // InternalSensidl.g:667:6: ( ( rule__NonMeasurementData__Group_6_1_1__0 ) )
                    // InternalSensidl.g:668:1: ( rule__NonMeasurementData__Group_6_1_1__0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_1()); 
                    // InternalSensidl.g:669:1: ( rule__NonMeasurementData__Group_6_1_1__0 )
                    // InternalSensidl.g:669:2: rule__NonMeasurementData__Group_6_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__Group_6_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_1()); 

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
    // $ANTLR end "rule__NonMeasurementData__Alternatives_6_1"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Alternatives_6_2"
    // InternalSensidl.g:678:1: rule__MeasurementDataNotAdjustable__Alternatives_6_2 : ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) ) | ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) ) );
    public final void rule__MeasurementDataNotAdjustable__Alternatives_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:682:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) ) | ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==57) ) {
                alt6=1;
            }
            else if ( (LA6_0==58) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSensidl.g:683:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) )
                    {
                    // InternalSensidl.g:683:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) )
                    // InternalSensidl.g:684:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 )
                    {
                     before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_0()); 
                    // InternalSensidl.g:685:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 )
                    // InternalSensidl.g:685:2: rule__MeasurementDataNotAdjustable__Group_6_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementDataNotAdjustable__Group_6_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:689:6: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) )
                    {
                    // InternalSensidl.g:689:6: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) )
                    // InternalSensidl.g:690:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 )
                    {
                     before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_1()); 
                    // InternalSensidl.g:691:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 )
                    // InternalSensidl.g:691:2: rule__MeasurementDataNotAdjustable__Group_6_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementDataNotAdjustable__Group_6_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_1()); 

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
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Alternatives_6_2"


    // $ANTLR start "rule__DataConversion__Alternatives"
    // InternalSensidl.g:700:1: rule__DataConversion__Alternatives : ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) );
    public final void rule__DataConversion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:704:1: ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==52) ) {
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
                    // InternalSensidl.g:705:1: ( ruleLinearDataConversion )
                    {
                    // InternalSensidl.g:705:1: ( ruleLinearDataConversion )
                    // InternalSensidl.g:706:1: ruleLinearDataConversion
                    {
                     before(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLinearDataConversion();

                    state._fsp--;

                     after(grammarAccess.getDataConversionAccess().getLinearDataConversionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:711:6: ( ruleLinearDataConversionWithInterval )
                    {
                    // InternalSensidl.g:711:6: ( ruleLinearDataConversionWithInterval )
                    // InternalSensidl.g:712:1: ruleLinearDataConversionWithInterval
                    {
                     before(grammarAccess.getDataConversionAccess().getLinearDataConversionWithIntervalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:722:1: rule__Coding__Alternatives : ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) );
    public final void rule__Coding__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:726:1: ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            else if ( (LA8_0==13) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSensidl.g:727:1: ( ( 'SENSIDL_BINARY' ) )
                    {
                    // InternalSensidl.g:727:1: ( ( 'SENSIDL_BINARY' ) )
                    // InternalSensidl.g:728:1: ( 'SENSIDL_BINARY' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:729:1: ( 'SENSIDL_BINARY' )
                    // InternalSensidl.g:729:3: 'SENSIDL_BINARY'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:734:6: ( ( 'SENSIDL_JSON' ) )
                    {
                    // InternalSensidl.g:734:6: ( ( 'SENSIDL_JSON' ) )
                    // InternalSensidl.g:735:1: ( 'SENSIDL_JSON' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_JSONEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:736:1: ( 'SENSIDL_JSON' )
                    // InternalSensidl.g:736:3: 'SENSIDL_JSON'
                    {
                    match(input,13,FOLLOW_2); 

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
    // InternalSensidl.g:746:1: rule__Endianness__Alternatives : ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) );
    public final void rule__Endianness__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:750:1: ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSensidl.g:751:1: ( ( 'BIG_ENDIAN' ) )
                    {
                    // InternalSensidl.g:751:1: ( ( 'BIG_ENDIAN' ) )
                    // InternalSensidl.g:752:1: ( 'BIG_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:753:1: ( 'BIG_ENDIAN' )
                    // InternalSensidl.g:753:3: 'BIG_ENDIAN'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:758:6: ( ( 'LITTLE_ENDIAN' ) )
                    {
                    // InternalSensidl.g:758:6: ( ( 'LITTLE_ENDIAN' ) )
                    // InternalSensidl.g:759:1: ( 'LITTLE_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:760:1: ( 'LITTLE_ENDIAN' )
                    // InternalSensidl.g:760:3: 'LITTLE_ENDIAN'
                    {
                    match(input,15,FOLLOW_2); 

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


    // $ANTLR start "rule__DataTypeNotAdjustable__Alternatives"
    // InternalSensidl.g:770:1: rule__DataTypeNotAdjustable__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) );
    public final void rule__DataTypeNotAdjustable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:774:1: ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSensidl.g:775:1: ( ( 'STRING' ) )
                    {
                    // InternalSensidl.g:775:1: ( ( 'STRING' ) )
                    // InternalSensidl.g:776:1: ( 'STRING' )
                    {
                     before(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:777:1: ( 'STRING' )
                    // InternalSensidl.g:777:3: 'STRING'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:782:6: ( ( 'BOOLEAN' ) )
                    {
                    // InternalSensidl.g:782:6: ( ( 'BOOLEAN' ) )
                    // InternalSensidl.g:783:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getDataTypeNotAdjustableAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:784:1: ( 'BOOLEAN' )
                    // InternalSensidl.g:784:3: 'BOOLEAN'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeNotAdjustableAccess().getBOOLEANEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__DataTypeNotAdjustable__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalSensidl.g:794:1: rule__DataType__Alternatives : ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:798:1: ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) )
            int alt11=10;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 19:
                {
                alt11=2;
                }
                break;
            case 20:
                {
                alt11=3;
                }
                break;
            case 21:
                {
                alt11=4;
                }
                break;
            case 22:
                {
                alt11=5;
                }
                break;
            case 23:
                {
                alt11=6;
                }
                break;
            case 24:
                {
                alt11=7;
                }
                break;
            case 25:
                {
                alt11=8;
                }
                break;
            case 26:
                {
                alt11=9;
                }
                break;
            case 27:
                {
                alt11=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSensidl.g:799:1: ( ( 'INT8' ) )
                    {
                    // InternalSensidl.g:799:1: ( ( 'INT8' ) )
                    // InternalSensidl.g:800:1: ( 'INT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:801:1: ( 'INT8' )
                    // InternalSensidl.g:801:3: 'INT8'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:806:6: ( ( 'UINT8' ) )
                    {
                    // InternalSensidl.g:806:6: ( ( 'UINT8' ) )
                    // InternalSensidl.g:807:1: ( 'UINT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:808:1: ( 'UINT8' )
                    // InternalSensidl.g:808:3: 'UINT8'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:813:6: ( ( 'INT16' ) )
                    {
                    // InternalSensidl.g:813:6: ( ( 'INT16' ) )
                    // InternalSensidl.g:814:1: ( 'INT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 
                    // InternalSensidl.g:815:1: ( 'INT16' )
                    // InternalSensidl.g:815:3: 'INT16'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSensidl.g:820:6: ( ( 'UINT16' ) )
                    {
                    // InternalSensidl.g:820:6: ( ( 'UINT16' ) )
                    // InternalSensidl.g:821:1: ( 'UINT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 
                    // InternalSensidl.g:822:1: ( 'UINT16' )
                    // InternalSensidl.g:822:3: 'UINT16'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSensidl.g:827:6: ( ( 'INT32' ) )
                    {
                    // InternalSensidl.g:827:6: ( ( 'INT32' ) )
                    // InternalSensidl.g:828:1: ( 'INT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 
                    // InternalSensidl.g:829:1: ( 'INT32' )
                    // InternalSensidl.g:829:3: 'INT32'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSensidl.g:834:6: ( ( 'UINT32' ) )
                    {
                    // InternalSensidl.g:834:6: ( ( 'UINT32' ) )
                    // InternalSensidl.g:835:1: ( 'UINT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 
                    // InternalSensidl.g:836:1: ( 'UINT32' )
                    // InternalSensidl.g:836:3: 'UINT32'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSensidl.g:841:6: ( ( 'INT64' ) )
                    {
                    // InternalSensidl.g:841:6: ( ( 'INT64' ) )
                    // InternalSensidl.g:842:1: ( 'INT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 
                    // InternalSensidl.g:843:1: ( 'INT64' )
                    // InternalSensidl.g:843:3: 'INT64'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSensidl.g:848:6: ( ( 'UINT64' ) )
                    {
                    // InternalSensidl.g:848:6: ( ( 'UINT64' ) )
                    // InternalSensidl.g:849:1: ( 'UINT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 
                    // InternalSensidl.g:850:1: ( 'UINT64' )
                    // InternalSensidl.g:850:3: 'UINT64'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSensidl.g:855:6: ( ( 'FLOAT' ) )
                    {
                    // InternalSensidl.g:855:6: ( ( 'FLOAT' ) )
                    // InternalSensidl.g:856:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // InternalSensidl.g:857:1: ( 'FLOAT' )
                    // InternalSensidl.g:857:3: 'FLOAT'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSensidl.g:862:6: ( ( 'DOUBLE' ) )
                    {
                    // InternalSensidl.g:862:6: ( ( 'DOUBLE' ) )
                    // InternalSensidl.g:863:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 
                    // InternalSensidl.g:864:1: ( 'DOUBLE' )
                    // InternalSensidl.g:864:3: 'DOUBLE'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 

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
    // InternalSensidl.g:876:1: rule__SensorInterface__Group__0 : rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 ;
    public final void rule__SensorInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:880:1: ( rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 )
            // InternalSensidl.g:881:2: rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SensorInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:888:1: rule__SensorInterface__Group__0__Impl : ( 'sensorInterface' ) ;
    public final void rule__SensorInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:892:1: ( ( 'sensorInterface' ) )
            // InternalSensidl.g:893:1: ( 'sensorInterface' )
            {
            // InternalSensidl.g:893:1: ( 'sensorInterface' )
            // InternalSensidl.g:894:1: 'sensorInterface'
            {
             before(grammarAccess.getSensorInterfaceAccess().getSensorInterfaceKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSensidl.g:907:1: rule__SensorInterface__Group__1 : rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 ;
    public final void rule__SensorInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:911:1: ( rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 )
            // InternalSensidl.g:912:2: rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SensorInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:919:1: rule__SensorInterface__Group__1__Impl : ( ( rule__SensorInterface__NameAssignment_1 ) ) ;
    public final void rule__SensorInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:923:1: ( ( ( rule__SensorInterface__NameAssignment_1 ) ) )
            // InternalSensidl.g:924:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            {
            // InternalSensidl.g:924:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            // InternalSensidl.g:925:1: ( rule__SensorInterface__NameAssignment_1 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameAssignment_1()); 
            // InternalSensidl.g:926:1: ( rule__SensorInterface__NameAssignment_1 )
            // InternalSensidl.g:926:2: rule__SensorInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:936:1: rule__SensorInterface__Group__2 : rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 ;
    public final void rule__SensorInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:940:1: ( rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 )
            // InternalSensidl.g:941:2: rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SensorInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:948:1: rule__SensorInterface__Group__2__Impl : ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) ;
    public final void rule__SensorInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:952:1: ( ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) )
            // InternalSensidl.g:953:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            {
            // InternalSensidl.g:953:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            // InternalSensidl.g:954:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionAssignment_2()); 
            // InternalSensidl.g:955:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DESCRIPTION) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSensidl.g:955:2: rule__SensorInterface__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:965:1: rule__SensorInterface__Group__3 : rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 ;
    public final void rule__SensorInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:969:1: ( rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 )
            // InternalSensidl.g:970:2: rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__SensorInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:977:1: rule__SensorInterface__Group__3__Impl : ( ( rule__SensorInterface__Group_3__0 )? ) ;
    public final void rule__SensorInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:981:1: ( ( ( rule__SensorInterface__Group_3__0 )? ) )
            // InternalSensidl.g:982:1: ( ( rule__SensorInterface__Group_3__0 )? )
            {
            // InternalSensidl.g:982:1: ( ( rule__SensorInterface__Group_3__0 )? )
            // InternalSensidl.g:983:1: ( rule__SensorInterface__Group_3__0 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup_3()); 
            // InternalSensidl.g:984:1: ( rule__SensorInterface__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSensidl.g:984:2: rule__SensorInterface__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:994:1: rule__SensorInterface__Group__4 : rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 ;
    public final void rule__SensorInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:998:1: ( rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 )
            // InternalSensidl.g:999:2: rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__SensorInterface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1006:1: rule__SensorInterface__Group__4__Impl : ( '{' ) ;
    public final void rule__SensorInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1010:1: ( ( '{' ) )
            // InternalSensidl.g:1011:1: ( '{' )
            {
            // InternalSensidl.g:1011:1: ( '{' )
            // InternalSensidl.g:1012:1: '{'
            {
             before(grammarAccess.getSensorInterfaceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSensidl.g:1025:1: rule__SensorInterface__Group__5 : rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 ;
    public final void rule__SensorInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1029:1: ( rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 )
            // InternalSensidl.g:1030:2: rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__SensorInterface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1037:1: rule__SensorInterface__Group__5__Impl : ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) ;
    public final void rule__SensorInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1041:1: ( ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) )
            // InternalSensidl.g:1042:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            {
            // InternalSensidl.g:1042:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            // InternalSensidl.g:1043:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsAssignment_5()); 
            // InternalSensidl.g:1044:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            // InternalSensidl.g:1044:2: rule__SensorInterface__EncodingSettingsAssignment_5
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1054:1: rule__SensorInterface__Group__6 : rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 ;
    public final void rule__SensorInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1058:1: ( rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 )
            // InternalSensidl.g:1059:2: rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__SensorInterface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1066:1: rule__SensorInterface__Group__6__Impl : ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) ;
    public final void rule__SensorInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1070:1: ( ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) )
            // InternalSensidl.g:1071:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            {
            // InternalSensidl.g:1071:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            // InternalSensidl.g:1072:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionAssignment_6()); 
            // InternalSensidl.g:1073:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            // InternalSensidl.g:1073:2: rule__SensorInterface__DataDescriptionAssignment_6
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1083:1: rule__SensorInterface__Group__7 : rule__SensorInterface__Group__7__Impl ;
    public final void rule__SensorInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1087:1: ( rule__SensorInterface__Group__7__Impl )
            // InternalSensidl.g:1088:2: rule__SensorInterface__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1094:1: rule__SensorInterface__Group__7__Impl : ( '}' ) ;
    public final void rule__SensorInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1098:1: ( ( '}' ) )
            // InternalSensidl.g:1099:1: ( '}' )
            {
            // InternalSensidl.g:1099:1: ( '}' )
            // InternalSensidl.g:1100:1: '}'
            {
             before(grammarAccess.getSensorInterfaceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSensidl.g:1129:1: rule__SensorInterface__Group_3__0 : rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 ;
    public final void rule__SensorInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1133:1: ( rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 )
            // InternalSensidl.g:1134:2: rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__SensorInterface__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1141:1: rule__SensorInterface__Group_3__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1145:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1146:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1146:1: ( 'with identifier' )
            // InternalSensidl.g:1147:1: 'with identifier'
            {
             before(grammarAccess.getSensorInterfaceAccess().getWithIdentifierKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSensidl.g:1160:1: rule__SensorInterface__Group_3__1 : rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 ;
    public final void rule__SensorInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1164:1: ( rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 )
            // InternalSensidl.g:1165:2: rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__SensorInterface__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1172:1: rule__SensorInterface__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SensorInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1176:1: ( ( ':' ) )
            // InternalSensidl.g:1177:1: ( ':' )
            {
            // InternalSensidl.g:1177:1: ( ':' )
            // InternalSensidl.g:1178:1: ':'
            {
             before(grammarAccess.getSensorInterfaceAccess().getColonKeyword_3_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSensidl.g:1191:1: rule__SensorInterface__Group_3__2 : rule__SensorInterface__Group_3__2__Impl ;
    public final void rule__SensorInterface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1195:1: ( rule__SensorInterface__Group_3__2__Impl )
            // InternalSensidl.g:1196:2: rule__SensorInterface__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1202:1: rule__SensorInterface__Group_3__2__Impl : ( ( rule__SensorInterface__IDAssignment_3_2 ) ) ;
    public final void rule__SensorInterface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1206:1: ( ( ( rule__SensorInterface__IDAssignment_3_2 ) ) )
            // InternalSensidl.g:1207:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            {
            // InternalSensidl.g:1207:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            // InternalSensidl.g:1208:1: ( rule__SensorInterface__IDAssignment_3_2 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDAssignment_3_2()); 
            // InternalSensidl.g:1209:1: ( rule__SensorInterface__IDAssignment_3_2 )
            // InternalSensidl.g:1209:2: rule__SensorInterface__IDAssignment_3_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1225:1: rule__EncodingSettings__Group__0 : rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 ;
    public final void rule__EncodingSettings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1229:1: ( rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 )
            // InternalSensidl.g:1230:2: rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EncodingSettings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1237:1: rule__EncodingSettings__Group__0__Impl : ( 'encoding' ) ;
    public final void rule__EncodingSettings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1241:1: ( ( 'encoding' ) )
            // InternalSensidl.g:1242:1: ( 'encoding' )
            {
            // InternalSensidl.g:1242:1: ( 'encoding' )
            // InternalSensidl.g:1243:1: 'encoding'
            {
             before(grammarAccess.getEncodingSettingsAccess().getEncodingKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSensidl.g:1256:1: rule__EncodingSettings__Group__1 : rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 ;
    public final void rule__EncodingSettings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1260:1: ( rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 )
            // InternalSensidl.g:1261:2: rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EncodingSettings__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1268:1: rule__EncodingSettings__Group__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1272:1: ( ( ':' ) )
            // InternalSensidl.g:1273:1: ( ':' )
            {
            // InternalSensidl.g:1273:1: ( ':' )
            // InternalSensidl.g:1274:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSensidl.g:1287:1: rule__EncodingSettings__Group__2 : rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 ;
    public final void rule__EncodingSettings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1291:1: ( rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 )
            // InternalSensidl.g:1292:2: rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__EncodingSettings__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1299:1: rule__EncodingSettings__Group__2__Impl : ( ( rule__EncodingSettings__CodingAssignment_2 ) ) ;
    public final void rule__EncodingSettings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1303:1: ( ( ( rule__EncodingSettings__CodingAssignment_2 ) ) )
            // InternalSensidl.g:1304:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            {
            // InternalSensidl.g:1304:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            // InternalSensidl.g:1305:1: ( rule__EncodingSettings__CodingAssignment_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getCodingAssignment_2()); 
            // InternalSensidl.g:1306:1: ( rule__EncodingSettings__CodingAssignment_2 )
            // InternalSensidl.g:1306:2: rule__EncodingSettings__CodingAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1316:1: rule__EncodingSettings__Group__3 : rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 ;
    public final void rule__EncodingSettings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1320:1: ( rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 )
            // InternalSensidl.g:1321:2: rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__EncodingSettings__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1328:1: rule__EncodingSettings__Group__3__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1332:1: ( ( ',' ) )
            // InternalSensidl.g:1333:1: ( ',' )
            {
            // InternalSensidl.g:1333:1: ( ',' )
            // InternalSensidl.g:1334:1: ','
            {
             before(grammarAccess.getEncodingSettingsAccess().getCommaKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSensidl.g:1347:1: rule__EncodingSettings__Group__4 : rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 ;
    public final void rule__EncodingSettings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1351:1: ( rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 )
            // InternalSensidl.g:1352:2: rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__EncodingSettings__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1359:1: rule__EncodingSettings__Group__4__Impl : ( 'endianness' ) ;
    public final void rule__EncodingSettings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1363:1: ( ( 'endianness' ) )
            // InternalSensidl.g:1364:1: ( 'endianness' )
            {
            // InternalSensidl.g:1364:1: ( 'endianness' )
            // InternalSensidl.g:1365:1: 'endianness'
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSensidl.g:1378:1: rule__EncodingSettings__Group__5 : rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 ;
    public final void rule__EncodingSettings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1382:1: ( rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 )
            // InternalSensidl.g:1383:2: rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__EncodingSettings__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1390:1: rule__EncodingSettings__Group__5__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1394:1: ( ( ':' ) )
            // InternalSensidl.g:1395:1: ( ':' )
            {
            // InternalSensidl.g:1395:1: ( ':' )
            // InternalSensidl.g:1396:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSensidl.g:1409:1: rule__EncodingSettings__Group__6 : rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 ;
    public final void rule__EncodingSettings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1413:1: ( rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 )
            // InternalSensidl.g:1414:2: rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__EncodingSettings__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1421:1: rule__EncodingSettings__Group__6__Impl : ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) ;
    public final void rule__EncodingSettings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1425:1: ( ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) )
            // InternalSensidl.g:1426:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            {
            // InternalSensidl.g:1426:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            // InternalSensidl.g:1427:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessAssignment_6()); 
            // InternalSensidl.g:1428:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            // InternalSensidl.g:1428:2: rule__EncodingSettings__EndiannessAssignment_6
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1438:1: rule__EncodingSettings__Group__7 : rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 ;
    public final void rule__EncodingSettings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1442:1: ( rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 )
            // InternalSensidl.g:1443:2: rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__EncodingSettings__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1450:1: rule__EncodingSettings__Group__7__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1454:1: ( ( ',' ) )
            // InternalSensidl.g:1455:1: ( ',' )
            {
            // InternalSensidl.g:1455:1: ( ',' )
            // InternalSensidl.g:1456:1: ','
            {
             before(grammarAccess.getEncodingSettingsAccess().getCommaKeyword_7()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSensidl.g:1469:1: rule__EncodingSettings__Group__8 : rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 ;
    public final void rule__EncodingSettings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1473:1: ( rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 )
            // InternalSensidl.g:1474:2: rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__EncodingSettings__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1481:1: rule__EncodingSettings__Group__8__Impl : ( 'alignment' ) ;
    public final void rule__EncodingSettings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1485:1: ( ( 'alignment' ) )
            // InternalSensidl.g:1486:1: ( 'alignment' )
            {
            // InternalSensidl.g:1486:1: ( 'alignment' )
            // InternalSensidl.g:1487:1: 'alignment'
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentKeyword_8()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSensidl.g:1500:1: rule__EncodingSettings__Group__9 : rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 ;
    public final void rule__EncodingSettings__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1504:1: ( rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 )
            // InternalSensidl.g:1505:2: rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__EncodingSettings__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1512:1: rule__EncodingSettings__Group__9__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1516:1: ( ( ':' ) )
            // InternalSensidl.g:1517:1: ( ':' )
            {
            // InternalSensidl.g:1517:1: ( ':' )
            // InternalSensidl.g:1518:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_9()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSensidl.g:1531:1: rule__EncodingSettings__Group__10 : rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 ;
    public final void rule__EncodingSettings__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1535:1: ( rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 )
            // InternalSensidl.g:1536:2: rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__EncodingSettings__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1543:1: rule__EncodingSettings__Group__10__Impl : ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) ;
    public final void rule__EncodingSettings__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1547:1: ( ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) )
            // InternalSensidl.g:1548:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            {
            // InternalSensidl.g:1548:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            // InternalSensidl.g:1549:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentAssignment_10()); 
            // InternalSensidl.g:1550:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            // InternalSensidl.g:1550:2: rule__EncodingSettings__AlignmentAssignment_10
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1560:1: rule__EncodingSettings__Group__11 : rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 ;
    public final void rule__EncodingSettings__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1564:1: ( rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 )
            // InternalSensidl.g:1565:2: rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__EncodingSettings__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1572:1: rule__EncodingSettings__Group__11__Impl : ( 'BIT' ) ;
    public final void rule__EncodingSettings__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1576:1: ( ( 'BIT' ) )
            // InternalSensidl.g:1577:1: ( 'BIT' )
            {
            // InternalSensidl.g:1577:1: ( 'BIT' )
            // InternalSensidl.g:1578:1: 'BIT'
            {
             before(grammarAccess.getEncodingSettingsAccess().getBITKeyword_11()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSensidl.g:1591:1: rule__EncodingSettings__Group__12 : rule__EncodingSettings__Group__12__Impl ;
    public final void rule__EncodingSettings__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1595:1: ( rule__EncodingSettings__Group__12__Impl )
            // InternalSensidl.g:1596:2: rule__EncodingSettings__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1602:1: rule__EncodingSettings__Group__12__Impl : ( ( rule__EncodingSettings__Group_12__0 )? ) ;
    public final void rule__EncodingSettings__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1606:1: ( ( ( rule__EncodingSettings__Group_12__0 )? ) )
            // InternalSensidl.g:1607:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            {
            // InternalSensidl.g:1607:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            // InternalSensidl.g:1608:1: ( rule__EncodingSettings__Group_12__0 )?
            {
             before(grammarAccess.getEncodingSettingsAccess().getGroup_12()); 
            // InternalSensidl.g:1609:1: ( rule__EncodingSettings__Group_12__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSensidl.g:1609:2: rule__EncodingSettings__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1645:1: rule__EncodingSettings__Group_12__0 : rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 ;
    public final void rule__EncodingSettings__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1649:1: ( rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 )
            // InternalSensidl.g:1650:2: rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1
            {
            pushFollow(FOLLOW_8);
            rule__EncodingSettings__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1657:1: rule__EncodingSettings__Group_12__0__Impl : ( 'with identifier' ) ;
    public final void rule__EncodingSettings__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1661:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1662:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1662:1: ( 'with identifier' )
            // InternalSensidl.g:1663:1: 'with identifier'
            {
             before(grammarAccess.getEncodingSettingsAccess().getWithIdentifierKeyword_12_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSensidl.g:1676:1: rule__EncodingSettings__Group_12__1 : rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 ;
    public final void rule__EncodingSettings__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1680:1: ( rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 )
            // InternalSensidl.g:1681:2: rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2
            {
            pushFollow(FOLLOW_9);
            rule__EncodingSettings__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1688:1: rule__EncodingSettings__Group_12__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1692:1: ( ( ':' ) )
            // InternalSensidl.g:1693:1: ( ':' )
            {
            // InternalSensidl.g:1693:1: ( ':' )
            // InternalSensidl.g:1694:1: ':'
            {
             before(grammarAccess.getEncodingSettingsAccess().getColonKeyword_12_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSensidl.g:1707:1: rule__EncodingSettings__Group_12__2 : rule__EncodingSettings__Group_12__2__Impl ;
    public final void rule__EncodingSettings__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1711:1: ( rule__EncodingSettings__Group_12__2__Impl )
            // InternalSensidl.g:1712:2: rule__EncodingSettings__Group_12__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1718:1: rule__EncodingSettings__Group_12__2__Impl : ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) ;
    public final void rule__EncodingSettings__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1722:1: ( ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) )
            // InternalSensidl.g:1723:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            {
            // InternalSensidl.g:1723:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            // InternalSensidl.g:1724:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getIDAssignment_12_2()); 
            // InternalSensidl.g:1725:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            // InternalSensidl.g:1725:2: rule__EncodingSettings__IDAssignment_12_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1741:1: rule__SensorDataDescription__Group__0 : rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 ;
    public final void rule__SensorDataDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1745:1: ( rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 )
            // InternalSensidl.g:1746:2: rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__SensorDataDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1753:1: rule__SensorDataDescription__Group__0__Impl : ( 'sensorData' ) ;
    public final void rule__SensorDataDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1757:1: ( ( 'sensorData' ) )
            // InternalSensidl.g:1758:1: ( 'sensorData' )
            {
            // InternalSensidl.g:1758:1: ( 'sensorData' )
            // InternalSensidl.g:1759:1: 'sensorData'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSensorDataKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSensidl.g:1772:1: rule__SensorDataDescription__Group__1 : rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 ;
    public final void rule__SensorDataDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1776:1: ( rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 )
            // InternalSensidl.g:1777:2: rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__SensorDataDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1784:1: rule__SensorDataDescription__Group__1__Impl : ( () ) ;
    public final void rule__SensorDataDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1788:1: ( ( () ) )
            // InternalSensidl.g:1789:1: ( () )
            {
            // InternalSensidl.g:1789:1: ( () )
            // InternalSensidl.g:1790:1: ()
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1()); 
            // InternalSensidl.g:1791:1: ()
            // InternalSensidl.g:1793:1: 
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
    // InternalSensidl.g:1803:1: rule__SensorDataDescription__Group__2 : rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 ;
    public final void rule__SensorDataDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1807:1: ( rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 )
            // InternalSensidl.g:1808:2: rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__SensorDataDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1815:1: rule__SensorDataDescription__Group__2__Impl : ( ( rule__SensorDataDescription__Group_2__0 )? ) ;
    public final void rule__SensorDataDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1819:1: ( ( ( rule__SensorDataDescription__Group_2__0 )? ) )
            // InternalSensidl.g:1820:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            {
            // InternalSensidl.g:1820:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            // InternalSensidl.g:1821:1: ( rule__SensorDataDescription__Group_2__0 )?
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup_2()); 
            // InternalSensidl.g:1822:1: ( rule__SensorDataDescription__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSensidl.g:1822:2: rule__SensorDataDescription__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1832:1: rule__SensorDataDescription__Group__3 : rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 ;
    public final void rule__SensorDataDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1836:1: ( rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 )
            // InternalSensidl.g:1837:2: rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__SensorDataDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1844:1: rule__SensorDataDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__SensorDataDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1848:1: ( ( '{' ) )
            // InternalSensidl.g:1849:1: ( '{' )
            {
            // InternalSensidl.g:1849:1: ( '{' )
            // InternalSensidl.g:1850:1: '{'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSensidl.g:1863:1: rule__SensorDataDescription__Group__4 : rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 ;
    public final void rule__SensorDataDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1867:1: ( rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 )
            // InternalSensidl.g:1868:2: rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__SensorDataDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1875:1: rule__SensorDataDescription__Group__4__Impl : ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) ;
    public final void rule__SensorDataDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1879:1: ( ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) )
            // InternalSensidl.g:1880:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            {
            // InternalSensidl.g:1880:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            // InternalSensidl.g:1881:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsAssignment_4()); 
            // InternalSensidl.g:1882:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSensidl.g:1882:2: rule__SensorDataDescription__DataSetsAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SensorDataDescription__DataSetsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalSensidl.g:1892:1: rule__SensorDataDescription__Group__5 : rule__SensorDataDescription__Group__5__Impl ;
    public final void rule__SensorDataDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1896:1: ( rule__SensorDataDescription__Group__5__Impl )
            // InternalSensidl.g:1897:2: rule__SensorDataDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1903:1: rule__SensorDataDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__SensorDataDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1907:1: ( ( '}' ) )
            // InternalSensidl.g:1908:1: ( '}' )
            {
            // InternalSensidl.g:1908:1: ( '}' )
            // InternalSensidl.g:1909:1: '}'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSensidl.g:1934:1: rule__SensorDataDescription__Group_2__0 : rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 ;
    public final void rule__SensorDataDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1938:1: ( rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 )
            // InternalSensidl.g:1939:2: rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__SensorDataDescription__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1946:1: rule__SensorDataDescription__Group_2__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorDataDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1950:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1951:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1951:1: ( 'with identifier' )
            // InternalSensidl.g:1952:1: 'with identifier'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getWithIdentifierKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSensidl.g:1965:1: rule__SensorDataDescription__Group_2__1 : rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 ;
    public final void rule__SensorDataDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1969:1: ( rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 )
            // InternalSensidl.g:1970:2: rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__SensorDataDescription__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:1977:1: rule__SensorDataDescription__Group_2__1__Impl : ( ':' ) ;
    public final void rule__SensorDataDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1981:1: ( ( ':' ) )
            // InternalSensidl.g:1982:1: ( ':' )
            {
            // InternalSensidl.g:1982:1: ( ':' )
            // InternalSensidl.g:1983:1: ':'
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getColonKeyword_2_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSensidl.g:1996:1: rule__SensorDataDescription__Group_2__2 : rule__SensorDataDescription__Group_2__2__Impl ;
    public final void rule__SensorDataDescription__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2000:1: ( rule__SensorDataDescription__Group_2__2__Impl )
            // InternalSensidl.g:2001:2: rule__SensorDataDescription__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2007:1: rule__SensorDataDescription__Group_2__2__Impl : ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) ;
    public final void rule__SensorDataDescription__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2011:1: ( ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) )
            // InternalSensidl.g:2012:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            {
            // InternalSensidl.g:2012:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            // InternalSensidl.g:2013:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDAssignment_2_2()); 
            // InternalSensidl.g:2014:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            // InternalSensidl.g:2014:2: rule__SensorDataDescription__IDAssignment_2_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2030:1: rule__DataSet__Group__0 : rule__DataSet__Group__0__Impl rule__DataSet__Group__1 ;
    public final void rule__DataSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2034:1: ( rule__DataSet__Group__0__Impl rule__DataSet__Group__1 )
            // InternalSensidl.g:2035:2: rule__DataSet__Group__0__Impl rule__DataSet__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2042:1: rule__DataSet__Group__0__Impl : ( 'dataSet' ) ;
    public final void rule__DataSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2046:1: ( ( 'dataSet' ) )
            // InternalSensidl.g:2047:1: ( 'dataSet' )
            {
            // InternalSensidl.g:2047:1: ( 'dataSet' )
            // InternalSensidl.g:2048:1: 'dataSet'
            {
             before(grammarAccess.getDataSetAccess().getDataSetKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSensidl.g:2061:1: rule__DataSet__Group__1 : rule__DataSet__Group__1__Impl rule__DataSet__Group__2 ;
    public final void rule__DataSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2065:1: ( rule__DataSet__Group__1__Impl rule__DataSet__Group__2 )
            // InternalSensidl.g:2066:2: rule__DataSet__Group__1__Impl rule__DataSet__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__DataSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2073:1: rule__DataSet__Group__1__Impl : ( ( rule__DataSet__NameAssignment_1 ) ) ;
    public final void rule__DataSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2077:1: ( ( ( rule__DataSet__NameAssignment_1 ) ) )
            // InternalSensidl.g:2078:1: ( ( rule__DataSet__NameAssignment_1 ) )
            {
            // InternalSensidl.g:2078:1: ( ( rule__DataSet__NameAssignment_1 ) )
            // InternalSensidl.g:2079:1: ( rule__DataSet__NameAssignment_1 )
            {
             before(grammarAccess.getDataSetAccess().getNameAssignment_1()); 
            // InternalSensidl.g:2080:1: ( rule__DataSet__NameAssignment_1 )
            // InternalSensidl.g:2080:2: rule__DataSet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2090:1: rule__DataSet__Group__2 : rule__DataSet__Group__2__Impl rule__DataSet__Group__3 ;
    public final void rule__DataSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2094:1: ( rule__DataSet__Group__2__Impl rule__DataSet__Group__3 )
            // InternalSensidl.g:2095:2: rule__DataSet__Group__2__Impl rule__DataSet__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__DataSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2102:1: rule__DataSet__Group__2__Impl : ( ( rule__DataSet__Group_2__0 )? ) ;
    public final void rule__DataSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2106:1: ( ( ( rule__DataSet__Group_2__0 )? ) )
            // InternalSensidl.g:2107:1: ( ( rule__DataSet__Group_2__0 )? )
            {
            // InternalSensidl.g:2107:1: ( ( rule__DataSet__Group_2__0 )? )
            // InternalSensidl.g:2108:1: ( rule__DataSet__Group_2__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_2()); 
            // InternalSensidl.g:2109:1: ( rule__DataSet__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSensidl.g:2109:2: rule__DataSet__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2119:1: rule__DataSet__Group__3 : rule__DataSet__Group__3__Impl rule__DataSet__Group__4 ;
    public final void rule__DataSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2123:1: ( rule__DataSet__Group__3__Impl rule__DataSet__Group__4 )
            // InternalSensidl.g:2124:2: rule__DataSet__Group__3__Impl rule__DataSet__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__DataSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2131:1: rule__DataSet__Group__3__Impl : ( ( rule__DataSet__Group_3__0 )* ) ;
    public final void rule__DataSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2135:1: ( ( ( rule__DataSet__Group_3__0 )* ) )
            // InternalSensidl.g:2136:1: ( ( rule__DataSet__Group_3__0 )* )
            {
            // InternalSensidl.g:2136:1: ( ( rule__DataSet__Group_3__0 )* )
            // InternalSensidl.g:2137:1: ( rule__DataSet__Group_3__0 )*
            {
             before(grammarAccess.getDataSetAccess().getGroup_3()); 
            // InternalSensidl.g:2138:1: ( rule__DataSet__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSensidl.g:2138:2: rule__DataSet__Group_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__DataSet__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

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
    // InternalSensidl.g:2148:1: rule__DataSet__Group__4 : rule__DataSet__Group__4__Impl rule__DataSet__Group__5 ;
    public final void rule__DataSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2152:1: ( rule__DataSet__Group__4__Impl rule__DataSet__Group__5 )
            // InternalSensidl.g:2153:2: rule__DataSet__Group__4__Impl rule__DataSet__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__DataSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2160:1: rule__DataSet__Group__4__Impl : ( ( rule__DataSet__Group_4__0 )? ) ;
    public final void rule__DataSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2164:1: ( ( ( rule__DataSet__Group_4__0 )? ) )
            // InternalSensidl.g:2165:1: ( ( rule__DataSet__Group_4__0 )? )
            {
            // InternalSensidl.g:2165:1: ( ( rule__DataSet__Group_4__0 )? )
            // InternalSensidl.g:2166:1: ( rule__DataSet__Group_4__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_4()); 
            // InternalSensidl.g:2167:1: ( rule__DataSet__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSensidl.g:2167:2: rule__DataSet__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSet__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSetAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalSensidl.g:2177:1: rule__DataSet__Group__5 : rule__DataSet__Group__5__Impl rule__DataSet__Group__6 ;
    public final void rule__DataSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2181:1: ( rule__DataSet__Group__5__Impl rule__DataSet__Group__6 )
            // InternalSensidl.g:2182:2: rule__DataSet__Group__5__Impl rule__DataSet__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__DataSet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2189:1: rule__DataSet__Group__5__Impl : ( ( rule__DataSet__DescriptionAssignment_5 )? ) ;
    public final void rule__DataSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2193:1: ( ( ( rule__DataSet__DescriptionAssignment_5 )? ) )
            // InternalSensidl.g:2194:1: ( ( rule__DataSet__DescriptionAssignment_5 )? )
            {
            // InternalSensidl.g:2194:1: ( ( rule__DataSet__DescriptionAssignment_5 )? )
            // InternalSensidl.g:2195:1: ( rule__DataSet__DescriptionAssignment_5 )?
            {
             before(grammarAccess.getDataSetAccess().getDescriptionAssignment_5()); 
            // InternalSensidl.g:2196:1: ( rule__DataSet__DescriptionAssignment_5 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DESCRIPTION) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSensidl.g:2196:2: rule__DataSet__DescriptionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSet__DescriptionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSetAccess().getDescriptionAssignment_5()); 

            }


            }

        }
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
    // InternalSensidl.g:2206:1: rule__DataSet__Group__6 : rule__DataSet__Group__6__Impl rule__DataSet__Group__7 ;
    public final void rule__DataSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2210:1: ( rule__DataSet__Group__6__Impl rule__DataSet__Group__7 )
            // InternalSensidl.g:2211:2: rule__DataSet__Group__6__Impl rule__DataSet__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__DataSet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2218:1: rule__DataSet__Group__6__Impl : ( '{' ) ;
    public final void rule__DataSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2222:1: ( ( '{' ) )
            // InternalSensidl.g:2223:1: ( '{' )
            {
            // InternalSensidl.g:2223:1: ( '{' )
            // InternalSensidl.g:2224:1: '{'
            {
             before(grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalSensidl.g:2237:1: rule__DataSet__Group__7 : rule__DataSet__Group__7__Impl rule__DataSet__Group__8 ;
    public final void rule__DataSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2241:1: ( rule__DataSet__Group__7__Impl rule__DataSet__Group__8 )
            // InternalSensidl.g:2242:2: rule__DataSet__Group__7__Impl rule__DataSet__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__DataSet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2249:1: rule__DataSet__Group__7__Impl : ( ( rule__DataSet__DataAssignment_7 )* ) ;
    public final void rule__DataSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2253:1: ( ( ( rule__DataSet__DataAssignment_7 )* ) )
            // InternalSensidl.g:2254:1: ( ( rule__DataSet__DataAssignment_7 )* )
            {
            // InternalSensidl.g:2254:1: ( ( rule__DataSet__DataAssignment_7 )* )
            // InternalSensidl.g:2255:1: ( rule__DataSet__DataAssignment_7 )*
            {
             before(grammarAccess.getDataSetAccess().getDataAssignment_7()); 
            // InternalSensidl.g:2256:1: ( rule__DataSet__DataAssignment_7 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSensidl.g:2256:2: rule__DataSet__DataAssignment_7
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__DataSet__DataAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getDataSetAccess().getDataAssignment_7()); 

            }


            }

        }
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
    // InternalSensidl.g:2266:1: rule__DataSet__Group__8 : rule__DataSet__Group__8__Impl ;
    public final void rule__DataSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2270:1: ( rule__DataSet__Group__8__Impl )
            // InternalSensidl.g:2271:2: rule__DataSet__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2277:1: rule__DataSet__Group__8__Impl : ( '}' ) ;
    public final void rule__DataSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2281:1: ( ( '}' ) )
            // InternalSensidl.g:2282:1: ( '}' )
            {
            // InternalSensidl.g:2282:1: ( '}' )
            // InternalSensidl.g:2283:1: '}'
            {
             before(grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataSet__Group_2__0"
    // InternalSensidl.g:2314:1: rule__DataSet__Group_2__0 : rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 ;
    public final void rule__DataSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2318:1: ( rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 )
            // InternalSensidl.g:2319:2: rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__DataSet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2326:1: rule__DataSet__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__DataSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2330:1: ( ( 'uses' ) )
            // InternalSensidl.g:2331:1: ( 'uses' )
            {
            // InternalSensidl.g:2331:1: ( 'uses' )
            // InternalSensidl.g:2332:1: 'uses'
            {
             before(grammarAccess.getDataSetAccess().getUsesKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSensidl.g:2345:1: rule__DataSet__Group_2__1 : rule__DataSet__Group_2__1__Impl ;
    public final void rule__DataSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2349:1: ( rule__DataSet__Group_2__1__Impl )
            // InternalSensidl.g:2350:2: rule__DataSet__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2356:1: rule__DataSet__Group_2__1__Impl : ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) ) ;
    public final void rule__DataSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2360:1: ( ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) ) )
            // InternalSensidl.g:2361:1: ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) )
            {
            // InternalSensidl.g:2361:1: ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) )
            // InternalSensidl.g:2362:1: ( rule__DataSet__ParentDataSetAssignment_2_1 )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetAssignment_2_1()); 
            // InternalSensidl.g:2363:1: ( rule__DataSet__ParentDataSetAssignment_2_1 )
            // InternalSensidl.g:2363:2: rule__DataSet__ParentDataSetAssignment_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2377:1: rule__DataSet__Group_3__0 : rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 ;
    public final void rule__DataSet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2381:1: ( rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 )
            // InternalSensidl.g:2382:2: rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__DataSet__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2389:1: rule__DataSet__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DataSet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2393:1: ( ( ',' ) )
            // InternalSensidl.g:2394:1: ( ',' )
            {
            // InternalSensidl.g:2394:1: ( ',' )
            // InternalSensidl.g:2395:1: ','
            {
             before(grammarAccess.getDataSetAccess().getCommaKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getCommaKeyword_3_0()); 

            }


            }

        }
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
    // InternalSensidl.g:2408:1: rule__DataSet__Group_3__1 : rule__DataSet__Group_3__1__Impl ;
    public final void rule__DataSet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2412:1: ( rule__DataSet__Group_3__1__Impl )
            // InternalSensidl.g:2413:2: rule__DataSet__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSensidl.g:2419:1: rule__DataSet__Group_3__1__Impl : ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) ) ;
    public final void rule__DataSet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2423:1: ( ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) ) )
            // InternalSensidl.g:2424:1: ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) )
            {
            // InternalSensidl.g:2424:1: ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) )
            // InternalSensidl.g:2425:1: ( rule__DataSet__ParentDataSetAssignment_3_1 )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetAssignment_3_1()); 
            // InternalSensidl.g:2426:1: ( rule__DataSet__ParentDataSetAssignment_3_1 )
            // InternalSensidl.g:2426:2: rule__DataSet__ParentDataSetAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__ParentDataSetAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSetAccess().getParentDataSetAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataSet__Group_4__0"
    // InternalSensidl.g:2440:1: rule__DataSet__Group_4__0 : rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1 ;
    public final void rule__DataSet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2444:1: ( rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1 )
            // InternalSensidl.g:2445:2: rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__DataSet__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSet__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_4__0"


    // $ANTLR start "rule__DataSet__Group_4__0__Impl"
    // InternalSensidl.g:2452:1: rule__DataSet__Group_4__0__Impl : ( 'with identifier' ) ;
    public final void rule__DataSet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2456:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:2457:1: ( 'with identifier' )
            {
            // InternalSensidl.g:2457:1: ( 'with identifier' )
            // InternalSensidl.g:2458:1: 'with identifier'
            {
             before(grammarAccess.getDataSetAccess().getWithIdentifierKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getWithIdentifierKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_4__0__Impl"


    // $ANTLR start "rule__DataSet__Group_4__1"
    // InternalSensidl.g:2471:1: rule__DataSet__Group_4__1 : rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2 ;
    public final void rule__DataSet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2475:1: ( rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2 )
            // InternalSensidl.g:2476:2: rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__DataSet__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSet__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_4__1"


    // $ANTLR start "rule__DataSet__Group_4__1__Impl"
    // InternalSensidl.g:2483:1: rule__DataSet__Group_4__1__Impl : ( ':' ) ;
    public final void rule__DataSet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2487:1: ( ( ':' ) )
            // InternalSensidl.g:2488:1: ( ':' )
            {
            // InternalSensidl.g:2488:1: ( ':' )
            // InternalSensidl.g:2489:1: ':'
            {
             before(grammarAccess.getDataSetAccess().getColonKeyword_4_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_4__1__Impl"


    // $ANTLR start "rule__DataSet__Group_4__2"
    // InternalSensidl.g:2502:1: rule__DataSet__Group_4__2 : rule__DataSet__Group_4__2__Impl ;
    public final void rule__DataSet__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2506:1: ( rule__DataSet__Group_4__2__Impl )
            // InternalSensidl.g:2507:2: rule__DataSet__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_4__2"


    // $ANTLR start "rule__DataSet__Group_4__2__Impl"
    // InternalSensidl.g:2513:1: rule__DataSet__Group_4__2__Impl : ( ( rule__DataSet__IDAssignment_4_2 ) ) ;
    public final void rule__DataSet__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2517:1: ( ( ( rule__DataSet__IDAssignment_4_2 ) ) )
            // InternalSensidl.g:2518:1: ( ( rule__DataSet__IDAssignment_4_2 ) )
            {
            // InternalSensidl.g:2518:1: ( ( rule__DataSet__IDAssignment_4_2 ) )
            // InternalSensidl.g:2519:1: ( rule__DataSet__IDAssignment_4_2 )
            {
             before(grammarAccess.getDataSetAccess().getIDAssignment_4_2()); 
            // InternalSensidl.g:2520:1: ( rule__DataSet__IDAssignment_4_2 )
            // InternalSensidl.g:2520:2: rule__DataSet__IDAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__IDAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDataSetAccess().getIDAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__Group_4__2__Impl"


    // $ANTLR start "rule__MeasurementData__Group__0"
    // InternalSensidl.g:2536:1: rule__MeasurementData__Group__0 : rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 ;
    public final void rule__MeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2540:1: ( rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 )
            // InternalSensidl.g:2541:2: rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__MeasurementData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2548:1: rule__MeasurementData__Group__0__Impl : ( ( rule__MeasurementData__NameAssignment_0 ) ) ;
    public final void rule__MeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2552:1: ( ( ( rule__MeasurementData__NameAssignment_0 ) ) )
            // InternalSensidl.g:2553:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:2553:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            // InternalSensidl.g:2554:1: ( rule__MeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:2555:1: ( rule__MeasurementData__NameAssignment_0 )
            // InternalSensidl.g:2555:2: rule__MeasurementData__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2565:1: rule__MeasurementData__Group__1 : rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 ;
    public final void rule__MeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2569:1: ( rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 )
            // InternalSensidl.g:2570:2: rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__MeasurementData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2577:1: rule__MeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2581:1: ( ( 'as' ) )
            // InternalSensidl.g:2582:1: ( 'as' )
            {
            // InternalSensidl.g:2582:1: ( 'as' )
            // InternalSensidl.g:2583:1: 'as'
            {
             before(grammarAccess.getMeasurementDataAccess().getAsKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSensidl.g:2596:1: rule__MeasurementData__Group__2 : rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 ;
    public final void rule__MeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2600:1: ( rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 )
            // InternalSensidl.g:2601:2: rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__MeasurementData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2608:1: rule__MeasurementData__Group__2__Impl : ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2612:1: ( ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) )
            // InternalSensidl.g:2613:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            {
            // InternalSensidl.g:2613:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            // InternalSensidl.g:2614:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeAssignment_2()); 
            // InternalSensidl.g:2615:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            // InternalSensidl.g:2615:2: rule__MeasurementData__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2625:1: rule__MeasurementData__Group__3 : rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 ;
    public final void rule__MeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2629:1: ( rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 )
            // InternalSensidl.g:2630:2: rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__MeasurementData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2637:1: rule__MeasurementData__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2641:1: ( ( 'in' ) )
            // InternalSensidl.g:2642:1: ( 'in' )
            {
            // InternalSensidl.g:2642:1: ( 'in' )
            // InternalSensidl.g:2643:1: 'in'
            {
             before(grammarAccess.getMeasurementDataAccess().getInKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSensidl.g:2656:1: rule__MeasurementData__Group__4 : rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 ;
    public final void rule__MeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2660:1: ( rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 )
            // InternalSensidl.g:2661:2: rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__MeasurementData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2668:1: rule__MeasurementData__Group__4__Impl : ( ( rule__MeasurementData__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2672:1: ( ( ( rule__MeasurementData__UnitAssignment_4 ) ) )
            // InternalSensidl.g:2673:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            {
            // InternalSensidl.g:2673:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            // InternalSensidl.g:2674:1: ( rule__MeasurementData__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitAssignment_4()); 
            // InternalSensidl.g:2675:1: ( rule__MeasurementData__UnitAssignment_4 )
            // InternalSensidl.g:2675:2: rule__MeasurementData__UnitAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2685:1: rule__MeasurementData__Group__5 : rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 ;
    public final void rule__MeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2689:1: ( rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 )
            // InternalSensidl.g:2690:2: rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__MeasurementData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2697:1: rule__MeasurementData__Group__5__Impl : ( ( rule__MeasurementData__Group_5__0 )? ) ;
    public final void rule__MeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2701:1: ( ( ( rule__MeasurementData__Group_5__0 )? ) )
            // InternalSensidl.g:2702:1: ( ( rule__MeasurementData__Group_5__0 )? )
            {
            // InternalSensidl.g:2702:1: ( ( rule__MeasurementData__Group_5__0 )? )
            // InternalSensidl.g:2703:1: ( rule__MeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_5()); 
            // InternalSensidl.g:2704:1: ( rule__MeasurementData__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSensidl.g:2704:2: rule__MeasurementData__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2714:1: rule__MeasurementData__Group__6 : rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 ;
    public final void rule__MeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2718:1: ( rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 )
            // InternalSensidl.g:2719:2: rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__MeasurementData__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2726:1: rule__MeasurementData__Group__6__Impl : ( ( rule__MeasurementData__Alternatives_6 )? ) ;
    public final void rule__MeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2730:1: ( ( ( rule__MeasurementData__Alternatives_6 )? ) )
            // InternalSensidl.g:2731:1: ( ( rule__MeasurementData__Alternatives_6 )? )
            {
            // InternalSensidl.g:2731:1: ( ( rule__MeasurementData__Alternatives_6 )? )
            // InternalSensidl.g:2732:1: ( rule__MeasurementData__Alternatives_6 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getAlternatives_6()); 
            // InternalSensidl.g:2733:1: ( rule__MeasurementData__Alternatives_6 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSensidl.g:2733:2: rule__MeasurementData__Alternatives_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__Alternatives_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataAccess().getAlternatives_6()); 

            }


            }

        }
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
    // InternalSensidl.g:2743:1: rule__MeasurementData__Group__7 : rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8 ;
    public final void rule__MeasurementData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2747:1: ( rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8 )
            // InternalSensidl.g:2748:2: rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__MeasurementData__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2755:1: rule__MeasurementData__Group__7__Impl : ( ( rule__MeasurementData__Group_7__0 )? ) ;
    public final void rule__MeasurementData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2759:1: ( ( ( rule__MeasurementData__Group_7__0 )? ) )
            // InternalSensidl.g:2760:1: ( ( rule__MeasurementData__Group_7__0 )? )
            {
            // InternalSensidl.g:2760:1: ( ( rule__MeasurementData__Group_7__0 )? )
            // InternalSensidl.g:2761:1: ( rule__MeasurementData__Group_7__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7()); 
            // InternalSensidl.g:2762:1: ( rule__MeasurementData__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSensidl.g:2762:2: rule__MeasurementData__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalSensidl.g:2772:1: rule__MeasurementData__Group__8 : rule__MeasurementData__Group__8__Impl ;
    public final void rule__MeasurementData__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2776:1: ( rule__MeasurementData__Group__8__Impl )
            // InternalSensidl.g:2777:2: rule__MeasurementData__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2783:1: rule__MeasurementData__Group__8__Impl : ( ( rule__MeasurementData__DescriptionAssignment_8 )? ) ;
    public final void rule__MeasurementData__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2787:1: ( ( ( rule__MeasurementData__DescriptionAssignment_8 )? ) )
            // InternalSensidl.g:2788:1: ( ( rule__MeasurementData__DescriptionAssignment_8 )? )
            {
            // InternalSensidl.g:2788:1: ( ( rule__MeasurementData__DescriptionAssignment_8 )? )
            // InternalSensidl.g:2789:1: ( rule__MeasurementData__DescriptionAssignment_8 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionAssignment_8()); 
            // InternalSensidl.g:2790:1: ( rule__MeasurementData__DescriptionAssignment_8 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_DESCRIPTION) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSensidl.g:2790:2: rule__MeasurementData__DescriptionAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__DescriptionAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataAccess().getDescriptionAssignment_8()); 

            }


            }

        }
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
    // InternalSensidl.g:2818:1: rule__MeasurementData__Group_5__0 : rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 ;
    public final void rule__MeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2822:1: ( rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 )
            // InternalSensidl.g:2823:2: rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__MeasurementData__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2830:1: rule__MeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2834:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:2835:1: ( 'with identifier' )
            {
            // InternalSensidl.g:2835:1: ( 'with identifier' )
            // InternalSensidl.g:2836:1: 'with identifier'
            {
             before(grammarAccess.getMeasurementDataAccess().getWithIdentifierKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSensidl.g:2849:1: rule__MeasurementData__Group_5__1 : rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 ;
    public final void rule__MeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2853:1: ( rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 )
            // InternalSensidl.g:2854:2: rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__MeasurementData__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2861:1: rule__MeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2865:1: ( ( ':' ) )
            // InternalSensidl.g:2866:1: ( ':' )
            {
            // InternalSensidl.g:2866:1: ( ':' )
            // InternalSensidl.g:2867:1: ':'
            {
             before(grammarAccess.getMeasurementDataAccess().getColonKeyword_5_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSensidl.g:2880:1: rule__MeasurementData__Group_5__2 : rule__MeasurementData__Group_5__2__Impl ;
    public final void rule__MeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2884:1: ( rule__MeasurementData__Group_5__2__Impl )
            // InternalSensidl.g:2885:2: rule__MeasurementData__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2891:1: rule__MeasurementData__Group_5__2__Impl : ( ( rule__MeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2895:1: ( ( ( rule__MeasurementData__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:2896:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:2896:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            // InternalSensidl.g:2897:1: ( rule__MeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:2898:1: ( rule__MeasurementData__IDAssignment_5_2 )
            // InternalSensidl.g:2898:2: rule__MeasurementData__IDAssignment_5_2
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__MeasurementData__Group_6_0__0"
    // InternalSensidl.g:2914:1: rule__MeasurementData__Group_6_0__0 : rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1 ;
    public final void rule__MeasurementData__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2918:1: ( rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1 )
            // InternalSensidl.g:2919:2: rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1
            {
            pushFollow(FOLLOW_30);
            rule__MeasurementData__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_0__0"


    // $ANTLR start "rule__MeasurementData__Group_6_0__0__Impl"
    // InternalSensidl.g:2926:1: rule__MeasurementData__Group_6_0__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2930:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:2931:1: ( 'adjusted' )
            {
            // InternalSensidl.g:2931:1: ( 'adjusted' )
            // InternalSensidl.g:2932:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_0__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_0__1"
    // InternalSensidl.g:2945:1: rule__MeasurementData__Group_6_0__1 : rule__MeasurementData__Group_6_0__1__Impl ;
    public final void rule__MeasurementData__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2949:1: ( rule__MeasurementData__Group_6_0__1__Impl )
            // InternalSensidl.g:2950:2: rule__MeasurementData__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_0__1"


    // $ANTLR start "rule__MeasurementData__Group_6_0__1__Impl"
    // InternalSensidl.g:2956:1: rule__MeasurementData__Group_6_0__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) ) ;
    public final void rule__MeasurementData__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2960:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) ) )
            // InternalSensidl.g:2961:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) )
            {
            // InternalSensidl.g:2961:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) )
            // InternalSensidl.g:2962:1: ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_0_1()); 
            // InternalSensidl.g:2963:1: ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 )
            // InternalSensidl.g:2963:2: rule__MeasurementData__AdjustmentsAssignment_6_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__AdjustmentsAssignment_6_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_0__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_1__0"
    // InternalSensidl.g:2977:1: rule__MeasurementData__Group_6_1__0 : rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1 ;
    public final void rule__MeasurementData__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2981:1: ( rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1 )
            // InternalSensidl.g:2982:2: rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1
            {
            pushFollow(FOLLOW_31);
            rule__MeasurementData__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_1__0"


    // $ANTLR start "rule__MeasurementData__Group_6_1__0__Impl"
    // InternalSensidl.g:2989:1: rule__MeasurementData__Group_6_1__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2993:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:2994:1: ( 'adjusted' )
            {
            // InternalSensidl.g:2994:1: ( 'adjusted' )
            // InternalSensidl.g:2995:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_1__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_1__1"
    // InternalSensidl.g:3008:1: rule__MeasurementData__Group_6_1__1 : rule__MeasurementData__Group_6_1__1__Impl ;
    public final void rule__MeasurementData__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3012:1: ( rule__MeasurementData__Group_6_1__1__Impl )
            // InternalSensidl.g:3013:2: rule__MeasurementData__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_1__1"


    // $ANTLR start "rule__MeasurementData__Group_6_1__1__Impl"
    // InternalSensidl.g:3019:1: rule__MeasurementData__Group_6_1__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) ) ;
    public final void rule__MeasurementData__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3023:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) ) )
            // InternalSensidl.g:3024:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) )
            {
            // InternalSensidl.g:3024:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) )
            // InternalSensidl.g:3025:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_1_1()); 
            // InternalSensidl.g:3026:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 )
            // InternalSensidl.g:3026:2: rule__MeasurementData__AdjustmentsAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__AdjustmentsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_1__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_2__0"
    // InternalSensidl.g:3040:1: rule__MeasurementData__Group_6_2__0 : rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 ;
    public final void rule__MeasurementData__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3044:1: ( rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 )
            // InternalSensidl.g:3045:2: rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1
            {
            pushFollow(FOLLOW_30);
            rule__MeasurementData__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3052:1: rule__MeasurementData__Group_6_2__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3056:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:3057:1: ( 'adjusted' )
            {
            // InternalSensidl.g:3057:1: ( 'adjusted' )
            // InternalSensidl.g:3058:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_2_0()); 

            }


            }

        }
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
    // InternalSensidl.g:3071:1: rule__MeasurementData__Group_6_2__1 : rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2 ;
    public final void rule__MeasurementData__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3075:1: ( rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2 )
            // InternalSensidl.g:3076:2: rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2
            {
            pushFollow(FOLLOW_11);
            rule__MeasurementData__Group_6_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_2__2();

            state._fsp--;


            }

        }
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
    // InternalSensidl.g:3083:1: rule__MeasurementData__Group_6_2__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) ;
    public final void rule__MeasurementData__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3087:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) )
            // InternalSensidl.g:3088:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            {
            // InternalSensidl.g:3088:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            // InternalSensidl.g:3089:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_1()); 
            // InternalSensidl.g:3090:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            // InternalSensidl.g:3090:2: rule__MeasurementData__AdjustmentsAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__MeasurementData__Group_6_2__2"
    // InternalSensidl.g:3100:1: rule__MeasurementData__Group_6_2__2 : rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3 ;
    public final void rule__MeasurementData__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3104:1: ( rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3 )
            // InternalSensidl.g:3105:2: rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3
            {
            pushFollow(FOLLOW_31);
            rule__MeasurementData__Group_6_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__2"


    // $ANTLR start "rule__MeasurementData__Group_6_2__2__Impl"
    // InternalSensidl.g:3112:1: rule__MeasurementData__Group_6_2__2__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3116:1: ( ( ',' ) )
            // InternalSensidl.g:3117:1: ( ',' )
            {
            // InternalSensidl.g:3117:1: ( ',' )
            // InternalSensidl.g:3118:1: ','
            {
             before(grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_2_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__2__Impl"


    // $ANTLR start "rule__MeasurementData__Group_6_2__3"
    // InternalSensidl.g:3131:1: rule__MeasurementData__Group_6_2__3 : rule__MeasurementData__Group_6_2__3__Impl ;
    public final void rule__MeasurementData__Group_6_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3135:1: ( rule__MeasurementData__Group_6_2__3__Impl )
            // InternalSensidl.g:3136:2: rule__MeasurementData__Group_6_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_6_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__3"


    // $ANTLR start "rule__MeasurementData__Group_6_2__3__Impl"
    // InternalSensidl.g:3142:1: rule__MeasurementData__Group_6_2__3__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) ) ;
    public final void rule__MeasurementData__Group_6_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3146:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) ) )
            // InternalSensidl.g:3147:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) )
            {
            // InternalSensidl.g:3147:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) )
            // InternalSensidl.g:3148:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_3()); 
            // InternalSensidl.g:3149:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 )
            // InternalSensidl.g:3149:2: rule__MeasurementData__AdjustmentsAssignment_6_2_3
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__AdjustmentsAssignment_6_2_3();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_6_2__3__Impl"


    // $ANTLR start "rule__MeasurementData__Group_7__0"
    // InternalSensidl.g:3167:1: rule__MeasurementData__Group_7__0 : rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1 ;
    public final void rule__MeasurementData__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3171:1: ( rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1 )
            // InternalSensidl.g:3172:2: rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1
            {
            pushFollow(FOLLOW_32);
            rule__MeasurementData__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7__0"


    // $ANTLR start "rule__MeasurementData__Group_7__0__Impl"
    // InternalSensidl.g:3179:1: rule__MeasurementData__Group_7__0__Impl : ( 'exclude:' ) ;
    public final void rule__MeasurementData__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3183:1: ( ( 'exclude:' ) )
            // InternalSensidl.g:3184:1: ( 'exclude:' )
            {
            // InternalSensidl.g:3184:1: ( 'exclude:' )
            // InternalSensidl.g:3185:1: 'exclude:'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludeKeyword_7_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getExcludeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_7__1"
    // InternalSensidl.g:3198:1: rule__MeasurementData__Group_7__1 : rule__MeasurementData__Group_7__1__Impl ;
    public final void rule__MeasurementData__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3202:1: ( rule__MeasurementData__Group_7__1__Impl )
            // InternalSensidl.g:3203:2: rule__MeasurementData__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7__1"


    // $ANTLR start "rule__MeasurementData__Group_7__1__Impl"
    // InternalSensidl.g:3209:1: rule__MeasurementData__Group_7__1__Impl : ( ( rule__MeasurementData__Alternatives_7_1 ) ) ;
    public final void rule__MeasurementData__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3213:1: ( ( ( rule__MeasurementData__Alternatives_7_1 ) ) )
            // InternalSensidl.g:3214:1: ( ( rule__MeasurementData__Alternatives_7_1 ) )
            {
            // InternalSensidl.g:3214:1: ( ( rule__MeasurementData__Alternatives_7_1 ) )
            // InternalSensidl.g:3215:1: ( rule__MeasurementData__Alternatives_7_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAlternatives_7_1()); 
            // InternalSensidl.g:3216:1: ( rule__MeasurementData__Alternatives_7_1 )
            // InternalSensidl.g:3216:2: rule__MeasurementData__Alternatives_7_1
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Alternatives_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getAlternatives_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group_7_1_0__0"
    // InternalSensidl.g:3230:1: rule__MeasurementData__Group_7_1_0__0 : rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1 ;
    public final void rule__MeasurementData__Group_7_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3234:1: ( rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1 )
            // InternalSensidl.g:3235:2: rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1
            {
            pushFollow(FOLLOW_11);
            rule__MeasurementData__Group_7_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_7_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_0__0"


    // $ANTLR start "rule__MeasurementData__Group_7_1_0__0__Impl"
    // InternalSensidl.g:3242:1: rule__MeasurementData__Group_7_1_0__0__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) ) ;
    public final void rule__MeasurementData__Group_7_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3246:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) ) )
            // InternalSensidl.g:3247:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) )
            {
            // InternalSensidl.g:3247:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) )
            // InternalSensidl.g:3248:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_0_0()); 
            // InternalSensidl.g:3249:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 )
            // InternalSensidl.g:3249:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_0__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_7_1_0__1"
    // InternalSensidl.g:3259:1: rule__MeasurementData__Group_7_1_0__1 : rule__MeasurementData__Group_7_1_0__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3263:1: ( rule__MeasurementData__Group_7_1_0__1__Impl )
            // InternalSensidl.g:3264:2: rule__MeasurementData__Group_7_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_7_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_0__1"


    // $ANTLR start "rule__MeasurementData__Group_7_1_0__1__Impl"
    // InternalSensidl.g:3270:1: rule__MeasurementData__Group_7_1_0__1__Impl : ( ( rule__MeasurementData__Group_7_1_0_1__0 )? ) ;
    public final void rule__MeasurementData__Group_7_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3274:1: ( ( ( rule__MeasurementData__Group_7_1_0_1__0 )? ) )
            // InternalSensidl.g:3275:1: ( ( rule__MeasurementData__Group_7_1_0_1__0 )? )
            {
            // InternalSensidl.g:3275:1: ( ( rule__MeasurementData__Group_7_1_0_1__0 )? )
            // InternalSensidl.g:3276:1: ( rule__MeasurementData__Group_7_1_0_1__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_0_1()); 
            // InternalSensidl.g:3277:1: ( rule__MeasurementData__Group_7_1_0_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSensidl.g:3277:2: rule__MeasurementData__Group_7_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__Group_7_1_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataAccess().getGroup_7_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_0__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group_7_1_0_1__0"
    // InternalSensidl.g:3291:1: rule__MeasurementData__Group_7_1_0_1__0 : rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1 ;
    public final void rule__MeasurementData__Group_7_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3295:1: ( rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1 )
            // InternalSensidl.g:3296:2: rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1
            {
            pushFollow(FOLLOW_33);
            rule__MeasurementData__Group_7_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_7_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_0_1__0"


    // $ANTLR start "rule__MeasurementData__Group_7_1_0_1__0__Impl"
    // InternalSensidl.g:3303:1: rule__MeasurementData__Group_7_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_7_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3307:1: ( ( ',' ) )
            // InternalSensidl.g:3308:1: ( ',' )
            {
            // InternalSensidl.g:3308:1: ( ',' )
            // InternalSensidl.g:3309:1: ','
            {
             before(grammarAccess.getMeasurementDataAccess().getCommaKeyword_7_1_0_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getCommaKeyword_7_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_0_1__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_7_1_0_1__1"
    // InternalSensidl.g:3322:1: rule__MeasurementData__Group_7_1_0_1__1 : rule__MeasurementData__Group_7_1_0_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3326:1: ( rule__MeasurementData__Group_7_1_0_1__1__Impl )
            // InternalSensidl.g:3327:2: rule__MeasurementData__Group_7_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_7_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_0_1__1"


    // $ANTLR start "rule__MeasurementData__Group_7_1_0_1__1__Impl"
    // InternalSensidl.g:3333:1: rule__MeasurementData__Group_7_1_0_1__1__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) ) ;
    public final void rule__MeasurementData__Group_7_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3337:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) ) )
            // InternalSensidl.g:3338:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) )
            {
            // InternalSensidl.g:3338:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) )
            // InternalSensidl.g:3339:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_0_1_1()); 
            // InternalSensidl.g:3340:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 )
            // InternalSensidl.g:3340:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_0_1__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group_7_1_1__0"
    // InternalSensidl.g:3354:1: rule__MeasurementData__Group_7_1_1__0 : rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1 ;
    public final void rule__MeasurementData__Group_7_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3358:1: ( rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1 )
            // InternalSensidl.g:3359:2: rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__MeasurementData__Group_7_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_7_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_1__0"


    // $ANTLR start "rule__MeasurementData__Group_7_1_1__0__Impl"
    // InternalSensidl.g:3366:1: rule__MeasurementData__Group_7_1_1__0__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) ) ;
    public final void rule__MeasurementData__Group_7_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3370:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) ) )
            // InternalSensidl.g:3371:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) )
            {
            // InternalSensidl.g:3371:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) )
            // InternalSensidl.g:3372:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_1_0()); 
            // InternalSensidl.g:3373:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 )
            // InternalSensidl.g:3373:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_1__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_7_1_1__1"
    // InternalSensidl.g:3383:1: rule__MeasurementData__Group_7_1_1__1 : rule__MeasurementData__Group_7_1_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3387:1: ( rule__MeasurementData__Group_7_1_1__1__Impl )
            // InternalSensidl.g:3388:2: rule__MeasurementData__Group_7_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_7_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_1__1"


    // $ANTLR start "rule__MeasurementData__Group_7_1_1__1__Impl"
    // InternalSensidl.g:3394:1: rule__MeasurementData__Group_7_1_1__1__Impl : ( ( rule__MeasurementData__Group_7_1_1_1__0 )? ) ;
    public final void rule__MeasurementData__Group_7_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3398:1: ( ( ( rule__MeasurementData__Group_7_1_1_1__0 )? ) )
            // InternalSensidl.g:3399:1: ( ( rule__MeasurementData__Group_7_1_1_1__0 )? )
            {
            // InternalSensidl.g:3399:1: ( ( rule__MeasurementData__Group_7_1_1_1__0 )? )
            // InternalSensidl.g:3400:1: ( rule__MeasurementData__Group_7_1_1_1__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_1_1()); 
            // InternalSensidl.g:3401:1: ( rule__MeasurementData__Group_7_1_1_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSensidl.g:3401:2: rule__MeasurementData__Group_7_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementData__Group_7_1_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataAccess().getGroup_7_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_1__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group_7_1_1_1__0"
    // InternalSensidl.g:3415:1: rule__MeasurementData__Group_7_1_1_1__0 : rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1 ;
    public final void rule__MeasurementData__Group_7_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3419:1: ( rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1 )
            // InternalSensidl.g:3420:2: rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1
            {
            pushFollow(FOLLOW_34);
            rule__MeasurementData__Group_7_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_7_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_1_1__0"


    // $ANTLR start "rule__MeasurementData__Group_7_1_1_1__0__Impl"
    // InternalSensidl.g:3427:1: rule__MeasurementData__Group_7_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_7_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3431:1: ( ( ',' ) )
            // InternalSensidl.g:3432:1: ( ',' )
            {
            // InternalSensidl.g:3432:1: ( ',' )
            // InternalSensidl.g:3433:1: ','
            {
             before(grammarAccess.getMeasurementDataAccess().getCommaKeyword_7_1_1_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getCommaKeyword_7_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_1_1__0__Impl"


    // $ANTLR start "rule__MeasurementData__Group_7_1_1_1__1"
    // InternalSensidl.g:3446:1: rule__MeasurementData__Group_7_1_1_1__1 : rule__MeasurementData__Group_7_1_1_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3450:1: ( rule__MeasurementData__Group_7_1_1_1__1__Impl )
            // InternalSensidl.g:3451:2: rule__MeasurementData__Group_7_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__Group_7_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_1_1__1"


    // $ANTLR start "rule__MeasurementData__Group_7_1_1_1__1__Impl"
    // InternalSensidl.g:3457:1: rule__MeasurementData__Group_7_1_1_1__1__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) ) ;
    public final void rule__MeasurementData__Group_7_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3461:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) ) )
            // InternalSensidl.g:3462:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) )
            {
            // InternalSensidl.g:3462:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) )
            // InternalSensidl.g:3463:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_1_1_1()); 
            // InternalSensidl.g:3464:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 )
            // InternalSensidl.g:3464:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__Group_7_1_1_1__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group__0"
    // InternalSensidl.g:3478:1: rule__NonMeasurementData__Group__0 : rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 ;
    public final void rule__NonMeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3482:1: ( rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 )
            // InternalSensidl.g:3483:2: rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__NonMeasurementData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3490:1: rule__NonMeasurementData__Group__0__Impl : ( ( rule__NonMeasurementData__NameAssignment_0 ) ) ;
    public final void rule__NonMeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3494:1: ( ( ( rule__NonMeasurementData__NameAssignment_0 ) ) )
            // InternalSensidl.g:3495:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:3495:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            // InternalSensidl.g:3496:1: ( rule__NonMeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:3497:1: ( rule__NonMeasurementData__NameAssignment_0 )
            // InternalSensidl.g:3497:2: rule__NonMeasurementData__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3507:1: rule__NonMeasurementData__Group__1 : rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 ;
    public final void rule__NonMeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3511:1: ( rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 )
            // InternalSensidl.g:3512:2: rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__NonMeasurementData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3519:1: rule__NonMeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__NonMeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3523:1: ( ( 'as' ) )
            // InternalSensidl.g:3524:1: ( 'as' )
            {
            // InternalSensidl.g:3524:1: ( 'as' )
            // InternalSensidl.g:3525:1: 'as'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAsKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSensidl.g:3538:1: rule__NonMeasurementData__Group__2 : rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 ;
    public final void rule__NonMeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3542:1: ( rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 )
            // InternalSensidl.g:3543:2: rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__NonMeasurementData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3550:1: rule__NonMeasurementData__Group__2__Impl : ( ( rule__NonMeasurementData__Alternatives_2 ) ) ;
    public final void rule__NonMeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3554:1: ( ( ( rule__NonMeasurementData__Alternatives_2 ) ) )
            // InternalSensidl.g:3555:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            {
            // InternalSensidl.g:3555:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            // InternalSensidl.g:3556:1: ( rule__NonMeasurementData__Alternatives_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_2()); 
            // InternalSensidl.g:3557:1: ( rule__NonMeasurementData__Alternatives_2 )
            // InternalSensidl.g:3557:2: rule__NonMeasurementData__Alternatives_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3567:1: rule__NonMeasurementData__Group__3 : rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 ;
    public final void rule__NonMeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3571:1: ( rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 )
            // InternalSensidl.g:3572:2: rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__NonMeasurementData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3579:1: rule__NonMeasurementData__Group__3__Impl : ( ( rule__NonMeasurementData__ConstantAssignment_3 )? ) ;
    public final void rule__NonMeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3583:1: ( ( ( rule__NonMeasurementData__ConstantAssignment_3 )? ) )
            // InternalSensidl.g:3584:1: ( ( rule__NonMeasurementData__ConstantAssignment_3 )? )
            {
            // InternalSensidl.g:3584:1: ( ( rule__NonMeasurementData__ConstantAssignment_3 )? )
            // InternalSensidl.g:3585:1: ( rule__NonMeasurementData__ConstantAssignment_3 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantAssignment_3()); 
            // InternalSensidl.g:3586:1: ( rule__NonMeasurementData__ConstantAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==59) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSensidl.g:3586:2: rule__NonMeasurementData__ConstantAssignment_3
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3596:1: rule__NonMeasurementData__Group__4 : rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 ;
    public final void rule__NonMeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3600:1: ( rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 )
            // InternalSensidl.g:3601:2: rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__NonMeasurementData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3608:1: rule__NonMeasurementData__Group__4__Impl : ( ( rule__NonMeasurementData__Group_4__0 )? ) ;
    public final void rule__NonMeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3612:1: ( ( ( rule__NonMeasurementData__Group_4__0 )? ) )
            // InternalSensidl.g:3613:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            {
            // InternalSensidl.g:3613:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            // InternalSensidl.g:3614:1: ( rule__NonMeasurementData__Group_4__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_4()); 
            // InternalSensidl.g:3615:1: ( rule__NonMeasurementData__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSensidl.g:3615:2: rule__NonMeasurementData__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3625:1: rule__NonMeasurementData__Group__5 : rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 ;
    public final void rule__NonMeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3629:1: ( rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 )
            // InternalSensidl.g:3630:2: rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__NonMeasurementData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3637:1: rule__NonMeasurementData__Group__5__Impl : ( ( rule__NonMeasurementData__Group_5__0 )? ) ;
    public final void rule__NonMeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3641:1: ( ( ( rule__NonMeasurementData__Group_5__0 )? ) )
            // InternalSensidl.g:3642:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            {
            // InternalSensidl.g:3642:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            // InternalSensidl.g:3643:1: ( rule__NonMeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_5()); 
            // InternalSensidl.g:3644:1: ( rule__NonMeasurementData__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSensidl.g:3644:2: rule__NonMeasurementData__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3654:1: rule__NonMeasurementData__Group__6 : rule__NonMeasurementData__Group__6__Impl rule__NonMeasurementData__Group__7 ;
    public final void rule__NonMeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3658:1: ( rule__NonMeasurementData__Group__6__Impl rule__NonMeasurementData__Group__7 )
            // InternalSensidl.g:3659:2: rule__NonMeasurementData__Group__6__Impl rule__NonMeasurementData__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__NonMeasurementData__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3666:1: rule__NonMeasurementData__Group__6__Impl : ( ( rule__NonMeasurementData__Group_6__0 )? ) ;
    public final void rule__NonMeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3670:1: ( ( ( rule__NonMeasurementData__Group_6__0 )? ) )
            // InternalSensidl.g:3671:1: ( ( rule__NonMeasurementData__Group_6__0 )? )
            {
            // InternalSensidl.g:3671:1: ( ( rule__NonMeasurementData__Group_6__0 )? )
            // InternalSensidl.g:3672:1: ( rule__NonMeasurementData__Group_6__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_6()); 
            // InternalSensidl.g:3673:1: ( rule__NonMeasurementData__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSensidl.g:3673:2: rule__NonMeasurementData__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalSensidl.g:3683:1: rule__NonMeasurementData__Group__7 : rule__NonMeasurementData__Group__7__Impl ;
    public final void rule__NonMeasurementData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3687:1: ( rule__NonMeasurementData__Group__7__Impl )
            // InternalSensidl.g:3688:2: rule__NonMeasurementData__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalSensidl.g:3694:1: rule__NonMeasurementData__Group__7__Impl : ( ( rule__NonMeasurementData__DescriptionAssignment_7 )? ) ;
    public final void rule__NonMeasurementData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3698:1: ( ( ( rule__NonMeasurementData__DescriptionAssignment_7 )? ) )
            // InternalSensidl.g:3699:1: ( ( rule__NonMeasurementData__DescriptionAssignment_7 )? )
            {
            // InternalSensidl.g:3699:1: ( ( rule__NonMeasurementData__DescriptionAssignment_7 )? )
            // InternalSensidl.g:3700:1: ( rule__NonMeasurementData__DescriptionAssignment_7 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionAssignment_7()); 
            // InternalSensidl.g:3701:1: ( rule__NonMeasurementData__DescriptionAssignment_7 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_DESCRIPTION) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSensidl.g:3701:2: rule__NonMeasurementData__DescriptionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__DescriptionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getDescriptionAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__NonMeasurementData__Group_4__0"
    // InternalSensidl.g:3727:1: rule__NonMeasurementData__Group_4__0 : rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 ;
    public final void rule__NonMeasurementData__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3731:1: ( rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 )
            // InternalSensidl.g:3732:2: rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1
            {
            pushFollow(FOLLOW_37);
            rule__NonMeasurementData__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3739:1: rule__NonMeasurementData__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__NonMeasurementData__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3743:1: ( ( 'value' ) )
            // InternalSensidl.g:3744:1: ( 'value' )
            {
            // InternalSensidl.g:3744:1: ( 'value' )
            // InternalSensidl.g:3745:1: 'value'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSensidl.g:3758:1: rule__NonMeasurementData__Group_4__1 : rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 ;
    public final void rule__NonMeasurementData__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3762:1: ( rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 )
            // InternalSensidl.g:3763:2: rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__NonMeasurementData__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3770:1: rule__NonMeasurementData__Group_4__1__Impl : ( '=' ) ;
    public final void rule__NonMeasurementData__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3774:1: ( ( '=' ) )
            // InternalSensidl.g:3775:1: ( '=' )
            {
            // InternalSensidl.g:3775:1: ( '=' )
            // InternalSensidl.g:3776:1: '='
            {
             before(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSensidl.g:3789:1: rule__NonMeasurementData__Group_4__2 : rule__NonMeasurementData__Group_4__2__Impl ;
    public final void rule__NonMeasurementData__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3793:1: ( rule__NonMeasurementData__Group_4__2__Impl )
            // InternalSensidl.g:3794:2: rule__NonMeasurementData__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3800:1: rule__NonMeasurementData__Group_4__2__Impl : ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) ) ;
    public final void rule__NonMeasurementData__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3804:1: ( ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) ) )
            // InternalSensidl.g:3805:1: ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) )
            {
            // InternalSensidl.g:3805:1: ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) )
            // InternalSensidl.g:3806:1: ( rule__NonMeasurementData__ValueAssignment_4_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_4_2()); 
            // InternalSensidl.g:3807:1: ( rule__NonMeasurementData__ValueAssignment_4_2 )
            // InternalSensidl.g:3807:2: rule__NonMeasurementData__ValueAssignment_4_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3823:1: rule__NonMeasurementData__Group_5__0 : rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 ;
    public final void rule__NonMeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3827:1: ( rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 )
            // InternalSensidl.g:3828:2: rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__NonMeasurementData__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3835:1: rule__NonMeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__NonMeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3839:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:3840:1: ( 'with identifier' )
            {
            // InternalSensidl.g:3840:1: ( 'with identifier' )
            // InternalSensidl.g:3841:1: 'with identifier'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getWithIdentifierKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSensidl.g:3854:1: rule__NonMeasurementData__Group_5__1 : rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2 ;
    public final void rule__NonMeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3858:1: ( rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2 )
            // InternalSensidl.g:3859:2: rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__NonMeasurementData__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3866:1: rule__NonMeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__NonMeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3870:1: ( ( ':' ) )
            // InternalSensidl.g:3871:1: ( ':' )
            {
            // InternalSensidl.g:3871:1: ( ':' )
            // InternalSensidl.g:3872:1: ':'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getColonKeyword_5_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSensidl.g:3885:1: rule__NonMeasurementData__Group_5__2 : rule__NonMeasurementData__Group_5__2__Impl ;
    public final void rule__NonMeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3889:1: ( rule__NonMeasurementData__Group_5__2__Impl )
            // InternalSensidl.g:3890:2: rule__NonMeasurementData__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3896:1: rule__NonMeasurementData__Group_5__2__Impl : ( ( rule__NonMeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__NonMeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3900:1: ( ( ( rule__NonMeasurementData__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:3901:1: ( ( rule__NonMeasurementData__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:3901:1: ( ( rule__NonMeasurementData__IDAssignment_5_2 ) )
            // InternalSensidl.g:3902:1: ( rule__NonMeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:3903:1: ( rule__NonMeasurementData__IDAssignment_5_2 )
            // InternalSensidl.g:3903:2: rule__NonMeasurementData__IDAssignment_5_2
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__NonMeasurementData__Group_6__0"
    // InternalSensidl.g:3919:1: rule__NonMeasurementData__Group_6__0 : rule__NonMeasurementData__Group_6__0__Impl rule__NonMeasurementData__Group_6__1 ;
    public final void rule__NonMeasurementData__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3923:1: ( rule__NonMeasurementData__Group_6__0__Impl rule__NonMeasurementData__Group_6__1 )
            // InternalSensidl.g:3924:2: rule__NonMeasurementData__Group_6__0__Impl rule__NonMeasurementData__Group_6__1
            {
            pushFollow(FOLLOW_32);
            rule__NonMeasurementData__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6__0"


    // $ANTLR start "rule__NonMeasurementData__Group_6__0__Impl"
    // InternalSensidl.g:3931:1: rule__NonMeasurementData__Group_6__0__Impl : ( 'exclude:' ) ;
    public final void rule__NonMeasurementData__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3935:1: ( ( 'exclude:' ) )
            // InternalSensidl.g:3936:1: ( 'exclude:' )
            {
            // InternalSensidl.g:3936:1: ( 'exclude:' )
            // InternalSensidl.g:3937:1: 'exclude:'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludeKeyword_6_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getExcludeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_6__1"
    // InternalSensidl.g:3950:1: rule__NonMeasurementData__Group_6__1 : rule__NonMeasurementData__Group_6__1__Impl ;
    public final void rule__NonMeasurementData__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3954:1: ( rule__NonMeasurementData__Group_6__1__Impl )
            // InternalSensidl.g:3955:2: rule__NonMeasurementData__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6__1"


    // $ANTLR start "rule__NonMeasurementData__Group_6__1__Impl"
    // InternalSensidl.g:3961:1: rule__NonMeasurementData__Group_6__1__Impl : ( ( rule__NonMeasurementData__Alternatives_6_1 ) ) ;
    public final void rule__NonMeasurementData__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3965:1: ( ( ( rule__NonMeasurementData__Alternatives_6_1 ) ) )
            // InternalSensidl.g:3966:1: ( ( rule__NonMeasurementData__Alternatives_6_1 ) )
            {
            // InternalSensidl.g:3966:1: ( ( rule__NonMeasurementData__Alternatives_6_1 ) )
            // InternalSensidl.g:3967:1: ( rule__NonMeasurementData__Alternatives_6_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_6_1()); 
            // InternalSensidl.g:3968:1: ( rule__NonMeasurementData__Alternatives_6_1 )
            // InternalSensidl.g:3968:2: rule__NonMeasurementData__Alternatives_6_1
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Alternatives_6_1();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getAlternatives_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_0__0"
    // InternalSensidl.g:3982:1: rule__NonMeasurementData__Group_6_1_0__0 : rule__NonMeasurementData__Group_6_1_0__0__Impl rule__NonMeasurementData__Group_6_1_0__1 ;
    public final void rule__NonMeasurementData__Group_6_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3986:1: ( rule__NonMeasurementData__Group_6_1_0__0__Impl rule__NonMeasurementData__Group_6_1_0__1 )
            // InternalSensidl.g:3987:2: rule__NonMeasurementData__Group_6_1_0__0__Impl rule__NonMeasurementData__Group_6_1_0__1
            {
            pushFollow(FOLLOW_11);
            rule__NonMeasurementData__Group_6_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_6_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_0__0"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_0__0__Impl"
    // InternalSensidl.g:3994:1: rule__NonMeasurementData__Group_6_1_0__0__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 ) ) ;
    public final void rule__NonMeasurementData__Group_6_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3998:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 ) ) )
            // InternalSensidl.g:3999:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 ) )
            {
            // InternalSensidl.g:3999:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 ) )
            // InternalSensidl.g:4000:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_0_0()); 
            // InternalSensidl.g:4001:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 )
            // InternalSensidl.g:4001:2: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_0__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_0__1"
    // InternalSensidl.g:4011:1: rule__NonMeasurementData__Group_6_1_0__1 : rule__NonMeasurementData__Group_6_1_0__1__Impl ;
    public final void rule__NonMeasurementData__Group_6_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4015:1: ( rule__NonMeasurementData__Group_6_1_0__1__Impl )
            // InternalSensidl.g:4016:2: rule__NonMeasurementData__Group_6_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_6_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_0__1"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_0__1__Impl"
    // InternalSensidl.g:4022:1: rule__NonMeasurementData__Group_6_1_0__1__Impl : ( ( rule__NonMeasurementData__Group_6_1_0_1__0 )? ) ;
    public final void rule__NonMeasurementData__Group_6_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4026:1: ( ( ( rule__NonMeasurementData__Group_6_1_0_1__0 )? ) )
            // InternalSensidl.g:4027:1: ( ( rule__NonMeasurementData__Group_6_1_0_1__0 )? )
            {
            // InternalSensidl.g:4027:1: ( ( rule__NonMeasurementData__Group_6_1_0_1__0 )? )
            // InternalSensidl.g:4028:1: ( rule__NonMeasurementData__Group_6_1_0_1__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_0_1()); 
            // InternalSensidl.g:4029:1: ( rule__NonMeasurementData__Group_6_1_0_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSensidl.g:4029:2: rule__NonMeasurementData__Group_6_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__Group_6_1_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_0__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_0_1__0"
    // InternalSensidl.g:4043:1: rule__NonMeasurementData__Group_6_1_0_1__0 : rule__NonMeasurementData__Group_6_1_0_1__0__Impl rule__NonMeasurementData__Group_6_1_0_1__1 ;
    public final void rule__NonMeasurementData__Group_6_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4047:1: ( rule__NonMeasurementData__Group_6_1_0_1__0__Impl rule__NonMeasurementData__Group_6_1_0_1__1 )
            // InternalSensidl.g:4048:2: rule__NonMeasurementData__Group_6_1_0_1__0__Impl rule__NonMeasurementData__Group_6_1_0_1__1
            {
            pushFollow(FOLLOW_33);
            rule__NonMeasurementData__Group_6_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_6_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_0_1__0"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_0_1__0__Impl"
    // InternalSensidl.g:4055:1: rule__NonMeasurementData__Group_6_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__NonMeasurementData__Group_6_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4059:1: ( ( ',' ) )
            // InternalSensidl.g:4060:1: ( ',' )
            {
            // InternalSensidl.g:4060:1: ( ',' )
            // InternalSensidl.g:4061:1: ','
            {
             before(grammarAccess.getNonMeasurementDataAccess().getCommaKeyword_6_1_0_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getCommaKeyword_6_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_0_1__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_0_1__1"
    // InternalSensidl.g:4074:1: rule__NonMeasurementData__Group_6_1_0_1__1 : rule__NonMeasurementData__Group_6_1_0_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_6_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4078:1: ( rule__NonMeasurementData__Group_6_1_0_1__1__Impl )
            // InternalSensidl.g:4079:2: rule__NonMeasurementData__Group_6_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_6_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_0_1__1"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_0_1__1__Impl"
    // InternalSensidl.g:4085:1: rule__NonMeasurementData__Group_6_1_0_1__1__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 ) ) ;
    public final void rule__NonMeasurementData__Group_6_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4089:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 ) ) )
            // InternalSensidl.g:4090:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 ) )
            {
            // InternalSensidl.g:4090:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 ) )
            // InternalSensidl.g:4091:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_0_1_1()); 
            // InternalSensidl.g:4092:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 )
            // InternalSensidl.g:4092:2: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_0_1__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_1__0"
    // InternalSensidl.g:4106:1: rule__NonMeasurementData__Group_6_1_1__0 : rule__NonMeasurementData__Group_6_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1__1 ;
    public final void rule__NonMeasurementData__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4110:1: ( rule__NonMeasurementData__Group_6_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1__1 )
            // InternalSensidl.g:4111:2: rule__NonMeasurementData__Group_6_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__NonMeasurementData__Group_6_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_6_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_1__0"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_1__0__Impl"
    // InternalSensidl.g:4118:1: rule__NonMeasurementData__Group_6_1_1__0__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 ) ) ;
    public final void rule__NonMeasurementData__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4122:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 ) ) )
            // InternalSensidl.g:4123:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 ) )
            {
            // InternalSensidl.g:4123:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 ) )
            // InternalSensidl.g:4124:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_1_0()); 
            // InternalSensidl.g:4125:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 )
            // InternalSensidl.g:4125:2: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_1__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_1__1"
    // InternalSensidl.g:4135:1: rule__NonMeasurementData__Group_6_1_1__1 : rule__NonMeasurementData__Group_6_1_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4139:1: ( rule__NonMeasurementData__Group_6_1_1__1__Impl )
            // InternalSensidl.g:4140:2: rule__NonMeasurementData__Group_6_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_6_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_1__1"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_1__1__Impl"
    // InternalSensidl.g:4146:1: rule__NonMeasurementData__Group_6_1_1__1__Impl : ( ( rule__NonMeasurementData__Group_6_1_1_1__0 )? ) ;
    public final void rule__NonMeasurementData__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4150:1: ( ( ( rule__NonMeasurementData__Group_6_1_1_1__0 )? ) )
            // InternalSensidl.g:4151:1: ( ( rule__NonMeasurementData__Group_6_1_1_1__0 )? )
            {
            // InternalSensidl.g:4151:1: ( ( rule__NonMeasurementData__Group_6_1_1_1__0 )? )
            // InternalSensidl.g:4152:1: ( rule__NonMeasurementData__Group_6_1_1_1__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_1_1()); 
            // InternalSensidl.g:4153:1: ( rule__NonMeasurementData__Group_6_1_1_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSensidl.g:4153:2: rule__NonMeasurementData__Group_6_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__Group_6_1_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_1__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_1_1__0"
    // InternalSensidl.g:4167:1: rule__NonMeasurementData__Group_6_1_1_1__0 : rule__NonMeasurementData__Group_6_1_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1_1__1 ;
    public final void rule__NonMeasurementData__Group_6_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4171:1: ( rule__NonMeasurementData__Group_6_1_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1_1__1 )
            // InternalSensidl.g:4172:2: rule__NonMeasurementData__Group_6_1_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1_1__1
            {
            pushFollow(FOLLOW_34);
            rule__NonMeasurementData__Group_6_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_6_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_1_1__0"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_1_1__0__Impl"
    // InternalSensidl.g:4179:1: rule__NonMeasurementData__Group_6_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__NonMeasurementData__Group_6_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4183:1: ( ( ',' ) )
            // InternalSensidl.g:4184:1: ( ',' )
            {
            // InternalSensidl.g:4184:1: ( ',' )
            // InternalSensidl.g:4185:1: ','
            {
             before(grammarAccess.getNonMeasurementDataAccess().getCommaKeyword_6_1_1_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getCommaKeyword_6_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_1_1__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_1_1__1"
    // InternalSensidl.g:4198:1: rule__NonMeasurementData__Group_6_1_1_1__1 : rule__NonMeasurementData__Group_6_1_1_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_6_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4202:1: ( rule__NonMeasurementData__Group_6_1_1_1__1__Impl )
            // InternalSensidl.g:4203:2: rule__NonMeasurementData__Group_6_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_6_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_1_1__1"


    // $ANTLR start "rule__NonMeasurementData__Group_6_1_1_1__1__Impl"
    // InternalSensidl.g:4209:1: rule__NonMeasurementData__Group_6_1_1_1__1__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 ) ) ;
    public final void rule__NonMeasurementData__Group_6_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4213:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 ) ) )
            // InternalSensidl.g:4214:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 ) )
            {
            // InternalSensidl.g:4214:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 ) )
            // InternalSensidl.g:4215:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_1_1_1()); 
            // InternalSensidl.g:4216:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 )
            // InternalSensidl.g:4216:2: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_6_1_1_1__1__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__0"
    // InternalSensidl.g:4230:1: rule__MeasurementDataNotAdjustable__Group__0 : rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4234:1: ( rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 )
            // InternalSensidl.g:4235:2: rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__MeasurementDataNotAdjustable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4242:1: rule__MeasurementDataNotAdjustable__Group__0__Impl : ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4246:1: ( ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) )
            // InternalSensidl.g:4247:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            {
            // InternalSensidl.g:4247:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            // InternalSensidl.g:4248:1: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameAssignment_0()); 
            // InternalSensidl.g:4249:1: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            // InternalSensidl.g:4249:2: rule__MeasurementDataNotAdjustable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4259:1: rule__MeasurementDataNotAdjustable__Group__1 : rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4263:1: ( rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 )
            // InternalSensidl.g:4264:2: rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__MeasurementDataNotAdjustable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4271:1: rule__MeasurementDataNotAdjustable__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4275:1: ( ( 'as' ) )
            // InternalSensidl.g:4276:1: ( 'as' )
            {
            // InternalSensidl.g:4276:1: ( 'as' )
            // InternalSensidl.g:4277:1: 'as'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getAsKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSensidl.g:4290:1: rule__MeasurementDataNotAdjustable__Group__2 : rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 ;
    public final void rule__MeasurementDataNotAdjustable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4294:1: ( rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 )
            // InternalSensidl.g:4295:2: rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__MeasurementDataNotAdjustable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4302:1: rule__MeasurementDataNotAdjustable__Group__2__Impl : ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4306:1: ( ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) )
            // InternalSensidl.g:4307:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            {
            // InternalSensidl.g:4307:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            // InternalSensidl.g:4308:1: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeAssignment_2()); 
            // InternalSensidl.g:4309:1: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            // InternalSensidl.g:4309:2: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4319:1: rule__MeasurementDataNotAdjustable__Group__3 : rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 ;
    public final void rule__MeasurementDataNotAdjustable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4323:1: ( rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 )
            // InternalSensidl.g:4324:2: rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__MeasurementDataNotAdjustable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4331:1: rule__MeasurementDataNotAdjustable__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4335:1: ( ( 'in' ) )
            // InternalSensidl.g:4336:1: ( 'in' )
            {
            // InternalSensidl.g:4336:1: ( 'in' )
            // InternalSensidl.g:4337:1: 'in'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getInKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSensidl.g:4350:1: rule__MeasurementDataNotAdjustable__Group__4 : rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 ;
    public final void rule__MeasurementDataNotAdjustable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4354:1: ( rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 )
            // InternalSensidl.g:4355:2: rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__MeasurementDataNotAdjustable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4362:1: rule__MeasurementDataNotAdjustable__Group__4__Impl : ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4366:1: ( ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) )
            // InternalSensidl.g:4367:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            {
            // InternalSensidl.g:4367:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            // InternalSensidl.g:4368:1: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitAssignment_4()); 
            // InternalSensidl.g:4369:1: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            // InternalSensidl.g:4369:2: rule__MeasurementDataNotAdjustable__UnitAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4379:1: rule__MeasurementDataNotAdjustable__Group__5 : rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 ;
    public final void rule__MeasurementDataNotAdjustable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4383:1: ( rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 )
            // InternalSensidl.g:4384:2: rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__MeasurementDataNotAdjustable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4391:1: rule__MeasurementDataNotAdjustable__Group__5__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4395:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) )
            // InternalSensidl.g:4396:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            {
            // InternalSensidl.g:4396:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            // InternalSensidl.g:4397:1: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_5()); 
            // InternalSensidl.g:4398:1: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSensidl.g:4398:2: rule__MeasurementDataNotAdjustable__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4408:1: rule__MeasurementDataNotAdjustable__Group__6 : rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7 ;
    public final void rule__MeasurementDataNotAdjustable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4412:1: ( rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7 )
            // InternalSensidl.g:4413:2: rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__MeasurementDataNotAdjustable__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group__7();

            state._fsp--;


            }

        }
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
    // InternalSensidl.g:4420:1: rule__MeasurementDataNotAdjustable__Group__6__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4424:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? ) )
            // InternalSensidl.g:4425:1: ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? )
            {
            // InternalSensidl.g:4425:1: ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? )
            // InternalSensidl.g:4426:1: ( rule__MeasurementDataNotAdjustable__Group_6__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6()); 
            // InternalSensidl.g:4427:1: ( rule__MeasurementDataNotAdjustable__Group_6__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSensidl.g:4427:2: rule__MeasurementDataNotAdjustable__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementDataNotAdjustable__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__7"
    // InternalSensidl.g:4437:1: rule__MeasurementDataNotAdjustable__Group__7 : rule__MeasurementDataNotAdjustable__Group__7__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4441:1: ( rule__MeasurementDataNotAdjustable__Group__7__Impl )
            // InternalSensidl.g:4442:2: rule__MeasurementDataNotAdjustable__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__7"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__7__Impl"
    // InternalSensidl.g:4448:1: rule__MeasurementDataNotAdjustable__Group__7__Impl : ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4452:1: ( ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? ) )
            // InternalSensidl.g:4453:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? )
            {
            // InternalSensidl.g:4453:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? )
            // InternalSensidl.g:4454:1: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionAssignment_7()); 
            // InternalSensidl.g:4455:1: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_DESCRIPTION) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSensidl.g:4455:2: rule__MeasurementDataNotAdjustable__DescriptionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementDataNotAdjustable__DescriptionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group__7__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_5__0"
    // InternalSensidl.g:4481:1: rule__MeasurementDataNotAdjustable__Group_5__0 : rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4485:1: ( rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 )
            // InternalSensidl.g:4486:2: rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__MeasurementDataNotAdjustable__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4493:1: rule__MeasurementDataNotAdjustable__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4497:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:4498:1: ( 'with identifier' )
            {
            // InternalSensidl.g:4498:1: ( 'with identifier' )
            // InternalSensidl.g:4499:1: 'with identifier'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getWithIdentifierKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSensidl.g:4512:1: rule__MeasurementDataNotAdjustable__Group_5__1 : rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4516:1: ( rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 )
            // InternalSensidl.g:4517:2: rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__MeasurementDataNotAdjustable__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4524:1: rule__MeasurementDataNotAdjustable__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4528:1: ( ( ':' ) )
            // InternalSensidl.g:4529:1: ( ':' )
            {
            // InternalSensidl.g:4529:1: ( ':' )
            // InternalSensidl.g:4530:1: ':'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getColonKeyword_5_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSensidl.g:4543:1: rule__MeasurementDataNotAdjustable__Group_5__2 : rule__MeasurementDataNotAdjustable__Group_5__2__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4547:1: ( rule__MeasurementDataNotAdjustable__Group_5__2__Impl )
            // InternalSensidl.g:4548:2: rule__MeasurementDataNotAdjustable__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4554:1: rule__MeasurementDataNotAdjustable__Group_5__2__Impl : ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4558:1: ( ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:4559:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:4559:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            // InternalSensidl.g:4560:1: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:4561:1: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            // InternalSensidl.g:4561:2: rule__MeasurementDataNotAdjustable__IDAssignment_5_2
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6__0"
    // InternalSensidl.g:4577:1: rule__MeasurementDataNotAdjustable__Group_6__0 : rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4581:1: ( rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1 )
            // InternalSensidl.g:4582:2: rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__MeasurementDataNotAdjustable__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6__0"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6__0__Impl"
    // InternalSensidl.g:4589:1: rule__MeasurementDataNotAdjustable__Group_6__0__Impl : ( 'exclude' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4593:1: ( ( 'exclude' ) )
            // InternalSensidl.g:4594:1: ( 'exclude' )
            {
            // InternalSensidl.g:4594:1: ( 'exclude' )
            // InternalSensidl.g:4595:1: 'exclude'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludeKeyword_6_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6__0__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6__1"
    // InternalSensidl.g:4608:1: rule__MeasurementDataNotAdjustable__Group_6__1 : rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4612:1: ( rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2 )
            // InternalSensidl.g:4613:2: rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2
            {
            pushFollow(FOLLOW_32);
            rule__MeasurementDataNotAdjustable__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6__1"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6__1__Impl"
    // InternalSensidl.g:4620:1: rule__MeasurementDataNotAdjustable__Group_6__1__Impl : ( ':' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4624:1: ( ( ':' ) )
            // InternalSensidl.g:4625:1: ( ':' )
            {
            // InternalSensidl.g:4625:1: ( ':' )
            // InternalSensidl.g:4626:1: ':'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getColonKeyword_6_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getColonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6__1__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6__2"
    // InternalSensidl.g:4639:1: rule__MeasurementDataNotAdjustable__Group_6__2 : rule__MeasurementDataNotAdjustable__Group_6__2__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4643:1: ( rule__MeasurementDataNotAdjustable__Group_6__2__Impl )
            // InternalSensidl.g:4644:2: rule__MeasurementDataNotAdjustable__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6__2"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6__2__Impl"
    // InternalSensidl.g:4650:1: rule__MeasurementDataNotAdjustable__Group_6__2__Impl : ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4654:1: ( ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) ) )
            // InternalSensidl.g:4655:1: ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) )
            {
            // InternalSensidl.g:4655:1: ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) )
            // InternalSensidl.g:4656:1: ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getAlternatives_6_2()); 
            // InternalSensidl.g:4657:1: ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 )
            // InternalSensidl.g:4657:2: rule__MeasurementDataNotAdjustable__Alternatives_6_2
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Alternatives_6_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getAlternatives_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6__2__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_0__0"
    // InternalSensidl.g:4673:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__0 : rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4677:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1 )
            // InternalSensidl.g:4678:2: rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1
            {
            pushFollow(FOLLOW_11);
            rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group_6_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_0__0"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl"
    // InternalSensidl.g:4685:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4689:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) ) )
            // InternalSensidl.g:4690:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) )
            {
            // InternalSensidl.g:4690:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) )
            // InternalSensidl.g:4691:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_0_0()); 
            // InternalSensidl.g:4692:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 )
            // InternalSensidl.g:4692:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_0__1"
    // InternalSensidl.g:4702:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__1 : rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4706:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl )
            // InternalSensidl.g:4707:2: rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_0__1"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl"
    // InternalSensidl.g:4713:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4717:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? ) )
            // InternalSensidl.g:4718:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? )
            {
            // InternalSensidl.g:4718:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? )
            // InternalSensidl.g:4719:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_0_1()); 
            // InternalSensidl.g:4720:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSensidl.g:4720:2: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0"
    // InternalSensidl.g:4734:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4738:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 )
            // InternalSensidl.g:4739:2: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1
            {
            pushFollow(FOLLOW_33);
            rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl"
    // InternalSensidl.g:4746:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4750:1: ( ( ',' ) )
            // InternalSensidl.g:4751:1: ( ',' )
            {
            // InternalSensidl.g:4751:1: ( ',' )
            // InternalSensidl.g:4752:1: ','
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getCommaKeyword_6_2_0_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getCommaKeyword_6_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1"
    // InternalSensidl.g:4765:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4769:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl )
            // InternalSensidl.g:4770:2: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl"
    // InternalSensidl.g:4776:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4780:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) ) )
            // InternalSensidl.g:4781:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) )
            {
            // InternalSensidl.g:4781:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) )
            // InternalSensidl.g:4782:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_0_1_1()); 
            // InternalSensidl.g:4783:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 )
            // InternalSensidl.g:4783:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_1__0"
    // InternalSensidl.g:4797:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4801:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1 )
            // InternalSensidl.g:4802:2: rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1
            {
            pushFollow(FOLLOW_11);
            rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group_6_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_1__0"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl"
    // InternalSensidl.g:4809:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4813:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) ) )
            // InternalSensidl.g:4814:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) )
            {
            // InternalSensidl.g:4814:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) )
            // InternalSensidl.g:4815:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_1_0()); 
            // InternalSensidl.g:4816:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 )
            // InternalSensidl.g:4816:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_1__1"
    // InternalSensidl.g:4826:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4830:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl )
            // InternalSensidl.g:4831:2: rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_1__1"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl"
    // InternalSensidl.g:4837:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4841:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? ) )
            // InternalSensidl.g:4842:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? )
            {
            // InternalSensidl.g:4842:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? )
            // InternalSensidl.g:4843:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_1_1()); 
            // InternalSensidl.g:4844:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSensidl.g:4844:2: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0"
    // InternalSensidl.g:4858:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4862:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 )
            // InternalSensidl.g:4863:2: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1
            {
            pushFollow(FOLLOW_34);
            rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl"
    // InternalSensidl.g:4870:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4874:1: ( ( ',' ) )
            // InternalSensidl.g:4875:1: ( ',' )
            {
            // InternalSensidl.g:4875:1: ( ',' )
            // InternalSensidl.g:4876:1: ','
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getCommaKeyword_6_2_1_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getCommaKeyword_6_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1"
    // InternalSensidl.g:4889:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4893:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl )
            // InternalSensidl.g:4894:2: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl"
    // InternalSensidl.g:4900:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4904:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) ) )
            // InternalSensidl.g:4905:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) )
            {
            // InternalSensidl.g:4905:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) )
            // InternalSensidl.g:4906:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_1_1_1()); 
            // InternalSensidl.g:4907:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 )
            // InternalSensidl.g:4907:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl"


    // $ANTLR start "rule__DataRange__Group__0"
    // InternalSensidl.g:4921:1: rule__DataRange__Group__0 : rule__DataRange__Group__0__Impl rule__DataRange__Group__1 ;
    public final void rule__DataRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4925:1: ( rule__DataRange__Group__0__Impl rule__DataRange__Group__1 )
            // InternalSensidl.g:4926:2: rule__DataRange__Group__0__Impl rule__DataRange__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__DataRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4933:1: rule__DataRange__Group__0__Impl : ( 'with range' ) ;
    public final void rule__DataRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4937:1: ( ( 'with range' ) )
            // InternalSensidl.g:4938:1: ( 'with range' )
            {
            // InternalSensidl.g:4938:1: ( 'with range' )
            // InternalSensidl.g:4939:1: 'with range'
            {
             before(grammarAccess.getDataRangeAccess().getWithRangeKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSensidl.g:4952:1: rule__DataRange__Group__1 : rule__DataRange__Group__1__Impl ;
    public final void rule__DataRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4956:1: ( rule__DataRange__Group__1__Impl )
            // InternalSensidl.g:4957:2: rule__DataRange__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4963:1: rule__DataRange__Group__1__Impl : ( ( rule__DataRange__RangeAssignment_1 ) ) ;
    public final void rule__DataRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4967:1: ( ( ( rule__DataRange__RangeAssignment_1 ) ) )
            // InternalSensidl.g:4968:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            {
            // InternalSensidl.g:4968:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            // InternalSensidl.g:4969:1: ( rule__DataRange__RangeAssignment_1 )
            {
             before(grammarAccess.getDataRangeAccess().getRangeAssignment_1()); 
            // InternalSensidl.g:4970:1: ( rule__DataRange__RangeAssignment_1 )
            // InternalSensidl.g:4970:2: rule__DataRange__RangeAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4984:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4988:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalSensidl.g:4989:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Interval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4996:1: rule__Interval__Group__0__Impl : ( '[' ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5000:1: ( ( '[' ) )
            // InternalSensidl.g:5001:1: ( '[' )
            {
            // InternalSensidl.g:5001:1: ( '[' )
            // InternalSensidl.g:5002:1: '['
            {
             before(grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSensidl.g:5015:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5019:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalSensidl.g:5020:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Interval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5027:1: rule__Interval__Group__1__Impl : ( ( rule__Interval__LowerBoundAssignment_1 ) ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5031:1: ( ( ( rule__Interval__LowerBoundAssignment_1 ) ) )
            // InternalSensidl.g:5032:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            {
            // InternalSensidl.g:5032:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            // InternalSensidl.g:5033:1: ( rule__Interval__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundAssignment_1()); 
            // InternalSensidl.g:5034:1: ( rule__Interval__LowerBoundAssignment_1 )
            // InternalSensidl.g:5034:2: rule__Interval__LowerBoundAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5044:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl rule__Interval__Group__3 ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5048:1: ( rule__Interval__Group__2__Impl rule__Interval__Group__3 )
            // InternalSensidl.g:5049:2: rule__Interval__Group__2__Impl rule__Interval__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Interval__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5056:1: rule__Interval__Group__2__Impl : ( ';' ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5060:1: ( ( ';' ) )
            // InternalSensidl.g:5061:1: ( ';' )
            {
            // InternalSensidl.g:5061:1: ( ';' )
            // InternalSensidl.g:5062:1: ';'
            {
             before(grammarAccess.getIntervalAccess().getSemicolonKeyword_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSensidl.g:5075:1: rule__Interval__Group__3 : rule__Interval__Group__3__Impl rule__Interval__Group__4 ;
    public final void rule__Interval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5079:1: ( rule__Interval__Group__3__Impl rule__Interval__Group__4 )
            // InternalSensidl.g:5080:2: rule__Interval__Group__3__Impl rule__Interval__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__Interval__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5087:1: rule__Interval__Group__3__Impl : ( ( rule__Interval__UpperBoundAssignment_3 ) ) ;
    public final void rule__Interval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5091:1: ( ( ( rule__Interval__UpperBoundAssignment_3 ) ) )
            // InternalSensidl.g:5092:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            {
            // InternalSensidl.g:5092:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            // InternalSensidl.g:5093:1: ( rule__Interval__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundAssignment_3()); 
            // InternalSensidl.g:5094:1: ( rule__Interval__UpperBoundAssignment_3 )
            // InternalSensidl.g:5094:2: rule__Interval__UpperBoundAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5104:1: rule__Interval__Group__4 : rule__Interval__Group__4__Impl ;
    public final void rule__Interval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5108:1: ( rule__Interval__Group__4__Impl )
            // InternalSensidl.g:5109:2: rule__Interval__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5115:1: rule__Interval__Group__4__Impl : ( ']' ) ;
    public final void rule__Interval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5119:1: ( ( ']' ) )
            // InternalSensidl.g:5120:1: ( ']' )
            {
            // InternalSensidl.g:5120:1: ( ']' )
            // InternalSensidl.g:5121:1: ']'
            {
             before(grammarAccess.getIntervalAccess().getRightSquareBracketKeyword_4()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSensidl.g:5144:1: rule__LinearDataConversion__Group__0 : rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 ;
    public final void rule__LinearDataConversion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5148:1: ( rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 )
            // InternalSensidl.g:5149:2: rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__LinearDataConversion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5156:1: rule__LinearDataConversion__Group__0__Impl : ( 'with scaling factor' ) ;
    public final void rule__LinearDataConversion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5160:1: ( ( 'with scaling factor' ) )
            // InternalSensidl.g:5161:1: ( 'with scaling factor' )
            {
            // InternalSensidl.g:5161:1: ( 'with scaling factor' )
            // InternalSensidl.g:5162:1: 'with scaling factor'
            {
             before(grammarAccess.getLinearDataConversionAccess().getWithScalingFactorKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSensidl.g:5175:1: rule__LinearDataConversion__Group__1 : rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 ;
    public final void rule__LinearDataConversion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5179:1: ( rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 )
            // InternalSensidl.g:5180:2: rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__LinearDataConversion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5187:1: rule__LinearDataConversion__Group__1__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5191:1: ( ( ':' ) )
            // InternalSensidl.g:5192:1: ( ':' )
            {
            // InternalSensidl.g:5192:1: ( ':' )
            // InternalSensidl.g:5193:1: ':'
            {
             before(grammarAccess.getLinearDataConversionAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSensidl.g:5206:1: rule__LinearDataConversion__Group__2 : rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 ;
    public final void rule__LinearDataConversion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5210:1: ( rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 )
            // InternalSensidl.g:5211:2: rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__LinearDataConversion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5218:1: rule__LinearDataConversion__Group__2__Impl : ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) ;
    public final void rule__LinearDataConversion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5222:1: ( ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) )
            // InternalSensidl.g:5223:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            {
            // InternalSensidl.g:5223:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            // InternalSensidl.g:5224:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorAssignment_2()); 
            // InternalSensidl.g:5225:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            // InternalSensidl.g:5225:2: rule__LinearDataConversion__ScalingFactorAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5235:1: rule__LinearDataConversion__Group__3 : rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 ;
    public final void rule__LinearDataConversion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5239:1: ( rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 )
            // InternalSensidl.g:5240:2: rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__LinearDataConversion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5247:1: rule__LinearDataConversion__Group__3__Impl : ( 'and offset' ) ;
    public final void rule__LinearDataConversion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5251:1: ( ( 'and offset' ) )
            // InternalSensidl.g:5252:1: ( 'and offset' )
            {
            // InternalSensidl.g:5252:1: ( 'and offset' )
            // InternalSensidl.g:5253:1: 'and offset'
            {
             before(grammarAccess.getLinearDataConversionAccess().getAndOffsetKeyword_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSensidl.g:5266:1: rule__LinearDataConversion__Group__4 : rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 ;
    public final void rule__LinearDataConversion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5270:1: ( rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 )
            // InternalSensidl.g:5271:2: rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__LinearDataConversion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5278:1: rule__LinearDataConversion__Group__4__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5282:1: ( ( ':' ) )
            // InternalSensidl.g:5283:1: ( ':' )
            {
            // InternalSensidl.g:5283:1: ( ':' )
            // InternalSensidl.g:5284:1: ':'
            {
             before(grammarAccess.getLinearDataConversionAccess().getColonKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSensidl.g:5297:1: rule__LinearDataConversion__Group__5 : rule__LinearDataConversion__Group__5__Impl ;
    public final void rule__LinearDataConversion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5301:1: ( rule__LinearDataConversion__Group__5__Impl )
            // InternalSensidl.g:5302:2: rule__LinearDataConversion__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5308:1: rule__LinearDataConversion__Group__5__Impl : ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) ;
    public final void rule__LinearDataConversion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5312:1: ( ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) )
            // InternalSensidl.g:5313:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            {
            // InternalSensidl.g:5313:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            // InternalSensidl.g:5314:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetAssignment_5()); 
            // InternalSensidl.g:5315:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            // InternalSensidl.g:5315:2: rule__LinearDataConversion__OffsetAssignment_5
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5337:1: rule__LinearDataConversionWithInterval__Group__0 : rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 ;
    public final void rule__LinearDataConversionWithInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5341:1: ( rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 )
            // InternalSensidl.g:5342:2: rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__LinearDataConversionWithInterval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5349:1: rule__LinearDataConversionWithInterval__Group__0__Impl : ( 'by linear mapping' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5353:1: ( ( 'by linear mapping' ) )
            // InternalSensidl.g:5354:1: ( 'by linear mapping' )
            {
            // InternalSensidl.g:5354:1: ( 'by linear mapping' )
            // InternalSensidl.g:5355:1: 'by linear mapping'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getByLinearMappingKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalSensidl.g:5368:1: rule__LinearDataConversionWithInterval__Group__1 : rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 ;
    public final void rule__LinearDataConversionWithInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5372:1: ( rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 )
            // InternalSensidl.g:5373:2: rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__LinearDataConversionWithInterval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5380:1: rule__LinearDataConversionWithInterval__Group__1__Impl : ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5384:1: ( ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) )
            // InternalSensidl.g:5385:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            {
            // InternalSensidl.g:5385:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            // InternalSensidl.g:5386:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalAssignment_1()); 
            // InternalSensidl.g:5387:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            // InternalSensidl.g:5387:2: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5397:1: rule__LinearDataConversionWithInterval__Group__2 : rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 ;
    public final void rule__LinearDataConversionWithInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5401:1: ( rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 )
            // InternalSensidl.g:5402:2: rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__LinearDataConversionWithInterval__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5409:1: rule__LinearDataConversionWithInterval__Group__2__Impl : ( '=>' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5413:1: ( ( '=>' ) )
            // InternalSensidl.g:5414:1: ( '=>' )
            {
            // InternalSensidl.g:5414:1: ( '=>' )
            // InternalSensidl.g:5415:1: '=>'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalSensidl.g:5428:1: rule__LinearDataConversionWithInterval__Group__3 : rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4 ;
    public final void rule__LinearDataConversionWithInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5432:1: ( rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4 )
            // InternalSensidl.g:5433:2: rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__LinearDataConversionWithInterval__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearDataConversionWithInterval__Group__4();

            state._fsp--;


            }

        }
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
    // InternalSensidl.g:5440:1: rule__LinearDataConversionWithInterval__Group__3__Impl : ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5444:1: ( ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) )
            // InternalSensidl.g:5445:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            {
            // InternalSensidl.g:5445:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            // InternalSensidl.g:5446:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalAssignment_3()); 
            // InternalSensidl.g:5447:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            // InternalSensidl.g:5447:2: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__4"
    // InternalSensidl.g:5457:1: rule__LinearDataConversionWithInterval__Group__4 : rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5 ;
    public final void rule__LinearDataConversionWithInterval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5461:1: ( rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5 )
            // InternalSensidl.g:5462:2: rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__LinearDataConversionWithInterval__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinearDataConversionWithInterval__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__4"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__4__Impl"
    // InternalSensidl.g:5469:1: rule__LinearDataConversionWithInterval__Group__4__Impl : ( 'as' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5473:1: ( ( 'as' ) )
            // InternalSensidl.g:5474:1: ( 'as' )
            {
            // InternalSensidl.g:5474:1: ( 'as' )
            // InternalSensidl.g:5475:1: 'as'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getAsKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getAsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__4__Impl"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__5"
    // InternalSensidl.g:5488:1: rule__LinearDataConversionWithInterval__Group__5 : rule__LinearDataConversionWithInterval__Group__5__Impl ;
    public final void rule__LinearDataConversionWithInterval__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5492:1: ( rule__LinearDataConversionWithInterval__Group__5__Impl )
            // InternalSensidl.g:5493:2: rule__LinearDataConversionWithInterval__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinearDataConversionWithInterval__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__5"


    // $ANTLR start "rule__LinearDataConversionWithInterval__Group__5__Impl"
    // InternalSensidl.g:5499:1: rule__LinearDataConversionWithInterval__Group__5__Impl : ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5503:1: ( ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) ) )
            // InternalSensidl.g:5504:1: ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) )
            {
            // InternalSensidl.g:5504:1: ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) )
            // InternalSensidl.g:5505:1: ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeAssignment_5()); 
            // InternalSensidl.g:5506:1: ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 )
            // InternalSensidl.g:5506:2: rule__LinearDataConversionWithInterval__DataTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LinearDataConversionWithInterval__DataTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__Group__5__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // InternalSensidl.g:5528:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5532:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalSensidl.g:5533:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5540:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5544:1: ( ( RULE_INT ) )
            // InternalSensidl.g:5545:1: ( RULE_INT )
            {
            // InternalSensidl.g:5545:1: ( RULE_INT )
            // InternalSensidl.g:5546:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalSensidl.g:5557:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5561:1: ( rule__DOUBLE__Group__1__Impl )
            // InternalSensidl.g:5562:2: rule__DOUBLE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5568:1: rule__DOUBLE__Group__1__Impl : ( ( rule__DOUBLE__Group_1__0 )? ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5572:1: ( ( ( rule__DOUBLE__Group_1__0 )? ) )
            // InternalSensidl.g:5573:1: ( ( rule__DOUBLE__Group_1__0 )? )
            {
            // InternalSensidl.g:5573:1: ( ( rule__DOUBLE__Group_1__0 )? )
            // InternalSensidl.g:5574:1: ( rule__DOUBLE__Group_1__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
            // InternalSensidl.g:5575:1: ( rule__DOUBLE__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==56) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSensidl.g:5575:2: rule__DOUBLE__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5589:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5593:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // InternalSensidl.g:5594:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__DOUBLE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5601:1: rule__DOUBLE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5605:1: ( ( '.' ) )
            // InternalSensidl.g:5606:1: ( '.' )
            {
            // InternalSensidl.g:5606:1: ( '.' )
            // InternalSensidl.g:5607:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalSensidl.g:5620:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5624:1: ( rule__DOUBLE__Group_1__1__Impl )
            // InternalSensidl.g:5625:2: rule__DOUBLE__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5631:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5635:1: ( ( RULE_INT ) )
            // InternalSensidl.g:5636:1: ( RULE_INT )
            {
            // InternalSensidl.g:5636:1: ( RULE_INT )
            // InternalSensidl.g:5637:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalSensidl.g:5652:1: rule__UNIT__Group__0 : rule__UNIT__Group__0__Impl rule__UNIT__Group__1 ;
    public final void rule__UNIT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5656:1: ( rule__UNIT__Group__0__Impl rule__UNIT__Group__1 )
            // InternalSensidl.g:5657:2: rule__UNIT__Group__0__Impl rule__UNIT__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__UNIT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5664:1: rule__UNIT__Group__0__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5668:1: ( ( ( RULE_ID )* ) )
            // InternalSensidl.g:5669:1: ( ( RULE_ID )* )
            {
            // InternalSensidl.g:5669:1: ( ( RULE_ID )* )
            // InternalSensidl.g:5670:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_0()); 
            // InternalSensidl.g:5671:1: ( RULE_ID )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==EOF||(LA41_2>=RULE_ID && LA41_2<=RULE_DESCRIPTION)||(LA41_2>=30 && LA41_2<=31)||(LA41_2>=43 && LA41_2<=44)||LA41_2==47) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // InternalSensidl.g:5671:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_24); 

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalSensidl.g:5681:1: rule__UNIT__Group__1 : rule__UNIT__Group__1__Impl ;
    public final void rule__UNIT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5685:1: ( rule__UNIT__Group__1__Impl )
            // InternalSensidl.g:5686:2: rule__UNIT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5692:1: rule__UNIT__Group__1__Impl : ( ( rule__UNIT__Group_1__0 )* ) ;
    public final void rule__UNIT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5696:1: ( ( ( rule__UNIT__Group_1__0 )* ) )
            // InternalSensidl.g:5697:1: ( ( rule__UNIT__Group_1__0 )* )
            {
            // InternalSensidl.g:5697:1: ( ( rule__UNIT__Group_1__0 )* )
            // InternalSensidl.g:5698:1: ( rule__UNIT__Group_1__0 )*
            {
             before(grammarAccess.getUNITAccess().getGroup_1()); 
            // InternalSensidl.g:5699:1: ( rule__UNIT__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ANY_OTHER) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSensidl.g:5699:2: rule__UNIT__Group_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__UNIT__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalSensidl.g:5713:1: rule__UNIT__Group_1__0 : rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 ;
    public final void rule__UNIT__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5717:1: ( rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 )
            // InternalSensidl.g:5718:2: rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__UNIT__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5725:1: rule__UNIT__Group_1__0__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__UNIT__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5729:1: ( ( RULE_ANY_OTHER ) )
            // InternalSensidl.g:5730:1: ( RULE_ANY_OTHER )
            {
            // InternalSensidl.g:5730:1: ( RULE_ANY_OTHER )
            // InternalSensidl.g:5731:1: RULE_ANY_OTHER
            {
             before(grammarAccess.getUNITAccess().getANY_OTHERTerminalRuleCall_1_0()); 
            match(input,RULE_ANY_OTHER,FOLLOW_2); 
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
    // InternalSensidl.g:5742:1: rule__UNIT__Group_1__1 : rule__UNIT__Group_1__1__Impl ;
    public final void rule__UNIT__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5746:1: ( rule__UNIT__Group_1__1__Impl )
            // InternalSensidl.g:5747:2: rule__UNIT__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5753:1: rule__UNIT__Group_1__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5757:1: ( ( ( RULE_ID )* ) )
            // InternalSensidl.g:5758:1: ( ( RULE_ID )* )
            {
            // InternalSensidl.g:5758:1: ( ( RULE_ID )* )
            // InternalSensidl.g:5759:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1()); 
            // InternalSensidl.g:5760:1: ( RULE_ID )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    int LA43_2 = input.LA(2);

                    if ( (LA43_2==EOF||(LA43_2>=RULE_ID && LA43_2<=RULE_DESCRIPTION)||(LA43_2>=30 && LA43_2<=31)||(LA43_2>=43 && LA43_2<=44)||LA43_2==47) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // InternalSensidl.g:5760:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_24); 

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalSensidl.g:5775:1: rule__SensorInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5779:1: ( ( RULE_ID ) )
            // InternalSensidl.g:5780:1: ( RULE_ID )
            {
            // InternalSensidl.g:5780:1: ( RULE_ID )
            // InternalSensidl.g:5781:1: RULE_ID
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalSensidl.g:5790:1: rule__SensorInterface__DescriptionAssignment_2 : ( RULE_DESCRIPTION ) ;
    public final void rule__SensorInterface__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5794:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:5795:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:5795:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:5796:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionDESCRIPTIONTerminalRuleCall_2_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
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
    // InternalSensidl.g:5805:1: rule__SensorInterface__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__SensorInterface__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5809:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:5810:1: ( RULE_STRING )
            {
            // InternalSensidl.g:5810:1: ( RULE_STRING )
            // InternalSensidl.g:5811:1: RULE_STRING
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalSensidl.g:5820:1: rule__SensorInterface__EncodingSettingsAssignment_5 : ( ruleEncodingSettings ) ;
    public final void rule__SensorInterface__EncodingSettingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5824:1: ( ( ruleEncodingSettings ) )
            // InternalSensidl.g:5825:1: ( ruleEncodingSettings )
            {
            // InternalSensidl.g:5825:1: ( ruleEncodingSettings )
            // InternalSensidl.g:5826:1: ruleEncodingSettings
            {
             before(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsEncodingSettingsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5835:1: rule__SensorInterface__DataDescriptionAssignment_6 : ( ruleSensorDataDescription ) ;
    public final void rule__SensorInterface__DataDescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5839:1: ( ( ruleSensorDataDescription ) )
            // InternalSensidl.g:5840:1: ( ruleSensorDataDescription )
            {
            // InternalSensidl.g:5840:1: ( ruleSensorDataDescription )
            // InternalSensidl.g:5841:1: ruleSensorDataDescription
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionSensorDataDescriptionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5850:1: rule__EncodingSettings__CodingAssignment_2 : ( ruleCoding ) ;
    public final void rule__EncodingSettings__CodingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5854:1: ( ( ruleCoding ) )
            // InternalSensidl.g:5855:1: ( ruleCoding )
            {
            // InternalSensidl.g:5855:1: ( ruleCoding )
            // InternalSensidl.g:5856:1: ruleCoding
            {
             before(grammarAccess.getEncodingSettingsAccess().getCodingCodingEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5865:1: rule__EncodingSettings__EndiannessAssignment_6 : ( ruleEndianness ) ;
    public final void rule__EncodingSettings__EndiannessAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5869:1: ( ( ruleEndianness ) )
            // InternalSensidl.g:5870:1: ( ruleEndianness )
            {
            // InternalSensidl.g:5870:1: ( ruleEndianness )
            // InternalSensidl.g:5871:1: ruleEndianness
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessEndiannessEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5880:1: rule__EncodingSettings__AlignmentAssignment_10 : ( RULE_INT ) ;
    public final void rule__EncodingSettings__AlignmentAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5884:1: ( ( RULE_INT ) )
            // InternalSensidl.g:5885:1: ( RULE_INT )
            {
            // InternalSensidl.g:5885:1: ( RULE_INT )
            // InternalSensidl.g:5886:1: RULE_INT
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalSensidl.g:5895:1: rule__EncodingSettings__IDAssignment_12_2 : ( RULE_STRING ) ;
    public final void rule__EncodingSettings__IDAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5899:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:5900:1: ( RULE_STRING )
            {
            // InternalSensidl.g:5900:1: ( RULE_STRING )
            // InternalSensidl.g:5901:1: RULE_STRING
            {
             before(grammarAccess.getEncodingSettingsAccess().getIDSTRINGTerminalRuleCall_12_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalSensidl.g:5910:1: rule__SensorDataDescription__IDAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__SensorDataDescription__IDAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5914:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:5915:1: ( RULE_STRING )
            {
            // InternalSensidl.g:5915:1: ( RULE_STRING )
            // InternalSensidl.g:5916:1: RULE_STRING
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalSensidl.g:5925:1: rule__SensorDataDescription__DataSetsAssignment_4 : ( ruleDataSet ) ;
    public final void rule__SensorDataDescription__DataSetsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5929:1: ( ( ruleDataSet ) )
            // InternalSensidl.g:5930:1: ( ruleDataSet )
            {
            // InternalSensidl.g:5930:1: ( ruleDataSet )
            // InternalSensidl.g:5931:1: ruleDataSet
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsDataSetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:5940:1: rule__DataSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5944:1: ( ( RULE_ID ) )
            // InternalSensidl.g:5945:1: ( RULE_ID )
            {
            // InternalSensidl.g:5945:1: ( RULE_ID )
            // InternalSensidl.g:5946:1: RULE_ID
            {
             before(grammarAccess.getDataSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalSensidl.g:5955:1: rule__DataSet__ParentDataSetAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__ParentDataSetAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5959:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:5960:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:5960:1: ( ( RULE_ID ) )
            // InternalSensidl.g:5961:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_2_1_0()); 
            // InternalSensidl.g:5962:1: ( RULE_ID )
            // InternalSensidl.g:5963:1: RULE_ID
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__DataSet__ParentDataSetAssignment_3_1"
    // InternalSensidl.g:5974:1: rule__DataSet__ParentDataSetAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__ParentDataSetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5978:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:5979:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:5979:1: ( ( RULE_ID ) )
            // InternalSensidl.g:5980:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_3_1_0()); 
            // InternalSensidl.g:5981:1: ( RULE_ID )
            // InternalSensidl.g:5982:1: RULE_ID
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getParentDataSetDataSetIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__ParentDataSetAssignment_3_1"


    // $ANTLR start "rule__DataSet__IDAssignment_4_2"
    // InternalSensidl.g:5993:1: rule__DataSet__IDAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__DataSet__IDAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5997:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:5998:1: ( RULE_STRING )
            {
            // InternalSensidl.g:5998:1: ( RULE_STRING )
            // InternalSensidl.g:5999:1: RULE_STRING
            {
             before(grammarAccess.getDataSetAccess().getIDSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getIDSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__IDAssignment_4_2"


    // $ANTLR start "rule__DataSet__DescriptionAssignment_5"
    // InternalSensidl.g:6008:1: rule__DataSet__DescriptionAssignment_5 : ( RULE_DESCRIPTION ) ;
    public final void rule__DataSet__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6012:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:6013:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:6013:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:6014:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getDataSetAccess().getDescriptionDESCRIPTIONTerminalRuleCall_5_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getDescriptionDESCRIPTIONTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__DescriptionAssignment_5"


    // $ANTLR start "rule__DataSet__DataAssignment_7"
    // InternalSensidl.g:6023:1: rule__DataSet__DataAssignment_7 : ( ruleData ) ;
    public final void rule__DataSet__DataAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6027:1: ( ( ruleData ) )
            // InternalSensidl.g:6028:1: ( ruleData )
            {
            // InternalSensidl.g:6028:1: ( ruleData )
            // InternalSensidl.g:6029:1: ruleData
            {
             before(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__DataAssignment_7"


    // $ANTLR start "rule__MeasurementData__NameAssignment_0"
    // InternalSensidl.g:6038:1: rule__MeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6042:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6043:1: ( RULE_ID )
            {
            // InternalSensidl.g:6043:1: ( RULE_ID )
            // InternalSensidl.g:6044:1: RULE_ID
            {
             before(grammarAccess.getMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalSensidl.g:6053:1: rule__MeasurementData__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__MeasurementData__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6057:1: ( ( ruleDataType ) )
            // InternalSensidl.g:6058:1: ( ruleDataType )
            {
            // InternalSensidl.g:6058:1: ( ruleDataType )
            // InternalSensidl.g:6059:1: ruleDataType
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:6068:1: rule__MeasurementData__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementData__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6072:1: ( ( ruleUNIT ) )
            // InternalSensidl.g:6073:1: ( ruleUNIT )
            {
            // InternalSensidl.g:6073:1: ( ruleUNIT )
            // InternalSensidl.g:6074:1: ruleUNIT
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitUNITParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:6083:1: rule__MeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6087:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6088:1: ( RULE_STRING )
            {
            // InternalSensidl.g:6088:1: ( RULE_STRING )
            // InternalSensidl.g:6089:1: RULE_STRING
            {
             before(grammarAccess.getMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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


    // $ANTLR start "rule__MeasurementData__AdjustmentsAssignment_6_0_1"
    // InternalSensidl.g:6098:1: rule__MeasurementData__AdjustmentsAssignment_6_0_1 : ( ruleDataConversion ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6102:1: ( ( ruleDataConversion ) )
            // InternalSensidl.g:6103:1: ( ruleDataConversion )
            {
            // InternalSensidl.g:6103:1: ( ruleDataConversion )
            // InternalSensidl.g:6104:1: ruleDataConversion
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataConversionParserRuleCall_6_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataConversion();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataConversionParserRuleCall_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__AdjustmentsAssignment_6_0_1"


    // $ANTLR start "rule__MeasurementData__AdjustmentsAssignment_6_1_1"
    // InternalSensidl.g:6113:1: rule__MeasurementData__AdjustmentsAssignment_6_1_1 : ( ruleDataRange ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6117:1: ( ( ruleDataRange ) )
            // InternalSensidl.g:6118:1: ( ruleDataRange )
            {
            // InternalSensidl.g:6118:1: ( ruleDataRange )
            // InternalSensidl.g:6119:1: ruleDataRange
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataRangeParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataRange();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataRangeParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__AdjustmentsAssignment_6_1_1"


    // $ANTLR start "rule__MeasurementData__AdjustmentsAssignment_6_2_1"
    // InternalSensidl.g:6128:1: rule__MeasurementData__AdjustmentsAssignment_6_2_1 : ( ruleDataConversion ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6132:1: ( ( ruleDataConversion ) )
            // InternalSensidl.g:6133:1: ( ruleDataConversion )
            {
            // InternalSensidl.g:6133:1: ( ruleDataConversion )
            // InternalSensidl.g:6134:1: ruleDataConversion
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataConversionParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataConversion();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataConversionParserRuleCall_6_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__MeasurementData__AdjustmentsAssignment_6_2_3"
    // InternalSensidl.g:6143:1: rule__MeasurementData__AdjustmentsAssignment_6_2_3 : ( ruleDataRange ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6147:1: ( ( ruleDataRange ) )
            // InternalSensidl.g:6148:1: ( ruleDataRange )
            {
            // InternalSensidl.g:6148:1: ( ruleDataRange )
            // InternalSensidl.g:6149:1: ruleDataRange
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataRangeParserRuleCall_6_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataRange();

            state._fsp--;

             after(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataRangeParserRuleCall_6_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__AdjustmentsAssignment_6_2_3"


    // $ANTLR start "rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0"
    // InternalSensidl.g:6158:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6162:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:6163:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:6163:1: ( ( 'setter' ) )
            // InternalSensidl.g:6164:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_0_0_0()); 
            // InternalSensidl.g:6165:1: ( 'setter' )
            // InternalSensidl.g:6166:1: 'setter'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_0_0_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_0_0_0()); 

            }

             after(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0"


    // $ANTLR start "rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1"
    // InternalSensidl.g:6181:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6185:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:6186:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:6186:1: ( ( 'getter' ) )
            // InternalSensidl.g:6187:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_0_1_1_0()); 
            // InternalSensidl.g:6188:1: ( 'getter' )
            // InternalSensidl.g:6189:1: 'getter'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_0_1_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_0_1_1_0()); 

            }

             after(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1"


    // $ANTLR start "rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0"
    // InternalSensidl.g:6204:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6208:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:6209:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:6209:1: ( ( 'getter' ) )
            // InternalSensidl.g:6210:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_1_0_0()); 
            // InternalSensidl.g:6211:1: ( 'getter' )
            // InternalSensidl.g:6212:1: 'getter'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_1_0_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_1_0_0()); 

            }

             after(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0"


    // $ANTLR start "rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1"
    // InternalSensidl.g:6227:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6231:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:6232:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:6232:1: ( ( 'setter' ) )
            // InternalSensidl.g:6233:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_1_1_1_0()); 
            // InternalSensidl.g:6234:1: ( 'setter' )
            // InternalSensidl.g:6235:1: 'setter'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_1_1_1_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_1_1_1_0()); 

            }

             after(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1"


    // $ANTLR start "rule__MeasurementData__DescriptionAssignment_8"
    // InternalSensidl.g:6250:1: rule__MeasurementData__DescriptionAssignment_8 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementData__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6254:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:6255:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:6255:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:6256:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_8_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementData__DescriptionAssignment_8"


    // $ANTLR start "rule__NonMeasurementData__NameAssignment_0"
    // InternalSensidl.g:6265:1: rule__NonMeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NonMeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6269:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6270:1: ( RULE_ID )
            {
            // InternalSensidl.g:6270:1: ( RULE_ID )
            // InternalSensidl.g:6271:1: RULE_ID
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalSensidl.g:6280:1: rule__NonMeasurementData__DataTypeAssignment_2_0 : ( ruleDataType ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6284:1: ( ( ruleDataType ) )
            // InternalSensidl.g:6285:1: ( ruleDataType )
            {
            // InternalSensidl.g:6285:1: ( ruleDataType )
            // InternalSensidl.g:6286:1: ruleDataType
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:6295:1: rule__NonMeasurementData__DataTypeAssignment_2_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6299:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:6300:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:6300:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:6301:1: ruleDataTypeNotAdjustable
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:6310:1: rule__NonMeasurementData__ConstantAssignment_3 : ( ( 'constant' ) ) ;
    public final void rule__NonMeasurementData__ConstantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6314:1: ( ( ( 'constant' ) ) )
            // InternalSensidl.g:6315:1: ( ( 'constant' ) )
            {
            // InternalSensidl.g:6315:1: ( ( 'constant' ) )
            // InternalSensidl.g:6316:1: ( 'constant' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 
            // InternalSensidl.g:6317:1: ( 'constant' )
            // InternalSensidl.g:6318:1: 'constant'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSensidl.g:6333:1: rule__NonMeasurementData__ValueAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6337:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6338:1: ( RULE_STRING )
            {
            // InternalSensidl.g:6338:1: ( RULE_STRING )
            // InternalSensidl.g:6339:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalSensidl.g:6348:1: rule__NonMeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6352:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6353:1: ( RULE_STRING )
            {
            // InternalSensidl.g:6353:1: ( RULE_STRING )
            // InternalSensidl.g:6354:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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


    // $ANTLR start "rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0"
    // InternalSensidl.g:6363:1: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 : ( ( 'setter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6367:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:6368:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:6368:1: ( ( 'setter' ) )
            // InternalSensidl.g:6369:1: ( 'setter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_0_0_0()); 
            // InternalSensidl.g:6370:1: ( 'setter' )
            // InternalSensidl.g:6371:1: 'setter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_0_0_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_0_0_0()); 

            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0"


    // $ANTLR start "rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1"
    // InternalSensidl.g:6386:1: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6390:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:6391:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:6391:1: ( ( 'getter' ) )
            // InternalSensidl.g:6392:1: ( 'getter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_0_1_1_0()); 
            // InternalSensidl.g:6393:1: ( 'getter' )
            // InternalSensidl.g:6394:1: 'getter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_0_1_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_0_1_1_0()); 

            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1"


    // $ANTLR start "rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0"
    // InternalSensidl.g:6409:1: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 : ( ( 'getter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6413:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:6414:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:6414:1: ( ( 'getter' ) )
            // InternalSensidl.g:6415:1: ( 'getter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_1_0_0()); 
            // InternalSensidl.g:6416:1: ( 'getter' )
            // InternalSensidl.g:6417:1: 'getter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_1_0_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_1_0_0()); 

            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0"


    // $ANTLR start "rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1"
    // InternalSensidl.g:6432:1: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6436:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:6437:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:6437:1: ( ( 'setter' ) )
            // InternalSensidl.g:6438:1: ( 'setter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_1_1_1_0()); 
            // InternalSensidl.g:6439:1: ( 'setter' )
            // InternalSensidl.g:6440:1: 'setter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_1_1_1_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_1_1_1_0()); 

            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1"


    // $ANTLR start "rule__NonMeasurementData__DescriptionAssignment_7"
    // InternalSensidl.g:6455:1: rule__NonMeasurementData__DescriptionAssignment_7 : ( RULE_DESCRIPTION ) ;
    public final void rule__NonMeasurementData__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6459:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:6460:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:6460:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:6461:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_7_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__DescriptionAssignment_7"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__NameAssignment_0"
    // InternalSensidl.g:6470:1: rule__MeasurementDataNotAdjustable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementDataNotAdjustable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6474:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6475:1: ( RULE_ID )
            {
            // InternalSensidl.g:6475:1: ( RULE_ID )
            // InternalSensidl.g:6476:1: RULE_ID
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalSensidl.g:6485:1: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__MeasurementDataNotAdjustable__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6489:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:6490:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:6490:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:6491:1: ruleDataTypeNotAdjustable
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:6500:1: rule__MeasurementDataNotAdjustable__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementDataNotAdjustable__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6504:1: ( ( ruleUNIT ) )
            // InternalSensidl.g:6505:1: ( ruleUNIT )
            {
            // InternalSensidl.g:6505:1: ( ruleUNIT )
            // InternalSensidl.g:6506:1: ruleUNIT
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitUNITParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:6515:1: rule__MeasurementDataNotAdjustable__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementDataNotAdjustable__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6519:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6520:1: ( RULE_STRING )
            {
            // InternalSensidl.g:6520:1: ( RULE_STRING )
            // InternalSensidl.g:6521:1: RULE_STRING
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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


    // $ANTLR start "rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0"
    // InternalSensidl.g:6530:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6534:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:6535:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:6535:1: ( ( 'setter' ) )
            // InternalSensidl.g:6536:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_0_0_0()); 
            // InternalSensidl.g:6537:1: ( 'setter' )
            // InternalSensidl.g:6538:1: 'setter'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_0_0_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_0_0_0()); 

            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1"
    // InternalSensidl.g:6553:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6557:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:6558:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:6558:1: ( ( 'getter' ) )
            // InternalSensidl.g:6559:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_0_1_1_0()); 
            // InternalSensidl.g:6560:1: ( 'getter' )
            // InternalSensidl.g:6561:1: 'getter'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_0_1_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_0_1_1_0()); 

            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0"
    // InternalSensidl.g:6576:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6580:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:6581:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:6581:1: ( ( 'getter' ) )
            // InternalSensidl.g:6582:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_1_0_0()); 
            // InternalSensidl.g:6583:1: ( 'getter' )
            // InternalSensidl.g:6584:1: 'getter'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_1_0_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_1_0_0()); 

            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1"
    // InternalSensidl.g:6599:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6603:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:6604:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:6604:1: ( ( 'setter' ) )
            // InternalSensidl.g:6605:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_1_1_1_0()); 
            // InternalSensidl.g:6606:1: ( 'setter' )
            // InternalSensidl.g:6607:1: 'setter'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_1_1_1_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_1_1_1_0()); 

            }

             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__DescriptionAssignment_7"
    // InternalSensidl.g:6622:1: rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementDataNotAdjustable__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6626:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:6627:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:6627:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:6628:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionDESCRIPTIONTerminalRuleCall_7_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
             after(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionDESCRIPTIONTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataNotAdjustable__DescriptionAssignment_7"


    // $ANTLR start "rule__DataRange__RangeAssignment_1"
    // InternalSensidl.g:6637:1: rule__DataRange__RangeAssignment_1 : ( ruleInterval ) ;
    public final void rule__DataRange__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6641:1: ( ( ruleInterval ) )
            // InternalSensidl.g:6642:1: ( ruleInterval )
            {
            // InternalSensidl.g:6642:1: ( ruleInterval )
            // InternalSensidl.g:6643:1: ruleInterval
            {
             before(grammarAccess.getDataRangeAccess().getRangeIntervalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:6652:1: rule__Interval__LowerBoundAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Interval__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6656:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:6657:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:6657:1: ( ruleDOUBLE )
            // InternalSensidl.g:6658:1: ruleDOUBLE
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:6667:1: rule__Interval__UpperBoundAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Interval__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6671:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:6672:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:6672:1: ( ruleDOUBLE )
            // InternalSensidl.g:6673:1: ruleDOUBLE
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:6682:1: rule__LinearDataConversion__ScalingFactorAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__ScalingFactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6686:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:6687:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:6687:1: ( ruleDOUBLE )
            // InternalSensidl.g:6688:1: ruleDOUBLE
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:6697:1: rule__LinearDataConversion__OffsetAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__OffsetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6701:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:6702:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:6702:1: ( ruleDOUBLE )
            // InternalSensidl.g:6703:1: ruleDOUBLE
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetDOUBLEParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:6712:1: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__FromIntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6716:1: ( ( ruleInterval ) )
            // InternalSensidl.g:6717:1: ( ruleInterval )
            {
            // InternalSensidl.g:6717:1: ( ruleInterval )
            // InternalSensidl.g:6718:1: ruleInterval
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalIntervalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:6727:1: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__ToIntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6731:1: ( ( ruleInterval ) )
            // InternalSensidl.g:6732:1: ( ruleInterval )
            {
            // InternalSensidl.g:6732:1: ( ruleInterval )
            // InternalSensidl.g:6733:1: ruleInterval
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalIntervalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__LinearDataConversionWithInterval__DataTypeAssignment_5"
    // InternalSensidl.g:6742:1: rule__LinearDataConversionWithInterval__DataTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__LinearDataConversionWithInterval__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6746:1: ( ( ruleDataType ) )
            // InternalSensidl.g:6747:1: ( ruleDataType )
            {
            // InternalSensidl.g:6747:1: ( ruleDataType )
            // InternalSensidl.g:6748:1: ruleDataType
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeDataTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeDataTypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinearDataConversionWithInterval__DataTypeAssignment_5"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\3\uffff\14\17\3\uffff";
    static final String dfa_3s = "\1\5\1\51\1\20\14\5\3\uffff";
    static final String dfa_4s = "\1\5\1\51\1\33\14\73\3\uffff";
    static final String dfa_5s = "\17\uffff\1\2\1\1\1\3";
    static final String dfa_6s = "\22\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\15\1\16\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\2\17\15\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\2\17\15\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\2\17\15\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\2\17\15\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\2\17\15\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\2\17\15\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\2\17\15\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\2\17\15\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\2\17\15\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\2\17\15\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\21\1\uffff\2\17\15\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\21\1\uffff\2\17\15\uffff\1\17",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "556:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) );";
        }
    }
    static final String dfa_8s = "\56\uffff";
    static final String dfa_9s = "\21\uffff\1\26\7\uffff\1\26\12\uffff\12\26";
    static final String dfa_10s = "\1\53\1\60\1\40\1\61\1\uffff\2\4\1\65\1\62\1\4\1\40\2\4\1\65\1\4\1\62\1\63\1\5\1\4\1\67\1\4\2\uffff\1\63\1\61\1\5\1\4\1\62\2\4\1\62\1\63\1\4\1\51\1\63\1\22\12\5";
    static final String dfa_11s = "\1\53\1\66\1\40\1\61\1\uffff\2\4\2\70\1\4\1\40\2\4\1\65\1\4\1\62\2\70\1\4\1\67\1\4\2\uffff\1\63\1\61\1\54\1\4\1\70\2\4\1\62\1\70\1\4\1\51\1\63\1\33\12\54";
    static final String dfa_12s = "\4\uffff\1\2\20\uffff\1\3\1\1\27\uffff";
    static final String dfa_13s = "\56\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\4\3\uffff\1\2\1\uffff\1\3",
            "\1\5",
            "\1\6",
            "",
            "\1\7",
            "\1\10",
            "\1\12\2\uffff\1\11",
            "\1\14\5\uffff\1\13",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\12",
            "\1\21",
            "\1\14",
            "\1\23\4\uffff\1\22",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\11\uffff\1\26\13\uffff\1\24",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "",
            "\1\23",
            "\1\32",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\11\uffff\1\26",
            "\1\33",
            "\1\35\5\uffff\1\34",
            "\1\36",
            "\1\37",
            "\1\35",
            "\1\41\4\uffff\1\40",
            "\1\42",
            "\1\43",
            "\1\41",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\11\uffff\1\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\11\uffff\1\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\11\uffff\1\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\11\uffff\1\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\11\uffff\1\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\11\uffff\1\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\11\uffff\1\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\11\uffff\1\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\11\uffff\1\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\11\uffff\1\26"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "584:1: rule__MeasurementData__Alternatives_6 : ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000A0000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000104A0000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000FFC0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000180080000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000FFF0000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0800300080000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800080000080L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000042L});

}