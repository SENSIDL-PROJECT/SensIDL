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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_ANY_OTHER", "RULE_DESCRIPTION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'SENSIDL_BINARY'", "'SENSIDL_JSON'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'STRING'", "'BOOLEAN'", "'INT8'", "'UINT8'", "'INT16'", "'UINT16'", "'INT32'", "'UINT32'", "'INT64'", "'UINT64'", "'FLOAT'", "'DOUBLE'", "'sensorInterface'", "'{'", "'}'", "'with identifier'", "':'", "'encoding'", "','", "'endianness'", "'alignment'", "'BIT'", "'sensorData'", "'dataSet'", "'uses'", "'as'", "'in'", "'adjusted'", "'value'", "'='", "'with range'", "'['", "';'", "']'", "'with scaling factor'", "'and offset'", "'by linear mapping'", "'=>'", "'.'", "'constant'"
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


    // $ANTLR start "entryRuleDataAdjustment"
    // InternalSensidl.g:284:1: entryRuleDataAdjustment : ruleDataAdjustment EOF ;
    public final void entryRuleDataAdjustment() throws RecognitionException {
        try {
            // InternalSensidl.g:285:1: ( ruleDataAdjustment EOF )
            // InternalSensidl.g:286:1: ruleDataAdjustment EOF
            {
             before(grammarAccess.getDataAdjustmentRule()); 
            pushFollow(FOLLOW_1);
            ruleDataAdjustment();

            state._fsp--;

             after(grammarAccess.getDataAdjustmentRule()); 
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
    // $ANTLR end "entryRuleDataAdjustment"


    // $ANTLR start "ruleDataAdjustment"
    // InternalSensidl.g:293:1: ruleDataAdjustment : ( ( rule__DataAdjustment__Alternatives ) ) ;
    public final void ruleDataAdjustment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:297:2: ( ( ( rule__DataAdjustment__Alternatives ) ) )
            // InternalSensidl.g:298:1: ( ( rule__DataAdjustment__Alternatives ) )
            {
            // InternalSensidl.g:298:1: ( ( rule__DataAdjustment__Alternatives ) )
            // InternalSensidl.g:299:1: ( rule__DataAdjustment__Alternatives )
            {
             before(grammarAccess.getDataAdjustmentAccess().getAlternatives()); 
            // InternalSensidl.g:300:1: ( rule__DataAdjustment__Alternatives )
            // InternalSensidl.g:300:2: rule__DataAdjustment__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:312:1: entryRuleDataRange : ruleDataRange EOF ;
    public final void entryRuleDataRange() throws RecognitionException {
        try {
            // InternalSensidl.g:313:1: ( ruleDataRange EOF )
            // InternalSensidl.g:314:1: ruleDataRange EOF
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
    // InternalSensidl.g:321:1: ruleDataRange : ( ( rule__DataRange__Group__0 ) ) ;
    public final void ruleDataRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:325:2: ( ( ( rule__DataRange__Group__0 ) ) )
            // InternalSensidl.g:326:1: ( ( rule__DataRange__Group__0 ) )
            {
            // InternalSensidl.g:326:1: ( ( rule__DataRange__Group__0 ) )
            // InternalSensidl.g:327:1: ( rule__DataRange__Group__0 )
            {
             before(grammarAccess.getDataRangeAccess().getGroup()); 
            // InternalSensidl.g:328:1: ( rule__DataRange__Group__0 )
            // InternalSensidl.g:328:2: rule__DataRange__Group__0
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
    // InternalSensidl.g:340:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // InternalSensidl.g:341:1: ( ruleInterval EOF )
            // InternalSensidl.g:342:1: ruleInterval EOF
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
    // InternalSensidl.g:349:1: ruleInterval : ( ( rule__Interval__Group__0 ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:353:2: ( ( ( rule__Interval__Group__0 ) ) )
            // InternalSensidl.g:354:1: ( ( rule__Interval__Group__0 ) )
            {
            // InternalSensidl.g:354:1: ( ( rule__Interval__Group__0 ) )
            // InternalSensidl.g:355:1: ( rule__Interval__Group__0 )
            {
             before(grammarAccess.getIntervalAccess().getGroup()); 
            // InternalSensidl.g:356:1: ( rule__Interval__Group__0 )
            // InternalSensidl.g:356:2: rule__Interval__Group__0
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
    // InternalSensidl.g:368:1: entryRuleDataConversion : ruleDataConversion EOF ;
    public final void entryRuleDataConversion() throws RecognitionException {
        try {
            // InternalSensidl.g:369:1: ( ruleDataConversion EOF )
            // InternalSensidl.g:370:1: ruleDataConversion EOF
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
    // InternalSensidl.g:377:1: ruleDataConversion : ( ( rule__DataConversion__Alternatives ) ) ;
    public final void ruleDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:381:2: ( ( ( rule__DataConversion__Alternatives ) ) )
            // InternalSensidl.g:382:1: ( ( rule__DataConversion__Alternatives ) )
            {
            // InternalSensidl.g:382:1: ( ( rule__DataConversion__Alternatives ) )
            // InternalSensidl.g:383:1: ( rule__DataConversion__Alternatives )
            {
             before(grammarAccess.getDataConversionAccess().getAlternatives()); 
            // InternalSensidl.g:384:1: ( rule__DataConversion__Alternatives )
            // InternalSensidl.g:384:2: rule__DataConversion__Alternatives
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
    // InternalSensidl.g:396:1: entryRuleLinearDataConversion : ruleLinearDataConversion EOF ;
    public final void entryRuleLinearDataConversion() throws RecognitionException {
        try {
            // InternalSensidl.g:397:1: ( ruleLinearDataConversion EOF )
            // InternalSensidl.g:398:1: ruleLinearDataConversion EOF
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
    // InternalSensidl.g:405:1: ruleLinearDataConversion : ( ( rule__LinearDataConversion__Group__0 ) ) ;
    public final void ruleLinearDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:409:2: ( ( ( rule__LinearDataConversion__Group__0 ) ) )
            // InternalSensidl.g:410:1: ( ( rule__LinearDataConversion__Group__0 ) )
            {
            // InternalSensidl.g:410:1: ( ( rule__LinearDataConversion__Group__0 ) )
            // InternalSensidl.g:411:1: ( rule__LinearDataConversion__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getGroup()); 
            // InternalSensidl.g:412:1: ( rule__LinearDataConversion__Group__0 )
            // InternalSensidl.g:412:2: rule__LinearDataConversion__Group__0
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
    // InternalSensidl.g:424:1: entryRuleLinearDataConversionWithInterval : ruleLinearDataConversionWithInterval EOF ;
    public final void entryRuleLinearDataConversionWithInterval() throws RecognitionException {
        try {
            // InternalSensidl.g:425:1: ( ruleLinearDataConversionWithInterval EOF )
            // InternalSensidl.g:426:1: ruleLinearDataConversionWithInterval EOF
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
    // InternalSensidl.g:433:1: ruleLinearDataConversionWithInterval : ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) ;
    public final void ruleLinearDataConversionWithInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:437:2: ( ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) )
            // InternalSensidl.g:438:1: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            {
            // InternalSensidl.g:438:1: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            // InternalSensidl.g:439:1: ( rule__LinearDataConversionWithInterval__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getGroup()); 
            // InternalSensidl.g:440:1: ( rule__LinearDataConversionWithInterval__Group__0 )
            // InternalSensidl.g:440:2: rule__LinearDataConversionWithInterval__Group__0
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
    // InternalSensidl.g:452:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalSensidl.g:453:1: ( ruleDOUBLE EOF )
            // InternalSensidl.g:454:1: ruleDOUBLE EOF
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
    // InternalSensidl.g:461:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:465:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalSensidl.g:466:1: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalSensidl.g:466:1: ( ( rule__DOUBLE__Group__0 ) )
            // InternalSensidl.g:467:1: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalSensidl.g:468:1: ( rule__DOUBLE__Group__0 )
            // InternalSensidl.g:468:2: rule__DOUBLE__Group__0
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
    // InternalSensidl.g:480:1: entryRuleUNIT : ruleUNIT EOF ;
    public final void entryRuleUNIT() throws RecognitionException {
        try {
            // InternalSensidl.g:481:1: ( ruleUNIT EOF )
            // InternalSensidl.g:482:1: ruleUNIT EOF
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
    // InternalSensidl.g:489:1: ruleUNIT : ( ( rule__UNIT__Group__0 ) ) ;
    public final void ruleUNIT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:493:2: ( ( ( rule__UNIT__Group__0 ) ) )
            // InternalSensidl.g:494:1: ( ( rule__UNIT__Group__0 ) )
            {
            // InternalSensidl.g:494:1: ( ( rule__UNIT__Group__0 ) )
            // InternalSensidl.g:495:1: ( rule__UNIT__Group__0 )
            {
             before(grammarAccess.getUNITAccess().getGroup()); 
            // InternalSensidl.g:496:1: ( rule__UNIT__Group__0 )
            // InternalSensidl.g:496:2: rule__UNIT__Group__0
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
    // InternalSensidl.g:509:1: ruleCoding : ( ( rule__Coding__Alternatives ) ) ;
    public final void ruleCoding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:513:1: ( ( ( rule__Coding__Alternatives ) ) )
            // InternalSensidl.g:514:1: ( ( rule__Coding__Alternatives ) )
            {
            // InternalSensidl.g:514:1: ( ( rule__Coding__Alternatives ) )
            // InternalSensidl.g:515:1: ( rule__Coding__Alternatives )
            {
             before(grammarAccess.getCodingAccess().getAlternatives()); 
            // InternalSensidl.g:516:1: ( rule__Coding__Alternatives )
            // InternalSensidl.g:516:2: rule__Coding__Alternatives
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
    // InternalSensidl.g:528:1: ruleEndianness : ( ( rule__Endianness__Alternatives ) ) ;
    public final void ruleEndianness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:532:1: ( ( ( rule__Endianness__Alternatives ) ) )
            // InternalSensidl.g:533:1: ( ( rule__Endianness__Alternatives ) )
            {
            // InternalSensidl.g:533:1: ( ( rule__Endianness__Alternatives ) )
            // InternalSensidl.g:534:1: ( rule__Endianness__Alternatives )
            {
             before(grammarAccess.getEndiannessAccess().getAlternatives()); 
            // InternalSensidl.g:535:1: ( rule__Endianness__Alternatives )
            // InternalSensidl.g:535:2: rule__Endianness__Alternatives
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
    // InternalSensidl.g:547:1: ruleDataTypeNotAdjustable : ( ( rule__DataTypeNotAdjustable__Alternatives ) ) ;
    public final void ruleDataTypeNotAdjustable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:551:1: ( ( ( rule__DataTypeNotAdjustable__Alternatives ) ) )
            // InternalSensidl.g:552:1: ( ( rule__DataTypeNotAdjustable__Alternatives ) )
            {
            // InternalSensidl.g:552:1: ( ( rule__DataTypeNotAdjustable__Alternatives ) )
            // InternalSensidl.g:553:1: ( rule__DataTypeNotAdjustable__Alternatives )
            {
             before(grammarAccess.getDataTypeNotAdjustableAccess().getAlternatives()); 
            // InternalSensidl.g:554:1: ( rule__DataTypeNotAdjustable__Alternatives )
            // InternalSensidl.g:554:2: rule__DataTypeNotAdjustable__Alternatives
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
    // InternalSensidl.g:566:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:570:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSensidl.g:571:1: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSensidl.g:571:1: ( ( rule__DataType__Alternatives ) )
            // InternalSensidl.g:572:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSensidl.g:573:1: ( rule__DataType__Alternatives )
            // InternalSensidl.g:573:2: rule__DataType__Alternatives
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
    // InternalSensidl.g:584:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:588:1: ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalSensidl.g:589:1: ( ruleMeasurementData )
                    {
                    // InternalSensidl.g:589:1: ( ruleMeasurementData )
                    // InternalSensidl.g:590:1: ruleMeasurementData
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
                    // InternalSensidl.g:595:6: ( ruleNonMeasurementData )
                    {
                    // InternalSensidl.g:595:6: ( ruleNonMeasurementData )
                    // InternalSensidl.g:596:1: ruleNonMeasurementData
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
                    // InternalSensidl.g:601:6: ( ruleMeasurementDataNotAdjustable )
                    {
                    // InternalSensidl.g:601:6: ( ruleMeasurementDataNotAdjustable )
                    // InternalSensidl.g:602:1: ruleMeasurementDataNotAdjustable
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


    // $ANTLR start "rule__NonMeasurementData__Alternatives_2"
    // InternalSensidl.g:612:1: rule__NonMeasurementData__Alternatives_2 : ( ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) ) | ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) ) );
    public final void rule__NonMeasurementData__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:616:1: ( ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) ) | ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=18 && LA2_0<=27)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=16 && LA2_0<=17)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSensidl.g:617:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) )
                    {
                    // InternalSensidl.g:617:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) )
                    // InternalSensidl.g:618:1: ( rule__NonMeasurementData__DataTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_0()); 
                    // InternalSensidl.g:619:1: ( rule__NonMeasurementData__DataTypeAssignment_2_0 )
                    // InternalSensidl.g:619:2: rule__NonMeasurementData__DataTypeAssignment_2_0
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
                    // InternalSensidl.g:623:6: ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) )
                    {
                    // InternalSensidl.g:623:6: ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) )
                    // InternalSensidl.g:624:1: ( rule__NonMeasurementData__DataTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_1()); 
                    // InternalSensidl.g:625:1: ( rule__NonMeasurementData__DataTypeAssignment_2_1 )
                    // InternalSensidl.g:625:2: rule__NonMeasurementData__DataTypeAssignment_2_1
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


    // $ANTLR start "rule__DataAdjustment__Alternatives"
    // InternalSensidl.g:634:1: rule__DataAdjustment__Alternatives : ( ( ruleDataRange ) | ( ruleDataConversion ) );
    public final void rule__DataAdjustment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:638:1: ( ( ruleDataRange ) | ( ruleDataConversion ) )
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
                    // InternalSensidl.g:639:1: ( ruleDataRange )
                    {
                    // InternalSensidl.g:639:1: ( ruleDataRange )
                    // InternalSensidl.g:640:1: ruleDataRange
                    {
                     before(grammarAccess.getDataAdjustmentAccess().getDataRangeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataRange();

                    state._fsp--;

                     after(grammarAccess.getDataAdjustmentAccess().getDataRangeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:645:6: ( ruleDataConversion )
                    {
                    // InternalSensidl.g:645:6: ( ruleDataConversion )
                    // InternalSensidl.g:646:1: ruleDataConversion
                    {
                     before(grammarAccess.getDataAdjustmentAccess().getDataConversionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:656:1: rule__DataConversion__Alternatives : ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) );
    public final void rule__DataConversion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:660:1: ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) )
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
                    // InternalSensidl.g:661:1: ( ruleLinearDataConversion )
                    {
                    // InternalSensidl.g:661:1: ( ruleLinearDataConversion )
                    // InternalSensidl.g:662:1: ruleLinearDataConversion
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
                    // InternalSensidl.g:667:6: ( ruleLinearDataConversionWithInterval )
                    {
                    // InternalSensidl.g:667:6: ( ruleLinearDataConversionWithInterval )
                    // InternalSensidl.g:668:1: ruleLinearDataConversionWithInterval
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
    // InternalSensidl.g:678:1: rule__Coding__Alternatives : ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) );
    public final void rule__Coding__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:682:1: ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) )
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
                    // InternalSensidl.g:683:1: ( ( 'SENSIDL_BINARY' ) )
                    {
                    // InternalSensidl.g:683:1: ( ( 'SENSIDL_BINARY' ) )
                    // InternalSensidl.g:684:1: ( 'SENSIDL_BINARY' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:685:1: ( 'SENSIDL_BINARY' )
                    // InternalSensidl.g:685:3: 'SENSIDL_BINARY'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:690:6: ( ( 'SENSIDL_JSON' ) )
                    {
                    // InternalSensidl.g:690:6: ( ( 'SENSIDL_JSON' ) )
                    // InternalSensidl.g:691:1: ( 'SENSIDL_JSON' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_JSONEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:692:1: ( 'SENSIDL_JSON' )
                    // InternalSensidl.g:692:3: 'SENSIDL_JSON'
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
    // InternalSensidl.g:702:1: rule__Endianness__Alternatives : ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) );
    public final void rule__Endianness__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:706:1: ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) )
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
                    // InternalSensidl.g:707:1: ( ( 'BIG_ENDIAN' ) )
                    {
                    // InternalSensidl.g:707:1: ( ( 'BIG_ENDIAN' ) )
                    // InternalSensidl.g:708:1: ( 'BIG_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:709:1: ( 'BIG_ENDIAN' )
                    // InternalSensidl.g:709:3: 'BIG_ENDIAN'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:714:6: ( ( 'LITTLE_ENDIAN' ) )
                    {
                    // InternalSensidl.g:714:6: ( ( 'LITTLE_ENDIAN' ) )
                    // InternalSensidl.g:715:1: ( 'LITTLE_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:716:1: ( 'LITTLE_ENDIAN' )
                    // InternalSensidl.g:716:3: 'LITTLE_ENDIAN'
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
    // InternalSensidl.g:726:1: rule__DataTypeNotAdjustable__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) );
    public final void rule__DataTypeNotAdjustable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:730:1: ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSensidl.g:731:1: ( ( 'STRING' ) )
                    {
                    // InternalSensidl.g:731:1: ( ( 'STRING' ) )
                    // InternalSensidl.g:732:1: ( 'STRING' )
                    {
                     before(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:733:1: ( 'STRING' )
                    // InternalSensidl.g:733:3: 'STRING'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:738:6: ( ( 'BOOLEAN' ) )
                    {
                    // InternalSensidl.g:738:6: ( ( 'BOOLEAN' ) )
                    // InternalSensidl.g:739:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getDataTypeNotAdjustableAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:740:1: ( 'BOOLEAN' )
                    // InternalSensidl.g:740:3: 'BOOLEAN'
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
    // InternalSensidl.g:750:1: rule__DataType__Alternatives : ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:754:1: ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) )
            int alt8=10;
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
            case 22:
                {
                alt8=5;
                }
                break;
            case 23:
                {
                alt8=6;
                }
                break;
            case 24:
                {
                alt8=7;
                }
                break;
            case 25:
                {
                alt8=8;
                }
                break;
            case 26:
                {
                alt8=9;
                }
                break;
            case 27:
                {
                alt8=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSensidl.g:755:1: ( ( 'INT8' ) )
                    {
                    // InternalSensidl.g:755:1: ( ( 'INT8' ) )
                    // InternalSensidl.g:756:1: ( 'INT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:757:1: ( 'INT8' )
                    // InternalSensidl.g:757:3: 'INT8'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:762:6: ( ( 'UINT8' ) )
                    {
                    // InternalSensidl.g:762:6: ( ( 'UINT8' ) )
                    // InternalSensidl.g:763:1: ( 'UINT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:764:1: ( 'UINT8' )
                    // InternalSensidl.g:764:3: 'UINT8'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:769:6: ( ( 'INT16' ) )
                    {
                    // InternalSensidl.g:769:6: ( ( 'INT16' ) )
                    // InternalSensidl.g:770:1: ( 'INT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 
                    // InternalSensidl.g:771:1: ( 'INT16' )
                    // InternalSensidl.g:771:3: 'INT16'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSensidl.g:776:6: ( ( 'UINT16' ) )
                    {
                    // InternalSensidl.g:776:6: ( ( 'UINT16' ) )
                    // InternalSensidl.g:777:1: ( 'UINT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 
                    // InternalSensidl.g:778:1: ( 'UINT16' )
                    // InternalSensidl.g:778:3: 'UINT16'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSensidl.g:783:6: ( ( 'INT32' ) )
                    {
                    // InternalSensidl.g:783:6: ( ( 'INT32' ) )
                    // InternalSensidl.g:784:1: ( 'INT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 
                    // InternalSensidl.g:785:1: ( 'INT32' )
                    // InternalSensidl.g:785:3: 'INT32'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSensidl.g:790:6: ( ( 'UINT32' ) )
                    {
                    // InternalSensidl.g:790:6: ( ( 'UINT32' ) )
                    // InternalSensidl.g:791:1: ( 'UINT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 
                    // InternalSensidl.g:792:1: ( 'UINT32' )
                    // InternalSensidl.g:792:3: 'UINT32'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSensidl.g:797:6: ( ( 'INT64' ) )
                    {
                    // InternalSensidl.g:797:6: ( ( 'INT64' ) )
                    // InternalSensidl.g:798:1: ( 'INT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 
                    // InternalSensidl.g:799:1: ( 'INT64' )
                    // InternalSensidl.g:799:3: 'INT64'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSensidl.g:804:6: ( ( 'UINT64' ) )
                    {
                    // InternalSensidl.g:804:6: ( ( 'UINT64' ) )
                    // InternalSensidl.g:805:1: ( 'UINT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 
                    // InternalSensidl.g:806:1: ( 'UINT64' )
                    // InternalSensidl.g:806:3: 'UINT64'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSensidl.g:811:6: ( ( 'FLOAT' ) )
                    {
                    // InternalSensidl.g:811:6: ( ( 'FLOAT' ) )
                    // InternalSensidl.g:812:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // InternalSensidl.g:813:1: ( 'FLOAT' )
                    // InternalSensidl.g:813:3: 'FLOAT'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSensidl.g:818:6: ( ( 'DOUBLE' ) )
                    {
                    // InternalSensidl.g:818:6: ( ( 'DOUBLE' ) )
                    // InternalSensidl.g:819:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 
                    // InternalSensidl.g:820:1: ( 'DOUBLE' )
                    // InternalSensidl.g:820:3: 'DOUBLE'
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
    // InternalSensidl.g:832:1: rule__SensorInterface__Group__0 : rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 ;
    public final void rule__SensorInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:836:1: ( rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 )
            // InternalSensidl.g:837:2: rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1
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
    // InternalSensidl.g:844:1: rule__SensorInterface__Group__0__Impl : ( 'sensorInterface' ) ;
    public final void rule__SensorInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:848:1: ( ( 'sensorInterface' ) )
            // InternalSensidl.g:849:1: ( 'sensorInterface' )
            {
            // InternalSensidl.g:849:1: ( 'sensorInterface' )
            // InternalSensidl.g:850:1: 'sensorInterface'
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
    // InternalSensidl.g:863:1: rule__SensorInterface__Group__1 : rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 ;
    public final void rule__SensorInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:867:1: ( rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 )
            // InternalSensidl.g:868:2: rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2
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
    // InternalSensidl.g:875:1: rule__SensorInterface__Group__1__Impl : ( ( rule__SensorInterface__NameAssignment_1 ) ) ;
    public final void rule__SensorInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:879:1: ( ( ( rule__SensorInterface__NameAssignment_1 ) ) )
            // InternalSensidl.g:880:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            {
            // InternalSensidl.g:880:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            // InternalSensidl.g:881:1: ( rule__SensorInterface__NameAssignment_1 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameAssignment_1()); 
            // InternalSensidl.g:882:1: ( rule__SensorInterface__NameAssignment_1 )
            // InternalSensidl.g:882:2: rule__SensorInterface__NameAssignment_1
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
    // InternalSensidl.g:892:1: rule__SensorInterface__Group__2 : rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 ;
    public final void rule__SensorInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:896:1: ( rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 )
            // InternalSensidl.g:897:2: rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3
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
    // InternalSensidl.g:904:1: rule__SensorInterface__Group__2__Impl : ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) ;
    public final void rule__SensorInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:908:1: ( ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) )
            // InternalSensidl.g:909:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            {
            // InternalSensidl.g:909:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            // InternalSensidl.g:910:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionAssignment_2()); 
            // InternalSensidl.g:911:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DESCRIPTION) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSensidl.g:911:2: rule__SensorInterface__DescriptionAssignment_2
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
    // InternalSensidl.g:921:1: rule__SensorInterface__Group__3 : rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 ;
    public final void rule__SensorInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:925:1: ( rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 )
            // InternalSensidl.g:926:2: rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4
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
    // InternalSensidl.g:933:1: rule__SensorInterface__Group__3__Impl : ( ( rule__SensorInterface__Group_3__0 )? ) ;
    public final void rule__SensorInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:937:1: ( ( ( rule__SensorInterface__Group_3__0 )? ) )
            // InternalSensidl.g:938:1: ( ( rule__SensorInterface__Group_3__0 )? )
            {
            // InternalSensidl.g:938:1: ( ( rule__SensorInterface__Group_3__0 )? )
            // InternalSensidl.g:939:1: ( rule__SensorInterface__Group_3__0 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup_3()); 
            // InternalSensidl.g:940:1: ( rule__SensorInterface__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSensidl.g:940:2: rule__SensorInterface__Group_3__0
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
    // InternalSensidl.g:950:1: rule__SensorInterface__Group__4 : rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 ;
    public final void rule__SensorInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:954:1: ( rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 )
            // InternalSensidl.g:955:2: rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5
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
    // InternalSensidl.g:962:1: rule__SensorInterface__Group__4__Impl : ( '{' ) ;
    public final void rule__SensorInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:966:1: ( ( '{' ) )
            // InternalSensidl.g:967:1: ( '{' )
            {
            // InternalSensidl.g:967:1: ( '{' )
            // InternalSensidl.g:968:1: '{'
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
    // InternalSensidl.g:981:1: rule__SensorInterface__Group__5 : rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 ;
    public final void rule__SensorInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:985:1: ( rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 )
            // InternalSensidl.g:986:2: rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6
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
    // InternalSensidl.g:993:1: rule__SensorInterface__Group__5__Impl : ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) ;
    public final void rule__SensorInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:997:1: ( ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) )
            // InternalSensidl.g:998:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            {
            // InternalSensidl.g:998:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            // InternalSensidl.g:999:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsAssignment_5()); 
            // InternalSensidl.g:1000:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            // InternalSensidl.g:1000:2: rule__SensorInterface__EncodingSettingsAssignment_5
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
    // InternalSensidl.g:1010:1: rule__SensorInterface__Group__6 : rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 ;
    public final void rule__SensorInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1014:1: ( rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 )
            // InternalSensidl.g:1015:2: rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7
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
    // InternalSensidl.g:1022:1: rule__SensorInterface__Group__6__Impl : ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) ;
    public final void rule__SensorInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1026:1: ( ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) )
            // InternalSensidl.g:1027:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            {
            // InternalSensidl.g:1027:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            // InternalSensidl.g:1028:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionAssignment_6()); 
            // InternalSensidl.g:1029:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            // InternalSensidl.g:1029:2: rule__SensorInterface__DataDescriptionAssignment_6
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
    // InternalSensidl.g:1039:1: rule__SensorInterface__Group__7 : rule__SensorInterface__Group__7__Impl ;
    public final void rule__SensorInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1043:1: ( rule__SensorInterface__Group__7__Impl )
            // InternalSensidl.g:1044:2: rule__SensorInterface__Group__7__Impl
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
    // InternalSensidl.g:1050:1: rule__SensorInterface__Group__7__Impl : ( '}' ) ;
    public final void rule__SensorInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1054:1: ( ( '}' ) )
            // InternalSensidl.g:1055:1: ( '}' )
            {
            // InternalSensidl.g:1055:1: ( '}' )
            // InternalSensidl.g:1056:1: '}'
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
    // InternalSensidl.g:1085:1: rule__SensorInterface__Group_3__0 : rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 ;
    public final void rule__SensorInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1089:1: ( rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 )
            // InternalSensidl.g:1090:2: rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1
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
    // InternalSensidl.g:1097:1: rule__SensorInterface__Group_3__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1101:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1102:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1102:1: ( 'with identifier' )
            // InternalSensidl.g:1103:1: 'with identifier'
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
    // InternalSensidl.g:1116:1: rule__SensorInterface__Group_3__1 : rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 ;
    public final void rule__SensorInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1120:1: ( rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 )
            // InternalSensidl.g:1121:2: rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2
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
    // InternalSensidl.g:1128:1: rule__SensorInterface__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SensorInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1132:1: ( ( ':' ) )
            // InternalSensidl.g:1133:1: ( ':' )
            {
            // InternalSensidl.g:1133:1: ( ':' )
            // InternalSensidl.g:1134:1: ':'
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
    // InternalSensidl.g:1147:1: rule__SensorInterface__Group_3__2 : rule__SensorInterface__Group_3__2__Impl ;
    public final void rule__SensorInterface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1151:1: ( rule__SensorInterface__Group_3__2__Impl )
            // InternalSensidl.g:1152:2: rule__SensorInterface__Group_3__2__Impl
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
    // InternalSensidl.g:1158:1: rule__SensorInterface__Group_3__2__Impl : ( ( rule__SensorInterface__IDAssignment_3_2 ) ) ;
    public final void rule__SensorInterface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1162:1: ( ( ( rule__SensorInterface__IDAssignment_3_2 ) ) )
            // InternalSensidl.g:1163:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            {
            // InternalSensidl.g:1163:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            // InternalSensidl.g:1164:1: ( rule__SensorInterface__IDAssignment_3_2 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDAssignment_3_2()); 
            // InternalSensidl.g:1165:1: ( rule__SensorInterface__IDAssignment_3_2 )
            // InternalSensidl.g:1165:2: rule__SensorInterface__IDAssignment_3_2
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
    // InternalSensidl.g:1181:1: rule__EncodingSettings__Group__0 : rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 ;
    public final void rule__EncodingSettings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1185:1: ( rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 )
            // InternalSensidl.g:1186:2: rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1
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
    // InternalSensidl.g:1193:1: rule__EncodingSettings__Group__0__Impl : ( 'encoding' ) ;
    public final void rule__EncodingSettings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1197:1: ( ( 'encoding' ) )
            // InternalSensidl.g:1198:1: ( 'encoding' )
            {
            // InternalSensidl.g:1198:1: ( 'encoding' )
            // InternalSensidl.g:1199:1: 'encoding'
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
    // InternalSensidl.g:1212:1: rule__EncodingSettings__Group__1 : rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 ;
    public final void rule__EncodingSettings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1216:1: ( rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 )
            // InternalSensidl.g:1217:2: rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2
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
    // InternalSensidl.g:1224:1: rule__EncodingSettings__Group__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1228:1: ( ( ':' ) )
            // InternalSensidl.g:1229:1: ( ':' )
            {
            // InternalSensidl.g:1229:1: ( ':' )
            // InternalSensidl.g:1230:1: ':'
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
    // InternalSensidl.g:1243:1: rule__EncodingSettings__Group__2 : rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 ;
    public final void rule__EncodingSettings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1247:1: ( rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 )
            // InternalSensidl.g:1248:2: rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3
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
    // InternalSensidl.g:1255:1: rule__EncodingSettings__Group__2__Impl : ( ( rule__EncodingSettings__CodingAssignment_2 ) ) ;
    public final void rule__EncodingSettings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1259:1: ( ( ( rule__EncodingSettings__CodingAssignment_2 ) ) )
            // InternalSensidl.g:1260:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            {
            // InternalSensidl.g:1260:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            // InternalSensidl.g:1261:1: ( rule__EncodingSettings__CodingAssignment_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getCodingAssignment_2()); 
            // InternalSensidl.g:1262:1: ( rule__EncodingSettings__CodingAssignment_2 )
            // InternalSensidl.g:1262:2: rule__EncodingSettings__CodingAssignment_2
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
    // InternalSensidl.g:1272:1: rule__EncodingSettings__Group__3 : rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 ;
    public final void rule__EncodingSettings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1276:1: ( rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 )
            // InternalSensidl.g:1277:2: rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4
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
    // InternalSensidl.g:1284:1: rule__EncodingSettings__Group__3__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1288:1: ( ( ',' ) )
            // InternalSensidl.g:1289:1: ( ',' )
            {
            // InternalSensidl.g:1289:1: ( ',' )
            // InternalSensidl.g:1290:1: ','
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
    // InternalSensidl.g:1303:1: rule__EncodingSettings__Group__4 : rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 ;
    public final void rule__EncodingSettings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1307:1: ( rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 )
            // InternalSensidl.g:1308:2: rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5
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
    // InternalSensidl.g:1315:1: rule__EncodingSettings__Group__4__Impl : ( 'endianness' ) ;
    public final void rule__EncodingSettings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1319:1: ( ( 'endianness' ) )
            // InternalSensidl.g:1320:1: ( 'endianness' )
            {
            // InternalSensidl.g:1320:1: ( 'endianness' )
            // InternalSensidl.g:1321:1: 'endianness'
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
    // InternalSensidl.g:1334:1: rule__EncodingSettings__Group__5 : rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 ;
    public final void rule__EncodingSettings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1338:1: ( rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 )
            // InternalSensidl.g:1339:2: rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6
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
    // InternalSensidl.g:1346:1: rule__EncodingSettings__Group__5__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1350:1: ( ( ':' ) )
            // InternalSensidl.g:1351:1: ( ':' )
            {
            // InternalSensidl.g:1351:1: ( ':' )
            // InternalSensidl.g:1352:1: ':'
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
    // InternalSensidl.g:1365:1: rule__EncodingSettings__Group__6 : rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 ;
    public final void rule__EncodingSettings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1369:1: ( rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 )
            // InternalSensidl.g:1370:2: rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7
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
    // InternalSensidl.g:1377:1: rule__EncodingSettings__Group__6__Impl : ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) ;
    public final void rule__EncodingSettings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1381:1: ( ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) )
            // InternalSensidl.g:1382:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            {
            // InternalSensidl.g:1382:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            // InternalSensidl.g:1383:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessAssignment_6()); 
            // InternalSensidl.g:1384:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            // InternalSensidl.g:1384:2: rule__EncodingSettings__EndiannessAssignment_6
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
    // InternalSensidl.g:1394:1: rule__EncodingSettings__Group__7 : rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 ;
    public final void rule__EncodingSettings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1398:1: ( rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 )
            // InternalSensidl.g:1399:2: rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8
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
    // InternalSensidl.g:1406:1: rule__EncodingSettings__Group__7__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1410:1: ( ( ',' ) )
            // InternalSensidl.g:1411:1: ( ',' )
            {
            // InternalSensidl.g:1411:1: ( ',' )
            // InternalSensidl.g:1412:1: ','
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
    // InternalSensidl.g:1425:1: rule__EncodingSettings__Group__8 : rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 ;
    public final void rule__EncodingSettings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1429:1: ( rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 )
            // InternalSensidl.g:1430:2: rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9
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
    // InternalSensidl.g:1437:1: rule__EncodingSettings__Group__8__Impl : ( 'alignment' ) ;
    public final void rule__EncodingSettings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1441:1: ( ( 'alignment' ) )
            // InternalSensidl.g:1442:1: ( 'alignment' )
            {
            // InternalSensidl.g:1442:1: ( 'alignment' )
            // InternalSensidl.g:1443:1: 'alignment'
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
    // InternalSensidl.g:1456:1: rule__EncodingSettings__Group__9 : rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 ;
    public final void rule__EncodingSettings__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1460:1: ( rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 )
            // InternalSensidl.g:1461:2: rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10
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
    // InternalSensidl.g:1468:1: rule__EncodingSettings__Group__9__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1472:1: ( ( ':' ) )
            // InternalSensidl.g:1473:1: ( ':' )
            {
            // InternalSensidl.g:1473:1: ( ':' )
            // InternalSensidl.g:1474:1: ':'
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
    // InternalSensidl.g:1487:1: rule__EncodingSettings__Group__10 : rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 ;
    public final void rule__EncodingSettings__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1491:1: ( rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 )
            // InternalSensidl.g:1492:2: rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11
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
    // InternalSensidl.g:1499:1: rule__EncodingSettings__Group__10__Impl : ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) ;
    public final void rule__EncodingSettings__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1503:1: ( ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) )
            // InternalSensidl.g:1504:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            {
            // InternalSensidl.g:1504:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            // InternalSensidl.g:1505:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentAssignment_10()); 
            // InternalSensidl.g:1506:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            // InternalSensidl.g:1506:2: rule__EncodingSettings__AlignmentAssignment_10
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
    // InternalSensidl.g:1516:1: rule__EncodingSettings__Group__11 : rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 ;
    public final void rule__EncodingSettings__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1520:1: ( rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 )
            // InternalSensidl.g:1521:2: rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12
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
    // InternalSensidl.g:1528:1: rule__EncodingSettings__Group__11__Impl : ( 'BIT' ) ;
    public final void rule__EncodingSettings__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1532:1: ( ( 'BIT' ) )
            // InternalSensidl.g:1533:1: ( 'BIT' )
            {
            // InternalSensidl.g:1533:1: ( 'BIT' )
            // InternalSensidl.g:1534:1: 'BIT'
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
    // InternalSensidl.g:1547:1: rule__EncodingSettings__Group__12 : rule__EncodingSettings__Group__12__Impl ;
    public final void rule__EncodingSettings__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1551:1: ( rule__EncodingSettings__Group__12__Impl )
            // InternalSensidl.g:1552:2: rule__EncodingSettings__Group__12__Impl
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
    // InternalSensidl.g:1558:1: rule__EncodingSettings__Group__12__Impl : ( ( rule__EncodingSettings__Group_12__0 )? ) ;
    public final void rule__EncodingSettings__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1562:1: ( ( ( rule__EncodingSettings__Group_12__0 )? ) )
            // InternalSensidl.g:1563:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            {
            // InternalSensidl.g:1563:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            // InternalSensidl.g:1564:1: ( rule__EncodingSettings__Group_12__0 )?
            {
             before(grammarAccess.getEncodingSettingsAccess().getGroup_12()); 
            // InternalSensidl.g:1565:1: ( rule__EncodingSettings__Group_12__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSensidl.g:1565:2: rule__EncodingSettings__Group_12__0
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
    // InternalSensidl.g:1601:1: rule__EncodingSettings__Group_12__0 : rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 ;
    public final void rule__EncodingSettings__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1605:1: ( rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 )
            // InternalSensidl.g:1606:2: rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1
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
    // InternalSensidl.g:1613:1: rule__EncodingSettings__Group_12__0__Impl : ( 'with identifier' ) ;
    public final void rule__EncodingSettings__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1617:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1618:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1618:1: ( 'with identifier' )
            // InternalSensidl.g:1619:1: 'with identifier'
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
    // InternalSensidl.g:1632:1: rule__EncodingSettings__Group_12__1 : rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 ;
    public final void rule__EncodingSettings__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1636:1: ( rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 )
            // InternalSensidl.g:1637:2: rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2
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
    // InternalSensidl.g:1644:1: rule__EncodingSettings__Group_12__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1648:1: ( ( ':' ) )
            // InternalSensidl.g:1649:1: ( ':' )
            {
            // InternalSensidl.g:1649:1: ( ':' )
            // InternalSensidl.g:1650:1: ':'
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
    // InternalSensidl.g:1663:1: rule__EncodingSettings__Group_12__2 : rule__EncodingSettings__Group_12__2__Impl ;
    public final void rule__EncodingSettings__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1667:1: ( rule__EncodingSettings__Group_12__2__Impl )
            // InternalSensidl.g:1668:2: rule__EncodingSettings__Group_12__2__Impl
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
    // InternalSensidl.g:1674:1: rule__EncodingSettings__Group_12__2__Impl : ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) ;
    public final void rule__EncodingSettings__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1678:1: ( ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) )
            // InternalSensidl.g:1679:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            {
            // InternalSensidl.g:1679:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            // InternalSensidl.g:1680:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getIDAssignment_12_2()); 
            // InternalSensidl.g:1681:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            // InternalSensidl.g:1681:2: rule__EncodingSettings__IDAssignment_12_2
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
    // InternalSensidl.g:1697:1: rule__SensorDataDescription__Group__0 : rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 ;
    public final void rule__SensorDataDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1701:1: ( rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 )
            // InternalSensidl.g:1702:2: rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1
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
    // InternalSensidl.g:1709:1: rule__SensorDataDescription__Group__0__Impl : ( 'sensorData' ) ;
    public final void rule__SensorDataDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1713:1: ( ( 'sensorData' ) )
            // InternalSensidl.g:1714:1: ( 'sensorData' )
            {
            // InternalSensidl.g:1714:1: ( 'sensorData' )
            // InternalSensidl.g:1715:1: 'sensorData'
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
    // InternalSensidl.g:1728:1: rule__SensorDataDescription__Group__1 : rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 ;
    public final void rule__SensorDataDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1732:1: ( rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 )
            // InternalSensidl.g:1733:2: rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2
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
    // InternalSensidl.g:1740:1: rule__SensorDataDescription__Group__1__Impl : ( () ) ;
    public final void rule__SensorDataDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1744:1: ( ( () ) )
            // InternalSensidl.g:1745:1: ( () )
            {
            // InternalSensidl.g:1745:1: ( () )
            // InternalSensidl.g:1746:1: ()
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1()); 
            // InternalSensidl.g:1747:1: ()
            // InternalSensidl.g:1749:1: 
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
    // InternalSensidl.g:1759:1: rule__SensorDataDescription__Group__2 : rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 ;
    public final void rule__SensorDataDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1763:1: ( rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 )
            // InternalSensidl.g:1764:2: rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3
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
    // InternalSensidl.g:1771:1: rule__SensorDataDescription__Group__2__Impl : ( ( rule__SensorDataDescription__Group_2__0 )? ) ;
    public final void rule__SensorDataDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1775:1: ( ( ( rule__SensorDataDescription__Group_2__0 )? ) )
            // InternalSensidl.g:1776:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            {
            // InternalSensidl.g:1776:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            // InternalSensidl.g:1777:1: ( rule__SensorDataDescription__Group_2__0 )?
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup_2()); 
            // InternalSensidl.g:1778:1: ( rule__SensorDataDescription__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSensidl.g:1778:2: rule__SensorDataDescription__Group_2__0
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
    // InternalSensidl.g:1788:1: rule__SensorDataDescription__Group__3 : rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 ;
    public final void rule__SensorDataDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1792:1: ( rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 )
            // InternalSensidl.g:1793:2: rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4
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
    // InternalSensidl.g:1800:1: rule__SensorDataDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__SensorDataDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1804:1: ( ( '{' ) )
            // InternalSensidl.g:1805:1: ( '{' )
            {
            // InternalSensidl.g:1805:1: ( '{' )
            // InternalSensidl.g:1806:1: '{'
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
    // InternalSensidl.g:1819:1: rule__SensorDataDescription__Group__4 : rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 ;
    public final void rule__SensorDataDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1823:1: ( rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 )
            // InternalSensidl.g:1824:2: rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5
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
    // InternalSensidl.g:1831:1: rule__SensorDataDescription__Group__4__Impl : ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) ;
    public final void rule__SensorDataDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1835:1: ( ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) )
            // InternalSensidl.g:1836:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            {
            // InternalSensidl.g:1836:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            // InternalSensidl.g:1837:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsAssignment_4()); 
            // InternalSensidl.g:1838:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSensidl.g:1838:2: rule__SensorDataDescription__DataSetsAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SensorDataDescription__DataSetsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSensidl.g:1848:1: rule__SensorDataDescription__Group__5 : rule__SensorDataDescription__Group__5__Impl ;
    public final void rule__SensorDataDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1852:1: ( rule__SensorDataDescription__Group__5__Impl )
            // InternalSensidl.g:1853:2: rule__SensorDataDescription__Group__5__Impl
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
    // InternalSensidl.g:1859:1: rule__SensorDataDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__SensorDataDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1863:1: ( ( '}' ) )
            // InternalSensidl.g:1864:1: ( '}' )
            {
            // InternalSensidl.g:1864:1: ( '}' )
            // InternalSensidl.g:1865:1: '}'
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
    // InternalSensidl.g:1890:1: rule__SensorDataDescription__Group_2__0 : rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 ;
    public final void rule__SensorDataDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1894:1: ( rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 )
            // InternalSensidl.g:1895:2: rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1
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
    // InternalSensidl.g:1902:1: rule__SensorDataDescription__Group_2__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorDataDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1906:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1907:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1907:1: ( 'with identifier' )
            // InternalSensidl.g:1908:1: 'with identifier'
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
    // InternalSensidl.g:1921:1: rule__SensorDataDescription__Group_2__1 : rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 ;
    public final void rule__SensorDataDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1925:1: ( rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 )
            // InternalSensidl.g:1926:2: rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2
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
    // InternalSensidl.g:1933:1: rule__SensorDataDescription__Group_2__1__Impl : ( ':' ) ;
    public final void rule__SensorDataDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1937:1: ( ( ':' ) )
            // InternalSensidl.g:1938:1: ( ':' )
            {
            // InternalSensidl.g:1938:1: ( ':' )
            // InternalSensidl.g:1939:1: ':'
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
    // InternalSensidl.g:1952:1: rule__SensorDataDescription__Group_2__2 : rule__SensorDataDescription__Group_2__2__Impl ;
    public final void rule__SensorDataDescription__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1956:1: ( rule__SensorDataDescription__Group_2__2__Impl )
            // InternalSensidl.g:1957:2: rule__SensorDataDescription__Group_2__2__Impl
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
    // InternalSensidl.g:1963:1: rule__SensorDataDescription__Group_2__2__Impl : ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) ;
    public final void rule__SensorDataDescription__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1967:1: ( ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) )
            // InternalSensidl.g:1968:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            {
            // InternalSensidl.g:1968:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            // InternalSensidl.g:1969:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDAssignment_2_2()); 
            // InternalSensidl.g:1970:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            // InternalSensidl.g:1970:2: rule__SensorDataDescription__IDAssignment_2_2
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
    // InternalSensidl.g:1986:1: rule__DataSet__Group__0 : rule__DataSet__Group__0__Impl rule__DataSet__Group__1 ;
    public final void rule__DataSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1990:1: ( rule__DataSet__Group__0__Impl rule__DataSet__Group__1 )
            // InternalSensidl.g:1991:2: rule__DataSet__Group__0__Impl rule__DataSet__Group__1
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
    // InternalSensidl.g:1998:1: rule__DataSet__Group__0__Impl : ( 'dataSet' ) ;
    public final void rule__DataSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2002:1: ( ( 'dataSet' ) )
            // InternalSensidl.g:2003:1: ( 'dataSet' )
            {
            // InternalSensidl.g:2003:1: ( 'dataSet' )
            // InternalSensidl.g:2004:1: 'dataSet'
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
    // InternalSensidl.g:2017:1: rule__DataSet__Group__1 : rule__DataSet__Group__1__Impl rule__DataSet__Group__2 ;
    public final void rule__DataSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2021:1: ( rule__DataSet__Group__1__Impl rule__DataSet__Group__2 )
            // InternalSensidl.g:2022:2: rule__DataSet__Group__1__Impl rule__DataSet__Group__2
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
    // InternalSensidl.g:2029:1: rule__DataSet__Group__1__Impl : ( ( rule__DataSet__NameAssignment_1 ) ) ;
    public final void rule__DataSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2033:1: ( ( ( rule__DataSet__NameAssignment_1 ) ) )
            // InternalSensidl.g:2034:1: ( ( rule__DataSet__NameAssignment_1 ) )
            {
            // InternalSensidl.g:2034:1: ( ( rule__DataSet__NameAssignment_1 ) )
            // InternalSensidl.g:2035:1: ( rule__DataSet__NameAssignment_1 )
            {
             before(grammarAccess.getDataSetAccess().getNameAssignment_1()); 
            // InternalSensidl.g:2036:1: ( rule__DataSet__NameAssignment_1 )
            // InternalSensidl.g:2036:2: rule__DataSet__NameAssignment_1
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
    // InternalSensidl.g:2046:1: rule__DataSet__Group__2 : rule__DataSet__Group__2__Impl rule__DataSet__Group__3 ;
    public final void rule__DataSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2050:1: ( rule__DataSet__Group__2__Impl rule__DataSet__Group__3 )
            // InternalSensidl.g:2051:2: rule__DataSet__Group__2__Impl rule__DataSet__Group__3
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
    // InternalSensidl.g:2058:1: rule__DataSet__Group__2__Impl : ( ( rule__DataSet__Group_2__0 )? ) ;
    public final void rule__DataSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2062:1: ( ( ( rule__DataSet__Group_2__0 )? ) )
            // InternalSensidl.g:2063:1: ( ( rule__DataSet__Group_2__0 )? )
            {
            // InternalSensidl.g:2063:1: ( ( rule__DataSet__Group_2__0 )? )
            // InternalSensidl.g:2064:1: ( rule__DataSet__Group_2__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_2()); 
            // InternalSensidl.g:2065:1: ( rule__DataSet__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSensidl.g:2065:2: rule__DataSet__Group_2__0
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
    // InternalSensidl.g:2075:1: rule__DataSet__Group__3 : rule__DataSet__Group__3__Impl rule__DataSet__Group__4 ;
    public final void rule__DataSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2079:1: ( rule__DataSet__Group__3__Impl rule__DataSet__Group__4 )
            // InternalSensidl.g:2080:2: rule__DataSet__Group__3__Impl rule__DataSet__Group__4
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
    // InternalSensidl.g:2087:1: rule__DataSet__Group__3__Impl : ( ( rule__DataSet__Group_3__0 )? ) ;
    public final void rule__DataSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2091:1: ( ( ( rule__DataSet__Group_3__0 )? ) )
            // InternalSensidl.g:2092:1: ( ( rule__DataSet__Group_3__0 )? )
            {
            // InternalSensidl.g:2092:1: ( ( rule__DataSet__Group_3__0 )? )
            // InternalSensidl.g:2093:1: ( rule__DataSet__Group_3__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_3()); 
            // InternalSensidl.g:2094:1: ( rule__DataSet__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSensidl.g:2094:2: rule__DataSet__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2104:1: rule__DataSet__Group__4 : rule__DataSet__Group__4__Impl rule__DataSet__Group__5 ;
    public final void rule__DataSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2108:1: ( rule__DataSet__Group__4__Impl rule__DataSet__Group__5 )
            // InternalSensidl.g:2109:2: rule__DataSet__Group__4__Impl rule__DataSet__Group__5
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
    // InternalSensidl.g:2116:1: rule__DataSet__Group__4__Impl : ( ( rule__DataSet__DescriptionAssignment_4 )? ) ;
    public final void rule__DataSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2120:1: ( ( ( rule__DataSet__DescriptionAssignment_4 )? ) )
            // InternalSensidl.g:2121:1: ( ( rule__DataSet__DescriptionAssignment_4 )? )
            {
            // InternalSensidl.g:2121:1: ( ( rule__DataSet__DescriptionAssignment_4 )? )
            // InternalSensidl.g:2122:1: ( rule__DataSet__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getDataSetAccess().getDescriptionAssignment_4()); 
            // InternalSensidl.g:2123:1: ( rule__DataSet__DescriptionAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DESCRIPTION) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSensidl.g:2123:2: rule__DataSet__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2133:1: rule__DataSet__Group__5 : rule__DataSet__Group__5__Impl rule__DataSet__Group__6 ;
    public final void rule__DataSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2137:1: ( rule__DataSet__Group__5__Impl rule__DataSet__Group__6 )
            // InternalSensidl.g:2138:2: rule__DataSet__Group__5__Impl rule__DataSet__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalSensidl.g:2145:1: rule__DataSet__Group__5__Impl : ( '{' ) ;
    public final void rule__DataSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2149:1: ( ( '{' ) )
            // InternalSensidl.g:2150:1: ( '{' )
            {
            // InternalSensidl.g:2150:1: ( '{' )
            // InternalSensidl.g:2151:1: '{'
            {
             before(grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSensidl.g:2164:1: rule__DataSet__Group__6 : rule__DataSet__Group__6__Impl rule__DataSet__Group__7 ;
    public final void rule__DataSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2168:1: ( rule__DataSet__Group__6__Impl rule__DataSet__Group__7 )
            // InternalSensidl.g:2169:2: rule__DataSet__Group__6__Impl rule__DataSet__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalSensidl.g:2176:1: rule__DataSet__Group__6__Impl : ( ( rule__DataSet__DataAssignment_6 )* ) ;
    public final void rule__DataSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2180:1: ( ( ( rule__DataSet__DataAssignment_6 )* ) )
            // InternalSensidl.g:2181:1: ( ( rule__DataSet__DataAssignment_6 )* )
            {
            // InternalSensidl.g:2181:1: ( ( rule__DataSet__DataAssignment_6 )* )
            // InternalSensidl.g:2182:1: ( rule__DataSet__DataAssignment_6 )*
            {
             before(grammarAccess.getDataSetAccess().getDataAssignment_6()); 
            // InternalSensidl.g:2183:1: ( rule__DataSet__DataAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSensidl.g:2183:2: rule__DataSet__DataAssignment_6
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__DataSet__DataAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalSensidl.g:2193:1: rule__DataSet__Group__7 : rule__DataSet__Group__7__Impl ;
    public final void rule__DataSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2197:1: ( rule__DataSet__Group__7__Impl )
            // InternalSensidl.g:2198:2: rule__DataSet__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2204:1: rule__DataSet__Group__7__Impl : ( '}' ) ;
    public final void rule__DataSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2208:1: ( ( '}' ) )
            // InternalSensidl.g:2209:1: ( '}' )
            {
            // InternalSensidl.g:2209:1: ( '}' )
            // InternalSensidl.g:2210:1: '}'
            {
             before(grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSensidl.g:2239:1: rule__DataSet__Group_2__0 : rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 ;
    public final void rule__DataSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2243:1: ( rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 )
            // InternalSensidl.g:2244:2: rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1
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
    // InternalSensidl.g:2251:1: rule__DataSet__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__DataSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2255:1: ( ( 'uses' ) )
            // InternalSensidl.g:2256:1: ( 'uses' )
            {
            // InternalSensidl.g:2256:1: ( 'uses' )
            // InternalSensidl.g:2257:1: 'uses'
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
    // InternalSensidl.g:2270:1: rule__DataSet__Group_2__1 : rule__DataSet__Group_2__1__Impl ;
    public final void rule__DataSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2274:1: ( rule__DataSet__Group_2__1__Impl )
            // InternalSensidl.g:2275:2: rule__DataSet__Group_2__1__Impl
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
    // InternalSensidl.g:2281:1: rule__DataSet__Group_2__1__Impl : ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) ) ;
    public final void rule__DataSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2285:1: ( ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) ) )
            // InternalSensidl.g:2286:1: ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) )
            {
            // InternalSensidl.g:2286:1: ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) )
            // InternalSensidl.g:2287:1: ( rule__DataSet__ParentDataSetAssignment_2_1 )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetAssignment_2_1()); 
            // InternalSensidl.g:2288:1: ( rule__DataSet__ParentDataSetAssignment_2_1 )
            // InternalSensidl.g:2288:2: rule__DataSet__ParentDataSetAssignment_2_1
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
    // InternalSensidl.g:2302:1: rule__DataSet__Group_3__0 : rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 ;
    public final void rule__DataSet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2306:1: ( rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 )
            // InternalSensidl.g:2307:2: rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSensidl.g:2314:1: rule__DataSet__Group_3__0__Impl : ( 'with identifier' ) ;
    public final void rule__DataSet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2318:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:2319:1: ( 'with identifier' )
            {
            // InternalSensidl.g:2319:1: ( 'with identifier' )
            // InternalSensidl.g:2320:1: 'with identifier'
            {
             before(grammarAccess.getDataSetAccess().getWithIdentifierKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSensidl.g:2333:1: rule__DataSet__Group_3__1 : rule__DataSet__Group_3__1__Impl rule__DataSet__Group_3__2 ;
    public final void rule__DataSet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2337:1: ( rule__DataSet__Group_3__1__Impl rule__DataSet__Group_3__2 )
            // InternalSensidl.g:2338:2: rule__DataSet__Group_3__1__Impl rule__DataSet__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__DataSet__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2345:1: rule__DataSet__Group_3__1__Impl : ( ':' ) ;
    public final void rule__DataSet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2349:1: ( ( ':' ) )
            // InternalSensidl.g:2350:1: ( ':' )
            {
            // InternalSensidl.g:2350:1: ( ':' )
            // InternalSensidl.g:2351:1: ':'
            {
             before(grammarAccess.getDataSetAccess().getColonKeyword_3_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSensidl.g:2364:1: rule__DataSet__Group_3__2 : rule__DataSet__Group_3__2__Impl ;
    public final void rule__DataSet__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2368:1: ( rule__DataSet__Group_3__2__Impl )
            // InternalSensidl.g:2369:2: rule__DataSet__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2375:1: rule__DataSet__Group_3__2__Impl : ( ( rule__DataSet__IDAssignment_3_2 ) ) ;
    public final void rule__DataSet__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2379:1: ( ( ( rule__DataSet__IDAssignment_3_2 ) ) )
            // InternalSensidl.g:2380:1: ( ( rule__DataSet__IDAssignment_3_2 ) )
            {
            // InternalSensidl.g:2380:1: ( ( rule__DataSet__IDAssignment_3_2 ) )
            // InternalSensidl.g:2381:1: ( rule__DataSet__IDAssignment_3_2 )
            {
             before(grammarAccess.getDataSetAccess().getIDAssignment_3_2()); 
            // InternalSensidl.g:2382:1: ( rule__DataSet__IDAssignment_3_2 )
            // InternalSensidl.g:2382:2: rule__DataSet__IDAssignment_3_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2398:1: rule__MeasurementData__Group__0 : rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 ;
    public final void rule__MeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2402:1: ( rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 )
            // InternalSensidl.g:2403:2: rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSensidl.g:2410:1: rule__MeasurementData__Group__0__Impl : ( ( rule__MeasurementData__NameAssignment_0 ) ) ;
    public final void rule__MeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2414:1: ( ( ( rule__MeasurementData__NameAssignment_0 ) ) )
            // InternalSensidl.g:2415:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:2415:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            // InternalSensidl.g:2416:1: ( rule__MeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:2417:1: ( rule__MeasurementData__NameAssignment_0 )
            // InternalSensidl.g:2417:2: rule__MeasurementData__NameAssignment_0
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
    // InternalSensidl.g:2427:1: rule__MeasurementData__Group__1 : rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 ;
    public final void rule__MeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2431:1: ( rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 )
            // InternalSensidl.g:2432:2: rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSensidl.g:2439:1: rule__MeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2443:1: ( ( 'as' ) )
            // InternalSensidl.g:2444:1: ( 'as' )
            {
            // InternalSensidl.g:2444:1: ( 'as' )
            // InternalSensidl.g:2445:1: 'as'
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
    // InternalSensidl.g:2458:1: rule__MeasurementData__Group__2 : rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 ;
    public final void rule__MeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2462:1: ( rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 )
            // InternalSensidl.g:2463:2: rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSensidl.g:2470:1: rule__MeasurementData__Group__2__Impl : ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2474:1: ( ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) )
            // InternalSensidl.g:2475:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            {
            // InternalSensidl.g:2475:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            // InternalSensidl.g:2476:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeAssignment_2()); 
            // InternalSensidl.g:2477:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            // InternalSensidl.g:2477:2: rule__MeasurementData__DataTypeAssignment_2
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
    // InternalSensidl.g:2487:1: rule__MeasurementData__Group__3 : rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 ;
    public final void rule__MeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2491:1: ( rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 )
            // InternalSensidl.g:2492:2: rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSensidl.g:2499:1: rule__MeasurementData__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2503:1: ( ( 'in' ) )
            // InternalSensidl.g:2504:1: ( 'in' )
            {
            // InternalSensidl.g:2504:1: ( 'in' )
            // InternalSensidl.g:2505:1: 'in'
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
    // InternalSensidl.g:2518:1: rule__MeasurementData__Group__4 : rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 ;
    public final void rule__MeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2522:1: ( rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 )
            // InternalSensidl.g:2523:2: rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalSensidl.g:2530:1: rule__MeasurementData__Group__4__Impl : ( ( rule__MeasurementData__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2534:1: ( ( ( rule__MeasurementData__UnitAssignment_4 ) ) )
            // InternalSensidl.g:2535:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            {
            // InternalSensidl.g:2535:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            // InternalSensidl.g:2536:1: ( rule__MeasurementData__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitAssignment_4()); 
            // InternalSensidl.g:2537:1: ( rule__MeasurementData__UnitAssignment_4 )
            // InternalSensidl.g:2537:2: rule__MeasurementData__UnitAssignment_4
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
    // InternalSensidl.g:2547:1: rule__MeasurementData__Group__5 : rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 ;
    public final void rule__MeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2551:1: ( rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 )
            // InternalSensidl.g:2552:2: rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalSensidl.g:2559:1: rule__MeasurementData__Group__5__Impl : ( ( rule__MeasurementData__Group_5__0 )? ) ;
    public final void rule__MeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2563:1: ( ( ( rule__MeasurementData__Group_5__0 )? ) )
            // InternalSensidl.g:2564:1: ( ( rule__MeasurementData__Group_5__0 )? )
            {
            // InternalSensidl.g:2564:1: ( ( rule__MeasurementData__Group_5__0 )? )
            // InternalSensidl.g:2565:1: ( rule__MeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_5()); 
            // InternalSensidl.g:2566:1: ( rule__MeasurementData__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSensidl.g:2566:2: rule__MeasurementData__Group_5__0
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
    // InternalSensidl.g:2576:1: rule__MeasurementData__Group__6 : rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 ;
    public final void rule__MeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2580:1: ( rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 )
            // InternalSensidl.g:2581:2: rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalSensidl.g:2588:1: rule__MeasurementData__Group__6__Impl : ( ( rule__MeasurementData__Group_6__0 )? ) ;
    public final void rule__MeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2592:1: ( ( ( rule__MeasurementData__Group_6__0 )? ) )
            // InternalSensidl.g:2593:1: ( ( rule__MeasurementData__Group_6__0 )? )
            {
            // InternalSensidl.g:2593:1: ( ( rule__MeasurementData__Group_6__0 )? )
            // InternalSensidl.g:2594:1: ( rule__MeasurementData__Group_6__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_6()); 
            // InternalSensidl.g:2595:1: ( rule__MeasurementData__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSensidl.g:2595:2: rule__MeasurementData__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2605:1: rule__MeasurementData__Group__7 : rule__MeasurementData__Group__7__Impl ;
    public final void rule__MeasurementData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2609:1: ( rule__MeasurementData__Group__7__Impl )
            // InternalSensidl.g:2610:2: rule__MeasurementData__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2616:1: rule__MeasurementData__Group__7__Impl : ( ( rule__MeasurementData__DescriptionAssignment_7 )? ) ;
    public final void rule__MeasurementData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2620:1: ( ( ( rule__MeasurementData__DescriptionAssignment_7 )? ) )
            // InternalSensidl.g:2621:1: ( ( rule__MeasurementData__DescriptionAssignment_7 )? )
            {
            // InternalSensidl.g:2621:1: ( ( rule__MeasurementData__DescriptionAssignment_7 )? )
            // InternalSensidl.g:2622:1: ( rule__MeasurementData__DescriptionAssignment_7 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionAssignment_7()); 
            // InternalSensidl.g:2623:1: ( rule__MeasurementData__DescriptionAssignment_7 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DESCRIPTION) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSensidl.g:2623:2: rule__MeasurementData__DescriptionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2649:1: rule__MeasurementData__Group_5__0 : rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 ;
    public final void rule__MeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2653:1: ( rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 )
            // InternalSensidl.g:2654:2: rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1
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
    // InternalSensidl.g:2661:1: rule__MeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2665:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:2666:1: ( 'with identifier' )
            {
            // InternalSensidl.g:2666:1: ( 'with identifier' )
            // InternalSensidl.g:2667:1: 'with identifier'
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
    // InternalSensidl.g:2680:1: rule__MeasurementData__Group_5__1 : rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 ;
    public final void rule__MeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2684:1: ( rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 )
            // InternalSensidl.g:2685:2: rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2
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
    // InternalSensidl.g:2692:1: rule__MeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2696:1: ( ( ':' ) )
            // InternalSensidl.g:2697:1: ( ':' )
            {
            // InternalSensidl.g:2697:1: ( ':' )
            // InternalSensidl.g:2698:1: ':'
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
    // InternalSensidl.g:2711:1: rule__MeasurementData__Group_5__2 : rule__MeasurementData__Group_5__2__Impl ;
    public final void rule__MeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2715:1: ( rule__MeasurementData__Group_5__2__Impl )
            // InternalSensidl.g:2716:2: rule__MeasurementData__Group_5__2__Impl
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
    // InternalSensidl.g:2722:1: rule__MeasurementData__Group_5__2__Impl : ( ( rule__MeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2726:1: ( ( ( rule__MeasurementData__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:2727:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:2727:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            // InternalSensidl.g:2728:1: ( rule__MeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:2729:1: ( rule__MeasurementData__IDAssignment_5_2 )
            // InternalSensidl.g:2729:2: rule__MeasurementData__IDAssignment_5_2
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


    // $ANTLR start "rule__MeasurementData__Group_6__0"
    // InternalSensidl.g:2745:1: rule__MeasurementData__Group_6__0 : rule__MeasurementData__Group_6__0__Impl rule__MeasurementData__Group_6__1 ;
    public final void rule__MeasurementData__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2749:1: ( rule__MeasurementData__Group_6__0__Impl rule__MeasurementData__Group_6__1 )
            // InternalSensidl.g:2750:2: rule__MeasurementData__Group_6__0__Impl rule__MeasurementData__Group_6__1
            {
            pushFollow(FOLLOW_29);
            rule__MeasurementData__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2757:1: rule__MeasurementData__Group_6__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2761:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:2762:1: ( 'adjusted' )
            {
            // InternalSensidl.g:2762:1: ( 'adjusted' )
            // InternalSensidl.g:2763:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSensidl.g:2776:1: rule__MeasurementData__Group_6__1 : rule__MeasurementData__Group_6__1__Impl rule__MeasurementData__Group_6__2 ;
    public final void rule__MeasurementData__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2780:1: ( rule__MeasurementData__Group_6__1__Impl rule__MeasurementData__Group_6__2 )
            // InternalSensidl.g:2781:2: rule__MeasurementData__Group_6__1__Impl rule__MeasurementData__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__MeasurementData__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2788:1: rule__MeasurementData__Group_6__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_1 ) ) ;
    public final void rule__MeasurementData__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2792:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_1 ) ) )
            // InternalSensidl.g:2793:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1 ) )
            {
            // InternalSensidl.g:2793:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1 ) )
            // InternalSensidl.g:2794:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_1()); 
            // InternalSensidl.g:2795:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1 )
            // InternalSensidl.g:2795:2: rule__MeasurementData__AdjustmentsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2805:1: rule__MeasurementData__Group_6__2 : rule__MeasurementData__Group_6__2__Impl ;
    public final void rule__MeasurementData__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2809:1: ( rule__MeasurementData__Group_6__2__Impl )
            // InternalSensidl.g:2810:2: rule__MeasurementData__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2816:1: rule__MeasurementData__Group_6__2__Impl : ( ( rule__MeasurementData__Group_6_2__0 )* ) ;
    public final void rule__MeasurementData__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2820:1: ( ( ( rule__MeasurementData__Group_6_2__0 )* ) )
            // InternalSensidl.g:2821:1: ( ( rule__MeasurementData__Group_6_2__0 )* )
            {
            // InternalSensidl.g:2821:1: ( ( rule__MeasurementData__Group_6_2__0 )* )
            // InternalSensidl.g:2822:1: ( rule__MeasurementData__Group_6_2__0 )*
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_6_2()); 
            // InternalSensidl.g:2823:1: ( rule__MeasurementData__Group_6_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSensidl.g:2823:2: rule__MeasurementData__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__MeasurementData__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalSensidl.g:2839:1: rule__MeasurementData__Group_6_2__0 : rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 ;
    public final void rule__MeasurementData__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2843:1: ( rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 )
            // InternalSensidl.g:2844:2: rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSensidl.g:2851:1: rule__MeasurementData__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2855:1: ( ( ',' ) )
            // InternalSensidl.g:2856:1: ( ',' )
            {
            // InternalSensidl.g:2856:1: ( ',' )
            // InternalSensidl.g:2857:1: ','
            {
             before(grammarAccess.getMeasurementDataAccess().getCommaKeyword_6_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSensidl.g:2870:1: rule__MeasurementData__Group_6_2__1 : rule__MeasurementData__Group_6_2__1__Impl ;
    public final void rule__MeasurementData__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2874:1: ( rule__MeasurementData__Group_6_2__1__Impl )
            // InternalSensidl.g:2875:2: rule__MeasurementData__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:2881:1: rule__MeasurementData__Group_6_2__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) ;
    public final void rule__MeasurementData__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2885:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) )
            // InternalSensidl.g:2886:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            {
            // InternalSensidl.g:2886:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            // InternalSensidl.g:2887:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_1()); 
            // InternalSensidl.g:2888:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            // InternalSensidl.g:2888:2: rule__MeasurementData__AdjustmentsAssignment_6_2_1
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


    // $ANTLR start "rule__NonMeasurementData__Group__0"
    // InternalSensidl.g:2902:1: rule__NonMeasurementData__Group__0 : rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 ;
    public final void rule__NonMeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2906:1: ( rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 )
            // InternalSensidl.g:2907:2: rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSensidl.g:2914:1: rule__NonMeasurementData__Group__0__Impl : ( ( rule__NonMeasurementData__NameAssignment_0 ) ) ;
    public final void rule__NonMeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2918:1: ( ( ( rule__NonMeasurementData__NameAssignment_0 ) ) )
            // InternalSensidl.g:2919:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:2919:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            // InternalSensidl.g:2920:1: ( rule__NonMeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:2921:1: ( rule__NonMeasurementData__NameAssignment_0 )
            // InternalSensidl.g:2921:2: rule__NonMeasurementData__NameAssignment_0
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
    // InternalSensidl.g:2931:1: rule__NonMeasurementData__Group__1 : rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 ;
    public final void rule__NonMeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2935:1: ( rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 )
            // InternalSensidl.g:2936:2: rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSensidl.g:2943:1: rule__NonMeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__NonMeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2947:1: ( ( 'as' ) )
            // InternalSensidl.g:2948:1: ( 'as' )
            {
            // InternalSensidl.g:2948:1: ( 'as' )
            // InternalSensidl.g:2949:1: 'as'
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
    // InternalSensidl.g:2962:1: rule__NonMeasurementData__Group__2 : rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 ;
    public final void rule__NonMeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2966:1: ( rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 )
            // InternalSensidl.g:2967:2: rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalSensidl.g:2974:1: rule__NonMeasurementData__Group__2__Impl : ( ( rule__NonMeasurementData__Alternatives_2 ) ) ;
    public final void rule__NonMeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2978:1: ( ( ( rule__NonMeasurementData__Alternatives_2 ) ) )
            // InternalSensidl.g:2979:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            {
            // InternalSensidl.g:2979:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            // InternalSensidl.g:2980:1: ( rule__NonMeasurementData__Alternatives_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_2()); 
            // InternalSensidl.g:2981:1: ( rule__NonMeasurementData__Alternatives_2 )
            // InternalSensidl.g:2981:2: rule__NonMeasurementData__Alternatives_2
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
    // InternalSensidl.g:2991:1: rule__NonMeasurementData__Group__3 : rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 ;
    public final void rule__NonMeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2995:1: ( rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 )
            // InternalSensidl.g:2996:2: rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalSensidl.g:3003:1: rule__NonMeasurementData__Group__3__Impl : ( ( rule__NonMeasurementData__ConstantAssignment_3 )? ) ;
    public final void rule__NonMeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3007:1: ( ( ( rule__NonMeasurementData__ConstantAssignment_3 )? ) )
            // InternalSensidl.g:3008:1: ( ( rule__NonMeasurementData__ConstantAssignment_3 )? )
            {
            // InternalSensidl.g:3008:1: ( ( rule__NonMeasurementData__ConstantAssignment_3 )? )
            // InternalSensidl.g:3009:1: ( rule__NonMeasurementData__ConstantAssignment_3 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantAssignment_3()); 
            // InternalSensidl.g:3010:1: ( rule__NonMeasurementData__ConstantAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==55) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSensidl.g:3010:2: rule__NonMeasurementData__ConstantAssignment_3
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
    // InternalSensidl.g:3020:1: rule__NonMeasurementData__Group__4 : rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 ;
    public final void rule__NonMeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3024:1: ( rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 )
            // InternalSensidl.g:3025:2: rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalSensidl.g:3032:1: rule__NonMeasurementData__Group__4__Impl : ( ( rule__NonMeasurementData__Group_4__0 )? ) ;
    public final void rule__NonMeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3036:1: ( ( ( rule__NonMeasurementData__Group_4__0 )? ) )
            // InternalSensidl.g:3037:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            {
            // InternalSensidl.g:3037:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            // InternalSensidl.g:3038:1: ( rule__NonMeasurementData__Group_4__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_4()); 
            // InternalSensidl.g:3039:1: ( rule__NonMeasurementData__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSensidl.g:3039:2: rule__NonMeasurementData__Group_4__0
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
    // InternalSensidl.g:3049:1: rule__NonMeasurementData__Group__5 : rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 ;
    public final void rule__NonMeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3053:1: ( rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 )
            // InternalSensidl.g:3054:2: rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalSensidl.g:3061:1: rule__NonMeasurementData__Group__5__Impl : ( ( rule__NonMeasurementData__Group_5__0 )? ) ;
    public final void rule__NonMeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3065:1: ( ( ( rule__NonMeasurementData__Group_5__0 )? ) )
            // InternalSensidl.g:3066:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            {
            // InternalSensidl.g:3066:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            // InternalSensidl.g:3067:1: ( rule__NonMeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_5()); 
            // InternalSensidl.g:3068:1: ( rule__NonMeasurementData__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSensidl.g:3068:2: rule__NonMeasurementData__Group_5__0
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
    // InternalSensidl.g:3078:1: rule__NonMeasurementData__Group__6 : rule__NonMeasurementData__Group__6__Impl ;
    public final void rule__NonMeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3082:1: ( rule__NonMeasurementData__Group__6__Impl )
            // InternalSensidl.g:3083:2: rule__NonMeasurementData__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3089:1: rule__NonMeasurementData__Group__6__Impl : ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? ) ;
    public final void rule__NonMeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3093:1: ( ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? ) )
            // InternalSensidl.g:3094:1: ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? )
            {
            // InternalSensidl.g:3094:1: ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? )
            // InternalSensidl.g:3095:1: ( rule__NonMeasurementData__DescriptionAssignment_6 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionAssignment_6()); 
            // InternalSensidl.g:3096:1: ( rule__NonMeasurementData__DescriptionAssignment_6 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_DESCRIPTION) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSensidl.g:3096:2: rule__NonMeasurementData__DescriptionAssignment_6
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3120:1: rule__NonMeasurementData__Group_4__0 : rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 ;
    public final void rule__NonMeasurementData__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3124:1: ( rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 )
            // InternalSensidl.g:3125:2: rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSensidl.g:3132:1: rule__NonMeasurementData__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__NonMeasurementData__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3136:1: ( ( 'value' ) )
            // InternalSensidl.g:3137:1: ( 'value' )
            {
            // InternalSensidl.g:3137:1: ( 'value' )
            // InternalSensidl.g:3138:1: 'value'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSensidl.g:3151:1: rule__NonMeasurementData__Group_4__1 : rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 ;
    public final void rule__NonMeasurementData__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3155:1: ( rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 )
            // InternalSensidl.g:3156:2: rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2
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
    // InternalSensidl.g:3163:1: rule__NonMeasurementData__Group_4__1__Impl : ( '=' ) ;
    public final void rule__NonMeasurementData__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3167:1: ( ( '=' ) )
            // InternalSensidl.g:3168:1: ( '=' )
            {
            // InternalSensidl.g:3168:1: ( '=' )
            // InternalSensidl.g:3169:1: '='
            {
             before(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSensidl.g:3182:1: rule__NonMeasurementData__Group_4__2 : rule__NonMeasurementData__Group_4__2__Impl ;
    public final void rule__NonMeasurementData__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3186:1: ( rule__NonMeasurementData__Group_4__2__Impl )
            // InternalSensidl.g:3187:2: rule__NonMeasurementData__Group_4__2__Impl
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
    // InternalSensidl.g:3193:1: rule__NonMeasurementData__Group_4__2__Impl : ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) ) ;
    public final void rule__NonMeasurementData__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3197:1: ( ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) ) )
            // InternalSensidl.g:3198:1: ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) )
            {
            // InternalSensidl.g:3198:1: ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) )
            // InternalSensidl.g:3199:1: ( rule__NonMeasurementData__ValueAssignment_4_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_4_2()); 
            // InternalSensidl.g:3200:1: ( rule__NonMeasurementData__ValueAssignment_4_2 )
            // InternalSensidl.g:3200:2: rule__NonMeasurementData__ValueAssignment_4_2
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
    // InternalSensidl.g:3216:1: rule__NonMeasurementData__Group_5__0 : rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 ;
    public final void rule__NonMeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3220:1: ( rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 )
            // InternalSensidl.g:3221:2: rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1
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
    // InternalSensidl.g:3228:1: rule__NonMeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__NonMeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3232:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:3233:1: ( 'with identifier' )
            {
            // InternalSensidl.g:3233:1: ( 'with identifier' )
            // InternalSensidl.g:3234:1: 'with identifier'
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
    // InternalSensidl.g:3247:1: rule__NonMeasurementData__Group_5__1 : rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2 ;
    public final void rule__NonMeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3251:1: ( rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2 )
            // InternalSensidl.g:3252:2: rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2
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
    // InternalSensidl.g:3259:1: rule__NonMeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__NonMeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3263:1: ( ( ':' ) )
            // InternalSensidl.g:3264:1: ( ':' )
            {
            // InternalSensidl.g:3264:1: ( ':' )
            // InternalSensidl.g:3265:1: ':'
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
    // InternalSensidl.g:3278:1: rule__NonMeasurementData__Group_5__2 : rule__NonMeasurementData__Group_5__2__Impl ;
    public final void rule__NonMeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3282:1: ( rule__NonMeasurementData__Group_5__2__Impl )
            // InternalSensidl.g:3283:2: rule__NonMeasurementData__Group_5__2__Impl
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
    // InternalSensidl.g:3289:1: rule__NonMeasurementData__Group_5__2__Impl : ( ( rule__NonMeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__NonMeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3293:1: ( ( ( rule__NonMeasurementData__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:3294:1: ( ( rule__NonMeasurementData__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:3294:1: ( ( rule__NonMeasurementData__IDAssignment_5_2 ) )
            // InternalSensidl.g:3295:1: ( rule__NonMeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:3296:1: ( rule__NonMeasurementData__IDAssignment_5_2 )
            // InternalSensidl.g:3296:2: rule__NonMeasurementData__IDAssignment_5_2
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


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__0"
    // InternalSensidl.g:3312:1: rule__MeasurementDataNotAdjustable__Group__0 : rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3316:1: ( rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 )
            // InternalSensidl.g:3317:2: rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSensidl.g:3324:1: rule__MeasurementDataNotAdjustable__Group__0__Impl : ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3328:1: ( ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) )
            // InternalSensidl.g:3329:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            {
            // InternalSensidl.g:3329:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            // InternalSensidl.g:3330:1: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameAssignment_0()); 
            // InternalSensidl.g:3331:1: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            // InternalSensidl.g:3331:2: rule__MeasurementDataNotAdjustable__NameAssignment_0
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
    // InternalSensidl.g:3341:1: rule__MeasurementDataNotAdjustable__Group__1 : rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3345:1: ( rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 )
            // InternalSensidl.g:3346:2: rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSensidl.g:3353:1: rule__MeasurementDataNotAdjustable__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3357:1: ( ( 'as' ) )
            // InternalSensidl.g:3358:1: ( 'as' )
            {
            // InternalSensidl.g:3358:1: ( 'as' )
            // InternalSensidl.g:3359:1: 'as'
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
    // InternalSensidl.g:3372:1: rule__MeasurementDataNotAdjustable__Group__2 : rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 ;
    public final void rule__MeasurementDataNotAdjustable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3376:1: ( rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 )
            // InternalSensidl.g:3377:2: rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSensidl.g:3384:1: rule__MeasurementDataNotAdjustable__Group__2__Impl : ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3388:1: ( ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) )
            // InternalSensidl.g:3389:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            {
            // InternalSensidl.g:3389:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            // InternalSensidl.g:3390:1: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeAssignment_2()); 
            // InternalSensidl.g:3391:1: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            // InternalSensidl.g:3391:2: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2
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
    // InternalSensidl.g:3401:1: rule__MeasurementDataNotAdjustable__Group__3 : rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 ;
    public final void rule__MeasurementDataNotAdjustable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3405:1: ( rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 )
            // InternalSensidl.g:3406:2: rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSensidl.g:3413:1: rule__MeasurementDataNotAdjustable__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3417:1: ( ( 'in' ) )
            // InternalSensidl.g:3418:1: ( 'in' )
            {
            // InternalSensidl.g:3418:1: ( 'in' )
            // InternalSensidl.g:3419:1: 'in'
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
    // InternalSensidl.g:3432:1: rule__MeasurementDataNotAdjustable__Group__4 : rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 ;
    public final void rule__MeasurementDataNotAdjustable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3436:1: ( rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 )
            // InternalSensidl.g:3437:2: rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalSensidl.g:3444:1: rule__MeasurementDataNotAdjustable__Group__4__Impl : ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3448:1: ( ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) )
            // InternalSensidl.g:3449:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            {
            // InternalSensidl.g:3449:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            // InternalSensidl.g:3450:1: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitAssignment_4()); 
            // InternalSensidl.g:3451:1: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            // InternalSensidl.g:3451:2: rule__MeasurementDataNotAdjustable__UnitAssignment_4
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
    // InternalSensidl.g:3461:1: rule__MeasurementDataNotAdjustable__Group__5 : rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 ;
    public final void rule__MeasurementDataNotAdjustable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3465:1: ( rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 )
            // InternalSensidl.g:3466:2: rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalSensidl.g:3473:1: rule__MeasurementDataNotAdjustable__Group__5__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3477:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) )
            // InternalSensidl.g:3478:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            {
            // InternalSensidl.g:3478:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            // InternalSensidl.g:3479:1: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_5()); 
            // InternalSensidl.g:3480:1: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSensidl.g:3480:2: rule__MeasurementDataNotAdjustable__Group_5__0
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
    // InternalSensidl.g:3490:1: rule__MeasurementDataNotAdjustable__Group__6 : rule__MeasurementDataNotAdjustable__Group__6__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3494:1: ( rule__MeasurementDataNotAdjustable__Group__6__Impl )
            // InternalSensidl.g:3495:2: rule__MeasurementDataNotAdjustable__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3501:1: rule__MeasurementDataNotAdjustable__Group__6__Impl : ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3505:1: ( ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )? ) )
            // InternalSensidl.g:3506:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )? )
            {
            // InternalSensidl.g:3506:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )? )
            // InternalSensidl.g:3507:1: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionAssignment_6()); 
            // InternalSensidl.g:3508:1: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_DESCRIPTION) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSensidl.g:3508:2: rule__MeasurementDataNotAdjustable__DescriptionAssignment_6
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:3532:1: rule__MeasurementDataNotAdjustable__Group_5__0 : rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3536:1: ( rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 )
            // InternalSensidl.g:3537:2: rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1
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
    // InternalSensidl.g:3544:1: rule__MeasurementDataNotAdjustable__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3548:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:3549:1: ( 'with identifier' )
            {
            // InternalSensidl.g:3549:1: ( 'with identifier' )
            // InternalSensidl.g:3550:1: 'with identifier'
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
    // InternalSensidl.g:3563:1: rule__MeasurementDataNotAdjustable__Group_5__1 : rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3567:1: ( rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 )
            // InternalSensidl.g:3568:2: rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2
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
    // InternalSensidl.g:3575:1: rule__MeasurementDataNotAdjustable__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3579:1: ( ( ':' ) )
            // InternalSensidl.g:3580:1: ( ':' )
            {
            // InternalSensidl.g:3580:1: ( ':' )
            // InternalSensidl.g:3581:1: ':'
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
    // InternalSensidl.g:3594:1: rule__MeasurementDataNotAdjustable__Group_5__2 : rule__MeasurementDataNotAdjustable__Group_5__2__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3598:1: ( rule__MeasurementDataNotAdjustable__Group_5__2__Impl )
            // InternalSensidl.g:3599:2: rule__MeasurementDataNotAdjustable__Group_5__2__Impl
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
    // InternalSensidl.g:3605:1: rule__MeasurementDataNotAdjustable__Group_5__2__Impl : ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3609:1: ( ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:3610:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:3610:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            // InternalSensidl.g:3611:1: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:3612:1: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            // InternalSensidl.g:3612:2: rule__MeasurementDataNotAdjustable__IDAssignment_5_2
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


    // $ANTLR start "rule__DataRange__Group__0"
    // InternalSensidl.g:3628:1: rule__DataRange__Group__0 : rule__DataRange__Group__0__Impl rule__DataRange__Group__1 ;
    public final void rule__DataRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3632:1: ( rule__DataRange__Group__0__Impl rule__DataRange__Group__1 )
            // InternalSensidl.g:3633:2: rule__DataRange__Group__0__Impl rule__DataRange__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSensidl.g:3640:1: rule__DataRange__Group__0__Impl : ( 'with range' ) ;
    public final void rule__DataRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3644:1: ( ( 'with range' ) )
            // InternalSensidl.g:3645:1: ( 'with range' )
            {
            // InternalSensidl.g:3645:1: ( 'with range' )
            // InternalSensidl.g:3646:1: 'with range'
            {
             before(grammarAccess.getDataRangeAccess().getWithRangeKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSensidl.g:3659:1: rule__DataRange__Group__1 : rule__DataRange__Group__1__Impl ;
    public final void rule__DataRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3663:1: ( rule__DataRange__Group__1__Impl )
            // InternalSensidl.g:3664:2: rule__DataRange__Group__1__Impl
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
    // InternalSensidl.g:3670:1: rule__DataRange__Group__1__Impl : ( ( rule__DataRange__RangeAssignment_1 ) ) ;
    public final void rule__DataRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3674:1: ( ( ( rule__DataRange__RangeAssignment_1 ) ) )
            // InternalSensidl.g:3675:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            {
            // InternalSensidl.g:3675:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            // InternalSensidl.g:3676:1: ( rule__DataRange__RangeAssignment_1 )
            {
             before(grammarAccess.getDataRangeAccess().getRangeAssignment_1()); 
            // InternalSensidl.g:3677:1: ( rule__DataRange__RangeAssignment_1 )
            // InternalSensidl.g:3677:2: rule__DataRange__RangeAssignment_1
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
    // InternalSensidl.g:3691:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3695:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalSensidl.g:3696:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
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
    // InternalSensidl.g:3703:1: rule__Interval__Group__0__Impl : ( '[' ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3707:1: ( ( '[' ) )
            // InternalSensidl.g:3708:1: ( '[' )
            {
            // InternalSensidl.g:3708:1: ( '[' )
            // InternalSensidl.g:3709:1: '['
            {
             before(grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSensidl.g:3722:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3726:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalSensidl.g:3727:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalSensidl.g:3734:1: rule__Interval__Group__1__Impl : ( ( rule__Interval__LowerBoundAssignment_1 ) ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3738:1: ( ( ( rule__Interval__LowerBoundAssignment_1 ) ) )
            // InternalSensidl.g:3739:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            {
            // InternalSensidl.g:3739:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            // InternalSensidl.g:3740:1: ( rule__Interval__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundAssignment_1()); 
            // InternalSensidl.g:3741:1: ( rule__Interval__LowerBoundAssignment_1 )
            // InternalSensidl.g:3741:2: rule__Interval__LowerBoundAssignment_1
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
    // InternalSensidl.g:3751:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl rule__Interval__Group__3 ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3755:1: ( rule__Interval__Group__2__Impl rule__Interval__Group__3 )
            // InternalSensidl.g:3756:2: rule__Interval__Group__2__Impl rule__Interval__Group__3
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
    // InternalSensidl.g:3763:1: rule__Interval__Group__2__Impl : ( ';' ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3767:1: ( ( ';' ) )
            // InternalSensidl.g:3768:1: ( ';' )
            {
            // InternalSensidl.g:3768:1: ( ';' )
            // InternalSensidl.g:3769:1: ';'
            {
             before(grammarAccess.getIntervalAccess().getSemicolonKeyword_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSensidl.g:3782:1: rule__Interval__Group__3 : rule__Interval__Group__3__Impl rule__Interval__Group__4 ;
    public final void rule__Interval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3786:1: ( rule__Interval__Group__3__Impl rule__Interval__Group__4 )
            // InternalSensidl.g:3787:2: rule__Interval__Group__3__Impl rule__Interval__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalSensidl.g:3794:1: rule__Interval__Group__3__Impl : ( ( rule__Interval__UpperBoundAssignment_3 ) ) ;
    public final void rule__Interval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3798:1: ( ( ( rule__Interval__UpperBoundAssignment_3 ) ) )
            // InternalSensidl.g:3799:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            {
            // InternalSensidl.g:3799:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            // InternalSensidl.g:3800:1: ( rule__Interval__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundAssignment_3()); 
            // InternalSensidl.g:3801:1: ( rule__Interval__UpperBoundAssignment_3 )
            // InternalSensidl.g:3801:2: rule__Interval__UpperBoundAssignment_3
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
    // InternalSensidl.g:3811:1: rule__Interval__Group__4 : rule__Interval__Group__4__Impl ;
    public final void rule__Interval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3815:1: ( rule__Interval__Group__4__Impl )
            // InternalSensidl.g:3816:2: rule__Interval__Group__4__Impl
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
    // InternalSensidl.g:3822:1: rule__Interval__Group__4__Impl : ( ']' ) ;
    public final void rule__Interval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3826:1: ( ( ']' ) )
            // InternalSensidl.g:3827:1: ( ']' )
            {
            // InternalSensidl.g:3827:1: ( ']' )
            // InternalSensidl.g:3828:1: ']'
            {
             before(grammarAccess.getIntervalAccess().getRightSquareBracketKeyword_4()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSensidl.g:3851:1: rule__LinearDataConversion__Group__0 : rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 ;
    public final void rule__LinearDataConversion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3855:1: ( rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 )
            // InternalSensidl.g:3856:2: rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1
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
    // InternalSensidl.g:3863:1: rule__LinearDataConversion__Group__0__Impl : ( 'with scaling factor' ) ;
    public final void rule__LinearDataConversion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3867:1: ( ( 'with scaling factor' ) )
            // InternalSensidl.g:3868:1: ( 'with scaling factor' )
            {
            // InternalSensidl.g:3868:1: ( 'with scaling factor' )
            // InternalSensidl.g:3869:1: 'with scaling factor'
            {
             before(grammarAccess.getLinearDataConversionAccess().getWithScalingFactorKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSensidl.g:3882:1: rule__LinearDataConversion__Group__1 : rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 ;
    public final void rule__LinearDataConversion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3886:1: ( rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 )
            // InternalSensidl.g:3887:2: rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2
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
    // InternalSensidl.g:3894:1: rule__LinearDataConversion__Group__1__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3898:1: ( ( ':' ) )
            // InternalSensidl.g:3899:1: ( ':' )
            {
            // InternalSensidl.g:3899:1: ( ':' )
            // InternalSensidl.g:3900:1: ':'
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
    // InternalSensidl.g:3913:1: rule__LinearDataConversion__Group__2 : rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 ;
    public final void rule__LinearDataConversion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3917:1: ( rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 )
            // InternalSensidl.g:3918:2: rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalSensidl.g:3925:1: rule__LinearDataConversion__Group__2__Impl : ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) ;
    public final void rule__LinearDataConversion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3929:1: ( ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) )
            // InternalSensidl.g:3930:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            {
            // InternalSensidl.g:3930:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            // InternalSensidl.g:3931:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorAssignment_2()); 
            // InternalSensidl.g:3932:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            // InternalSensidl.g:3932:2: rule__LinearDataConversion__ScalingFactorAssignment_2
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
    // InternalSensidl.g:3942:1: rule__LinearDataConversion__Group__3 : rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 ;
    public final void rule__LinearDataConversion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3946:1: ( rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 )
            // InternalSensidl.g:3947:2: rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4
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
    // InternalSensidl.g:3954:1: rule__LinearDataConversion__Group__3__Impl : ( 'and offset' ) ;
    public final void rule__LinearDataConversion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3958:1: ( ( 'and offset' ) )
            // InternalSensidl.g:3959:1: ( 'and offset' )
            {
            // InternalSensidl.g:3959:1: ( 'and offset' )
            // InternalSensidl.g:3960:1: 'and offset'
            {
             before(grammarAccess.getLinearDataConversionAccess().getAndOffsetKeyword_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSensidl.g:3973:1: rule__LinearDataConversion__Group__4 : rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 ;
    public final void rule__LinearDataConversion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3977:1: ( rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 )
            // InternalSensidl.g:3978:2: rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5
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
    // InternalSensidl.g:3985:1: rule__LinearDataConversion__Group__4__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3989:1: ( ( ':' ) )
            // InternalSensidl.g:3990:1: ( ':' )
            {
            // InternalSensidl.g:3990:1: ( ':' )
            // InternalSensidl.g:3991:1: ':'
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
    // InternalSensidl.g:4004:1: rule__LinearDataConversion__Group__5 : rule__LinearDataConversion__Group__5__Impl ;
    public final void rule__LinearDataConversion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4008:1: ( rule__LinearDataConversion__Group__5__Impl )
            // InternalSensidl.g:4009:2: rule__LinearDataConversion__Group__5__Impl
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
    // InternalSensidl.g:4015:1: rule__LinearDataConversion__Group__5__Impl : ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) ;
    public final void rule__LinearDataConversion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4019:1: ( ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) )
            // InternalSensidl.g:4020:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            {
            // InternalSensidl.g:4020:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            // InternalSensidl.g:4021:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetAssignment_5()); 
            // InternalSensidl.g:4022:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            // InternalSensidl.g:4022:2: rule__LinearDataConversion__OffsetAssignment_5
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
    // InternalSensidl.g:4044:1: rule__LinearDataConversionWithInterval__Group__0 : rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 ;
    public final void rule__LinearDataConversionWithInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4048:1: ( rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 )
            // InternalSensidl.g:4049:2: rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSensidl.g:4056:1: rule__LinearDataConversionWithInterval__Group__0__Impl : ( 'by linear mapping' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4060:1: ( ( 'by linear mapping' ) )
            // InternalSensidl.g:4061:1: ( 'by linear mapping' )
            {
            // InternalSensidl.g:4061:1: ( 'by linear mapping' )
            // InternalSensidl.g:4062:1: 'by linear mapping'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getByLinearMappingKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSensidl.g:4075:1: rule__LinearDataConversionWithInterval__Group__1 : rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 ;
    public final void rule__LinearDataConversionWithInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4079:1: ( rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 )
            // InternalSensidl.g:4080:2: rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalSensidl.g:4087:1: rule__LinearDataConversionWithInterval__Group__1__Impl : ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4091:1: ( ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) )
            // InternalSensidl.g:4092:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            {
            // InternalSensidl.g:4092:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            // InternalSensidl.g:4093:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalAssignment_1()); 
            // InternalSensidl.g:4094:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            // InternalSensidl.g:4094:2: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1
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
    // InternalSensidl.g:4104:1: rule__LinearDataConversionWithInterval__Group__2 : rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 ;
    public final void rule__LinearDataConversionWithInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4108:1: ( rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 )
            // InternalSensidl.g:4109:2: rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalSensidl.g:4116:1: rule__LinearDataConversionWithInterval__Group__2__Impl : ( '=>' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4120:1: ( ( '=>' ) )
            // InternalSensidl.g:4121:1: ( '=>' )
            {
            // InternalSensidl.g:4121:1: ( '=>' )
            // InternalSensidl.g:4122:1: '=>'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSensidl.g:4135:1: rule__LinearDataConversionWithInterval__Group__3 : rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4 ;
    public final void rule__LinearDataConversionWithInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4139:1: ( rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4 )
            // InternalSensidl.g:4140:2: rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalSensidl.g:4147:1: rule__LinearDataConversionWithInterval__Group__3__Impl : ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4151:1: ( ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) )
            // InternalSensidl.g:4152:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            {
            // InternalSensidl.g:4152:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            // InternalSensidl.g:4153:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalAssignment_3()); 
            // InternalSensidl.g:4154:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            // InternalSensidl.g:4154:2: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3
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
    // InternalSensidl.g:4164:1: rule__LinearDataConversionWithInterval__Group__4 : rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5 ;
    public final void rule__LinearDataConversionWithInterval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4168:1: ( rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5 )
            // InternalSensidl.g:4169:2: rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalSensidl.g:4176:1: rule__LinearDataConversionWithInterval__Group__4__Impl : ( 'as' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4180:1: ( ( 'as' ) )
            // InternalSensidl.g:4181:1: ( 'as' )
            {
            // InternalSensidl.g:4181:1: ( 'as' )
            // InternalSensidl.g:4182:1: 'as'
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
    // InternalSensidl.g:4195:1: rule__LinearDataConversionWithInterval__Group__5 : rule__LinearDataConversionWithInterval__Group__5__Impl ;
    public final void rule__LinearDataConversionWithInterval__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4199:1: ( rule__LinearDataConversionWithInterval__Group__5__Impl )
            // InternalSensidl.g:4200:2: rule__LinearDataConversionWithInterval__Group__5__Impl
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
    // InternalSensidl.g:4206:1: rule__LinearDataConversionWithInterval__Group__5__Impl : ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4210:1: ( ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) ) )
            // InternalSensidl.g:4211:1: ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) )
            {
            // InternalSensidl.g:4211:1: ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) )
            // InternalSensidl.g:4212:1: ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeAssignment_5()); 
            // InternalSensidl.g:4213:1: ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 )
            // InternalSensidl.g:4213:2: rule__LinearDataConversionWithInterval__DataTypeAssignment_5
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
    // InternalSensidl.g:4235:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4239:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalSensidl.g:4240:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSensidl.g:4247:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4251:1: ( ( RULE_INT ) )
            // InternalSensidl.g:4252:1: ( RULE_INT )
            {
            // InternalSensidl.g:4252:1: ( RULE_INT )
            // InternalSensidl.g:4253:1: RULE_INT
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
    // InternalSensidl.g:4264:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4268:1: ( rule__DOUBLE__Group__1__Impl )
            // InternalSensidl.g:4269:2: rule__DOUBLE__Group__1__Impl
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
    // InternalSensidl.g:4275:1: rule__DOUBLE__Group__1__Impl : ( ( rule__DOUBLE__Group_1__0 )? ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4279:1: ( ( ( rule__DOUBLE__Group_1__0 )? ) )
            // InternalSensidl.g:4280:1: ( ( rule__DOUBLE__Group_1__0 )? )
            {
            // InternalSensidl.g:4280:1: ( ( rule__DOUBLE__Group_1__0 )? )
            // InternalSensidl.g:4281:1: ( rule__DOUBLE__Group_1__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
            // InternalSensidl.g:4282:1: ( rule__DOUBLE__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSensidl.g:4282:2: rule__DOUBLE__Group_1__0
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
    // InternalSensidl.g:4296:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4300:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // InternalSensidl.g:4301:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
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
    // InternalSensidl.g:4308:1: rule__DOUBLE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4312:1: ( ( '.' ) )
            // InternalSensidl.g:4313:1: ( '.' )
            {
            // InternalSensidl.g:4313:1: ( '.' )
            // InternalSensidl.g:4314:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalSensidl.g:4327:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4331:1: ( rule__DOUBLE__Group_1__1__Impl )
            // InternalSensidl.g:4332:2: rule__DOUBLE__Group_1__1__Impl
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
    // InternalSensidl.g:4338:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4342:1: ( ( RULE_INT ) )
            // InternalSensidl.g:4343:1: ( RULE_INT )
            {
            // InternalSensidl.g:4343:1: ( RULE_INT )
            // InternalSensidl.g:4344:1: RULE_INT
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
    // InternalSensidl.g:4359:1: rule__UNIT__Group__0 : rule__UNIT__Group__0__Impl rule__UNIT__Group__1 ;
    public final void rule__UNIT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4363:1: ( rule__UNIT__Group__0__Impl rule__UNIT__Group__1 )
            // InternalSensidl.g:4364:2: rule__UNIT__Group__0__Impl rule__UNIT__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSensidl.g:4371:1: rule__UNIT__Group__0__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4375:1: ( ( ( RULE_ID )* ) )
            // InternalSensidl.g:4376:1: ( ( RULE_ID )* )
            {
            // InternalSensidl.g:4376:1: ( ( RULE_ID )* )
            // InternalSensidl.g:4377:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_0()); 
            // InternalSensidl.g:4378:1: ( RULE_ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==EOF||(LA29_2>=RULE_ID && LA29_2<=RULE_DESCRIPTION)||(LA29_2>=30 && LA29_2<=31)||LA29_2==43) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalSensidl.g:4378:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_23); 

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalSensidl.g:4388:1: rule__UNIT__Group__1 : rule__UNIT__Group__1__Impl ;
    public final void rule__UNIT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4392:1: ( rule__UNIT__Group__1__Impl )
            // InternalSensidl.g:4393:2: rule__UNIT__Group__1__Impl
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
    // InternalSensidl.g:4399:1: rule__UNIT__Group__1__Impl : ( ( rule__UNIT__Group_1__0 )* ) ;
    public final void rule__UNIT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4403:1: ( ( ( rule__UNIT__Group_1__0 )* ) )
            // InternalSensidl.g:4404:1: ( ( rule__UNIT__Group_1__0 )* )
            {
            // InternalSensidl.g:4404:1: ( ( rule__UNIT__Group_1__0 )* )
            // InternalSensidl.g:4405:1: ( rule__UNIT__Group_1__0 )*
            {
             before(grammarAccess.getUNITAccess().getGroup_1()); 
            // InternalSensidl.g:4406:1: ( rule__UNIT__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ANY_OTHER) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSensidl.g:4406:2: rule__UNIT__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__UNIT__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalSensidl.g:4420:1: rule__UNIT__Group_1__0 : rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 ;
    public final void rule__UNIT__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4424:1: ( rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 )
            // InternalSensidl.g:4425:2: rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1
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
    // InternalSensidl.g:4432:1: rule__UNIT__Group_1__0__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__UNIT__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4436:1: ( ( RULE_ANY_OTHER ) )
            // InternalSensidl.g:4437:1: ( RULE_ANY_OTHER )
            {
            // InternalSensidl.g:4437:1: ( RULE_ANY_OTHER )
            // InternalSensidl.g:4438:1: RULE_ANY_OTHER
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
    // InternalSensidl.g:4449:1: rule__UNIT__Group_1__1 : rule__UNIT__Group_1__1__Impl ;
    public final void rule__UNIT__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4453:1: ( rule__UNIT__Group_1__1__Impl )
            // InternalSensidl.g:4454:2: rule__UNIT__Group_1__1__Impl
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
    // InternalSensidl.g:4460:1: rule__UNIT__Group_1__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4464:1: ( ( ( RULE_ID )* ) )
            // InternalSensidl.g:4465:1: ( ( RULE_ID )* )
            {
            // InternalSensidl.g:4465:1: ( ( RULE_ID )* )
            // InternalSensidl.g:4466:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1()); 
            // InternalSensidl.g:4467:1: ( RULE_ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==EOF||(LA31_2>=RULE_ID && LA31_2<=RULE_DESCRIPTION)||(LA31_2>=30 && LA31_2<=31)||LA31_2==43) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalSensidl.g:4467:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_23); 

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalSensidl.g:4482:1: rule__SensorInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4486:1: ( ( RULE_ID ) )
            // InternalSensidl.g:4487:1: ( RULE_ID )
            {
            // InternalSensidl.g:4487:1: ( RULE_ID )
            // InternalSensidl.g:4488:1: RULE_ID
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
    // InternalSensidl.g:4497:1: rule__SensorInterface__DescriptionAssignment_2 : ( RULE_DESCRIPTION ) ;
    public final void rule__SensorInterface__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4501:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:4502:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:4502:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:4503:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:4512:1: rule__SensorInterface__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__SensorInterface__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4516:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:4517:1: ( RULE_STRING )
            {
            // InternalSensidl.g:4517:1: ( RULE_STRING )
            // InternalSensidl.g:4518:1: RULE_STRING
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
    // InternalSensidl.g:4527:1: rule__SensorInterface__EncodingSettingsAssignment_5 : ( ruleEncodingSettings ) ;
    public final void rule__SensorInterface__EncodingSettingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4531:1: ( ( ruleEncodingSettings ) )
            // InternalSensidl.g:4532:1: ( ruleEncodingSettings )
            {
            // InternalSensidl.g:4532:1: ( ruleEncodingSettings )
            // InternalSensidl.g:4533:1: ruleEncodingSettings
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
    // InternalSensidl.g:4542:1: rule__SensorInterface__DataDescriptionAssignment_6 : ( ruleSensorDataDescription ) ;
    public final void rule__SensorInterface__DataDescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4546:1: ( ( ruleSensorDataDescription ) )
            // InternalSensidl.g:4547:1: ( ruleSensorDataDescription )
            {
            // InternalSensidl.g:4547:1: ( ruleSensorDataDescription )
            // InternalSensidl.g:4548:1: ruleSensorDataDescription
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
    // InternalSensidl.g:4557:1: rule__EncodingSettings__CodingAssignment_2 : ( ruleCoding ) ;
    public final void rule__EncodingSettings__CodingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4561:1: ( ( ruleCoding ) )
            // InternalSensidl.g:4562:1: ( ruleCoding )
            {
            // InternalSensidl.g:4562:1: ( ruleCoding )
            // InternalSensidl.g:4563:1: ruleCoding
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
    // InternalSensidl.g:4572:1: rule__EncodingSettings__EndiannessAssignment_6 : ( ruleEndianness ) ;
    public final void rule__EncodingSettings__EndiannessAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4576:1: ( ( ruleEndianness ) )
            // InternalSensidl.g:4577:1: ( ruleEndianness )
            {
            // InternalSensidl.g:4577:1: ( ruleEndianness )
            // InternalSensidl.g:4578:1: ruleEndianness
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
    // InternalSensidl.g:4587:1: rule__EncodingSettings__AlignmentAssignment_10 : ( RULE_INT ) ;
    public final void rule__EncodingSettings__AlignmentAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4591:1: ( ( RULE_INT ) )
            // InternalSensidl.g:4592:1: ( RULE_INT )
            {
            // InternalSensidl.g:4592:1: ( RULE_INT )
            // InternalSensidl.g:4593:1: RULE_INT
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
    // InternalSensidl.g:4602:1: rule__EncodingSettings__IDAssignment_12_2 : ( RULE_STRING ) ;
    public final void rule__EncodingSettings__IDAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4606:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:4607:1: ( RULE_STRING )
            {
            // InternalSensidl.g:4607:1: ( RULE_STRING )
            // InternalSensidl.g:4608:1: RULE_STRING
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
    // InternalSensidl.g:4617:1: rule__SensorDataDescription__IDAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__SensorDataDescription__IDAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4621:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:4622:1: ( RULE_STRING )
            {
            // InternalSensidl.g:4622:1: ( RULE_STRING )
            // InternalSensidl.g:4623:1: RULE_STRING
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
    // InternalSensidl.g:4632:1: rule__SensorDataDescription__DataSetsAssignment_4 : ( ruleDataSet ) ;
    public final void rule__SensorDataDescription__DataSetsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4636:1: ( ( ruleDataSet ) )
            // InternalSensidl.g:4637:1: ( ruleDataSet )
            {
            // InternalSensidl.g:4637:1: ( ruleDataSet )
            // InternalSensidl.g:4638:1: ruleDataSet
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
    // InternalSensidl.g:4647:1: rule__DataSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4651:1: ( ( RULE_ID ) )
            // InternalSensidl.g:4652:1: ( RULE_ID )
            {
            // InternalSensidl.g:4652:1: ( RULE_ID )
            // InternalSensidl.g:4653:1: RULE_ID
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
    // InternalSensidl.g:4662:1: rule__DataSet__ParentDataSetAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__ParentDataSetAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4666:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:4667:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:4667:1: ( ( RULE_ID ) )
            // InternalSensidl.g:4668:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_2_1_0()); 
            // InternalSensidl.g:4669:1: ( RULE_ID )
            // InternalSensidl.g:4670:1: RULE_ID
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


    // $ANTLR start "rule__DataSet__IDAssignment_3_2"
    // InternalSensidl.g:4681:1: rule__DataSet__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__DataSet__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4685:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:4686:1: ( RULE_STRING )
            {
            // InternalSensidl.g:4686:1: ( RULE_STRING )
            // InternalSensidl.g:4687:1: RULE_STRING
            {
             before(grammarAccess.getDataSetAccess().getIDSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalSensidl.g:4696:1: rule__DataSet__DescriptionAssignment_4 : ( RULE_DESCRIPTION ) ;
    public final void rule__DataSet__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4700:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:4701:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:4701:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:4702:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getDataSetAccess().getDescriptionDESCRIPTIONTerminalRuleCall_4_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
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
    // InternalSensidl.g:4711:1: rule__DataSet__DataAssignment_6 : ( ruleData ) ;
    public final void rule__DataSet__DataAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4715:1: ( ( ruleData ) )
            // InternalSensidl.g:4716:1: ( ruleData )
            {
            // InternalSensidl.g:4716:1: ( ruleData )
            // InternalSensidl.g:4717:1: ruleData
            {
             before(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4726:1: rule__MeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4730:1: ( ( RULE_ID ) )
            // InternalSensidl.g:4731:1: ( RULE_ID )
            {
            // InternalSensidl.g:4731:1: ( RULE_ID )
            // InternalSensidl.g:4732:1: RULE_ID
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
    // InternalSensidl.g:4741:1: rule__MeasurementData__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__MeasurementData__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4745:1: ( ( ruleDataType ) )
            // InternalSensidl.g:4746:1: ( ruleDataType )
            {
            // InternalSensidl.g:4746:1: ( ruleDataType )
            // InternalSensidl.g:4747:1: ruleDataType
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
    // InternalSensidl.g:4756:1: rule__MeasurementData__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementData__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4760:1: ( ( ruleUNIT ) )
            // InternalSensidl.g:4761:1: ( ruleUNIT )
            {
            // InternalSensidl.g:4761:1: ( ruleUNIT )
            // InternalSensidl.g:4762:1: ruleUNIT
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
    // InternalSensidl.g:4771:1: rule__MeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4775:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:4776:1: ( RULE_STRING )
            {
            // InternalSensidl.g:4776:1: ( RULE_STRING )
            // InternalSensidl.g:4777:1: RULE_STRING
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


    // $ANTLR start "rule__MeasurementData__AdjustmentsAssignment_6_1"
    // InternalSensidl.g:4786:1: rule__MeasurementData__AdjustmentsAssignment_6_1 : ( ruleDataAdjustment ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4790:1: ( ( ruleDataAdjustment ) )
            // InternalSensidl.g:4791:1: ( ruleDataAdjustment )
            {
            // InternalSensidl.g:4791:1: ( ruleDataAdjustment )
            // InternalSensidl.g:4792:1: ruleDataAdjustment
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustmentParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4801:1: rule__MeasurementData__AdjustmentsAssignment_6_2_1 : ( ruleDataAdjustment ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4805:1: ( ( ruleDataAdjustment ) )
            // InternalSensidl.g:4806:1: ( ruleDataAdjustment )
            {
            // InternalSensidl.g:4806:1: ( ruleDataAdjustment )
            // InternalSensidl.g:4807:1: ruleDataAdjustment
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsDataAdjustmentParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalSensidl.g:4816:1: rule__MeasurementData__DescriptionAssignment_7 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementData__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4820:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:4821:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:4821:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:4822:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_7_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
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
    // InternalSensidl.g:4831:1: rule__NonMeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NonMeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4835:1: ( ( RULE_ID ) )
            // InternalSensidl.g:4836:1: ( RULE_ID )
            {
            // InternalSensidl.g:4836:1: ( RULE_ID )
            // InternalSensidl.g:4837:1: RULE_ID
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
    // InternalSensidl.g:4846:1: rule__NonMeasurementData__DataTypeAssignment_2_0 : ( ruleDataType ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4850:1: ( ( ruleDataType ) )
            // InternalSensidl.g:4851:1: ( ruleDataType )
            {
            // InternalSensidl.g:4851:1: ( ruleDataType )
            // InternalSensidl.g:4852:1: ruleDataType
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
    // InternalSensidl.g:4861:1: rule__NonMeasurementData__DataTypeAssignment_2_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4865:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:4866:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:4866:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:4867:1: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:4876:1: rule__NonMeasurementData__ConstantAssignment_3 : ( ( 'constant' ) ) ;
    public final void rule__NonMeasurementData__ConstantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4880:1: ( ( ( 'constant' ) ) )
            // InternalSensidl.g:4881:1: ( ( 'constant' ) )
            {
            // InternalSensidl.g:4881:1: ( ( 'constant' ) )
            // InternalSensidl.g:4882:1: ( 'constant' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 
            // InternalSensidl.g:4883:1: ( 'constant' )
            // InternalSensidl.g:4884:1: 'constant'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalSensidl.g:4899:1: rule__NonMeasurementData__ValueAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4903:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:4904:1: ( RULE_STRING )
            {
            // InternalSensidl.g:4904:1: ( RULE_STRING )
            // InternalSensidl.g:4905:1: RULE_STRING
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
    // InternalSensidl.g:4914:1: rule__NonMeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4918:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:4919:1: ( RULE_STRING )
            {
            // InternalSensidl.g:4919:1: ( RULE_STRING )
            // InternalSensidl.g:4920:1: RULE_STRING
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


    // $ANTLR start "rule__NonMeasurementData__DescriptionAssignment_6"
    // InternalSensidl.g:4929:1: rule__NonMeasurementData__DescriptionAssignment_6 : ( RULE_DESCRIPTION ) ;
    public final void rule__NonMeasurementData__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4933:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:4934:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:4934:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:4935:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionDESCRIPTIONTerminalRuleCall_6_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
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
    // InternalSensidl.g:4944:1: rule__MeasurementDataNotAdjustable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementDataNotAdjustable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4948:1: ( ( RULE_ID ) )
            // InternalSensidl.g:4949:1: ( RULE_ID )
            {
            // InternalSensidl.g:4949:1: ( RULE_ID )
            // InternalSensidl.g:4950:1: RULE_ID
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
    // InternalSensidl.g:4959:1: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__MeasurementDataNotAdjustable__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4963:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:4964:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:4964:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:4965:1: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:4974:1: rule__MeasurementDataNotAdjustable__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementDataNotAdjustable__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4978:1: ( ( ruleUNIT ) )
            // InternalSensidl.g:4979:1: ( ruleUNIT )
            {
            // InternalSensidl.g:4979:1: ( ruleUNIT )
            // InternalSensidl.g:4980:1: ruleUNIT
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
    // InternalSensidl.g:4989:1: rule__MeasurementDataNotAdjustable__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementDataNotAdjustable__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4993:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:4994:1: ( RULE_STRING )
            {
            // InternalSensidl.g:4994:1: ( RULE_STRING )
            // InternalSensidl.g:4995:1: RULE_STRING
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


    // $ANTLR start "rule__MeasurementDataNotAdjustable__DescriptionAssignment_6"
    // InternalSensidl.g:5004:1: rule__MeasurementDataNotAdjustable__DescriptionAssignment_6 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementDataNotAdjustable__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5008:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:5009:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:5009:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:5010:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionDESCRIPTIONTerminalRuleCall_6_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
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
    // InternalSensidl.g:5019:1: rule__DataRange__RangeAssignment_1 : ( ruleInterval ) ;
    public final void rule__DataRange__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5023:1: ( ( ruleInterval ) )
            // InternalSensidl.g:5024:1: ( ruleInterval )
            {
            // InternalSensidl.g:5024:1: ( ruleInterval )
            // InternalSensidl.g:5025:1: ruleInterval
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
    // InternalSensidl.g:5034:1: rule__Interval__LowerBoundAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Interval__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5038:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:5039:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:5039:1: ( ruleDOUBLE )
            // InternalSensidl.g:5040:1: ruleDOUBLE
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
    // InternalSensidl.g:5049:1: rule__Interval__UpperBoundAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Interval__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5053:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:5054:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:5054:1: ( ruleDOUBLE )
            // InternalSensidl.g:5055:1: ruleDOUBLE
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
    // InternalSensidl.g:5064:1: rule__LinearDataConversion__ScalingFactorAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__ScalingFactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5068:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:5069:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:5069:1: ( ruleDOUBLE )
            // InternalSensidl.g:5070:1: ruleDOUBLE
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
    // InternalSensidl.g:5079:1: rule__LinearDataConversion__OffsetAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__OffsetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5083:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:5084:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:5084:1: ( ruleDOUBLE )
            // InternalSensidl.g:5085:1: ruleDOUBLE
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
    // InternalSensidl.g:5094:1: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__FromIntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5098:1: ( ( ruleInterval ) )
            // InternalSensidl.g:5099:1: ( ruleInterval )
            {
            // InternalSensidl.g:5099:1: ( ruleInterval )
            // InternalSensidl.g:5100:1: ruleInterval
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
    // InternalSensidl.g:5109:1: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__ToIntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5113:1: ( ( ruleInterval ) )
            // InternalSensidl.g:5114:1: ( ruleInterval )
            {
            // InternalSensidl.g:5114:1: ( ruleInterval )
            // InternalSensidl.g:5115:1: ruleInterval
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
    // InternalSensidl.g:5124:1: rule__LinearDataConversionWithInterval__DataTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__LinearDataConversionWithInterval__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5128:1: ( ( ruleDataType ) )
            // InternalSensidl.g:5129:1: ( ruleDataType )
            {
            // InternalSensidl.g:5129:1: ( ruleDataType )
            // InternalSensidl.g:5130:1: ruleDataType
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
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\3\uffff\14\17\3\uffff";
    static final String dfa_3s = "\1\5\1\51\1\20\14\5\3\uffff";
    static final String dfa_4s = "\1\5\1\51\1\33\14\67\3\uffff";
    static final String dfa_5s = "\17\uffff\1\2\1\1\1\3";
    static final String dfa_6s = "\22\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\15\1\16\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\1\17\12\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\1\17\12\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\1\17\12\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\1\17\12\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\1\17\12\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\1\17\12\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\1\17\12\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\1\17\12\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\1\17\12\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\20\1\uffff\1\17\12\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\21\1\uffff\1\17\12\uffff\1\17",
            "\1\17\1\uffff\1\17\26\uffff\2\17\12\uffff\1\21\1\uffff\1\17\12\uffff\1\17",
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
            return "584:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) );";
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
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000100A0000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000FFC0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080080000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0014400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000FFF0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0080100080000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000042L});

}